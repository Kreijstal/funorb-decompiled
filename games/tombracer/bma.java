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
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        aca var1 = null;
        kh var2 = null;
        var1 = (aca) ((Object) io.field_d.f(-80));
        if (var1 != null) {
          var2 = vc.field_q;
          if (param0 < 23) {
            field_t = (int[]) null;
            discarded$16 = var2.e(-16);
            discarded$17 = var2.e(-118);
            discarded$18 = var2.e(112);
            discarded$19 = var2.e(-29);
            var1.p(71);
            return;
          } else {
            discarded$20 = var2.e(-16);
            discarded$21 = var2.e(-118);
            discarded$22 = var2.e(112);
            discarded$23 = var2.e(-29);
            var1.p(71);
            return;
          }
        } else {
          dea.a(60);
          return;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var4_int = param2;
                              if (0 != var4_int) {
                                break L9;
                              } else {
                                if (var5 == 0) {
                                  this.field_o = param1.h(255);
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (-2 == (var4_int ^ -1)) {
                              break L8;
                            } else {
                              L10: {
                                if (2 != var4_int) {
                                  break L10;
                                } else {
                                  if (var5 == 0) {
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (-4 == (var4_int ^ -1)) {
                                break L6;
                              } else {
                                if (var4_int == 4) {
                                  break L5;
                                } else {
                                  if (5 == var4_int) {
                                    break L4;
                                  } else {
                                    if (var4_int == 6) {
                                      break L3;
                                    } else {
                                      if (var4_int == 7) {
                                        break L2;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_n = param1.h(255);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                        this.field_D = param1.d(param0 + 17);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      this.field_C = param1.d(123);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    this.field_z = param1.d(param0 + 18);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.field_A = param1.d(param0 + 17);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_q = param1.d(121);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_x = param1.d(param0 ^ 23);
              break L1;
            }
            if (param0 == 107) {
              break L0;
            } else {
              bma.d((byte) -52);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("bma.A(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
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
            stackOut_3_0 = var5;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_4_0 < this.field_n) {
                if (var9 == 0) {
                  L2: {
                    if ((var5 ^ -1) < -1) {
                      var6 = this.field_E;
                      var7 = (jqa.a(4096, var10, -100) + -2048) * this.field_C >> 181698316;
                      var6 = var6 + (var4 * var7 >> 1741053868);
                      this.field_u[var5] = var6 + this.field_u[var5 - 1];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_y[var5][0] = 0;
                  var6 = 0;
                  L3: while (true) {
                    L4: {
                      if (this.field_o <= var6) {
                        break L4;
                      } else {
                        stackOut_13_0 = var6;
                        stackIn_4_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var9 != 0) {
                          continue L1;
                        } else {
                          L5: {
                            if (stackIn_14_0 > 0) {
                              var7 = this.field_r;
                              var8 = (-2048 + jqa.a(4096, var10, -93)) * this.field_D >> 1859393868;
                              var7 = var7 + (var3 * var8 >> -2032791700);
                              this.field_y[var5][var6] = this.field_y[var5][var6 - 1] - -var7;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            stackOut_17_0 = this.field_B[var5];
                            stackOut_17_1 = var6;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if ((this.field_x ^ -1) >= -1) {
                              stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                              stackOut_19_1 = stackIn_19_1;
                              stackOut_19_2 = 4096;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              stackIn_20_2 = stackOut_19_2;
                              break L6;
                            } else {
                              stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                              stackOut_18_1 = stackIn_18_1;
                              stackOut_18_2 = -jqa.a(this.field_x, var10, -120) + 4096;
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_20_1 = stackOut_18_1;
                              stackIn_20_2 = stackOut_18_2;
                              break L6;
                            }
                          }
                          stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                          var6++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.field_y[var5][this.field_o] = 4096;
                    var5++;
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      this.field_u[this.field_n] = 4096;
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.field_u[this.field_n] = 4096;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean d(int param0, int param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 76 / ((-20 - param0) / 40);
        if (-1 != (param1 ^ -1)) {
          if (param1 != pl.a((byte) 64)) {
            if (!dta.field_g[param1]) {
              if (!rd.b(false)) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void d(int param0) {
        int discarded$2 = 0;
        if (param0 != -21771) {
          discarded$2 = bma.d(5, -48, 96);
          field_p = null;
          field_w = null;
          field_v = null;
          field_s = null;
          field_t = null;
          return;
        } else {
          field_p = null;
          field_w = null;
          field_v = null;
          field_s = null;
          field_t = null;
          return;
        }
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
        int discarded$2 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (ej.field_c == param0) {
              stackOut_10_0 = 5890;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (tla.field_c == param0) {
                stackOut_8_0 = 34167;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 != lja.field_j) {
                  if (param0 != pea.field_c) {
                    L1: {
                      if (param1) {
                        break L1;
                      } else {
                        discarded$2 = bma.d(-82, 71, 72);
                        break L1;
                      }
                    }
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_6_0 = 34166;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_3_0 = 34168;
                  stackIn_4_0 = stackOut_3_0;
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
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("bma.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
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
        int[] var3 = null;
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
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        var17 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var19 = this.field_i.a((byte) 46, param1);
          var18 = var19;
          var3 = var18;
          if (this.field_i.field_d) {
            var7 = 0;
            var9 = sj.field_b[param1] + this.field_A;
            L0: while (true) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (-1 >= (var9 ^ -1)) {
                        break L4;
                      } else {
                        var9 += 4096;
                        if (var17 != 0) {
                          break L3;
                        } else {
                          if (var17 == 0) {
                            continue L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: while (true) {
                      if (-4097 <= (var9 ^ -1)) {
                        break L3;
                      } else {
                        var9 -= 4096;
                        if (var17 != 0) {
                          break L2;
                        } else {
                          if (var17 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L6: while (true) {
                    if (var7 >= this.field_n) {
                      break L2;
                    } else {
                      stackOut_15_0 = this.field_u[var7];
                      stackOut_15_1 = var9;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (var17 == 0) {
                        if (stackIn_17_0 > stackIn_17_1) {
                          break L2;
                        } else {
                          var7++;
                          continue L6;
                        }
                      } else {
                        var11 = stackIn_16_0 + stackIn_16_1;
                        break L1;
                      }
                    }
                  }
                }
                var11 = -1 + var7;
                break L1;
              }
              L7: {
                if ((1 & var7) != 0) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L7;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  break L7;
                }
              }
              L8: {
                var12 = stackIn_24_0;
                var15 = this.field_u[var7];
                var16 = this.field_u[-1 + var7];
                if (var16 + this.field_m >= var9) {
                  break L8;
                } else {
                  if (var15 + -this.field_m <= var9) {
                    break L8;
                  } else {
                    var4 = 0;
                    L9: while (true) {
                      if (var4 >= ns.field_g) {
                        return var3;
                      } else {
                        L10: {
                          if (var12 != 0) {
                            stackOut_30_0 = this.field_z;
                            stackIn_31_0 = stackOut_30_0;
                            break L10;
                          } else {
                            stackOut_29_0 = -this.field_z;
                            stackIn_31_0 = stackOut_29_0;
                            break L10;
                          }
                        }
                        var5 = stackIn_31_0;
                        var6 = 0;
                        var8 = ht.field_Fb[var4] - -(this.field_r * var5 >> -1690750356);
                        L11: while (true) {
                          L12: {
                            L13: {
                              L14: {
                                if ((var8 ^ -1) <= -1) {
                                  L15: while (true) {
                                    if ((var8 ^ -1) >= -4097) {
                                      break L14;
                                    } else {
                                      var8 -= 4096;
                                      if (var17 != 0) {
                                        break L13;
                                      } else {
                                        if (var17 == 0) {
                                          continue L15;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var8 += 4096;
                                  if (var17 != 0) {
                                    break L14;
                                  } else {
                                    continue L11;
                                  }
                                }
                              }
                              L16: while (true) {
                                if (var6 >= this.field_o) {
                                  break L13;
                                } else {
                                  stackOut_42_0 = var8;
                                  stackOut_42_1 = this.field_y[var11][var6];
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  if (var17 == 0) {
                                    if (stackIn_44_0 < stackIn_44_1) {
                                      break L13;
                                    } else {
                                      var6++;
                                      continue L16;
                                    }
                                  } else {
                                    var10 = stackIn_43_0 - stackIn_43_1;
                                    break L12;
                                  }
                                }
                              }
                            }
                            var10 = var6 - 1;
                            break L12;
                          }
                          L17: {
                            L18: {
                              var13 = this.field_y[var11][var10];
                              var14 = this.field_y[var11][var6];
                              if (this.field_m + var13 >= var8) {
                                break L18;
                              } else {
                                if (var8 >= var14 - this.field_m) {
                                  break L18;
                                } else {
                                  var3[var4] = this.field_B[var11][var10];
                                  if (var17 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var19[var4] = 0;
                            break L17;
                          }
                          var4++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
              lua.a(var19, 0, ns.field_g, 0);
              if (var17 == 0) {
                return var3;
              } else {
                var4 = 0;
                L19: while (true) {
                  if (var4 >= ns.field_g) {
                    return var3;
                  } else {
                    L20: {
                      if (var12 != 0) {
                        stackOut_61_0 = this.field_z;
                        stackIn_62_0 = stackOut_61_0;
                        break L20;
                      } else {
                        stackOut_60_0 = -this.field_z;
                        stackIn_62_0 = stackOut_60_0;
                        break L20;
                      }
                    }
                    var5 = stackIn_62_0;
                    var6 = 0;
                    var8 = ht.field_Fb[var4] - -(this.field_r * var5 >> -1690750356);
                    L21: while (true) {
                      L22: {
                        L23: {
                          L24: {
                            L25: {
                              if ((var8 ^ -1) <= -1) {
                                break L25;
                              } else {
                                var8 += 4096;
                                if (var17 != 0) {
                                  break L24;
                                } else {
                                  if (var17 == 0) {
                                    continue L21;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            L26: while (true) {
                              if ((var8 ^ -1) >= -4097) {
                                break L24;
                              } else {
                                var8 -= 4096;
                                if (var17 != 0) {
                                  break L23;
                                } else {
                                  if (var17 == 0) {
                                    continue L26;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          L27: while (true) {
                            if (var6 >= this.field_o) {
                              break L23;
                            } else {
                              stackOut_73_0 = var8;
                              stackOut_73_1 = this.field_y[var11][var6];
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_75_1 = stackOut_73_1;
                              stackIn_74_0 = stackOut_73_0;
                              stackIn_74_1 = stackOut_73_1;
                              if (var17 == 0) {
                                if (stackIn_75_0 < stackIn_75_1) {
                                  break L23;
                                } else {
                                  var6++;
                                  continue L27;
                                }
                              } else {
                                var10 = stackIn_74_0 - stackIn_74_1;
                                break L22;
                              }
                            }
                          }
                        }
                        var10 = var6 - 1;
                        break L22;
                      }
                      L28: {
                        L29: {
                          var13 = this.field_y[var11][var10];
                          var14 = this.field_y[var11][var6];
                          if (this.field_m + var13 >= var8) {
                            break L29;
                          } else {
                            if (var8 >= var14 - this.field_m) {
                              break L29;
                            } else {
                              var3[var4] = this.field_B[var11][var10];
                              if (var17 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        var19[var4] = 0;
                        break L28;
                      }
                      var4++;
                      continue L19;
                    }
                  }
                }
              }
            }
          } else {
            return var3;
          }
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
