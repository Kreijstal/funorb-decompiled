/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static String field_e;
    static int[] field_f;
    static int field_a;
    DualLinkNode sentinel;
    private DualLinkNode field_c;
    static jea field_b;

    final DualLinkNode c(int param0) {
        if (param0 > 89) {
          return this.a((byte) 121, (DualLinkNode) null);
        }
        DualLinkNode var3 = (DualLinkNode) null;
        this.a((DualLinkNode) null, -48);
        return this.a((byte) 121, (DualLinkNode) null);
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final void clear(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        while (this.sentinel.secondaryNext != this.sentinel) {
          this.sentinel.secondaryNext.unlinkSecondary(-7975);
        }
        if (param0 == 84) {
          return;
        }
        field_f = (int[]) null;
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != 8192) {
          SecondaryNodeDeque.b(101);
        }
    }

    final DualLinkNode poll(byte param0) {
        if (param0 <= 44) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (var2 != this.sentinel) {
          var2.unlinkSecondary(-7975);
          return var2;
        }
        return null;
    }

    private final DualLinkNode a(byte param0, DualLinkNode param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        DualLinkNode var4 = null;
        Object stackIn_6_0 = null;
        DualLinkNode stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 77 / ((param0 - 2) / 56);
          if (param1 != null) {
            var4 = param1;
          } else {
            var4 = this.sentinel.secondaryNext;
          }
          if (var4 == this.sentinel) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (DualLinkNode) (stackIn_6_0);
          }
          this.field_c = var4.secondaryNext;
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hma.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(DualLinkNode param0, int param1) {
        if (param0.secondaryPrevious != null) {
          param0.unlinkSecondary(-7975);
        }
        param0.secondaryPrevious = this.sentinel.secondaryPrevious;
        param0.secondaryNext = this.sentinel;
        param0.secondaryPrevious.secondaryNext = param0;
        if (param1 != -11396) {
          return;
        }
        try {
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hma.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SecondaryNodeDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryNext = this.sentinel;
        this.sentinel.secondaryPrevious = this.sentinel;
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = this.field_c;
        if (var2 == this.sentinel) {
          this.field_c = null;
          return null;
        }
        if (param0 < -77) {
          this.field_c = var2.secondaryNext;
          return var2;
        }
        return (DualLinkNode) null;
    }

    static {
        field_f = new int[8192];
        field_e = null;
        field_a = 9;
    }
}
