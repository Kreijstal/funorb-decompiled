/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends d {
    static fe field_M;
    int field_K;
    static int[] field_N;
    private re field_I;
    private int field_H;
    static String field_J;
    int field_L;

    public static void b(boolean param0) {
        if (param0) {
          field_N = (int[]) null;
        }
        field_N = null;
        field_M = null;
        field_J = null;
    }

    final int a(int param0, byte param1) {
        if (0 <= param0 &&
          this.field_I.b(125) > param0) {
          if (param1 <= 121) {
            this.a(112, (byte) -62);
          }
          return this.field_I.a(0, param0);
        }
        return -1;
    }

    final static void c(int param0, int param1) {
        ue.b((byte) 77, param0);
        if (param1 < 84) {
          jf.c(-61, 78);
        }
    }

    final int a(byte param0) {
        if (param0 > -44) {
          this.a(-3, (byte) 2);
        }
        return this.field_I.b(117);
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
          return -100;
        }
        if (bi.field_e >= param0 + param2) {
          return param2;
        }
        if (0 <= -param0 + (param1 + param2)) {
          return -param0 + param2 + param1;
        }
        return bi.field_e - param0;
    }

    final int c(boolean param0) {
        if (!param0) {
          field_N = (int[]) null;
        }
        return this.field_H;
    }

    private jf() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, (byte) -115, param6)) {
            if (param5 >= -107) {
              field_N = (int[]) null;
            }
            return false;
          }
          var8_int = -param1 + (param0 - this.field_K);
          var9 = this.field_n - this.field_K * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_H * var8_int / var9;
          if (param4 == 1) {
            this.field_I.a((byte) 103, var8_int);
          } else {
            if (2 == param4) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; var12 < this.field_I.b(127); var12++) {
                var13 = -var8_int + this.field_I.a(0, var12);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_I.b(var11, 7810);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_29_0 = var8;
          stackIn_29_1 = new StringBuilder().append("jf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_J = "Unable to add name - system busy";
    }
}
