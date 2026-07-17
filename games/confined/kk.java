/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk extends IOException {
    static String field_a;
    static int field_c;
    static int field_b;

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = 64 % ((param0 - -52) / 39);
        if (null != kl.field_G) {
          if (wd.field_f != lk.field_d) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    kk(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hard Difficulty";
        field_c = -1;
    }
}
