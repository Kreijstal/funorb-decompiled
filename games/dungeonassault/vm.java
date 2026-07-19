/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    private ec field_a;
    private static byte[] field_g;
    private long field_b;
    int[] field_d;
    private int[] field_e;
    private int[] field_i;
    private int field_h;
    int field_c;
    private int[] field_f;

    final void e() {
        this.field_a.field_o = -1;
    }

    final boolean g() {
        return this.field_a.field_m != null;
    }

    final void d(int param0) {
        this.field_a.field_o = this.field_f[param0];
    }

    final void c() {
        this.field_a.field_m = null;
        this.field_i = null;
        this.field_f = null;
        this.field_d = null;
        this.field_e = null;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_a.c(true);
            var4 = this.field_a.e(-651413500);
            if (var3 == 47) {
                this.field_a.field_o = this.field_a.field_o + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_a.f(-116);
                var4 -= 3;
                var6 = this.field_d[param0];
                this.field_b = this.field_b + (long)var6 * (long)(this.field_h - var5);
                this.field_h = var5;
                this.field_a.field_o = this.field_a.field_o + var4;
                return 2;
            }
            this.field_a.field_o = this.field_a.field_o + var4;
            return 3;
        }
        var3 = field_g[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_a.c(true) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_a.c(true) << 16;
        }
        return var4;
    }

    final void b(int param0) {
        int var2 = this.field_a.e(-651413500);
        this.field_d[param0] = this.field_d[param0] + var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_a.field_m = param0;
        this.field_a.field_o = 10;
        int var2 = this.field_a.k(0);
        this.field_c = this.field_a.k(0);
        this.field_h = 500000;
        this.field_i = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_a.h(-62);
            var5 = this.field_a.h(-61);
            if (var4 == 1297379947) {
                this.field_i[var3] = this.field_a.field_o;
                var3++;
            }
            this.field_a.field_o = this.field_a.field_o + var5;
        }
        this.field_b = 0L;
        this.field_f = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_f[var6] = this.field_i[var6];
            var6++;
        }
        this.field_d = new int[var2];
        this.field_e = new int[var2];
    }

    final int a() {
        return this.field_f.length;
    }

    final int b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_f.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_f[var4] >= 0) {
              if (this.field_d[var4] < var3) {
                var2 = var4;
                var3 = this.field_d[var4];
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

    final void a(int param0) {
        this.field_f[param0] = this.field_a.field_o;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_b = param0;
        int var3 = this.field_f.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_d[var4] = 0;
            this.field_e[var4] = 0;
            this.field_a.field_o = this.field_i[var4];
            this.b(var4);
            this.field_f[var4] = this.field_a.field_o;
        }
    }

    final int c(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_a.field_m[this.field_a.field_o];
          if (var2 >= 0) {
            var2 = this.field_e[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_e[param0] = var2;
            this.field_a.field_o = this.field_a.field_o + 1;
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
          var3 = this.field_a.e(-651413500);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_a.field_m[this.field_a.field_o] & 255;
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
              this.field_a.field_o = this.field_a.field_o + 1;
              this.field_e[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_a.field_o = this.field_a.field_o + var3;
        return 0;
    }

    public static void d() {
        field_g = null;
    }

    final long e(int param0) {
        return this.field_b + (long)param0 * (long)this.field_h;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = this.field_f.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_f[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    vm() {
        this.field_a = new ec((byte[]) null);
    }

    vm(byte[] param0) {
        this.field_a = new ec((byte[]) null);
        this.a(param0);
    }

    static {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
