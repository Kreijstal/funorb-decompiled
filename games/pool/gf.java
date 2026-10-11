/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_d;
    static String field_f;
    static int field_a;
    static String field_c;
    static so field_e;
    static di field_g;
    static boolean[] field_b;

    final static void a(int param0, String[] param1) {
        try {
          if (lh.field_c != null) {
            lh.field_c.field_P.a(false, param1);
          }
          if (null != tg.field_a) {
            tg.field_a.field_S.a(false, param1);
          }
          int var2_int = 25 % ((param0 + 8) / 53);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "gf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(qp param0, int param1) {
        try {
          if (param1 != 0) {
            qp var3 = (qp) null;
            gf.a((qp) null, 80);
          }
          e.field_a.a(param1 ^ -99, param0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "gf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        if (param0) {
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        }
        qp var2 = (qp) null;
        gf.a((qp) null, 34);
        field_b = null;
        field_f = null;
        field_c = null;
    }

    final static eo a(int param0, String param1) {
        String var2 = null;
        int var3 = 0;
        eo var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        eo stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (df.field_b == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_6_0 = null;
            return (eo) (stackIn_6_0);
          }
          var3 = 53 / ((-16 - param0) / 62);
          var6 = (CharSequence) ((Object) param1);
          var2 = hq.a(83, var6);
          if (var2 == null) {
            stackIn_9_0 = null;
            return (eo) (stackIn_9_0);
          }
          var4 = (eo) (df.field_b.a((long)var2.hashCode(), false));
          while (var4 != null) {
            var7 = (CharSequence) ((Object) var4.field_Zb);
            var5 = hq.a(84, var7);
            if (var5.equals(var2)) {
              stackIn_16_0 = var4;
              return stackIn_16_0;
            }
            var4 = (eo) (df.field_b.a(-127));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("gf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_f = "Please remove <%0> from your friend list first.";
        field_c = "Accept <%0> into this game";
    }
}
