/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static String field_a;
    static jea field_b;
    private static String[] field_c;

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        if (bl.field_a == null) {
            return false;
        }
        if (!bl.field_a.a(false)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_b = null;
        field_a = null;
        if (param0 <= 71) {
            discarded$0 = bc.a(true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = new String[5];
        field_c[3] = "Flower";
        field_c[2] = "T2";
        field_c[1] = "T1 Green";
        field_c[0] = "T1 Red";
        field_c[4] = "Hanging Moss 1";
        field_a = "GRAPHICS QUALITY";
    }
}
