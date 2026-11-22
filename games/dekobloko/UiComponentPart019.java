/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart019 extends UiComponentPart020 implements CallbackContract019 {
    static String stringState0348;
    static String stringState0349;
    static int integerState0504;
    private InteractiveComponent interactiveComponentState0011;
    private UiComponentPart024 uiComponentPart024State0001;
    static MixedSupport113 mixedSupport113State0001;
    static RgbSprite rgbSpriteState0035;
    static int integerState0505;
    static String stringState0350;

    final void performAction0218(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 < 38) {
            stringState0349 = (String) null;
          }
          super.performAction0218(uiComponentArgument1, 98, integerArgument3, integerArgument4);
          this.interactiveComponentState0011.booleanState0035 = this.uiComponentPart024State0001.computeCallbackContract0110824(-128).computeValidationStatus0084(20350) == MixedSupport023.validationStatusState0001 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "mf.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    public final void performAction0313(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        if (byteArgument1 != 67) {
          integerState0505 = -124;
        }
        if (this.uiComponentPart024State0001.computeCallbackContract0110824(-101).computeValidationStatus0084(byteArgument1 ^ 20285) != MixedSupport023.validationStatusState0001) {
          return;
        }
        try {
          MixedSupport069.performAction0902(-31, this.uiComponentPart024State0001.computeInteger1280(-22079), this.uiComponentPart024State0001.computeInteger1279((byte) 48), this.uiComponentPart024State0001.computeInteger1278(false));
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "mf.H(" + byteArgument1 + ',' + integerArgument2 + ',' + (interactiveComponentArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final static void performAction1045(int integerArgument1, int integerArgument2, int integerArgument3, java.awt.Canvas canvasArgument4) {
        java.awt.Graphics graphicsLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        Throwable caughtExceptionLocal5 = null;
        Exception exceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        try {
          try {
            graphicsLocal1 = canvasArgument4.getGraphics();
            MixedSupport076.framebufferState0001.performAction0421((byte) 54, graphicsLocal1, integerArgument2, integerArgument3);
            graphicsLocal1.dispose();
            if (integerArgument1 != 1) {
              stringState0349 = (String) null;
            }
          } catch (java.lang.Exception caughtParameterLocal8) {
            caughtExceptionLocal5 = caughtParameterLocal8;
            exceptionLocal6 = (Exception) (Object) caughtExceptionLocal5;
            canvasArgument4.repaint();
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("mf.G(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (canvasArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static void performAction1048(int integerArgument1) {
        GameplayControls.integerState0859 = SoftwareRaster.integerState0284;
        UiComponentPart033.integerState0934 = SoftwareRaster.integerState0285;
        UiComponentPart022.performAction1206((byte) 115);
        MixedSupport023.mixedSupport006State0001.performAction0066(UiComponentPart011.sceneWidgetState0035.integerState0915 - 42, UiComponentPart011.sceneWidgetState0035.integerState0896, 0, 107, 0);
        MixedSupport044.sceneWidgetState0034.performAction1764(NetworkSupport001.sceneWidgetState0003.integerState0896, 0, 0, ComponentContainer.integerState0377, 0);
        int integerLocal1 = ComponentContainer.integerState0377 + 2;
        RenderingSupport004.sceneWidgetState0039.performAction1764(NetworkSupport001.sceneWidgetState0003.integerState0896, integerArgument1 ^ 5, !MixedSupport097.booleanState0133 ? 0 : integerLocal1, -(!MixedSupport097.booleanState0133 ? 0 : integerLocal1) + NetworkSupport001.sceneWidgetState0003.integerState0915, 0);
        RenderingSupport001.performAction0139((byte) -103);
        IterableNodeCollection.sceneWidgetState0126.performAction1764(UiComponentPart011.sceneWidgetState0035.integerState0896, 0, -40 + UiComponentPart011.sceneWidgetState0035.integerState0915, 40, 0);
        MixedSupport095.sceneWidgetState0095.performAction1764(TextFieldValidator.sceneWidgetState0151.integerState0896, 0, 0, 30, 0);
        MixedSupport077.sceneWidgetState0074.performAction1764(TextFieldValidator.sceneWidgetState0151.integerState0896, integerArgument1 ^ 5, 30, -70 + (TextFieldValidator.sceneWidgetState0151.integerState0915 - 2), 0);
        MixedSupport033.sceneWidgetState0025.performAction1764(68, integerArgument1 ^ 5, 5, 30, 5);
        MixedSupport021.sceneWidgetState0016.performAction1764(78, 0, 5, 30, 75);
        MixedSupport121.sceneWidgetState0118.performAction1764(48, 0, 5, 30, 155);
        UiComponentPart018.sceneWidgetState0079.performAction1764(48, 0, integerArgument1, 30, 205);
        int integerLocal2 = !MixedSupport097.booleanState0133 ? 200 : 250;
        EmailValidationError.sceneWidgetState0058.performAction1764(363 - integerLocal2, integerArgument1 - 5, 5, 30, 5 + integerLocal2);
        SceneWidgetPart001.sceneWidgetState0006.performAction1764(-370 + (TextFieldValidator.sceneWidgetState0151.integerState0896 - 5), 0, 5, 30, 370);
        MixedSupport047.sceneWidgetPart008State0003.performAction1122(6, 37, MixedSupport139.integerState0855, 5, -10 + (MixedSupport077.sceneWidgetState0074.integerState0915 - 32), MixedSupport077.sceneWidgetState0074.integerState0896 - 5 - 5, 2);
        int integerLocal3 = (TextFieldValidator.sceneWidgetState0151.integerState0896 + 2) / 2;
        MixedSupport088.sceneWidgetState0092.performAction1764(integerLocal3 - 2, 0, TextFieldValidator.sceneWidgetState0151.integerState0915 - 40, 40, 0);
        if (!MixedSupport097.booleanState0133) {
          integerLocal3 = 0;
        }
        UiComponentPart029.sceneWidgetState0109.performAction1764(TextFieldValidator.sceneWidgetState0151.integerState0896 - integerLocal3, 0, TextFieldValidator.sceneWidgetState0151.integerState0915 - 40, 40, integerLocal3);
    }

    final static void performAction1046(int integerArgument1, String[] stringArrayArgument2, byte[] byteArrayArgument3, ResourceArchive resourceArchiveArgument4, int integerArgument5, String[][] stringArrayArrayArgument6, RgbSprite[][] rgbSpriteArrayArrayArgument7, int integerArgument8, String[][] stringArrayArrayArgument9, String[] stringArrayArgument10, String[] stringArrayArgument11, RgbSprite[][] rgbSpriteArrayArrayArgument12, int integerArgument13, byte[] byteArrayArgument14, int[] integerArrayArgument15) {
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal1 = null;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal2 = null;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal3 = null;
        int integerLocal4 = 0;
        SceneWidget stackSceneWidgetLocal5;
        SceneWidget stackSceneWidgetLocal6;
        long stackLongLocal7;
        SceneWidget stackSceneWidgetLocal8;
        SceneWidget stackSceneWidgetLocal9 = null;
        SceneWidget stackSceneWidgetLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        StringBuilder stackStringBuilderLocal21 = null;
        String stackStringLocal22 = null;
        StringBuilder stackStringBuilderLocal23 = null;
        String stackStringLocal24 = null;
        StringBuilder stackStringBuilderLocal25 = null;
        String stackStringLocal26 = null;
        StringBuilder stackStringBuilderLocal27 = null;
        String stackStringLocal28 = null;
        StringBuilder stackStringBuilderLocal29 = null;
        String stackStringLocal30 = null;
        StringBuilder stackStringBuilderLocal31 = null;
        String stackStringLocal32 = null;
        StringBuilder stackStringBuilderLocal33 = null;
        String stackStringLocal34 = null;
        RuntimeException caughtExceptionLocal35 = null;
        RuntimeException runtimeExceptionLocal36 = null;
        SceneWidget sceneWidgetLocal37 = null;
        int integerLocal38 = 0;
        SceneWidget sceneWidgetLocal39 = null;
        int integerLocal40 = 0;
        Object objectLocal41 = null;
        Object objectLocal42 = null;
        int integerLocal43 = 0;
        SceneWidget sceneWidgetLocal44 = null;
        SceneWidget sceneWidgetLocal45 = null;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        integerLocal43 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          UiComponentPart022.stringArrayState0026 = stringArrayArgument11;
          ThemeTips.stringArrayState0018 = stringArrayArgument2;
          NetworkSupport004.stringArrayArrayState0002 = stringArrayArrayArgument6;
          SceneWidgetPart004.stringArrayArrayState0003 = stringArrayArrayArgument9;
          MixedSupport099.stringArrayState0029 = stringArrayArgument10;
          MixedSupport053.integerState0272 = integerArgument1;
          MixedSupport111.rgbSpriteArrayArrayState0011 = rgbSpriteArrayArrayArgument7;
          MixedSupport022.byteArrayState0005 = byteArrayArgument14;
          SceneWidgetPart007.integerState0506 = integerArgument8;
          DualNode.rgbSpriteArrayArrayState0003 = rgbSpriteArrayArrayArgument12;
          Js5ArchiveManager.byteArrayState0017 = byteArrayArgument3;
          UiComponentPart002.integerArrayState0014 = integerArrayArgument15;
          MixedSupport040.rgbSpriteArrayState0011 = MixedSupport011.computeRgbSpriteArray0154(112, resourceArchiveArgument4, "lobby", "gameprivacy");
          NodeHashTable.rgbSpriteArrayState0026 = MixedSupport011.computeRgbSpriteArray0154(112, resourceArchiveArgument4, "lobby", "ratedgame");
          DekoBlokoClient.rgbSpriteArrayState0006 = MixedSupport011.computeRgbSpriteArray0154(112, resourceArchiveArgument4, "lobby", "opentome");
          GameDomainSupport001.rgbSpriteArrayState0002 = MixedSupport011.computeRgbSpriteArray0154(112, resourceArchiveArgument4, "lobby", "allowspectators");
          MixedSupport029.stringArrayState0011 = new String[5];
          MixedSupport029.stringArrayState0011[2] = MixedSupport093.stringState0390;
          MixedSupport029.stringArrayState0011[3] = MixedSupport053.stringState0223;
          MixedSupport029.stringArrayState0011[4] = MixedSupport062.stringState0262;
          MixedSupport029.stringArrayState0011[1] = MixedSupport131.stringState0569;
          MixedSupport029.stringArrayState0011[0] = PlatformSupport002.stringState0124;
          RenderingSupport004.sceneWidgetState0039 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport048.sceneWidgetState0041 = new SceneWidget(0L, MixedSupport039.sceneWidgetState0029, MixedSupport014.stringState0069);
          MixedSupport072.sceneWidgetState0071 = new SceneWidget(0L, NetworkSupport003.sceneWidgetState0018, MixedSupport006.stringState0031);
          GameDomainSupport002.sceneWidgetPart008State0002 = new SceneWidgetPart008(0L, new SceneWidget(0L, (SceneWidget) null), MixedSupport047.sceneWidgetState0038, MixedSupport123.sceneWidgetPart006State0002);
          RenderingSupport004.sceneWidgetState0039.performAction1768(MixedSupport048.sceneWidgetState0041, -16834);
          if (MixedSupport097.booleanState0133) {
            RenderingSupport004.sceneWidgetState0039.performAction1768(MixedSupport072.sceneWidgetState0071, integerArgument5 - 7940);
          }
          RenderingSupport004.sceneWidgetState0039.performAction1768(GameDomainSupport002.sceneWidgetPart008State0002, -16834);
          GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.performAction1766(-122, MixedSupport125.sceneWidgetState0125);
          sceneWidgetLocal44 = GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089;
          sceneWidgetLocal45 = sceneWidgetLocal44;
          GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.integerState0885 = 1;
          sceneWidgetLocal45.integerState0916 = 1;
          MixedSupport044.sceneWidgetState0034 = new SceneWidget(0L, MixedSupport125.sceneWidgetState0125);
          MixedSupport044.sceneWidgetState0034.integerState0916 = 1;
          IterableNodeCollection.sceneWidgetState0126 = new SceneWidget(0L, MixedSupport053.sceneWidgetState0047, MixedSupport096.stringState0411.toUpperCase());
          MixedSupport095.sceneWidgetState0095 = new SceneWidget(0L, TranslatedUiText.sceneWidgetState0086, RenderingSupport006.stringState0267.toUpperCase());
          MixedSupport077.sceneWidgetState0074 = new SceneWidget(0L, RenderingSupport001.sceneWidgetState0005);
          MixedSupport033.sceneWidgetState0025 = new SceneWidget(0L, MixedSupport039.sceneWidgetState0029, MixedSupport077.stringState0333);
          MixedSupport021.sceneWidgetState0016 = new SceneWidget(0L, UiComponentPart003.sceneWidgetState0008, TranslatedUiText.stringState0352);
          MixedSupport121.sceneWidgetState0118 = new SceneWidget(0L, UiComponentPart003.sceneWidgetState0008, ResourceSupport002.stringState0038);
          UiComponentPart018.sceneWidgetState0079 = new SceneWidget(0L, UiComponentPart003.sceneWidgetState0008, DualNode.stringState0044);
          EmailValidationError.sceneWidgetState0058 = new SceneWidget(0L, UiComponentPart003.sceneWidgetState0008, UiComponentPart012.stringState0206);
          SceneWidgetPart001.sceneWidgetState0006 = new SceneWidget(0L, NetworkSupport003.sceneWidgetState0018, SceneWidgetPart001.stringState0057);
          MixedSupport047.sceneWidgetPart008State0003 = new SceneWidgetPart008(0L, new SceneWidget(0L, (SceneWidget) null), MixedSupport047.sceneWidgetState0038, MixedSupport123.sceneWidgetPart006State0002);
          MixedSupport088.sceneWidgetState0092 = new SceneWidget(0L, MixedSupport021.sceneWidgetState0015, RenderingSupport012.stringState0442.toUpperCase());
          MixedSupport088.sceneWidgetState0092.booleanState0212 = MixedSupport097.booleanState0133;
          stackSceneWidgetLocal5 = null;
          stackSceneWidgetLocal6 = null;
          stackLongLocal7 = 0L;
          stackSceneWidgetLocal8 = MixedSupport021.sceneWidgetState0015;
          if (MixedSupport097.booleanState0133) {
            stackSceneWidgetLocal9 = null;
            stackSceneWidgetLocal10 = null;
            stackStringLocal11 = MixedSupport095.stringState0398;
          } else {
            stackSceneWidgetLocal9 = null;
            stackSceneWidgetLocal10 = null;
            stackStringLocal11 = NetworkSupport011.stringState0430;
          }
          UiComponentPart029.sceneWidgetState0109 = new SceneWidget(stackLongLocal7, stackSceneWidgetLocal8, ((String) (Object) stackStringLocal11).toUpperCase());
          TextFieldValidator.sceneWidgetState0151 = new SceneWidget(0L, (SceneWidget) null);
          TextFieldValidator.sceneWidgetState0151.performAction1768(MixedSupport095.sceneWidgetState0095, -16834);
          TextFieldValidator.sceneWidgetState0151.performAction1768(MixedSupport077.sceneWidgetState0074, -16834);
          MixedSupport077.sceneWidgetState0074.performAction1768(MixedSupport033.sceneWidgetState0025, -16834);
          MixedSupport077.sceneWidgetState0074.performAction1768(MixedSupport021.sceneWidgetState0016, -16834);
          MixedSupport077.sceneWidgetState0074.performAction1768(MixedSupport121.sceneWidgetState0118, -16834);
          if (MixedSupport097.booleanState0133) {
            MixedSupport077.sceneWidgetState0074.performAction1768(UiComponentPart018.sceneWidgetState0079, -16834);
          }
          MixedSupport077.sceneWidgetState0074.performAction1768(EmailValidationError.sceneWidgetState0058, -16834);
          MixedSupport077.sceneWidgetState0074.performAction1768(SceneWidgetPart001.sceneWidgetState0006, -16834);
          MixedSupport077.sceneWidgetState0074.performAction1768(MixedSupport047.sceneWidgetPart008State0003, integerArgument5 - 7940);
          if (MixedSupport097.booleanState0133) {
            TextFieldValidator.sceneWidgetState0151.performAction1768(MixedSupport088.sceneWidgetState0092, -16834);
          }
          TextFieldValidator.sceneWidgetState0151.performAction1768(UiComponentPart029.sceneWidgetState0109, -16834);
          MixedSupport033.sceneWidgetState0024 = new SceneWidget(0L, MixedSupport125.sceneWidgetState0125);
          MixedSupport033.sceneWidgetState0024.integerState0885 = 0;
          MixedSupport033.sceneWidgetState0024.integerState0916 = 1;
          UiComponent.sceneWidgetState0009 = new SceneWidget(0L, MixedSupport072.sceneWidgetState0072, MixedSupport050.stringState0208.toUpperCase());
          SceneWidgetPart011.sceneWidgetState0115 = new SceneWidget(0L, MusicTrack.sceneWidgetState0127);
          SceneWidgetPart011.sceneWidgetState0115.performAction1768(MixedSupport033.sceneWidgetState0024, -16834);
          SceneWidgetPart011.sceneWidgetState0115.performAction1768(UiComponent.sceneWidgetState0009, -16834);
          MixedSupport020.sceneWidgetState0012 = new SceneWidget(0L, MixedSupport047.sceneWidgetState0038);
          MixedSupport020.sceneWidgetState0012.performAction1766(-128, MixedSupport125.sceneWidgetState0125);
          MixedSupport020.sceneWidgetState0012.integerState0885 = 1;
          sceneWidgetLocal37 = MixedSupport020.sceneWidgetState0012;
          sceneWidgetLocal37.integerState0916 = 1;
          RenderingSupport006.sceneWidgetState0056 = new SceneWidget(0L, (SceneWidget) null);
          if (integerArgument5 != -8894) {
            return;
          }
          UiComponentPart013.sceneWidgetState0048 = new SceneWidget(0L, MixedSupport125.sceneWidgetState0125);
          UiComponentPart013.sceneWidgetState0048.integerState0916 = 1;
          MixedSupport071.sceneWidgetState0070 = new SceneWidget(0L, MixedSupport039.sceneWidgetState0029, MixedSupport014.stringState0069);
          RichTextLayout.sceneWidgetState0020 = new SceneWidget(0L, NetworkSupport003.sceneWidgetState0018, MixedSupport006.stringState0031);
          ValidationStatus.sceneWidgetPart008State0006 = new SceneWidgetPart008(0L, new SceneWidget(0L, (SceneWidget) null), MixedSupport047.sceneWidgetState0038, MixedSupport123.sceneWidgetPart006State0002);
          RenderingSupport006.sceneWidgetState0056.performAction1768(UiComponentPart013.sceneWidgetState0048, -16834);
          RenderingSupport006.sceneWidgetState0056.performAction1768(MixedSupport071.sceneWidgetState0070, -16834);
          if (MixedSupport097.booleanState0133) {
            RenderingSupport006.sceneWidgetState0056.performAction1768(RichTextLayout.sceneWidgetState0020, integerArgument5 ^ 25468);
          }
          RenderingSupport006.sceneWidgetState0056.performAction1768(ValidationStatus.sceneWidgetPart008State0006, integerArgument5 ^ 25468);
          ComponentDecorator.sceneWidgetState0078 = new SceneWidget(0L, MixedSupport053.sceneWidgetState0047, MixedSupport093.stringState0389.toUpperCase());
          MixedSupport042.sceneWidgetState0033 = new SceneWidget(0L, TranslatedUiText.sceneWidgetState0086);
          MixedSupport106.sceneWidgetState0102 = new SceneWidget(0L, RenderingSupport001.sceneWidgetState0005);
          MixedSupport077.sceneWidgetState0075 = new SceneWidget(0L, MixedSupport057.sceneWidgetState0051, SceneWidgetPart001.stringState0056.toUpperCase());
          MixedSupport132.sceneWidgetArrayState0008 = new SceneWidget[4 + integerArgument13];
          MixedSupport103.sceneWidgetPart009ArrayArrayState0001 = new SceneWidgetPart009[integerArgument13 + 4][];
          MixedSupport132.sceneWidgetArrayState0008[0] = new SceneWidget(0L, InputAdapter003.sceneWidgetState0110, GameSession.stringState0439);
          MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0] = new SceneWidgetPart009[6];
          for (integerLocal38 = 0; integerLocal38 < 5; integerLocal38++) {
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][integerLocal38 + 1] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, MixedSupport040.rgbSpriteArrayState0011[integerLocal38], MixedSupport029.stringArrayState0011[integerLocal38]);
          }
          if (2 <= UiComponentPart002.integerArrayState0014.length) {
            MixedSupport132.sceneWidgetArrayState0008[1] = new SceneWidget(0L, InputAdapter003.sceneWidgetState0110, SceneWidgetPart004.stringState0215);
            sceneWidgetPart009ArrayLocal1 = new SceneWidgetPart009[1 + UiComponentPart002.integerArrayState0014.length];
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1] = sceneWidgetPart009ArrayLocal1;
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][0] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, MixedSupport053.stringState0220);
            for (integerLocal48 = 0; UiComponentPart002.integerArrayState0014.length > integerLocal48; integerLocal48++) {
              MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][integerLocal48 + 1] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, Integer.toString(UiComponentPart002.integerArrayState0014[integerLocal48]));
            }
          }
          MixedSupport132.sceneWidgetArrayState0008[2] = new SceneWidget(0L, InputAdapter003.sceneWidgetState0110, MixedSupport009.stringState0040);
          MixedSupport103.sceneWidgetPart009ArrayArrayState0001[2] = new SceneWidgetPart009[]{new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, MixedSupport053.stringState0220), new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, GameDomainSupport001.rgbSpriteArrayState0002[0], GameDomainSupport004.stringState0284), new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, GameDomainSupport001.rgbSpriteArrayState0002[1], MixedSupport051.stringState0214)};
          if (SceneWidgetPart007.integerState0506 > 1) {
            MixedSupport132.sceneWidgetArrayState0008[3] = new SceneWidget(0L, InputAdapter003.sceneWidgetState0110, MixedSupport082.stringState0351);
            sceneWidgetPart009ArrayLocal2 = new SceneWidgetPart009[SceneWidgetPart007.integerState0506 + 1];
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[3] = sceneWidgetPart009ArrayLocal2;
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[3][0] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, MixedSupport053.stringState0220);
            for (integerLocal49 = 0; SceneWidgetPart007.integerState0506 > integerLocal49; integerLocal49++) {
              MixedSupport103.sceneWidgetPart009ArrayArrayState0001[3][integerLocal49 + 1] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, MixedSupport099.stringArrayState0029[integerLocal49]);
            }
          }
          for (integerLocal50 = 0; integerArgument13 > integerLocal50; integerLocal50++) {
            MixedSupport132.sceneWidgetArrayState0008[4 + integerLocal50] = new SceneWidget(0L, InputAdapter003.sceneWidgetState0110, UiComponentPart022.stringArrayState0026[integerLocal50]);
            sceneWidgetPart009ArrayLocal3 = new SceneWidgetPart009[MixedSupport075.computeInteger0930((int) MixedSupport022.byteArrayState0005[integerLocal50], 255) + 1];
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[4 + integerLocal50] = sceneWidgetPart009ArrayLocal3;
            MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal50 + 4][0] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) null, MixedSupport053.stringState0220);
            for (integerLocal40 = 0; (MixedSupport022.byteArrayState0005[integerLocal50] & 255) > integerLocal40; integerLocal40++) {
              if (MixedSupport111.rgbSpriteArrayArrayState0011 == null) {
                objectLocal41 = null;
              } else {
                if (null != MixedSupport111.rgbSpriteArrayArrayState0011[integerLocal50]) {
                  objectLocal41 = MixedSupport111.rgbSpriteArrayArrayState0011[integerLocal50][integerLocal40];
                } else {
                  objectLocal41 = null;
                }
              }
              if (null != NetworkSupport004.stringArrayArrayState0002) {
                if (null == NetworkSupport004.stringArrayArrayState0002[integerLocal50]) {
                  objectLocal42 = null;
                } else {
                  objectLocal42 = NetworkSupport004.stringArrayArrayState0002[integerLocal50][integerLocal40];
                }
              } else {
                objectLocal42 = null;
              }
              MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal50 + 4][integerLocal40 + 1] = new SceneWidgetPart009(0L, MixedSupport073.sceneWidgetState0073, (SceneWidget) null, UiComponentPart007.sceneWidgetState0019, (RgbSprite) (objectLocal41), (String) (objectLocal42));
            }
          }
          for (integerLocal51 = 0; integerLocal51 < integerArgument13 + 4; integerLocal51++) {
            if (null != MixedSupport132.sceneWidgetArrayState0008[integerLocal51]) {
              MixedSupport132.sceneWidgetArrayState0008[integerLocal51].integerState0908 = 11;
            }
            if (null != MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal51]) {
              for (integerLocal46 = 0; integerLocal46 < MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal51].length; integerLocal46++) {
                if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal51][integerLocal46] != null &&
                  MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal51][integerLocal46].sceneWidgetState0100 != null) {
                  MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal51][integerLocal46].sceneWidgetState0100.integerState0908 = 11;
                }
              }
            }
          }
          MixedSupport039.sceneWidgetState0030 = new SceneWidget(0L, MixedSupport021.sceneWidgetState0015);
          MixedSupport087.sceneWidgetState0091 = new SceneWidget(0L, MixedSupport021.sceneWidgetState0015);
          MixedSupport121.sceneWidgetState0117 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0028);
          MixedSupport121.sceneWidgetState0117.performAction1766(-112, MixedSupport125.sceneWidgetState0125);
          MixedSupport121.sceneWidgetState0117.integerState0885 = 1;
          sceneWidgetLocal39 = MixedSupport121.sceneWidgetState0117;
          sceneWidgetLocal39.integerState0916 = 1;
          NetworkSupport008.sceneWidgetState0093 = new SceneWidget(0L, (SceneWidget) null);
          NetworkSupport008.sceneWidgetState0093.performAction1768(MixedSupport042.sceneWidgetState0033, -16834);
          NetworkSupport008.sceneWidgetState0093.performAction1768(MixedSupport106.sceneWidgetState0102, -16834);
          MixedSupport106.sceneWidgetState0102.performAction1768(MixedSupport077.sceneWidgetState0075, -16834);
          for (integerLocal47 = 0; integerLocal47 < 4 + integerArgument13; integerLocal47++) {
            if ((integerLocal47 != 1 ||
              !(UiComponentPart002.integerArrayState0014.length < 2)) && (integerLocal47 != 3 ||
              !(SceneWidgetPart007.integerState0506 <= 1))) {
              MixedSupport106.sceneWidgetState0102.performAction1768(MixedSupport132.sceneWidgetArrayState0008[integerLocal47], -16834);
              for (integerLocal4 = 0; integerLocal4 < MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal47].length; integerLocal4++) {
                if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal47][integerLocal4] != null) {
                  MixedSupport106.sceneWidgetState0102.performAction1768(MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal47][integerLocal4], -16834);
                }
              }
            }
          }
          NetworkSupport008.sceneWidgetState0093.performAction1768(MixedSupport039.sceneWidgetState0030, -16834);
          NetworkSupport008.sceneWidgetState0093.performAction1768(MixedSupport087.sceneWidgetState0091, integerArgument5 - 7940);
          NetworkSupport008.sceneWidgetState0093.performAction1768(MixedSupport121.sceneWidgetState0117, -16834);
          MixedSupport059.sceneWidgetState0054 = new SceneWidget(0L, MixedSupport121.sceneWidgetState0119, RichTextLayout.stringState0133.toUpperCase());
          GameSession.sceneWidgetState0099 = new SceneWidget(0L, MixedSupport072.sceneWidgetState0072, MixedSupport067.stringState0299.toUpperCase());
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal52) {
          caughtExceptionLocal35 = caughtParameterLocal52;
          runtimeExceptionLocal36 = caughtExceptionLocal35;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal36;
          stackStringBuilderLocal13 = new StringBuilder().append("mf.D(").append(integerArgument1).append(',');
          if (stringArrayArgument2 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          stackStringBuilderLocal15 = ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          stackStringBuilderLocal17 = ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',').append(integerArgument5).append(',');
          if (stringArrayArrayArgument6 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          stackStringBuilderLocal21 = ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',');
          if (rgbSpriteArrayArrayArgument7 == null) {
            stackStringLocal22 = "null";
          } else {
            stackStringLocal22 = "{...}";
          }
          stackStringBuilderLocal23 = ((StringBuilder) (Object) stackStringBuilderLocal21).append(stackStringLocal22).append(',').append(integerArgument8).append(',');
          if (stringArrayArrayArgument9 == null) {
            stackStringLocal24 = "null";
          } else {
            stackStringLocal24 = "{...}";
          }
          stackStringBuilderLocal25 = ((StringBuilder) (Object) stackStringBuilderLocal23).append(stackStringLocal24).append(',');
          if (stringArrayArgument10 == null) {
            stackStringLocal26 = "null";
          } else {
            stackStringLocal26 = "{...}";
          }
          stackStringBuilderLocal27 = ((StringBuilder) (Object) stackStringBuilderLocal25).append(stackStringLocal26).append(',');
          if (stringArrayArgument11 == null) {
            stackStringLocal28 = "null";
          } else {
            stackStringLocal28 = "{...}";
          }
          stackStringBuilderLocal29 = ((StringBuilder) (Object) stackStringBuilderLocal27).append(stackStringLocal28).append(',');
          if (rgbSpriteArrayArrayArgument12 == null) {
            stackStringLocal30 = "null";
          } else {
            stackStringLocal30 = "{...}";
          }
          stackStringBuilderLocal31 = ((StringBuilder) (Object) stackStringBuilderLocal29).append(stackStringLocal30).append(',').append(integerArgument13).append(',');
          if (byteArrayArgument14 == null) {
            stackStringLocal32 = "null";
          } else {
            stackStringLocal32 = "{...}";
          }
          stackStringBuilderLocal33 = ((StringBuilder) (Object) stackStringBuilderLocal31).append(stackStringLocal32).append(',');
          if (integerArrayArgument15 == null) {
            stackStringLocal34 = "null";
          } else {
            stackStringLocal34 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal33).append(stackStringLocal34).append(')').toString());
        }
    }

    final void performAction1047(int integerArgument1) {
        int integerLocal1 = 250;
        this.uiComponentPart024State0001.performAction0222(25, 140, -integerLocal1 + this.integerState0107 >> 1, this.integerState0108 - 5 >> 1, -16555);
        this.interactiveComponentState0011.performAction0222(30, 100, 10 + (140 + (-integerLocal1 + this.integerState0107 >> 1)), 2 + (20 + (this.integerState0108 - integerArgument1) >> 1), integerArgument1 ^ -16565);
    }

    final static void performAction1044(byte byteArgument1, int integerArgument2) {
        if (byteArgument1 < 80) {
          stringState0348 = (String) null;
        }
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1641(integerArgument2, -4);
        cipherPacketBufferLocal1.writeByte(true, 2);
        cipherPacketBufferLocal1.writeByte(true, 4);
        cipherPacketBufferLocal1.writeByte(true, MixedSupport007.computeInteger0071(112));
    }

    public static void clearStaticReferences(int integerArgument1) {
        rgbSpriteState0035 = null;
        stringState0348 = null;
        stringState0349 = null;
        mixedSupport113State0001 = null;
        stringState0350 = null;
        if (integerArgument1 != -17690) {
          rgbSpriteState0035 = (RgbSprite) null;
        }
    }

    final void performAction0162(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super.performAction0162(integerArgument1, -106, integerArgument3, integerArgument4);
        MixedSupport011.bitmapFontState0006.performAction1069(MixedSupport137.stringState0589, 4 + integerArgument1 + this.integerState0110, 4 + MixedSupport011.bitmapFontState0006.integerState0518 + integerArgument4 + this.integerState0104, 16777215, -1);
        if (integerArgument2 >= -103) {
          InteractiveComponent interactiveComponentLocal1 = (InteractiveComponent) null;
          this.performAction0313((byte) -51, -52, (InteractiveComponent) null, -94, 59);
        }
    }

    UiComponentPart019(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, (CallbackContract004) null);
        this.uiComponentPart024State0001 = new UiComponentPart024(new MixedSupport024(10000536), MixedSupport047.booleanState0057, 0, 0, 140, 25);
        this.uiComponentPart024State0001.performAction1270((byte) 79, new InputAdapter002());
        this.interactiveComponentState0011 = new InteractiveComponent(MixedSupport034.stringState0163, (CallbackContract006) (this));
        this.uiComponentArrayState0001 = new UiComponent[]{(UiComponent) ((Object) this.uiComponentPart024State0001), (UiComponent) ((Object) this.interactiveComponentState0011)};
        this.interactiveComponentState0011.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport041());
        this.performAction0228(119);
    }

    static {
        stringState0349 = "Add name";
        stringState0348 = "Please select options in the following rows:  ";
        rgbSpriteState0035 = new RgbSprite(36, 36);
        stringState0350 = "Achievements";
    }
}
