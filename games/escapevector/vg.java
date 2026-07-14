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
        if (-1 <= (((vg) this).field_V ^ -1)) {
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
        if (param0 != -112) {
            return;
        }
        field_T = null;
        field_U = null;
    }

    final static int a(dk[] param0, byte param1) {
        int var2 = 0;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = EscapeVector.field_A;
          var2 = 2147483647;
          if (param1 == -122) {
            break L0;
          } else {
            var7 = null;
            String discarded$2 = vg.a((String) null, (String) null, (byte) -76, (String) null);
            break L0;
          }
        }
        var3 = param0;
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            if (2147483647 != var2) {
              return var2;
            } else {
              return 0;
            }
          } else {
            var5 = var3[var4];
            if (var5.field_l < var2) {
              var2 = var5.field_l;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
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
              if (var7 >= var4) {
                L2: {
                  cc.field_j.e(-90 + (param1 - -((vg) this).field_g), 10 + param0);
                  ee.a(5 + param1, -10 + ((vg) this).field_g, true, nn.field_a, 35 + param0);
                  ee.a(param1, ((vg) this).field_g, true, bn.field_d, param0 + ((vg) this).field_x - 22);
                  var5 = 169;
                  var4 = -79 + ((vg) this).field_x;
                  var6 = 127;
                  var7 = 0;
                  var8 = 57 + param0;
                  if (param2 > 80) {
                    break L2;
                  } else {
                    field_U = null;
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
                    em.e(-6 + (((vg) this).field_g + param1), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -(var7 * (var6 - var5) / var4);
                var9 = var9 | (var9 << 872176304 | var9 << 1070403848);
                em.e(param1, var8, 6, var9);
                em.e(-6 + ((vg) this).field_g + param1, var8, 6, var9);
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
                  var11 = ((vg) this).field_g;
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
                  if (-21 > var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (-21 < var13) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (-463 <= var14) {
                            if (-421 <= var14) {
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
        int var4 = 0;
        int var5 = 0;
        if (param0 != -13907) {
            field_U = null;
        }
        if (((vg) this).field_V <= 0) {
        } else {
            var2 = ((vg) this).field_M;
            var3 = ((vg) this).field_X;
            ((vg) this).field_Y = ((vg) this).field_Y + 1;
            if (((vg) this).field_Y + 1 >= ((vg) this).field_V) {
                ((vg) this).field_V = 0;
                ((vg) this).m(-105);
            } else {
                var4 = ((vg) this).field_Y * (-((vg) this).field_Y + 2 * ((vg) this).field_V);
                var5 = ((vg) this).field_V * ((vg) this).field_V;
                var2 = ((vg) this).field_S - -((((vg) this).field_M - ((vg) this).field_S) * var4 / var5);
                var3 = ((vg) this).field_W + var4 * (-((vg) this).field_W + ((vg) this).field_X) / var5;
            }
            ((vg) this).b(param0 ^ -13998, var3, var2);
        }
        return super.j(-13907);
    }

    vg(tb param0, int param1, int param2) {
        super(param0, param1, param2);
        ((vg) this).field_Y = 0;
        ((vg) this).field_V = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if ((param1 ^ -1) >= -1) {
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
        int var2 = -126 % ((7 - param0) / 55);
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
