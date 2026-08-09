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
        int[] var4 = null;
        try {
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
            int var3 = -120 % ((param1 - -61) / 53);
            qpa.a(205, ma.field_f, 7, 35, 440, 125, 200);
            qpa.a(480, paa.field_x, 8, 40, 440, 126, 200);
            qpa.a(335, mna.field_a, 9, 40, 440, 126, 200);
            qpa.a(400, gca.field_f, 10, 40, 440, 124, 200);
            qpa.a(400, hd.field_b, 11, 40, 440, 125, 200);
            param0.b(qf.field_l);
            param0.b(cu.field_x);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bla.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_4_0 = (fsa) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fsa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("bla.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
