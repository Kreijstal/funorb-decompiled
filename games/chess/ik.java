/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    private o field_c;
    private o field_d;
    static String field_f;
    static short[] field_g;
    static String[] field_a;
    private int field_h;
    static String field_b;
    static tk field_e;
    private bl field_j;
    static ld[] field_i;

    private final void a(int param0) {
        ((ik) this).field_h = 1;
        int var2 = 7;
        ((ik) this).field_c = ((ik) this).field_j.field_e[0].field_h;
        ((ik) this).field_d = null;
    }

    public final Object next() {
        int var2 = 0;
        Object var3 = null;
        o var3_ref = null;
        o var4 = null;
        var2 = Chess.field_G;
        if (((ik) this).field_j.field_e[((ik) this).field_h + -1] == ((ik) this).field_c) {
          L0: while (true) {
            if (((ik) this).field_j.field_f > ((ik) this).field_h) {
              int fieldTemp$2 = ((ik) this).field_h;
              ((ik) this).field_h = ((ik) this).field_h + 1;
              var3_ref = ((ik) this).field_j.field_e[fieldTemp$2].field_h;
              if (var3_ref == ((ik) this).field_j.field_e[-1 + ((ik) this).field_h]) {
                continue L0;
              } else {
                ((ik) this).field_d = var3_ref;
                ((ik) this).field_c = var3_ref.field_h;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((ik) this).field_c;
          ((ik) this).field_c = var4.field_h;
          ((ik) this).field_d = var4;
          return (Object) (Object) var4;
        }
    }

    public static void a() {
        field_g = null;
        field_b = null;
        field_a = null;
        field_i = null;
        field_e = null;
        field_f = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Chess.field_G;
        if (((ik) this).field_j.field_e[-1 + ((ik) this).field_h] == ((ik) this).field_c) {
          L0: while (true) {
            if (((ik) this).field_j.field_f > ((ik) this).field_h) {
              int fieldTemp$1 = ((ik) this).field_h;
              ((ik) this).field_h = ((ik) this).field_h + 1;
              if (((ik) this).field_j.field_e[fieldTemp$1].field_h == ((ik) this).field_j.field_e[-1 + ((ik) this).field_h]) {
                ((ik) this).field_c = ((ik) this).field_j.field_e[-1 + ((ik) this).field_h];
                continue L0;
              } else {
                ((ik) this).field_c = ((ik) this).field_j.field_e[-1 + ((ik) this).field_h].field_h;
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

    final static aj b() {
        if (g.field_a == ji.field_T) {
            throw new IllegalStateException();
        }
        if (!(kn.field_D != g.field_a)) {
            g.field_a = ji.field_T;
            return lg.field_a;
        }
        return null;
    }

    ik(bl param0) {
        ((ik) this).field_d = null;
        try {
            ((ik) this).field_j = param0;
            this.a(90);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ik.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void remove() {
        if (!(null != ((ik) this).field_d)) {
            throw new IllegalStateException();
        }
        ((ik) this).field_d.c(-2193);
        ((ik) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete friend - system busy";
        field_g = new short[]{(short) 16288, (short) 6792};
        field_f = "3D MODE";
        field_e = new tk();
    }
}
