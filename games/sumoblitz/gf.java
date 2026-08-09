/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static java.security.SecureRandom field_b;
    static java.awt.Image field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1431655765) {
            field_a = (java.awt.Image) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var2 = param0 * (param0 * param0 >> -814891540) >> -676121812;
        var3 = param0 * 6 + -61440;
        if (param1 != -676121812) {
          return 110;
        } else {
          var4 = 40960 - -(var3 * param0 >> -1596230356);
          return var2 * var4 >> -200473812;
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) + ((-1431655765 & param0) >>> 736423073);
        param0 = (param0 & 858993459) + (param0 >>> 520494530 & -214748365);
        if (param1 != 81) {
          gf.a(-54);
          param0 = param0 - -(param0 >>> 412246116) & 252645135;
          param0 = param0 + (param0 >>> -2037872536);
          param0 = param0 + (param0 >>> 605701392);
          return 255 & param0;
        } else {
          param0 = param0 - -(param0 >>> 412246116) & 252645135;
          param0 = param0 + (param0 >>> -2037872536);
          param0 = param0 + (param0 >>> 605701392);
          return 255 & param0;
        }
    }

    final static String a(char param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            if (!param2) {
              L1: {
                var5 = param3.length();
                var6 = var4_int;
                var7 = var5 + -1;
                if (-1 != (var7 ^ -1)) {
                  var8_int = 0;
                  L2: while (true) {
                    var8_int = param1.indexOf((int) param0, var8_int);
                    if (var8_int < 0) {
                      break L1;
                    } else {
                      var6 = var6 + var7;
                      var8_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var8 = new StringBuilder(var6);
              var9 = 0;
              L3: while (true) {
                var10 = param1.indexOf((int) param0, var9);
                if (var10 >= 0) {
                  discarded$2 = var8.append(param1.substring(var9, var10));
                  discarded$3 = var8.append(param3);
                  var9 = 1 + var10;
                  continue L3;
                } else {
                  discarded$4 = var8.append(param1.substring(var9));
                  stackIn_14_0 = var8.toString();
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
    }
}
