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
            field_m = null;
        }
    }

    final static g a(Throwable param0, String param1) {
        g var2_ref = null;
        g var2 = null;
        if (param0 instanceof g) {
            var2 = (g) (Object) param0;
            var2.field_g = var2.field_g + 32 + param1;
        } else {
            var2_ref = new g(param0, param1);
        }
        return var2_ref;
    }

    ig(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        vh var7 = null;
        vh var8 = null;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        ((ig) this).field_k = param0;
        var7 = new vh(param1);
        var8 = var7;
        ((ig) this).field_o = var8.k(0);
        ((ig) this).field_l = new int[((ig) this).field_o][];
        ((ig) this).field_q = new boolean[((ig) this).field_o];
        ((ig) this).field_p = new int[((ig) this).field_o];
        ((ig) this).field_s = new int[((ig) this).field_o];
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ig) this).field_o) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((ig) this).field_o) {
                var4 = 0;
                L2: while (true) {
                  if (((ig) this).field_o <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ((ig) this).field_o) {
                        var4 = 0;
                        L4: while (true) {
                          if (((ig) this).field_o <= var4) {
                          } else {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((ig) this).field_l[var4].length) {
                                var4++;
                                continue L4;
                              } else {
                                ((ig) this).field_l[var4][var5] = var7.k(0);
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ((ig) this).field_l[var4] = new int[var7.k(0)];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((ig) this).field_s[var4] = var7.e((byte) -104);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  stackOut_5_0 = ((ig) this).field_q;
                  stackOut_5_1 = var4;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if ((var8.k(0) ^ -1) != -2) {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L6;
                  } else {
                    stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L6;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                var4++;
                continue L1;
              }
            }
          } else {
            ((ig) this).field_p[var4] = var7.k(0);
            var4++;
            continue L0;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -8327) {
            Object var2 = null;
            g discarded$0 = ig.a((Throwable) null, (String) null);
        }
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
