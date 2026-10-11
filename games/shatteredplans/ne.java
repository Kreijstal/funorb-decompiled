/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends oh {
    int field_r;
    static boolean field_s;
    ln field_k;
    static qh field_l;
    static int field_o;
    fs field_h;
    int field_i;
    static String field_n;
    static String field_q;
    static String[] field_m;
    int field_p;
    static int field_j;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var10 = 0;
        int var12 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 0) {
            param6 = param6 + param0;
            param0 = 0;
          }
          if (param3 < 0) {
            param1 = param1 + param3;
            param3 = 0;
          }
          if (param1 + param3 > gf.field_b) {
            param1 = gf.field_b - param3;
          }
          if (gf.field_k < param6 + param0) {
            param6 = -param0 + gf.field_k;
          }
          var7_int = param4 * param5 >> 8;
          var8 = -var7_int + param5;
          var9 = param6 + param0;
          if (param2 != 24) {
            return;
          }
          for (var10 = param0; var10 < var9; var10++) {
            var11 = param3 + var10 * gf.field_b;
            for (var12 = param1; var12 > 0; var12--) {
              var13 = gf.field_h[var11];
              var14 = (16711680 & var13) >> 16;
              var15 = 255 & var13 >> 8;
              var16 = 255 & var13;
              var17 = 5 * var14 + var15 * 6 + 5 * var16;
              var18 = (var14 * var7_int >> 8) + (var17 * var8 >> 12);
              var19 = (var15 * var7_int >> 8) + (var8 * var17 >> 12);
              var20 = (var16 * var7_int >> 8) + (var17 * var8 >> 12);
              var21 = var20 | (var19 << 8 | var18 << 16);
              gf.field_h[var11] = var21;
              var11++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "ne.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void c(boolean param0) {
        field_q = null;
        field_m = null;
        field_l = null;
        field_n = null;
        if (param0) {
          field_o = -92;
        }
    }

    final static bi a(int param0, boolean param1) {
        if (param1) {
          return (bi) null;
        }
        bi var2 = new bi(pf.field_d.field_z, pf.field_d.field_w);
        ra.a(-127);
        var2.e();
        pf.field_d.b(0, 0, param0 >= 0 ? param0 : 2105376);
        cg.i(0);
        return var2;
    }

    final static void d(boolean param0) {
        ch.field_c = null;
        jn.field_a = false;
        oi.field_d = null;
        we.field_f = null;
        db.field_a = null;
        qq.field_n = null;
        w.field_D = null;
        va.field_e = null;
        ks.field_j = null;
        tf.field_b = null;
        ac.field_s = null;
        if (!param0) {
          field_n = (String) null;
        }
        sr.field_F = null;
        tp.field_e = null;
        ma.field_r = null;
        q.field_Cb = null;
        oe.field_c = null;
        ds.field_b = null;
        mm.field_o = null;
        he.field_h = null;
        vm.field_Jb = null;
    }

    final static void a(bc param0, byte param1, nq param2) {
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        si var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        int[] var14 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = ai.field_e;
          ua.field_f = new qr(0L, (qr) null);
          if (param0 == null) {
            var10 = (Throwable) null;
            jq.a(-29901, (Throwable) null, "QC1");
            return;
          }
          param0.field_k = 0;
          param0.field_j = false;
          kq.field_A = new jo(var3_int, param0, param0);
          dh.field_c = new re(var3_int, param0, param0, new ch());
          var4 = hc.a(false);
          if (var4 == null) {
            jq.a(-29901, (Throwable) null, "QC2");
            return;
          }
          ke.a(param1 - 5, var4);
          kh.field_Nb = rd.a(65793, 5138823, 65793, 65793, 4020342, (byte) 99, 1127256, 1513239, (nq) null, 0, 2245737, 1513239, 8947848);
          nl.field_d = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16764006, 0, 0, 0);
          hl.field_I = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16777215, 0, 0, 0);
          if (param1 != -64) {
            field_j = -87;
          }
          var5 = gf.field_b;
          var6 = gf.field_k;
          var14 = gf.field_h;
          jq.field_c = new bi(10, 14);
          jq.field_c.e();
          for (var8 = 2; 7 > var8; var8++) {
            gf.j(var8, var8 + 1, -(var8 << 1) + 14, 16777215);
          }
          gf.a(var14, var5, var6);
          of.field_b = gn.a(0, var4, hl.field_I, nl.field_d, kh.field_Nb);
          ua.field_f.field_M = new pf();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ne.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (ef.a(param1, false)) {
            return true;
          }
          var6 = tq.field_g;
          var2 = var6;
          for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
              return true;
            }
          }
          var2Lifetime1 = wd.field_L;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "ne.E(" + param0 + ',' + param1 + ')');
        }
    }

    ne(mg param0, int param1, int param2) {
        try {
          this.field_h = param0.field_G;
          this.field_p = param1;
          this.field_i = param0.field_z;
          this.field_r = param2;
          this.field_k = param0.field_y;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ne(fs param0, int param1, int param2, int param3) {
        try {
          this.field_h = param0;
          this.field_k = null;
          this.field_r = param3;
          this.field_p = param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_m = new String[]{"Metal income in this territory.", "Biomass income in this territory.", "Energy income in this territory.", "Exotics income in this territory."};
        field_q = "No players";
        field_j = 20;
    }
}
