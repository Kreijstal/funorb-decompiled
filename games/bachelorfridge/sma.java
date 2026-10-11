/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class sma extends ana {
    private int field_A;
    private int field_F;
    private int[][] field_D;
    private int field_y;
    static Random field_I;
    private int field_x;
    private int field_G;
    private lp field_w;
    static String[] field_v;
    private int field_z;
    static int field_C;
    static String field_B;
    static kv[] field_H;

    final boolean c(byte param0) {
        int var3 = 0;
        int var2;
        int var7;
        int var4;
        int var5;
        ob var6;
        int var2Lifetime1;
        var7 = BachelorFridge.field_y;
        if (this.field_l == 100) {
          for (var2 = 0; this.field_z > var2; var2++) {
            for (var3 = 0; var3 < this.field_x; var3++) {
              if (this.field_D[var2][var3] == 1) {
                var4 = -this.field_A + (var2 + this.field_F);
                var5 = this.field_G - (this.field_y - var3);
                if (var4 >= 0 &&
                  this.field_q.field_h.field_z > var4 &&
                  var5 >= 0 &&
                  var5 < this.field_q.field_h.field_B) {
                  var6 = new ob(this.field_q, var4, var5);
                  ((kj) ((Object) var6)).a(0);
                }
              }
            }
          }
          jja.a(256, -1, 23);
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$0) {
          return false;
        }
        var2Lifetime1 = -32 / ((param0 - 71) / 47);
        this.d(69);
        return true;
    }

    public static void e(byte param0) {
        field_B = null;
        field_I = null;
        field_v = null;
        if (param0 != -40) {
          field_B = (String) null;
        }
        field_H = null;
    }

    final static kv[] a(byte param0, int param1, int param2) {
        int var3 = -126 % ((param0 - 14) / 52);
        return jna.a(param2, 1, (byte) 106, param1);
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        gi var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        var13 = BachelorFridge.field_y;
        if (!(param1 instanceof gi)) {
          var2 = "";
          var11 = var2;
        } else {
          var14 = (gi) ((Object) param1);
          var2 = var14.field_e + " | ";
          param1 = var14.field_d;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        if (param0 <= 92) {
          sma.a(false, true, 92, -95, -6, -4, -5);
        }
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', var9 + 1);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var16 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var16;
          var2Lifetime3Lifetime5 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (var9 != -1) {
            if (var10 == -1) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var19_int = 0;
        int var23_int = 0;
        sna dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        sga stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        uha stackIn_10_0;
        sna stackIn_10_1;
        sna stackIn_10_2;
        long stackIn_10_3;
        sna stackIn_11_1 = null;
        sna stackIn_11_2 = null;
        sna stackIn_11_4 = null;
        uha stackIn_30_0;
        sna stackIn_30_1;
        sna stackIn_30_2;
        long stackIn_30_3;
        sna stackIn_31_1;
        sna stackIn_31_2;
        sna stackIn_31_4;
        int stackIn_35_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_79_0 = 0;
        kv[] stackIn_81_0 = null;
        int stackIn_82_1 = 0;
        kv[] stackIn_89_0 = null;
        int stackIn_90_1 = 0;
        String stackIn_154_0 = null;
        String stackIn_163_0 = null;
        String stackIn_169_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        eaa var9 = null;
        long var10 = 0L;
        Object var12 = null;
        uha var13 = null;
        int var14 = 0;
        int var15 = 0;
        sna var19 = null;
        sna var20 = null;
        sna var21 = null;
        sna var22 = null;
        sna var23 = null;
        sna var24 = null;
        sna var25 = null;
        sna var26 = null;
        sna var27 = null;
        sna var28 = null;
        sna var29 = null;
        sna var30 = null;
        sna var31 = null;
        int var32 = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        int var35_int = 0;
        String var35 = null;
        Object var36 = null;
        int var37 = 0;
        int var38_int = 0;
        StringBuilder var38 = null;
        int var39_int = 0;
        String var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        kv var43 = null;
        sna var44 = null;
        sna var45 = null;
        sna var46 = null;
        sna var47 = null;
        sna var48 = null;
        sna var49 = null;
        sna var50 = null;
        Object var51 = null;
        kv var51_ref = null;
        Object var52 = null;
        kv var52_ref = null;
        Object var53 = null;
        kv var53_ref = null;
        Object var54 = null;
        kv var54_ref = null;
        kv var55 = null;
        int var15Lifetime1;
        int var34_intLifetime1;
        int var35_intLifetime1;
        int var35_intLifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38_intLifetime1;
        int var39_intLifetime1;
        int var40Lifetime1;
        var51 = null;
        var52 = null;
        var53 = null;
        var54 = null;
        var42 = BachelorFridge.field_y;
        try {
          var8 = -121 % ((51 - param2) / 45);
          stackIn_3_0 = p.field_n;
          stackIn_3_1 = 2 * (rg.field_h + 2);
          stackIn_3_2 = 2;
          stackIn_3_3 = param3 * (rg.field_h * 4 + 8);
          stackIn_4_4 = (bga.field_m == p.field_n);
          var7_int = ((sga) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param1, true) ? 1 : 0;
          var9 = p.field_n.field_vb.field_z;
          var10 = f.b((byte) 73);
          var12 = null;
          var13 = (uha) (var9.b((byte) 90));
          while (var13 != null) {
            var14 = 0;
            if (var13.field_z == null) {
              stackIn_8_0 = param6;
              stackIn_8_1 = param4;
              var15 = stackIn_8_0 | stackIn_8_1;
              var13.field_hc = new sna(0L, wv.field_l);
              var13.a(-1, var13.field_hc);
              var13.field_hc.field_N = 1;
              var13.field_Hb = new sna(0L, gi.field_c);
              var13.a(-1, var13.field_Hb);
              var13.field_yb = new sna(0L, wv.field_l);
              var13.a(-1, var13.field_yb);
              var13.field_yb.field_L = 0;
              var13.field_Yb = new sna(0L, wv.field_l);
              var13.a(-1, var13.field_Yb);
              var13.field_Yb.field_L = 0;
              var13.field_vb = new sna(0L, gi.field_c);
              var13.a(-1, var13.field_vb);
              var13.field_vb.field_N = 2;
              stackIn_10_0 = var13;
              stackIn_10_1 = null;
              stackIn_10_2 = null;
              stackIn_10_3 = 0L;
              if (eaa.field_c) {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = wv.field_l;
              } else {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = gi.field_c;
              }
              stackIn_10_0.field_Db = new sna(stackIn_10_3, stackIn_11_4);
              var13.a(-1, var13.field_Db);
              var13.field_Ab = new sna[ld.field_q];
              var13.field_xb = new sna(0L, (sna) null);
              if ((1 << wba.field_c & var15) != 0) {
                var13.field_Db.a(-1, var13.field_xb);
              }
              var13.field_wb = new sna(0L, (sna) null);
              if ((var15 & 1 << kf.field_b) != 0) {
                var13.field_Db.a(-1, var13.field_wb);
              }
              var13.field_Qb = new sna(0L, (sna) null);
              if ((var15 & 1 << gf.field_l) != 0) {
                var13.field_Db.a(-1, var13.field_Qb);
              }
              var13.field_fc = new sna(0L, (sna) null);
              if ((var15 & 1 << lga.field_r) != 0) {
                var13.field_Db.a(-1, var13.field_fc);
              }
              var46 = var13.field_xb;
              var45 = var13.field_fc;
              var13.field_Qb.field_Y = 1;
              var44 = var13.field_wb;
              var44.field_Y = 1;
              var45.field_Y = 1;
              var46.field_Y = 1;
              for (var19_int = 0; var19_int < ld.field_q; var19_int++) {
                var13.field_Ab[var19_int] = new sna(0L, (sna) null);
                if (0 != (var15 & 1 << bea.field_v + var19_int)) {
                  var13.field_Db.a(-1, var13.field_Ab[var19_int]);
                }
                var13.field_Ab[var19_int].field_Y = 1;
              }
              stackIn_30_0 = var13;
              stackIn_30_1 = null;
              stackIn_30_2 = null;
              stackIn_30_3 = 0L;
              if (eaa.field_c) {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = gi.field_c;
              } else {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = wv.field_l;
              }
              stackIn_30_0.field_Gb = new sna(stackIn_30_3, stackIn_31_4);
              var13.a(-1, var13.field_Gb);
              var13.field_Gb.field_N = 2;
              var13.field_cc = new sna(0L, gi.field_c);
              var13.a(-1, var13.field_cc);
              var13.field_Tb = new sna(0L, dla.field_k);
              var13.a(-1, var13.field_Tb);
              var13.field_Ib = new sna(0L, dla.field_k);
              var13.a(-1, var13.field_Ib);
              var13.field_ac = new sna(0L, qs.field_m);
              var13.a(-1, var13.field_ac);
              var13.d((byte) 119);
              var13.field_Ub = new sna(0L, mh.field_k);
              var14 = 1;
              var13.a(-1, var13.field_Ub);
            }
            var13.field_hc.field_Z = null;
            stackIn_35_0 = (var13.field_Zb) ? param6 : param4;
            var15Lifetime1 = stackIn_35_0;
            var47 = var13.field_hc;
            var13.field_hc.field_p = 0;
            var13.field_Ub.field_Z = null;
            var47.field_sb = 0;
            var48 = var13.field_Ub;
            var13.field_Ub.field_p = 0;
            var13.field_Hb.field_Z = null;
            var48.field_sb = 0;
            var13.field_Hb.field_p = 0;
            var49 = var13.field_Hb;
            var13.field_yb.field_Z = null;
            var49.field_sb = 0;
            var19 = var13.field_yb;
            var13.field_yb.field_p = 0;
            var13.field_Yb.field_Z = null;
            var19.field_sb = 0;
            var13.field_Yb.field_p = 0;
            var20 = var13.field_Yb;
            var20.field_sb = 0;
            var13.field_vb.field_Z = null;
            var21 = var13.field_vb;
            var13.field_vb.field_p = 0;
            var21.field_sb = 0;
            var13.field_Db.field_Z = null;
            var22 = var13.field_Db;
            var13.field_Db.field_p = 0;
            var22.field_sb = 0;
            for (var23_int = 0; ld.field_q > var23_int; var23_int++) {
              var13.field_Ab[var23_int].field_v = null;
              var24 = var13.field_Ab[var23_int];
              var13.field_Ab[var23_int].field_p = 0;
              var24.field_sb = 0;
            }
            var13.field_xb.field_v = null;
            var23 = var13.field_xb;
            var13.field_xb.field_p = 0;
            var23.field_sb = 0;
            var13.field_fc.field_v = null;
            var13.field_fc.field_p = 0;
            var50 = var13.field_fc;
            var50.field_sb = 0;
            var13.field_wb.field_v = null;
            var25 = var13.field_wb;
            var13.field_wb.field_p = 0;
            var25.field_sb = 0;
            var13.field_Qb.field_v = null;
            var26 = var13.field_Qb;
            var13.field_Qb.field_p = 0;
            var13.field_Gb.field_Z = null;
            var26.field_sb = 0;
            var13.field_Gb.field_p = 0;
            var27 = var13.field_Gb;
            var13.field_cc.field_Z = null;
            var27.field_sb = 0;
            var13.field_cc.field_p = 0;
            var28 = var13.field_cc;
            var13.field_Tb.field_Z = null;
            var28.field_sb = 0;
            var13.field_Tb.field_p = 0;
            var29 = var13.field_Tb;
            var13.field_Ib.field_Z = null;
            var29.field_sb = 0;
            var30 = var13.field_Ib;
            var13.field_Ib.field_p = 0;
            var30.field_sb = 0;
            var13.field_ac.field_Z = null;
            var31 = var13.field_ac;
            var13.field_ac.field_p = 0;
            var31.field_sb = 0;
            var13.field_sb = p.field_n.field_vb.field_sb;
            var32 = 0;
            var33 = var13.field_Jb;
            if (!var13.f(74)) {
              boolean decompiledFrameRemainder1 = true;
              if (var13.field_Zb) {
                if (var13.field_Nb >= 0) {
                  var13.field_hc.field_Z = jca.field_b;
                } else {
                  if (var13.field_Fb && (var13.field_zb ||
                    var13.field_Wb)) {
                    var13.field_Ub.field_Z = rea.field_f;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (2 != var13.field_Lb) {
                      var13.field_hc.field_Z = gf.field_h;
                    } else {
                      var13.field_Ub.field_Z = pu.field_k;
                    }
                  }
                }
              } else {
                if (!var13.field_zb &&
                  !var13.field_Wb) {
                  if (var13.field_Bb) {
                    var13.field_hc.field_Z = hja.field_g;
                  } else {
                    var13.field_hc.field_Z = an.field_s;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var13.field_Ub.field_Z = rea.field_f;
                }
              }
              if (var13.field_Ub.field_Z == null) {
                var13.field_hc.a(rg.field_h, 31407, 68, 0, var32);
              } else {
                var13.field_Ub.a(rg.field_h, 31407, 68, 0, var32);
              }
              var13.field_Hb.field_Z = po.a(var13.field_Hb.field_jb, var33, 78);
              var13.field_Hb.a(rg.field_h, 31407, 78, 70, var32);
              if (var13.field_Hb.field_T &&
                !var13.field_Hb.field_Z.equals(var33)) {
                jja.field_m = var33;
              }
              var13.field_yb.field_Z = Integer.toString(var13.field_Rb);
              if (!var13.field_Fb) {
                var13.field_yb.field_N = 1;
                var13.field_yb.a(rg.field_h, 31407, 48, 150, var32);
              } else {
                var13.field_Yb.field_Z = "/" + var13.field_Pb;
                var13.field_yb.field_N = 2;
                var34_int = (-var13.field_Yb.field_jb.a("/") + 348) / 2;
                var13.field_yb.a(rg.field_h, 31407, var34_int - 150, 150, var32);
                var13.field_Yb.a(rg.field_h, 31407, -var34_int + 198, var34_int, var32);
              }
              var13.field_vb.field_Z = Integer.toString(var13.field_bc);
              var13.field_vb.a(rg.field_h, 31407, 48, 200, var32);
              stackIn_70_0 = (eaa.field_c) ? 250 : 200;
              var34_intLifetime1 = stackIn_70_0;
              var13.field_Db.a(rg.field_h, 31407, -var34_intLifetime1 + 363, var34_intLifetime1, var32);
              var35_int = lm.field_d;
              if ((1 << wba.field_c & var15Lifetime1) != 0) {
                var51_ref = ut.field_r[var13.field_Kb];
                var13.field_xb.field_v = var51_ref;
                var13.field_xb.a(var13.field_Db.field_p, 31407, var51_ref.field_n, var35_int, 0);
                var35_int = var35_int + (var51_ref.field_n + lm.field_d);
              }
              if ((var15Lifetime1 & 1 << kf.field_b) != 0) {
                if (!var13.field_zb) {
                  stackIn_79_0 = (var13.field_Wb) ? 1 : 0;
                } else {
                  stackIn_79_0 = 1;
                }
                var37 = stackIn_79_0;
                stackIn_81_0 = (kv[]) (field_H);
                if (var37 != 0) {
                  stackIn_82_1 = 1;
                } else {
                  stackIn_82_1 = 0;
                }
                var52_ref = stackIn_81_0[stackIn_82_1];
                var13.field_wb.field_v = var52_ref;
                var13.field_wb.a(var13.field_Db.field_p, 31407, var52_ref.field_n, var35_int, 0);
                var35_int = var35_int + (lm.field_d + var52_ref.field_n);
              }
              if (0 != (var15Lifetime1 & 1 << gf.field_l)) {
                var53_ref = rv.field_k[var13.field_Lb - 1];
                var13.field_Qb.field_v = var53_ref;
                var13.field_Qb.a(var13.field_Db.field_p, 31407, var53_ref.field_n, var35_int, 0);
                var35_int = var35_int + (lm.field_d + var53_ref.field_n);
              }
              if ((var15Lifetime1 & 1 << lga.field_r) != 0) {
                stackIn_89_0 = gba.field_Db;
                if (!var13.field_dc) {
                  stackIn_90_1 = 0;
                } else {
                  stackIn_90_1 = 1;
                }
                var54_ref = stackIn_89_0[stackIn_90_1];
                var13.field_fc.field_v = var54_ref;
                var13.field_fc.a(var13.field_Db.field_p, 31407, var54_ref.field_n, var35_int, 0);
                var35_int = var35_int + (var54_ref.field_n + lm.field_d);
              }
              if (null != uha.field_Xb) {
                for (var37Lifetime1 = 0; var37Lifetime1 < ld.field_q; var37Lifetime1++) {
                  if (uha.field_Xb[var37Lifetime1] != null &&
                    0 != (1 << var37Lifetime1 + bea.field_v & var15Lifetime1)) {
                    var43 = uha.field_Xb[var37Lifetime1][255 & var13.field_Eb[var37Lifetime1]];
                    var55 = var43;
                    var13.field_Ab[var37Lifetime1].field_v = var43;
                    var13.field_Ab[var37Lifetime1].a(var13.field_Db.field_p, 31407, var55.field_n, var35_int, 0);
                    var35_int = var35_int + (var55.field_n + lm.field_d);
                  }
                }
              }
              var37Lifetime2 = (var13.field_Db.field_sb - var35_int) / 2;
              if (0 < var37Lifetime2) {
                var13.field_xb.field_kb = var13.field_xb.field_kb + var37Lifetime2;
                var13.field_wb.field_kb = var13.field_wb.field_kb + var37Lifetime2;
                var13.field_Qb.field_kb = var13.field_Qb.field_kb + var37Lifetime2;
                var13.field_fc.field_kb = var13.field_fc.field_kb + var37Lifetime2;
                for (var38_int = 0; var38_int < ld.field_q; var38_int++) {
                  dupTemp$0 = var13.field_Ab[var38_int];
                  dupTemp$0.field_kb = dupTemp$0.field_kb + var37Lifetime2;
                }
              }
              if (var13.field_Zb) {
                var38_intLifetime1 = var13.field_Nb;
                if (var38_intLifetime1 < 0) {
                  var38_intLifetime1 = (int)(var10 - var13.field_Ob);
                }
                var39_int = var38_intLifetime1 / 1000;
                var40 = var39_int / 60;
                var39_int = var39_int % 60;
                if (var40 >= 60) {
                  var41 = var40 / 60;
                  var40 = var40 % 60;
                  var13.field_Gb.field_Z = var41 + ":" + var40 / 10 + var40 % 10 + ":" + var39_int / 10 + var39_int % 10;
                } else {
                  var13.field_Gb.field_Z = var40 + ":" + var39_int / 10 + var39_int % 10;
                }
              }
              var13.field_Gb.a(rg.field_h, 31407, -365 + var13.field_sb, 365, var32);
              var32 = var32 + rg.field_h;
              if (var13.field_Cb != null) {
                var32 += 2;
                var38 = new StringBuilder(64);
                discarded$1 = var38.append(gfa.field_k);
                discarded$2 = var38.append(var13.field_Cb[0]);
                for (var39_intLifetime1 = 1; var39_intLifetime1 < var13.field_Rb; var39_intLifetime1++) {
                  discarded$3 = var38.append(", ");
                  discarded$4 = var38.append(var13.field_Cb[var39_intLifetime1]);
                }
                var39 = var38.toString();
                var13.field_cc.field_Z = var39;
                var40Lifetime1 = var13.field_cc.field_jb.b(var39, -(var13.field_cc.field_L * 2) + var13.field_sb);
                var13.field_cc.a(rg.field_h * var40Lifetime1, 31407, var13.field_sb, 0, var32);
                var32 = var32 + var40Lifetime1 * rg.field_h;
              }
              if (var13.field_Wb) {
                var13.field_Tb.field_Z = lga.a(true, new String[]{var33}, eka.field_o);
                var13.field_Tb.a(rg.field_h, 31407, var13.field_sb - 2 * gba.field_Bb, gba.field_Bb, var32);
                var32 = var32 + rg.field_h;
              }
              if (var13.field_gc) {
                var13.field_Ib.field_Z = lga.a(true, new String[]{var33}, wn.field_l);
                var13.field_Ib.a(rg.field_h, 31407, var13.field_sb - 2 * gba.field_Bb, gba.field_Bb, var32);
                var32 = var32 + rg.field_h;
              }
            }
            var34 = qfa.a(var13.field_ec, var33, -83);
            if (var34 != null) {
              var35_intLifetime1 = var13.field_ac.field_jb.b(var34, -gba.field_Bb + (var13.field_sb - gba.field_Bb));
              var13.field_ac.field_Z = var34;
              var13.field_ac.field_cb = var13.field_Mb * 256 / kla.field_x;
              var13.field_ac.a(rg.field_h * var35_intLifetime1, 31407, var13.field_sb - 2 * gba.field_Bb, gba.field_Bb, var32);
              var32 = var32 + rg.field_h * var35_intLifetime1;
            }
            if (var7_int == 0) {
              var13.field_hb = var32 - var13.field_p;
            }
            if (var14 != 0) {
              p.field_n.field_vb.a(false, var13, (sna) (var12), 2);
            }
            for (var35_intLifetime2 = 0; var35_intLifetime2 < ld.field_q; var35_intLifetime2++) {
              if (var13.field_Ab[var35_intLifetime2].field_T) {
                if (gk.field_c == null) {
                  var36 = null;
                } else {
                  if (null != gk.field_c[var35_intLifetime2]) {
                    var36 = gk.field_c[var35_intLifetime2][var13.field_Eb[var35_intLifetime2] & 255];
                  } else {
                    var36 = null;
                  }
                }
                if (var36 != null) {
                  jja.field_m = kka.field_k[var35_intLifetime2] + " - " + (String) (var36);
                } else {
                  jja.field_m = kka.field_k[var35_intLifetime2];
                }
              }
            }
            if (var13.field_xb.field_T) {
              if (1 == var13.field_Kb) {
                var35 = lt.field_c;
              } else {
                var35 = cc.field_d[var13.field_Kb];
              }
              jja.field_m = jk.field_j + " - " + var35;
            }
            if (var13.field_fc.field_T) {
              if (var13.field_dc) {
                stackIn_154_0 = tw.field_d;
              } else {
                stackIn_154_0 = uf.field_a;
              }
              jja.field_m = stackIn_154_0;
            }
            if (var13.field_wb.field_T) {
              if (!var13.field_zb &&
                !var13.field_Wb) {
                if (var13.field_Fb) {
                  stackIn_163_0 = dp.field_m;
                } else {
                  stackIn_163_0 = bja.field_p;
                }
              } else {
                stackIn_163_0 = lm.field_c;
              }
              jja.field_m = stackIn_163_0;
            }
            if (var13.field_Qb.field_T) {
              if (var13.field_Lb != 2) {
                stackIn_169_0 = aa.field_n;
              } else {
                stackIn_169_0 = rs.field_h;
              }
              jja.field_m = stackIn_169_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 != var13.field_R &&
              !var13.f(73)) {
              if (var13.field_Ub.field_R == 0) {
                ii.a(var33, param0, -3, var13);
              } else {
                if (var13.field_Zb && (!var13.field_Fb ||
                  !var13.field_zb &&
                  !var13.field_Wb)) {
                  sfa.a(param5, var13.f((byte) -91), false);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ep.a(false, param5, var13.f((byte) -79));
                }
              }
            }
            var13 = (uha) (var9.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var7), "sma.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    sma(gj param0, lp param1) {
        super(param0, param1);
        this.field_x = 17;
        this.field_y = -1 + this.field_x >> 1;
        this.field_z = 17;
        this.field_A = -1 + this.field_z >> 1;
        try {
          this.field_w = param1;
          this.field_D = this.field_w.e((byte) -108);
          this.field_G = this.field_w.field_s;
          this.field_F = this.field_w.field_r;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int e(int param0) {
        if (param0 != 30) {
          field_I = (Random) null;
        }
        return ce.field_x;
    }

    private final void d(int param0) {
        if (param0 <= 38) {
          this.field_D = (int[][]) null;
        }
    }

    final static void a(int param0, ee[] param1, vr param2, vr param3, int[] param4) {
        kv[] dupTemp$0 = null;
        kv[] dupTemp$1 = null;
        kv[] dupTemp$2 = null;
        kv[] dupTemp$3 = null;
        ee[] var5 = null;
        ee[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var20 = null;
        ee[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        fea var7 = null;
        sna var8 = null;
        sna var9 = null;
        sna var10 = null;
        sna var11 = null;
        kv[] var12 = null;
        kv[] var13 = null;
        kv[] var14 = null;
        sna var15 = null;
        kv[] var16 = null;
        kv[] var17 = null;
        int[] var19 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = BachelorFridge.field_y;
        try {
          var21 = bla.a(29611, "lobby", "crowns", param2);
          var5 = var21;
          re.field_E = var21.length;
          if (param1 != null) {
            var6 = new ee[re.field_E + param1.length];
            for (var7_int = 0; re.field_E > var7_int; var7_int++) {
              var6[var7_int] = var21[var7_int];
            }
            var5 = var6;
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param1.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + re.field_E] = param1[var7_intLifetime3];
            }
          }
          var24 = new int[var5.length];
          var22 = var24;
          var20 = var22;
          var25 = var20;
          var23 = var25;
          var6_array = var23;
          for (var7_intLifetime1 = 0; var7_intLifetime1 < re.field_E; var7_intLifetime1++) {
            var24[var7_intLifetime1] = 10;
          }
          if (param1 != null) {
            if (param4 != null) {
              for (var7_intLifetime2 = 0; param1.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + re.field_E] = param4[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param1.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[re.field_E + var7_intLifetime2] = param1[var7_intLifetime2].field_b;
              }
            }
          }
          lm.field_d = 2;
          he.field_l = 2;
          rg.field_h = 15;
          gba.field_Bb = 4;
          df.field_r = 11;
          var7 = vfa.a("largefont", param2, 76, "lobby", param3);
          ds.field_l = vfa.a("generalfont", param2, -15, "lobby", param3);
          hl.field_H = vfa.a("chatfont", param2, -62, "lobby", param3);
          var7.a(var5, var25);
          ds.field_l.a(var5, var25);
          hl.field_H.a(var5, var25);
          var8 = new sna(0L, (sna) null);
          var8.field_gb = 16777215;
          var8.field_B = rg.field_h;
          var8.field_jb = (po) ((Object) var7);
          var8.field_Y = 1;
          var9 = var8;
          var9.field_N = 1;
          var10 = new sna(0L, (sna) null);
          var10.field_jb = (po) ((Object) ds.field_l);
          var10.field_gb = 16777215;
          var10.field_B = rg.field_h;
          var11 = var10;
          var10.field_Y = 1;
          var11.field_N = 1;
          p.field_o = new sna(0L, var8);
          p.field_o.field_eb = tj.a(gw.a("lobby", "heading", param2, -74), (byte) 104);
          nu.field_c = new sna(0L, (sna) null);
          nu.field_c.field_eb = nba.a(false, 8421504, 1, false, 120, 4210752);
          oe.field_c = new sna(0L, (sna) null);
          oe.field_c.field_eb = mu.a(6316128, 3, 114, 6316128, 1, (byte) 17);
          kha.field_i = new sna(0L, (sna) null);
          kha.field_i.field_eb = tj.a(gw.a("lobby", "popup", param2, -54), (byte) -56);
          var12 = tj.a(gw.a("lobby", "popup_mouseover", param2, param0 - 30913), (byte) 125);
          var13 = gw.a("lobby", "button", param2, -96);
          var14 = tj.a(gw.a("lobby", "tab_active", param2, -128), (byte) -29);
          mda.field_c = new sna(0L, var8);
          mda.field_c.field_eb = var14;
          sm.field_s = new sna(0L, (sna) null);
          sm.field_s.field_v = hca.a("lobby", param2, -39, "closebutton");
          sm.field_s.field_U = hca.a("lobby", param2, param0 - 30996, "closebutton_mouseover");
          rda.field_a = new sna(0L, var8);
          rda.field_a.field_eb = nba.a(true, 3815994, 1, true, 40, 2039583);
          iia.field_m = new sna(0L, var10);
          iia.field_m.field_L = 2;
          iia.field_m.field_eb = nba.a(false, 3815994, param0 ^ 30868, true, 30, 2039583);
          bna.field_z = new sna(0L, var10);
          bna.field_z.field_L = 2;
          bna.field_z.field_eb = nba.a(false, 3815994, param0 ^ 30868, false, 30, 2039583);
          vda.field_a = new sna(0L, var10);
          vda.field_a.field_L = 2;
          vda.field_a.field_eb = nba.a(true, 3815994, 1, false, 30, 2039583);
          qs.field_m = new sna(0L, (sna) null);
          qs.field_m.field_Y = 1;
          qs.field_m.field_gb = 13421772;
          qs.field_m.field_B = rg.field_h;
          qs.field_m.field_jb = (po) ((Object) ds.field_l);
          dla.field_k = new sna(0L, qs.field_m);
          dla.field_k.field_w = 16777215;
          dla.field_k.field_gb = 16764006;
          dla.field_k.field_G = 16777215;
          dla.field_k.field_o = 8421504;
          dla.field_k.field_ab = 16777215;
          var15 = new sna(0L, dla.field_k);
          var15.field_B = rg.field_h;
          var15.field_jb = (po) ((Object) var7);
          var15.field_gb = 16777215;
          rea.field_g = new sna(0L, qs.field_m);
          rea.field_g.field_eb = nba.a(false, 2236962, 1, false, 16, 2236962);
          rea.field_g.field_L = 2;
          ina.field_n = new sna(0L, qs.field_m);
          ina.field_n.field_eb = nba.a(false, 1513239, 1, false, 16, 1513239);
          ina.field_n.field_L = 2;
          wv.field_l = new sna(0L, rea.field_g);
          wv.field_l.a(dla.field_k, param0 ^ 30944);
          gi.field_c = new sna(0L, ina.field_n);
          gi.field_c.a(dla.field_k, 41);
          var16 = gw.a("lobby", "button_mouseover", param2, param0 - 30928);
          td.field_o = new pna(kha.field_i, var12, qs.field_m, dla.field_k, 3, 2, lm.field_d, 3, rg.field_h);
          wd.field_v = new sna(0L, dla.field_k);
          wd.field_v.field_V = 1;
          wd.field_v.field_lb = 1;
          wd.field_v.field_r = 1;
          wd.field_v.field_ob = 1;
          wd.field_v.field_A = var16;
          wd.field_v.field_eb = var13;
          wd.field_v.field_db = gw.a("lobby", "button_mouseheld", param2, -32);
          wd.field_v.field_K = gw.a("lobby", "button_active", param2, param0 - 30961);
          wd.field_v.field_X = gw.a("lobby", "button_disabled", param2, -85);
          wd.field_v.field_N = 1;
          ad.field_q = new sna(0L, dla.field_k);
          ad.field_q.field_N = 1;
          ad.field_q.field_eb = tj.a(gw.a("lobby", "tab_inactive", param2, -80), (byte) 106);
          ad.field_q.field_A = tj.a(gw.a("lobby", "tab_mouseover", param2, -44), (byte) 103);
          ad.field_q.field_K = var14;
          jfa.field_f = new sna(0L, (sna) null);
          jfa.field_f.field_eb = mu.a(1856141, 3, 206, 1127256, -1, (byte) 17);
          vq.field_v = new sna(0L, (sna) null);
          vq.field_v.field_eb = mu.a(11579568, 3, 290, 6052956, -1, (byte) 17);
          vo.field_b = new sna(0L, var15);
          vo.field_b.field_ob = 1;
          vo.field_b.field_N = 1;
          vo.field_b.field_r = 1;
          vo.field_b.field_lb = 1;
          vo.field_b.field_V = 1;
          sn.field_l = new sna(0L, vo.field_b);
          ria.field_k = new sna(0L, dla.field_k);
          ria.field_k.field_r = 1;
          ria.field_k.field_ob = 1;
          ria.field_k.field_lb = 1;
          ria.field_k.field_N = 1;
          ria.field_k.field_V = 1;
          mh.field_k = new sna(0L, ria.field_k);
          tca.field_c = new sna(0L, ria.field_k);
          iw.field_a = new sna(0L, vo.field_b);
          if (param0 != 30869) {
            var19 = (int[]) null;
            sma.a(93, (ee[]) null, (vr) null, (vr) null, (int[]) null);
          }
          gfa.field_f = new sna(0L, ria.field_k);
          uaa.field_i = new sna(0L, ria.field_k);
          uj.field_r = new sna(0L, ria.field_k);
          ria.field_k.field_eb = tj.a(gw.a("lobby", "smallbutton", param2, -111), (byte) -65);
          ria.field_k.field_A = tj.a(gw.a("lobby", "smallbutton_mouseover", param2, -76), (byte) -1);
          dupTemp$0 = tj.a(gw.a("lobby", "smallbutton_active", param2, -67), (byte) -9);
          ria.field_k.field_K = dupTemp$0;
          ria.field_k.field_db = dupTemp$0;
          ria.field_k.field_X = tj.a(gw.a("lobby", "smallbutton_disabled", param2, -85), (byte) 114);
          sn.field_l.field_eb = tj.a(gw.a("lobby", "mediumbutton", param2, -34), (byte) 107);
          sn.field_l.field_A = tj.a(gw.a("lobby", "mediumbutton_mouseover", param2, param0 ^ -30959), (byte) 126);
          sn.field_l.field_db = tj.a(gw.a("lobby", "mediumbutton_mouseheld", param2, -61), (byte) -90);
          vo.field_b.field_eb = tj.a(gw.a("lobby", "bigbutton", param2, -125), (byte) -81);
          vo.field_b.field_A = tj.a(gw.a("lobby", "bigbutton_mouseover", param2, -68), (byte) -32);
          vo.field_b.field_db = tj.a(gw.a("lobby", "bigbutton_mouseheld", param2, -68), (byte) 114);
          vo.field_b.field_X = tj.a(gw.a("lobby", "bigbutton_disabled", param2, -128), (byte) -40);
          mh.field_k.field_eb = tj.a(gw.a("lobby", "greenbutton", param2, -118), (byte) 123);
          mh.field_k.field_A = tj.a(gw.a("lobby", "greenbutton_mouseover", param2, -53), (byte) 114);
          mh.field_k.field_db = tj.a(gw.a("lobby", "greenbutton_mouseheld", param2, param0 - 30984), (byte) 120);
          tca.field_c.field_eb = tj.a(gw.a("lobby", "redbutton", param2, param0 ^ -30894), (byte) 123);
          tca.field_c.field_A = tj.a(gw.a("lobby", "redbutton_mouseover", param2, -84), (byte) -70);
          tca.field_c.field_db = tj.a(gw.a("lobby", "redbutton_mouseheld", param2, -88), (byte) -106);
          iw.field_a.field_eb = tj.a(gw.a("lobby", "backbutton", param2, -83), (byte) 106);
          iw.field_a.field_A = tj.a(gw.a("lobby", "backbutton_mouseover", param2, -104), (byte) -72);
          iw.field_a.field_db = tj.a(gw.a("lobby", "backbutton_mouseheld", param2, -80), (byte) -82);
          iw.field_a.field_X = tj.a(gw.a("lobby", "backbutton_disabled", param2, -38), (byte) -92);
          uj.field_r.field_eb = tj.a(gw.a("lobby", "gameoptionbutton", param2, -67), (byte) -26);
          uj.field_r.field_A = tj.a(gw.a("lobby", "gameoptionbutton_mouseover", param2, -50), (byte) -61);
          dupTemp$1 = tj.a(gw.a("lobby", "gameoptionbutton_active", param2, param0 ^ -30958), (byte) 109);
          uj.field_r.field_K = dupTemp$1;
          uj.field_r.field_db = dupTemp$1;
          uj.field_r.field_X = tj.a(gw.a("lobby", "gameoptionbutton_disabled", param2, -68), (byte) -34);
          gfa.field_f.field_eb = tj.a(gw.a("lobby", "chatbutton", param2, -83), (byte) 114);
          gfa.field_f.field_A = tj.a(gw.a("lobby", "chatbutton_mouseover", param2, -107), (byte) 118);
          dupTemp$2 = tj.a(gw.a("lobby", "chatbutton_active", param2, -64), (byte) -127);
          gfa.field_f.field_K = dupTemp$2;
          gfa.field_f.field_db = dupTemp$2;
          uaa.field_i.field_eb = tj.a(gw.a("lobby", "chatfilterbutton", param2, -74), (byte) 122);
          uaa.field_i.field_A = tj.a(gw.a("lobby", "chatfilterbutton_mouseover", param2, -69), (byte) -79);
          dupTemp$3 = tj.a(gw.a("lobby", "chatfilterbutton_active", param2, -125), (byte) 107);
          uaa.field_i.field_K = dupTemp$3;
          uaa.field_i.field_db = dupTemp$3;
          var17 = gw.a("lobby", "checkbox", param2, -76);
          nr.field_v = new daa(0L, var17[1], var17[0], 1, dla.field_k, (String) null);
          cd.field_n = new sna(0L, (sna) null);
          cd.field_n.field_eb = aba.a(hca.a("lobby", param2, -56, "slideregion"), true);
          cd.field_n.field_A = aba.a(hca.a("lobby", param2, 110, "slideregion_mouseover"), true);
          cd.field_n.field_db = aba.a(hca.a("lobby", param2, 81, "slideregion_mouseheld"), true);
          cd.field_n.field_X = aba.a(hca.a("lobby", param2, param0 - 30970, "slideregion_disabled"), true);
          dj.field_d = new sna(0L, (sna) null);
          dj.field_d.field_eb = tj.a(gw.a("lobby", "dragbar", param2, param0 - 30977), (byte) -94);
          dj.field_d.field_A = tj.a(gw.a("lobby", "dragbar_mouseover", param2, -125), (byte) -82);
          dj.field_d.field_db = tj.a(gw.a("lobby", "dragbar_mouseheld", param2, -78), (byte) -92);
          dj.field_d.field_X = tj.a(gw.a("lobby", "dragbar_disabled", param2, -76), (byte) -22);
          aha.field_F = new sna(0L, (sna) null);
          aha.field_F.field_v = hca.a("lobby", param2, 82, "upbutton");
          aha.field_F.field_U = hca.a("lobby", param2, 107, "upbutton_mouseover");
          aha.field_F.field_y = hca.a("lobby", param2, -36, "upbutton_mouseheld");
          aha.field_F.field_H = hca.a("lobby", param2, 74, "upbutton_disabled");
          lla.field_l = new sna(0L, (sna) null);
          lla.field_l.field_v = hca.a("lobby", param2, 114, "downbutton");
          lla.field_l.field_U = hca.a("lobby", param2, 120, "downbutton_mouseover");
          lla.field_l.field_y = hca.a("lobby", param2, param0 ^ -30859, "downbutton_mouseheld");
          lla.field_l.field_H = hca.a("lobby", param2, param0 ^ -30898, "downbutton_disabled");
          qf.field_y = new cw(0L, aha.field_F, lla.field_l, cd.field_n, dj.field_d);
          ob.field_g = new ok(0L, (sna) null, vg.field_k, qf.field_y, ria.field_k, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("sma.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_v = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_I = new Random();
        field_B = "Hide game chat";
    }
}
