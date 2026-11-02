/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode field_a;
    private SecondaryNodeDeque field_d;
    private DualLinkNode field_c;
    static String field_b;
    static int field_e;

    public final void remove() {
        if (null == this.field_c) {
          throw new IllegalStateException();
        }
        this.field_c.unlinkSecondary((byte) 13);
        this.field_c = null;
    }

    public final boolean hasNext() {
        return this.field_a != this.field_d.field_a;
    }

    public final Object next() {
        Object var1 = this.field_a;
        if (this.field_d.field_a == var1) {
          var1 = null;
          this.field_a = null;
        } else {
          this.field_a = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_c = (DualLinkNode) (var1);
        return var1;
    }

    public static void a(int param0) {
        int var1 = 64 / ((-33 - param0) / 39);
        field_b = null;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_c = null;
        try {
          this.field_d = param0;
          this.field_c = null;
          this.field_a = this.field_d.field_a.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
        field_b = "Select ";
        field_e = 72;
    }
}
