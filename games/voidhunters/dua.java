/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dua extends rqa {
    static khb field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(98, 62, param0[0].a(78));
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
          stackIn_7_1 = new StringBuilder().append("dua.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 < 88) {
          field_p = (khb) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    dua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String e(byte param0) {
        if (ef.field_z < 2) {
          return tdb.field_p;
        }
        if (ppb.field_a != null) {
          if (!ppb.field_a.b((byte) -37)) {
            return ocb.field_i;
          }
          return lo.field_d;
        }
        if (!btb.field_b.b((byte) 115)) {
          return wea.field_o;
        }
        if (!btb.field_b.a(32171, "commonui")) {
          return drb.field_k + " - " + btb.field_b.a("commonui", -2118) + "%";
        }
        if (!dt.field_o.b((byte) 122)) {
          return wqb.field_b;
        }
        if (!dt.field_o.a(32171, "commonui")) {
          return am.field_p + " - " + dt.field_o.a("commonui", -2118) + "%";
        }
        if (param0 >= -18) {
          field_o = true;
        }
        if (!gdb.field_i.b((byte) -41)) {
          return ltb.field_q;
        }
        if (!gdb.field_i.a(35)) {
          return lwa.field_vb + " - " + gdb.field_i.b(-115) + "%";
        }
        return neb.field_p;
    }

    static {
        field_p = new khb("");
    }
}
