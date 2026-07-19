/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends rf {
    int[] field_q;
    int[] field_g;
    byte[][][] field_l;
    int field_k;
    static String field_u;
    bk[] field_i;
    int[] field_r;
    bk[] field_p;
    int field_n;
    static rk field_h;
    static long field_j;
    static int field_f;
    static o field_m;
    static int field_s;
    static String[] field_t;
    static String field_o;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int incrementValue$5 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var11 = new char[param3];
              var10 = var11;
              var9 = var10;
              var4 = var9;
              var5 = 0;
              if (param1 > 59) {
                break L1;
              } else {
                va.b((byte) 21);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (param3 <= var6) {
                stackOut_15_0 = new String(var11, 0, var5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param2[param0 - -var6];
                  if (0 != var7) {
                    L4: {
                      if (128 > var7) {
                        break L4;
                      } else {
                        if (-161 >= (var7 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var8 = ee.field_c[-128 + var7];
                            if (0 == var8) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$5 = var5;
                    var5++;
                    var9[incrementValue$5] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4_ref);
            stackOut_17_1 = new StringBuilder().append("va.A(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public static void b(byte param0) {
        field_h = null;
        int var1 = -70 / ((8 - param0) / 59);
        field_m = null;
        field_o = null;
        field_u = null;
        field_t = null;
    }

    va() {
    }

    static {
        field_u = "Friends can be added in multiplayer<nbsp>games";
        field_h = new rk();
        field_m = new o(0, 2, 2, 1);
        field_o = "Error connecting to server. Please try using a different server.";
    }
}
