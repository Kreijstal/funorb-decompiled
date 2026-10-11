/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements rd {
    final static void a(db[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != null &&
            param2 > 0) {
            var6_int = param0[0].field_r;
            var7 = param0[2].field_r;
            var8 = param0[param3].field_r;
            param0[0].a(param4, param5, param1);
            param0[2].a(-var7 + (param4 + param2), param5, param1);
            lf.b(uh.field_C);
            lf.f(param4 + var6_int, param5, -var7 + (param2 + param4), param0[1].field_x + param5);
            var9 = var6_int + param4;
            var10 = -var7 + param2 + param4;
            for (param4 = var9; var10 > param4; param4 = param4 + var8) {
              param0[1].a(param4, param5, param1);
            }
            lf.a(uh.field_C);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("fe.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        db var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param1 + param3.field_t;
          var7 = param3.field_o + param0;
          ae.a(true, param3.field_j, var7, param3.field_v, var6_int);
          var8 = be.field_b[1];
          if (param3 instanceof kf &&
            ((kf) (param3)).field_C) {
            var8.d(var6_int - (-1 - (param3.field_j - var8.field_r >> 1)), (param3.field_v - var8.field_x >> 1) + (var7 + 1), 256);
          }
          if (param3.a(18337)) {
            pk.a(param3.field_v - 4, var7 + 2, 2 + var6_int, 1, param3.field_j - 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
