/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestState {
    static String field_c;
    static String thisPasswordIsPartText;
    static ContentTransitionPhase FADING_IN;
    static String levelSelectText;
    static TextureCombineSource CONSTANT;
    static String field_g;
    static int field_f;
    static String pleaseWaitText;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        FADING_IN = null;
        field_g = null;
        CONSTANT = null;
        field_c = null;
        levelSelectText = null;
        pleaseWaitText = null;
        thisPasswordIsPartText = null;
        if (param0 <= 62) {
          CONSTANT = (TextureCombineSource) null;
        }
    }

    static {
        thisPasswordIsPartText = "This password is part of your Player Name, and would be easy to guess";
        levelSelectText = "Level select";
        FADING_IN = new ContentTransitionPhase();
        CONSTANT = new TextureCombineSource();
        field_g = "Level Select";
        field_f = 20;
        pleaseWaitText = "Please wait...";
    }
}
