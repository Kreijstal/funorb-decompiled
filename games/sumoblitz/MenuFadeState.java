/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuFadeState {
    static int chatMessageIdHigh;
    static Sprite introGlow;
    static int transitionTicks;
    private static String field_z;

    public static void releaseStatics(int param0) {
        int var1 = 101 / ((36 - param0) / 35);
        introGlow = null;
    }

    static {
        field_z = "eh.A(";
        introGlow = new Sprite(270, 70);
    }
}
