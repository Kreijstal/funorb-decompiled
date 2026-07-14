/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw {
    private vh field_b;
    private static byte[] field_f;
    int field_c;
    int[] field_i;
    private int field_e;
    private long field_g;
    private int[] field_h;
    private int[] field_a;
    private int[] field_d;

    final long b(int param0) {
        return ((dw) this).field_g + (long)param0 * (long)((dw) this).field_e;
    }

    final boolean g() {
        return ((dw) this).field_b.field_o != null;
    }

    final void d(int param0) {
        ((dw) this).field_b.field_q = ((dw) this).field_d[param0];
    }

    final void f(int param0) {
        int var2 = ((dw) this).field_b.h(-30);
        ((dw) this).field_i[param0] = ((dw) this).field_i[param0] + var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((dw) this).field_g = param0;
        int var3 = ((dw) this).field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((dw) this).field_i[var4] = 0;
            ((dw) this).field_h[var4] = 0;
            ((dw) this).field_b.field_q = ((dw) this).field_a[var4];
            ((dw) this).f(var4);
            ((dw) this).field_d[var4] = ((dw) this).field_b.field_q;
        }
    }

    final void a(int param0) {
        ((dw) this).field_d[param0] = ((dw) this).field_b.field_q;
    }

    final int c(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final boolean b() {
        int var2 = 0;
        int var1 = ((dw) this).field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((dw) this).field_d[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((dw) this).field_b.k(0);
            var4 = ((dw) this).field_b.h(92);
            if (var3 == 47) {
                ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((dw) this).field_b.d((byte) -13);
                var4 -= 3;
                var6 = ((dw) this).field_i[param0];
                ((dw) this).field_g = ((dw) this).field_g + (long)var6 * (long)(((dw) this).field_e - var5);
                ((dw) this).field_e = var5;
                ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + var4;
                return 2;
            }
            ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((dw) this).field_b.k(0) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((dw) this).field_b.k(0) << 16;
        }
        return var4;
    }

    final int d() {
        return ((dw) this).field_d.length;
    }

    final void a() {
        ((dw) this).field_b.field_q = -1;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((dw) this).field_b.field_o = param0;
        ((dw) this).field_b.field_q = 10;
        int var2 = ((dw) this).field_b.e((byte) -104);
        ((dw) this).field_c = ((dw) this).field_b.e((byte) -104);
        ((dw) this).field_e = 500000;
        ((dw) this).field_a = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((dw) this).field_b.i(1);
            var5 = ((dw) this).field_b.i(1);
            if (var4 == 1297379947) {
                ((dw) this).field_a[var3] = ((dw) this).field_b.field_q;
                var3++;
            }
            ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + var5;
        }
        ((dw) this).field_g = 0L;
        ((dw) this).field_d = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((dw) this).field_d[var6] = ((dw) this).field_a[var6];
            var6++;
        }
        ((dw) this).field_i = new int[var2];
        ((dw) this).field_h = new int[var2];
    }

    final int e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((dw) this).field_d.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((dw) this).field_d[var4] >= 0) {
              if (((dw) this).field_i[var4] < var3) {
                var2 = var4;
                var3 = ((dw) this).field_i[var4];
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

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((dw) this).field_b.field_o[((dw) this).field_b.field_q];
          if (var2 >= 0) {
            var2 = ((dw) this).field_h[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((dw) this).field_h[param0] = var2;
            ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + 1;
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
          var3 = ((dw) this).field_b.h(-16);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((dw) this).field_b.field_o[((dw) this).field_b.field_q] & 255;
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
              ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + 1;
              ((dw) this).field_h[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((dw) this).field_b.field_q = ((dw) this).field_b.field_q + var3;
        return 0;
    }

    public static void c() {
        field_f = null;
    }

    final void f() {
        ((dw) this).field_b.field_o = null;
        ((dw) this).field_a = null;
        ((dw) this).field_d = null;
        ((dw) this).field_i = null;
        ((dw) this).field_h = null;
    }

    dw() {
        ((dw) this).field_b = new vh((byte[]) null);
    }

    dw(byte[] param0) {
        ((dw) this).field_b = new vh((byte[]) null);
        ((dw) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
