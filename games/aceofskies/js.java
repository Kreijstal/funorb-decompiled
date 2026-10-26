/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class js implements Iterator {
    private DualLinkNode field_a;
    private DualLinkNode field_d;
    static int[] field_c;
    private hs field_b;

    public final Object next() {
        Object var1 = this.field_d;
        if (var1 == this.field_b.field_c) {
          this.field_d = null;
          var1 = null;
        } else {
          this.field_d = ((DualLinkNode) (var1)).nextSecondaryNode;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlinkSecondaryNode(-118);
        this.field_a = null;
    }

    public final boolean hasNext() {
        return this.field_d != this.field_b.field_c;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -35 % ((param0 - 55) / 49);
    }

    js(hs param0) {
        this.field_a = null;
        try {
          this.field_b = param0;
          this.field_a = null;
          this.field_d = this.field_b.field_c.nextSecondaryNode;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "js.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
