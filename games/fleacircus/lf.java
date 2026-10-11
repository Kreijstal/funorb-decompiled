/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_b;
    static String field_c;
    static String field_a;

    final static boolean a(ce param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 31849) {
            lf.a((byte) 59);
          }
          stackIn_3_0 = param0.a(param1 ^ 31758);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != 65) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(dd[] param0, int param1, int param2, byte param3) {
        try {
          mk.field_d = new qc(param0);
          q.field_d = param1;
          bb.field_C = param2;
          if (param3 <= 64) {
            ce var5 = (ce) null;
            lf.a((ce) null, 38);
          }
          di.b(-20667);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "lf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Bonus time: <%0>";
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = "Name is available";
    }
}
