/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Quaternion {
    double z;
    double x;
    double y;
    double w;

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

    final void writeRotationMatrix(double[] param0, int param1) {
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
          var3_double = this.w * this.w;
          var5 = this.w * this.x;
          var7 = this.w * this.z;
          var9 = this.w * this.y;
          var11 = this.x * this.x;
          var13 = this.x * this.z;
          var15 = this.y * this.x;
          if (param1 != 8) {
            this.z = 1.09697255862232;
          }
          var17 = this.z * this.z;
          var19 = this.y * this.z;
          var21 = this.y * this.y;
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

    final void setAxisAngle(double param0, double param1, double param2, byte param3, double param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        double var10Lifetime1;
        double var12Lifetime1;
        param4 = param4 * 0.5;
        if (param3 == -20) {
          var10 = Math.sin(param4);
          var12 = Math.cos(param4);
          this.w = var12;
          this.z = var10 * param2;
          this.y = var10 * param1;
          this.x = param0 * var10;
          return;
        }
        this.x = 0.35249815946659313;
        var10Lifetime1 = Math.sin(param4);
        var12Lifetime1 = Math.cos(param4);
        this.w = var12Lifetime1;
        this.z = var10Lifetime1 * param2;
        this.y = var10Lifetime1 * param1;
        this.x = param0 * var10Lifetime1;
    }

    final void a(Quaternion param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        try {
          var3_double = -(this.z * param0.z) + (this.w * param0.w - param0.x * this.x) - this.y * param0.y;
          var5 = param0.z * this.y + (this.w * param0.x + param0.w * this.x) - param0.y * this.z;
          var7 = this.x * param0.y + (this.z * param0.w - this.y * param0.x + param0.z * this.w);
          this.y = -(this.x * param0.z) + (param0.x * this.z + param0.w * this.y) + param0.y * this.w;
          this.w = var3_double;
          this.x = var5;
          this.z = var7;
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
          this.y = -0.5088910191033775;
          var2 = this.z * this.z + (this.x * this.x + this.w * this.w) + this.y * this.y;
          if (0.999999999999 > var2) {
            var2 = 1.0 / Math.sqrt(var2);
            this.y = this.y * var2;
            this.z = this.z * var2;
            this.w = this.w * var2;
            this.x = this.x * var2;
            return;
          }
          if (var2 > 1.000000000001) {
            var2 = 1.0 / Math.sqrt(var2);
            this.y = this.y * var2;
            this.z = this.z * var2;
            this.w = this.w * var2;
            this.x = this.x * var2;
            return;
          }
          return;
        }
        var2Lifetime1 = this.z * this.z + (this.x * this.x + this.w * this.w) + this.y * this.y;
        if (0.999999999999 > var2Lifetime1) {
          var2Lifetime1 = 1.0 / Math.sqrt(var2Lifetime1);
          this.y = this.y * var2Lifetime1;
          this.z = this.z * var2Lifetime1;
          this.w = this.w * var2Lifetime1;
          this.x = this.x * var2Lifetime1;
          return;
        }
        if (var2Lifetime1 > 1.000000000001) {
          var2Lifetime1 = 1.0 / Math.sqrt(var2Lifetime1);
          this.y = this.y * var2Lifetime1;
          this.z = this.z * var2Lifetime1;
          this.w = this.w * var2Lifetime1;
          this.x = this.x * var2Lifetime1;
          return;
        }
    }

    public Quaternion() {
        this.w = 1.0;
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
            Quaternion.a((String) null, (pf) null, (String) null, 1);
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
