/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private jc field_e;
    private int[] field_d;
    int field_c;
    private int[] field_g;
    private static byte[] field_f;
    private int field_h;
    int[] field_a;
    private int[] field_b;
    private long field_i;

    final void a(long param0) {
        int var4 = 0;
        ((qj) this).field_i = param0;
        int var3 = ((qj) this).field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((qj) this).field_a[var4] = 0;
            ((qj) this).field_g[var4] = 0;
            ((qj) this).field_e.field_l = ((qj) this).field_d[var4];
            ((qj) this).b(var4);
            ((qj) this).field_b[var4] = ((qj) this).field_e.field_l;
        }
    }

    final void d(int param0) {
        ((qj) this).field_b[param0] = ((qj) this).field_e.field_l;
    }

    final boolean c() {
        return ((qj) this).field_e.field_g != null;
    }

    final void f(int param0) {
        ((qj) this).field_e.field_l = ((qj) this).field_b[param0];
    }

    final boolean d() {
        int var2 = 0;
        int var1 = ((qj) this).field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((qj) this).field_b[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void b(int param0) {
        int var2 = ((qj) this).field_e.c(0);
        ((qj) this).field_a[param0] = ((qj) this).field_a[param0] + var2;
    }

    public static void b() {
        field_f = null;
    }

    final void g() {
        ((qj) this).field_e.field_g = null;
        ((qj) this).field_d = null;
        ((qj) this).field_b = null;
        ((qj) this).field_a = null;
        ((qj) this).field_g = null;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((qj) this).field_e.field_g = param0;
        ((qj) this).field_e.field_l = 10;
        int var2 = ((qj) this).field_e.c((byte) 58);
        ((qj) this).field_c = ((qj) this).field_e.c((byte) 97);
        ((qj) this).field_h = 500000;
        ((qj) this).field_d = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((qj) this).field_e.d((byte) 115);
            var5 = ((qj) this).field_e.d((byte) 126);
            if (var4 == 1297379947) {
                ((qj) this).field_d[var3] = ((qj) this).field_e.field_l;
                var3++;
            }
            ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + var5;
        }
        ((qj) this).field_i = 0L;
        ((qj) this).field_b = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((qj) this).field_b[var6] = ((qj) this).field_d[var6];
            var6++;
        }
        ((qj) this).field_a = new int[var2];
        ((qj) this).field_g = new int[var2];
    }

    final int a() {
        return ((qj) this).field_b.length;
    }

    final void e() {
        ((qj) this).field_e.field_l = -1;
    }

    final int e(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final long c(int param0) {
        return ((qj) this).field_i + (long)param0 * (long)((qj) this).field_h;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((qj) this).field_e.g(11132);
            var4 = ((qj) this).field_e.c(0);
            if (var3 == 47) {
                ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((qj) this).field_e.a(-25842);
                var4 -= 3;
                var6 = ((qj) this).field_a[param0];
                ((qj) this).field_i = ((qj) this).field_i + (long)var6 * (long)(((qj) this).field_h - var5);
                ((qj) this).field_h = var5;
                ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + var4;
                return 2;
            }
            ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((qj) this).field_e.g(11132) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((qj) this).field_e.g(11132) << 16;
        }
        return var4;
    }

    qj() {
        ((qj) this).field_e = new jc((byte[]) null);
    }

    qj(byte[] param0) {
        ((qj) this).field_e = new jc((byte[]) null);
        ((qj) this).a(param0);
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((qj) this).field_b.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((qj) this).field_b[var4] >= 0) {
              if (((qj) this).field_a[var4] < var3) {
                var2 = var4;
                var3 = ((qj) this).field_a[var4];
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

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((qj) this).field_e.field_g[((qj) this).field_e.field_l];
          if (var2 >= 0) {
            var2 = ((qj) this).field_g[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((qj) this).field_g[param0] = var2;
            ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + 1;
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
          var3 = ((qj) this).field_e.c(0);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((qj) this).field_e.field_g[((qj) this).field_e.field_l] & 255;
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
              ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + 1;
              ((qj) this).field_g[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((qj) this).field_e.field_l = ((qj) this).field_e.field_l + var3;
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
