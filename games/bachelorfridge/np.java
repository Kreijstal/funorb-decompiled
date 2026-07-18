/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class np implements Iterator {
    private int field_c;
    private bw field_b;
    private bw field_d;
    private wha field_a;

    public final Object next() {
        int var2 = 0;
        bw var3 = null;
        bw var4 = null;
        var2 = BachelorFridge.field_y;
        if (((np) this).field_b == ((np) this).field_a.field_c[((np) this).field_c + -1]) {
          L0: while (true) {
            if (((np) this).field_a.field_f > ((np) this).field_c) {
              bw[] fieldTemp$4 = ((np) this).field_a.field_c;
              int fieldTemp$5 = ((np) this).field_c;
              ((np) this).field_c = ((np) this).field_c + 1;
              var3 = fieldTemp$4[fieldTemp$5].field_b;
              if (((np) this).field_a.field_c[((np) this).field_c + -1] != var3) {
                ((np) this).field_d = var3;
                ((np) this).field_b = var3.field_b;
                return (Object) (Object) var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((np) this).field_b;
          ((np) this).field_b = var4.field_b;
          ((np) this).field_d = var4;
          return (Object) (Object) var4;
        }
    }

    private final void a() {
        ((np) this).field_b = ((np) this).field_a.field_c[0].field_b;
        ((np) this).field_c = 1;
        ((np) this).field_d = null;
    }

    public final void remove() {
        if (!(((np) this).field_d != null)) {
            throw new IllegalStateException();
        }
        ((np) this).field_d.a(false);
        ((np) this).field_d = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (((np) this).field_a.field_c[((np) this).field_c + -1] == ((np) this).field_b) {
          L0: while (true) {
            if (((np) this).field_c < ((np) this).field_a.field_f) {
              bw[] fieldTemp$2 = ((np) this).field_a.field_c;
              int fieldTemp$3 = ((np) this).field_c;
              ((np) this).field_c = ((np) this).field_c + 1;
              if (fieldTemp$2[fieldTemp$3].field_b != ((np) this).field_a.field_c[((np) this).field_c - 1]) {
                ((np) this).field_b = ((np) this).field_a.field_c[((np) this).field_c + -1].field_b;
                return true;
              } else {
                ((np) this).field_b = ((np) this).field_a.field_c[-1 + ((np) this).field_c];
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

    np(wha param0) {
        ((np) this).field_d = null;
        try {
            ((np) this).field_a = param0;
            int discarded$0 = -87;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "np.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
