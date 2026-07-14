/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln implements Iterator {
    static int[] field_f;
    static String field_c;
    private e field_b;
    private qa field_a;
    static char[] field_d;
    private qa field_e;

    public final Object next() {
        qa var1 = ((ln) this).field_e;
        if (((ln) this).field_b.field_d != var1) {
            ((ln) this).field_e = var1.field_k;
        } else {
            var1 = null;
            ((ln) this).field_e = null;
        }
        ((ln) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((ln) this).field_e != ((ln) this).field_b.field_d;
    }

    public final void remove() {
        if (!(((ln) this).field_a != null)) {
            throw new IllegalStateException();
        }
        ((ln) this).field_a.a(-4564);
        ((ln) this).field_a = null;
    }

    public static void a(int param0) {
        if (param0 != 18358) {
          ln.a(-56);
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    ln(e param0) {
        ((ln) this).field_a = null;
        ((ln) this).field_b = param0;
        ((ln) this).field_a = null;
        ((ln) this).field_e = ((ln) this).field_b.field_d.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[128];
        field_c = "Report abuse";
        field_d = new char[]{(char)91, (char)93, (char)35};
    }
}
