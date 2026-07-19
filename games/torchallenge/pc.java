/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private uf field_c;
    private static byte[] field_g;
    private int[] field_i;
    int field_h;
    private int[] field_a;
    private int[] field_e;
    private long field_b;
    private int field_d;
    int[] field_f;

    public static void b() {
        field_g = null;
    }

    final boolean d() {
        return this.field_c.field_m != null;
    }

    final int c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_i.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_i[var4] >= 0) {
              if (this.field_f[var4] < var3) {
                var2 = var4;
                var3 = this.field_f[var4];
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

    final void e(int param0) {
        this.field_c.field_q = this.field_i[param0];
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_c.field_m = param0;
        this.field_c.field_q = 10;
        int var2 = this.field_c.c(false);
        this.field_h = this.field_c.c(false);
        this.field_d = 500000;
        this.field_e = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_c.i(123);
            var5 = this.field_c.i(67);
            if (var4 == 1297379947) {
                this.field_e[var3] = this.field_c.field_q;
                var3++;
            }
            this.field_c.field_q = this.field_c.field_q + var5;
        }
        this.field_b = 0L;
        this.field_i = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_i[var6] = this.field_e[var6];
            var6++;
        }
        this.field_f = new int[var2];
        this.field_a = new int[var2];
    }

    final boolean a() {
        int var2 = 0;
        int var1 = this.field_i.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_i[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int a(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void c(int param0) {
        int var2 = this.field_c.f(-10);
        this.field_f[param0] = this.field_f[param0] + var2;
    }

    final int f() {
        return this.field_i.length;
    }

    final long b(int param0) {
        return this.field_b + (long)param0 * (long)this.field_d;
    }

    final void e() {
        this.field_c.field_m = null;
        this.field_e = null;
        this.field_i = null;
        this.field_f = null;
        this.field_a = null;
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_c.field_m[this.field_c.field_q];
          if (var2 >= 0) {
            var2 = this.field_a[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_a[param0] = var2;
            this.field_c.field_q = this.field_c.field_q + 1;
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
          var3 = this.field_c.f(127);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_c.field_m[this.field_c.field_q] & 255;
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
              this.field_c.field_q = this.field_c.field_q + 1;
              this.field_a[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_c.field_q = this.field_c.field_q + var3;
        return 0;
    }

    final void g() {
        this.field_c.field_q = -1;
    }

    final void f(int param0) {
        this.field_i[param0] = this.field_c.field_q;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_b = param0;
        int var3 = this.field_i.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_f[var4] = 0;
            this.field_a[var4] = 0;
            this.field_c.field_q = this.field_e[var4];
            this.c(var4);
            this.field_i[var4] = this.field_c.field_q;
        }
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_c.j(-111);
            var4 = this.field_c.f(-124);
            if (var3 == 47) {
                this.field_c.field_q = this.field_c.field_q + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_c.g(0);
                var4 -= 3;
                var6 = this.field_f[param0];
                this.field_b = this.field_b + (long)var6 * (long)(this.field_d - var5);
                this.field_d = var5;
                this.field_c.field_q = this.field_c.field_q + var4;
                return 2;
            }
            this.field_c.field_q = this.field_c.field_q + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_c.j(-118) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_c.j(-108) << 16;
        }
        return var4;
    }

    pc() {
        this.field_c = new uf((byte[]) null);
    }

    pc(byte[] param0) {
        this.field_c = new uf((byte[]) null);
        this.a(param0);
    }

    static {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
