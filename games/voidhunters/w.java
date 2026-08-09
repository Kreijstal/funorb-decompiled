/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends dqa implements ln, oo {
    static int field_y;
    private htb field_w;
    static dja field_v;
    private sn field_z;
    private kja field_x;

    private final String j(byte param0) {
        if (param0 >= -25) {
            this.field_z = (sn) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, kja param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              this.field_x = (kja) null;
              break L0;
            }
          }
          if (0 == param2) {
            vba.a(12, "terms.ws");
            return;
          } else {
            if ((param2 ^ -1) != -2) {
              if (param2 == 2) {
                vba.a(param0 + 13, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              vba.a(12, "privacy.ws");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("w.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    w(sn param0) {
        super(0, 0, 288, 0, (wwa) null);
        String var7 = null;
        int var3 = 0;
        bob var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_z = param0;
            this.field_w = new htb(tn.field_b, (sba) null);
            this.field_w.field_q = (wwa) ((Object) new vva());
            var7 = isa.a(hm.field_o, new String[]{this.c(true), this.j((byte) -30)}, 81);
            var3 = 20;
            var4 = new bob(loa.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, loa.field_o.field_k, -1, 2147483647, true);
            this.field_x = new kja(var7, var4);
            this.field_x.field_p = "";
            this.field_x.a(0, -1, pma.field_q);
            this.field_x.a(1, -1, pma.field_q);
            this.field_x.field_l = (sba) (this);
            this.field_x.field_h = -40 + this.field_h;
            this.field_x.a(-40 + this.field_h, var3, 26, (byte) -23);
            var3 = var3 + (15 + this.field_x.field_f);
            this.b(-18756, this.field_x);
            var5 = 4;
            var6 = 200;
            this.field_w.a(-var6 + 300 >> 1870425441, var6, 40, 1, var3);
            this.field_w.field_l = (sba) (this);
            this.b(-18756, this.field_w);
            this.a(0, 300, var3 - (-55 - var5), 1, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param0);
        var2.c(0, 1);
        int var3 = -52 / ((-27 - param1) / 35);
        var2.c(0, 0);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.a(true, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(param2, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("w.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
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
              if (this.field_w == param3) {
                cnb.f((byte) -74);
                this.field_z.l((byte) -106);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 11) {
              break L0;
            } else {
              w.a(-96, (byte) -47);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("w.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    public static void i(byte param0) {
        if (param0 != 77) {
            field_y = 91;
            field_v = null;
            return;
        }
        field_v = null;
    }

    private final String c(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_v = (dja) ((Object) new bn());
    }
}
