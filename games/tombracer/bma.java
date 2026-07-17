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
        aca var1 = (aca) (Object) io.field_d.f(-80);
        if (var1 == null) {
            dea.a(60);
            return;
        }
        kh var2 = vc.field_q;
        if (param0 < 23) {
            field_t = null;
        }
        int discarded$0 = var2.e(-16);
        int discarded$1 = var2.e(-118);
        int discarded$2 = var2.e(112);
        int discarded$3 = var2.e(-29);
        var1.p(71);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  ((bma) this).field_n = param1.h(255);
                  break L1;
                } else {
                  if (2 != var4_int) {
                    if (var4_int == 3) {
                      ((bma) this).field_C = param1.d(123);
                      break L1;
                    } else {
                      if (var4_int == 4) {
                        ((bma) this).field_z = param1.d(param0 + 18);
                        break L1;
                      } else {
                        if (5 == var4_int) {
                          ((bma) this).field_A = param1.d(param0 + 17);
                          break L1;
                        } else {
                          if (var4_int == 6) {
                            ((bma) this).field_q = param1.d(121);
                            break L1;
                          } else {
                            if (var4_int == 7) {
                              ((bma) this).field_x = param1.d(param0 ^ 23);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    ((bma) this).field_D = param1.d(param0 + 17);
                    break L1;
                  }
                }
              } else {
                ((bma) this).field_o = param1.h(255);
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
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("bma.A(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
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
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = new Random((long)((bma) this).field_n);
        ((bma) this).field_E = 4096 / ((bma) this).field_n;
        ((bma) this).field_r = 4096 / ((bma) this).field_o;
        ((bma) this).field_m = ((bma) this).field_q / 2;
        var3 = ((bma) this).field_r / 2;
        ((bma) this).field_u = new int[((bma) this).field_n - -1];
        ((bma) this).field_B = new int[((bma) this).field_n][((bma) this).field_o];
        var4 = ((bma) this).field_E / 2;
        ((bma) this).field_y = new int[((bma) this).field_n][1 + ((bma) this).field_o];
        ((bma) this).field_u[0] = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((bma) this).field_n) {
            ((bma) this).field_u[((bma) this).field_n] = 4096;
            return;
          } else {
            L1: {
              if (var5 > 0) {
                var6 = ((bma) this).field_E;
                var7 = (jqa.a(4096, var10, -100) + -2048) * ((bma) this).field_C >> 12;
                var6 = var6 + (var4 * var7 >> 12);
                ((bma) this).field_u[var5] = var6 + ((bma) this).field_u[var5 - 1];
                break L1;
              } else {
                break L1;
              }
            }
            ((bma) this).field_y[var5][0] = 0;
            var6 = 0;
            L2: while (true) {
              if (((bma) this).field_o <= var6) {
                ((bma) this).field_y[var5][((bma) this).field_o] = 4096;
                var5++;
                continue L0;
              } else {
                L3: {
                  if (var6 > 0) {
                    var7 = ((bma) this).field_r;
                    var8 = (-2048 + jqa.a(4096, var10, -93)) * ((bma) this).field_D >> 12;
                    var7 = var7 + (var3 * var8 >> 12);
                    ((bma) this).field_y[var5][var6] = ((bma) this).field_y[var5][var6 - 1] - -var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackOut_10_0 = ((bma) this).field_B[var5];
                  stackOut_10_1 = var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((bma) this).field_x <= 0) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 4096;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L4;
                  } else {
                    stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = -jqa.a(((bma) this).field_x, var10, -120) + 4096;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L4;
                  }
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                var6++;
                continue L2;
              }
            }
          }
        }
    }

    final static boolean d(int param0, int param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((-20 - param0) / 40);
            if (param1 == 0) {
              break L1;
            } else {
              if (param1 == pl.a((byte) 64)) {
                break L1;
              } else {
                if (dta.field_g[param1]) {
                  break L1;
                } else {
                  if (rd.b(false)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
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
        ((bma) this).field_n = 8;
        ((bma) this).field_q = 81;
        ((bma) this).field_C = 204;
        ((bma) this).field_A = 0;
        ((bma) this).field_D = 409;
        ((bma) this).field_z = 1024;
        ((bma) this).field_o = 4;
        ((bma) this).field_x = 1024;
    }

    final static int a(fp param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          if (ej.field_c == param0) {
            stackOut_10_0 = 5890;
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0;
          } else {
            if (tla.field_c == param0) {
              stackOut_8_0 = 34167;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (param0 != lja.field_j) {
                if (param0 != pea.field_c) {
                  throw new IllegalArgumentException();
                } else {
                  stackOut_6_0 = 34166;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                stackOut_3_0 = 34168;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("bma.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L0;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 1 + 41);
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
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var17 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var21 = ((bma) this).field_i.a((byte) 46, param1);
            var20 = var21;
            var19 = var20;
            var18 = var19;
            var3 = var18;
            if (!((bma) this).field_i.field_d) {
              break L0;
            } else {
              var7 = 0;
              var9 = sj.field_b[param1] + ((bma) this).field_A;
              L1: while (true) {
                if (var9 >= 0) {
                  L2: while (true) {
                    if (var9 <= 4096) {
                      L3: while (true) {
                        L4: {
                          if (var7 >= ((bma) this).field_n) {
                            break L4;
                          } else {
                            if (((bma) this).field_u[var7] > var9) {
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
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L5;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = stackIn_14_0;
                          var15 = ((bma) this).field_u[var7];
                          var16 = ((bma) this).field_u[-1 + var7];
                          if (~(var16 + ((bma) this).field_m) <= ~var9) {
                            break L6;
                          } else {
                            if (~(var15 + -((bma) this).field_m) < ~var9) {
                              var4 = 0;
                              L7: while (true) {
                                if (~var4 <= ~ns.field_g) {
                                  break L0;
                                } else {
                                  L8: {
                                    if (var12 != 0) {
                                      stackOut_22_0 = ((bma) this).field_z;
                                      stackIn_23_0 = stackOut_22_0;
                                      break L8;
                                    } else {
                                      stackOut_21_0 = -((bma) this).field_z;
                                      stackIn_23_0 = stackOut_21_0;
                                      break L8;
                                    }
                                  }
                                  var5 = stackIn_23_0;
                                  var6 = 0;
                                  var8 = ht.field_Fb[var4] - -(((bma) this).field_r * var5 >> 12);
                                  L9: while (true) {
                                    if (var8 >= 0) {
                                      L10: while (true) {
                                        if (var8 <= 4096) {
                                          L11: while (true) {
                                            L12: {
                                              if (~var6 <= ~((bma) this).field_o) {
                                                break L12;
                                              } else {
                                                if (var8 < ((bma) this).field_y[var11][var6]) {
                                                  break L12;
                                                } else {
                                                  var6++;
                                                  continue L11;
                                                }
                                              }
                                            }
                                            L13: {
                                              L14: {
                                                var10 = var6 - 1;
                                                var13 = ((bma) this).field_y[var11][var10];
                                                var14 = ((bma) this).field_y[var11][var6];
                                                if (~(((bma) this).field_m + var13) <= ~var8) {
                                                  break L14;
                                                } else {
                                                  if (~var8 <= ~(var14 - ((bma) this).field_m)) {
                                                    break L14;
                                                  } else {
                                                    var3[var4] = ((bma) this).field_B[var11][var10];
                                                    break L13;
                                                  }
                                                }
                                              }
                                              var21[var4] = 0;
                                              break L13;
                                            }
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
                        lua.a(var21, 0, ns.field_g, 0);
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
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new gb();
        field_t = new int[5];
        field_p = new int[8192];
    }
}
