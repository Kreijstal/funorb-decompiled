/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 71) {
          return;
        }
        field_o = null;
    }

    final static sr a(int param0, int param1) {
        sr var2 = (sr) (us.field_d.b(param1, (long)param0));
        if (var2 != null) {
          return var2;
        }
        byte[] var3 = rw.field_l.a(0, param0, (byte) 13);
        var2 = new sr();
        if (var3 == null) {
          us.field_d.a(var2, (long)param0, (byte) -117);
          return var2;
        }
        var2.a(param0, new ds(var3), (byte) 11);
        us.field_d.a(var2, (long)param0, (byte) -117);
        return var2;
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
          stackIn_3_0 = new nc(frb.a(123, 74));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jm.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 3) {
            stackIn_2_0 = kg.field_q;
            return stackIn_2_0;
          }
          if (param0 >= -113) {
            field_o = (String) null;
          }
          if (param2 == 6) {
            stackIn_7_0 = tda.field_O;
            return stackIn_7_0;
          }
          if (param2 == 7) {
            stackIn_10_0 = lra.field_o;
            return stackIn_10_0;
          }
          if (8 == param2) {
            stackIn_14_0 = fha.field_q;
            return stackIn_14_0;
          }
          if (param2 == 9) {
            stackIn_18_0 = sla.field_o;
            return stackIn_18_0;
          }
          if (param2 == 10) {
            stackIn_21_0 = mlb.field_p;
            return stackIn_21_0;
          }
          if (param2 == 11) {
            stackIn_25_0 = qia.field_p;
            return stackIn_25_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_29_0 = isa.a(gwa.field_p, new String[]{param1}, 119);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("jm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_o = "Month";
    }
}
