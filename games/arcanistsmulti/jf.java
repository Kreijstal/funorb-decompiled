/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jf implements Iterator {
    static wk field_a;
    private int field_b;
    private pg field_g;
    private pk field_c;
    static kc field_d;
    private pg field_h;
    static String field_i;
    static boolean field_e;
    static String field_f;
    static int field_j;

    final static void a(cg param0, byte param1) {
        int var2 = 0;
        cg var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 63 / ((64 - param1) / 44);
        param0.a(true);
        var3 = (cg) (Object) gm.field_j.b(12623);
        L0: while (true) {
          if (var3 != null) {
            if (var3.a((byte) 121, param0)) {
              var3 = (cg) (Object) gm.field_j.a(0);
              continue L0;
            } else {
              if (var3 != null) {
                da.a((pg) (Object) var3, 20, (pg) (Object) param0);
                return;
              } else {
                gm.field_j.b((pg) (Object) param0, -1);
                return;
              }
            }
          } else {
            if (var3 != null) {
              da.a((pg) (Object) var3, 20, (pg) (Object) param0);
              return;
            } else {
              gm.field_j.b((pg) (Object) param0, -1);
              return;
            }
          }
        }
    }

    public final Object next() {
        int var2 = 0;
        pg var3 = null;
        pg var4 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (((jf) this).field_c.field_c[-1 + ((jf) this).field_b] == ((jf) this).field_g) {
          L0: while (true) {
            if (((jf) this).field_c.field_d > ((jf) this).field_b) {
              ((jf) this).field_b = ((jf) this).field_b + 1;
              var3 = ((jf) this).field_c.field_c[((jf) this).field_b].field_b;
              if (((jf) this).field_c.field_c[-1 + ((jf) this).field_b] == var3) {
                continue L0;
              } else {
                ((jf) this).field_h = var3;
                ((jf) this).field_g = var3.field_b;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((jf) this).field_g;
          ((jf) this).field_g = var4.field_b;
          ((jf) this).field_h = var4;
          return (Object) (Object) var4;
        }
    }

    public final void remove() {
        if (null == ((jf) this).field_h) {
            throw new IllegalStateException();
        }
        ((jf) this).field_h.a(true);
        ((jf) this).field_h = null;
    }

    private final void a(int param0) {
        ((jf) this).field_h = null;
        ((jf) this).field_g = ((jf) this).field_c.field_c[0].field_b;
        if (param0 != -1) {
          return;
        } else {
          ((jf) this).field_b = 1;
          return;
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (((jf) this).field_c.field_c[((jf) this).field_b + -1] == ((jf) this).field_g) {
          L0: while (true) {
            if (((jf) this).field_c.field_d > ((jf) this).field_b) {
              ((jf) this).field_b = ((jf) this).field_b + 1;
              if (((jf) this).field_c.field_c[((jf) this).field_b].field_b == ((jf) this).field_c.field_c[((jf) this).field_b - 1]) {
                ((jf) this).field_g = ((jf) this).field_c.field_c[-1 + ((jf) this).field_b];
                continue L0;
              } else {
                ((jf) this).field_g = ((jf) this).field_c.field_c[-1 + ((jf) this).field_b].field_b;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            vm.field_b = param0;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param0.length() != param2) {
                    var5 = var7 + "; Expires=" + di.a(-62, 94608000000L + qj.b(-26572)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ei.a("document.cookie=\"" + var5 + "\"", param1, param2 ^ 269);
            } catch (Throwable throwable) {
            }
            ml.a(-122, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        if (param0 >= -59) {
          field_i = null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_d = null;
          return;
        }
    }

    jf(pk param0) {
        ((jf) this).field_h = null;
        ((jf) this).field_c = param0;
        this.a(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wk(256);
        field_f = "This is a <col=ff00ff><shad=0>level 2</col></shad> spell and is unavailable unless you also put the related <col=D4D0C8><shad=0>level 1</col></shad> spell <%0> into your spellbook.";
        field_i = "Spell types 2/2:";
    }
}
