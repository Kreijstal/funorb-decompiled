/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ig {
    int field_N;
    int field_F;
    int field_I;
    int field_J;
    static oj field_G;
    int field_L;
    int field_H;
    static pb[] field_P;
    static int field_O;
    static int field_M;
    static float field_K;

    public static void g(int param0) {
        field_P = null;
        if (param0 != 0) {
          return;
        }
        field_G = null;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = stellarshard.field_B;
        try {
          if (param5 < 24) {
            this.field_J = -18;
          }
          if (!super.a(param0, param1, param2, param3, param4, (byte) 67, param6)) {
            return false;
          }
          var8_int = param1 - (this.field_L + this.field_w + param4);
          var9 = param3 + (-this.field_k + (-param6 - this.field_F));
          if (this.field_I * this.field_I <= var8_int * var8_int + var9 * var9) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - sj.field_I;
          if (var10 < 0.0) {
            var10 = var10 - 3.141592653589793 / (double)this.field_N;
          } else {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_N;
            }
          }
          this.field_J = (int)(var10 * (double)this.field_N / 6.283185307179586);
          while (this.field_N <= this.field_J) {
            this.field_J = this.field_J - this.field_N;
          }
          while (this.field_J < 0) {
            this.field_J = this.field_J + this.field_N;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("fg.P(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private fg() throws Throwable {
        throw new Error();
    }

    static {
        field_G = new oj();
    }
}
