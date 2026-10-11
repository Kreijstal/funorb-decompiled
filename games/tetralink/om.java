/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class om extends hl {
    private hl field_Vb;
    private hl field_bc;
    private hl field_Ub;
    static String field_Zb;
    private hl field_Wb;
    private int field_Tb;
    private hl field_Mb;
    private mi field_ac;
    private StringBuilder field_Kb;
    static int[] field_Yb;
    static int field_Nb;
    static int field_Rb;
    private hl field_Sb;
    static String field_Lb;
    private hl[] field_Qb;
    static String field_Pb;
    long field_Ob;
    static String field_Xb;

    final static boolean a(ud param0, byte param1, ud param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var3_int = param0.field_Rb - param2.field_Rb;
          if (param1 < 98) {
            field_Nb = -127;
          }
          if (ul.field_e != param0.field_Ub) {
            if (null == param0.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2.field_Ub != ul.field_e) {
            if (param2.field_Ub == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("om.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 != 5) {
          return true;
        }
        if (this.field_Tb != -2) {
          return false;
        }
        if (dg.field_e != 13) {
          return true;
        }
        this.field_Tb = -1;
        return true;
    }

    private final int a(int param0, int param1, hl param2, hl param3, String param4, int param5) {
        hl var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new hl(0L, param2, 0, param0, param5, 24, param4);
          param0 += 32;
          param3.a((byte) -89, var7);
          var8 = 105 / ((param1 + 48) / 59);
          stackIn_1_0 = param0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("om.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        String var3;
        boolean stackIn_6_0 = false;
        if (param0 <= 85) {
          var3 = (String) null;
          om.a(false, true, (String) null, (String) null);
        }
        stackIn_6_0 = (this.field_ac != null) && (this.field_ac.field_zb);
        return stackIn_6_0;
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_61_2 = null;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        String stackIn_68_2 = null;
        boolean stackIn_89_0 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = TetraLink.field_J;
        try {
          f.field_z = param2;
          me.field_d = true;
          if (f.field_z == 0) {
            var3_int = t.a(uf.field_f, 121, ti.field_b, kn.field_f, dk.field_d);
            var4 = 3 + var3_int;
            ml.field_mb = new int[var4];
            pj.field_h = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ml.field_mb[var5] = -1;
            }
            io.field_g = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              pj.field_h[var5] = kn.field_f[var5];
            }
            pj.field_h[-3 + var4] = "";
            pj.field_h[-2 + var4] = ug.field_X;
            ml.field_mb[-2 + var4] = 0;
            io.field_g[0] = 4;
            pj.field_h[var4 - 1] = d.field_a;
            ml.field_mb[var4 - 1] = 1;
            io.field_g[1] = 5;
          } else if (f.field_z == 1) {
            var3_int = t.a(uf.field_f, -12, ti.field_b, kn.field_f, dk.field_d);
            var4 = var3_int + 2;
            ml.field_mb = new int[var4];
            pj.field_h = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ml.field_mb[var5] = -1;
            }
            io.field_g = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              pj.field_h[var5] = kn.field_f[var5];
            }
            pj.field_h[var4 - 2] = "";
            pj.field_h[var4 - 1] = d.field_a;
            ml.field_mb[var4 - 1] = 0;
            io.field_g[0] = 5;
          } else if (f.field_z != 2) {
            if (f.field_z == 3) {
              if (!nd.field_Pb.field_e) {
                var3_int = t.a(uf.field_f, -103, wn.field_v, kn.field_f, dk.field_d);
              } else {
                var3_int = t.a(uf.field_f, 119, lc.field_b, kn.field_f, dk.field_d);
              }
              var4 = var3_int + 2;
              pj.field_h = new String[var4];
              ml.field_mb = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ml.field_mb[var5] = -1;
              }
              io.field_g = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                pj.field_h[var5] = kn.field_f[var5];
              }
              pj.field_h[-2 + var4] = "";
              pj.field_h[-1 + var4] = d.field_a;
              ml.field_mb[var4 - 1] = 0;
              io.field_g[0] = 5;
            } else if (f.field_z == 4) {
              var3_int = t.a(uf.field_f, -72, am.field_c, kn.field_f, dk.field_d);
              var4 = var3_int + 2;
              ml.field_mb = new int[var4];
              pj.field_h = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ml.field_mb[var5] = -1;
              }
              io.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                pj.field_h[var5] = kn.field_f[var5];
              }
              pj.field_h[var4 - 2] = "";
              pj.field_h[-1 + var4] = d.field_a;
              ml.field_mb[-1 + var4] = 0;
              io.field_g[0] = 5;
            } else {
              if (f.field_z != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = t.a(uf.field_f, param1 ^ -91, km.field_p, kn.field_f, dk.field_d);
              var4 = var3_int + 3;
              ml.field_mb = new int[var4];
              pj.field_h = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ml.field_mb[var5] = -1;
              }
              io.field_g = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                pj.field_h[var5] = kn.field_f[var5];
              }
              pj.field_h[-3 + var4] = "";
              pj.field_h[-2 + var4] = mm.field_q;
              ml.field_mb[-2 + var4] = 0;
              io.field_g[0] = 3;
              pj.field_h[-1 + var4] = d.field_a;
              ml.field_mb[var4 - 1] = 1;
              io.field_g[1] = 5;
            }
          } else {
            var3_int = t.a(uf.field_f, param1 ^ -59, sk.a(new String[]{"<br><%0><br>"}, jg.field_g, 126), kn.field_f, dk.field_d);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(kn.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            fi.field_Ab = new String[var4];
            rd.a(kn.field_f, 0, fi.field_Ab, 0, var4);
            qc.field_db = new String[-var4 + var3_int - 1];
            rd.a(kn.field_f, 1 + var4, qc.field_db, 0, -1 + (var3_int - var4));
            var3_int = t.a(uf.field_f, param1 ^ -125, sk.a(new String[]{"<br><%0><br>"}, gb.field_p, 124), kn.field_f, dk.field_d);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(kn.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            jl.field_b = new String[var4];
            rd.a(kn.field_f, 0, jl.field_b, 0, var4);
            ah.field_j = new String[-1 + (-var4 + var3_int)];
            rd.a(kn.field_f, var4 + 1, ah.field_j, 0, -var4 + (var3_int - 1));
            if (fi.field_Ab.length < jl.field_b.length) {
              stackIn_50_0 = jl.field_b.length;
            } else {
              stackIn_50_0 = fi.field_Ab.length;
            }
            var5 = stackIn_50_0;
            if (qc.field_db.length >= ah.field_j.length) {
              stackIn_53_0 = qc.field_db.length;
            } else {
              stackIn_53_0 = ah.field_j.length;
            }
            var6 = stackIn_53_0;
            var7 = var6 + var5 + 7;
            ml.field_mb = new int[var7];
            pj.field_h = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              ml.field_mb[var8] = -1;
            }
            pj.field_h[1] = wa.field_g;
            ml.field_mb[1] = 0;
            io.field_g = new int[2];
            pj.field_h[0] = o.field_n;
            ml.field_mb[3] = 1;
            pj.field_h[5] = "";
            io.field_g[0] = 5;
            io.field_g[1] = 2;
            pj.field_h[4] = bb.field_b;
            pj.field_h[3] = ho.field_Q;
            pj.field_h[2] = oi.field_g;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_60_0 = pj.field_h;
              stackIn_60_1 = var8Lifetime2 + 6;
              if (var8Lifetime2 + jl.field_b.length - var5 >= 0) {
                stackIn_61_2 = jl.field_b[-var5 + var8Lifetime2 + jl.field_b.length];
              } else {
                stackIn_61_2 = "";
              }
              stackIn_60_0[stackIn_60_1] = stackIn_61_2;
            }
            pj.field_h[var5 + 6] = null;
            ml.field_mb[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_65_0 = pj.field_h;
              stackIn_65_1 = var5 + 7 + var8Lifetime3;
              stackIn_65_2 = ~ah.field_j.length;
              stackIn_65_3 = ~var8Lifetime3;
              if (stackIn_65_2 >= stackIn_65_3) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = ah.field_j[var8Lifetime3];
              }
              stackIn_65_0[stackIn_65_1] = stackIn_68_2;
            }
            tg.field_a = k.a(param1 ^ 10);
          }
          gm.field_h.field_g = io.field_g.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; pj.field_h.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_89_0 = !(ml.field_mb[var4Lifetime1] < 0);
            var5Lifetime1 = fi.a(stackIn_89_0, pj.field_h[var4Lifetime1], (byte) -77);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == f.field_z) {
            var10 = fi.field_Ab;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = fi.a(false, var11, (byte) -111);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = qc.field_db;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = fi.a(false, var12, (byte) -106);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          lg.field_X = (mn.field_c + da.field_e << 1) * gm.field_h.field_g;
          ia.field_K = -(var3_intLifetime1 >> 1) + var3_intLifetime1 + vg.field_Lb;
          lb.field_V = vg.field_Lb - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < pj.field_h.length; var4Lifetime2++) {
            stackIn_114_0 = lg.field_X;
            if (ml.field_mb[var4Lifetime2] >= 0) {
              stackIn_115_1 = bj.field_d;
            } else {
              stackIn_115_1 = la.field_e;
            }
            lg.field_X = stackIn_114_0 + stackIn_115_1;
          }
          pj.field_e = dh.field_i - (lg.field_X >> 1);
          bl.field_Ob = new int[pj.field_h.length][];
          if (param1 != 10) {
            return;
          }
          var4Lifetime3 = 0;
          var5Lifetime3 = pj.field_e;
          while (var4Lifetime3 < pj.field_h.length) {
            var6Lifetime1 = ml.field_mb[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + la.field_e;
            } else {
              var7Lifetime2 = fi.a(true, pj.field_h[var4Lifetime3], (byte) -83);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + vg.field_Lb;
              var5Lifetime3 = var5Lifetime3 + mn.field_c;
              bl.field_Ob[var4Lifetime3] = new int[4];
              bl.field_Ob[var4Lifetime3][0] = var8Lifetime1 - io.field_a;
              bl.field_Ob[var4Lifetime3][1] = var5Lifetime3;
              bl.field_Ob[var4Lifetime3][2] = var7Lifetime2 + (io.field_a << 1);
              bl.field_Ob[var4Lifetime3][3] = (da.field_e << 1) + bj.field_d;
              var5Lifetime3 = var5Lifetime3 + ((da.field_e << 1) + mn.field_c + bj.field_d);
            }
            var4Lifetime3++;
          }
          if (f.field_z == 2) {
            gm.field_h.a(-1, -1, param0, 101);
          } else {
            gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), 0, param0, 99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "om.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = -124 % ((-17 - param0) / 43);
        return this.field_Kb.toString();
    }

    om(int param0, int param1, int param2, int param3, int param4, hl param5, hl param6, hl param7, hl param8, mi param9, hl param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object stackIn_7_0;
        mi stackIn_7_1;
        mi stackIn_7_2;
        long stackIn_7_3;
        mi stackIn_7_4;
        Object stackIn_8_0;
        Object stackIn_9_0;
        mi stackIn_9_1;
        mi stackIn_9_2;
        String stackIn_9_5;
        hl stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl[] var15 = null;
        RuntimeException var15_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hl[] var28 = null;
        Object stackIn_7_0Lifetime1;
        Object stackIn_9_0Lifetime1;
        mi stackIn_9_1Lifetime1;
        mi stackIn_9_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_Tb = -2;
        try {
          this.field_Ob = param12;
          this.field_Ub = new hl(0L, param6, da.field_h.toUpperCase());
          this.field_Ub.field_xb = 1;
          this.a((byte) 43, this.field_Ub);
          this.field_Wb = new hl(0L, param7);
          this.field_Ub.a((byte) 106, this.field_Wb);
          this.field_Mb = new hl(0L, (hl) null);
          this.a((byte) 19, this.field_Mb);
          if (param11 != null) {
            this.field_Vb = new hl(0L, param8, gi.field_b);
            this.field_Vb.field_N = 11184810;
            this.field_Vb.field_xb = 1;
            this.field_Mb.a((byte) -94, this.field_Vb);
            this.field_Sb = new hl(0L, param8, kb.field_p);
            this.field_Sb.field_xb = 1;
            this.field_Sb.field_N = 11184810;
            this.field_Mb.a((byte) 100, this.field_Sb);
            this.field_bc = new hl(0L, param8);
            this.field_bc.field_N = 16764006;
            this.field_Mb.a((byte) -120, this.field_bc);
            this.field_bc.field_O = "|";
            if (!(5 > mb.field_z) ||
              !(dd.field_c < 2)) {
              L3: {
                stackIn_7_0 = this;
                stackIn_7_1 = null;
                stackIn_7_2 = null;
                stackIn_7_3 = 0L;
                stackIn_7_4 = (mi) (param9);
                if (7 > mb.field_z) {
                  stackIn_8_0 = this;
                  stackIn_7_0Lifetime1 = stackIn_8_0;
                  if (2 > dd.field_c) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = lg.field_I;
                    break L3;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = ja.field_e;
              }
              this.field_ac = new mi(stackIn_7_3, stackIn_7_4, stackIn_9_5);
              this.field_Mb.a((byte) 19, this.field_ac);
            }
            var28 = new hl[3];
            var15 = var28;
            var28[0] = new hl(0L, (hl) null);
            this.field_Mb.a((byte) 106, var28[0]);
            var28[1] = new hl(0L, (hl) null);
            this.field_Mb.a((byte) -88, var28[1]);
            var28[2] = new hl(0L, (hl) null);
            this.field_Mb.a((byte) 57, var28[2]);
            this.field_Qb = new hl[co.field_q];
            for (var16 = 0; var16 < co.field_q; var16++) {
              if (null != bb.field_d[var16]) {
                this.field_Qb[var16] = new hl(0L, param10, bb.field_d[var16]);
                this.field_Qb[var16].field_xb = 0;
                stackIn_15_0 = this.field_Qb[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.field_S = stackIn_16_1;
                this.field_Mb.a((byte) 106, this.field_Qb[var16]);
              }
            }
            this.field_Kb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Kb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_Ib.b(wl.field_b);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_Ib.b(la.field_j);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_Ib.b(me.field_f);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; co.field_q > var17Lifetime4; var17Lifetime4++) {
              if (null != this.field_Qb[var17Lifetime4]) {
                var18 = this.field_Qb[var17Lifetime4].f(-82);
                if (var18 > var16Lifetime2) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(var18Lifetime3, -124, param6, var28[0], wl.field_b, var16Lifetime2);
            var18Lifetime3 = this.a(-50, this.field_Qb[6], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.a(-113, this.field_Qb[9], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.a(-119, this.field_Qb[5], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.a(-107, this.field_Qb[7], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.a(-56, this.field_Qb[15], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.a(-51, this.field_Qb[4], var18Lifetime3, var28[0], var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var18Lifetime4, -127, param6, var28[1], la.field_j, var16Lifetime2);
            var18Lifetime4 = this.a(-116, this.field_Qb[16], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.a(-103, this.field_Qb[17], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.a(-80, this.field_Qb[18], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.a(-38, this.field_Qb[19], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.a(-35, this.field_Qb[20], var18Lifetime4, var28[1], var16Lifetime2);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var18Lifetime5, 102, param6, var28[2], me.field_f, var16Lifetime2);
            var18Lifetime5 = this.a(-122, this.field_Qb[13], var18Lifetime5, var28[2], var16Lifetime2);
            var18Lifetime5 = this.a(-74, this.field_Qb[21], var18Lifetime5, var28[2], var16Lifetime2);
            var18Lifetime5 = this.a(-41, this.field_Qb[11], var18Lifetime5, var28[2], var16Lifetime2);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + 3 * var16Lifetime2;
            var20 = this.field_Ub.f(-40);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.field_ac) {
              var20Lifetime2 = this.field_ac.e(-122, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Ub.a((byte) -111, 13 + var19 + 13, 0, 24, 0);
            this.field_Wb.a((byte) -109, 15, 5, 15, -20 + this.field_Ub.field_Hb);
            var21 = 10;
            this.field_Vb.a((byte) -125, var19, var21, qe.field_d * 2, 13);
            var21 = var21 + qe.field_d * 2;
            this.field_Sb.a((byte) -127, var19, var21, 2 * qe.field_d, 13);
            var21 = var21 + (qe.field_d * 2 + 10);
            this.field_bc.a((byte) -79, 0, var21, qe.field_d, 0);
            var21 = var21 + (qe.field_d + 10);
            if (this.field_ac != null) {
              var20Lifetime3 = this.field_ac.e(-127, 4);
              this.field_ac.a((-var20Lifetime3 + var19) / 2 + 13, var20Lifetime3, 3, qe.field_d, 4, var21);
              var21 = var21 + (10 + qe.field_d);
            }
            var28[0].a((byte) -103, var16Lifetime2, var21, var17Lifetime5, 13);
            var28[1].a((byte) -92, var16Lifetime2, var21, var17Lifetime5, var16Lifetime2 + 13 + 13);
            var28[2].a((byte) -79, var16Lifetime2, var21, var17Lifetime5, 13 + var16Lifetime2 * 2 + 26);
            var22 = var21;
            this.field_Mb.a((byte) -90, var19 + 13 + 13, 24, 10 + (var22 + var17Lifetime5), 0);
            this.field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
            var23 = 13 + var19 + 13;
            var24 = var17Lifetime5 + (var22 + 24 + 10);
            var25 = eo.a(var23, (byte) 97, param0, param2);
            var26 = mh.a(param3, param1, var24, -8748);
            this.a((byte) -85, var23, var26, var24, var25);
            return;
          }
          this.field_Vb = new hl(0L, param8, lo.field_d);
          this.field_Vb.field_xb = 1;
          this.field_Vb.field_N = 11184810;
          this.field_Mb.a((byte) -105, this.field_Vb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Vb.field_Ib.c(this.field_Vb.field_jb, var15_int);
          this.field_Vb.a((byte) -114, var15_int, var16Lifetime1, qe.field_d * var17Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + qe.field_d * var17Lifetime1;
          this.field_Mb.a((byte) -99, 13 + var15_int + 13, 24, var16Lifetime1 + 10, 0);
          this.field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
          var18Lifetime1 = 13 + (var15_int + 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = eo.a(var18Lifetime1, (byte) 89, param0, param2);
          var21Lifetime1 = mh.a(param3, param1, var19Lifetime1, -8748);
          this.a((byte) -116, var18Lifetime1, var21Lifetime1, var19Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("om.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          bc var4 = null;
          bc var5 = null;
          if (cf.field_p == null) {
            cf.field_p = oi.field_l.a(ko.field_t, pd.field_r, (byte) 104);
          }
          if (param1 > -37) {
            return true;
          }
          if (0 == cf.field_p.field_d) {
            return false;
          }
          long dupTemp$0 = k.a(0);
          rj.field_n = dupTemp$0;
          sj.field_k = dupTemp$0;
          if (cf.field_p.field_d != 1) {
            qi.field_p = hg.field_d;
          } else {
            try {
              wa.field_e = new fl((java.net.Socket) (cf.field_p.field_f), oi.field_l);
              var4 = kb.field_q;
              var5 = var4;
              nd.field_Lb.field_t = 0;
              mh.field_g = param0 ? -2 : -1;
              lk.field_sb = param0 ? -2 : -1;
              md.field_A = param0 ? -2 : -1;
              var5.field_t = 0;
              qi.field_p = bc.field_z;
              je.a(-85, wg.field_c, nd.field_Lb, wc.field_I, rl.field_a);
              ak.a((byte) -60, -1);
            } catch (IOException iOException) {
              qi.field_p = hg.field_d;
            }
          }
          cf.field_p = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, hl param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -31) {
            stackIn_2_0 = -86;
            return stackIn_2_0;
          }
          param2 += 8;
          var6_int = param1.field_Ib.b(param1.field_jb, param4 - param1.field_V * 2, param1.field_Q);
          param1.a((byte) -86, param4, param2, var6_int, 0);
          param2 = param2 + (0 + var6_int);
          param3.a((byte) -96, param1);
          stackIn_4_0 = param2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("om.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        mi stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        hl stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = TetraLink.field_J;
        this.a(0, param0);
        if (null != this.field_bc) {
          this.field_bc.field_jb = this.field_Kb.toString();
          this.field_bc.field_M = (this.field_Hb - this.field_bc.field_Ib.b(this.field_bc.field_jb)) / 2;
          if (null != this.field_ac &&
            this.field_ac.field_F != 0) {
            stackIn_7_0 = this.field_ac;
            stackIn_8_1 = !(this.field_ac.field_zb);
            stackIn_7_0.field_zb = stackIn_8_1;
          }
          this.field_bc.field_Hb = this.field_Hb - this.field_bc.field_M;
          for (var3 = 0; var3 < co.field_q; var3++) {
            if (null != this.field_Qb[var3]) {
              stackIn_16_0 = this.field_Qb[var3];
              stackIn_17_1 = !(this.field_Kb.length() <= 0);
              stackIn_16_0.field_S = stackIn_17_1;
              if (this.field_Qb[var3].field_S &&
                this.field_Qb[var3].field_F != 0) {
                return var3;
              }
            }
          }
        }
        if (param1) {
          field_Xb = (String) null;
        }
        if (this.field_Wb.field_F != 0) {
          return -1;
        }
        if (param0 &&
          tm.field_t != 0 &&
          0 == this.field_F) {
          return -1;
        }
        return this.field_Tb;
    }

    final static void a(boolean param0, boolean param1, String param2, String param3) {
        try {
          mk.field_d = param3;
          ll.field_w = param2;
          uf.a(ec.field_d, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "om.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (param0) {
          if (lb.field_P[param3] < lb.field_P[param1]) {
            return true;
          }
          if (lb.field_P[param1] < lb.field_P[param3]) {
            return false;
          }
          if (fe.field_b[param3] < fe.field_b[param1]) {
            return true;
          }
          if (fe.field_b[param1] < fe.field_b[param3]) {
            return false;
          }
        } else {
          if (fe.field_b[param1] > fe.field_b[param3]) {
            return true;
          }
          if (fe.field_b[param1] < fe.field_b[param3]) {
            return false;
          }
          if (lb.field_P[param3] < lb.field_P[param1]) {
            return true;
          }
          if (lb.field_P[param1] < lb.field_P[param3]) {
            return false;
          }
        }
        if (param2 < 112) {
          om.a(false, -3, -111, 88);
        }
        var4 = ac.field_b[param3] + ai.field_g[param3] + gl.field_n[param3];
        var5 = ai.field_g[param1] + (ac.field_b[param1] + gl.field_n[param1]);
        if (var5 > var4) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        return !(param1 <= param3);
    }

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          return true;
        }
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (ka.a(65, param0)) {
          return true;
        }
        if (param0 != 45 &&
          param0 != 160 &&
          param0 != 32) {
          if (95 != param0) {
            return false;
          }
          return true;
        }
        return true;
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_Yb = (int[]) null;
        }
        field_Xb = null;
        field_Yb = null;
        field_Zb = null;
        field_Pb = null;
        field_Lb = null;
    }

    static {
        field_Zb = "Yes";
        field_Pb = "Confirm Email:";
        field_Lb = "Mouse over an icon for details";
        field_Xb = "Waiting for <%0> to start the game...";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$b4eb2ef2f0cf(ud param0, int param1, ud param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var3_int = param0.field_Rb - param2.field_Rb;
          if (param1 < 98) {
            field_Nb = -127;
          }
          if (ul.field_e != param0.field_Ub) {
            if (null == param0.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2.field_Ub != ul.field_e) {
            if (param2.field_Ub == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("om.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }
}
