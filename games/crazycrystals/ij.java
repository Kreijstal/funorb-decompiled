/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ij extends jb {
    long field_k;
    ij field_g;
    ij field_j;
    private static long[] field_f;
    static boolean field_i;
    static boolean field_h;

    final static long a(boolean param0, CharSequence param1) {
        int var6 = CrazyCrystals.field_B;
        int var2 = param1.length();
        long var3 = 0L;
        int var5 = 0;
        if (!param0) {
            field_h = false;
        }
        while (var2 > var5) {
            var3 = (long)dg.a(param1.charAt(var5), 17176) + -var3 + (var3 << 36304645);
            var5++;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var4 = -2 + -param2 + param3.length;
        L0: while (true) {
          if (1 + param2 > var4) {
            var4 = param3.length - param2 + param1;
            L1: while (true) {
              if (var4 < 1 + param2) {
                var4 = param2 + 1;
                L2: while (true) {
                  if (var4 >= -1 + -param2 + param3.length) {
                    ja.a(param2, param3, param0, true, 1);
                    return;
                  } else {
                    var5 = 1 + param0;
                    L3: while (true) {
                      if (param3[0].length + -param0 + -1 <= var5) {
                        var4++;
                        continue L2;
                      } else {
                        param3[var4][var5] = param3[var4][var5].a(var4, param3, false, var5).c(-1);
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var5 = param0 - -1;
                L4: while (true) {
                  if (var5 >= param3[0].length - param0 - 1) {
                    var4--;
                    continue L1;
                  } else {
                    param3[var4][var5].a(param3, var5, var4, -100);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var5 = 1 + param0;
            L5: while (true) {
              if (-1 + -param0 + param3[0].length <= var5) {
                var4--;
                continue L0;
              } else {
                param3[var4][var5] = param3[var4][var5].a(110, var4, param3, var5);
                var5++;
                continue L5;
              }
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            ij.d(31);
        }
        field_f = null;
    }

    final void a(int param0) {
        if (!(null != ((ij) this).field_g)) {
            return;
        }
        ((ij) this).field_g.field_j = ((ij) this).field_j;
        ((ij) this).field_j.field_g = ((ij) this).field_g;
        if (param0 != 1) {
            ((ij) this).a(37);
        }
        ((ij) this).field_j = null;
        ((ij) this).field_g = null;
    }

    protected ij() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_f = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_h = false;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_f[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L ^ -1L) != -2L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1937250497 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
