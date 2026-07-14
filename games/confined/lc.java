/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_s;
    private int[][] field_p;
    double field_G;
    private double[] field_w;
    double field_i;
    private double[] field_d;
    int field_a;
    double field_c;
    private double[] field_F;
    int field_D;
    private int field_C;
    private double field_h;
    static bj field_J;
    private double[] field_m;
    static int field_z;
    double[] field_x;
    private int[][] field_b;
    double field_H;
    int field_f;
    double field_B;
    double[] field_r;
    double[][] field_n;
    private int[][] field_E;
    double field_u;
    private int field_q;
    private double field_j;
    static String[] field_l;
    double[][] field_v;
    double[] field_g;
    private double[] field_A;
    private double field_e;
    private int field_I;
    int field_t;
    pm[] field_y;
    private int[][] field_k;
    private double[][] field_o;

    public static void a(byte param0) {
        field_J = null;
        if (param0 != 83) {
            in discarded$0 = lc.b((byte) 64);
        }
        field_l = null;
    }

    private final void a(double param0, int param1, int param2, int param3, double param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Confined.field_J ? 1 : 0;
          ((lc) this).field_q = param2;
          ((lc) this).field_t = -1 + ((lc) this).field_a;
          if (param3 > ((lc) this).field_f) {
            var8 = -1 + param3;
            L1: while (true) {
              L2: {
                if (-1 <= (var8 ^ -1)) {
                  break L2;
                } else {
                  var9 = (1 + var8 * 2) * ((lc) this).field_f / param3 >> -655124799;
                  if (var9 != var8) {
                    var10 = 0;
                    L3: while (true) {
                      if (((lc) this).field_a <= var10) {
                        var8--;
                        continue L1;
                      } else {
                        ((lc) this).field_v[var10][var8] = ((lc) this).field_v[var10][var9];
                        ((lc) this).field_n[var10][var8] = ((lc) this).field_n[var10][var9];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((lc) this).field_f = param3;
              ((lc) this).field_s = param3;
              break L0;
            }
          } else {
            ((lc) this).field_s = param3;
            if (((lc) this).field_f > param3) {
              ((lc) this).field_I = ((lc) this).field_a;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L4: {
          ((lc) this).field_H = ((lc) this).field_i;
          ((lc) this).field_D = ((lc) this).field_a;
          ((lc) this).field_e = param4;
          ((lc) this).field_i = param0;
          if (param1 == 2) {
            break L4;
          } else {
            ((lc) this).field_x = null;
            break L4;
          }
        }
    }

    final boolean a(double param0, double param1, byte param2, int param3) {
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = Confined.field_J ? 1 : 0;
        double[] var23 = ((lc) this).field_v[param3];
        double[] var21 = var23;
        double[] var20 = var21;
        double[] var7 = var20;
        double[] var24 = ((lc) this).field_n[param3];
        int var9 = -1 + ((lc) this).field_f;
        if (param2 <= 4) {
            return false;
        }
        int var10 = 0;
        while (((lc) this).field_f > var10) {
            var11 = var23[var9];
            var13 = var24[var9];
            var15 = -var11 + var23[var10];
            var17 = -var13 + var24[var10];
            if (0.0 > var17 * (-var11 + param1) - var15 * (param0 - var13)) {
                return true;
            }
            var10++;
            var9 = var10;
        }
        return false;
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 13684) {
            return true;
        }
        return ck.a(false, param0, false);
    }

    final static boolean a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            in discarded$2 = lc.b((byte) -58);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (param1.length() <= var2) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!ih.a(param0, (char) var3)) {
              if (!hc.a((char) var3, -58)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kg var16 = null;
        kg var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = Confined.field_J ? 1 : 0;
        var16 = new kg(param1);
        var17 = var16;
        var17.field_n = -2 + param1.length;
        wc.field_hc = var17.a((byte) 25);
        rj.field_f = new byte[wc.field_hc][];
        un.field_i = new byte[wc.field_hc][];
        jl.field_p = new int[wc.field_hc];
        ij.field_r = new int[wc.field_hc];
        sd.field_f = new int[wc.field_hc];
        rg.field_I = new int[wc.field_hc];
        pa.field_e = new boolean[wc.field_hc];
        var17.field_n = -(8 * wc.field_hc) + param1.length - 7;
        kb.field_a = var17.a((byte) 25);
        em.field_e = var17.a((byte) 25);
        var3 = 1 + (255 & var17.c(32));
        var4 = 0;
        L0: while (true) {
          L1: {
            if (wc.field_hc <= var4) {
              break L1;
            } else {
              jl.field_p[var4] = var16.a((byte) 25);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= wc.field_hc) {
                break L3;
              } else {
                ij.field_r[var4] = var16.a((byte) 25);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (wc.field_hc <= var4) {
                  break L5;
                } else {
                  rg.field_I[var4] = var16.a((byte) 25);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (var4 >= wc.field_hc) {
                    break L7;
                  } else {
                    sd.field_f[var4] = var16.a((byte) 25);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_n = 3 - (3 * var3 - (-(8 * wc.field_hc) + param1.length) - -7);
                an.field_p = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        an.field_p[var4] = var16.f(-48);
                        if ((an.field_p[var4] ^ -1) == -1) {
                          an.field_p[var4] = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var17.field_n = 0;
                    if (!param0) {
                      break L11;
                    } else {
                      field_l = null;
                      break L11;
                    }
                  }
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (wc.field_hc <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = rg.field_I[var4];
                            var6 = sd.field_f[var4];
                            var7 = var6 * var5;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            rj.field_f[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            un.field_i[var4] = var25;
                            var10 = 0;
                            var11 = var17.c(32);
                            if (-1 != (1 & var11 ^ -1)) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var7 <= var12) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.b(true);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (0 != (2 & var11)) {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.b(true);
                                          var13 = var16.b(true);
                                          stackOut_35_0 = var10;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_36_0 = stackOut_35_0;
                                          if (var13 == -1) {
                                            stackOut_37_0 = stackIn_37_0;
                                            stackOut_37_1 = 0;
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            break L20;
                                          } else {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 1;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_38_0 | stackIn_38_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var5 <= var12) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var6 <= var13) {
                                      break L24;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.b(true);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if ((2 & var11) == 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L25: while (true) {
                                if (var5 <= var12) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var13 >= var6) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var12 + var5 * var13] = var16.b(true);
                                          var14 = var16.b(true);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (-1 == var14) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        pa.field_e[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (!(param0 <= (((lc) this).field_a ^ -1))) {
            ((lc) this).field_a = ((lc) this).field_a - 1;
            for (var2 = 0; var2 < ((lc) this).field_a; var2++) {
                ((lc) this).field_m[var2] = ((lc) this).field_m[1 + var2];
                ((lc) this).field_A[var2] = ((lc) this).field_A[1 + var2];
                ((lc) this).field_r[var2] = ((lc) this).field_r[var2 - -1];
                ((lc) this).field_v[var2] = ((lc) this).field_v[var2 - -1];
                ((lc) this).field_n[var2] = ((lc) this).field_n[var2 - -1];
            }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double[] var15 = null;
        double[] var16 = null;
        var8 = Confined.field_J ? 1 : 0;
        var15 = ((lc) this).field_v[0];
        var16 = ((lc) this).field_n[0];
        var2 = 0;
        L0: while (true) {
          if (((lc) this).field_a + -1 <= var2) {
            if (param0 <= -11) {
              L1: {
                ((lc) this).field_v[var2] = var15;
                ((lc) this).field_n[var2] = var16;
                if (-1 <= (((lc) this).field_t ^ -1)) {
                  break L1;
                } else {
                  ((lc) this).field_t = ((lc) this).field_t - 1;
                  if (0 != ((lc) this).field_t) {
                    break L1;
                  } else {
                    ((lc) this).field_C = ((lc) this).field_q;
                    break L1;
                  }
                }
              }
              L2: {
                if ((((lc) this).field_I ^ -1) < -1) {
                  ((lc) this).field_I = ((lc) this).field_I - 1;
                  if (((lc) this).field_I != 0) {
                    break L2;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((lc) this).field_s) {
                        ((lc) this).field_f = ((lc) this).field_s;
                        break L2;
                      } else {
                        var6 = (1 + var5 * 2) * ((lc) this).field_f / ((lc) this).field_s >> 426841601;
                        if (var5 != var6) {
                          var7 = 0;
                          L4: while (true) {
                            if (((lc) this).field_a > var7) {
                              ((lc) this).field_v[var7][var5] = ((lc) this).field_v[var7][var6];
                              ((lc) this).field_n[var7][var5] = ((lc) this).field_n[var7][var6];
                              var7++;
                              continue L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L5: {
                if ((((lc) this).field_D ^ -1) >= -1) {
                  break L5;
                } else {
                  ((lc) this).field_D = ((lc) this).field_D - 1;
                  break L5;
                }
              }
              this.a((byte) -99, ((lc) this).field_r[var2 - 1] + ((lc) this).field_j, var2);
              return;
            } else {
              return;
            }
          } else {
            ((lc) this).field_m[var2] = ((lc) this).field_m[var2 + 1];
            ((lc) this).field_A[var2] = ((lc) this).field_A[1 + var2];
            ((lc) this).field_r[var2] = ((lc) this).field_r[1 + var2];
            ((lc) this).field_v[var2] = ((lc) this).field_v[var2 + 1];
            ((lc) this).field_n[var2] = ((lc) this).field_n[var2 + 1];
            var2++;
            continue L0;
          }
        }
    }

    final void a(double param0, double param1, int param2, int param3) {
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16_int = 0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18 = 0.0;
        double var19 = 0.0;
        double var20 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        var23 = Confined.field_J ? 1 : 0;
        ((lc) this).b(3, param3, param0);
        ((lc) this).a(param2 + 18081, param3, param0);
        var7 = 0;
        var8 = 0.0;
        var10 = -((lc) this).field_B + ((lc) this).field_x[-1 + ((lc) this).field_f];
        var12 = ((lc) this).field_g[((lc) this).field_f + -1] - ((lc) this).field_G;
        var14 = Math.sqrt(var12 * var12 + var10 * var10);
        var14 = 1.0 - param1 / var14;
        var12 = var12 * var14;
        var10 = var10 * var14;
        var16_int = param2;
        L0: while (true) {
          if (((lc) this).field_f <= var16_int) {
            L1: {
              if (-1 == (var7 ^ -1)) {
                var10 = ((lc) this).field_g[-1 + ((lc) this).field_f] - ((lc) this).field_G;
                var8 = -((lc) this).field_B + ((lc) this).field_x[-1 + ((lc) this).field_f];
                break L1;
              } else {
                var10 = ((lc) this).field_g[var7 - 1] - ((lc) this).field_G;
                var8 = ((lc) this).field_x[-1 + var7] - ((lc) this).field_B;
                break L1;
              }
            }
            var12 = ((lc) this).field_x[var7] - ((lc) this).field_B;
            var14 = -((lc) this).field_G + ((lc) this).field_g[var7];
            var16 = Math.sqrt(var8 * var8 + var10 * var10);
            var16 = -(param1 / var16) + 1.0;
            var10 = var10 * var16;
            var8 = var8 * var16;
            var16 = Math.sqrt(var12 * var12 + var14 * var14);
            var16 = -(param1 / var16) + 1.0;
            var14 = var14 * var16;
            var12 = var12 * var16;
            var18 = Math.sqrt(Math.random());
            var20 = var18 * Math.random();
            var18 = 1.0 - var18;
            pn.field_h = ((lc) this).field_B + var8 * var18 + var12 * var20;
            fa.field_R = ((lc) this).field_G + var10 * var18 + var20 * var14;
            return;
          } else {
            L2: {
              var17 = -((lc) this).field_B + ((lc) this).field_x[var16_int];
              var19 = ((lc) this).field_g[var16_int] - ((lc) this).field_G;
              var14 = Math.sqrt(var19 * var19 + var17 * var17);
              var14 = 1.0 - param1 / var14;
              var19 = var19 * var14;
              var17 = var17 * var14;
              var21 = (var17 * var12 - var10 * var19) * 0.5;
              if (Math.random() * (var8 + var21) < var8) {
                break L2;
              } else {
                var7 = var16_int;
                break L2;
              }
            }
            var8 = var8 + var21;
            var12 = var19;
            var10 = var17;
            var16_int++;
            continue L0;
          }
        }
    }

    final static in b(byte param0) {
        if (param0 > -36) {
            field_l = null;
        }
        if (ml.field_a == oe.field_Q) {
            throw new IllegalStateException();
        }
        if (!(oe.field_Q != b.field_a)) {
            oe.field_Q = ml.field_a;
            return ji.field_d;
        }
        return null;
    }

    final double a(byte param0, double param1) {
        double var4 = ((lc) this).field_w[0];
        if (param0 != 78) {
            return 0.30774124675712633;
        }
        double var6 = ((lc) this).field_w[1];
        if (!(var6 <= var4)) {
            var4 = var6;
        }
        return (-(2.0 * var4) + 1.0) * (((lc) this).field_i * rk.field_l[((lc) this).field_f]) - param1;
    }

    private final void a(byte param0, double param1, int param2) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        var39 = Confined.field_J ? 1 : 0;
        ((lc) this).field_r[param2] = param1;
        var5 = ((lc) this).field_w[0];
        var5 = -var5 + 1.0 + Math.cos(((lc) this).field_d[0]) * var5;
        var7 = ((lc) this).field_w[1];
        var7 = -var7 + 1.0 + Math.cos(((lc) this).field_d[1]) * var7;
        var9 = ((lc) this).field_w[2] * Math.sin(((lc) this).field_d[2]);
        var11 = ((lc) this).field_w[3] * Math.sin(((lc) this).field_d[3]);
        var13 = ((lc) this).field_h + ((lc) this).field_w[4] * Math.sin(((lc) this).field_d[4]);
        var15 = Math.sin(var13);
        var17 = Math.cos(var13);
        ((lc) this).field_m[param2] = var9 * var17 - var11 * var15;
        ((lc) this).field_A[param2] = var9 * var15 + var17 * var11;
        var19 = Math.cos(6.283185307179586 / (double)((lc) this).field_s);
        var21 = ((lc) this).field_e * (((lc) this).field_i * 2.0) * (-var19 + 1.0) / (1.0 + var19);
        var23 = 0;
        L0: while (true) {
          if (var23 >= ((lc) this).field_s) {
            L1: {
              if (param0 == -99) {
                break L1;
              } else {
                ((lc) this).a(126);
                break L1;
              }
            }
            var40 = 0;
            var23 = var40;
            L2: while (true) {
              if (5 <= var40) {
                return;
              } else {
                L3: {
                  var24 = ((lc) this).field_d[var40] + ((lc) this).field_F[var40];
                  if (var24 >= 6.283185307179586) {
                    var24 = var24 - 6.283185307179586;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((lc) this).field_d[var40] = var24;
                var40++;
                continue L2;
              }
            }
          } else {
            var24 = ((double)(1 + 2 * var23) + (Math.random() - 0.5) * ((lc) this).field_e) / (double)((lc) this).field_s * 3.141592653589793;
            var26 = ((lc) this).field_i + var21 * (-0.5 + Math.random());
            var28 = Math.sin(var24) * var26 * var5 + var9;
            var30 = Math.cos(var24) * var26 * var7 + var11;
            var32 = -(var30 * var15) + var17 * var28;
            var34 = var30 * var17 + var15 * var28;
            if (((lc) this).field_I <= 0) {
              ((lc) this).field_v[param2][var23] = var32;
              ((lc) this).field_n[param2][var23] = var34;
              var23++;
              continue L0;
            } else {
              var36 = (2 * (var23 * ((lc) this).field_f) - -((lc) this).field_s) / (((lc) this).field_s << -426198111);
              var37 = (((lc) this).field_f * (var23 - -1) * 2 + ((lc) this).field_s) / (((lc) this).field_s << -1311986175);
              var38 = var36;
              L4: while (true) {
                if (var38 < var37) {
                  ((lc) this).field_v[param2][var38] = var32;
                  ((lc) this).field_n[param2][var38] = var34;
                  var38++;
                  continue L4;
                } else {
                  var23++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, double param2) {
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        if (param0 != 18081) {
            return;
        }
        double var5 = (-((lc) this).field_r[param1] + param2) / (((lc) this).field_r[param1 - -1] - ((lc) this).field_r[param1]);
        for (var7 = 0; var7 < ((lc) this).field_f; var7++) {
            ((lc) this).field_x[var7] = ((lc) this).field_v[param1][var7] + (-((lc) this).field_v[param1][var7] + ((lc) this).field_v[param1 - -1][var7]) * var5;
            ((lc) this).field_g[var7] = ((lc) this).field_n[param1][var7] + var5 * (-((lc) this).field_n[param1][var7] + ((lc) this).field_n[1 + param1][var7]);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        mk.b(128);
        fn.f(param0, param3, param1, param2);
        if (param4 != 14907) {
            Object var6 = null;
            boolean discarded$0 = lc.a((CharSequence) null, -78);
        }
    }

    final void a(boolean param0, double param1, mn param2, vg param3) {
        int var6_int = 0;
        oi var6_ref_oi = null;
        double var6 = 0.0;
        int var7 = 0;
        int var8 = 0;
        double var8_double = 0.0;
        double var9 = 0.0;
        int var10 = 0;
        int var11 = 0;
        double var11_double = 0.0;
        double var12 = 0.0;
        double var13 = 0.0;
        double var14 = 0.0;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var19_double = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        var23 = Confined.field_J ? 1 : 0;
        var6_int = 0;
        L0: while (true) {
          if (((lc) this).field_a <= var6_int) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((lc) this).field_H = -0.12402089679050932;
                break L1;
              }
            }
            var6_ref_oi = (oi) (Object) param2.a(-118);
            L2: while (true) {
              if (var6_ref_oi == null) {
                var6 = (double)ua.a(true);
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ((lc) this).field_a) {
                    return;
                  } else {
                    var9 = -param3.field_O + ((lc) this).field_r[var8];
                    var11 = 0;
                    L4: while (true) {
                      if (((lc) this).field_f <= var11) {
                        var8++;
                        continue L3;
                      } else {
                        L5: {
                          var12 = ((lc) this).field_v[var8][var11] - param3.field_T;
                          var14 = -param3.field_L + ((lc) this).field_n[var8][var11];
                          ((lc) this).field_b[var8][var11] = (int)(32.0 * (var14 * param3.field_ab + param3.field_R * var12 + var9 * param3.field_M));
                          ((lc) this).field_p[var8][var11] = (int)((var14 * param3.field_U + var12 * param3.field_V + param3.field_F * var9) * 32.0);
                          ((lc) this).field_k[var8][var11] = (int)(32.0 * (param3.field_H * var14 + var12 * param3.field_P + param3.field_N * var9) * 0.8);
                          var16 = (48.0 + 16.0 * ((lc) this).field_o[var8][var11]) * (-(var9 / param1) + 1.0);
                          if (var16 >= 0.0) {
                            break L5;
                          } else {
                            var16 = 0.0;
                            break L5;
                          }
                        }
                        L6: {
                          var16 = qn.field_v.a(var16, 0, ((lc) this).field_r[var8]);
                          var16 = 128.0 * Math.pow(var16 / 128.0, var6);
                          var18 = (int)var16;
                          if (126 < var18) {
                            var18 = 126;
                            break L6;
                          } else {
                            if (var18 >= 2) {
                              break L6;
                            } else {
                              var18 = 2;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var19 = 32 + -(int)(var9 * 2.0);
                          if (var18 < var19) {
                            var18 = var19;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ((lc) this).field_E[var8][var11] = var18;
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7 = 0;
                L8: while (true) {
                  L9: {
                    if (((lc) this).field_a <= var7) {
                      break L9;
                    } else {
                      if (var6_ref_oi.field_p - var6_ref_oi.field_n <= ((lc) this).field_r[var7]) {
                        break L9;
                      } else {
                        var7++;
                        continue L8;
                      }
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (((lc) this).field_a <= var7) {
                        break L11;
                      } else {
                        if (var6_ref_oi.field_n + var6_ref_oi.field_p <= ((lc) this).field_r[var7]) {
                          break L11;
                        } else {
                          var8_double = var6_ref_oi.field_p - ((lc) this).field_r[var7];
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= ((lc) this).field_f) {
                              var7++;
                              continue L10;
                            } else {
                              L13: {
                                var11_double = var6_ref_oi.field_t - ((lc) this).field_v[var7][var10];
                                var13 = var6_ref_oi.field_o - ((lc) this).field_n[var7][var10];
                                var15 = var8_double * var8_double + (var11_double * var11_double + var13 * var13);
                                if (var15 >= 0.01) {
                                  break L13;
                                } else {
                                  var15 = 0.01;
                                  break L13;
                                }
                              }
                              L14: {
                                var17 = Math.sqrt(var15);
                                var19_double = var6_ref_oi.field_u;
                                if (var6_ref_oi.field_w) {
                                  var19_double = var19_double * (-(var6_ref_oi.field_m * var11_double + var13 * var6_ref_oi.field_x + var8_double * var6_ref_oi.field_v) / var17);
                                  if (0.0 < var19_double) {
                                    break L14;
                                  } else {
                                    var10++;
                                    continue L12;
                                  }
                                } else {
                                  break L14;
                                }
                              }
                              var21 = var19_double / var15;
                              ((lc) this).field_o[var7][var10] = ((lc) this).field_o[var7][var10] + var21;
                              var10++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                    var6_ref_oi = (oi) (Object) param2.d(2123);
                    continue L2;
                  }
                }
              }
            }
          } else {
            var7 = 0;
            L15: while (true) {
              if (((lc) this).field_f <= var7) {
                var6_int++;
                continue L0;
              } else {
                ((lc) this).field_o[var6_int][var7] = 0.0;
                var7++;
                continue L15;
              }
            }
          }
        }
    }

    final void b(int param0, int param1, double param2) {
        double var5 = (param2 - ((lc) this).field_r[param1]) / (-((lc) this).field_r[param1] + ((lc) this).field_r[param1 + 1]);
        if (param0 != 3) {
            ((lc) this).b(-19, 17, -0.38255538627726915);
        }
        ((lc) this).field_B = ((lc) this).field_m[param1] + (-((lc) this).field_m[param1] + ((lc) this).field_m[1 + param1]) * var5;
        ((lc) this).field_G = (((lc) this).field_A[1 + param1] - ((lc) this).field_A[param1]) * var5 + ((lc) this).field_A[param1];
    }

    final void a(byte param0, ql param1) {
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        var18 = Confined.field_J ? 1 : 0;
        var3 = param1.field_o;
        var4 = 105 / ((-46 - param0) / 53);
        this.a(vb.field_a[var3], 2, h.field_V[var3], ag.field_g[var3], ej.field_a[var3]);
        var5 = ((lc) this).field_h;
        var7 = ((lc) this).field_w[2] * Math.sin(((lc) this).field_d[2]);
        var9 = ((lc) this).field_w[3] * Math.sin(((lc) this).field_d[3]);
        var11 = ((lc) this).field_w[4] * Math.sin(((lc) this).field_d[4]) + var5;
        var13 = Math.sin(var11);
        var15 = Math.cos(var11);
        ((lc) this).field_u = ((lc) this).field_u + (var15 * var7 - var9 * var13);
        ((lc) this).field_c = ((lc) this).field_c + (var7 * var13 + var15 * var9);
        ((lc) this).field_h = ((lc) this).field_h + var11;
        var17 = 0;
        L0: while (true) {
          if (var17 >= 5) {
            var7 = ((lc) this).field_w[2] * Math.sin(((lc) this).field_d[2]);
            var9 = ((lc) this).field_w[3] * Math.sin(((lc) this).field_d[3]);
            var11 = var5 + ((lc) this).field_w[4] * Math.sin(((lc) this).field_d[4]);
            ((lc) this).field_c = ((lc) this).field_c - (var13 * var7 + var9 * var15);
            ((lc) this).field_h = ((lc) this).field_h - var11;
            ((lc) this).field_u = ((lc) this).field_u - (var7 * var15 - var13 * var9);
            return;
          } else {
            ((lc) this).field_w[var17] = ag.field_a[10 * var3 - -(2 * var17)];
            ((lc) this).field_F[var17] = ag.field_a[1 + (2 * var17 + 10 * var3)];
            var17++;
            continue L0;
          }
        }
    }

    final void a(int param0, vg param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        Object var26 = null;
        int[] stackIn_1_0 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackOut_0_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var25 = Confined.field_J ? 1 : 0;
          stackOut_0_0 = rc.field_b;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0 >= ((lc) this).field_t) {
            stackOut_2_0 = (int[]) (Object) stackIn_2_0;
            stackOut_2_1 = ((lc) this).field_q;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (int[]) (Object) stackIn_1_0;
            stackOut_1_1 = ((lc) this).field_C;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var4 = stackIn_3_0[stackIn_3_1];
        var5 = -1 + ((lc) this).field_f;
        var6 = 0;
        L1: while (true) {
          if (((lc) this).field_f <= var6) {
            L2: {
              if (param2 == 3) {
                break L2;
              } else {
                var26 = null;
                lc.a(true, (byte[]) null);
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var7 = new int[]{((lc) this).field_b[param0][var6], ((lc) this).field_b[1 + param0][var6], ((lc) this).field_b[1 + param0][var5], ((lc) this).field_b[param0][var5]};
              var8 = new int[]{((lc) this).field_p[param0][var6], ((lc) this).field_p[1 + param0][var6], ((lc) this).field_p[1 + param0][var5], ((lc) this).field_p[param0][var5]};
              var9 = new int[]{((lc) this).field_k[param0][var6], ((lc) this).field_k[1 + param0][var6], ((lc) this).field_k[1 + param0][var5], ((lc) this).field_k[param0][var5]};
              var10 = new int[]{((lc) this).field_E[param0][var6], ((lc) this).field_E[param0 - -1][var6], ((lc) this).field_E[param0 - -1][var5], ((lc) this).field_E[param0][var5]};
              var11 = ((lc) this).field_v[1 + param0][var5] - ((lc) this).field_v[param0 - -1][var6];
              var13 = -((lc) this).field_n[1 + param0][var6] + ((lc) this).field_n[param0 - -1][var5];
              var15 = -((lc) this).field_v[param0][var5] + ((lc) this).field_v[param0 + 1][var5];
              var17 = ((lc) this).field_n[param0 - -1][var5] - ((lc) this).field_n[param0][var5];
              var19 = ((lc) this).field_r[param0 - -1] - ((lc) this).field_r[param0];
              var21 = -((lc) this).field_v[1 + param0][var6] + ((lc) this).field_v[param0][var6];
              var23 = ((lc) this).field_n[param0][var6] - ((lc) this).field_n[1 + param0][var6];
              if (var19 * (-(var11 * (var17 + var23)) + var13 * (var21 + var15)) >= 0.0) {
                t.field_h[0] = var7[2] + (var7[0] + -var7[1]);
                t.field_g[0] = -var8[1] + (var8[2] + var8[0]);
                t.field_o[0] = -var9[1] + var9[0] + var9[2];
                t.field_h[1] = var7[2];
                t.field_g[1] = var8[2];
                t.field_o[1] = var9[2];
                t.field_h[2] = var7[0];
                t.field_g[2] = var8[0];
                t.field_o[2] = var9[0];
                t.a(0, 2, var4, new int[3], new int[3], new int[3], var10[0], var10[1], var10[2]);
                t.field_h[0] = var7[3];
                t.field_g[0] = var8[3];
                t.field_o[0] = var9[3];
                t.a(0, 2, var4, new int[3], new int[3], new int[3], var10[2], var10[3], var10[0]);
                break L3;
              } else {
                t.field_h[0] = var7[3];
                t.field_g[0] = var8[3];
                t.field_o[0] = var9[3];
                t.field_h[1] = var7[1] - -var7[3] + -var7[0];
                t.field_g[1] = -var8[0] + (var8[1] - -var8[3]);
                t.field_o[1] = var9[1] - (-var9[3] - -var9[0]);
                t.field_h[2] = var7[0];
                t.field_g[2] = var8[0];
                t.field_o[2] = var9[0];
                t.a(0, 2, var4, new int[3], new int[3], new int[3], var10[3], var10[0], var10[1]);
                t.field_h[1] = var7[2];
                t.field_g[1] = var8[2];
                t.field_o[1] = var9[2];
                t.field_h[2] = var7[3] + (var7[1] + -var7[2]);
                t.field_g[2] = -var8[2] + (var8[1] + var8[3]);
                t.field_o[2] = -var9[2] + (var9[1] + var9[3]);
                t.a(0, 2, var4, new int[3], new int[3], new int[3], var10[1], var10[2], var10[3]);
                break L3;
              }
            }
            var5 = var6;
            var6++;
            continue L1;
          }
        }
    }

    final void a(double param0, double param1, double param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var10 = Confined.field_J ? 1 : 0;
        if (param3 != 14497) {
            field_J = null;
        }
        for (var8 = 0; ((lc) this).field_a > var8; var8++) {
            ((lc) this).field_m[var8] = ((lc) this).field_m[var8] - param1;
            ((lc) this).field_A[var8] = ((lc) this).field_A[var8] - param0;
            ((lc) this).field_r[var8] = ((lc) this).field_r[var8] - param2;
            for (var9 = 0; ((lc) this).field_f > var9; var9++) {
                ((lc) this).field_v[var8][var9] = ((lc) this).field_v[var8][var9] - param1;
                ((lc) this).field_n[var8][var9] = ((lc) this).field_n[var8][var9] - param0;
            }
        }
    }

    lc(int param0, int param1, int param2, double param3, double param4, double param5) {
        int var10 = 0;
        ((lc) this).field_w = new double[5];
        ((lc) this).field_F = new double[5];
        ((lc) this).field_d = new double[5];
        ((lc) this).field_y = new pm[param2];
        ((lc) this).field_n = new double[param2][7];
        ((lc) this).field_r = new double[param2];
        ((lc) this).field_k = new int[param2][7];
        ((lc) this).field_p = new int[param2][7];
        ((lc) this).field_A = new double[param2];
        ((lc) this).field_b = new int[param2][7];
        ((lc) this).field_v = new double[param2][7];
        ((lc) this).field_j = param3;
        ((lc) this).field_o = new double[param2][7];
        ((lc) this).field_i = param4;
        ((lc) this).field_H = param4;
        ((lc) this).field_x = new double[7];
        ((lc) this).field_m = new double[param2];
        ((lc) this).field_E = new int[param2][7];
        ((lc) this).field_e = param5;
        ((lc) this).field_g = new double[7];
        ((lc) this).field_f = param1;
        ((lc) this).field_s = param1;
        ((lc) this).field_a = param2;
        ((lc) this).field_C = param0;
        ((lc) this).field_q = param0;
        ((lc) this).field_D = 0;
        var10 = 0;
        L0: while (true) {
          if ((var10 ^ -1) <= -6) {
            var10 = 0;
            L1: while (true) {
              if (param2 <= var10) {
              } else {
                this.a((byte) -99, (double)var10 * param3, var10);
                var10++;
                continue L1;
              }
            }
          } else {
            ((lc) this).field_w[var10] = ag.field_a[2 * var10];
            ((lc) this).field_F[var10] = ag.field_a[var10 * 2 + 1];
            var10++;
            continue L0;
          }
        }
    }

    static {
    }
}
