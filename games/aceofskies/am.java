/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private tl field_b;
    static int field_a;

    final static rh a(al param0, boolean param1) {
        RuntimeException var2 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = -84;
                break L1;
              }
            }
            stackIn_3_0 = w.a(-23159, su.a(param0, 100, 96));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("am.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0) {
        if (param0) {
          if (this.field_b != null) {
            this.field_b.a(4665);
            return;
          } else {
            return;
          }
        } else {
          this.field_b = (tl) null;
          if (this.field_b == null) {
            return;
          } else {
            this.field_b.a(4665);
            return;
          }
        }
    }

    am(boolean param0) {
    }

    static {
    }
}
