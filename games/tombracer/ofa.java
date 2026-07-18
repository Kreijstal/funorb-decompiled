/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ofa extends gn {
    private int field_H;
    private int field_G;
    static boolean field_I;
    private int field_J;
    private int field_K;
    private int field_F;
    private int field_E;
    static String field_D;

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
            ((ofa) this).c(-11560, param2, param1);
            return;
        }
        ((ofa) this).field_E = param2;
        ((ofa) this).field_K = param1;
        ((ofa) this).field_F = param0;
        ((ofa) this).field_H = ((ofa) this).field_p;
        ((ofa) this).field_J = ((ofa) this).field_m;
        ((ofa) this).field_G = 0;
        if (param3 > -80) {
            ofa.e(-57);
        }
    }

    ofa(jta param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ofa) this).field_G = 0;
        ((ofa) this).field_F = 0;
    }

    boolean a(byte param0) {
        ((ofa) this).c(true);
        return super.a((byte) -92);
    }

    void a(int param0, byte param1, int param2) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        bea.b(6 + param2, 35 + param0, ((ofa) this).field_m + -12, ((ofa) this).field_p - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var4 <= var7) {
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = param0 + 35;
            L1: while (true) {
              if (var4 <= var7) {
                if (param1 == -67) {
                  bg.field_s.b(-90 + param2 + ((ofa) this).field_m, 10 + param0);
                  ag.a(35 + param0, uca.field_f, -59, param2 + 5, -10 + ((ofa) this).field_m);
                  ag.a(param0 + (((ofa) this).field_p - 22), fua.field_f, param1 + -29, param2, ((ofa) this).field_m);
                  var6 = 127;
                  var5 = 169;
                  var4 = ((ofa) this).field_p - 79;
                  var7 = 0;
                  var8 = 57 + param0;
                  L2: while (true) {
                    if (var4 <= var7) {
                      return;
                    } else {
                      var9 = var7 * (var6 + -var5) / var4 + var5;
                      var9 = var9 | (var9 << 8 | var9 << 16);
                      bea.c(param2, var8, 6, var9);
                      bea.c(param2 + ((ofa) this).field_m + -6, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                bea.c(param2, var8, 6, var9);
                bea.c(param2 - -((ofa) this).field_m + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= bea.field_h) {
              if (var8 < bea.field_k) {
                L3: {
                  var9 = (var6 + -var5) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((ofa) this).field_m;
                  if (var7 <= 20) {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (-var10 + 20) * (-var10 + 20) + (20 - var7) * (20 - var7);
                        if (var12 <= 462) {
                          if (var12 < 420) {
                            break L3;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            bea.field_l[var10 + param2 + bea.field_g * var8] = var13;
                            var10++;
                            continue L4;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (20 < var13) {
                          break L7;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 - var7);
                          if (462 >= var14) {
                            if (var14 < 420) {
                              var12 = 1 + var11;
                              var13++;
                              var11++;
                              continue L6;
                            } else {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              bea.field_l[param2 + (var8 * bea.field_g + var11)] = var15;
                              var13++;
                              var11++;
                              continue L6;
                            }
                          } else {
                            break L7;
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
                bea.c(var10 + param2, var8, -var10 + var11, var9);
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

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((ofa) this).field_F) {
        } else {
            var2 = ((ofa) this).field_K;
            var3 = ((ofa) this).field_E;
            int fieldTemp$0 = ((ofa) this).field_G + 1;
            ((ofa) this).field_G = ((ofa) this).field_G + 1;
            if (((ofa) this).field_F <= fieldTemp$0) {
                ((ofa) this).field_F = 0;
                ((ofa) this).d(-69);
            } else {
                var4 = (-((ofa) this).field_G + 2 * ((ofa) this).field_F) * ((ofa) this).field_G;
                var5 = ((ofa) this).field_F * ((ofa) this).field_F;
                var3 = ((ofa) this).field_H - -((((ofa) this).field_E + -((ofa) this).field_H) * var4 / var5);
                var2 = ((ofa) this).field_J + (-((ofa) this).field_J + ((ofa) this).field_K) * var4 / var5;
            }
            ((ofa) this).c(-11560, var3, var2);
        }
        return super.a(127);
    }

    final static void a(int[] param0, long[] param1, int param2) {
        try {
            if (param2 < 31) {
                Object var4 = null;
                ofa.a((int[]) null, (long[]) null, -57);
            }
            hk.a(-1 + param1.length, param1, 0, param0, -2646);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ofa.QA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        return (param0 & 384) != 0;
    }

    void c(boolean param0) {
        if (!param0) {
            ((ofa) this).field_G = -30;
        }
        if (!(((ofa) this).field_F > 0)) {
            return;
        }
        ((ofa) this).c(-11560, ((ofa) this).field_E, ((ofa) this).field_K);
        ((ofa) this).field_F = 0;
        ((ofa) this).d(-90);
    }

    void d(int param0) {
        if (param0 >= -20) {
            field_D = null;
        }
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != 0) {
            field_D = null;
        }
    }

    final static boolean d(boolean param0) {
        return cl.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = false;
        field_D = null;
    }
}
