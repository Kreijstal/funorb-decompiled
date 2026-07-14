/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ec implements Iterator {
    private bg field_d;
    private ca field_f;
    private ca field_a;
    static int field_c;
    static sh field_b;
    static ng field_e;

    public final Object next() {
        ca var1 = ((ec) this).field_a;
        if (var1 != ((ec) this).field_d.field_e) {
            ((ec) this).field_a = var1.field_l;
        } else {
            ((ec) this).field_a = null;
            var1 = null;
        }
        ((ec) this).field_f = var1;
        return (Object) (Object) var1;
    }

    ec(bg param0) {
        ((ec) this).field_f = null;
        ((ec) this).field_d = param0;
        ((ec) this).field_f = null;
        ((ec) this).field_a = ((ec) this).field_d.field_e.field_l;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
            field_b = null;
        }
    }

    public final void remove() {
        if (!(((ec) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((ec) this).field_f.b(12);
        ((ec) this).field_f = null;
    }

    final static int a(int param0) {
        if (param0 != -28617) {
            return -26;
        }
        return tb.field_b;
    }

    public final boolean hasNext() {
        return ((ec) this).field_a != ((ec) this).field_d.field_e;
    }

    static {
    }
}
