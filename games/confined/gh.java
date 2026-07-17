/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gh implements Iterable {
    int field_i;
    static si field_a;
    rk[] field_j;
    static boolean field_k;
    private rk field_g;
    static int[] field_c;
    static nf[] field_h;
    static mn field_e;
    static String field_b;
    static String field_d;
    static java.awt.Font field_f;

    final static int a(boolean param0) {
        return nh.field_b;
    }

    final rk a(int param0, long param1) {
        rk var4 = null;
        rk var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var4 = ((gh) this).field_j[(int)((long)(((gh) this).field_i - param0) & param1)];
        ((gh) this).field_g = var4.field_h;
        L0: while (true) {
          if (((gh) this).field_g != var4) {
            if (~param1 != ~((gh) this).field_g.field_i) {
              ((gh) this).field_g = ((gh) this).field_g.field_h;
              continue L0;
            } else {
              var5 = ((gh) this).field_g;
              ((gh) this).field_g = ((gh) this).field_g.field_h;
              return var5;
            }
          } else {
            ((gh) this).field_g = null;
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_h = null;
        field_d = null;
        if (param0 > -45) {
          return;
        } else {
          field_f = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final void a(rk param0, long param1, int param2) {
        rk var5 = null;
        try {
            if (!(null == param0.field_a)) {
                param0.a(true);
            }
            var5 = ((gh) this).field_j[(int)((long)(((gh) this).field_i + param2) & param1)];
            param0.field_h = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
            param0.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gh.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new o((gh) this);
    }

    private gh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 64, 256, 128};
        field_a = new si(3);
        field_b = "Name";
        field_e = new mn();
        field_d = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
