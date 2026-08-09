/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ak field_a;
    static oi field_b;
    static String field_c;

    final static void a(java.awt.Canvas param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            oc.a((byte) -38, (java.awt.Component) ((Object) param0));
            if (param1) {
              L1: {
                rm.a((java.awt.Component) ((Object) param0), (byte) 38);
                if (ji.field_b == null) {
                  break L1;
                } else {
                  ji.field_b.a((java.awt.Component) ((Object) param0), true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("rc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var9;
        var9 = EscapeVector.field_A;
        if (!param4) {
          rc.a(-25);
          if (param7 <= param5) {
            if (param5 >= param2) {
              if (param2 > param7) {
                ha.a(param0, param2, param7, param6, param1, 120, param3, param5, em.field_i);
                return;
              } else {
                ha.a(param6, param7, param2, param0, param1, 66, param3, param5, em.field_i);
                return;
              }
            } else {
              ha.a(param1, param5, param7, param6, param0, 42, param3, param2, em.field_i);
              return;
            }
          } else {
            if (param2 <= param7) {
              if (param5 >= param2) {
                ha.a(param1, param5, param2, param0, param6, 127, param3, param7, em.field_i);
                return;
              } else {
                ha.a(param0, param2, param5, param1, param6, 38, param3, param7, em.field_i);
                return;
              }
            } else {
              ha.a(param6, param7, param5, param1, param0, 41, param3, param2, em.field_i);
              return;
            }
          }
        } else {
          if (param7 <= param5) {
            if (param5 >= param2) {
              if (param2 > param7) {
                ha.a(param0, param2, param7, param6, param1, 120, param3, param5, em.field_i);
                return;
              } else {
                ha.a(param6, param7, param2, param0, param1, 66, param3, param5, em.field_i);
                return;
              }
            } else {
              ha.a(param1, param5, param7, param6, param0, 42, param3, param2, em.field_i);
              return;
            }
          } else {
            if (param2 <= param7) {
              if (param5 >= param2) {
                ha.a(param1, param5, param2, param0, param6, 127, param3, param7, em.field_i);
                return;
              } else {
                ha.a(param0, param2, param5, param1, param6, 38, param3, param7, em.field_i);
                return;
              }
            } else {
              ha.a(param6, param7, param5, param1, param0, 41, param3, param2, em.field_i);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -49153) {
          field_b = (oi) null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static fn a(int param0, byte param1, fn param2, fn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        fn stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.field_c;
              var5 = param3.field_b;
              if (param0 == 16384) {
                var5 = param2.field_c;
                var4_int = param3.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-32769 == (param0 ^ -1)) {
                var4_int = param2.field_c;
                var5 = param2.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) == -49153) {
                var5 = param3.field_c;
                var4_int = param2.field_b;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 > 119) {
                break L4;
              } else {
                field_b = (oi) null;
                break L4;
              }
            }
            stackIn_12_0 = new fn(var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        field_c = "Out of shield!";
    }
}
