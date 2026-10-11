/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    double field_c;
    double field_d;
    double field_a;
    double field_b;

    final static void a(boolean param0) {
        if (ei.field_G != null) {
          ei.field_G.o(3);
          pd.field_e = new lj();
          if (!param0) {
            sf.field_f.b(pd.field_e, 23143);
            return;
          }
          return;
        }
        pd.field_e = new lj();
        if (!param0) {
          sf.field_f.b(pd.field_e, 23143);
          return;
        }
    }

    final void a(double[] param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        try {
          var3_double = this.field_b * this.field_b;
          var5 = this.field_b * this.field_d;
          var7 = this.field_b * this.field_c;
          var9 = this.field_b * this.field_a;
          var11 = this.field_d * this.field_d;
          var13 = this.field_d * this.field_c;
          var15 = this.field_a * this.field_d;
          if (param1 != 8) {
            this.field_c = 1.09697255862232;
          }
          var17 = this.field_c * this.field_c;
          var19 = this.field_a * this.field_c;
          var21 = this.field_a * this.field_a;
          param0[7] = var3_double + var17 - var11 - var21;
          param0[10] = -var5 + (var19 - var5) + var19;
          param0[5] = var15 + (-var7 + var15 - var7);
          param0[6] = var13 + (-var9 + (-var9 + var13));
          param0[4] = var9 + (var13 + (var9 + var13));
          param0[9] = var15 + var7 + var15 + var7;
          param0[8] = var19 + (var5 + var19) + var5;
          param0[11] = -var11 + (-var17 + (var3_double + var21));
          param0[3] = -var17 + (-var21 + (var3_double + var11));
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pi.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(double param0, double param1, double param2, byte param3, double param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        double var10Lifetime1;
        double var12Lifetime1;
        param4 = param4 * 0.5;
        if (param3 == -20) {
          var10 = Math.sin(param4);
          var12 = Math.cos(param4);
          this.field_b = var12;
          this.field_c = var10 * param2;
          this.field_a = var10 * param1;
          this.field_d = param0 * var10;
          return;
        }
        this.field_d = 0.35249815946659313;
        var10Lifetime1 = Math.sin(param4);
        var12Lifetime1 = Math.cos(param4);
        this.field_b = var12Lifetime1;
        this.field_c = var10Lifetime1 * param2;
        this.field_a = var10Lifetime1 * param1;
        this.field_d = param0 * var10Lifetime1;
    }

    final void a(pi param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        try {
          var3_double = -(this.field_c * param0.field_c) + (this.field_b * param0.field_b - param0.field_d * this.field_d) - this.field_a * param0.field_a;
          var5 = param0.field_c * this.field_a + (this.field_b * param0.field_d + param0.field_b * this.field_d) - param0.field_a * this.field_c;
          var7 = this.field_d * param0.field_a + (this.field_c * param0.field_b - this.field_a * param0.field_d + param0.field_c * this.field_b);
          this.field_a = -(this.field_d * param0.field_c) + (param0.field_d * this.field_c + param0.field_b * this.field_a) + param0.field_a * this.field_b;
          this.field_b = var3_double;
          this.field_d = var5;
          this.field_c = var7;
          int var9 = 23 % ((-63 - param1) / 61);
          this.a((byte) -75);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        double var2 = 0.0;
        double var2Lifetime1;
        if (param0 >= -10) {
          this.field_a = -0.5088910191033775;
          var2 = this.field_c * this.field_c + (this.field_d * this.field_d + this.field_b * this.field_b) + this.field_a * this.field_a;
          if (0.999999999999 > var2) {
            var2 = 1.0 / Math.sqrt(var2);
            this.field_a = this.field_a * var2;
            this.field_c = this.field_c * var2;
            this.field_b = this.field_b * var2;
            this.field_d = this.field_d * var2;
            return;
          }
          if (var2 > 1.000000000001) {
            var2 = 1.0 / Math.sqrt(var2);
            this.field_a = this.field_a * var2;
            this.field_c = this.field_c * var2;
            this.field_b = this.field_b * var2;
            this.field_d = this.field_d * var2;
            return;
          }
          return;
        }
        var2Lifetime1 = this.field_c * this.field_c + (this.field_d * this.field_d + this.field_b * this.field_b) + this.field_a * this.field_a;
        if (0.999999999999 > var2Lifetime1) {
          var2Lifetime1 = 1.0 / Math.sqrt(var2Lifetime1);
          this.field_a = this.field_a * var2Lifetime1;
          this.field_c = this.field_c * var2Lifetime1;
          this.field_b = this.field_b * var2Lifetime1;
          this.field_d = this.field_d * var2Lifetime1;
          return;
        }
        if (var2Lifetime1 > 1.000000000001) {
          var2Lifetime1 = 1.0 / Math.sqrt(var2Lifetime1);
          this.field_a = this.field_a * var2Lifetime1;
          this.field_c = this.field_c * var2Lifetime1;
          this.field_b = this.field_b * var2Lifetime1;
          this.field_d = this.field_d * var2Lifetime1;
          return;
        }
    }

    public pi() {
        this.field_b = 1.0;
    }

    final static String a(String param0, pf param1, String param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a((byte) -36)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          if (param3 != 1) {
            var5 = (String) null;
            pi.a((String) null, (pf) null, (String) null, 1);
          }
          stackIn_6_0 = param0 + " - " + param1.b((byte) 1) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pi.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
