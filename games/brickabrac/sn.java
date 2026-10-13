/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends ki {
    static String field_s;
    static String field_u;
    static String field_r;
    static RgbSprite field_t;

    private final static void a(RgbSprite param0, int param1, int param2, int param3, int param4, RgbSprite param5, int param6, int param7, int param8, int param9, RgbSprite param10, int param11, RgbSprite param12) {
        try {
          param12.drawAt(-((-param3 + param12.canvasWidth) / 2) + (param6 + (param2 * param7 >> 16)), param8);
          og.a(-121, 144, 128, param10, 11970969, (param2 * 9 >> 16) + (-param10.canvasWidth + param3) / 2 + param6 - 35 / param1, -(120 / param1) - param10.canvasHeight + (param9 + param4) + param8);
          param5.drawTransparent(-(23 / param1) + (10 * param2 >> 16) + (param6 + (-param5.canvasHeight + param3) / 2), -param5.canvasHeight + param9 + (param8 + param4));
          param0.drawTransparent(-(279 / param1) + (param3 - param0.canvasHeight) / 2 + (param6 + (20 * param2 >> 16)), -param0.canvasHeight + param9 + (param8 + param4));
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "sn.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ')');
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -31 / ((param0 - 65) / 49);
        return rd.field_d[-1 + param1];
    }

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          this.a((byte) 31, 89, 39, 72);
        }
        return sk.field_J[-1 + param1];
    }

    public static void f(int param0) {
        field_r = null;
        if (param0 < 82) {
          return;
        }
        field_t = null;
        field_s = null;
        field_u = null;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return kh.field_d[param0 - 1];
    }

    sn(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          sk.field_J = new RgbSprite[2];
          rd.field_d = new RgbSprite[2][];
          kh.field_d = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "sn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 110 % ((param0 + 28) / 43);
        if (param1 > -1) {
          Rasterizer2D.fillRectangle(param2, param3, 153, 240, 16777215);
        } else {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 240, 16777215, 11184810);
        }
        if (param1 > -1) {
          la.a(param2, param3, 153, 240, IntrusiveNode.field_h[param1], 11970969, 152);
        }
        if (this.b((byte) -112)) {
          MenuSelection.field_h.drawTransparent(param2, param3);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (this.b((byte) -116)) {
          var6 = kd.a(this.field_m, param3, (byte) -47);
          if (!var6.a((byte) -84, param3, this.field_m)) {
            tf.a(-10, param3, var6, 2, -119, hg.field_g);
            var6.a(this.field_m, param3, (byte) 78);
          }
          sn.a(t.field_a, 2, param4, 306, -10, IntrusiveNode.field_d, param2, 5, param0, 480, er.field_d, param3, var6.field_p);
        } else {
          Rasterizer2D.fillRectangle(param2, param0, 306, 480, 16777215);
        }
        if (param1 > -84) {
          field_r = (String) null;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!param0) {
          sn.b((byte) -60, 50);
        }
        if (!this.b((byte) -124)) {
          Rasterizer2D.fillRectangle(param4, param2, 640, 480, 16777215);
        } else {
          var6 = PowerUp.a(this.field_m, param3, -20777);
          if (!var6.a((byte) -84, param3, this.field_m)) {
            tf.a(0, param3, var6, 1, 114, sf.field_cb);
            var6.a(this.field_m, param3, (byte) 78);
          }
          sn.a(sf.field_Y, 1, param1, 640, 0, AchievementBrowserScreen.field_D, param4, 5, param2, 480, IntNode.field_o, param3, var6.field_p);
        }
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.a("construct", -28138)) {
          return false;
        }
        sf.field_Y = pl.a("construct", "construction_near", (byte) 124, AchievementIcon.field_m);
        AchievementBrowserScreen.field_D = pl.a("construct", "construction_mid", (byte) 102, AchievementIcon.field_m);
        sf.field_cb = pl.a("construct", "construction_far", (byte) -93, AchievementIcon.field_m);
        IntNode.field_o = pl.a("construct", "construction_smoke", (byte) -128, AchievementIcon.field_m);
        MenuSelection.field_h = pl.a("construct", "construction_small", (byte) -74, AchievementIcon.field_m);
        t.field_a = jh.a(0, sf.field_Y);
        IntrusiveNode.field_d = jh.a(0, AchievementBrowserScreen.field_D);
        hg.field_g = jh.a(0, sf.field_cb);
        er.field_d = jh.a(0, IntNode.field_o);
        rd.field_d[0] = cr.a("construct", AchievementIcon.field_m, "construction_caps", 2);
        kh.field_d[0] = cr.a("construct", AchievementIcon.field_m, "construction_segs", 2);
        sk.field_J[0] = pl.a("construct", "construction_centre", (byte) 127, AchievementIcon.field_m);
        rd.field_d[1] = ig.a(rd.field_d[0], false);
        kh.field_d[1] = ig.a(kh.field_d[0], param0);
        sk.field_J[1] = pl.a(-16371, sk.field_J[0]);
        pl.a(IntNode.field_o, 0);
        pl.a(er.field_d, 0);
        return true;
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        rn.field_h = param1;
        if (hj.field_Yb != hc.field_f) {
          var2 = hj.field_Yb * hj.field_Yb;
          var3 = var2 - hc.field_f * hc.field_f;
          param1 = param1 + var3 * (ej.field_O - param1) / var2;
        }
        DualLinkDeque.field_d.a(120, param1, qh.field_f, 640, (byte) 64);
        fj.a(kn.field_z, 5, ej.field_O - 24, 640, om.field_oc, 0, (byte) 94);
        if (param0 > -70) {
          RgbSprite var4 = (RgbSprite) null;
          sn.a((RgbSprite) null, 67, 35, -28, -34, (RgbSprite) null, -56, 62, -67, 118, (RgbSprite) null, -55, (RgbSprite) null);
        }
    }

    final static void a(int param0, byte[] param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = -8 % ((33 - param0) / 48);
          var3_int = 256;
          var5 = new int[256];
          for (var6 = 0; var6 < 256; var6++) {
            incrementValue$1 = var3_int;
            var3_int++;
            var5[var6] = ik.a(255, (int) param1[incrementValue$1]);
          }
          var3_int += 256;
          var8 = 0;
          var6Lifetime1 = var8;
          while (var8 < 256) {
            param1[var3_int] = (byte)(param1[var3_int] - param2);
            var3_int = var3_int + var5[var8];
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sn.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 >= -91) {
          this.a((byte) -78, -121);
        }
        stackIn_9_0 = (null != sf.field_Y) && (AchievementBrowserScreen.field_D != null) && (null != sf.field_cb) && (null != IntNode.field_o) && (MenuSelection.field_h != null);
        return stackIn_9_0;
    }

    static {
        field_s = "Email address is unavailable";
        field_r = "Start Game";
        field_u = "Please remove <%0> from your ignore list first.";
    }
}
