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
            ij.a(95, -34);
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            var3_int = ga.a((byte) -89, param1, var10);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = param0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param2.substring(var6);
                stackIn_8_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param2.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ij.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static gd a(int param0, int param1) {
        if (param0 >= -34) {
            return (gd) null;
        }
        gd var2 = new gd();
        ra.field_d.a((rk) (var2), (byte) 109);
        fm.a(115, param1);
        return var2;
    }

    ij(int param0, byte[] param1) {
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
        kg var7 = null;
        kg var8 = null;
        try {
          L0: {
            this.field_v = param0;
            var7 = new kg(param1);
            var8 = var7;
            this.field_x = var8.c(32);
            this.field_y = new boolean[this.field_x];
            this.field_w = new int[this.field_x][];
            this.field_n = new int[this.field_x];
            this.field_m = new int[this.field_x];
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_x) {
                var4 = 0;
                L2: while (true) {
                  if (this.field_x <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (this.field_x <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (this.field_x <= var4) {
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= this.field_x) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= this.field_w[var4].length) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    this.field_w[var4][var5] = var7.c(32);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            array$0 = new int[var7.c(32)];
                            this.field_w[var4] = array$0;
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_m[var4] = var7.a((byte) 25);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackIn_8_0 = this.field_y;

                      stackIn_8_1 = var4;

                      if (1 != var8.c(32)) {
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
                this.field_n[var4] = var7.c(32);
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

            stackIn_25_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_o = "Unpacking models";
        field_p = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_s = new e(10, 2, 2, 0);
        field_q = new qi(1);
        field_u = 20000000L;
    }
}
