/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    private static byte[] field_i;
    private sb field_h;
    private int[] field_c;
    int field_g;
    int[] field_b;
    private int[] field_a;
    private long field_f;
    private int[] field_e;
    private int field_d;

    final int a(long param0) {
        long var3 = param0 - ((nl) this).field_f;
        return (int)((var3 + (long)((nl) this).field_d - 1L) / (long)((nl) this).field_d);
    }

    final int c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((nl) this).field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((nl) this).field_a[var4] >= 0) {
              if (((nl) this).field_b[var4] < var3) {
                var2 = var4;
                var3 = ((nl) this).field_b[var4];
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((nl) this).field_h.field_u = param0;
        ((nl) this).field_h.field_o = 10;
        int var2 = ((nl) this).field_h.e(-110);
        ((nl) this).field_g = ((nl) this).field_h.e(-107);
        ((nl) this).field_d = 500000;
        ((nl) this).field_e = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((nl) this).field_h.b((byte) 28);
            var5 = ((nl) this).field_h.b((byte) 15);
            if (var4 == 1297379947) {
                ((nl) this).field_e[var3] = ((nl) this).field_h.field_o;
                var3++;
            }
            ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + var5;
        }
        ((nl) this).field_f = 0L;
        ((nl) this).field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((nl) this).field_a[var6] = ((nl) this).field_e[var6];
            var6++;
        }
        ((nl) this).field_b = new int[var2];
        ((nl) this).field_c = new int[var2];
    }

    final void d() {
        ((nl) this).field_h.field_o = -1;
    }

    final boolean a() {
        int var2 = 0;
        int var1 = ((nl) this).field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((nl) this).field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void e(int param0) {
        int var2 = ((nl) this).field_h.k(8);
        ((nl) this).field_b[param0] = ((nl) this).field_b[param0] + var2;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((nl) this).field_h.d((byte) -54);
            var4 = ((nl) this).field_h.k(8);
            if (var3 == 47) {
                ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((nl) this).field_h.i(71);
                var4 -= 3;
                var6 = ((nl) this).field_b[param0];
                ((nl) this).field_f = ((nl) this).field_f + (long)var6 * (long)(((nl) this).field_d - var5);
                ((nl) this).field_d = var5;
                ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + var4;
                return 2;
            }
            ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + var4;
            return 3;
        }
        var3 = field_i[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((nl) this).field_h.d((byte) -54) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((nl) this).field_h.d((byte) -54) << 16;
        }
        return var4;
    }

    final void b(long param0) {
        int var4 = 0;
        ((nl) this).field_f = param0;
        int var3 = ((nl) this).field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((nl) this).field_b[var4] = 0;
            ((nl) this).field_c[var4] = 0;
            ((nl) this).field_h.field_o = ((nl) this).field_e[var4];
            ((nl) this).e(var4);
            ((nl) this).field_a[var4] = ((nl) this).field_h.field_o;
        }
    }

    final int d(int param0) {
        int var2 = this.c(param0);
        return var2;
    }

    final long f(int param0) {
        return ((nl) this).field_f + (long)param0 * (long)((nl) this).field_d;
    }

    private final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((nl) this).field_h.field_u[((nl) this).field_h.field_o];
          if (var2 >= 0) {
            var2 = ((nl) this).field_c[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((nl) this).field_c[param0] = var2;
            ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + 1;
            break L0;
          }
        }
        L1: {
          if (var2 == 240) {
            break L1;
          } else {
            if (var2 != 247) {
              return this.a(param0, var2);
            } else {
              break L1;
            }
          }
        }
        L2: {
          var3 = ((nl) this).field_h.k(8);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((nl) this).field_h.field_u[((nl) this).field_h.field_o] & 255;
                  if (var4 < 241) {
                    break L4;
                  } else {
                    if (var4 <= 243) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var4 == 246) {
                  break L3;
                } else {
                  if (var4 == 248) {
                    break L3;
                  } else {
                    L5: {
                      if (var4 < 250) {
                        break L5;
                      } else {
                        if (var4 <= 252) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var4 != 254) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + 1;
              ((nl) this).field_c[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((nl) this).field_h.field_o = ((nl) this).field_h.field_o + var3;
        return 0;
    }

    final void a(int param0) {
        ((nl) this).field_h.field_o = ((nl) this).field_a[param0];
    }

    final void f() {
        ((nl) this).field_h.field_u = null;
        ((nl) this).field_e = null;
        ((nl) this).field_a = null;
        ((nl) this).field_b = null;
        ((nl) this).field_c = null;
    }

    final int g() {
        return ((nl) this).field_a.length;
    }

    public static void b() {
        field_i = null;
    }

    final boolean e() {
        return ((nl) this).field_h.field_u != null;
    }

    final void b(int param0) {
        ((nl) this).field_a[param0] = ((nl) this).field_h.field_o;
    }

    nl() {
        ((nl) this).field_h = new sb((byte[]) null);
    }

    nl(byte[] param0) {
        ((nl) this).field_h = new sb((byte[]) null);
        ((nl) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
