/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class va extends IOException {
    static int field_c;
    static ko field_b;
    static String field_a;
    static int field_d;

    va(String param0) {
        super(param0);
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        var1 = 0;
        L0: while (true) {
          if (var1 >= md.field_k.length) {
            L1: {
              if (param0 >= 15) {
                break L1;
              } else {
                va.a(false);
                break L1;
              }
            }
            return;
          } else {
            if (field_c == var1) {
              if (-33 > md.field_k[var1]) {
                md.field_k[var1] = md.field_k[var1] + 1;
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            } else {
              if (-1 > md.field_k[var1]) {
                md.field_k[var1] = md.field_k[var1] - 1;
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            va.a(11);
        }
        return nb.field_c[2047 & param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have 1 unread message!";
    }
}
