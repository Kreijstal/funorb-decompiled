/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static int[] field_g;
    static im field_d;
    static int field_i;
    static String field_j;
    static pj field_b;
    static String field_e;
    static String field_c;
    static String field_f;
    static String field_h;
    static int field_k;
    static Calendar field_l;
    static String field_m;
    static fa field_a;

    final static int b() {
        return wf.field_q;
    }

    final static String c(int param0) {
        if (param0 != -14700) {
            String discarded$0 = ab.c(23);
            return mk.field_j.e(-1);
        }
        return mk.field_j.e(-1);
    }

    final static void a() {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 23;
        if (null != th.field_g) {
          var2 = (Object) (Object) th.field_g;
          synchronized (var2) {
            L0: {
              th.field_g = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_m = null;
        field_g = null;
        field_a = null;
        field_j = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_l = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[4];
        field_e = "Damage: ";
        field_b = null;
        field_j = "Squiddy";
        field_c = "    4th level";
        field_d = new im();
        field_h = "Vigilante";
        field_f = "Centre on unit";
        field_k = 0;
        field_m = "HLC-101";
        field_l = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
