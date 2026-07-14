/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static String field_b;
    static int field_a;

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 >= -35) {
          L0: {
            String discarded$2 = lk.a(-28, false, true, true);
            var4 = 0;
            if (param1) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param3) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return lh.field_d[var4];
        } else {
          L3: {
            var4 = 0;
            if (param1) {
              var4 += 4;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param2) {
              var4 += 2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param3) {
              var4++;
              break L5;
            } else {
              break L5;
            }
          }
          return lh.field_d[var4];
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_b = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Highscores";
    }
}
