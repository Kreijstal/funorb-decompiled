/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    private static byte[] field_c;
    private de field_g;
    private int[] field_a;
    private int field_e;
    private long field_h;
    private int[] field_i;
    int[] field_f;
    private int[] field_d;
    int field_b;

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((jg) this).field_g.field_h[((jg) this).field_g.field_j];
          if (var2 >= 0) {
            var2 = ((jg) this).field_d[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((jg) this).field_d[param0] = var2;
            ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + 1;
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
          var3 = ((jg) this).field_g.b(true);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((jg) this).field_g.field_h[((jg) this).field_g.field_j] & 255;
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
              ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + 1;
              ((jg) this).field_d[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + var3;
        return 0;
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((jg) this).field_i.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((jg) this).field_i[var4] >= 0) {
              if (((jg) this).field_f[var4] < var3) {
                var2 = var4;
                var3 = ((jg) this).field_f[var4];
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

    final void c() {
        ((jg) this).field_g.field_j = -1;
    }

    final void e() {
        ((jg) this).field_g.field_h = null;
        ((jg) this).field_a = null;
        ((jg) this).field_i = null;
        ((jg) this).field_f = null;
        ((jg) this).field_d = null;
    }

    final void c(int param0) {
        int var2 = ((jg) this).field_g.b(true);
        ((jg) this).field_f[param0] = ((jg) this).field_f[param0] + var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((jg) this).field_h = param0;
        int var3 = ((jg) this).field_i.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((jg) this).field_f[var4] = 0;
            ((jg) this).field_d[var4] = 0;
            ((jg) this).field_g.field_j = ((jg) this).field_a[var4];
            ((jg) this).c(var4);
            ((jg) this).field_i[var4] = ((jg) this).field_g.field_j;
        }
    }

    final int d() {
        return ((jg) this).field_i.length;
    }

    final void b(int param0) {
        ((jg) this).field_i[param0] = ((jg) this).field_g.field_j;
    }

    final void f(int param0) {
        ((jg) this).field_g.field_j = ((jg) this).field_i[param0];
    }

    final boolean a() {
        return ((jg) this).field_g.field_h != null;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((jg) this).field_g.d((byte) -116);
            var4 = ((jg) this).field_g.b(true);
            if (var3 == 47) {
                ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((jg) this).field_g.g(-1875);
                var4 -= 3;
                var6 = ((jg) this).field_f[param0];
                ((jg) this).field_h = ((jg) this).field_h + (long)var6 * (long)(((jg) this).field_e - var5);
                ((jg) this).field_e = var5;
                ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + var4;
                return 2;
            }
            ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + var4;
            return 3;
        }
        var3 = field_c[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((jg) this).field_g.d((byte) -128) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((jg) this).field_g.d((byte) -125) << 16;
        }
        return var4;
    }

    final long a(int param0) {
        return ((jg) this).field_h + (long)param0 * (long)((jg) this).field_e;
    }

    final int d(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((jg) this).field_g.field_h = param0;
        ((jg) this).field_g.field_j = 10;
        int var2 = ((jg) this).field_g.f(2);
        ((jg) this).field_b = ((jg) this).field_g.f(2);
        ((jg) this).field_e = 500000;
        ((jg) this).field_a = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((jg) this).field_g.c(123);
            var5 = ((jg) this).field_g.c(121);
            if (var4 == 1297379947) {
                ((jg) this).field_a[var3] = ((jg) this).field_g.field_j;
                var3++;
            }
            ((jg) this).field_g.field_j = ((jg) this).field_g.field_j + var5;
        }
        ((jg) this).field_h = 0L;
        ((jg) this).field_i = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((jg) this).field_i[var6] = ((jg) this).field_a[var6];
            var6++;
        }
        ((jg) this).field_f = new int[var2];
        ((jg) this).field_d = new int[var2];
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((jg) this).field_i.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((jg) this).field_i[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void g() {
        field_c = null;
    }

    jg() {
        ((jg) this).field_g = new de((byte[]) null);
    }

    jg(byte[] param0) {
        ((jg) this).field_g = new de((byte[]) null);
        ((jg) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
