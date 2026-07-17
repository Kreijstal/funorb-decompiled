/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private static byte[] field_f;
    private ni field_c;
    private int[] field_h;
    private long field_i;
    int[] field_g;
    private int[] field_b;
    int field_a;
    private int field_e;
    private int[] field_d;

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((fd) this).field_d.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((fd) this).field_d[var4] >= 0) {
              if (((fd) this).field_g[var4] < var3) {
                var2 = var4;
                var3 = ((fd) this).field_g[var4];
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

    final int a() {
        return ((fd) this).field_d.length;
    }

    final void e(int param0) {
        int var2 = ((fd) this).field_c.b(true);
        ((fd) this).field_g[param0] = ((fd) this).field_g[param0] + var2;
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((fd) this).field_c.field_k[((fd) this).field_c.field_i];
          if (var2 >= 0) {
            var2 = ((fd) this).field_h[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((fd) this).field_h[param0] = var2;
            ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + 1;
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
          var3 = ((fd) this).field_c.b(true);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((fd) this).field_c.field_k[((fd) this).field_c.field_i] & 255;
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
              ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + 1;
              ((fd) this).field_h[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + var3;
        return 0;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = ((fd) this).field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((fd) this).field_d[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void f() {
        ((fd) this).field_c.field_k = null;
        ((fd) this).field_b = null;
        ((fd) this).field_d = null;
        ((fd) this).field_g = null;
        ((fd) this).field_h = null;
    }

    public static void e() {
        field_f = null;
    }

    final long a(int param0) {
        return ((fd) this).field_i + (long)param0 * (long)((fd) this).field_e;
    }

    final void c(int param0) {
        ((fd) this).field_d[param0] = ((fd) this).field_c.field_i;
    }

    final int b(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void d() {
        ((fd) this).field_c.field_i = -1;
    }

    final void f(int param0) {
        ((fd) this).field_c.field_i = ((fd) this).field_d[param0];
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((fd) this).field_c.e(false);
            var4 = ((fd) this).field_c.b(true);
            if (var3 == 47) {
                ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((fd) this).field_c.c(true);
                var4 -= 3;
                var6 = ((fd) this).field_g[param0];
                ((fd) this).field_i = ((fd) this).field_i + (long)var6 * (long)(((fd) this).field_e - var5);
                ((fd) this).field_e = var5;
                ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + var4;
                return 2;
            }
            ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((fd) this).field_c.e(false) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((fd) this).field_c.e(false) << 16;
        }
        return var4;
    }

    final void a(long param0) {
        int var4 = 0;
        ((fd) this).field_i = param0;
        int var3 = ((fd) this).field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((fd) this).field_g[var4] = 0;
            ((fd) this).field_h[var4] = 0;
            ((fd) this).field_c.field_i = ((fd) this).field_b[var4];
            ((fd) this).e(var4);
            ((fd) this).field_d[var4] = ((fd) this).field_c.field_i;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((fd) this).field_c.field_k = param0;
        ((fd) this).field_c.field_i = 10;
        int var2 = ((fd) this).field_c.d((byte) -82);
        ((fd) this).field_a = ((fd) this).field_c.d((byte) 112);
        ((fd) this).field_e = 500000;
        ((fd) this).field_b = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((fd) this).field_c.c((byte) 127);
            var5 = ((fd) this).field_c.c((byte) 127);
            if (var4 == 1297379947) {
                ((fd) this).field_b[var3] = ((fd) this).field_c.field_i;
                var3++;
            }
            ((fd) this).field_c.field_i = ((fd) this).field_c.field_i + var5;
        }
        ((fd) this).field_i = 0L;
        ((fd) this).field_d = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((fd) this).field_d[var6] = ((fd) this).field_b[var6];
            var6++;
        }
        ((fd) this).field_g = new int[var2];
        ((fd) this).field_h = new int[var2];
    }

    final boolean c() {
        return ((fd) this).field_c.field_k != null;
    }

    fd() {
        ((fd) this).field_c = new ni((byte[]) null);
    }

    fd(byte[] param0) {
        ((fd) this).field_c = new ni((byte[]) null);
        ((fd) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
