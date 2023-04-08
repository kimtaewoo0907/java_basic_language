package FileStream;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileWriteRread {
    public static void main(String[] args) {
        // java의 File라이브러리를 통해 File을 생성하고 Read하는 방법
        // 기본적으로, 파일을 read하고 write하는 작업은 시간이 오래 걸리는 작업이다
        // 그래서, 버퍼라는 중간매개 메모리를 사용한다
        try {
            // 파일 입출력의 경우 예외가 발생할 가능성이 높기 떄문에, 라이브러리에서 예외처리 강제
            // FileWrite, FileReader 방식은 io방식으로 , 동기 blocking 방식을 사용했다
            // nio 패키지도 있는데, 이것은 비동기 non-blocking 방식을 사용하여 성능을 높힌다
            FileWriter fw = new FileWriter("test_file.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("손흥민");
            bw.newLine();
            bw.write("이강인");
            bw.newLine();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // file read 또한 buffer를 사용해 read한다
        try{
            FileReader fr = new FileReader("test_file.txt");
            BufferedReader br = new BufferedReader(fr);
            String readline = null;
            while(true) {
                // br.readLine은 한 줄씩 소모가 되는 메서드
                readline = br.readLine();
                if(readline ==  null) {
                    break;
                }
                System.out.println(readline);

            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
