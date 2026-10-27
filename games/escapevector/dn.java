/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String[] field_C;
    private boolean field_i;
    private int field_v;
    private int field_p;
    private boolean field_r;
    private gl field_c;
    private int field_h;
    private boolean field_b;
    private jl field_B;
    private int field_g;
    private int[] field_A;
    private int field_k;
    private jl field_f;
    private jl field_s;
    private int field_u;
    private boolean field_w;
    static al field_q;
    private boolean field_x;
    private int field_t;
    private wd field_o;
    private wc field_d;
    private gf field_y;
    private boolean field_j;
    private dk field_z;
    private int field_e;
    static int field_a;
    private dk[] field_l;
    private jl field_n;
    private int field_m;
    private int field_D;

    private final void a(byte param0) {
        tc[] var2 = this.b(false);
        String[] var3 = new String[]{gk.field_b, bj.field_D, nl.field_a, kc.field_a, ob.field_c, gn.field_l, hb.field_a};
        this.a(var3, (byte) -10);
        ih var4 = fh.field_g;
        int var5 = 16777215;
        int var6 = this.g((byte) 49);
        this.field_o = new wd(vb.field_a, var2, var3);
        if (param0 <= 111) {
          return;
        }
        this.field_o.a(var6, var4, var5, 117);
    }

    private final void k(int param0) {
        String var2 = this.i((byte) 114);
        String[] var3 = this.j(27679);
        this.field_n = new jl(var2, var3);
        if (param0 > -63) {
          this.field_m = -57;
        }
        this.a(this.field_n, 16777215);
    }

    final static int a(int param0) {
        if (param0 != 0) {
          dn.h(-11);
        }
        return vi.field_a - ia.field_x;
    }

    private final void e(byte param0) {
        int var2 = 107 % ((11 - param0) / 36);
        this.field_k = 0;
        this.field_k = t.a(this.field_c.a(true), this.field_k, 63);
        this.field_k = t.a(this.field_o.a(true), this.field_k, 37);
        this.field_k = t.a(this.field_n.a(true), this.field_k, 54);
        this.field_k = t.a(this.field_f.a(true), this.field_k, 24);
        if (this.field_b) {
          this.field_k = t.a(this.field_B.a(true), this.field_k, 89);
          this.field_k = t.a(this.field_s.a(true), this.field_k, 14);
        }
    }

    final static qh[] a(int param0, boolean[] param1, String[] param2, mf param3, int param4, int[] param5, String[] param6) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          qh[] var11 = new qh[param6.length];
          qh[] var7 = var11;
          for (int var8 = param0; param6.length > var8; var8++) {
            qh var9 = new qh(param3, param6[var8], param2[var8], param4, param1[var8], param5);
            var11[var8] = var9;
          }
          qh[] stackIn_5_0 = var7;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("dn.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int[] a(int param0, boolean param1, int param2, int param3, int param4, ih param5) {
        String stackIn_17_2 = null;
        try {
          this.field_l = new dk[2];
          int var7_int = 3;
          int var8 = param2;
          if (!param1) {
            String[] discarded$0 = this.j(104);
          }
          int var9 = param0 * var8;
          int var10 = var8 + 1;
          int var11 = 10;
          int var12 = param4;
          int var13 = 0;
          if (this.field_m < -1 + this.field_D) {
            var13++;
          }
          if (this.field_m > 0) {
            var13++;
          }
          int[] var14 = new int[var13];
          int var15 = 0;
          if (this.field_m > 0) {
            int var16 = var11 + param3;
            String var17 = ja.field_b;
            int incrementValue$1 = var8;
            var8++;
            this.a(var17, var12, var10, var7_int, var9, var16, param5, this.field_p, 0, 10551200, incrementValue$1);
            int incrementValue$2 = var15;
            var15++;
            var14[incrementValue$2] = this.field_p;
          }
          if (this.field_m < this.field_D - 1) {
            int var16Lifetime1 = -var11 + this.field_k + param3;
            String var17Lifetime1 = fj.field_kb;
            int incrementValue$3 = var8;
            var8++;
            this.a(var17Lifetime1, var12, var10, var7_int, var9, var16Lifetime1, param5, this.field_u, 1, 10551200, incrementValue$3);
            int incrementValue$4 = var15;
            var15++;
            var14[incrementValue$4] = this.field_u;
          }
          int[] stackIn_13_0 = var14;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var7;
          StringBuilder stackIn_16_1 = new StringBuilder().append("dn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int f(byte param0) {
        if (param0 != 70) {
          field_C = (String[]) null;
        }
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 != null) {
          return 12110032;
        }
        return 10551200;
    }

    private final void g(int param0) {
        int[] var2;
        int[] var3;
        int[] var4;
        int var5;
        int var9 = EscapeVector.obfuscationControl;
        if (!this.field_w) {
          var2 = new int[]{3170352, 8421504, 8421504};
          var4 = new int[]{6340704, 16777215, 16777215};
          var3 = new int[]{6340704, 16777215, 16777215};
        } else {
          var5 = this.g((byte) 104);
          int var6_int = this.f((byte) 70);
          var4 = new int[]{var5, var6_int, var6_int};
          var3 = new int[]{var5, var6_int, var6_int};
          var2 = new int[]{var5, var6_int, var6_int};
        }
        var5 = 75 / ((-81 - param0) / 43);
        if (null != this.field_l) {
          dk[] var6 = this.field_l;
          for (int var7 = 0; var7 < var6.length; var7++) {
            dk var8 = var6[var7];
            if (var8 != null) {
              var8.a(var3, var2, (byte) -128, var4);
            }
          }
        }
        if (null != this.field_z) {
          dk stackIn_15_0 = this.field_z;
          ((dk) (Object) stackIn_15_0).a(var3, var2, (byte) -125, var4);
        }
    }

    private final void a(boolean param0, int param1) {
        di.field_d = null;
        ch.field_b = param0 ? true : false;
        if (this.field_g == param1) {
          da.field_c.b(false, 320);
        }
        if (this.field_e == param1) {
          pl.field_q.b(-26480, false);
        }
        mj.field_d = 0;
        gi.a((byte) -118);
    }

    private final int a(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        dk[] var4 = this.field_l;
        int var5 = 0;
        if (param0 < 2) {
          dn.h(-72);
        }
        while (var5 < var4.length) {
          dk var6 = var4[var5];
          if (var6 != null &&
            var6.a((byte) 65, param1, param2)) {
            return var6.field_c;
          }
          var5++;
        }
        if (null != this.field_z &&
          this.field_z.a((byte) 65, param1, param2)) {
          return this.field_z.field_c;
        }
        return -1;
    }

    private final void i(int param0) {
        int var2 = mj.field_d;
        if (var2 == 0) {
          int var3_int = 8192;
          sj.a(var3_int, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (null != BoundedRandomAccessFile.activeSession &&
          var2 >= 20) {
          IntValueNode.field_j = false;
        }
        if (param0 == ~var2) {
          hh var3 = pc.field_a;
          int var4 = 100;
          int var5 = 6144 * qm.field_c / 64;
          int var6 = 8192;
          hj var7 = rk.field_e;
          var7.a(var3, var4, var5, var6);
        }
        if (var2 < 1000) {
          mj.field_d = mj.field_d + 1;
        }
    }

    private final void l(int param0) {
        hj var2 = rk.field_e;
        hh var3 = oa.field_w;
        int var4 = 100;
        int var5 = param0 * qm.field_c / 64;
        int var6 = 8192;
        var2.a(var3, var4, var5, var6);
    }

    private final Sprite[] a(int param0, int param1) {
        if (hi.a(param1, -2)) {
          Sprite[] var3 = mb.field_f;
          return this.a(var3, param0 + 4802);
        }
        if (!bj.e((byte) -75)) {
          return null;
        }
        if (param1 == 2) {
          Sprite[] var3Lifetime1 = mb.field_f;
          return this.a(var3Lifetime1, -126);
        }
        if (param1 == 3) {
          Sprite[] var3Lifetime2 = ob.field_b;
          return this.a(var3Lifetime2, -113);
        }
        if (param0 == -4898) {
          return null;
        }
        return (Sprite[]) null;
    }

    private final Sprite[] a(Sprite[] param0, int param1) {
        String stackIn_26_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return null;
          }
          int var3_int = 7;
          Sprite[] var4 = new Sprite[var3_int];
          int var5 = 0;
          if (param1 > -88) {
            this.l(-88);
          }
          for (int var6 = 0; param0.length > var6; var6++) {
            if (mf.a(var6, -64) ||
              1 == var6 ||
              5 == var6) {
              Sprite var7 = param0[var6];
              if (var5 >= 0 &&
                var5 <= var3_int) {
                if (var7 == null) {
                  return null;
                }
                int incrementValue$1 = var5;
                var5++;
                var4[incrementValue$1] = var7;
              }
            }
          }
          Sprite[] stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var3;
          StringBuilder stackIn_25_1 = new StringBuilder().append("dn.HA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(int param0) {
        this.field_h = param0;
        this.field_h = this.field_h + this.field_c.b((byte) -90);
        this.field_h = t.a(this.field_o.b((byte) -90), this.field_h, 76);
        this.field_h = t.a(this.field_n.b((byte) -90), this.field_h, 62);
        int var2 = this.field_f.b((byte) -90);
        var2 = var2 + this.field_f.c((byte) 124);
        if (this.field_b) {
          var2 = var2 + this.field_B.b((byte) -90);
          var2 = var2 + this.field_B.c((byte) 109);
          var2 = var2 + this.field_s.b((byte) -90);
        }
        this.field_h = t.a(var2, this.field_h, 81);
    }

    private final int b(int param0) {
        if (this.field_d == null) {
          return -1;
        }
        if (this.field_A == null) {
          return -1;
        }
        if (param0 < 57) {
          field_q = (al) null;
        }
        int var2 = this.field_d.field_h;
        if (0 > var2) {
          return -1;
        }
        if (var2 >= this.field_A.length) {
          return -1;
        }
        return this.field_A[var2];
    }

    private final int b(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_A == null) {
          return -1;
        }
        if (this.field_A.length == 0) {
          return -1;
        }
        if (param1 != -3844) {
          return -23;
        }
        for (int var3 = 0; var3 < this.field_A.length; var3++) {
          if (param0 == this.field_A[var3]) {
            return var3;
          }
        }
        return -1;
    }

    final boolean f(int param0) {
        this.i(param0);
        this.d(-22600);
        int var2 = this.b(false, 1) ? 1 : 0;
        boolean var2Lifetime1 = (this.h((byte) 67));
        if (var2Lifetime1) {
          return (var2Lifetime1);
        }
        return (var2Lifetime1);
    }

    private final void a(String param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8, int param9, int param10) {
        try {
          if (param9 != 10551200) {
            int discarded$0 = this.b(36);
          }
          dk var13 = new dk(param3, param10, param0, param4, param2, param6);
          dk var14 = var13;
          param1 = param1 - var14.field_i / 2;
          if (1 == param8) {
            param5 = param5 - var14.field_p;
          }
          var14.b((byte) 125, param5, param1);
          this.field_l[param8] = var13;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dn.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 640;
        int var4 = (-this.field_k + var3) / 2;
        int var5 = this.field_t - this.field_h / 2;
        int var6 = 0;
        int var7 = 10;
        ih var8 = fh.field_g;
        int[] var16 = this.a(var7, true, var6, var4, var5, var8);
        var6 = var6 + var16.length;
        int var10 = this.field_t + this.field_h / 2;
        int[] var17 = this.a(33, var6, var10, var8, var7);
        var6 = var6 + var17.length;
        this.field_A = new int[var6];
        int var12 = 0;
        var12 = this.a(var16, -3549, var12);
        int discarded$0 = this.a(var17, -3549, var12);
        int var13 = 21 / ((param0 - 49) / 46);
        this.g(105);
        this.a(param1, false);
    }

    private final void a(boolean param0, boolean param1) {
        this.field_d = new wc(this.field_A.length);
        int var3 = -1;
        if (!this.field_w) {
          var3 = this.b(this.field_e, -3844);
        } else {
          var3 = this.b(this.field_g, -3844);
        }
        int var4 = this.a(104, dh.field_d, bj.field_y);
        this.field_d.a(121, param0, var4, var3);
        if (param1) {
          tc[] discarded$0 = this.b(true);
        }
    }

    private final String[] j(int param0) {
        String var3_ref;
        if (param0 != 27679) {
          this.field_r = false;
        }
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        GameplaySession var6 = var5;
        if (var6 == null) {
          String[] var3 = new String[]{on.field_c, fk.field_e};
          return var3;
        }
        regionExit1: {
          String[] var3Lifetime1 = null;
          if (var6.g((byte) -18)) {
            var3_ref = pf.field_h;
          } else {
            if (!var6.field_Gb &&
              !var6.field_Ib) {
              if (var6.levelIndex < 0) {
                var3_ref = AccountRegistrationPanel.field_O;
              } else if (1 == var6.field_Ub) {
                var3_ref = pn.field_qb[var5.m((byte) -84)];
              } else if (var6.field_ec) {
                var3_ref = d.field_f[var5.m((byte) -84)];
              } else if (var6.field_Q != 1) {
                var3_ref = LevelObject.field_q;
              } else {
                var3_ref = gl.field_r;
              }
              break regionExit1;
            }
            var3_ref = jf.field_M;
          }
        }
        if (12 <= var6.levelIndex) {
          String[] var4 = new String[]{var3_ref, " ", fa.field_e};
          return var4;
        }
        String[] var4Lifetime1 = new String[]{var3_ref};
        return var4Lifetime1;
    }

    final void c(byte param0) {
        int var7 = EscapeVector.obfuscationControl;
        this.k((byte) 117);
        int var2 = 0;
        dk[] var3_ref_dk__ = this.field_l;
        for (int var4 = 0; var3_ref_dk__.length > var4; var4++) {
          dk var5 = var3_ref_dk__[var4];
          if (null != var5) {
            boolean stackIn_8_0 = !(this.field_d.field_h != var5.field_c);
            boolean var6 = stackIn_8_0;
            var5.a(-16383, (var6));
            var2 = var5.field_l + var5.field_i / 2;
          }
        }
        if (this.field_j &&
          this.field_c != null) {
          var2 = var2 + this.a(var2, this.field_c, 0);
        }
        if (this.field_i &&
          null != this.field_o) {
          var2 = var2 + this.a(var2, this.field_o, 0);
        }
        if (this.field_r &&
          this.field_n != null) {
          var2 = var2 + this.a(var2, this.field_n, 0);
        }
        if (this.field_x) {
          var2 = var2 + this.a(var2, this.field_f, 0);
          if (this.field_b) {
            var2 = var2 + this.a(var2, this.field_B, 0);
            var2 = var2 + this.a(var2, this.field_s, 0);
          }
        }
        if (null != this.field_z) {
          boolean stackIn_31_0 = !(this.field_d.field_h != this.field_z.field_c);
          boolean var3 = stackIn_31_0;
          this.field_z.a(-16383, (var3));
          int var2Lifetime1 = this.field_z.field_i + this.field_z.field_l;
        }
        if (param0 <= 104) {
          this.a((byte) 11, 95);
        }
    }

    private final int g(byte param0) {
        if (param0 < 14) {
          this.i(-81);
        }
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return 6340704;
        }
        return 7899280;
    }

    private final void b(byte param0) {
        ih var2 = fh.field_g;
        if (param0 != 88) {
          return;
        }
        int var3 = 16777215;
        int var4 = this.field_y.field_g + this.field_y.field_j - this.field_v;
        int var5 = this.field_y.field_k + (this.field_y.field_m - this.field_v - var2.field_x);
        String var6 = 1 + this.field_m + "/" + this.field_D;
        var2.b(var6, var4, var5, var3, -1);
    }

    private final void c(int param0) {
        String var2 = km.field_o;
        String[] var3 = new String[]{on.field_c};
        this.field_f = new jl(var2, var3);
        this.a(this.field_f, param0 ^ 16762243);
        var3 = new String[]{mh.field_g};
        var2 = gl.field_s;
        this.field_B = new jl(var2, var3);
        this.a(this.field_B, 16777215);
        var2 = pl.field_p;
        var3 = new String[]{ia.field_p + "<br>" + "<br>", fk.field_e};
        this.field_s = new jl(var2, var3);
        if (param0 != 14972) {
          return;
        }
        this.a(this.field_s, 16777215);
    }

    private final void a(jl param0, int param1) {
        try {
          int var3_int = param1;
          int var4 = this.g((byte) 84);
          ih var5 = fh.field_g;
          param0.a(var4, var5, var3_int, -87);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dn.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String param0, int param1, float param2) {
        pl.field_t = param2;
        if (param1 != 17637) {
          return;
        }
        try {
          hd.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String i(byte param0) {
        int var3 = -97 / ((-76 - param0) / 44);
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return PointCloudEffect.field_v;
        }
        return ua.field_b;
    }

    private final tc[] b(boolean param0) {
        int var12 = EscapeVector.obfuscationControl;
        if (param0) {
          return (tc[]) null;
        }
        Sprite[] var13 = this.a(-4898, 1);
        Sprite[] var2 = var13;
        Sprite[] var3 = this.a(-4898, 3);
        if (var2 == null) {
          return null;
        }
        if (var13.length == 0) {
          return null;
        }
        int var4 = var13.length;
        tc[] var5 = new tc[var4];
        int var6 = 8;
        for (int var7 = 0; var4 > var7; var7++) {
          Sprite var8 = var13[var7];
          Object var9 = null;
          if (var3 != null) {
            var9 = var3[var7];
          }
          Sprite[] var10 = new Sprite[]{var8, (Sprite) (var9)};
          tc var11 = new tc(var10, var6);
          var5[var7] = var11;
        }
        return var5;
    }

    private final void a(byte param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        if (param1 == this.field_u) {
          this.field_m = this.field_m + 1;
          if (this.field_m >= this.field_D) {
            this.field_m = 0;
          }
        }
        if (this.field_p == param1) {
          this.field_m = this.field_m - 1;
          if (this.field_m < 0) {
            this.field_m = -1 + this.field_D;
          }
        }
        boolean var3 = true;
        if (null != this.field_d) {
          boolean stackIn_14_0 = !(!this.field_d.field_j);
          var3 = stackIn_14_0;
        }
        this.a(108, (var3));
        int var4 = this.b(param1, -3844);
        if (0 <= var4 &&
          null != this.field_d) {
          this.field_d.a(false, var4);
        }
        int var5 = 119 / ((48 - param0) / 61);
        if (0 == this.field_m) {
          this.field_x = false;
          this.field_r = false;
          this.field_j = true;
          this.field_i = false;
        }
        if (this.field_m == 1) {
          this.field_r = false;
          this.field_j = false;
          this.field_i = true;
          this.field_x = false;
        }
        if (this.field_m == 2) {
          if (this.field_w) {
            this.field_r = true;
          } else {
            this.field_r = false;
          }
          if (this.field_w) {
            this.field_x = false;
          } else {
            this.field_x = true;
          }
          this.field_i = false;
          this.field_j = false;
        }
    }

    private final void k(byte param0) {
        if (param0 < 102) {
          dn.a((String) null, 106, 1.9259626865386963f);
        }
        if (!this.field_w) {
          SoftwareRasterizer.d();
          od.b(2);
          this.field_y.c(105);
          pb.a(4);
        } else {
          int var2 = 640;
          int var3 = 480;
          int var4 = 64;
          SoftwareRasterizer.a(0, 0, var2, var3, 0, var4);
          this.field_y.c(116);
        }
        this.b((byte) 88);
    }

    private final boolean h(byte param0) {
        int var5 = EscapeVector.obfuscationControl;
        int var3 = -33 / ((param0 + 47) / 45);
        boolean var2 = false;
        while (pn.p(-73)) {
          this.field_d.c((byte) 6);
          if (this.field_d.field_e) {
            this.l(1536);
          }
          if (nk.field_n == 13) {
            int var4 = this.field_e;
            if (this.field_w) {
              var4 = this.field_g;
            }
            this.field_d.field_h = this.b(var4, -3844);
            boolean stackIn_11_0 = !(!this.b(true, 1));
            var2 = stackIn_11_0;
            if (var2) {
              return (var2);
            }
          }
          boolean stackIn_16_0 = !(!this.b(false, 1));
          var2 = stackIn_16_0;
          if (var2) {
            return (var2);
          }
        }
        return (var2);
    }

    private final boolean b(boolean param0, int param1) {
        if (param1 != 1) {
          this.a(54, true);
        }
        boolean var3 = false;
        if (!this.field_d.b((byte) -18) &&
          !param0) {
          return (var3);
        }
        int var4 = this.b(param1 + 73);
        if (var4 != this.field_e &&
          var4 != this.field_g) {
          if (var4 == this.field_p) {
            this.a((byte) 115, var4);
          } else if (var4 == this.field_u) {
            this.a((byte) 115, var4);
          }
          return (var3);
        }
        this.a(false, var4);
        boolean var3Lifetime1 = true;
        return (var3Lifetime1);
    }

    public static void h(int param0) {
        if (param0 != -1) {
          field_C = (String[]) null;
        }
        field_q = null;
        field_C = null;
    }

    private final int[] a(int param0, int param1, int param2, ih param3, int param4) {
        String stackIn_11_2 = null;
        try {
          GameplaySession var6 = BoundedRandomAccessFile.activeSession;
          int var7 = 3;
          int var8 = param1;
          int var9 = param4 * var8;
          if (param0 <= 6) {
            int[] stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          int var10 = var8 + 1;
          int var11 = param2 + this.field_v;
          if (var6 == null) {
            String var12 = ag.field_a;
            int[] stackIn_7_0 = this.a(var12, var11, var10, this.field_e, 10551200, var9, param3, var7, var8);
            return stackIn_7_0;
          }
          String var12Lifetime1 = fa.field_f;
          int[] stackIn_5_0 = this.a(var12Lifetime1, var11, var10, this.field_g, 10551200, var9, param3, var7, var8);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var6_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("dn.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int[] a(String param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          this.field_z = new dk(param7, param8, param0, param5, param2, param6);
          int var10_int = 640;
          int var11 = this.field_z.field_p;
          int var12 = 480;
          int var13 = (-var11 + var10_int) / 2;
          int var14 = -this.field_z.field_i + (var12 - param1);
          param1 = param1 + var14 / 2;
          this.field_z.b((byte) 114, var13, param1);
          if (param4 != 10551200) {
            this.field_d = (wc) null;
          }
          int[] var15 = new int[]{param3};
          int[] stackIn_3_0 = var15;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var10;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dn.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param1 != 4) {
          field_C = (String[]) null;
        }
        if (param3) {
          var4++;
        }
        return sl.field_c[var4];
    }

    private final void d(int param0) {
        int var2 = this.a(103, dh.field_d, bj.field_y);
        if (param0 != -22600) {
          this.field_z = (dk) null;
        }
        int var3 = this.a(param0 + 22723, sf.field_c, ng.field_ob);
        this.field_d.a(var3, (byte) 118, var2);
        if (this.field_d.field_e) {
          this.l(1536);
        }
    }

    private final void a(String[] param0, byte param1) {
        String stackIn_10_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = 0; var3_int < param0.length; var3_int++) {
            String var4 = param0[var3_int];
            param0[var3_int] = "- " + var4;
          }
          if (param1 != -10) {
            this.k(-17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3;
          StringBuilder stackIn_9_1 = new StringBuilder().append("dn.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, jl param1, int param2) {
        String stackIn_10_2 = null;
        try {
          if (param1 == null) {
            int stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param2 != 0) {
            jl var5 = (jl) null;
            int discarded$1 = this.a(115, (jl) null, 41);
          }
          param1.a(param0, 3);
          int var4_int = param1.b((byte) -90);
          var4_int = var4_int + param1.c((byte) 99);
          int stackIn_6_0 = var4_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("dn.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        int var2 = 640;
        if (param0 != 87) {
          ih var15 = (ih) null;
          this.a((String) null, -33, 46, -86, -58, -49, (ih) null, -14, -115, 10, -82);
        }
        int var3 = -this.field_v + (-this.field_k + var2) / 2;
        int var4 = 0;
        dk var5 = this.field_l[0];
        if (var5 == null) {
          var5 = this.field_l[1];
        }
        if (var5 != null) {
          var4 = var5.field_l - this.field_v;
        }
        int var6 = this.field_k + this.field_v * 2;
        int var7 = 0;
        if (var5 != null) {
          var7 = this.field_h + (var5.field_i / 2 + var5.field_l) + this.field_v;
        }
        int var8 = var7 - var4;
        int var9 = 20;
        this.field_y = new gf(var3, var4, var6, var8, var9);
        int var10 = 3162160;
        if (this.field_w) {
          var10 = this.g((byte) 76);
        }
        int var11 = 6324320;
        if (this.field_w) {
          var11 = this.f((byte) 70);
        }
        int var12 = 0;
        int var13 = 3160124;
        int var14 = 160;
        if (this.field_w) {
          this.field_y.a(var10, var13, var12, var14, var11, (byte) -128);
        } else {
          this.field_y.a(param0 ^ 15176, var11, var12, var10);
        }
    }

    private final void d(byte param0) {
        this.a(true);
        this.a((byte) 124);
        this.k(-109);
        this.c(14972);
        this.e((byte) 79);
        if (param0 != 19) {
          return;
        }
        this.e(0);
    }

    private final int a(int[] param0, int param1, int param2) {
        String stackIn_7_2 = null;
        try {
          qg.a(param0, 0, this.field_A, param2, param0.length);
          if (param1 != -3549) {
            this.field_m = 116;
          }
          param2 = param2 + param0.length;
          int stackIn_3_0 = param2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dn.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        String[] var8 = new String[]{um.field_c, dc.field_i, PacketBuffer.field_k, fn.field_a, tc.field_h, ll.field_h, ea.field_i};
        if (!param0) {
          return;
        }
        String[] var3 = new String[]{ug.field_b, QuickChatPhraseDefinition.field_w, mj.field_c, qj.field_e, oh.field_k, DynamicTerrainRenderer.field_t, cj.field_b};
        int var4 = 16777215;
        int var5 = this.f((byte) 70);
        int var6 = this.g((byte) 115);
        ih var7 = fh.field_g;
        this.field_c = new gl(qc.field_yb, var8, var3);
        this.field_c.a(var6, var5, var4, (byte) -92, var7);
    }

    dn(boolean param0) {
        this.field_r = false;
        this.field_u = 1;
        this.field_i = false;
        this.field_x = false;
        this.field_v = 13;
        this.field_w = true;
        this.field_b = false;
        this.field_g = 3;
        this.field_p = 0;
        this.field_t = 260;
        this.field_l = new dk[2];
        this.field_j = true;
        this.field_e = 2;
        this.field_D = 3;
        this.field_m = 0;
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          this.field_w = false;
        } else {
          this.field_w = true;
        }
        this.field_b = bj.e((byte) 115);
        this.d((byte) 19);
        this.a(-66, param0);
        this.j((byte) 87);
    }

    static {
        field_C = new String[]{"virtual_layer0.jpg", "virtual_layer1.jpg", "virtual_layer2.jpg", "virtual_layer3.jpg"};
    }
}
