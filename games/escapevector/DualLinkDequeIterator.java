/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDequeIterator implements Iterator {
    private DualLinkNode nextNode;
    static boolean field_c;
    static String field_g;
    static Sprite field_e;
    static String field_a;
    private IterableDualLinkDeque deque;
    private DualLinkNode lastReturned;

    final static void attachMouseInput(java.awt.Component component, byte guard) {
        if (guard != 38) {
          return;
        }
        try {
          component.addMouseListener(QuickChatDynamicCommand.mouseHandler);
          component.addMouseMotionListener(QuickChatDynamicCommand.mouseHandler);
          component.addFocusListener(QuickChatDynamicCommand.mouseHandler);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rm.A(" + (component != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public final boolean hasNext() {
        return this.deque.sentinel != this.nextNode;
    }

    public static void releaseStatics(boolean guard) {
        field_a = null;
        if (!guard) {
          field_c = false;
          field_e = null;
          field_g = null;
          return;
        }
        field_e = null;
        field_g = null;
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(103);
        this.lastReturned = null;
    }

    DualLinkDequeIterator(IterableDualLinkDeque deque) {
        this.lastReturned = null;
        try {
          this.deque = deque;
          this.nextNode = this.deque.sentinel.secondaryNext;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rm.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (this.deque.sentinel != var1) {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.nextNode = null;
          var1 = null;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    static {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
