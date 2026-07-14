/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends hl {
    static int[] field_F;
    int field_L;
    int field_N;
    static String[] field_O;
    static kc[] field_G;
    int field_M;
    static long[] field_J;
    int field_E;
    int field_I;
    int field_H;
    static char[] field_K;

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Main.field_T;
        if (param3 <= -14) {
          if (this.a(param0, param1, param2, -39, param4, param5, param6)) {
            var8 = -((se) this).field_o + -param0 - ((se) this).field_E + param2;
            var9 = -((se) this).field_i - param1 + -((se) this).field_M + param6;
            if (((se) this).field_H * ((se) this).field_H > var9 * var9 + var8 * var8) {
              var10 = Math.atan2((double)var9, (double)var8) - ta.field_Z;
              if (0.0 <= var10) {
                L0: {
                  if (var10 <= 0.0) {
                    break L0;
                  } else {
                    var10 = var10 + 3.141592653589793 / (double)((se) this).field_N;
                    break L0;
                  }
                }
                ((se) this).field_L = (int)(var10 * (double)((se) this).field_N / 6.283185307179586);
                L1: while (true) {
                  if (((se) this).field_L >= ((se) this).field_N) {
                    ((se) this).field_L = ((se) this).field_L - ((se) this).field_N;
                    continue L1;
                  } else {
                    L2: while (true) {
                      if (-1 >= (((se) this).field_L ^ -1)) {
                        return true;
                      } else {
                        ((se) this).field_L = ((se) this).field_L + ((se) this).field_N;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var10 = var10 - 3.141592653589793 / (double)((se) this).field_N;
                ((se) this).field_L = (int)(var10 * (double)((se) this).field_N / 6.283185307179586);
                L3: while (true) {
                  if (((se) this).field_L >= ((se) this).field_N) {
                    ((se) this).field_L = ((se) this).field_L - ((se) this).field_N;
                    continue L3;
                  } else {
                    L4: while (true) {
                      if (-1 >= (((se) this).field_L ^ -1)) {
                        return true;
                      } else {
                        ((se) this).field_L = ((se) this).field_L + ((se) this).field_N;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 < 52) {
            return;
        }
        field_O = null;
        field_G = null;
        field_J = null;
        field_K = null;
        field_F = null;
    }

    final static void e(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Main.field_T;
        var5 = tb.field_h;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        L0: while (true) {
          if (var2 >= var3) {
            if (param0 < 55) {
              field_K = (char[]) null;
              return;
            } else {
              return;
            }
          } else {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            continue L0;
          }
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_O = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_J = new long[1000];
        field_K = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
