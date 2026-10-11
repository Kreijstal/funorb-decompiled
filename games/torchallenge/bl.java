/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ng {
    int field_Y;
    private m field_R;
    static rj field_S;
    int field_W;
    private int field_Z;
    static int[] field_T;
    static int[][] field_O;
    static int field_P;
    static boolean field_U;
    static int field_X;
    static wb field_V;
    static String field_Q;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 != -81) {
            this.a(58, 19);
          }
          if (!super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param4 + param1 - this.field_W;
          var9 = -(2 * this.field_W) + this.field_p;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_Z / var9;
          if (1 != param5) {
            if (param5 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; this.field_R.a(false) > var12; var12++) {
              var13 = -var8_int + this.field_R.c(var12, 7);
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_R.b(var11, (byte) -116);
            }
          } else {
            this.field_R.a(var8_int, (byte) 46);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("bl.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static ka[] a(int param0, int param1, lj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ka[] stackIn_5_0 = null;
        ka[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!lk.a(160, param2, param1, param0)) {
            stackIn_2_0 = null;
            return (ka[]) (stackIn_2_0);
          }
          if (param3 == 2147483647) {
            stackIn_7_0 = de.a(true);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ka[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 < 0) {
          return -1;
        }
        if (param1 < this.field_R.a(false)) {
          int var3 = 127 / ((param0 - 59) / 38);
          return this.field_R.c(param1, 7);
        }
        return -1;
    }

    final int d(boolean param0) {
        if (!param0) {
          return 97;
        }
        return this.field_R.a(!param0 ? true : false);
    }

    private bl() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 > -47) {
            field_X = 3;
          }
          var3_int = 1;
          while (param0 > 1) {
            if ((1 & param0) != 0) {
              var3_int = var3_int * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
          }
          if (1 == param0) {
            stackIn_13_0 = var3_int * param2;
            return stackIn_13_0;
          }
          stackIn_15_0 = var3_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "bl.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
          this.d(false);
          return this.field_Z;
        }
        return this.field_Z;
    }

    public static void e(boolean param0) {
        field_T = null;
        field_O = (int[][]) null;
        field_V = null;
        field_S = null;
        field_Q = null;
        if (param0) {
          bl.a(-63, (byte) 27, -118);
        }
    }

    static {
        field_O = new int[2][5];
        field_P = 0;
        field_S = new rj();
        field_U = true;
        field_Q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
