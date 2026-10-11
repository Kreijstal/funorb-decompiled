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
        if (param0 >= -63) {
          field_p = (ij) null;
          if (!pla.a(param1, -4)) {
            return 13 == param1 ? true : false;
          }
          return true;
        }
        if (pla.a(param1, -4)) {
          return true;
        }
        if (13 != param1) {
          return false;
        }
        return true;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_q = 1;
          }
          stackIn_3_0 = new nc(ak.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
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
