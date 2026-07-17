/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends rqa {
    static llb field_q;
    static int field_o;
    static String field_p;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param5 == param1) {
          fl.a(param6, param7, param2, param5, 1523, param4, param3);
          return;
        } else {
          if (ob.field_j <= -param5 + param6) {
            if (param6 - -param5 <= mt.field_o) {
              if (-param1 + param7 >= lua.field_c) {
                if (hab.field_i < param1 + param7) {
                  vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
                  return;
                } else {
                  int discarded$1 = 21601;
                  sab.a(param2, param1, param5, param7, param6, param3, param4);
                  return;
                }
              } else {
                vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
                return;
              }
            } else {
              vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
              return;
            }
          } else {
            vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
            return;
          }
        }
    }

    nt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
              if (param1 < -119) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(3, 77));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("nt.A(");
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

    public static void a() {
        field_q = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 2;
        field_p = "Try again";
    }
}
