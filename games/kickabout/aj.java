/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String field_b;
    static String field_c;
    static int field_a;
    static String field_d;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -9097) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static void a(long param0, int param1) {
        if (param0 <= 0L) {
          return;
        } else {
          if (-1L == (param0 % 10L ^ -1L)) {
            rq.a((byte) -93, param0 + -1L);
            rq.a((byte) -93, 1L);
            if (param1 == 1) {
              return;
            } else {
              field_b = null;
              return;
            }
          } else {
            rq.a((byte) -93, param0);
            if (param1 == 1) {
              return;
            } else {
              field_b = null;
              return;
            }
          }
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (param0 != -1) {
          return null;
        } else {
          var4 = param3.indexOf(param1);
          L0: while (true) {
            if (var4 == -1) {
              return param3;
            } else {
              param3 = param3.substring(0, var4) + param2 + param3.substring(param1.length() + var4);
              var4 = param3.indexOf(param1, param2.length() + var4);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Disruptive behaviour";
        field_c = "Players";
        field_d = "<%0> has no opponent and wins the tournament by default!";
    }
}
