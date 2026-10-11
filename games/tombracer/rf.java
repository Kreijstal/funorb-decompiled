/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String field_b;
    static String field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -19) {
          return;
        }
        field_a = null;
    }

    final static long b(byte param0) {
        if (param0 != -121) {
          return 20L;
        }
        return -ue.field_s + bva.b((byte) -107);
    }

    final static String a(boolean param0, String param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        boolean stackIn_14_0 = false;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          if (!fs.a(param0, var6)) {
            stackIn_3_0 = pk.field_v;
            return stackIn_3_0;
          }
          if (ae.field_g != 2) {
            stackIn_7_0 = db.field_j;
            return stackIn_7_0;
          }
          if (ue.a(param1, 0)) {
            stackIn_10_0 = iia.field_q;
            return stackIn_10_0;
          }
          stackIn_14_0 = !param0;
          if (dda.a(stackIn_14_0, param1)) {
            stackIn_17_0 = gl.$cfr$intArgs$a$53ce4ab4c593(119, ce.field_w, new String[]{param1});
            return stackIn_17_0;
          }
          if (ii.field_a >= 100 &&
            wla.field_ub <= 0) {
            stackIn_21_0 = bq.field_b;
            return stackIn_21_0;
          }
          if (ii.field_a >= 200) {
            stackIn_24_0 = bq.field_b;
            return stackIn_24_0;
          }
          if (qaa.a(2180, param1)) {
            stackIn_28_0 = gl.$cfr$intArgs$a$53ce4ab4c593(119, vra.field_c, new String[]{param1});
            return stackIn_28_0;
          }
          var5 = ql.field_k;
          var5.k(param2, -2988);
          var5.field_h = var5.field_h + 1;
          var4 = var5.field_h;
          var5.i(0, 0);
          var5.a(param1, false);
          var5.d(var5.field_h - var4, (byte) 40);
          stackIn_30_0 = null;
          return (String) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Reset penalty <%0>";
        field_b = "Find opponent";
        field_c = new String[]{"Title", "Game", "Win", "Lose"};
    }
}
