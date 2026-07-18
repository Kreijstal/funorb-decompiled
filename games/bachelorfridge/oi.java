/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends ana {
    static js field_v;
    static sna field_w;

    private final void d(int param0) {
    }

    final static void a(int param0, kv[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              oja.field_f = param1;
              if (null == oja.field_f) {
                break L1;
              } else {
                if (3 <= param1.length) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("oi.C(").append(3).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = -107 / ((param0 - 71) / 47);
        int fieldTemp$0 = ((oi) this).field_l - 1;
        ((oi) this).field_l = ((oi) this).field_l - 1;
        if (fieldTemp$0 >= 0) {
            if (((oi) this).field_l == 25) {
                jja.a(256, -1, 48);
                int discarded$1 = 48;
                this.e();
            }
            return false;
        }
        this.d(256);
        return true;
    }

    private final void e() {
        int var2 = 0;
        int var3 = 0;
        wia var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (((oi) this).field_q.field_h.field_z <= var2) {
            return;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((oi) this).field_q.field_h.field_B) {
                var2++;
                continue L0;
              } else {
                var4 = ((oi) this).field_q.field_h.field_a[var2][var3];
                if (var4.c(-123)) {
                  ((oi) this).field_q.b(30996, var2, var3);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void f() {
        field_w = null;
        field_v = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(dg.field_i < param1 + param2)) {
            return param2;
        }
        if (!(param2 + param0 - param1 < 0)) {
            return -param1 + (param0 + param2);
        }
        if (param3 != -21264) {
            int discarded$0 = oi.a(-72, -7, -102, 104);
        }
        return dg.field_i - param1;
    }

    oi(gj param0, vba param1) {
        super(param0, (bca) (Object) param1);
    }

    static {
    }
}
