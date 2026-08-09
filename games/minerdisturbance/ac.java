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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (cn.a(param3, 258, param2, param1)) {
              if (param0 == 23917) {
                stackIn_7_0 = mk.a(119);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (ln) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ac.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
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
