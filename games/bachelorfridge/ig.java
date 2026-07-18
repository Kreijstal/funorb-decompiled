/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ig extends k {
    private int field_x;
    private int field_v;
    private int[][] field_r;
    private int field_o;
    private int field_l;
    private int field_k;
    private int[][] field_p;
    private int field_q;
    private int field_s;
    private int field_y;
    private int field_t;
    static pf field_m;
    private int field_w;
    private int[] field_u;
    private int field_n;

    private final void b() {
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
        var9 = BachelorFridge.field_y;
        var10 = new Random((long)((ig) this).field_v);
        var11 = var10;
        ((ig) this).field_l = 4096 / ((ig) this).field_v;
        ((ig) this).field_n = ((ig) this).field_w / 2;
        ((ig) this).field_q = 4096 / ((ig) this).field_x;
        var3 = ((ig) this).field_q / 2;
        ((ig) this).field_r = new int[((ig) this).field_v][1 + ((ig) this).field_x];
        ((ig) this).field_u = new int[((ig) this).field_v + 1];
        ((ig) this).field_p = new int[((ig) this).field_v][((ig) this).field_x];
        var4 = ((ig) this).field_l / 2;
        ((ig) this).field_u[0] = 0;
        var5 = 0;
        L0: while (true) {
          if (((ig) this).field_v <= var5) {
            ((ig) this).field_u[((ig) this).field_v] = 4096;
            return;
          } else {
            L1: {
              if (var5 > 0) {
                var6 = ((ig) this).field_l;
                var7 = (kla.a(4096, var11, -2147483648) + -2048) * ((ig) this).field_o >> 12;
                var6 = var6 + (var4 * var7 >> 12);
                ((ig) this).field_u[var5] = ((ig) this).field_u[-1 + var5] - -var6;
                break L1;
              } else {
                break L1;
              }
            }
            ((ig) this).field_r[var5][0] = 0;
            var6 = 0;
            L2: while (true) {
              if (((ig) this).field_x <= var6) {
                ((ig) this).field_r[var5][((ig) this).field_x] = 4096;
                var5++;
                continue L0;
              } else {
                L3: {
                  if (var6 > 0) {
                    var7 = ((ig) this).field_q;
                    var8 = (kla.a(4096, var11, -2147483648) - 2048) * ((ig) this).field_k >> 12;
                    var7 = var7 + (var3 * var8 >> 12);
                    ((ig) this).field_r[var5][var6] = var7 + ((ig) this).field_r[var5][var6 + -1];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackOut_10_0 = ((ig) this).field_p[var5];
                  stackOut_10_1 = var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((ig) this).field_s > 0) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = -kla.a(((ig) this).field_s, var10, -2147483648) + 4096;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L4;
                  } else {
                    stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 4096;
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

    public ig() {
        super(0, true);
        ((ig) this).field_o = 204;
        ((ig) this).field_s = 1024;
        ((ig) this).field_v = 8;
        ((ig) this).field_k = 409;
        ((ig) this).field_y = 1024;
        ((ig) this).field_t = 0;
        ((ig) this).field_w = 81;
        ((ig) this).field_x = 4;
    }

    public static void d() {
        field_m = null;
    }

    final static vb a(int param0, lu param1) {
        RuntimeException var2 = null;
        vb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new vb(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.a(3), param1.b(16711935));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ig.C(").append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == -71) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  ((ig) this).field_x = param1.b(16711935);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (var4_int == 2) {
                      ((ig) this).field_k = param1.e((byte) 103);
                      break L1;
                    } else {
                      if (var4_int != 3) {
                        if (var4_int != 4) {
                          if (var4_int != 5) {
                            if (var4_int != 6) {
                              if (7 != var4_int) {
                                break L1;
                              } else {
                                ((ig) this).field_s = param1.e((byte) 99);
                                break L1;
                              }
                            } else {
                              ((ig) this).field_w = param1.e((byte) 52);
                              break L1;
                            }
                          } else {
                            ((ig) this).field_t = param1.e((byte) 56);
                            break L1;
                          }
                        } else {
                          ((ig) this).field_y = param1.e((byte) 59);
                          break L1;
                        }
                      } else {
                        ((ig) this).field_o = param1.e((byte) 123);
                        break L1;
                      }
                    }
                  } else {
                    ((ig) this).field_v = param1.b(16711935);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("ig.E(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final static cj a(lu param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce stackIn_5_0 = null;
        hba stackIn_9_0 = null;
        vja stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_4_0 = null;
        hba stackOut_8_0 = null;
        vja stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var2_int = param0.e((byte) 64);
            if (3 == ((t) (Object) al.a(103, var2_int)).field_p) {
              stackOut_4_0 = kfa.a(param0, 4096, var2_int);
              stackIn_5_0 = stackOut_4_0;
              return (cj) (Object) stackIn_5_0;
            } else {
              if (((t) (Object) al.a(118, var2_int)).field_p == 2) {
                int discarded$2 = -116;
                stackOut_8_0 = nh.a(param0, var2_int);
                stackIn_9_0 = stackOut_8_0;
                return (cj) (Object) stackIn_9_0;
              } else {
                stackOut_10_0 = new vja(var2_int, param0);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ig.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 104 + ')');
        }
        return (cj) (Object) stackIn_11_0;
    }

    final int[] a(int param0, int param1) {
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
        L0: {
          var17 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((ig) this).field_y = 126;
            break L0;
          }
        }
        L1: {
          var21 = ((ig) this).field_j.a(param0, -1);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var3 = var18;
          if (!((ig) this).field_j.field_m) {
            break L1;
          } else {
            var7 = 0;
            var9 = tj.field_f[param0] - -((ig) this).field_t;
            L2: while (true) {
              if (var9 >= 0) {
                L3: while (true) {
                  if (var9 <= 4096) {
                    L4: while (true) {
                      L5: {
                        if (var7 >= ((ig) this).field_v) {
                          break L5;
                        } else {
                          if (((ig) this).field_u[var7] <= var9) {
                            var7++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var11 = -1 + var7;
                        if (0 != (1 & var7)) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L6;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L6;
                        }
                      }
                      L7: {
                        var12 = stackIn_15_0;
                        var15 = ((ig) this).field_u[var7];
                        var16 = ((ig) this).field_u[var7 - 1];
                        if (var9 <= var16 - -((ig) this).field_n) {
                          break L7;
                        } else {
                          if (var9 >= -((ig) this).field_n + var15) {
                            break L7;
                          } else {
                            var4 = 0;
                            L8: while (true) {
                              if (hh.field_d <= var4) {
                                break L1;
                              } else {
                                L9: {
                                  if (var12 == 0) {
                                    stackOut_21_0 = -((ig) this).field_y;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L9;
                                  } else {
                                    stackOut_20_0 = ((ig) this).field_y;
                                    stackIn_22_0 = stackOut_20_0;
                                    break L9;
                                  }
                                }
                                var5 = stackIn_22_0;
                                var6 = 0;
                                var8 = jq.field_k[var4] - -(((ig) this).field_q * var5 >> 12);
                                L10: while (true) {
                                  if (var8 >= 0) {
                                    L11: while (true) {
                                      if (var8 <= 4096) {
                                        L12: while (true) {
                                          L13: {
                                            if (((ig) this).field_x <= var6) {
                                              break L13;
                                            } else {
                                              if (var8 < ((ig) this).field_r[var11][var6]) {
                                                break L13;
                                              } else {
                                                var6++;
                                                continue L12;
                                              }
                                            }
                                          }
                                          L14: {
                                            var10 = -1 + var6;
                                            var13 = ((ig) this).field_r[var11][var10];
                                            var14 = ((ig) this).field_r[var11][var6];
                                            if (var8 <= ((ig) this).field_n + var13) {
                                              break L14;
                                            } else {
                                              if (var14 - ((ig) this).field_n <= var8) {
                                                break L14;
                                              } else {
                                                var3[var4] = ((ig) this).field_p[var11][var10];
                                                var4++;
                                                continue L8;
                                              }
                                            }
                                          }
                                          var21 = var20;
                                          var21[var4] = 0;
                                          var4++;
                                          continue L8;
                                        }
                                      } else {
                                        var8 -= 4096;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var8 += 4096;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var21 = var20;
                      bl.a(var21, 0, hh.field_d, 0);
                      break L1;
                    }
                  } else {
                    var9 -= 4096;
                    continue L3;
                  }
                }
              } else {
                var9 += 4096;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    final void d(byte param0) {
        if (param0 != -68) {
            return;
        }
        int discarded$0 = 1;
        this.b();
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = BachelorFridge.field_y;
        int var4 = param1.indexOf(param2);
        if (param0 != -19384) {
            Object var6 = null;
            String discarded$0 = ig.a(7, (String) null, (String) null, (String) null);
        }
        while (-1 != var4) {
            param1 = param1.substring(0, var4) + param3 + param1.substring(var4 + param2.length());
            var4 = param1.indexOf(param2, var4 + param3.length());
        }
        return param1;
    }

    static {
    }
}
