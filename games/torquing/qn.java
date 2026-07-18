/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends am {
    private int field_B;
    private int[][] field_z;
    private int field_C;
    private int[] field_v;
    private int field_w;
    static String field_E;
    private int field_y;
    private int field_t;
    private int field_A;
    private int field_D;
    private int[][] field_H;
    private int field_s;
    private int field_F;
    private int field_u;
    private int field_x;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (param0) {
            var4 += 2;
        }
        if (param1 != 2) {
            qn.a(true);
        }
        if (!(!param2)) {
            var4++;
        }
        return dn.field_f[var4];
    }

    private final void b(boolean param0) {
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
        var9 = Torquing.field_u;
        var10 = new Random((long)((qn) this).field_w);
        var11 = var10;
        ((qn) this).field_y = 4096 / ((qn) this).field_s;
        ((qn) this).field_F = 4096 / ((qn) this).field_w;
        ((qn) this).field_A = ((qn) this).field_t / 2;
        var3 = ((qn) this).field_y / 2;
        ((qn) this).field_H = new int[((qn) this).field_w][((qn) this).field_s];
        var4 = ((qn) this).field_F / 2;
        ((qn) this).field_z = new int[((qn) this).field_w][1 + ((qn) this).field_s];
        ((qn) this).field_v = new int[1 + ((qn) this).field_w];
        ((qn) this).field_v[0] = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((qn) this).field_w) {
            ((qn) this).field_v[((qn) this).field_w] = 4096;
            return;
          } else {
            L1: {
              if (var5 > 0) {
                var6 = ((qn) this).field_F;
                var7 = (va.a(4096, (byte) 127, var11) - 2048) * ((qn) this).field_D >> 12;
                var6 = var6 + (var4 * var7 >> 12);
                ((qn) this).field_v[var5] = var6 + ((qn) this).field_v[var5 + -1];
                break L1;
              } else {
                break L1;
              }
            }
            ((qn) this).field_z[var5][0] = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= ((qn) this).field_s) {
                ((qn) this).field_z[var5][((qn) this).field_s] = 4096;
                var5++;
                continue L0;
              } else {
                L3: {
                  if (var6 > 0) {
                    var7 = ((qn) this).field_y;
                    var8 = (-2048 + va.a(4096, (byte) 127, var11)) * ((qn) this).field_C >> 12;
                    var7 = var7 + (var3 * var8 >> 12);
                    ((qn) this).field_z[var5][var6] = var7 + ((qn) this).field_z[var5][-1 + var6];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackOut_10_0 = ((qn) this).field_H[var5];
                  stackOut_10_1 = var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((qn) this).field_x > 0) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = -va.a(((qn) this).field_x, (byte) 121, var10) + 4096;
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

    final void a(byte param0) {
        this.b(false);
        if (param0 < 123) {
            String discarded$0 = qn.a(true, -8, false, false);
        }
    }

    final void a(fj param0, int param1, int param2) {
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
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                var4_int = param2;
                if (0 != var4_int) {
                  if (var4_int == 1) {
                    ((qn) this).field_w = param0.i((byte) -101);
                    break L1;
                  } else {
                    if (var4_int == 2) {
                      ((qn) this).field_C = param0.i(7088);
                      break L1;
                    } else {
                      if (var4_int == 3) {
                        ((qn) this).field_D = param0.i(param1 ^ 7059);
                        break L1;
                      } else {
                        if (var4_int == 4) {
                          ((qn) this).field_u = param0.i(7088);
                          break L1;
                        } else {
                          if (var4_int != 5) {
                            if (6 == var4_int) {
                              ((qn) this).field_t = param0.i(7088);
                              break L1;
                            } else {
                              if (var4_int != 7) {
                                break L1;
                              } else {
                                ((qn) this).field_x = param0.i(7088);
                                break L1;
                              }
                            }
                          } else {
                            ((qn) this).field_B = param0.i(7088);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((qn) this).field_s = param0.i((byte) -101);
                  break L1;
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
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("qn.H(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_E = null;
        if (param0) {
            qn.a(true);
        }
    }

    public qn() {
        super(0, true);
        ((qn) this).field_B = 0;
        ((qn) this).field_t = 81;
        ((qn) this).field_D = 204;
        ((qn) this).field_C = 409;
        ((qn) this).field_w = 8;
        ((qn) this).field_u = 1024;
        ((qn) this).field_s = 4;
        ((qn) this).field_x = 1024;
    }

    final int[] a(byte param0, int param1) {
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
        int stackIn_24_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var17 = Torquing.field_u;
          var21 = ((qn) this).field_l.a(param1, 25657);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var3 = var18;
          if (param0 >= 86) {
            break L0;
          } else {
            ((qn) this).field_s = -48;
            break L0;
          }
        }
        L1: {
          if (((qn) this).field_l.field_b) {
            var7 = 0;
            var9 = dp.field_a[param1] - -((qn) this).field_B;
            L2: while (true) {
              if (0 <= var9) {
                L3: while (true) {
                  if (var9 <= 4096) {
                    L4: while (true) {
                      L5: {
                        if (((qn) this).field_w <= var7) {
                          break L5;
                        } else {
                          if (((qn) this).field_v[var7] > var9) {
                            break L5;
                          } else {
                            var7++;
                            continue L4;
                          }
                        }
                      }
                      L6: {
                        var11 = -1 + var7;
                        if ((var7 & 1) != 0) {
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
                        var15 = ((qn) this).field_v[var7];
                        var16 = ((qn) this).field_v[-1 + var7];
                        if (((qn) this).field_A + var16 >= var9) {
                          break L7;
                        } else {
                          if (-((qn) this).field_A + var15 > var9) {
                            var4 = 0;
                            L8: while (true) {
                              if (var4 >= ci.field_c) {
                                break L1;
                              } else {
                                L9: {
                                  if (var12 != 0) {
                                    stackOut_23_0 = ((qn) this).field_u;
                                    stackIn_24_0 = stackOut_23_0;
                                    break L9;
                                  } else {
                                    stackOut_22_0 = -((qn) this).field_u;
                                    stackIn_24_0 = stackOut_22_0;
                                    break L9;
                                  }
                                }
                                var5 = stackIn_24_0;
                                var6 = 0;
                                var8 = (((qn) this).field_y * var5 >> 12) + q.field_b[var4];
                                L10: while (true) {
                                  if (var8 >= 0) {
                                    L11: while (true) {
                                      if (var8 <= 4096) {
                                        L12: while (true) {
                                          L13: {
                                            if (((qn) this).field_s <= var6) {
                                              break L13;
                                            } else {
                                              if (~((qn) this).field_z[var11][var6] >= ~var8) {
                                                var6++;
                                                continue L12;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            L15: {
                                              var10 = -1 + var6;
                                              var13 = ((qn) this).field_z[var11][var10];
                                              var14 = ((qn) this).field_z[var11][var6];
                                              if (~(var13 + ((qn) this).field_A) <= ~var8) {
                                                break L15;
                                              } else {
                                                if (-((qn) this).field_A + var14 <= var8) {
                                                  break L15;
                                                } else {
                                                  var3[var4] = ((qn) this).field_H[var11][var10];
                                                  break L14;
                                                }
                                              }
                                            }
                                            var21[var4] = 0;
                                            break L14;
                                          }
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
                          } else {
                            break L7;
                          }
                        }
                      }
                      dk.a(var21, 0, ci.field_c, 0);
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
          } else {
            break L1;
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Confirm Email:";
    }
}
