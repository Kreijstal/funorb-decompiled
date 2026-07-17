/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vg extends bb {
    static k field_U;
    static String field_T;
    private int field_X;
    private int field_Y;
    private int field_W;
    private int field_V;
    private int field_M;
    private int field_S;

    void b(boolean param0) {
        if (((vg) this).field_V <= 0) {
            return;
        }
        ((vg) this).b(255, ((vg) this).field_X, ((vg) this).field_M);
        ((vg) this).field_V = 0;
        if (param0) {
            field_T = null;
        }
        ((vg) this).m(100);
    }

    final static Boolean l(int param0) {
        if (param0 != -9878) {
            Boolean discarded$0 = vg.l(-90);
        }
        Boolean var1 = sc.field_g;
        sc.field_g = null;
        return var1;
    }

    void m(int param0) {
        int var2 = 15 / ((param0 - 45) / 53);
    }

    public static void i(byte param0) {
        field_T = null;
        field_U = null;
    }

    final static int a(dk[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = 2147483647;
            var3 = param0;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                if (2147483647 != var2_int) {
                  stackOut_10_0 = var2_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                L2: {
                  var5 = var3[var4];
                  if (var5.field_l < var2_int) {
                    var2_int = var5.field_l;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("vg.OB(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -122 + 41);
        }
        return stackIn_11_0;
    }

    void b(int param0, int param1, byte param2) {
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
        var16 = EscapeVector.field_A;
        em.c(param1 - -6, param0 + 35, -12 + ((vg) this).field_g, -40 + ((vg) this).field_x, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var7 >= var4) {
            var6 = 169;
            var5 = 194;
            var4 = 22;
            var7 = 0;
            var8 = param0 + 35;
            L1: while (true) {
              if (~var7 <= ~var4) {
                cc.field_j.e(-90 + (param1 - -((vg) this).field_g), 10 + param0);
                ee.a(5 + param1, -10 + ((vg) this).field_g, true, nn.field_a, 35 + param0);
                ee.a(param1, ((vg) this).field_g, true, bn.field_d, param0 + ((vg) this).field_x - 22);
                var5 = 169;
                var4 = -79 + ((vg) this).field_x;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param0;
                L2: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    em.e(param1, var8, 6, var9);
                    em.e(-6 + (((vg) this).field_g + param1), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var5 - -(var7 * (var6 - var5) / var4);
                var9 = var9 | (var9 << 16 | var9 << 8);
                em.e(param1, var8, 6, var9);
                em.e(-6 + ((vg) this).field_g + param1, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            L3: {
              if (~em.field_k < ~var8) {
                break L3;
              } else {
                if (var8 < em.field_j) {
                  L4: {
                    var9 = var7 * (var6 + -var5) / var4 + var5;
                    var10 = 0;
                    var11 = ((vg) this).field_g;
                    if (20 >= var7) {
                      L5: while (true) {
                        if (var10 > 20) {
                          break L4;
                        } else {
                          L6: {
                            var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                            if (462 < var12) {
                              break L6;
                            } else {
                              if (var12 >= 420) {
                                var13 = var9 * (462 + -var12) / 42;
                                var13 = var13 | (var13 << 8 | var13 << 16);
                                em.field_i[em.field_l * var8 - (-param1 - var10)] = var13;
                                break L6;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var10++;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if (var7 > 20) {
                      break L7;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L8: while (true) {
                        L9: {
                          if (var13 > 20) {
                            break L9;
                          } else {
                            var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                            if (var14 <= 462) {
                              L10: {
                                if (var14 >= 420) {
                                  var15 = var9 * (-var14 + 462) / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  em.field_i[em.field_l * var8 + param1 + var11] = var15;
                                  break L10;
                                } else {
                                  var12 = var11 - -1;
                                  break L10;
                                }
                              }
                              var11++;
                              var13++;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var11 = var12;
                        break L7;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  em.e(param1 + var10, var8, -var10 + var11, var9);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            var7++;
            var8++;
            continue L0;
          }
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((vg) this).field_V <= 0) {
        } else {
            var2 = ((vg) this).field_M;
            var3 = ((vg) this).field_X;
            int fieldTemp$0 = ((vg) this).field_Y + 1;
            ((vg) this).field_Y = ((vg) this).field_Y + 1;
            if (fieldTemp$0 >= ((vg) this).field_V) {
                ((vg) this).field_V = 0;
                ((vg) this).m(-105);
            } else {
                var4 = ((vg) this).field_Y * (-((vg) this).field_Y + 2 * ((vg) this).field_V);
                var5 = ((vg) this).field_V * ((vg) this).field_V;
                var2 = ((vg) this).field_S - -((((vg) this).field_M - ((vg) this).field_S) * var4 / var5);
                var3 = ((vg) this).field_W + var4 * (-((vg) this).field_W + ((vg) this).field_X) / var5;
            }
            ((vg) this).b(255, var3, var2);
        }
        return super.j(-13907);
    }

    vg(tb param0, int param1, int param2) {
        super(param0, param1, param2);
        ((vg) this).field_Y = 0;
        ((vg) this).field_V = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
            ((vg) this).b(255, param3, param2);
            return;
        }
        ((vg) this).field_Y = 0;
        ((vg) this).field_S = ((vg) this).field_g;
        ((vg) this).field_X = param3;
        ((vg) this).field_V = param1;
        ((vg) this).field_M = param2;
        if (param0) {
            ((vg) this).field_V = 115;
        }
        ((vg) this).field_W = ((vg) this).field_x;
    }

    boolean a(byte param0) {
        ((vg) this).b(false);
        int var2 = 0;
        return super.a((byte) -61);
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var5 = EscapeVector.field_A;
        if (param2 != 111) {
            field_T = null;
        }
        int var4 = param0.indexOf(param1);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 - -param1.length());
            var4 = param0.indexOf(param1, var4 - -param3.length());
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Orb coins: ";
    }
}
