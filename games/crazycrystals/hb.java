/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends jb {
    static String field_i;
    static tj field_l;
    static id field_h;
    static boolean field_g;
    static ko field_k;
    int field_j;
    int field_f;

    final static void a(int param0, int param1, int param2, int param3, dl param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        dl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = CrazyCrystals.field_B;
        try {
          if (kh.field_c > param7) {
            param3 = param3 - (-param7 + kh.field_c);
            param7 = kh.field_c;
          }
          if (param3 + param7 > kh.field_g) {
            param3 = -param7 + kh.field_g;
          }
          if (kh.field_b > param2) {
            param1 = param1 - (-param2 + kh.field_b);
            param2 = kh.field_b;
          }
          if (kh.field_j < param2 + param1) {
            param1 = -param2 + kh.field_j;
          }
          if (param3 > 0 &&
            param1 > 0) {
            var21 = param4.d();
            if (param5 > -11) {
              return;
            }
            var30 = kh.field_i;
            var10 = kh.field_l;
            var11 = kh.field_d;
            var29 = new int[4];
            kh.b(var29);
            param4.a();
            kh.a(var29[0], var29[1], var29[2], var29[3]);
            var13 = param4.field_l * param2 + param7;
            var14 = -param3 + param4.field_l;
            var25 = var21.field_w;
            var22 = var25;
            var15 = var22;
            for (var16 = param2; var16 < param2 + param1; var16++) {
              for (var17 = param7; param3 + param7 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0) {
                  if (var17 > 0 &&
                    var15[var13 - 1] == 0) {
                    kh.b(var17, var16, param0, param6);
                  } else {
                    if (var16 > 0 &&
                      0 == var15[-param4.field_l + var13]) {
                      kh.b(var17, var16, param0, param6);
                    } else {
                      if (var17 < param4.field_l - 1 &&
                        var15[1 + var13] == 0) {
                        kh.b(var17, var16, param0, param6);
                      } else {
                        if (-1 + param4.field_u > var16 &&
                          var15[var13 + param4.field_l] == 0) {
                          kh.b(var17, var16, param0, param6);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.a(-param4.field_v, -param4.field_t);
            kh.a(var30, var10, var11);
            kh.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_45_0 = var8;
          stackIn_45_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        field_l = null;
        field_k = null;
        field_i = null;
        if (!param0) {
          field_i = (String) null;
        }
    }

    private hb() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "OK";
    }
}
