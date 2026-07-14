/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rm implements Iterable {
    static int field_e;
    static int[] field_h;
    static String field_c;
    static int field_b;
    static String field_i;
    static java.awt.Image field_a;
    private oh field_j;
    int field_d;
    static String[] field_g;
    oh[] field_f;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0 != -1215) {
            rm.b(57);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new fl((rm) this);
    }

    final static void b(int param0) {
        ai.a(true, -1, ae.field_g, aa.field_G);
        if (param0 > -28) {
            Object var2 = null;
            String discarded$0 = rm.a((byte[]) null, -113);
            jh.field_D = true;
            return;
        }
        jh.field_D = true;
    }

    final static String a(byte[] param0, int param1) {
        if (param1 != 17746) {
            field_a = null;
            return qi.a(param0, param0.length, 0, param1 + -17864);
        }
        return qi.a(param0, param0.length, 0, param1 + -17864);
    }

    final oh a(int param0, long param1) {
        oh var4 = null;
        oh var5 = null;
        int var6 = 0;
        oh var7 = null;
        oh var8 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < -72) {
          var7 = ((rm) this).field_f[(int)((long)(((rm) this).field_d - 1) & param1)];
          var4 = var7;
          ((rm) this).field_j = var7.field_f;
          L0: while (true) {
            if (((rm) this).field_j == var4) {
              ((rm) this).field_j = null;
              return null;
            } else {
              if ((((rm) this).field_j.field_b ^ -1L) != (param1 ^ -1L)) {
                ((rm) this).field_j = ((rm) this).field_j.field_f;
                continue L0;
              } else {
                var5 = ((rm) this).field_j;
                ((rm) this).field_j = ((rm) this).field_j.field_f;
                return var5;
              }
            }
          }
        } else {
          ((rm) this).a((oh) null, true, 61L);
          var8 = ((rm) this).field_f[(int)((long)(((rm) this).field_d - 1) & param1)];
          var4 = var8;
          ((rm) this).field_j = var8.field_f;
          L1: while (true) {
            if (((rm) this).field_j == var4) {
              ((rm) this).field_j = null;
              return null;
            } else {
              if ((((rm) this).field_j.field_b ^ -1L) != (param1 ^ -1L)) {
                ((rm) this).field_j = ((rm) this).field_j.field_f;
                continue L1;
              } else {
                var5 = ((rm) this).field_j;
                ((rm) this).field_j = ((rm) this).field_j.field_f;
                return var5;
              }
            }
          }
        }
    }

    final void a(oh param0, boolean param1, long param2) {
        oh var5 = null;
        if (!(param0.field_e == null)) {
            param0.b((byte) -58);
        }
        if (!param1) {
            ((rm) this).field_f = null;
            var5 = ((rm) this).field_f[(int)((long)(-1 + ((rm) this).field_d) & param2)];
            param0.field_f = var5;
            param0.field_e = var5.field_e;
            param0.field_e.field_f = param0;
            param0.field_f.field_e = param0;
            param0.field_b = param2;
            return;
        }
        var5 = ((rm) this).field_f[(int)((long)(-1 + ((rm) this).field_d) & param2)];
        param0.field_f = var5;
        param0.field_e = var5.field_e;
        param0.field_e.field_f = param0;
        param0.field_f.field_e = param0;
        param0.field_b = param2;
    }

    rm(int param0) {
        int var2 = 0;
        oh var3 = null;
        ((rm) this).field_d = param0;
        ((rm) this).field_f = new oh[param0];
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new oh();
            ((rm) this).field_f[var2] = new oh();
            var3.field_f = var3;
            var3.field_e = var3;
        }
    }

    final static bc a(int param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        if (!param3) {
            field_c = null;
            return cc.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
        }
        return cc.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = new int[]{2, 21, 22, 7, 6, 10};
        field_i = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = -1;
    }
}
