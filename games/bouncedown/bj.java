/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends ak {
    private boolean field_D;
    private int field_H;
    private int field_C;
    static ng field_E;
    private int field_G;
    private boolean field_F;
    private int field_B;

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        if (((bj) this).a(param2, param3, (byte) 14, param0)) {
            ((bj) this).a(param0, param3, param2, 32362);
            ((bj) this).a(param2, (byte) 12, param0, param3);
            StringBuilder discarded$22 = param3.append(" revert=").append(((bj) this).field_F);
            if (((bj) this).field_G != 2147483647) {
                if (-2147483648 != (((bj) this).field_C ^ -1)) {
                    StringBuilder discarded$23 = param3.append(" to ").append(((bj) this).field_G).append(44).append(((bj) this).field_C);
                }
            }
        }
        if (!param1) {
            return null;
        }
        return param3;
    }

    public static void k(int param0) {
        field_E = null;
        if (param0 > -107) {
            field_E = null;
        }
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, (int) (char)param4, param5);
        ((bj) this).field_u = 0;
    }

    final static void a(wi param0, byte param1, int param2, si param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            hh var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = Bounce.field_N;
              var18 = new hh();
              var18.field_j = param0.d((byte) -109);
              var18.field_g = param0.j(-3);
              var18.field_n = new mk[var18.field_j];
              var18.field_o = new int[var18.field_j];
              var18.field_i = new int[var18.field_j];
              var18.field_l = new int[var18.field_j];
              var18.field_m = new byte[var18.field_j][][];
              var18.field_s = new mk[var18.field_j];
              if (param1 < -123) {
                break L0;
              } else {
                bj.k(26);
                break L0;
              }
            }
            var5 = 0;
            L1: while (true) {
              if ((var18.field_j ^ -1) >= (var5 ^ -1)) {
                ob.field_c.a(1, (ai) (Object) var18);
                return;
              } else {
                try {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          var6_int = param0.d((byte) -77);
                          if (var6_int == 0) {
                            break L5;
                          } else {
                            if ((var6_int ^ -1) == -2) {
                              break L5;
                            } else {
                              if (2 == var6_int) {
                                break L5;
                              } else {
                                L6: {
                                  if ((var6_int ^ -1) == -4) {
                                    break L6;
                                  } else {
                                    if (-5 != (var6_int ^ -1)) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var20 = param0.b(true);
                                var8 = param0.b(true);
                                var9 = param0.d((byte) -82);
                                var10 = new String[var9];
                                var11_int = 0;
                                L7: while (true) {
                                  if ((var9 ^ -1) >= (var11_int ^ -1)) {
                                    L8: {
                                      var23 = new byte[var9][];
                                      var22 = var23;
                                      var21 = var22;
                                      var19 = var21;
                                      var11 = var19;
                                      if ((var6_int ^ -1) != -4) {
                                        break L8;
                                      } else {
                                        var12_int = 0;
                                        L9: while (true) {
                                          if ((var9 ^ -1) >= (var12_int ^ -1)) {
                                            break L8;
                                          } else {
                                            var13 = param0.j(-3);
                                            var11[var12_int] = new byte[var13];
                                            param0.a((byte) 124, var13, var23[var12_int], 0);
                                            var12_int++;
                                            continue L9;
                                          }
                                        }
                                      }
                                    }
                                    var18.field_o[var5] = var6_int;
                                    var12 = new Class[var9];
                                    var17 = 0;
                                    var13 = var17;
                                    L10: while (true) {
                                      if ((var17 ^ -1) <= (var9 ^ -1)) {
                                        var18.field_s[var5] = param3.a(var8, pf.a(var20, -1), 8532, var12);
                                        var18.field_m[var5] = var23;
                                        break L3;
                                      } else {
                                        var12[var17] = pf.a(var10[var17], -1);
                                        var17++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = param0.b(true);
                                    var11_int++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L11: {
                          var16 = param0.b(true);
                          String dupTemp$1 = param0.b(true);
                          var15 = dupTemp$1;
                          var8 = dupTemp$1;
                          var9 = 0;
                          if (var6_int == 1) {
                            var9 = param0.j(-3);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var18.field_o[var5] = var6_int;
                        var18.field_l[var5] = var9;
                        var18.field_n[var5] = param3.a(var15, pf.a(var16, -1), (byte) 48);
                        break L4;
                      }
                      break L3;
                    }
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    var18.field_i[var5] = -1;
                    break L12;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L15: {
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_i[var5] = -4;
                    break L15;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var6_ref4 = decompiledCaughtException;
                    var18.field_i[var5] = -5;
                    break L16;
                  }
                }
                var5++;
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        int var5 = 0;
        int var6 = 0;
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
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
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
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((bj) this).field_x instanceof wd)) {
                    break L3;
                  } else {
                    if (!((wd) (Object) ((bj) this).field_x).field_y) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((((bj) this).field_u ^ -1) != -2) {
                  break L2;
                } else {
                  L4: {
                    var5 = -param1 + (-((bj) this).field_B + uc.field_C);
                    var6 = ll.field_y + -((bj) this).field_H - param2;
                    if ((((bj) this).field_r ^ -1) != (var5 ^ -1)) {
                      break L4;
                    } else {
                      if ((var6 ^ -1) != (((bj) this).field_i ^ -1)) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((bj) this).field_r = var5;
                  ((bj) this).field_i = var6;
                  if (!(((bj) this).field_n instanceof ni)) {
                    break L1;
                  } else {
                    ((ni) (Object) ((bj) this).field_n).a(param2, (byte) -98, param1, (bj) this);
                    break L1;
                  }
                }
              }
              if (((bj) this).field_F) {
                L5: {
                  if ((((bj) this).field_r ^ -1) == (((bj) this).field_G ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      var5 = -((bj) this).field_r + ((bj) this).field_G;
                      stackOut_14_0 = this;
                      stackOut_14_1 = ((bj) this).field_r;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if ((var5 ^ -1) < -1) {
                          stackOut_18_0 = this;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          break L6;
                        } else {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = -1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          break L6;
                        }
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = var5 >> 906782145;
                        stackIn_19_0 = stackOut_15_0;
                        stackIn_19_1 = stackOut_15_1;
                        stackIn_19_2 = stackOut_15_2;
                        break L6;
                      }
                    }
                    ((bj) this).field_r = stackIn_19_1 + stackIn_19_2;
                    break L5;
                  }
                }
                if ((((bj) this).field_C ^ -1) != (((bj) this).field_i ^ -1)) {
                  L7: {
                    var5 = ((bj) this).field_C - ((bj) this).field_i;
                    stackOut_22_0 = this;
                    stackOut_22_1 = ((bj) this).field_i;
                    stackIn_26_0 = stackOut_22_0;
                    stackIn_26_1 = stackOut_22_1;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = var5 >> 637263329;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      break L7;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 1;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        break L7;
                      }
                    }
                  }
                  ((bj) this).field_i = stackIn_27_1 + stackIn_27_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                super.a(param0 ^ 0, param1, param2, param3);
                break L0;
              }
            }
            super.a(param0 ^ 0, param1, param2, param3);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        super.i(-41);
        ((bj) this).field_x.b(((bj) this).field_m, 80, ((bj) this).field_k, 0, 0);
        ((bj) this).field_G = ((bj) this).field_r;
        ((bj) this).field_C = ((bj) this).field_i;
        if (param0 >= -21) {
            bj.a((byte) 10, 120);
        }
    }

    final static String j(int param0) {
        if (param0 != 44) {
            bj.k(19);
        }
        if (!(null != ja.field_b)) {
            return "";
        }
        return ja.field_b;
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        Bounce.a(va.field_b, q.field_M, 22668, 0, w.field_d, param1, true);
        if (param0 != -125) {
            field_E = null;
        }
        for (var2 = 0; (var2 ^ -1) > (q.field_M ^ -1); var2++) {
            w.field_f[var2 + param1] = var2;
        }
        Bounce.a(mg.field_n, q.field_M + param1, 22668, param1, uc.field_A, param1 + param1, false);
        if (param1 < q.field_M) {
            q.field_M = param1;
        }
    }

    private bj(int param0, int param1, int param2, int param3, fc param4, sk param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((bj) this).field_C = 2147483647;
        ((bj) this).field_G = 2147483647;
        ((bj) this).field_D = param8 ? true : false;
        ((bj) this).field_F = param7 ? true : false;
        ((bj) this).field_x = param6;
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
            if (((bj) this).field_D) {
                return true;
            }
        }
        if (((bj) this).c(param3, param4 ^ 28455, param6, param2, param5)) {
            ((bj) this).field_u = param0;
            if ((param0 ^ -1) != -2) {
                return true;
            }
            ((bj) this).field_H = -param6 + (-((bj) this).field_i + param5);
            nd.field_A = (bj) this;
            ((bj) this).field_B = -param2 + (param3 + -((bj) this).field_r);
            return true;
        }
        return var8 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = null;
    }
}
