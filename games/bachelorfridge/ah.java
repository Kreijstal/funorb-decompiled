/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ah extends tia {
    private double field_m;
    private int field_i;
    private eaa field_n;
    static int field_l;
    private int field_j;
    private double field_k;

    private final int[] b(int param0) {
        if (param0 <= 31) {
            field_l = -48;
        }
        int[] var3 = new int[2];
        int[] var2 = var3;
        var3[1] = (int)(((ah) this).field_m * (double)(128 + -(((ah) this).field_g * 2)));
        var3[0] = (int)(((ah) this).field_k * (double)(128 - ((ah) this).field_g * 2));
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 25415) {
            return;
        }
        lr.a(65280, param2, 100, ((ah) this).field_n, param1 + 265923678, param0);
    }

    final boolean a(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var6 = 0;
        int var7 = 0;
        lh var8 = null;
        int var9 = 0;
        int[] var13 = null;
        var9 = BachelorFridge.field_y;
        ((ah) this).field_g = ((ah) this).field_g - 1;
        if ((((ah) this).field_g - 1 ^ -1) < -1) {
          L0: {
            if (param0 <= 0) {
              break L0;
            } else {
              boolean discarded$2 = ((ah) this).a(-70);
              break L0;
            }
          }
          L1: {
            if (((ah) this).field_g > 32) {
              var2 = 0;
              L2: while (true) {
                if ((var2 ^ -1) <= -3) {
                  break L1;
                } else {
                  var3 = -(3.141592653589793 * (double)((kla.a(50, ((ah) this).field_f, -2147483648) + 50 * (-1 + ((ah) this).field_j)) * 2) / 200.0 - 1.5707963267948966);
                  var13 = this.b(64);
                  var6 = var13[0] - -(kla.a(30, ((ah) this).field_f, -2147483648) + -15 >> 909556833);
                  var7 = var13[1] - -(kla.a(30, ((ah) this).field_f, -2147483648) - 15 >> 1240756449);
                  var8 = new lh(var6 << 353055460, 0, var7 << -1738651740);
                  int discarded$3 = kla.a(30, ((ah) this).field_f, -2147483648);
                  var8.field_p = 4 - kla.a(8, ((ah) this).field_f, -2147483648);
                  var8.field_k = -kla.a(8, ((ah) this).field_f, -2147483648) + 4;
                  var8.field_g = 4 + -kla.a(8, ((ah) this).field_f, -2147483648);
                  var8.field_m = -1;
                  var8.field_o = 32;
                  var8.field_l = 0;
                  var8.field_r = var3;
                  ((ah) this).field_n.a((bw) (Object) var8, true);
                  var2++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          gj.a((byte) 116, ((ah) this).field_n, ((ah) this).field_f, ((ah) this).field_g);
          return true;
        } else {
          return false;
        }
    }

    ah(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        L0: {
          ((ah) this).field_i = param3;
          ((ah) this).field_j = param2;
          ((ah) this).field_g = 64;
          ((ah) this).field_n = new eaa();
          ((ah) this).field_k = (double)(128 * ((ah) this).field_i / 64);
          ((ah) this).field_m = (double)(((ah) this).field_i * 64 / 64);
          if (-2 == (((ah) this).field_j ^ -1)) {
            ((ah) this).field_m = ((ah) this).field_m * -1.0;
            break L0;
          } else {
            if (((ah) this).field_j == -4) {
              ((ah) this).field_k = ((ah) this).field_k * -1.0;
              break L0;
            } else {
              if (-3 != ((ah) this).field_j) {
                break L0;
              } else {
                ((ah) this).field_m = ((ah) this).field_m * -1.0;
                ((ah) this).field_k = ((ah) this).field_k * -1.0;
                break L0;
              }
            }
          }
        }
    }

    final static String a(gs param0, byte param1) {
        String var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          var3 = -85 % ((param1 - -11) / 55);
          var2 = null;
          if (param0.field_e == null) {
            break L0;
          } else {
            L1: {
              var6 = param0.field_e;
              var2 = var6;
              var4 = var2;
              var2 = var6;
              if (-2 == (param0.field_b ^ -1)) {
                var2 = "<img=0>" + var6;
                break L1;
              } else {
                break L1;
              }
            }
            if (2 != param0.field_b) {
              break L0;
            } else {
              var2 = "<img=1>" + var2;
              var4 = var2;
              var4 = var2;
              break L0;
            }
          }
        }
        L2: {
          var4 = "";
          if (-3 != (param0.field_p ^ -1)) {
            L3: {
              if (param0.field_p != 0) {
                break L3;
              } else {
                if (am.field_O) {
                  var4 = "[" + cja.field_r + "] ";
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (1 == param0.field_p) {
                var4 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (4 != param0.field_p) {
                break L5;
              } else {
                if (jc.field_n != null) {
                  var4 = "[" + jc.field_n + "] ";
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (param0.field_p != 3) {
                break L6;
              } else {
                var4 = "[#" + param0.field_k + "] ";
                break L6;
              }
            }
            if (!param0.field_i) {
              var4 = var4 + var2 + ": ";
              break L2;
            } else {
              break L2;
            }
          } else {
            if (!param0.field_i) {
              L7: {
                if (param0.field_m != 0) {
                  break L7;
                } else {
                  if (param0.field_j == 0) {
                    var4 = lga.a(true, new String[1], iia.field_q);
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              var4 = lga.a(true, new String[1], wla.field_n);
              break L2;
            } else {
              break L2;
            }
          }
        }
        return var4;
    }

    final static void a(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(param1, (byte) 118);
        var2.d(1, 0);
        var2.d(2, param0 ^ param0);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 71 / ((param1 - 52) / 45);
        uc.d(107);
        dg.c(param3, param2, param0, param4);
    }

    static {
    }
}
