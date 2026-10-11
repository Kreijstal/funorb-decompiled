/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt extends rqa {
    static asb field_o;

    dt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        if (es.field_b != null) {
          es.field_b.a(0, qd.field_a);
          vob.field_o = sab.a(vob.field_o, -31567, qd.field_a);
        }
        if (param0 >= -64) {
          Object[] var2 = (Object[]) null;
          dt.a((dja) null, -6, 116, (Object[]) null);
        }
    }

    public static void e(int param0) {
        if (param0 <= 39) {
          return;
        }
        field_o = null;
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
            dt.a(-54);
          }
          stackIn_3_0 = new nc(frb.a(29, 74));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dt.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static Object[] a(dja param0, int param1, int param2, Object[] param3) {
        int var6 = 0;
        tv[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        Object[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object[] stackIn_11_0 = null;
        tv[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param2 != 15667) {
            stackIn_3_0 = (Object[]) null;
            return stackIn_3_0;
          }
          if (param3 == null) {
            stackIn_6_0 = null;
            return (Object[]) (stackIn_6_0);
          }
          if (param1 >= 0 &&
            param1 < param3.length) {
            var4 = param0.a(param2 - 3672, -1 + param3.length);
            var4 = var4;
            var5 = 0;
            for (var6 = 0; var6 < param3.length; var6++) {
              if (var6 != param1) {
                var4[var5] = (tv) (param3[var6]);
                var5++;
              }
            }
            stackIn_19_0 = var4;
            return stackIn_19_0;
          }
          stackIn_11_0 = (Object[]) (param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("dt.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
