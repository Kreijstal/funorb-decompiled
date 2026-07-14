/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class q {
    int field_c;
    int field_f;
    int field_e;
    int field_b;
    int field_g;
    int field_h;
    static Random field_a;
    static aj field_d;

    final static void a(byte param0, boolean param1) {
        jd.a(param1, false, 37);
        int var2 = -28 / ((-10 - param0) / 47);
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 70) {
            field_d = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(long param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ad.field_b.setTime(new Date(param0));
        var3 = ad.field_b.get(7);
        var4 = ad.field_b.get(5);
        if (param1 != 28) {
          q.a((byte) 75, false);
          var5 = ad.field_b.get(2);
          var6 = ad.field_b.get(1);
          var7 = ad.field_b.get(11);
          var8 = ad.field_b.get(12);
          var9 = ad.field_b.get(13);
          return cg.field_i[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + ig.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var5 = ad.field_b.get(2);
          var6 = ad.field_b.get(1);
          var7 = ad.field_b.get(11);
          var8 = ad.field_b.get(12);
          var9 = ad.field_b.get(13);
          return cg.field_i[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + ig.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Random();
        field_d = new aj(1, 2, 2, 0);
    }
}
