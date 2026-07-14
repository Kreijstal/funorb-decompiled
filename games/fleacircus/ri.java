/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends e {
    static String field_q;
    static String field_u;
    static ni field_x;
    private int field_w;
    static String field_s;
    private int field_v;
    private dd[] field_t;
    private int field_y;
    static String field_r;

    public ri() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        if (param0 < -36) {
          L0: {
            if (!param3.field_x) {
              if (param3.e(1)) {
                L1: {
                  var6 = 1;
                  if (param3 instanceof bb) {
                    param2 = param2 & ((bb) (Object) param3).field_D;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2) {
                    if (var6 != 0) {
                      stackOut_13_0 = ((ri) this).field_v;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = ((ri) this).field_y;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  } else {
                    stackOut_10_0 = ((ri) this).field_w;
                    stackIn_14_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_14_0;
                  ml.a(param1 - -param3.field_y, 1, ((ri) this).field_t, param4 - -param3.field_z - -(-((ri) this).field_t[0].field_r + param3.field_j >> 215542593), param3.field_u, var7);
                  if (param2) {
                    stackOut_16_0 = 16777215;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = 7105644;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                var8 = stackIn_17_0;
                int discarded$2 = ((ri) this).field_j.a(param3.field_i, param3.field_y + param1, -2 + (param4 - -param3.field_z), param3.field_u, param3.field_j, var8, -1, 1, 1, ((ri) this).field_j.field_H);
                return;
              } else {
                stackOut_5_0 = 0;
                stackIn_19_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_19_0 = stackOut_3_0;
              break L0;
            }
          }
          L4: {
            var6 = stackIn_19_0;
            if (param3 instanceof bb) {
              param2 = param2 & ((bb) (Object) param3).field_D;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param2) {
              if (var6 != 0) {
                stackOut_26_0 = ((ri) this).field_v;
                stackIn_27_0 = stackOut_26_0;
                break L5;
              } else {
                stackOut_25_0 = ((ri) this).field_y;
                stackIn_27_0 = stackOut_25_0;
                break L5;
              }
            } else {
              stackOut_23_0 = ((ri) this).field_w;
              stackIn_27_0 = stackOut_23_0;
              break L5;
            }
          }
          L6: {
            var7 = stackIn_27_0;
            ml.a(param1 - -param3.field_y, 1, ((ri) this).field_t, param4 - -param3.field_z - -(-((ri) this).field_t[0].field_r + param3.field_j >> 215542593), param3.field_u, var7);
            if (param2) {
              stackOut_29_0 = 16777215;
              stackIn_30_0 = stackOut_29_0;
              break L6;
            } else {
              stackOut_28_0 = 7105644;
              stackIn_30_0 = stackOut_28_0;
              break L6;
            }
          }
          var8 = stackIn_30_0;
          int discarded$3 = ((ri) this).field_j.a(param3.field_i, param3.field_y + param1, -2 + (param4 - -param3.field_z), param3.field_u, param3.field_j, var8, -1, 1, 1, ((ri) this).field_j.field_H);
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_r = null;
        field_q = null;
        field_u = null;
        int var1 = 57 % ((1 - param0) / 61);
        field_x = null;
    }

    private ri(int param0, int param1, int param2) {
        ((ri) this).field_w = param2;
        ((ri) this).field_j = rg.field_o;
        ((ri) this).field_v = param1;
        ((ri) this).field_t = ng.field_h;
        ((ri) this).field_y = param0;
    }

    final static void a(dd[] param0, int param1, fa param2, int param3, int param4, boolean param5, int param6, int param7, fa param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, dd[] param16, dd[] param17, int param18, int param19, int param20) {
        if (!param5) {
          ri.c((byte) 79);
          d.a(param10, param4, new qc(param17), new qc(param0), param6, param1, param9, param2, param8, new qc(param16), param13, param3, param12, param20, param7, param15, param19, param14, param11, param18, 255);
          return;
        } else {
          d.a(param10, param4, new qc(param17), new qc(param0), param6, param1, param9, param2, param8, new qc(param16), param13, param3, param12, param20, param7, param15, param19, param14, param11, param18, 255);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This is a members-only level.";
        field_q = "You have 1 unread message!";
        field_r = "Unable to connect to the data server. Please check any firewall you are using.";
        field_s = "Unpacking sound effects";
    }
}
