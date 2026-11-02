/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static ki field_d;
    DualLinkNode field_c;
    static volatile int field_b;
    static boolean field_e;
    private DualLinkNode field_a;

    final DualLinkNode b(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != -61) {
          SecondaryNodeDeque.a(102);
          var2 = this.field_c.secondaryNext;
          if (var2 != this.field_c) {
            var2.c(param0 - 5045);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_c.secondaryNext;
        if (var2Lifetime1 != this.field_c) {
          var2Lifetime1.c(param0 - 5045);
          return var2Lifetime1;
        }
        return null;
    }

    private final DualLinkNode a(DualLinkNode param0, int param1) {
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
            SecondaryNodeDeque.a(-51);
          }
          if (param0 == null) {
            var3 = this.field_c.secondaryNext;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_c) {
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -59) {
          SecondaryNodeDeque.a(-11);
        }
    }

    final DualLinkNode b(int param0) {
        if (param0 != -1) {
          return (DualLinkNode) null;
        }
        return this.a((DualLinkNode) null, param0 + 0);
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_a;
        if (this.field_c == var2) {
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
        this.field_c = new DualLinkNode();
        this.field_c.secondaryPrevious = this.field_c;
        this.field_c.secondaryNext = this.field_c;
    }

    final void a(DualLinkNode param0, byte param1) {
        if (param0.secondaryPrevious != null) {
          param0.c(-5106);
        }
        param0.secondaryNext = this.field_c;
        param0.secondaryPrevious = this.field_c.secondaryPrevious;
        if (param1 >= -103) {
          return;
        }
        try {
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
    }
}
