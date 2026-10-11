/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends qt {
    static String[] field_A;
    static boolean[] field_B;
    static int field_C;

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (Integer.class.isInstance(param0)) {
            stackIn_2_0 = Integer.TYPE;
            return stackIn_2_0;
          }
          if (Byte.class.isInstance(param0)) {
            stackIn_5_0 = Byte.TYPE;
            return stackIn_5_0;
          }
          if (Short.class.isInstance(param0)) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (Long.class.isInstance(param0)) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (Boolean.class.isInstance(param0)) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (Float.class.isInstance(param0)) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1 < 105) {
            rm.f(37);
          }
          if (Double.class.isInstance(param0)) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!Character.class.isInstance(param0)) {
            return null;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("rm.EA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    rm() {
    }

    private final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var12 = 0;
        int var13 = 0;
        String var15 = null;
        String var14 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        int var10_int = param7 % 2 != 0 ? 0 : 128;
        int var11 = 18;
        String var14Lifetime1;
        String var14Lifetime2;
        int var12Lifetime1;
        if (param2 < 99) {
          return;
        }
        try {
          var12 = 140;
          on.a(this.field_j + var11, param8 - 17, var12, 25, 0, var10_int);
          var11 = 4 + (var11 + var12);
          var12Lifetime1 = 36;
          on.a(this.field_j + var11, param8 - 17, var12Lifetime1, 25, 0, var10_int);
          var11 = 4 + var12Lifetime1 + var11;
          on.a(this.field_j + var11, param8 - 17, var12Lifetime1, 25, 0, var10_int);
          var11 = var12Lifetime1 + var11 + 4;
          on.a(this.field_j + var11, param8 - 17, var12Lifetime1, 25, 0, var10_int);
          var11 = 4 + var11 + var12Lifetime1;
          on.a(this.field_j + var11, -17 + param8, var12Lifetime1, 25, 0, var10_int);
          var11 = 4 + var12Lifetime1 + var11;
          on.a(var11 + this.field_j, param8 - 17, var12Lifetime1, 25, 0, var10_int);
          var13 = param1 + (param4 + param6);
          if (param7 != -1) {
            q.field_d.c(param7 + 1 + ". ", this.field_j + 35, param8, param5, -1);
          }
          if (var13 != 0) {
            param4 = (var13 + param4 * 200) / (2 * var13);
            param1 = (var13 + 200 * param1) / (2 * var13);
            param6 = (param6 * 200 + var13) / (2 * var13);
          }
          var15 = param3;
          q.field_d.a(var15, 35 + this.field_j, param8, param5, -1);
          var14 = Integer.toString(param0);
          q.field_d.d(var14, ml.field_r[0] + this.field_j, param8, param5, -1);
          var16 = 9999 > var13 ? Integer.toString(var13) : "9999+";
          var14Lifetime1 = var16;
          q.field_d.d(var16, ml.field_r[1] + this.field_j, param8, param5, -1);
          var17 = param4 + "%";
          q.field_d.d(var17, this.field_j + ml.field_r[2], param8, param5, -1);
          var14Lifetime2 = param1 + "%";
          q.field_d.d(var14Lifetime2, ml.field_r[3] + this.field_j, param8, param5, -1);
          var18 = param6 + "%";
          q.field_d.d(var18, this.field_j + ml.field_r[4], param8, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "rm.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static qb b(int param0, byte param1) {
        if (param1 == -52) {
          return null != sr.field_f ? (qb) (sr.field_f.a(param1 - 3559, (long)param0)) : null;
        }
        field_B = (boolean[]) null;
        return null != sr.field_f ? (qb) (sr.field_f.a(param1 - 3559, (long)param0)) : null;
    }

    private final void g(byte param0) {
        if (param0 == -4) {
          pb.field_C.d(sh.field_b, 192 + this.field_j, q.field_d.field_G + 275 - 38, 16777215, -1);
          return;
        }
        field_B = (boolean[]) null;
        pb.field_C.d(sh.field_b, 192 + this.field_j, q.field_d.field_G + 275 - 38, 16777215, -1);
    }

    final static void e(int param0) {
        if (param0 != 25) {
          return;
        }
        np.field_Jb.a(new pq(), 3);
    }

    final int b(int param0, int param1) {
        if (la.a(100)) {
          if (param0 == 0) {
            return (this.field_i[0].field_d >> 1) + 25;
          }
          if (param0 == 1) {
            return -(this.field_i[1].field_d >> 1) + 340;
          }
        }
        if (0 == param0) {
          return 70;
        }
        if (param1 != -22667) {
          field_B = (boolean[]) null;
        }
        if (param0 == 1) {
          return wr.field_f + (-this.field_i[param0].field_d - 5);
        }
        return super.b(param0, -22667);
    }

    final static void a(boolean param0) {
        java.awt.Canvas var1 = null;
        java.awt.Canvas var1Lifetime1;
        if (!param0) {
          if (!dr.field_a) {
            dr.field_a = true;
            var1 = ln.l(64);
            wt.field_x = el.field_A;
            us.field_j = n.field_m;
            oo.field_c.a((byte) 76, 240, 320, (java.awt.Component) ((Object) var1));
            oo.field_c.a(-126, (java.awt.Component) ((Object) var1), false);
            el.field_A = 320;
            n.field_m = 240;
          }
          return;
        }
        field_B = (boolean[]) null;
        if (!dr.field_a) {
          dr.field_a = true;
          var1Lifetime1 = ln.l(64);
          wt.field_x = el.field_A;
          us.field_j = n.field_m;
          oo.field_c.a((byte) 76, 240, 320, (java.awt.Component) ((Object) var1Lifetime1));
          oo.field_c.a(-126, (java.awt.Component) ((Object) var1Lifetime1), false);
          el.field_A = 320;
          n.field_m = 240;
        }
    }

    final int a(int param0, int param1) {
        int var3 = -89 / ((param0 + 49) / 52);
        if (la.a(100)) {
          return super.a(-101, param1);
        }
        if (2 != param1) {
          return 410;
        }
        return super.a(-101, param1);
    }

    final void a(int param0, boolean param1) {
        int var9 = 0;
        int var3;
        int var4;
        String var5;
        String[] var6;
        int[] var7;
        int var8;
        int var10;
        String[] var11;
        String var12;
        String var13;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime1Lifetime1;
        String var13Lifetime1;
        String var13Lifetime2;
        String var13Lifetime1Lifetime1;
        var10 = Kickabout.field_G;
        pt.a(374 + this.field_j, -22914, this.field_j + 10, 390, 80);
        on.a(10 + this.field_j, 80, 364, 320, 10, 0, 128);
        ta.e(126);
        super.a(param0, param1);
        if (la.a(param0 ^ -97)) {
          this.g((byte) -4);
          return;
        }
        if (ug.field_e == null) {
          ug.field_e = jt.a(10, (byte) 100, 0, 7);
        }
        var3 = 99;
        var4 = 11184810;
        q.field_d.d(wm.field_p, ml.field_r[0] + this.field_j, var3, var4, -1);
        q.field_d.d(k.field_e, this.field_j + ml.field_r[1], var3, var4, -1);
        q.field_d.d(mt.field_e, this.field_j + ml.field_r[2], var3, var4, -1);
        q.field_d.d(ta.field_D, ml.field_r[3] + this.field_j, var3, var4, -1);
        q.field_d.d(ku.field_e, ml.field_r[4] + this.field_j, var3, var4, -1);
        var3 = var3 + (q.field_d.field_G + 8);
        if (!ug.field_e.field_e) {
          var5 = uf.field_a;
        } else {
          if (null == ug.field_e.field_i) {
            var12 = bg.field_o;
            var13 = var12;
            var13Lifetime2 = var12;
            var3 = 385 + q.field_d.field_G;
            un.field_d.d(var12.toLowerCase(), this.field_j + 185, 260, 16777215, -1);
            return;
          }
          var5 = jw.field_Fb;
          var11 = ug.field_e.field_i[wv.field_ib];
          var6 = var11;
          var7 = ug.field_e.field_o[wv.field_ib];
          var8 = 0;
          for (var9 = 0; var9 < 10; var9++) {
            if (null != var11[var9]) {
              var4Lifetime1 = 16777215;
              if (hm.a((byte) -101, var11[var9])) {
                var4Lifetime1 = 16750882;
                var8 = 1;
              }
              var5 = "";
              var13Lifetime1 = var5;
              var13Lifetime1Lifetime1 = var5;
              this.a(var7[4 * var9], var7[2 + 4 * var9], (byte) 104, var11[var9], var7[1 + 4 * var9], var4Lifetime1, var7[4 * var9 + 3], var9, var3);
            }
            var3 += 25;
          }
          if (var8 == 0) {
            var4Lifetime1Lifetime1 = 16777215;
            this.a(ug.field_e.field_f, ug.field_e.field_h, (byte) 105, ow.field_e, ug.field_e.field_m, var4Lifetime1Lifetime1, ug.field_e.field_j, -1, var3);
          }
        }
        var3Lifetime1 = 385 + q.field_d.field_G;
        un.field_d.d(var5.toLowerCase(), this.field_j + 185, 260, 16777215, -1);
    }

    public static void f(int param0) {
        field_B = null;
        field_A = null;
        if (param0 > -20) {
          field_C = 1;
        }
    }

    static {
        field_A = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to KickaboutText.text_benefits."};
        field_C = -1;
    }
}
