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
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          L0: {
            L1: {
              if (ara.field_wb) {
                break L1;
              } else {
                if (!var1.field_e) {
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        }
    }

    public static void b(int param0) {
        field_k = null;
    }

    final static vpa a(int param0) {
        if (!(ur.field_a != null)) {
            ur.field_a = new vpa(eka.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, eka.field_o.field_w, -1, 2147483647, true);
        }
        return ur.field_a;
    }

    final static float a(byte param0, float param1) {
        return (10.0f + (-15.0f + param1 * 6.0f) * param1) * (param1 * (param1 * param1));
    }

    nk(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        uia var7 = null;
        uia var8 = null;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            ((nk) this).field_l = param0;
            var7 = new uia(param1);
            var8 = var7;
            ((nk) this).field_j = var8.h(255);
            ((nk) this).field_h = new int[((nk) this).field_j];
            ((nk) this).field_i = new int[((nk) this).field_j];
            ((nk) this).field_f = new int[((nk) this).field_j][];
            ((nk) this).field_g = new boolean[((nk) this).field_j];
            var4 = 0;
            L1: while (true) {
              if (((nk) this).field_j <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (((nk) this).field_j <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ((nk) this).field_j) {
                        var4 = 0;
                        L4: while (true) {
                          if (((nk) this).field_j <= var4) {
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= ((nk) this).field_j) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (((nk) this).field_f[var4].length <= var5) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    ((nk) this).field_f[var4][var5] = var7.h(255);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            ((nk) this).field_f[var4] = new int[var7.h(255)];
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ((nk) this).field_i[var4] = var7.d(124);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackOut_8_0 = ((nk) this).field_g;
                      stackOut_8_1 = var4;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var8.h(255) != 1) {
                        stackOut_10_0 = (boolean[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L7;
                      } else {
                        stackOut_9_0 = (boolean[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L7;
                      }
                    }
                    stackIn_11_0[stackIn_11_1] = stackIn_11_2 != 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  ((nk) this).field_h[var4] = var7.h(255);
                  if (((nk) this).field_h[var4] != 6) {
                    break L8;
                  } else {
                    ((nk) this).field_h[var4] = 2;
                    break L8;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    static {
    }
}
