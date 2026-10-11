/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ia {
    static CombatWorld field_s;
    static int field_t;
    static String field_p;
    static int field_n;
    static String field_o;
    static String field_q;
    static String field_u;
    static int field_r;

    public static void c(int param0) {
        if (param0 != 18384) {
          return;
        }
        field_u = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_q = null;
    }

    final vd a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        vd stackIn_6_0 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (gm.a(true, param0) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_6_0 = fa.field_d;
            return stackIn_6_0;
          }
          if (param1 != -1) {
            var4 = (String) null;
            this.a((String) null, -6);
          }
          stackIn_10_0 = vf.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ih.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    ih(jf param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, -1) == fa.field_d) {
            stackIn_2_0 = oh.field_g;
            return stackIn_2_0;
          }
          if (param0 != 100) {
            var4 = (String) null;
            this.a(5, (String) null);
          }
          stackIn_6_0 = mg.field_lc;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ih.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_p = "Accept rematch";
        field_o = "(1 player wants to join)";
        field_u = "You must play 1 more rated game before playing with the current options.";
    }
}
