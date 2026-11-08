/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static ResourceArchive field_d;
    DualLinkNode sentinel;
    static volatile int field_b;
    static boolean field_e;
    private DualLinkNode field_a;

    final DualLinkNode removeFirst(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != -61) {
          SecondaryNodeDeque.releaseStatics(102);
          var2 = this.sentinel.secondaryNext;
          if (var2 != this.sentinel) {
            var2.unlinkSecondary(param0 - 5045);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.secondaryNext;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlinkSecondary(param0 - 5045);
          return var2Lifetime1;
        }
        return null;
    }

    private final DualLinkNode startAt(DualLinkNode param0, int param1) {
        DualLinkNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        DualLinkNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            SecondaryNodeDeque.releaseStatics(-51);
          }
          if (param0 == null) {
            var3 = this.sentinel.secondaryNext;
          } else {
            var3 = param0;
          }
          if (var3 == this.sentinel) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (DualLinkNode) (stackIn_8_0);
          }
          this.field_a = var3.secondaryNext;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("hl.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 >= -59) {
          SecondaryNodeDeque.releaseStatics(-11);
        }
    }

    final DualLinkNode first(int param0) {
        if (param0 != -1) {
          return (DualLinkNode) null;
        }
        return this.startAt((DualLinkNode) null, param0 + 0);
    }

    final DualLinkNode next(byte param0) {
        DualLinkNode var2 = this.field_a;
        if (this.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 == -122) {
          this.field_a = var2.secondaryNext;
          return var2;
        }
        return (DualLinkNode) null;
    }

    SecondaryNodeDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    final void addLast(DualLinkNode param0, byte param1) {
        if (param0.secondaryPrevious != null) {
          param0.unlinkSecondary(-5106);
        }
        param0.secondaryNext = this.sentinel;
        param0.secondaryPrevious = this.sentinel.secondaryPrevious;
        if (param1 >= -103) {
          return;
        }
        try {
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
    }
}
