/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private SecondaryNodeDeque field_b;
    private DualLinkNode field_a;
    static int field_c;
    private DualLinkNode field_d;

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlink(false);
        this.field_a = null;
    }

    public final Object next() {
        Object var1 = this.field_d;
        if (var1 == this.field_b.field_b) {
          this.field_d = null;
          var1 = null;
        } else {
          this.field_d = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.field_b.field_b != this.field_d;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_a = null;
        try {
          this.field_b = param0;
          this.field_d = this.field_b.field_b.secondaryNext;
          this.field_a = null;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
    }
}
