/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends fd implements ta {
    static int field_E;
    private tg field_I;
    static String field_D;
    static String field_F;
    private tg field_G;
    private tg field_H;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_l;
        int var6 = this.field_u + param2;
        dj.field_h.a(ka.field_n, 20 + var5, 20 + var6, -40 + this.field_g, this.field_m - 50, 16777215, -1, 1, 0, dj.field_h.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, String param5) {
        int var7 = 0;
        hg var8 = gk.field_g;
        hg var6 = var8;
        var8.g(param3, 8);
        var8.field_l = var8.field_l + 1;
        if (param4 != 39) {
            return;
        }
        try {
            var7 = var8.field_l;
            var8.a(param1, -69);
            if (param1 == 2) {
                var8.a(param2, (byte) -102);
            }
            if (param5 != null) {
                en.a(true, param5, var8);
            } else {
                var8.a((byte) -78, param0);
            }
            var8.b(var8.field_l + -var7, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "jl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = ql.field_m.a("", 100, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("jl.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12085) {
                break L1;
              } else {
                field_E = -62;
                break L1;
              }
            }
            if (this.field_H != param1) {
              if (this.field_G == param1) {
                va.a(false);
                return;
              } else {
                if (this.field_I != param1) {
                  break L0;
                } else {
                  jk.a(param0 ^ -18303);
                  return;
                }
              }
            } else {
              pj.a(256);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("jl.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 13)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackIn_7_0 = this.b(2, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param2 ^ -1)) {
                  var5_int = -63 % ((-75 - param3) / 36);
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(-16234, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("jl.AA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public jl() {
        super(0, 0, 476, 225, (ol) null);
        this.field_G = new tg(bj.field_g, (cd) null);
        this.field_H = new tg(ql.field_o, (cd) null);
        this.field_I = new tg(dd.field_e, (cd) null);
        hf var1 = new hf();
        this.field_G.field_w = (ol) ((Object) var1);
        this.field_H.field_w = (ol) ((Object) var1);
        this.field_I.field_w = (ol) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> -1767185599;
        this.field_H.a(30, true, this.field_m + -48 - var2, -var3 + this.field_g >> 1322522337, var4);
        this.field_I.a(30, true, -var2 + this.field_m + -48, var2 + var4 + (this.field_g - var3 >> -1947048287), var4);
        this.field_G.a(30, true, this.field_m + -78 + -(2 * var2), this.field_g - var3 >> 1210021281, var3);
        this.field_H.field_o = (cd) (this);
        this.field_G.field_o = (cd) (this);
        this.field_I.field_o = (cd) (this);
        this.field_G.field_h = mh.field_j;
        this.field_I.field_h = fn.field_f;
        this.a((fi) (this.field_H), (byte) -78);
        this.a((fi) (this.field_G), (byte) -78);
        this.a((fi) (this.field_I), (byte) -78);
    }

    final static boolean a(int param0) {
        if (param0 > -123) {
            field_F = (String) null;
            return ab.field_J;
        }
        return ab.field_J;
    }

    public static void f(int param0) {
        field_D = null;
        field_F = null;
        if (param0 != 15354) {
            String var2 = (String) null;
            jl.a(41, -123, (String) null, -103, (byte) -32, (String) null);
        }
    }

    static {
        field_F = "Unable to add friend - system busy";
        field_D = "Back";
    }
}
