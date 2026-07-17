/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    private p field_c;
    private static byte[] field_e;
    private int field_g;
    private int[] field_i;
    int[] field_d;
    private int[] field_f;
    private long field_a;
    private int[] field_b;
    int field_h;

    final boolean b() {
        int var2 = 0;
        int var1 = ((al) this).field_f.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((al) this).field_f[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((al) this).field_c.field_o = param0;
        ((al) this).field_c.field_l = 10;
        int var2 = ((al) this).field_c.f(674914976);
        ((al) this).field_h = ((al) this).field_c.f(674914976);
        ((al) this).field_g = 500000;
        ((al) this).field_i = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((al) this).field_c.e((byte) -116);
            var5 = ((al) this).field_c.e((byte) -125);
            if (var4 == 1297379947) {
                ((al) this).field_i[var3] = ((al) this).field_c.field_l;
                var3++;
            }
            ((al) this).field_c.field_l = ((al) this).field_c.field_l + var5;
        }
        ((al) this).field_a = 0L;
        ((al) this).field_f = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((al) this).field_f[var6] = ((al) this).field_i[var6];
            var6++;
        }
        ((al) this).field_d = new int[var2];
        ((al) this).field_b = new int[var2];
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((al) this).field_c.field_o[((al) this).field_c.field_l];
          if (var2 >= 0) {
            var2 = ((al) this).field_b[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((al) this).field_b[param0] = var2;
            ((al) this).field_c.field_l = ((al) this).field_c.field_l + 1;
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
          var3 = ((al) this).field_c.c((byte) -50);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((al) this).field_c.field_o[((al) this).field_c.field_l] & 255;
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
              ((al) this).field_c.field_l = ((al) this).field_c.field_l + 1;
              ((al) this).field_b[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((al) this).field_c.field_l = ((al) this).field_c.field_l + var3;
        return 0;
    }

    final void a() {
        ((al) this).field_c.field_l = -1;
    }

    final void c(int param0) {
        int var2 = ((al) this).field_c.c((byte) 121);
        ((al) this).field_d[param0] = ((al) this).field_d[param0] + var2;
    }

    final int c() {
        return ((al) this).field_f.length;
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((al) this).field_f.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((al) this).field_f[var4] >= 0) {
              if (((al) this).field_d[var4] < var3) {
                var2 = var4;
                var3 = ((al) this).field_d[var4];
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
        ((al) this).field_a = param0;
        int var3 = ((al) this).field_f.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((al) this).field_d[var4] = 0;
            ((al) this).field_b[var4] = 0;
            ((al) this).field_c.field_l = ((al) this).field_i[var4];
            ((al) this).c(var4);
            ((al) this).field_f[var4] = ((al) this).field_c.field_l;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((al) this).field_c.i(-115);
            var4 = ((al) this).field_c.c((byte) -111);
            if (var3 == 47) {
                ((al) this).field_c.field_l = ((al) this).field_c.field_l + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((al) this).field_c.k(1389913160);
                var4 -= 3;
                var6 = ((al) this).field_d[param0];
                ((al) this).field_a = ((al) this).field_a + (long)var6 * (long)(((al) this).field_g - var5);
                ((al) this).field_g = var5;
                ((al) this).field_c.field_l = ((al) this).field_c.field_l + var4;
                return 2;
            }
            ((al) this).field_c.field_l = ((al) this).field_c.field_l + var4;
            return 3;
        }
        var3 = field_e[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((al) this).field_c.i(-83) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((al) this).field_c.i(-122) << 16;
        }
        return var4;
    }

    final boolean e() {
        return ((al) this).field_c.field_o != null;
    }

    final int a(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final long f(int param0) {
        return ((al) this).field_a + (long)param0 * (long)((al) this).field_g;
    }

    final void d(int param0) {
        ((al) this).field_c.field_l = ((al) this).field_f[param0];
    }

    public static void d() {
        field_e = null;
    }

    final void b(int param0) {
        ((al) this).field_f[param0] = ((al) this).field_c.field_l;
    }

    final void g() {
        ((al) this).field_c.field_o = null;
        ((al) this).field_i = null;
        ((al) this).field_f = null;
        ((al) this).field_d = null;
        ((al) this).field_b = null;
    }

    al() {
        ((al) this).field_c = new p((byte[]) null);
    }

    al(byte[] param0) {
        ((al) this).field_c = new p((byte[]) null);
        ((al) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
