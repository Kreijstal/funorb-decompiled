/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ig {
    int field_G;
    private int field_J;
    private ol field_L;
    static di field_K;
    int field_I;
    static int field_H;
    static String field_N;
    static Boolean field_M;
    static int[] field_F;
    static String field_O;

    final static void a(boolean param0, float param1, String param2, byte param3) {
        try {
          if (qf.field_d == null) {
            qf.field_d = new ql(na.field_d, ii.field_F);
            na.field_d.a((byte) -104, (rj) (qf.field_d));
          }
          if (param3 > -117) {
            String var5 = (String) null;
            nb.a(true, 0.3101823627948761f, (String) null, (byte) 81);
          }
          qf.field_d.a(param0, param1, true, param2);
          ti.d();
          af.a(true, (byte) -79);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int g(int param0) {
        int var2 = 32 / ((param0 + 51) / 48);
        return this.field_J;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = stellarshard.field_B;
        try {
          if (!super.a(param0, param1, param2, param3, param4, (byte) 65, param6)) {
            if (param5 < 24) {
              nb.a((byte) 61);
            }
            return false;
          }
          var8_int = -this.field_G - param4 + param1;
          var9 = this.field_p - this.field_G * 2;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_J / var9;
          if (1 == param2) {
            this.field_L.a(var8_int, false);
          } else {
            if (2 == param2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_L.a(19692) > var12; var12++) {
                var13 = this.field_L.a((byte) -117, var12) - var8_int;
                var13 = var13 * var13;
                if (var10 > var13) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_L.a(var11, (byte) 111);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("nb.P(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int b(byte param0, int param1) {
        if (param1 >= 0 &&
          this.field_L.a(19692) > param1) {
          if (param0 == 95) {
            return this.field_L.a((byte) -117, param1);
          }
          return -11;
        }
        return -1;
    }

    final int d(boolean param0) {
        if (!param0) {
          rj var3 = (rj) null;
          this.a((rj) null, -89, -58, -17, 18, (byte) 87, -5);
        }
        return this.field_L.a(19692);
    }

    public static void a(byte param0) {
        if (param0 != 105) {
          field_K = (di) null;
        }
        field_O = null;
        field_M = null;
        field_N = null;
        field_F = null;
        field_K = null;
    }

    private nb() throws Throwable {
        throw new Error();
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_K = new di();
        field_H = 0;
        field_F = new int[256];
        field_N = "Turn ship - <img=4>+<img=5>     Thrust - <img=0>";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (var0 & 1)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_F[var1] = var0;
        }
        field_O = "Flame cannon";
    }
}
