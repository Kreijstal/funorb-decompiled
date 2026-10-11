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
        } else {
          if (mt.field_o < param1) {
            qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
          } else {
            if (lua.field_c > param3) {
              qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
            } else {
              if (param6 <= hab.field_i) {
                ul.a(param3, param5, param2, param6, param4, param1, param7 + 7, param0);
              } else {
                qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
              }
            }
          }
        }
        if (param7 == 0) {
          return;
        }
        kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (String) null;
          }
          si.a(146, 62, param0[0].a(112));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kpa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        jja discarded$0 = new jja();
        field_o = "win";
    }
}
