/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static hl field_d;
    DualLinkNode field_e;
    static int[] field_b;
    static String field_a;
    static byte[][][] field_c;

    final void a(byte param0, DualLinkNode param1) {
        try {
          if (param1.secondaryPrevious != null) {
            param1.e(0);
          }
          param1.secondaryPrevious = this.field_e.secondaryPrevious;
          int var3_int = -118 % ((31 - param0) / 42);
          param1.secondaryNext = this.field_e;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "rk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final DualLinkNode b(int param0) {
        DualLinkNode var2 = this.field_e.secondaryNext;
        if (this.field_e == var2) {
          return null;
        }
        if (param0 > -70) {
          return (DualLinkNode) null;
        }
        var2.e(0);
        return var2;
    }

    final static void a(int param0, int param1, int param2) {
        vg.field_Lb = param2;
        dh.field_i = param0;
        if (param1 != -33) {
          SecondaryNodeDeque.a(-45);
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = TetraLink.field_J;
        int var1_intLifetime1;
        try {
          wn.field_t.a(104);
          if (param0 != -8243) {
            field_b = (int[]) null;
          }
          for (var1_int = 0; var1_int < 32; var1_int++) {
            uh.field_c[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            ui.field_c[var1_intLifetime1] = 0L;
          }
          qh.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "rk.E(" + param0 + ')');
        }
    }

    SecondaryNodeDeque() {
        this.field_e = new DualLinkNode();
        this.field_e.secondaryPrevious = this.field_e;
        this.field_e.secondaryNext = this.field_e;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_a = null;
        field_b = null;
        field_c = (byte[][][]) null;
        field_d = null;
    }

    static {
        field_a = "Play the game without logging in just yet";
    }
}
