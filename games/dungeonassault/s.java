/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_c;
    static int field_a;
    static int[] field_b;

    public static void a(int param0) {
        if (param0 >= -19) {
            s.a(60);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 72) {
            return;
        }
        ob.field_cc[param1] = param2;
    }

    static {
        field_c = "The contents of this room are shrouded in mystery.";
        field_b = new int[]{72, 115, 350, 420, 551};
    }
}
