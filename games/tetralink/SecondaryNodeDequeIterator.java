/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static IntrusiveDeque field_a;
    static String field_c;
    private DualLinkNode field_f;
    static int field_d;
    private SecondaryNodeDeque field_e;
    static String field_b;
    private DualLinkNode field_g;

    public final boolean hasNext() {
        return this.field_g != this.field_e.field_e;
    }

    public final void remove() {
        if (null == this.field_f) {
          throw new IllegalStateException();
        }
        this.field_f.unlinkSecondary(0);
        this.field_f = null;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 > -97) {
          field_b = (String) null;
        }
    }

    public final Object next() {
        Object var1 = this.field_g;
        if (this.field_e.field_e != var1) {
          this.field_g = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          var1 = null;
          this.field_g = null;
        }
        this.field_f = (DualLinkNode) (var1);
        return var1;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_f = null;
        try {
          this.field_e = param0;
          this.field_f = null;
          this.field_g = this.field_e.field_e.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw oi.wrapException((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static gd a(int param0, long param1) {
        if (param0 == -18701) {
          return (gd) (dg.field_g.findByKey(param1, param0 ^ -18702));
        }
        SecondaryNodeDequeIterator.releaseStatics((byte) -94);
        return (gd) (dg.field_g.findByKey(param1, param0 ^ -18702));
    }

    static {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "<%0> is not on your friend list.";
        field_d = 0;
        field_a = new IntrusiveDeque();
    }
}
