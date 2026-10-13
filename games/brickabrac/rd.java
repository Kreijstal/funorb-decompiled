/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static hl field_e;
    static String field_c;
    static boolean field_a;
    static RgbSprite[][] constructionCapsSprites;

    final static void a(int param0) {
        TooltipSprite.field_p = false;
        if (null != hd.field_a) {
          hd.field_a.f((byte) 41);
        }
        if (param0 != ~ng.field_b) {
          fl.b(true);
        }
        HighscoresScreen.field_v = 0;
    }

    final static void b(int param0) {
        int var8 = 0;
        char dupTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        ck var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var4Lifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 >= -26) {
            return;
          }
          var1_int = ff.field_d.size(119);
          if (var1_int != 0) {
            var2 = 14 + (18 * var1_int + 9);
            var3 = 0;
            var4_ref_ck = (ck) (ff.field_d.first(-8));
            while (var4_ref_ck != null) {
              var5_int = 0;
              for (var6 = 0; var4_ref_ck.field_l.length() > var6; var6++) {
                var5_int = var5_int + SoundCache.field_c.getAdvance(var4_ref_ck.field_l.charAt(var6));
              }
              if (var5_int > var3) {
                var3 = var5_int;
              }
              var4_ref_ck = (ck) (ff.field_d.next((byte) 116));
            }
            var3 += 28;
            var3 = -(var3 % 100) + (100 + var3);
            Rasterizer2D.fillRectangleAlpha(-var3 + 626, 14, var3, var2, 0, 180);
            for (var4 = 0; var4 < 12; var4++) {
              var5_intLifetime1 = (-var4 + 12) * 20;
              Rasterizer2D.drawRectangleAlpha(626 - var3 + var4, 14 + var4, -var4 - var4 + var3, -var4 - var4 + var2, 0, var5_intLifetime1);
            }
            var4Lifetime1 = 41;
            var5 = (ck) (ff.field_d.first(-80));
            while (var5 != null) {
              var6Lifetime1 = 612;
              var7 = 0;
              for (var8 = 0; var5.field_l.length() > var8; var8++) {
                dupTemp$0 = var5.field_l.charAt(var5.field_l.length() + (-var8 - 1));
                var7Lifetime1 = dupTemp$0;
                var6Lifetime1 = var6Lifetime1 - SoundCache.field_c.getAdvance(dupTemp$0);
                SoundCache.field_c.drawCharacter((char) var7Lifetime1, var6Lifetime1, var4Lifetime1, 2);
              }
              var4Lifetime1 += 18;
              var5 = (ck) (ff.field_d.next((byte) 116));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "rd.E(" + param0 + ')');
        }
    }

    final static BackgroundScene selectBackground(int selector, byte obfuscationGuard) {
        int var3 = 0;
        Object var2 = null;
        if (obfuscationGuard != 19) {
          rd.a((byte) -86);
        }
        gb.backgroundVariant = hi.field_w.nextBoundedInt(-37880252, 2);
        if (selector == 0) {
          var3 = hi.field_w.nextBoundedInt(-37880252, 11);
          if (var3 + 1 == IntArrayRequest.lastBackgroundId) {
            var3 = (1 + var3) % 11;
          }
          IntArrayRequest.lastBackgroundId = var3 + 1;
          selector = var3 + 1;
        }
        if (selector == 7) {
          lg.h(0);
        }
        BackgroundScene var2_ref = BackgroundRegistry.scenes[selector];
        var2_ref.ensureSprites(obfuscationGuard - 18);
        return var2_ref;
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          if (param2 != 103) {
            var12 = (String[]) null;
            rd.a((String) null, (String[]) null, (byte) -1);
          }
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (eh.a(param0.charAt(var5), (byte) 44)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!dc.a((CharSequence) ((Object) var7_ref_String), -43)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = fl.a((CharSequence) ((Object) var7_ref_String), -28734);
              var4 = var4 + (var6_int - var5 + param1[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (eh.a(param0.charAt(var5Lifetime1), (byte) 60)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!dc.a((CharSequence) ((Object) var9), param2 ^ -23)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = fl.a((CharSequence) ((Object) var9), -28734);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("rd.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static RgbSprite[] c(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        RgbSprite[] var1 = new RgbSprite[nl.decodedSpriteCount];
        for (var2 = 0; var2 < nl.decodedSpriteCount; var2++) {
          var3 = jh.decodedSpriteWidths[var2] * gg.decodedSpriteHeights[var2];
          var4 = cn.decodedSpriteIndices[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = qp.decodedSpritePalette[ik.a((int) var4[var6], 255)];
          }
          var1[var2] = new RgbSprite(cf.decodedCanvasWidth, ek.decodedCanvasHeight, ag.decodedSpriteOffsetX[var2], dl.decodedSpriteOffsetY[var2], jh.decodedSpriteWidths[var2], gg.decodedSpriteHeights[var2], var5);
        }
        if (param0 < 93) {
          return (RgbSprite[]) null;
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 != 46) {
          rd.c(110);
        }
        field_c = null;
        constructionCapsSprites = (RgbSprite[][]) null;
    }

    static {
        field_b = "Fullscreen";
        field_c = "<%0> has withdrawn the request to join.";
    }
}
