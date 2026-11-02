/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    DualLinkNode field_f;
    static kb field_e;
    static String field_d;
    static java.applet.Applet field_c;
    static nj field_b;
    static String field_a;

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 == -61) {
          field_a = null;
          field_c = null;
          return;
        }
        field_a = (String) null;
        field_a = null;
        field_c = null;
    }

    final static o[] a(da param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.c(91, param3);
          var5 = param0.a(param2, -1, var4_int);
          if (param1 != -18362) {
            SecondaryNodeDeque.b((byte) -114);
          }
          stackIn_3_0 = SecondaryNodeDeque.a(param0, param1 - 6521, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ik.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        lc var4 = null;
        fj var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = (lc) (hc.field_a.a((byte) 51));
          while (var4 != null) {
            ud.a((byte) -109, var4, param0);
            var4 = (lc) (hc.field_a.b(param1 - 18934));
          }
          if (param1 != 18897) {
            field_c = (java.applet.Applet) null;
          }
          var5 = (fj) (ti.field_b.a((byte) 51));
          while (var5 != null) {
            h.a(param0, var5, (byte) 78);
            var5 = (fj) (ti.field_b.b(param1 ^ -18853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ik.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final static o[] a(da param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        o[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -24883) {
            SecondaryNodeDeque.b((byte) -114);
          }
          if (l.a(param1 ^ -24921, param2, param3, param0)) {
            stackIn_6_0 = fi.b(255);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (o[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ik.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, DualLinkNode param1) {
        try {
          if (null != param1.secondaryNext) {
            param1.unlinkSecondary(97);
          }
          param1.secondaryPrevious = this.field_f;
          int var3_int = -27 / ((-58 - param0) / 51);
          param1.secondaryNext = this.field_f.secondaryNext;
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryPrevious.secondaryNext = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ik.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_f.secondaryPrevious;
        if (this.field_f == var2) {
          return null;
        }
        if (param0 <= -105) {
          var2.unlinkSecondary(97);
          return var2;
        }
        DualLinkNode var3 = (DualLinkNode) null;
        this.a(-40, (DualLinkNode) null);
        var2.unlinkSecondary(97);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    private SecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new kb();
        field_d = "To Customer Support";
        field_a = "Password is valid";
    }
}
