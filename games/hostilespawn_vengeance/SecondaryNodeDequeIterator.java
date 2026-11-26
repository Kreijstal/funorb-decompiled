/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkDeque deque;
    static boolean field_b;
    private DualLinkNode lastReturned;
    private DualLinkNode nextNode;
    static String field_a;
    static cb field_g;
    static boolean field_c;
    static String field_e;
    static RgbSprite field_f;

    public final Object next() {
        Object var1 = this.nextNode;
        if (this.deque.field_a == var1) {
          this.nextNode = null;
          var1 = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).field_j;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    final static s b(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 <= -98) {
          var1 = SpriteGeometry.d(750938499);
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new s(SpriteGeometry.d(750938499), ia.b(32674));
        }
        SecondaryNodeDequeIterator.clearStaticReferences((byte) 44);
        var1Lifetime1 = SpriteGeometry.d(750938499);
        if (var1Lifetime1 != null &&
          var1Lifetime1.indexOf('@') >= 0) {
          var1Lifetime1 = "";
        }
        return new s(SpriteGeometry.d(750938499), ia.b(32674));
    }

    final static int a(int param0) {
        if (param0 > -90) {
          field_e = (String) null;
          return ia.field_h;
        }
        return ia.field_h;
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(-1);
        this.lastReturned = null;
    }

    public static void clearStaticReferences(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != -13) {
          return;
        }
        field_a = null;
        field_f = null;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.field_a;
    }

    SecondaryNodeDequeIterator(DualLinkDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.field_a.field_j;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = false;
        field_a = "Name is available";
    }
}
