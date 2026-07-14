/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private static byte[] field_g;
    private od field_d;
    private int[] field_f;
    int[] field_h;
    private int[] field_b;
    private long field_e;
    int field_i;
    private int[] field_a;
    private int field_c;

    final boolean e() {
        int var2 = 0;
        int var1 = ((rl) this).field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((rl) this).field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((rl) this).field_d.field_h[((rl) this).field_d.field_j];
          if (var2 >= 0) {
            var2 = ((rl) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((rl) this).field_b[param0] = var2;
            ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + 1;
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
          var3 = ((rl) this).field_d.c((byte) 58);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((rl) this).field_d.field_h[((rl) this).field_d.field_j] & 255;
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
              ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + 1;
              ((rl) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + var3;
        return 0;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((rl) this).field_d.field_h = param0;
        ((rl) this).field_d.field_j = 10;
        int var2 = ((rl) this).field_d.j(-788751192);
        ((rl) this).field_i = ((rl) this).field_d.j(-788751192);
        ((rl) this).field_c = 500000;
        ((rl) this).field_f = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((rl) this).field_d.h(-79);
            var5 = ((rl) this).field_d.h(62);
            if (var4 == 1297379947) {
                ((rl) this).field_f[var3] = ((rl) this).field_d.field_j;
                var3++;
            }
            ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + var5;
        }
        ((rl) this).field_e = 0L;
        ((rl) this).field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((rl) this).field_a[var6] = ((rl) this).field_f[var6];
            var6++;
        }
        ((rl) this).field_h = new int[var2];
        ((rl) this).field_b = new int[var2];
    }

    final void b() {
        ((rl) this).field_d.field_j = -1;
    }

    final int c() {
        return ((rl) this).field_a.length;
    }

    final int b(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final int d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((rl) this).field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((rl) this).field_a[var4] >= 0) {
              if (((rl) this).field_h[var4] < var3) {
                var2 = var4;
                var3 = ((rl) this).field_h[var4];
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

    final void a(long param0) {
        int var4 = 0;
        ((rl) this).field_e = param0;
        int var3 = ((rl) this).field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((rl) this).field_h[var4] = 0;
            ((rl) this).field_b[var4] = 0;
            ((rl) this).field_d.field_j = ((rl) this).field_f[var4];
            ((rl) this).e(var4);
            ((rl) this).field_a[var4] = ((rl) this).field_d.field_j;
        }
    }

    public static void f() {
        field_g = null;
    }

    final void a() {
        ((rl) this).field_d.field_h = null;
        ((rl) this).field_f = null;
        ((rl) this).field_a = null;
        ((rl) this).field_h = null;
        ((rl) this).field_b = null;
    }

    final void f(int param0) {
        ((rl) this).field_d.field_j = ((rl) this).field_a[param0];
    }

    final long d(int param0) {
        return ((rl) this).field_e + (long)param0 * (long)((rl) this).field_c;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((rl) this).field_d.l(31760);
            var4 = ((rl) this).field_d.c((byte) 58);
            if (var3 == 47) {
                ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((rl) this).field_d.g(-1);
                var4 -= 3;
                var6 = ((rl) this).field_h[param0];
                ((rl) this).field_e = ((rl) this).field_e + (long)var6 * (long)(((rl) this).field_c - var5);
                ((rl) this).field_c = var5;
                ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + var4;
                return 2;
            }
            ((rl) this).field_d.field_j = ((rl) this).field_d.field_j + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((rl) this).field_d.l(31760) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((rl) this).field_d.l(31760) << 16;
        }
        return var4;
    }

    final void e(int param0) {
        int var2 = ((rl) this).field_d.c((byte) 58);
        ((rl) this).field_h[param0] = ((rl) this).field_h[param0] + var2;
    }

    final boolean g() {
        return ((rl) this).field_d.field_h != null;
    }

    final void c(int param0) {
        ((rl) this).field_a[param0] = ((rl) this).field_d.field_j;
    }

    rl() {
        ((rl) this).field_d = new od((byte[]) null);
    }

    rl(byte[] param0) {
        ((rl) this).field_d = new od((byte[]) null);
        ((rl) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
