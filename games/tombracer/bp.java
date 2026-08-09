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
            this.field_n = 85;
            return false;
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        if (0 <= this.field_c.e(2)) {
          L0: {
            if (param0 <= -50) {
              break L0;
            } else {
              this.field_n = 30;
              break L0;
            }
          }
          var3 = this.field_h.l(100);
          var4 = 160;
          var5 = 80 + this.field_c.field_H.length * 20;
          var6 = 16776960;
          var7 = 11184810;
          rba.a(192, var5, 3145728, 340, (byte) 39, var4, 150);
          tp.a(150, (byte) -85, var4, 5242880, 2, var5, 340);
          var8 = var4 + 20 + 8;
          oka.a(gl.a((byte) 113, ru.field_a, new String[]{this.field_h.a(this.field_c.e(2), false)}).toUpperCase(), 16777215, eda.field_f, -1, var8, 320, 0);
          var8 += 40;
          oka.a(nsa.field_f + ":", 16777215, kn.field_p, -1, var8, 320, 0);
          var8 += 20;
          var9 = 0;
          L1: while (true) {
            if (var9 >= this.field_c.field_H.length) {
              return;
            } else {
              if (this.field_c.field_H[var9] != null) {
                L2: {
                  if (var3 == var9) {
                    var10 = var6;
                    break L2;
                  } else {
                    var10 = var7;
                    break L2;
                  }
                }
                oka.a(this.field_h.a(var9, false).toUpperCase() + ": " + this.field_c.field_v[var9], var10, kn.field_p, -1, var8, 320, 0);
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_n = 200;
        try {
          L0: {
            L1: {
              if (-2 == (this.field_c.field_K ^ -1)) {
                this.field_h.a(new gi(this.field_h), 680);
                break L1;
              } else {
                this.field_c.field_e.a(false);
                this.field_h.a(new gu(this.field_h), 680);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bp.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
            this.a(68, false);
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 80) {
            this.a('￦', 110, -67);
        }
        if (0 >= this.field_n) {
        } else {
            this.field_n = this.field_n - 1;
            if (this.field_n == 0) {
                var3 = this.field_c.b((byte) 98);
                if (-1 != var3) {
                    this.field_h.i(var3, 85);
                } else {
                    this.field_h.m((byte) -115);
                }
            }
        }
    }

    static {
        field_o = "Choosing Now";
    }
}
