/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static im field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static boolean a(boolean param0) {
        if (!param0) {
          qf.a(94);
          return rl.b(0);
        }
        return rl.b(0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 126) {
          qf.a(false);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static boolean a(byte param0) {
        if (param0 <= 52) {
          return false;
        }
        if (q.field_Jb < 10) {
          return false;
        }
        if (!ei.field_R) {
          return !ra.c((byte) 91) ? true : false;
        }
        return false;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = Terraphoenix.field_V;
        var4 = param0.indexOf(param2);
        if (param1 != 0) {
          field_c = -116;
        }
        while (true) {
          if (var4 == -1) {
            return param0;
          }
          param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param2.length());
          stackIn_6_0 = (String) (param0);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param2, param3.length() + var4);
        }
    }

    static {
        field_b = "Play the game without logging in just yet";
        field_d = new im();
        field_a = "You are not currently logged in to the<nbsp>game.";
    }
}
