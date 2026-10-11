/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends rj {
    private int field_A;
    int field_E;
    int field_C;
    static String field_z;
    private tq field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
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
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 < 70) {
            return false;
          }
          if (!super.a(98, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param6 - (param1 + this.field_E);
          var9 = this.field_m - 2 * this.field_E;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_A / var9;
          if (1 == param4) {
            this.field_D.a(var8_int, (byte) 84);
          } else {
            if (param4 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; var12 < this.field_D.b(-1); var12++) {
                var13 = -var8_int + this.field_D.b(-1, var12);
                var13 = var13 * var13;
                if (var13 < var10) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_D.a(var11, 100);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("kd.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        if (0 > param0 ||
          param0 >= this.field_D.b(param1 + 13)) {
          return -1;
        }
        if (param1 != -14) {
          this.field_D = (tq) null;
        }
        return this.field_D.b(param1 ^ 13, param0);
    }

    final int c(int param0) {
        if (param0 != -3) {
          this.a(-86, (byte) 101);
        }
        return this.field_D.b(param0 ^ 2);
    }

    final int b(int param0) {
        if (param0 != 24857) {
          this.field_D = (tq) null;
        }
        return this.field_A;
    }

    public static void a(byte param0) {
        if (param0 != -121) {
          return;
        }
        field_z = null;
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        if (param0 > -19) {
          return true;
        }
        stackIn_5_0 = ((param1 & 393216) != 0);
        stackIn_10_0 = !(!stackIn_5_0 | pca.b(param2, 94, param1)) || (uu.a(param1, param2, (byte) -96));
        return stackIn_10_0;
    }

    private kd() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "Rolling Jones boulders";
    }
}
