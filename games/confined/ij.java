/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends rk {
    static String field_o;
    int[] field_n;
    int field_v;
    private boolean[] field_y;
    static e field_s;
    static String[] field_p;
    private int field_x;
    static int[] field_r;
    static pb field_t;
    private int[] field_m;
    int[][] field_w;
    static qi field_q;
    static long field_u;

    public static void b(int param0) {
        field_q = null;
        field_r = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_t = null;
        if (param0 > -29) {
            gd discarded$0 = ij.a(95, -34);
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Confined.field_J ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = ga.a((byte) -89, param1, var10);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = param0;
        for (var7 = 0; var3 > var7; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    final static gd a(int param0, int param1) {
        if (param0 >= -34) {
            return null;
        }
        gd var2 = new gd();
        ra.field_d.a((rk) (Object) var2, (byte) 109);
        fm.a(115, param1);
        return var2;
    }

    ij(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        kg var7 = null;
        kg var8 = null;
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
        ((ij) this).field_v = param0;
        var7 = new kg(param1);
        var8 = var7;
        ((ij) this).field_x = var8.c(32);
        ((ij) this).field_y = new boolean[((ij) this).field_x];
        ((ij) this).field_w = new int[((ij) this).field_x][];
        ((ij) this).field_n = new int[((ij) this).field_x];
        ((ij) this).field_m = new int[((ij) this).field_x];
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ij) this).field_x) {
            var4 = 0;
            L1: while (true) {
              if (((ij) this).field_x <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (((ij) this).field_x <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (((ij) this).field_x <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ((ij) this).field_x) {
                          } else {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((ij) this).field_w[var4].length) {
                                var4++;
                                continue L4;
                              } else {
                                ((ij) this).field_w[var4][var5] = var7.c(32);
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ((ij) this).field_w[var4] = new int[var7.c(32)];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((ij) this).field_m[var4] = var7.a((byte) 25);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  stackOut_5_0 = ((ij) this).field_y;
                  stackOut_5_1 = var4;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (1 != var8.c(32)) {
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
            ((ij) this).field_n[var4] = var7.c(32);
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unpacking models";
        field_p = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_s = new e(10, 2, 2, 0);
        field_q = new qi(1);
        field_u = 20000000L;
    }
}
