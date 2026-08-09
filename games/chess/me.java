/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static km field_d;
    static kd field_a;
    static jc field_e;
    static hg field_b;
    static rk[] field_c;

    final static void a(String param0, int param1, fj param2, lh param3, byte param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Chess.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            if (param4 == 79) {
              var7 = 1;
              L1: while (true) {
                if (var7 >= param0.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param0.charAt(var7);
                    if (var8 != 60) {
                      break L2;
                    } else {
                      var6 = (var5_int >> -1414377432) + param2.field_i[0] - -param3.b(param0.substring(0, var7));
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 == var6) {
                      L4: {
                        if (var8 != 32) {
                          break L4;
                        } else {
                          var5_int = var5_int + param1;
                          break L4;
                        }
                      }
                      param2.field_i[var7] = param2.field_i[0] + (var5_int >> 76903592) + param3.b(param0.substring(0, 1 + var7)) + -param3.a((char) var8);
                      break L3;
                    } else {
                      param2.field_i[var7] = var6;
                      break L3;
                    }
                  }
                  if (var8 == 62) {
                    var6 = -1;
                    var7++;
                    continue L1;
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("me.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        if (param0 != 18854) {
            lh var2 = (lh) null;
            me.a((String) null, 27, (fj) null, (lh) null, (byte) 90);
        }
    }

    final static int a(int param0, int param1) {
        param0 = ((param0 & -1431655765) >>> -325083679) + (param0 & 1431655765);
        param0 = (858993459 & param0) - -(1932735283 & param0 >>> 1145352674);
        int var2 = 14 % ((-35 - param1) / 32);
        param0 = 252645135 & param0 + (param0 >>> 1015902052);
        param0 = param0 + (param0 >>> -611710968);
        param0 = param0 + (param0 >>> 2102781392);
        return param0 & 255;
    }

    static {
        field_b = new hg(9, 0, 4, 1);
    }
}
