/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ki {
    static String field_s;
    static NodeDeque field_t;
    static MouseWheelSource mouseWheelSource;
    static mh field_w;
    static RgbSprite field_y;
    static boolean field_r;
    static String field_v;
    static boolean field_u;

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          this.a((byte) 57, -62, 109, 2);
          return ObjectHistoryBuffer.field_q;
        }
        return ObjectHistoryBuffer.field_q;
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.a("ninja", -28138)) {
          return false;
        }
        LegacyUtf8Decoder.field_d = pl.a("ninja", "ninja_near", (byte) -24, AchievementIcon.field_m);
        ap.field_f = pl.a("ninja", "ninja_mid", (byte) -128, AchievementIcon.field_m);
        hn.field_b = pl.a("ninja", "ninja_far", (byte) 127, AchievementIcon.field_m);
        hc.field_g = pl.a("ninja", "ninja_small", (byte) -81, AchievementIcon.field_m);
        ObjectHistoryBuffer.field_q = pl.a("ninja", "ninja_character", (byte) -105, AchievementIcon.field_m);
        nk.field_h = jh.a(0, LegacyUtf8Decoder.field_d);
        mp.field_Zb = jh.a(0, ap.field_f);
        rh.field_c = jh.a(0, hn.field_b);
        pl.a(hn.field_b, 0);
        if (!param0) {
          pl.a(rh.field_c, 0);
          return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          return;
        }
        if (!this.b((byte) -110)) {
          Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, fj.field_Sb[param3], 0);
          return;
        }
        pb var6 = PowerUp.a(this.field_m, param3, -20777);
        if (!var6.a((byte) -84, param3, this.field_m)) {
          aa.a(0, hn.field_b, true, param3, var6, 1);
          var6.a(this.field_m, param3, (byte) 78);
        }
        tl.a(var6.field_p, (byte) -78, param2, 640, LegacyUtf8Decoder.field_d, ap.field_f, param1, 0, param3, param4, 1);
    }

    qa(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void d(byte param0) {
        field_s = null;
        field_v = null;
        mouseWheelSource = null;
        int var1 = -103 % ((-61 - param0) / 57);
        field_t = null;
        field_w = null;
        field_y = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -91) {
          qa.a(-41, -77, (byte) -108, -18);
          if (null == LegacyUtf8Decoder.field_d) {
            return false;
          }
          if (ap.field_f == null) {
            return false;
          }
          if (null == hn.field_b) {
            return false;
          }
          if (null != hc.field_g) {
            return null != ObjectHistoryBuffer.field_q ? true : false;
          }
          return false;
        }
        if (null == LegacyUtf8Decoder.field_d) {
          return false;
        }
        if (ap.field_f == null) {
          return false;
        }
        if (null == hn.field_b) {
          return false;
        }
        if (null != hc.field_g) {
          return null != ObjectHistoryBuffer.field_q ? true : false;
        }
        return false;
    }

    final static RgbSprite[] a(int param0, int param1, mf param2, boolean param3) {
        RuntimeException var4 = null;
        mf var5 = null;
        Object stackIn_4_0 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            var5 = (mf) null;
            qa.a(-20, -51, (mf) null, true);
          }
          if (ln.a(-97, param0, param2, param1)) {
            stackIn_6_0 = v.a(-835);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (RgbSprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var1 = 35 / ((-43 - param0) / 37);
        mf.field_f.a(-125);
        if (null != sj.field_b) {
          mf.field_f.a(-76, sj.field_b);
          return;
        }
        sj.field_b = new tb(mf.field_f, ke.field_b);
        mf.field_f.a(-76, sj.field_b);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        mf var7 = null;
        mf var7Lifetime1;
        mf var7Lifetime2;
        if (!this.b((byte) -127)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, fj.field_Sb[param3], 0);
          if (param1 > -84) {
            var7 = (mf) null;
            qa.a(90, 38, (mf) null, true);
            return;
          }
          return;
        }
        pb var8 = kd.a(this.field_m, param3, (byte) 120);
        if (!var8.a((byte) -84, param3, this.field_m)) {
          aa.a(0, rh.field_c, true, param3, var8, 2);
          var8.a(this.field_m, param3, (byte) 78);
        } else {
          tl.a(var8.field_p, (byte) -78, param0, 306, nk.field_h, mp.field_Zb, param4, 0, param3, param2, 2);
          if (param1 > -84) {
            var7Lifetime1 = (mf) null;
            qa.a(90, 38, (mf) null, true);
            return;
          }
          return;
        }
        tl.a(var8.field_p, (byte) -78, param0, 306, nk.field_h, mp.field_Zb, param4, 0, param3, param2, 2);
        if (param1 <= -84) {
          return;
        }
        var7Lifetime2 = (mf) null;
        qa.a(90, 38, (mf) null, true);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (-1 < param1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, fj.field_Sb[param1], 0);
          var5 = 110 / ((param0 + 28) / 43);
          if (this.b((byte) -97)) {
            hc.field_g.drawTransparent(param2, param3);
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 7829367, 928072);
        var5Lifetime1 = 110 / ((param0 + 28) / 43);
        if (this.b((byte) -97)) {
          hc.field_g.drawTransparent(param2, param3);
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (um.field_e) {
          return vd.field_a.a(go.currentKeyCharacter, dc.currentKeyCode, true);
        }
        if (TooltipSprite.field_p) {
          return sa.a(param1, 102, param0);
        }
        if (ln.a(param1, 11, param0)) {
          return true;
        }
        if (qo.field_I) {
          return false;
        }
        if (param2 == 108) {
          return hi.a(false, param3, param1);
        }
        field_y = (RgbSprite) null;
        return hi.a(false, param3, param1);
    }

    static {
        field_s = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_t = new NodeDeque();
        field_v = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
