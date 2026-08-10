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

    public static void a(int param0) {
        field_h = null;
        if (param0 > -21) {
            field_e = -25;
        }
        field_b = null;
        field_a = null;
    }

    final static int[] a(int[] param0, int param1, int[] param2) {
        int[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0.length >= 1 + param2.length) {
              var3_int = 0;
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= param2.length) {
                  var4 = new int[var3_int];
                  var5 = (16715550 & param0[0]) >> -242715856;
                  var6 = 255 & param0[0] >> -837539512;
                  var7 = 255 & param0[0];
                  var8 = param0[1] >> 1541241936 & 255;
                  var9 = 255 & param0[1] >> -130271544;
                  var10 = 255 & param0[1];
                  var11 = 0;
                  var12 = 0;
                  var13 = 0;
                  L2: while (true) {
                    if (var3_int <= var11) {
                      L3: {
                        if (param1 == -837539512) {
                          break L3;
                        } else {
                          field_c = -59;
                          break L3;
                        }
                      }
                      stackIn_18_0 = (int[]) (var4);
                      break L0;
                    } else {
                      L4: {
                        var14 = param2[var12];
                        var15 = -var13 + var14;
                        var4[var11] = (var6 * var15 / var14 - -(var9 * var13 / var14) << -1311961496) + ((var8 * var13 / var14 + var15 * var5 / var14 << 1001175184) + var7 * var15 / var14) - -(var13 * var10 / var14);
                        var13++;
                        if (var13 >= var14) {
                          var13 = 0;
                          var5 = var8;
                          var7 = var10;
                          var12++;
                          var6 = var9;
                          if (param0.length > 1 + var12) {
                            var9 = 255 & param0[var12 - -1] >> 140511336;
                            var10 = param0[var12 + 1] & 255;
                            var8 = (16729410 & param0[1 + var12]) >> -1214704272;
                            break L4;
                          } else {
                            var11++;
                            continue L2;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var11++;
                      continue L2;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ao.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    ao(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_g = param0;
    }

    static {
        field_d = 1;
        field_a = "Show all private chat";
    }
}
