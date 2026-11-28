/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private SecondaryNodeDeque deque;
    private DualLinkNode lastReturned;
    private DualLinkNode nextNode;
    static int field_c;
    static ResourceArchive field_b;
    static IntrusiveDeque field_e;

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 != this.deque.sentinel) {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.nextNode = null;
          var1 = null;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.lastReturned = null;
          this.nextNode = this.deque.sentinel.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
          field_b = (ResourceArchive) null;
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
        return FrameTimer.field_b;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.sentinel;
    }

    static {
    }
}
