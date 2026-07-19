/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    private qc field_g;
    private int[] field_e;
    int[] field_a;
    int field_d;
    private static byte[] field_f;
    private int[] field_i;
    private int field_b;
    private int[] field_c;
    private long field_h;

    final void f(int param0) {
        int var2 = this.field_g.g((byte) -122);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    final void d() {
        this.field_g.field_f = -1;
    }

    final void b(int param0) {
        this.field_e[param0] = this.field_g.field_f;
    }

    final boolean e() {
        int var2 = 0;
        int var1 = this.field_e.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (this.field_e[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void b() {
        field_f = null;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_h = param0;
        int var3 = this.field_e.length;
        for (var4 = 0; var4 < var3; var4++) {
            this.field_a[var4] = 0;
            this.field_c[var4] = 0;
            this.field_g.field_f = this.field_i[var4];
            this.f(var4);
            this.field_e[var4] = this.field_g.field_f;
        }
    }

    final void a() {
        this.field_g.field_j = null;
        this.field_i = null;
        this.field_e = null;
        this.field_a = null;
        this.field_c = null;
    }

    final long d(int param0) {
        return this.field_h + (long)param0 * (long)this.field_b;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 == 255) {
            var3 = this.field_g.c((byte) 34);
            var4 = this.field_g.g((byte) -110);
            if (var3 == 47) {
                this.field_g.field_f = this.field_g.field_f + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = this.field_g.e(110);
                var4 -= 3;
                var6 = this.field_a[param0];
                this.field_h = this.field_h + (long)var6 * (long)(this.field_b - var5);
                this.field_b = var5;
                this.field_g.field_f = this.field_g.field_f + var4;
                return 2;
            }
            this.field_g.field_f = this.field_g.field_f + var4;
            return 3;
        }
        var3 = field_f[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | this.field_g.c((byte) 34) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | this.field_g.c((byte) 34) << 16;
        }
        return var4;
    }

    final boolean f() {
        return this.field_g.field_j != null;
    }

    final int c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = this.field_e.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (this.field_e[var4] >= 0) {
              if (this.field_a[var4] < var3) {
                var2 = var4;
                var3 = this.field_a[var4];
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
        this.field_g.field_f = this.field_e[param0];
    }

    final int e(int param0) {
        int var2 = this.c(param0);
        return var2;
    }

    final int g() {
        return this.field_e.length;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        this.field_g.field_j = param0;
        this.field_g.field_f = 10;
        int var2 = this.field_g.b(true);
        this.field_d = this.field_g.b(true);
        this.field_b = 500000;
        this.field_i = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = this.field_g.a((byte) -98);
            var5 = this.field_g.a((byte) -87);
            if (var4 == 1297379947) {
                this.field_i[var3] = this.field_g.field_f;
                var3++;
            }
            this.field_g.field_f = this.field_g.field_f + var5;
        }
        this.field_h = 0L;
        this.field_e = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            this.field_e[var6] = this.field_i[var6];
            var6++;
        }
        this.field_a = new int[var2];
        this.field_c = new int[var2];
    }

    private final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_g.field_j[this.field_g.field_f];
          if (var2 >= 0) {
            var2 = this.field_c[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            this.field_c[param0] = var2;
            this.field_g.field_f = this.field_g.field_f + 1;
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
          var3 = this.field_g.g((byte) -109);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = this.field_g.field_j[this.field_g.field_f] & 255;
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
              this.field_g.field_f = this.field_g.field_f + 1;
              this.field_c[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        this.field_g.field_f = this.field_g.field_f + var3;
        return 0;
    }

    jb() {
        this.field_g = new qc((byte[]) null);
    }

    jb(byte[] param0) {
        this.field_g = new qc((byte[]) null);
        this.a(param0);
    }

    static {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
