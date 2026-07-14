/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends ll {
    int field_w;
    int field_A;
    static int field_C;
    static ai field_x;
    int field_y;
    static int field_D;
    static en[] field_F;
    static cn field_z;
    int field_E;
    int field_G;
    int field_v;
    private static String field_B;

    public static void b(boolean param0) {
        field_z = null;
        if (!param0) {
            rd.b(false);
            field_F = null;
            field_x = null;
            return;
        }
        field_F = null;
        field_x = null;
    }

    rd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "rd.VB(";
        field_C = -1;
        field_F = null;
    }
}
