/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends jm {
    private int field_x;
    static String field_v;
    static String field_s;
    private int field_q;
    private int field_w;
    static String field_y;
    private qb[] field_u;
    static String field_r;
    static int field_p;
    static String field_t;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.field_w) {
                if (param0.d(-2116)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param0 instanceof ag)) {
                break L2;
              } else {
                param4 = param4 & ((ag) (Object) param0).field_B;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackOut_12_0 = ((mm) this).field_q;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((mm) this).field_x;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = ((mm) this).field_w;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            var7 = stackIn_13_0;
            if (param1 == 5592405) {
              L4: {
                if (!param4) {
                  stackOut_17_0 = 7105644;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = 16777215;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              ne.a(-52, param0.field_v, ((mm) this).field_u, param0.field_j + (param3 - -(-((mm) this).field_u[0].field_w + param0.field_k >> 1)), param0.field_n + param2, var7);
              int discarded$1 = ((mm) this).field_g.a(param0.field_g, param2 - -param0.field_n, -2 + param3 - -param0.field_j, param0.field_v, param0.field_k, var8, -1, 1, 1, ((mm) this).field_g.field_C);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("mm.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public mm() {
        this(2188450, 2591221, 9543);
    }

    private mm(int param0, int param1, int param2) {
        ((mm) this).field_q = param1;
        ((mm) this).field_g = go.field_k;
        ((mm) this).field_u = af.field_Jb;
        ((mm) this).field_w = param2;
        ((mm) this).field_x = param0;
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        field_v = null;
        field_s = null;
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Open in popup window";
        field_v = "This game has started.";
        field_y = "(<%0> players want to join)";
        field_r = "Become a member to get this expansion and...";
        field_t = "Loading extra data";
    }
}
