/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lha extends rqa {
    final static void a(int param0, boolean param1, byte param2, int param3) {
        he.field_o = param0;
        pob.field_b = 0;
        wgb.field_f = param3;
        if (param2 != -85) {
          return;
        }
        if (!wqa.a(false, wgb.field_f)) {
          return;
        }
        lha.a(-103, fa.field_d[75]);
        int var4 = 0;
        if (wgb.field_f == 7) {
          var4 = -1;
        }
        if (5 == wgb.field_f) {
          var4 = 1;
        }
        lo.field_a[wgb.field_f].a(param1, 320, var4);
        if (wgb.field_f == 7) {
          mna.a(param1, (byte) 90);
          return;
        }
    }

    lha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ana a(int param0, gd param1) {
        RuntimeException var2 = null;
        ana stackIn_2_0 = null;
        ana stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -85) {
            stackIn_4_0 = ka.a(61, fga.a(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ana) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lha.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        gd var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (gd) null;
            lha.a(-99, (gd) null);
          }
          stackIn_3_0 = new nc(frb.a(17, 86));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
