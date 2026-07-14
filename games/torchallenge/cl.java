/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bc {
    private int field_x;
    static String field_A;
    static int[] field_u;
    static String field_w;
    static int[] field_s;
    private int field_B;
    static lj field_y;
    private ka[] field_t;
    static boolean field_z;
    private int field_v;

    public static void c(byte param0) {
        field_w = null;
        field_A = null;
        field_y = null;
        int var1 = 74 / ((param0 - 0) / 57);
        field_s = null;
        field_u = null;
    }

    public cl() {
        this(2188450, 2591221, 9543);
    }

    final static void b(byte param0) {
        int var1 = 0;
        e var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        bh.field_o.h();
        re.field_B.h();
        qb.field_b = qb.field_b - 1;
        var1 = 120 % ((param0 - -61) / 54);
        if (qb.field_b == 0) {
          qb.field_b = 200;
          var2 = (e) (Object) tj.field_e.c((byte) 112);
          L0: while (true) {
            if (var2 == null) {
              if (TorChallenge.field_I != null) {
                var2 = (e) (Object) TorChallenge.field_I.c((byte) -118);
                L1: while (true) {
                  if (var2 == null) {
                    L2: {
                      if (la.field_a == null) {
                        break L2;
                      } else {
                        if (la.field_a.d(0)) {
                          break L2;
                        } else {
                          tg.field_t = null;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (!var2.field_k.b(11163)) {
                        var2.a(true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = (e) (Object) TorChallenge.field_I.c(-270);
                    continue L1;
                  }
                }
              } else {
                L4: {
                  if (la.field_a == null) {
                    break L4;
                  } else {
                    if (la.field_a.d(0)) {
                      break L4;
                    } else {
                      tg.field_t = null;
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              L5: {
                if (var2.field_k.b(11163)) {
                  break L5;
                } else {
                  var2.a(true);
                  break L5;
                }
              }
              var2 = (e) (Object) tj.field_e.c(-270);
              continue L0;
            }
          }
        } else {
          if (la.field_a != null) {
            if (!la.field_a.d(0)) {
              tg.field_t = null;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          if (!param0.field_w) {
            if (param0.c(param3 ^ 1)) {
              L1: {
                var6 = 1;
                if (param0 instanceof ng) {
                  param4 = param4 & ((ng) (Object) param0).field_F;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_11_0 = ((cl) this).field_B;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 == 0) {
                    stackOut_10_0 = ((cl) this).field_v;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((cl) this).field_x;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              var7 = stackIn_12_0;
              uk.a(var7, param3 ^ 96, param0.field_m + param2, (param0.field_l + -((cl) this).field_t[0].field_v >> -200551743) + param0.field_i + param1, param0.field_p, ((cl) this).field_t);
              if (param3 == 97) {
                L3: {
                  if (!param4) {
                    stackOut_19_0 = 7105644;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  } else {
                    stackOut_18_0 = 16777215;
                    stackIn_20_0 = stackOut_18_0;
                    break L3;
                  }
                }
                var8 = stackIn_20_0;
                int discarded$4 = ((cl) this).field_g.a(param0.field_v, param2 - -param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, ((cl) this).field_g.field_x);
                return;
              } else {
                L4: {
                  cl.c((byte) 98);
                  if (!param4) {
                    stackOut_15_0 = 7105644;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 16777215;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                var8 = stackIn_16_0;
                int discarded$5 = ((cl) this).field_g.a(param0.field_v, param2 - -param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, ((cl) this).field_g.field_x);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_22_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_22_0 = stackOut_1_0;
            break L0;
          }
        }
        L5: {
          var6 = stackIn_22_0;
          if (param0 instanceof ng) {
            param4 = param4 & ((ng) (Object) param0).field_F;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!param4) {
            stackOut_29_0 = ((cl) this).field_B;
            stackIn_30_0 = stackOut_29_0;
            break L6;
          } else {
            if (var6 == 0) {
              stackOut_28_0 = ((cl) this).field_v;
              stackIn_30_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = ((cl) this).field_x;
              stackIn_30_0 = stackOut_27_0;
              break L6;
            }
          }
        }
        var7 = stackIn_30_0;
        uk.a(var7, param3 ^ 96, param0.field_m + param2, (param0.field_l + -((cl) this).field_t[0].field_v >> -200551743) + param0.field_i + param1, param0.field_p, ((cl) this).field_t);
        if (param3 != 97) {
          L7: {
            cl.c((byte) 98);
            if (!param4) {
              stackOut_37_0 = 7105644;
              stackIn_38_0 = stackOut_37_0;
              break L7;
            } else {
              stackOut_36_0 = 16777215;
              stackIn_38_0 = stackOut_36_0;
              break L7;
            }
          }
          var8 = stackIn_38_0;
          int discarded$6 = ((cl) this).field_g.a(param0.field_v, param2 - -param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, ((cl) this).field_g.field_x);
          return;
        } else {
          L8: {
            if (!param4) {
              stackOut_33_0 = 7105644;
              stackIn_34_0 = stackOut_33_0;
              break L8;
            } else {
              stackOut_32_0 = 16777215;
              stackIn_34_0 = stackOut_32_0;
              break L8;
            }
          }
          var8 = stackIn_34_0;
          int discarded$7 = ((cl) this).field_g.a(param0.field_v, param2 - -param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, ((cl) this).field_g.field_x);
          return;
        }
    }

    private cl(int param0, int param1, int param2) {
        ((cl) this).field_t = ae.field_v;
        ((cl) this).field_x = param1;
        ((cl) this).field_B = param2;
        ((cl) this).field_v = param0;
        ((cl) this).field_g = dl.field_H;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[]{20, 40, 40, 20, 40};
        field_w = "End Game";
        field_s = new int[]{10, 10, 10};
        field_A = "You have 1 unread message!";
    }
}
