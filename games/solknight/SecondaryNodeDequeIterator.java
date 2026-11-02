/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static float field_e;
    static String field_c;
    static IntrusiveDeque field_h;
    static int field_d;
    static int field_f;
    static od[] field_g;
    private DualLinkNode field_b;
    private DualLinkNode field_a;
    private SecondaryNodeDeque field_i;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != 0) {
          SecondaryNodeDequeIterator.a(true, 59, false, true);
        }
    }

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlinkSecondary(97);
        this.field_a = null;
    }

    public final boolean hasNext() {
        return this.field_b != this.field_i.field_f;
    }

    public final Object next() {
        Object var1 = this.field_b;
        if (var1 == this.field_i.field_f) {
          var1 = null;
          this.field_b = null;
        } else {
          this.field_b = ((DualLinkNode) (var1)).secondaryPrevious;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 > -69) {
          return (String) null;
        }
        if (param3) {
          var4 += 4;
          if (param0) {
            var4 += 2;
            if (param2) {
              var4++;
            }
            return dd.field_d[var4];
          }
          if (param2) {
            var4++;
          }
          return dd.field_d[var4];
        }
        if (!param0) {
          if (param2) {
            var4++;
          }
          return dd.field_d[var4];
        }
        var4 += 2;
        if (param2) {
          var4++;
        }
        return dd.field_d[var4];
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_a = null;
        try {
          this.field_i = param0;
          this.field_b = this.field_i.field_f.secondaryPrevious;
          this.field_a = null;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "This game has been updated! Please reload this page.";
    }
}
