/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    DualLinkNode field_b;
    static int field_a;
    static String field_d;
    static String field_c;

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final DualLinkNode removeLast(int param0) {
        DualLinkNode var2 = this.field_b.secondaryPrevious;
        if (param0 >= -3) {
          return (DualLinkNode) null;
        }
        if (var2 != this.field_b) {
          var2.unlinkSecondary(-120);
          return var2;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          return;
        }
        field_c = null;
    }

    final void addFirst(byte param0, DualLinkNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.secondaryNext != null) {
            param1.unlinkSecondary(-120);
          }
          param1.secondaryPrevious = this.field_b;
          param1.secondaryNext = this.field_b.secondaryNext;
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryPrevious.secondaryNext = param1;
          if (param0 >= 7) {
            return;
          }
          this.iterator();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    SecondaryNodeDeque() {
        this.field_b = new DualLinkNode();
        this.field_b.secondaryPrevious = this.field_b;
        this.field_b.secondaryNext = this.field_b;
    }

    static {
        field_d = "Please check if address is correct";
        field_c = "game over";
    }
}
