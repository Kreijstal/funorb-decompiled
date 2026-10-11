/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static i field_a;
    static String field_c;
    static hj field_b;

    final static void b(int param0) {
        int var1 = me.b((byte) -18);
        int var2 = dc.c(0);
        if (param0 == -1178583839) {
          ui.field_b.a(-123, -df.field_d + ha.field_o, var2 + (ak.field_z << 1), sd.field_h - ak.field_z, (df.field_d << 1) + var1);
          j.a((byte) -22);
          return;
        }
        field_b = (hj) null;
        ui.field_b.a(-123, -df.field_d + ha.field_o, var2 + (ak.field_z << 1), sd.field_h - ak.field_z, (df.field_d << 1) + var1);
        j.a((byte) -22);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -1178583839) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = "Prepare your defences!";
        field_a = new i();
    }
}
