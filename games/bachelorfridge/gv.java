/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends kj {
    private int field_f;

    final static void a(int param0, ht param1, java.awt.Frame param2) {
        eh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param2, false);
              L2: while (true) {
                if (var3.field_f != 0) {
                  if ((var3.field_f ^ -1) == -2) {
                    if (param0 < -84) {
                      param2.setVisible(false);
                      param2.dispose();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("gv.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.a(-85, true, -42);
        }
    }

    gv(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        int fieldTemp$1 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        if ((fieldTemp$1 ^ -1) <= -61) {
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
        int var4;
        int var5;
        var5 = BachelorFridge.field_y;
        if (this.field_f >= 10) {
          if (30 >= this.field_f) {
            gha.field_h.a(-128 + param2, param0 - 64);
            if (!param1) {
              this.b(-37);
              return;
            } else {
              return;
            }
          } else {
            if ((2 & this.field_f) != 0) {
              if (!param1) {
                this.b(-37);
                return;
              } else {
                return;
              }
            } else {
              gha.field_h.a(-128 + param2, -64 + param0, 128);
              if (param1) {
                return;
              } else {
                this.b(-37);
                return;
              }
            }
          }
        } else {
          var4 = (int)((double)param0 / 10.0) * this.field_f;
          gha.field_h.a(-128 + param2, var4 + -64);
          if (param1) {
            return;
          } else {
            this.b(-37);
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
