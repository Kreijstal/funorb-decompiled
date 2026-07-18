/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static ed[] field_a;
    static qh field_b;

    public static void b() {
        field_b = null;
        field_a = null;
    }

    final static boolean a() {
        return af.field_e.a(false);
    }

    final static ed[] a(boolean param0, qh[] param1) {
        RuntimeException var2 = null;
        ed[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        ed[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed[] stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (nm.a((byte) -73, param1)) {
              var3 = new ed[param1.length];
              var4 = 0;
              L1: while (true) {
                if (var4 >= param1.length) {
                  stackOut_9_0 = (ed[]) var3;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var3[var4] = param1[var4].b(94);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ed[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("tk.D(").append(false).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        qd var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var5 = (qd) (Object) mi.field_l.a(false);
            var3 = 57;
            L1: while (true) {
              if (var5 == null) {
                var2 = bc.field_b.a(false);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    km.a(4, 122);
                    var2 = bc.field_b.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                int discarded$4 = 1;
                int discarded$5 = 4;
                sm.a(var5);
                var5 = (qd) (Object) mi.field_l.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "tk.A(" + 26 + ',' + 4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed[7];
    }
}
