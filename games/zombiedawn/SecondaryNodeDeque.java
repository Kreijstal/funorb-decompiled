/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static int field_d;
    static Font field_a;
    DualLinkNode field_c;
    static String[] field_b;

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -102) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8099) {
            field_b = (String[]) null;
          }
          stackIn_3_0 = ij.a(param1, param2, (byte) 108, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ii.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = this.field_c.secondaryNext;
        if (param0 < 46) {
          field_d = 104;
          if (var2 != this.field_c) {
            var2.unlinkSecondary((byte) -34);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_c) {
          var2.unlinkSecondary((byte) -34);
          return var2;
        }
        return null;
    }

    final void a(int param0, DualLinkNode param1) {
        try {
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary((byte) -12);
          }
          param1.secondaryNext = this.field_c;
          param1.secondaryPrevious = this.field_c.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          if (param0 != 0) {
            byte[] var4 = (byte[]) null;
            SecondaryNodeDeque.a(-82, 33, (byte[]) null);
          }
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private SecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
