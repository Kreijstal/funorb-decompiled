/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends c {
    private int field_l;
    private c field_m;
    static java.math.BigInteger field_j;
    static hl field_k;
    static tc field_q;
    static int field_p;
    static int field_n;
    static hl[] field_o;

    public static void b(byte param0) {
        field_k = null;
        if (param0 != -61) {
          return;
        }
        field_o = null;
        field_q = null;
        field_j = null;
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        if (param0 == -1) {
          var4 = param1.indexOf(param3);
          while (-1 != var4) {
            param1 = param1.substring(0, var4) + param2 + param1.substring(param3.length() + var4);
            var4 = param1.indexOf(param3, param2.length() + var4);
          }
          return param1;
        }
        return (String) null;
    }

    final static void a(int param0, int param1, int param2, qe param3, int param4, int param5, int param6, int param7, int param8, int param9, hl param10) {
        try {
          int var11_int = -45 / ((param5 - 9) / 47);
          ue.field_e = param0;
          nd.field_k = param2;
          w.field_v = param6;
          cb.field_f = param9;
          gi.field_e = param7;
          td.field_p = param1;
          eh.field_h = param4;
          re.field_l = param10;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ed.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    final c a() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < this.field_l) {
            this.field_l = this.field_l - param2;
            return;
          }
          param2 = param2 - this.field_l;
          param1 = param1 + this.field_l;
          this.field_m.field_d = this.field_d;
          this.field_l = 0;
          this.field_m.field_a = this.field_a;
          this.field_d.field_a = (rf) ((Object) this.field_m);
          this.field_a.field_d = (rf) ((Object) this.field_m);
          this.field_a = null;
          this.field_d = null;
          if (param2 <= 0) {
            return;
          }
          this.field_m.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ed.UA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int b() {
        return 0;
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = StarCannon.field_A;
        try {
          var5 = jf.field_a;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 > -120) {
            field_k = (hl) null;
          }
          while (var3 > var2) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "ed.E(" + param0 + ')');
        }
    }

    ed(c param0, int param1) {
        try {
          this.field_m = param0;
          this.field_f = this.field_m.field_f;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final c c() {
        return null;
    }

    final void a(int param0) {
        if (this.field_l > param0) {
          this.field_l = this.field_l - param0;
          return;
        }
        param0 = param0 - this.field_l;
        this.field_m.field_d = this.field_d;
        this.field_l = 0;
        this.field_m.field_a = this.field_a;
        this.field_d.field_a = (rf) ((Object) this.field_m);
        this.field_a.field_d = (rf) ((Object) this.field_m);
        this.field_d = null;
        this.field_a = null;
        if (param0 > 0) {
          this.field_m.a(param0);
        }
    }

    final int d() {
        return this.field_m.d();
    }

    static {
        field_j = new java.math.BigInteger("65537");
    }
}
