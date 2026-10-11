/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends kg {
    static int field_P;
    private int field_F;
    static gq field_O;
    int field_M;
    static vr field_K;
    private hn field_J;
    static int field_G;
    static boolean field_L;
    static qr field_N;
    static boolean[][] field_E;
    int field_I;

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
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
        vg var15 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, (byte) 101, param3, param4, param5, param6)) {
            if (param2 <= 95) {
              var15 = (vg) null;
              this.a(83, 56, (byte) 48, -95, 108, -98, (vg) null);
            }
            return false;
          }
          var8_int = -this.field_M + param1 - param4;
          var9 = -(2 * this.field_M) + this.field_x;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_F * var8_int / var9;
          if (param0 == 1) {
            this.field_J.a(13378, var8_int);
          } else {
            if (param0 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_J.a((byte) 56) > var12; var12++) {
                var13 = -var8_int + this.field_J.a((byte) -117, var12);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (0 > var11) {
                return true;
              }
              this.field_J.a(var11, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_29_0 = var8;
          stackIn_29_1 = new StringBuilder().append("td.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var7Lifetime1;
        if (param3 == param0) {
          return false;
        }
        if (param0 > param3) {
          var7 = param0;
          param0 = param3;
          param3 = var7;
          var7Lifetime1 = param2;
          param2 = param5;
          param5 = var7Lifetime1;
        }
        if (param0 >= param6) {
          return false;
        }
        if (param6 > param3) {
          return false;
        }
        if ((-param0 + param6) * (param5 - param2) > (-param2 + param4) * (-param0 + param3)) {
          return true;
        }
        if (param1 <= -74) {
          return false;
        }
        field_P = -5;
        return false;
    }

    final int a(byte param0) {
        int var2 = -76 / ((param0 - 68) / 51);
        return this.field_F;
    }

    public static void a(int param0) {
        field_O = null;
        int var1 = 20 % ((param0 + 38) / 60);
        field_N = null;
        field_K = null;
        field_E = (boolean[][]) null;
    }

    final int g(byte param0) {
        if (param0 != 93) {
          field_K = (vr) null;
          return this.field_J.a((byte) 56);
        }
        return this.field_J.a((byte) 56);
    }

    final int a(int param0, byte param1) {
        if (param0 < 0) {
          return -1;
        }
        if (param0 >= this.field_J.a((byte) 56)) {
          return -1;
        }
        if (param1 == -58) {
          return this.field_J.a((byte) 124, param0);
        }
        this.a((byte) -8);
        return this.field_J.a((byte) 124, param0);
    }

    private td() throws Throwable {
        throw new Error();
    }

    static {
        field_P = 0;
        field_O = new gq(2, 4, 4, 0);
    }
}
