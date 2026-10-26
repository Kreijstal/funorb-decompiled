/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hs implements Iterable {
    DualLinkNode field_c;
    private DualLinkNode field_b;
    static int[] field_a;

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        }
        hs.a(true, -18, 122);
        return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
    }

    final void a(DualLinkNode param0, byte param1) {
        try {
          if (null != param0.previousSecondaryNode) {
            param0.unlinkSecondaryNode(-114);
          }
          param0.nextSecondaryNode = this.field_c;
          param0.previousSecondaryNode = this.field_c.previousSecondaryNode;
          param0.previousSecondaryNode.nextSecondaryNode = param0;
          int var3_int = 43 % ((-3 - param1) / 51);
          param0.nextSecondaryNode.previousSecondaryNode = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hs.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -127) {
          return;
        }
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new js(this));
    }

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2 = this.field_b;
        if (var2 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.nextSecondaryNode;
        if (param0) {
          return var2;
        }
        return (DualLinkNode) null;
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
          if (param1 != 128) {
            this.field_c = (DualLinkNode) null;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.nextSecondaryNode;
          }
          if (this.field_c == var3) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (DualLinkNode) (stackIn_8_0);
          }
          this.field_b = var3.nextSecondaryNode;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("hs.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final DualLinkNode a(int param0) {
        int var2 = -23 / ((param0 + 5) / 45);
        return this.a((DualLinkNode) null, 128);
    }

    final DualLinkNode b(boolean param0) {
        DualLinkNode var2 = this.field_c.nextSecondaryNode;
        if (var2 == this.field_c) {
          return null;
        }
        var2.unlinkSecondaryNode(-119);
        if (!param0) {
          return var2;
        }
        return (DualLinkNode) null;
    }

    hs() {
        this.field_c = new DualLinkNode();
        this.field_c.nextSecondaryNode = this.field_c;
        this.field_c.previousSecondaryNode = this.field_c;
    }

    static {
        field_a = new int[128];
    }
}
