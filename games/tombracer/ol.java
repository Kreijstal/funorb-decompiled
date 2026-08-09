/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            mu var2 = (mu) null;
            ol.a((mu) null, false, (mu) null);
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        double var9;
        double var11;
        double var13;
        int var15;
        var6 = tk.a(-22636);
        if (var6 == 0) {
          return 0;
        } else {
          L0: {
            var7 = param0 - param3 >> 1329198704;
            var8 = param4 + -param5 >> -101229168;
            var9 = (double)ua.a(var7, param2 + -29);
            var11 = (double)ua.a(var8, -102);
            var13 = Math.sqrt(var11 * var11 + var9 * var9);
            var15 = (int)((double)var6 - (double)var6 * (-64.0 + var13) / 704.0);
            if (768.0 <= var13) {
              var15 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var13 > 64.0) {
              break L1;
            } else {
              var15 = 255;
              break L1;
            }
          }
          var15 = za.a(0, (byte) 48, var6, var15);
          if (param2 != -91) {
            return 56;
          } else {
            var15 = var15 * to.field_n[param1] / var6;
            return var15;
          }
        }
    }

    final static boolean a(mu param0, boolean param1, mu param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = -param0.field_Db + param2.field_Db;
            if (param1) {
              L1: {
                if (param2.field_Cb != field_b) {
                  if (null == param2.field_Cb) {
                    var3_int += 200;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var3_int -= 200;
                  break L1;
                }
              }
              L2: {
                if (param0.field_Cb == field_b) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (param0.field_Cb == null) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var3_int ^ -1) >= -1) {
                  stackIn_17_0 = 0;
                  break L3;
                } else {
                  stackIn_17_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ol.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    static {
        field_a = "Online Race";
    }
}
