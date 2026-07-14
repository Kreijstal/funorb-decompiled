/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    private static byte[] field_f;
    private ng field_d;
    private int[] field_b;
    private int[] field_g;
    private int field_e;
    private int[] field_i;
    int field_c;
    int[] field_h;
    private long field_a;

    final void d(int param0) {
        int var2 = ((ic) this).field_d.e(-36);
        ((ic) this).field_h[param0] = ((ic) this).field_h[param0] + var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((ic) this).field_d.field_h = param0;
        ((ic) this).field_d.field_f = 10;
        int var2 = ((ic) this).field_d.c((byte) -7);
        ((ic) this).field_c = ((ic) this).field_d.c((byte) -7);
        ((ic) this).field_e = 500000;
        ((ic) this).field_i = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((ic) this).field_d.b((byte) -72);
            var5 = ((ic) this).field_d.b((byte) -109);
            if (var4 == 1297379947) {
                ((ic) this).field_i[var3] = ((ic) this).field_d.field_f;
                var3++;
            }
            ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + var5;
        }
        ((ic) this).field_a = 0L;
        ((ic) this).field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((ic) this).field_g[var6] = ((ic) this).field_i[var6];
            var6++;
        }
        ((ic) this).field_h = new int[var2];
        ((ic) this).field_b = new int[var2];
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((ic) this).field_d.field_h[((ic) this).field_d.field_f];
          if (var2 >= 0) {
            var2 = ((ic) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((ic) this).field_b[param0] = var2;
            ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + 1;
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
          var3 = ((ic) this).field_d.e(-30);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((ic) this).field_d.field_h[((ic) this).field_d.field_f] & 255;
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
              ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + 1;
              ((ic) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + var3;
        return 0;
    }

    final void a(long param0) {
        int var4 = 0;
        ((ic) this).field_a = param0;
        int var3 = ((ic) this).field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((ic) this).field_h[var4] = 0;
            ((ic) this).field_b[var4] = 0;
            ((ic) this).field_d.field_f = ((ic) this).field_i[var4];
            ((ic) this).d(var4);
            ((ic) this).field_g[var4] = ((ic) this).field_d.field_f;
        }
    }

    final long b(int param0) {
        return ((ic) this).field_a + (long)param0 * (long)((ic) this).field_e;
    }

    final void e() {
        ((ic) this).field_d.field_h = null;
        ((ic) this).field_i = null;
        ((ic) this).field_g = null;
        ((ic) this).field_h = null;
        ((ic) this).field_b = null;
    }

    final boolean d() {
        return ((ic) this).field_d.field_h != null;
    }

    public static void g() {
        field_f = null;
    }

    final void c() {
        ((ic) this).field_d.field_f = -1;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((ic) this).field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((ic) this).field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int f(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final int a() {
        return ((ic) this).field_g.length;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((ic) this).field_d.h(255);
            var4 = ((ic) this).field_d.e(-75);
            if (var3 == 47) {
                ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((ic) this).field_d.b(false);
                var4 -= 3;
                var6 = ((ic) this).field_h[param0];
                ((ic) this).field_a = ((ic) this).field_a + (long)var6 * (long)(((ic) this).field_e - var5);
                ((ic) this).field_e = var5;
                ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + var4;
                return 2;
            }
            ((ic) this).field_d.field_f = ((ic) this).field_d.field_f + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((ic) this).field_d.h(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((ic) this).field_d.h(255) << 16;
        }
        return var4;
    }

    final void e(int param0) {
        ((ic) this).field_g[param0] = ((ic) this).field_d.field_f;
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((ic) this).field_g.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((ic) this).field_g[var4] >= 0) {
              if (((ic) this).field_h[var4] < var3) {
                var2 = var4;
                var3 = ((ic) this).field_h[var4];
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

    final void c(int param0) {
        ((ic) this).field_d.field_f = ((ic) this).field_g[param0];
    }

    ic() {
        ((ic) this).field_d = new ng((byte[]) null);
    }

    ic(byte[] param0) {
        ((ic) this).field_d = new ng((byte[]) null);
        ((ic) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
