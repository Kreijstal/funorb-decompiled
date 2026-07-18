/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends dqa implements ln, oo {
    static int field_y;
    private htb field_w;
    static dja field_v;
    private sn field_z;
    private kja field_x;

    private final String j() {
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, kja param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              ((w) this).field_x = null;
              break L0;
            }
          }
          if (0 == param2) {
            vba.a(12, "terms.ws");
            return;
          } else {
            if (param2 != 1) {
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("w.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    w(sn param0) {
        super(0, 0, 288, 0, (wwa) null);
        RuntimeException var2 = null;
        int var3 = 0;
        bob var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((w) this).field_z = param0;
            ((w) this).field_w = new htb(tn.field_b, (sba) null);
            ((w) this).field_w.field_q = (wwa) (Object) new vva();
            int discarded$2 = 1;
            int discarded$3 = -30;
            var7 = isa.a(hm.field_o, new String[2], 81);
            var3 = 20;
            var4 = new bob(loa.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, loa.field_o.field_k, -1, 2147483647, true);
            ((w) this).field_x = new kja(var7, (wwa) (Object) var4);
            ((w) this).field_x.field_p = "";
            ((w) this).field_x.a(0, -1, pma.field_q);
            ((w) this).field_x.a(1, -1, pma.field_q);
            ((w) this).field_x.field_l = (sba) this;
            ((w) this).field_x.field_h = -40 + ((w) this).field_h;
            ((w) this).field_x.a(-40 + ((w) this).field_h, var3, 26, (byte) -23);
            var3 = var3 + (15 + ((w) this).field_x.field_f);
            ((w) this).b(-18756, (shb) (Object) ((w) this).field_x);
            var5 = 4;
            var6 = 200;
            ((w) this).field_w.a(-var6 + 300 >> 1, var6, 40, 1, var3);
            ((w) this).field_w.field_l = (sba) this;
            ((w) this).b(-18756, (shb) (Object) ((w) this).field_w);
            ((w) this).a(0, 300, var3 - (-55 - var5), 1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("w.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 == 99) {
                  stackOut_9_0 = ((w) this).a(true, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((w) this).a(param2, 0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("w.N(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((w) this).field_w == param3) {
                int discarded$2 = -74;
                cnb.f();
                ((w) this).field_z.l((byte) -106);
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
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("w.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    public static void i() {
        field_v = null;
    }

    private final String c() {
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = (dja) (Object) new bn();
    }
}
