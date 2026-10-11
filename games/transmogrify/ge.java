/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends aj implements hl, df {
    private le field_z;
    static sh field_A;
    static boolean field_x;
    private lj field_y;
    private sf field_w;

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -60, param3)) {
            return true;
          }
          var5_int = -29 % ((65 - param2) / 55);
          if (param0 == 98) {
            stackIn_5_0 = this.a(2, param1);
            return stackIn_5_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.b(param1, 82);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ge.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_A = null;
        if (param0 != 1843) {
          field_x = false;
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        le var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == this.field_y) {
            wj.b(480);
            this.field_w.r(77);
          }
          if (param1 == 17) {
            return;
          }
          var7 = (le) null;
          this.a(93, -118, 33, (le) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ge.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String m(int param0) {
        if (param0 >= -51) {
          this.field_w = (sf) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String l(int param0) {
        if (param0 != 300) {
          field_x = true;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    ge(sf param0) {
        super(0, 0, 288, 0, (ui) null);
        String var7 = null;
        int var3 = 0;
        h var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_w = param0;
          this.field_y = new lj(qe.field_I, (ma) null);
          this.field_y.field_q = (ui) ((Object) new qa());
          var7 = ij.a(ua.field_b, new String[]{this.l(300), this.m(-71)}, (byte) -123);
          var3 = 20;
          var4 = new h(vd.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, vd.field_h.field_y, -1, 2147483647, true);
          this.field_z = new le(var7, var4);
          this.field_z.field_j = "";
          this.field_z.a(mk.field_E, 0, 0);
          this.field_z.a(mk.field_E, 0, 1);
          this.field_z.field_m = (ma) (this);
          this.field_z.field_l = this.field_l - 40;
          this.field_z.a(26, this.field_l - 40, -1, var3);
          var3 = var3 + (this.field_z.field_h + 15);
          this.a((qg) (this.field_z), (byte) -79);
          var5 = 4;
          var6 = 200;
          this.field_y.a(36, var3, -var6 + 300 >> 1, var6, 40);
          this.field_y.field_m = (ma) (this);
          this.a((qg) (this.field_y), (byte) -97);
          this.a(86, 0, 0, 300, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, le param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (0 == param2) {
            mh.a(param1 ^ 8389, "terms.ws");
          } else {
            if (param2 != 1) {
              if (param2 == 2) {
                mh.a(param1 ^ 8389, "conduct.ws");
              }
            } else {
              mh.a(11207, "privacy.ws");
            }
          }
          if (param1 == 2818) {
            return;
          }
          field_A = (sh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ge.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_x = true;
        field_A = new sh();
    }
}
