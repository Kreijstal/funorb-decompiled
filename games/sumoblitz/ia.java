/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia implements Iterator {
    private um field_e;
    static String[] field_c;
    private ms field_b;
    static int field_d;
    private int field_f;
    static String field_a;
    private ms field_g;

    public final Object next() {
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (((ia) this).field_b == ((ia) this).field_e.field_c[((ia) this).field_f + -1]) {
          L0: while (true) {
            if (((ia) this).field_f < ((ia) this).field_e.field_d) {
              ((ia) this).field_f = ((ia) this).field_f + 1;
              var3 = ((ia) this).field_e.field_c[((ia) this).field_f].field_b;
              if (var3 == ((ia) this).field_e.field_c[((ia) this).field_f - 1]) {
                continue L0;
              } else {
                ((ia) this).field_g = var3;
                ((ia) this).field_b = var3.field_b;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((ia) this).field_b;
          ((ia) this).field_b = var4.field_b;
          ((ia) this).field_g = var4;
          return (Object) (Object) var4;
        }
    }

    public final void remove() {
        if (null == ((ia) this).field_g) {
            throw new IllegalStateException();
        }
        ((ia) this).field_g.b(false);
        ((ia) this).field_g = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (((ia) this).field_e.field_c[-1 + ((ia) this).field_f] == ((ia) this).field_b) {
          L0: while (true) {
            if (((ia) this).field_e.field_d > ((ia) this).field_f) {
              ((ia) this).field_f = ((ia) this).field_f + 1;
              if (((ia) this).field_e.field_c[((ia) this).field_f].field_b != ((ia) this).field_e.field_c[-1 + ((ia) this).field_f]) {
                ((ia) this).field_b = ((ia) this).field_e.field_c[((ia) this).field_f - 1].field_b;
                return true;
              } else {
                ((ia) this).field_b = ((ia) this).field_e.field_c[-1 + ((ia) this).field_f];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == 1) {
            return;
        }
        field_d = -74;
    }

    private final void b(int param0) {
        ((ia) this).field_f = 1;
        ((ia) this).field_b = ((ia) this).field_e.field_c[0].field_b;
        if (param0 <= 4) {
          this.b(34);
          ((ia) this).field_g = null;
          return;
        } else {
          ((ia) this).field_g = null;
          return;
        }
    }

    ia(um param0) {
        ((ia) this).field_g = null;
        ((ia) this).field_e = param0;
        this.b(8);
    }

    final static void a(int param0, byte param1) {
        int var2 = ps.field_e[param0];
        if (param1 != -82) {
            field_a = null;
            so.a(var2, (byte) -127);
            return;
        }
        so.a(var2, (byte) -127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
