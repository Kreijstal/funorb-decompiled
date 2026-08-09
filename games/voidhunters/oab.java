/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oab extends rqa {
    static int field_o;

    final static int a(int param0, int param1, int[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param3 != 0) {
                  L2: {
                    if (param0 < -74) {
                      break L2;
                    } else {
                      field_o = -89;
                      break L2;
                    }
                  }
                  var4_int = 2147483647;
                  var5 = -2147483648;
                  var6_ref_int__ = param2;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var6_ref_int__.length) {
                      var6 = iia.a(-85, var5 - var4_int);
                      stackIn_18_0 = 32 + (6 + param1 + param3 * var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        var8 = var6_ref_int__[var7];
                        if ((var5 ^ -1) > (var8 ^ -1)) {
                          var5 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (var4_int > var8) {
                          var4_int = var8;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = param1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("oab.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_18_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(60, 120));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("oab.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    oab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
