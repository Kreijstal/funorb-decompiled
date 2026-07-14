/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    private wf field_d;
    private static byte[] field_c;
    int[] field_a;
    private int[] field_b;
    private int[] field_f;
    private int field_i;
    private long field_h;
    private int[] field_g;
    int field_e;

    final boolean d() {
        return ((ek) this).field_d.field_j != null;
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((ek) this).field_d.field_j[((ek) this).field_d.field_h];
          if (var2 >= 0) {
            var2 = ((ek) this).field_f[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((ek) this).field_f[param0] = var2;
            ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + 1;
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
          var3 = ((ek) this).field_d.g((byte) -104);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((ek) this).field_d.field_j[((ek) this).field_d.field_h] & 255;
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
              ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + 1;
              ((ek) this).field_f[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + var3;
        return 0;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((ek) this).field_d.field_j = param0;
        ((ek) this).field_d.field_h = 10;
        int var2 = ((ek) this).field_d.b(-1698573656);
        ((ek) this).field_e = ((ek) this).field_d.b(-1698573656);
        ((ek) this).field_i = 500000;
        ((ek) this).field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((ek) this).field_d.d((byte) 19);
            var5 = ((ek) this).field_d.d((byte) 19);
            if (var4 == 1297379947) {
                ((ek) this).field_g[var3] = ((ek) this).field_d.field_h;
                var3++;
            }
            ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + var5;
        }
        ((ek) this).field_h = 0L;
        ((ek) this).field_b = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((ek) this).field_b[var6] = ((ek) this).field_g[var6];
            var6++;
        }
        ((ek) this).field_a = new int[var2];
        ((ek) this).field_f = new int[var2];
    }

    final void a(long param0) {
        int var4 = 0;
        ((ek) this).field_h = param0;
        int var3 = ((ek) this).field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((ek) this).field_a[var4] = 0;
            ((ek) this).field_f[var4] = 0;
            ((ek) this).field_d.field_h = ((ek) this).field_g[var4];
            ((ek) this).a(var4);
            ((ek) this).field_b[var4] = ((ek) this).field_d.field_h;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((ek) this).field_d.d(true);
            var4 = ((ek) this).field_d.g((byte) -104);
            if (var3 == 47) {
                ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((ek) this).field_d.a(78);
                var4 -= 3;
                var6 = ((ek) this).field_a[param0];
                ((ek) this).field_h = ((ek) this).field_h + (long)var6 * (long)(((ek) this).field_i - var5);
                ((ek) this).field_i = var5;
                ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + var4;
                return 2;
            }
            ((ek) this).field_d.field_h = ((ek) this).field_d.field_h + var4;
            return 3;
        }
        var3 = field_c[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((ek) this).field_d.d(true) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((ek) this).field_d.d(true) << 16;
        }
        return var4;
    }

    final void a(int param0) {
        int var2 = ((ek) this).field_d.g((byte) -82);
        ((ek) this).field_a[param0] = ((ek) this).field_a[param0] + var2;
    }

    final void f() {
        ((ek) this).field_d.field_h = -1;
    }

    final void g() {
        ((ek) this).field_d.field_j = null;
        ((ek) this).field_g = null;
        ((ek) this).field_b = null;
        ((ek) this).field_a = null;
        ((ek) this).field_f = null;
    }

    final boolean c() {
        int var2 = 0;
        int var1 = ((ek) this).field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((ek) this).field_b[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void b() {
        field_c = null;
    }

    final int e() {
        return ((ek) this).field_b.length;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((ek) this).field_b.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((ek) this).field_b[var4] >= 0) {
              if (((ek) this).field_a[var4] < var3) {
                var2 = var4;
                var3 = ((ek) this).field_a[var4];
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

    final int f(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final void b(int param0) {
        ((ek) this).field_b[param0] = ((ek) this).field_d.field_h;
    }

    final void c(int param0) {
        ((ek) this).field_d.field_h = ((ek) this).field_b[param0];
    }

    final long d(int param0) {
        return ((ek) this).field_h + (long)param0 * (long)((ek) this).field_i;
    }

    ek() {
        ((ek) this).field_d = new wf((byte[]) null);
    }

    ek(byte[] param0) {
        ((ek) this).field_d = new wf((byte[]) null);
        ((ek) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
