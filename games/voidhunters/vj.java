/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends rqa {
    static llb field_q;
    static String field_o;
    static String field_p;

    vj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(int param0) {
        if (uh.field_p != jl.field_q.field_b) {
          kga.field_o = kga.field_o + (jl.field_q.field_b - uh.field_p);
          uh.field_p = jl.field_q.field_b;
          if (param0 > ~tb.field_b) {
            tb.field_b = tb.field_b - 1;
            if (!(tb.field_b <= 0)) {
              cs.b((byte) -31);
            }
            return;
          }
          if (!(tb.field_b <= 0)) {
            cs.b((byte) -31);
          }
          return;
        }
        if (param0 <= ~tb.field_b) {
          if (!(tb.field_b <= 0)) {
            cs.b((byte) -31);
          }
          return;
        }
        tb.field_b = tb.field_b - 1;
        if (!(tb.field_b <= 0)) {
          cs.b((byte) -31);
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
            vj.e(-68);
          }
          si.a(227, 62, param0[0].a(12));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_q = null;
        int var1 = -29 / ((param0 + 16) / 58);
        field_p = null;
    }

    static {
        field_o = "Fighter bay";
        field_p = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
