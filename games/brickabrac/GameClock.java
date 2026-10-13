/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static int field_d;
    static String field_h;
    static RgbSprite[] field_f;
    static RgbSprite halloweenFarSprite;
    static RgbSprite chocolateSmallNearSprite;
    static int field_g;
    static RectangleBody field_c;
    static int field_b;

    final int waitAndAdvance(long tickDurationNanos, byte obfuscationGuard) {
        long var4 = this.getSleepMillis((byte) 107);
        if (var4 > 0L) {
          wj.sleepMillis(-124, var4);
          if (obfuscationGuard == -71) {
            return this.advanceCycles(15, tickDurationNanos);
          }
          return 106;
        }
        if (obfuscationGuard == -71) {
          return this.advanceCycles(15, tickDurationNanos);
        }
        return 106;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (0 == param0) {
          return 0;
        }
        if (0 >= param0) {
          var2 = 2;
          if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param1 < ~param0) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (-4 > param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 1;
        if (param0 > 65535) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 > 255) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (15 < param0) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 > 3) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (1 < param0) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    abstract void reset(int obfuscationGuard);

    final static boolean c(byte param0) {
        int var1 = 15 % ((81 - param0) / 36);
        hk.field_R = true;
        NanoGameClock.field_i = 15000L + MonotonicTime.nowMillis(false);
        return AchievementIcon.field_j == 11 ? true : false;
    }

    public static void a(byte param0) {
        chocolateSmallNearSprite = null;
        field_f = null;
        field_c = null;
        field_h = null;
        halloweenFarSprite = null;
        int var1 = 25 % ((param0 + 34) / 58);
    }

    abstract long getSleepMillis(byte obfuscationGuard);

    abstract int advanceCycles(int obfuscationGuard, long tickDurationNanos);

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          java.applet.Applet var9 = null;
          String var10 = null;
          String stackIn_8_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              var10 = param1.getParameter("cookieprefix");
              if (!param0) {
                var9 = (java.applet.Applet) null;
                GameClock.a(true, (java.applet.Applet) null);
              }
              var3 = var10 + "settings";
              var4 = (String) (ne.a("getcookies", -125, param1));
              var5 = FarmBackground.a((byte) 123, var4, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (SoundCache.field_d == null) {
              return param1.getParameter("settings");
            }
            stackIn_15_0 = SoundCache.field_d;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("dj.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        kd.field_d = new String[rg.field_a];
        kd.field_d[18] = ta.field_c;
        kd.field_d[4] = BackgroundRegistry.field_a;
        kd.field_d[16] = oj.field_o;
        kd.field_d[21] = br.field_Rb;
        kd.field_d[5] = k.field_i;
        kd.field_d[15] = DualLinkNode.field_i;
        kd.field_d[9] = sh.field_b;
        kd.field_d[6] = DelayedPacket.field_i;
        kd.field_d[20] = c.field_n;
        kd.field_d[7] = nk.field_i;
        kd.field_d[17] = RasterCacheSurface.field_l;
        kd.field_d[19] = tq.field_g;
        kd.field_d[param0] = ed.field_a;
        kd.field_d[11] = AchievementsScreen.field_I;
    }

    static {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
    }
}
