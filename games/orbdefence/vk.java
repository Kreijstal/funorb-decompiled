/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends jc {
    static String field_y;
    private int field_x;
    private hj[] field_A;
    static boolean[] field_w;
    private int field_u;
    static String field_v;
    private int field_z;

    final static void a(int param0, boolean param1) {
        kb.field_m = 0;
        tk.field_n = 0;
        h.field_A = og.field_b;
        le.field_c = param0;
        wj.field_k = new ml(2);
        wj.field_k.a(-1, ka.a(24316, ua.field_a, vl.field_d), 0, param1);
    }

    public static void b(byte param0) {
        if (param0 > -52) {
            return;
        }
        field_v = null;
        field_w = null;
        field_y = null;
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ab.field_h = new im();
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
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
        if (param3 == -4394) {
          L0: {
            if (!param2.field_t) {
              if (param2.d(-81)) {
                L1: {
                  var6 = 1;
                  if (!(param2 instanceof s)) {
                    break L1;
                  } else {
                    param4 = param4 & ((s) (Object) param2).field_F;
                    break L1;
                  }
                }
                L2: {
                  if (!param4) {
                    stackOut_38_0 = ((vk) this).field_z;
                    stackIn_39_0 = stackOut_38_0;
                    break L2;
                  } else {
                    if (var6 != 0) {
                      stackOut_37_0 = ((vk) this).field_u;
                      stackIn_39_0 = stackOut_37_0;
                      break L2;
                    } else {
                      stackOut_36_0 = ((vk) this).field_x;
                      stackIn_39_0 = stackOut_36_0;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = stackIn_39_0;
                  rl.a(((vk) this).field_A, param2.field_m, 2, param0 - -param2.field_n - -(param2.field_r - ((vk) this).field_A[0].field_t >> -113379231), var7, param1 + param2.field_s);
                  if (param4) {
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
                int discarded$4 = ((vk) this).field_g.a(param2.field_l, param2.field_s + param1, param2.field_n + param0 - 2, param2.field_m, param2.field_r, var8, -1, 1, 1, ((vk) this).field_g.field_H);
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
            if (!(param2 instanceof s)) {
              break L4;
            } else {
              param4 = param4 & ((s) (Object) param2).field_F;
              break L4;
            }
          }
          L5: {
            if (!param4) {
              stackOut_50_0 = ((vk) this).field_z;
              stackIn_51_0 = stackOut_50_0;
              break L5;
            } else {
              if (var6 != 0) {
                stackOut_49_0 = ((vk) this).field_u;
                stackIn_51_0 = stackOut_49_0;
                break L5;
              } else {
                stackOut_48_0 = ((vk) this).field_x;
                stackIn_51_0 = stackOut_48_0;
                break L5;
              }
            }
          }
          L6: {
            var7 = stackIn_51_0;
            rl.a(((vk) this).field_A, param2.field_m, 2, param0 - -param2.field_n - -(param2.field_r - ((vk) this).field_A[0].field_t >> -113379231), var7, param1 + param2.field_s);
            if (param4) {
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
          int discarded$5 = ((vk) this).field_g.a(param2.field_l, param2.field_s + param1, param2.field_n + param0 - 2, param2.field_m, param2.field_r, var8, -1, 1, 1, ((vk) this).field_g.field_H);
          return;
        } else {
          vk.b((byte) 66);
          if (param2.field_t) {
            L7: {
              var6 = 1;
              if (!(param2 instanceof s)) {
                break L7;
              } else {
                param4 = param4 & ((s) (Object) param2).field_F;
                break L7;
              }
            }
            L8: {
              if (!param4) {
                stackOut_22_0 = ((vk) this).field_z;
                stackIn_23_0 = stackOut_22_0;
                break L8;
              } else {
                if (var6 != 0) {
                  stackOut_21_0 = ((vk) this).field_u;
                  stackIn_23_0 = stackOut_21_0;
                  break L8;
                } else {
                  stackOut_20_0 = ((vk) this).field_x;
                  stackIn_23_0 = stackOut_20_0;
                  break L8;
                }
              }
            }
            L9: {
              var7 = stackIn_23_0;
              rl.a(((vk) this).field_A, param2.field_m, 2, param0 - -param2.field_n - -(param2.field_r - ((vk) this).field_A[0].field_t >> -113379231), var7, param1 + param2.field_s);
              if (param4) {
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
            int discarded$6 = ((vk) this).field_g.a(param2.field_l, param2.field_s + param1, param2.field_n + param0 - 2, param2.field_m, param2.field_r, var8, -1, 1, 1, ((vk) this).field_g.field_H);
            return;
          } else {
            L10: {
              if (!param2.d(-81)) {
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
              if (!(param2 instanceof s)) {
                break L11;
              } else {
                param4 = param4 & ((s) (Object) param2).field_F;
                break L11;
              }
            }
            L12: {
              if (!param4) {
                stackOut_11_0 = ((vk) this).field_z;
                stackIn_12_0 = stackOut_11_0;
                break L12;
              } else {
                if (var6 != 0) {
                  stackOut_10_0 = ((vk) this).field_u;
                  stackIn_12_0 = stackOut_10_0;
                  break L12;
                } else {
                  stackOut_9_0 = ((vk) this).field_x;
                  stackIn_12_0 = stackOut_9_0;
                  break L12;
                }
              }
            }
            L13: {
              var7 = stackIn_12_0;
              rl.a(((vk) this).field_A, param2.field_m, 2, param0 - -param2.field_n - -(param2.field_r - ((vk) this).field_A[0].field_t >> -113379231), var7, param1 + param2.field_s);
              if (param4) {
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
            int discarded$7 = ((vk) this).field_g.a(param2.field_l, param2.field_s + param1, param2.field_n + param0 - 2, param2.field_m, param2.field_r, var8, -1, 1, 1, ((vk) this).field_g.field_H);
            return;
          }
        }
    }

    final static void a(ca param0, byte param1, ca param2) {
        if (null == param0.field_c) {
          param0.field_c = param2.field_c;
          param0.field_e = param2;
          param0.field_c.field_e = param0;
          param0.field_e.field_c = param0;
          if (param1 != -65) {
            field_y = null;
            return;
          } else {
            return;
          }
        } else {
          param0.b(57);
          param0.field_c = param2.field_c;
          param0.field_e = param2;
          param0.field_c.field_e = param0;
          param0.field_e.field_c = param0;
          if (param1 == -65) {
            return;
          } else {
            field_y = null;
            return;
          }
        }
    }

    public vk() {
        this(2188450, 2591221, 9543);
    }

    private vk(int param0, int param1, int param2) {
        ((vk) this).field_g = qc.field_b;
        ((vk) this).field_A = ea.field_b;
        ((vk) this).field_u = param1;
        ((vk) this).field_x = param0;
        ((vk) this).field_z = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "To server list";
        field_w = new boolean[64];
    }
}
