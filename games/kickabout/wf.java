/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends qt {
    private hd field_P;
    private jw[] field_E;
    static int field_Q;
    private jr[] field_B;
    static String field_M;
    static int field_A;
    private hd field_K;
    static String field_I;
    private jh field_G;
    private hd field_R;
    private tf field_T;
    private hd field_L;
    static int field_O;
    private boolean field_N;
    private long field_J;
    private int field_V;
    private int field_S;
    private int field_F;
    private int field_U;
    private int field_D;
    long field_H;
    private int field_C;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4;
        sr[] var5;
        sr[] var6;
        var4 = Kickabout.field_G;
        this.field_L = new hd();
        this.field_L.a(true, 640, 0, 0, 480);
        if (param0 != -38) {
          this.field_B = (jr[]) null;
        }
        this.field_R = eo.a(ir.field_B, 7126504, un.field_d, 162, true);
        this.field_P = eo.a(vd.field_b, 16679959, un.field_d, 162, true);
        this.field_R.field_s = 10;
        this.field_R.field_J = 56;
        this.field_P.field_J = 86;
        this.field_P.field_s = 10;
        this.field_K = new hd();
        this.field_K.field_E = bi.field_a.toLowerCase();
        this.field_K.a(true, 420, 195, 51, 66);
        this.field_E = new jw[4];
        for (var2 = 0; 4 > var2; var2++) {
          this.field_E[var2] = new jw(uf.field_e[var2], pb.field_C, 90);
          this.field_E[var2].field_s = var2 * 100 + 15;
          this.field_E[var2].field_J = 27;
          this.field_E[var2].field_Gb = true;
          this.field_K.a((byte) -117, (hd) (this.field_E[var2]));
        }
        var5 = new sr[gr.field_l.length];
        var6 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
          var5[var3] = ra.field_H;
          if (var3 == 2) {
            var5[var3] = bs.field_a;
          }
        }
        this.field_G = new jh(gk.field_f, gr.field_l, var6, 50);
        this.field_G.a(300, (byte) -116, 122, 7);
        this.field_B = new jr[]{};
        this.field_G.a(this.field_B, 0);
        this.field_L.a((byte) -123, this.field_P);
        this.field_L.a((byte) -106, this.field_R);
        this.field_L.a((byte) -124, this.field_K);
        this.field_L.a((byte) -115, (hd) (this.field_G));
    }

    final static void a(int param0, int param1, kg param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (256 == hw.field_i) {
            param2.a(param1, param3);
          } else {
            param2.a(param1, param3, hw.field_i * param2.field_i >> 8, hw.field_i * param2.field_a >> 8);
          }
          if (param0 != -840618968) {
            field_A = 99;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_M = null;
        if (param0 >= -50) {
          field_M = (String) null;
        }
        field_I = null;
    }

    final static void b(int param0, int param1, byte param2) {
        ml var3 = or.field_d;
        var3.b(param1, (byte) 127);
        var3.a(123, 3);
        int var4 = 127 / ((57 - param2) / 58);
        var3.a(112, 8);
        var3.g(-1207444472, param0);
    }

    final void a(byte param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int var3;
        long var4_long;
        int var4;
        int var5;
        int var6;
        int var7;
        super.a((byte) 124, param1);
        if (this.field_V > 0) {
          this.field_V = this.field_V - 1;
        }
        var3 = this.field_G.h((byte) 123);
        stackIn_5_0 = param1;
        stackIn_6_1 = (ds.field_g) ? 0 : 1;
        stackIn_9_2 = (dg.field_e) ? 0 : 1;
        stackIn_11_1 = stackIn_6_1 & stackIn_9_2;
        stackIn_12_2 = (la.a(100)) ? 0 : 1;
        param1 = stackIn_5_0 & (stackIn_11_1 & stackIn_12_2) != 0;
        this.field_G.a(param1, false);
        this.field_L.field_s = this.field_j;
        this.field_L.b(0, param1);
        if (param1) {
          var4_long = nj.a(73);
          if (var4_long >= (this.field_H + 10000L)) {
            this.a(true, (byte) -127);
          }
        }
        this.a(false, param1);
        var4 = this.field_G.i((byte) -124) - this.g((byte) 63);
        var5 = this.field_G.b(64);
        var6 = this.field_G.j((byte) 34);
        if (-1 == var5) {
          var5 = 4;
        }
        if (param1 && (this.field_S != this.field_U ||
          var5 != this.field_F ||
          var6 != this.field_C ||
          var4 < -4 + this.field_D ||
          var4 > 4 + this.field_D)) {
          this.field_J = -1L;
          this.field_C = var6;
          this.field_D = var4;
          this.field_F = var5;
          this.a(false, (byte) -126);
        }
        this.field_S = this.field_U;
        var7 = -68 % ((38 - param0) / 60);
        if (var3 < this.field_G.h((byte) -25) &&
          this.field_V == 0) {
          sp.c(59, 42);
          this.field_V = 10;
        }
        if (var3 > this.field_G.h((byte) -126) &&
          this.field_V == 0) {
          sp.c(60, -101);
          this.field_V = 10;
        }
    }

    final int b(int param0, int param1) {
        int var3;
        int stackIn_14_0 = 0;
        if (la.a(100)) {
          var3 = 320;
          if (param0 == 1) {
            return var3 - (this.field_i[1].field_d + this.field_i[0].field_d >> 1);
          }
          if (param0 == 0) {
            return 24 + (var3 - ((this.field_i[1].field_d + this.field_i[0].field_d >> 1) - this.field_i[1].field_d * 2));
          }
          if (param0 == 2) {
            return 600;
          }
        }
        if (param1 != -22667) {
          return 15;
        }
        stackIn_14_0 = (param0 == 1) ? 600 : 320;
        return stackIn_14_0;
    }

    final static ut[][][] a(int param0, ut param1) {
        int var4_int = 0;
        int var6_int = 0;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        ut[][][] stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ut var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        ut[] var6 = null;
        ut[][][] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        String var14 = null;
        int var15 = 0;
        int[] var16 = null;
        var15 = Kickabout.field_G;
        try {
          var16 = new int[]{uv.field_e, pb.field_A, rb.field_Kb, oc.field_e};
          var3 = new ut(32, 32);
          iw.a(-111, var3);
          for (var4_int = 15; var4_int < 19; var4_int++) {
            on.f(4, var4_int, 26, 592137);
          }
          var4 = 1.0f;
          var5 = 0.4000000059604645f;
          for (var6_int = 2; 20 > var6_int; var6_int++) {
            on.a(var6_int, -(int)var4 + 17, (int)(2.0f * var4), 65793);
            var4 = var4 + var5;
          }
          ta.e(117);
          var6 = new ut[4];
          for (var7_int = 0; 4 > var7_int; var7_int++) {
            var6[var7_int] = var3.b();
          }
          var6[1].g();
          var6[2].d();
          var6[param0].c();
          var7 = new ut[2][4][2];
          for (var8 = 0; var8 < 16; var8++) {
            stackIn_15_0 = ((8 & var8) != 0) ? 0 : 1;
            var9 = stackIn_15_0;
            var10 = 3 & var8 >> 1;
            stackIn_18_0 = ((var8 & 1) == 0) ? 0 : 1;
            var11 = stackIn_18_0;
            stackIn_21_0 = (var11 != 0) ? 1 : 0;
            var12 = stackIn_21_0;
            var13 = new ut(param1.field_o, param1.field_v);
            iw.a(-96, var13);
            param1.d(0, 0);
            if (var11 == 0) {
              on.g(0, 0, on.field_g, on.field_f);
            }
            if (var9 == 0) {
              var6[var10].f(-7 + (on.field_g >> 1), var12 + 5);
            } else {
              var14 = mk.field_b[var16[var10]].toLowerCase();
              un.field_d.d(var14, (on.field_g >> 1) + var12, 18 + var12, 65793, -1);
            }
            ta.e(120);
            sd.a(var13, (byte) -51);
            var7[var8 >> 3][qj.b(3, var8 >> 1)][qj.b(var8, 1)] = var13;
          }
          stackIn_28_0 = var7;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("wf.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final int g(byte param0) {
        int var2 = -70 % ((param0 - 8) / 47);
        return this.field_T.a(false) > 0 ? 2 + this.field_T.a(false) : 0;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 ^ 0, param1, param2);
        kc.a(tu.field_E.field_x, param0 + 415422632);
        this.field_N = true;
        this.field_B = new jr[param0];
        this.field_G.a(0, (byte) -47, this.field_B, 5);
        this.field_G.field_Db = -1;
        this.field_G.b(4, 113);
        this.field_U = 15;
        this.field_F = 4;
        this.field_S = this.field_U;
        this.field_C = 0;
        this.field_D = 0;
        if (!dg.field_e) {
          if (ds.field_g) {
            return;
          }
          this.e(30353);
          this.a(true, (byte) -126);
          return;
        }
    }

    private final void a(vc param0, int param1) {
        vc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Kickabout.field_G;
        try {
          var3 = (vc) (this.field_T.g(24009));
          if (param1 != 640) {
            this.field_B = (jr[]) null;
          }
          while (var3 != null) {
            if (var3.field_a == param0.field_a) {
              var3 = param0;
            }
            var3 = (vc) (this.field_T.c(param1 ^ 673));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wf.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        ig.b(this.field_j, -12452);
        if (param1 < 99) {
          this.field_F = -63;
        }
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        String stackIn_8_0 = null;
        String var3;
        int var4;
        var4 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(this.field_K.field_F, this.field_K.field_T, this.field_K.field_q, this.field_K.field_mb, 65793, 96);
        on.a(this.field_K.field_F + 8, 23 + this.field_K.field_T, this.field_K.field_q - 16, -30 + this.field_K.field_mb, 10, 65793, 96);
        un.field_d.a(this.field_K.field_E, 13 + this.field_K.field_F, 17 + this.field_K.field_T, 16777215, -1);
        for (var3_int = 0; 4 > var3_int; var3_int++) {
          this.field_E[var3_int].a(false, (byte) 46);
        }
        this.field_G.a(-82);
        this.field_L.a(63, false);
        if (this.field_N) {
          if (this.field_U == 0) {
            stackIn_8_0 = aa.field_h;
          } else {
            stackIn_8_0 = bh.field_t;
          }
          var3 = stackIn_8_0;
          pb.field_C.d(var3, this.field_G.field_F + (this.field_G.field_q >> 1), (this.field_G.field_mb >> 1) + this.field_G.field_T, 16777215, -1);
        }
        if (la.a(param0 ^ -97)) {
          on.a(this.field_j, 48, 640, 383, 0, 196);
        }
        if (ds.field_g ||
          dg.field_e) {
          on.a(this.field_j, 48, 640, 383, 0, 196);
          pb.field_C.a(ew.field_d, this.field_j, 0, 640, 480, 16777215, -1, 1, 1, 0);
        }
    }

    private final boolean a(vc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        vc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var3_int = 4 / ((40 - param1) / 37);
          var4 = (vc) (this.field_T.g(24009));
          while (var4 != null) {
            if (param0.field_a == var4.field_a) {
              return true;
            }
            var4 = (vc) (this.field_T.c(33));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wf.GA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, vc[] param1, int param2, int param3) {
        jh stackIn_47_0 = null;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jr var9_ref_jr = null;
        int var9 = 0;
        jr var10_ref_jr = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jr var12_ref_jr = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        tf var17 = null;
        vc var18 = null;
        jr var10_ref_jrLifetime1;
        jr var10_ref_jrLifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var9Lifetime1;
        var16 = null;
        var15 = Kickabout.field_G;
        try {
          ui.field_w = param1;
          var17 = new tf();
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (this.field_T.a(false) > param3) {
            var18 = (vc) (this.field_T.g(24009));
            while (var18 != null) {
              if (var7 >= param3) {
                if (var7 == 0) {
                  var10_ref_jr = new jr(nc.field_b);
                  var10_ref_jr.field_X = (hu) ((Object) pb.field_C);
                  var10_ref_jr.field_mb = 50;
                  var10_ref_jr.field_y = 16777215;
                  var17.a(var10_ref_jr, 3);
                  var8++;
                }
                var10_ref_jrLifetime2 = new jr(var18, gk.field_f);
                var10_ref_jrLifetime2.field_y = 16777215;
                var10_ref_jrLifetime2.field_mb = 50;
                var10_ref_jrLifetime2.field_X = (hu) ((Object) pb.field_C);
                var8++;
                var17.a(var10_ref_jrLifetime2, 3);
              }
              var7++;
              var18 = (vc) (this.field_T.c(33));
            }
          }
          if (var7 > 0) {
            var9_ref_jr = new jr(ko.field_k);
            var9_ref_jr.field_mb = 50;
            var9_ref_jr.field_y = 16777215;
            var9_ref_jr.field_X = (hu) ((Object) pb.field_C);
            var8++;
            var17.a(var9_ref_jr, 3);
          }
          if (!param0) {
            wf.h((byte) 106);
          }
          for (var9 = 0; var9 < ui.field_w.length; var9++) {
            if (this.a(ui.field_w[var9], (byte) 117)) {
              this.a(ui.field_w[var9], 640);
            }
            var10_ref_jrLifetime1 = new jr(ui.field_w[var9], gk.field_f);
            var10_ref_jrLifetime1.field_mb = 50;
            var10_ref_jrLifetime1.field_X = (hu) ((Object) pb.field_C);
            var10_ref_jrLifetime1.field_y = 16777215;
            var6++;
            var17.a(var10_ref_jrLifetime1, 3);
          }
          var9Lifetime1 = param3;
          if (var9Lifetime1 > 5) {
            var9Lifetime1 = 5;
          }
          if (0 > var9Lifetime1) {
            var9Lifetime1 = 0;
          }
          var10 = -var6 - (param3 + var8 - param2);
          if (param3 < 0) {
            var10 = -var6 + param2;
          }
          if (var10 > 5) {
            var10 = 5;
          }
          if (var10 < 0) {
            var10 = 0;
          }
          this.field_B = new jr[var9Lifetime1 + (var6 - (-var8 - var10))];
          var11 = var9Lifetime1;
          for (var12 = 0; var11 > var12; var12++) {
            this.field_B[var12] = new jr(gk.field_f);
            this.field_B[var12].field_mb = 50;
            this.field_B[var12].field_X = (hu) ((Object) pb.field_C);
            this.field_B[var12].field_y = 16777215;
          }
          var12_ref_jr = (jr) (var17.g(24009));
          while (var12_ref_jr != null) {
            this.field_B[var11] = var12_ref_jr;
            var12_ref_jr = (jr) (var17.c(33));
            var11++;
          }
          for (var12Lifetime1 = var11; var12Lifetime1 < this.field_B.length; var12Lifetime1++) {
            this.field_B[var12Lifetime1] = new jr(gk.field_f);
            this.field_B[var12Lifetime1].field_mb = 50;
            this.field_B[var12Lifetime1].field_X = (hu) ((Object) pb.field_C);
            this.field_B[var12Lifetime1].field_y = 16777215;
          }
          if (this.field_T.a(false) + var6 == 0) {
            this.field_N = true;
          } else {
            this.field_N = false;
          }
          var12Lifetime2 = this.field_G.h((byte) 127);
          var13 = this.g((byte) 84) - var8;
          var14 = this.g((byte) -110);
          stackIn_47_0 = this.field_G;
          if (0 <= param3) {
            stackIn_48_1 = -var9Lifetime1 + (param3 + var13);
          } else {
            stackIn_48_1 = 0;
          }
          ((jh) (Object) stackIn_47_0).a(stackIn_48_1, (byte) -47, this.field_B, param2 + var14);
          this.field_G.a(param0, var12Lifetime2);
          this.field_G.b(0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_52_0 = var5;
          stackIn_52_1 = new StringBuilder().append("wf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(int param0) {
        long var2 = 0L;
        if (!la.a(100)) {
          if (dg.field_e ||
            ds.field_g) {
            return;
          }
          or.field_d.b(84, (byte) 112);
          var2 = nj.a(-79);
          if (param0 != 30353) {
            this.field_J = -31L;
          }
          this.field_H = var2;
          this.field_P.field_lb = true;
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        hd stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        jw stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        int var3;
        int var4;
        int var5;
        var4 = Kickabout.field_G;
        stackIn_2_0 = this.field_R;
        stackIn_3_1 = (dg.field_e) ? 0 : 1;
        stackIn_6_2 = (ds.field_g) ? 0 : 1;
        stackIn_2_0.field_lb = (stackIn_3_1 & stackIn_6_2) != 0;
        if (this.field_R.field_gb) {
          qd.$cfr$intArgs$a$b6210757cdab(-67, bg.field_v);
        }
        if ((3000L + this.field_J) >= nj.a(23)) {
          this.field_P.field_lb = false;
        } else {
          this.field_P.field_lb = true;
        }
        for (var3 = 0; var3 < this.field_E.length; var3++) {
          if (this.field_E[var3].field_gb) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, vq.field_e, new String[]{uf.field_e[var3]}));
          }
        }
        if (this.field_R.field_sb == 1) {
          if (tu.field_E.c(-3)) {
            if (tu.field_E.a((byte) -97)) {
              rm.e(25);
              sp.c(49, 55);
            } else {
              tb.a((byte) 126, 33);
              sp.c(53, -126);
            }
          } else {
            tb.a((byte) 126, 6);
            sp.c(53, -120);
          }
        }
        var5 = 0;
        var3 = var5;
        while (var5 < this.field_E.length) {
          if (this.field_E[var5].field_sb == 1) {
            this.field_U = this.field_U ^ 1 << var5;
            sp.c(61, -118);
          }
          stackIn_32_0 = this.field_E[var5];
          stackIn_33_1 = (0 != (this.field_U & 1 << var5));
          stackIn_32_0.field_Gb = stackIn_33_1;
          var5++;
        }
        if (param0) {
          this.e(48);
        }
        if (this.field_P.field_sb == 1) {
          this.field_J = nj.a(-72);
          this.a(false, (byte) -126);
          kj.a((byte) 24);
        }
        tc.a(tu.field_E.field_x, 5464);
    }

    final static void b(int param0, boolean param1) {
        String var9 = null;
        String[] var3 = null;
        gr var4 = null;
        gr var5 = null;
        gr var10 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        try {
          vs.field_g = null;
          var9 = wq.field_d == 0L ? gw.field_b : ow.field_e;
          String var2 = var9;
          var3 = new String[]{var9, rp.field_D};
          if (param0 != 10) {
            field_A = -58;
          }
          var4 = wk.a(true, true);
          var4.field_k = 15;
          var4.field_w = 0;
          var4.field_R = 15;
          var5 = tu.field_E;
          if (param1) {
            var10 = wk.a(false, true);
            var5 = var10;
            var10.field_o = 2;
            var10.field_K = 0;
            var10.field_k = 16;
            var10.field_w = 4;
            var10.field_R = 31;
          }
          var6 = eq.field_d > 0 ? 3 : 2;
          um.field_e = new ap(false, (up[]) null, var3, 0, false, false, 3, var6, false, false, false, false, false, -1, var4);
          for (var7 = 0; var7 < 2; var7++) {
            um.field_e.field_o.field_g[var7].field_p = var7;
          }
          um.field_e.field_o.field_t = var5.field_K;
          um.field_e.field_o.field_m = var5.field_o;
          um.field_e.field_o.field_H[0] = var5.field_w;
          um.field_e.field_o.field_d[0] = var5.field_k;
          um.field_e.field_o.field_Q[0] = var5.field_R;
          um.field_e.field_o.field_H[1] = var4.field_w;
          um.field_e.field_o.field_d[1] = var4.field_k;
          um.field_e.field_o.field_Q[1] = var4.field_R;
          if (param1) {
            um.field_e.field_o.field_b[0][0] = var5.field_i[2];
            um.field_e.field_o.field_b[0][1] = var5.field_i[0];
            um.field_e.field_o.field_b[0][2] = var5.field_i[1];
            um.field_e.field_o.field_b[0][3] = var5.field_i[3];
            um.field_e.field_o.field_b[1][0] = var4.field_i[0];
            um.field_e.field_o.field_b[1][1] = var4.field_i[1];
            um.field_e.field_o.field_b[1][2] = var4.field_i[2];
            um.field_e.field_o.field_s = true;
            um.field_e.field_o.field_b[1][3] = var4.field_i[3];
            um.field_e.b(param0 + 26405, 4);
            la.a(um.field_e.field_o, 0);
          } else {
            um.field_e.b(26415, 2);
            gm.a(de.field_a, true, (byte) -117);
          }
          sb.a(false, (byte) -122, um.field_e.field_o.field_m, um.field_e.field_o.field_t);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wf.IA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, vc[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          this.field_T = new tf();
          for (var3_int = 0; var3_int < param1.length; var3_int++) {
            this.field_T.a(param1[var3_int], 3);
          }
          if (!param0) {
            this.a(68, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        long var3 = 0L;
        if (param1 > -125) {
          return;
        }
        if (!la.a(100)) {
          if (dg.field_e ||
            ds.field_g) {
            return;
          }
          if (this.field_D - 5 <= this.field_T.a(false)) {
            this.e(30353);
          }
          or.field_d.b(param0 ? 83 : 55, (byte) -91);
          or.field_d.n(-115);
          or.field_d.a(4, 79, this.field_U);
          or.field_d.a(3, 93, this.field_F);
          or.field_d.a(3, 79, this.field_C);
          or.field_d.b(false);
          or.field_d.a(-5 + this.field_D, (byte) 109);
          var3 = nj.a(-111);
          this.field_P.field_lb = true;
          this.field_H = var3;
          return;
        }
    }

    wf() {
        this.field_T = new tf();
        this.field_N = true;
        this.field_F = 4;
        this.field_V = 0;
        this.field_J = -1L;
        this.field_D = 0;
        this.field_H = -1L;
        this.field_C = 0;
    }

    static {
        field_M = "Become a member to use the Trinkets Expansion.";
        field_A = 0;
        field_I = null;
    }
}
