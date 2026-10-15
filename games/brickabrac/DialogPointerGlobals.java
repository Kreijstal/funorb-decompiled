/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogPointerGlobals {
    static String field_c;
    static boolean textChoiceDialogOpen;
    static RgbSprite field_b;
    static String field_d;
    static volatile int livePressY;
    private static String field_z;

    public static void a(int param0) {
        if (param0 == -15504) {
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_b = (RgbSprite) null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_z = "va.A(";
        field_d = "Press <img=2> or <img=5> to launch the ball!";
        field_c = "Become a member to get this expansion and...";
        livePressY = 0;
        textChoiceDialogOpen = false;
    }
}
