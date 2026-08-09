/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends rqa {
    static String field_o;

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
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(24, 109));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ic.A(");

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
        if (param1 == -9307) {
          if (pma.field_o != 13) {
            if (-103 == (pma.field_o ^ -1)) {
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
                      stackIn_19_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_19_0 = 0;
                break L0;
              }
              return stackIn_19_0 != 0;
            }
          } else {
            fj.b(18444);
            return true;
          }
        } else {
          ic.a(-44, 13, -90);
          if (pma.field_o != 13) {
            if (-103 != (pma.field_o ^ -1)) {
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
        field_o = "Directional energy shield";
    }
}
