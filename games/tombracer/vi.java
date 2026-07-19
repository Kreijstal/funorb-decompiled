/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private vna field_b;
    static int field_a;

    final void a(int param0) {
        boolean discarded$2 = false;
        tt var3 = null;
        if (param0 != 0) {
          var3 = (tt) null;
          discarded$2 = this.a((byte) 62, (tt) null);
          this.field_b.d(param0 ^ 8);
          return;
        } else {
          this.field_b.d(param0 ^ 8);
          return;
        }
    }

    final tt a(boolean param0) {
        if (param0) {
          if (this.field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) ((Object) this.field_b.c(-113));
          }
        } else {
          this.field_b = (vna) null;
          if (this.field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) ((Object) this.field_b.c(-113));
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
            this.field_b.b((byte) -110, param1);
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return this.field_b.a((byte) -16);
    }

    final int a(byte param0, int param1) {
        int discarded$3 = 0;
        int var3 = 0;
        tt var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_16_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 >= 21) {
          var4 = (tt) ((Object) this.field_b.f(-80));
          L0: while (true) {
            L1: {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  stackOut_4_0 = var4.a(false, param1);
                  stackIn_9_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (!stackIn_5_0) {
                        break L3;
                      } else {
                        var3++;
                        break L3;
                      }
                    }
                    var4 = (tt) ((Object) this.field_b.e(107));
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_8_0 = var3;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
            return stackIn_9_0;
          }
        } else {
          discarded$3 = this.a((byte) 71, -82);
          var4 = (tt) ((Object) this.field_b.f(-80));
          L4: while (true) {
            L5: {
              L6: {
                if (var4 == null) {
                  break L6;
                } else {
                  stackOut_12_0 = var4.a(false, param1);
                  stackIn_17_0 = stackOut_12_0 ? 1 : 0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var5 != 0) {
                    break L5;
                  } else {
                    L7: {
                      if (!stackIn_13_0) {
                        break L7;
                      } else {
                        var3++;
                        break L7;
                      }
                    }
                    var4 = (tt) ((Object) this.field_b.e(107));
                    if (var5 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              stackOut_16_0 = var3;
              stackIn_17_0 = stackOut_16_0;
              break L5;
            }
            return stackIn_17_0;
          }
        }
    }

    vi() {
        this.field_b = new vna();
    }

    static {
    }
}
