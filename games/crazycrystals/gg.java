/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_e;
    static mb field_d;
    static int field_c;
    static String field_a;
    static String field_b;

    final static Boolean a(int param0) {
        Boolean var1 = null;
        if (param0 != -23387) {
            gg.a(73);
            var1 = ja.field_f;
            ja.field_f = null;
            return var1;
        }
        var1 = ja.field_f;
        ja.field_f = null;
        return var1;
    }

    final static fb a(fq param0, byte param1, f param2, f[][] param3) {
        fb stackIn_2_0 = null;
        nl stackIn_6_0 = null;
        qo stackIn_9_0 = null;
        uo stackIn_12_0 = null;
        jk stackIn_16_0 = null;
        em stackIn_18_0 = null;
        el stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param1 > 115) {
              if (param2 instanceof qf) {
                vl.field_f.a(128, 12 * param0.field_A + param0.field_o * param0.field_m, 12 * param0.field_t - -(param0.field_s * param0.field_m), 0, (byte) -111);
                stackIn_20_0 = new el(param0, 20);
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                if (!(param2 instanceof de)) {
                  if (!(param2 instanceof mi)) {
                    if (!(param2 instanceof ig)) {
                      L1: {
                        if (param2 instanceof cd) {
                          break L1;
                        } else {
                          if (param2 instanceof gh) {
                            break L1;
                          } else {
                            ec.field_k.a(128, param0.field_m * param0.field_o + param0.field_A * 12, param0.field_s * param0.field_m + 12 * param0.field_t, 0, (byte) -111);
                            stackIn_16_0 = new jk(param0);
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      sa.field_mb.a(128, param0.field_o * param0.field_m + param0.field_A * 12, param0.field_s * param0.field_m + param0.field_t * 12, 0, (byte) -111);
                      stackIn_18_0 = new em(param0);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      jo.field_p.a(128, 12 * param0.field_A - -(param0.field_m * param0.field_o), param0.field_t * 12 + param0.field_m * param0.field_s, 0, (byte) -111);
                      stackIn_12_0 = new uo(param0);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    tl.field_a.a(128, param0.field_m * param0.field_o + 12 * param0.field_A, param0.field_m * param0.field_s + param0.field_t * 12, 0, (byte) -111);
                    stackIn_9_0 = new qo(param0, (mi) ((Object) param2));
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_6_0 = new nl(param0, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (fb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("gg.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fb) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (fb) ((Object) stackIn_9_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (fb) ((Object) stackIn_12_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (fb) ((Object) stackIn_16_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (fb) ((Object) stackIn_18_0);
                  } else {
                    return (fb) ((Object) stackIn_20_0);
                  }
                }
              }
            }
          }
        }
    }

    final static int a(boolean param0, byte param1, int param2, String param3, int param4, String param5, String param6) {
        rh var7 = null;
        RuntimeException var7_ref = null;
        rh var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 119) {
              var7 = new rh(param5);
              var8 = new rh(param3);
              stackIn_4_0 = ai.a(var7, param0, param6, param2, var8, (byte) 92, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("gg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 > -104) {
            gg.a((fq) null, (byte) -7, (f) null, (f[][]) null);
        }
    }

    static {
        field_e = "This is a laser beam.<br>Do you wish to pass?<br>You may be able to block<br>it with something.";
        field_c = 0;
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new mb("email");
        field_b = "Connection lost - attempting to reconnect";
    }
}
