/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends kf {
    static int[] field_M;
    int field_L;
    int field_H;
    static dg field_E;
    int field_I;
    int field_K;
    int field_G;
    int field_F;
    static pk[] field_J;

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          lf.a(param4, param2, param1 + 1, 10000536);
          lf.a(param4, param2 + param3, param1 + 1, 12105912);
          var5_int = 1;
          if (lf.field_c > var5_int + param2) {
            var5_int = lf.field_c - param2;
          }
          var6 = param3;
          if (param2 + var6 > lf.field_h) {
            var6 = lf.field_h - param2;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 48 * var7 / param3 + 152;
            var9 = var8 | (var8 << 16 | var8 << 8);
            lf.field_b[param4 + lf.field_f * (var7 + param2)] = var9;
            lf.field_b[param4 + lf.field_f * (param2 + var7) + param1] = var9;
          }
          if (param0) {
            return;
          }
          field_J = (pk[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "ae.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean i(int param0) {
        if (param0 != 0) {
          return true;
        }
        return pb.c(true);
    }

    public static void j(int param0) {
        field_J = null;
        field_E = null;
        field_M = null;
        if (param0 < -125) {
          return;
        }
        field_E = (dg) null;
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_t - (param5 + this.field_L - param6);
          var9 = param3 - this.field_F - (param4 + this.field_o);
          if (var8_int * var8_int + var9 * var9 >= this.field_I * this.field_I) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - wl.field_n;
          if (var10 < 0.0) {
            var10 = var10 - 3.141592653589793 / (double)this.field_K;
          } else {
            if (var10 > 0.0) {
              var10 = var10 + 3.141592653589793 / (double)this.field_K;
            }
          }
          this.field_G = (int)((double)this.field_K * var10 / 6.283185307179586);
          while (this.field_G >= this.field_K) {
            this.field_G = this.field_G - this.field_K;
          }
          while (0 > this.field_G) {
            this.field_G = this.field_G + this.field_K;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("ae.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_M = new int[12];
        field_E = new dg();
    }
}
