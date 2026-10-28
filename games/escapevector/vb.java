/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vb implements Iterable {
    static volatile int field_b;
    static String field_a;
    DualLinkNode field_c;

    final DualLinkNode a(byte param0) {
        if (param0 != 102) {
          field_a = (String) null;
          DualLinkNode var2 = this.field_c.secondaryNext;
          if (this.field_c != var2) {
            var2.unlinkSecondary(param0 ^ 25);
            return var2;
          }
          return null;
        }
        DualLinkNode var2Lifetime1 = this.field_c.secondaryNext;
        if (this.field_c != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(param0 ^ 25);
          return var2Lifetime1;
        }
        return null;
    }

    final void a(boolean param0, DualLinkNode param1) {
        try {
          if (param0) {
            this.iterator();
          }
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary(96);
          }
          param1.secondaryPrevious = this.field_c.secondaryPrevious;
          param1.secondaryNext = this.field_c;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new rm(this));
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        if (guard <= 39) {
          vb.releaseStatics((byte) -113);
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_b = -1;
        field_a = "Collectables";
    }
}
