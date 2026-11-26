/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveDeque implements Iterable {
    static double field_a;
    DualLinkNode sentinel;
    static String field_d;
    static AccountServiceResult field_e;
    static RgbSprite field_c;

    private IntrusiveDeque() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final void addLast(DualLinkNode param0, int param1) {
        if (null != param0.field_q) {
          param0.unlinkSecondary(true);
        }
        if (param1 != 18425) {
          return;
        }
        try {
          param0.field_o = this.sentinel;
          param0.field_q = this.sentinel.field_q;
          param0.field_q.field_o = param0;
          param0.field_o.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "lm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_e = null;
        if (param0 < 94) {
          IntrusiveDeque.clearStaticReferences((byte) 44);
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    final DualLinkNode removeFirst(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != -29870) {
          this.removeFirst(-12);
          var2 = this.sentinel.field_o;
          if (this.sentinel != var2) {
            var2.unlinkSecondary(true);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.field_o;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(true);
          return var2Lifetime1;
        }
        return null;
    }

    static {
        field_d = "This entry doesn't match";
    }
}
