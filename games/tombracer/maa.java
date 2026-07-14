/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa {
    private static byte[] field_b;
    private uia field_d;
    private int[] field_c;
    private long field_i;
    private int[] field_f;
    private int[] field_h;
    int field_e;
    private int field_g;
    int[] field_a;

    final boolean d() {
        int var2 = 0;
        int var1 = ((maa) this).field_c.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((maa) this).field_c[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int b(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final void e() {
        ((maa) this).field_d.field_h = -1;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((maa) this).field_d.field_g = param0;
        ((maa) this).field_d.field_h = 10;
        int var2 = ((maa) this).field_d.d(126);
        ((maa) this).field_e = ((maa) this).field_d.d(124);
        ((maa) this).field_g = 500000;
        ((maa) this).field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((maa) this).field_d.e(-67);
            var5 = ((maa) this).field_d.e(109);
            if (var4 == 1297379947) {
                ((maa) this).field_h[var3] = ((maa) this).field_d.field_h;
                var3++;
            }
            ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + var5;
        }
        ((maa) this).field_i = 0L;
        ((maa) this).field_c = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((maa) this).field_c[var6] = ((maa) this).field_h[var6];
            var6++;
        }
        ((maa) this).field_a = new int[var2];
        ((maa) this).field_f = new int[var2];
    }

    final int c() {
        return ((maa) this).field_c.length;
    }

    final void c(int param0) {
        int var2 = ((maa) this).field_d.b((byte) 13);
        ((maa) this).field_a[param0] = ((maa) this).field_a[param0] + var2;
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((maa) this).field_d.field_g[((maa) this).field_d.field_h];
          if (var2 >= 0) {
            var2 = ((maa) this).field_f[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((maa) this).field_f[param0] = var2;
            ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + 1;
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
          var3 = ((maa) this).field_d.b((byte) -125);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((maa) this).field_d.field_g[((maa) this).field_d.field_h] & 255;
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
              ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + 1;
              ((maa) this).field_f[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + var3;
        return 0;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((maa) this).field_d.h(255);
            var4 = ((maa) this).field_d.b((byte) -127);
            if (var3 == 47) {
                ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((maa) this).field_d.a(-32768);
                var4 -= 3;
                var6 = ((maa) this).field_a[param0];
                ((maa) this).field_i = ((maa) this).field_i + (long)var6 * (long)(((maa) this).field_g - var5);
                ((maa) this).field_g = var5;
                ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + var4;
                return 2;
            }
            ((maa) this).field_d.field_h = ((maa) this).field_d.field_h + var4;
            return 3;
        }
        var3 = field_b[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((maa) this).field_d.h(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((maa) this).field_d.h(255) << 16;
        }
        return var4;
    }

    final long d(int param0) {
        return ((maa) this).field_i + (long)param0 * (long)((maa) this).field_g;
    }

    final void a() {
        ((maa) this).field_d.field_g = null;
        ((maa) this).field_h = null;
        ((maa) this).field_c = null;
        ((maa) this).field_a = null;
        ((maa) this).field_f = null;
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((maa) this).field_c.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((maa) this).field_c[var4] >= 0) {
              if (((maa) this).field_a[var4] < var3) {
                var2 = var4;
                var3 = ((maa) this).field_a[var4];
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

    final boolean g() {
        return ((maa) this).field_d.field_g != null;
    }

    final void e(int param0) {
        ((maa) this).field_d.field_h = ((maa) this).field_c[param0];
    }

    final void f(int param0) {
        ((maa) this).field_c[param0] = ((maa) this).field_d.field_h;
    }

    public static void b() {
        field_b = null;
    }

    maa() {
        ((maa) this).field_d = new uia((byte[]) null);
    }

    final void a(long param0) {
        int var4 = 0;
        ((maa) this).field_i = param0;
        int var3 = ((maa) this).field_c.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((maa) this).field_a[var4] = 0;
            ((maa) this).field_f[var4] = 0;
            ((maa) this).field_d.field_h = ((maa) this).field_h[var4];
            ((maa) this).c(var4);
            ((maa) this).field_c[var4] = ((maa) this).field_d.field_h;
        }
    }

    maa(byte[] param0) {
        ((maa) this).field_d = new uia((byte[]) null);
        ((maa) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
