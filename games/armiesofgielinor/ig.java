/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends tc {
    int[] field_p;
    static uv field_n;
    int field_k;
    private boolean[] field_q;
    static String field_m;
    int[][] field_l;
    static ru field_t;
    static String field_r;
    int[] field_s;
    int field_o;

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        field_t = null;
        field_r = null;
        if (param0 < 1) {
            field_m = (String) null;
        }
    }

    final static g a(Throwable param0, String param1) {
        g var2 = null;
        if (param0 instanceof g) {
            var2 = (g) ((Object) param0);
            var2.field_g = var2.field_g + ' ' + param1;
        } else {
            var2 = new g(param0, param1);
        }
        return var2;
    }

    ig(int param0, byte[] param1) {
        int[] array$0 = null;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        vh var7 = null;
        vh var8 = null;
        try {
          L0: {
            this.field_k = param0;
            var7 = new vh(param1);
            var8 = var7;
            this.field_o = var8.k(0);
            this.field_l = new int[this.field_o][];
            this.field_q = new boolean[this.field_o];
            this.field_p = new int[this.field_o];
            this.field_s = new int[this.field_o];
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_o) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= this.field_o) {
                    var4 = 0;
                    L3: while (true) {
                      if (this.field_o <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= this.field_o) {
                            var4 = 0;
                            L5: while (true) {
                              if (this.field_o <= var4) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= this.field_l[var4].length) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    this.field_l[var4][var5] = var7.k(0);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            array$0 = new int[var7.k(0)];
                            this.field_l[var4] = array$0;
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_s[var4] = var7.e((byte) -104);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackIn_8_0 = this.field_q;

                      stackIn_8_1 = var4;

                      if ((var8.k(0) ^ -1) != -2) {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 0;
                        break L7;
                      } else {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 1;
                        break L7;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                this.field_p[var4] = var7.k(0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != -8327) {
            String var2 = (String) null;
            ig.a((Throwable) null, (String) null);
        }
        return da.a(23660, ag.d((byte) 16));
    }

    static {
        field_m = "Tutorial";
        field_r = "Scamming";
    }
}
