/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends nl {
    static String field_I;
    static String field_H;
    static int field_L;
    static tp field_J;
    static int[] field_K;

    final void b(boolean param0) {
        this.field_E.e(0);
        if (!param0) {
            field_I = (String) null;
        }
    }

    qm(int param0, int param1, int param2, int param3, kh param4, kb param5) {
        super(param0, param1, param2, param3, param4, (qo) null);
        try {
            this.field_E = param5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= -82) {
          if (0 == param3) {
            if (this.field_k != null) {
              this.field_k.a((kb) (this), param0, -102, true, param1);
              if (-1 != (this.field_l ^ -1)) {
                if (this.field_w == 0) {
                  return;
                } else {
                  t.field_c.a(this.field_p + param1 - -this.field_w, this.field_B + param0 - -this.field_l, this.field_p + param1, -101, this.field_B + param0);
                  this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
                  t.field_c.a(58);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-1 != (this.field_l ^ -1)) {
                if (this.field_w == 0) {
                  return;
                } else {
                  t.field_c.a(this.field_p + param1 - -this.field_w, this.field_B + param0 - -this.field_l, this.field_p + param1, -101, this.field_B + param0);
                  this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
                  t.field_c.a(58);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (-1 != (this.field_l ^ -1)) {
              if (this.field_w == 0) {
                return;
              } else {
                t.field_c.a(this.field_p + param1 - -this.field_w, this.field_B + param0 - -this.field_l, this.field_p + param1, -101, this.field_B + param0);
                this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
                t.field_c.a(58);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                field_J = (tp) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.b(1, param1, param5, param0, param2)) {
                  break L3;
                } else {
                  if (!super.a(param0, param1, param2, 127, param4, param5, param6)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("qm.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void j(int param0) {
        field_H = null;
        if (param0 < 38) {
          field_K = (int[]) null;
          field_J = null;
          field_I = null;
          field_K = null;
          return;
        } else {
          field_J = null;
          field_I = null;
          field_K = null;
          return;
        }
    }

    static {
        field_I = "Map size: ";
        field_L = 0;
        field_H = "This game has started.";
    }
}
