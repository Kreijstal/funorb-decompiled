/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nga implements Iterable {
    static String field_a;
    private ksa field_g;
    static String field_c;
    private ksa field_b;
    int field_f;
    static String field_e;
    private int field_d;
    ksa[] field_h;

    public final Iterator iterator() {
        return (Iterator) (Object) new pnb((nga) this);
    }

    final ksa a(byte param0, long param1) {
        ksa var5 = null;
        int var6 = VoidHunters.field_G;
        ksa var4 = ((nga) this).field_h[(int)(param1 & (long)(((nga) this).field_f + -1))];
        ((nga) this).field_b = var4.field_c;
        if (param0 > -103) {
            return null;
        }
        while (var4 != ((nga) this).field_b) {
            if (!(~param1 != ~((nga) this).field_b.field_b)) {
                var5 = ((nga) this).field_b;
                ((nga) this).field_b = ((nga) this).field_b.field_c;
                return var5;
            }
            ((nga) this).field_b = ((nga) this).field_b.field_c;
        }
        ((nga) this).field_b = null;
        return null;
    }

    final void a(ksa param0, int param1, long param2) {
        ksa var5 = null;
        try {
            if (!(null == param0.field_a)) {
                param0.b(-3846);
            }
            var5 = ((nga) this).field_h[(int)(param2 & (long)(((nga) this).field_f + -1))];
            if (param1 != 0) {
                field_a = null;
            }
            param0.field_c = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_c = param0;
            param0.field_b = param2;
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nga.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final ksa a(byte param0) {
        ksa var2 = null;
        int var3 = 0;
        Object var4 = null;
        ksa var4_ref = null;
        L0: {
          var3 = VoidHunters.field_G;
          if (0 >= ((nga) this).field_d) {
            break L0;
          } else {
            if (((nga) this).field_h[-1 + ((nga) this).field_d] == ((nga) this).field_g) {
              break L0;
            } else {
              var2 = ((nga) this).field_g;
              ((nga) this).field_g = var2.field_c;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((nga) this).field_f <= ((nga) this).field_d) {
            if (param0 != 44) {
              ((nga) this).a((ksa) null, 116, -5L);
              return null;
            } else {
              return null;
            }
          } else {
            int fieldTemp$2 = ((nga) this).field_d;
            ((nga) this).field_d = ((nga) this).field_d + 1;
            var4_ref = ((nga) this).field_h[fieldTemp$2].field_c;
            var2 = var4_ref;
            if (var4_ref == ((nga) this).field_h[((nga) this).field_d - 1]) {
              continue L1;
            } else {
              ((nga) this).field_g = var2.field_c;
              return var2;
            }
          }
        }
    }

    final ksa a(int param0) {
        int var2 = 110 / ((47 - param0) / 40);
        ((nga) this).field_d = 0;
        return ((nga) this).a((byte) 44);
    }

    final void b(int param0) {
        int var2 = 0;
        ksa var3 = null;
        ksa var4 = null;
        int var5 = VoidHunters.field_G;
        for (var2 = param0; var2 < ((nga) this).field_f; var2++) {
            var3 = ((nga) this).field_h[var2];
            while (true) {
                var4 = var3.field_c;
                if (var3 == var4) {
                    break;
                }
                var4.b(-3846);
            }
        }
        ((nga) this).field_b = null;
        ((nga) this).field_g = null;
    }

    public static void b() {
        field_e = null;
        field_c = null;
        field_a = null;
    }

    nga(int param0) {
        int var2 = 0;
        ksa var3 = null;
        ((nga) this).field_d = 0;
        ((nga) this).field_f = param0;
        ((nga) this).field_h = new ksa[param0];
        for (var2 = 0; var2 < param0; var2++) {
            ksa dupTemp$0 = new ksa();
            var3 = dupTemp$0;
            ((nga) this).field_h[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_c = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Show players in <%0>'s game";
        field_c = "Checking";
    }
}
