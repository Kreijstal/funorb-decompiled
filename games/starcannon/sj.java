/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends dk {
    static byte[][] field_B;
    int field_A;
    static String field_C;
    private int field_H;
    private ve field_F;
    static String field_D;
    static hl[] field_E;
    int field_G;
    static int field_I;

    public static void f(byte param0) {
        field_B = (byte[][]) null;
        field_D = null;
        int var1 = 80 / ((param0 + 39) / 52);
        field_E = null;
        field_C = null;
    }

    final int e(int param0) {
        if (param0 != -32242) {
          return 43;
        }
        return this.field_H;
    }

    final int a(int param0, int param1) {
        if (param0 != 2) {
          return -69;
        }
        if (param1 < 0 ||
          this.field_F.a(true) <= param1) {
          return -1;
        }
        return this.field_F.a(0, param1);
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (!ka.field_r.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            if (param1 > 0) {
              field_B = (byte[][]) null;
            }
            while (true) {
              if (var3 >= param0.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("sj.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(byte param0) {
        if (param0 <= 103) {
          return 82;
        }
        return this.field_F.a(true);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = StarCannon.field_A;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param5 - param2 - this.field_G;
          var9 = -(this.field_G * 2) + this.field_i;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_H / var9;
          if (param6 != 1) {
            if (2 != param6) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_F.a(true); var12++) {
              var13 = this.field_F.a(0, var12) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_F.c(param4 + 138, var11);
            }
          } else {
            this.field_F.b(var8_int, 1);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("sj.G(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        field_B = new byte[50][];
        field_C = "Unpacking graphics";
        field_D = "Loading fonts";
    }
}
