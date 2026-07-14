/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wra extends IOException {
    static String field_b;
    static String field_a;

    wra(String param0) {
        super(param0);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          field_b = null;
          var1 = 0;
          L0: while (true) {
            if (db.field_h.field_c.length <= var1) {
              return;
            } else {
              db.field_h.field_c[var1] = vba.field_x[var1];
              var1++;
              continue L0;
            }
          }
        } else {
          var1 = 0;
          L1: while (true) {
            if (db.field_h.field_c.length <= var1) {
              return;
            } else {
              db.field_h.field_c[var1] = vba.field_x[var1];
              var1++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Public";
    }
}
