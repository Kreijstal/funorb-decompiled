/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vda extends rqa {
    static String field_o;
    static String field_q;
    static String field_p;

    vda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(eab param0, dra param1, java.awt.Component param2, boolean param3, int param4, int param5, byte param6, int param7) {
        try {
          vka.a(param7, param3, 10);
          flb.field_o = vka.a(param0, param2, 0, param4);
          aaa.field_b = vka.a(param0, param2, 1, param5);
          if (param6 != 21) {
            field_q = (String) null;
          }
          kpb.field_q = new qkb();
          mw.field_e = param5;
          aaa.field_b.a(kpb.field_q);
          ew.field_p = param1;
          ew.field_p.b((byte) -108, hlb.field_p);
          flb.field_o.a(ew.field_p);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vda.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static ngb a(int param0, String param1, asb param2, asb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ngb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_o = (String) null;
          }
          var5_int = param2.b(param1, -127);
          var6 = param2.a(true, var5_int, param4);
          stackIn_3_0 = mtb.a(320, var6, param3, var5_int, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vda.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -112);
          }
          stackIn_3_0 = new nc(frb.a(120, 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vda.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 == 99) {
          field_p = null;
          field_o = null;
          field_q = null;
          return;
        }
        field_q = (String) null;
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        field_p = "to keep fullscreen or";
        field_q = "Quit to website";
    }
}
