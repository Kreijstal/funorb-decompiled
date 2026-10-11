/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class seb extends rqa {
    static int field_o;
    static String field_p;

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ws.a((byte) 122, param1)) {
            return false;
          }
          if (mea.a(121, param1)) {
            return false;
          }
          if (hcb.a(param1, 15)) {
            return false;
          }
          if (0 == param0.length()) {
            return true;
          }
          if (param2 >= -25) {
            return true;
          }
          if (qnb.a(param1, -1, param0)) {
            return false;
          }
          if (njb.a(param0, 95, param1)) {
            return false;
          }
          if (!wg.a(param1, param0, true)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("seb.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          seb.b(false);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static int a(int param0) {
        if (param0 != 27546) {
          field_o = 127;
          return 62;
        }
        return 62;
    }

    final static void b(int param0, int param1, int param2, int param3) {
        ss.field_p.field_e = 0;
        ss.field_p.c(0, 12);
        ss.field_p.d(jeb.field_b.nextInt(), 332614536);
        ss.field_p.d(jeb.field_b.nextInt(), 332614536);
        ss.field_p.c(param0, param1);
        ss.field_p.c(0, param2);
        ss.field_p.a(param3, true);
        ss.field_p.a(jnb.field_p, bib.field_g, param0 + 16711680);
        dpa.field_p.h(param0 ^ 24335, 18);
        int fieldTemp$0 = dpa.field_p.field_e + 1;
        dpa.field_p.field_e = dpa.field_p.field_e + 1;
        int var4 = fieldTemp$0;
        dpa.field_p.a(0, ss.field_p.field_h, -1, ss.field_p.field_e);
        dpa.field_p.e(-var4 + dpa.field_p.field_e, -129);
    }

    seb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            field_o = -103;
          }
          si.a(61, 62, param0[0].a(38));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("seb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Right wing";
        field_o = 0;
    }
}
