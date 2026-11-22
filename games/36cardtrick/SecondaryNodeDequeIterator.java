/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode lastReturned;
    private va deque;
    private DualLinkNode nextNode;
    static int field_e;
    static boolean field_a;

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(12);
        this.lastReturned = null;
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 == this.deque.field_a) {
          this.nextNode = null;
          var1 = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.field_a;
    }

    final static void a(byte param0) {
        int var1 = 54 / ((param0 - 58) / 42);
        ej.a((byte) -118, lh.field_c, ri.field_b, true);
        ij.field_g = true;
    }

    SecondaryNodeDequeIterator(va param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.field_a.secondaryNext;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -2147483648;
        field_a = true;
    }
}
