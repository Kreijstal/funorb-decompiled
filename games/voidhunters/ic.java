/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends rqa {
    static String field_o;

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
            stackOut_2_0 = new nc((Object) (Object) frb.a(24, 109));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ic.A(");
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

    ic(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 < 114) {
            ic.a(4);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        if (param1 == -9307) {
          if (pma.field_o != 13) {
            if (pma.field_o == 102) {
              fkb.field_m.j(param1 ^ -25691);
              return true;
            } else {
              L0: {
                L1: {
                  if (null == fkb.field_m) {
                    break L1;
                  } else {
                    if (!fkb.field_m.a(param0, -122, param2)) {
                      break L1;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
              return stackIn_19_0 != 0;
            }
          } else {
            fj.b(18444);
            return true;
          }
        } else {
          boolean discarded$1 = ic.a(-44, 13, -90);
          if (pma.field_o != 13) {
            if (pma.field_o != 102) {
              if (null != fkb.field_m) {
                if (!fkb.field_m.a(param0, -122, param2)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              fkb.field_m.j(param1 ^ -25691);
              return true;
            }
          } else {
            fj.b(18444);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Directional energy shield";
    }
}
