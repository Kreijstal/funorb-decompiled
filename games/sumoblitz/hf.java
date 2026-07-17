/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends rg {
    private int field_I;
    private int field_J;
    private int field_M;
    private int field_G;
    static String[] field_F;
    static hr[] field_H;
    static String[] field_L;
    private int field_N;
    private int field_K;

    boolean h(int param0) {
        ((hf) this).f((byte) -128);
        if (param0 != 0) {
            Object var3 = null;
            java.awt.Frame discarded$0 = hf.a(true, (wi) null, -72, -89, 23, -11);
        }
        return super.h(0);
    }

    final static hr a(ha param0, ri param1, byte param2) {
        RuntimeException var3 = null;
        hr stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hr stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = param0.a(param1, false);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("hf.FA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -11 + 41);
        }
        return stackIn_1_0;
    }

    public static void j(int param0) {
        field_H = null;
        field_F = null;
        field_L = null;
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > 110) {
          lk.a(6 + param1, 35 + param2, ((hf) this).field_q + -12, -40 + ((hf) this).field_p, 2105376, 0);
          var4 = 35;
          var5 = 211;
          var6 = 194;
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var7 >= var4) {
              var6 = 169;
              var5 = 194;
              var4 = 22;
              var7 = 0;
              var8 = 35 + param2;
              L1: while (true) {
                if (var4 <= var7) {
                  ar.field_E.a(param1 + (((hf) this).field_q + -90), 10 + param2);
                  ud.a(35 + param2, ((hf) this).field_q + -10, 2, param1 + 5, li.field_v);
                  ud.a(-22 + ((hf) this).field_p + param2, ((hf) this).field_q, 2, param1, hd.field_O);
                  var6 = 127;
                  var5 = 169;
                  var4 = ((hf) this).field_p + -79;
                  var7 = 0;
                  var8 = param2 - -57;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var7 * (-var5 + var6) / var4 + var5;
                      var9 = var9 | (var9 << 16 | var9 << 8);
                      lk.f(param1, var8, 6, var9);
                      lk.f(-6 + (((hf) this).field_q + param1), var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var5 + (-var5 + var6) * var7 / var4;
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  lk.f(param1, var8, 6, var9);
                  lk.f(param1 + ((hf) this).field_q - 6, var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= lk.field_i) {
                if (lk.field_e > var8) {
                  L3: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = ((hf) this).field_q;
                    if (var7 > 20) {
                      break L3;
                    } else {
                      L4: while (true) {
                        if (var10 > 20) {
                          break L3;
                        } else {
                          var12 = (20 - var7) * (-var7 + 20) - -((20 + -var10) * (-var10 + 20));
                          if (var12 <= 462) {
                            if (var12 < 420) {
                              break L3;
                            } else {
                              var13 = var9 * (-var12 + 462) / 42;
                              var13 = var13 | (var13 << 16 | var13 << 8);
                              lk.field_a[param1 + (var8 * lk.field_b - -var10)] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (var7 <= 20) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (var13 > 20) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                            if (var14 > 462) {
                              break L7;
                            } else {
                              if (var14 < 420) {
                                var12 = 1 + var11;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var15 = var9 * (462 + -var14) / 42;
                                var15 = var15 | (var15 << 8 | var15 << 16);
                                lk.field_a[param1 + var8 * lk.field_b - -var11] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var9 = var9 | (var9 << 8 | var9 << 16);
                  lk.f(var10 + param1, var8, -var10 + var11, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void i(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((hf) this).g(122);
        }
    }

    final static java.awt.Frame a(boolean param0, wi param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        cd[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        cd[] var10 = null;
        jr var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) 125)) {
              L1: {
                if (param3 == 0) {
                  var10 = ul.a((byte) -73, param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (param5 != var10[var8].field_a) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(false, param2, param3, param5, param4);
              L4: while (true) {
                if (0 != var11.field_c) {
                  var7 = (java.awt.Frame) var11.field_d;
                  if (var7 != null) {
                    L5: {
                      if (param0) {
                        break L5;
                      } else {
                        field_H = null;
                        break L5;
                      }
                    }
                    if (var11.field_c == 2) {
                      wj.a(var7, param1, false);
                      stackOut_27_0 = null;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (java.awt.Frame) (Object) stackIn_22_0;
                  }
                } else {
                  tg.a(10L, (byte) 118);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("hf.IA(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_28_0;
    }

    hf(dg param0, int param1, int param2) {
        super(param0, param1, param2);
        ((hf) this).field_G = 0;
        ((hf) this).field_K = 0;
    }

    boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -28778) {
            ((hf) this).field_N = 52;
        }
        if (0 >= ((hf) this).field_K) {
        } else {
            var2 = ((hf) this).field_J;
            var3 = ((hf) this).field_I;
            int fieldTemp$0 = ((hf) this).field_G + 1;
            ((hf) this).field_G = ((hf) this).field_G + 1;
            if (fieldTemp$0 >= ((hf) this).field_K) {
                ((hf) this).field_K = 0;
                ((hf) this).i(0);
            } else {
                var4 = ((hf) this).field_G * (2 * ((hf) this).field_K + -((hf) this).field_G);
                var5 = ((hf) this).field_K * ((hf) this).field_K;
                var2 = ((hf) this).field_M - -(var4 * (-((hf) this).field_M + ((hf) this).field_J) / var5);
                var3 = ((hf) this).field_N + var4 * (((hf) this).field_I - ((hf) this).field_N) / var5;
            }
            ((hf) this).c(var2, var3, 109);
        }
        return super.g(-28778);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param2 <= 0) {
            ((hf) this).c(param3, param1, 103);
            return;
        }
        ((hf) this).field_M = ((hf) this).field_q;
        ((hf) this).field_K = param2;
        ((hf) this).field_I = param1;
        ((hf) this).field_J = param3;
        ((hf) this).field_G = 0;
        ((hf) this).field_N = ((hf) this).field_p;
        if (param0) {
            ((hf) this).a(false, -70, -124, -36);
        }
    }

    void f(byte param0) {
        if (!(((hf) this).field_K > 0)) {
            return;
        }
        ((hf) this).c(((hf) this).field_J, ((hf) this).field_I, 45);
        if (param0 != -128) {
            ((hf) this).field_K = 65;
        }
        ((hf) this).field_K = 0;
        ((hf) this).i(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new String[]{"Access the new turrets!", "Challenging levels!", "Diabolical bosses!"};
    }
}
