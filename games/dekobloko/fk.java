/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends a {
    static int field_H;
    private int field_F;
    static pi[][] field_G;
    static int[] field_I;
    private int field_D;
    private int field_B;
    private ck[] field_C;

    public static void c(int param0) {
        if (param0 != 8) {
            field_I = null;
            field_G = null;
            field_I = null;
            return;
        }
        field_G = null;
        field_I = null;
    }

    public fk() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param3 < -60) {
          L0: {
            if (!param4.field_q) {
              if (param4.a(true)) {
                L1: {
                  var6 = 1;
                  if (!(param4 instanceof ek)) {
                    break L1;
                  } else {
                    param0 = param0 & ((ek) (Object) param4).field_I;
                    break L1;
                  }
                }
                L2: {
                  if (!param0) {
                    stackOut_38_0 = ((fk) this).field_F;
                    stackIn_39_0 = stackOut_38_0;
                    break L2;
                  } else {
                    if (var6 != 0) {
                      stackOut_37_0 = ((fk) this).field_B;
                      stackIn_39_0 = stackOut_37_0;
                      break L2;
                    } else {
                      stackOut_36_0 = ((fk) this).field_D;
                      stackIn_39_0 = stackOut_36_0;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = stackIn_39_0;
                  if (param0) {
                    stackOut_41_0 = 16777215;
                    stackIn_42_0 = stackOut_41_0;
                    break L3;
                  } else {
                    stackOut_40_0 = 7105644;
                    stackIn_42_0 = stackOut_40_0;
                    break L3;
                  }
                }
                var8 = stackIn_42_0;
                rm.a(param2 - (-param4.field_D + -(param4.field_y - ((fk) this).field_C[0].field_C >> 2089386273)), ((fk) this).field_C, param4.field_u + param1, param4.field_t, var7, -121);
                int discarded$4 = ((fk) this).field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, ((fk) this).field_z.field_R);
                return;
              } else {
                stackOut_31_0 = 0;
                stackIn_44_0 = stackOut_31_0;
                break L0;
              }
            } else {
              stackOut_29_0 = 1;
              stackIn_44_0 = stackOut_29_0;
              break L0;
            }
          }
          L4: {
            var6 = stackIn_44_0;
            if (!(param4 instanceof ek)) {
              break L4;
            } else {
              param0 = param0 & ((ek) (Object) param4).field_I;
              break L4;
            }
          }
          L5: {
            if (!param0) {
              stackOut_50_0 = ((fk) this).field_F;
              stackIn_51_0 = stackOut_50_0;
              break L5;
            } else {
              if (var6 != 0) {
                stackOut_49_0 = ((fk) this).field_B;
                stackIn_51_0 = stackOut_49_0;
                break L5;
              } else {
                stackOut_48_0 = ((fk) this).field_D;
                stackIn_51_0 = stackOut_48_0;
                break L5;
              }
            }
          }
          L6: {
            var7 = stackIn_51_0;
            if (param0) {
              stackOut_53_0 = 16777215;
              stackIn_54_0 = stackOut_53_0;
              break L6;
            } else {
              stackOut_52_0 = 7105644;
              stackIn_54_0 = stackOut_52_0;
              break L6;
            }
          }
          var8 = stackIn_54_0;
          rm.a(param2 - (-param4.field_D + -(param4.field_y - ((fk) this).field_C[0].field_C >> 2089386273)), ((fk) this).field_C, param4.field_u + param1, param4.field_t, var7, -121);
          int discarded$5 = ((fk) this).field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, ((fk) this).field_z.field_R);
          return;
        } else {
          fk.c(-101);
          if (param4.field_q) {
            L7: {
              var6 = 1;
              if (!(param4 instanceof ek)) {
                break L7;
              } else {
                param0 = param0 & ((ek) (Object) param4).field_I;
                break L7;
              }
            }
            L8: {
              if (!param0) {
                stackOut_22_0 = ((fk) this).field_F;
                stackIn_23_0 = stackOut_22_0;
                break L8;
              } else {
                if (var6 != 0) {
                  stackOut_21_0 = ((fk) this).field_B;
                  stackIn_23_0 = stackOut_21_0;
                  break L8;
                } else {
                  stackOut_20_0 = ((fk) this).field_D;
                  stackIn_23_0 = stackOut_20_0;
                  break L8;
                }
              }
            }
            L9: {
              var7 = stackIn_23_0;
              if (param0) {
                stackOut_25_0 = 16777215;
                stackIn_26_0 = stackOut_25_0;
                break L9;
              } else {
                stackOut_24_0 = 7105644;
                stackIn_26_0 = stackOut_24_0;
                break L9;
              }
            }
            var8 = stackIn_26_0;
            rm.a(param2 - (-param4.field_D + -(param4.field_y - ((fk) this).field_C[0].field_C >> 2089386273)), ((fk) this).field_C, param4.field_u + param1, param4.field_t, var7, -121);
            int discarded$6 = ((fk) this).field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, ((fk) this).field_z.field_R);
            return;
          } else {
            L10: {
              if (!param4.a(true)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L10;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_5_0;
              if (!(param4 instanceof ek)) {
                break L11;
              } else {
                param0 = param0 & ((ek) (Object) param4).field_I;
                break L11;
              }
            }
            L12: {
              if (!param0) {
                stackOut_11_0 = ((fk) this).field_F;
                stackIn_12_0 = stackOut_11_0;
                break L12;
              } else {
                if (var6 != 0) {
                  stackOut_10_0 = ((fk) this).field_B;
                  stackIn_12_0 = stackOut_10_0;
                  break L12;
                } else {
                  stackOut_9_0 = ((fk) this).field_D;
                  stackIn_12_0 = stackOut_9_0;
                  break L12;
                }
              }
            }
            L13: {
              var7 = stackIn_12_0;
              if (param0) {
                stackOut_14_0 = 16777215;
                stackIn_15_0 = stackOut_14_0;
                break L13;
              } else {
                stackOut_13_0 = 7105644;
                stackIn_15_0 = stackOut_13_0;
                break L13;
              }
            }
            var8 = stackIn_15_0;
            rm.a(param2 - (-param4.field_D + -(param4.field_y - ((fk) this).field_C[0].field_C >> 2089386273)), ((fk) this).field_C, param4.field_u + param1, param4.field_t, var7, -121);
            int discarded$7 = ((fk) this).field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, ((fk) this).field_z.field_R);
            return;
          }
        }
    }

    private fk(int param0, int param1, int param2) {
        ((fk) this).field_D = param0;
        ((fk) this).field_z = ec.field_p;
        ((fk) this).field_C = rm.field_a;
        ((fk) this).field_F = param2;
        ((fk) this).field_B = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new pi[8][];
        field_I = new int[2];
    }
}
