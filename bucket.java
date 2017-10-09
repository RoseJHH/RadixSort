import java.util.Arrays;

/**
 * Created by rosejh on 10/9/17.
 */
public class bucket {
    public LList[] buckets = {
            new LList(),
            new LList(), // 0
            new LList(), // 1
            new LList(), // 2
            new LList(), // 3
            new LList(), // 4
            new LList(), // 5
            new LList(), // 6
            new LList(), // 7
            new LList(), // 8
            new LList()  // 9
    };


    public int[] changeToInt(String[] id){
        int[] array = new int[id.length];
        for(int i = 0 ; i < id.length ; i ++) {
            array[i]=Integer.parseInt(id[i]);
        }
        return array;
    }


    public String[] firstDigit(int[] data){


        for(int i = 0 ; i < data.length ; i++ ){

            int n = data[i]%10;
            buckets[n].enqueue(data[i]);
        }
        String[] out1 = new String[data.length];
        int j = 0;

        for(int k = 0;k<10;k++)
        {
            while(buckets[k].first!=null) {
                String check = buckets[k].dequeue();
                System.out.println(check);
                out1[j] = check;
                j++;
            }
        }
       // System.out.println(Arrays.toString(out1));
        return out1;
    }

    public String[] secondDigit(int[] data){


        for(int i = 0 ; i < data.length ; i++ ){

            int n = (data[i]/10)%10;
            buckets[n].enqueue(data[i]);
        }
        String[] out1 = new String[data.length];
        int j = 0;

        for(int k = 0;k<10;k++)
        {
            while(buckets[k].first!=null) {
                String check = buckets[k].dequeue();
                System.out.println(check);
                out1[j] = check;
                j++;
            }
        }
        // System.out.println(Arrays.toString(out1));
        return out1;
    }

    public String[] thirdDigit(int[] data){


        for(int i = 0 ; i < data.length ; i++ ){

            int n = (data[i]/100)%10;
            buckets[n].enqueue(data[i]);
        }
        String[] out1 = new String[data.length];
        int j = 0;

        for(int k = 0;k<10;k++)
        {
            while(buckets[k].first!=null) {
                String check = buckets[k].dequeue();
                System.out.println(check);
                out1[j] = check;
                j++;
            }
        }
        // System.out.println(Arrays.toString(out1));
        return out1;
    }
    

}
