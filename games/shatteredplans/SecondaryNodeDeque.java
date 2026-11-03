/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static int[] field_b;
    static int field_d;
    static String field_c;
    DualLinkNode field_a;
    static String field_e;

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 115 / ((23 - param0) / 47);
        field_e = null;
    }

    final void addLast(DualLinkNode param0, int param1) {
        try {
          if (null != param0.field_j) {
            param0.unlinkSecondary(param1 ^ 22);
          }
          param0.field_j = this.field_a.field_j;
          if (param1 != 6) {
            this.pollFirst((byte) 95);
          }
          param0.field_h = this.field_a;
          param0.field_j.field_h = param0;
          param0.field_h.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "up.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final DualLinkNode pollFirst(byte param0) {
        DualLinkNode var2 = this.field_a.field_h;
        if (param0 != -20) {
          DualLinkNode var3 = (DualLinkNode) null;
          this.addLast((DualLinkNode) null, 90);
          if (this.field_a != var2) {
            var2.unlinkSecondary(16);
            return var2;
          }
          return null;
        }
        if (this.field_a != var2) {
          var2.unlinkSecondary(16);
          return var2;
        }
        return null;
    }

    SecondaryNodeDeque() {
        this.field_a = new DualLinkNode();
        this.field_a.field_j = this.field_a;
        this.field_a.field_h = this.field_a;
    }

    static {
        field_b = new int[]{2, 21, 22, 7, 6, 11, 12, 14};
        field_c = "Hide private chat and appear offline to friends";
        field_e = "The game options are not all set.";
    }
}
