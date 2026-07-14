/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id implements Iterator {
    private ll field_a;
    static String field_k;
    static long[] field_b;
    private dh field_d;
    static rj field_l;
    static String field_c;
    static String field_g;
    static md field_e;
    static int[] field_j;
    static String field_f;
    static cn[] field_m;
    static nh field_i;
    private ll field_h;

    public final Object next() {
        ll var1 = ((id) this).field_h;
        if (((id) this).field_d.field_d == var1) {
            var1 = null;
            ((id) this).field_h = null;
        } else {
            ((id) this).field_h = var1.field_n;
        }
        ((id) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(null != ((id) this).field_a)) {
            throw new IllegalStateException();
        }
        ((id) this).field_a.b((byte) -2);
        ((id) this).field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        qh var4_ref_qh = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        qh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        var19 = DungeonAssault.field_K;
        sd.field_F = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = ih.field_w.length;
        var24 = new int[var1];
        var23 = var24;
        var22 = var23;
        var21 = var22;
        var2 = var21;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = sd.field_F[9] >> 1724470056;
              var4 = sd.field_F[10] >> 929354696;
              var5 = sd.field_F[11] >> 439027688;
              var6 = nl.field_d << 1398411428;
              var7 = 0;
              var8 = oj.a(var6, (byte) 51) >> 338880584;
              var9 = jg.a(8191, var6) >> -1557095128;
              if (param0 == 439027688) {
                break L1;
              } else {
                var20 = null;
                ab discarded$2 = id.a(-29, (String) null);
                break L1;
              }
            }
            L2: {
              if (-1 == hj.field_S) {
                break L2;
              } else {
                if ((eh.field_h ^ -1) == 0) {
                  break L2;
                } else {
                  var8 = -eh.field_h + 240;
                  var9 = -128;
                  var7 = -320 + hj.field_S;
                  break L2;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
            var7 = (int)((double)var7 * var10);
            var8 = (int)((double)var8 * var10);
            var9 = (int)((double)var9 * var10);
            var12 = var7 + -var3;
            var13 = -var4 + var8;
            var14 = var9 - var5;
            var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
            var14 = (int)((double)var14 * var10);
            var12 = (int)((double)var12 * var10);
            var13 = (int)((double)var13 * var10);
            var15 = 0;
            L3: while (true) {
              if (ih.field_w.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= ih.field_w.length) {
                    var24[var16] = -2147483648;
                    var17 = ih.field_w[var16];
                    bk.a(7, var16);
                    var18 = 0;
                    L5: while (true) {
                      if (-4 >= (var18 ^ -1)) {
                        pb.a(true, 0, sd.field_F, false, var17, false, pj.field_e);
                        ad.a(var13, var8, var7, var14, -106, var12, var9, var17);
                        var15++;
                        continue L3;
                      } else {
                        pj.field_e[var18] = pj.field_e[var18] + lk.field_R[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var24[var16] < var24[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_qh = ih.field_w[var3];
            var4_ref_qh.a((byte) -123);
            bk.a(7, var3);
            var5 = var4_ref_qh.field_i + var4_ref_qh.field_H >> 1599709697;
            var6 = var4_ref_qh.field_p + var4_ref_qh.field_M >> 1895730369;
            var7 = var4_ref_qh.field_a + var4_ref_qh.field_b >> -377462495;
            var8 = sd.field_F[9] >> 1343126306;
            var9 = sd.field_F[10] >> -405004254;
            var10_int = sd.field_F[11] >> -885125086;
            var11 = var10_int * pj.field_e[5] + (var8 * pj.field_e[3] - -(pj.field_e[4] * var9)) >> 762198862;
            var12 = pj.field_e[8] * var10_int + var9 * pj.field_e[7] + pj.field_e[6] * var8 >> 613358542;
            var13 = var9 * pj.field_e[10] + var8 * pj.field_e[9] + pj.field_e[11] * var10_int >> 1461443790;
            var2[var3] = var13 * var7 + (var5 * var11 - -(var6 * var12)) >> 2019937744;
            var3++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 > -73) {
            field_m = null;
        }
        field_m = null;
        field_i = null;
        field_k = null;
        field_l = null;
        field_f = null;
        field_j = null;
    }

    public final boolean hasNext() {
        return ((id) this).field_h != ((id) this).field_d.field_d;
    }

    final static ab a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        int var2 = param1.length();
        if (param0 != -49) {
            id.a(51);
        }
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return np.field_E;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int[] param5, int param6, int param7, int[] param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = DungeonAssault.field_K;
          if (param2 > 86) {
            break L0;
          } else {
            id.a((byte) -84);
            break L0;
          }
        }
        var12 = -param3;
        L1: while (true) {
          if (-1 >= (var12 ^ -1)) {
            return;
          } else {
            var13 = -param7;
            L2: while (true) {
              if (0 <= var13) {
                param0 = param0 + param9;
                param6 = param6 + param4;
                var12++;
                continue L1;
              } else {
                param6++;
                param1 = param5[param6];
                if (0 != param1) {
                  if ((param1 ^ -1) != -256) {
                    var10 = param8[param0];
                    var11 = 255 & param1;
                    param0++;
                    param8[param0] = mp.a(nb.a(nb.a(65280, var10) * var11 >> -1891192504, 65280), mp.a(nb.a(nb.a(16711935, var10) * var11 >> 1385284200, 16711935), nb.a(var10, -16777216)));
                    var13++;
                    continue L2;
                  } else {
                    param0++;
                    var13++;
                    continue L2;
                  }
                } else {
                  param0++;
                  var13++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    id(dh param0) {
        ((id) this).field_a = null;
        ((id) this).field_d = param0;
        ((id) this).field_h = ((id) this).field_d.field_d.field_n;
        ((id) this).field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "MONSTER";
        field_c = "Names cannot contain consecutive spaces";
        field_g = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new long[32];
        field_j = new int[]{};
        field_e = new md();
        field_f = "Waiting for music";
    }
}
