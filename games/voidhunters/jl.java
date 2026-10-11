/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends rqa {
    static int field_p;
    static char field_r;
    static mab field_q;
    static String field_o;

    public static void a(int param0) {
        if (param0 != 37) {
          field_r = 'ﾇ';
          field_q = null;
          field_o = null;
          return;
        }
        field_q = null;
        field_o = null;
    }

    jl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            this.a((nc[]) null, 78);
          }
          si.a(37, 62, param0[0].a(102));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Add condition (Ship spawned on team)";
    }
}
