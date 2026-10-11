/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends nc {
    static cj field_l;
    static String field_q;
    static String field_p;
    static int field_r;
    static String field_o;
    private int field_n;
    private int field_t;
    private int[] field_s;
    private int[] field_m;

    final int d(int param0, int param1) {
        if (param0 >= -65) {
          field_p = (String) null;
        }
        if (!wc.j(106) ||
          this.field_d == 6) {
          return this.a((byte) -118, param1) + this.field_k;
        }
        if (param1 == 0) {
          return 350 + this.a((byte) -118, param1);
        }
        return 100 + this.a((byte) -118, param1);
    }

    final void a(boolean param0) {
        int var17 = 0;
        String[] var3;
        String var4;
        String var5;
        sl var6;
        ef var7;
        int var8;
        int var9;
        ri var10;
        int var10_int;
        int var11;
        int var12;
        ri var12_ref_ri;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        String[] var19;
        int var9Lifetime1;
        int var11Lifetime1;
        var18 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        var19 = dg.field_G;
        var3 = ih.field_e;
        var4 = vg.field_n;
        var5 = nk.field_q;
        var6 = ah.field_e;
        var7 = pb.field_e;
        if (this.field_d == 6) {
          var7.b(sn.field_Mb, 320, 300, 16777215, 0);
        }
        var8 = ng.field_e;
        for (var9 = 0; sf.field_b > var9; var9++) {
          if ((this.field_d != 6 ||
            this.h(var9, 86)) &&
            this.f(-1, var9)) {
            var10_int = this.field_m[var9];
            var11 = this.field_s[var9];
            if (this.field_t == var9) {
              oo.b(-3 + var10_int, -3 + var11, 38, 38, 6, 0, 128);
            }
            if (this.field_n == var9) {
              oo.b(var10_int - 3, var11 - 3, 38, 38, 6, 16777215);
            }
            var12_ref_ri = this.g(0, var9);
            var12_ref_ri.b(var10_int, var11);
          }
        }
        var7.b(kb.field_E, 320, var8 + 72, 16777215, 0);
        var7.b(vk.field_G, 320, 18 + (40 + (var8 + 32)), 14540083, 0);
        var9Lifetime1 = -1;
        if (this.field_t == -1) {
          if (-1 != this.field_n) {
            var9Lifetime1 = this.field_n;
          }
        } else {
          var9Lifetime1 = this.field_t;
        }
        if (var9Lifetime1 != -1) {
          var10 = this.g(0, var9Lifetime1);
          var10.a(110, 140);
          var6.a(var19[var9Lifetime1], 260, 105, 300, 85, 0, 0, 1, 2, 35);
          var11Lifetime1 = 280;
          var12 = 200;
          var13 = 280;
          var14 = 100;
          var15 = var7.field_C + var7.field_r;
          var16 = var15 * var7.a(var3[var9Lifetime1], var11Lifetime1, var12, var13, var14, 16777215, 0, 0, 0, var15);
          var12 = var12 + (var16 - (-var15 - 6));
          var7.c(var5 + 100 * ra.field_n[var9Lifetime1], var11Lifetime1, var12, 16777215, 0);
          var12 = var12 + (6 + var15);
          var7.c(var4, var11Lifetime1, var12, 16777215, 0);
          var11Lifetime1 = var11Lifetime1 + var7.a(var4);
          for (var17 = 0; ra.field_n[var9Lifetime1] > var17; var17++) {
            of.field_k.g(var17 * (of.field_k.field_z >> 1) + var11Lifetime1, 2 - of.field_k.field_u + var12);
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var8 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int[] var15;
        int var5Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0, param1, param2);
        this.field_m = new int[sf.field_b];
        this.field_s = new int[sf.field_b];
        this.field_t = -1;
        this.field_n = -1;
        var4 = 0;
        for (var5 = 0; var5 < sf.field_b; var5++) {
          if (this.f(-1, var5)) {
            var4++;
          }
        }
        sf.field_a = (640 - (sf.field_g - 8) * var4 - (var4 - 1) * (-sf.field_g + sf.field_e)) / 2;
        var5Lifetime1 = sf.field_a;
        var6 = ng.field_e;
        var7 = param0;
        for (var8 = 0; var8 < sf.field_b; var8++) {
          if (this.f(~param0, var8)) {
            var9 = var5Lifetime1;
            var10 = var6;
            this.field_m[var8] = var9;
            if (var7 % 2 == 1) {
              var10 += 24;
            }
            var7++;
            this.field_s[var8] = var10;
            var5Lifetime1 = var5Lifetime1 + (sf.field_e - 8);
          } else {
            var15 = this.field_m;
            var10 = var8;
            this.field_s[var8] = -100;
            var15[var10] = -100;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (this.field_d == 6) {
          return param1 != 0 ? 350 : 100;
        }
        if (param0 != -118) {
          return 51;
        }
        if (wc.j(108)) {
          return 0 == param1 ? 50 : 470;
        }
        return 320 - (this.field_k >> 1);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param0.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param0.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1 >= -16) {
            mq.e(-4);
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            stackIn_31_0 = Class.forName(param0);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("mq.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        if (param0 != 22324) {
          mq.e(-115);
        }
    }

    private final ri g(int param0, int param1) {
        if (this.h(param1, 29)) {
          return la.field_l[param1];
        }
        if (param0 != 0) {
          return (ri) null;
        }
        return wl.field_l;
    }

    private final boolean h(int param0, int param1) {
        if (param1 <= 10) {
          field_l = (cj) null;
        }
        int[] var4 = this.field_d != 6 ? k.field_n : fc.field_m;
        int[] var3 = var4;
        return fq.a(param0, 127, var4);
    }

    mq(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = -1;
        this.field_t = -1;
    }

    private final boolean e(int param0, int param1) {
        boolean stackIn_8_0 = false;
        if (param0 != -17) {
          mq.e(-71);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 != 13 && (param1 != 16 ||
          le.$cfr$intArgs$b$c86821474a52(0, -70))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    private final boolean f(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          this.field_n = -73;
        }
        stackIn_7_0 = (this.h(param1, 119)) || !(this.e(-17, param1));
        return stackIn_7_0;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        this.field_n = -1;
        var2 = sf.field_e - sf.field_g >> 1;
        if (ng.field_e < bo.field_d &&
          ng.field_e + 2 * sf.field_g > bo.field_d &&
          sf.field_a - var2 < bd.field_g) {
          var3 = -1;
          var4 = 0;
          while (true) {
            if (var4 < sf.field_b) {
              if (this.field_m[var4] <= bd.field_g &&
                sf.field_g + this.field_m[var4] > bd.field_g &&
                bo.field_d >= this.field_s[var4] &&
                bo.field_d < sf.field_g + this.field_s[var4]) {
                var3 = var4;
              } else {
                var4++;
                continue;
              }
            }
            if (sf.field_b > var3) {
              this.field_n = var3;
            }
            if (this.field_d != 6) {
              break;
            }
            if (this.field_n < 0) {
              break;
            }
            if (this.h(this.field_n, 47)) {
              break;
            }
            this.field_n = -1;
            break;
          }
        }
        if (kd.field_b != 0) {
          if (this.field_t != this.field_n) {
            if (-1 != this.field_n) {
              this.field_t = this.field_n;
            }
          } else {
            this.field_t = -1;
          }
        }
    }

    static {
        field_r = 500;
        field_o = "Select a human or enemy zombie!";
        field_p = "Accept <%0> into this game";
        field_q = "Click";
    }
}
