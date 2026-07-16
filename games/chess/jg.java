/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends bh implements mj {
    static int field_K;
    static int field_I;
    static String field_L;
    private fb field_N;
    static long field_M;
    static byte[] field_O;
    private ih field_J;

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        if (param4 != -24221) {
            field_O = null;
            if (!(((jg) this).field_J.a(param4 ^ 24305).a(param4 + 45535) == oa.field_a)) {
                return;
            }
            s.b(((jg) this).field_J.c(false), ((jg) this).field_J.h(-1), 0, ((jg) this).field_J.i(82));
            return;
        }
        if (!(((jg) this).field_J.a(param4 ^ 24305).a(param4 + 45535) == oa.field_a)) {
            return;
        }
        s.b(((jg) this).field_J.c(false), ((jg) this).field_J.h(-1), 0, ((jg) this).field_J.i(82));
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -115, param3);
        if (param2 > -80) {
          ((jg) this).a(-61, -119, -11, -21);
          rc.field_a.a(gi.field_b, ((jg) this).field_u + (param3 - -4), rc.field_a.field_C + (((jg) this).field_r + (param0 + 4)), 16777215, -1);
          return;
        } else {
          rc.field_a.a(gi.field_b, ((jg) this).field_u + (param3 - -4), rc.field_a.field_C + (((jg) this).field_r + (param0 + 4)), 16777215, -1);
          return;
        }
    }

    final static void n(int param0) {
        kn.field_L = true;
        if (param0 >= -50) {
            return;
        }
        vk.field_g = 0;
    }

    final static km[] a(byte param0, int param1, um param2, int param3) {
        int var4 = 0;
        var4 = 76 / ((param0 - 9) / 61);
        if (!tj.a(param3, param1, param2, (byte) 83)) {
          return null;
        } else {
          return rf.b((byte) 8);
        }
    }

    final void a(int param0) {
        int var2 = 250;
        ((jg) this).field_J.a(20 + (((jg) this).field_C - 25) >> -515911391, 34, 25, 140, ((jg) this).field_y + -var2 >> 495032385);
        ((jg) this).field_N.a(2 + (-30 + (((jg) this).field_C - -20) >> 2037137921), 34, param0, 100, 10 + (140 + (((jg) this).field_y + -var2 >> -662870143)));
    }

    jg(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (jm) null);
        ((jg) this).field_J = new ih((jm) (Object) new wc(10000536), ej.field_f, 0, 0, 140, 25);
        ((jg) this).field_J.a(false, new ri());
        ((jg) this).field_N = new fb(sg.field_e, (rg) this);
        ((jg) this).field_E = new mf[]{(mf) (Object) ((jg) this).field_J, (mf) (Object) ((jg) this).field_N};
        ((jg) this).field_N.field_n = (jm) (Object) new sf();
        ((jg) this).c((byte) 113);
    }

    final static ci k(int param0) {
        if (param0 <= 57) {
            jg.n(-68);
            return ci.field_zb.field_Kb;
        }
        return ci.field_zb.field_Kb;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        fb stackIn_1_0 = null;
        fb stackIn_2_0 = null;
        fb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        fb stackOut_0_0 = null;
        fb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        fb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          super.a(param0, -103, param2, param3);
          stackOut_0_0 = ((jg) this).field_N;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((jg) this).field_J.a(-112).a(21314) != oa.field_a) {
            stackOut_2_0 = (fb) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (fb) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_H = stackIn_3_1 != 0;
        if (param1 > -6) {
          jg.l(4);
          return;
        } else {
          return;
        }
    }

    final static int m(int param0) {
        if (param0 < 32) {
          jg.l(5);
          return v.field_d + ((ii.field_Q << 1461626530) + (sg.field_d << -946195612));
        } else {
          return v.field_d + ((ii.field_Q << 1461626530) + (sg.field_d << -946195612));
        }
    }

    public static void l(int param0) {
        if (param0 != 10000536) {
            field_L = null;
            field_L = null;
            field_O = null;
            return;
        }
        field_L = null;
        field_O = null;
    }

    final static void b(boolean param0) {
        ri.g(124);
        if (!param0) {
            field_M = 3L;
            uk.a(false, 4);
            return;
        }
        uk.a(false, 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 64;
        field_O = new byte[520];
        field_L = "Menu";
    }
}
