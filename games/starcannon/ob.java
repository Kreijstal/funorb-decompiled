/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ob implements Iterator {
    private uh field_f;
    private static long[] field_d;
    private uh field_i;
    static String field_g;
    static int field_j;
    static int field_h;
    static int field_b;
    static String field_a;
    private bh field_e;
    static int[] field_c;

    final static void a(int param0) {
        int var1 = -85 / ((54 - param0) / 61);
        if (bl.field_a != 10) {
            // ifeq L30
        } else {
            wh.b(81);
            bl.field_a = 11;
        }
        kb.field_a = true;
    }

    final static void b(int param0) {
        t.field_h.c(20317, (uj) (Object) new db());
        if (param0 != 11) {
            Object var2 = null;
            hl[] discarded$0 = ob.a((String) null, 17, (String) null, (ue) null);
        }
    }

    final static hl[] a(String param0, int param1, String param2, ue param3) {
        int var6 = -25 % ((27 - param1) / 58);
        int var4 = param3.a(param2, false);
        int var5 = param3.a(param0, true, var4);
        return le.a(var5, var4, (byte) -77, param3);
    }

    public final void remove() {
        if (null == ((ob) this).field_f) {
            throw new IllegalStateException();
        }
        ((ob) this).field_f.a(-6242);
        ((ob) this).field_f = null;
    }

    public final boolean hasNext() {
        return ((ob) this).field_e.field_f != ((ob) this).field_i;
    }

    public static void d(int param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        field_a = null;
        if (param0 != -18147) {
            ob.a(102);
        }
    }

    final static String c(int param0) {
        String var1 = "";
        if (!(null == wi.field_c)) {
            var1 = wi.field_c.j(190);
        }
        if (param0 < 93) {
            field_a = null;
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = cb.b(true);
        }
        if (!(0 != var1.length())) {
            var1 = ta.field_c;
        }
        return var1;
    }

    public final Object next() {
        uh var1 = ((ob) this).field_i;
        if (var1 != ((ob) this).field_e.field_f) {
            ((ob) this).field_i = var1.field_m;
        } else {
            ((ob) this).field_i = null;
            var1 = null;
        }
        ((ob) this).field_f = var1;
        return (Object) (Object) var1;
    }

    ob(bh param0) {
        ((ob) this).field_f = null;
        ((ob) this).field_e = param0;
        ((ob) this).field_f = null;
        ((ob) this).field_i = ((ob) this).field_e.field_f.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new long[256];
        var2 = 0;
        L0: while (true) {
          if (-257 >= (var2 ^ -1)) {
            field_a = "Type your age in years";
            field_c = new int[8192];
            field_g = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -9) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> -488601663 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
