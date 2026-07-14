/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    private ds field_d;
    private static byte[] field_h;
    int field_c;
    private int field_f;
    int[] field_b;
    private int[] field_e;
    private int[] field_a;
    private int[] field_g;
    private long field_i;

    final int d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((q) this).field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((q) this).field_a[var4] >= 0) {
              if (((q) this).field_b[var4] < var3) {
                var2 = var4;
                var3 = ((q) this).field_b[var4];
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

    final void a() {
        ((q) this).field_d.field_h = null;
        ((q) this).field_g = null;
        ((q) this).field_a = null;
        ((q) this).field_b = null;
        ((q) this).field_e = null;
    }

    final void f(int param0) {
        ((q) this).field_a[param0] = ((q) this).field_d.field_e;
    }

    public static void b() {
        field_h = null;
    }

    final void e(int param0) {
        int var2 = ((q) this).field_d.l(11436);
        ((q) this).field_b[param0] = ((q) this).field_b[param0] + var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((q) this).field_d.field_h = param0;
        ((q) this).field_d.field_e = 10;
        int var2 = ((q) this).field_d.e(1869);
        ((q) this).field_c = ((q) this).field_d.e(1869);
        ((q) this).field_f = 500000;
        ((q) this).field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((q) this).field_d.h(65);
            var5 = ((q) this).field_d.h(49);
            if (var4 == 1297379947) {
                ((q) this).field_g[var3] = ((q) this).field_d.field_e;
                var3++;
            }
            ((q) this).field_d.field_e = ((q) this).field_d.field_e + var5;
        }
        ((q) this).field_i = 0L;
        ((q) this).field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((q) this).field_a[var6] = ((q) this).field_g[var6];
            var6++;
        }
        ((q) this).field_b = new int[var2];
        ((q) this).field_e = new int[var2];
    }

    final int e() {
        return ((q) this).field_a.length;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((q) this).field_d.e((byte) -119);
            var4 = ((q) this).field_d.l(11436);
            if (var3 == 47) {
                ((q) this).field_d.field_e = ((q) this).field_d.field_e + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((q) this).field_d.c((byte) -124);
                var4 -= 3;
                var6 = ((q) this).field_b[param0];
                ((q) this).field_i = ((q) this).field_i + (long)var6 * (long)(((q) this).field_f - var5);
                ((q) this).field_f = var5;
                ((q) this).field_d.field_e = ((q) this).field_d.field_e + var4;
                return 2;
            }
            ((q) this).field_d.field_e = ((q) this).field_d.field_e + var4;
            return 3;
        }
        var3 = field_h[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((q) this).field_d.e((byte) -126) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((q) this).field_d.e((byte) -93) << 16;
        }
        return var4;
    }

    final long a(int param0) {
        return ((q) this).field_i + (long)param0 * (long)((q) this).field_f;
    }

    final void c(int param0) {
        ((q) this).field_d.field_e = ((q) this).field_a[param0];
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((q) this).field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((q) this).field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void c() {
        ((q) this).field_d.field_e = -1;
    }

    final int d(int param0) {
        int var2 = this.b(param0);
        return var2;
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((q) this).field_d.field_h[((q) this).field_d.field_e];
          if (var2 >= 0) {
            var2 = ((q) this).field_e[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((q) this).field_e[param0] = var2;
            ((q) this).field_d.field_e = ((q) this).field_d.field_e + 1;
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
          var3 = ((q) this).field_d.l(11436);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((q) this).field_d.field_h[((q) this).field_d.field_e] & 255;
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
              ((q) this).field_d.field_e = ((q) this).field_d.field_e + 1;
              ((q) this).field_e[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((q) this).field_d.field_e = ((q) this).field_d.field_e + var3;
        return 0;
    }

    final boolean g() {
        return ((q) this).field_d.field_h != null;
    }

    q() {
        ((q) this).field_d = new ds((byte[]) null);
    }

    q(byte[] param0) {
        ((q) this).field_d = new ds((byte[]) null);
        ((q) this).a(param0);
    }

    final void a(long param0) {
        int var4 = 0;
        ((q) this).field_i = param0;
        int var3 = ((q) this).field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((q) this).field_b[var4] = 0;
            ((q) this).field_e[var4] = 0;
            ((q) this).field_d.field_e = ((q) this).field_g[var4];
            ((q) this).e(var4);
            ((q) this).field_a[var4] = ((q) this).field_d.field_e;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
