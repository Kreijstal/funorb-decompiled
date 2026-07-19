/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iw extends bl {
    static String[] field_F;
    private int field_H;
    private int field_I;
    private int field_B;
    private int field_C;
    private int field_E;
    static String field_D;
    private int field_G;

    void d(int param0) {
        if (param0 != 15435) {
            iw.k((byte) -22);
        }
    }

    void b(int param0, int param1, int param2) {
        boolean discarded$1 = false;
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
        var16 = VoidHunters.field_G;
        dma.c(6 + param2, param0 - -35, this.field_h + -12, -40 + this.field_f, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var7 >= var4) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param0 + 35;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  wf.field_a.a(-90 + this.field_h + param2, 10 + param0);
                  eg.a(param1 ^ 1630174240, 35 + param0, vsa.field_p, 5 + param2, this.field_h - 10);
                  if (param1 == 1630174241) {
                    break L2;
                  } else {
                    discarded$1 = this.a(59);
                    break L2;
                  }
                }
                eg.a(1, this.field_f + param0 - 22, oqa.field_q, param2, this.field_h);
                var5 = 169;
                var6 = 127;
                var4 = -79 + this.field_f;
                var7 = 0;
                var8 = param0 + 57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << -1461741040 | var9 << -231343000);
                    dma.h(param2, var8, 6, var9);
                    dma.h(-6 + this.field_h + param2, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -((var6 - var5) * var7 / var4);
                var9 = var9 | (var9 << -1514548400 | var9 << 2111197064);
                dma.h(param2, var8, 6, var9);
                dma.h(-6 + (param2 + this.field_h), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (dma.field_c <= var8) {
              if (var8 < dma.field_f) {
                L4: {
                  var9 = var5 - -((-var5 + var6) * var7 / var4);
                  var10 = 0;
                  var11 = this.field_h;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (20 - var10) * (-var10 + 20) + (20 + -var7) * (20 - var7);
                        if (-463 <= (var12 ^ -1)) {
                          if ((var12 ^ -1) <= -421) {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << 695816144 | var13 << 866407368);
                            dma.field_i[var10 + (var8 * dma.field_g + param2)] = var13;
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
                  }
                }
                L6: {
                  if (-21 <= (var7 ^ -1)) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = (20 - var7) * (20 + -var7) - -(var13 * var13);
                          if (-463 > (var14 ^ -1)) {
                            break L8;
                          } else {
                            if ((var14 ^ -1) > -421) {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 - var14) / 42;
                              var15 = var15 | (var15 << -908103000 | var15 << 1134350352);
                              dma.field_i[dma.field_g * var8 + param2 + var11] = var15;
                              var11++;
                              var13++;
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
                var9 = var9 | (var9 << 1003975624 | var9 << -2093440944);
                dma.h(var10 - -param2, var8, var11 - var10, var9);
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

    iw(ida param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_H = 0;
        this.field_G = 0;
    }

    public static void f(int param0) {
        field_F = null;
        field_D = null;
        if (param0 != -27545) {
            iw.f(28);
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 248) {
            return false;
        }
        if (this.field_G <= 0) {
        } else {
            var2 = this.field_I;
            var3 = this.field_C;
            fieldTemp$0 = this.field_H + 1;
            this.field_H = this.field_H + 1;
            if (this.field_G <= fieldTemp$0) {
                this.field_G = 0;
                this.d(param0 + 15187);
            } else {
                var4 = (-this.field_H + this.field_G * 2) * this.field_H;
                var5 = this.field_G * this.field_G;
                var3 = this.field_B - -((this.field_C + -this.field_B) * var4 / var5);
                var2 = this.field_E + (-this.field_E + this.field_I) * var4 / var5;
            }
            this.c(var2, -1860440319, var3);
        }
        return super.a(248);
    }

    final static void k(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        faa var15 = null;
        int[][] var19 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var15 = qga.field_b;
            var2 = var15.e((byte) -87);
            var3 = (fa) ((Object) gm.field_H.d(param0 + 38));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_f != var2) {
                    var3 = (fa) ((Object) gm.field_H.a((byte) 95));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                ifb.l(-117);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  if (param0 == -38) {
                    break L3;
                  } else {
                    field_D = (String) null;
                    break L3;
                  }
                }
                L4: {
                  var4 = var15.e((byte) -118);
                  if (-1 != (var4 ^ -1)) {
                    tsb.field_o[0] = kca.field_a;
                    var5 = var3.field_g;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        eja.a(var5, var4, 0);
                        var6_int = 0;
                        L6: while (true) {
                          if (var4 <= var6_int) {
                            qea.a((byte) -29, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][var5 * 4];
                            var8 = bea.field_e;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var13 < var8) {
                                    var11 = sv.field_f[var5 + var13];
                                    var6[1][var14] = tsb.field_o[var11];
                                    var19[1][var14 * 4] = fmb.field_o[var11];
                                    var19[1][1 + var14 * 4] = emb.field_o[var11];
                                    var19[1][var14 * 4 + 2] = hma.field_d[var11];
                                    var19[1][3 + var14 * 4] = fv.field_o[var11];
                                    if (qja.a((byte) -75, tsb.field_o[var11])) {
                                      L9: {
                                        if (0 == fv.field_o[var11] + (hma.field_d[var11] + emb.field_o[var11])) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var14++;
                                      var13++;
                                      continue L8;
                                    } else {
                                      var14++;
                                      var13++;
                                      continue L8;
                                    }
                                  } else {
                                    var3.b(-3846);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = sv.field_f[var9];
                                  var6[0][var10] = tsb.field_o[var11];
                                  var19[0][var10 * 4] = fmb.field_o[var11];
                                  var19[0][var10 * 4 - -1] = emb.field_o[var11];
                                  var19[0][2 + var10 * 4] = hma.field_d[var11];
                                  var19[0][3 + 4 * var10] = fv.field_o[var11];
                                  if (qja.a((byte) -75, tsb.field_o[var11])) {
                                    if (0 == emb.field_o[var11] - -hma.field_d[var11] + fv.field_o[var11]) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              bb.a(var15, true);
                              if (var6_int != 0) {
                                ujb.a(wl.field_q, qfb.field_o, vga.field_d, 13336, var6_int, jv.field_b);
                                break L11;
                              } else {
                                ujb.a(wl.field_q, qfb.field_o, vga.field_d, 13336, var6_int, jv.field_b);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        tsb.field_o[var6_int] = var15.a(param0 + 37);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.b(-3846);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "iw.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (!((param3 ^ -1) < -1)) {
            this.c(param1, -1860440319, param2);
            return;
        }
        this.field_I = param1;
        this.field_C = param2;
        this.field_H = 0;
        if (param0 <= 71) {
            this.c(-109, 54, 31, -22);
        }
        this.field_G = param3;
        this.field_E = this.field_h;
        this.field_B = this.field_f;
    }

    boolean j(byte param0) {
        if (param0 != 55) {
            this.field_C = -52;
        }
        this.e(-10331);
        return super.j((byte) 55);
    }

    void e(int param0) {
        if (-1 <= (this.field_G ^ -1)) {
            return;
        }
        this.c(this.field_I, param0 ^ 1860450468, this.field_C);
        this.field_G = 0;
        this.d(param0 + 25766);
        if (param0 != -10331) {
            iw.k((byte) 34);
        }
    }

    static {
        field_F = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_D = "m";
    }
}
