/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends IntrusiveNode {
    static String[] difficultyNames;
    int field_m;
    static String clickToContinueText;

    public static void releaseStatics(int param0) {
        clickToContinueText = null;
        difficultyNames = null;
        if (param0 != 6334) {
          clickToContinueText = (String) null;
        }
    }

    ge(int param0) {
        this.field_m = param0;
    }

    static {
        difficultyNames = new String[]{"Normal", "Hard"};
        clickToContinueText = "Click to continue";
    }
}
