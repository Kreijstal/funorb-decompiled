/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends t {
    static java.math.BigInteger field_F;
    static k field_E;
    int field_C;
    static boolean field_J;
    int field_H;
    int field_I;
    static ad field_B;
    int field_K;
    int field_G;
    int field_D;

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param1 - this.field_I - (this.field_r + param6);
          var9 = -param0 + (-this.field_e - this.field_C) + param5;
          if (this.field_G * this.field_G > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - rl.field_b;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)this.field_K;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_K;
              }
            }
            this.field_D = (int)(var10 * (double)this.field_K / 6.283185307179586);
            while (this.field_K <= this.field_D) {
              this.field_D = this.field_D - this.field_K;
            }
            while (this.field_D < 0) {
              this.field_D = this.field_D + this.field_K;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("fj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          ch.field_d = f.field_i;
          if (255 != param3) {
            if (100 > param3) {
              cg.field_a = lh.a(true, param1, param3);
            } else {
              if (param3 > 105) {
                cg.field_a = lh.a(true, param1, param3);
              } else {
                cg.field_a = jj.a(args, true);
              }
            }
          } else {
            stackIn_4_0 = -89;
            stackIn_5_1 = !(dd.field_d >= 13);
            cg.field_a = hj.$cfr$intArgs$a$ae8766b723be(stackIn_4_0, stackIn_5_1);
          }
          if (param2 == -27967) {
            return;
          }
          field_F = (java.math.BigInteger) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fj.A(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        field_E = null;
        if (param0 == 62) {
          field_B = null;
          field_F = null;
          return;
        }
        String var2 = (String) null;
        fj.a((String[]) null, (String) null, -117, 1);
        field_B = null;
        field_F = null;
    }

    static {
        field_F = new java.math.BigInteger("65537");
    }
}
