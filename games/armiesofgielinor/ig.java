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
    }

    final static g a(Throwable param0, String param1) {
        g var2 = null;
        if (param0 instanceof g) {
            var2 = (g) (Object) param0;
            var2.field_g = var2.field_g + ' ' + param1;
        } else {
            var2 = new g(param0, param1);
        }
        return var2;
    }

    ig(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        vh var7 = null;
        vh var8 = null;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            ((ig) this).field_k = param0;
            var7 = new vh(param1);
            var8 = var7;
            ((ig) this).field_o = var8.k(0);
            ((ig) this).field_l = new int[((ig) this).field_o][];
            ((ig) this).field_q = new boolean[((ig) this).field_o];
            ((ig) this).field_p = new int[((ig) this).field_o];
            ((ig) this).field_s = new int[((ig) this).field_o];
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((ig) this).field_o) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((ig) this).field_o) {
                    var4 = 0;
                    L3: while (true) {
                      if (((ig) this).field_o <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ((ig) this).field_o) {
                            var4 = 0;
                            L5: while (true) {
                              if (((ig) this).field_o <= var4) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= ((ig) this).field_l[var4].length) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    ((ig) this).field_l[var4][var5] = var7.k(0);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ig) this).field_l[var4] = new int[var7.k(0)];
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ((ig) this).field_s[var4] = var7.e((byte) -104);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackOut_6_0 = ((ig) this).field_q;
                      stackOut_6_1 = var4;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var8.k(0) != 1) {
                        stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L7;
                      } else {
                        stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L7;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ((ig) this).field_p[var4] = var7.k(0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static boolean a(int param0) {
        return da.a(23660, ag.d((byte) 16));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Tutorial";
        field_r = "Scamming";
    }
}
