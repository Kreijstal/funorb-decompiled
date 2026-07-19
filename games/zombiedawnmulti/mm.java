/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    private static byte[] field_c;
    private k field_f;
    int[] field_h;
    private int[] field_d;
    private int[] field_i;
    private int field_e;
    int field_g;
    private int[] field_a;
    private long field_b;

    private final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_f.field_m[this.field_f.field_j];
          if (var2 >= 0) {
            var2 = this.field_d[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_d[param0] = var2;
            this.field_f.field_j = this.field_f.field_j + 1;
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
          var3 = this.field_f.a(0);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_f.field_m[this.field_f.field_j] & 255;
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
              this.field_f.field_j = this.field_f.field_j + 1;
              this.field_d[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_f.field_j = this.field_f.field_j + var3;
        return 0;
    }

    final long f(int param0) {
        return this.field_b + (long)param0 * (long)this.field_e;
    }

    public static void d() {
        field_c = null;
    }

    final boolean b() {
        return this.field_f.field_m != null;
    }

    final void b(int param0) {
        this.field_f.field_j = this.field_a[param0];
    }

    final int a(int param0) {
        int var2 = this.c(param0);
        return var2;
    }

    final void e(int param0) {
        this.field_a[param0] = this.field_f.field_j;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_f.field_m = param0;
        this.field_f.field_j = 10;
        int var2 = this.field_f.d((byte) 69);
        this.field_g = this.field_f.d((byte) 69);
        this.field_e = 500000;
        this.field_i = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_f.i(-1478490344);
            var5 = this.field_f.i(-1478490344);
            if (var4 == 1297379947) {
                this.field_i[var3] = this.field_f.field_j;
                var3++;
            }
            this.field_f.field_j = this.field_f.field_j + var5;
        }
        this.field_b = 0L;
        this.field_a = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_a[var6] = this.field_i[var6];
            var6++;
        }
        this.field_h = new int[var2];
        this.field_d = new int[var2];
    }

    final int g() {
        return this.field_a.length;
    }

    final void e() {
        this.field_f.field_j = -1;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_b = param0;
        int var3 = this.field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_h[var4] = 0;
            this.field_d[var4] = 0;
            this.field_f.field_j = this.field_i[var4];
            this.d(var4);
            this.field_a[var4] = this.field_f.field_j;
        }
    }

    final boolean c() {
        int var2 = 0;
        int var1 = this.field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_a[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_a.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_a[var4] >= 0) {
              if (this.field_h[var4] < var3) {
                var2 = var4;
                var3 = this.field_h[var4];
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

    final void f() {
        this.field_f.field_m = null;
        this.field_i = null;
        this.field_a = null;
        this.field_h = null;
        this.field_d = null;
    }

    final void d(int param0) {
        int var2 = this.field_f.a(0);
        this.field_h[param0] = this.field_h[param0] + var2;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_f.g(31365);
            var4 = this.field_f.a(0);
            if (var3 == 47) {
                this.field_f.field_j = this.field_f.field_j + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_f.e(128);
                var4 -= 3;
                var6 = this.field_h[param0];
                this.field_b = this.field_b + (long)var6 * (long)(this.field_e - var5);
                this.field_e = var5;
                this.field_f.field_j = this.field_f.field_j + var4;
                return 2;
            }
            this.field_f.field_j = this.field_f.field_j + var4;
            return 3;
        }
        var3 = field_c[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_f.g(31365) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_f.g(31365) << 16;
        }
        return var4;
    }

    mm() {
        this.field_f = new k((byte[]) null);
    }

    mm(byte[] param0) {
        this.field_f = new k((byte[]) null);
        this.a(param0);
    }

    static {
        field_c = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
