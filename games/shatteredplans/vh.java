/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static volatile int field_c;
    static Sprite[] field_a;
    static int field_b;
    private static String field_z;

    public static void clearStatics(byte param0) {
        field_a = null;
        if (param0 < 83) {
          field_a = (Sprite[]) null;
        }
    }

    static {
        field_z = "vh.A(";
        field_c = 0;
    }
}
