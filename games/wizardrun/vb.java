/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends pl {
    static rc field_F;
    static String field_I;
    private lb field_H;
    int field_G;
    int field_J;
    private int field_K;

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var13 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = wizardrun.field_H;
        try {
          var8_int = 49 / ((param1 - 12) / 36);
          if (!super.a(param0, (byte) -103, param2, param3, param4, param5, param6)) {
            return false;
          }
          var9 = -this.field_G - param0 + param2;
          var10 = -(2 * this.field_G) + this.field_r;
          if (var9 > var10) {
            var9 = var10;
          }
          if (var9 < 0) {
            var9 = 0;
          }
          var9 = this.field_K * var9 / var10;
          if (param4 != 1) {
            if (param4 != 2) {
              return true;
            }
            var11 = 2147483647;
            var12 = -1;
            for (var13 = 0; var13 < this.field_H.a(31); var13++) {
              var14 = -var9 + this.field_H.a(-112, var13);
              var14 = var14 * var14;
              if (var11 > var14) {
                var12 = var13;
                var11 = var14;
              }
            }
            if (var12 >= 0) {
              this.field_H.d(-1, var12);
            }
          } else {
            this.field_H.e(16711838, var9);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("vb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (param0 != -10455) {
          this.field_J = 63;
        }
        if (param1 < 0 ||
          this.field_H.a(param0 + 10327) <= param1) {
          return -1;
        }
        return this.field_H.a(-126, param1);
    }

    final int d(int param0) {
        if (param0 != 0) {
          return 84;
        }
        return this.field_H.a(-5);
    }

    final static o[] c(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -3) {
          return (o[]) null;
        }
        return cb.a(param4, param2, 1, true, 1, param3, 3, param1, 1);
    }

    final int e(int param0) {
        if (param0 != 1) {
          this.field_G = -37;
        }
        return this.field_K;
    }

    public static void a(byte param0) {
        if (param0 <= 125) {
          field_F = (rc) null;
        }
        field_I = null;
        field_F = null;
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_I = null;
        field_F = new rc();
    }
}
