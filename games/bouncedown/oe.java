/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private wi field_i;
    private int[] field_h;
    int field_b;
    int[] field_d;
    private long field_c;
    private int[] field_a;
    private static byte[] field_g;
    private int field_f;
    private int[] field_e;

    final boolean d() {
        return ((oe) this).field_i.field_i != null;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((oe) this).field_i.field_i = param0;
        ((oe) this).field_i.field_h = 10;
        int var2 = ((oe) this).field_i.a(-1640531527);
        ((oe) this).field_b = ((oe) this).field_i.a(-1640531527);
        ((oe) this).field_f = 500000;
        ((oe) this).field_e = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((oe) this).field_i.j(-3);
            var5 = ((oe) this).field_i.j(-3);
            if (var4 == 1297379947) {
                ((oe) this).field_e[var3] = ((oe) this).field_i.field_h;
                var3++;
            }
            ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + var5;
        }
        ((oe) this).field_c = 0L;
        ((oe) this).field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((oe) this).field_a[var6] = ((oe) this).field_e[var6];
            var6++;
        }
        ((oe) this).field_d = new int[var2];
        ((oe) this).field_h = new int[var2];
    }

    final int d(int param0) {
        int var2 = this.b(param0);
        return var2;
    }

    final long f(int param0) {
        return ((oe) this).field_c + (long)param0 * (long)((oe) this).field_f;
    }

    final void e(int param0) {
        ((oe) this).field_i.field_h = ((oe) this).field_a[param0];
    }

    final int e() {
        return ((oe) this).field_a.length;
    }

    final void a(int param0) {
        int var2 = ((oe) this).field_i.d(-10937);
        ((oe) this).field_d[param0] = ((oe) this).field_d[param0] + var2;
    }

    public static void g() {
        field_g = null;
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((oe) this).field_i.field_i[((oe) this).field_i.field_h];
          if (var2 >= 0) {
            var2 = ((oe) this).field_h[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((oe) this).field_h[param0] = var2;
            ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + 1;
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
          var3 = ((oe) this).field_i.d(-10937);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((oe) this).field_i.field_i[((oe) this).field_i.field_h] & 255;
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
              ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + 1;
              ((oe) this).field_h[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + var3;
        return 0;
    }

    final boolean a() {
        int var2 = 0;
        int var1 = ((oe) this).field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((oe) this).field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void a(long param0) {
        int var4 = 0;
        ((oe) this).field_c = param0;
        int var3 = ((oe) this).field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((oe) this).field_d[var4] = 0;
            ((oe) this).field_h[var4] = 0;
            ((oe) this).field_i.field_h = ((oe) this).field_e[var4];
            ((oe) this).a(var4);
            ((oe) this).field_a[var4] = ((oe) this).field_i.field_h;
        }
    }

    oe() {
        ((oe) this).field_i = new wi((byte[]) null);
    }

    final void b() {
        ((oe) this).field_i.field_i = null;
        ((oe) this).field_e = null;
        ((oe) this).field_a = null;
        ((oe) this).field_d = null;
        ((oe) this).field_h = null;
    }

    final int c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((oe) this).field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((oe) this).field_a[var4] >= 0) {
              if (((oe) this).field_d[var4] < var3) {
                var2 = var4;
                var3 = ((oe) this).field_d[var4];
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

    oe(byte[] param0) {
        ((oe) this).field_i = new wi((byte[]) null);
        ((oe) this).a(param0);
    }

    final void f() {
        ((oe) this).field_i.field_h = -1;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((oe) this).field_i.d((byte) -124);
            var4 = ((oe) this).field_i.d(-10937);
            if (var3 == 47) {
                ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((oe) this).field_i.b((byte) -83);
                var4 -= 3;
                var6 = ((oe) this).field_d[param0];
                ((oe) this).field_c = ((oe) this).field_c + (long)var6 * (long)(((oe) this).field_f - var5);
                ((oe) this).field_f = var5;
                ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + var4;
                return 2;
            }
            ((oe) this).field_i.field_h = ((oe) this).field_i.field_h + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((oe) this).field_i.d((byte) -126) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((oe) this).field_i.d((byte) -87) << 16;
        }
        return var4;
    }

    final void c(int param0) {
        ((oe) this).field_a[param0] = ((oe) this).field_i.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
