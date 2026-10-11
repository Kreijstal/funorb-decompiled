/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_d;
    static qb[][] field_e;
    static long field_b;
    static String field_a;
    static RgbSprite[] field_c;

    final static boolean a(int param0, int param1) {
        if (param1 != -12) {
          ck.a(-80, -6);
          if (param0 == 8) {
            return true;
          }
          if (param0 == 9) {
            return true;
          }
          if (param0 == 7) {
            return true;
          }
          if (param0 == 11) {
            return true;
          }
          if (param0 != 14) {
            return false;
          }
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (param0 == 9) {
          return true;
        }
        if (param0 == 7) {
          return true;
        }
        if (param0 == 11) {
          return true;
        }
        if (param0 != 14) {
          return false;
        }
        return true;
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          if (param0 != -3780) {
            field_a = (String) null;
          }
          var3 = null;
          if (null != sj.field_b &&
            !sj.field_b.equals(param2.getParameter("settings"))) {
            var3 = sj.field_b;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != GlobalSpell.field_n &&
            !GlobalSpell.field_n.equals(param2.getParameter("session"))) {
            var4Lifetime1 = GlobalSpell.field_n;
          }
          stackIn_11_0 = rv.a((String) (var3), (String) (var4Lifetime1), 0, -1, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 14) {
          return;
        }
        field_e = (qb[][]) null;
    }

    final static void b(int param0) {
        if (wq.field_a == null) {
          return;
        }
        dt.a(wq.field_a, 23678);
        wq.field_a.a(-30918, ft.field_m);
        wq.field_a = null;
        if (null != AreaSpell.field_e) {
          AreaSpell.field_e.b(124);
        }
        si.field_b.requestFocus();
        if (param0 < -50) {
          return;
        }
        field_e = (qb[][]) null;
    }

    static {
        field_d = "These are items you can take with you into battle, to help tip the balance in your favour.";
        field_a = "Mouse over an icon for details";
    }
}
