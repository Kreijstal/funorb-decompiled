/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode nextNode;
    static int field_a;
    static int field_d;
    private qc deque;
    private DualLinkNode lastReturned;
    static Sprite field_b;

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary((byte) -93);
        this.lastReturned = null;
    }

    final static void a(int param0, int param1) {
        tg.field_i = param0 * 400 / 150;
        if (param1 == -20451) {
          tg.field_g = 100 * param0 / 150;
          tg.field_d = (param0 << 16) / 150;
          return;
        }
        SecondaryNodeDequeIterator.a(96);
        tg.field_g = 100 * param0 / 150;
        tg.field_d = (param0 << 16) / 150;
    }

    public final boolean hasNext() {
        return this.deque.field_e != this.nextNode;
    }

    SecondaryNodeDequeIterator(qc param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.field_e.field_t;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -31 / ((-15 - param0) / 48);
        field_b = null;
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (this.deque.field_e == var1) {
          var1 = null;
          this.nextNode = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).field_t;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    static {
    }
}
