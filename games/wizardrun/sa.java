/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    kl field_a;
    String field_f;
    String field_h;
    static String field_b;
    static java.awt.Color field_e;
    String field_d;
    static kd field_g;
    int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 != -118) {
            field_g = (kd) null;
        }
        field_g = null;
    }

    final static short[] a(int param0, byte param1, mg param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var4_int = param2.g(param0, -11719);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              var5 = param2.g(4, -11719);
              var6 = (short)param2.g(16, -11719);
              if (param1 == -48) {
                L3: {
                  if (-1 <= (var5 ^ -1)) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)(param2.g(var5, -11719) + var6);
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (short[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("sa.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
        field_e = new java.awt.Color(10040319);
        field_g = new kd();
    }
}
