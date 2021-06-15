package charactor;

public class arrayCharacteristics {
	public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }
         
        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }
        int max = -1;
        for (int each : values) {
            if(each>max)
                max = each;
        }
       // int[] b = Arrays.copyOfRange(a, 0, 3);
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        
        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度       
        
        // String content = Arrays.toString(a);
        //但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
        //Arrays.sort(a);
        //Arrays.binarySearch(a, 62)  使用binarySearch之前，必须先使用sort进行排序
        //System.out.println(Arrays.equals(a, b)); 比较两个数组的内容是否一样
        //填充
        // 使用同一个值，填充整个数组 Arrays.fill(a, 5);
    }
}
