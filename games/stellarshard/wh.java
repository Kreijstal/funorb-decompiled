/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_c;
    static pb[] field_e;
    int field_b;
    static String field_d;
    static pb field_a;

    final static byte[] a(int param0, ha param1, byte[] param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            var4_int = 69 % ((param3 - -61) / 48);
            var5 = param1.e(param0, 8);
            if (0 != var5) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length == var5) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = new byte[var5];
                break L1;
              }
              L3: {
                var6 = param1.e(3, 8);
                var7 = (byte)param1.e(8, 8);
                if (-1 > (var6 ^ -1)) {
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= var5) {
                      break L3;
                    } else {
                      param2[var8] = (byte)(var7 + param1.e(var6, 8));
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var5) {
                      break L3;
                    } else {
                      param2[var8] = (byte)var7;
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (byte[]) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("wh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    final static String a(byte param0) {
        if (!(o.field_l != dj.field_a)) {
            return kc.field_c;
        }
        if (param0 < 79) {
            wh.a(-83);
        }
        return wb.field_c;
    }

    public static void b(int param0) {
        if (param0 != -1) {
            wh.a(-125);
        }
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        if (param0 > -31) {
            return;
        }
        gg.field_f = ee.a(5, 0, (byte) -119, 1);
    }

    static {
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
