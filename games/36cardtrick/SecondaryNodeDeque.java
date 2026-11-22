/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    DualLinkNode sentinel;

    final DualLinkNode removeFirst(boolean param0) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (param0) {
          this.iterator();
          if (var2 != this.sentinel) {
            var2.unlinkSecondary(12);
            return var2;
          }
          return null;
        }
        if (var2 != this.sentinel) {
          var2.unlinkSecondary(12);
          return var2;
        }
        return null;
    }

    final void addLast(int param0, DualLinkNode param1) {
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(12);
          }
          param1.secondaryNext = this.sentinel;
          param1.secondaryPrevious = this.sentinel.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          if (param0 > -66) {
            this.sentinel = (DualLinkNode) null;
          }
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "va.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final static int a(int param0) {
        if (param0 != 22018) {
          return 36;
        }
        return (int)(1000000000L / IntrusiveNode.field_f);
    }

    private SecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    static {
    }
}
