/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static boolean field_a;
    static Sprite field_b;

    final static void a(boolean param0) {
        if (param0) {
          field_a = true;
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = -67 % ((-51 - param0) / 36);
        field_b = null;
    }

    static {
        field_a = true;
    }
}
