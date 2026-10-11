/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends hl {
    static int[] field_F;
    int field_L;
    int field_N;
    static String[] field_O;
    static kc[] field_G;
    int field_M;
    static long[] field_J;
    int field_E;
    int field_I;
    int field_H;
    static char[] field_K;

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Main.field_T;
        try {
          if (param3 > -14) {
            return false;
          }
          if (!super.a(param0, param1, param2, -39, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_o - param0 - this.field_E + param2;
          var9 = -this.field_i - param1 - this.field_M + param6;
          if (this.field_H * this.field_H > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - ta.field_Z;
            if (!(0.0 > var10)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_N;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_N;
            }
            this.field_L = (int)(var10 * (double)this.field_N / 6.283185307179586);
            while (this.field_L >= this.field_N) {
              this.field_L = this.field_L - this.field_N;
            }
            while (this.field_L < 0) {
              this.field_L = this.field_L + this.field_N;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("se.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 52) {
          return;
        }
        field_O = null;
        field_G = null;
        field_J = null;
        field_K = null;
        field_F = null;
    }

    final static void e(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          var5 = tb.field_h;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 >= 55) {
            return;
          }
          field_K = (char[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "se.D(" + param0 + ')');
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    static {
        field_F = new int[8192];
        field_O = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_J = new long[1000];
        field_K = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
