/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    private static byte[] field_a;
    private fs field_i;
    int field_d;
    private int[] field_h;
    int[] field_c;
    private int[] field_f;
    private int field_e;
    private int[] field_g;
    private long field_b;

    final void a() {
        ((sh) this).field_i.field_p = -1;
    }

    final int f() {
        return ((sh) this).field_g.length;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((sh) this).field_i.field_n = param0;
        ((sh) this).field_i.field_p = 10;
        int var2 = ((sh) this).field_i.a(255);
        ((sh) this).field_d = ((sh) this).field_i.a(255);
        ((sh) this).field_e = 500000;
        ((sh) this).field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((sh) this).field_i.c(true);
            var5 = ((sh) this).field_i.c(true);
            if (var4 == 1297379947) {
                ((sh) this).field_h[var3] = ((sh) this).field_i.field_p;
                var3++;
            }
            ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + var5;
        }
        ((sh) this).field_b = 0L;
        ((sh) this).field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((sh) this).field_g[var6] = ((sh) this).field_h[var6];
            var6++;
        }
        ((sh) this).field_c = new int[var2];
        ((sh) this).field_f = new int[var2];
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((sh) this).field_g.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((sh) this).field_g[var4] >= 0) {
              if (((sh) this).field_c[var4] < var3) {
                var2 = var4;
                var3 = ((sh) this).field_c[var4];
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

    final void b(int param0) {
        ((sh) this).field_i.field_p = ((sh) this).field_g[param0];
    }

    final void e() {
        ((sh) this).field_i.field_n = null;
        ((sh) this).field_h = null;
        ((sh) this).field_g = null;
        ((sh) this).field_c = null;
        ((sh) this).field_f = null;
    }

    final void b(long param0) {
        int var4 = 0;
        ((sh) this).field_b = param0;
        int var3 = ((sh) this).field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((sh) this).field_c[var4] = 0;
            ((sh) this).field_f[var4] = 0;
            ((sh) this).field_i.field_p = ((sh) this).field_h[var4];
            ((sh) this).a(var4);
            ((sh) this).field_g[var4] = ((sh) this).field_i.field_p;
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((sh) this).field_i.field_n[((sh) this).field_i.field_p];
          if (var2 >= 0) {
            var2 = ((sh) this).field_f[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((sh) this).field_f[param0] = var2;
            ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + 1;
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
          var3 = ((sh) this).field_i.f((byte) 93);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((sh) this).field_i.field_n[((sh) this).field_i.field_p] & 255;
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
              ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + 1;
              ((sh) this).field_f[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + var3;
        return 0;
    }

    final void a(int param0) {
        int var2 = ((sh) this).field_i.f((byte) 127);
        ((sh) this).field_c[param0] = ((sh) this).field_c[param0] + var2;
    }

    final int e(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((sh) this).field_i.e(-31302);
            var4 = ((sh) this).field_i.f((byte) 105);
            if (var3 == 47) {
                ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((sh) this).field_i.c((byte) 124);
                var4 -= 3;
                var6 = ((sh) this).field_c[param0];
                ((sh) this).field_b = ((sh) this).field_b + (long)var6 * (long)(((sh) this).field_e - var5);
                ((sh) this).field_e = var5;
                ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + var4;
                return 2;
            }
            ((sh) this).field_i.field_p = ((sh) this).field_i.field_p + var4;
            return 3;
        }
        var3 = field_a[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((sh) this).field_i.e(-31302) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((sh) this).field_i.e(-31302) << 16;
        }
        return var4;
    }

    public static void g() {
        field_a = null;
    }

    final int a(long param0) {
        long var3 = param0 - ((sh) this).field_b;
        return (int)((var3 + (long)((sh) this).field_e - 1L) / (long)((sh) this).field_e);
    }

    final boolean d() {
        int var2 = 0;
        int var1 = ((sh) this).field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((sh) this).field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final long d(int param0) {
        return ((sh) this).field_b + (long)param0 * (long)((sh) this).field_e;
    }

    final boolean c() {
        return ((sh) this).field_i.field_n != null;
    }

    sh() {
        ((sh) this).field_i = new fs((byte[]) null);
    }

    final void c(int param0) {
        ((sh) this).field_g[param0] = ((sh) this).field_i.field_p;
    }

    sh(byte[] param0) {
        ((sh) this).field_i = new fs((byte[]) null);
        ((sh) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
