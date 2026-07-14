/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jlb extends le {
    private int field_j;
    private int field_m;
    private int[] field_v;
    private int field_p;
    private int[][] field_i;
    private int field_k;
    private int[][] field_w;
    private int field_u;
    private int field_l;
    private int field_n;
    private int field_q;
    private int field_r;
    private int field_o;
    static String field_t;
    private int field_s;

    final int[] a(int param0, boolean param1) {
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
        int stackIn_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var17 = VoidHunters.field_G;
        var21 = ((jlb) this).field_f.a((byte) 40, param0);
        var20 = var21;
        var19 = var20;
        var18 = var19;
        var3 = var18;
        if (param1) {
          L0: {
            if (!((jlb) this).field_f.field_e) {
              break L0;
            } else {
              var7 = 0;
              var9 = ((jlb) this).field_p + sj.field_p[param0];
              L1: while (true) {
                if (0 <= var9) {
                  L2: while (true) {
                    if (4096 >= var9) {
                      L3: while (true) {
                        L4: {
                          if (var7 >= ((jlb) this).field_s) {
                            break L4;
                          } else {
                            if (var9 < ((jlb) this).field_v[var7]) {
                              break L4;
                            } else {
                              var7++;
                              continue L3;
                            }
                          }
                        }
                        L5: {
                          var11 = -1 + var7;
                          if ((var7 & 1) != 0) {
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
                          var15 = ((jlb) this).field_v[var7];
                          var16 = ((jlb) this).field_v[-1 + var7];
                          if (((jlb) this).field_o + var16 >= var9) {
                            break L6;
                          } else {
                            if (var15 + -((jlb) this).field_o <= var9) {
                              break L6;
                            } else {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= hob.field_d) {
                                  break L0;
                                } else {
                                  L8: {
                                    var6 = 0;
                                    if (var12 == 0) {
                                      stackOut_20_0 = -((jlb) this).field_j;
                                      stackIn_21_0 = stackOut_20_0;
                                      break L8;
                                    } else {
                                      stackOut_19_0 = ((jlb) this).field_j;
                                      stackIn_21_0 = stackOut_19_0;
                                      break L8;
                                    }
                                  }
                                  var5 = stackIn_21_0;
                                  var8 = (var5 * ((jlb) this).field_m >> -671452020) + grb.field_l[var4];
                                  L9: while (true) {
                                    if ((var8 ^ -1) <= -1) {
                                      L10: while (true) {
                                        if ((var8 ^ -1) >= -4097) {
                                          L11: while (true) {
                                            L12: {
                                              if (var6 >= ((jlb) this).field_q) {
                                                break L12;
                                              } else {
                                                if (((jlb) this).field_w[var11][var6] <= var8) {
                                                  var6++;
                                                  continue L11;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              var10 = -1 + var6;
                                              var14 = ((jlb) this).field_w[var11][var6];
                                              var13 = ((jlb) this).field_w[var11][var10];
                                              if (var8 <= ((jlb) this).field_o + var13) {
                                                break L13;
                                              } else {
                                                if (-((jlb) this).field_o + var14 > var8) {
                                                  var3[var4] = ((jlb) this).field_i[var11][var10];
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
                        cua.a(var21, 0, hob.field_d, 0);
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

    final static boolean b(int param0, int param1, int param2, int param3) {
        if (cka.field_o != null) {
            if (!(!cka.field_o.a(0))) {
                lnb.d(0);
                return true;
            }
        }
        if (crb.field_v != null) {
            if (crb.field_v.h(-15244)) {
                crb.field_v = null;
                lnb.d(0);
                return true;
            }
        }
        if (!(!nu.e((byte) 114))) {
            return true;
        }
        if (param1 != -2048) {
            jlb.a(false);
        }
        if (rtb.a(param0, -94, param3, param2)) {
            return true;
        }
        return false;
    }

    final void c(byte param0) {
        this.e((byte) -34);
        if (param0 >= -35) {
            ((jlb) this).field_p = -6;
        }
    }

    public jlb() {
        super(0, true);
        ((jlb) this).field_p = 0;
        ((jlb) this).field_u = 1024;
        ((jlb) this).field_j = 1024;
        ((jlb) this).field_l = 204;
        ((jlb) this).field_k = 81;
        ((jlb) this).field_q = 4;
        ((jlb) this).field_r = 409;
        ((jlb) this).field_s = 8;
    }

    private final void e(byte param0) {
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
        var9 = VoidHunters.field_G;
        var10 = new Random((long)((jlb) this).field_s);
        ((jlb) this).field_m = 4096 / ((jlb) this).field_q;
        ((jlb) this).field_o = ((jlb) this).field_k / 2;
        ((jlb) this).field_n = 4096 / ((jlb) this).field_s;
        var3 = ((jlb) this).field_m / 2;
        if (param0 == -34) {
          ((jlb) this).field_w = new int[((jlb) this).field_s][1 + ((jlb) this).field_q];
          ((jlb) this).field_i = new int[((jlb) this).field_s][((jlb) this).field_q];
          var4 = ((jlb) this).field_n / 2;
          ((jlb) this).field_v = new int[((jlb) this).field_s - -1];
          ((jlb) this).field_v[0] = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= ((jlb) this).field_s) {
              ((jlb) this).field_v[((jlb) this).field_s] = 4096;
              return;
            } else {
              L1: {
                if ((var5 ^ -1) < -1) {
                  var6 = ((jlb) this).field_n;
                  var7 = (-2048 + hob.a(var10, 4096, 123)) * ((jlb) this).field_l >> -447181460;
                  var6 = var6 + (var7 * var4 >> 2202668);
                  ((jlb) this).field_v[var5] = var6 + ((jlb) this).field_v[-1 + var5];
                  break L1;
                } else {
                  break L1;
                }
              }
              ((jlb) this).field_w[var5][0] = 0;
              var6 = 0;
              L2: while (true) {
                if (((jlb) this).field_q <= var6) {
                  ((jlb) this).field_w[var5][((jlb) this).field_q] = 4096;
                  var5++;
                  continue L0;
                } else {
                  L3: {
                    if (var6 > 0) {
                      var7 = ((jlb) this).field_m;
                      var8 = (hob.a(var10, 4096, param0 ^ -91) + -2048) * ((jlb) this).field_r >> -1492058836;
                      var7 = var7 + (var8 * var3 >> 1923576748);
                      ((jlb) this).field_w[var5][var6] = ((jlb) this).field_w[var5][var6 + -1] - -var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_12_0 = ((jlb) this).field_i[var5];
                    stackOut_12_1 = var6;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if ((((jlb) this).field_u ^ -1) >= -1) {
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
                      stackOut_13_2 = -hob.a(var10, ((jlb) this).field_u, 123) + 4096;
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

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (var4 != 0) {
            if (var4 == 1) {
              ((jlb) this).field_s = param2.e((byte) -118);
              break L0;
            } else {
              if (2 == var4) {
                ((jlb) this).field_r = param2.e(1869);
                break L0;
              } else {
                if (var4 != 3) {
                  if (var4 == 4) {
                    ((jlb) this).field_j = param2.e(1869);
                    break L0;
                  } else {
                    if (var4 != 5) {
                      if ((var4 ^ -1) != -7) {
                        if (7 != var4) {
                          break L0;
                        } else {
                          ((jlb) this).field_u = param2.e(1869);
                          break L0;
                        }
                      } else {
                        ((jlb) this).field_k = param2.e(1869);
                        break L0;
                      }
                    } else {
                      ((jlb) this).field_p = param2.e(1869);
                      break L0;
                    }
                  }
                } else {
                  ((jlb) this).field_l = param2.e(1869);
                  break L0;
                }
              }
            }
          } else {
            ((jlb) this).field_q = param2.e((byte) -101);
            break L0;
          }
        }
        L1: {
          if (param1 < -60) {
            break L1;
          } else {
            boolean discarded$1 = jlb.b(-48, 83, 33, 63);
            break L1;
          }
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Destroy the enemy VIP";
    }
}
