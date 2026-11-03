/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static int[] field_f;
    static String field_c;
    private SecondaryNodeDeque field_b;
    private DualLinkNode field_a;
    static char[] field_d;
    private DualLinkNode field_e;

    public final Object next() {
        Object var1 = this.field_e;
        if (this.field_b.field_d != var1) {
          this.field_e = ((DualLinkNode) (var1)).secondaryPrevious;
        } else {
          var1 = null;
          this.field_e = null;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.field_e != this.field_b.field_d;
    }

    public final void remove() {
        if (this.field_a == null) {
          throw new IllegalStateException();
        }
        this.field_a.a(-4564);
        this.field_a = null;
    }

    public static void a(int param0) {
        if (param0 == 18358) {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
        SecondaryNodeDequeIterator.a(-56);
        field_d = null;
        field_c = null;
        field_f = null;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_a = null;
        try {
          this.field_b = param0;
          this.field_a = null;
          this.field_e = this.field_b.field_d.secondaryPrevious;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new int[128];
        field_c = "Report abuse";
        field_d = new char[]{(char)91, (char)93, (char)35};
    }
}
