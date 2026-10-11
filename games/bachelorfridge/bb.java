/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends hf {
    private int field_E;
    private mb field_G;
    static int field_F;
    int field_D;
    int field_A;

    final int a(int param0) {
        if (param0 != 2) {
          return 30;
        }
        return this.field_G.a((byte) -127);
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
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
        var14 = BachelorFridge.field_y;
        try {
          if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_A + param0 - param2;
          var9 = -(2 * this.field_A) + this.field_p;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = this.field_E * var8_int / var9;
          if (param3 != 1) {
            if (param3 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; this.field_G.a((byte) -125) > var12; var12++) {
              var13 = -var8_int + this.field_G.a((byte) -24, var12);
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_G.a(var11, true);
            }
          } else {
            this.field_G.c(var8_int, param1 ^ 7359);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("bb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void h(int param0) {
        lga.a(sc.field_m, true);
        if (param0 != 0) {
          bb.h(-125);
        }
    }

    final int a(int param0, int param1) {
        if (param1 < ~param0) {
          return -1;
        }
        if (this.field_G.a((byte) -126) > param0) {
          return this.field_G.a((byte) -24, param0);
        }
        return -1;
    }

    private bb() throws Throwable {
        throw new Error();
    }

    final int g(int param0) {
        if (param0 != 0) {
          return -15;
        }
        return this.field_E;
    }

    static {
        field_F = 15;
    }
}
