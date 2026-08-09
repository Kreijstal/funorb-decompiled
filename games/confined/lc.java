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
            lc.b((byte) 64);
        }
        field_l = null;
    }

    private final void a(double param0, int param1, int param2, int param3, double param4) {
        int var11;
        int var8;
        int var9;
        int var10;
        L0: {
          var11 = Confined.field_J ? 1 : 0;
          this.field_q = param2;
          this.field_t = -1 + this.field_a;
          if (param3 > this.field_f) {
            var8 = -1 + param3;
            L1: while (true) {
              L2: {
                if (-1 <= (var8 ^ -1)) {
                  break L2;
                } else {
                  var9 = (1 + var8 * 2) * this.field_f / param3 >> -655124799;
                  if ((var9 ^ -1) != (var8 ^ -1)) {
                    var10 = 0;
                    L3: while (true) {
                      if (this.field_a <= var10) {
                        var8--;
                        continue L1;
                      } else {
                        this.field_v[var10][var8] = this.field_v[var10][var9];
                        this.field_n[var10][var8] = this.field_n[var10][var9];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              this.field_f = param3;
              this.field_s = param3;
              break L0;
            }
          } else {
            this.field_s = param3;
            if (this.field_f > param3) {
              this.field_I = this.field_a;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L4: {
          this.field_H = this.field_i;
          this.field_D = this.field_a;
          this.field_e = param4;
          this.field_i = param0;
          if (param1 == 2) {
            break L4;
          } else {
            this.field_x = (double[]) null;
            break L4;
          }
        }
    }

    final boolean a(double param0, double param1, byte param2, int param3) {
        int incrementValue$1 = 0;
        double[] var7;
        int var9;
        int var10;
        double var11;
        double var13;
        double var15;
        double var17;
        int var19;
        double[] var20;
        double[] var21;
        double[] var23;
        double[] var24;
        var19 = Confined.field_J ? 1 : 0;
        var23 = this.field_v[param3];
        var21 = var23;
        var20 = var21;
        var7 = var20;
        var24 = this.field_n[param3];
        var9 = -1 + this.field_f;
        if (param2 > 4) {
          var10 = 0;
          L0: while (true) {
            if (this.field_f <= var10) {
              return false;
            } else {
              var11 = var23[var9];
              var13 = var24[var9];
              var15 = -var11 + var23[var10];
              var17 = -var13 + var24[var10];
              if (0.0 <= var17 * (-var11 + param1) - var15 * (param0 - var13)) {
                incrementValue$1 = var10;
                var10++;
                var9 = incrementValue$1;
                continue L0;
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 13684) {
              stackIn_4_0 = ck.a(false, param0, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("lc.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                lc.b((byte) -58);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param1.length() <= var2_int) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param1.charAt(var2_int);
                  if (ih.a(param0, (char) var3)) {
                    break L3;
                  } else {
                    if (hc.a((char) var3, -58)) {
                      break L3;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(boolean param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
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
            L1: while (true) {
              if (wc.field_hc <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= wc.field_hc) {
                    var4 = 0;
                    L3: while (true) {
                      if (wc.field_hc <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= wc.field_hc) {
                            var17.field_n = 3 - (3 * var3 - (-(8 * wc.field_hc) + param1.length) - -7);
                            an.field_p = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                L6: {
                                  var17.field_n = 0;
                                  if (!param0) {
                                    break L6;
                                  } else {
                                    field_l = (String[]) null;
                                    break L6;
                                  }
                                }
                                var4 = 0;
                                L7: while (true) {
                                  if (wc.field_hc <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = rg.field_I[var4];
                                      var6 = sd.field_f[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      rj.field_f[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      un.field_i[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.c(32);
                                      if (-1 != (1 & var11 ^ -1)) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        dupTemp$0 = var17.b(true);
                                                        var9[var12 + var5 * var13] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_48_0 = var10;

                                                        if (-1 == var14) {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.b(true);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if (0 != (2 & var11)) {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    dupTemp$1 = var17.b(true);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_33_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_34_0 | stackIn_34_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var17.b(true);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    pa.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  an.field_p[var4] = var17.f(-48);
                                  if ((an.field_p[var4] ^ -1) == -1) {
                                    an.field_p[var4] = 1;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            sd.field_f[var4] = var17.a((byte) 25);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        rg.field_I[var4] = var17.a((byte) 25);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ij.field_r[var4] = var17.a((byte) 25);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                jl.field_p[var4] = var16.a((byte) 25);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("lc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (!(param0 <= (this.field_a ^ -1))) {
            this.field_a = this.field_a - 1;
            for (var2 = 0; var2 < this.field_a; var2++) {
                this.field_m[var2] = this.field_m[1 + var2];
                this.field_A[var2] = this.field_A[1 + var2];
                this.field_r[var2] = this.field_r[var2 - -1];
                this.field_v[var2] = this.field_v[var2 - -1];
                this.field_n[var2] = this.field_n[var2 - -1];
            }
        }
    }

    final void c(byte param0) {
        int var2;
        int var5;
        int var6;
        int var7;
        int var8;
        double[] var15;
        double[] var16;
        var8 = Confined.field_J ? 1 : 0;
        var15 = this.field_v[0];
        var16 = this.field_n[0];
        var2 = 0;
        L0: while (true) {
          if (this.field_a + -1 <= var2) {
            if (param0 <= -11) {
              L1: {
                this.field_v[var2] = var15;
                this.field_n[var2] = var16;
                if (-1 <= (this.field_t ^ -1)) {
                  break L1;
                } else {
                  this.field_t = this.field_t - 1;
                  if (0 != this.field_t) {
                    break L1;
                  } else {
                    this.field_C = this.field_q;
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_I ^ -1) < -1) {
                  this.field_I = this.field_I - 1;
                  if (this.field_I != 0) {
                    break L2;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_s) {
                        this.field_f = this.field_s;
                        break L2;
                      } else {
                        var6 = (1 + var5 * 2) * this.field_f / this.field_s >> 426841601;
                        if ((var5 ^ -1) != (var6 ^ -1)) {
                          var7 = 0;
                          L4: while (true) {
                            if (this.field_a > var7) {
                              this.field_v[var7][var5] = this.field_v[var7][var6];
                              this.field_n[var7][var5] = this.field_n[var7][var6];
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
                if ((this.field_D ^ -1) >= -1) {
                  break L5;
                } else {
                  this.field_D = this.field_D - 1;
                  break L5;
                }
              }
              this.a((byte) -99, this.field_r[var2 - 1] + this.field_j, var2);
              return;
            } else {
              return;
            }
          } else {
            this.field_m[var2] = this.field_m[var2 + 1];
            this.field_A[var2] = this.field_A[1 + var2];
            this.field_r[var2] = this.field_r[1 + var2];
            this.field_v[var2] = this.field_v[var2 + 1];
            this.field_n[var2] = this.field_n[var2 + 1];
            var2++;
            continue L0;
          }
        }
    }

    final void a(double param0, double param1, int param2, int param3) {
        int var16_int = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = Confined.field_J ? 1 : 0;
        this.b(3, param3, param0);
        this.a(param2 + 18081, param3, param0);
        int var7 = 0;
        double var8 = 0.0;
        double var10 = -this.field_B + this.field_x[-1 + this.field_f];
        double var12 = this.field_g[this.field_f + -1] - this.field_G;
        double var14 = Math.sqrt(var12 * var12 + var10 * var10);
        var14 = 1.0 - param1 / var14;
        var12 = var12 * var14;
        var10 = var10 * var14;
        for (var16_int = param2; this.field_f > var16_int; var16_int++) {
            var17 = -this.field_B + this.field_x[var16_int];
            var19 = this.field_g[var16_int] - this.field_G;
            var14 = Math.sqrt(var19 * var19 + var17 * var17);
            var14 = 1.0 - param1 / var14;
            var19 = var19 * var14;
            var17 = var17 * var14;
            var21 = (var17 * var12 - var10 * var19) * 0.5;
            if (Math.random() * (var8 + var21) >= var8) {
                var7 = var16_int;
            }
            var8 = var8 + var21;
            var12 = var19;
            var10 = var17;
        }
        if (-1 != (var7 ^ -1)) {
            var10 = this.field_g[var7 - 1] - this.field_G;
            var8 = this.field_x[-1 + var7] - this.field_B;
        } else {
            var10 = this.field_g[-1 + this.field_f] - this.field_G;
            var8 = -this.field_B + this.field_x[-1 + this.field_f];
        }
        var12 = this.field_x[var7] - this.field_B;
        var14 = -this.field_G + this.field_g[var7];
        double var16 = Math.sqrt(var8 * var8 + var10 * var10);
        var16 = -(param1 / var16) + 1.0;
        var10 = var10 * var16;
        var8 = var8 * var16;
        var16 = Math.sqrt(var12 * var12 + var14 * var14);
        var16 = -(param1 / var16) + 1.0;
        var14 = var14 * var16;
        var12 = var12 * var16;
        double var18 = Math.sqrt(Math.random());
        double var20 = var18 * Math.random();
        var18 = 1.0 - var18;
        pn.field_h = this.field_B + var8 * var18 + var12 * var20;
        fa.field_R = this.field_G + var10 * var18 + var20 * var14;
    }

    final static in b(byte param0) {
        if (param0 > -36) {
            field_l = (String[]) null;
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
        double var4 = this.field_w[0];
        if (param0 != 78) {
            return 0.30774124675712633;
        }
        double var6 = this.field_w[1];
        if (!(var6 <= var4)) {
            var4 = var6;
        }
        return (-(2.0 * var4) + 1.0) * (this.field_i * rk.field_l[this.field_f]) - param1;
    }

    private final void a(byte param0, double param1, int param2) {
        double var5;
        double var7;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        int var23;
        double var24;
        double var26;
        double var28;
        double var30;
        double var32;
        double var34;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        var39 = Confined.field_J ? 1 : 0;
        this.field_r[param2] = param1;
        var5 = this.field_w[0];
        var5 = -var5 + 1.0 + Math.cos(this.field_d[0]) * var5;
        var7 = this.field_w[1];
        var7 = -var7 + 1.0 + Math.cos(this.field_d[1]) * var7;
        var9 = this.field_w[2] * Math.sin(this.field_d[2]);
        var11 = this.field_w[3] * Math.sin(this.field_d[3]);
        var13 = this.field_h + this.field_w[4] * Math.sin(this.field_d[4]);
        var15 = Math.sin(var13);
        var17 = Math.cos(var13);
        this.field_m[param2] = var9 * var17 - var11 * var15;
        this.field_A[param2] = var9 * var15 + var17 * var11;
        var19 = Math.cos(6.283185307179586 / (double)this.field_s);
        var21 = this.field_e * (this.field_i * 2.0) * (-var19 + 1.0) / (1.0 + var19);
        var23 = 0;
        L0: while (true) {
          if (var23 >= this.field_s) {
            L1: {
              if (param0 == -99) {
                break L1;
              } else {
                this.a(126);
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
                  var24 = this.field_d[var40] + this.field_F[var40];
                  if (var24 >= 6.283185307179586) {
                    var24 = var24 - 6.283185307179586;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_d[var40] = var24;
                var40++;
                continue L2;
              }
            }
          } else {
            var24 = ((double)(1 + 2 * var23) + (Math.random() - 0.5) * this.field_e) / (double)this.field_s * 3.141592653589793;
            var26 = this.field_i + var21 * (-0.5 + Math.random());
            var28 = Math.sin(var24) * var26 * var5 + var9;
            var30 = Math.cos(var24) * var26 * var7 + var11;
            var32 = -(var30 * var15) + var17 * var28;
            var34 = var30 * var17 + var15 * var28;
            if (this.field_I <= 0) {
              this.field_v[param2][var23] = var32;
              this.field_n[param2][var23] = var34;
              var23++;
              continue L0;
            } else {
              var36 = (2 * (var23 * this.field_f) - -this.field_s) / (this.field_s << -426198111);
              var37 = (this.field_f * (var23 - -1) * 2 + this.field_s) / (this.field_s << -1311986175);
              var38 = var36;
              L4: while (true) {
                if (var38 < var37) {
                  this.field_v[param2][var38] = var32;
                  this.field_n[param2][var38] = var34;
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
        double var5 = (-this.field_r[param1] + param2) / (this.field_r[param1 - -1] - this.field_r[param1]);
        for (var7 = 0; var7 < this.field_f; var7++) {
            this.field_x[var7] = this.field_v[param1][var7] + (-this.field_v[param1][var7] + this.field_v[param1 - -1][var7]) * var5;
            this.field_g[var7] = this.field_n[param1][var7] + var5 * (-this.field_n[param1][var7] + this.field_n[1 + param1][var7]);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        mk.b(128);
        fn.f(param0, param3, param1, param2);
        if (param4 != 14907) {
            CharSequence var6 = (CharSequence) null;
            lc.a((CharSequence) null, -78);
        }
    }

    final void a(boolean param0, double param1, mn param2, vg param3) {
        double[] dupTemp$0 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        oi var6 = null;
        double var6_double = 0.0;
        RuntimeException var6_ref = null;
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
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_a <= var6_int) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    this.field_H = -0.12402089679050932;
                    break L2;
                  }
                }
                var6 = (oi) ((Object) param2.a(-118));
                L3: while (true) {
                  if (var6 == null) {
                    var6_double = (double)ua.a(true);
                    var8 = 0;
                    L4: while (true) {
                      if (var8 >= this.field_a) {
                        break L0;
                      } else {
                        var9 = -param3.field_O + this.field_r[var8];
                        var11 = 0;
                        L5: while (true) {
                          if (this.field_f <= var11) {
                            var8++;
                            continue L4;
                          } else {
                            L6: {
                              var12 = this.field_v[var8][var11] - param3.field_T;
                              var14 = -param3.field_L + this.field_n[var8][var11];
                              this.field_b[var8][var11] = (int)(32.0 * (var14 * param3.field_ab + param3.field_R * var12 + var9 * param3.field_M));
                              this.field_p[var8][var11] = (int)((var14 * param3.field_U + var12 * param3.field_V + param3.field_F * var9) * 32.0);
                              this.field_k[var8][var11] = (int)(32.0 * (param3.field_H * var14 + var12 * param3.field_P + param3.field_N * var9) * 0.8);
                              var16 = (48.0 + 16.0 * this.field_o[var8][var11]) * (-(var9 / param1) + 1.0);
                              if (var16 >= 0.0) {
                                break L6;
                              } else {
                                var16 = 0.0;
                                break L6;
                              }
                            }
                            L7: {
                              var16 = qn.field_v.a(var16, 0, this.field_r[var8]);
                              var16 = 128.0 * Math.pow(var16 / 128.0, var6_double);
                              var18 = (int)var16;
                              if (126 < var18) {
                                var18 = 126;
                                break L7;
                              } else {
                                if (var18 >= 2) {
                                  break L7;
                                } else {
                                  var18 = 2;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var19 = 32 + -(int)(var9 * 2.0);
                              if (var18 < var19) {
                                var18 = var19;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            this.field_E[var8][var11] = var18;
                            var11++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var7 = 0;
                    L9: while (true) {
                      L10: {
                        if (this.field_a <= var7) {
                          break L10;
                        } else {
                          if (var6.field_p - var6.field_n <= this.field_r[var7]) {
                            break L10;
                          } else {
                            var7++;
                            continue L9;
                          }
                        }
                      }
                      L11: while (true) {
                        stackIn_17_0 = this.field_a ^ -1;
                        L12: {
                          if (stackIn_17_0 >= (var7 ^ -1)) {
                            break L12;
                          } else {
                            if (var6.field_n + var6.field_p <= this.field_r[var7]) {
                              break L12;
                            } else {
                              var8_double = var6.field_p - this.field_r[var7];
                              var10 = 0;
                              L13: while (true) {
                                if (var10 >= this.field_f) {
                                  var7++;
                                  continue L11;
                                } else {
                                  L14: {
                                    var11_double = var6.field_t - this.field_v[var7][var10];
                                    var13 = var6.field_o - this.field_n[var7][var10];
                                    var15 = var8_double * var8_double + (var11_double * var11_double + var13 * var13);
                                    if (var15 >= 0.01) {
                                      break L14;
                                    } else {
                                      var15 = 0.01;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      var17 = Math.sqrt(var15);
                                      var19_double = var6.field_u;
                                      if (var6.field_w) {
                                        var19_double = var19_double * (-(var6.field_m * var11_double + var13 * var6.field_x + var8_double * var6.field_v) / var17);
                                        if (0.0 < var19_double) {
                                          break L16;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var21 = var19_double / var15;
                                    dupTemp$0 = this.field_o[var7];
                                    dupTemp$0[var10] = dupTemp$0[var10] + var21;
                                    break L15;
                                  }
                                  var10++;
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                        var6 = (oi) ((Object) param2.d(2123));
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7 = 0;
                L17: while (true) {
                  if (this.field_f <= var7) {
                    var6_int++;
                    continue L1;
                  } else {
                    this.field_o[var6_int][var7] = 0.0;
                    var7++;
                    continue L17;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var6_ref = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var6_ref);

            stackIn_49_1 = new StringBuilder().append("lc.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L18;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

            if (param3 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L19;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L19;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ')');
        }
    }

    final void b(int param0, int param1, double param2) {
        double var5 = (param2 - this.field_r[param1]) / (-this.field_r[param1] + this.field_r[param1 + 1]);
        if (param0 != 3) {
            this.b(-19, 17, -0.38255538627726915);
        }
        this.field_B = this.field_m[param1] + (-this.field_m[param1] + this.field_m[1 + param1]) * var5;
        this.field_G = (this.field_A[1 + param1] - this.field_A[param1]) * var5 + this.field_A[param1];
    }

    final void a(byte param0, ql param1) {
        int var3_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = Confined.field_J ? 1 : 0;
        try {
            var3_int = param1.field_o;
            int var4 = 105 / ((-46 - param0) / 53);
            this.a(vb.field_a[var3_int], 2, h.field_V[var3_int], ag.field_g[var3_int], ej.field_a[var3_int]);
            var5 = this.field_h;
            var7 = this.field_w[2] * Math.sin(this.field_d[2]);
            var9 = this.field_w[3] * Math.sin(this.field_d[3]);
            var11 = this.field_w[4] * Math.sin(this.field_d[4]) + var5;
            var13 = Math.sin(var11);
            var15 = Math.cos(var11);
            this.field_u = this.field_u + (var15 * var7 - var9 * var13);
            this.field_c = this.field_c + (var7 * var13 + var15 * var9);
            this.field_h = this.field_h + var11;
            for (var17 = 0; var17 < 5; var17++) {
                this.field_w[var17] = ag.field_a[10 * var3_int - -(2 * var17)];
                this.field_F[var17] = ag.field_a[1 + (2 * var17 + 10 * var3_int)];
            }
            var7 = this.field_w[2] * Math.sin(this.field_d[2]);
            var9 = this.field_w[3] * Math.sin(this.field_d[3]);
            var11 = var5 + this.field_w[4] * Math.sin(this.field_d[4]);
            this.field_c = this.field_c - (var13 * var7 + var9 * var15);
            this.field_h = this.field_h - var11;
            this.field_u = this.field_u - (var7 * var15 - var13 * var9);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "lc.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vg param1, int param2) {
        int var4_int = 0;
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
        byte[] var26 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var25 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = rc.field_b;

              if (param0 >= this.field_t) {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = this.field_q;
                break L1;
              } else {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = this.field_C;
                break L1;
              }
            }
            var4_int = stackIn_4_0[stackIn_4_1];
            var5 = -1 + this.field_f;
            var6 = 0;
            L2: while (true) {
              if (this.field_f <= var6) {
                L3: {
                  if (param2 == 3) {
                    break L3;
                  } else {
                    var26 = (byte[]) null;
                    lc.a(true, (byte[]) null);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var7 = new int[]{this.field_b[param0][var6], this.field_b[1 + param0][var6], this.field_b[1 + param0][var5], this.field_b[param0][var5]};
                  var8 = new int[]{this.field_p[param0][var6], this.field_p[1 + param0][var6], this.field_p[1 + param0][var5], this.field_p[param0][var5]};
                  var9 = new int[]{this.field_k[param0][var6], this.field_k[1 + param0][var6], this.field_k[1 + param0][var5], this.field_k[param0][var5]};
                  var10 = new int[]{this.field_E[param0][var6], this.field_E[param0 - -1][var6], this.field_E[param0 - -1][var5], this.field_E[param0][var5]};
                  var11 = this.field_v[1 + param0][var5] - this.field_v[param0 - -1][var6];
                  var13 = -this.field_n[1 + param0][var6] + this.field_n[param0 - -1][var5];
                  var15 = -this.field_v[param0][var5] + this.field_v[param0 + 1][var5];
                  var17 = this.field_n[param0 - -1][var5] - this.field_n[param0][var5];
                  var19 = this.field_r[param0 - -1] - this.field_r[param0];
                  var21 = -this.field_v[1 + param0][var6] + this.field_v[param0][var6];
                  var23 = this.field_n[param0][var6] - this.field_n[1 + param0][var6];
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
                    t.a(0, 2, var4_int, new int[]{var7[0], var7[1], var7[2]}, new int[]{var8[0], var8[1], var8[2]}, new int[]{var9[0], var9[1], var9[2]}, var10[0], var10[1], var10[2]);
                    t.field_h[0] = var7[3];
                    t.field_g[0] = var8[3];
                    t.field_o[0] = var9[3];
                    t.a(0, 2, var4_int, new int[]{var7[2], var7[3], var7[0]}, new int[]{var8[2], var8[3], var8[0]}, new int[]{var9[2], var9[3], var9[0]}, var10[2], var10[3], var10[0]);
                    break L4;
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
                    t.a(0, 2, var4_int, new int[]{var7[3], var7[0], var7[1]}, new int[]{var8[3], var8[0], var8[1]}, new int[]{var9[3], var9[0], var9[1]}, var10[3], var10[0], var10[1]);
                    t.field_h[1] = var7[2];
                    t.field_g[1] = var8[2];
                    t.field_o[1] = var9[2];
                    t.field_h[2] = var7[3] + (var7[1] + -var7[2]);
                    t.field_g[2] = -var8[2] + (var8[1] + var8[3]);
                    t.field_o[2] = -var9[2] + (var9[1] + var9[3]);
                    t.a(0, 2, var4_int, new int[]{var7[1], var7[2], var7[3]}, new int[]{var8[1], var8[2], var8[3]}, new int[]{var9[1], var9[2], var9[3]}, var10[1], var10[2], var10[3]);
                    break L4;
                  }
                }
                var5 = var6;
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("lc.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(double param0, double param1, double param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        double[] dupTemp$0 = null;
        double[] dupTemp$1 = null;
        int var10 = Confined.field_J ? 1 : 0;
        if (param3 != 14497) {
            field_J = (bj) null;
        }
        for (var8 = 0; this.field_a > var8; var8++) {
            this.field_m[var8] = this.field_m[var8] - param1;
            this.field_A[var8] = this.field_A[var8] - param0;
            this.field_r[var8] = this.field_r[var8] - param2;
            for (var9 = 0; this.field_f > var9; var9++) {
                dupTemp$0 = this.field_v[var8];
                dupTemp$0[var9] = dupTemp$0[var9] - param1;
                dupTemp$1 = this.field_n[var8];
                dupTemp$1[var9] = dupTemp$1[var9] - param0;
            }
        }
    }

    lc(int param0, int param1, int param2, double param3, double param4, double param5) {
        int var10 = 0;
        this.field_w = new double[5];
        this.field_F = new double[5];
        this.field_d = new double[5];
        this.field_y = new pm[param2];
        this.field_n = new double[param2][7];
        this.field_r = new double[param2];
        this.field_k = new int[param2][7];
        this.field_p = new int[param2][7];
        this.field_A = new double[param2];
        this.field_b = new int[param2][7];
        this.field_v = new double[param2][7];
        this.field_j = param3;
        this.field_o = new double[param2][7];
        this.field_i = param4;
        this.field_H = param4;
        this.field_x = new double[7];
        this.field_m = new double[param2];
        this.field_E = new int[param2][7];
        this.field_e = param5;
        this.field_g = new double[7];
        this.field_f = param1;
        this.field_s = param1;
        this.field_a = param2;
        this.field_C = param0;
        this.field_q = param0;
        this.field_D = 0;
        for (var10 = 0; (var10 ^ -1) > -6; var10++) {
            this.field_w[var10] = ag.field_a[2 * var10];
            this.field_F[var10] = ag.field_a[var10 * 2 + 1];
        }
        for (var10 = 0; param2 > var10; var10++) {
            this.a((byte) -99, (double)var10 * param3, var10);
        }
    }

    static {
    }
}
