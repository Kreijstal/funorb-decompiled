/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static boolean field_a;
    private String field_c;
    static la field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            Object var2 = null;
            dn discarded$0 = he.a(-37, (String) null);
        }
    }

    final static boolean a(hc param0, double param1, double[] param2, int param3, double param4) {
        double[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        double[] var13 = null;
        double[] var14 = null;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        L0: {
          var12 = Torquing.field_u;
          kp.a(0.0, param3 + -16777300, param4, param2, param0);
          ee.a(false, new double[3], param2, param4, param1, 106);
          if (param3 == 16777215) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var17 = ll.a(mg.field_a, vf.field_e, (byte) 121);
          var16 = var17;
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var7 = var13;
          var8 = 0;
          if (var13 != null) {
            var9 = 0;
            L2: while (true) {
              if (var9 >= ia.field_i) {
                break L1;
              } else {
                var10 = var17[var9];
                if (var10 > 1e-7) {
                  var10 = var10 * param1;
                  param2[0] = param2[0] + var10 * bn.field_f[var9][6];
                  param2[1] = param2[1] + var10 * bn.field_f[var9][7];
                  param2[2] = param2[2] + var10 * bn.field_f[var9][8];
                  var8 = 1;
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var8 != 0;
    }

    final boolean b(int param0, String param1) {
        if (param0 != 0) {
            ((he) this).field_c = null;
        }
        return ((he) this).field_c.equals((Object) (Object) param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    he(String param0) {
        ((he) this).field_c = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = Torquing.field_u;
        var5 = param4 + param0;
        var6 = param1 + param2;
        if (param3 == 2) {
          L0: {
            if (ph.field_k < param0) {
              stackOut_4_0 = param0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = ph.field_k;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param2 > ph.field_c) {
              stackOut_7_0 = param2;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = ph.field_c;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (ph.field_a <= var5) {
              stackOut_10_0 = ph.field_a;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = var5;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (ph.field_h > var6) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = ph.field_h;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (param0 < ph.field_k) {
              break L4;
            } else {
              if (ph.field_a > param0) {
                var11 = param0 + ph.field_j * var8;
                var12 = 1 - (-var10 - -var8) >> -1941999167;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    ph.field_e[var11] = 16777215;
                    var11 = var11 + 2 * ph.field_j;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L6: {
            if (param2 < ph.field_c) {
              break L6;
            } else {
              if (ph.field_h <= var6) {
                break L6;
              } else {
                var11 = var7 + param2 * ph.field_j;
                var12 = var9 + (1 - var7) >> -1531961631;
                L7: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L6;
                  } else {
                    ph.field_e[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              }
            }
          }
          L8: {
            if (var5 < ph.field_k) {
              break L8;
            } else {
              if (ph.field_a <= var5) {
                break L8;
              } else {
                var11 = ((1 & var5 + -param0) + var8) * ph.field_j + var5;
                var12 = var10 + (1 + -var8) >> 2095502369;
                L9: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L8;
                  } else {
                    ph.field_e[var11] = 16777215;
                    var11 = var11 + ph.field_j * 2;
                    continue L9;
                  }
                }
              }
            }
          }
          L10: {
            if (ph.field_c > param2) {
              break L10;
            } else {
              if (var6 < ph.field_h) {
                var11 = ph.field_j * var6 - -var7 - -(var6 + -param2 & 1);
                var12 = 1 + var9 - var7 >> -1345641023;
                L11: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L10;
                  } else {
                    ph.field_e[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static dn a(int param0, String param1) {
        if (param0 != 1) {
            he.a(-116);
        }
        if (kh.field_o == mg.field_b) {
            return null;
        }
        if (ag.field_c == kh.field_o) {
            if (param1.equals((Object) (Object) on.field_b)) {
                kh.field_o = tp.field_h;
                return qi.field_d;
            }
        }
        kh.field_o = mg.field_b;
        qi.field_d = null;
        on.field_b = param1;
        return null;
    }

    final void a(java.applet.Applet param0, boolean param1) {
        if (param1) {
            he.a(90);
        }
        ni.a((byte) 102, param0, ((he) this).field_c, 31536000L, "jagex-last-login-method");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
