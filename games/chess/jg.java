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
        }
        if (!(((jg) this).field_J.a(param4 ^ 24305).a(param4 + 45535) == oa.field_a)) {
            return;
        }
        try {
            s.b(((jg) this).field_J.c(false), ((jg) this).field_J.h(-1), 0, ((jg) this).field_J.i(82));
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "jg.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
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

    final static void n() {
        kn.field_L = true;
        vk.field_g = 0;
    }

    final static km[] a(byte param0, int param1, um param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var4_int = -76;
          int discarded$9 = 83;
          if (tj.a(param3, param1, param2)) {
            int discarded$10 = 8;
            return rf.b();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jg.A(").append(-96).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 250;
        ((jg) this).field_J.a(20 + (((jg) this).field_C - 25) >> 1, 34, 25, 140, ((jg) this).field_y + -var2 >> 1);
        ((jg) this).field_N.a(2 + (-30 + (((jg) this).field_C - -20) >> 1), 34, param0, 100, 10 + (140 + (((jg) this).field_y + -var2 >> 1)));
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

    final static ci k() {
        return ci.field_zb.field_Kb;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        RuntimeException var5 = null;
        fb stackIn_1_0 = null;
        fb stackIn_2_0 = null;
        fb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_0_0 = null;
        fb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        fb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -103, param2, param3);
              stackOut_0_0 = ((jg) this).field_N;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((jg) this).field_J.a(-112).a(21314) != oa.field_a) {
                stackOut_2_0 = (fb) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (fb) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_H = stackIn_3_1 != 0;
            if (param1 <= -6) {
              break L0;
            } else {
              jg.l(4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jg.G(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static int m() {
        return v.field_d + ((ii.field_Q << 2) + (sg.field_d << 4));
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

    final static void b() {
        ri.g(124);
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
