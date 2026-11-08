/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThreadSleepSupport {
    static String field_b;
    static String field_c;
    static int field_a;
    static String field_d;

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -9097) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    final static void sleepMillis(long param0, int param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param0 % 10L != 0L) {
          ServerMessageScreen.a((byte) -93, param0);
          if (param1 != 1) {
            field_b = (String) null;
            return;
          }
          return;
        }
        ServerMessageScreen.a((byte) -93, param0 - 1L);
        ServerMessageScreen.a((byte) -93, 1L);
        if (param1 != 1) {
          field_b = (String) null;
          return;
        }
    }

    final static String replaceAll(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param0 == -1) {
          var4 = param3.indexOf(param1);
          while (var4 != -1) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(param1.length() + var4);
            var4 = param3.indexOf(param1, param2.length() + var4);
          }
          return param3;
        }
        return (String) null;
    }

    static {
        field_b = "Disruptive behaviour";
        field_c = "Players";
        field_d = "<%0> has no opponent and wins the tournament by default!";
    }
}
