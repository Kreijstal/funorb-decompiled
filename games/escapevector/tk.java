/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static ed[] field_a;
    static qh field_b;

    public static void b(int param0) {
        ed[] discarded$0 = null;
        if (param0 != 31167) {
            qh[] var2 = (qh[]) null;
            discarded$0 = tk.a(false, (qh[]) null);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 23403) {
            tk.b(-66);
        }
        return af.field_e.a(false);
    }

    final static ed[] a(boolean param0, qh[] param1) {
        RuntimeException var2 = null;
        ed[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        ed[] stackIn_6_0 = null;
        ed[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ed[] stackOut_10_0 = null;
        ed[] stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (nm.a((byte) -73, param1)) {
              var3 = new ed[param1.length];
              if (!param0) {
                var4 = 0;
                L1: while (true) {
                  if (var4 >= param1.length) {
                    stackOut_10_0 = (ed[]) (var3);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3[var4] = param1[var4].b(94);
                    var4++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = (ed[]) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ed[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_11_0;
          }
        }
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
            var5 = (qd) ((Object) mi.field_l.a(false));
            var3 = -57 / ((-46 - param0) / 51);
            L1: while (true) {
              if (var5 == null) {
                var2 = bc.field_b.a(false);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    km.a(param1, 122);
                    var2 = bc.field_b.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                sm.a(var5, param1, true);
                var5 = (qd) ((Object) mi.field_l.b((byte) 70));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "tk.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new ed[7];
    }
}
