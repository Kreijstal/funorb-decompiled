/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf extends IOException {
    static int field_b;
    static String field_a;

    hf(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != 3543) {
            hf.a(-41);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static wd a(int param0, String param1, int param2) {
        wd var3 = null;
        Object var4 = null;
        var3 = new wd(false);
        if (param0 >= -19) {
          var4 = null;
          wd discarded$2 = hf.a(49, (String) null, 1);
          var3.field_b = param2;
          var3.field_h = param1;
          return var3;
        } else {
          var3.field_b = param2;
          var3.field_h = param1;
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play the game without logging in just yet";
    }
}
