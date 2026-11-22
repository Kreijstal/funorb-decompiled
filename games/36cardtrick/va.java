/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va implements Iterable {
    DualLinkNode field_a;

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (param0) {
          this.iterator();
          if (var2 != this.field_a) {
            var2.unlinkSecondary(12);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_a) {
          var2.unlinkSecondary(12);
          return var2;
        }
        return null;
    }

    final void a(int param0, DualLinkNode param1) {
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(12);
          }
          param1.secondaryNext = this.field_a;
          param1.secondaryPrevious = this.field_a.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          if (param0 > -66) {
            this.field_a = (DualLinkNode) null;
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

    private va() throws Throwable {
        throw new Error();
    }

    static {
    }
}
