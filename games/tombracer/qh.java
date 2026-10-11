/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh extends dfa implements rqa {
    private int[] field_y;
    ff field_k;
    private v field_z;
    static jea field_F;
    int field_x;
    private vna field_f;
    static jpa field_q;
    private boolean[][] field_v;
    private boolean[] field_u;
    private int field_h;
    private boolean field_s;
    boolean field_D;
    private qra field_l;
    private int[] field_o;
    private int[] field_B;
    private kq[] field_C;
    private int field_i;
    private sna field_n;
    boolean field_A;
    int field_r;
    private boolean field_t;
    private long field_m;
    private int field_j;
    private int field_E;
    private boolean field_w;
    private boolean field_p;
    w[] field_g;

    final void j(byte param0) {
        int var3 = 0;
        int var7 = 0;
        int var2;
        hca var4;
        ag var5;
        w var6;
        la var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_k.field_H.length;
        this.field_g = new w[var2];
        if (param0 >= -45) {
          return;
        }
        for (var3 = 0; var2 > var3; var3++) {
          var4 = this.field_k.field_H[var3];
          if (var4 != null) {
            var4.a(-27496, new hf(var4, var3));
            this.field_k.field_y[var3].a(11008, var4);
            var5 = new ag();
            var5.a(var4, -1);
            this.field_k.field_G[var3].a(var5, -1);
            var6 = new w();
            this.field_g[var3] = var6;
            if (var3 != this.l(103) ||
              this.f((byte) 33)) {
              var6.a(true, 0);
            }
            for (var7 = 0; this.field_k.field_G[var3].field_b.length > var7; var7++) {
              var8 = this.field_k.field_G[var3].field_b[var7];
              if (var8 != null) {
                var8.j((byte) 106).a(-28265, new sva(var8));
                var8.a(4855, var6);
              }
            }
          }
        }
        return;
    }

    private final void i(byte param0) {
        this.field_f.d(8);
        if (param0 != 99) {
          this.field_i = 64;
        }
        this.field_t = false;
    }

    private final void a(int param0, qra param1) {
        try {
          kqa.b(18916);
          if (param0 != 6) {
            this.a(false, true, 46);
          }
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qh.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int l(int param0) {
        if (param0 <= 74) {
          return -54;
        }
        return this.field_h;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4;
        int var5;
        me var6;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        msa.field_a = this.l(95);
        if (this.d((byte) 65) &&
          this.field_k.f((byte) -90, this.l(94))) {
          this.e(1, 17219);
        }
        if (!this.f((byte) 33) &&
          !this.field_D) {
          if (!param1) {
            return;
          }
          if (!param0) {
            return;
          }
        }
        this.a(param1, param0, false);
        if (this.field_s) {
          return;
        }
        if (param2 != 15283) {
          return;
        }
        if (this.field_l != null) {
          this.field_l.a(80, param1);
        }
        this.field_w = false;
        var6 = (me) (this.field_f.f(-80));
        while (var6 != null) {
          var6.a((byte) -120);
          if (!var6.c((byte) -121)) {
            if (var6.a(true)) {
              this.field_w = true;
            }
          } else {
            this.a(-19805, var6);
          }
          var6 = (me) (this.field_f.e(param2 - 15171));
        }
        if (null != this.field_n) {
          this.field_n.a((byte) 44);
        }
        if (this.f((byte) 33)) {
          return;
        }
        if (!this.field_D) {
          this.b(this.field_k.field_H[0].v(param2 - 15179), param2 + 7821);
          this.a(this.field_k.field_g[0], 5, this.field_k.field_F[0]);
          var4 = uca.field_c.a(7, param2 - 15283);
          qa.field_b = qa.field_b + var4;
          nta.field_h = nta.field_h + var4;
          var4Lifetime1 = uca.field_c.a(7, 0);
          cfa.field_b = cfa.field_b + (long)var4Lifetime1;
          lra.field_f = lra.field_f + (long)var4Lifetime1;
        }
        if (this.field_z == null) {
          if (3 != this.field_k.field_K) {
            if (this.field_k.field_I[this.field_x]) {
              hba.a(this.field_E, this.field_m, (byte) 64, this.field_i);
              this.field_k.field_I[this.field_x] = false;
            }
            if (this.field_k.f(this.field_x, 0).b(0)) {
              if (this.field_p) {
                return;
              }
              kq.a(this.field_k.field_H[this.field_x].r((byte) -125), this.field_E, (byte) 114);
              this.field_p = true;
            }
          }
        } else {
          this.field_z.a(this, 1);
        }
        return;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_z) {
          this.field_z.a(true);
        }
        for (var2 = 0; var2 < this.field_k.field_H.length; var2++) {
          this.field_C[var2].a(false);
        }
        if (param0 != -1) {
          qh.b(false);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var4;
        boolean stackIn_8_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_D) {
          if (!this.d((byte) 69) &&
            !this.field_k.field_h) {
            this.j(1);
          }
        } else {
          if (vpa.a(80)) {
            ip.field_b = qca.a((byte) 13, pq.field_e);
            stackIn_8_0 = !(this.n((byte) 19) <= 0);
            uma.field_c = stackIn_8_0;
            pna.field_p = stackIn_8_0;
            if (this.field_k.field_K != 3 && (ip.field_b ||
              uma.field_c ||
              pna.field_p)) {
              ira.a(param0, 10, (byte) 106);
              decompiledFrameRemainder0 = false;
            }
            else {
              ira.a(param0, 9, (byte) 91);
            }
          } else {
            if (this.field_k.field_K == 3) {
              ira.a(param0, 0, (byte) 82);
            } else {
              this.o(-18570);
              ira.a(param0, 9, (byte) -62);
            }
          }
        }
        this.field_s = true;
        this.i((byte) 99);
        this.a(6, (qra) null);
        if (param1 >= -75) {
          this.field_g = (w[]) null;
        }
    }

    final void a(int param0) {
        if (param0 > -102) {
          this.c(false);
        }
    }

    final void e(byte param0) {
        this.field_n = new sna(this);
        if (param0 <= 11) {
          return;
        }
        iqa.field_c.d(114);
        this.field_k.field_y[this.field_x].a(0, (byte) 37);
        this.c(106);
    }

    private final void a(boolean param0, boolean param1, boolean param2) {
        int var7 = 0;
        boolean[] var4;
        int var5;
        int var6;
        int var8;
        boolean[] var9;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param2) {
          this.a((byte) 23, true);
        }
        boolean decompiledFrameRemainder0 = true;
        var9 = oj.field_tb;
        var4 = var9;
        if (param0 &&
          param1 &&
          !iqa.field_c.e(-8832) && (ov.b(-67, -1) ||
          this.c(false))) {
          this.field_v[0][0] = var9[kda.field_hd];
          this.field_v[0][1] = var9[mf.field_a];
          this.field_v[0][2] = var9[mi.field_k];
          this.field_v[0][3] = var9[fp.field_a];
          this.field_v[0][4] = var9[gsa.field_j];
          this.field_v[0][7] = var9[mv.field_i];
          this.field_v[0][5] = var9[ki.field_o];
          this.field_v[0][8] = var9[rta.field_g];
          this.field_v[0][6] = var9[hra.field_b];
          this.field_v[1][1] = var9[97];
          this.field_v[1][0] = var9[96];
          this.field_v[1][7] = var9[85];
          this.field_v[1][2] = var9[98];
          this.field_v[1][3] = var9[99];
          decompiledFrameRemainder0 = false;
        }
        else {
          for (var5 = 0; this.field_v.length > var5; var5++) {
            for (var6 = 0; var6 < this.field_v[var5].length; var6++) {
              this.field_v[var5][var6] = false;
            }
          }
        }
        for (var5Lifetime1 = 0; var5Lifetime1 < 9; var5Lifetime1++) {
          var6Lifetime1 = 0;
          for (var7 = 0; this.field_v.length > var7; var7++) {
            if (var6Lifetime1 == 0) {
              var6Lifetime1 = (this.field_v[var7][var5Lifetime1]) ? 1 : 0;
            } else {
              var6Lifetime1 = 1;
            }
          }
          if (var6Lifetime1 != 0) {
            this.field_y[var5Lifetime1] = this.field_y[var5Lifetime1] + 1;
          } else {
            this.field_y[var5Lifetime1] = 0;
          }
        }
    }

    qh(boolean param0, int param1, String[] param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, BitSet[] param10, boolean[] param11, ou param12) {
        super(-1);
        int var15_int = 0;
        int var16 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        Object var15 = null;
        hca var17 = null;
        this.field_s = false;
        this.field_f = new vna();
        this.field_A = false;
        this.field_t = false;
        this.field_r = -1;
        this.field_p = false;
        this.field_w = false;
        try {
          if (param9 >= 0 && (!mca.a((byte) 6, param9) ||
            !bma.d(-74, param9))) {
            throw new IllegalStateException("CA:" + param9);
          }
          this.field_E = param9;
          this.field_x = param3;
          qv.field_o = null;
          mi.field_o = false;
          stackIn_8_1 = (param0);
          this.field_D = stackIn_8_1;
          var14_int = param2.length;
          this.field_y = new int[9];
          this.field_v = new boolean[2][9];
          for (var15_int = 0; var15_int < this.field_y.length; var15_int++) {
            this.field_y[var15_int] = 5;
          }
          this.field_B = new int[var14_int];
          if (ff.h(1)) {
            if (!this.field_D) {
              var15 = new ic();
            } else {
              var15 = new aua();
            }
            this.field_k = new ff(param2, param1, param5, param6, param7, param8, this.field_E, param10, param11, (mt) (var15), param12);
            if (!param0) {
              this.field_k.c((byte) -89);
            }
            this.field_C = new kq[var14_int];
            this.field_k.field_x = null;
            for (var16 = 0; var16 < var14_int; var16++) {
              var17 = this.field_k.field_H[var16];
              if (var17 != null) {
                this.field_C[var16] = new kq();
              }
            }
          }
          if (this.field_D) {
            this.field_z = new v(this.field_x, var14_int);
          }
          this.field_o = new int[var14_int];
          this.field_u = new boolean[var14_int];
          qda.field_b = null;
          if (!this.d((byte) 64)) {
            this.field_h = this.field_x;
          } else {
            this.field_h = 0;
          }
          msa.field_a = this.l(92);
          ea.field_j = -1;
          this.field_p = false;
          uca.field_a = -1;
          tb.field_o = 617;
          gda.field_b = 9170;
          ti.field_b = 8768;
          lu.field_a = 5180;
          cfa.field_b = 1180282300L;
          et.field_j = 17219L;
          qa.field_b = 1727002282;
          nta.field_h = -2073743619;
          bh.field_o = 17825;
          lra.field_f = 2023746978L;
          nb.field_c = 22238L;
          cka.field_Z = 22238;
          if (!this.field_D &&
            3 != param8 &&
            this.field_E >= 0 &&
            10 > this.field_E &&
            !this.f((byte) 33)) {
            aqa.a(this.field_E, (byte) 120);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_36_0 = var14;
          stackIn_36_1 = new StringBuilder().append("qh.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param11 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param12 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param2) {
          this.field_D = false;
        }
        this.field_C[param1].b(79, param0);
    }

    private final void j(int param0) {
        if (param0 != 1) {
          this.b(-31, 0);
        }
        ql.field_k.k(66, param0 ^ -2987);
    }

    final void k(byte param0) {
        hca var2 = this.field_k.field_H[0];
        if (param0 != -25) {
          this.field_w = true;
        }
        var2.b(true, true);
        this.j((byte) -99);
        this.c(param0 ^ 102);
    }

    final void b(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 < 91) {
            this.field_w = false;
          }
          for (var3_int = 0; this.field_B.length > var3_int; var3_int++) {
            this.field_B[var3_int] = param1.d(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(boolean param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.field_k.a(param1, (byte) 114);
            return stackIn_4_0;
          }
          stackIn_2_0 = 127;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qh.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean g(int param0, int param1) {
        if (param0 != 0) {
          this.field_w = true;
        }
        return this.field_y[param1] == 1 ? true : false;
    }

    final void c(int param0) {
        int var2;
        la var3;
        int var4;
        int var2Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        this.i((byte) 99);
        this.a(6, new fja(this, this.field_z));
        for (var2 = 0; this.field_u.length > var2; var2++) {
          this.field_u[var2] = false;
          var3 = this.field_k.field_H[var2].f((byte) -73);
          if (var3 != null) {
            var3.i((byte) -75);
          }
        }
        if (this.field_n != null) {
          this.field_n.b((byte) -121);
        }
        var2Lifetime1 = -116 / ((param0 - 23) / 54);
    }

    private final boolean o(byte param0) {
        if (param0 < 40) {
          return false;
        }
        return mi.field_o;
    }

    public static void b(boolean param0) {
        field_F = null;
        if (param0) {
          String var2 = (String) null;
          qh.a(-7, (String) null);
        }
        field_q = null;
    }

    final void a(int param0, kh param1) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        int[][] var10 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          param1.h((byte) -94);
          this.field_k.a(param1, false);
          param1.i((byte) 98);
          this.j((byte) -115);
          if (!this.field_k.g(0)) {
            this.field_z.a((byte) 126);
          }
          if (param0 < 92) {
            this.e(-34, -99);
          }
          if (!this.field_k.a(14)) {
            this.h((byte) 120);
          } else {
            if (this.field_k.field_z < 0) {
              if (this.field_k.b(0)) {
                var10 = new int[this.field_k.field_k][3];
                for (var4 = 0; this.field_k.field_k > var4; var4++) {
                  for (var5 = 0; 3 > var5; var5++) {
                    var10[var4][var5] = this.field_k.field_H[var4].c(196608, var5);
                  }
                }
                this.a(var10, -9);
                return;
              }
              this.c(102);
            } else {
              this.a(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qh.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_y[param2] = -param1;
        if (!param0) {
          this.field_A = false;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var5;
        jha var4;
        String var6;
        var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; var3 < this.field_k.field_H.length; var3++) {
          if (!this.field_k.l(param1 ^ -28, var3) &&
            (1 << var3 & param0) > 0) {
            this.field_k.d((byte) -95, var3);
            var4 = eea.a(gl.$cfr$intArgs$a$53ce4ab4c593(87, se.field_r, new String[]{this.a(var3, false)}), (byte) -72);
            iqa.field_c.a(param1 + 23, var4);
          }
        }
        if (param1 != -23) {
          var6 = (String) null;
          qh.a(-21, (String) null);
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != -54) {
          return;
        }
        if (param1 != this.field_k.b((byte) 91)) {
          this.i(param1, 108);
        }
    }

    final void b(boolean param0, boolean param1, int param2) {
        hca var4 = null;
        if (this.field_s) {
          return;
        }
        if (!this.field_D &&
          this.field_x == 0) {
          var4 = this.field_k.field_H[this.field_x];
          if (!var4.C(-1).j(0)) {
            ppa.a(var4.f((byte) -127), 64, this.field_k);
          }
        }
        if (param2 != 0) {
          this.a(115);
        }
        if (!param1) {
          this.a(6, new qka(this, this.field_z));
        } else {
          this.a(param0, (byte) -89);
        }
    }

    final boolean f(int param0, int param1) {
        if (null == this.field_z) {
          return true;
        }
        if (param0 != -12963) {
          return true;
        }
        return this.field_z.a(param1, param0 ^ -13022);
    }

    final void c(int param0, int param1) {
        if (param1 <= 15) {
          this.field_E = 44;
        }
        this.field_C[param0].a(false);
    }

    final int h(int param0, int param1) {
        if (param1 != 9) {
          return 65;
        }
        return this.field_k.field_y[param0].b(param1 ^ 68);
    }

    final boolean e(int param0) {
        if (param0 < 109) {
          this.field_j = -75;
        }
        return this.field_w;
    }

    final void e(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != 17219) {
          return;
        }
        var3 = this.l(param1 - 17104);
        if (!this.d((byte) 91)) {
          return;
        }
        var4 = 0;
        while (var4 == 0) {
          this.field_h = param0 + this.l(param1 - 17096);
          if (0 > this.l(107)) {
            this.field_h = this.field_k.field_H.length - 1;
          }
          if (this.l(114) >= this.field_k.field_H.length) {
            this.field_h = 0;
          }
          if (this.field_k.f((byte) -111, this.l(127))) {
            continue;
          }
          var4 = 1;
        }
        if (null != this.field_g) {
          this.field_g[var3].a(true, 0);
          this.field_g[this.l(100)].a(false, param1 ^ 17219);
        }
    }

    final void k(int param0) {
        this.i((byte) 99);
        this.a(param0 ^ -7, new ab(this, this.field_z));
        if (param0 != -1) {
          qh.b(true);
        }
    }

    final void d(int param0, int param1) {
        int var3;
        int var5;
        jha var4;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 != 5) {
          return;
        }
        while (this.field_k.field_H.length > var3) {
          if (!this.field_k.f((byte) -93, var3) &&
            (param1 & 1 << var3) > 0) {
            this.field_k.m(param0 ^ 4, var3);
            var4 = eea.a(gl.$cfr$intArgs$a$53ce4ab4c593(84, lu.field_c, new String[]{this.a(var3, false)}), (byte) -124);
            iqa.field_c.a(0, var4);
          }
          var3++;
        }
    }

    private final void a(int param0, int param1, long param2) {
        int var5;
        long var6;
        int var8_int;
        long var8;
        int var9;
        int var10_int;
        long var10;
        int var12;
        int var8_intLifetime1;
        long var8Lifetime1;
        int var9Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        if (!this.field_k.field_I[this.field_x]) {
          return;
        }
        var5 = this.field_i;
        var6 = this.field_m;
        var8_int = var5;
        var9 = uca.field_c.a(param1, 0);
        bh.field_o = bh.field_o + var8_int * var9;
        cka.field_Z = cka.field_Z + var9;
        var8 = var6;
        var10_int = uca.field_c.a(5, 0);
        et.field_j = et.field_j + var8 * (long)var10_int;
        nb.field_c = nb.field_c + (long)var10_int;
        if (param0 == var5) {
          return;
        }
        var8_intLifetime1 = param0;
        var9Lifetime1 = var5;
        if (var8_intLifetime1 != var9Lifetime1) {
          if (uca.field_c.a(2, 0) == 0) {
            nta.field_h = nta.field_h - cka.field_Z * (-var9Lifetime1 + var8_intLifetime1);
          } else {
            qa.field_b = qa.field_b + cka.field_Z * (var8_intLifetime1 - var9Lifetime1);
          }
        }
        var8Lifetime1 = param2;
        var10 = var6;
        if (~var8Lifetime1 != ~var10) {
          if (0 != uca.field_c.a(2, param1 ^ 5)) {
            lra.field_f = lra.field_f + nb.field_c * (var8Lifetime1 - var10);
          } else {
            cfa.field_b = cfa.field_b - nb.field_c * (-var10 + var8Lifetime1);
          }
        }
        this.field_i = param0;
        this.field_m = param2;
        return;
    }

    private final void b(boolean param0, int param1, int param2) {
        dda var4;
        pi var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_k.b(true, param2, param1);
        if (param0) {
          this.field_z = (v) null;
        }
        if (!this.field_u[param1] && (this.field_k.b((byte) 90, param1) ||
          this.field_k.e((byte) -117, param1))) {
          this.a(122, param1);
          this.field_u[param1] = true;
        }
        if (!this.field_D) {
          var4 = this.field_k.a(true, param1);
          while (var4 != null) {
            var5 = new pi(var4.a((byte) -125), param1, param1, 50 + this.field_k.field_G[param1].field_c, var4.a((byte) -125).a((byte) -28), this.field_k.i(1, param1));
            this.field_k.a((byte) 96, var5);
            var4 = this.field_k.a(true, param1);
          }
        } else {
          this.field_k.field_G[param1].field_i.b(-113);
        }
    }

    final boolean b(int param0) {
        if (param0 != 31923) {
          return true;
        }
        return false;
    }

    final boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 33) {
          this.d(94, 57);
        }
        stackIn_6_0 = (this.field_k != null) && (this.field_k.k(param0 ^ -25288));
        return stackIn_6_0;
    }

    final void a(byte param0) {
        if (param0 <= 78) {
          this.field_E = -119;
        }
    }

    public final void a(byte param0, boolean param1) {
        boolean discarded$0 = false;
        me var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_l) {
          this.field_l.b(param0 ^ 97, param1);
        }
        if (!this.f((byte) 33)) {
          if (this.field_A) {
            return;
          }
          if (param0 != -28) {
            discarded$0 = this.o((byte) 26);
          }
          var5 = (me) (this.field_f.f(param0 ^ 84));
          while (var5 != null) {
            var5.b((byte) -66);
            var5 = (me) (this.field_f.e(123));
          }
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
          this.a(-75, 'n', 84);
        }
        return this.field_l instanceof fja;
    }

    final boolean a(int param0, int param1, kh param2) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4) {
            this.field_g = (w[]) null;
          }
          if (this.field_z != null) {
            stackIn_6_0 = this.field_z.a((byte) 107, this, param2, param0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qh.DB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(me param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_f.b((byte) -120, param0);
          if (param1 != 680) {
            this.a(-90, false);
          }
          if (param0 instanceof dl) {
            this.field_t = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qh.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean g(int param0) {
        if (param0 <= 124) {
          return true;
        }
        return this.field_s;
    }

    final void h(byte param0) {
        int var2 = 70 % ((37 - param0) / 62);
        this.i((byte) 99);
        this.a(6, new uda(this, this.field_z));
    }

    final static hra a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        hra stackIn_11_0 = null;
        hra stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (param0 == -58) {
            stackIn_13_0 = fb.field_c;
            return stackIn_13_0;
          }
          stackIn_11_0 = (hra) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qh.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
          this.field_u = (boolean[]) null;
        }
        return this.field_t;
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_l instanceof ab) {
          ((ab) (this.field_l)).a(param1, true, param2);
        }
        int var4 = -88 / ((49 - param0) / 53);
    }

    final int m(int param0) {
        if (this.field_D) {
          return -1;
        }
        if (param0 != -1) {
          this.h(-21, -109);
        }
        return this.field_E;
    }

    final boolean n(int param0) {
        if (null == this.field_z) {
          return false;
        }
        int var2 = 86 % ((13 - param0) / 57);
        return this.field_z.b(1);
    }

    private final void a(boolean param0) {
        this.i((byte) 99);
        if (param0) {
          this.field_s = true;
        }
        this.a(6, new qka(this, this.field_z));
    }

    final void l(byte param0) {
        mi.field_o = true;
        if (param0 != -38) {
          this.field_z = (v) null;
        }
    }

    final void a(int param0, int param1) {
        jha var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 < 23) {
          this.f(63);
        }
        if (this.field_k.b((byte) 90, param1)) {
          var3 = ab.a(-41, gl.$cfr$intArgs$a$53ce4ab4c593(124, ara.field_yb, new String[]{this.j(param1, 9)}) + ": " + dea.a(this.field_k.c((byte) 115, param1), (byte) -8));
        } else {
          if (this.field_k.e((byte) -66, param1)) {
            var3 = ab.a(-79, gl.$cfr$intArgs$a$53ce4ab4c593(107, hu.field_a, new String[]{this.j(param1, 9)}) + ": " + dea.a(this.field_k.c((byte) 115, param1), (byte) -8));
          } else {
            var3 = ab.a(-108, gl.$cfr$intArgs$a$53ce4ab4c593(99, at.field_Q, new String[]{this.j(param1, 9)}));
          }
        }
        iqa.field_c.a(0, var3);
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        int var3;
        hca var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (this.field_y[0] > 0) {
          var3 = var3 | 1;
        }
        if (this.field_y[1] > 0) {
          var3 = var3 | 2;
        }
        if (this.field_y[2] > 0) {
          var3 = var3 | 4;
        }
        if (this.field_y[3] > 0) {
          var3 = var3 | 8;
        }
        if (this.field_y[4] > 0) {
          var3 = var3 | 16;
        }
        if (this.field_y[5] > 0) {
          var3 = var3 | 32;
        }
        if (this.field_y[7] > 0) {
          var3 = var3 | 128;
        }
        if (this.field_y[6] > 0) {
          var3 = var3 | 64;
        }
        if (this.field_y[8] > 0) {
          if (this.f(0)) {
            if (!this.d((byte) 92) &&
              this.field_k.field_H[param1].s((byte) 85)) {
              var3 = var3 | 256;
            }
          } else {
            var3 = var3 | 256;
          }
        }
        if (param0) {
          this.field_f = (vna) null;
        }
        var3 = lf.a(var3, 4);
        if (null == this.field_C) {
          this.field_C = new kq[this.field_k.field_k];
          for (var4 = 0; var4 < this.field_k.field_k; var4++) {
            var5 = this.field_k.field_H[var4];
            if (var5 != null) {
              this.field_C[var4] = new kq();
            }
          }
        }
        this.field_C[param1].b(79, var3);
        if (null != this.field_z) {
          this.field_z.a(true, var3);
        }
    }

    private final void a(int[][] param0, int param1) {
        try {
          this.i((byte) 99);
          if (param1 != -9) {
            this.a((byte) 46, (int[][]) null, -97);
          }
          this.a(6, new opa(this, this.field_z, param0));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void m(byte param0) {
        if (this.field_z != null &&
          !this.d((byte) 120)) {
          this.field_z.f(10);
        }
        this.field_k.a((byte) -82);
        this.j((byte) -108);
        int var2 = -66 / ((-65 - param0) / 39);
        this.c(-33);
    }

    private final void a(int param0, me param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -19805) {
            this.field_i = 76;
          }
          param1.p(42);
          if (param1 instanceof dl) {
            this.field_t = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qh.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2) {
        boolean stackIn_34_1 = false;
        int var4;
        int var5;
        int var6;
        me var7;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_x >= 0) {
          var4 = this.field_D ? 1 : 0;
          if (!wka.field_d &&
            var4 == 0 &&
            rba.field_a != null &&
            !rba.field_a.f((byte) 33) &&
            rba.field_a == hb.field_t) {
            var5 = uca.field_c.a(8, 0);
            if (0 != var5) {
              if (1 != var5) {
                if (var5 != 2) {
                  if (var5 == 3) {
                    ti.field_b = ti.field_b - gda.field_b;
                    lu.field_a = lu.field_a + 1;
                  } else {
                    if (var5 != 4) {
                      if (var5 == 5) {
                        lu.field_a = lu.field_a + 1;
                        tb.field_o = tb.field_o + gda.field_b;
                      } else {
                        if (var5 != 6) {
                          if (7 == var5) {
                            tb.field_o = tb.field_o - gda.field_b;
                            lu.field_a = lu.field_a - 1;
                          }
                        } else {
                          tb.field_o = tb.field_o - lu.field_a;
                          gda.field_b = gda.field_b - 1;
                        }
                      }
                    } else {
                      gda.field_b = gda.field_b + 1;
                      tb.field_o = tb.field_o + lu.field_a;
                    }
                  }
                } else {
                  gda.field_b = gda.field_b + 1;
                  ti.field_b = ti.field_b - lu.field_a;
                }
              } else {
                lu.field_a = lu.field_a - 1;
                ti.field_b = ti.field_b + gda.field_b;
              }
            } else {
              ti.field_b = ti.field_b + lu.field_a;
              gda.field_b = gda.field_b - 1;
            }
          }
        }
        if (this.field_l != null &&
          this.field_l.a(param1, 25, param0)) {
          return true;
        }
        if (rda.d(20125) &&
          param0 == 88) {
          stackIn_34_1 = !(this.field_A);
          this.field_A = stackIn_34_1;
        }
        if (param0 == 13 &&
          !this.c(false) && (this.d((byte) 81) ||
          null != this.field_l &&
          this.field_l.e(param2 ^ -9201))) {
          ira.a(false, 7, (byte) -92);
          return true;
        }
        if (param2 != 1) {
          return true;
        }
        var7 = (me) (this.field_f.f(param2 ^ -79));
        if (var7 == null) {
          return true;
        }
        if (!var7.a(param0, param1, (byte) -116)) {
        }
        return true;
    }

    private final String a(hca param0, byte param1, int param2) {
        String dupTemp$1 = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String[] var8 = null;
        String var9 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var6Lifetime1;
        try {
          var8 = tk.field_a[param2];
          var4 = var8;
          if (param1 != -9) {
            this.field_h = -6;
          }
          var5 = param0.A(0);
          var6 = var4[uca.field_c.a(var8.length, param1 + 9)];
          var7 = this.a(var5, false);
          dupTemp$1 = "<col=" + jm.field_k[var5] + ">" + var6 + "</col>";
          var9 = dupTemp$1;
          var6Lifetime1 = dupTemp$1;
          stackIn_3_0 = gl.$cfr$intArgs$a$53ce4ab4c593(84, var9, new String[]{var7});
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("qh.JA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void h(int param0) {
        int var2;
        kq var3;
        int var4;
        tu var5;
        qw var6;
        String var7;
        jha var8;
        int var9;
        int var2Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 < 79) {
          this.a(-121, (byte) -26);
        }
        if (!this.field_k.field_h) {
          if (!this.d((byte) 80) &&
            this.field_k.field_G[this.field_x].k(-19271)) {
            this.g((byte) -36);
          }
          for (var2 = 0; var2 < this.field_k.field_H.length; var2++) {
            var3 = this.field_C[var2];
            if (var3.b(-123)) {
              this.b(false, var2, var3.a((byte) -54));
            }
            if (var3.b((byte) 116) > 16) {
              this.field_o[var2] = 1;
            } else {
              if (this.field_o[var2] > 0 &&
                var3.b((byte) 97) <= 8) {
                this.field_o[var2] = 0;
              }
            }
            var4 = this.field_o[var2];
            while (var3.b((byte) 102) > 0) {
              if (var4 > 0) {
                var4--;
                this.b(false, var2, var3.a((byte) -70));
                continue;
              }
              break;
            }
            var5 = (tu) (this.field_k.field_G[var2].m(9262));
            var6 = var5.b((byte) 121);
            while (var6 != null) {
              if (iqa.field_c.b(4782)) {
                var7 = this.a(var6.b(-14065), (byte) -9, var6.c(74));
                var8 = ab.a(-23, var7);
                iqa.field_c.a(0, var8);
              }
              var6 = var5.b((byte) -57);
            }
          }
          var2Lifetime1 = this.field_r - this.field_k.c((byte) 115, this.field_h);
          if (this.field_r != -1 &&
            var2Lifetime1 <= 500 &&
            var2Lifetime1 % 50 == 0) {
            it.a(255, 131);
          }
        }
        this.field_k.field_c.a(16);
        if (this.field_n != null) {
          this.field_n.a(9981);
        }
    }

    final void a(byte param0, int[][] param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = 119 % ((param0 - 56) / 44);
          this.i(-1);
          this.field_k.k(param2, -1);
          this.i((byte) 99);
          if (0 != this.field_k.field_K) {
            this.a(6, new bp(this, this.field_z));
          } else {
            this.a(6, new opa(this, this.field_z, param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qh.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        if (this.field_D) {
          throw new IllegalStateException("NMP");
        }
        this.field_k.field_y[param2].a(param0, (byte) 37);
        if (param1 != 50) {
          this.field_v = (boolean[][]) null;
        }
    }

    final void c(int param0, int param1, int param2) {
        if (this.field_l instanceof uda) {
          ((uda) (this.field_l)).a(param2, 0, param0);
        }
        int var4 = 25 % ((param1 - 54) / 49);
    }

    private final int n(byte param0) {
        if (param0 != 19) {
          field_q = (jpa) null;
        }
        return this.field_j;
    }

    final void o(int param0) {
        int var2;
        if (this.field_k.field_K == 3) {
          return;
        }
        if (this.field_E == 10) {
          return;
        }
        if (param0 != -18570) {
          this.field_E = 16;
        }
        if (qv.field_o == null &&
          this.field_j > 0 &&
          !this.o((byte) 62) && this.field_E >= 0) {
          var2 = this.field_E;
          qv.field_o = new kb(var2, var2 ^ 65535, ti.field_b, tb.field_o, lu.field_a, gda.field_b, new int[]{this.field_j});
          if (!vpa.a(66)) {
            su.a(qv.field_o, (byte) -108, 3);
          }
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_k.d(-108);
    }

    private final void b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != this.field_j) {
          var3 = -this.field_j + param0;
          if (!wka.field_d &&
            null != rba.field_a &&
            rba.field_a.field_x >= 0 &&
            !rba.field_a.field_D &&
            !rba.field_a.f((byte) 33) &&
            hb.field_t == rba.field_a) {
            var4 = uca.field_c.a(3, 0);
            if (0 != var4) {
              if (var4 == 1) {
                tb.field_o = tb.field_o - var3;
              } else {
                var5 = var3 / 3;
                tb.field_o = tb.field_o - (-var5 + var3);
                ti.field_b = ti.field_b + var5;
              }
            } else {
              ti.field_b = ti.field_b + var3;
            }
          }
        } else {
          stackIn_4_0 = (!this.field_D) ? 0 : 1;
          var3 = stackIn_4_0;
          if (!wka.field_d &&
            var3 == 0 &&
            rba.field_a != null &&
            !rba.field_a.f((byte) 33) &&
            hb.field_t == rba.field_a) {
            var4 = uca.field_c.a(8, 0);
            if (0 != var4) {
              if (var4 != 1) {
                if (var4 != 2) {
                  if (var4 != 3) {
                    if (var4 == 4) {
                      tb.field_o = tb.field_o + lu.field_a;
                      gda.field_b = gda.field_b + 1;
                    } else {
                      if (5 == var4) {
                        tb.field_o = tb.field_o + gda.field_b;
                        lu.field_a = lu.field_a + 1;
                      } else {
                        if (var4 != 6) {
                          if (var4 == 7) {
                            lu.field_a = lu.field_a - 1;
                            tb.field_o = tb.field_o - gda.field_b;
                          }
                        } else {
                          tb.field_o = tb.field_o - lu.field_a;
                          gda.field_b = gda.field_b - 1;
                        }
                      }
                    }
                  } else {
                    lu.field_a = lu.field_a + 1;
                    ti.field_b = ti.field_b - gda.field_b;
                  }
                } else {
                  ti.field_b = ti.field_b - lu.field_a;
                  gda.field_b = gda.field_b + 1;
                }
              } else {
                ti.field_b = ti.field_b + gda.field_b;
                lu.field_a = lu.field_a - 1;
              }
            } else {
              ti.field_b = ti.field_b + lu.field_a;
              gda.field_b = gda.field_b - 1;
            }
          }
        }
        if (param1 != 23104) {
          return;
        }
        this.field_j = param0;
    }

    private final void g(byte param0) {
        if (this.d((byte) 85)) {
          return;
        }
        if (param0 >= -4) {
          return;
        }
        if (this.field_z != null &&
          this.field_z.b(1)) {
          return;
        }
        this.a(false, this.field_x);
    }

    final void i(int param0, int param1) {
        this.field_k.a(param0, (byte) 119);
        this.i((byte) 99);
        if (param1 <= 15) {
          return;
        }
        this.a(6, new qka(this, this.field_z));
    }

    final String a(int param0, boolean param1) {
        if (param1) {
          this.field_s = false;
        }
        return this.field_k.c(param0, 0);
    }

    final boolean d(byte param0) {
        if (param0 < 60) {
          this.field_w = false;
        }
        return this.field_x == -2 ? true : false;
    }

    final String j(int param0, int param1) {
        if (param1 != 9) {
          kh var4 = (kh) null;
          this.b(-82, (kh) null);
        }
        return this.field_k.e(param0, 23807);
    }

    static {
    }
}
