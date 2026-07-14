/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private double[] field_c;
    static ok field_l;
    static String field_i;
    static int field_g;
    private double[] field_b;
    private int[] field_f;
    static int field_a;
    private int[] field_k;
    static int field_j;
    private double[] field_e;
    private int field_d;
    static String field_h;

    public static void b(int param0) {
        field_i = null;
        if (param0 < 9) {
            field_a = 88;
            field_h = null;
            field_l = null;
            return;
        }
        field_h = null;
        field_l = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (30 <= var2) {
            var3 = 39 / ((param0 - 56) / 63);
            return;
          } else {
            if (((hi) this).field_c[var2] >= 0.0) {
              if ((((hi) this).field_k[var2] ^ -1) <= -1) {
                if (5.0 < ((hi) this).field_b[var2]) {
                  if (((hi) this).field_e[var2] > 5.0) {
                    wj.c((int)((hi) this).field_b[var2], (int)((hi) this).field_e[var2], (int)((hi) this).field_c[var2], ((hi) this).field_f[var2], ((hi) this).field_k[var2]);
                    var2++;
                    continue L0;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                var2++;
                continue L0;
              }
            } else {
              var2++;
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, double param2, double param3, int param4, double param5, double param6, double param7, int param8) {
        int var15 = 0;
        int var16 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != 30) {
          L0: {
            field_l = null;
            var15 = 0;
            if (-30 >= (var15 ^ -1)) {
              break L0;
            } else {
              L1: {
                L2: {
                  ((hi) this).field_c[var15] = ((hi) this).field_c[var15 + 1] + (double)((hi) this).field_d * Math.random();
                  ((hi) this).field_k[var15] = ((hi) this).field_k[1 + var15] + -(((hi) this).field_d * 4);
                  if (0.0 >= ((hi) this).field_c[var15]) {
                    var15++;
                    break L2;
                  } else {
                    if ((((hi) this).field_k[var15] ^ -1) < -1) {
                      ((hi) this).field_b[var15] = ((hi) this).field_b[var15 + 1] + param6 * Math.random() + (-1.0 + 2.99 * Math.random());
                      ((hi) this).field_e[var15] = ((hi) this).field_e[var15 - -1] + Math.random() * param5 - (2.0 * (Math.random() + Math.random() + Math.random()) - 3.0);
                      ((hi) this).field_f[var15] = ((hi) this).field_f[1 + var15];
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var15++;
                break L1;
              }
              var15++;
              var15++;
              var15++;
              var15++;
              break L0;
            }
          }
          ((hi) this).field_b[29] = param7;
          ((hi) this).field_e[29] = param3;
          ((hi) this).field_c[29] = param2;
          ((hi) this).field_f[29] = param0;
          ((hi) this).field_k[29] = param8;
          return;
        } else {
          var15 = 0;
          L3: while (true) {
            if (-30 >= (var15 ^ -1)) {
              ((hi) this).field_b[29] = param7;
              ((hi) this).field_e[29] = param3;
              ((hi) this).field_c[29] = param2;
              ((hi) this).field_f[29] = param0;
              ((hi) this).field_k[29] = param8;
              return;
            } else {
              ((hi) this).field_c[var15] = ((hi) this).field_c[var15 + 1] + (double)((hi) this).field_d * Math.random();
              ((hi) this).field_k[var15] = ((hi) this).field_k[1 + var15] + -(((hi) this).field_d * 4);
              if (0.0 < ((hi) this).field_c[var15]) {
                if ((((hi) this).field_k[var15] ^ -1) < -1) {
                  ((hi) this).field_b[var15] = ((hi) this).field_b[var15 + 1] + param6 * Math.random() + (-1.0 + 2.99 * Math.random());
                  ((hi) this).field_e[var15] = ((hi) this).field_e[var15 - -1] + Math.random() * param5 - (2.0 * (Math.random() + Math.random() + Math.random()) - 3.0);
                  ((hi) this).field_f[var15] = ((hi) this).field_f[1 + var15];
                  var15++;
                  continue L3;
                } else {
                  var15++;
                  var15++;
                  continue L3;
                }
              } else {
                var15++;
                var15++;
                continue L3;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        if (-1 > (param0 ^ -1)) {
          if (!b.a(98, param0)) {
            var3 = -(int)(4294967296L % (long)param0) + -2147483648;
            L0: while (true) {
              var4 = param2.nextInt();
              if (var4 < var3) {
                if (param1 != 4) {
                  return 120;
                } else {
                  return DrPhlogistonSavesTheEarth.a(var4, param0, param1 + 172);
                }
              } else {
                continue L0;
              }
            }
          } else {
            return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> -1132797152);
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    hi(int param0) {
        int var2 = 0;
        ((hi) this).field_c = new double[30];
        ((hi) this).field_k = new int[30];
        ((hi) this).field_b = new double[30];
        ((hi) this).field_f = new int[30];
        ((hi) this).field_e = new double[30];
        for (var2 = 0; 30 > var2; var2++) {
            ((hi) this).field_b[var2] = -1.0;
            ((hi) this).field_e[var2] = -1.0;
            ((hi) this).field_c[var2] = -1.0;
            ((hi) this).field_f[var2] = -1;
            ((hi) this).field_k[var2] = 128;
        }
        ((hi) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "You have <%0> unread messages!";
        field_h = "Try again";
    }
}
