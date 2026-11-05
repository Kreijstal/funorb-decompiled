/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hd {
    static int field_g;
    static int field_c;
    static int field_b;
    static int[] field_h;
    static String field_f;
    static String field_e;
    static vc field_a;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        java.awt.Component var9;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = fleas.field_A ? 1 : 0;
        if (vg.field_z < 0) {
          return;
        }
        var3 = param0 - 135;
        var4 = -35 + param1;
        var5 = 256;
        if (vg.field_z < 75) {
          var5 = (vg.field_z << 8) / 75;
        }
        if (200 < vg.field_z) {
          var5 = (250 - vg.field_z << 8) / 50;
        }
        r.a(nj.field_b, 45);
        bl.b();
        gb.c();
        mj.a(-515966495);
        if (256 > var5) {
          gb.g(0, 0, gb.field_d, gb.field_k, 0, -var5 + 256);
        }
        ia.a(-74);
        if (150 <= vg.field_z) {
          pl.field_e.c(var3 + 15, 10 + var4, var5);
        } else {
          nj.field_b.e(var3, var4);
        }
        var6 = vg.field_z - 125;
        if (0 < var6 &&
          50 > var6) {
          if (20 <= var6) {
            if (var6 >= 30) {
              var7 = 256 * (-var6 + 50) / 20;
              uc.field_d.a(var3, var4, var7);
            } else {
              uc.field_d.a(var3, var4, 256);
            }
          } else {
            var7 = var6 * 256 / 20;
            uc.field_d.a(var3, var4, var7);
          }
        }
        if (param2 != -27794) {
          var9 = (java.awt.Component) null;
          hd.a(-21, (ei) null, 14, -111, -71, (ce) null, (java.awt.Component) null, false);
        }
        var6Lifetime1 = vg.field_z - 140;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (20 > var6Lifetime1) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          ge.field_f.c(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    abstract void a(int param0, byte[] param1);

    final static wh a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        wh[] var3 = null;
        int var4 = 0;
        wh var5 = null;
        int var6 = 0;
        java.awt.Component var7 = null;
        wh stackIn_6_0 = null;
        wh stackIn_11_0 = null;
        wh stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          var2 = ck.a(-5174, "jagex-last-login-method", param1);
          if (!param0) {
            var7 = (java.awt.Component) null;
            hd.a(98, (ei) null, -46, 17, -94, (ce) null, (java.awt.Component) null, true);
          }
          if (var2 == null) {
            stackIn_6_0 = bf.field_a;
            return stackIn_6_0;
          }
          var3 = hc.a((byte) -116);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              stackIn_14_0 = bf.field_a;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a((byte) -38, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("hd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        fg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fg var4 = null;
        RuntimeException decompiledCaughtException = null;
        int var2Lifetime1;
        var3 = fleas.field_A ? 1 : 0;
        try {
          var4 = (fg) (jk.field_m.c((byte) 47));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_k; var2++) {
            if (var4.field_n[var2] != null &&
              var4.field_n[var2].field_b == 0) {
              return false;
            }
            if (var4.field_s[var2] != null &&
              var4.field_s[var2].field_b == 0) {
              return false;
            }
          }
          var2Lifetime1 = 73 / ((-19 - param0) / 56);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "hd.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        if (param0 != -75) {
          field_d = (String) null;
        }
        field_e = null;
        field_f = null;
        field_d = null;
    }

    abstract byte[] b(int param0);

    final static void a(int param0, ei param1, int param2, int param3, int param4, ce param5, java.awt.Component param6, boolean param7) {
        la.a(param4, param7, 10);
        db.field_J = la.a(param5, param6, 0, param2);
        if (param3 < 2) {
          return;
        }
        try {
          tg.field_i = la.a(param5, param6, 1, param0);
          qg.field_f = new ke();
          ng.field_c = param0 * 1000 / param4;
          tg.field_i.b(qg.field_f);
          gg.field_h = param1;
          gg.field_h.b(17, th.field_D);
          db.field_J.b(gg.field_h);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "hd.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        we.a(50, -128);
        field_h = new int[2];
        field_e = "Music: ";
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new vc();
        field_d = "<%0>Recessed Wall:<%1> Fleas pass through these normally, but the green switches turn them into normal walls, killing any fleas still on these squares when that happens.";
    }
}
