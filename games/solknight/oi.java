/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private gb field_g;
    int[] field_h;
    private int[] field_d;
    private int[] field_i;
    private static byte[] field_f;
    private long field_b;
    private int[] field_a;
    private int field_e;
    int field_c;

    final void b(int param0) {
        ((oi) this).field_d[param0] = ((oi) this).field_g.field_m;
    }

    final void a(int param0) {
        int var2 = ((oi) this).field_g.c((byte) 120);
        ((oi) this).field_h[param0] = ((oi) this).field_h[param0] + var2;
    }

    public static void c() {
        field_f = null;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = ((oi) this).field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((oi) this).field_d[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int e() {
        return ((oi) this).field_d.length;
    }

    final void d(int param0) {
        ((oi) this).field_g.field_m = ((oi) this).field_d[param0];
    }

    final void a() {
        ((oi) this).field_g.field_l = null;
        ((oi) this).field_a = null;
        ((oi) this).field_d = null;
        ((oi) this).field_h = null;
        ((oi) this).field_i = null;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((oi) this).field_g.field_l[((oi) this).field_g.field_m];
          if (var2 >= 0) {
            var2 = ((oi) this).field_i[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((oi) this).field_i[param0] = var2;
            ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + 1;
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
          var3 = ((oi) this).field_g.c((byte) 120);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((oi) this).field_g.field_l[((oi) this).field_g.field_m] & 255;
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
              ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + 1;
              ((oi) this).field_i[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + var3;
        return 0;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((oi) this).field_g.j(255);
            var4 = ((oi) this).field_g.c((byte) 120);
            if (var3 == 47) {
                ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((oi) this).field_g.b(false);
                var4 -= 3;
                var6 = ((oi) this).field_h[param0];
                ((oi) this).field_b = ((oi) this).field_b + (long)var6 * (long)(((oi) this).field_e - var5);
                ((oi) this).field_e = var5;
                ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + var4;
                return 2;
            }
            ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((oi) this).field_g.j(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((oi) this).field_g.j(255) << 16;
        }
        return var4;
    }

    final void b() {
        ((oi) this).field_g.field_m = -1;
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((oi) this).field_d.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((oi) this).field_d[var4] >= 0) {
              if (((oi) this).field_h[var4] < var3) {
                var2 = var4;
                var3 = ((oi) this).field_h[var4];
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

    final boolean d() {
        return ((oi) this).field_g.field_l != null;
    }

    final long c(int param0) {
        return ((oi) this).field_b + (long)param0 * (long)((oi) this).field_e;
    }

    final int e(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((oi) this).field_b = param0;
        int var3 = ((oi) this).field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((oi) this).field_h[var4] = 0;
            ((oi) this).field_i[var4] = 0;
            ((oi) this).field_g.field_m = ((oi) this).field_a[var4];
            ((oi) this).a(var4);
            ((oi) this).field_d[var4] = ((oi) this).field_g.field_m;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((oi) this).field_g.field_l = param0;
        ((oi) this).field_g.field_m = 10;
        int var2 = ((oi) this).field_g.i(-128);
        ((oi) this).field_c = ((oi) this).field_g.i(64);
        ((oi) this).field_e = 500000;
        ((oi) this).field_a = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((oi) this).field_g.e(true);
            var5 = ((oi) this).field_g.e(true);
            if (var4 == 1297379947) {
                ((oi) this).field_a[var3] = ((oi) this).field_g.field_m;
                var3++;
            }
            ((oi) this).field_g.field_m = ((oi) this).field_g.field_m + var5;
        }
        ((oi) this).field_b = 0L;
        ((oi) this).field_d = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((oi) this).field_d[var6] = ((oi) this).field_a[var6];
            var6++;
        }
        ((oi) this).field_h = new int[var2];
        ((oi) this).field_i = new int[var2];
    }

    oi() {
        ((oi) this).field_g = new gb((byte[]) null);
    }

    oi(byte[] param0) {
        ((oi) this).field_g = new gb((byte[]) null);
        ((oi) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
