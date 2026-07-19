/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends lea {
    static long field_I;
    static int[] field_H;
    static af field_G;

    bla(la param0, int param1) {
        super(param0, param1);
    }

    final static void a(hea param0, byte param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new int[]{22, 1, 3, 4, 12, 14, 13, 8, 9};
            uw.field_g = new wv[13];
            qpa.a(245, var4, 0, 40, 440, 126, 200);
            qpa.a(440, aw.field_H, 1, 40, 440, 125, 290);
            qpa.a(275, uj.field_d, 3, 40, 440, 126, 200);
            qpa.a(275, ra.field_F, 5, 40, 440, 124, 200);
            qpa.a(275, vj.field_a, 6, 40, 440, 125, 200);
            qpa.a(480, oe.field_j, 2, 40, 440, 124, 200);
            qpa.a(185, ll.field_g, 4, 40, 440, 126, 200);
            qpa.a(185, hh.field_c, 12, 40, 440, 124, 200);
            var3 = -120 % ((param1 - -61) / 53);
            qpa.a(205, ma.field_f, 7, 35, 440, 125, 200);
            qpa.a(480, paa.field_x, 8, 40, 440, 126, 200);
            qpa.a(335, mna.field_a, 9, 40, 440, 126, 200);
            qpa.a(400, gca.field_f, 10, 40, 440, 124, 200);
            qpa.a(400, hd.field_b, 11, 40, 440, 125, 200);
            discarded$2 = param0.b(qf.field_l);
            discarded$3 = param0.b(cu.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("bla.SB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
    }

    public static void e(boolean param0) {
        if (!param0) {
            field_I = 114L;
            field_H = null;
            field_G = null;
            return;
        }
        field_H = null;
        field_G = null;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        fsa stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 3) {
              var4 = super.a(param0, param1 + 0, param2);
              var5 = new ue(param2, param0);
              var5.a(1, false);
              var4.a((byte) 83, (nv) (var5));
              var6 = rm.field_a;
              var7 = (kga) ((Object) var6.a(12, 93));
              var7.b((byte) 112, 0);
              var4.a(var5, (byte) 124, var7);
              stackOut_3_0 = (fsa) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (fsa) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("bla.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_G = (af) null;
          return param2 - (1 << param1 - 1);
        } else {
          return param2 - (1 << param1 - 1);
        }
    }

    bla(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
    }
}
