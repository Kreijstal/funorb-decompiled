/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends iw implements oo {
    static String field_L;
    static ij field_M;
    private htb field_K;
    static String field_J;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        htb var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_K == param3) {
            this.h(-95);
          }
          if (param0 == 11) {
            return;
          }
          var7 = (htb) null;
          this.a(-125, -106, 11, (htb) null, 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("mr.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String m(byte param0) {
        String var1 = "";
        if (null != jt.field_o) {
          var1 = jt.field_o.a(30);
        }
        int var2 = 80 / ((-61 - param0) / 55);
        if (0 == var1.length()) {
          var1 = dla.c(120);
        }
        if (0 == var1.length()) {
          var1 = job.field_o;
        }
        return var1;
    }

    public static void l(byte param0) {
        field_L = null;
        field_M = null;
        field_J = null;
        if (param0 != -16) {
          mr.g(-102);
        }
    }

    mr(ida param0, dpb param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        shb var4 = null;
        try {
          var3 = null;
          if (param1 == qua.field_a) {
            var3 = oda.field_t;
          } else {
            if (param1 == bca.field_a) {
              this.field_f = this.field_f + 10;
              var3 = r.field_m;
              if (oq.c((byte) 109)) {
                var3 = jga.field_b;
                this.field_f = this.field_f + 20;
              }
            } else {
              if (param1 == oca.field_a) {
                this.field_f = this.field_f + 30;
                var3 = tl.field_o;
              }
            }
          }
          var4 = new shb((String) (var3), (sba) null);
          var4.field_f = 80;
          var4.field_r = 50;
          var4.field_h = this.field_h;
          var4.field_g = 0;
          var4.field_q = (wwa) ((Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(-18756, var4);
          this.field_K = this.a((byte) 113, (sba) (this), wm.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mr.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void h(int param0) {
        if (param0 >= -39) {
          field_J = (String) null;
          if (this.field_z) {
            this.field_z = false;
            return;
          }
          return;
        }
        if (this.field_z) {
          this.field_z = false;
          return;
        }
    }

    final static hrb g(int param0) {
        if (param0 <= 37) {
          mr.g(84);
          return (hrb) ((Object) new nmb());
        }
        return (hrb) ((Object) new nmb());
    }

    private final htb a(byte param0, sba param1, String param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        htb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new htb(param2, param1);
          var4.field_q = (wwa) ((Object) new vva());
          var5 = -79 / ((6 - param0) / 32);
          var6 = -6 + this.field_f;
          this.field_f = this.field_f + 38;
          var4.a(15, this.field_h - 14 - 16, 30, 1, var6);
          this.b(-18756, var4);
          this.a(false);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("mr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_L = "<%0> is not on your ignore list.";
        field_J = "Game options";
    }
}
