package leetcode;

/**
 * Created by fdd on 2017/6/21.
 */
public class _23MergeKSortedLists {
    public static void main(String[] args) {

    }
    public ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        if(lists == null || lists.length == 0) return res;
        res = mergeKListsCore(lists, 0, lists.length - 1);
        return res;
    }

    public ListNode mergeKListsCore(ListNode[] lists, int start, int end){
        if(start == end) return lists[start];
        if(start < end){
            int mid = (start + end) / 2;
            ListNode node1 = mergeKListsCore(lists, start, mid);
            ListNode node2 = mergeKListsCore(lists, mid + 1, end);
            return mergeCore(node1, node2);
        }else{
            return null;
        }
    }

    public ListNode mergeCore(ListNode listOne, ListNode listTwo){
        if(listOne == null) return listTwo;
        if(listTwo == null) return listOne;
        ListNode ans = null;
        if(listOne.val > listTwo.val){
            ans = listTwo;
            ans.next = mergeCore(listOne, listTwo.next);
        }else{
            ans = listOne;
            ans.next = mergeCore(listOne.next, listTwo);
        }
        return ans;
    }
}
