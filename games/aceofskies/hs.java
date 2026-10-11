/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hs implements Iterable {
    wt field_c;
    private wt field_b;
    static int[] field_a;

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        }
        hs.a(true, -18, 122);
        return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
    }

    final void a(wt param0, byte param1) {
        try {
          if (null != param0.field_f) {
            param0.d(-114);
          }
          param0.field_j = this.field_c;
          param0.field_f = this.field_c.field_f;
          param0.field_f.field_j = param0;
          int var3_int = 43 % ((-3 - param1) / 51);
          param0.field_j.field_f = param0;
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

    final wt a(boolean param0) {
        wt var2 = this.field_b;
        if (var2 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_j;
        if (param0) {
          return var2;
        }
        return (wt) null;
    }

    private final wt a(wt param0, int param1) {
        wt var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wt stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 128) {
            this.field_c = (wt) null;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.field_j;
          }
          if (this.field_c == var3) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (wt) (stackIn_8_0);
          }
          this.field_b = var3.field_j;
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

    final wt a(int param0) {
        int var2 = -23 / ((param0 + 5) / 45);
        return this.a((wt) null, 128);
    }

    final wt b(boolean param0) {
        wt var2 = this.field_c.field_j;
        if (var2 == this.field_c) {
          return null;
        }
        var2.d(-119);
        if (!param0) {
          return var2;
        }
        return (wt) null;
    }

    hs() {
        this.field_c = new wt();
        this.field_c.field_j = this.field_c;
        this.field_c.field_f = this.field_c;
    }

    static {
        field_a = new int[128];
    }
}
