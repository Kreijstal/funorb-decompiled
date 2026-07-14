/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj extends om {
    private int field_A;
    static String field_C;
    private int field_G;
    static int field_y;
    private int field_z;
    static ko[] field_L;
    static String field_M;
    private boolean field_I;
    private int field_F;
    static am field_E;
    static dl field_B;
    private boolean field_J;
    static db field_H;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((oj) this).field_s = 0;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (!(!((oj) this).a(0, param0, param3, param2))) {
            ((oj) this).a(param0, (byte) 120, param3, param2);
            ((oj) this).a(param3, param2, param0, -50);
            StringBuilder discarded$22 = param3.append(" revert=").append(((oj) this).field_J);
            if ((((oj) this).field_A ^ -1) != -2147483648) {
                if (((oj) this).field_F != 2147483647) {
                    StringBuilder discarded$23 = param3.append(" to ").append(((oj) this).field_A).append(44).append(((oj) this).field_F);
                }
            }
        }
        if (param1 > -85) {
            return null;
        }
        return param3;
    }

    private oj(int param0, int param1, int param2, int param3, wo param4, bi param5, qm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((oj) this).field_A = 2147483647;
        ((oj) this).field_F = 2147483647;
        ((oj) this).field_w = param6;
        ((oj) this).field_J = param7 ? true : false;
        ((oj) this).field_I = param8 ? true : false;
    }

    final static void a(boolean param0, f[][] param1, int param2, int param3, double param4, int param5, double param6, int param7, byte param8, double param9) {
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        wm var29 = null;
        var28 = CrazyCrystals.field_B;
        var29 = jf.a(param7 - -param3, param5, 0, param5 + param2, param7);
        if (var29 != null) {
          var14 = (int)Math.ceil(param6);
          var15 = -param9 + (double)(param5 + param2 / 2);
          var17 = param6 + (double)(param3 / 2 + param7) - param4;
          var19 = (int)Math.floor(-0.01 + ((double)param5 - var15) / (2.0 * param6));
          var20 = (int)Math.floor(0.01 + (param6 * 2.0 + (-var15 + (double)(param5 - -param2))) / (param6 * 2.0));
          if (param8 == -32) {
            var21 = (int)Math.floor(-0.01 + (-var17 + (double)param7) / (param6 * 2.0));
            var22 = (int)Math.floor((3.0 * param6 + (-var17 + (double)(param3 + param7))) / (2.0 * param6) + 1.01);
            var23 = var21;
            L0: while (true) {
              if (var23 >= var22) {
                var29.a((byte) -6);
                return;
              } else {
                var24 = (int)Math.floor(param6 * 2.0 * (double)var23 + var17);
                var25 = (int)Math.floor(var15 + (double)var19 * (2.0 * param6)) & -2;
                var26 = var19;
                L1: while (true) {
                  if (var20 <= var26) {
                    var23++;
                    continue L0;
                  } else {
                    var27 = (int)Math.floor(var15 + (double)(1 + var26) * (param6 * 2.0)) & -2;
                    if (var25 < var27) {
                      L2: {
                        L3: {
                          if ((var23 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (param1.length <= var23) {
                              break L3;
                            } else {
                              if (var26 < 0) {
                                break L3;
                              } else {
                                if (param1[var23].length <= var26) {
                                  break L3;
                                } else {
                                  param1[var23][var26].a(var14, -117, var27 + -var25 >> -428880991, false, var24, var25);
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                        param1[0][0].a(var14, -35, -var25 + var27 >> -561081087, false, var24, var25);
                        break L2;
                      }
                      var25 = var27;
                      var26++;
                      continue L1;
                    } else {
                      var26++;
                      continue L1;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          L1: {
            L2: {
              var5 = -59 / ((param1 - -50) / 59);
              if (!(((oj) this).field_w instanceof pc)) {
                break L2;
              } else {
                if (!((pc) (Object) ((oj) this).field_w).field_x) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (-2 == (((oj) this).field_s ^ -1)) {
              L3: {
                var6 = qh.field_i + (-((oj) this).field_z + -param3);
                var7 = bm.field_h - ((oj) this).field_G - param2;
                if (var6 != ((oj) this).field_r) {
                  break L3;
                } else {
                  if (((oj) this).field_j == var7) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              ((oj) this).field_j = var7;
              ((oj) this).field_r = var6;
              if (!(((oj) this).field_l instanceof kc)) {
                break L0;
              } else {
                ((kc) (Object) ((oj) this).field_l).a((byte) -20, param2, (oj) this, param3);
                break L0;
              }
            } else {
              break L1;
            }
          }
          if (!((oj) this).field_J) {
            break L0;
          } else {
            L4: {
              if (((oj) this).field_A == ((oj) this).field_r) {
                break L4;
              } else {
                L5: {
                  var6 = -((oj) this).field_r + ((oj) this).field_A;
                  stackOut_7_0 = this;
                  stackOut_7_1 = ((oj) this).field_r;
                  stackIn_11_0 = stackOut_7_0;
                  stackIn_11_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (Math.abs(var6) < -3) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = var6 >> -1687848639;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L5;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = stackIn_8_1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (-1 >= var6) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = -1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_12_2 = stackOut_9_2;
                      break L5;
                    }
                  }
                }
                ((oj) this).field_r = stackIn_12_1 + stackIn_12_2;
                break L4;
              }
            }
            if (((oj) this).field_j == ((oj) this).field_F) {
              break L0;
            } else {
              var6 = ((oj) this).field_F - ((oj) this).field_j;
              stackOut_14_0 = this;
              stackOut_14_1 = ((oj) this).field_j;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (2 >= Math.abs(var6)) {
                L6: {
                  stackOut_16_0 = this;
                  stackOut_16_1 = stackIn_16_1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if ((var6 ^ -1) >= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = -1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L6;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L6;
                  }
                }
                ((oj) this).field_j = stackIn_19_1 + stackIn_19_2;
                break L0;
              } else {
                ((oj) this).field_j = stackIn_15_1 + (var6 >> -379201183);
                break L0;
              }
            }
          }
        }
        super.a(param0, -116, param2, param3);
    }

    final static bc a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            bc var5 = null;
            tk var5_ref = null;
            bc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            bc stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("hg");
                if (param1 == 6641) {
                  break L0;
                } else {
                  oj.f((byte) -17);
                  break L0;
                }
              }
              var5 = (bc) var4.newInstance();
              var5.a(param1 ^ 6529, param0, param2, param3);
              stackOut_2_0 = (bc) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void f(byte param0) {
        field_M = null;
        field_L = null;
        field_C = null;
        field_E = null;
        field_H = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
    }

    final void a(int param0) {
        if (param0 != -8346) {
            return;
        }
        super.a(param0 + 0);
        ((oj) this).field_w.a(((oj) this).field_f, 0, 0, ((oj) this).field_g, (byte) -52);
        ((oj) this).field_F = ((oj) this).field_j;
        ((oj) this).field_A = ((oj) this).field_r;
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        int var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (param3) {
            Object var9 = null;
            ((oj) this).a((qm) null, 27, 42, -63);
        }
        if (var8 != 0) {
            if (((oj) this).field_I) {
                return true;
            }
        }
        if (((oj) this).a(param1, param0, false, param4, param6)) {
            if (!((param5 ^ -1) != -2)) {
                ((oj) this).field_G = -param4 + (param1 + -((oj) this).field_j);
                ok.field_e = (oj) this;
                ((oj) this).field_z = -((oj) this).field_r + (param6 + -param0);
            }
            ((oj) this).field_s = param5;
            return true;
        }
        return var8 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "This ball has a subtle difference from the last one. Did you notice?";
        field_L = new ko[7];
        field_C = "Here be crystals.";
        field_y = 640;
    }
}
