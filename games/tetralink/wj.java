/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    private static byte[] field_i;
    private bh field_h;
    private int[] field_a;
    int[] field_g;
    private long field_c;
    int field_f;
    private int[] field_e;
    private int field_d;
    private int[] field_b;

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((wj) this).field_h.field_u = param0;
        ((wj) this).field_h.field_t = 10;
        int var2 = ((wj) this).field_h.e(127);
        ((wj) this).field_f = ((wj) this).field_h.e(127);
        ((wj) this).field_d = 500000;
        ((wj) this).field_a = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((wj) this).field_h.f(87);
            var5 = ((wj) this).field_h.f(-127);
            if (var4 == 1297379947) {
                ((wj) this).field_a[var3] = ((wj) this).field_h.field_t;
                var3++;
            }
            ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + var5;
        }
        ((wj) this).field_c = 0L;
        ((wj) this).field_e = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((wj) this).field_e[var6] = ((wj) this).field_a[var6];
            var6++;
        }
        ((wj) this).field_g = new int[var2];
        ((wj) this).field_b = new int[var2];
    }

    final long d(int param0) {
        return ((wj) this).field_c + (long)param0 * (long)((wj) this).field_d;
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((wj) this).field_h.field_u[((wj) this).field_h.field_t];
          if (var2 >= 0) {
            var2 = ((wj) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((wj) this).field_b[param0] = var2;
            ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + 1;
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
          var3 = ((wj) this).field_h.b((byte) 120);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((wj) this).field_h.field_u[((wj) this).field_h.field_t] & 255;
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
              ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + 1;
              ((wj) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + var3;
        return 0;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((wj) this).field_h.d((byte) -99);
            var4 = ((wj) this).field_h.b((byte) 120);
            if (var3 == 47) {
                ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((wj) this).field_h.d(-1);
                var4 -= 3;
                var6 = ((wj) this).field_g[param0];
                ((wj) this).field_c = ((wj) this).field_c + (long)var6 * (long)(((wj) this).field_d - var5);
                ((wj) this).field_d = var5;
                ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + var4;
                return 2;
            }
            ((wj) this).field_h.field_t = ((wj) this).field_h.field_t + var4;
            return 3;
        }
        var3 = field_i[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((wj) this).field_h.d((byte) -99) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((wj) this).field_h.d((byte) -99) << 16;
        }
        return var4;
    }

    final void b(int param0) {
        ((wj) this).field_e[param0] = ((wj) this).field_h.field_t;
    }

    final void f(int param0) {
        ((wj) this).field_h.field_t = ((wj) this).field_e[param0];
    }

    public static void b() {
        field_i = null;
    }

    final int g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((wj) this).field_e.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((wj) this).field_e[var4] >= 0) {
              if (((wj) this).field_g[var4] < var3) {
                var2 = var4;
                var3 = ((wj) this).field_g[var4];
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

    final boolean f() {
        return ((wj) this).field_h.field_u != null;
    }

    final void d() {
        ((wj) this).field_h.field_u = null;
        ((wj) this).field_a = null;
        ((wj) this).field_e = null;
        ((wj) this).field_g = null;
        ((wj) this).field_b = null;
    }

    final int e() {
        return ((wj) this).field_e.length;
    }

    final void a(long param0) {
        int var4 = 0;
        ((wj) this).field_c = param0;
        int var3 = ((wj) this).field_e.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((wj) this).field_g[var4] = 0;
            ((wj) this).field_b[var4] = 0;
            ((wj) this).field_h.field_t = ((wj) this).field_a[var4];
            ((wj) this).e(var4);
            ((wj) this).field_e[var4] = ((wj) this).field_h.field_t;
        }
    }

    final void e(int param0) {
        int var2 = ((wj) this).field_h.b((byte) 120);
        ((wj) this).field_g[param0] = ((wj) this).field_g[param0] + var2;
    }

    final void c() {
        ((wj) this).field_h.field_t = -1;
    }

    final boolean a() {
        int var2 = 0;
        int var1 = ((wj) this).field_e.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((wj) this).field_e[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int c(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    wj() {
        ((wj) this).field_h = new bh((byte[]) null);
    }

    wj(byte[] param0) {
        ((wj) this).field_h = new bh((byte[]) null);
        ((wj) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
