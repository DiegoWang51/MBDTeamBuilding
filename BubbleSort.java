
/**
 * BubbleSort class contains methods to sort various data structures in specific orders using the
 * bubble sort algorithm.
 * 
 * 
 */
public class BubbleSort
{
    
    public static Member[] bubbleSortA(Member[] teamMembers, boolean ascending)
    {
        int size = teamMembers.length;
        int last, current;
        Member temp;
        for(last = size-1; last > 0; last = last - 1)
        { for(current = 0; current < last; current = current + 1)
            { 
                if(ascending) {
                    if (teamMembers[current].getOld() > teamMembers[current + 1].getOld())
                    {
                        temp = teamMembers[current];
                        teamMembers[current] = teamMembers[current+1];
                        teamMembers[current+1] = temp;
                    }
                } else {
                    if (teamMembers[current].getOld() < teamMembers[current + 1].getOld())
                    {
                        temp = teamMembers[current];
                        teamMembers[current] = teamMembers[current+1];
                        teamMembers[current+1] = temp;
                    }
                }
            }
        }
        
        return teamMembers;
    }
}
