/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends wp {
    int field_F;
    static int field_I;
    int field_G;
    int field_K;
    static ki field_J;
    static boolean field_E;
    int field_M;
    int field_L;
    int field_H;

    public static void a(int param0) {
        if (param0 != 0) {
          field_E = false;
          field_J = null;
          return;
        }
        field_J = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 104 / ((param0 - 78) / 36);
        kt.b((byte) 108);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!super.a(param0, -47, param2, param3, param4, param5, param6)) {
            if (param1 > -42) {
              vb.a((byte) 68, false);
            }
            return false;
          }
          var8_int = param5 + (-param4 + (-this.field_r - this.field_G));
          var9 = -this.field_K - this.field_v + (-param6 + param2);
          if (this.field_F * this.field_F > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - s.field_m;
            if (!(var10 < 0.0)) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_L;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_L;
            }
            this.field_H = (int)((double)this.field_L * var10 / 6.283185307179586);
            while (this.field_L <= this.field_H) {
              this.field_H = this.field_H - this.field_L;
            }
            while (this.field_H < 0) {
              this.field_H = this.field_H + this.field_L;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("vb.R(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_I = -1;
    }
}
