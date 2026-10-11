/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static String field_a;
    static String field_b;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static int b(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param0 <= param1) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        return param1 + var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 11645) {
          km.a(66);
        }
    }

    static {
        field_b = "No highscores";
        field_a = "Invincibility";
    }
}
