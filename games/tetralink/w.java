/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends um {
    static String field_s;
    static String field_q;
    static oh field_r;

    public static void g(int param0) {
        field_s = null;
        int var1 = -40 % ((param0 + 64) / 39);
        field_q = null;
        field_r = null;
    }

    w(nn param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a(param1 - 26202, param0) != db.field_h) {
            return null;
          }
          stackIn_6_0 = qi.field_o;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final jk a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        jk stackIn_3_0 = null;
        jk stackIn_6_0 = null;
        jk stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!ni.a(var4, 10)) {
            stackIn_3_0 = db.field_h;
            return stackIn_3_0;
          }
          if (param0 != 0) {
            stackIn_6_0 = (jk) null;
            return stackIn_6_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = rc.a(var5, 10);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return pf.field_a;
          }
          stackIn_11_0 = db.field_h;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("w.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Show chat (<%0> unread messages)";
    }
}
