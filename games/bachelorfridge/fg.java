/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static int[] field_a;

    final static void a(int param0, boolean param1, int param2) {
        jfa.field_w = param0;
        if (!param1) {
            fg.a((byte) -12);
            sd.field_a = param2;
            return;
        }
        sd.field_a = param2;
    }

    public static void a(byte param0) {
        if (param0 <= 124) {
            field_a = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = new int[128];
    }
}
