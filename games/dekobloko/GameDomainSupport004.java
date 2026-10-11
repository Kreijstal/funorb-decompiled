/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameDomainSupport004 {
    static String[] stringArrayState0016;
    static java.awt.Canvas canvasState0001;
    static int integerState0349;
    static String stringState0283;
    static String stringState0284;
    static RgbSprite rgbSpriteState0024;
    static String stringState0285;
    static boolean booleanState0087;

    public static void performAction0902(boolean booleanArgument1) {
        stringState0285 = null;
        canvasState0001 = null;
        stringState0283 = null;
        stringState0284 = null;
        if (booleanArgument1) {
          rgbSpriteState0024 = (RgbSprite) null;
        }
        stringArrayState0016 = null;
        rgbSpriteState0024 = null;
    }

    final static java.awt.Frame computeFrame0901(int integerArgument1, PlatformService platformServiceArgument2, int integerArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        Object stackObjectLocal2 = null;
        Object stackObjectLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        MixedSupport023[] mixedSupport023ArrayLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        java.awt.Frame frameLocal11 = null;
        int integerLocal12 = 0;
        MixedSupport023[] mixedSupport023ArrayLocal13 = null;
        AsyncTask asyncTaskLocal14 = null;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!platformServiceArgument2.computeBoolean0573(-86)) {
            return null;
          }
          if (integerArgument4 == 0) {
            mixedSupport023ArrayLocal13 = MixedSupport006.computeMixedSupport023Array0071((byte) -109, platformServiceArgument2);
            mixedSupport023ArrayLocal8 = mixedSupport023ArrayLocal13;
            if (mixedSupport023ArrayLocal8 == null) {
              stackObjectLocal2 = null;
              return (java.awt.Frame) (stackObjectLocal2);
            }
            integerLocal10 = 0;
            for (integerLocal1 = 0; integerLocal1 < mixedSupport023ArrayLocal13.length; integerLocal1++) {
              if (integerArgument3 == mixedSupport023ArrayLocal13[integerLocal1].integerState0127 &&
                integerArgument1 == mixedSupport023ArrayLocal13[integerLocal1].integerState0126 && ((integerArgument6 == 0 ||
                mixedSupport023ArrayLocal13[integerLocal1].integerState0129 == integerArgument6) &&
                (integerLocal10 == 0 ||
                !(mixedSupport023ArrayLocal13[integerLocal1].integerState0128 <= integerArgument4)))) {
                integerLocal10 = 1;
                integerArgument4 = mixedSupport023ArrayLocal13[integerLocal1].integerState0128;
              }
            }
            if (integerLocal10 == 0) {
              return null;
            }
          }
          if (booleanArgument5) {
            booleanState0087 = true;
          }
          asyncTaskLocal14 = platformServiceArgument2.computeAsyncTask0562((byte) 107, integerArgument1, integerArgument4, integerArgument3, integerArgument6);
          while (0 == asyncTaskLocal14.integerState0510) {
            MixedSupport132.performAction1837(10L, -128);
          }
          frameLocal11 = (java.awt.Frame) (asyncTaskLocal14.objectState0004);
          if (frameLocal11 == null) {
            return null;
          }
          if (asyncTaskLocal14.integerState0510 != 2) {
            return frameLocal11;
          }
          UiComponentPart033.performAction2050(true, frameLocal11, platformServiceArgument2);
          stackObjectLocal3 = null;
          return (java.awt.Frame) (stackObjectLocal3);
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal7 = caughtParameterLocal15;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("jh.D(").append(integerArgument1).append(',');
          if (platformServiceArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(booleanArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static void performAction0900(byte byteArgument1, BitmapFont bitmapFontArgument2, ResourceArchive resourceArchiveArgument3) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        MixedSupport003 mixedSupport003Local10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        Throwable throwableLocal14 = null;
        Throwable throwableLocal15 = null;
        BitmapFont bitmapFontLocal16 = null;
        int[] integerArrayLocal17 = null;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal8 = RenderingSupport007.integerState0360;
          MixedSupport059.sceneWidgetState0055 = new SceneWidget(0L, (SceneWidget) null);
          if (resourceArchiveArgument3 == null) {
            throwableLocal14 = (Throwable) null;
            NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "QC1");
            return;
          }
          resourceArchiveArgument3.booleanState0088 = false;
          resourceArchiveArgument3.integerState0350 = 0;
          ReturnedShapeCache.mixedSupport032State0001 = new MixedSupport032(integerLocal8, resourceArchiveArgument3, resourceArchiveArgument3);
          UiComponentPart033.networkSupport012State0001 = new NetworkSupport012(integerLocal8, resourceArchiveArgument3, resourceArchiveArgument3, new MixedSupport045());
          mixedSupport003Local10 = MixedSupport026.computeMixedSupport0030421((byte) 124);
          if (mixedSupport003Local10 == null) {
            throwableLocal15 = (Throwable) null;
            NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "QC2");
            return;
          }
          MixedSupport066.performAction0867(mixedSupport003Local10, -1);
          bitmapFontLocal16 = (BitmapFont) null;
          MixedSupport040.sceneWidgetState0031 = MixedSupport150.computeSceneWidget2009(2245737, 1513239, 0, 8947848, 5138823, 1127256, 65793, 65793, 4020342, 1513239, 65793, -24447, (BitmapFont) null);
          MixedSupport113.sceneWidgetState0103 = MixedSupport150.computeSceneWidget2009(0, 0, 16764006, 0, 0, 0, 0, 0, 0, 0, 0, -24447, bitmapFontArgument2);
          ResourceSupport001.sceneWidgetState0001 = MixedSupport150.computeSceneWidget2009(0, 0, 16777215, 0, 0, 0, 0, 0, 0, 0, 0, -24447, bitmapFontArgument2);
          integerLocal11 = SoftwareRaster.integerState0285;
          integerLocal12 = SoftwareRaster.integerState0284;
          integerArrayLocal17 = SoftwareRaster.integerArrayState0063;
          NetworkArchiveRequestManager.rgbSpriteState0044 = new RgbSprite(10, 14);
          NetworkArchiveRequestManager.rgbSpriteState0044.performAction0278();
          for (integerLocal1 = 2; integerLocal1 < 7; integerLocal1++) {
            SoftwareRaster.performAction0744(integerLocal1, integerLocal1 + 1, 14 - (integerLocal1 << 1), 16777215);
          }
          SoftwareRaster.performAction0724(integerArrayLocal17, integerLocal11, integerLocal12);
          GameplayControls.sceneWidgetPart005State0003 = MixedSupport083.computeSceneWidgetPart0051127(ResourceSupport001.sceneWidgetState0001, MixedSupport113.sceneWidgetState0103, mixedSupport003Local10, MixedSupport040.sceneWidgetState0031, 0);
          if (byteArgument1 <= 61) {
            return;
          }
          MixedSupport059.sceneWidgetState0055.nodeDequeState0034 = new NodeDeque();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal7 = caughtParameterLocal18;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal9;
          stackStringBuilderLocal3 = new StringBuilder().append("jh.C(").append(byteArgument1).append(',');
          if (bitmapFontArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static int computeInteger0903(int[] integerArrayArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int[] integerArrayLocal5 = null;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = 0;
          for (integerLocal1 = 0; integerArrayArgument1.length > integerLocal1; integerLocal1++) {
            integerLocal2 = integerLocal2 + MixedSupport051.computeInteger0667(integerArrayArgument1[integerLocal1], -127);
          }
          if (integerArgument2 < 94) {
            integerArrayLocal5 = (int[]) null;
            GameDomainSupport004.computeInteger0903((int[]) null, 120);
          }
          stackIntegerLocal6 = integerLocal2;
          return stackIntegerLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal3 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal3;
          stackStringBuilderLocal8 = new StringBuilder().append("jh.B(");
          if (integerArrayArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(')').toString());
        }
    }

    static {
        stringArrayState0016 = new String[]{"Form a Deko and a Bloko at precisely the same time", "Eliminate a wildcard as part of 2 shapes at the same time", "Eliminate a wildcard as part of 3 shapes at the same time", "Eliminate a wildcard as part of 7 shapes at the same time", "Double-eliminate a solid shape by completing 2 touching loose shapes at the same time", "Triple-eliminate a solid shape by completing 3 touching loose shapes at the same time", "Set off a chain of 5 explosions", "Set off a chain of 10 explosions", "Make a solid shape as tall as the bucket", "Bombard your victim with 100 shapes in one go in a multiplayer game", "Completely clear a quarter-full bucket in a Rated game", "Have over 30 shapes in your machine in a Rated game", "Unlock the Flowers theme in the Master Challenge (Theme 5)", "Unlock the City theme in the Master Challenge (Theme 7)", "Unlock the Eight-bit theme in the Master Challenge (Theme 8)", "Get at least 50,000 points in the Master Challenge", "Get at least 100,000 points in the Master Challenge", "Get at least 200,000 points in the Master Challenge", "Win a Rated game", "Win 3 Rated games in a row, in one session", "Win 5 Rated games in a row, in one session, starting with a Rating of at least 1500", "Win an 8-player Rated game", "Win an 8-player Rated game, defeating all opponents yourself", "Earn 50,000 points within the first two levels of the Master Challenge", "Win a Rated game without the glass breaking at all", "Defeat a FunOrb Moderator or someone who has this Achievement", "Send 500 shapes to other players in Rated games", "Send 1,000 shapes to other players in Rated games", "Send 2,500 shapes to other players in Rated games", "Send 5,000 shapes to other players in Rated games", "Send 10,000 shapes to other players in Rated games"};
        stringState0285 = "Log in";
        stringState0283 = "Accept <%0> into this game";
        stringState0284 = "No";
        booleanState0087 = false;
        integerState0349 = 0;
    }
}
