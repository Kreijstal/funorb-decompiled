/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dk extends am {
    static int[] field_m;
    static String field_l;
    static int field_o;
    static bd field_n;
    static String field_k;
    dk field_i;
    static int field_p;
    long field_h;
    dk field_j;

    final static String a(byte param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        uh.field_h.setTime(new Date(param1));
        var3 = uh.field_h.get(7);
        var4 = uh.field_h.get(5);
        var5 = uh.field_h.get(2);
        if (param0 != -41) {
          var10 = null;
          dk.a((cl) null, -84, 103);
          var6 = uh.field_h.get(1);
          var7 = uh.field_h.get(11);
          var8 = uh.field_h.get(12);
          var9 = uh.field_h.get(13);
          return gb.field_k[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ea.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var6 = uh.field_h.get(1);
          var7 = uh.field_h.get(11);
          var8 = uh.field_h.get(12);
          var9 = uh.field_h.get(13);
          return gb.field_k[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ea.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(cl param0, int param1, int param2) {
        en var3 = null;
        var3 = s.field_b;
        var3.i(19319, param1);
        var3.d(param2 ^ 97, param0.field_m);
        if (param2 != 10) {
          field_m = null;
          var3.a((byte) -120, param0.field_n);
          return;
        } else {
          var3.a((byte) -120, param0.field_n);
          return;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != 71) {
            return;
        }
        field_n = null;
        field_k = null;
    }

    final void c(int param0) {
        if (null == ((dk) this).field_i) {
          return;
        } else {
          ((dk) this).field_i.field_j = ((dk) this).field_j;
          ((dk) this).field_j.field_i = ((dk) this).field_i;
          if (param0 != -1) {
            ((dk) this).field_i = null;
            ((dk) this).field_i = null;
            ((dk) this).field_j = null;
            return;
          } else {
            ((dk) this).field_i = null;
            ((dk) this).field_j = null;
            return;
          }
        }
    }

    protected dk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_k = "Email: ";
        field_m = new int[8192];
        field_l = "Go Back";
    }
}
