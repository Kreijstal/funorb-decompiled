/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableDualLinkDeque implements Iterable {
    static volatile int pendingMouseX;
    static String field_a;
    DualLinkNode sentinel;

    final DualLinkNode removeFirst(byte guard) {
        if (guard != 102) {
          field_a = (String) null;
          DualLinkNode var2 = this.sentinel.secondaryNext;
          if (this.sentinel != var2) {
            var2.unlinkSecondary(guard ^ 25);
            return var2;
          }
          return null;
        }
        DualLinkNode var2Lifetime1 = this.sentinel.secondaryNext;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(guard ^ 25);
          return var2Lifetime1;
        }
        return null;
    }

    final void addLast(boolean guard, DualLinkNode node) {
        try {
          if (guard) {
            this.iterator();
          }
          if (node.secondaryPrevious != null) {
            node.unlinkSecondary(96);
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "vb.C(" + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkDequeIterator(this));
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        if (guard <= 39) {
          IterableDualLinkDeque.releaseStatics((byte) -113);
        }
    }

    private IterableDualLinkDeque() throws Throwable {
        throw new Error();
    }

    static {
        pendingMouseX = -1;
        field_a = "Collectables";
    }
}
