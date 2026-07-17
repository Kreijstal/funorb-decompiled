/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private static byte[] field_a;
    private we field_e;
    private int[] field_f;
    private int field_d;
    int[] field_g;
    private int[] field_b;
    int field_i;
    private int[] field_h;
    private long field_c;

    public static void g() {
        field_a = null;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((sg) this).field_e.f(255);
            var4 = ((sg) this).field_e.j(127);
            if (var3 == 47) {
                ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((sg) this).field_e.c((byte) 13);
                var4 -= 3;
                var6 = ((sg) this).field_g[param0];
                ((sg) this).field_c = ((sg) this).field_c + (long)var6 * (long)(((sg) this).field_d - var5);
                ((sg) this).field_d = var5;
                ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + var4;
                return 2;
            }
            ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + var4;
            return 3;
        }
        var3 = field_a[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((sg) this).field_e.f(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((sg) this).field_e.f(255) << 16;
        }
        return var4;
    }

    final void a(long param0) {
        int var4 = 0;
        ((sg) this).field_c = param0;
        int var3 = ((sg) this).field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((sg) this).field_g[var4] = 0;
            ((sg) this).field_f[var4] = 0;
            ((sg) this).field_e.field_m = ((sg) this).field_h[var4];
            ((sg) this).b(var4);
            ((sg) this).field_b[var4] = ((sg) this).field_e.field_m;
        }
    }

    final int d() {
        return ((sg) this).field_b.length;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((sg) this).field_e.field_k = param0;
        ((sg) this).field_e.field_m = 10;
        int var2 = ((sg) this).field_e.a((byte) 85);
        ((sg) this).field_i = ((sg) this).field_e.a((byte) 55);
        ((sg) this).field_d = 500000;
        ((sg) this).field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((sg) this).field_e.k(0);
            var5 = ((sg) this).field_e.k(0);
            if (var4 == 1297379947) {
                ((sg) this).field_h[var3] = ((sg) this).field_e.field_m;
                var3++;
            }
            ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + var5;
        }
        ((sg) this).field_c = 0L;
        ((sg) this).field_b = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((sg) this).field_b[var6] = ((sg) this).field_h[var6];
            var6++;
        }
        ((sg) this).field_g = new int[var2];
        ((sg) this).field_f = new int[var2];
    }

    final boolean c() {
        int var2 = 0;
        int var1 = ((sg) this).field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((sg) this).field_b[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final long f(int param0) {
        return ((sg) this).field_c + (long)param0 * (long)((sg) this).field_d;
    }

    final void e() {
        ((sg) this).field_e.field_m = -1;
    }

    final void b(int param0) {
        int var2 = ((sg) this).field_e.j(127);
        ((sg) this).field_g[param0] = ((sg) this).field_g[param0] + var2;
    }

    final void c(int param0) {
        ((sg) this).field_e.field_m = ((sg) this).field_b[param0];
    }

    final boolean f() {
        return ((sg) this).field_e.field_k != null;
    }

    final int a(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((sg) this).field_e.field_k[((sg) this).field_e.field_m];
          if (var2 >= 0) {
            var2 = ((sg) this).field_f[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((sg) this).field_f[param0] = var2;
            ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + 1;
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
          var3 = ((sg) this).field_e.j(127);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((sg) this).field_e.field_k[((sg) this).field_e.field_m] & 255;
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
              ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + 1;
              ((sg) this).field_f[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((sg) this).field_e.field_m = ((sg) this).field_e.field_m + var3;
        return 0;
    }

    final void d(int param0) {
        ((sg) this).field_b[param0] = ((sg) this).field_e.field_m;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((sg) this).field_b.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((sg) this).field_b[var4] >= 0) {
              if (((sg) this).field_g[var4] < var3) {
                var2 = var4;
                var3 = ((sg) this).field_g[var4];
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

    final void b() {
        ((sg) this).field_e.field_k = null;
        ((sg) this).field_h = null;
        ((sg) this).field_b = null;
        ((sg) this).field_g = null;
        ((sg) this).field_f = null;
    }

    sg() {
        ((sg) this).field_e = new we((byte[]) null);
    }

    sg(byte[] param0) {
        ((sg) this).field_e = new we((byte[]) null);
        ((sg) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
