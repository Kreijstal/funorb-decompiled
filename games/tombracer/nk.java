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
        lqa var1;
        int stackIn_9_0 = 0;
        L0: {
          if (param0 <= -26) {
            break L0;
          } else {
            field_k = (jpa[]) null;
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
                  stackIn_9_0 = 1;
                  break L1;
                }
              }
            }
            stackIn_9_0 = 0;
            break L1;
          }
          return stackIn_9_0 != 0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 20) {
            field_k = (jpa[]) null;
        }
    }

    final static vpa a(int param0) {
        if (param0 != -21819) {
            return (vpa) null;
        }
        if (!(ur.field_a != null)) {
            ur.field_a = new vpa(eka.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, eka.field_o.field_w, -1, 2147483647, true);
        }
        return ur.field_a;
    }

    final static float a(byte param0, float param1) {
        if (param0 != 14) {
            field_k = (jpa[]) null;
        }
        return (10.0f + (-15.0f + param1 * 6.0f) * param1) * (param1 * (param1 * param1));
    }

    nk(int param0, byte[] param1) {
        int[] array$0 = null;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        uia var7 = null;
        uia var8 = null;
        try {
          L0: {
            this.field_l = param0;
            var7 = new uia(param1);
            var8 = var7;
            this.field_j = var8.h(255);
            this.field_h = new int[this.field_j];
            this.field_i = new int[this.field_j];
            this.field_f = new int[this.field_j][];
            this.field_g = new boolean[this.field_j];
            var4 = 0;
            L1: while (true) {
              if (this.field_j <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (this.field_j <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= this.field_j) {
                        var4 = 0;
                        L4: while (true) {
                          if (this.field_j <= var4) {
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= this.field_j) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (this.field_f[var4].length <= var5) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    this.field_f[var4][var5] = var7.h(255);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            array$0 = new int[var7.h(255)];
                            this.field_f[var4] = array$0;
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_i[var4] = var7.d(124);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackIn_10_0 = this.field_g;

                      stackIn_10_1 = var4;

                      if ((var8.h(255) ^ -1) != -2) {
                        stackIn_11_0 = (boolean[]) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 0;
                        break L7;
                      } else {
                        stackIn_11_0 = (boolean[]) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 1;
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
                  this.field_h[var4] = var7.h(255);
                  if (this.field_h[var4] != 6) {
                    break L8;
                  } else {
                    this.field_h[var4] = 2;
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
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
    }
}
