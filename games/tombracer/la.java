/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la implements ew, fo, noa {
    int field_E;
    static naa field_R;
    private int field_x;
    private dt field_h;
    private int field_e;
    private int field_v;
    static String[] field_m;
    static kia field_k;
    private int field_C;
    private int field_N;
    private vna field_d;
    private int field_w;
    static nh field_j;
    static nh[][] field_p;
    private vna field_i;
    private vna field_z;
    private qea field_t;
    private uw field_S;
    private int field_n;
    int field_a;
    private vna field_l;
    private pta field_s;
    private pta field_f;
    private pta field_c;
    npa field_u;
    private qea field_H;
    private te field_D;
    private tqa field_B;
    private int field_r;
    private kh field_K;
    private ui field_y;
    private bba field_U;
    private int field_I;
    private boolean field_T;
    private ui field_q;
    private ffa field_o;
    private int field_Q;
    private fq field_P;
    private int[] field_b;
    private int field_L;
    private ts field_g;
    private int field_M;
    private int field_J;
    private dj field_F;
    private int field_A;
    sqa field_G;

    private final mda b(int param0, int param1, int param2, int param3) {
        int var5 = 112 / ((param0 + 6) / 43);
        return (mda) (this.field_f.a(-2698, param1, param2, this.field_S, param3));
    }

    final int a(int param0, int param1, gma param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < -121) {
            stackIn_4_0 = this.a(param4, 32238, param2, param3, this.field_u.b(param4, -1, param3, param0, param1), param0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -66;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("la.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final bba w(int param0) {
        if (param0 != 0) {
          this.field_C = 2;
        }
        return this.field_U;
    }

    private final int a(int param0, int param1, gma param2, int param3, ffa[] param4, int param5, int param6) {
        int stackIn_13_0 = 0;
        ffa stackIn_19_0 = null;
        gma stackIn_19_1 = null;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        ffa var13 = null;
        int var14 = 0;
        ffa var15 = null;
        ffa var13Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = 0;
          var10 = null;
          var11 = 0;
          for (var12 = 0; param4.length > var12; var12++) {
            var15 = param4[var12];
            var13 = var15;
            if (var13 != param2) {
              var9 = var15.a(true, param5, param0, param3, 0, param6);
              if (var9 > var8_int) {
                var10 = var13;
                var8_int = var9;
              }
              var11 = var11 + var9;
            }
          }
          if (var11 < (param5 >> 16) * (param6 >> 16)) {
            this.field_o = (ffa) (var10);
            stackIn_13_0 = 0;
            return stackIn_13_0;
          }
          var8_intLifetime1 = 0;
          if (param1 != 32238) {
            this.field_T = false;
          }
          for (var12Lifetime1 = 0; param4.length > var12Lifetime1; var12Lifetime1++) {
            var13Lifetime1 = param4[var12Lifetime1];
            stackIn_19_0 = var13Lifetime1;
            stackIn_19_1 = (gma) (param2);
            if (stackIn_19_0 != stackIn_19_1) {
              var9Lifetime1 = var13Lifetime1.a(true, param5, param0, param3, 1, param6);
              if (var9Lifetime1 > var8_intLifetime1) {
                var8_intLifetime1 = var9Lifetime1;
                var10 = var13Lifetime1;
              }
            }
          }
          if (var8_intLifetime1 <= 0) {
            this.field_o = null;
            stackIn_30_0 = 1;
            return stackIn_30_0;
          }
          this.field_o = (ffa) (var10);
          stackIn_28_0 = 2;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_33_0 = var8;
          stackIn_33_1 = new StringBuilder().append("la.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        uja var8;
        mda var9;
        int var10;
        int var11;
        mda var12;
        var11 = TombRacer.field_G ? 1 : 0;
        var6 = 262144;
        if (param1 < var6) {
          return false;
        }
        var7 = this.a(var6, var6, (gma) null, param4, param3, (byte) -128);
        if (1 == var7) {
          return false;
        }
        var8 = new uja(this.field_f.field_b);
        if (param0 != 30097) {
          this.b(-85, -33);
        }
        var9 = (mda) (var8.a(true));
        while (var9 != null) {
          if (~var9.r(-70) == ~param2) {
            var10 = var9.t(param0 ^ 30096);
            if (io.a(var6, var9.e(9648), (byte) -78, var6, var9.d(3), param3, var10, var10, param4)) {
              var9.h((byte) -1);
              return true;
            }
          }
          var9 = (mda) (var8.a(param0 ^ -30098));
        }
        if (param2 == 1 &&
          this.a((ffa) null, param1 * 2, 2, 1, param3, param4, false, (gma) null, 2 * param1)) {
          return false;
        }
        var12 = this.b(94, param3, 0, param4);
        var12.a(this, param4, 99, param3, param2, param1);
        this.field_u.a((ffa) (var12), (byte) 124);
        return true;
    }

    final hr a(int param0, int param1, byte param2, int param3) {
        if (param2 != 100) {
          this.k((byte) 119);
        }
        hr var5 = (hr) (this.field_c.a(-2698, param1, param3, this.field_S, param0));
        var5.a(true, uca.field_c.a(100, 0));
        return var5;
    }

    final uw j(byte param0) {
        int var2 = -2 % ((param0 + 2) / 36);
        return this.field_S;
    }

    final int v(int param0) {
        if (param0 != 0) {
          this.field_h = (dt) null;
        }
        return this.field_M;
    }

    final int s(int param0) {
        int var2 = -114 / ((param0 + 42) / 61);
        return this.field_w;
    }

    final dj b(boolean param0) {
        if (param0) {
          this.field_B = (tqa) null;
        }
        return this.field_F;
    }

    final void a(int param0, sqa param1) {
        try {
          if (param0 != 4855) {
            this.field_g = (ts) null;
          }
          this.field_G = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 32) {
            this.v(-75);
          }
          if (param0.n((byte) 121)) {
            this.field_i.b((byte) -94, param0);
            param0.F(param1 + 82);
            param0.x((byte) -60);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (-1 == param1) {
          return;
        }
        fsa var3 = (fsa) (this.field_i.f(-80));
        while (var3 != null) {
          if (!var3.a(param1, 31749)) {
            this.a(var3, 2);
            var3.v((byte) 109);
          } else {
            var3.d(param1, (byte) -55);
          }
          var3 = (fsa) (this.field_i.e(115));
        }
        db var5 = (db) (this.field_d.f(-80));
        while (var5 != null) {
          if (!var5.b(param1, 1569)) {
            this.a(var5, -26755);
            var5.m(0);
          }
          var5 = (db) (this.field_d.e(108));
        }
        if (null != this.field_B) {
          this.field_B.a(param1, (byte) -33);
        }
        if (param0 >= -4) {
          this.k(7);
        }
        fsa var6 = (fsa) (this.field_i.f(-80));
        while (var6 != null) {
          var6.A(23645);
          var6 = (fsa) (this.field_i.e(125));
        }
        db var7 = (db) (this.field_d.f(-80));
        while (var7 != null) {
          var7.c(true);
          var7 = (db) (this.field_d.e(114));
        }
    }

    final void a(byte param0, fq param1) {
        try {
          this.field_P = param1;
          if (param0 != 46) {
            this.field_y = (ui) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.LC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tqa f(byte param0) {
        if (param0 != 93) {
          return (tqa) null;
        }
        return this.field_B;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param1 != 131072) {
          field_p = (nh[][]) null;
        }
        if (!param5) {
          return io.a(this.field_v, param4, (byte) -123, this.field_w, param0, this.field_w / 2, param3, param2, this.field_v / 2);
        }
        return ck.a(param0, param3, this.field_v / 2, this.field_v, this.field_w, param4, (byte) 125, this.field_w / 2, param2);
    }

    final void i(byte param0) {
        if (param0 >= -24) {
          this.a(true, 90, -98, 23, -45, -48);
        }
        this.a((byte) -108, true);
    }

    final eha b(int param0) {
        if (param0 != -1) {
          sqa var3 = (sqa) null;
          this.a(15, (sqa) null);
        }
        return this.a(-1553494544).m(param0 + 9263);
    }

    final void b(int param0, boolean param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.field_B.f((byte) 64);
        fsa var6 = (fsa) (this.field_i.f(param0 - 87));
        while (var6 != null) {
          var6.a(this, false);
          var6 = (fsa) (this.field_i.e(115));
        }
        db var7 = (db) (this.field_d.f(-80));
        while (var7 != null) {
          var7.a(-76, this);
          var7 = (db) (this.field_d.e(122));
        }
        csa var8 = (csa) (this.field_z.f(-80));
        while (var8 != null) {
          var8.a(this, 1);
          var8 = (csa) (this.field_z.e(126));
        }
        if (param0 != 7) {
          gma var5 = (gma) null;
          this.a(-11, 100, 116, 16, 41, 79, (gma) null);
        }
        this.field_Q = this.a(this.field_Q, (byte) 71);
        if (param1) {
          if (this.field_h.a((byte) -3) == this) {
            this.u(-9).q((byte) -57);
          }
          this.field_D.a(this, -110);
          this.field_s.a(121);
          this.field_f.a(119);
          this.field_c.a(97);
        }
    }

    final qea e(boolean param0) {
        if (!param0) {
          return (qea) null;
        }
        return this.field_H;
    }

    private final void k(int param0) {
        if (param0 <= 98) {
          this.field_J = 98;
        }
        this.field_Q = this.field_v / 2;
        this.field_L = this.field_w - 6291456;
    }

    final boolean k(byte param0) {
        if (param0 != 53) {
          this.b(31, 62, -43, -109, -2);
        }
        return this.a(-1553494544).g(110);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 > -110) {
          this.field_g = (ts) null;
        }
        this.field_B.a(param3, param6, true, param0, param1, param2, param5);
    }

    final qea q(int param0) {
        int var2 = 60 % ((-19 - param0) / 42);
        return this.field_t;
    }

    final ep a(int param0, int param1, int param2, int param3) {
        int var5 = -101 / ((29 - param2) / 33);
        return (ep) (this.field_s.a(-2698, param0, param3, this.field_S, param1));
    }

    final boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.field_P.a(-25584);
    }

    private final void a(boolean param0, byte param1) {
        dt var4;
        this.field_H = null;
        this.field_t = null;
        this.field_d.d(8);
        if (param1 <= 95) {
          la.l(-107);
        }
        this.field_i.d(8);
        this.field_z.d(8);
        if (this.field_G != null) {
          this.field_G.a((byte) -127);
        }
        if (param0) {
          this.field_t = new qea(new int[]{this.field_n});
          this.field_H = new qea(new int[]{this.field_n});
          this.field_u = new npa(false, 16);
          this.field_c = new pta(this, new hr(), 100);
          this.field_s = new pta(this, new ep(), 25);
          this.field_f = new pta(this, new mda(), 50);
          this.field_B = new tqa(this, 2097152);
          this.field_c.a((byte) 114);
          this.field_s.a((byte) 122);
          this.field_f.a((byte) 116);
          this.field_F = new dj(this);
          if (this.field_U != null) {
          }
          this.field_r = 0;
        }
        this.field_D.a(-10430);
        var4 = this.a(-1553494544);
        if (var4 != null) {
          var4.a(this, -9774);
        }
        if (this.field_S != null) {
          this.field_S.a(10);
        }
        this.field_g.b((byte) 100);
    }

    final boolean a(boolean param0, int param1, gma param2, int param3) {
        RuntimeException var5 = null;
        up var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var6 = (up) null;
            this.a((ep) null, -25, (up) null);
          }
          stackIn_5_0 = (1 == this.a(131072, 131072, param2, param3, param1, (byte) -128));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("la.PB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void m(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_y.a((byte) 97);
        fsa var2 = (fsa) (this.field_i.f(-80));
        if (param0 != 9) {
          this.d(-36);
        }
        while (var2 != null) {
          var2.a(true, false, this.field_y, new ui());
          var2 = (fsa) (this.field_i.e(113));
        }
        this.field_q.a((byte) 74);
        csa var2_ref = (csa) (this.field_z.f(param0 ^ -71));
        while (var2_ref != null) {
          var2_ref.a(false, 6, this.field_q, new ui());
          var2_ref = (csa) (this.field_z.e(108));
        }
    }

    private final int a(boolean param0, pc param1, up param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        ffa[] var5 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0) {
            this.field_y = (ui) null;
          }
          if (param2 == null) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          var4_int = 0;
          var5 = this.field_u.a(param1, (byte) -103);
          for (var6 = 0; var6 < var5.length; var6++) {
            var4_int = var4_int + var5[var6].a(param2, 12, param1);
          }
          stackIn_11_0 = var4_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("la.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(int param0, pc param1, gma param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        ffa[] var6 = null;
        int var7 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var7 = 67 % ((param3 + 40) / 60);
          param1.field_l = false;
          var6 = this.field_u.a(param1, (byte) -68);
          for (var8 = 0; var6.length > var8; var8++) {
            if (var6[var8].a(-1, param2, param0, param1)) {
              param1.field_l = true;
              var5_int = 1;
            }
          }
          stackIn_9_0 = var5_int;
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("la.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_b = (int[]) null;
        }
        return this.field_A;
    }

    public final lj a(int param0, int param1, boolean param2) {
        uja var4;
        fsa var5;
        lj var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 28672) {
          this.toString();
        }
        var4 = new uja(this.field_i);
        var5 = (fsa) (var4.a(true));
        while (var5 != null) {
          var6 = var5.a(false, param1, (byte) -26);
          if (var6 != null) {
            return var6;
          }
          var5 = (fsa) (var4.a(-1));
        }
        return null;
    }

    final int a(int param0, int param1) {
        if (param0 > -95) {
          this.b(10, -88, -18, 76, -15);
        }
        return this.field_b[param1];
    }

    final void a(iq param0, int param1) {
        try {
          this.field_S = new uw(10);
          this.field_S.a(-24343, param0);
          if (param1 <= 2) {
            field_R = (naa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        uw var3;
        eha var3_ref;
        csa var4;
        int var5;
        gma var6;
        hca var7;
        uw var8;
        csa var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          this.t(8);
          if (null == this.field_U) {
            this.b(6, -20);
            var8 = this.field_S;
            var3 = var8;
            this.field_S = null;
            var4 = (csa) (this.field_z.f(-80));
            while (var4 != null) {
              var4.a(false, true, this, 0, 0, 1, (fsa) null);
              var4 = (csa) (this.field_z.e(123));
            }
            var4Lifetime1 = (csa) (this.field_z.f(-80));
            while (var4Lifetime1 != null) {
              var4Lifetime1.a(true, 1);
              var4Lifetime1 = (csa) (this.field_z.e(115));
            }
            this.field_z.d(8);
            this.b((byte) -12, 1);
            this.field_S = var8;
          }
          var3_ref = this.a(-1553494544).m(9262);
          if (var3_ref != null) {
            var3_ref.a(-2, this.u(-18), this);
          }
        }
        var7 = this.u(-22);
        var7.a(this, this.field_Q, this.field_L, true);
        var7.a(-127, param1);
        if (param0 >= -80) {
          var6 = (gma) null;
          this.a(94, 108, 82, 71, 28, 102, (gma) null);
        }
        this.field_u.b(this.u(-107), 7073);
        if (this.field_S != null) {
          this.h(-106);
        }
    }

    private final void h(int param0) {
        iq var2;
        int var3;
        int var4;
        fsa var5;
        db var6;
        csa var7;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_S == null) {
          return;
        }
        this.field_S.a(10);
        var2 = this.field_S.c(0);
        if (param0 >= -86) {
          this.field_C = 71;
        }
        if (this.o((byte) -82)) {
          var2.a(-128, (byte) -3, (this.field_w >> 16) + 128, -128, (this.field_v >> 16) + 128);
        } else {
          var3 = 192;
          var2.a(var3, (byte) -3, (this.field_w >> 16) - var3, var3, -var3 + (this.field_v >> 16));
        }
        this.u(-12).a(25, this.field_S);
        this.field_D.a(this.field_S, -28255);
        this.field_s.a(this.field_S, (byte) -89, true, 7);
        this.field_c.a(this.field_S, (byte) 126, true, 7);
        this.field_f.a(this.field_S, (byte) -33, false, 6);
        var5 = (fsa) (this.field_i.f(-80));
        while (var5 != null) {
          var5.a(122, this.field_S);
          var5 = (fsa) (this.field_i.e(107));
        }
        var6 = (db) (this.field_d.f(-80));
        while (var6 != null) {
          var6.a((byte) 48, this.field_S);
          var6 = (db) (this.field_d.e(108));
        }
        var7 = (csa) (this.field_z.f(-80));
        while (var7 != null) {
          var7.a(-1704, this.field_S);
          var7 = (csa) (this.field_z.e(116));
        }
        dea.field_a.a(121, this);
        this.field_B.a(this.field_S, 0);
        if (null != this.field_G) {
          this.field_G.c((byte) 119);
        }
        return;
    }

    final void d(boolean param0) {
        System.out.println("Rooms ID: " + this.field_x);
        System.out.println("Projectiles: ");
        this.field_s.a(false);
        if (!param0) {
          gma var3 = (gma) null;
          this.a(2, (pc) null, (gma) null, (byte) 52);
        }
    }

    public final void a(int param0, iq param1) {
        try {
          if (param0 <= 103) {
            this.o((byte) 66);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.n((byte) 113)) {
            param0.p(120);
            param0.B(-165);
          }
          if (param1 != 2) {
            this.b(85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != 107) {
          gma var3 = (gma) null;
          this.a(33, (gma) null);
        }
        return this.field_r;
    }

    private final void a(db param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.b(-1, param0.a((byte) 55), param0.c(-101), param0.e(9648), -124, param0.d(param1 ^ -26754), 0);
          param0.p(112);
          this.field_u.a((ffa) (param0), (byte) 118);
          if (param1 != -26755) {
            this.field_z = (vna) null;
          }
          if (null != this.field_S) {
            param0.a(this.field_S, (byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void f(int param0) {
        fsa[] discarded$0 = null;
        if (param0 != -4366) {
          discarded$0 = this.a(54, 60, 37, -15, -117);
        }
    }

    final void c(int param0, int param1) {
        this.field_b[param1] = -1;
        if (param0 != -22490) {
          this.i((byte) -124);
        }
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          return 63;
        }
        return this.field_w / 2;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          this.a(121, 21, 23, -88, -121, true);
          return 0;
        }
        return 0;
    }

    private final fsa[] a(int param0, int param1, int param2, int param3, int param4) {
        int var8_int = 0;
        ub var6;
        ffa[] var7;
        int var10;
        fsa[] var8;
        fsa var9;
        var10 = TombRacer.field_G ? 1 : 0;
        if (param2 <= 27) {
          return (fsa[]) null;
        }
        var6 = new ub();
        var7 = this.field_u.b(param1, -1, param4, param0, param3);
        for (var8_int = 0; var7.length > var8_int; var8_int++) {
          if (var7[var8_int] instanceof fsa) {
            var9 = (fsa) (var7[var8_int]);
            if (var9.a((byte) 110, param1, param4, param3, param0)) {
              var6.a((byte) -37, var9);
            }
          }
        }
        var8 = new fsa[var6.a(-1)];
        var6.a(var8, false);
        return var8;
    }

    final fsa[] n(int param0) {
        if (param0 != 16) {
          return (fsa[]) null;
        }
        return this.a(this.field_v, this.field_w / 2, 59, this.field_w, this.field_v / 2);
    }

    public static void p(int param0) {
        field_m = null;
        field_j = null;
        field_R = null;
        field_k = null;
        if (param0 != -128) {
          la.l(-58);
        }
        field_p = (nh[][]) null;
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6) {
        int var8 = -28 % ((param6 - 20) / 33);
        return this.field_B.b(param3, param2, param4, 8597, param0, param1, param5);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (this.field_G == null) {
          return;
        }
        if (param4 != 6) {
          this.field_B = (tqa) null;
        }
        this.field_G.a(param4 ^ -112, new fm(param2, param1, param0, param3));
    }

    final int o(int param0) {
        if (param0 != 8) {
          this.a(true, 88, 35);
        }
        return this.field_C;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          this.a(false, -109, -42, 112, -101, -128);
        }
        this.field_N = param0;
    }

    final boolean h(byte param0) {
        if (param0 != -77) {
          this.c(-56, 76);
        }
        return this.field_T;
    }

    final void g(int param0) {
        this.a(false, (byte) 123);
        this.field_B = null;
        if (param0 <= 43) {
          this.a(-72, -34, 70, 80, true, 64, (byte) -83);
        }
        this.field_f = null;
        this.field_c = null;
        this.field_F = null;
        this.field_s = null;
        this.field_u = null;
    }

    final int i(int param0) {
        if (param0 != 6029) {
          return -14;
        }
        return null == this.field_U ? -1 : this.field_U.a(false);
    }

    final void a(byte param0, int param1) {
        if (param0 <= 14) {
          this.field_o = (ffa) null;
        }
        this.field_I = param1;
    }

    final boolean o(byte param0) {
        if (param0 != -82) {
          return true;
        }
        return this.field_U != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 118) {
          kua var9 = (kua) null;
          this.a(-24, (kua) null);
        }
        this.field_B.a(param1, param5, param4, param2, param0, param3, true);
    }

    private final void t(int param0) {
        int var7 = 0;
        uw var2;
        kh var3;
        int var4;
        int var5;
        int var6;
        fsa var7_ref_fsa;
        csa var8;
        int var9;
        fsa var10;
        csa var11;
        db var12;
        kh var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        this.a(true, (byte) 123);
        if (null == this.field_K) {
          return;
        }
        var2 = this.field_S;
        this.field_S = null;
        this.field_y.a((byte) -69);
        bca.b((byte) 55);
        var3 = this.field_K;
        var3.field_h = 0;
        var3.h((byte) -64);
        this.field_E = var3.b((byte) 44, 8);
        this.field_P = new fq(this.field_E, var3);
        if (19 >= this.field_E) {
          this.field_v = var3.b((byte) 44, 12) << 16;
          this.field_w = var3.b((byte) 44, 12) << 16;
        } else {
          if (20 != this.field_E) {
            this.field_v = 2097152 * var3.b((byte) 44, 6);
            this.field_w = var3.b((byte) 44, 6) * 2097152;
          } else {
            this.field_v = 2097152 * var3.b((byte) 44, 8);
            this.field_w = var3.b((byte) 44, 8) * 2097152;
          }
        }
        this.field_B.a(2097152, this, 4);
        if (11 > this.field_E) {
          this.k(109);
        } else {
          this.field_Q = var3.b((byte) 44, 12) << 16;
          this.field_L = var3.b((byte) 44, 12) << 16;
        }
        var4 = var3.b((byte) 44, param0);
        for (var5 = 0; var4 > var5; var5++) {
          var12 = new db(this, var3);
          this.a(var12, true);
        }
        var5Lifetime1 = var3.b((byte) 44, 8);
        for (var6 = 0; var6 < var5Lifetime1; var6++) {
          var7_ref_fsa = new fsa(this, var3, false);
          this.a(var7_ref_fsa, (byte) 32);
          var7_ref_fsa.D((byte) 118);
        }
        this.field_B.a((byte) 25, var3, this);
        if (this.field_E >= 11) {
          var6Lifetime1 = var3.b((byte) 44, 8);
          for (var7 = 0; var6Lifetime1 > var7; var7++) {
            var8 = vha.field_c.a(var3, 55, this);
            if (var8 != null) {
              this.a(var8, 33554432);
            }
          }
        }
        if (this.field_E == 12) {
          for (var6Lifetime2 = 0; 3 > var6Lifetime2; var6Lifetime2++) {
            var3.b((byte) 44, 10);
          }
        } else {
          if (this.field_E >= 13 &&
            26 > this.field_E) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 3; var6Lifetime2++) {
              var3.b((byte) 44, 8);
            }
          }
        }
        if (16 <= this.field_E) {
          this.field_A = var3.b((byte) 44, 2);
        }
        if (this.field_E >= 19) {
          this.field_J = var3.b((byte) 44, 3);
        }
        var3.i((byte) 98);
        this.m(param0 ^ 1);
        var10 = (fsa) (this.field_i.f(-80));
        while (var10 != null) {
          var10.h(true);
          var10.u(0);
          var10 = (fsa) (this.field_i.e(115));
        }
        var11 = (csa) (this.field_z.f(-80));
        while (var11 != null) {
          var11.c(true);
          var11 = (csa) (this.field_z.e(124));
        }
        var3.field_h = 0;
        if (this.field_E != 26) {
          if (this.field_E <= 19) {
            this.b(1, param0 - 28);
          }
          this.field_E = 26;
          var13 = new kh(30000);
          this.a(var13, -28426);
          this.field_K = var13;
          var13.field_h = 0;
        }
        if (var2 != null) {
          this.field_S = var2;
        }
        if (this.field_T) {
          this.b(param0 ^ 15, false);
        }
        return;
    }

    final boolean a(int param0, gma param1, int param2, pc param3, gma param4, up param5) {
        int discarded$3 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3.field_h = null;
          var7_int = 0;
          if (this.a(param0, param3, param4, (byte) -127)) {
            var7_int = 1;
          }
          discarded$3 = this.a(true, param3, param5);
          if (param2 >= -38) {
            this.a(99, -62, -70, -43, true, -109, (byte) -77);
          }
          stackIn_5_0 = var7_int;
          return stackIn_5_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("la.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(ffa param0, int param1, int param2, int param3, int param4, int param5, boolean param6, gma param7, int param8) {
        int var11 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ffa[] var10 = null;
        RuntimeException var10_ref = null;
        ffa var12 = null;
        int var13 = 0;
        ffa[] var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 == 0) {
            return false;
          }
          var14 = this.field_u.b(param4, -1, param5, param8, param1);
          var10 = var14;
          if (param2 != 2) {
            la.p(-15);
          }
          for (var11 = 0; var14.length > var11; var11++) {
            boolean decompiledFrameRemainder0 = true;
            var12 = var14[var11];
            if (param0 != var12 &&
              var12.a(param1, param7, 85, param8, param4, param0, param5, param3)) {
              if ((param7 != null &&
                param6) &&
                (decompiledFrameRemainder0 = !(var12.a(param7.a((byte) 55), param7, 107, param7.c(-48), param7.k(-21185), param0, param7.i(103), param3)))) {
                return true;
              }
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_22_0 = var10_ref;
          stackIn_22_1 = new StringBuilder().append("la.BB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(db param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_d.b((byte) -74, param0);
          this.field_u.b(param0, 7073);
          if (null != this.field_S) {
            param0.a((byte) 85, this.field_S);
          }
          this.a(0, -1, param0.d(3), param0.e(9648), param0.c(-69), param0.a((byte) 55), 126);
          if (!param1) {
            this.a(30, 106, -59, -125, (byte) -34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.TC(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int l(byte param0) {
        int var2 = 82 % ((81 - param0) / 35);
        return this.field_J;
    }

    final void a(la param0, byte param1) {
        if (param1 <= 108) {
          return;
        }
        try {
          this.field_D.a(23436, param0.field_l);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(csa param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_z.b((byte) -88, param0);
          if (null != this.field_S) {
            param0.a(param1 - 33556136, this.field_S);
          }
          if (param1 != 33554432) {
            this.n((byte) -3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("la.OA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int q(byte param0) {
        if (param0 != -82) {
          return -41;
        }
        return this.field_x;
    }

    final void r(int param0) {
        int var2 = 112 / ((93 - param0) / 32);
        this.a((byte) -125, false);
    }

    final int a(int param0, gma param1) {
        int var11 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ffa[] var7 = null;
        int var8 = 0;
        ffa var9 = null;
        ffa[] var10 = null;
        ffa var12 = null;
        int var13 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 0) {
            this.e((byte) 46);
          }
          var3_int = param1.d(param0 ^ 3);
          var4 = param1.e(9648);
          var5 = param1.c(param0 ^ -38);
          var6 = param1.a((byte) 55);
          var7 = this.field_u.b(var4, param0 - 1, var3_int, var5, var6);
          var8 = this.a(var4, 32238, param1, var3_int, var7, var5, var6);
          var9 = this.field_o;
          if (var8 != 0) {
            var10 = var7;
            for (var11 = 0; var11 < var10.length; var11++) {
              var12 = var10[var11];
              if (var12 instanceof fsa) {
                ((fsa) (var12)).a(26689, param1, var9, var8);
              }
            }
          }
          stackIn_11_0 = var8;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("la.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        if (null == this.field_S) {
          return;
        }
        if (param0) {
          this.field_Q = 15;
        }
        this.field_S.c(0);
        this.field_S.b(1909106792);
        this.field_S.e(30057);
    }

    final boolean b(int param0, byte param1) {
        if (param1 != -44) {
          fsa var4 = (fsa) null;
          this.a((fsa) null, 48);
        }
        return this.field_b[param0] != -1 ? true : false;
    }

    final boolean g(byte param0) {
        hca var2;
        int var3;
        boolean stackIn_4_0 = false;
        var3 = 23 / ((param0 - 24) / 33);
        var2 = this.u(-86);
        stackIn_4_0 = (this == var2.f((byte) 64)) && (var2.e(9648) <= 12582912);
        return stackIn_4_0;
    }

    final int a(int param0, int param1, up param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        ffa[] var8 = null;
        int var9 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          var8 = this.field_u.b(param1, -1, param5, param4, param3);
          var9 = 96 / ((82 - param0) / 41);
          for (var10 = 0; var10 < var8.length; var10++) {
            var7_int = var7_int + var8[var10].a(param2, param4, param5, 0, param1, param3);
          }
          stackIn_8_0 = var7_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("la.QC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final dt a(int param0) {
        if (param0 != -1553494544) {
          field_k = (kia) null;
        }
        return this.field_h;
    }

    final void d(int param0, int param1) {
        db var4;
        fsa var5_ref_fsa;
        int var5;
        int var6;
        fsa var7;
        hca var8;
        uja var9;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = this.u(-62);
        if (var8 == null) {
          return;
        }
        var8.d(5, param0);
        if (this != var8.f((byte) -83)) {
          return;
        }
        if (!this.a(param1 - 1553494544).k(-19271)) {
          return;
        }
        this.field_a = 6029;
        this.field_a = var8.e(this.field_a, -40);
        var4 = (db) (this.field_d.f(param1 - 80));
        while (var4 != null) {
          var4.s(param1 ^ 0);
          var4 = (db) (this.field_d.e(120));
        }
        var9 = new uja(this.field_i);
        var5_ref_fsa = (fsa) (var9.a(true));
        while (var5_ref_fsa != null) {
          var5_ref_fsa.b(param1 + 106, false);
          this.field_a = var5_ref_fsa.i(this.field_a, -109);
          if (var5_ref_fsa.h(param1 + 18407)) {
            var5_ref_fsa.p(param1 ^ 79);
          }
          var5_ref_fsa = (fsa) (var9.a(-1));
        }
        this.field_g.c(true);
        var5 = this.a(-1553494544).g(param1 + 112) ? 1 : 0;
        if (param1 != 0) {
          var7 = (fsa) null;
          this.a((fsa) null, -31);
        }
        this.field_s.a(var5 != 0, (byte) -126);
        this.field_f.a(var5 != 0, (byte) -31);
        this.field_c.a(var5 != 0, (byte) -103);
        this.field_a = this.field_s.a(this.field_a, -119);
        if (this.field_S != null) {
          this.field_S.d(0);
          if (this.field_h.f(8, param1 + 10915)) {
            this.field_S.c(0).a(uca.field_c.a(9, 0) - 4, 0, -4 + uca.field_c.a(9, 0), 26768);
          }
        }
        if (null != this.field_G) {
          this.field_G.a(param1 + 82, false);
        }
        this.field_I = this.field_I + 1;
        this.field_r = this.field_r + 1;
        return;
    }

    public final String toString() {
        return "Room(courseIndex:" + this.field_N + ",id:" + this.field_x + ",diff:" + 1 + ")";
    }

    final int n(byte param0) {
        if (param0 > -36) {
          return 42;
        }
        return this.field_e;
    }

    final hca u(int param0) {
        if (param0 >= 0) {
          this.field_A = -11;
        }
        return this.a(-1553494544).field_g;
    }

    final int m(byte param0) {
        if (param0 != -86) {
          this.a(-23, -87, 7, -112, true, -64, (byte) -10);
        }
        return this.field_v;
    }

    final void b(boolean param0, int param1, int param2) {
        this.field_b[param2] = param1;
        if (param0) {
          this.field_g = (ts) null;
        }
    }

    private final void b(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = param0 * 2097152;
        if (var3 == 0) {
          return;
        }
        this.field_Q = this.field_Q + var3;
        this.field_w = this.field_w + var3 * 2;
        this.field_v = this.field_v + 2 * var3;
        this.field_L = this.field_L + var3;
        this.field_B.b(2097152, 2, var3);
        if (param1 != -20) {
          this.field_b = (int[]) null;
        }
        fsa var6 = (fsa) (this.field_i.f(-80));
        while (var6 != null) {
          var6.o(var3, 81);
          var6 = (fsa) (this.field_i.e(115));
        }
        csa var7 = (csa) (this.field_z.f(param1 ^ 92));
        while (var7 != null) {
          var7.a(var3, true);
          var7 = (csa) (this.field_z.e(param1 ^ -104));
        }
        db var8 = (db) (this.field_d.f(-80));
        while (var8 != null) {
          var8.a(param1 - 105, var3);
          var8 = (db) (this.field_d.e(108));
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        pca var7 = this.field_B.a(param0, param3, (byte) 119);
        if (var7 == null) {
          return;
        }
        if (param2 < 104) {
          field_p = (nh[][]) null;
        }
        if (var7.b(0) ||
          uca.field_c.a(5, 0) == 0) {
          this.field_F.b(param0, param3, param5, param1, 0, param4);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != 71) {
          return 111;
        }
        return -param0 - (-(this.field_v / 2) - this.field_v / 2);
    }

    final static void l(int param0) {
        if (vo.field_b) {
          f.b(120);
        }
        if (param0 != 2097152) {
          la.l(104);
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5, gma param6) {
        int var10 = 0;
        ffa[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ffa var11 = null;
        int var12 = 0;
        ffa[] var13 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var13 = this.field_u.b(param0, -1, param5, param1, param4);
          var8 = var13;
          var9 = 0;
          for (var10 = param2; var13.length > var10; var10++) {
            var11 = var13[var10];
            if (param6 != var11) {
              var9 = var9 + var11.a(true, param1, param0, param5, param3, param4);
            }
          }
          stackIn_8_0 = var9;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_11_0 = var8_ref;
          stackIn_11_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int p(byte param0) {
        if (param0 < 14) {
          return -10;
        }
        return this.field_I;
    }

    private final void a(kh param0, int param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        db var5 = null;
        fsa var6 = null;
        csa var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.m(9);
          param0.i(8);
          param0.a((byte) -127, 26, 8);
          this.field_P.a(param0, 23);
          if (param1 != -28426) {
            this.o((byte) 71);
          }
          param0.a((byte) 59, this.field_v / 2097152, 6);
          param0.a((byte) -125, this.field_w / 2097152, 6);
          param0.a((byte) -126, this.field_Q >> 16, 12);
          param0.a((byte) -128, this.field_L >> 16, 12);
          param0.a((byte) -125, this.field_d.a((byte) -16), 8);
          var5 = (db) (this.field_d.f(-80));
          while (var5 != null) {
            var5.a(true, param0);
            var5 = (db) (this.field_d.e(113));
          }
          param0.a((byte) 119, this.field_i.a((byte) -16), 8);
          var6 = (fsa) (this.field_i.f(-80));
          while (var6 != null) {
            if (!var6.w((byte) -117)) {
              var6.a(param0, -100);
            }
            var6 = (fsa) (this.field_i.e(114));
          }
          this.field_B.a(8, param0);
          param0.a((byte) 120, this.field_z.a((byte) -16), 8);
          var7 = (csa) (this.field_z.f(-80));
          while (var7 != null) {
            vha.field_c.a(var7, -16097, param0);
            var7 = (csa) (this.field_z.e(107));
          }
          param0.a((byte) 102, this.field_A, 2);
          param0.a((byte) 127, this.field_J, 3);
          param0.k(-1826190686);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("la.PC(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        pca var7 = this.field_B.a(param4, param1, (byte) 119);
        if (var7 == null) {
          return;
        }
        if (var7.b(0) &&
          0 == uca.field_c.a(5, 0)) {
          this.field_F.b(param4, param1, param3, param2, 0, param5);
        }
        if (param0) {
          this.a(55, 54, (byte) -12, -30);
        }
    }

    final ui d(int param0) {
        if (param0 != -31957) {
          this.b(true, -14, -108);
        }
        return this.field_q;
    }

    final ui e(int param0) {
        int var2 = 49 % ((param0 - 42) / 59);
        return this.field_y;
    }

    final int a(ep param0, int param1, up param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        ffa[] var5 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -16164) {
            this.field_E = 42;
          }
          if (param2 == null) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var4_int = 0;
          var5 = this.field_u.a((byte) -26, param0);
          for (var6 = 0; var6 < var5.length; var6++) {
            var4_int = var4_int + var5[var6].a(param2, param0, -117);
          }
          stackIn_10_0 = var4_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("la.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(ffa param0, gma param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        ffa stackIn_59_0 = null;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        ffa[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var16Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          if (param8 == 0) {
            stackIn_6_0 = (!this.a(param0, param6, 2, param2, param10, param7, param12, param1, param3)) ? 0 : 2;
            return stackIn_6_0;
          }
          if (param2 == 0) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          var14_int = 0;
          var15 = 0;
          var17 = this.field_u.b(param10, -1, param7, param3, param6);
          if (param5 != 12) {
            stackIn_13_0 = -128;
            return stackIn_13_0;
          }
          var18 = 0;
          L2: while (true) {
            if (var18 < var17.length) {
              var16 = 0;
              if (var17[var18].a(param6, param1, 97, param3, param10, param0, param7, param2)) {
                var14_int = 1;
                if (param1 == null ||
                  !param12 ||
                  !var17[var18].a(param1.a((byte) 55), param1, 81, param1.c(-48), param1.k(-21185), param0, param1.i(param5 + 115), param2)) {
                  var16 = 1;
                  if (!var17[var18].a((byte) -55, false)) {
                    var15 = 1;
                    break L2;
                  }
                }
              }
              if (var16 == 0) {
                var17[var18] = null;
              }
              var18++;
              continue;
            }
            break;
          }
          if (var15 != 0) {
            stackIn_32_0 = 2;
            return stackIn_32_0;
          }
          for (var18Lifetime1 = 0; var18Lifetime1 < var17.length; var18Lifetime1++) {
            if (var17[var18Lifetime1] != null) {
              var17[var18Lifetime1].a(77, false, param8, param4, param9, param11);
              var16Lifetime1 = 1;
              if (!var17[var18Lifetime1].a(param6, param1, param5 ^ 64, param3, param10, param0, param7, param2)) {
                var16Lifetime1 = 0;
              } else {
                if (var15 == 0) {
                  if (2 == param8) {
                    stackIn_45_0 = (var17[var18Lifetime1].a(param1, 0)) ? 0 : 1;
                    var15 = stackIn_45_0;
                  } else {
                    var15 = 1;
                  }
                }
              }
              if (var16Lifetime1 == 0) {
                var17[var18Lifetime1] = null;
              }
            }
          }
          if (var15 != 0) {
            stackIn_53_0 = 2;
            return stackIn_53_0;
          }
          if (param8 == 2) {
            for (var18Lifetime2 = 0; var17.length > var18Lifetime2; var18Lifetime2++) {
              stackIn_59_0 = var17[var18Lifetime2];
              if (stackIn_59_0 != null) {
                var17[var18Lifetime2].a(-117, param1);
              }
            }
          }
          if (var14_int != 0) {
            stackIn_66_0 = 1;
            return stackIn_66_0;
          }
          stackIn_64_0 = 0;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_69_0 = var14;
          stackIn_69_1 = new StringBuilder().append("la.UB(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final void a(int param0, kua param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_l.b((byte) -54, param1);
          while (this.field_l.a((byte) -16) > 10) {
            this.field_l.c(-99);
          }
          if (param0 != 8) {
            this.field_b = (int[]) null;
          }
          this.field_M = this.field_M + 1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.VB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(byte param0) {
        int var2 = 81 / ((-23 - param0) / 53);
        return this.field_v / 2;
    }

    final int c(int param0) {
        int var2 = -6 % ((param0 - 1) / 54);
        return this.field_N;
    }

    final csa a(boolean param0, int param1, int param2) {
        uja var4;
        csa var5;
        csa var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 != 6) {
          this.field_o = (ffa) null;
        }
        var4 = new uja(this.field_z);
        var5 = (csa) (var4.a(true));
        while (var5 != null) {
          var6 = var5.a(param1, false, false);
          if (var6 != null) {
            return var6;
          }
          var5 = (csa) (var4.a(-1));
        }
        return null;
    }

    la(dt param0, int param1, kh param2, int param3, boolean param4) {
        int var6_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.field_E = 26;
        this.field_d = new vna();
        this.field_i = new vna();
        this.field_z = new vna();
        this.field_l = new vna();
        this.field_D = new te();
        this.field_y = new ui();
        this.field_q = new ui();
        this.field_b = new int[9];
        this.field_P = new fq();
        this.field_A = 0;
        this.field_J = 0;
        try {
          for (var6_int = 0; this.field_b.length > var6_int; var6_int++) {
            this.field_b[var6_int] = -1;
          }
          this.field_h = param0;
          this.field_v = 33554432;
          this.field_K = param2;
          this.field_w = 33554432;
          this.field_x = param1;
          this.field_n = param3;
          stackIn_7_1 = (param4);
          this.field_T = stackIn_7_1;
          this.field_g = new ts(this);
          this.a(false, (byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("la.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
