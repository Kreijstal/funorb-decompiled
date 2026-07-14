/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tka extends vpa {
    private hja[] field_o;
    static volatile int field_n;
    static nh field_p;
    static jea field_q;

    tka(hja[] param0) {
        ((tka) this).field_e = mj.field_J;
        ((tka) this).field_o = param0;
    }

    public static void c(byte param0) {
        if (param0 > -52) {
            field_q = null;
            field_p = null;
            field_q = null;
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 > 46) {
          if (ou.field_e == null) {
            lm.field_r = new int[256];
            ou.field_e = new int[256];
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                return;
              } else {
                var2 = (double)var1 / 255.0 * 6.283185307179586;
                ou.field_e[var1] = (int)(Math.sin(var2) * 4096.0);
                lm.field_r[var1] = (int)(4096.0 * Math.cos(var2));
                var1++;
                continue L0;
              }
            }
          } else {
            if (lm.field_r == null) {
              lm.field_r = new int[256];
              ou.field_e = new int[256];
              var1 = 0;
              L1: while (true) {
                if (256 <= var1) {
                  return;
                } else {
                  var2 = (double)var1 / 255.0 * 6.283185307179586;
                  ou.field_e[var1] = (int)(Math.sin(var2) * 4096.0);
                  lm.field_r[var1] = (int)(4096.0 * Math.cos(var2));
                  var1++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          field_p = null;
          if (ou.field_e == null) {
            lm.field_r = new int[256];
            ou.field_e = new int[256];
            var1 = 0;
            L2: while (true) {
              if (256 > var1) {
                var2 = (double)var1 / 255.0 * 6.283185307179586;
                ou.field_e[var1] = (int)(Math.sin(var2) * 4096.0);
                lm.field_r[var1] = (int)(4096.0 * Math.cos(var2));
                var1++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            if (lm.field_r == null) {
              lm.field_r = new int[256];
              ou.field_e = new int[256];
              var1 = 0;
              L3: while (true) {
                if (256 > var1) {
                  var2 = (double)var1 / 255.0 * 6.283185307179586;
                  ou.field_e[var1] = (int)(Math.sin(var2) * 4096.0);
                  lm.field_r[var1] = (int)(4096.0 * Math.cos(var2));
                  var1++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hja var14 = null;
        hja var38 = null;
        hja var38_ref = null;
        hja var41 = null;
        hja var41_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        bea.f(param1 - -param0.field_i, param3 - -param0.field_n, param0.field_m, param0.field_p, 10197915);
        if (param4) {
          if (((rj) (Object) param0).field_w) {
            L0: {
              L1: {
                var6 = 1;
                if (!param4) {
                  break L1;
                } else {
                  if (!param0.b((byte) -34)) {
                    break L1;
                  } else {
                    stackOut_32_0 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    break L0;
                  }
                }
              }
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            }
            L2: {
              var7 = stackIn_34_0;
              var8 = 0;
              if (var6 == 0) {
                stackOut_36_0 = 16777215;
                stackIn_37_0 = stackOut_36_0;
                break L2;
              } else {
                stackOut_35_0 = 2394342;
                stackIn_37_0 = stackOut_35_0;
                break L2;
              }
            }
            L3: {
              var9 = stackIn_37_0;
              if (var7 == 0) {
                break L3;
              } else {
                var8 = var8 | 2;
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                var8 = var8 | 1;
                break L4;
              }
            }
            var41_ref = ((tka) this).field_o[var8];
            var11 = param0.field_i + param1 - -((-var41_ref.field_a + param0.field_m) / 2);
            var12 = (param0.field_p + -var41_ref.field_b) / 2 + (param0.field_n + param3);
            var13 = param1 + (param0.field_i + param0.field_m / 2);
            var41_ref.b(var11, var12);
            ((tka) this).field_e.a(((tka) this).d(-4, param0), var13, param3, var9, -1);
            if (param2 == 16777215) {
              return;
            } else {
              tka.b((byte) 56);
              return;
            }
          } else {
            L5: {
              L6: {
                var6 = 0;
                if (!param4) {
                  break L6;
                } else {
                  if (!param0.b((byte) -34)) {
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L5;
            }
            L7: {
              var7 = stackIn_20_0;
              var8 = 0;
              if (var6 == 0) {
                stackOut_22_0 = 16777215;
                stackIn_23_0 = stackOut_22_0;
                break L7;
              } else {
                stackOut_21_0 = 2394342;
                stackIn_23_0 = stackOut_21_0;
                break L7;
              }
            }
            L8: {
              var9 = stackIn_23_0;
              if (var7 == 0) {
                break L8;
              } else {
                var8 = var8 | 2;
                break L8;
              }
            }
            L9: {
              if (var6 == 0) {
                break L9;
              } else {
                var8 = var8 | 1;
                break L9;
              }
            }
            var38_ref = ((tka) this).field_o[var8];
            var41 = var38_ref;
            var41 = var38_ref;
            var11 = param0.field_i + param1 - -((-var38_ref.field_a + param0.field_m) / 2);
            var12 = (param0.field_p + -var38_ref.field_b) / 2 + (param0.field_n + param3);
            var13 = param1 + (param0.field_i + param0.field_m / 2);
            var38_ref.b(var11, var12);
            ((tka) this).field_e.a(((tka) this).d(-4, param0), var13, param3, var9, -1);
            if (param2 == 16777215) {
              return;
            } else {
              tka.b((byte) 56);
              return;
            }
          }
        } else {
          L10: {
            L11: {
              var6 = 0;
              if (!param4) {
                break L11;
              } else {
                if (!param0.b((byte) -34)) {
                  break L11;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L10;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L10;
          }
          L12: {
            var7 = stackIn_5_0;
            var8 = 0;
            if (var6 == 0) {
              stackOut_7_0 = 16777215;
              stackIn_8_0 = stackOut_7_0;
              break L12;
            } else {
              stackOut_6_0 = 2394342;
              stackIn_8_0 = stackOut_6_0;
              break L12;
            }
          }
          L13: {
            var9 = stackIn_8_0;
            if (var7 == 0) {
              break L13;
            } else {
              var8 = var8 | 2;
              break L13;
            }
          }
          L14: {
            if (var6 == 0) {
              break L14;
            } else {
              var8 = var8 | 1;
              break L14;
            }
          }
          var14 = ((tka) this).field_o[var8];
          var38 = var14;
          var41 = var38;
          var38 = var14;
          var11 = param0.field_i + param1 - -((-var14.field_a + param0.field_m) / 2);
          var12 = (param0.field_p + -var14.field_b) / 2 + (param0.field_n + param3);
          var13 = param1 + (param0.field_i + param0.field_m / 2);
          var14.b(var11, var12);
          ((tka) this).field_e.a(((tka) this).d(-4, param0), var13, param3, var9, -1);
          if (param2 == 16777215) {
            return;
          } else {
            tka.b((byte) 56);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
    }
}
