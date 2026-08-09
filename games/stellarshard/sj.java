/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends g implements md, oi {
    static n[] field_B;
    private rg field_G;
    private ig field_D;
    static double field_I;
    static int field_K;
    static java.awt.Font field_F;
    static int[] field_J;
    static String field_C;
    private jg field_H;
    static String field_E;

    private final String d(boolean param0) {
        if (param0) {
            this.field_H = (jg) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, rg param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        rj var7 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (0 != param0) {
                if (-2 == (param0 ^ -1)) {
                  sf.a("privacy.ws", param1 + 14);
                  break L1;
                } else {
                  if ((param0 ^ -1) == -3) {
                    sf.a("conduct.ws", 12);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                sf.a("terms.ws", param1 ^ -14);
                break L1;
              }
            }
            if (param1 == -2) {
              break L0;
            } else {
              var7 = (rj) null;
              this.a(100, 104, 'ﾇ', (rj) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    sj(jg param0) {
        super(0, 0, 288, 0, (uk) null);
        String var7 = null;
        int var3 = 0;
        id var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_H = param0;
            this.field_D = new ig(tc.field_q, (lf) null);
            this.field_D.field_u = (uk) ((Object) new b());
            var7 = h.a(nj.field_s, 0, new String[]{this.d(false), this.a(0)});
            var3 = 20;
            var4 = new id(si.field_V, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
            this.field_G = new rg(var7, var4);
            this.field_G.field_x = "";
            this.field_G.a(ni.field_b, 0, 1);
            this.field_G.a(ni.field_b, 1, 1);
            this.field_G.field_v = (lf) (this);
            this.field_G.field_p = -40 + this.field_p;
            this.field_G.b(-40 + this.field_p, (byte) -11, 26, var3);
            var3 = var3 + (this.field_G.field_t - -15);
            this.b(4, this.field_G);
            var5 = 4;
            var6 = 200;
            this.field_D.b(var6, 300 + -var6 >> -705686431, var3, 40, 23987);
            this.field_D.field_v = (lf) (this);
            this.b(4, this.field_D);
            this.b(300, 0, 0, 55 + var3 - -var5, 23987);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_D == param2) {
                ai.a((byte) 70);
                this.field_H.o(3);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param3) {
              break L0;
            } else {
              field_F = (java.awt.Font) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("sj.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String a(int param0) {
        if (param0 != 0) {
            field_I = -0.873653220573416;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public static void e(byte param0) {
        field_F = null;
        field_J = null;
        field_E = null;
        field_B = null;
        field_C = null;
        if (param0 != 23) {
            sj.e((byte) 57);
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0 ^ 0, param1, param2, param3)) {
              L1: {
                if (param0 == 29657) {
                  break L1;
                } else {
                  field_J = (int[]) null;
                  break L1;
                }
              }
              if ((param1 ^ -1) != -99) {
                if (99 == param1) {
                  stackIn_11_0 = this.a(param3, (byte) 90);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_7_0 = this.a(param3, -8666);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("sj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    static {
        field_I = Math.atan2(1.0, 0.0);
        field_C = "Friends can be added in multiplayer<nbsp>games";
        field_E = "Please try again in a few minutes.";
    }
}
