/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends rqa {
    qo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        jk var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          lqa.field_o = null;
          if (param0 != 15) {
            qo.a(-127);
          }
          ii.field_h = false;
          ohb.field_o = null;
          if (null != cta.field_q) {
            cta.field_q.e(103);
            cta.field_q = null;
          }
          oha.field_o = null;
          if (null != kja.field_E) {
            kja.field_E.e(104);
            kja.field_E = null;
          }
          ks.field_r = null;
          if (mea.field_e != null) {
            mea.field_e.e(126);
            mea.field_e = null;
          }
          icb.field_p = null;
          if (oha.field_o == null) {
            return;
          }
          var3 = (jk) (oha.field_o.c(param0 - 99));
          while (var3 != null) {
            var3.d((byte) -35);
            var3 = (jk) (oha.field_o.d(param0 - 16));
          }
          oha.field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "qo.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(15, 62, param0[0].a(12));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qo.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
