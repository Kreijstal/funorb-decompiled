/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qm implements Iterable {
    private hg field_e;
    static gi[] field_d;
    static int field_c;
    int field_g;
    static String[] field_f;
    hg[] field_b;
    static String field_a;

    final hg a(int param0, long param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        if (param0 != -2678) {
            ((qm) this).field_g = -103;
        }
        hg var4 = ((qm) this).field_b[(int)((long)(-1 + ((qm) this).field_g) & param1)];
        ((qm) this).field_e = var4.field_b;
        while (var4 != ((qm) this).field_e) {
            if (!((param1 ^ -1L) != (((qm) this).field_e.field_e ^ -1L))) {
                var5 = ((qm) this).field_e;
                ((qm) this).field_e = ((qm) this).field_e.field_b;
                return var5;
            }
            ((qm) this).field_e = ((qm) this).field_e.field_b;
        }
        ((qm) this).field_e = null;
        return null;
    }

    final static int a(dk[] param0, byte param1) {
        int var2 = 0;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = EscapeVector.field_A;
        var2 = 2147483647;
        var3 = param0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            L1: {
              if (param1 > 9) {
                break L1;
              } else {
                var7 = null;
                int discarded$1 = qm.a((dk[]) null, (byte) 66);
                break L1;
              }
            }
            if ((var2 ^ -1) != -2147483648) {
              return var2;
            } else {
              return 0;
            }
          } else {
            var5 = var3[var4];
            if (var5.field_f < var2) {
              var2 = var5.field_f;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new hb((qm) this);
    }

    final void a(long param0, byte param1, hg param2) {
        if (param2.field_d != null) {
            param2.c((byte) -51);
        }
        if (param1 != -106) {
            return;
        }
        hg var5 = ((qm) this).field_b[(int)(param0 & (long)(-1 + ((qm) this).field_g))];
        param2.field_d = var5.field_d;
        param2.field_b = var5;
        param2.field_d.field_b = param2;
        param2.field_b.field_d = param2;
        param2.field_e = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 < 86) {
            field_d = null;
        }
    }

    private qm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 64;
        field_a = "Age:";
    }
}
