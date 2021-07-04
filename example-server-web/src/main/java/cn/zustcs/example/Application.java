package cn.zustcs.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    /** 当前项目正在运行标识 */
    private static volatile boolean run = true;

    public static void main(String[] args) throws RuntimeException {
        try {
            Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
                public void run() {
                    synchronized (Application.class){
                        run = false;
                        Application.class.notify();
                    }
                    super.run();
                }
            });
            SpringApplication.run(Application.class);
        }catch (RuntimeException e){
            log.error("服务启动时异常 >> {}",e.getMessage(), e);
            throw new RuntimeException();
        }
        synchronized (Application.class){
            while (run) {
                try{
                    Application.class.wait();
                } catch (RuntimeException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
