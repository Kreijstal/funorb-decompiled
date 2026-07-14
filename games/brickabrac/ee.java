/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends vi {
    static jp field_p;
    static int field_q;
    static mh field_s;
    int field_t;
    static boolean[][] field_r;

    final static String b(boolean param0) {
        if (param0) {
            return null;
        }
        if (!(jm.field_f != ik.field_g)) {
            return fj.field_Qb;
        }
        return dl.field_e;
    }

    private ee(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void c(int param0) {
        if (!(lg.a(9))) {
            return;
        }
        bq.a(false, param0, (byte) 104);
    }

    final static void d(byte param0) {
        ag.field_K = null;
        dl.field_d = null;
        if (param0 != 96) {
          field_p = null;
          cn.field_a = null;
          jh.field_b = null;
          qp.field_c = null;
          gg.field_t = null;
          return;
        } else {
          cn.field_a = null;
          jh.field_b = null;
          qp.field_c = null;
          gg.field_t = null;
          return;
        }
    }

    final void a(int param0, wq param1) {
        super.a(100, param1);
        ((ee) this).field_t = param1.i(65280);
        if (param0 <= 89) {
            field_p = null;
        }
    }

    final static void d(int param0) {
        Object var2 = null;
        if (param0 >= -45) {
          field_s = null;
          var2 = null;
          fr.a(true, (String) null, "");
          return;
        } else {
          var2 = null;
          fr.a(true, (String) null, "");
          return;
        }
    }

    final int a(int param0, StringBuilder param1) {
        if (param0 < 79) {
          field_s = null;
          return 1734820418 ^ super.a(99, param1) ^ 101 * ((ee) this).field_t + 42148 << 2099020834;
        } else {
          return 1734820418 ^ super.a(99, param1) ^ 101 * ((ee) this).field_t + 42148 << 2099020834;
        }
    }

    public static void e(int param0) {
        int var1 = -7 / ((param0 - 17) / 34);
        field_s = null;
        field_p = null;
        field_r = null;
    }

    ee() {
        this(0, 0, 0, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 1;
    }
}
