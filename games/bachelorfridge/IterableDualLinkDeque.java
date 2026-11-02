/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableDualLinkDeque implements Iterable {
    DualLinkNode field_a;
    static IndexedSprite[] field_d;
    static int field_b;
    static String field_c;

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 24383) {
          DualLinkNode var3 = (DualLinkNode) null;
          this.a((DualLinkNode) null, (byte) -80);
          var2 = this.field_a.secondaryNext;
          if (this.field_a != var2) {
            var2.unlinkSecondary(param0 - 24383);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_a.secondaryNext;
        if (this.field_a != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(param0 - 24383);
          return var2Lifetime1;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkDequeIterator(this));
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 > -101) {
          IterableDualLinkDeque.b(24);
        }
    }

    IterableDualLinkDeque() {
        this.field_a = new DualLinkNode();
        this.field_a.secondaryPrevious = this.field_a;
        this.field_a.secondaryNext = this.field_a;
    }

    final void a(DualLinkNode param0, byte param1) {
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary(0);
          }
          param0.secondaryNext = this.field_a;
          param0.secondaryPrevious = this.field_a.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param1 != -118) {
            this.a(42);
          }
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ou.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Game options";
    }
}
