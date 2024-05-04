class Solution {
    public int numRescueBoats(int[] people, int limit) {

Arrays.sort(people);
int cnt=0, i=0,j=people.length-1;

while(i<j){
    if(people[i]+people[j]<=limit){i++;}
    j--;
    cnt++;
}

if(i==j){cnt++;}

return cnt;
        
    }
}