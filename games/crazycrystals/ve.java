/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lb {
    private int field_r;
    static boolean field_t;
    private int field_s;
    private int field_q;
    private dl[] field_u;

    final static dh a(int param0, db param1, int param2, db param3, int param4) {
        if (gm.a(param1, param2, true, param4)) {
          if (param0 < 53) {
            return null;
          } else {
            return dq.a(-18289, param3.b(param2, 0, param4));
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
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
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          if (!param3.field_m) {
            if (param3.e(-109)) {
              L1: {
                var6 = 1;
                if (param3 instanceof pc) {
                  param4 = param4 & ((pc) (Object) param3).field_x;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_11_0 = ((ve) this).field_q;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 != 0) {
                    stackOut_10_0 = ((ve) this).field_r;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((ve) this).field_s;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              L3: {
                var7 = stackIn_12_0;
                tm.a(param3.field_r + param2, var7, param3.field_j + (param0 - -(param3.field_f + -((ve) this).field_u[0].field_o >> -676105919)), ((ve) this).field_u, param3.field_g, (byte) 89);
                if (param4) {
                  stackOut_14_0 = 16777215;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 7105644;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              var8 = stackIn_15_0;
              int discarded$2 = ((ve) this).field_p.a(param3.field_o, param3.field_r + param2, param0 + (param3.field_j - 2), param3.field_g, param3.field_f, var8, -1, 1, 1, ((ve) this).field_p.field_o);
              if (param1) {
                field_t = false;
                return;
              } else {
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
          if (param3 instanceof pc) {
            param4 = param4 & ((pc) (Object) param3).field_x;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param4) {
            stackOut_26_0 = ((ve) this).field_q;
            stackIn_27_0 = stackOut_26_0;
            break L5;
          } else {
            if (var6 != 0) {
              stackOut_25_0 = ((ve) this).field_r;
              stackIn_27_0 = stackOut_25_0;
              break L5;
            } else {
              stackOut_24_0 = ((ve) this).field_s;
              stackIn_27_0 = stackOut_24_0;
              break L5;
            }
          }
        }
        L6: {
          var7 = stackIn_27_0;
          tm.a(param3.field_r + param2, var7, param3.field_j + (param0 - -(param3.field_f + -((ve) this).field_u[0].field_o >> -676105919)), ((ve) this).field_u, param3.field_g, (byte) 89);
          if (param4) {
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
        int discarded$3 = ((ve) this).field_p.a(param3.field_o, param3.field_r + param2, param0 + (param3.field_j - 2), param3.field_g, param3.field_f, var8, -1, 1, 1, ((ve) this).field_p.field_o);
        if (param1) {
          field_t = false;
          return;
        } else {
          return;
        }
    }

    public ve() {
        this(2188450, 2591221, 9543);
    }

    private ve(int param0, int param1, int param2) {
        ((ve) this).field_s = param0;
        ((ve) this).field_u = sb.field_B;
        ((ve) this).field_r = param1;
        ((ve) this).field_p = mo.field_m;
        ((ve) this).field_q = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = true;
    }
}
