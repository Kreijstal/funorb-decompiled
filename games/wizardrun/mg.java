/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends va {
    static String[] field_q;
    private int field_p;
    static o field_s;
    private ti field_r;

    final static ai a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        ai var9 = null;
        RuntimeException var9_ref = null;
        byte[] var10 = null;
        ai stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ai(param8, param7, param6, param0, param5, param2, param1);
          fh.field_t.a(var9, false);
          og.a(var9, param3, param4 - 160);
          if (param4 != 99) {
            var10 = (byte[]) null;
            mg.a(88, (byte[]) null);
          }
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("mg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static ua a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ua var3 = null;
        Object stackIn_2_0 = null;
        ua stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 97 / ((param0 + 30) / 48);
          if (param1 == null) {
            stackIn_2_0 = null;
            return (ua) (stackIn_2_0);
          }
          var3 = new ua(param1, ph.field_q, ne.field_h, cg.field_k, tf.field_b, ic.field_b, mf.field_j);
          eb.a(0);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("mg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    mg(int param0) {
        super(param0);
    }

    public static void h(byte param0) {
        if (param0 != -102) {
          field_s = (o) null;
          field_s = null;
          field_q = null;
          return;
        }
        field_s = null;
        field_q = null;
    }

    final void i(byte param0) {
        this.field_m = (this.field_p + 7) / 8;
        if (param0 != -31) {
          field_q = (String[]) null;
        }
    }

    final int m(int param0) {
        int var2 = -128 % ((param0 + 9) / 54);
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return 255 & this.field_k[fieldTemp$0] - this.field_r.b((byte) 73);
    }

    final void c(byte param0, int param1) {
        int var3 = -41 / ((-1 - param0) / 44);
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(this.field_r.b((byte) 60) + param1);
    }

    final void l(int param0) {
        if (param0 != 19967) {
          return;
        }
        this.field_p = this.field_m * 8;
    }

    mg(byte[] param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          for (var5_int = param2; var5_int < param1; var5_int++) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            param3[var5_int + param0] = (byte)(this.field_k[fieldTemp$0] - this.field_r.b((byte) 125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("mg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 != 109) {
          return;
        }
        try {
          this.field_r = new ti(param0);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "mg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = wizardrun.field_H;
        if (param1 != -11719) {
          return 35;
        }
        int var3 = this.field_p >> 3;
        int var4 = 8 - (this.field_p & 7);
        int var5 = 0;
        this.field_p = this.field_p + param0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_k[incrementValue$0] & lj.field_b[var4]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 == param0) {
          var5 = var5 + (lj.field_b[var4] & this.field_k[var3]);
        } else {
          var5 = var5 + (this.field_k[var3] >> var4 - param0 & lj.field_b[param0]);
        }
        return var5;
    }

    static {
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
