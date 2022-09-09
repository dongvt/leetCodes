class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int maxDefence = 0;
        int count = 0;
        for(int i = properties.length - 1; i >= 0  ; i--) {
            if(properties[i][1] < maxDefence) {
                count++;
            } else
            maxDefence = Math.max(maxDefence,properties[i][1]);
        }
        
        return count;
    }
}