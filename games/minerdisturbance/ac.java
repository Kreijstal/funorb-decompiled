/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static int field_b;
    private ea[] field_a;

    final static void a(byte param0) {
        if (param0 != -116) {
          ac.a((byte) 39);
          mk.a(false, al.field_s, 0);
          return;
        }
        mk.a(false, al.field_s, 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        g.a(param1, param0, param4, param2, (byte) 36, this.field_a);
        if (param3 != 26202) {
          bj var7 = (bj) null;
          ac.a(-113, (bj) null, 32, -45);
        }
    }

    final static ln a(int param0, bj param1, int param2, int param3) {
        RuntimeException var4 = null;
        ln stackIn_5_0 = null;
        ln stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cn.a(param3, 258, param2, param1)) {
            return null;
          }
          if (param0 == 23917) {
            stackIn_7_0 = mk.a(119);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ln) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ac.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ac(ea[] param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ac.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
