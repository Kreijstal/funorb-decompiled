/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ta {
    static boolean[] field_Z;
    private hd field_K;
    static String field_L;
    private int field_V;
    static ut field_S;
    private hd field_ab;
    private int field_U;
    private hd field_X;
    private dd field_cb;
    private int field_Q;
    private hd field_G;
    private hd field_Y;
    private String field_T;
    private hd field_F;
    private vn field_db;
    private int field_R;
    private hd[] field_J;
    private hd field_H;
    static String field_W;
    private int field_bb;
    static String field_M;
    private hd field_eb;
    private hd field_P;
    static boolean field_O;
    private int field_N;
    static String field_I;

    final void a(byte param0, boolean param1) {
        int stackIn_28_0 = 0;
        int stackIn_29_1 = 0;
        int var3;
        nt var4_ref_nt;
        int var4;
        tf var5;
        gi var6;
        int var7;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        super.a((byte) -40, param1);
        this.field_P.field_s = this.field_j + 16;
        this.field_P.b(0, param1);
        this.field_ab.field_s = this.field_j;
        this.field_ab.b(0, param1);
        var3 = 44 / ((38 - param0) / 60);
        this.g(0);
        var4_ref_nt = (nt) (this.field_F.field_jb.g(24009));
        while (var4_ref_nt != null) {
          var4_ref_nt.c(-1, param1);
          if (var4_ref_nt.field_Jb.field_sb == 0) {
            var4_ref_nt = (nt) (this.field_F.field_jb.c(33));
            continue;
          }
          if (!var4_ref_nt.field_Ib &&
            !var4_ref_nt.field_Kb) {
            ub.a(var4_ref_nt.field_Cb.field_m, (byte) -38);
          }
          var4_ref_nt = (nt) (this.field_F.field_jb.c(33));
        }
        for (var4 = 0; 2 > var4; var4++) {
          var5 = this.field_J[var4].field_jb;
          var6 = (gi) (var5.g(24009));
          while (var6 != null) {
            if (0 != var6.field_sb) {
              if (var4 != 0) {
                mr.a((byte) 74, var6.field_yb);
              } else {
                kw.a(123, var6.field_yb);
              }
              kj.a((byte) -117);
            }
            var6 = (gi) (var5.c(33));
          }
        }
        var4Lifetime1 = 0;
        if (this.field_Y.field_sb == 1) {
          var4Lifetime1--;
          kj.a((byte) -99);
        }
        if (this.field_K.field_sb == 1) {
          var4Lifetime1++;
          kj.a((byte) -116);
        }
        if (wr.field_f < wt.field_x &&
          id.field_v != 0) {
          stackIn_28_0 = var4Lifetime1;
          stackIn_29_1 = (id.field_v >= 0) ? 1 : -1;
          var4Lifetime1 = stackIn_28_0 + stackIn_29_1;
        }
        if (var4Lifetime1 != 0) {
          this.c(-75, var4Lifetime1);
        }
        if (this.field_bb != ic.field_h.field_w ||
          this.field_N != ic.field_h.field_k ||
          ic.field_h.field_R != this.field_Q) {
          this.f(-3);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var6_int = 0;
        int var7 = 0;
        rd[] var5_ref_rd__;
        int var5;
        hd var6;
        up[] var6_array;
        rd var7_ref_rd;
        up var8;
        int var9;
        up[] var10;
        tf var11;
        var9 = Kickabout.field_G;
        super.a(0, param1, param2);
        this.field_P.field_s = 656;
        this.field_P.b(0, false);
        this.field_ab.field_s = 640;
        this.field_ab.b(param0 ^ 0, false);
        var11 = new tf();
        var5_ref_rd__ = je.field_f;
        for (var6_int = 0; var5_ref_rd__.length > var6_int; var6_int++) {
          var7_ref_rd = var5_ref_rd__[var6_int];
          if (var7_ref_rd.a(ic.field_h.field_e, param0 + 109, tk.field_Ib)) {
            var11.a(new nt(ic.field_h, var7_ref_rd), 3);
          }
        }
        this.field_F.field_jb = var11;
        var5 = 5;
        var6 = (hd) (this.field_F.field_jb.g(24009));
        while (var6 != null) {
          var6.field_mb = this.field_F.field_mb;
          var6.field_s = var5;
          var6.field_J = 0;
          var5 = var5 + (12 + var6.field_q);
          var6 = (hd) (this.field_F.field_jb.c(33));
        }
        this.field_F.field_s = 0;
        this.field_V = param0;
        this.field_F.field_q = var5 - 12 + 10;
        var10 = ic.field_h.field_i;
        var6_array = ic.field_h.field_i;
        for (var7 = 0; var7 < var10.length; var7++) {
          var8 = var10[var7];
          if (!var8.c(-2)) {
            this.field_V = this.field_V + 1;
          }
        }
        this.field_U = 0;
        this.f(-3);
    }

    private final void g(int param0) {
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        hd stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        hd stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        if (cg.field_D > 0) {
          cg.field_D = cg.field_D - 1;
        }
        var2 = 0;
        if (1 == this.field_eb.field_qb) {
          if (0 == this.field_R % 2) {
            this.field_F.field_fb = this.field_F.field_fb + 16;
            var2 = 1;
          }
          if (cg.field_D == 0) {
            sp.c(59, 119);
            cg.field_D = 8;
          }
          this.field_R = this.field_R + 1;
        }
        if (this.field_H.field_qb == 1) {
          if (this.field_R % 2 == 0) {
            this.field_F.field_fb = this.field_F.field_fb - 16;
            var2 = 1;
          }
          if (cg.field_D == 0) {
            sp.c(60, 33);
            cg.field_D = 8;
          }
          this.field_R = this.field_R + 1;
        }
        var3 = id.field_v;
        if (0 != var3 &&
          this.field_X.field_gb) {
          this.field_F.field_fb = this.field_F.field_fb - 16 * var3;
          var2 = 1;
          if (0 == cg.field_D) {
            stackIn_25_0 = (var3 > 0) ? 60 : 59;
            sp.c(stackIn_25_0, -125);
            cg.field_D = 8;
          }
        }
        stackIn_29_0 = (-(this.field_F.field_fb + this.field_F.field_s) > 0) ? 0 : 1;
        var4 = stackIn_29_0;
        stackIn_32_0 = (this.field_F.field_G + (this.field_F.field_q - this.field_G.field_q) > -(this.field_F.field_s + this.field_F.field_fb)) ? 0 : 1;
        var5 = stackIn_32_0;
        stackIn_34_0 = this.field_eb;
        stackIn_35_1 = (var4 != 0) ? false : true;
        stackIn_34_0.field_lb = stackIn_35_1;
        if (this.field_eb.field_qb == param0 &&
          0 == this.field_H.field_qb) {
          this.field_R = 0;
        }
        stackIn_41_0 = this.field_H;
        stackIn_42_1 = (var5 != 0) ? false : true;
        stackIn_41_0.field_lb = stackIn_42_1;
        if (var2 != 0) {
          if (var4 != 0) {
            this.field_F.field_fb = -this.field_F.field_s;
          }
          if (var5 != 0) {
            this.field_F.field_fb = -this.field_F.field_s - (-this.field_G.field_q + (this.field_F.field_G + this.field_F.field_q));
          }
        }
    }

    private final void c(int param0, int param1) {
        int var3 = this.field_U;
        this.field_U = this.field_U + param1;
        if (param0 >= -7) {
          this.field_X = (hd) null;
        }
        if (this.field_U < 0) {
          this.field_U = this.field_V - 1;
        }
        if (this.field_V <= this.field_U) {
          this.field_U = 0;
        }
        if (this.field_U != var3) {
          this.f(-3);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param0 == 96) {
          this.c(-22, -1);
        }
        if (param0 == 97) {
          this.c(-87, 1);
        }
        if (param1 > -5) {
          this.a(78, true);
        }
        return super.a(param0, -100, param2);
    }

    final void a(int param0, boolean param1) {
        hd var3_ref_hd;
        int var3;
        Object var4;
        gi var5;
        int var6;
        nt var7;
        int var3Lifetime1;
        var6 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(this.field_P.field_F - 8, -8 + this.field_P.field_T, this.field_P.field_q + 16, this.field_P.field_mb + 16, 65793, 96);
        var3_ref_hd = (hd) (this.field_P.field_jb.g(param0 + 24014));
        while (var3_ref_hd != null) {
          on.a(var3_ref_hd.field_F, var3_ref_hd.field_T, var3_ref_hd.field_q, var3_ref_hd.field_mb, 10, 65793, 96);
          var3_ref_hd = (hd) (this.field_P.field_jb.c(33));
        }
        un.field_d.a(le.field_c, -26 + this.field_G.field_F, this.field_G.field_T - 16, 16777215, -1);
        for (var3 = 0; var3 < 2; var3++) {
          un.field_d.a(dh.field_j[var3], 6 + this.field_J[var3].field_F, -8 + this.field_J[var3].field_T, 16777215, -1);
        }
        this.field_P.a(114, false);
        pt.a(this.field_G.field_F + this.field_G.field_q, -22914, this.field_G.field_F, this.field_G.field_mb + this.field_G.field_T, this.field_G.field_T);
        var7 = (nt) (this.field_F.field_jb.g(24009));
        while (var7 != null) {
          var7.h(-24508);
          var7 = (nt) (this.field_F.field_jb.c(33));
        }
        ta.e(124);
        for (var3Lifetime1 = 0; var3Lifetime1 < 2; var3Lifetime1++) {
          var4 = null;
          var5 = (gi) (this.field_J[var3Lifetime1].field_jb.g(24009));
          while (var5 != null) {
            if (!var5.c(false)) {
              var5.a(param0 ^ -8);
            } else {
              var4 = var5;
            }
            var5 = (gi) (this.field_J[var3Lifetime1].field_jb.c(33));
          }
          if (var4 != null) {
            ((gi) (var4)).a(param0 + 8);
          }
        }
    }

    final void b(int param0) {
        int var4_int = 0;
        gi var5 = null;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        int var3Lifetime1;
        this.field_P = new hd();
        this.field_X = new hd();
        hd var7 = new hd();
        this.field_P.a(true, 370, 16, 80, 330);
        this.field_X.a(true, 370, 0, 0, 130);
        var7.a(true, 370, 0, 140, 190);
        this.field_P.a((byte) -115, this.field_X);
        this.field_P.a((byte) -113, var7);
        this.field_F = new hd();
        this.field_G = new hd();
        this.field_eb = eo.a(false);
        this.field_H = eo.a(true);
        this.field_eb.field_s = 5;
        this.field_H.field_s = this.field_X.field_q - (this.field_H.field_q + 5);
        this.field_H.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 1;
        this.field_eb.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 1;
        this.field_G.a((byte) -114, this.field_F);
        this.field_G.a(true, 290, 40, 38, 84);
        this.field_F.field_mb = this.field_G.field_mb;
        this.field_X.a((byte) -105, this.field_G);
        this.field_X.a((byte) -115, this.field_eb);
        this.field_X.a((byte) -122, this.field_H);
        this.field_J = new hd[2];
        for (var3 = 0; var3 < 2; var3++) {
          this.field_J[var3] = new hd();
          for (var4_int = 0; var4_int < 32; var4_int++) {
            var5 = new gi(ic.field_h, var3, var4_int);
            var5.a(true, 22, 22 * (var4_int % 16), var4_int / 16 * 22, 22);
            this.field_J[var3].a((byte) -110, (hd) (var5));
          }
          this.field_J[var3].a(true, 354, 8, 40, 58);
          var7.a((byte) -123, this.field_J[var3]);
        }
        hd dupTemp$0 = this.field_J[1];
        dupTemp$0.field_J = dupTemp$0.field_J + ((var7.field_mb >> 1) - 6);
        this.field_Y = eo.a(false);
        this.field_K = eo.a(true);
        var3Lifetime1 = 5;
        this.field_Y.field_s = -this.field_Y.field_q + (-var3Lifetime1 + 532);
        this.field_K.field_s = 532 + var3Lifetime1;
        hd var4 = this.field_Y;
        this.field_K.field_J = 436;
        var4.field_J = 436;
        this.field_ab = new hd();
        this.field_ab.a((byte) -106, this.field_Y);
        this.field_ab.a((byte) -105, this.field_K);
        this.field_ab.a(true, 640, 0, 0, 480);
        if (param0 != -38) {
          this.field_R = -25;
        }
        this.field_cb = new dd(1);
    }

    private final void f(int param0) {
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        Object stackIn_15_4;
        int stackIn_15_5;
        Object stackIn_15_6;
        int stackIn_15_7;
        boolean stackIn_16_8 = false;
        Object stackIn_19_0;
        boolean stackIn_20_6 = false;
        int var2;
        Object var3;
        int var4;
        up var5;
        int var6;
        Object stackIn_19_0Lifetime1;
        var6 = Kickabout.field_G;
        if (param0 != -3) {
          field_Z = (boolean[]) null;
        }
        var2 = this.field_U;
        var3 = null;
        var4 = 0;
        L2: while (true) {
          if (var4 < 9) {
            var5 = ic.field_h.field_i[ic.field_h.field_q[var4]];
            if (!var5.c(param0 ^ 3)) {
              if (var2 == 0) {
                var3 = var5;
                break L2;
              }
              var2--;
            }
            var4++;
            continue;
          }
          break;
        }
        if (var3 == null) {
          this.field_db = null;
        } else {
          stackIn_15_0 = this;
          stackIn_15_1 = 109;
          stackIn_15_2 = ic.field_h.field_R;
          stackIn_15_3 = ic.field_h.field_k;
          stackIn_15_4 = var3;
          stackIn_15_5 = ic.field_h.field_w;
          stackIn_15_6 = var3;
          stackIn_15_7 = -107;
          stackIn_16_8 = !(jd.f(-1));
          boolean decompiledFrameRemainder0 = true;
          stackIn_19_0 = this;
          if (((up) stackIn_15_6).c((byte) stackIn_15_7, stackIn_16_8)) {
            stackIn_19_0Lifetime1 = this;
            if (wn.a((byte) 110)) {
              stackIn_20_6 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_20_6 = false;
          }
          this.field_db = pi.a(stackIn_15_1, stackIn_15_2, stackIn_15_3, (up) (stackIn_15_4), stackIn_15_5, stackIn_20_6);
          this.field_T = 1 + this.field_U + ": " + ((up) (var3)).d(100);
          this.field_N = ic.field_h.field_k;
          this.field_bb = ic.field_h.field_w;
          this.field_Q = ic.field_h.field_R;
          this.field_cb.a(pv.field_I[((up) (var3)).field_q][3], (byte) -107);
          this.field_cb.a(30, -81);
          if (((up) (var3)).field_q == 2) {
            this.field_cb.a(10, param0 - 36);
          }
        }
        return;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int[] var12 = null;
        int var5 = 0;
        int var6 = 0;
        eg var7 = null;
        int var8 = 0;
        if (param1 < 99) {
          this.field_U = -111;
        }
        if (this.field_db != null) {
          var3 = ((int)(nj.a(75) % 5000L) << 11) / 5000;
          t.c();
          t.b(532 + this.field_j, 410);
          var12 = dt.field_f;
          var5 = t.field_o[var3] * var12[0] >> 16;
          var6 = var12[0] * t.field_f[var3] >> 16;
          var7 = (eg) (this.field_cb.a(this.field_db.b(var12[2], var12[3], var5, var12[1], var6), false, true, true));
          var7.a(0, var3, 0, 0, 0, 0, 0, 540);
          var8 = Math.max(120, pb.field_C.a(this.field_T) + 30);
          on.a(this.field_j + (532 - (var8 >> 1)), 412, var8, 56, 12, 65793, 128);
          pb.field_C.d(this.field_T, 532 + this.field_j, 430, 16777215, -1);
          this.field_ab.a(123, false);
        }
    }

    public static void h(int param0) {
        if (param0 != 8) {
          field_S = (ut) null;
        }
        field_W = null;
        field_I = null;
        field_S = null;
        field_Z = null;
        field_M = null;
        field_L = null;
    }

    final static boolean d(int param0, int param1) {
        if (rj.field_a[param1]) {
          return true;
        }
        if (param0 <= 100) {
          ja.d(98, 120);
        }
        if (!sk.field_d.field_k[0].a(1, 176400, vp.field_j, bq.field_a, ad.field_d[param1])) {
          dd.a((byte) 113);
          return false;
        }
        rj.field_a[param1] = true;
        return true;
    }

    ja() {
        this.field_R = 0;
    }

    static {
        field_Z = new boolean[]{false, true, true, true};
        field_L = "The rating threshold for the <%0> is <%1>.<br>Your rating is<nbsp><%2>; league points won are reduced.";
        field_W = "You must have unlocked a Hidden Achievement to wear this kit.";
        field_M = "Sell";
        field_I = "my current pitch";
    }
}
