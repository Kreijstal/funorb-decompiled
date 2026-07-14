/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl implements Iterable {
    static le field_d;
    o[] field_e;
    private o field_c;
    static String field_b;
    static volatile int field_g;
    static String field_a;
    int field_f;

    final o a(long param0, byte param1) {
        o var4 = null;
        int var5_int = 0;
        o var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        var4 = ((bl) this).field_e[(int)((long)(((bl) this).field_f + -1) & param0)];
        ((bl) this).field_c = var4.field_h;
        L0: while (true) {
          if (var4 != ((bl) this).field_c) {
            if ((((bl) this).field_c.field_e ^ -1L) != (param0 ^ -1L)) {
              ((bl) this).field_c = ((bl) this).field_c.field_h;
              continue L0;
            } else {
              var5 = ((bl) this).field_c;
              ((bl) this).field_c = ((bl) this).field_c.field_h;
              return var5;
            }
          } else {
            var5_int = 80 / ((3 - param1) / 34);
            ((bl) this).field_c = null;
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ik((bl) this);
    }

    final static wn a(int param0, int param1, String param2) {
        mn var3 = null;
        var3 = new mn();
        if (param0 != 0) {
          bl.a(-105);
          ((wn) (Object) var3).field_c = param1;
          ((wn) (Object) var3).field_a = param2;
          return (wn) (Object) var3;
        } else {
          ((wn) (Object) var3).field_c = param1;
          ((wn) (Object) var3).field_a = param2;
          return (wn) (Object) var3;
        }
    }

    bl(int param0) {
        int var2 = 0;
        o var3 = null;
        ((bl) this).field_e = new o[param0];
        ((bl) this).field_f = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new o();
            ((bl) this).field_e[var2] = new o();
            var3.field_c = var3;
            var3.field_h = var3;
        }
    }

    final static void a(String[] args, int param1, byte param2, int param3, int[] param4, um param5, byte[] param6, km[][] param7, int[] param8, boolean param9, rk[] param10, int param11, String[][] param12, km[][] param13, String[][] param14, String[] param15, um param16, String[] param17, um param18, byte[] param19) {
        bb.a(param16, param10, param18, (byte) -105, param4);
        ja.a(param16, 1);
        wm.a(args, param11, 0, param6, param17, param16, param3, param14, param15, param19, param12, param1, param7, param8, param13);
        ij.a(param5, param9, param16, (byte) 91);
        if (param2 != 31) {
            return;
        }
        vn.l(param2 + -25);
        tj.b((byte) -108);
        th.c(106);
    }

    final void a(o param0, long param1, int param2) {
        o var5 = null;
        L0: {
          if (null != param0.field_c) {
            param0.c(-2193);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((bl) this).field_e[(int)(param1 & (long)(((bl) this).field_f + -1))];
        param0.field_c = var5.field_c;
        param0.field_h = var5;
        param0.field_c.field_h = param0;
        param0.field_h.field_c = param0;
        if (param2 != 31313) {
          bl.a(-20);
          param0.field_e = param1;
          return;
        } else {
          param0.field_e = param1;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Visit the Account Management section on the main site to view.";
        field_b = "<%0> has left the lobby.";
        field_g = 0;
    }
}
