/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gba extends rqa {
    static int field_q;
    static String field_o;
    static llb field_p;
    static int field_r;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_p = (llb) null;
          }
          si.a(22, 62, param0[0].a(77));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gba.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        cs.b((byte) -29);
        jia.a(pmb.field_o[0].field_m, nna.field_w, 96, qs.field_c, jk.field_Cb, rba.field_a);
        int var1 = -31 / ((param0 - 58) / 51);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -21968) {
          gba.a(-128);
          field_p = null;
          return;
        }
        field_p = null;
    }

    gba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 0;
        field_r = 0;
        field_o = "Convoy";
    }
}
