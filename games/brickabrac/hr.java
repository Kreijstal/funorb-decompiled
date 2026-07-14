/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    private wq field_b;
    private static byte[] field_e;
    private int field_c;
    private int[] field_i;
    int[] field_f;
    int field_d;
    private int[] field_g;
    private long field_a;
    private int[] field_h;

    final int e() {
        return ((hr) this).field_g.length;
    }

    final int e(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void a(int param0) {
        ((hr) this).field_b.field_l = ((hr) this).field_g[param0];
    }

    final int b(long param0) {
        long var3 = param0 - ((hr) this).field_a;
        return (int)((var3 + (long)((hr) this).field_c - 1L) / (long)((hr) this).field_c);
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((hr) this).field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((hr) this).field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void g() {
        field_e = null;
    }

    final void b() {
        ((hr) this).field_b.field_l = -1;
    }

    final void f(int param0) {
        int var2 = ((hr) this).field_b.c((byte) 127);
        ((hr) this).field_f[param0] = ((hr) this).field_f[param0] + var2;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((hr) this).field_g.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((hr) this).field_g[var4] >= 0) {
              if (((hr) this).field_f[var4] < var3) {
                var2 = var4;
                var3 = ((hr) this).field_f[var4];
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

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((hr) this).field_b.field_k = param0;
        ((hr) this).field_b.field_l = 10;
        int var2 = ((hr) this).field_b.i(65280);
        ((hr) this).field_d = ((hr) this).field_b.i(65280);
        ((hr) this).field_c = 500000;
        ((hr) this).field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((hr) this).field_b.e(255);
            var5 = ((hr) this).field_b.e(255);
            if (var4 == 1297379947) {
                ((hr) this).field_h[var3] = ((hr) this).field_b.field_l;
                var3++;
            }
            ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + var5;
        }
        ((hr) this).field_a = 0L;
        ((hr) this).field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((hr) this).field_g[var6] = ((hr) this).field_h[var6];
            var6++;
        }
        ((hr) this).field_f = new int[var2];
        ((hr) this).field_i = new int[var2];
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((hr) this).field_b.field_k[((hr) this).field_b.field_l];
          if (var2 >= 0) {
            var2 = ((hr) this).field_i[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((hr) this).field_i[param0] = var2;
            ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + 1;
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
          var3 = ((hr) this).field_b.c((byte) -73);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((hr) this).field_b.field_k[((hr) this).field_b.field_l] & 255;
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
              ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + 1;
              ((hr) this).field_i[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + var3;
        return 0;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((hr) this).field_b.l(255);
            var4 = ((hr) this).field_b.c((byte) -75);
            if (var3 == 47) {
                ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((hr) this).field_b.e((byte) -34);
                var4 -= 3;
                var6 = ((hr) this).field_f[param0];
                ((hr) this).field_a = ((hr) this).field_a + (long)var6 * (long)(((hr) this).field_c - var5);
                ((hr) this).field_c = var5;
                ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + var4;
                return 2;
            }
            ((hr) this).field_b.field_l = ((hr) this).field_b.field_l + var4;
            return 3;
        }
        var3 = field_e[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((hr) this).field_b.l(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((hr) this).field_b.l(255) << 16;
        }
        return var4;
    }

    final void d() {
        ((hr) this).field_b.field_k = null;
        ((hr) this).field_h = null;
        ((hr) this).field_g = null;
        ((hr) this).field_f = null;
        ((hr) this).field_i = null;
    }

    final long c(int param0) {
        return ((hr) this).field_a + (long)param0 * (long)((hr) this).field_c;
    }

    final void a(long param0) {
        int var4 = 0;
        ((hr) this).field_a = param0;
        int var3 = ((hr) this).field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((hr) this).field_f[var4] = 0;
            ((hr) this).field_i[var4] = 0;
            ((hr) this).field_b.field_l = ((hr) this).field_h[var4];
            ((hr) this).f(var4);
            ((hr) this).field_g[var4] = ((hr) this).field_b.field_l;
        }
    }

    final boolean c() {
        return ((hr) this).field_b.field_k != null;
    }

    final void b(int param0) {
        ((hr) this).field_g[param0] = ((hr) this).field_b.field_l;
    }

    hr() {
        ((hr) this).field_b = new wq((byte[]) null);
    }

    hr(byte[] param0) {
        ((hr) this).field_b = new wq((byte[]) null);
        ((hr) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
