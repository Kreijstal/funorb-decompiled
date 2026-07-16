/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends lm {
    int[] field_u;
    static int[] field_w;
    private int[][] field_B;
    private String[] field_y;
    private int[] field_x;
    static int[] field_z;
    static oh field_v;
    static vj field_t;
    static String field_A;

    final void a(int param0, we param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -5) {
            kp.b((byte) -35);
        }
        while (true) {
            var3 = param1.f(255);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(var3, 83, param1);
        }
    }

    private final void a(int param0, int param1, we param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          if (1 != param0) {
            if (2 == param0) {
              var4 = param2.f(255);
              ((kp) this).field_u = new int[var4];
              var5 = 0;
              L1: while (true) {
                if ((var4 ^ -1) >= (var5 ^ -1)) {
                  break L0;
                } else {
                  ((kp) this).field_u[var5] = param2.a((byte) -115);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if ((param0 ^ -1) == -4) {
                var4 = param2.f(255);
                ((kp) this).field_B = new int[var4][];
                ((kp) this).field_x = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) <= (var4 ^ -1)) {
                    break L0;
                  } else {
                    L3: {
                      var6 = param2.a((byte) 52);
                      var7 = go.a(var6, -52);
                      if (var7 == null) {
                        break L3;
                      } else {
                        ((kp) this).field_x[var5] = var6;
                        ((kp) this).field_B[var5] = new int[var7.field_e];
                        var8 = 0;
                        L4: while (true) {
                          if ((var7.field_e ^ -1) >= (var8 ^ -1)) {
                            break L3;
                          } else {
                            ((kp) this).field_B[var5][var8] = param2.a((byte) -118);
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-5 != (param0 ^ -1)) {
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            ((kp) this).field_y = dd.a(param2.h(5), (byte) -117, '<');
            break L0;
          }
        }
        var4 = -125 / ((param1 - -17) / 39);
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        if (param0 != 74) {
            kp.d((byte) -64);
        }
        if (jg.a((byte) 83)) {
            ef.field_a = true;
        } else {
            var2 = bo.a(param0 ^ 181);
            byte[] var1 = var2;
            og discarded$0 = hm.a(param0 + 41, var2, 6);
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_A = null;
        field_t = null;
        field_z = null;
        if (param0 != -58) {
            kp.b((byte) -3);
        }
        field_w = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 123) {
            ((kp) this).field_B = null;
        }
        if (!(null == ((kp) this).field_u)) {
            for (var2 = 0; ((kp) this).field_u.length > var2; var2++) {
                ((kp) this).field_u[var2] = bq.a(((kp) this).field_u[var2], 32768);
            }
        }
    }

    final static void c(byte param0) {
        int var1 = 75 / ((20 - param0) / 48);
        if (!(to.field_t == null)) {
            to.field_t.f();
        }
        if (!(ib.field_h == null)) {
            ib.field_h.f();
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((kp) this).field_y)) {
            return "";
        }
        StringBuilder discarded$8 = var5.append(((kp) this).field_y[0]);
        if (param0 != -54) {
            ((kp) this).field_B = null;
        }
        for (var3 = 1; ((kp) this).field_y.length > var3; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var5.append(((kp) this).field_y[var3]);
        }
        return var2.toString();
    }

    kp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_w = new int[32];
        field_z = new int[32];
        for (var0 = 0; field_z.length > var0; var0++) {
            field_z[var0] = 66561 * ((var0 << -78131386) / field_z.length);
        }
        for (var0 = 0; var0 < field_w.length; var0++) {
            field_w[var0] = (var0 << 1402089382) / field_w.length * 262401;
        }
        field_A = "Please check if address is correct";
    }
}
