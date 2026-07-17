/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends ab {
    private int field_L;
    private int field_J;
    private int field_N;
    static int field_O;
    static String field_I;
    private int field_G;
    private int field_H;
    static dl field_M;
    static String field_F;
    private int field_P;
    static dl[] field_K;

    boolean e(byte param0) {
        ((en) this).j(-1);
        return super.e((byte) 79);
    }

    void j(int param0) {
        if (!(param0 > ~((en) this).field_P)) {
            return;
        }
        ((en) this).a(((en) this).field_G, (byte) -50, ((en) this).field_H);
        ((en) this).field_P = 0;
        ((en) this).k(42);
    }

    void k(int param0) {
        if (param0 != 42) {
            field_K = null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param0 <= 0) {
            ((en) this).a(param1, (byte) 127, param3);
            return;
        }
        ((en) this).field_L = ((en) this).field_g;
        ((en) this).field_N = ((en) this).field_f;
        ((en) this).field_G = param1;
        ((en) this).field_P = param0;
        ((en) this).field_H = param3;
        ((en) this).field_J = 0;
        if (param2 != -93) {
            field_M = null;
        }
    }

    final static si a(String[] args, int param1) {
        si var2 = null;
        RuntimeException var2_ref = null;
        si stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        si stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2 = new si(false);
            var2.field_d = args;
            stackOut_2_0 = (si) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("en.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 169 + 41);
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_K = null;
        field_F = null;
        field_M = null;
        field_I = null;
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
        var16 = CrazyCrystals.field_B;
        kh.a(6 + param1, param2 + 35, -12 + ((en) this).field_g, -40 + ((en) this).field_f, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param2;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  p.field_f.a(((en) this).field_g + (param1 + -90), 10 + param2);
                  fb.a(param0 + -29, gk.field_d, -10 + ((en) this).field_g, 5 + param1, param2 - -35);
                  fb.a(param0 ^ 31, lm.field_g, ((en) this).field_g, param1, ((en) this).field_f + param2 + -22);
                  var4 = ((en) this).field_f - 79;
                  var6 = 127;
                  var5 = 169;
                  if (param0 == 30) {
                    break L2;
                  } else {
                    ((en) this).field_H = -93;
                    break L2;
                  }
                }
                var7 = 0;
                var8 = 57 + param2;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + (-var5 + var6) * var7 / var4;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    kh.f(param1, var8, 6, var9);
                    kh.f(((en) this).field_g + (param1 - 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = (var6 + -var5) * var7 / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                kh.f(param1, var8, 6, var9);
                kh.f(-6 + ((en) this).field_g + param1, var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (kh.field_b <= var8) {
              if (kh.field_j > var8) {
                L4: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((en) this).field_g;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (20 + -var10) + (20 + -var7) * (20 - var7);
                        if (462 >= var12) {
                          if (var12 >= 420) {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            kh.field_i[var8 * kh.field_l + (param1 - -var10)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = var9 * (462 - var14) / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              kh.field_i[var11 + (param1 + var8 * kh.field_l)] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                kh.f(var10 + param1, var8, -var10 + var11, var9);
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
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 8) {
            ((en) this).j(-111);
        }
        if (0 >= ((en) this).field_P) {
        } else {
            var2 = ((en) this).field_H;
            var3 = ((en) this).field_G;
            int fieldTemp$0 = ((en) this).field_J + 1;
            ((en) this).field_J = ((en) this).field_J + 1;
            if (fieldTemp$0 >= ((en) this).field_P) {
                ((en) this).field_P = 0;
                ((en) this).k(param0 ^ 34);
            } else {
                var4 = (((en) this).field_P * 2 + -((en) this).field_J) * ((en) this).field_J;
                var5 = ((en) this).field_P * ((en) this).field_P;
                var2 = var4 * (-((en) this).field_L + ((en) this).field_H) / var5 + ((en) this).field_L;
                var3 = (-((en) this).field_N + ((en) this).field_G) * var4 / var5 + ((en) this).field_N;
            }
            ((en) this).a(var3, (byte) 24, var2);
        }
        return super.g((byte) 8);
    }

    en(ol param0, int param1, int param2) {
        super(param0, param1, param2);
        ((en) this).field_P = 0;
        ((en) this).field_J = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Don't worry, he has a lot more fun in the two-player levels!";
        field_I = "Pause Menu";
    }
}
