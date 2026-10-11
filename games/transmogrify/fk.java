/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lj {
    static ib field_F;
    private int field_I;
    static int field_E;
    int field_G;
    static String field_D;
    private te field_H;
    int field_B;

    final int b(byte param0, int param1) {
        if (param1 >= 0 &&
          param1 < this.field_H.a(1)) {
          if (param0 < 114) {
            this.field_G = -20;
          }
          return this.field_H.b(param1, -14927);
        }
        return -1;
    }

    public static void a(byte param0) {
        int var1 = 19 % ((param0 - 2) / 44);
        field_F = null;
        field_D = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
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
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param3 + param0 - this.field_B;
          var9 = this.field_l - this.field_B * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_I * var8_int / var9;
          if (1 != param1) {
            if (param1 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_H.a(1); var12++) {
              var13 = this.field_H.b(var12, -14927) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_H.a(var11, 0);
            }
          } else {
            this.field_H.b(var8_int, (byte) 118);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("fk.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = hd.a('_', (byte) -81, "", param0);
          var3 = vl.b(-1, param2);
          if (param1 != 34) {
            fk.a((byte) -127);
          }
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("fk.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int h(int param0) {
        if (param0 != -1) {
          return 21;
        }
        return this.field_H.a(param0 + 2);
    }

    final int i(int param0) {
        if (param0 != -24733) {
          this.b((byte) -6, -77);
        }
        return this.field_I;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        field_D = "Cancel";
    }
}
