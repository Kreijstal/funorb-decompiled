/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends lg {
    private hq field_G;
    int field_C;
    private int field_D;
    int field_F;
    static int field_E;

    final int b(int param0, int param1) {
        if (param1 != 0) {
          return -27;
        }
        if (param0 < 0) {
          return -1;
        }
        if (param0 < this.field_G.a(true)) {
          return this.field_G.b(95, param0);
        }
        return -1;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
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
        var14 = Torquing.field_u;
        try {
          if (param6 <= 5) {
            return false;
          }
          if (!super.a(param0, param1, param2, param3, param4, param5, (byte) 89)) {
            return false;
          }
          var8_int = -param1 + (param4 - this.field_F);
          var9 = this.field_p - 2 * this.field_F;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_D / var9;
          if (param0 == 1) {
            this.field_G.d(var8_int, -8673);
          } else {
            if (param0 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_G.a(true) > var12; var12++) {
                var13 = -var8_int + this.field_G.b(46, var12);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 >= 0) {
                this.field_G.c(var11, 17424);
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("ri.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
          return -1;
        }
        return this.field_G.a(true);
    }

    final int a(byte param0) {
        if (param0 != -108) {
          this.a((byte) -62);
          return this.field_D;
        }
        return this.field_D;
    }

    private ri() throws Throwable {
        throw new Error();
    }

    static {
    }
}
