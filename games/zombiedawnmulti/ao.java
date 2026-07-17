/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_a;
    static int field_d;
    int field_f;
    static int field_e;
    static int field_c;
    static ja[] field_b;
    int field_g;
    static ja[] field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_h = null;
        field_b = null;
        field_a = null;
    }

    final static int[] a(int[] param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0.length >= 1 + param2.length) {
              var3_int = 0;
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= param2.length) {
                  var4 = new int[var3_int];
                  var5 = (16715550 & param0[0]) >> 16;
                  var6 = 255 & param0[0] >> 8;
                  var7 = 255 & param0[0];
                  var8 = param0[1] >> 16 & 255;
                  var9 = 255 & param0[1] >> 8;
                  var10 = 255 & param0[1];
                  var11 = 0;
                  var12 = 0;
                  var13 = 0;
                  L2: while (true) {
                    if (var3_int <= var11) {
                      stackOut_16_0 = (int[]) var4;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      var14 = param2[var12];
                      var15 = -var13 + var14;
                      var4[var11] = (var6 * var15 / var14 - -(var9 * var13 / var14) << 8) + ((var8 * var13 / var14 + var15 * var5 / var14 << 16) + var7 * var15 / var14) - -(var13 * var10 / var14);
                      var13++;
                      if (var13 >= var14) {
                        L3: {
                          var13 = 0;
                          var5 = var8;
                          var7 = var10;
                          var12++;
                          var6 = var9;
                          if (param0.length <= 1 + var12) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var11++;
                        continue L2;
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var3_int = var3_int + param2[var4_int];
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException("The colours array must have at least one more element than the gaps array!");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ao.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(-837539512).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_17_0;
    }

    ao(int param0, int param1, int param2, int param3) {
        ((ao) this).field_f = param3;
        ((ao) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_a = "Show all private chat";
    }
}
