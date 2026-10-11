/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends pc {
    int field_K;
    int field_B;
    static int field_E;
    int field_D;
    int field_I;
    static dl field_H;
    int field_C;
    int field_J;
    static int field_F;

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          if (param3) {
            field_E = -37;
          }
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param6 - this.field_J - this.field_r - param0;
          var9 = param1 - (this.field_K + (param4 + this.field_j));
          if (this.field_I * this.field_I <= var8_int * var8_int + var9 * var9) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - lk.field_a;
          if (!(0.0 > var10)) {
            if (var10 > 0.0) {
              var10 = var10 + 3.141592653589793 / (double)this.field_D;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_D;
          }
          this.field_B = (int)((double)this.field_D * var10 / 6.283185307179586);
          while (this.field_B >= this.field_D) {
            this.field_B = this.field_B - this.field_D;
          }
          while (this.field_B < 0) {
            this.field_B = this.field_B + this.field_D;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("pa.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(f[][] param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param3 > -21) {
            pa.e((byte) 22);
          }
          for (var4_int = -param2 + (param0.length - 2); var4_int >= param2 + 1; var4_int--) {
            for (var5 = 1 + param1; var5 < -1 + (-param1 + param0[0].length); var5++) {
              param0[var4_int][var5].b(105, var4_int, param0, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pa.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private pa() throws Throwable {
        throw new Error();
    }

    public static void e(byte param0) {
        if (param0 >= -90) {
          field_F = -63;
        }
        field_H = null;
    }

    static {
        field_E = 56;
    }
}
