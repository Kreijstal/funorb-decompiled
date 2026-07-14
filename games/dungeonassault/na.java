/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hh {
    static ji field_D;
    static cn field_A;
    static cc field_y;
    private int field_F;
    private cn[] field_x;
    private int field_z;
    static tf field_w;
    private int field_E;
    static cn[] field_C;
    static int[] field_G;

    public static void c(int param0) {
        field_A = null;
        if (param0 >= -26) {
            return;
        }
        field_C = null;
        field_G = null;
        field_D = null;
        field_w = null;
        field_y = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        hd.a(param1 ^ 2599413, param2, (String) null, param0);
        if (param1 != 2591221) {
            field_A = null;
        }
    }

    public na() {
        this(2188450, 2591221, 9543);
    }

    private na(int param0, int param1, int param2) {
        ((na) this).field_x = field_C;
        ((na) this).field_E = param2;
        ((na) this).field_F = param1;
        ((na) this).field_z = param0;
        ((na) this).field_u = hc.field_f;
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          if (!param1.field_u) {
            if (param1.a((byte) 75)) {
              L1: {
                var6 = 1;
                if (param1 instanceof ck) {
                  param4 = param4 & ((ck) (Object) param1).field_B;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param4) {
                  if (var6 != 0) {
                    stackOut_11_0 = ((na) this).field_F;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = ((na) this).field_z;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                } else {
                  stackOut_8_0 = ((na) this).field_E;
                  stackIn_12_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_12_0;
                ad.a(param1.field_x, param3 + param1.field_v - -(-((na) this).field_x[0].field_G + param1.field_s >> -689401247), param2 - -param1.field_q, (byte) -2, var7, ((na) this).field_x);
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
              if (param0 != 34) {
                na.c(123);
                int discarded$4 = ((na) this).field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, ((na) this).field_u.field_H);
                return;
              } else {
                int discarded$5 = ((na) this).field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, ((na) this).field_u.field_H);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_19_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_19_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_19_0;
          if (param1 instanceof ck) {
            param4 = param4 & ((ck) (Object) param1).field_B;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param4) {
            if (var6 != 0) {
              stackOut_26_0 = ((na) this).field_F;
              stackIn_27_0 = stackOut_26_0;
              break L5;
            } else {
              stackOut_25_0 = ((na) this).field_z;
              stackIn_27_0 = stackOut_25_0;
              break L5;
            }
          } else {
            stackOut_23_0 = ((na) this).field_E;
            stackIn_27_0 = stackOut_23_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_27_0;
          ad.a(param1.field_x, param3 + param1.field_v - -(-((na) this).field_x[0].field_G + param1.field_s >> -689401247), param2 - -param1.field_q, (byte) -2, var7, ((na) this).field_x);
          if (!param4) {
            stackOut_29_0 = 7105644;
            stackIn_30_0 = stackOut_29_0;
            break L6;
          } else {
            stackOut_28_0 = 16777215;
            stackIn_30_0 = stackOut_28_0;
            break L6;
          }
        }
        var8 = stackIn_30_0;
        if (param0 != 34) {
          na.c(123);
          int discarded$6 = ((na) this).field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, ((na) this).field_u.field_H);
          return;
        } else {
          int discarded$7 = ((na) this).field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, ((na) this).field_u.field_H);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{28, 234, 513, 709, 950, 1046, 1325, 1430, 1693};
    }
}
