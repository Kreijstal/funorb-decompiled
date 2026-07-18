/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class nl {
    static oj field_e;
    static String field_b;
    static String field_d;
    int field_g;
    static String field_a;
    String field_c;
    static String field_f;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = hd.a(param1, 49);
        int var4 = lc.a(param1, false);
        int var5 = hd.a(param2, 116);
        int var6 = lc.a(param2, false);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -28548) {
          field_a = null;
          return new java.net.Socket(((nl) this).field_c, ((nl) this).field_g);
        } else {
          return new java.net.Socket(((nl) this).field_c, ((nl) this).field_g);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achievements";
        field_d = "members-only content";
        field_a = "Visit the Account Management section on the main site to view.";
        field_e = new oj();
        field_f = "Wave gun";
    }
}
