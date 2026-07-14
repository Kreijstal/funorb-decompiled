/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private static byte[] field_i;
    private wk field_a;
    private int[] field_f;
    private int[] field_e;
    private long field_g;
    private int field_b;
    int field_h;
    int[] field_d;
    private int[] field_c;

    public static void b() {
        field_i = null;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((en) this).field_c.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((en) this).field_c[var4] >= 0) {
              if (((en) this).field_d[var4] < var3) {
                var2 = var4;
                var3 = ((en) this).field_d[var4];
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

    final void c() {
        ((en) this).field_a.field_j = null;
        ((en) this).field_f = null;
        ((en) this).field_c = null;
        ((en) this).field_d = null;
        ((en) this).field_e = null;
    }

    final void a(int param0) {
        int var2 = ((en) this).field_a.a(32);
        ((en) this).field_d[param0] = ((en) this).field_d[param0] + var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((en) this).field_a.field_j = param0;
        ((en) this).field_a.field_g = 10;
        int var2 = ((en) this).field_a.n(-98);
        ((en) this).field_h = ((en) this).field_a.n(-98);
        ((en) this).field_b = 500000;
        ((en) this).field_f = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((en) this).field_a.d(-10674);
            var5 = ((en) this).field_a.d(-10674);
            if (var4 == 1297379947) {
                ((en) this).field_f[var3] = ((en) this).field_a.field_g;
                var3++;
            }
            ((en) this).field_a.field_g = ((en) this).field_a.field_g + var5;
        }
        ((en) this).field_g = 0L;
        ((en) this).field_c = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((en) this).field_c[var6] = ((en) this).field_f[var6];
            var6++;
        }
        ((en) this).field_d = new int[var2];
        ((en) this).field_e = new int[var2];
    }

    final void g() {
        ((en) this).field_a.field_g = -1;
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((en) this).field_a.field_j[((en) this).field_a.field_g];
          if (var2 >= 0) {
            var2 = ((en) this).field_e[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((en) this).field_e[param0] = var2;
            ((en) this).field_a.field_g = ((en) this).field_a.field_g + 1;
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
          var3 = ((en) this).field_a.a(69);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((en) this).field_a.field_j[((en) this).field_a.field_g] & 255;
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
              ((en) this).field_a.field_g = ((en) this).field_a.field_g + 1;
              ((en) this).field_e[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((en) this).field_a.field_g = ((en) this).field_a.field_g + var3;
        return 0;
    }

    final long b(int param0) {
        return ((en) this).field_g + (long)param0 * (long)((en) this).field_b;
    }

    final boolean e() {
        return ((en) this).field_a.field_j != null;
    }

    final void c(int param0) {
        ((en) this).field_c[param0] = ((en) this).field_a.field_g;
    }

    final void f(int param0) {
        ((en) this).field_a.field_g = ((en) this).field_c[param0];
    }

    final int d() {
        return ((en) this).field_c.length;
    }

    final void a(long param0) {
        int var4 = 0;
        ((en) this).field_g = param0;
        int var3 = ((en) this).field_c.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((en) this).field_d[var4] = 0;
            ((en) this).field_e[var4] = 0;
            ((en) this).field_a.field_g = ((en) this).field_f[var4];
            ((en) this).a(var4);
            ((en) this).field_c[var4] = ((en) this).field_a.field_g;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((en) this).field_a.e((byte) -92);
            var4 = ((en) this).field_a.a(124);
            if (var3 == 47) {
                ((en) this).field_a.field_g = ((en) this).field_a.field_g + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((en) this).field_a.h(11609);
                var4 -= 3;
                var6 = ((en) this).field_d[param0];
                ((en) this).field_g = ((en) this).field_g + (long)var6 * (long)(((en) this).field_b - var5);
                ((en) this).field_b = var5;
                ((en) this).field_a.field_g = ((en) this).field_a.field_g + var4;
                return 2;
            }
            ((en) this).field_a.field_g = ((en) this).field_a.field_g + var4;
            return 3;
        }
        var3 = field_i[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((en) this).field_a.e((byte) 105) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((en) this).field_a.e((byte) -94) << 16;
        }
        return var4;
    }

    final int d(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = ((en) this).field_c.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((en) this).field_c[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    en() {
        ((en) this).field_a = new wk((byte[]) null);
    }

    en(byte[] param0) {
        ((en) this).field_a = new wk((byte[]) null);
        ((en) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
