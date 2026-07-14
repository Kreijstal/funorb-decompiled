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
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var4 = param2;
          if (0 != var4) {
            if (-2 == var4) {
              ((bma) this).field_n = param1.h(255);
              break L0;
            } else {
              if (2 != var4) {
                if (-4 == var4) {
                  ((bma) this).field_C = param1.d(123);
                  break L0;
                } else {
                  if (var4 == 4) {
                    ((bma) this).field_z = param1.d(param0 + 18);
                    break L0;
                  } else {
                    if (5 == var4) {
                      ((bma) this).field_A = param1.d(param0 + 17);
                      break L0;
                    } else {
                      if (var4 == 6) {
                        ((bma) this).field_q = param1.d(121);
                        break L0;
                      } else {
                        if (var4 == 7) {
                          ((bma) this).field_x = param1.d(param0 ^ 23);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                ((bma) this).field_D = param1.d(param0 + 17);
                break L0;
              }
            }
          } else {
            ((bma) this).field_o = param1.h(255);
            break L0;
          }
        }
        L1: {
          if (param0 == 107) {
            break L1;
          } else {
            bma.d((byte) -52);
            break L1;
          }
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
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = new Random((long)((bma) this).field_n);
        ((bma) this).field_E = 4096 / ((bma) this).field_n;
        ((bma) this).field_r = 4096 / ((bma) this).field_o;
        ((bma) this).field_m = ((bma) this).field_q / 2;
        if (param0 >= 46) {
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
                if ((var5 ^ -1) < -1) {
                  var6 = ((bma) this).field_E;
                  var7 = (jqa.a(4096, var10, -100) + -2048) * ((bma) this).field_C >> 181698316;
                  var6 = var6 + (var4 * var7 >> 1741053868);
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
                      var8 = (-2048 + jqa.a(4096, var10, -93)) * ((bma) this).field_D >> 1859393868;
                      var7 = var7 + (var3 * var8 >> -2032791700);
                      ((bma) this).field_y[var5][var6] = ((bma) this).field_y[var5][var6 - 1] - -var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_12_0 = ((bma) this).field_B[var5];
                    stackOut_12_1 = var6;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if ((((bma) this).field_x ^ -1) >= -1) {
                      stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = 4096;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L4;
                    } else {
                      stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = -jqa.a(((bma) this).field_x, var10, -120) + 4096;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
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
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
        if (param0 != -21771) {
            int discarded$0 = bma.d(5, -48, 96);
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
        if (ej.field_c == param0) {
          return 5890;
        } else {
          if (tla.field_c == param0) {
            return 34167;
          } else {
            if (param0 != lja.field_j) {
              if (param0 != pea.field_c) {
                L0: {
                  if (param1) {
                    break L0;
                  } else {
                    int discarded$2 = bma.d(-82, 71, 72);
                    break L0;
                  }
                }
                throw new IllegalArgumentException();
              } else {
                return 34166;
              }
            } else {
              return 34168;
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
                if (-1 >= var9) {
                  L2: while (true) {
                    if (-4097 >= var9) {
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
                          if (var16 + ((bma) this).field_m >= var9) {
                            break L6;
                          } else {
                            if (var15 + -((bma) this).field_m > var9) {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= ns.field_g) {
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
                                  var8 = ht.field_Fb[var4] - -(((bma) this).field_r * var5 >> -1690750356);
                                  L9: while (true) {
                                    if ((var8 ^ -1) <= -1) {
                                      L10: while (true) {
                                        if ((var8 ^ -1) >= -4097) {
                                          L11: while (true) {
                                            L12: {
                                              if (var6 >= ((bma) this).field_o) {
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
                                              var10 = var6 - 1;
                                              var13 = ((bma) this).field_y[var11][var10];
                                              var14 = ((bma) this).field_y[var11][var6];
                                              if (((bma) this).field_m + var13 >= var8) {
                                                break L13;
                                              } else {
                                                if (var8 >= var14 - ((bma) this).field_m) {
                                                  break L13;
                                                } else {
                                                  var3[var4] = ((bma) this).field_B[var11][var10];
                                                  var4++;
                                                  continue L7;
                                                }
                                              }
                                            }
                                            var21[var4] = 0;
                                            var4++;
                                            continue L7;
                                          }
                                        } else {
                                          // wide iinc 8 -4096
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      // wide iinc 8 4096
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
                      // wide iinc 9 -4096
                      continue L2;
                    }
                  }
                } else {
                  // wide iinc 9 4096
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
