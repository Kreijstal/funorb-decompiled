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
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != -1) {
            this.field_x = (kja) null;
          }
          if (0 == param2) {
            vba.a(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            vba.a(12, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          vba.a(param0 + 13, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("w.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
          this.field_w.a(-var6 + 300 >> 1, var6, 40, 1, var3);
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
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param2, 0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(true, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("w.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_w == param3) {
            cnb.f((byte) -74);
            this.field_z.l((byte) -106);
          }
          if (param0 == 11) {
            return;
          }
          w.a(-96, (byte) -47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("w.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
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
