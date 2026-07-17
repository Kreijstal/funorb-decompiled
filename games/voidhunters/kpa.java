/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpa extends rqa {
    static String field_o;

    kpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param5 < ob.field_j) {
          qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
          if (param7 == 0) {
            return;
          } else {
            kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
            return;
          }
        } else {
          if (mt.field_o < param1) {
            qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
            if (param7 == 0) {
              return;
            } else {
              kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
              return;
            }
          } else {
            if (lua.field_c > param3) {
              qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
              if (param7 != 0) {
                kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                return;
              } else {
                return;
              }
            } else {
              if (param6 <= hab.field_i) {
                ul.a(param3, param5, param2, param6, param4, param1, param7 + 7, param0);
                if (param7 != 0) {
                  kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                  return;
                } else {
                  return;
                }
              } else {
                qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
                if (param7 != 0) {
                  kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 146) {
            kpa.a(59);
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
            si.a(146, 62, param0[0].a(112));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("kpa.A(");
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        jja discarded$0 = new jja();
        field_o = "win";
    }
}
