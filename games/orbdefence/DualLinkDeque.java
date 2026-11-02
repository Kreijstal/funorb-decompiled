/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDeque implements Iterable {
    static hj field_c;
    static hj field_b;
    DualLinkNode field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
          field_b = (hj) null;
        }
    }

    final static boolean b(int param0) {
        if (param0 != 14388) {
          DualLinkDeque.b(106);
          return vh.field_j;
        }
        return vh.field_j;
    }

    final void a(DualLinkNode param0, int param1) {
        try {
          if (param1 != 21693) {
            DualLinkDeque.b(92);
          }
          if (param0.field_g != null) {
            param0.c(-1);
          }
          param0.field_f = this.field_a;
          param0.field_g = this.field_a.field_g;
          param0.field_g.field_f = param0;
          param0.field_f.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "qe.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkDequeIterator(this));
    }

    final DualLinkNode a(int param0) {
        int var2 = 13 % ((21 - param0) / 47);
        DualLinkNode var3 = this.field_a.field_f;
        if (this.field_a != var3) {
          var3.c(-1);
          return var3;
        }
        return null;
    }

    private DualLinkDeque() throws Throwable {
        throw new Error();
    }

    static {
    }
}
