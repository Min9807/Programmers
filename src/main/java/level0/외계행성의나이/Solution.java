package level0.외계행성의나이;

class Solution {
    public String solution(int age) {
        String answer = "";
        String a = String.valueOf(age);
        String[] ary = a.split("");
        for(int i=0; i<ary.length; i++){
            answer += ((char)((Integer.parseInt(ary[i])+97)));
        }
        return answer;
    }
}