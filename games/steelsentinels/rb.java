/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb {
    static Random field_g;
    static String field_d;
    static int field_j;
    static volatile int field_a;
    static sg field_h;
    static long field_c;
    static byte[] field_i;
    static String field_e;
    static String field_b;
    static int field_f;

    final static int a(int param0, int param1, int param2) {
        if (param1 == 2048) {
          if (param0 >= param2) {
            return df.a(-3720, (param2 << 16) / param0);
          } else {
            return 2048 - df.a(-3720, (param0 << 16) / param2);
          }
        } else {
          int discarded$7 = rb.a(-3, -22, 110);
          if (param0 >= param2) {
            return df.a(-3720, (param2 << 16) / param0);
          } else {
            return 2048 - df.a(-3720, (param0 << 16) / param2);
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_b = null;
        field_g = null;
        if (param0 != -82) {
            rb.a((byte) -125);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new Random();
        field_a = 0;
        field_e = "Macroing or use of bots";
        field_j = 2;
        field_b = "Press ESC for Options Menu";
        field_d = "Players";
    }
}
