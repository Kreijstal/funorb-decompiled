/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vga {
    private static byte[] field_f;
    private lu field_g;
    private int field_h;
    int[] field_i;
    private long field_e;
    private int[] field_d;
    int field_a;
    private int[] field_b;
    private int[] field_c;

    public static void b() {
        field_f = null;
    }

    final int c() {
        return this.field_b.length;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_g.b(16711935);
            var4 = this.field_g.d(-1);
            if (var3 == 47) {
                this.field_g.field_g = this.field_g.field_g + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_g.a(3);
                var4 -= 3;
                var6 = this.field_i[param0];
                this.field_e = this.field_e + (long)var6 * (long)(this.field_h - var5);
                this.field_h = var5;
                this.field_g.field_g = this.field_g.field_g + var4;
                return 2;
            }
            this.field_g.field_g = this.field_g.field_g + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_g.b(16711935) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_g.b(16711935) << 16;
        }
        return var4;
    }

    final void c(int param0) {
        this.field_g.field_g = this.field_b[param0];
    }

    final void a() {
        this.field_g.field_h = null;
        this.field_c = null;
        this.field_b = null;
        this.field_i = null;
        this.field_d = null;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_g.field_h = param0;
        this.field_g.field_g = 10;
        int var2 = this.field_g.e((byte) 126);
        this.field_a = this.field_g.e((byte) 110);
        this.field_h = 500000;
        this.field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_g.f(80);
            var5 = this.field_g.f(-95);
            if (var4 == 1297379947) {
                this.field_c[var3] = this.field_g.field_g;
                var3++;
            }
            this.field_g.field_g = this.field_g.field_g + var5;
        }
        this.field_e = 0L;
        this.field_b = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_b[var6] = this.field_c[var6];
            var6++;
        }
        this.field_i = new int[var2];
        this.field_d = new int[var2];
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_g.field_h[this.field_g.field_g];
          if (var2 >= 0) {
            var2 = this.field_d[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_d[param0] = var2;
            this.field_g.field_g = this.field_g.field_g + 1;
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
          var3 = this.field_g.d(-1);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_g.field_h[this.field_g.field_g] & 255;
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
              this.field_g.field_g = this.field_g.field_g + 1;
              this.field_d[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_g.field_g = this.field_g.field_g + var3;
        return 0;
    }

    final void e(int param0) {
        int var2 = this.field_g.d(-1);
        this.field_i[param0] = this.field_i[param0] + var2;
    }

    final boolean e() {
        int var2 = 0;
        int var1 = this.field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_b[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final boolean f() {
        return this.field_g.field_h != null;
    }

    final void f(int param0) {
        this.field_b[param0] = this.field_g.field_g;
    }

    final void d() {
        this.field_g.field_g = -1;
    }

    final long b(int param0) {
        return this.field_e + (long)param0 * (long)this.field_h;
    }

    final int g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_b.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_b[var4] >= 0) {
              if (this.field_i[var4] < var3) {
                var2 = var4;
                var3 = this.field_i[var4];
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

    final void a(long param0) {
        int var4 = 0;
        this.field_e = param0;
        int var3 = this.field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_i[var4] = 0;
            this.field_d[var4] = 0;
            this.field_g.field_g = this.field_c[var4];
            this.e(var4);
            this.field_b[var4] = this.field_g.field_g;
        }
    }

    final int a(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    vga() {
        this.field_g = new lu((byte[]) null);
    }

    vga(byte[] param0) {
        this.field_g = new lu((byte[]) null);
        this.a(param0);
    }

    static {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
