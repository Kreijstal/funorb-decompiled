/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pe extends kc {
    private kc field_Hb;
    private int field_Bb;
    private int field_Gb;
    private int field_Eb;
    private qb[] field_Rb;
    private kc field_Qb;
    private nl[] field_Ob;
    private int[] field_Pb;
    private int field_Mb;
    private int field_Sb;
    private int field_Kb;
    private int field_Cb;
    static vn field_Lb;
    static am field_Db;
    static qb field_Ib;
    static int[][] field_Fb;
    static String field_Nb;
    static boolean field_Jb;

    final static boolean a(byte param0, int param1) {
        try {
          if (param0 != -86) {
            pe.a(-103, 27, (byte) -56, 44);
          }
          if (param1 <= df.field_z.field_g) {
            return true;
          }
          if (null == ch.field_c) {
            return false;
          }
          int var2_int = ch.field_c.b(0);
          if (var2_int > 0) {
            if (!(param1 - df.field_z.field_g >= var2_int)) {
              var2_int = param1 - df.field_z.field_g;
            }
            ch.field_c.a(df.field_z.field_j, (byte) -127, df.field_z.field_g, var2_int);
            hi.field_d = qj.b(-26572);
            df.field_z.field_g = df.field_z.field_g + var2_int;
            if (param1 > df.field_z.field_g) {
              return false;
            }
            df.field_z.field_g = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              rk.a(-66) <= 30000L) {
              return false;
            }
            ka.b(false);
          } catch (IOException iOException) {
            ka.b(false);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var18_int = 0;
        int var22_int = 0;
        kc dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        dn stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        na stackIn_12_0;
        kc stackIn_12_1;
        kc stackIn_12_2;
        long stackIn_12_3;
        kc stackIn_13_1 = null;
        kc stackIn_13_2 = null;
        kc stackIn_13_4 = null;
        na stackIn_30_0;
        kc stackIn_30_1;
        kc stackIn_30_2;
        long stackIn_30_3;
        kc stackIn_31_1;
        kc stackIn_31_2;
        kc stackIn_31_4;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_80_0 = 0;
        qb[] stackIn_82_0 = null;
        int stackIn_83_1 = 0;
        qb[] stackIn_90_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_154_0 = null;
        String stackIn_163_0 = null;
        String stackIn_168_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        vn var8 = null;
        long var9 = 0L;
        Object var11 = null;
        na var12 = null;
        int var13 = 0;
        int var14 = 0;
        kc var18 = null;
        kc var19 = null;
        kc var20 = null;
        kc var21 = null;
        kc var22 = null;
        kc var23 = null;
        kc var24 = null;
        kc var25 = null;
        kc var26 = null;
        kc var27 = null;
        kc var28 = null;
        kc var29 = null;
        kc var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        qb var42 = null;
        kc var43 = null;
        kc var44 = null;
        kc var45 = null;
        kc var46 = null;
        kc var47 = null;
        kc var48 = null;
        kc var49 = null;
        Object var50 = null;
        qb var50_ref = null;
        Object var51 = null;
        qb var51_ref = null;
        Object var52 = null;
        qb var52_ref = null;
        Object var53 = null;
        qb var53_ref = null;
        qb var54 = null;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 != 0) {
            field_Db = (am) null;
          }
          stackIn_5_0 = ee.field_g;
          stackIn_6_1 = (dd.field_h == ee.field_g);
          var7_int = ((dn) (Object) stackIn_5_0).a(stackIn_6_1, (byte) 98, (2 + ga.field_r) * 2, 2, param1 * (8 + ga.field_r * 4), param6) ? 1 : 0;
          var8 = ee.field_g.field_Cb.field_G;
          var9 = qj.b(-26572);
          var11 = null;
          var12 = (na) (var8.b(param3 + 12623));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_G == null) {
              var12.field_Gb = new kc(0L, le.field_E);
              var14 = param4 | param2;
              var12.a(var12.field_Gb, param3 ^ 47);
              var12.field_Gb.field_X = 1;
              var12.field_jc = new kc(0L, qa.field_j);
              var12.a(var12.field_jc, 80);
              var12.field_Mb = new kc(0L, le.field_E);
              var12.a(var12.field_Mb, 65);
              var12.field_Mb.field_t = 0;
              var12.field_Eb = new kc(0L, le.field_E);
              var12.a(var12.field_Eb, 35);
              var12.field_Eb.field_t = 0;
              var12.field_cc = new kc(0L, qa.field_j);
              var12.a(var12.field_cc, 125);
              var12.field_cc.field_X = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (fc.field_a) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = le.field_E;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = qa.field_j;
              }
              stackIn_12_0.field_ec = new kc(stackIn_12_3, stackIn_13_4);
              var12.a(var12.field_ec, 35);
              var12.field_pc = new kc[vf.field_l];
              var12.field_Ub = new kc(0L, (kc) null);
              if ((1 << ma.field_U & var14) != 0) {
                var12.field_ec.a(var12.field_Ub, 76);
              }
              var12.field_Cb = new kc(0L, (kc) null);
              if ((var14 & 1 << gn.field_k) != 0) {
                var12.field_ec.a(var12.field_Cb, 125);
              }
              var12.field_Jb = new kc(0L, (kc) null);
              if ((1 << hb.field_Kb & var14) != 0) {
                var12.field_ec.a(var12.field_Jb, 44);
              }
              var12.field_Xb = new kc(0L, (kc) null);
              if (0 != (var14 & 1 << gm.field_a)) {
                var12.field_ec.a(var12.field_Xb, 37);
              }
              var45 = var12.field_Ub;
              var44 = var12.field_Xb;
              var12.field_Jb.field_gb = 1;
              var43 = var12.field_Cb;
              var43.field_gb = 1;
              var44.field_gb = 1;
              var45.field_gb = 1;
              for (var18_int = 0; var18_int < vf.field_l; var18_int++) {
                var12.field_pc[var18_int] = new kc(0L, (kc) null);
                if ((var14 & 1 << var18_int + fe.field_j) != 0) {
                  var12.field_ec.a(var12.field_pc[var18_int], 20);
                }
                var12.field_pc[var18_int].field_gb = 1;
              }
              stackIn_30_0 = var12;
              stackIn_30_1 = null;
              stackIn_30_2 = null;
              stackIn_30_3 = 0L;
              if (fc.field_a) {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = qa.field_j;
              } else {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = le.field_E;
              }
              stackIn_30_0.field_hc = new kc(stackIn_30_3, stackIn_31_4);
              var12.a(var12.field_hc, 7);
              var12.field_hc.field_X = 2;
              var12.field_Vb = new kc(0L, qa.field_j);
              var12.a(var12.field_Vb, param3 ^ 14);
              var12.field_Ib = new kc(0L, nj.field_d);
              var12.a(var12.field_Ib, 56);
              var12.field_fc = new kc(0L, nj.field_d);
              var12.a(var12.field_fc, 24);
              var12.field_Kb = new kc(0L, pg.field_c);
              var12.a(var12.field_Kb, 44);
              var12.e((byte) 20);
              var12.field_Zb = new kc(0L, ml.field_V);
              var13 = 1;
              var12.a(var12.field_Zb, 69);
            }
            var12.field_Gb.field_rb = null;
            stackIn_35_0 = (var12.field_Lb) ? param4 : param2;
            var14Lifetime1 = stackIn_35_0;
            var46 = var12.field_Gb;
            var12.field_Gb.field_I = 0;
            var46.field_x = 0;
            var12.field_Zb.field_rb = null;
            var47 = var12.field_Zb;
            var12.field_Zb.field_I = 0;
            var47.field_x = 0;
            var12.field_jc.field_rb = null;
            var12.field_jc.field_I = 0;
            var48 = var12.field_jc;
            var12.field_Mb.field_rb = null;
            var48.field_x = 0;
            var12.field_Mb.field_I = 0;
            var18 = var12.field_Mb;
            var12.field_Eb.field_rb = null;
            var18.field_x = 0;
            var19 = var12.field_Eb;
            var12.field_Eb.field_I = 0;
            var12.field_cc.field_rb = null;
            var19.field_x = 0;
            var20 = var12.field_cc;
            var12.field_cc.field_I = 0;
            var20.field_x = 0;
            var12.field_ec.field_rb = null;
            var21 = var12.field_ec;
            var12.field_ec.field_I = 0;
            var21.field_x = 0;
            for (var22_int = 0; vf.field_l > var22_int; var22_int++) {
              var12.field_pc[var22_int].field_W = null;
              var23 = var12.field_pc[var22_int];
              var12.field_pc[var22_int].field_I = 0;
              var23.field_x = 0;
            }
            var12.field_Ub.field_W = null;
            var12.field_Ub.field_I = 0;
            var22 = var12.field_Ub;
            var12.field_Xb.field_W = null;
            var22.field_x = 0;
            var12.field_Xb.field_I = 0;
            var49 = var12.field_Xb;
            var49.field_x = 0;
            var12.field_Cb.field_W = null;
            var24 = var12.field_Cb;
            var12.field_Cb.field_I = 0;
            var12.field_Jb.field_W = null;
            var24.field_x = 0;
            var12.field_Jb.field_I = 0;
            var25 = var12.field_Jb;
            var25.field_x = 0;
            var12.field_hc.field_rb = null;
            var12.field_hc.field_I = 0;
            var26 = var12.field_hc;
            var12.field_Vb.field_rb = null;
            var26.field_x = 0;
            var12.field_Vb.field_I = 0;
            var27 = var12.field_Vb;
            var12.field_Ib.field_rb = null;
            var27.field_x = 0;
            var28 = var12.field_Ib;
            var12.field_Ib.field_I = 0;
            var28.field_x = 0;
            var12.field_fc.field_rb = null;
            var12.field_fc.field_I = 0;
            var29 = var12.field_fc;
            var12.field_Kb.field_rb = null;
            var29.field_x = 0;
            var30 = var12.field_Kb;
            var12.field_Kb.field_I = 0;
            var30.field_x = 0;
            var12.field_x = ee.field_g.field_Cb.field_x;
            var31 = 0;
            var32 = var12.field_ic;
            if (!var12.e(-55)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_Lb) {
                if (var12.field_nc >= 0) {
                  var12.field_Gb.field_rb = nh.field_y;
                } else {
                  if (var12.field_kc && (var12.field_Ob ||
                    var12.field_Hb)) {
                    var12.field_Zb.field_rb = qn.field_pb;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (2 != var12.field_Fb) {
                      var12.field_Gb.field_rb = kl.field_x;
                    } else {
                      var12.field_Zb.field_rb = ol.field_b;
                    }
                  }
                }
              } else {
                if (!var12.field_Ob &&
                  !var12.field_Hb) {
                  if (!var12.field_mc) {
                    var12.field_Gb.field_rb = ti.field_C;
                  } else {
                    var12.field_Gb.field_rb = lo.field_z;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Zb.field_rb = qn.field_pb;
                }
              }
              if (var12.field_Zb.field_rb == null) {
                var12.field_Gb.a(68, 0, var31, ga.field_r, (byte) -120);
              } else {
                var12.field_Zb.a(68, 0, var31, ga.field_r, (byte) -120);
              }
              var12.field_jc.field_rb = dj.a(var12.field_jc.field_Z, var32, 78);
              var12.field_jc.a(78, 70, var31, ga.field_r, (byte) -120);
              if (var12.field_jc.field_C &&
                !var12.field_jc.field_rb.equals(var32)) {
                kh.field_c = var32;
              }
              var12.field_Mb.field_rb = Integer.toString(var12.field_Rb);
              if (!var12.field_kc) {
                var12.field_Mb.field_X = 1;
                var12.field_Mb.a(48, 150, var31, ga.field_r, (byte) -120);
              } else {
                var12.field_Mb.field_X = 2;
                var12.field_Eb.field_rb = "/" + var12.field_dc;
                var33_int = (348 - var12.field_Eb.field_Z.b("/")) / 2;
                var12.field_Mb.a(-150 + var33_int, 150, var31, ga.field_r, (byte) -120);
                var12.field_Eb.a(198 - var33_int, var33_int, var31, ga.field_r, (byte) -120);
              }
              var12.field_cc.field_rb = Integer.toString(var12.field_Db);
              var12.field_cc.a(48, 200, var31, ga.field_r, (byte) -120);
              stackIn_69_0 = (!fc.field_a) ? 200 : 250;
              var33_intLifetime1 = stackIn_69_0;
              var12.field_ec.a(365 - var33_intLifetime1 - 2, var33_intLifetime1, var31, ga.field_r, (byte) -120);
              var34_int = mm.field_p;
              if ((var14Lifetime1 & 1 << ma.field_U) != 0) {
                var50_ref = mo.field_b[var12.field_Pb];
                var12.field_Ub.field_W = var50_ref;
                var12.field_Ub.a(var50_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                var34_int = var34_int + (var50_ref.field_n + mm.field_p);
              }
              if ((1 << gn.field_k & var14Lifetime1) != 0) {
                if (!var12.field_Ob) {
                  stackIn_80_0 = (var12.field_Hb) ? 1 : 0;
                } else {
                  stackIn_80_0 = 1;
                }
                var36 = stackIn_80_0;
                stackIn_82_0 = sk.field_f;
                if (var36 != 0) {
                  stackIn_83_1 = 1;
                } else {
                  stackIn_83_1 = 0;
                }
                var51_ref = stackIn_82_0[stackIn_83_1];
                var12.field_Cb.field_W = var51_ref;
                var12.field_Cb.a(var51_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                var34_int = var34_int + (var51_ref.field_n + mm.field_p);
              }
              if ((1 << hb.field_Kb & var14Lifetime1) != 0) {
                var52_ref = ec.field_i[var12.field_Fb - 1];
                var12.field_Jb.field_W = var52_ref;
                var12.field_Jb.a(var52_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                var34_int = var34_int + (var52_ref.field_n + mm.field_p);
              }
              if ((var14Lifetime1 & 1 << gm.field_a) != 0) {
                stackIn_90_0 = re.field_j;
                if (var12.field_oc) {
                  stackIn_91_1 = 1;
                } else {
                  stackIn_91_1 = 0;
                }
                var53_ref = stackIn_90_0[stackIn_91_1];
                var12.field_Xb.field_W = var53_ref;
                var12.field_Xb.a(var53_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                var34_int = var34_int + (var53_ref.field_n + mm.field_p);
              }
              if (null != nk.field_m) {
                for (var36Lifetime1 = 0; var36Lifetime1 < vf.field_l; var36Lifetime1++) {
                  if (nk.field_m[var36Lifetime1] != null &&
                    (var14Lifetime1 & 1 << var36Lifetime1 + fe.field_j) != 0) {
                    var42 = nk.field_m[var36Lifetime1][255 & var12.field_Wb[var36Lifetime1]];
                    var54 = var42;
                    var12.field_pc[var36Lifetime1].field_W = var42;
                    var12.field_pc[var36Lifetime1].a(var54.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                    var34_int = var34_int + (mm.field_p + var54.field_n);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_ec.field_x) / 2;
              if (0 < var36Lifetime2) {
                var12.field_Ub.field_T = var12.field_Ub.field_T + var36Lifetime2;
                var12.field_Cb.field_T = var12.field_Cb.field_T + var36Lifetime2;
                var12.field_Jb.field_T = var12.field_Jb.field_T + var36Lifetime2;
                var12.field_Xb.field_T = var12.field_Xb.field_T + var36Lifetime2;
                for (var37_int = 0; var37_int < vf.field_l; var37_int++) {
                  dupTemp$0 = var12.field_pc[var37_int];
                  dupTemp$0.field_T = dupTemp$0.field_T + var36Lifetime2;
                }
              }
              if (var12.field_Lb) {
                var37_intLifetime1 = var12.field_nc;
                if (0 > var37_intLifetime1) {
                  var37_intLifetime1 = (int)(-var12.field_Yb + var9);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 >= 60) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_hc.field_rb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_hc.field_rb = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_hc.a(-365 + var12.field_x, 365, var31, ga.field_r, (byte) -120);
              var31 = var31 + ga.field_r;
              if (var12.field_Qb != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(ad.field_a);
                discarded$2 = var37.append(var12.field_Qb[0]);
                for (var38_intLifetime1 = 1; var12.field_Rb > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Qb[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Vb.field_rb = var38;
                var39Lifetime1 = var12.field_Vb.field_Z.a(var38, var12.field_x - 2 * var12.field_Vb.field_t);
                var12.field_Vb.a(var12.field_x, 0, var31, var39Lifetime1 * ga.field_r, (byte) -120);
                var31 = var31 + ga.field_r * var39Lifetime1;
              }
              if (var12.field_Hb) {
                var12.field_Ib.field_rb = tj.a(127, new String[]{var32}, dk.field_i);
                var12.field_Ib.a(var12.field_x - dh.field_Gb * 2, dh.field_Gb, var31, ga.field_r, (byte) -120);
                var31 = var31 + ga.field_r;
              }
              if (var12.field_Nb) {
                var12.field_fc.field_rb = tj.a(param3 + 121, new String[]{var32}, fh.field_f);
                var12.field_fc.a(-(2 * dh.field_Gb) + var12.field_x, dh.field_Gb, var31, ga.field_r, (byte) -120);
                var31 = var31 + ga.field_r;
              }
            }
            var33 = vf.a(-111, var32, var12.field_ac);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Kb.field_Z.a(var33, -dh.field_Gb - dh.field_Gb + var12.field_x);
              var12.field_Kb.field_u = 256 * var12.field_bc / vd.field_i;
              var12.field_Kb.field_rb = var33;
              var12.field_Kb.a(var12.field_x - 2 * dh.field_Gb, dh.field_Gb, var31, var34_intLifetime1 * ga.field_r, (byte) -120);
              var31 = var31 + var34_intLifetime1 * ga.field_r;
            }
            if (var7_int == 0) {
              var12.field_B = var31 - var12.field_I;
            }
            if (var13 != 0) {
              ee.field_g.field_Cb.a((byte) 124, (kc) (var11), var12, 2);
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < vf.field_l; var34_intLifetime2++) {
              if (var12.field_pc[var34_intLifetime2].field_C) {
                if (null != qa.field_o) {
                  if (null != qa.field_o[var34_intLifetime2]) {
                    var35 = qa.field_o[var34_intLifetime2][var12.field_Wb[var34_intLifetime2] & 255];
                  } else {
                    var35 = null;
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  kh.field_c = ob.field_bb[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  kh.field_c = ob.field_bb[var34_intLifetime2];
                }
              }
            }
            if (var12.field_Ub.field_C) {
              if (var12.field_Pb == 1) {
                var34 = n.field_c;
              } else {
                var34 = vm.field_c[var12.field_Pb];
              }
              kh.field_c = on.field_a + " - " + var34;
            }
            if (var12.field_Xb.field_C) {
              if (var12.field_oc) {
                stackIn_154_0 = ri.field_c;
              } else {
                stackIn_154_0 = n.field_h;
              }
              kh.field_c = stackIn_154_0;
            }
            if (var12.field_Cb.field_C) {
              if (!var12.field_Ob &&
                !var12.field_Hb) {
                if (!var12.field_kc) {
                  stackIn_163_0 = pc.field_c;
                } else {
                  stackIn_163_0 = fi.field_g;
                }
              } else {
                stackIn_163_0 = qo.field_g;
              }
              kh.field_c = stackIn_163_0;
            }
            if (var12.field_Jb.field_C) {
              if (2 == var12.field_Fb) {
                stackIn_168_0 = sk.field_d;
              } else {
                stackIn_168_0 = bh.field_d;
              }
              kh.field_c = stackIn_168_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 != var12.field_U) {
              if (var12.e(-125)) {
                var12 = (na) (var8.a(0));
                continue;
              }
              if (0 == var12.field_Zb.field_U) {
                je.a(949002930, var12, var32, param5);
              } else {
                if (var12.field_Lb && (!var12.field_kc ||
                  !var12.field_Ob &&
                  !var12.field_Hb)) {
                  qe.a(var12.h((byte) 78), (byte) -35, param0);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  uj.a(var12.h((byte) 76), (byte) -122, param0);
                }
              }
            }
            var12 = (na) (var8.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "pe.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean e(int param0) {
        if (this.field_Cb != -2) {
          return false;
        }
        if (vn.field_d == 13) {
          this.field_Cb = -1;
        }
        if (param0 != -22632) {
          this.field_Hb = (kc) null;
          return true;
        }
        return true;
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (null != eo.field_c &&
          eo.field_c.b((byte) 49)) {
          oc.a(false);
          return true;
        }
        if (db.field_a != null &&
          db.field_a.i((byte) 2)) {
          db.field_a = null;
          oc.a(false);
          return true;
        }
        if (lo.e(false)) {
          return true;
        }
        if (eh.a(false, param1, param3, param0)) {
          return true;
        }
        if (param2 <= 25) {
          ll var5 = (ll) null;
          pe.a(6, (nf) null, (byte) -73, -25, -95, (qb) null, (ll) null);
        }
        return false;
    }

    final static ho e(boolean param0) {
        if (in.field_Gb == uj.field_h) {
          throw new IllegalStateException();
        }
        if (pa.field_g == in.field_Gb) {
          in.field_Gb = uj.field_h;
          return i.field_i;
        }
        if (!param0) {
          return null;
        }
        pe.g(-113);
        return null;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.b(param1, (byte) 73);
        if (!param1) {
          return -2;
        }
        if (param0 != -1) {
          String var5 = (String) null;
          this.a((byte) -81, 76, (qb) null, (String) null);
        }
        for (var3 = 0; this.field_Kb > var3; var3++) {
          if (0 != this.field_Ob[var3].field_U) {
            return this.field_Pb[var3];
          }
        }
        if (re.field_r != 0) {
          return -1;
        }
        return this.field_Cb;
    }

    final static void h(int param0) {
        if (param0 != 7807) {
          field_Jb = false;
        }
    }

    final static void a(int param0, nf param1, byte param2, int param3, int param4, qb param5, ll param6) {
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param0 = param0 >> 1;
          param3 = param3 >> 1;
          var7_int = param5.field_q >> 1;
          param0 = param0 + param5.field_x / 2;
          var8 = param5.field_y >> 1;
          param3 = param3 + param5.field_o / 2;
          var9 = 0;
          var10 = 0;
          var11 = param1.field_hb;
          var12 = param1.field_Hb;
          if (var9 > param0) {
            stackIn_4_0 = -param0 + var9 << 1;
          } else {
            stackIn_4_0 = 0;
          }
          var13 = stackIn_4_0;
          if (param4 != 21374) {
            return;
          }
          if (param0 + var7_int > var11) {
            stackIn_9_0 = -2 + (var11 - param0 << 1);
          } else {
            stackIn_9_0 = -2 + param5.field_q;
          }
          var14 = stackIn_9_0;
          if (var10 > param3) {
            stackIn_12_0 = var10 - param3 << 1;
          } else {
            stackIn_12_0 = 0;
          }
          var15 = stackIn_12_0;
          if (var12 >= param3 + var8) {
            stackIn_15_0 = -2 + param5.field_y;
          } else {
            stackIn_15_0 = (-param3 + var12 << 1) - 2;
          }
          var16 = stackIn_15_0;
          var26 = new int[4];
          var25 = var26;
          var17 = var25;
          for (var19 = var15; var16 >= var19; var19 += 2) {
            for (var20 = var13; var14 >= var20; var20 += 2) {
              var21 = var20 + var19 * param5.field_q;
              var22 = (param3 + (var19 >> 1)) * param1.field_hb - (-param0 - (var20 >> 1));
              var17[0] = dg.a(param5.field_A[var21], 255);
              var17[1] = dg.a(param5.field_A[1 + var21], 255);
              var17[2] = dg.a(param5.field_A[param5.field_q + var21], 255);
              var17[3] = dg.a(255, param5.field_A[1 + var21 + param5.field_q]);
              var18 = param6.field_m[var22];
              for (var23 = 0; var23 < 4; var23++) {
                if (var26[var23] != 0) {
                  var18 = param2;
                }
              }
              param6.field_m[var22] = (byte)var18;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_31_0 = var7;
          stackIn_31_1 = new StringBuilder().append("pe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param6 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static kc f(int param0) {
        if (param0 != 0) {
          return (kc) null;
        }
        return dd.field_c.field_Eb;
    }

    final void a(int param0, String param1, byte param2) {
        try {
          this.field_Ob[this.field_Kb] = new nl(0L, (kc) null, (kc) null, this.field_Hb, (qb) null, param1);
          this.field_Ob[this.field_Kb].field_Ab = this.field_Rb;
          if (param2 != -26) {
            pe.a((byte) 5, 119);
          }
          this.field_Ob[this.field_Kb].field_yb = true;
          this.field_Ob[this.field_Kb].field_gb = 1;
          this.a(this.field_Ob[this.field_Kb], 69);
          this.field_Pb[this.field_Kb] = param0;
          this.field_Kb = this.field_Kb + 1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pe.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
          pe.h(-36);
        }
        field_Nb = null;
        field_Fb = (int[][]) null;
        field_Db = null;
        field_Lb = null;
        field_Ib = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_Kb == 0) {
          this.field_Ob[this.field_Kb] = new nl(0L, (kc) null, (kc) null, this.field_Qb, (qb) null, db.field_c);
          this.field_Ob[this.field_Kb].field_gb = 1;
          this.a(this.field_Ob[this.field_Kb], 97);
          this.field_Pb[this.field_Kb] = -1;
          this.field_Kb = this.field_Kb + 1;
        }
        var6 = 0;
        for (var7 = 0; this.field_Kb > var7; var7++) {
          var8 = this.field_Ob[var7].a(this.field_Eb, this.field_Gb, -74);
          if (var6 < var8) {
            var6 = var8;
          }
        }
        var6 = var6 + 2 * this.field_Bb;
        var7Lifetime1 = this.field_Kb * this.field_Mb + this.field_Sb + this.field_Sb;
        if (param2 != -29466) {
          return;
        }
        var8Lifetime1 = ih.a(param4, var6, param0, 246);
        var9 = ql.a(10, param1, var7Lifetime1, param3);
        this.a(var6, var8Lifetime1, var9, var7Lifetime1, (byte) -120);
        for (var10 = 0; var10 < this.field_Kb; var10++) {
          this.field_Ob[var10].a(this.field_Gb, 0, this.field_Mb, -(2 * this.field_Bb) + var6, this.field_Bb, this.field_Mb * var10 + this.field_Sb, this.field_Eb);
        }
        return;
    }

    pe(kc param0, qb[] param1, kc param2, kc param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Ob = new nl[256];
        this.field_Pb = new int[256];
        this.field_Cb = -2;
        try {
          this.field_Gb = param5;
          this.field_Rb = param1;
          this.field_Hb = param3;
          this.field_Bb = param4;
          this.field_Sb = param7;
          this.field_Qb = param2;
          this.field_Mb = param8;
          this.field_Eb = param6;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, int param1, qb param2, String param3) {
        try {
          this.field_Ob[this.field_Kb] = new nl(0L, (kc) null, (kc) null, this.field_Hb, param2, param3);
          this.field_Ob[this.field_Kb].field_Ab = this.field_Rb;
          this.field_Ob[this.field_Kb].field_yb = true;
          this.field_Ob[this.field_Kb].field_gb = 1;
          this.a(this.field_Ob[this.field_Kb], param0 + 103);
          if (param0 != -32) {
            field_Db = (am) null;
          }
          this.field_Pb[this.field_Kb] = param1;
          this.field_Kb = this.field_Kb + 1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pe.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pe(pe param0) {
        this(param0, param0.field_Rb, param0.field_Qb, param0.field_Hb, param0.field_Bb, param0.field_Gb, param0.field_Eb, param0.field_Sb, param0.field_Mb);
    }

    static {
        field_Lb = new vn();
        field_Db = new am();
        field_Nb = "Accept draw";
    }
}
