/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends l {
    static int field_y;
    private int field_z;
    static ec field_v;
    static String field_C;
    private int field_w;
    private int field_A;
    static boolean field_B;
    static he[] field_x;
    private nh[] field_t;
    static boolean[] field_u;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < param13) {
          if (param13 >= param14) {
            if (param14 > param1) {
              r.a(param2, param6, param9, param3, param5, wj.field_l, param12, param7, param14, param8, param10, param13, param15, param11, param0, (byte) -66, param1);
              var16 = 116 / ((53 - param4) / 62);
              return;
            } else {
              r.a(param5, param6, param8, param15, param2, wj.field_l, param12, param10, param1, param9, param7, param13, param3, param11, param0, (byte) -65, param14);
              var16 = 116 / ((53 - param4) / 62);
              return;
            }
          } else {
            r.a(param11, param9, param6, param3, param5, wj.field_l, param10, param7, param13, param8, param12, param14, param0, param2, param15, (byte) -60, param1);
            var16 = 116 / ((53 - param4) / 62);
            return;
          }
        } else {
          if (param1 >= param14) {
            if (param13 < param14) {
              r.a(param2, param8, param9, param0, param11, wj.field_l, param7, param12, param14, param6, param10, param1, param15, param5, param3, (byte) -67, param13);
              var16 = 116 / ((53 - param4) / 62);
              return;
            } else {
              r.a(param11, param8, param6, param15, param2, wj.field_l, param7, param10, param13, param9, param12, param1, param0, param5, param3, (byte) -88, param14);
              var16 = 116 / ((53 - param4) / 62);
              return;
            }
          } else {
            r.a(param5, param9, param8, param0, param11, wj.field_l, param10, param12, param1, param6, param7, param14, param3, param2, param15, (byte) -112, param13);
            var16 = 116 / ((53 - param4) / 62);
            return;
          }
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
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
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param1 > 94) {
          L0: {
            if (!param2.field_n) {
              if (param2.a(true)) {
                L1: {
                  var6 = 1;
                  if (!(param2 instanceof hf)) {
                    break L1;
                  } else {
                    param0 = param0 & ((hf) (Object) param2).field_E;
                    break L1;
                  }
                }
                L2: {
                  if (param0) {
                    if (var6 != 0) {
                      stackOut_38_0 = ((ie) this).field_z;
                      stackIn_39_0 = stackOut_38_0;
                      break L2;
                    } else {
                      stackOut_37_0 = ((ie) this).field_A;
                      stackIn_39_0 = stackOut_37_0;
                      break L2;
                    }
                  } else {
                    stackOut_35_0 = ((ie) this).field_w;
                    stackIn_39_0 = stackOut_35_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_39_0;
                  if (!param0) {
                    stackOut_41_0 = 7105644;
                    stackIn_42_0 = stackOut_41_0;
                    break L3;
                  } else {
                    stackOut_40_0 = 16777215;
                    stackIn_42_0 = stackOut_40_0;
                    break L3;
                  }
                }
                var8 = stackIn_42_0;
                lh.a(((ie) this).field_t, (byte) 121, param2.field_w, var7, param4 - -param2.field_o, param3 + param2.field_m + (param2.field_k + -((ie) this).field_t[0].field_C >> 2013306433));
                int discarded$4 = ((ie) this).field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 + -2), param2.field_w, param2.field_k, var8, -1, 1, 1, ((ie) this).field_g.field_x);
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
            if (!(param2 instanceof hf)) {
              break L4;
            } else {
              param0 = param0 & ((hf) (Object) param2).field_E;
              break L4;
            }
          }
          L5: {
            if (param0) {
              if (var6 != 0) {
                stackOut_50_0 = ((ie) this).field_z;
                stackIn_51_0 = stackOut_50_0;
                break L5;
              } else {
                stackOut_49_0 = ((ie) this).field_A;
                stackIn_51_0 = stackOut_49_0;
                break L5;
              }
            } else {
              stackOut_47_0 = ((ie) this).field_w;
              stackIn_51_0 = stackOut_47_0;
              break L5;
            }
          }
          L6: {
            var7 = stackIn_51_0;
            if (!param0) {
              stackOut_53_0 = 7105644;
              stackIn_54_0 = stackOut_53_0;
              break L6;
            } else {
              stackOut_52_0 = 16777215;
              stackIn_54_0 = stackOut_52_0;
              break L6;
            }
          }
          var8 = stackIn_54_0;
          lh.a(((ie) this).field_t, (byte) 121, param2.field_w, var7, param4 - -param2.field_o, param3 + param2.field_m + (param2.field_k + -((ie) this).field_t[0].field_C >> 2013306433));
          int discarded$5 = ((ie) this).field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 + -2), param2.field_w, param2.field_k, var8, -1, 1, 1, ((ie) this).field_g.field_x);
          return;
        } else {
          ((ie) this).field_t = null;
          if (param2.field_n) {
            L7: {
              var6 = 1;
              if (!(param2 instanceof hf)) {
                break L7;
              } else {
                param0 = param0 & ((hf) (Object) param2).field_E;
                break L7;
              }
            }
            L8: {
              if (param0) {
                if (var6 != 0) {
                  stackOut_22_0 = ((ie) this).field_z;
                  stackIn_23_0 = stackOut_22_0;
                  break L8;
                } else {
                  stackOut_21_0 = ((ie) this).field_A;
                  stackIn_23_0 = stackOut_21_0;
                  break L8;
                }
              } else {
                stackOut_19_0 = ((ie) this).field_w;
                stackIn_23_0 = stackOut_19_0;
                break L8;
              }
            }
            L9: {
              var7 = stackIn_23_0;
              if (!param0) {
                stackOut_25_0 = 7105644;
                stackIn_26_0 = stackOut_25_0;
                break L9;
              } else {
                stackOut_24_0 = 16777215;
                stackIn_26_0 = stackOut_24_0;
                break L9;
              }
            }
            var8 = stackIn_26_0;
            lh.a(((ie) this).field_t, (byte) 121, param2.field_w, var7, param4 - -param2.field_o, param3 + param2.field_m + (param2.field_k + -((ie) this).field_t[0].field_C >> 2013306433));
            int discarded$6 = ((ie) this).field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 + -2), param2.field_w, param2.field_k, var8, -1, 1, 1, ((ie) this).field_g.field_x);
            return;
          } else {
            L10: {
              if (!param2.a(true)) {
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
              if (!(param2 instanceof hf)) {
                break L11;
              } else {
                param0 = param0 & ((hf) (Object) param2).field_E;
                break L11;
              }
            }
            L12: {
              if (param0) {
                if (var6 != 0) {
                  stackOut_11_0 = ((ie) this).field_z;
                  stackIn_12_0 = stackOut_11_0;
                  break L12;
                } else {
                  stackOut_10_0 = ((ie) this).field_A;
                  stackIn_12_0 = stackOut_10_0;
                  break L12;
                }
              } else {
                stackOut_8_0 = ((ie) this).field_w;
                stackIn_12_0 = stackOut_8_0;
                break L12;
              }
            }
            L13: {
              var7 = stackIn_12_0;
              if (!param0) {
                stackOut_14_0 = 7105644;
                stackIn_15_0 = stackOut_14_0;
                break L13;
              } else {
                stackOut_13_0 = 16777215;
                stackIn_15_0 = stackOut_13_0;
                break L13;
              }
            }
            var8 = stackIn_15_0;
            lh.a(((ie) this).field_t, (byte) 121, param2.field_w, var7, param4 - -param2.field_o, param3 + param2.field_m + (param2.field_k + -((ie) this).field_t[0].field_C >> 2013306433));
            int discarded$7 = ((ie) this).field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 + -2), param2.field_w, param2.field_k, var8, -1, 1, 1, ((ie) this).field_g.field_x);
            return;
          }
        }
    }

    public ie() {
        this(2188450, 2591221, 9543);
    }

    final static int a(boolean param0) {
        if (param0) {
          ie.a(9, -41, 98, 108, (byte) 5, 25, 90, -7, -48, -35, 72, 76, -77, -54, -7, 93);
          return -si.field_B + li.field_k;
        } else {
          return -si.field_B + li.field_k;
        }
    }

    public static void c(int param0) {
        if (param0 <= 39) {
          ie.a(18, 72, 51, -18, (byte) -114, 114, -2, 103, 120, 120, -108, -121, 76, 24, 2, -16);
          field_C = null;
          field_v = null;
          field_x = null;
          field_u = null;
          return;
        } else {
          field_C = null;
          field_v = null;
          field_x = null;
          field_u = null;
          return;
        }
    }

    final static gl a(Throwable param0, String param1) {
        gl var2_ref = null;
        gl var2 = null;
        if (!(param0 instanceof gl)) {
            var2 = new gl(param0, param1);
        } else {
            var2_ref = (gl) (Object) param0;
            var2_ref.field_d = var2_ref.field_d + 32 + param1;
        }
        return var2_ref;
    }

    private ie(int param0, int param1, int param2) {
        ((ie) this).field_w = param2;
        ((ie) this).field_g = wi.field_e;
        ((ie) this).field_z = param1;
        ((ie) this).field_A = param0;
        ((ie) this).field_t = rk.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = -1;
        field_C = null;
        field_x = new he[1];
        field_B = true;
        field_u = new boolean[]{true, true, false, false, true, true, true, true, true, true, true, false, false, true, false};
    }
}
