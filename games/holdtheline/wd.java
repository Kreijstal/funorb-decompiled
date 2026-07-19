/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd extends wc {
    boolean field_s;
    boolean field_m;
    static String[] field_v;
    boolean field_q;
    static dk field_p;
    float field_o;
    boolean field_t;
    static int field_n;
    static int[] field_l;
    static int field_r;
    static Boolean field_u;
    boolean field_w;
    boolean field_x;

    abstract qm c(float param0, int param1);

    abstract qm a(byte param0);

    abstract qm k(int param0);

    abstract qm a(float param0, boolean param1);

    final static hj b(String param0, byte param1) {
        hj discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        hj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -63) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = wd.b((String) null, (byte) -20);
                break L1;
              }
            }
            stackOut_2_0 = dl.a(fb.field_i, param0, false, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wd.TA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract qm a(int param0, float param1);

    abstract qm o(int param0);

    final static void a(boolean param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[][] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_3_0 = null;
        int[][] stackOut_2_0 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!param0) {
                stackOut_3_0 = fk.field_b;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = dl.field_k;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            em.field_i = stackIn_4_0;
            if (param1 == 97) {
              var2_int = 0;
              L2: while (true) {
                if (l.field_a.length <= var2_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (-14 != (var2_int ^ -1)) {
                      ((ti) ((Object) l.field_a[var2_int])).e(-127);
                      break L3;
                    } else {
                      ((ec) ((Object) l.field_a[var2_int])).a(true, 6267);
                      break L3;
                    }
                  }
                  var2_int++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "wd.VA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract qm h(int param0);

    public static void i(int param0) {
        field_u = null;
        field_v = null;
        if (param0 != -3369) {
            return;
        }
        field_p = null;
        field_l = null;
    }

    final static String j(int param0) {
        if (param0 != -14) {
            return (String) null;
        }
        return sg.field_Y;
    }

    abstract qm m(int param0);

    abstract qm a(float param0, int param1);

    abstract qm l(int param0);

    abstract qm c(boolean param0);

    abstract qm b(float param0, int param1);

    abstract qm n(int param0);

    wd() {
    }

    static {
        field_v = new String[255];
        field_l = new int[]{24576, 7560980, 8421504, 0};
    }
}
