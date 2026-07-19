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
        if (-1 <= (this.field_V ^ -1)) {
            return;
        }
        this.b(255, this.field_X, this.field_M);
        this.field_V = 0;
        if (param0) {
            field_T = (String) null;
        }
        this.m(100);
    }

    final static Boolean l(int param0) {
        Boolean discarded$0 = null;
        if (param0 != -9878) {
            discarded$0 = vg.l(-90);
        }
        Boolean var1 = sc.field_g;
        sc.field_g = null;
        return var1;
    }

    void m(int param0) {
        int var2 = 15 / ((param0 - 45) / 53);
    }

    public static void i(byte param0) {
        if (param0 != -112) {
            return;
        }
        field_T = null;
        field_U = null;
    }

    final static int a(dk[] param0, byte param1) {
        String discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        String var7 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var2_int = 2147483647;
              if (param1 == -122) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$2 = vg.a((String) null, (String) null, (byte) -76, (String) null);
                break L1;
              }
            }
            var3 = param0;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                if (2147483647 != var2_int) {
                  stackOut_12_0 = var2_int;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5.field_l < var2_int) {
                    var2_int = var5.field_l;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("vg.OB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
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
        em.c(param1 - -6, param0 + 35, -12 + this.field_g, -40 + this.field_x, 2105376, 0);
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
              if (var7 >= var4) {
                L2: {
                  cc.field_j.e(-90 + (param1 - -this.field_g), 10 + param0);
                  ee.a(5 + param1, -10 + this.field_g, true, nn.field_a, 35 + param0);
                  ee.a(param1, this.field_g, true, bn.field_d, param0 + this.field_x - 22);
                  var5 = 169;
                  var4 = -79 + this.field_x;
                  var6 = 127;
                  var7 = 0;
                  var8 = 57 + param0;
                  if (param2 > 80) {
                    break L2;
                  } else {
                    field_U = (k) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << -1370855472 | var9 << 1016047304);
                    em.e(param1, var8, 6, var9);
                    em.e(-6 + (this.field_g + param1), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -(var7 * (var6 - var5) / var4);
                var9 = var9 | (var9 << 872176304 | var9 << 1070403848);
                em.e(param1, var8, 6, var9);
                em.e(-6 + this.field_g + param1, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (em.field_k <= var8) {
              if (var8 < em.field_j) {
                L4: {
                  var9 = var7 * (var6 + -var5) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_g;
                  if (20 >= var7) {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                        if (462 >= var12) {
                          if (var12 >= 420) {
                            var13 = var9 * (462 + -var12) / 42;
                            var13 = var13 | (var13 << 896559208 | var13 << 1797436624);
                            em.field_i[em.field_l * var8 - (-param1 - var10)] = var13;
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
                  if (-21 > (var7 ^ -1)) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (-21 > (var13 ^ -1)) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (-463 <= (var14 ^ -1)) {
                            if (-421 >= (var14 ^ -1)) {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << -1198907928 | var15 << 680747888);
                              em.field_i[em.field_l * var8 + param1 + var11] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -1438859568 | var9 << -768663576);
                em.e(param1 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -13907) {
            field_U = (k) null;
        }
        if (this.field_V <= 0) {
        } else {
            var2 = this.field_M;
            var3 = this.field_X;
            fieldTemp$0 = this.field_Y + 1;
            this.field_Y = this.field_Y + 1;
            if (fieldTemp$0 >= this.field_V) {
                this.field_V = 0;
                this.m(-105);
            } else {
                var4 = this.field_Y * (-this.field_Y + 2 * this.field_V);
                var5 = this.field_V * this.field_V;
                var2 = this.field_S - -((this.field_M - this.field_S) * var4 / var5);
                var3 = this.field_W + var4 * (-this.field_W + this.field_X) / var5;
            }
            this.b(param0 ^ -13998, var3, var2);
        }
        return super.j(-13907);
    }

    vg(tb param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Y = 0;
        this.field_V = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if ((param1 ^ -1) >= -1) {
            this.b(255, param3, param2);
            return;
        }
        this.field_Y = 0;
        this.field_S = this.field_g;
        this.field_X = param3;
        this.field_V = param1;
        this.field_M = param2;
        if (param0) {
            this.field_V = 115;
        }
        this.field_W = this.field_x;
    }

    boolean a(byte param0) {
        this.b(false);
        int var2 = -126 % ((7 - param0) / 55);
        return super.a((byte) -61);
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var5 = EscapeVector.field_A;
        if (param2 != 111) {
            field_T = (String) null;
        }
        int var4 = param0.indexOf(param1);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 - -param1.length());
            var4 = param0.indexOf(param1, var4 - -param3.length());
        }
        return param0;
    }

    static {
        field_T = "Orb coins: ";
    }
}
