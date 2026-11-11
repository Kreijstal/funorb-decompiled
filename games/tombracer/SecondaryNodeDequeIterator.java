/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private static String[] field_e;
    private DualLinkNode field_c;
    static String field_b;
    private SecondaryNodeDeque field_d;
    private DualLinkNode field_f;
    static MatchScreen field_a;

    public final Object next() {
        Object var1 = this.field_c;
        if (var1 == this.field_d.sentinel) {
          var1 = null;
          this.field_c = null;
        } else {
          this.field_c = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_f = (DualLinkNode) (var1);
        return var1;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 >= -47) {
          field_e = (String[]) null;
        }
    }

    public final void remove() {
        if (this.field_f == null) {
          throw new IllegalStateException();
        }
        this.field_f.unlinkSecondary(-7975);
        this.field_f = null;
    }

    public final boolean hasNext() {
        return this.field_c != this.field_d.sentinel;
    }

    final static void fillAlphaRect(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        tga.field_a.fillRectangleAlpha(jg.withAlpha(param0, (byte) -68, param2), param6, param3, param5, -22971, param1);
        if (param4 < 0) {
          field_a = (MatchScreen) null;
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_f = null;
        try {
          this.field_d = param0;
          this.field_c = this.field_d.sentinel.secondaryNext;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "On";
        field_e = new String[9];
        field_e[4] = "1 Long, 1 Short";
        field_e[8] = "Stutter 2";
        field_e[7] = "Stutter 1";
        field_e[0] = "Constant";
        field_e[6] = "2 Long, 1 Short";
        field_e[3] = "Pulse, Fast";
        field_e[5] = "1 Long, 2 Short";
        field_e[1] = "Pulse, Slow";
        field_e[2] = "Pulse, Medium";
    }
}
