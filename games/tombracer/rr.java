/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends rj {
    int field_E;
    int field_z;
    int field_C;
    int field_B;
    int field_F;
    int field_A;
    static String field_G;

    public static void b(int param0) {
        field_G = null;
        if (param0 == 0) {
          return;
        }
        field_G = (String) null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if (!super.a(112, param1, param2, param3, param4, param5, param6)) {
            if (param0 <= 70) {
              rr.b(-11);
            }
            return false;
          }
          var8_int = param6 - this.field_i - param1 - this.field_E;
          var9 = -param2 - (this.field_n - (-this.field_C + param3));
          if (this.field_F * this.field_F > var8_int * var8_int + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8_int) - uca.field_b;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_B;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_B;
              }
            }
            this.field_A = (int)(var10 * (double)this.field_B / 6.283185307179586);
            while (this.field_B <= this.field_A) {
              this.field_A = this.field_A - this.field_B;
            }
            while (this.field_A < 0) {
              this.field_A = this.field_A + this.field_B;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("rr.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param6).append(')').toString());
        }
    }

    private rr() throws Throwable {
        throw new Error();
    }

    static {
        field_G = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
