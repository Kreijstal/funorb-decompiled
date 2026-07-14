/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends ji {
    private int[] field_M;
    private int field_K;
    static int field_I;
    private int field_N;
    static String field_z;
    private int field_Q;
    private int field_C;
    static ie field_H;
    private int[][] field_O;
    private int field_G;
    private int field_J;
    private int field_E;
    private int[][] field_P;
    static int field_B;
    private int field_L;
    static String field_D;
    private int field_y;
    private int field_R;
    static int field_A;
    private int field_F;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ri.b(param1, 30834);
        if (param3 <= 23) {
            field_B = 0;
        }
        cj.b(param1, -1, param0, param2);
    }

    final static wp a(String param0, int param1) {
        if (param0 != null) {
            // if_icmpeq L15
        } else {
            return jr.field_e;
        }
        int var2 = param0.indexOf('@');
        if (!((var2 ^ -1) != 0)) {
            return ab.field_a;
        }
        String var3 = param0.substring(0, var2);
        if (param1 != -6675) {
            Object var6 = null;
            wp discarded$0 = ol.a((String) null, -122);
        }
        String var4 = param0.substring(var2 - -1);
        wp var5 = qn.a(var3, 0);
        if (!(var5 == null)) {
            return var5;
        }
        return ug.a(var4, (byte) -77);
    }

    final void a(int param0) {
        if (param0 >= -98) {
            field_I = -9;
        }
        this.g(-95);
    }

    public ol() {
        super(0, true);
        ((ol) this).field_N = 409;
        ((ol) this).field_C = 4;
        ((ol) this).field_Q = 1024;
        ((ol) this).field_J = 81;
        ((ol) this).field_L = 1024;
        ((ol) this).field_R = 8;
        ((ol) this).field_y = 204;
        ((ol) this).field_E = 0;
    }

    private final void g(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        Random var11 = null;
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
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          var10 = new Random((long)((ol) this).field_R);
          var11 = var10;
          ((ol) this).field_K = ((ol) this).field_J / 2;
          ((ol) this).field_G = 4096 / ((ol) this).field_C;
          ((ol) this).field_F = 4096 / ((ol) this).field_R;
          var3 = ((ol) this).field_G / 2;
          ((ol) this).field_O = new int[((ol) this).field_R][((ol) this).field_C + 1];
          ((ol) this).field_M = new int[1 + ((ol) this).field_R];
          if (param0 <= -94) {
            break L0;
          } else {
            ((ol) this).field_K = 75;
            break L0;
          }
        }
        var4 = ((ol) this).field_F / 2;
        ((ol) this).field_P = new int[((ol) this).field_R][((ol) this).field_C];
        ((ol) this).field_M[0] = 0;
        var5 = 0;
        L1: while (true) {
          if (var5 >= ((ol) this).field_R) {
            ((ol) this).field_M[((ol) this).field_R] = 4096;
            return;
          } else {
            L2: {
              if (var5 <= 0) {
                break L2;
              } else {
                var6 = ((ol) this).field_F;
                var7 = (-2048 + mj.a(-119, var11, 4096)) * ((ol) this).field_y >> 502675180;
                var6 = var6 + (var7 * var4 >> -1441961908);
                ((ol) this).field_M[var5] = ((ol) this).field_M[-1 + var5] + var6;
                break L2;
              }
            }
            ((ol) this).field_O[var5][0] = 0;
            var6 = 0;
            L3: while (true) {
              if (((ol) this).field_C <= var6) {
                ((ol) this).field_O[var5][((ol) this).field_C] = 4096;
                var5++;
                continue L1;
              } else {
                L4: {
                  if (var6 <= 0) {
                    break L4;
                  } else {
                    var7 = ((ol) this).field_G;
                    var8 = (-2048 + mj.a(-104, var11, 4096)) * ((ol) this).field_N >> 1246773708;
                    var7 = var7 + (var3 * var8 >> 1485044780);
                    ((ol) this).field_O[var5][var6] = ((ol) this).field_O[var5][-1 + var6] + var7;
                    break L4;
                  }
                }
                L5: {
                  stackOut_10_0 = ((ol) this).field_P[var5];
                  stackOut_10_1 = var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if ((((ol) this).field_Q ^ -1) < -1) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = -mj.a(-105, var10, ((ol) this).field_Q) + 4096;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L5;
                  } else {
                    stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 4096;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L5;
                  }
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (0 == var4) {
            ((ol) this).field_C = param2.h(-11);
            break L0;
          } else {
            if (var4 == -2) {
              ((ol) this).field_R = param2.h(-11);
              break L0;
            } else {
              if (-3 != var4) {
                if (-4 != (var4 ^ -1)) {
                  if (var4 != -5) {
                    if (-6 == var4) {
                      ((ol) this).field_E = param2.a((byte) -11);
                      break L0;
                    } else {
                      if (var4 == -7) {
                        ((ol) this).field_J = param2.a((byte) -11);
                        break L0;
                      } else {
                        if (-8 == var4) {
                          ((ol) this).field_Q = param2.a((byte) -11);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    ((ol) this).field_L = param2.a((byte) -11);
                    break L0;
                  }
                } else {
                  ((ol) this).field_y = param2.a((byte) -11);
                  break L0;
                }
              } else {
                ((ol) this).field_N = param2.a((byte) -11);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 110) {
            break L1;
          } else {
            field_A = -77;
            break L1;
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
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var17 = Vertigo2.field_L ? 1 : 0;
        var21 = ((ol) this).field_x.a(param0, (byte) 68);
        var20 = var21;
        var19 = var20;
        var18 = var19;
        var3 = var18;
        if (param1 > 91) {
          L0: {
            if (!((ol) this).field_x.field_i) {
              break L0;
            } else {
              var7 = 0;
              var9 = lf.field_y[param0] + ((ol) this).field_E;
              L1: while (true) {
                if (var9 >= 0) {
                  L2: while (true) {
                    if (var9 <= 4096) {
                      L3: while (true) {
                        L4: {
                          if (((ol) this).field_R <= var7) {
                            break L4;
                          } else {
                            if (((ol) this).field_M[var7] <= var9) {
                              var7++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var11 = var7 + -1;
                          if (-1 != (var7 & 1 ^ -1)) {
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            break L5;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = stackIn_15_0;
                          var15 = ((ol) this).field_M[var7];
                          var16 = ((ol) this).field_M[var7 + -1];
                          if (((ol) this).field_K + var16 >= var9) {
                            break L6;
                          } else {
                            if (var15 + -((ol) this).field_K <= var9) {
                              break L6;
                            } else {
                              var4 = 0;
                              L7: while (true) {
                                if (we.field_M <= var4) {
                                  break L0;
                                } else {
                                  L8: {
                                    var6 = 0;
                                    if (var12 != 0) {
                                      stackOut_21_0 = ((ol) this).field_L;
                                      stackIn_22_0 = stackOut_21_0;
                                      break L8;
                                    } else {
                                      stackOut_20_0 = -((ol) this).field_L;
                                      stackIn_22_0 = stackOut_20_0;
                                      break L8;
                                    }
                                  }
                                  var5 = stackIn_22_0;
                                  var8 = rh.field_O[var4] - -(((ol) this).field_G * var5 >> -2006242548);
                                  L9: while (true) {
                                    if (var8 >= 0) {
                                      L10: while (true) {
                                        if (var8 <= 4096) {
                                          L11: while (true) {
                                            L12: {
                                              if (((ol) this).field_C <= var6) {
                                                break L12;
                                              } else {
                                                if (((ol) this).field_O[var11][var6] <= var8) {
                                                  var6++;
                                                  continue L11;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              var10 = -1 + var6;
                                              var13 = ((ol) this).field_O[var11][var10];
                                              var14 = ((ol) this).field_O[var11][var6];
                                              if (var8 <= var13 + ((ol) this).field_K) {
                                                break L13;
                                              } else {
                                                if (-((ol) this).field_K + var14 > var8) {
                                                  var3[var4] = ((ol) this).field_P[var11][var10];
                                                  var4++;
                                                  continue L7;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var21 = var20;
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
                            }
                          }
                        }
                        var21 = var20;
                        qq.a(var21, 0, we.field_M, 0);
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

    final static be a(int param0, int param1, int param2, int param3) {
        be var4 = new be();
        int var5 = 59 / ((param0 - 51) / 44);
        var4.field_o = new int[param3];
        var4.field_r = param2;
        mb.field_v.a((li) (Object) var4, false);
        ec.a(param1, (byte) 126, var4);
        return var4;
    }

    public static void h(int param0) {
        if (param0 <= 126) {
            be discarded$0 = ol.a(98, -118, 23, -57);
        }
        field_H = null;
        field_D = null;
        field_z = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 4;
        field_z = "Report abuse";
        field_B = -1;
        field_D = "Hide chat";
    }
}
