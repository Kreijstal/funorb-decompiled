/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jm extends rqa {
    static String field_o;

    public static void e(byte param0) {
        field_o = null;
    }

    final static sr a(int param0, int param1) {
        sr var2 = null;
        byte[] var3 = null;
        var2 = (sr) us.field_d.b(0, (long)param0);
        if (var2 != null) {
          return var2;
        } else {
          var3 = rw.field_l.a(0, param0, (byte) 13);
          var2 = new sr();
          if (var3 != null) {
            var2.a(param0, new ds(var3), (byte) 11);
            us.field_d.a((Object) (Object) var2, (long)param0, (byte) -117);
            return var2;
          } else {
            us.field_d.a((Object) (Object) var2, (long)param0, (byte) -117);
            return var2;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(123, 74));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jm.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    jm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_20_0 = null;
        String stackOut_9_0 = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param2 != 3) {
              L1: {
                if (param0 < -113) {
                  break L1;
                } else {
                  field_o = null;
                  break L1;
                }
              }
              if (param2 != 6) {
                if (param2 != 7) {
                  if (8 == param2) {
                    stackOut_13_0 = fha.field_q;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param2 == 9) {
                      stackOut_17_0 = sla.field_o;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (param2 != 10) {
                        if (param2 == 11) {
                          stackOut_24_0 = qia.field_p;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param2 == 14) {
                            stackOut_28_0 = isa.a(gwa.field_p, new String[1], 119);
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackOut_20_0 = mlb.field_p;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = lra.field_o;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = tda.field_O;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = kg.field_q;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("jm.C(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_29_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Month";
    }
}
