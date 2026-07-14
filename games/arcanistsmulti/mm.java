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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (!param0.field_w) {
            if (param0.d(-2116)) {
              L1: {
                var6 = 1;
                if (!(param0 instanceof ag)) {
                  break L1;
                } else {
                  param4 = param4 & ((ag) (Object) param0).field_B;
                  break L1;
                }
              }
              L2: {
                if (param4) {
                  if (var6 != 0) {
                    stackOut_10_0 = ((mm) this).field_q;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((mm) this).field_x;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                } else {
                  stackOut_7_0 = ((mm) this).field_w;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
              var7 = stackIn_11_0;
              if (param1 != 5592405) {
                return;
              } else {
                L3: {
                  if (!param4) {
                    stackOut_14_0 = 7105644;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 16777215;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                var8 = stackIn_15_0;
                ne.a(-52, param0.field_v, ((mm) this).field_u, param0.field_j + (param3 - -(-((mm) this).field_u[0].field_w + param0.field_k >> -54344703)), param0.field_n + param2, var7);
                int discarded$2 = ((mm) this).field_g.a(param0.field_g, param2 - -param0.field_n, -2 + param3 - -param0.field_j, param0.field_v, param0.field_k, var8, -1, 1, 1, ((mm) this).field_g.field_C);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param0 instanceof ag)) {
            break L4;
          } else {
            param4 = param4 & ((ag) (Object) param0).field_B;
            break L4;
          }
        }
        L5: {
          if (param4) {
            if (var6 != 0) {
              stackOut_24_0 = ((mm) this).field_q;
              stackIn_25_0 = stackOut_24_0;
              break L5;
            } else {
              stackOut_23_0 = ((mm) this).field_x;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            }
          } else {
            stackOut_21_0 = ((mm) this).field_w;
            stackIn_25_0 = stackOut_21_0;
            break L5;
          }
        }
        var7 = stackIn_25_0;
        if (param1 != 5592405) {
          return;
        } else {
          L6: {
            if (!param4) {
              stackOut_28_0 = 7105644;
              stackIn_29_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = 16777215;
              stackIn_29_0 = stackOut_27_0;
              break L6;
            }
          }
          var8 = stackIn_29_0;
          ne.a(-52, param0.field_v, ((mm) this).field_u, param0.field_j + (param3 - -(-((mm) this).field_u[0].field_w + param0.field_k >> -54344703)), param0.field_n + param2, var7);
          int discarded$3 = ((mm) this).field_g.a(param0.field_g, param2 - -param0.field_n, -2 + param3 - -param0.field_j, param0.field_v, param0.field_k, var8, -1, 1, 1, ((mm) this).field_g.field_C);
          return;
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
        if (param0 != 2188450) {
          field_p = -108;
          field_s = null;
          field_y = null;
          return;
        } else {
          field_s = null;
          field_y = null;
          return;
        }
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
