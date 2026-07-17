/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends kj {
    private int field_f;

    final static void a(int param0, ht param1, java.awt.Frame param2) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param2, false);
              L2: while (true) {
                if (var3.field_f != 0) {
                  if (var3.field_f == 1) {
                    if (param0 < -84) {
                      param2.setVisible(false);
                      param2.dispose();
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    gda.a(false, 100L);
                    continue L1;
                  }
                } else {
                  gda.a(false, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("gv.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((gv) this).a(-85, true, -42);
        }
    }

    gv(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        int fieldTemp$2 = ((gv) this).field_f + 1;
        ((gv) this).field_f = ((gv) this).field_f + 1;
        if (fieldTemp$2 >= 60) {
          return true;
        } else {
          if (param0 <= 21) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (((gv) this).field_f >= 10) {
          if (30 >= ((gv) this).field_f) {
            gha.field_h.a(-128 + param2, param0 - 64);
            if (!param1) {
              boolean discarded$8 = ((gv) this).b(-37);
              return;
            } else {
              return;
            }
          } else {
            if ((2 & ((gv) this).field_f) != 0) {
              if (!param1) {
                boolean discarded$9 = ((gv) this).b(-37);
                return;
              } else {
                return;
              }
            } else {
              gha.field_h.a(-128 + param2, -64 + param0, 128);
              if (param1) {
                return;
              } else {
                boolean discarded$10 = ((gv) this).b(-37);
                return;
              }
            }
          }
        } else {
          var4 = (int)((double)param0 / 10.0) * ((gv) this).field_f;
          gha.field_h.a(-128 + param2, var4 + -64);
          if (param1) {
            return;
          } else {
            boolean discarded$11 = ((gv) this).b(-37);
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
    }
}
