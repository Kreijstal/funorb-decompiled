/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lnb extends le {
    private int field_j;
    static jv field_i;
    private int field_k;

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            int[][] discarded$2 = ((lnb) this).a(105, -69);
            break L0;
          }
        }
        L1: {
          var10 = ((lnb) this).field_f.a((byte) -112, param0);
          var3 = var10;
          if (((lnb) this).field_f.field_e) {
            L2: {
              var5 = hob.field_d / ((lnb) this).field_k;
              var6 = noa.field_o / ((lnb) this).field_j;
              if ((var6 ^ -1) >= -1) {
                var4 = ((lnb) this).a(0, 0, 255);
                break L2;
              } else {
                var7 = param0 % var6;
                var4 = ((lnb) this).a(0, noa.field_o * var7 / var6, 255);
                break L2;
              }
            }
            var11 = 0;
            var7 = var11;
            L3: while (true) {
              if (hob.field_d <= var11) {
                break L1;
              } else {
                if ((var5 ^ -1) >= -1) {
                  var10[var11] = var4[0];
                  var11++;
                  continue L3;
                } else {
                  var8 = var11 % var5;
                  var10[var11] = var4[var8 * hob.field_d / var5];
                  var11++;
                  continue L3;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var10;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        var16 = VoidHunters.field_G;
        if (param0 == 255) {
          L0: {
            var21 = ((lnb) this).field_d.a(param1, (byte) -127);
            var20 = var21;
            var19 = var20;
            var18 = var19;
            var17 = var18;
            var3 = var17;
            if (((lnb) this).field_d.field_g) {
              L1: {
                var5 = hob.field_d / ((lnb) this).field_k;
                var6 = noa.field_o / ((lnb) this).field_j;
                if ((var6 ^ -1) >= -1) {
                  var4 = ((lnb) this).a((byte) 69, 0, 0);
                  break L1;
                } else {
                  var7_int = param1 % var6;
                  var4 = ((lnb) this).a((byte) 82, 0, var7_int * noa.field_o / var6);
                  break L1;
                }
              }
              var7 = var4[0];
              var8 = var4[1];
              var9 = var4[2];
              var10 = var21[0];
              var11 = var21[1];
              var12 = var21[2];
              var13 = 0;
              L2: while (true) {
                if (var13 >= hob.field_d) {
                  break L0;
                } else {
                  L3: {
                    if (0 >= var5) {
                      var14 = 0;
                      break L3;
                    } else {
                      var15 = var13 % var5;
                      var14 = hob.field_d * var15 / var5;
                      break L3;
                    }
                  }
                  var10[var13] = var7[var14];
                  var11[var13] = var8[var14];
                  var12[var13] = var9[var14];
                  var13++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          return var17;
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (var4 != 0) {
            if (var4 == 1) {
              ((lnb) this).field_j = param2.e((byte) -126);
              break L0;
            } else {
              break L0;
            }
          } else {
            ((lnb) this).field_k = param2.e((byte) -121);
            break L0;
          }
        }
        L1: {
          if (param1 < -60) {
            break L1;
          } else {
            ((lnb) this).field_k = 0;
            break L1;
          }
        }
    }

    final static void b(int param0, int param1) {
        try {
            if (null != ov.field_o) {
                // if_icmpgt L34
                // if_acmpne L26
            } else {
                dpa.field_p.field_e = 0;
                return;
            }
            if (param1 < 110) {
                return;
            }
            if (dpa.field_p.field_e == 0) {
                if ((10000L + bgb.field_o ^ -1L) > (wt.a(false) ^ -1L)) {
                    dpa.field_p.h(24335, param0);
                }
            }
            if (0 < dpa.field_p.field_e) {
                try {
                    ov.field_o.a(0, dpa.field_p.field_h, dpa.field_p.field_e, 0);
                    bgb.field_o = wt.a(false);
                } catch (IOException iOException) {
                    ifb.l(-122);
                }
                dpa.field_p.field_e = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public lnb() {
        super(1, false);
        ((lnb) this).field_j = 4;
        ((lnb) this).field_k = 4;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
            field_i = null;
        }
        return -1 != (1024 & param0 ^ -1) ? true : false;
    }

    final static void d(int param0) {
        if (null != cka.field_o) {
            if (cka.field_o.field_b != null) {
                cka.field_o.field_b.field_J = false;
            }
        }
        qg.field_a = null;
        cka.field_o = null;
        if (param0 != 0) {
            lnb.e(75);
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != 1) {
            field_i = null;
        }
    }

    static {
    }
}
