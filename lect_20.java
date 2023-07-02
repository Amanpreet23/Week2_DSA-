import java.util.Stack;

public class LargestAreaHistogram {
public static int maxArea InHistogram(int [] arr) {
Stack<Integer > s = new Stack>>();
int max_area = 0;
int i = 0;
while (iarr.Length) {
int currentBuilding = arr[i];
if (s.isEmpty() || currentBuilding >= arr[s.peek()]) {
s.push(i);
i++;
} else{
int previousBar = s.pop();
int height = arr[previousBar];
int width;
if(s.isEmpty()){
    width=1;

}else{
    width =i-s.peek()-1;
}

int area =height*width;
max_area=Math.max(area, max_area);
}

}
while (!s.isEmpty()) (
int previousBar = s.pop();
int height = arr [previousBar];
int width:
if (s.isEmpty()) {
width= i:
} else (
width=i-s.peek()-1;
}
int area height width;
max area = Math.max(area. max area):
}
return nax_are
public static void main(String[] args) {
int[] arr - (3, 1
System.out.println(maxAreaInHistogram(arr);
}}
