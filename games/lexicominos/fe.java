/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements rd {
    final static void a(db[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param2 ^ -1) < -1) {
                  var6_int = param0[0].field_r;
                  var7 = param0[2].field_r;
                  var8 = param0[param3].field_r;
                  param0[0].a(param4, param5, param1);
                  param0[2].a(-var7 + (param4 - -param2), param5, param1);
                  lf.b(uh.field_C);
                  lf.f(param4 - -var6_int, param5, -var7 + (param2 + param4), param0[1].field_x + param5);
                  var9 = var6_int + param4;
                  var10 = -var7 + param2 + param4;
                  param4 = var9;
                  L2: while (true) {
                    if (var10 <= param4) {
                      lf.a(uh.field_C);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].a(param4, param5, param1);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("fe.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        db var8 = null;
        try {
          L0: {
            L1: {
              var6_int = param1 - -param3.field_t;
              var7 = param3.field_o + param0;
              ae.a(true, param3.field_j, var7, param3.field_v, var6_int);
              var8 = be.field_b[1];
              if (!(param3 instanceof kf)) {
                break L1;
              } else {
                if (((kf) ((Object) param3)).field_C) {
                  var8.d(var6_int - (-1 - (param3.field_j + -var8.field_r >> -1661040447)), (param3.field_v + -var8.field_x >> -104390111) + (var7 - -1), 256);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param3.a(18337)) {
                break L2;
              } else {
                pk.a(param3.field_v + -4, var7 - -2, 2 + var6_int, 1, param3.field_j + -4);
                break L2;
              }
            }
            if (param4 == -3284) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("fe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
