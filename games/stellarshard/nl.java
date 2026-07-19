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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (param0 <= -110) {
            break L0;
          } else {
            nl.a((byte) 75);
            break L0;
          }
        }
        var3 = hd.a(param1, 49);
        var4 = lc.a(param1, false);
        var5 = hd.a(param2, 116);
        var6 = lc.a(param2, false);
        var7 = (int)((long)var5 * (long)var3 >> -970259888);
        var8 = (int)((long)var3 * (long)var6 >> -605484208);
        var9 = (int)((long)var5 * (long)var4 >> 2118858000);
        var10 = (int)((long)var6 * (long)var4 >> 561206736);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 45) {
            return;
        }
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -28548) {
          field_a = (String) null;
          return new java.net.Socket(this.field_c, this.field_g);
        } else {
          return new java.net.Socket(this.field_c, this.field_g);
        }
    }

    static {
        field_b = "Achievements";
        field_d = "members-only content";
        field_a = "Visit the Account Management section on the main site to view.";
        field_e = new oj();
        field_f = "Wave gun";
    }
}
