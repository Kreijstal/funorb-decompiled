/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sk implements Iterable {
    vg[] field_e;
    static int[] field_f;
    private vg field_d;
    private vg field_a;
    int field_g;
    static int[] field_c;
    private int field_b;

    public static void b(int param0) {
        field_c = null;
        if (param0 != 33) {
            sk.b(99);
        }
        field_f = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new nd((sk) this);
    }

    final void a(vg param0, byte param1, long param2) {
        if (!(param0.field_e == null)) {
            param0.p(92);
        }
        vg var5 = ((sk) this).field_e[(int)(param2 & (long)(-1 + ((sk) this).field_g))];
        param0.field_e = var5.field_e;
        if (param1 < 98) {
            return;
        }
        try {
            param0.field_a = var5;
            param0.field_e.field_a = param0;
            param0.field_a.field_e = param0;
            param0.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        vg var3 = null;
        vg var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (var2 >= ((sk) this).field_g) {
            ((sk) this).field_d = null;
            ((sk) this).field_a = null;
            return;
          } else {
            var3 = ((sk) this).field_e[var2];
            L1: while (true) {
              var4 = var3.field_a;
              if (var3 != var4) {
                var4.p(92);
                continue L1;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final vg b(byte param0) {
        if (param0 != 35) {
            ((sk) this).field_d = null;
        }
        ((sk) this).field_b = 0;
        return ((sk) this).a((byte) 55);
    }

    sk(int param0) {
        int var2 = 0;
        vg var3 = null;
        ((sk) this).field_b = 0;
        ((sk) this).field_e = new vg[param0];
        ((sk) this).field_g = param0;
        for (var2 = 0; var2 < param0; var2++) {
            vg dupTemp$0 = new vg();
            var3 = dupTemp$0;
            ((sk) this).field_e[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_a = var3;
        }
    }

    final vg a(byte param0) {
        vg var2 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 55) {
            vg discarded$0 = ((sk) this).a(100L, true);
        }
        if (((sk) this).field_b > 0) {
            if (((sk) this).field_e[((sk) this).field_b - 1] != ((sk) this).field_a) {
                var2 = ((sk) this).field_a;
                ((sk) this).field_a = var2.field_a;
                return var2;
            }
        }
        do {
            if (((sk) this).field_b >= ((sk) this).field_g) {
                return null;
            }
            int fieldTemp$1 = ((sk) this).field_b;
            ((sk) this).field_b = ((sk) this).field_b + 1;
            var2 = ((sk) this).field_e[fieldTemp$1].field_a;
        } while (((sk) this).field_e[-1 + ((sk) this).field_b] == var2);
        ((sk) this).field_a = var2.field_a;
        return var2;
    }

    final vg a(long param0, boolean param1) {
        vg var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        vg var4 = ((sk) this).field_e[(int)((long)(-1 + ((sk) this).field_g) & param0)];
        ((sk) this).field_d = var4.field_a;
        while (var4 != ((sk) this).field_d) {
            if (!(param0 != ((sk) this).field_d.field_d)) {
                var5 = ((sk) this).field_d;
                ((sk) this).field_d = ((sk) this).field_d.field_a;
                return var5;
            }
            ((sk) this).field_d = ((sk) this).field_d.field_a;
        }
        if (param1) {
            field_c = null;
        }
        ((sk) this).field_d = null;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{15, 12, 18, 33};
        field_c = new int[256];
    }
}
