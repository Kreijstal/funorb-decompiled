/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends rqa {
    static int field_q;
    static ij field_p;
    static phb field_o;
    static int field_r;

    public static void b(boolean param0) {
        field_o = null;
        field_p = null;
        if (param0) {
            field_p = (ij) null;
        }
    }

    final static String a(int param0) {
        if (param0 != 27158) {
            cg.b(false);
            return wg.field_p;
        }
        return wg.field_p;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 < -63) {
          if (!pla.a(param1, -4)) {
            if (13 == param1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_p = (ij) null;
          if (pla.a(param1, -4)) {
            return true;
          } else {
            L0: {
              if (13 != param1) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
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
              if (param1 < -119) {
                break L1;
              } else {
                field_q = 1;
                break L1;
              }
            }
            stackIn_3_0 = new nc(ak.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cg.A(");

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

    cg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 0;
        field_p = new ij();
        field_r = 5;
    }
}
