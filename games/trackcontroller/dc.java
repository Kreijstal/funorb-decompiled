/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends ic {
    private int field_u;
    static jb field_w;
    private int field_q;
    static java.awt.Font field_s;
    static boolean[] field_r;
    private qj[] field_t;
    private int field_v;
    static String field_o;
    static qj field_p;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          if (!param1.field_q) {
            if (param1.h(-87)) {
              L1: {
                var6 = 1;
                if (!(param1 instanceof rh)) {
                  break L1;
                } else {
                  param3 = param3 & ((rh) (Object) param1).field_B;
                  break L1;
                }
              }
              if (param0 == -24969) {
                L2: {
                  if (!param3) {
                    stackOut_20_0 = ((dc) this).field_q;
                    stackIn_21_0 = stackOut_20_0;
                    break L2;
                  } else {
                    if (var6 != 0) {
                      stackOut_19_0 = ((dc) this).field_u;
                      stackIn_21_0 = stackOut_19_0;
                      break L2;
                    } else {
                      stackOut_18_0 = ((dc) this).field_v;
                      stackIn_21_0 = stackOut_18_0;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = stackIn_21_0;
                  cb.a(param2 + param1.field_m + (param1.field_u - ((dc) this).field_t[0].field_v >> 1581360577), (byte) -128, var7, param1.field_x, ((dc) this).field_t, param1.field_p + param4);
                  if (!param3) {
                    stackOut_23_0 = 7105644;
                    stackIn_24_0 = stackOut_23_0;
                    break L3;
                  } else {
                    stackOut_22_0 = 16777215;
                    stackIn_24_0 = stackOut_22_0;
                    break L3;
                  }
                }
                var8 = stackIn_24_0;
                int discarded$4 = ((dc) this).field_k.a(param1.field_s, param4 - -param1.field_p, param1.field_m + param2 - 2, param1.field_x, param1.field_u, var8, -1, 1, 1, ((dc) this).field_k.field_G);
                return;
              } else {
                L4: {
                  dc.c((byte) -91);
                  if (!param3) {
                    stackOut_11_0 = ((dc) this).field_q;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    if (var6 != 0) {
                      stackOut_10_0 = ((dc) this).field_u;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_9_0 = ((dc) this).field_v;
                      stackIn_12_0 = stackOut_9_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var7 = stackIn_12_0;
                  cb.a(param2 + param1.field_m + (param1.field_u - ((dc) this).field_t[0].field_v >> 1581360577), (byte) -128, var7, param1.field_x, ((dc) this).field_t, param1.field_p + param4);
                  if (!param3) {
                    stackOut_14_0 = 7105644;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = 16777215;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                var8 = stackIn_15_0;
                int discarded$5 = ((dc) this).field_k.a(param1.field_s, param4 - -param1.field_p, param1.field_m + param2 - 2, param1.field_x, param1.field_u, var8, -1, 1, 1, ((dc) this).field_k.field_G);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_26_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_26_0 = stackOut_1_0;
            break L0;
          }
        }
        L6: {
          var6 = stackIn_26_0;
          if (!(param1 instanceof rh)) {
            break L6;
          } else {
            param3 = param3 & ((rh) (Object) param1).field_B;
            break L6;
          }
        }
        if (param0 != -24969) {
          L7: {
            dc.c((byte) -91);
            if (!param3) {
              stackOut_42_0 = ((dc) this).field_q;
              stackIn_43_0 = stackOut_42_0;
              break L7;
            } else {
              if (var6 != 0) {
                stackOut_41_0 = ((dc) this).field_u;
                stackIn_43_0 = stackOut_41_0;
                break L7;
              } else {
                stackOut_40_0 = ((dc) this).field_v;
                stackIn_43_0 = stackOut_40_0;
                break L7;
              }
            }
          }
          L8: {
            var7 = stackIn_43_0;
            cb.a(param2 + param1.field_m + (param1.field_u - ((dc) this).field_t[0].field_v >> 1581360577), (byte) -128, var7, param1.field_x, ((dc) this).field_t, param1.field_p + param4);
            if (!param3) {
              stackOut_45_0 = 7105644;
              stackIn_46_0 = stackOut_45_0;
              break L8;
            } else {
              stackOut_44_0 = 16777215;
              stackIn_46_0 = stackOut_44_0;
              break L8;
            }
          }
          var8 = stackIn_46_0;
          int discarded$6 = ((dc) this).field_k.a(param1.field_s, param4 - -param1.field_p, param1.field_m + param2 - 2, param1.field_x, param1.field_u, var8, -1, 1, 1, ((dc) this).field_k.field_G);
          return;
        } else {
          L9: {
            if (!param3) {
              stackOut_33_0 = ((dc) this).field_q;
              stackIn_34_0 = stackOut_33_0;
              break L9;
            } else {
              if (var6 != 0) {
                stackOut_32_0 = ((dc) this).field_u;
                stackIn_34_0 = stackOut_32_0;
                break L9;
              } else {
                stackOut_31_0 = ((dc) this).field_v;
                stackIn_34_0 = stackOut_31_0;
                break L9;
              }
            }
          }
          L10: {
            var7 = stackIn_34_0;
            cb.a(param2 + param1.field_m + (param1.field_u - ((dc) this).field_t[0].field_v >> 1581360577), (byte) -128, var7, param1.field_x, ((dc) this).field_t, param1.field_p + param4);
            if (!param3) {
              stackOut_36_0 = 7105644;
              stackIn_37_0 = stackOut_36_0;
              break L10;
            } else {
              stackOut_35_0 = 16777215;
              stackIn_37_0 = stackOut_35_0;
              break L10;
            }
          }
          var8 = stackIn_37_0;
          int discarded$7 = ((dc) this).field_k.a(param1.field_s, param4 - -param1.field_p, param1.field_m + param2 - 2, param1.field_x, param1.field_u, var8, -1, 1, 1, ((dc) this).field_k.field_G);
          return;
        }
    }

    public static void c(byte param0) {
        field_s = null;
        if (param0 < 20) {
          dc.c((byte) -11);
          field_o = null;
          field_w = null;
          field_p = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_w = null;
          field_p = null;
          field_r = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = TrackController.field_F ? 1 : 0;
        if (param1 == 1581360577) {
          if (param3 >= param15) {
            if (param0 <= param3) {
              if (param0 > param15) {
                ld.a(param2, param13, param12, param11, param9, param4, param6, param5, param0, param3, param14, param15, param7, true, param8, ll.field_i, param10);
                return;
              } else {
                ld.a(param14, param13, param11, param12, param7, param4, param5, param6, param15, param3, param2, param0, param9, true, param8, ll.field_i, param10);
                return;
              }
            } else {
              ld.a(param10, param5, param12, param8, param9, param7, param6, param13, param3, param0, param14, param15, param4, true, param11, ll.field_i, param2);
              return;
            }
          } else {
            if (param0 <= param15) {
              if (param3 >= param0) {
                ld.a(param10, param6, param11, param8, param7, param9, param5, param13, param3, param15, param2, param0, param4, true, param12, ll.field_i, param14);
                return;
              } else {
                ld.a(param2, param6, param8, param11, param4, param9, param13, param5, param0, param15, param10, param3, param7, true, param12, ll.field_i, param14);
                return;
              }
            } else {
              ld.a(param14, param5, param8, param12, param4, param7, param13, param6, param15, param0, param10, param3, param9, true, param11, ll.field_i, param2);
              return;
            }
          }
        } else {
          return;
        }
    }

    private dc(int param0, int param1, int param2) {
        ((dc) this).field_v = param0;
        ((dc) this).field_t = il.field_l;
        ((dc) this).field_q = param2;
        ((dc) this).field_u = param1;
        ((dc) this).field_k = p.field_a;
    }

    public dc() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new jb();
    }
}
