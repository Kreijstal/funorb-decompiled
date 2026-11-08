/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteLoadHelpers {
    static String field_d;
    static String textCreateAccount1;
    static String field_c;
    static long field_b;
    static String textOpponent;

    final static CoverageBitmapFont loadRgbSpriteByName(Js5Archive param0, int param1, String param2, String param3, Js5Archive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CoverageBitmapFont stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.findGroupId(param1, param2);
          var6 = param0.getFileId(-70, var5_int, param3);
          stackIn_1_0 = TextLayout.loadBitmapFont(false, var6, var5_int, param0, param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("pc.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void renderPieceModelsToSprite(Sprite param0, byte param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        BackgroundParticle var2 = null;
        RuntimeException var2_ref = null;
        IndexedSprite[] var3 = null;
        IndexedSprite var4 = null;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          RenderTargetHelpers.setRenderTargetSprite(param0, 256);
          if (Bzip2State.hasFeatureBit((byte) 13, 0) &&
            ProgressMessageDialog.randomInt(4712, 100) != 0) {
            Rasterizer.fillRectangle(0, 0, 200, 400, 0);
            LoginCredentialType.popRasterState((byte) 96);
            return;
          }
          Rasterizer.fillRectangle(0, 0, 200, 400, 8421504);
          if (param1 > -24) {
            SpriteLoadHelpers.releaseStatics(111);
          }
          var2 = (BackgroundParticle) (LoadingTextGlobals.field_a.first((byte) -98));
          while (var2 != null) {
            if (0 == var2.field_g) {
              var3 = UrlRewriteHelpers.field_d;
            } else {
              if (1 != var2.field_g) {
                var3 = ByteStorage.field_b;
              } else {
                var3 = GameSession.field_y;
              }
            }
            var4 = var3[var2.field_o / 3];
            var4.field_m[1] = var2.field_l * 65793;
            if (!var2.field_p) {
              var4.drawFlippedHorizontal(-31, 200);
            } else {
              var4.draw(-31, 200);
            }
            var2 = (BackgroundParticle) (LoadingTextGlobals.field_a.next(16213));
          }
          LoginCredentialType.popRasterState((byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        textCreateAccount1 = null;
        textOpponent = null;
        field_c = null;
        if (param0 != -30114) {
          field_b = -39L;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        textCreateAccount1 = "Create a free account to";
        field_c = "Show all game chat";
        textOpponent = "Your opponent is <%0>.";
        field_d = "Email (Login):";
    }
}
