/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    private int field_d;
    private hg[] field_c;
    private int field_e;
    private hg field_b;
    private hg field_g;
    static hh field_a;
    static eo field_f;

    final hg a(long param0, int param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        hg var4 = this.field_c[(int)((long)(param1 + this.field_d) & param0)];
        this.field_g = var4.field_b;
        while (var4 != this.field_g) {
          if (~param0 == ~this.field_g.field_e) {
            var5 = this.field_g;
            this.field_g = this.field_g.field_b;
            return var5;
          }
          this.field_g = this.field_g.field_b;
        }
        this.field_g = null;
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_a = (hh) null;
        }
        field_f = null;
    }

    final hg a(byte param0) {
        int fieldTemp$0 = 0;
        hg var2;
        int var3;
        var3 = EscapeVector.field_A;
        if (this.field_e > 0 &&
          this.field_b != this.field_c[this.field_e - 1]) {
          var2 = this.field_b;
          this.field_b = var2.field_b;
          return var2;
        }
        if (param0 != 62) {
          return (hg) null;
        }
        do {
          if (this.field_e >= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_c[fieldTemp$0].field_b;
        } while (this.field_c[-1 + this.field_e] == var2);
        this.field_b = var2.field_b;
        return var2;
    }

    final hg a(boolean param0) {
        if (param0) {
          this.a(-30L, 70);
        }
        this.field_e = 0;
        return this.a((byte) 62);
    }

    final void a(hg param0, int param1, long param2) {
        hg var5 = null;
        if (null != param0.field_d) {
          param0.c((byte) -115);
        }
        if (param1 != 10901) {
          return;
        }
        try {
          var5 = this.field_c[(int)((long)(this.field_d - 1) & param2)];
          param0.field_d = var5.field_d;
          param0.field_b = var5;
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
          param0.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ib.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, lk param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_39_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        ja[] var10 = null;
        la var11 = null;
        var9 = EscapeVector.field_A;
        try {
          if (!param3.c(0)) {
            return null;
          }
          if (param4 == 0) {
            var10 = dh.a(6629, param3);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_c == param1 &&
                param2 == var10[var8].field_g && ((0 == param5 ||
                var10[var8].field_f == param5) &&
                (var7_int == 0 ||
                !(param4 >= var10[var8].field_d)))) {
                var7_int = 1;
                param4 = var10[var8].field_d;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          if (param0 != 93) {
            field_a = (hh) null;
          }
          var11 = param3.a(-103, param4, param2, param5, param1);
          while (var11.field_f == 0) {
            en.a((byte) -31, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            return null;
          }
          if (var11.field_f != 2) {
            stackIn_41_0 = var7;
            return stackIn_41_0;
          }
          af.a(param3, var7, false);
          stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ib(int param0) {
        int var2 = 0;
        hg dupTemp$0 = null;
        hg var3 = null;
        this.field_e = 0;
        this.field_d = param0;
        this.field_c = new hg[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new hg();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.field_d = var3;
          var3.field_b = var3;
        }
    }

    static {
    }
}
