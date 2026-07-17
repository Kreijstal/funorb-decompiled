/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private static byte[] field_g;
    private dh field_a;
    private long field_i;
    private int[] field_d;
    int[] field_c;
    private int[] field_f;
    private int field_h;
    int field_e;
    private int[] field_b;

    final int f(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        ((fk) this).field_i = param0;
        int var3 = ((fk) this).field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((fk) this).field_c[var4] = 0;
            ((fk) this).field_f[var4] = 0;
            ((fk) this).field_a.field_k = ((fk) this).field_d[var4];
            ((fk) this).a(var4);
            ((fk) this).field_b[var4] = ((fk) this).field_a.field_k;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((fk) this).field_a.a(-16384);
            var4 = ((fk) this).field_a.i((byte) 13);
            if (var3 == 47) {
                ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((fk) this).field_a.d((byte) -116);
                var4 -= 3;
                var6 = ((fk) this).field_c[param0];
                ((fk) this).field_i = ((fk) this).field_i + (long)var6 * (long)(((fk) this).field_h - var5);
                ((fk) this).field_h = var5;
                ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + var4;
                return 2;
            }
            ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((fk) this).field_a.a(-16384) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((fk) this).field_a.a(-16384) << 16;
        }
        return var4;
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((fk) this).field_a.field_i[((fk) this).field_a.field_k];
          if (var2 >= 0) {
            var2 = ((fk) this).field_f[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((fk) this).field_f[param0] = var2;
            ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + 1;
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
          var3 = ((fk) this).field_a.i((byte) 13);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((fk) this).field_a.field_i[((fk) this).field_a.field_k] & 255;
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
              ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + 1;
              ((fk) this).field_f[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + var3;
        return 0;
    }

    final long b(int param0) {
        return ((fk) this).field_i + (long)param0 * (long)((fk) this).field_h;
    }

    final void c(int param0) {
        ((fk) this).field_a.field_k = ((fk) this).field_b[param0];
    }

    final boolean e() {
        return ((fk) this).field_a.field_i != null;
    }

    final void e(int param0) {
        ((fk) this).field_b[param0] = ((fk) this).field_a.field_k;
    }

    final void a(int param0) {
        int var2 = ((fk) this).field_a.i((byte) 13);
        ((fk) this).field_c[param0] = ((fk) this).field_c[param0] + var2;
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((fk) this).field_b.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((fk) this).field_b[var4] >= 0) {
              if (((fk) this).field_c[var4] < var3) {
                var2 = var4;
                var3 = ((fk) this).field_c[var4];
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
        ((fk) this).field_a.field_i = null;
        ((fk) this).field_d = null;
        ((fk) this).field_b = null;
        ((fk) this).field_c = null;
        ((fk) this).field_f = null;
    }

    final int g() {
        return ((fk) this).field_b.length;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((fk) this).field_a.field_i = param0;
        ((fk) this).field_a.field_k = 10;
        int var2 = ((fk) this).field_a.i(-25578);
        ((fk) this).field_e = ((fk) this).field_a.i(-25578);
        ((fk) this).field_h = 500000;
        ((fk) this).field_d = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((fk) this).field_a.f((byte) -107);
            var5 = ((fk) this).field_a.f((byte) -107);
            if (var4 == 1297379947) {
                ((fk) this).field_d[var3] = ((fk) this).field_a.field_k;
                var3++;
            }
            ((fk) this).field_a.field_k = ((fk) this).field_a.field_k + var5;
        }
        ((fk) this).field_i = 0L;
        ((fk) this).field_b = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((fk) this).field_b[var6] = ((fk) this).field_d[var6];
            var6++;
        }
        ((fk) this).field_c = new int[var2];
        ((fk) this).field_f = new int[var2];
    }

    final void d() {
        ((fk) this).field_a.field_k = -1;
    }

    final boolean b() {
        int var2 = 0;
        int var1 = ((fk) this).field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((fk) this).field_b[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void a() {
        field_g = null;
    }

    fk() {
        ((fk) this).field_a = new dh((byte[]) null);
    }

    fk(byte[] param0) {
        ((fk) this).field_a = new dh((byte[]) null);
        ((fk) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
