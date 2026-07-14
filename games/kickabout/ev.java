/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ev extends tm {
    static int[] field_B;
    static hd field_D;
    static String field_A;

    public static void g(int param0) {
        Object var2 = null;
        field_B = null;
        field_A = null;
        if (param0 != 1) {
          var2 = null;
          ev.a((nu) null, 1, -15);
          field_D = null;
          return;
        } else {
          field_D = null;
          return;
        }
    }

    final static String h(int param0) {
        if (nr.field_f == wk.field_f) {
            return wn.field_i;
        }
        if (param0 != 10326) {
            String discarded$0 = ev.h(113);
            return ma.field_y;
        }
        return ma.field_y;
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            return null;
        }
        return new li(wq.a(param1[0].a(true), -126));
    }

    ev(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(nu param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var17 = Kickabout.field_G;
        gg.a(param2, 0, param0.field_V);
        var3 = ug.a(0, param0.field_V.a(true));
        var4 = lf.a((byte) -110, param0.field_V.c(879306160));
        on.e(var3, var4, ug.a(0, kk.field_B[0]), lf.a((byte) -70, or.field_a[0]), 16777215, 64);
        on.e(var3, var4, ug.a(0, kk.field_B[1]), lf.a((byte) -68, or.field_a[1]), 16777215, 64);
        on.b(ug.a(0, kk.field_B[0]), lf.a((byte) -92, or.field_a[0]), ug.a(0, kk.field_B[1]), lf.a((byte) -98, or.field_a[1]), 16777215);
        if (param1 > 22) {
          L0: {
            var5 = ug.a(0, pu.field_zb[0]);
            var6 = lf.a((byte) -102, pu.field_zb[1]);
            on.b(ug.a(0, kk.field_B[0] + kk.field_B[1] >> 162688257), lf.a((byte) -86, or.field_a[0] + or.field_a[1] >> 2082715969), var5, var6, 16777215);
            on.b(-4 + var5, var6 - 4, var5 - -4, 4 + var6, 16776960);
            on.b(var5 + -4, var6 - -4, var5 - -4, var6 + -4, 16776960);
            var7 = param0.field_P[param2][0];
            on.c(ug.a(0, 372), lf.a((byte) -110, var7.a(true)), ug.a(0, 523) + -ug.a(0, 372), 16776960, 128);
            var8 = 4474111;
            var9 = var7.f(-105) + -param0.field_V.a(true);
            var10 = var7.a(true) + -param0.field_V.c(879306160);
            var11 = nb.a(var7, 170);
            if (var11 * var11 <= var10 * var10 + var9 * var9) {
              break L0;
            } else {
              var8 = 16711680;
              break L0;
            }
          }
          L1: {
            var12 = var11 * hw.field_i >> -1138470936;
            on.c(ug.a(0, var7.f(-101)), lf.a((byte) -125, var7.a(true)), var12, var8);
            var12 = 28 * hw.field_i >> 280628776;
            on.c(ug.a(0, var7.f(-120)), lf.a((byte) -64, var7.a(true)), var12, 16777215);
            var12 = 250 * hw.field_i >> 1890159080;
            if (0 != param2) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1344;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          L2: {
            var13 = stackIn_7_0;
            var9 = -param0.field_V.a(true) + 448;
            var10 = -param0.field_V.c(879306160) + var13;
            var14 = 3407616;
            if (var9 * var9 + var10 * var10 < 62500) {
              var14 = 16711680;
              break L2;
            } else {
              break L2;
            }
          }
          on.c(ug.a(0, 448), lf.a((byte) -65, var13), var12, var14);
          if (-1 == param0.field_V.field_m) {
            if (param0.field_V.field_h != 0) {
              L3: {
                if (param2 == 1) {
                  var15 = -param0.field_V.field_p / param0.field_V.field_h;
                  break L3;
                } else {
                  var15 = (-param0.field_V.field_p + 88080384) / param0.field_V.field_h;
                  break L3;
                }
              }
              if (-1 > (var15 ^ -1)) {
                if (20 > var15) {
                  var16 = param0.field_V.field_t - -(var15 * param0.field_V.field_q) >> -1212052432;
                  if (-2 != (param2 ^ -1)) {
                    on.a(ug.a(0, var16) - 10, lf.a((byte) -126, 1344), 20, 16776960);
                    var15 = ug.a(0, var7.f(-116));
                    var16 = lf.a((byte) -82, var7.a(true));
                    on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
                    q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
                    return;
                  } else {
                    on.a(-10 + ug.a(0, var16), lf.a((byte) -118, 0), 20, 16711935);
                    var15 = ug.a(0, var7.f(-116));
                    var16 = lf.a((byte) -82, var7.a(true));
                    on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
                    q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
                    return;
                  }
                } else {
                  var15 = ug.a(0, var7.f(-116));
                  var16 = lf.a((byte) -82, var7.a(true));
                  on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
                  q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
                  return;
                }
              } else {
                var15 = ug.a(0, var7.f(-116));
                var16 = lf.a((byte) -82, var7.a(true));
                on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
                q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
                return;
              }
            } else {
              var15 = ug.a(0, var7.f(-116));
              var16 = lf.a((byte) -82, var7.a(true));
              on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
              q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
              return;
            }
          } else {
            var15 = ug.a(0, var7.f(-116));
            var16 = lf.a((byte) -82, var7.a(true));
            on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
            q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_B = new int[32];
        for (var0 = 0; -17 < var0; var0++) {
            for (var1 = 0; -3 > var1; var1++) {
                var2 = var0 << -891779742;
                var3 = 7;
                var4 = 0 == var1 ? 10 : 50;
                if (-16 == (var0 ^ -1)) {
                    var3 = 0;
                    var4 = var1 * 123 + 1;
                    var2 = 0;
                }
                if (var0 == 14) {
                    var2 = 0;
                    var4 = 20 + 20 * var1;
                    var3 = 0;
                }
                field_B[var0 - -(16 * var1)] = hf.a(hf.a(var3 << -135377817, var2 << -477051862), var4);
            }
        }
        field_A = "Passwords must be between 5 and 20 letters and numbers";
    }
}
