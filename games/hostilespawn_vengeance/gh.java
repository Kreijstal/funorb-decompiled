/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    private static byte[] field_i;
    private vi field_h;
    private int[] field_c;
    int field_f;
    private long field_e;
    private int[] field_g;
    private int field_b;
    int[] field_a;
    private int[] field_d;

    final int c(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((gh) this).field_e = param0;
        int var3 = ((gh) this).field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((gh) this).field_a[var4] = 0;
            ((gh) this).field_c[var4] = 0;
            ((gh) this).field_h.field_i = ((gh) this).field_g[var4];
            ((gh) this).d(var4);
            ((gh) this).field_d[var4] = ((gh) this).field_h.field_i;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((gh) this).field_h.field_n = param0;
        ((gh) this).field_h.field_i = 10;
        int var2 = ((gh) this).field_h.e(8);
        ((gh) this).field_f = ((gh) this).field_h.e(8);
        ((gh) this).field_b = 500000;
        ((gh) this).field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((gh) this).field_h.d(8195);
            var5 = ((gh) this).field_h.d(8195);
            if (var4 == 1297379947) {
                ((gh) this).field_g[var3] = ((gh) this).field_h.field_i;
                var3++;
            }
            ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + var5;
        }
        ((gh) this).field_e = 0L;
        ((gh) this).field_d = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((gh) this).field_d[var6] = ((gh) this).field_g[var6];
            var6++;
        }
        ((gh) this).field_a = new int[var2];
        ((gh) this).field_c = new int[var2];
    }

    final void a() {
        ((gh) this).field_h.field_i = -1;
    }

    final void d(int param0) {
        int var2 = ((gh) this).field_h.m(127);
        ((gh) this).field_a[param0] = ((gh) this).field_a[param0] + var2;
    }

    final int g() {
        return ((gh) this).field_d.length;
    }

    final boolean e() {
        int var2 = 0;
        int var1 = ((gh) this).field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((gh) this).field_d[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((gh) this).field_d.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((gh) this).field_d[var4] >= 0) {
              if (((gh) this).field_a[var4] < var3) {
                var2 = var4;
                var3 = ((gh) this).field_a[var4];
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

    final long b(int param0) {
        return ((gh) this).field_e + (long)param0 * (long)((gh) this).field_b;
    }

    final void e(int param0) {
        ((gh) this).field_h.field_i = ((gh) this).field_d[param0];
    }

    final void b() {
        ((gh) this).field_h.field_n = null;
        ((gh) this).field_g = null;
        ((gh) this).field_d = null;
        ((gh) this).field_a = null;
        ((gh) this).field_c = null;
    }

    final boolean c() {
        return ((gh) this).field_h.field_n != null;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((gh) this).field_h.field_n[((gh) this).field_h.field_i];
          if (var2 >= 0) {
            var2 = ((gh) this).field_c[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((gh) this).field_c[param0] = var2;
            ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + 1;
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
          var3 = ((gh) this).field_h.m(127);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((gh) this).field_h.field_n[((gh) this).field_h.field_i] & 255;
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
              ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + 1;
              ((gh) this).field_c[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + var3;
        return 0;
    }

    public static void f() {
        field_i = null;
    }

    final void a(int param0) {
        ((gh) this).field_d[param0] = ((gh) this).field_h.field_i;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((gh) this).field_h.l(32270);
            var4 = ((gh) this).field_h.m(127);
            if (var3 == 47) {
                ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((gh) this).field_h.h(83);
                var4 -= 3;
                var6 = ((gh) this).field_a[param0];
                ((gh) this).field_e = ((gh) this).field_e + (long)var6 * (long)(((gh) this).field_b - var5);
                ((gh) this).field_b = var5;
                ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + var4;
                return 2;
            }
            ((gh) this).field_h.field_i = ((gh) this).field_h.field_i + var4;
            return 3;
        }
        var3 = field_i[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((gh) this).field_h.l(32270) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((gh) this).field_h.l(32270) << 16;
        }
        return var4;
    }

    gh() {
        ((gh) this).field_h = new vi((byte[]) null);
    }

    gh(byte[] param0) {
        ((gh) this).field_h = new vi((byte[]) null);
        ((gh) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
