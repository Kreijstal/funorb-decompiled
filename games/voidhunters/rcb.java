/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rcb extends dqa implements oo {
    private htb[] field_v;
    private jpb field_x;
    private String[] field_w;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 96, param3);
        if (param2 < 47) {
          htb var6 = (htb) null;
          this.a(47, 33, 22, (htb) null, 15);
        }
        if (param1 != 0) {
          return;
        }
        no var5 = loa.field_o;
        if (null != this.field_w) {
          var5.a(lrb.field_a, this.field_g + param0, this.field_r + param3, this.field_h, 20, 16777215, -1, 0, 0, var5.field_k + var5.field_A);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            return;
          }
          for (var6_int = 0; this.field_w.length > var6_int; var6_int++) {
            if (this.field_v[var6_int] == param3) {
              this.field_x.a((byte) 41, this.field_w[var6_int]);
            }
          }
          if (param3 == this.field_v[this.field_w.length]) {
            this.field_x.a(1546);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("rcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        meb var4 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          this.field_t.e(101);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_w = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_w[var4_int] = joa.a((CharSequence) ((Object) param0[var4_int]), false).replace(' ', ' ');
            }
            var4 = new meb(loa.field_o, param1, 1);
            this.field_v = new htb[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_v[var5] = new htb(this.field_w[var5], (sba) (this));
              this.field_v[var5].field_q = (wwa) ((Object) var4);
              this.field_v[var5].field_p = nv.field_p;
              this.field_v[var5].a(0, 80, 15, 1, var5 * 16 + 20);
              this.b(-18756, this.field_v[var5]);
            }
            this.field_v[var3_int] = new htb(wpa.field_o, (sba) (this));
            this.field_v[var3_int].field_q = (wwa) ((Object) var4);
            this.field_v[var3_int].a(0, 100, 15, 1, 16 + var3_int * 16 + 20);
            this.b(-18756, this.field_v[var3_int]);
            return;
          }
          this.field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("rcb.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    rcb(jpb param0) {
        super(0, 0, 0, 0, (wwa) null);
        try {
          this.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rcb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_5_0 = this.a(param2, param0 + 15834);
            return stackIn_5_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_9_0 = this.a(true, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rcb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
