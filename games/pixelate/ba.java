/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ba {
    static jl field_d;
    static int field_f;
    private int field_b;
    private int field_a;
    private wl[] field_e;
    private int field_c;

    final static ak a(int param0) {
        if (param0 != -26573) {
            ak discarded$0 = ba.a(77);
            int discarded$1 = 0;
            return g.b();
        }
        int discarded$2 = 0;
        return g.b();
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != -904) {
          L0: {
            ((ba) this).field_e = null;
            var2 = ((ba) this).field_e.length - 1;
            if (var2 < 0) {
              break L0;
            } else {
              L1: {
                if (null == ((ba) this).field_e[var2]) {
                  var2--;
                  break L1;
                } else {
                  ((ba) this).field_e[var2].b((byte) -121);
                  var2--;
                  break L1;
                }
              }
              var2--;
              var2--;
              var2--;
              break L0;
            }
          }
          return;
        } else {
          var2 = ((ba) this).field_e.length - 1;
          L2: while (true) {
            if (var2 < 0) {
              return;
            } else {
              if (null == ((ba) this).field_e[var2]) {
                var2--;
                var2--;
                var2--;
                continue L2;
              } else {
                ((ba) this).field_e[var2].b((byte) -121);
                var2--;
                var2--;
                continue L2;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 != 3) {
            ba.c(105);
        }
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = param0 ? 1 : 0;
        var3 = ((ba) this).field_e.length - 1;
        L0: while (true) {
          if (var3 < 0) {
            return var2 != 0;
          } else {
            if (null != ((ba) this).field_e[var3]) {
              ((ba) this).field_e[var3].a(0, ((ba) this).field_c);
              var2 = var2 != 0 & ((ba) this).field_e[var3].a((byte) -87) ? 1 : 0;
              var3--;
              var3--;
              continue L0;
            } else {
              var3--;
              var3--;
              continue L0;
            }
          }
        }
    }

    ba(int param0, int param1, int param2, int param3, int[] param4) {
        int var6_int = 0;
        try {
            hd.d(-90);
            ((ba) this).field_b = ok.a(ea.field_b, -119, param2) + param0;
            ((ba) this).field_a = param1 - -ok.a(ea.field_b, -103, param3);
            ((ba) this).field_e = new wl[50 + ok.a(ea.field_b, -102, 5)];
            for (var6_int = ((ba) this).field_e.length + -1; var6_int >= 0; var6_int--) {
                ((ba) this).field_e[var6_int] = new wl(((ba) this).field_b, ((ba) this).field_a, ok.a(ea.field_b, -101, 1024), param4);
            }
            ((ba) this).field_c = ok.a(ea.field_b, -100, 3) + 2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ba.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
