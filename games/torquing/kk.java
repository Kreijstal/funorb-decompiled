/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends lf {
    static t field_o;
    uh field_r;
    static t field_n;
    private int[] field_p;
    static String field_q;

    final int a() {
        return 0;
    }

    final lf b() {
        return null;
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 != 160) {
            return;
        }
        field_q = null;
        field_o = null;
    }

    final lf c() {
        return (lf) ((Object) this.field_r);
    }

    final int d() {
        return 255 * on.field_c / 160;
    }

    final void a(int param0) {
        this.field_r.a(param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (!pi.field_r) {
                stackIn_4_0 = param2;
                break L1;
              } else {
                stackIn_4_0 = param2 << -1862505791;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = stackIn_4_0;
                if (this.field_p == null) {
                  break L3;
                } else {
                  if (var4_int <= this.field_p.length) {
                    dk.a(this.field_p, 0, var4_int);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_p = new int[var4_int];
              break L2;
            }
            L4: {
              this.field_r.b(this.field_p, 0, param2);
              if (!pi.field_r) {
                break L4;
              } else {
                param1 = param1 << 1;
                break L4;
              }
            }
            var5 = 0;
            L5: while (true) {
              if (var4_int <= var5) {
                break L0;
              } else {
                incrementValue$0 = param1;
                param1++;
                incrementValue$1 = var5;
                var5++;
                param0[incrementValue$0] = param0[incrementValue$0] + on.field_c * this.field_p[incrementValue$1] / 160;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("kk.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    kk() {
        this.field_r = new uh();
    }

    static {
        field_q = "Click to skip this page";
    }
}
