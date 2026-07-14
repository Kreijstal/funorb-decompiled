/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends rc {
    static pk field_q;
    static int field_m;
    int field_n;
    static qk field_p;
    static int field_o;

    abstract boolean g(int param0);

    abstract Object e(byte param0);

    fj(int param0) {
        ((fj) this).field_n = param0;
    }

    final static boolean f(int param0) {
        if (param0 == -31456) {
          if ((hj.field_a ^ -1) <= -11) {
            if (mi.field_C < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_q = null;
          if ((hj.field_a ^ -1) <= -11) {
            if (mi.field_C < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 > -92) {
            boolean discarded$0 = fj.f(64);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static void a(byte param0, rh param1, boolean param2, rh param3, rh param4) {
        ih.field_c = bf.a((byte) 86, "");
        int var5 = 103 / ((param0 - 70) / 34);
        ih.field_c.a((byte) -126, false);
        ha.a((byte) 103, param1, param4, param3);
        qh.h((byte) -121);
        kd.field_b = uf.field_l;
        si.field_g = uf.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 4;
    }
}
