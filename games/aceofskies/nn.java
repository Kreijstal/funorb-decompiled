/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    final static void a(ds param0) {
        dl var5 = q.field_p;
        var5.g(109, 6);
        var5.field_g = var5.field_g + 1;
        int var4 = var5.field_g;
        var5.b(-1336879960, 1);
        if (param0.field_f == null) {
            var5.b(-1336879960, 0);
        } else {
            var5.b(-1336879960, param0.field_f.length);
            var5.a(true, param0.field_f.length, 0, param0.field_f);
        }
        int discarded$0 = var5.e(var4, 16);
        var5.field_g = var5.field_g - 4;
        param0.field_g = var5.a((byte) 121);
        try {
            var5.b(-var4 + var5.field_g, (byte) 124);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nn.B(" + (param0 != null ? "{...}" : "null") + 44 + 6 + 44 + 62 + 41);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            vp.b(param2, param0, param3 + 1, 10000536);
            vp.b(param2, param4 + param0, param3 + 1, 12105912);
            var5_int = 1;
            L1: {
              var6 = param4;
              if (var5_int + param0 < vp.field_f) {
                var5_int = vp.field_f - param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6 + param0 <= vp.field_d) {
                break L2;
              } else {
                var6 = -param0 + vp.field_d;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param4);
                var9 = var8 << 8 | var8 << 16 | var8;
                vp.field_j[param2 + vp.field_i * (var7 + param0)] = var9;
                vp.field_j[param3 + param2 + (param0 - -var7) * vp.field_i] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "nn.A(" + param0 + 44 + 70 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
