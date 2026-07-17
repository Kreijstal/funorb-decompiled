/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private int field_b;
    static int[][] field_f;
    static iv field_d;
    private long field_a;
    static fta field_c;
    static String field_e;

    final gj b(int param0, int param1) {
        if (param0 != 0) {
            return null;
        }
        return gj.a((byte) 41, this.a(param1, -1));
    }

    final static void a(cn param0, int param1) {
        fg var2 = null;
        try {
            fg.b(param0.a("headers.packvorbis", (byte) 124, ""));
            var2 = fg.a(param0, "jagex logo2.packvorbis", "");
            u discarded$0 = var2.a();
            int var3 = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ne.D(" + (param0 != null ? "{...}" : "null") + 44 + -101 + 41);
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var3 = hua.a(param2, 0);
              if (param0) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ne.a(false, (String) null, (String) null);
                break L1;
              }
            }
            if (-1 != param1.indexOf(param2)) {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (param1.indexOf(var3) == -1) {
                L2: {
                  L3: {
                    if (param1.startsWith(param2)) {
                      break L3;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param1.endsWith(param2)) {
                          break L3;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ne.G(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    private final int a(int param0, int param1) {
        return (int)(((ne) this).field_a >> gj.field_f * param0) & 15;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = c.field_g[0];
            var2 = 1;
            L1: while (true) {
              if (c.field_g.length <= var2) {
                break L0;
              } else {
                var3 = c.field_g[var2];
                lua.a(aia.field_t, var2 << 4, aia.field_t, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "ne.H(" + -124 + 41);
        }
    }

    final int b(byte param0) {
        int var2 = -110 % ((param0 - -27) / 42);
        return ((ne) this).field_b;
    }

    private final void a(int param0, gj param1) {
        if (param0 != 1) {
            return;
        }
        try {
            int fieldTemp$0 = ((ne) this).field_b;
            ((ne) this).field_b = ((ne) this).field_b + 1;
            ((ne) this).field_a = ((ne) this).field_a | (long)(param1.field_i << fieldTemp$0 * gj.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ne.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ne(gj param0) {
        try {
            ((ne) this).field_b = 1;
            ((ne) this).field_a = (long)param0.field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    ne(gj[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length) {
                break L0;
              } else {
                this.a(1, param0[var2_int]);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ne.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
        field_c = new fta();
        field_e = "Icons are heavy, ugly, and probably belong in a museum. Dump these deadweights with <img=8><img=9> or save them for tons of points.";
    }
}
