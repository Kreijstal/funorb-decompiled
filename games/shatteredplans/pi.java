/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    private static byte[] field_g;
    private ob field_i;
    int field_e;
    int[] field_b;
    private int[] field_h;
    private int[] field_c;
    private int[] field_d;
    private long field_f;
    private int field_a;

    final boolean a() {
        int var2 = 0;
        int var1 = ((pi) this).field_h.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((pi) this).field_h[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int a(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((pi) this).field_f = param0;
        int var3 = ((pi) this).field_h.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((pi) this).field_b[var4] = 0;
            ((pi) this).field_d[var4] = 0;
            ((pi) this).field_i.field_j = ((pi) this).field_c[var4];
            ((pi) this).d(var4);
            ((pi) this).field_h[var4] = ((pi) this).field_i.field_j;
        }
    }

    final long c(int param0) {
        return ((pi) this).field_f + (long)param0 * (long)((pi) this).field_a;
    }

    public static void b() {
        field_g = null;
    }

    final void b(int param0) {
        ((pi) this).field_i.field_j = ((pi) this).field_h[param0];
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((pi) this).field_i.j(-82);
            var4 = ((pi) this).field_i.c(false);
            if (var3 == 47) {
                ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((pi) this).field_i.k(255);
                var4 -= 3;
                var6 = ((pi) this).field_b[param0];
                ((pi) this).field_f = ((pi) this).field_f + (long)var6 * (long)(((pi) this).field_a - var5);
                ((pi) this).field_a = var5;
                ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + var4;
                return 2;
            }
            ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((pi) this).field_i.j(-71) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((pi) this).field_i.j(-79) << 16;
        }
        return var4;
    }

    final int g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((pi) this).field_h.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((pi) this).field_h[var4] >= 0) {
              if (((pi) this).field_b[var4] < var3) {
                var2 = var4;
                var3 = ((pi) this).field_b[var4];
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

    final void e() {
        ((pi) this).field_i.field_j = -1;
    }

    final void e(int param0) {
        ((pi) this).field_h[param0] = ((pi) this).field_i.field_j;
    }

    final int c() {
        return ((pi) this).field_h.length;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((pi) this).field_i.field_h[((pi) this).field_i.field_j];
          if (var2 >= 0) {
            var2 = ((pi) this).field_d[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((pi) this).field_d[param0] = var2;
            ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + 1;
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
          var3 = ((pi) this).field_i.c(false);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((pi) this).field_i.field_h[((pi) this).field_i.field_j] & 255;
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
              ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + 1;
              ((pi) this).field_d[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + var3;
        return 0;
    }

    final void d() {
        ((pi) this).field_i.field_h = null;
        ((pi) this).field_c = null;
        ((pi) this).field_h = null;
        ((pi) this).field_b = null;
        ((pi) this).field_d = null;
    }

    final boolean f() {
        return ((pi) this).field_i.field_h != null;
    }

    final void d(int param0) {
        int var2 = ((pi) this).field_i.c(false);
        ((pi) this).field_b[param0] = ((pi) this).field_b[param0] + var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((pi) this).field_i.field_h = param0;
        ((pi) this).field_i.field_j = 10;
        int var2 = ((pi) this).field_i.f(-20976);
        ((pi) this).field_e = ((pi) this).field_i.f(-20976);
        ((pi) this).field_a = 500000;
        ((pi) this).field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((pi) this).field_i.a(16711680);
            var5 = ((pi) this).field_i.a(16711680);
            if (var4 == 1297379947) {
                ((pi) this).field_c[var3] = ((pi) this).field_i.field_j;
                var3++;
            }
            ((pi) this).field_i.field_j = ((pi) this).field_i.field_j + var5;
        }
        ((pi) this).field_f = 0L;
        ((pi) this).field_h = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((pi) this).field_h[var6] = ((pi) this).field_c[var6];
            var6++;
        }
        ((pi) this).field_b = new int[var2];
        ((pi) this).field_d = new int[var2];
    }

    pi() {
        ((pi) this).field_i = new ob((byte[]) null);
    }

    pi(byte[] param0) {
        ((pi) this).field_i = new ob((byte[]) null);
        ((pi) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
