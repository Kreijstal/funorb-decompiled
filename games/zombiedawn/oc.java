/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static long field_b;
    static java.security.SecureRandom field_a;
    static float field_c;

    public static void releaseStatics(int param0) {
        int var1 = 25 % ((-45 - param0) / 32);
        field_a = null;
    }

    final static void a(byte param0) {
        int var1 = 77 % ((param0 + 10) / 53);
        Rasterizer.blurRectangle(4, 4, 0, 0, Rasterizer.width, Rasterizer.height);
    }

    static {
    }
}
