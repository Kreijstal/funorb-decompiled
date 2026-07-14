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
        if (param0) {
          ((ig) this).field_u[0] = 0;
          var5 = 0;
          L0: while (true) {
            if (((ig) this).field_v <= var5) {
              ((ig) this).field_u[((ig) this).field_v] = 4096;
              return;
            } else {
              L1: {
                if (-1 > (var5 ^ -1)) {
                  var6 = ((ig) this).field_l;
                  var7 = (kla.a(4096, var11, -2147483648) + -2048) * ((ig) this).field_o >> -34972692;
                  var6 = var6 + (var4 * var7 >> -196518356);
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
                    if (-1 > (var6 ^ -1)) {
                      var7 = ((ig) this).field_q;
                      var8 = (kla.a(4096, var11, -2147483648) - 2048) * ((ig) this).field_k >> -200560020;
                      var7 = var7 + (var3 * var8 >> -657443380);
                      ((ig) this).field_r[var5][var6] = var7 + ((ig) this).field_r[var5][var6 + -1];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_12_0 = ((ig) this).field_p[var5];
                    stackOut_12_1 = var6;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (-1 > (((ig) this).field_s ^ -1)) {
                      stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = -kla.a(((ig) this).field_s, var10, -2147483648) + 4096;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L4;
                    } else {
                      stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = 4096;
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

    public static void d(int param0) {
        if (param0 != 0) {
            field_m = null;
        }
        field_m = null;
    }

    final static vb a(int param0, lu param1) {
        if (param0 != 0) {
            field_m = null;
        }
        return new vb(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.a(param0 ^ 3), param1.b(16711935));
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 == -71) {
          L0: {
            var4 = param2;
            if (var4 == 0) {
              ((ig) this).field_x = param1.b(16711935);
              break L0;
            } else {
              if (var4 != 1) {
                if (var4 == 2) {
                  ((ig) this).field_k = param1.e((byte) 103);
                  break L0;
                } else {
                  if (var4 != -4) {
                    if (-5 != var4) {
                      if (var4 != 5) {
                        if (var4 != 6) {
                          if (7 != var4) {
                            break L0;
                          } else {
                            ((ig) this).field_s = param1.e((byte) 99);
                            break L0;
                          }
                        } else {
                          ((ig) this).field_w = param1.e((byte) 52);
                          break L0;
                        }
                      } else {
                        ((ig) this).field_t = param1.e((byte) 56);
                        break L0;
                      }
                    } else {
                      ((ig) this).field_y = param1.e((byte) 59);
                      break L0;
                    }
                  } else {
                    ((ig) this).field_o = param1.e((byte) 123);
                    break L0;
                  }
                }
              } else {
                ((ig) this).field_v = param1.b(16711935);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static cj a(lu param0, int param1) {
        if (param1 <= 51) {
            return null;
        }
        int var2 = param0.e((byte) 64);
        if (!(3 != ((t) (Object) al.a(103, var2)).field_p)) {
            return (cj) (Object) kfa.a(param0, 4096, var2);
        }
        if (!(((t) (Object) al.a(118, var2)).field_p != 2)) {
            return (cj) (Object) nh.a(param0, var2, (byte) -116);
        }
        return (cj) (Object) new vja(var2, param0);
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
                                var8 = jq.field_k[var4] - -(((ig) this).field_q * var5 >> 1696244748);
                                L10: while (true) {
                                  if (var8 >= 0) {
                                    L11: while (true) {
                                      if ((var8 ^ -1) >= -4097) {
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
                                        // wide iinc 8 -4096
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    // wide iinc 8 4096
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
                    // wide iinc 9 -4096
                    continue L3;
                  }
                }
              } else {
                // wide iinc 9 4096
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
        this.b(true);
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
