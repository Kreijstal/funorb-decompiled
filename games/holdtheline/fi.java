/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends hi {
    String field_hb;
    static boolean field_nb;
    static String field_jb;
    static String field_kb;
    int field_gb;
    static int[][] field_lb;
    String field_mb;
    static String field_ib;

    final static void a(int param0, gn param1, int param2, fg param3) {
        try {
            lf.field_l = param0 * nc.a(855) / 1000;
            mf.a(param1, 0);
            jk.a(param1, -64);
            aa.a(-18916, param1);
            dm.a(255);
            jd.j(param2 ^ 0);
            cf.field_q = param2 + -lf.field_l;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "fi.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_jb = null;
        field_kb = null;
        field_ib = null;
        field_lb = (int[][]) null;
        if (!param0) {
            field_nb = false;
        }
    }

    final static fn a(int param0, gn param1, gn param2, int param3, int param4) {
        RuntimeException var5 = null;
        gn var6 = null;
        Object stackIn_2_0 = null;
        fn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (qg.a(param4, param3, (byte) -27, param2)) {
              L1: {
                if (param0 == -17072) {
                  break L1;
                } else {
                  var6 = (gn) null;
                  fi.a(25, (gn) null, (gn) null, 26, 41);
                  break L1;
                }
              }
              stackIn_6_0 = md.a(param0 + -7255, param1.a(param4, true, param3));
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
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fi.H(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fn) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    fi() {
        super(0L, (hi) null);
    }

    static {
        field_jb = "members-only content";
        field_ib = "Confirm Password: ";
    }
}
