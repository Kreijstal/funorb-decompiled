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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = (ud) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("fm.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        if (param0) {
          fm.a(47);
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
