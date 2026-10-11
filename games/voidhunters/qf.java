/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends rqa {
    static kb field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(jj.field_p);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qf.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    qf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1) {
        ksa var2 = null;
        int var3 = 0;
        dnb var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          var4 = (dnb) (ahb.field_o.d(0));
          if (param1 != -52) {
            field_o = (kb) null;
          }
          while (var4 != null) {
            nv.a((byte) 88, var4, param0);
            var4 = (dnb) (ahb.field_o.a((byte) 89));
          }
          var2 = cnb.field_q.d(0);
          while (var2 != null) {
            wva.b(param0, 22681);
            var2 = cnb.field_q.a((byte) 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "qf.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
          field_o = (kb) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    static {
        uu discarded$0 = new uu();
        field_o = new kb(1);
    }
}
