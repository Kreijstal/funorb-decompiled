/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends hs {
    static bi field_q;
    static String field_p;
    static String field_m;
    static pf field_o;
    static String field_n;
    static String field_r;

    public static void b(byte param0) {
        if (param0 >= -6) {
            vl.b((byte) -19);
        }
        field_m = null;
        field_r = null;
        field_n = null;
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final int[] a(Random param0, ln[] param1, int[][] param2, int param3, byte param4, int param5, int param6, int[] param7, int param8) throws jn {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param4 < -3) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        var15 = new int[param8];
        var10 = var15;
        if (param7 == null) {
          L1: {
            var13 = param8;
            if (-3 == var13) {
              var10[0] = rh.field_f[0];
              var10[1] = rh.field_f[3];
              break L1;
            } else {
              if (var13 == -4) {
                var10[0] = rh.field_f[0];
                var10[1] = rh.field_f[2];
                var10[2] = rh.field_f[4];
                break L1;
              } else {
                if (-5 != var13) {
                  if (-6 == var13) {
                    var12 = 0;
                    var11 = qf.a((byte) 47, 6, param0);
                    var13 = 0;
                    L2: while (true) {
                      if (param8 <= var13) {
                        break L1;
                      } else {
                        L3: {
                          if (var11 <= var13) {
                            var12 = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var10[var13] = rh.field_f[var12 + var13];
                        var13++;
                        continue L2;
                      }
                    }
                  } else {
                    if (6 != var13) {
                      throw new jn("Sol Map does not support " + param8 + " players.");
                    } else {
                      var13 = 0;
                      L4: while (true) {
                        if (var13 >= param8) {
                          break L1;
                        } else {
                          var10[var13] = rh.field_f[var13];
                          var13++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var10[1] = rh.field_f[1];
                  var10[2] = rh.field_f[3];
                  var10[0] = rh.field_f[0];
                  var10[3] = rh.field_f[4];
                  break L1;
                }
              }
            }
          }
          return var10;
        } else {
          var11 = 0;
          L5: while (true) {
            if (param7.length <= var11) {
              var10[-1 + param8] = 36;
              return var10;
            } else {
              var15[var11] = param7[var11];
              var11++;
              continue L5;
            }
          }
        }
    }

    final static void a(byte param0, bc param1, bc param2, bc param3) {
        int var8 = 0;
        int var9 = 0;
        nk[] var14 = null;
        int var11_int = 0;
        int var13 = ShatteredPlansClient.field_F ? 1 : 0;
        os.field_u = ae.a(-115, "commonui", param1, "frame_top");
        oh.field_d = ae.a(-125, "commonui", param1, "frame_bottom");
        kb.field_v = id.a(2, param1, "commonui", "jagex_logo_grey");
        kl.field_q = ae.a(-80, "commonui", param1, "button");
        lp.field_w = va.a("validation", 0, "commonui", param1);
        mf.field_x = (nq) (Object) ri.a("arezzo12", "commonui", param1, param2, (byte) -17);
        gn.field_u = (nq) (Object) ri.a("arezzo14", "commonui", param1, param2, (byte) 90);
        sl.field_p = (nq) (Object) ri.a("arezzo14bold", "commonui", param1, param2, (byte) 111);
        bi var17 = new bi(param3.a(true, "", "button.gif"), (java.awt.Component) (Object) tm.field_i);
        nk discarded$0 = kf.a("commonui", -108, param1, "dropdown");
        nk[] var5 = tp.a("commonui", param1, "screen_options", (byte) -118);
        hl.field_E = new nk[4];
        mf.field_o = new nk[4];
        qr.field_A = new nk[4];
        nk[][] var6 = new nk[][]{qr.field_A, hl.field_E, mf.field_o};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_k;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_j[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            nk[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = fi.a((byte) 27, var5[var9], var21[var11_int]);
            }
        }
        if (param0 < 12) {
            return;
        }
        var9 = var17.field_w;
        wh.a(false);
        var17.e();
        gf.e(0, 0, gf.field_b, gf.field_k);
        bi var15 = new bi(var9, var9);
        bi var18 = var15;
        var18.e();
        var17.c(0, 0);
        bi var11 = new bi(var9, var9);
        var11.e();
        var17.c(-var17.field_z + var9, 0);
        bi var12 = new bi(var17.field_z - 2 * var9, var9);
        var12.e();
        var17.c(-var9, 0);
        ln.f((byte) 67);
        kl.field_q = new bi[]{var15, var12, var11};
    }

    final void a(boolean param0, l param1) throws jn {
        Object var3 = null;
        int[] var3_array = null;
        int var4_int = 0;
        ln[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        t var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var9 = null;
            vl.a((byte) 49, (bc) null, (bc) null, (bc) null);
            break L0;
          }
        }
        L1: {
          var3 = null;
          if (null != mh.field_h) {
            var4_int = mh.field_h.length;
            var18 = new int[var4_int];
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var19 = var10;
            var17 = var19;
            var15 = var17;
            var13 = var15;
            var3_array = var13;
            var5 = 0;
            L2: while (true) {
              if (var4_int <= var5) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= -1 + var4_int) {
                    break L1;
                  } else {
                    var6_int = d.a((byte) -12, var5 + 1, var4_int + -1, param1.field_j);
                    var7 = var19[var6_int];
                    var3_array[var6_int] = var19[var5];
                    var19[var5] = var7;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var18[var5] = var5;
                var5++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        ((vl) this).field_f = new ln[((vl) this).field_c * ((vl) this).field_b];
        var4 = new ln[((vl) this).field_d];
        var5 = 0;
        var11 = 0;
        var6_int = var11;
        L4: while (true) {
          if (((vl) this).field_f.length <= var11) {
            param1.field_e = var4;
            var6 = new t(param1.field_e);
            var6.a(true, 1);
            ((vl) this).a(-11);
            return;
          } else {
            if (ac.field_t[var11]) {
              L5: {
                var4[var5] = ((vl) this).a(var11, ((vl) this).field_c, ((vl) this).field_b, -8, var5);
                var4[var5].field_I = mh.field_h[var3_array[var5]];
                if (-37 == (var5 ^ -1)) {
                  var4[var5].field_I = "SOL";
                  break L5;
                } else {
                  break L5;
                }
              }
              ((vl) this).field_f[var11] = var4[var5];
              var5++;
              var11++;
              continue L4;
            } else {
              var11++;
              continue L4;
            }
          }
        }
    }

    vl(int param0, int param1) {
        super(11, 11, param0, 73, param1);
        ((vl) this).field_e = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "More suggestions";
        field_m = "Age:";
        field_n = "Mute this player for 48 hours";
        field_o = new pf();
        field_r = "Who can join";
    }
}
