/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode field_f;
    private DualLinkNode field_a;
    static int field_d;
    static String field_c;
    static nf field_e;
    private SecondaryNodeDeque field_b;

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 640) {
          SecondaryNodeDequeIterator.a(-73);
        }
    }

    public final boolean hasNext() {
        return this.field_b.field_f != this.field_f;
    }

    public final Object next() {
        Object var1 = this.field_f;
        if (this.field_b.field_f == var1) {
          var1 = null;
          this.field_f = null;
        } else {
          this.field_f = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlinkSecondary(12695);
        this.field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = ii.field_h[0].fullWidth;
        int var4 = ii.field_h[0].fullHeight;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        ii.field_h[0].g(var1, var2);
        var1Lifetime1 = 640 - var3;
        ii.field_h[2].g(var1Lifetime1, var2);
        var2Lifetime1 = 480 - var4;
        var1Lifetime2 = 0;
        if (param0 > 40) {
          ii.field_h[5].g(var1Lifetime2, var2Lifetime1);
          var1Lifetime2 = 640 - var3;
          ii.field_h[7].g(var1Lifetime2, var2Lifetime1);
          var1Lifetime2 = 0;
          var2Lifetime1 = 0;
          ii.field_h[3].g(var1Lifetime2, var2Lifetime1);
          var1Lifetime2 = 640 - ii.field_h[4].fullWidth;
          ii.field_h[4].g(var1Lifetime2, var2Lifetime1);
          var1Lifetime2 = 0;
          var2Lifetime1 = 0;
          ii.field_h[1].g(var1Lifetime2, var2Lifetime1);
          var2Lifetime1 = 480 - ii.field_h[6].fullHeight;
          ii.field_h[6].g(var1Lifetime2, var2Lifetime1);
          return;
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_a = null;
        try {
          this.field_b = param0;
          this.field_a = null;
          this.field_f = this.field_b.field_f.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = -1;
    }
}
