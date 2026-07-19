/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bh field_b;
    static String field_a;

    final static ud a(byte[] param0, int param1) {
        ud var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ud stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 > 25) {
                  break L1;
                } else {
                  fm.b(-84);
                  break L1;
                }
              }
              var2 = new ud(param0, ha.field_s, hj.field_K, sb.field_m, rf.field_p, qc.field_b);
              mj.a((byte) 101);
              stackOut_5_0 = (ud) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("fm.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ud) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static kf[] a(boolean param0) {
        gd discarded$2 = null;
        if (param0) {
          discarded$2 = fm.a(47);
          return new kf[]{te.field_g, gf.field_u, gm.field_j};
        } else {
          return new kf[]{te.field_g, gf.field_u, gm.field_j};
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -19266) {
            field_a = (String) null;
        }
    }

    final static gd a(int param0) {
        if (param0 != -32218) {
            return (gd) null;
        }
        return new gd(vl.b(3), kf.a(false));
    }

    static {
        field_a = "Create";
    }
}
