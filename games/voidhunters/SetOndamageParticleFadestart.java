/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetOndamageParticleFadestart extends ConsoleCommand {
    static int cachedFramePointerY;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ActiveIconBorderRenderer.field_b = arguments[0].intValue(90);
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uo.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetOndamageParticleFadestart(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void loadCommonUiResources(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3) {
        Sprite var17 = null;
        SoftwareIndexedSprite2D[] var5 = null;
        SoftwareIndexedSprite2D[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        SoftwareIndexedSprite2D[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = VoidHunters.field_G;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          SetCountermeasureLauncherAimarc.field_p = SetGrapplingHookRopeBreakLength.loadNamedSprites(param1, true, "commonui", "frame_top");
          SetPedrosRepairMode.field_q = SetGrapplingHookRopeBreakLength.loadNamedSprites(param1, true, "commonui", "frame_bottom");
          GameMenuScreen.field_a = SetSniperCannonProjectiles.loadNamedSprite(param1, "jagex_logo_grey", "commonui", true);
          GetBombletSprayProjectileLife.field_o = SetGrapplingHookRopeBreakLength.loadNamedSprites(param1, true, "commonui", "button");
          ByteStorage.field_a = GrowableIntArray.loadNamedSprites("commonui", -90, param1, "validation");
          SetTorpedoProjectileLife.field_o = (BitmapFont) ((Object) GetFighterBayAimspeed.loadSoftwareAlphaFontByName(0, "commonui", param1, param2, "arezzo12"));
          SetShipToShipRamDamage.field_o = (BitmapFont) ((Object) GetFighterBayAimspeed.loadSoftwareAlphaFontByName(0, "commonui", param1, param2, "arezzo14"));
          GetBoostersCooldown.field_r = (BitmapFont) ((Object) GetFighterBayAimspeed.loadSoftwareAlphaFontByName(0, "commonui", param1, param2, "arezzo14bold"));
          var17 = new Sprite(param0.fetchNamedFile("", true, "button.gif"), (java.awt.Component) ((Object) GammaCorrection.canvas));
          UiDraggableContainer.loadSoftwareIndexedSpriteByName("dropdown", "commonui", param3 ^ -60, param1);
          var5 = GetExplosionProjectileDamage.loadNamedIndexedSprites(-124, "commonui", "screen_options", param1);
          SetUseBackground.field_p = new SoftwareIndexedSprite2D[4];
          SpecialOrderSubmessage.field_f = new SoftwareIndexedSprite2D[4];
          GetFighterRepairAmount.field_q = new SoftwareIndexedSprite2D[4];
          var6 = new SoftwareIndexedSprite2D[][]{GetFighterRepairAmount.field_q, SetUseBackground.field_p, SpecialOrderSubmessage.field_f};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].palette;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].indices[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            SoftwareIndexedSprite2D[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = SetSalvoHoldable.copyWithPalette(94, var5[var9], var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.height;
          SetOndamageParticleSpeed.pushRasterState(param3 + 3);
          var17.setRasterTarget();
          SoftwareRasterizer2D.grayscaleRectangle(0, 0, SoftwareRasterizer2D.width, SoftwareRasterizer2D.height);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.setRasterTarget();
          var17.drawOpaque(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.setRasterTarget();
          var17.drawOpaque(var9Lifetime1 - var17.width, 0);
          var12 = new Sprite(var17.width - var9Lifetime1 * 2, var9Lifetime1);
          var12.setRasterTarget();
          var17.drawOpaque(-var9Lifetime1, param3);
          SoftwareRasterStateRestorer.popRasterState((byte) 124);
          GetBombletSprayProjectileLife.field_o = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uo.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
