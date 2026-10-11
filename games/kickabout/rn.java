/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    int field_g;
    int field_b;
    int field_a;
    int field_f;
    static int field_c;
    static String field_e;
    static String field_h;
    static int[] field_d;

    final static void a(dg param0, int param1, dg param2, int param3, int param4, int param5) {
        try {
          cr.field_e = param0;
          if (param5 > -80) {
            String var7 = (String) null;
            rn.a((String) null, 123, -38, (String) null);
          }
          pr.field_d = param3;
          eb.field_d = param4;
          aj.field_a = param1;
          qn.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static qt a(int param0, int param1) {
        if (param0 < -43) {
          return un.field_b[param1];
        }
        dg var3 = (dg) null;
        rn.a((dg) null, 59, (dg) null, 65, 60, 35);
        return un.field_b[param1];
    }

    final static String a(String param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        ml var5 = null;
        int var6 = 0;
        gg var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param3);
          if (!ef.a(var8, -9907)) {
            stackIn_3_0 = kq.field_Ib;
            return stackIn_3_0;
          }
          if (param1 != ts.field_d) {
            stackIn_7_0 = sp.field_Db;
            return stackIn_7_0;
          }
          var7 = fm.a(param0, 145);
          if (var7 == null) {
            stackIn_10_0 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, jf.field_A, new String[]{param0});
            return stackIn_10_0;
          }
          var7.c((byte) -109);
          var7.f(66);
          ou.field_y = ou.field_y - 1;
          var5 = or.field_d;
          var5.b(param2, (byte) 110);
          var5.field_n = var5.field_n + 1;
          var6 = var5.field_n;
          var5.a(105, 3);
          var5.a(14190, param3);
          var5.c(62, var5.field_n - var6);
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rn.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        if (param1 == 3) {
          return t.field_f[param0 & 2047];
        }
        String var3 = (String) null;
        rn.a((String) null, -48, 14, (String) null);
        return t.field_f[param0 & 2047];
    }

    public static void a(int param0) {
        int var1 = -98 / ((12 - param0) / 59);
        field_e = null;
        field_d = null;
        field_h = null;
    }

    static {
        field_e = "Kick <%0> from this game";
        field_h = "You must play <%1> more rated games before playing with the current options.";
    }
}
