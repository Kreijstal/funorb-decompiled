/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up implements lv {
    static String field_d;
    static sj field_m;
    int field_q;
    int field_e;
    int field_j;
    static char[] field_a;
    static double field_f;
    int field_g;
    boolean field_c;
    static int field_p;
    int field_n;
    int field_l;
    int[] field_h;
    int field_o;
    static sj field_k;
    static long field_b;
    int field_i;
    int field_r;

    final boolean c(boolean param0, int param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param0) {
          var7 = this.field_h;
          int[] var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (pa.field_g[var5].p(-32076)) {
              return true;
            }
          }
        }
        if (param1 > -59) {
          return false;
        }
        return 3 == this.field_q ? true : false;
    }

    final boolean b(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 != 100) {
          this.a(false, false);
        }
        if (!param0) {
          return false;
        }
        int[] var7 = this.field_h;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (pa.field_g[var5].a(false)) {
            return true;
          }
        }
        return false;
    }

    final void a(byte param0, up param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var4 = Kickabout.field_G;
        try {
          if (param1.c(-2)) {
            this.b((byte) -7);
            return;
          }
          this.field_r = param1.field_r;
          this.field_q = param1.field_q;
          this.field_g = param1.field_g;
          this.field_o = param1.field_o;
          this.field_n = param1.field_n;
          this.field_l = param1.field_l;
          this.field_e = param1.field_e;
          if (param1.field_h.length == this.field_h.length) {
            for (var3_int = 0; this.field_h.length > var3_int; var3_int++) {
              this.field_h[var3_int] = param1.field_h[var3_int];
            }
          } else {
            this.field_h = new int[param1.field_h.length];
            var5 = 0;
            var3_int = var5;
            while (this.field_h.length > var5) {
              this.field_h[var5] = param1.field_h[var5];
              var5++;
            }
          }
          if (param0 >= -56) {
            field_p = -88;
          }
          this.field_j = param1.field_j;
          this.field_c = param1.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("up.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (this.field_i == 0) {
          return jd.f(-1);
        }
        if (param0 != 13467) {
          return true;
        }
        return this.field_i == 1 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != -2) {
          iw var3 = (iw) null;
          this.a(-56, (iw) null);
        }
        if (this.field_q != -1) {
          return false;
        }
        return true;
    }

    final int a(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.field_o;
        var3 = var3 + this.b((byte) 64, param0);
        return var3;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param0, (byte) 85);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        var2.a(112, 2);
        var2.a(param1, er.field_h.length, param1 ^ 1991220144, er.field_h);
        var2.a(param1 ^ 124, lk.field_l);
        var2.a(124, ru.field_C);
        var2.a(0, rf.field_d.length, param1 + 1991220144, rf.field_d);
        var2.c(62, -var3 + var2.field_n);
    }

    final void a(int param0, iw param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var5Lifetime1;
        var6 = Kickabout.field_G;
        try {
          param1.h((byte) -126);
          this.field_q = (7 & param1.h((byte) -127)) - 1;
          this.field_j = param1.a((byte) 81);
          this.field_e = param1.h((byte) -112);
          this.field_l = param1.h((byte) -118);
          this.field_n = param1.h((byte) -122);
          this.field_g = param1.h((byte) -119);
          this.field_o = param1.h((byte) -126);
          if (param0 <= 13) {
            return;
          }
          this.field_r = param1.h((byte) -124);
          var10 = new int[3];
          var9 = var10;
          var7 = var9;
          var3 = var7;
          var4 = 0;
          for (var5 = 0; var5 < 3; var5++) {
            var7[var5] = -1 + param1.h((byte) -122);
            if (var10[var5] != -1) {
              var4++;
            }
          }
          this.field_h = new int[var4];
          var8 = 0;
          var5Lifetime1 = var8;
          while (var4 > var8) {
            this.field_h[var8] = var10[var8];
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("up.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int b(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        int var6Lifetime1;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        int[] var4 = this.field_h;
        for (var5 = 0; var5 < var4.length; var5++) {
          var6 = var4[var5];
          var3 = var3 + pa.field_g[var6].o(126);
        }
        var6Lifetime1 = 19 % ((10 - param0) / 50);
        return var3;
    }

    final boolean a(boolean param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 >= -103) {
          return false;
        }
        if (!param0) {
          return false;
        }
        int[] var7 = this.field_h;
        int[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (pa.field_g[var5].k(-21636)) {
            return true;
          }
        }
        return false;
    }

    final boolean a(boolean param0, int param1, boolean param2) {
        int var5 = 0;
        int[] var4;
        int var6;
        fn var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        var8 = Kickabout.field_G;
        if (!param2) {
          return false;
        }
        var11 = this.field_h;
        var10 = var11;
        var9 = var10;
        var4 = var9;
        if (!param0) {
          this.d(114);
        }
        for (var5 = 0; var11.length > var5; var5++) {
          var6 = var11[var5];
          var7 = pa.field_g[var6];
          if (param1 == 0 &&
            var7.e(true)) {
            return true;
          }
          if (1 == param1 &&
            var7.n(2688)) {
            return true;
          }
          if (2 == param1 &&
            var7.g(65)) {
            return true;
          }
          if (param1 == 3 &&
            var7.e((byte) 58)) {
            return true;
          }
          if (param1 == 4 &&
            var7.m(70)) {
            return true;
          }
          if (param1 == 5 &&
            var7.c((byte) 113)) {
            return true;
          }
          if (param1 == 6 &&
            var7.f(false)) {
            return true;
          }
          if (param1 == 7 &&
            var7.e(70)) {
            return true;
          }
          if (param1 == 8 &&
            var7.c(true)) {
            return true;
          }
          if (param1 == 9 &&
            var7.l(114)) {
            return true;
          }
        }
        return false;
    }

    public final int a(int param0) {
        if (param0 != 15) {
          this.f(71);
        }
        return this.a(false, false, (byte) 91);
    }

    final int c(byte param0) {
        int var2 = 0;
        if (var2 < this.field_n) {
          var2 = this.field_n;
        }
        if (param0 < 32) {
          field_p = 7;
        }
        if (var2 < this.field_g) {
          var2 = this.field_g;
        }
        if (this.field_o > var2) {
          var2 = this.field_o;
        }
        return var2;
    }

    final static void e(int param0) {
        if (wd.field_l != null) {
          wd.field_l.l(param0 ^ -5172);
        }
        if (param0 != -1456) {
          up.g(3);
        }
        if (null != nm.field_d) {
          nm.field_d.p(param0 ^ 1496);
        }
        d.a((byte) 127);
    }

    final void a(byte param0, iw param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          param1.a(param0 ^ 78, 1);
          if (param0 != 40) {
            this.a((byte) 59, -29, true, 95, 97, 106, -90, true);
          }
          param1.a(param0 + 71, 1 + this.field_q);
          param1.g(-1207444472, this.field_j);
          param1.a(125, this.field_e);
          param1.a(115, this.field_l);
          param1.a(104, this.field_n);
          param1.a(114, this.field_g);
          param1.a(104, this.field_o);
          param1.a(107, this.field_r);
          for (var3_int = 0; var3_int < 3; var3_int++) {
            if (var3_int >= this.field_h.length) {
              param1.a(param0 + 62, 0);
            } else {
              param1.a(125, 1 + this.field_h[var3_int]);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("up.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int d(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 > -81) {
          this.field_o = 81;
        }
        var3 = var3 + this.field_g;
        var3 = var3 + this.a(5205, param0);
        return var3;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        c.field_c = param0;
        if (rb.field_Bb != pg.field_b) {
          var2 = rb.field_Bb * rb.field_Bb;
          var3 = -(pg.field_b * pg.field_b) + var2;
          param0 = param0 + var3 * (-param0 + na.field_Ab) / var2;
        }
        if (param1 >= -65) {
          up.a(-79, -94);
        }
        g.field_a.a(true, 640, df.field_H, param0, 120);
        cf.a(119, mj.field_b, 640, 5, eb.field_b, na.field_Ab - 24, 0);
    }

    final int a(int param0, boolean param1) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        int[] var4 = this.field_h;
        int var5 = 0;
        if (param0 != 5205) {
          return 76;
        }
        while (var5 < var4.length) {
          var6 = var4[var5];
          var3 = var3 + pa.field_g[var6].b(param0 - 5102);
          var5++;
        }
        return var3;
    }

    final boolean a(byte param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        boolean stackIn_14_0 = false;
        var6 = Kickabout.field_G;
        if (param0 != 44) {
          return true;
        }
        if (param1) {
          var7 = this.field_h;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (pa.field_g[var5].d(59)) {
              return true;
            }
          }
        }
        stackIn_14_0 = (this.field_q == 0) || (this.field_q == 4);
        return stackIn_14_0;
    }

    final int a(boolean param0, boolean param1) {
        int var5 = 0;
        int var3;
        int[] var4;
        int var6;
        int var7;
        var7 = Kickabout.field_G;
        if (!param0) {
          return 0;
        }
        if (param1) {
          this.a((byte) -111, 93, false, 15, -32, 70, -71, false);
        }
        var3 = 0;
        var4 = this.field_h;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (pa.field_g[var6].a((byte) -124) > var3) {
            var3 = pa.field_g[var6].a((byte) -122);
          }
        }
        return var3;
    }

    final boolean b(boolean param0, byte param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        var6 = Kickabout.field_G;
        if (param1 > -101) {
          this.field_r = -124;
        }
        if (!param0) {
          return false;
        }
        var7 = this.field_h;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (pa.field_g[var5].c(115)) {
            return true;
          }
          if (pa.field_g[var5].k(-21636)) {
            return true;
          }
        }
        return false;
    }

    final String d(int param0) {
        if (this.c(param0 - 102)) {
          return "Empty";
        }
        if (param0 != 100) {
          this.field_c = false;
        }
        if (this.field_q < 0 ||
          ce.field_G.length <= this.field_q ||
          this.field_l < 0 ||
          ce.field_G[this.field_q].length <= this.field_l) {
          return "Error";
        }
        String var3 = "";
        String var2 = var3;
        String var6 = var3 + Character.toUpperCase(td.field_a[this.field_e]);
        String var5 = var6 + ". ";
        String var7 = var5;
        var2 = var7 + ce.field_G[this.field_q][this.field_l];
        return var2;
    }

    final boolean b(byte param0, up param1) {
        int var3_int = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (this.c(-2) &&
            param1.c(-2)) {
            return true;
          }
          if (this.field_q != param1.field_q) {
            return false;
          }
          if (this.field_l != param1.field_l) {
            return false;
          }
          if (param1.field_e != this.field_e) {
            return false;
          }
          if (param1.field_n != this.field_n) {
            return false;
          }
          if (this.field_r != param1.field_r) {
            return false;
          }
          if (param1.field_o != this.field_o) {
            return false;
          }
          if (this.field_g != param1.field_g) {
            return false;
          }
          if (this.field_h.length != param1.field_h.length) {
            return false;
          }
          for (var3_int = 0; var3_int < this.field_h.length; var3_int++) {
            if (param1.field_h[var3_int] != this.field_h[var3_int]) {
              return false;
            }
          }
          if (param0 != -98) {
            return false;
          }
          if (this.field_j != param1.field_j) {
            return false;
          }
          if (param1.field_c == this.field_c) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_54_0 = var3;
          stackIn_54_1 = new StringBuilder().append("up.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2) {
        gr var7 = null;
        if (this.c(-2)) {
          return;
        }
        if (param1 != 23) {
          this.c((byte) -63);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (!this.field_c) {
          var7 = tu.field_E;
          var4 = var7.field_w;
          var6 = var7.field_R;
          var5 = var7.field_k;
        }
        this.a((byte) 70, -(this.b(0) >> 1) + param2, false, var6, var4, var5, -(this.a(param1 ^ 24) >> 1) + param0, false);
    }

    final void b(byte param0) {
        this.field_e = 0;
        this.field_q = -1;
        this.field_r = 0;
        this.field_j = 0;
        this.field_h = new int[]{};
        this.field_l = 0;
        this.field_g = 0;
        this.field_n = 0;
        this.field_o = 0;
        if (param0 != -7) {
          this.field_e = -14;
        }
    }

    final boolean c(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!param1) {
          return false;
        }
        int[] var3 = this.field_h;
        int var4 = 0;
        if (param0 != -107) {
          this.field_e = 84;
        }
        while (var3.length > var4) {
          var5 = var3[var4];
          if (pa.field_g[var5].a(param0 - 9707)) {
            return true;
          }
          var4++;
        }
        return false;
    }

    final static boolean a(byte param0) {
        kr.field_e = true;
        if (param0 != -3) {
          return true;
        }
        ua.field_g = 15000L + nj.a(param0 - 109);
        return vj.field_c == 11 ? true : false;
    }

    final boolean c(boolean param0, byte param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param0) {
          var7 = this.field_h;
          int[] var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (pa.field_g[var5].h(param1 + 161)) {
              return true;
            }
          }
        }
        if (param1 != -62) {
          return false;
        }
        return this.field_q == 1 ? true : false;
    }

    final boolean b(boolean param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        var6 = Kickabout.field_G;
        if (param0) {
          this.h(13);
        }
        if (!param1) {
          return true;
        }
        var7 = this.field_h;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (pa.field_g[var5].b(param0)) {
            return false;
          }
          if (pa.field_g[var5].k(-21636)) {
            return false;
          }
        }
        return true;
    }

    final int h(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param0;
        var2 = ia.a(56082116, var2 ^ this.field_q);
        var2 = ia.a(56082116, this.field_n ^ var2);
        var2 = ia.a(56082116, var2 ^ this.field_o);
        var2 = ia.a(56082116, this.field_g ^ var2);
        var2 = ia.a(56082116, var2 ^ this.field_r);
        var2 = ia.a(56082116, var2 ^ this.field_l);
        var2 = ia.a(56082116, var2 ^ this.field_e);
        for (var3 = 0; this.field_h.length > var3; var3++) {
          var2 = ia.a(param0 + 56082116, var2 ^ this.field_h[var3]);
        }
        var2 = ia.a(param0 ^ 56082116, this.field_j ^ var2);
        var2 = ia.a(56082116, (!this.field_c ? 0 : 1) ^ var2);
        return var2;
    }

    final int a(boolean param0, boolean param1, byte param2) {
        if (this.field_n == 100 && 100 == this.field_o &&
          this.field_g == 100) {
          param1 = false;
        }
        int var4 = 0;
        var4 += 50;
        var4 = var4 + (60 + (!param1 ? 0 : this.field_r > 100 ? 23 : 15));
        var4 = var4 + ((this.field_h.length > 0 ? (!this.f(13467) ? 0 : 12) + 6 : 0) + this.field_h.length * 18);
        var4 = var4 + (param0 ? 20 : 0);
        if (param2 < 75) {
          return -16;
        }
        return var4;
    }

    final int c(boolean param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        if (!param0) {
          this.c(true, -116);
        }
        int[] var4 = this.field_h;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          var3 = var3 + pa.field_g[var6].b((byte) 62);
        }
        return var3;
    }

    public final String toString() {
        String var4 = null;
        String var1 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        int var2 = 0;
        int var3 = Kickabout.field_G;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        String var1Lifetime4;
        String var1Lifetime5;
        String var1Lifetime6;
        String var1Lifetime7;
        String var1Lifetime8;
        String var1Lifetime9;
        String var1Lifetime10;
        String var1Lifetime11;
        String var1Lifetime12;
        String var1Lifetime13;
        String var1Lifetime14;
        String var1Lifetime15;
        String var1Lifetime16;
        String var1Lifetime17;
        String var1Lifetime18;
        String var1Lifetime19;
        if (!this.c(-2)) {
          var4 = "Type: " + uf.field_e[this.field_q] + "\n";
          var1 = var4;
          var1Lifetime1 = var4;
          var5 = var4;
          var1Lifetime2 = var5;
          var1Lifetime3 = var5;
          if (this.field_q != -1) {
            var1Lifetime4 = var4 + "Name: " + td.field_a[this.field_e] + ". " + ce.field_G[this.field_q][this.field_l] + "\n";
          } else {
            var1Lifetime4 = var5 + "Name: N/A\n";
          }
          var6 = var1Lifetime4 + "Stats:\n";
          var1Lifetime5 = var6;
          var1Lifetime6 = var6;
          var7 = var6 + "POW: " + this.field_n + "\n";
          var1Lifetime7 = var7;
          var1Lifetime8 = var7;
          var8 = var7 + "TCK: " + this.field_o + "\n";
          var1Lifetime9 = var8;
          var1Lifetime10 = var8;
          var9 = var8 + "SPD: " + this.field_g + "\n";
          var1Lifetime11 = var9;
          var1Lifetime12 = var9;
          var10 = var9 + "EXP: " + this.field_r + "\n";
          var1Lifetime13 = var10;
          var1Lifetime14 = var10;
          var11 = var10 + "Num Trinkets: " + this.field_h.length + "\n";
          var1Lifetime15 = var11;
          var1Lifetime16 = var11;
          var12 = var11 + "Appearance: " + this.field_j + "\n";
          var1Lifetime17 = var12;
          var1Lifetime18 = var12;
          var1Lifetime19 = var12 + "Trinkets: ";
          for (var2 = 0; var2 < this.field_h.length; var2++) {
            var1Lifetime19 = var1Lifetime19 + "\t" + this.field_h[var2] + "\n";
          }
          var1Lifetime19 = var1Lifetime19 + "\n";
          return var1Lifetime19;
        }
        return "Empty PlayerStats";
    }

    final void a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6, boolean param7) {
        int stackIn_7_0 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_16_2 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_31_0;
        int stackIn_31_1;
        Object stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        Object stackIn_31_5;
        int stackIn_31_6;
        boolean stackIn_32_7 = false;
        Object stackIn_35_2;
        boolean stackIn_36_5 = false;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int[] var10;
        int var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16_int;
        ot var16;
        int var17_int;
        String var17;
        int var18;
        int var19;
        fn var20;
        ot var21;
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int var18Lifetime1;
        int var19Lifetime1;
        Object stackIn_35_2Lifetime1;
        var22 = Kickabout.field_G;
        if (this.field_n == 100 &&
          this.field_o == 100 &&
          this.field_g == 100) {
          param7 = false;
        }
        var25 = new int[]{6737151, 52479};
        var10 = new int[]{128, 60};
        stackIn_7_0 = (this.field_h.length <= 0) ? 0 : 1;
        var11 = stackIn_7_0;
        var26 = new int[4];
        var24 = var26;
        var12 = var24;
        var26[0] = 50;
        stackIn_9_0 = var12;
        stackIn_9_1 = 1;
        if (param7) {
          stackIn_12_2 = (this.field_r <= 100) ? 15 : 23;
        } else {
          stackIn_12_2 = 0;
        }
        stackIn_9_0[stackIn_9_1] = stackIn_12_2 + 60;
        stackIn_17_0 = var12;
        stackIn_17_1 = 2;
        if (this.field_h.length <= 0) {
          stackIn_18_2 = 0;
        } else {
          stackIn_16_2 = (!this.f(13467)) ? 0 : 12;
          stackIn_18_2 = stackIn_16_2 + 6;
        }
        stackIn_17_0[stackIn_17_1] = stackIn_18_2 + this.field_h.length * 18;
        stackIn_20_0 = var12;
        stackIn_20_1 = 3;
        stackIn_21_2 = (!param2) ? 0 : 20;
        stackIn_20_0[stackIn_20_1] = stackIn_21_2;
        var13 = this.b(0);
        var14 = 0;
        var15 = param6;
        var16_int = 0;
        if (param0 < 36) {
          this.toString();
        }
        while (var16_int < 4) {
          if (var26[var16_int] != 0) {
            on.a(param1, var15, var13, var26[var16_int] + 1, var25[var14], var10[var14]);
            on.e(param1, var15, var13, var26[var16_int] + 1, 65793);
            var15 = var15 + var26[var16_int];
            var14 = var14 ^ 1;
          }
          var16_int++;
        }
        stackIn_31_0 = param4;
        stackIn_31_1 = 0;
        stackIn_31_2 = this;
        stackIn_31_3 = param3;
        stackIn_31_4 = param5;
        stackIn_31_5 = this;
        stackIn_31_6 = -107;
        stackIn_32_7 = !(this.f(13467));
        boolean decompiledFrameRemainder0 = true;
        stackIn_35_2 = this;
        if (this.c((byte) stackIn_31_6, stackIn_32_7)) {
          stackIn_35_2Lifetime1 = this;
          if (wn.a((byte) -121)) {
            stackIn_36_5 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_36_5 = false;
        }
        var16 = kj.a(stackIn_31_0, stackIn_31_1, this, stackIn_31_3, stackIn_31_4, stackIn_36_5);
        if (var16 == null) {
          jr.a(param1 + 24, -103, -19 + (param6 + 50));
        } else {
          var16.c(7 + param1, 50 + param6 - (var16.field_v + 1));
        }
        q.field_d.c(this.d(100), -10 + var13 + param1, 22 + param6, 16777215, 65793);
        q.field_d.c(uf.field_e[this.field_q], -10 + param1 + var13, 36 + param6, 16777215, 65793);
        param6 = param6 + var26[0];
        var17_int = 0;
        while (true) {
          stackIn_43_0 = (param7) ? 4 : 3;
          if (stackIn_43_0 <= var17_int) {
            param6 = param6 + var26[1];
            if (var11 != 0) {
              var17_int = param1 + 13;
              var18 = param6 + 12;
              var23 = 0;
              var19 = var23;
              while (this.field_h.length > var23) {
                var20 = pa.field_g[this.field_h[var23]];
                var21 = var20.d(false);
                ((ut) ((Object) var21)).f(var17_int - (((ut) ((Object) var21)).field_o >> 2), -(((ut) ((Object) var21)).field_v >> 2) + var18);
                q.field_d.a(var20.f((byte) -1), 15 + var17_int, var18 + 4, 16777215, 65793);
                var18 += 18;
                var23++;
              }
            }
            if (this.f(13467)) {
              eo.d(1 + param1, 1 + param6, var13, var26[2] - 1);
              on.a(-1 + var13 + param1, param6, var26[2] + 1, 65793);
              q.field_d.d(oo.field_h, (var13 >> 1) + param1, -4 + var26[2] + param6, 16777215, 65793);
            }
            param6 = param6 + var26[2];
            if (param2) {
              var17 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ti.field_g, new String[]{ad.a(dh.a(this, true), 26300)});
              q.field_d.a(var17, param1 + 10, param6 + 15, 16777215, 65793);
            }
            return;
          }
          if (var17_int != 0) {
            if (var17_int != 1) {
              if (2 == var17_int) {
                stackIn_51_0 = this.field_o;
              } else {
                stackIn_51_0 = this.field_r;
              }
            } else {
              stackIn_51_0 = this.field_g;
            }
          } else {
            stackIn_51_0 = this.field_n;
          }
          var18Lifetime1 = stackIn_51_0;
          if (0 == var17_int) {
            stackIn_58_0 = this.c(true, oi.b(-89));
          } else {
            if (var17_int == 1) {
              stackIn_58_0 = this.a(5205, oi.b(-120));
            } else {
              if (var17_int == 2) {
                stackIn_58_0 = this.b((byte) -118, oi.b(-110));
              } else {
                stackIn_58_0 = 0;
              }
            }
          }
          var19Lifetime1 = stackIn_58_0;
          eo.a(param1 + (-100 + var13 >> 1), 9 + (param6 + 16 * var17_int), var18Lifetime1, var17_int, true, var19Lifetime1);
          var17_int++;
        }
    }

    final int d(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.field_n;
        var3 = var3 + this.c(true, param0);
        if (this.c(param0, param1 ^ -105) &&
          !this.c(param0, (byte) -62)) {
          var3 = 8 * var3 / 10;
        }
        return var3;
    }

    public static void g(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 8 % ((53 - param0) / 56);
        field_m = null;
        field_k = null;
    }

    public final int b(int param0) {
        if (param0 != 0) {
          field_p = 95;
        }
        return 125;
    }

    public up() {
        this.field_c = false;
        this.field_i = 0;
        this.b((byte) -7);
    }

    static {
        field_d = "decrease buyout price by <%0>";
        field_a = new char[128];
        field_b = 0L;
    }
}
