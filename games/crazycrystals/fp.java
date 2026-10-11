/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp {
    static qa field_e;
    static String field_d;
    static String field_b;
    static String field_f;
    static int field_a;
    static am field_c;

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 >= 80) {
          field_b = null;
          field_e = null;
          return;
        }
        fp.a(true, false, false, (byte) 3);
        field_b = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param3 != -69) {
          fp.a((byte) -43);
          if (param1) {
            var4 += 2;
            if (param2) {
              var4++;
            }
            return wh.field_a[var4];
          }
          if (param2) {
            var4++;
          }
          return wh.field_a[var4];
        }
        if (!param1) {
          if (param2) {
            var4++;
          }
          return wh.field_a[var4];
        }
        var4 += 2;
        if (param2) {
          var4++;
        }
        return wh.field_a[var4];
    }

    static {
        field_d = "Members' Benefits";
        field_f = "Do the same thing here to open the way through. You only need one key, but in the game, extra keys give you extra points!";
    }
}
