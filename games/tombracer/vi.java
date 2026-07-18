/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private vna field_b;
    static int field_a;

    final void a(int param0) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          boolean discarded$2 = ((vi) this).a((byte) 62, (tt) null);
          ((vi) this).field_b.d(param0 ^ 8);
          return;
        } else {
          ((vi) this).field_b.d(param0 ^ 8);
          return;
        }
    }

    final tt a(boolean param0) {
        if (param0) {
          if (((vi) this).field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) (Object) ((vi) this).field_b.c(-113);
          }
        } else {
          ((vi) this).field_b = null;
          if (((vi) this).field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) (Object) ((vi) this).field_b.c(-113);
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0, tt param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((vi) this).field_b.b((byte) -110, (vg) (Object) param1);
            if (param0 > 9) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_a = 94;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return ((vi) this).field_b.a((byte) -16);
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        tt var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 >= 21) {
          var4 = (tt) (Object) ((vi) this).field_b.f(-80);
          L0: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L1: {
                if (!var4.a(false, param1)) {
                  break L1;
                } else {
                  var3++;
                  break L1;
                }
              }
              var4 = (tt) (Object) ((vi) this).field_b.e(107);
              continue L0;
            }
          }
        } else {
          int discarded$3 = ((vi) this).a((byte) 71, -82);
          var4 = (tt) (Object) ((vi) this).field_b.f(-80);
          L2: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L3: {
                if (!var4.a(false, param1)) {
                  break L3;
                } else {
                  var3++;
                  break L3;
                }
              }
              var4 = (tt) (Object) ((vi) this).field_b.e(107);
              continue L2;
            }
          }
        }
    }

    vi() {
        ((vi) this).field_b = new vna();
    }

    static {
    }
}
