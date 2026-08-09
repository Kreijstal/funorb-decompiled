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
            return (gj) null;
        }
        return gj.a((byte) 41, this.a(param1, -1));
    }

    final static void a(cn param0, int param1) {
        fg var2 = null;
        try {
            fg.b(param0.a("headers.packvorbis", (byte) 124, ""));
            var2 = fg.a(param0, "jagex logo2.packvorbis", "");
            var2.a();
            int var3 = -87 % ((param1 - 12) / 50);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ne.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = hua.a(param2, 0);
              if (param0) {
                break L1;
              } else {
                var4 = (String) null;
                ne.a(false, (String) null, (String) null);
                break L1;
              }
            }
            if (-1 != param1.indexOf(param2)) {
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1.indexOf(var3) ^ -1) == 0) {
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
                            stackIn_14_0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ne.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != -1) {
            this.field_b = -59;
            return (int)(this.field_a >> gj.field_f * param0) & 15;
        }
        return (int)(this.field_a >> gj.field_f * param0) & 15;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 15) {
            field_d = (iv) null;
            field_f = (int[][]) null;
            return;
        }
        field_f = (int[][]) null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = c.field_g[0];
              var2 = 1;
              if (param0 < -49) {
                break L1;
              } else {
                var5 = (String) null;
                ne.a(true, (String) null, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (c.field_g.length <= var2) {
                break L0;
              } else {
                var3 = c.field_g[var2];
                lua.a(aia.field_t, var2 << 1665449828, aia.field_t, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ne.H(" + param0 + ')');
        }
    }

    final int b(byte param0) {
        int var2 = -110 % ((param0 - -27) / 42);
        return this.field_b;
    }

    private final void a(int param0, gj param1) {
        int fieldTemp$0 = 0;
        if (param0 != 1) {
            return;
        }
        try {
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_a = this.field_a | (long)(param1.field_i << fieldTemp$0 * gj.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ne.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ne(gj param0) {
        try {
            this.field_b = 1;
            this.field_a = (long)param0.field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ne(gj[] param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ne.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_f = new int[][]{new int[]{0, -1}, new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}, new int[]{-1, 1}, new int[]{-1, 0}, new int[]{-1, -1}};
        field_c = new fta();
        field_e = "Icons are heavy, ugly, and probably belong in a museum. Dump these deadweights with <img=8><img=9> or save them for tons of points.";
    }
}
