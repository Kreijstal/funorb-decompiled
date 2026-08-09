/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bma extends ci {
    private int field_m;
    private int field_r;
    private int field_A;
    private int field_q;
    static gb field_w;
    private int field_x;
    private int field_n;
    static jea field_v;
    private int field_C;
    private int[] field_u;
    private int[][] field_B;
    private int[][] field_y;
    static int[] field_t;
    private int field_o;
    private int field_D;
    private int field_z;
    static String field_s;
    private int field_E;
    static int[] field_p;

    final static void d(byte param0) {
        aca var1 = (aca) ((Object) io.field_d.f(-80));
        if (var1 == null) {
            dea.a(60);
            return;
        }
        kh var2 = vc.field_q;
        if (param0 < 23) {
            field_t = (int[]) null;
        }
        var2.e(-16);
        var2.e(-118);
        var2.e(112);
        var2.e(-29);
        var1.p(71);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (-2 == (var4_int ^ -1)) {
                  this.field_n = param1.h(255);
                  break L1;
                } else {
                  if (2 != var4_int) {
                    if (-4 == (var4_int ^ -1)) {
                      this.field_C = param1.d(123);
                      break L1;
                    } else {
                      if (var4_int == 4) {
                        this.field_z = param1.d(param0 + 18);
                        break L1;
                      } else {
                        if (5 == var4_int) {
                          this.field_A = param1.d(param0 + 17);
                          break L1;
                        } else {
                          if (var4_int == 6) {
                            this.field_q = param1.d(121);
                            break L1;
                          } else {
                            if (var4_int == 7) {
                              this.field_x = param1.d(param0 ^ 23);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.field_D = param1.d(param0 + 17);
                    break L1;
                  }
                }
              } else {
                this.field_o = param1.h(255);
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                bma.d((byte) -52);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("bma.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param1 != -1368) {
            return 73;
        }
        if (param0 < 2) {
            if (param2 < 5) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private final void c(int param0) {
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        Random var10;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = new Random((long)this.field_n);
        this.field_E = 4096 / this.field_n;
        this.field_r = 4096 / this.field_o;
        this.field_m = this.field_q / 2;
        if (param0 >= 46) {
          var3 = this.field_r / 2;
          this.field_u = new int[this.field_n - -1];
          this.field_B = new int[this.field_n][this.field_o];
          var4 = this.field_E / 2;
          this.field_y = new int[this.field_n][1 + this.field_o];
          this.field_u[0] = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= this.field_n) {
              this.field_u[this.field_n] = 4096;
              return;
            } else {
              L1: {
                if ((var5 ^ -1) < -1) {
                  var6 = this.field_E;
                  var7 = (jqa.a(4096, var10, -100) + -2048) * this.field_C >> 181698316;
                  var6 = var6 + (var4 * var7 >> 1741053868);
                  this.field_u[var5] = var6 + this.field_u[var5 - 1];
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_y[var5][0] = 0;
              var6 = 0;
              L2: while (true) {
                if (this.field_o <= var6) {
                  this.field_y[var5][this.field_o] = 4096;
                  var5++;
                  continue L0;
                } else {
                  L3: {
                    if (var6 > 0) {
                      var7 = this.field_r;
                      var8 = (-2048 + jqa.a(4096, var10, -93)) * this.field_D >> 1859393868;
                      var7 = var7 + (var3 * var8 >> -2032791700);
                      this.field_y[var5][var6] = this.field_y[var5][var6 - 1] - -var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackIn_14_0 = this.field_B[var5];

                    stackIn_14_1 = var6;

                    if ((this.field_x ^ -1) >= -1) {
                      stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = 4096;
                      break L4;
                    } else {
                      stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = -jqa.a(this.field_x, var10, -120) + 4096;
                      break L4;
                    }
                  }
                  stackIn_15_0[stackIn_15_1] = stackIn_15_2;
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean d(int param0, int param1) {
        int var2;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((-20 - param0) / 40);
            if (-1 == (param1 ^ -1)) {
              break L1;
            } else {
              if (param1 == pl.a((byte) 64)) {
                break L1;
              } else {
                if (dta.field_g[param1]) {
                  break L1;
                } else {
                  if (rd.b(false)) {
                    stackIn_7_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        if (param0 != -21771) {
            bma.d(5, -48, 96);
        }
        field_p = null;
        field_w = null;
        field_v = null;
        field_s = null;
        field_t = null;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        this.c(122);
    }

    public bma() {
        super(0, true);
        this.field_n = 8;
        this.field_q = 81;
        this.field_C = 204;
        this.field_A = 0;
        this.field_D = 409;
        this.field_z = 1024;
        this.field_o = 4;
        this.field_x = 1024;
    }

    final static int a(fp param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ej.field_c == param0) {
              stackIn_11_0 = 5890;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (tla.field_c == param0) {
                stackIn_9_0 = 34167;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 != lja.field_j) {
                  if (param0 != pea.field_c) {
                    L1: {
                      if (param1) {
                        break L1;
                      } else {
                        bma.d(-82, 71, 72);
                        break L1;
                      }
                    }
                    throw new IllegalArgumentException();
                  } else {
                    stackIn_7_0 = 34166;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_4_0 = 34168;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("bma.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        var17 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var19 = this.field_i.a((byte) 46, param1);
            var18 = var19;
            var3 = var18;
            if (!this.field_i.field_d) {
              break L0;
            } else {
              var7 = 0;
              var9 = sj.field_b[param1] + this.field_A;
              L1: while (true) {
                if (-1 >= (var9 ^ -1)) {
                  L2: while (true) {
                    if (-4097 <= (var9 ^ -1)) {
                      L3: while (true) {
                        L4: {
                          if (var7 >= this.field_n) {
                            break L4;
                          } else {
                            if (this.field_u[var7] > var9) {
                              break L4;
                            } else {
                              var7++;
                              continue L3;
                            }
                          }
                        }
                        L5: {
                          var11 = -1 + var7;
                          if ((1 & var7) != 0) {
                            stackIn_14_0 = 0;
                            break L5;
                          } else {
                            stackIn_14_0 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = stackIn_14_0;
                          var15 = this.field_u[var7];
                          var16 = this.field_u[-1 + var7];
                          if (var16 + this.field_m >= var9) {
                            break L6;
                          } else {
                            if (var15 + -this.field_m > var9) {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= ns.field_g) {
                                  break L0;
                                } else {
                                  L8: {
                                    if (var12 != 0) {
                                      stackIn_23_0 = this.field_z;
                                      break L8;
                                    } else {
                                      stackIn_23_0 = -this.field_z;
                                      break L8;
                                    }
                                  }
                                  var5 = stackIn_23_0;
                                  var6 = 0;
                                  var8 = ht.field_Fb[var4] - -(this.field_r * var5 >> -1690750356);
                                  L9: while (true) {
                                    if ((var8 ^ -1) <= -1) {
                                      L10: while (true) {
                                        if ((var8 ^ -1) >= -4097) {
                                          L11: while (true) {
                                            L12: {
                                              if (var6 >= this.field_o) {
                                                break L12;
                                              } else {
                                                if (var8 < this.field_y[var11][var6]) {
                                                  break L12;
                                                } else {
                                                  var6++;
                                                  continue L11;
                                                }
                                              }
                                            }
                                            L13: {
                                              var10 = var6 - 1;
                                              var13 = this.field_y[var11][var10];
                                              var14 = this.field_y[var11][var6];
                                              if (this.field_m + var13 >= var8) {
                                                break L13;
                                              } else {
                                                if (var8 >= var14 - this.field_m) {
                                                  break L13;
                                                } else {
                                                  var3[var4] = this.field_B[var11][var10];
                                                  var4++;
                                                  continue L7;
                                                }
                                              }
                                            }
                                            var19[var4] = 0;
                                            var4++;
                                            continue L7;
                                          }
                                        } else {
                                          var8 -= 4096;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var8 += 4096;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        lua.a(var19, 0, ns.field_g, 0);
                        break L0;
                      }
                    } else {
                      var9 -= 4096;
                      continue L2;
                    }
                  }
                } else {
                  var9 += 4096;
                  continue L1;
                }
              }
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    static {
        field_w = new gb();
        field_t = new int[5];
        field_p = new int[8192];
    }
}
