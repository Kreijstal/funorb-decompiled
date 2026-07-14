/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ev implements Iterator {
    private eo field_c;
    private ou field_b;
    private eo field_a;

    public final void remove() {
        if (null == ((ev) this).field_a) {
            throw new IllegalStateException();
        }
        ((ev) this).field_a.b(0);
        ((ev) this).field_a = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        pga.field_b = new js(128);
        if (param0 != 80) {
          return;
        } else {
          var1 = 0;
          L0: while (true) {
            if (fla.field_t.length <= var1) {
              return;
            } else {
              pga.field_b.a((long)fla.field_t[var1].hashCode(), (byte) 61, (bw) (Object) new ji(var1));
              var1++;
              continue L0;
            }
          }
        }
    }

    public final boolean hasNext() {
        return ((ev) this).field_b.field_a != ((ev) this).field_c;
    }

    final static sba a(int param0, int param1, vr param2, vr param3, int param4) {
        if (param0 == 128) {
          if (!g.a(param4, param1, -30744, param2)) {
            return null;
          } else {
            return wa.a(param0 + -21359, param3.b(-38, param4, param1));
          }
        } else {
          return null;
        }
    }

    public final Object next() {
        eo var1 = ((ev) this).field_c;
        if (((ev) this).field_b.field_a != var1) {
            ((ev) this).field_c = var1.field_m;
        } else {
            ((ev) this).field_c = null;
            var1 = null;
        }
        ((ev) this).field_a = var1;
        return (Object) (Object) var1;
    }

    ev(ou param0) {
        ((ev) this).field_a = null;
        ((ev) this).field_b = param0;
        ((ev) this).field_c = ((ev) this).field_b.field_a.field_m;
        ((ev) this).field_a = null;
    }

    static {
    }
}
