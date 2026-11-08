/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static String field_d;
    private DualLinkNode field_b;
    static String field_a;
    static int field_e;
    private DualLinkNode field_c;
    static int field_g;
    private SecondaryNodeDeque field_h;
    static String field_f;
    static ho field_i;

    public final void remove() {
        if (null == this.field_b) {
          throw new IllegalStateException();
        }
        this.field_b.unlinkSecondary((byte) 88);
        this.field_b = null;
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 20) {
          return;
        }
        field_f = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (var1 != this.field_h.field_g) {
          this.field_c = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.field_c = null;
          var1 = null;
        }
        this.field_b = (DualLinkNode) (var1);
        return var1;
    }

    final static void closeFullscreenFrame(int param0, PlatformTaskDispatcher param1, java.awt.Frame param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != 100) {
            return;
          }
          while (true) {
            var3 = param1.queueFrameClose(param2, 6);
            while (var3.field_e == 0) {
              ao.sleepMillis(10L, 1);
            }
            if (var3.field_e != 1) {
              ao.sleepMillis(100L, 1);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        return this.field_c != this.field_h.field_g;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_b = null;
        try {
          this.field_h = param0;
          this.field_b = null;
          this.field_c = this.field_h.field_g.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_a = "Enter name of player to add to list";
        field_d = "Book of Frost";
        field_f = "Asking to join <%0>'s game...";
    }
}
