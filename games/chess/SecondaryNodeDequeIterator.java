/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode lastReturned;
    static String field_e;
    static String field_d;
    static String field_b;
    private DualLinkNode nextNode;
    private SecondaryNodeDeque deque;

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 == this.deque.sentinel) {
          var1 = null;
          this.nextNode = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.sentinel;
    }

    public static void clearStaticReferences(boolean param0) {
        field_e = null;
        if (param0) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(-1);
        this.lastReturned = null;
    }

    final static void a(int param0, byte param1) {
        BitPacketBuffer var2 = qn.field_U;
        var2.writeCipheredByte(param0, -95);
        int var3 = 60 / ((-20 - param1) / 47);
        var2.writeByte(1, (byte) 69);
        var2.writeByte(1, (byte) 122);
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.lastReturned = null;
          this.nextNode = this.deque.sentinel.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Macroing or use of bots";
        field_d = "Orb coins: ";
        field_b = null;
    }
}
