/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static int[] field_a;
    static String field_b;
    static String field_d;
    static String field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (!param0) {
            h var2 = (h) null;
            bj.a(34, 120, (h) null);
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param1 >> 1702595472;
        var4 = 65535 & param1;
        if (param0) {
          field_c = (String) null;
          var5 = param2 >> -2068060976;
          var6 = 65535 & param2;
          return var4 * var5 + (var3 * param2 + (var6 * var4 >> -192823024));
        } else {
          var5 = param2 >> -2068060976;
          var6 = 65535 & param2;
          return var4 * var5 + (var3 * param2 + (var6 * var4 >> -192823024));
        }
    }

    final static boolean a(int param0) {
        if (param0 == 13) {
          if (af.field_b >= 10) {
            if (hj.field_f < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          bj.a(4, -20);
          if (af.field_b >= 10) {
            if (hj.field_f < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, h param2) {
        lh var3 = null;
        if (param1 > -15) {
            return;
        }
        try {
            var3 = nj.field_p;
            var3.d(param0, -18392);
            var3.c(2, (byte) -126);
            var3.c(0, (byte) -128);
            var3.c(param2.field_h, (byte) -127);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "bj.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        lh var2 = null;
        var2 = nj.field_p;
        var2.d(param1, -18392);
        var2.c(1, (byte) -117);
        var2.c(2, (byte) -115);
        if (param0 != 2591) {
          bj.a(-75, -48);
          return;
        } else {
          return;
        }
    }

    static {
        field_b = "Press any key to continue";
        field_d = "Orb coins: <%0>";
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
