/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private bg deque;
    private DualLinkNode lastReturned;
    private DualLinkNode nextNode;
    static int field_c;
    static sh field_b;
    static ng field_e;

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 != this.deque.field_e) {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.nextNode = null;
          var1 = null;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    SecondaryNodeDequeIterator(bg param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.lastReturned = null;
          this.nextNode = this.deque.field_e.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
          field_b = (sh) null;
        }
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(12);
        this.lastReturned = null;
    }

    final static int a(int param0) {
        if (param0 != -28617) {
          return -26;
        }
        return tb.field_b;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.field_e;
    }

    static {
    }
}
