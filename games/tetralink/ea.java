/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ea implements Iterable {
    static hl field_f;
    mc[] field_d;
    private mc field_g;
    static java.awt.Frame field_h;
    int field_i;
    static String field_c;
    static int field_e;
    static volatile int field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -4099) {
            return;
        }
        field_h = null;
        field_f = null;
    }

    final void a(long param0, mc param1, boolean param2) {
        mc var5 = null;
        mc var6 = null;
        mc var7 = null;
        mc var8 = null;
        mc var9 = null;
        if (null == param1.field_e) {
          if (!param2) {
            var9 = ((ea) this).field_d[(int)(param0 & (long)(-1 + ((ea) this).field_i))];
            var5 = var9;
            param1.field_j = var5;
            param1.field_e = var9.field_e;
            param1.field_e.field_j = param1;
            param1.field_j.field_e = param1;
            param1.field_c = param0;
            return;
          } else {
            ((ea) this).field_g = null;
            var8 = ((ea) this).field_d[(int)(param0 & (long)(-1 + ((ea) this).field_i))];
            var5 = var8;
            param1.field_j = var5;
            param1.field_e = var8.field_e;
            param1.field_e.field_j = param1;
            param1.field_j.field_e = param1;
            param1.field_c = param0;
            return;
          }
        } else {
          param1.b(false);
          if (param2) {
            ((ea) this).field_g = null;
            var7 = ((ea) this).field_d[(int)(param0 & (long)(-1 + ((ea) this).field_i))];
            var5 = var7;
            param1.field_j = var5;
            param1.field_e = var7.field_e;
            param1.field_e.field_j = param1;
            param1.field_j.field_e = param1;
            param1.field_c = param0;
            return;
          } else {
            var6 = ((ea) this).field_d[(int)(param0 & (long)(-1 + ((ea) this).field_i))];
            var5 = var6;
            param1.field_j = var5;
            param1.field_e = var6.field_e;
            param1.field_e.field_j = param1;
            param1.field_j.field_e = param1;
            param1.field_c = param0;
            return;
          }
        }
    }

    final mc a(long param0, int param1) {
        mc var6 = null;
        int var7 = TetraLink.field_J;
        mc var4 = ((ea) this).field_d[(int)((long)(-1 + ((ea) this).field_i) & param0)];
        int var5 = -105 % ((param1 - 41) / 63);
        ((ea) this).field_g = var4.field_j;
        while (var4 != ((ea) this).field_g) {
            if (((ea) this).field_g.field_c == param0) {
                var6 = ((ea) this).field_g;
                ((ea) this).field_g = ((ea) this).field_g.field_j;
                return var6;
            }
            ((ea) this).field_g = ((ea) this).field_g.field_j;
        }
        ((ea) this).field_g = null;
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new lj((ea) this);
    }

    ea(int param0) {
        int var2 = 0;
        mc var3 = null;
        ((ea) this).field_i = param0;
        ((ea) this).field_d = new mc[param0];
        for (var2 = 0; var2 < param0; var2++) {
            mc dupTemp$0 = new mc();
            var3 = dupTemp$0;
            ((ea) this).field_d[var2] = dupTemp$0;
            var3.field_j = var3;
            var3.field_e = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
        field_b = new int[4];
    }
}
