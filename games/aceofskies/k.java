/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    private static byte[] field_d;
    private rb field_a;
    private int[] field_b;
    int[] field_f;
    private int field_i;
    int field_e;
    private long field_h;
    private int[] field_c;
    private int[] field_g;

    final void a(int param0) {
        this.field_a.field_g = this.field_g[param0];
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_h = param0;
        int var3 = this.field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_f[var4] = 0;
            this.field_b[var4] = 0;
            this.field_a.field_g = this.field_c[var4];
            this.c(var4);
            this.field_g[var4] = this.field_a.field_g;
        }
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_a.g(70);
            var4 = this.field_a.a(116);
            if (var3 == 47) {
                this.field_a.field_g = this.field_a.field_g + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_a.g((byte) -87);
                var4 -= 3;
                var6 = this.field_f[param0];
                this.field_h = this.field_h + (long)var6 * (long)(this.field_i - var5);
                this.field_i = var5;
                this.field_a.field_g = this.field_a.field_g + var4;
                return 2;
            }
            this.field_a.field_g = this.field_a.field_g + var4;
            return 3;
        }
        var3 = field_d[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_a.g(120) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_a.g(120) << 16;
        }
        return var4;
    }

    final long d(int param0) {
        return this.field_h + (long)param0 * (long)this.field_i;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_a.field_f = param0;
        this.field_a.field_g = 10;
        int var2 = this.field_a.i((byte) 0);
        this.field_e = this.field_a.i((byte) 0);
        this.field_i = 500000;
        this.field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_a.a((byte) 119);
            var5 = this.field_a.a((byte) 117);
            if (var4 == 1297379947) {
                this.field_c[var3] = this.field_a.field_g;
                var3++;
            }
            this.field_a.field_g = this.field_a.field_g + var5;
        }
        this.field_h = 0L;
        this.field_g = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_g[var6] = this.field_c[var6];
            var6++;
        }
        this.field_f = new int[var2];
        this.field_b = new int[var2];
    }

    final void c(int param0) {
        int var2 = this.field_a.a(121);
        this.field_f[param0] = this.field_f[param0] + var2;
    }

    final int e() {
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

    final boolean c() {
        return this.field_a.field_f != null;
    }

    final void d() {
        this.field_a.field_f = null;
        this.field_c = null;
        this.field_g = null;
        this.field_f = null;
        this.field_b = null;
    }

    final void f(int param0) {
        this.field_g[param0] = this.field_a.field_g;
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_a.field_f[this.field_a.field_g];
          if (var2 >= 0) {
            var2 = this.field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_b[param0] = var2;
            this.field_a.field_g = this.field_a.field_g + 1;
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
          var3 = this.field_a.a(121);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_a.field_f[this.field_a.field_g] & 255;
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
              this.field_a.field_g = this.field_a.field_g + 1;
              this.field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_a.field_g = this.field_a.field_g + var3;
        return 0;
    }

    final void a() {
        this.field_a.field_g = -1;
    }

    final int f() {
        return this.field_g.length;
    }

    final int e(int param0) {
        int var2 = this.b(param0);
        return var2;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = this.field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_g[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void b() {
        field_d = null;
    }

    k() {
        this.field_a = new rb((byte[]) null);
    }

    k(byte[] param0) {
        this.field_a = new rb((byte[]) null);
        this.a(param0);
    }

    static {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
