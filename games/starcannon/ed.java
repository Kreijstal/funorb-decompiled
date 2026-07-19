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
        if (param0 != -1) {
          return (String) null;
        } else {
          var4 = param1.indexOf(param3);
          L0: while (true) {
            if (-1 == var4) {
              return param1;
            } else {
              param1 = param1.substring(0, var4) + param2 + param1.substring(param3.length() + var4);
              var4 = param1.indexOf(param3, param2.length() + var4);
              continue L0;
            }
          }
        }
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 < this.field_l) {
              this.field_l = this.field_l - param2;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2 - this.field_l;
              param1 = param1 + this.field_l;
              this.field_m.field_d = this.field_d;
              this.field_l = 0;
              this.field_m.field_a = this.field_a;
              this.field_d.field_a = (rf) ((Object) this.field_m);
              this.field_a.field_d = (rf) ((Object) this.field_m);
              this.field_a = null;
              this.field_d = null;
              if (param2 > 0) {
                this.field_m.a(param0, param1, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ed.UA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int b() {
        return 0;
    }

    final static void d(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5 = jf.field_a;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              if (param0 <= -120) {
                break L1;
              } else {
                field_k = (hl) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var1[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var1[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var1[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var1[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var1[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var1[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var1[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var1[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
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
        if (!(this.field_l <= param0)) {
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
        if (!((param0 ^ -1) >= -1)) {
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
