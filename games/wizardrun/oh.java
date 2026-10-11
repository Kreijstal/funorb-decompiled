/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static ca[] field_a;
    static kl field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 21100) {
          oh.a(-19);
        }
        field_b = null;
    }

    final static void a(int param0, o param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        o var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = wizardrun.field_H;
        try {
          if (param2 < ed.field_c) {
            param3 = param3 - (-param2 + ed.field_c);
            param2 = ed.field_c;
          }
          if (ed.field_i > param6) {
            param0 = param0 - (ed.field_i - param6);
            param6 = ed.field_i;
          }
          if (ed.field_l < param3 + param2) {
            param3 = ed.field_l - param2;
          }
          if (param0 + param6 > ed.field_b) {
            param0 = -param6 + ed.field_b;
          }
          if (param3 > 0 &&
            0 < param0) {
            if (param5 < 11) {
              field_b = (kl) null;
            }
            var21 = param1.e();
            var30 = ed.field_k;
            var10 = ed.field_h;
            var11 = ed.field_d;
            var29 = new int[4];
            ed.b(var29);
            param1.b();
            ed.b(var29[0], var29[1], var29[2], var29[3]);
            var13 = param2 + param6 * param1.field_z;
            var14 = param1.field_z - param3;
            var25 = var21.field_B;
            var22 = var25;
            var15 = var22;
            for (var16 = param6; var16 < param0 + param6; var16++) {
              for (var17 = param2; var17 < param2 + param3; var17++) {
                var18 = var25[var13];
                if (0 != var18) {
                  if (var17 > 0 &&
                    var15[var13 - 1] == 0) {
                    ed.a(var17, var16, param4, param7);
                  } else {
                    if (var16 > 0 &&
                      var15[-param1.field_z + var13] == 0) {
                      ed.a(var17, var16, param4, param7);
                    } else {
                      if (var17 < param1.field_z - 1 &&
                        var15[var13 + 1] == 0) {
                        ed.a(var17, var16, param4, param7);
                      } else {
                        if (var16 < param1.field_p - 1 &&
                          var15[param1.field_z + var13] == 0) {
                          ed.a(var17, var16, param4, param7);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.e(-param1.field_u, -param1.field_v);
            ed.a(var30, var10, var11);
            ed.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("oh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 > -104) {
          oh.a(-109);
        }
        ii.field_f.field_k = 0;
        ii.field_f.field_n = 0;
    }

    final static String a(String param0, String param1, kl param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.b(17820)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          var5_int = -16 % ((-55 - param3) / 42);
          stackIn_4_0 = param1 + " - " + param2.a(0, param4) + "%";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oh.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
