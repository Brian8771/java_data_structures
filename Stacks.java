import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        // stack = LIFO data structures Last-In First-Out
        // stores objects into a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        // Pushes object into the stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Borderlands");

        // Pretty obvious but it checks if stack is empty
        // System.out.println(stack.empty());

        // This is to pop the rightmost object
        // Or in better words the top stack to follow first in last out
        // When you pop it returns the value popped so you can declare a variable with
        // the value
        // String myFavGame = stack.pop();
        // System.out.println(myFavGame);

        // stack.peek() finds the topmost object in the stack without popping the object
        // System.out.println(stack.peek());

        // Finds index of a specified object
        // System.out.println(stack.search("Borderlands"));

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through web browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)
        System.out.println(stack);

    }
}
