/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends oh {
    int field_r;
    static boolean field_s;
    ln field_k;
    static qh field_l;
    static int field_o;
    fs field_h;
    int field_i;
    static String field_n;
    static String field_q;
    static String[] field_m;
    int field_p;
    static int field_j;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        L0: {
          var22 = ShatteredPlansClient.field_F ? 1 : 0;
          if (-1 >= (param0 ^ -1)) {
            break L0;
          } else {
            param6 = param6 + param0;
            param0 = 0;
            break L0;
          }
        }
        L1: {
          if ((param3 ^ -1) > -1) {
            param1 = param1 + param3;
            param3 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 + param3 <= gf.field_b) {
            break L2;
          } else {
            param1 = gf.field_b - param3;
            break L2;
          }
        }
        L3: {
          if (gf.field_k >= param6 + param0) {
            break L3;
          } else {
            param6 = -param0 + gf.field_k;
            break L3;
          }
        }
        var7 = param4 * param5 >> 521747848;
        var8 = -var7 + param5;
        var9 = param6 + param0;
        if (param2 == 24) {
          var10 = param0;
          L4: while (true) {
            if (var10 >= var9) {
              return;
            } else {
              var11 = param3 + var10 * gf.field_b;
              var12 = param1;
              L5: while (true) {
                if ((var12 ^ -1) >= -1) {
                  var10++;
                  continue L4;
                } else {
                  var13 = gf.field_h[var11];
                  var14 = (16711680 & var13) >> -1513036624;
                  var15 = 255 & var13 >> 949012040;
                  var16 = 255 & var13;
                  var17 = 5 * var14 + var15 * 6 - -(5 * var16);
                  var18 = (var14 * var7 >> 694117768) - -(var17 * var8 >> -1869203124);
                  var19 = (var15 * var7 >> -369343000) - -(var8 * var17 >> -2052707732);
                  var20 = (var16 * var7 >> 1936975048) - -(var17 * var8 >> 1989051148);
                  var21 = var20 | (var19 << 602365640 | var18 << -390101904);
                  gf.field_h[var11] = var21;
                  var11++;
                  var12--;
                  continue L5;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_q = null;
        field_m = null;
        field_l = null;
        field_n = null;
        if (param0) {
            field_o = -92;
        }
    }

    final static bi a(int param0, boolean param1) {
        if (param1) {
            return null;
        }
        bi var2 = new bi(pf.field_d.field_z, pf.field_d.field_w);
        ra.a(-127);
        var2.e();
        pf.field_d.b(0, 0, -1 >= (param0 ^ -1) ? param0 : 2105376);
        cg.i(0);
        return var2;
    }

    final static void d(boolean param0) {
        ch.field_c = null;
        jn.field_a = false;
        oi.field_d = null;
        we.field_f = null;
        db.field_a = null;
        qq.field_n = null;
        w.field_D = null;
        va.field_e = null;
        ks.field_j = null;
        tf.field_b = null;
        ac.field_s = null;
        if (!param0) {
            field_n = null;
        }
        sr.field_F = null;
        tp.field_e = null;
        ma.field_r = null;
        q.field_Cb = null;
        oe.field_c = null;
        ds.field_b = null;
        mm.field_o = null;
        he.field_h = null;
        vm.field_Jb = null;
    }

    final static void a(bc param0, byte param1, nq param2) {
        int var3 = 0;
        si var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var14 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ai.field_e;
        ua.field_f = new qr(0L, (qr) null);
        if (param0 != null) {
          param0.field_k = 0;
          param0.field_j = false;
          kq.field_A = new jo(var3, param0, param0);
          dh.field_c = new re(var3, param0, param0, (wr) (Object) new ch());
          var4 = hc.a(false);
          if (var4 != null) {
            L0: {
              ke.a(param1 + -5, var4);
              kh.field_Nb = rd.a(65793, 5138823, 65793, 65793, 4020342, (byte) 99, 1127256, 1513239, (nq) null, 0, 2245737, 1513239, 8947848);
              nl.field_d = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16764006, 0, 0, 0);
              hl.field_I = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16777215, 0, 0, 0);
              if (param1 == -64) {
                break L0;
              } else {
                field_j = -87;
                break L0;
              }
            }
            var5 = gf.field_b;
            var6 = gf.field_k;
            var14 = gf.field_h;
            jq.field_c = new bi(10, 14);
            jq.field_c.e();
            var8 = 2;
            L1: while (true) {
              if (7 <= var8) {
                gf.a(var14, var5, var6);
                of.field_b = gn.a(0, var4, hl.field_I, nl.field_d, kh.field_Nb);
                ua.field_f.field_M = new pf();
                return;
              } else {
                gf.j(var8, var8 - -1, -(var8 << 1465923681) + 14, 16777215);
                var8++;
                continue L1;
              }
            }
          } else {
            jq.a(-29901, (Throwable) null, "QC2");
            return;
          }
        } else {
          var10 = null;
          jq.a(-29901, (Throwable) null, "QC1");
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (ef.a(param1, false)) {
            return true;
        }
        char[] var6 = tq.field_g;
        char[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
                return true;
            }
        }
        var2 = wd.field_L;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        return false;
    }

    ne(mg param0, int param1, int param2) {
        ((ne) this).field_h = param0.field_G;
        ((ne) this).field_p = param1;
        ((ne) this).field_i = param0.field_z;
        ((ne) this).field_r = param2;
        ((ne) this).field_k = param0.field_y;
    }

    ne(fs param0, int param1, int param2, int param3) {
        ((ne) this).field_h = param0;
        ((ne) this).field_k = null;
        ((ne) this).field_r = param3;
        ((ne) this).field_p = param2;
        ((ne) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_m = new String[]{"Metal income in this territory.", "Biomass income in this territory.", "Energy income in this territory.", "Exotics income in this territory."};
        field_q = "No players";
        field_j = 20;
    }
}
