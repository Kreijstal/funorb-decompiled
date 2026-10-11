/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static String field_b;
    static int field_a;

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 < -35) {
          var4 = 0;
          if (param1) {
            var4 += 4;
          }
          if (param2) {
            var4 += 2;
          }
          if (param3) {
            var4++;
          }
          return lh.field_d[var4];
        }
        lk.a(-28, false, true, true);
        var4Lifetime1 = 0;
        if (param1) {
          var4Lifetime1 += 4;
        }
        if (param2) {
          var4Lifetime1 += 2;
        }
        if (param3) {
          var4Lifetime1++;
        }
        return lh.field_d[var4Lifetime1];
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_b = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "Highscores";
    }
}
