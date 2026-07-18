/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda extends rqa {
    pda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (param4 == -2) {
          if (ob.field_j <= param1) {
            if (mt.field_o >= param5) {
              if (param3 >= lua.field_c) {
                if (param0 <= hab.field_i) {
                  if (param6 == 1) {
                    nv.a(param2, 102, param3, param0, param1, param5);
                    return;
                  } else {
                    int discarded$1 = 120;
                    rg.a(param5, param0, param1, param2, param3, param6);
                    return;
                  }
                } else {
                  if (param6 == 1) {
                    lob.a(param5, param2, param1, 256, param3, param0);
                    return;
                  } else {
                    is.a(param5, param2, param1, param6, 20408, param3, param0);
                    return;
                  }
                }
              } else {
                if (param6 == 1) {
                  lob.a(param5, param2, param1, 256, param3, param0);
                  return;
                } else {
                  is.a(param5, param2, param1, param6, 20408, param3, param0);
                  return;
                }
              }
            } else {
              if (param6 == 1) {
                lob.a(param5, param2, param1, 256, param3, param0);
                return;
              } else {
                is.a(param5, param2, param1, param6, 20408, param3, param0);
                return;
              }
            }
          } else {
            if (param6 == 1) {
              lob.a(param5, param2, param1, 256, param3, param0);
              return;
            } else {
              is.a(param5, param2, param1, param6, 20408, param3, param0);
              return;
            }
          }
        } else {
          return;
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
              if (param1 < -119) {
                break L1;
              } else {
                pda.a(-5, -124, 5, -27, -5, 31, 53);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(160, 80));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pda.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
