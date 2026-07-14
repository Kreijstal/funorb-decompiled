/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends l {
    static il field_k;
    static String field_i;
    static km field_h;
    static String field_g;
    static String field_j;

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_g = null;
        field_h = null;
        field_j = null;
        int var1 = 84 / ((56 - param0) / 52);
    }

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        wm var4_ref_wm = null;
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
        wm var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = Virogrid.field_F ? 1 : 0;
        lh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = ph.field_n.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = lh.field_a[9] >> -1109551576;
              var4 = lh.field_a[10] >> 1548687624;
              var5 = lh.field_a[param0] >> -1592545112;
              var6 = kf.field_e << 1746064324;
              var7 = 0;
              var8 = id.a(var6, 32) >> 1484737960;
              var9 = nf.a(21855, var6) >> -743244984;
              if ((nl.field_u ^ -1) == 0) {
                break L1;
              } else {
                if ((hk.field_Jb ^ -1) != 0) {
                  var8 = 240 + -hk.field_Jb;
                  var9 = -128;
                  var7 = -320 + nl.field_u;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
            var7 = (int)((double)var7 * var10);
            var8 = (int)((double)var8 * var10);
            var9 = (int)((double)var9 * var10);
            var12 = -var3 + var7;
            var13 = var8 - var4;
            var14 = var9 + -var5;
            var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
            var14 = (int)((double)var14 * var10);
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L2: while (true) {
              if (var15 >= ph.field_n.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (var17_int >= ph.field_n.length) {
                    var23[var16] = -2147483648;
                    var17 = ph.field_n[var16];
                    hh.a((byte) 104, var16);
                    var18 = 0;
                    L4: while (true) {
                      if ((var18 ^ -1) <= -4) {
                        fe.a(gl.field_c, true, true, var17, false, lh.field_a, false);
                        gf.a(var13, var7, var14, var12, var17, var9, var8, -22085);
                        var15++;
                        continue L2;
                      } else {
                        gl.field_c[var18] = gl.field_c[var18] + kh.field_f[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_wm = ph.field_n[var3];
            var4_ref_wm.b((byte) 127);
            hh.a((byte) 87, var3);
            var5 = var4_ref_wm.field_C + var4_ref_wm.field_U >> -410535455;
            var6 = var4_ref_wm.field_T + var4_ref_wm.field_g >> -1654027711;
            var7 = var4_ref_wm.field_p + var4_ref_wm.field_L >> 679779457;
            var8 = lh.field_a[9] >> -1479201246;
            var9 = lh.field_a[10] >> -1209109150;
            var10_int = lh.field_a[11] >> -1475376318;
            var11 = var9 * gl.field_c[4] + (gl.field_c[3] * var8 - -(gl.field_c[5] * var10_int)) >> -1358492082;
            var12 = gl.field_c[8] * var10_int + var9 * gl.field_c[7] + gl.field_c[6] * var8 >> -1984031634;
            var13 = var9 * gl.field_c[10] + (gl.field_c[9] * var8 + var10_int * gl.field_c[11]) >> 730680110;
            var2[var3] = var7 * var13 + var11 * var5 - -(var6 * var12) >> -480988848;
            var3++;
            continue L0;
          }
        }
    }

    private cm() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Canvas param0, byte param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (10 > dj.field_n) {
            L1: {
              var3 = 0;
              if (ce.field_K) {
                var3 = 1;
                ce.field_K = false;
                break L1;
              } else {
                break L1;
              }
            }
            ub.a(hf.field_v, var3 != 0, wm.a((byte) 98), qe.g(11108), param1 ^ 83);
            break L0;
          } else {
            if (nm.c(param1 ^ -45)) {
              if (j.field_l == 0) {
                wb.a(false, (byte) 119, param2);
                td.a(-30179, param0, 0, 0);
                break L0;
              } else {
                uh.a((byte) 114, param0);
                break L0;
              }
            } else {
              df.c();
              fh.a(240, 0, 320);
              td.a(-30179, param0, 0, 0);
              break L0;
            }
          }
        }
        L2: {
          if (param1 == -47) {
            break L2;
          } else {
            field_h = null;
            break L2;
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hg var3 = gk.field_g;
        var3.g(param2, 8);
        var3.a(3, param0 ^ 82);
        var3.a(8, -76);
        if (param0 != 20) {
            return;
        }
        var3.a((byte) -107, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unrated game";
        field_i = "Public";
        field_j = "Hotseat/Singleplayer";
    }
}
