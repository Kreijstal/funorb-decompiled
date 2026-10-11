/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fw {
    private fh field_Q;
    int field_R;
    private int field_L;
    int field_S;
    static int[][] field_M;
    static String field_P;
    static je field_N;
    static RgbSprite field_T;
    static String field_O;

    final int a(int param0, byte param1) {
        if (param0 < 0) {
          return -1;
        }
        if (param0 >= this.field_Q.a(-102)) {
          return -1;
        }
        if (param1 == -47) {
          return this.field_Q.d(param0, 652110180);
        }
        return -9;
    }

    final int d(byte param0) {
        if (param0 != -39) {
          return -55;
        }
        return this.field_Q.a(param0 ^ 85);
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 <= 103) {
            field_N = (je) null;
          }
          if (!super.a(param0, param1, param2, 122, param4, param5, param6)) {
            return false;
          }
          var8_int = -param1 + (param0 - this.field_R);
          var9 = -(this.field_R * 2) + this.field_l;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_L * var8_int / var9;
          if (param6 != 1) {
            if (param6 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; this.field_Q.a(-125) > var12; var12++) {
              var13 = this.field_Q.d(var12, 652110180) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (0 <= var11) {
              this.field_Q.b(var11, -66);
            }
          } else {
            this.field_Q.e(26884, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("pi.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 == -1) {
          return this.field_L;
        }
        kb var3 = (kb) null;
        this.a(104, -75, 118, -4, (kb) null, 10, 30);
        return this.field_L;
    }

    public static void a(byte param0) {
        field_O = null;
        field_P = null;
        field_M = (int[][]) null;
        if (param0 != -63) {
          return;
        }
        field_N = null;
        field_T = null;
    }

    private pi() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Most units";
        field_M = new int[][]{null, null, null, new int[]{0, 0, -1, -1}, null, new int[]{0, -1, -1, -1, -1}};
        field_O = "Just play";
    }
}
