/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vv implements Iterator {
    private pj field_e;
    private pj field_c;
    static hr[] field_a;
    private hl field_d;
    static ul field_b;

    public final Object next() {
        pj var1 = ((vv) this).field_c;
        if (((vv) this).field_d.field_c == var1) {
            var1 = null;
            ((vv) this).field_c = null;
        } else {
            ((vv) this).field_c = var1.field_m;
        }
        ((vv) this).field_e = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((vv) this).field_c != ((vv) this).field_d.field_c;
    }

    public final void remove() {
        if (!(((vv) this).field_e != null)) {
            throw new IllegalStateException();
        }
        ((vv) this).field_e.c(-5106);
        ((vv) this).field_e = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (ws.field_b != param1) {
            gs.field_b = new int[param1];
            var3 = 0;
            L1: while (true) {
              if (var3 >= param1) {
                ws.field_b = param1;
                break L0;
              } else {
                gs.field_b[var3] = (var3 << 719764940) / param1;
                var3++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == -1203350004) {
            break L2;
          } else {
            vv.a(86);
            break L2;
          }
        }
        L3: {
          if (ts.field_c != param2) {
            L4: {
              if (ws.field_b == param2) {
                uv.field_o = gs.field_b;
                break L4;
              } else {
                uv.field_o = new int[param2];
                var5 = 0;
                var3 = var5;
                L5: while (true) {
                  if (param2 <= var5) {
                    break L4;
                  } else {
                    uv.field_o[var5] = (var5 << -1203350004) / param2;
                    var5++;
                    continue L5;
                  }
                }
              }
            }
            ts.field_c = param2;
            break L3;
          } else {
            break L3;
          }
        }
    }

    vv(hl param0) {
        ((vv) this).field_e = null;
        ((vv) this).field_d = param0;
        ((vv) this).field_e = null;
        ((vv) this).field_c = ((vv) this).field_d.field_c.field_m;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -91) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
