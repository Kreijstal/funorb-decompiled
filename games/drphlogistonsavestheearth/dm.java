/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends mj {
    static he[] field_z;
    static ok field_x;
    static ej[] field_B;
    static vi field_A;
    static he[] field_y;

    final String b(int param0, vg param1) {
        if (param0 > -101) {
          dm.d((byte) 96);
          return qj.a(param1.field_p.length(), '*', -77);
        } else {
          return qj.a(param1.field_p.length(), '*', -77);
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != 0) {
            dm.c((byte) 87);
            return fi.a(param1.length, (byte) -33, 0, param1);
        }
        return fi.a(param1.length, (byte) -33, 0, param1);
    }

    final static void c(byte param0) {
        if (param0 < 58) {
            return;
        }
        ac.field_h = null;
        bd.field_S = null;
    }

    public static void d(byte param0) {
        field_A = null;
        if (param0 >= -125) {
          dm.d((byte) 37);
          field_z = null;
          field_y = null;
          field_x = null;
          field_B = null;
          return;
        } else {
          field_z = null;
          field_y = null;
          field_x = null;
          field_B = null;
          return;
        }
    }

    private dm(rf param0, int param1) {
        super(param0, param1);
    }

    final static int d(int param0) {
        fl.field_a.a(64);
        if (param0 >= -18) {
            return -62;
        }
        if (!p.field_a.b(false)) {
            return vj.e((byte) -95);
        }
        return 0;
    }

    dm(int param0) {
        this(uh.field_i, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new vi();
    }
}
