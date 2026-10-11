/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 37) {
          ub.a(-37);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(dl param0, boolean param1, int param2, int param3, java.awt.Component param4, mf param5, boolean param6, int param7) {
        try {
          gj.a(param7, param1, 10);
          if (param6) {
            field_a = (String) null;
          }
          kj.field_P = gj.a(param0, param4, 0, param2);
          ql.field_r = gj.a(param0, param4, 1, param3);
          ti.field_f = new e();
          ak.field_a = 1000 * param3 / param7;
          ql.field_r.a(ti.field_f);
          ua.field_I = param5;
          ua.field_I.d(1349013231, la.field_k);
          kj.field_P.a(ua.field_I);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ub.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = SolKnight.field_L ? 1 : 0;
        if (0L >= param1) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = lf.field_f[(int)(-(param1 * 37L) + var7)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param0 < -35) {
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        mf var12 = (mf) null;
        ub.a((dl) null, true, 99, 116, (java.awt.Component) null, (mf) null, false, 43);
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
