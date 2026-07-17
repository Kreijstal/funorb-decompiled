/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pnb implements Iterator {
    private ksa field_d;
    private ksa field_a;
    private nga field_b;
    private int field_c;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (((pnb) this).field_d == ((pnb) this).field_b.field_h[-1 + ((pnb) this).field_c]) {
          L0: while (true) {
            if (((pnb) this).field_c < ((pnb) this).field_b.field_f) {
              int fieldTemp$1 = ((pnb) this).field_c;
              ((pnb) this).field_c = ((pnb) this).field_c + 1;
              if (((pnb) this).field_b.field_h[fieldTemp$1].field_c != ((pnb) this).field_b.field_h[-1 + ((pnb) this).field_c]) {
                ((pnb) this).field_d = ((pnb) this).field_b.field_h[((pnb) this).field_c - 1].field_c;
                return true;
              } else {
                ((pnb) this).field_d = ((pnb) this).field_b.field_h[((pnb) this).field_c - 1];
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

    public final Object next() {
        ksa var1 = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (((pnb) this).field_b.field_h[((pnb) this).field_c - 1] == ((pnb) this).field_d) {
          L0: while (true) {
            if (((pnb) this).field_c < ((pnb) this).field_b.field_f) {
              int fieldTemp$2 = ((pnb) this).field_c;
              ((pnb) this).field_c = ((pnb) this).field_c + 1;
              var1 = ((pnb) this).field_b.field_h[fieldTemp$2].field_c;
              if (((pnb) this).field_b.field_h[((pnb) this).field_c + -1] != var1) {
                ((pnb) this).field_d = var1.field_c;
                ((pnb) this).field_a = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((pnb) this).field_d;
          ((pnb) this).field_d = var1.field_c;
          ((pnb) this).field_a = var1;
          return (Object) (Object) var1;
        }
    }

    private final void a(int param0) {
        ((pnb) this).field_d = ((pnb) this).field_b.field_h[0].field_c;
        ((pnb) this).field_a = null;
        ((pnb) this).field_c = 1;
    }

    pnb(nga param0) {
        ((pnb) this).field_a = null;
        try {
            ((pnb) this).field_b = param0;
            this.a(1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pnb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void remove() {
        if (null == ((pnb) this).field_a) {
            throw new IllegalStateException();
        }
        ((pnb) this).field_a.b(-3846);
        ((pnb) this).field_a = null;
    }

    static {
    }
}
