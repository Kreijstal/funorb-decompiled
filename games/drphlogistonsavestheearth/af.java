/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static he[] field_e;
    static int[] field_f;
    static tf field_g;
    static String field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static bm a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bm var3 = null;
        bm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_3_0 = null;
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
            var2_int = 0;
            if (param1 != null) {
              var3 = new bm(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, aj.field_a, a.field_e);
              oc.a((byte) -21);
              stackOut_3_0 = (bm) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("af.E(").append(119).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void b(int param0) {
        if (!(null != df.field_l)) {
            return;
        }
        hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
        df.field_l.a(sb.field_d, true);
        df.field_l = null;
        if (!(null == pi.field_V)) {
            pi.field_V.b((byte) -7);
        }
        n.field_g.requestFocus();
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_e = null;
        field_g = null;
        field_a = null;
    }

    final static void a(byte param0) {
        kc var1 = (kc) (Object) rd.field_C.h(-11151);
        if (!(var1 != null)) {
            eg.a((byte) 126);
            return;
        }
        lh var2 = dh.field_N;
        int discarded$0 = var2.h(23);
        int discarded$1 = var2.h(97);
        int discarded$2 = var2.h(-104);
        int discarded$3 = var2.h(113);
        var1.a(-16175);
    }

    final static nh[] a(int param0, int param1, int param2, byte param3, int param4) {
        nh[] var6 = new nh[9];
        nh[] var5 = var6;
        nh dupTemp$0 = mi.a(1, (byte) -96, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        nh dupTemp$1 = mi.a(1, (byte) -85, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param4 == 0)) {
            var6[4] = mi.a(64, (byte) -109, param4);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = " of ";
        field_a = "Click icon to start";
        field_f = new int[]{1, 0, 5, 0, 13, 2, 2, 0, 0, 0, 2, 30, 15, 15, 10, 10, 2, 2, 1, 3, 60, 1, 60, 200, 4, 5, 4, 1, 11, 1};
    }
}
