/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dhb extends rqa {
    static String field_o;

    final static void a(float param0, int param1, float param2, byte param3, int param4, int param5, int param6, int param7, float[] param8, int param9, int param10, float[] param11, int param12, float param13) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var14_float = 0.0f;
        RuntimeException var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              param1 = param1 - param5;
              param4 = param4 - param9;
              param6 = param6 - param12;
              var14_float = (float)param4 * param11[0] + (float)param6 * param11[1] + param11[2] * (float)param1;
              var15 = (float)param1 * param11[5] + ((float)param6 * param11[4] + (float)param4 * param11[3]);
              var16 = param11[8] * (float)param1 + (param11[6] * (float)param4 + (float)param6 * param11[7]);
              if (param7 != 0) {
                if (-2 == (param7 ^ -1)) {
                  var17 = var14_float + param13 + 0.5f;
                  var18 = 0.5f + (param0 + var16);
                  break L1;
                } else {
                  if ((param7 ^ -1) == -3) {
                    var18 = 0.5f + (-var15 + param2);
                    var17 = param13 + -var14_float + 0.5f;
                    break L1;
                  } else {
                    if (3 == param7) {
                      var17 = 0.5f + (var14_float + param13);
                      var18 = 0.5f + (-var15 + param2);
                      break L1;
                    } else {
                      if (-5 == (param7 ^ -1)) {
                        var18 = param2 + -var15 + 0.5f;
                        var17 = 0.5f + (param0 + var16);
                        break L1;
                      } else {
                        var18 = param2 + -var15 + 0.5f;
                        var17 = 0.5f + (param0 + -var16);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                var17 = var14_float + param13 + 0.5f;
                var18 = 0.5f + (-var16 + param0);
                break L1;
              }
            }
            L2: {
              if ((param10 ^ -1) == -2) {
                var19 = var17;
                var17 = -var18;
                var18 = var19;
                break L2;
              } else {
                if (-3 == (param10 ^ -1)) {
                  var18 = -var18;
                  var17 = -var17;
                  break L2;
                } else {
                  if (3 == param10) {
                    var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            param8[1] = var18;
            if (param3 > 10) {
              param8[0] = var17;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var14);

            stackIn_25_1 = new StringBuilder().append("dhb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param12 + ',' + param13 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    dhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 6) {
            field_o = (String) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(79, 62, param0[0].a(106));
              if (param1 < -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dhb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = "The game options are not all set.";
    }
}
