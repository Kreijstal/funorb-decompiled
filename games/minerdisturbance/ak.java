/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static sj field_b;
    static Sprite[] field_a;
    static Sprite field_c;

    public static void clearStaticReferences(boolean param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0) {
          field_a = (Sprite[]) null;
        }
    }

    final static boolean a(int param0) {
        int var1 = -65 % ((-17 - param0) / 45);
        return !ec.field_c.isEmpty((byte) 105) ? true : false;
    }

    static {
        field_b = new sj("email");
    }
}
