/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private ed field_f;
    private static byte[] field_e;
    private long field_h;
    private int field_d;
    private int[] field_i;
    int field_c;
    int[] field_b;
    private int[] field_g;
    private int[] field_a;

    final boolean f() {
        return this.field_f.field_p != null;
    }

    final void e(int param0) {
        int var2 = this.field_f.a(false);
        this.field_b[param0] = this.field_b[param0] + var2;
    }

    public static void g() {
        field_e = null;
    }

    final void d() {
        this.field_f.field_u = -1;
    }

    final void d(int param0) {
        this.field_g[param0] = this.field_f.field_u;
    }

    final int c() {
        return this.field_g.length;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_f.field_p[this.field_f.field_u];
          if (var2 >= 0) {
            var2 = this.field_i[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_i[param0] = var2;
            this.field_f.field_u = this.field_f.field_u + 1;
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
          var3 = this.field_f.a(false);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_f.field_p[this.field_f.field_u] & 255;
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
              this.field_f.field_u = this.field_f.field_u + 1;
              this.field_i[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_f.field_u = this.field_f.field_u + var3;
        return 0;
    }

    final void b(long param0) {
        int var4 = 0;
        this.field_h = param0;
        int var3 = this.field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_b[var4] = 0;
            this.field_i[var4] = 0;
            this.field_f.field_u = this.field_a[var4];
            this.e(var4);
            this.field_g[var4] = this.field_f.field_u;
        }
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_f.h(-11);
            var4 = this.field_f.a(false);
            if (var3 == 47) {
                this.field_f.field_u = this.field_f.field_u + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_f.m(0);
                var4 -= 3;
                var6 = this.field_b[param0];
                this.field_h = this.field_h + (long)var6 * (long)(this.field_d - var5);
                this.field_d = var5;
                this.field_f.field_u = this.field_f.field_u + var4;
                return 2;
            }
            this.field_f.field_u = this.field_f.field_u + var4;
            return 3;
        }
        var3 = field_e[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_f.h(-11) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_f.h(-11) << 16;
        }
        return var4;
    }

    final void b() {
        this.field_f.field_p = null;
        this.field_a = null;
        this.field_g = null;
        this.field_b = null;
        this.field_i = null;
    }

    final long b(int param0) {
        return this.field_h + (long)param0 * (long)this.field_d;
    }

    final int a(long param0) {
        long var3 = param0 - this.field_h;
        return (int)((var3 + (long)this.field_d - 1L) / (long)this.field_d);
    }

    final boolean e() {
        int var2 = 0;
        int var1 = this.field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_f.field_p = param0;
        this.field_f.field_u = 10;
        int var2 = this.field_f.a((byte) -11);
        this.field_c = this.field_f.a((byte) -11);
        this.field_d = 500000;
        this.field_a = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_f.b(true);
            var5 = this.field_f.b(true);
            if (var4 == 1297379947) {
                this.field_a[var3] = this.field_f.field_u;
                var3++;
            }
            this.field_f.field_u = this.field_f.field_u + var5;
        }
        this.field_h = 0L;
        this.field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_g[var6] = this.field_a[var6];
            var6++;
        }
        this.field_b = new int[var2];
        this.field_i = new int[var2];
    }

    final void a(int param0) {
        this.field_f.field_u = this.field_g[param0];
    }

    final int c(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_g.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_g[var4] >= 0) {
              if (this.field_b[var4] < var3) {
                var2 = var4;
                var3 = this.field_b[var4];
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

    qd() {
        this.field_f = new ed((byte[]) null);
    }

    qd(byte[] param0) {
        this.field_f = new ed((byte[]) null);
        this.a(param0);
    }

    static {
        field_e = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
