/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends vg {
    int field_j;
    int[] field_h;
    private boolean[] field_g;
    static jpa[] field_k;
    int[] field_i;
    int field_l;
    int[][] field_f;

    final static boolean c(int param0) {
        lqa var1 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 <= -26) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          L1: {
            L2: {
              if (ara.field_wb) {
                break L2;
              } else {
                if (!var1.field_e) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_9_0 != 0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 20) {
            field_k = null;
        }
    }

    final static vpa a(int param0) {
        if (param0 != -21819) {
            return null;
        }
        if (!(ur.field_a != null)) {
            ur.field_a = new vpa(eka.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, eka.field_o.field_w, -1, 2147483647, true);
        }
        return ur.field_a;
    }

    final static float a(byte param0, float param1) {
        if (param0 != 14) {
            field_k = null;
        }
        return (10.0f + (-15.0f + param1 * 6.0f) * param1) * (param1 * (param1 * param1));
    }

    nk(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        uia var7 = null;
        uia var8 = null;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        ((nk) this).field_l = param0;
        var7 = new uia(param1);
        var8 = var7;
        ((nk) this).field_j = var8.h(255);
        ((nk) this).field_h = new int[((nk) this).field_j];
        ((nk) this).field_i = new int[((nk) this).field_j];
        ((nk) this).field_f = new int[((nk) this).field_j][];
        ((nk) this).field_g = new boolean[((nk) this).field_j];
        var4 = 0;
        L0: while (true) {
          if (((nk) this).field_j <= var4) {
            var4 = 0;
            L1: while (true) {
              if (((nk) this).field_j <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((nk) this).field_j) {
                    var4 = 0;
                    L3: while (true) {
                      if (((nk) this).field_j <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ((nk) this).field_j) {
                          } else {
                            var5 = 0;
                            L5: while (true) {
                              if (((nk) this).field_f[var4].length <= var5) {
                                var4++;
                                continue L4;
                              } else {
                                ((nk) this).field_f[var4][var5] = var7.h(255);
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ((nk) this).field_f[var4] = new int[var7.h(255)];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((nk) this).field_i[var4] = var7.d(124);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  stackOut_7_0 = ((nk) this).field_g;
                  stackOut_7_1 = var4;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if ((var8.h(255) ^ -1) != -2) {
                    stackOut_9_0 = (boolean[]) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L6;
                  } else {
                    stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L6;
                  }
                }
                stackIn_10_0[stackIn_10_1] = stackIn_10_2 != 0;
                var4++;
                continue L1;
              }
            }
          } else {
            ((nk) this).field_h[var4] = var7.h(255);
            if (((nk) this).field_h[var4] == 6) {
              ((nk) this).field_h[var4] = 2;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
