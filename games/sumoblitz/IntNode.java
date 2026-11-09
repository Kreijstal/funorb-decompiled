/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntNode extends IntrusiveNode {
    static String[] difficultyNames;
    int value;
    static String clickToContinueText;

    public static void releaseStatics(int param0) {
        clickToContinueText = null;
        difficultyNames = null;
        if (param0 != 6334) {
          clickToContinueText = (String) null;
        }
    }

    IntNode(int number) {
        this.value = number;
    }

    static {
        difficultyNames = new String[]{"Normal", "Hard"};
        clickToContinueText = "Click to continue";
    }
}
