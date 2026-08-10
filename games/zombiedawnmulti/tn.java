/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qc {
    static int field_z;
    int field_D;
    byte field_B;
    static th field_C;
    static tq field_A;
    k field_y;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 62 % ((43 - param1) / 53);
            if (fn.field_i < 10) {
              L1: {
                var4 = 0;
                if (cj.field_ub) {
                  cj.field_ub = false;
                  var4 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              ip.a(tg.b(8218), af.field_b, var4 != 0, cj.g(18006), 34);
              break L0;
            } else {
              if (!gb.a(250)) {
                oo.b();
                eh.a(320, 240, 122);
                t.a(false, 0, param2, 0);
                return;
              } else {
                if (a.field_b == 0) {
                  ec.a(false, param0, -126);
                  t.a(false, 0, param2, 0);
                  return;
                } else {
                  ra.a(param2, -113);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("tn.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final int f(int param0) {
        java.awt.Canvas var3;
        if (this.field_y != null) {
          if (param0 != 100) {
            var3 = (java.awt.Canvas) null;
            tn.a(true, 113, (java.awt.Canvas) null);
            return 100 * this.field_y.field_j / (this.field_y.field_m.length + -this.field_B);
          } else {
            return 100 * this.field_y.field_j / (this.field_y.field_m.length + -this.field_B);
          }
        } else {
          return 0;
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 != 0) {
            field_C = (th) null;
            field_C = null;
            return;
        }
        field_C = null;
    }

    final byte[] e(int param0) {
        if (!this.field_t) {
          if (this.field_y.field_m.length - this.field_B <= this.field_y.field_j) {
            if (param0 != 0) {
              field_C = (th) null;
              return this.field_y.field_m;
            } else {
              return this.field_y.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static boolean a(String param0, long param1, byte param2, int param3, int[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = -63 / ((param2 - -32) / 42);
                if (param4 == null) {
                  break L2;
                } else {
                  L3: {
                    if (2 != param3) {
                      break L3;
                    } else {
                      if (!pd.a(param1, param0, 2)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              stackIn_6_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("tn.L(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    tn() {
    }

    static {
        field_z = -1;
    }
}
