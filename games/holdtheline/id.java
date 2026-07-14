/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    private th field_f;
    int[] field_c;
    private int[] field_e;
    int field_a;
    private long field_h;
    private int field_d;
    private int[] field_g;
    private static byte[] field_i;
    private int[] field_b;

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 255) {
            var3 = ((id) this).field_f.f((byte) -34);
            var4 = ((id) this).field_f.d((byte) -16);
            if (var3 == 47) {
                ((id) this).field_f.field_l = ((id) this).field_f.field_l + var4;
                return 1;
            }
            if (var3 == 81) {
                var5 = ((id) this).field_f.c(false);
                var4 -= 3;
                var6 = ((id) this).field_c[param0];
                ((id) this).field_h = ((id) this).field_h + (long)var6 * (long)(((id) this).field_d - var5);
                ((id) this).field_d = var5;
                ((id) this).field_f.field_l = ((id) this).field_f.field_l + var4;
                return 2;
            }
            ((id) this).field_f.field_l = ((id) this).field_f.field_l + var4;
            return 3;
        }
        var3 = field_i[param1 - 128];
        var4 = param1;
        if (var3 >= 1) {
            var4 = var4 | ((id) this).field_f.f((byte) -71) << 8;
        }
        if (var3 >= 2) {
            var4 = var4 | ((id) this).field_f.f((byte) -123) << 16;
        }
        return var4;
    }

    final int f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = ((id) this).field_e.length;
        var2 = -1;
        var3 = 2147483647;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var1) {
            return var2;
          } else {
            if (((id) this).field_e[var4] >= 0) {
              if (((id) this).field_c[var4] < var3) {
                var2 = var4;
                var3 = ((id) this).field_c[var4];
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

    final long a(int param0) {
        return ((id) this).field_h + (long)param0 * (long)((id) this).field_d;
    }

    final boolean e() {
        return ((id) this).field_f.field_i != null;
    }

    final void a(long param0) {
        int var4 = 0;
        ((id) this).field_h = param0;
        int var3 = ((id) this).field_e.length;
        for (var4 = 0; var4 < var3; var4++) {
            ((id) this).field_c[var4] = 0;
            ((id) this).field_g[var4] = 0;
            ((id) this).field_f.field_l = ((id) this).field_b[var4];
            ((id) this).c(var4);
            ((id) this).field_e[var4] = ((id) this).field_f.field_l;
        }
    }

    final void b() {
        ((id) this).field_f.field_i = null;
        ((id) this).field_b = null;
        ((id) this).field_e = null;
        ((id) this).field_c = null;
        ((id) this).field_g = null;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = ((id) this).field_e.length;
        for (var2 = 0; var2 < var1; var2++) {
            if (((id) this).field_e[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    final int a() {
        return ((id) this).field_e.length;
    }

    public static void d() {
        field_i = null;
    }

    final void e(int param0) {
        ((id) this).field_f.field_l = ((id) this).field_e[param0];
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((id) this).field_f.field_i[((id) this).field_f.field_l];
          if (var2 >= 0) {
            var2 = ((id) this).field_g[param0];
            break L0;
          } else {
            var2 = var2 & 255;
            ((id) this).field_g[param0] = var2;
            ((id) this).field_f.field_l = ((id) this).field_f.field_l + 1;
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
          var3 = ((id) this).field_f.d((byte) -23);
          if (var2 != 247) {
            break L2;
          } else {
            if (var3 <= 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var4 = ((id) this).field_f.field_i[((id) this).field_f.field_l] & 255;
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
              ((id) this).field_f.field_l = ((id) this).field_f.field_l + 1;
              ((id) this).field_g[param0] = var4;
              return this.a(param0, var4);
            }
          }
        }
        ((id) this).field_f.field_l = ((id) this).field_f.field_l + var3;
        return 0;
    }

    final void c() {
        ((id) this).field_f.field_l = -1;
    }

    final void d(int param0) {
        ((id) this).field_e[param0] = ((id) this).field_f.field_l;
    }

    final void c(int param0) {
        int var2 = ((id) this).field_f.d((byte) -127);
        ((id) this).field_c[param0] = ((id) this).field_c[param0] + var2;
    }

    final int b(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        ((id) this).field_f.field_i = param0;
        ((id) this).field_f.field_l = 10;
        int var2 = ((id) this).field_f.k(-94);
        ((id) this).field_a = ((id) this).field_f.k(113);
        ((id) this).field_d = 500000;
        ((id) this).field_b = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            var4 = ((id) this).field_f.a(104);
            var5 = ((id) this).field_f.a(-117);
            if (var4 == 1297379947) {
                ((id) this).field_b[var3] = ((id) this).field_f.field_l;
                var3++;
            }
            ((id) this).field_f.field_l = ((id) this).field_f.field_l + var5;
        }
        ((id) this).field_h = 0L;
        ((id) this).field_e = new int[var2];
        int var6 = 0;
        var3 = var6;
        while (var6 < var2) {
            ((id) this).field_e[var6] = ((id) this).field_b[var6];
            var6++;
        }
        ((id) this).field_c = new int[var2];
        ((id) this).field_g = new int[var2];
    }

    id() {
        ((id) this).field_f = new th((byte[]) null);
    }

    id(byte[] param0) {
        ((id) this).field_f = new th((byte[]) null);
        ((id) this).a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
