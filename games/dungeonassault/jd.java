/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ne {
    static double field_j;
    int field_k;
    int field_m;
    static boolean field_l;
    static wh field_o;
    static String field_n;
    static String field_i;

    final static void b(boolean param0) {
        int var1 = 0;
        L0: {
          if (ql.field_d > 32) {
            L1: {
              var1 = ql.field_d % 32;
              if (0 != var1) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            um.a(-var1 + ql.field_d, false);
            break L0;
          } else {
            um.a(0, false);
            break L0;
          }
        }
        if (!param0) {
          field_i = (String) null;
          return;
        } else {
          return;
        }
    }

    private jd() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_o = null;
        field_i = null;
        field_n = null;
        if (param0 != 1) {
            jd.a(-38);
        }
    }

    static {
        field_l = false;
        field_j = Math.atan2(1.0, 0.0);
        field_n = "Dryads are tree nymphs, specifically of oak trees; these creatures of trees and wood can move swiftly and unnoticed through dungeons.";
        field_i = "Select a raider to cast a Glamour upon";
    }
}
