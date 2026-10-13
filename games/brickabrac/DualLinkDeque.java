/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDeque implements Iterable {
    static KeyboardInput keyboardInput;
    DualLinkNode sentinel;
    static mh field_d;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          if (param0 <= 28) {
            return false;
          }
          for (var3 = 1; param1.length() > var3; var3++) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gp.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -4858) {
          DualLinkDeque.a(-58, 65, -66, 54, -73);
          if (null != bm.field_d) {
            return true;
          }
          if (s.a(-121)) {
            return true;
          }
          if (CircleBody.field_p != null) {
            return true;
          }
          if (!jg.b(true)) {
            return false;
          }
          return true;
        }
        if (null != bm.field_d) {
          return true;
        }
        if (s.a(-121)) {
          return true;
        }
        if (CircleBody.field_p != null) {
          return true;
        }
        if (!jg.b(true)) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        param4 += 2;
        param1 += 2;
        param0 -= 4;
        int var5 = Rasterizer2D.width * param1 + param4;
        int var6 = Rasterizer2D.width - param2;
        la.a(Rasterizer2D.pixels, var5, 0, 0, 0, param3, param2, param0, var6);
    }

    final void addLast(DualLinkNode node, byte obfuscationGuard) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary(3);
          }
          node.secondaryNext = this.sentinel;
          if (obfuscationGuard > -112) {
            field_d = (mh) null;
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "gp.E(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkIterator(this));
    }

    DualLinkDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    public static void b(int param0) {
        field_d = null;
        keyboardInput = null;
        if (param0 != 2) {
          DualLinkDeque.a(-125, -106, -42, 126, 57);
        }
    }

    final DualLinkNode removeFirst(boolean obfuscationGuard) {
        DualLinkNode node = this.sentinel.secondaryNext;
        if (node == this.sentinel) {
          return null;
        }
        node.unlinkSecondary(3);
        if (!obfuscationGuard) {
          return node;
        }
        DualLinkDeque.a(-105, -93, 51, -34, -59);
        return node;
    }

    final static void a(boolean param0, boolean param1) {
        if (DualLinkDeque.a(-4858)) {
          param0 = false;
        }
        oj.a(param0, (byte) 123);
        if (nf.field_V) {
          Rasterizer2D.darkenRectangle(sb.field_c.field_d.field_P, sb.field_c.field_d.field_zb, sb.field_c.field_d.field_Ib, sb.field_c.field_d.field_cb);
          sb.field_c.field_d.a(true, param0);
        }
        if (!param1) {
          IntrusiveHashTable.a(7070, param0);
          return;
        }
    }

    static {
        keyboardInput = new KeyboardInput();
    }
}
