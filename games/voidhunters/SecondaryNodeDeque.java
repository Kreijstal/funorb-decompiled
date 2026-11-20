/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static Widget[] field_c;
    DualLinkNode sentinel;
    private DualLinkNode cursor;

    final void clear(byte param0) {
        int var3 = VoidHunters.field_G;
        while (this.sentinel.secondaryNext != this.sentinel) {
          this.sentinel.secondaryNext.unlinkSecondary((byte) -35);
        }
        if (param0 >= 50) {
          return;
        }
        this.removeFirst(-59);
    }

    private final DualLinkNode startAt(DualLinkNode param0, int param1) {
        DualLinkNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        DualLinkNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -98) {
            this.iterator();
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.sentinel.secondaryNext;
          }
          if (var3 != this.sentinel) {
            this.cursor = var3.secondaryNext;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.cursor = null;
          stackIn_7_0 = null;
          return (DualLinkNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vh.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final DualLinkNode first(boolean param0) {
        if (param0) {
          return (DualLinkNode) null;
        }
        return this.startAt((DualLinkNode) null, -113);
    }

    final void addLast(int param0, DualLinkNode param1) {
        if (param0 != -17569) {
          return;
        }
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary((byte) -35);
          }
          param1.secondaryNext = this.sentinel;
          param1.secondaryPrevious = this.sentinel.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode next(int param0) {
        DualLinkNode var2 = this.cursor;
        if (param0 != 8063) {
          return (DualLinkNode) null;
        }
        if (var2 != this.sentinel) {
          this.cursor = var2.secondaryNext;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    public static void clearSharedReferences(boolean param0) {
        field_c = null;
        if (!param0) {
          SecondaryNodeDeque.clearSharedReferences(true);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    SecondaryNodeDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryNext = this.sentinel;
        this.sentinel.secondaryPrevious = this.sentinel;
    }

    final DualLinkNode removeFirst(int param0) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (param0 != -7481) {
          this.cursor = (DualLinkNode) null;
          if (var2 != this.sentinel) {
            var2.unlinkSecondary((byte) -35);
            return var2;
          }
          return null;
        }
        if (var2 != this.sentinel) {
          var2.unlinkSecondary((byte) -35);
          return var2;
        }
        return null;
    }

    static {
    }
}
