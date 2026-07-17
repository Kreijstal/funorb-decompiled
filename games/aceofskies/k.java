/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    private static byte[] field_d;
    private rb field_a;
    private int[] field_b;
    int[] field_f;
    private int field_i;
    int field_e;
    private long field_h;
    private int[] field_c;
    private int[] field_g;

    final void a(int param0) {
        ((k) this).field_a.field_g = ((k) this).field_g[param0];
    }

    final void a(long param0) {
        int var4 = 0;
        ((k) this).field_h = param0;
        int var3 = ((k) this).field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((k) this).field_f[var4] = 0;
            ((k) this).field_b[var4] = 0;
            ((k) this).field_a.field_g = ((k) this).field_c[var4];
            ((k) this).c(var4);
            ((k) this).field_g[var4] = ((k) this).field_a.field_g;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((k) this).field_a.g(70);
            var4 = ((k) this).field_a.a(116);
            if (var3 == 47) {
                ((k) this).field_a.field_g = ((k) this).field_a.field_g + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((k) this).field_a.g((byte) -87);
                var4 -= 3;
                var6 = ((k) this).field_f[param0];
                ((k) this).field_h = ((k) this).field_h + (long)var6 * (long)(((k) this).field_i - var5);
                ((k) this).field_i = var5;
                ((k) this).field_a.field_g = ((k) this).field_a.field_g + var4;
                return 2;
            }
            ((k) this).field_a.field_g = ((k) this).field_a.field_g + var4;
            return 3;
        }
        var3 = field_d[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((k) this).field_a.g(120) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((k) this).field_a.g(120) << 16;
        }
        return var4;
    }

    final long d(int param0) {
        return ((k) this).field_h + (long)param0 * (long)((k) this).field_i;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((k) this).field_a.field_f = param0;
        ((k) this).field_a.field_g = 10;
        int var2 = ((k) this).field_a.i((byte) 0);
        ((k) this).field_e = ((k) this).field_a.i((byte) 0);
        ((k) this).field_i = 500000;
        ((k) this).field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((k) this).field_a.a((byte) 119);
            var5 = ((k) this).field_a.a((byte) 117);
            if (var4 == 1297379947) {
                ((k) this).field_c[var3] = ((k) this).field_a.field_g;
                var3++;
            }
            ((k) this).field_a.field_g = ((k) this).field_a.field_g + var5;
        }
        ((k) this).field_h = 0L;
        ((k) this).field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((k) this).field_g[var6] = ((k) this).field_c[var6];
            var6++;
        }
        ((k) this).field_f = new int[var2];
        ((k) this).field_b = new int[var2];
    }

    final void c(int param0) {
        int var2 = ((k) this).field_a.a(121);
        ((k) this).field_f[param0] = ((k) this).field_f[param0] + var2;
    }

    final int e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((k) this).field_g.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((k) this).field_g[var4] >= 0) {
              if (((k) this).field_f[var4] < var3) {
                var2 = var4;
                var3 = ((k) this).field_f[var4];
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

    final boolean c() {
        return ((k) this).field_a.field_f != null;
    }

    final void d() {
        ((k) this).field_a.field_f = null;
        ((k) this).field_c = null;
        ((k) this).field_g = null;
        ((k) this).field_f = null;
        ((k) this).field_b = null;
    }

    final void f(int param0) {
        ((k) this).field_g[param0] = ((k) this).field_a.field_g;
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((k) this).field_a.field_f[((k) this).field_a.field_g];
          if (var2 >= 0) {
            var2 = ((k) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((k) this).field_b[param0] = var2;
            ((k) this).field_a.field_g = ((k) this).field_a.field_g + 1;
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
          var3 = ((k) this).field_a.a(121);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((k) this).field_a.field_f[((k) this).field_a.field_g] & 255;
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
              ((k) this).field_a.field_g = ((k) this).field_a.field_g + 1;
              ((k) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((k) this).field_a.field_g = ((k) this).field_a.field_g + var3;
        return 0;
    }

    final void a() {
        ((k) this).field_a.field_g = -1;
    }

    final int f() {
        return ((k) this).field_g.length;
    }

    final int e(int param0) {
        int var2 = this.b(param0);
        return var2;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = ((k) this).field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((k) this).field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void b() {
        field_d = null;
    }

    k() {
        ((k) this).field_a = new rb((byte[]) null);
    }

    k(byte[] param0) {
        ((k) this).field_a = new rb((byte[]) null);
        ((k) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
