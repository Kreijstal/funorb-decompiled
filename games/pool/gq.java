/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    private ge field_c;
    private int[] field_h;
    private long field_e;
    int field_f;
    private int[] field_b;
    private int[] field_i;
    private int field_a;
    private static byte[] field_d;
    int[] field_g;

    final int d(int param0) {
        int var2 = this.c(param0);
        return var2;
    }

    final boolean a() {
        return ((gq) this).field_c.field_t != null;
    }

    final long b(int param0) {
        return ((gq) this).field_e + (long)param0 * (long)((gq) this).field_a;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((gq) this).field_i.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((gq) this).field_i[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void e() {
        ((gq) this).field_c.field_t = null;
        ((gq) this).field_h = null;
        ((gq) this).field_i = null;
        ((gq) this).field_g = null;
        ((gq) this).field_b = null;
    }

    final void e(int param0) {
        ((gq) this).field_i[param0] = ((gq) this).field_c.field_v;
    }

    final void a(int param0) {
        ((gq) this).field_c.field_v = ((gq) this).field_i[param0];
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((gq) this).field_c.field_t = param0;
        ((gq) this).field_c.field_v = 10;
        int var2 = ((gq) this).field_c.d(-1034);
        ((gq) this).field_f = ((gq) this).field_c.d(-1034);
        ((gq) this).field_a = 500000;
        ((gq) this).field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((gq) this).field_c.b(true);
            var5 = ((gq) this).field_c.b(true);
            if (var4 == 1297379947) {
                ((gq) this).field_h[var3] = ((gq) this).field_c.field_v;
                var3++;
            }
            ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + var5;
        }
        ((gq) this).field_e = 0L;
        ((gq) this).field_i = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((gq) this).field_i[var6] = ((gq) this).field_h[var6];
            var6++;
        }
        ((gq) this).field_g = new int[var2];
        ((gq) this).field_b = new int[var2];
    }

    final int d() {
        return ((gq) this).field_i.length;
    }

    final void f(int param0) {
        int var2 = ((gq) this).field_c.k(88);
        ((gq) this).field_g[param0] = ((gq) this).field_g[param0] + var2;
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((gq) this).field_i.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((gq) this).field_i[var4] >= 0) {
              if (((gq) this).field_g[var4] < var3) {
                var2 = var4;
                var3 = ((gq) this).field_g[var4];
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

    public static void g() {
        field_d = null;
    }

    final void a(long param0) {
        int var4 = 0;
        ((gq) this).field_e = param0;
        int var3 = ((gq) this).field_i.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((gq) this).field_g[var4] = 0;
            ((gq) this).field_b[var4] = 0;
            ((gq) this).field_c.field_v = ((gq) this).field_h[var4];
            ((gq) this).f(var4);
            ((gq) this).field_i[var4] = ((gq) this).field_c.field_v;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((gq) this).field_c.g(-123);
            var4 = ((gq) this).field_c.k(91);
            if (var3 == 47) {
                ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((gq) this).field_c.f(56);
                var4 -= 3;
                var6 = ((gq) this).field_g[param0];
                ((gq) this).field_e = ((gq) this).field_e + (long)var6 * (long)(((gq) this).field_a - var5);
                ((gq) this).field_a = var5;
                ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + var4;
                return 2;
            }
            ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + var4;
            return 3;
        }
        var3 = field_d[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((gq) this).field_c.g(-65) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((gq) this).field_c.g(-127) << 16;
        }
        return var4;
    }

    private final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((gq) this).field_c.field_t[((gq) this).field_c.field_v];
          if (var2 >= 0) {
            var2 = ((gq) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((gq) this).field_b[param0] = var2;
            ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + 1;
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
          var3 = ((gq) this).field_c.k(-75);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((gq) this).field_c.field_t[((gq) this).field_c.field_v] & 255;
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
              ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + 1;
              ((gq) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((gq) this).field_c.field_v = ((gq) this).field_c.field_v + var3;
        return 0;
    }

    gq() {
        ((gq) this).field_c = new ge((byte[]) null);
    }

    gq(byte[] param0) {
        ((gq) this).field_c = new ge((byte[]) null);
        ((gq) this).a(param0);
    }

    final void c() {
        ((gq) this).field_c.field_v = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
