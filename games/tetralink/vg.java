/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends hl {
    static String field_Pb;
    private hl field_Rb;
    private hl field_Sb;
    static int field_Lb;
    static tb field_Vb;
    static long[][] field_Ub;
    static long[] field_Ob;
    private StringBuilder field_Tb;
    static String field_Kb;
    private int field_Qb;
    static String field_Mb;
    static String field_Nb;

    final int a(boolean param0, byte param1) {
        StringBuilder discarded$1 = null;
        int var4;
        var4 = TetraLink.field_J;
        this.a(0, param0);
        if (param0) {
          while (nj.b((byte) 28)) {
            if (dg.field_e == 85 &&
              this.field_Tb.length() > 0) {
              lo.a(-26750, this.field_Tb, this.field_Tb.length() - 1, ' ');
            }
            if (lk.a(tb.field_m, -1, (CharSequence) ((Object) this.field_Tb)) ||
              (this.field_Tb.length() == 0 &&
              tb.field_m == 91 ||
              this.field_Tb.length() == 1 &&
              tb.field_m == 35) ||
              93 == tb.field_m) {
              discarded$1 = this.field_Tb.append(tb.field_m);
            }
            if (dg.field_e != 84) {
              if (13 == dg.field_e) {
                return 1;
              }
              continue;
            }
            if (this.field_Tb.length() <= 0) {
              return 1;
            }
            this.field_jb = this.field_Tb.toString();
            return 2;
          }
        }
        if (param1 != 58) {
          return -78;
        }
        this.field_Rb.field_jb = this.field_Tb.toString();
        if (param0 &&
          tm.field_t != 0 &&
          this.field_F == 0) {
          this.field_Qb = 1;
        }
        return this.field_Qb;
    }

    final static void i(int param0) {
        of.b(true);
        t.a(4, 0);
        if (param0 != 5959) {
          ah var2 = (ah) null;
          vg.a((byte) 20, (ah) null);
        }
    }

    public static void e(byte param0) {
        field_Nb = null;
        field_Vb = null;
        if (param0 != 102) {
          field_Vb = (tb) null;
        }
        field_Kb = null;
        field_Ob = null;
        field_Ub = (long[][]) null;
        field_Pb = null;
        field_Mb = null;
    }

    final boolean h(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        if (this.field_Qb != 0) {
          return false;
        }
        if (param0 != 0) {
          field_Mb = (String) null;
        }
        if (dg.field_e == 85 &&
          !(0 >= this.field_Tb.length())) {
          lo.a(-26750, this.field_Tb, this.field_Tb.length() - 1, ' ');
        }
        if (this.field_Tb.length() < 12) {
          var2 = Character.toLowerCase(tb.field_m);
          if (var2 == 32) {
            var2 = 95;
          }
          if (95 == var2 &&
            !(this.field_Tb.length() <= 0)) {
            discarded$0 = this.field_Tb.append((char) var2);
          }
          if (ac.a((byte) -105, (char) var2) ||
            fd.a((char) var2, (byte) 88)) {
            discarded$1 = this.field_Tb.append((char) var2);
          }
        }
        if (dg.field_e != 84) {
        } else {
          if (this.field_Tb.length() > 0) {
            this.field_jb = this.field_Tb.toString();
            this.field_Qb = 2;
          } else {
            this.field_Qb = 1;
          }
        }
        if (dg.field_e != 13) {
          return true;
        }
        this.field_Qb = 1;
        return true;
    }

    vg(int param0, int param1, int param2, int param3, String param4, hl param5, hl param6, hl param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Qb = 0;
        try {
          this.field_Sb = new hl(0L, param6, param4);
          this.a((byte) -93, this.field_Sb);
          this.field_Rb = new hl(0L, param7);
          this.field_Rb.field_N = 16764006;
          this.a((byte) -92, this.field_Rb);
          this.field_Rb.field_O = "|";
          this.field_Tb = new StringBuilder(12);
          var9_int = this.field_Sb.f(-88);
          this.field_Sb.a((byte) -119, var9_int, 3, qe.field_d, 5);
          this.field_Rb.a((byte) -100, var9_int, qe.field_d + 3, qe.field_d, 5);
          var10 = var9_int + 10;
          var11 = 3 + (qe.field_d * 2 + 3);
          var12 = eo.a(var10, (byte) 124, param0, param2);
          var13 = mh.a(param3, param1, var11, -8748);
          this.a((byte) -115, var10, var13, var11, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("vg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        vj var4 = null;
        int var4_int = 0;
        int var5 = 0;
        bm var5_ref_bm = null;
        int[] var6 = null;
        int var8 = 0;
        bc var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = TetraLink.field_J;
        try {
          var9 = kb.field_q;
          var2 = var9.d((byte) -99);
          if (param0 < 33) {
            return;
          }
          var3 = var9.d((byte) -99);
          if (var2 == 0) {
            var4 = (vj) (bd.field_c.c(false));
            if (var4 == null) {
              mk.a(false);
              return;
            }
            var5 = rl.field_d - var9.field_t;
            var11 = var4.field_r;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -99) << (pl.a(var7, 3) << 8));
            }
            var4.b(false);
            return;
          }
          if (var2 == 1) {
            var4_int = var9.e((byte) 82);
            var5_ref_bm = (bm) (gm.field_a.c(false));
            while (var5_ref_bm != null) {
              if (var3 != var5_ref_bm.field_t ||
                var5_ref_bm.field_r != var4_int) {
                var5_ref_bm = (bm) (gm.field_a.a((byte) -70));
                continue;
              }
              break;
            }
            if (var5_ref_bm != null) {
              var5_ref_bm.b(false);
              return;
            }
            mk.a(false);
            return;
          }
          fk.a(-105, (Throwable) null, "LR1: " + hc.a(false));
          mk.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "vg.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, ah param1) {
        db.field_b = ug.a(param1, (byte) -45, "display_name_changed", "basic");
        pj.field_f = new ji(0L, nj.field_b, wd.field_d, re.field_S);
        fl.field_n = new ji(0L, nj.field_b, re.field_Q, kk.field_P);
        go.field_d = new hl(0L, (hl) null);
        mi.field_Kb = new hl(0L, bk.field_i);
        mi.field_Kb.field_xb = 1;
        th.field_i = new hl(0L, mb.field_x, bm.field_o);
        eo.field_b = new hl(0L, um.field_l, kl.field_g);
        kd.field_i = new hl(0L, ek.field_n);
        go.field_d.a((byte) -85, mi.field_Kb);
        go.field_d.a((byte) 59, th.field_i);
        go.field_d.a((byte) -107, eo.field_b);
        go.field_d.a((byte) -117, pj.field_f);
        go.field_d.a((byte) 64, kd.field_i);
        pj.field_f.field_Rb.field_Ob.a(bk.field_i, -2147483648);
        pj.field_f.field_Rb.field_Ob.field_J = 1;
        hl var5 = pj.field_f.field_Rb.field_Ob;
        hl var6 = var5;
        var6.field_xb = 1;
        fl.field_n.field_Rb.field_Ob.a(bk.field_i, -2147483648);
        hl var3 = fl.field_n.field_Rb.field_Ob;
        if (param0 <= 20) {
          return;
        }
        try {
          fl.field_n.field_Rb.field_Ob.field_J = 1;
          var3.field_xb = 1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "vg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j(int param0) {
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var5Lifetime3;
        var9 = TetraLink.field_J;
        try {
          if (aa.field_bc == null) {
            stackIn_6_0 = (null != ud.field_Qb) ? 1 : 0;
          } else {
            stackIn_6_0 = aa.field_bc.field_b ? 1 : 0;
          }
          var1_int = stackIn_6_0;
          if (var1_int != 0) {
            stackIn_9_0 = oj.field_a.field_z;
          } else {
            stackIn_9_0 = 480;
          }
          var2 = stackIn_9_0;
          if (param0 < 83) {
            return;
          }
          if (0 != ml.field_ab ||
            wk.field_u != 0) {
            var3 = 128;
            var4 = 4210752;
            if (dd.field_a == 0) {
              var4 = 128;
            }
            if (0 == ml.field_ab) {
              var3 = wd.field_i / 2;
            }
            if (0 == wk.field_u) {
              var3 = (-wd.field_i + 256) / 2;
            }
            for (var5 = 0; var5 < 18; var5++) {
              ra.e(-(int)a.field_d + (640 + var5 / 2), -var5 + var2, -(var5 / 2) + (int)a.field_d, var4, var3);
              ra.e(var5 / 2 + (638 - (int)a.field_d), var2 - var5, 2, 16777215, var3);
            }
            for (var5Lifetime3 = 18; var5Lifetime3 < 20; var5Lifetime3++) {
              ra.e(-(int)a.field_d + (638 + var5Lifetime3 / 2), -var5Lifetime3 + var2, 2 + ((int)a.field_d - var5Lifetime3 / 2), 16777215, var3);
            }
            var5_ref = null;
            if (ml.field_ab == 1) {
              var5_ref = qf.field_d;
            }
            if (ml.field_ab == 2) {
              var5_ref = ai.field_c;
            }
            if (wd.field_i == 0) {
              go.field_g.b((String) (var5_ref), -(int)a.field_d + 652, var2 - 2, 16777215, -1);
            } else {
              var6_ref = null;
              if (1 == wk.field_u) {
                var6_ref = qf.field_d;
              }
              if (wk.field_u == 2) {
                var6_ref = ai.field_c;
              }
              go.field_g.c((String) (var5_ref), -(int)a.field_d + 652, -2 + var2, 16777215, -1, -wd.field_i + 256);
              go.field_g.c((String) (var6_ref), -(int)a.field_d + 652, var2 - 2, 16777215, -1, wd.field_i);
            }
          }
          if (ml.field_ab != 2 &&
            wk.field_u != 2) {
            return;
          }
          var2 -= 20;
          var3Lifetime1 = 128;
          var4Lifetime1 = 256;
          if (ml.field_ab != 2) {
            var3Lifetime1 = wd.field_i / 2;
            var4Lifetime1 = wd.field_i;
          }
          if (wk.field_u != 2) {
            var4Lifetime1 = 256 - wd.field_i;
            var3Lifetime1 = (256 - wd.field_i) / 2;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 4; var5Lifetime1++) {
            var6 = 4210752;
            if (dd.field_a == 1 + var5Lifetime1) {
              var6 = 128;
            }
            var7 = 638 + (-(int)a.field_d - (-(26 * var5Lifetime1) - 10));
            for (var8 = 0; var8 < 18; var8++) {
              ra.e(var8 / 2 + (var7 + 2), var2 - var8, 24, var6, var3Lifetime1);
              ra.e(var8 / 2 + var7, -var8 + var2, 2, 16777215, var3Lifetime1);
            }
            if (var4Lifetime1 != 256) {
              l.field_c[var5Lifetime1].a(12 + var7, -13 + var2, var4Lifetime1);
            } else {
              l.field_c[var5Lifetime1].c(12 + var7, var2 - 13);
            }
          }
          var5Lifetime2 = 4210752;
          if (dd.field_a == 5) {
            var5Lifetime2 = 128;
          }
          var6Lifetime1 = 104 + (638 - ((int)a.field_d - 10));
          for (var7Lifetime1 = 0; var7Lifetime1 < 18; var7Lifetime1++) {
            ra.e(var6Lifetime1 + (2 + var7Lifetime1 / 2), -var7Lifetime1 + var2, 30, var5Lifetime2, var3Lifetime1);
            ra.e(var6Lifetime1 + var7Lifetime1 / 2, -var7Lifetime1 + var2, 2, 16777215, var3Lifetime1);
          }
          if (256 == var4Lifetime1) {
            l.field_c[4].c(10 + var6Lifetime1, -13 + var2);
          } else {
            l.field_c[4].a(10 + var6Lifetime1, -13 + var2, var4Lifetime1);
          }
          for (var7Lifetime2 = -2; var7Lifetime2 < 0; var7Lifetime2++) {
            ra.e((-1 + var7Lifetime2) / 2 + (638 - (int)a.field_d + 20), var2 - 20 - var7Lifetime2, 130, 16777215, var3Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "vg.B(" + param0 + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_Ob = new long[11];
        field_Ub = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_Ub[0][var0] = tm.a(tm.a(var4 << 8, tm.a(tm.a(var10 << 24, tm.a(var2 << 32, tm.a(var6 << 40, tm.a(var2 << 56, var2 << 48)))), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_Ub[var14][var0] = tm.a(field_Ub[-1 + var14][var0] << 56, field_Ub[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_Ob[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = 8 * var0 - 8;
            field_Ob[var0] = mb.a(mb.a(pd.a(65280L, field_Ub[6][6 + var1]), mb.a(pd.a(16711680L, field_Ub[5][var1 + 5]), mb.a(mb.a(pd.a(field_Ub[3][3 + var1], 1095216660480L), mb.a(mb.a(pd.a(field_Ub[1][1 + var1], 71776119061217280L), pd.a(-72057594037927936L, field_Ub[0][var1])), pd.a(280375465082880L, field_Ub[2][2 + var1]))), pd.a(field_Ub[4][var1 + 4], 4278190080L)))), pd.a(field_Ub[7][var1 + 7], 255L));
        }
        field_Mb = "Please log in to access this feature.";
        field_Nb = "There are no valid types of game that match your preferences.";
    }
}
