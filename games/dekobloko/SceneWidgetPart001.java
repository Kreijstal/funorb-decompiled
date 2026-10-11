/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart001 extends SceneWidget {
    static String stringState0056;
    static SceneWidget sceneWidgetState0006;
    private SceneWidget sceneWidgetState0007;
    static String stringState0057;
    static String stringState0058;

    public static void performAction0172(int integerArgument1) {
        if (integerArgument1 != 15338) {
          stringState0056 = (String) null;
        }
        stringState0056 = null;
        stringState0058 = null;
        stringState0057 = null;
        sceneWidgetState0006 = null;
    }

    SceneWidgetPart001(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, SceneWidget sceneWidgetArgument5, SceneWidget sceneWidgetArgument6) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        RuntimeException runtimeExceptionLocal16 = null;
        SceneWidget sceneWidgetLocal17 = null;
        SceneWidget sceneWidgetLocal18 = null;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        SceneWidget sceneWidgetLocal21 = null;
        SceneWidget sceneWidgetLocal22 = null;
        int integerLocal23 = 0;
        SceneWidget sceneWidgetLocal24 = null;
        int integerLocal25;
        try {
          sceneWidgetLocal24 = new SceneWidget(0L, sceneWidgetArgument2, UiComponentPart012.stringState0207.toUpperCase());
          sceneWidgetLocal24.integerState0916 = 1;
          this.sceneWidgetState0007 = new SceneWidget(0L, sceneWidgetArgument3);
          sceneWidgetLocal17 = new SceneWidget(0L, sceneWidgetArgument4);
          sceneWidgetLocal18 = new SceneWidget(0L, sceneWidgetArgument4, MixedSupport023.stringState0104);
          sceneWidgetLocal18.integerState0916 = 1;
          integerLocal19 = 50;
          integerLocal20 = 0;
          for (integerLocal1 = 0; integerLocal1 < PlatformSupport002.stringArrayState0007.length; integerLocal1++) {
            sceneWidgetLocal21 = new SceneWidget(0L, sceneWidgetArgument4, CipherPacketBuffer.stringArrayState0049[integerLocal1]);
            sceneWidgetLocal22 = new SceneWidget(0L, sceneWidgetArgument4, PlatformSupport002.stringArrayState0007[integerLocal1]);
            integerLocal23 = sceneWidgetArgument4.bitmapFontState0020.computeInteger1208(PlatformSupport002.stringArrayState0007[integerLocal1]);
            if (integerLocal23 > integerLocal20) {
              integerLocal20 = integerLocal23;
            }
            sceneWidgetLocal21.performAction1994(65, 0, integerLocal19, 15, 20);
            sceneWidgetLocal22.performAction1994(640, 0, integerLocal19, 15, 90);
            sceneWidgetLocal17.performAction1998(sceneWidgetLocal21, -16834);
            sceneWidgetLocal17.performAction1998(sceneWidgetLocal22, -16834);
            integerLocal19 += 30;
          }
          sceneWidgetLocal24.performAction1994(20 + integerLocal20 + 90, 0, 0, 24, 0);
          integerLocal19 += 15;
          this.performAction1994(sceneWidgetLocal24.integerState0896, 0, 100, integerLocal19 + sceneWidgetLocal24.integerState0915, 100);
          this.sceneWidgetState0007.performAction1994(15, 0, 5, 15, sceneWidgetLocal24.integerState0896 - 20);
          sceneWidgetLocal17.performAction1994(this.integerState0896, 0, sceneWidgetLocal24.integerState0915, this.integerState0915 - sceneWidgetLocal24.integerState0915, 0);
          sceneWidgetLocal18.performAction1994(this.integerState0896, 0, 20, 15, 0);
          sceneWidgetLocal17.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(2105376, -20982, 3, sceneWidgetLocal17.integerState0915, 8421504, 11579568);
          sceneWidgetLocal24.performAction1998(this.sceneWidgetState0007, -16834);
          sceneWidgetLocal17.performAction1998(sceneWidgetLocal18, -16834);
          this.performAction1998(sceneWidgetLocal24, -16834);
          this.performAction1998(sceneWidgetLocal17, -16834);
          this.integerState0890 = -(this.integerState0896 >> 1) + 320;
          integerLocal25 = -(this.integerState0915 >> 1) + 240;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal26) {
          caughtExceptionLocal15 = caughtParameterLocal26;
          runtimeExceptionLocal16 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal16;
          stackStringBuilderLocal3 = new StringBuilder().append("bk.<init>(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (sceneWidgetArgument5 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',');
          if (sceneWidgetArgument6 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(')').toString());
        }
    }

    final boolean computeBoolean0171(int integerArgument1, boolean booleanArgument2) {
        NodeDeque nodeDequeLocal1;
        boolean stackBooleanLocal2 = false;
        if (integerArgument1 != -1) {
          nodeDequeLocal1 = (NodeDeque) null;
          SceneWidgetPart001.performAction0170((byte) 4, 96, (NodeDeque) null);
        }
        boolean frameRemainderLocal3 = true;
        this.performAction2002(false, true);
        if ((SceneWidgetPart005.integerState0328 == 0 ||
          this.integerState0891 != 0) && this.sceneWidgetState0007.integerState0891 == 0) {
          stackBooleanLocal2 = false;
          frameRemainderLocal3 = false;
        }
        else {
          stackBooleanLocal2 = true;
        }
        return stackBooleanLocal2;
    }

    final static void performAction0170(byte byteArgument1, int integerArgument2, NodeDeque nodeDequeArgument3) {
        int integerLocal1 = 0;
        AnimatedTileRegion animatedTileRegionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != -93) {
            SceneWidgetPart001.performAction0172(40);
          }
          animatedTileRegionLocal2 = (AnimatedTileRegion) (nodeDequeArgument3.computeHashNode1970((byte) -119));
          while (animatedTileRegionLocal2 != null) {
            animatedTileRegionLocal2.performAction1889(11976, integerArgument2);
            animatedTileRegionLocal2 = (AnimatedTileRegion) (nodeDequeArgument3.computeHashNode1974(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("bk.C(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (nodeDequeArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    static {
        stringState0056 = "Game options";
        stringState0057 = "Elapsed time";
        stringState0058 = "Waiting for extra data";
    }
}
