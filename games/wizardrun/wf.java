/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    private static byte[] field_c;
    private va field_f;
    private int[] field_i;
    private int[] field_g;
    private int field_b;
    int field_d;
    private int[] field_a;
    int[] field_h;
    private long field_e;

    final void e() {
        ((wf) this).field_f.field_k = null;
        ((wf) this).field_g = null;
        ((wf) this).field_a = null;
        ((wf) this).field_h = null;
        ((wf) this).field_i = null;
    }

    final void c(int param0) {
        ((wf) this).field_a[param0] = ((wf) this).field_f.field_m;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((wf) this).field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((wf) this).field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int d(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((wf) this).field_e = param0;
        int var3 = ((wf) this).field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((wf) this).field_h[var4] = 0;
            ((wf) this).field_i[var4] = 0;
            ((wf) this).field_f.field_m = ((wf) this).field_g[var4];
            ((wf) this).b(var4);
            ((wf) this).field_a[var4] = ((wf) this).field_f.field_m;
        }
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((wf) this).field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((wf) this).field_a[var4] >= 0) {
              if (((wf) this).field_h[var4] < var3) {
                var2 = var4;
                var3 = ((wf) this).field_h[var4];
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
        int var2 = ((wf) this).field_f.f((byte) -90);
        ((wf) this).field_h[param0] = ((wf) this).field_h[param0] + var2;
    }

    final int d() {
        return ((wf) this).field_a.length;
    }

    final void a(int param0) {
        ((wf) this).field_f.field_m = ((wf) this).field_a[param0];
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((wf) this).field_f.f(255);
            var4 = ((wf) this).field_f.f((byte) -90);
            if (var3 == 47) {
                ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((wf) this).field_f.d((byte) 81);
                var4 -= 3;
                var6 = ((wf) this).field_h[param0];
                ((wf) this).field_e = ((wf) this).field_e + (long)var6 * (long)(((wf) this).field_b - var5);
                ((wf) this).field_b = var5;
                ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + var4;
                return 2;
            }
            ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + var4;
            return 3;
        }
        var3 = field_c[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((wf) this).field_f.f(255) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((wf) this).field_f.f(255) << 16;
        }
        return var4;
    }

    final void g() {
        ((wf) this).field_f.field_m = -1;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((wf) this).field_f.field_k = param0;
        ((wf) this).field_f.field_m = 10;
        int var2 = ((wf) this).field_f.j(-14477);
        ((wf) this).field_d = ((wf) this).field_f.j(-14477);
        ((wf) this).field_b = 500000;
        ((wf) this).field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((wf) this).field_f.i(255);
            var5 = ((wf) this).field_f.i(255);
            if (var4 == 1297379947) {
                ((wf) this).field_g[var3] = ((wf) this).field_f.field_m;
                var3++;
            }
            ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + var5;
        }
        ((wf) this).field_e = 0L;
        ((wf) this).field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((wf) this).field_a[var6] = ((wf) this).field_g[var6];
            var6++;
        }
        ((wf) this).field_h = new int[var2];
        ((wf) this).field_i = new int[var2];
    }

    final long e(int param0) {
        return ((wf) this).field_e + (long)param0 * (long)((wf) this).field_b;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((wf) this).field_f.field_k[((wf) this).field_f.field_m];
          if (var2 >= 0) {
            var2 = ((wf) this).field_i[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((wf) this).field_i[param0] = var2;
            ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + 1;
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
          var3 = ((wf) this).field_f.f((byte) -90);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((wf) this).field_f.field_k[((wf) this).field_f.field_m] & 255;
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
              ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + 1;
              ((wf) this).field_i[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((wf) this).field_f.field_m = ((wf) this).field_f.field_m + var3;
        return 0;
    }

    public static void a() {
        field_c = null;
    }

    final boolean c() {
        return ((wf) this).field_f.field_k != null;
    }

    wf() {
        ((wf) this).field_f = new va((byte[]) null);
    }

    wf(byte[] param0) {
        ((wf) this).field_f = new va((byte[]) null);
        ((wf) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
