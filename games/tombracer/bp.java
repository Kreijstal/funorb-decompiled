/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends qra {
    private int field_n;
    static String field_o;
    static iu[] field_m;
    static jpa[] field_p;

    final boolean e(int param0) {
        if (param0 != -9202) {
            ((bp) this).field_n = 85;
            return false;
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (0 <= ((bp) this).field_c.e(2)) {
          L0: {
            if (param0 <= -50) {
              break L0;
            } else {
              ((bp) this).field_n = 30;
              break L0;
            }
          }
          var3 = ((bp) this).field_h.l(100);
          var4 = 160;
          var5 = 80 + ((bp) this).field_c.field_H.length * 20;
          var6 = 16776960;
          var7 = 11184810;
          rba.a(192, var5, 3145728, 340, (byte) 39, var4, 150);
          tp.a(150, (byte) -85, var4, 5242880, 2, var5, 340);
          var8 = var4 + 28;
          oka.a(gl.a((byte) 113, ru.field_a, new String[1]).toUpperCase(), 16777215, eda.field_f, -1, var8, 320, 0);
          var8 += 40;
          oka.a(nsa.field_f + ":", 16777215, kn.field_p, -1, var8, 320, 0);
          var8 += 20;
          var9 = 0;
          L1: while (true) {
            if (var9 >= ((bp) this).field_c.field_H.length) {
              return;
            } else {
              if (((bp) this).field_c.field_H[var9] != null) {
                L2: {
                  if (var3 == var9) {
                    var10 = var6;
                    break L2;
                  } else {
                    var10 = var7;
                    break L2;
                  }
                }
                oka.a(((bp) this).field_h.a(var9, false).toUpperCase() + ": " + ((bp) this).field_c.field_v[var9], var10, kn.field_p, -1, var8, 320, 0);
                var8 += 20;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != 0) {
            bp.f(69);
        }
        field_p = null;
        field_m = null;
    }

    bp(qh param0, v param1) {
        super(param0, param1);
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((bp) this).field_n = 200;
        try {
          L0: {
            L1: {
              if (((bp) this).field_c.field_K == 1) {
                ((bp) this).field_h.a((me) (Object) new gi(((bp) this).field_h), 680);
                break L1;
              } else {
                ((bp) this).field_c.field_e.a(false);
                ((bp) this).field_h.a((me) (Object) new gu(((bp) this).field_h), 680);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bp.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
            ((bp) this).a(68, false);
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 80) {
            boolean discarded$0 = ((bp) this).a('￦', 110, -67);
        }
        if (0 >= ((bp) this).field_n) {
        } else {
            ((bp) this).field_n = ((bp) this).field_n - 1;
            if (((bp) this).field_n == 0) {
                var3 = ((bp) this).field_c.b((byte) 98);
                if (-1 != var3) {
                    ((bp) this).field_h.i(var3, 85);
                } else {
                    ((bp) this).field_h.m((byte) -115);
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Choosing Now";
    }
}
