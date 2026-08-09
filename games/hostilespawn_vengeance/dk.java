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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        cl var10;
        uh.field_h.setTime(new Date(param1));
        var3 = uh.field_h.get(7);
        var4 = uh.field_h.get(5);
        var5 = uh.field_h.get(2);
        if (param0 != -41) {
          var10 = (cl) null;
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
        try {
            var3 = s.field_b;
            var3.i(19319, param1);
            var3.d(param2 ^ 97, param0.field_m);
            if (param2 != 10) {
                field_m = (int[]) null;
            }
            var3.a((byte) -120, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "dk.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
        if (null == this.field_i) {
          return;
        } else {
          this.field_i.field_j = this.field_j;
          this.field_j.field_i = this.field_i;
          if (param0 != -1) {
            this.field_i = (dk) null;
            this.field_i = null;
            this.field_j = null;
            return;
          } else {
            this.field_i = null;
            this.field_j = null;
            return;
          }
        }
    }

    protected dk() {
    }

    static {
        field_o = 0;
        field_k = "Email: ";
        field_m = new int[8192];
        field_l = "Go Back";
    }
}
