/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart005 extends SceneWidget {
    private int integerState0321;
    private int integerState0322;
    static RawSound rawSoundState0012;
    private int integerState0323;
    private int integerState0324;
    private int[] integerArrayState0101;
    private SceneWidgetPart009[] sceneWidgetPart009ArrayState0002;
    private int integerState0325;
    private int integerState0326;
    private char[] characterArrayState0005;
    static String stringState0253;
    static String stringState0254;
    private int integerState0327;
    private SceneWidgetPart005[] sceneWidgetPart005ArrayState0001;
    static int integerState0328;
    private int integerState0329;
    static int integerState0330;
    static MixedSupport091[] mixedSupport091ArrayState0001;
    private SceneWidgetPart005 sceneWidgetPart005State0001;
    static String stringState0255;

    private final void performAction0799(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        String stringLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = 2 % ((integerArgument3 - 61) / 40);
        if (integerArgument2 != this.integerState0329) {
          if (this.sceneWidgetPart005ArrayState0001[integerArgument2] != null) {
            this.performAction0804(0);
            this.performAction0801((byte) 67, 0);
            this.integerState0329 = integerArgument2;
            this.sceneWidgetPart005State0001 = this.sceneWidgetPart005ArrayState0001[this.integerState0329];
            MixedSupport149.performAction1987(107, this.sceneWidgetPart005State0001);
            this.sceneWidgetPart005State0001.performAction0801((byte) 67, 12);
          } else {
            if (this.integerArrayState0101[integerArgument2] != -1) {
              integerLocal2 = this.integerArrayState0101[integerArgument2] | 32768;
              integerLocal3 = NetworkSupport010.integerState0585;
              if (integerLocal3 == 0 &&
                null != MixedSupport016.sceneWidgetPart013State0001) {
                integerLocal3 = 1;
              }
              if (ReturnedShape.computeInteger1622(0, integerLocal3) == 2) {
                MixedSupport031.performAction0461(integerLocal3, integerArgument1, 1, (byte) 123);
              }
              stringLocal5 = (String) null;
              UiComponent.performAction0227(integerArgument4, (byte) -85, NetworkSupport010.integerState0585, MixedSupport029.stringState0149, integerLocal2, (String) null);
              MixedSupport112.performAction1595(MixedSupport043.longState0017, MixedSupport029.stringState0149, -94, NetworkSupport010.integerState0585, integerLocal2);
              MixedSupport104.performAction1409(false);
              MixedSupport051.performAction0664((byte) 11);
            } else {
              MixedSupport015.performAction0218(8);
              MixedSupport104.performAction1409(false);
            }
          }
        } else {
          this.performAction0804(0);
          this.performAction0801((byte) 67, 0);
        }
    }

    final boolean computeBoolean0802(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int stackIntegerLocal5 = 0;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        stackIntegerLocal5 = (MixedSupport153.integerState0931 != 85) ? 0 : 1;
        integerLocal2 = stackIntegerLocal5;
        if (null != this.sceneWidgetPart005State0001) {
          if (integerLocal2 != 0 &&
            this.sceneWidgetPart005State0001.integerState0329 == -1) {
            this.performAction0804(integerArgument2 - 15028);
            this.performAction0801((byte) 67, 0);
            return true;
          }
          return this.sceneWidgetPart005State0001.computeBoolean0802(integerArgument1, integerArgument2 ^ 0, integerArgument3);
        }
        if (this.sceneWidgetPart005State0001 == null &&
          this == SceneWidgetPart007.sceneWidgetPart005State0002 &&
          integerLocal2 != 0) {
          MixedSupport104.performAction1409(false);
          return true;
        }
        if (integerArgument2 != 15028) {
          return true;
        }
        integerLocal3 = ArchiveRequestManager.characterState0002;
        if (integerLocal3 > 0) {
          if (MixedSupport002.characterState0001 == integerLocal3) {
            integerLocal3 = 63;
          }
          for (integerLocal1 = 0; this.characterArrayState0005.length > integerLocal1; integerLocal1++) {
            if (this.characterArrayState0005[integerLocal1] == integerLocal3) {
              this.performAction0799(integerArgument1, integerLocal1, 107, integerArgument3);
              return true;
            }
          }
        }
        return false;
    }

    final int computeInteger0807(int integerArgument1) {
        if (integerArgument1 > -87) {
          mixedSupport091ArrayState0001 = (MixedSupport091[]) null;
        }
        return this.integerState0323 + (null != this.sceneWidgetPart005State0001 ? this.sceneWidgetPart005State0001.computeInteger0807(-119) : 0);
    }

    private final void performAction0801(byte byteArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.integerState0324 = integerArgument2;
        if (byteArgument1 != 67) {
          this.characterArrayState0005 = (char[]) null;
        }
        for (integerLocal1 = 0; this.integerState0325 > integerLocal1; integerLocal1++) {
          integerLocal2 = this.integerState0324 * this.integerState0324;
          integerLocal3 = integerLocal1 * this.integerState0322;
          this.sceneWidgetPart009ArrayState0002[integerLocal1].integerState0903 = (integerLocal3 * (-integerLocal2 + 144) + (this.integerState0327 - this.integerState0886) * integerLocal2) / 144;
        }
    }

    final void performAction0797(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        SceneWidgetPart009 sceneWidgetPart009Local2;
        int integerLocal3;
        SceneWidgetPart009 stackSceneWidgetPart009Local4 = null;
        boolean stackBooleanLocal5 = false;
        SceneWidgetPart005 sceneWidgetPart005Local6;
        SceneWidgetPart005 sceneWidgetPart005Local7;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument3 > -97) {
          stringState0255 = (String) null;
        }
        for (integerLocal1 = 0; integerLocal1 < this.sceneWidgetPart009ArrayState0002.length; integerLocal1++) {
          sceneWidgetPart009Local2 = this.sceneWidgetPart009ArrayState0002[integerLocal1];
          if (sceneWidgetPart009Local2.integerState0891 == 1) {
            this.performAction0799(integerArgument2, integerLocal1, -90, integerArgument1);
            stackSceneWidgetPart009Local4 = sceneWidgetPart009Local2;
            stackBooleanLocal5 = (integerLocal1 == this.integerState0329);
            stackSceneWidgetPart009Local4.booleanState0217 = stackBooleanLocal5;
          }
        }
        if (this.integerState0329 != -1) {
          sceneWidgetPart005Local7 = this.sceneWidgetPart005ArrayState0001[this.integerState0329];
          sceneWidgetPart005Local6 = sceneWidgetPart005Local7;
          if (sceneWidgetPart005Local6 != null) {
            sceneWidgetPart005Local7.performAction0797(integerArgument1, integerArgument2, -99);
          }
        }
        if (this.integerState0324 > 0) {
          this.performAction0801((byte) 67, this.integerState0324 - 1);
        }
    }

    final void performAction0800(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, byte byteArgument5, int integerArgument6) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.integerState0323 = this.integerState0321 + integerArgument1 * 2;
        this.performAction1994(this.integerState0323, 0, -this.integerState0326 + integerArgument3, this.integerState0326, integerArgument2);
        if (byteArgument5 != -18) {
          this.integerState0326 = 30;
        }
        if (integerArgument6 != this.integerState0327) {
          this.integerState0327 = integerArgument6;
          this.performAction0801((byte) 67, this.integerState0324);
        }
        for (integerLocal1 = 0; this.integerState0325 > integerLocal1; integerLocal1++) {
          this.sceneWidgetPart009ArrayState0002[integerLocal1].performAction1515(this.integerState0322, integerArgument1, 0, this.sceneWidgetPart009ArrayState0002[integerLocal1].integerState0903, this.integerState0323, integerArgument4, 500);
        }
        if (this.integerState0329 != -1 &&
          null != this.sceneWidgetPart005ArrayState0001[this.integerState0329]) {
          integerLocal4 = this.sceneWidgetPart005ArrayState0001[this.integerState0329].integerState0325;
          for (integerLocal2 = (integerLocal4 + this.integerState0329) * this.integerState0322 + this.integerState0903; integerArgument3 < integerLocal2; integerLocal2 = integerLocal2 - this.integerState0322) {
          }
          this.sceneWidgetPart005ArrayState0001[this.integerState0329].performAction0800(integerArgument1, this.integerState0323 + integerArgument2, integerLocal2, integerArgument4, (byte) -18, this.sceneWidgetPart009ArrayState0002[this.integerState0329].integerState0886);
        }
    }

    final boolean computeBoolean0805(int integerArgument1) {
        int integerLocal1 = 0;
        SceneWidgetPart009 sceneWidgetPart009Local2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != -1) {
          return false;
        }
        int integerLocal4 = 0;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal5 = this.sceneWidgetPart009ArrayState0002;
        for (integerLocal1 = 0; sceneWidgetPart009ArrayLocal5.length > integerLocal1; integerLocal1++) {
          sceneWidgetPart009Local2 = sceneWidgetPart009ArrayLocal5[integerLocal1];
          integerLocal4 = integerLocal4 | (0 != sceneWidgetPart009Local2.integerState0891 ? 1 : 0);
        }
        if (integerLocal4 == 0 && -1 != this.integerState0329 &&
          this.sceneWidgetPart005ArrayState0001[this.integerState0329] != null) {
          integerLocal4 = this.sceneWidgetPart005ArrayState0001[this.integerState0329].computeBoolean0805(-1) ? 1 : 0;
        }
        return integerLocal4 != 0;
    }

    final void performAction0804(int integerArgument1) {
        int integerLocal1 = 0;
        SceneWidgetPart009 sceneWidgetPart009Local2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal4 = this.sceneWidgetPart009ArrayState0002;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal5 = sceneWidgetPart009ArrayLocal4;
        for (integerLocal1 = integerArgument1; integerLocal1 < sceneWidgetPart009ArrayLocal4.length; integerLocal1++) {
          sceneWidgetPart009Local2 = sceneWidgetPart009ArrayLocal4[integerLocal1];
          sceneWidgetPart009Local2.booleanState0217 = false;
          sceneWidgetPart009Local2.integerState0891 = 0;
        }
        if (null != this.sceneWidgetPart005State0001) {
          this.sceneWidgetPart005State0001.performAction0804(0);
          this.sceneWidgetPart005State0001.performAction0161((byte) 104);
        }
        this.integerState0329 = -1;
        this.sceneWidgetPart005State0001 = null;
        this.performAction0801((byte) 67, 12);
    }

    final static boolean computeBoolean0798(int integerArgument1, int integerArgument2, int integerArgument3, byte byteArgument4) {
        if (byteArgument4 != 69) {
          return true;
        }
        if (SceneWidget.mixedSupport104State0001 != null &&
          SceneWidget.mixedSupport104State0001.computeBoolean1414(byteArgument4 - 72)) {
          UiComponentPart031.performAction1811((byte) -125);
          return true;
        }
        if (MixedSupport102.sceneWidgetPart007State0001 != null &&
          MixedSupport102.sceneWidgetPart007State0001.computeBoolean1184(false)) {
          MixedSupport102.sceneWidgetPart007State0001 = null;
          UiComponentPart031.performAction1811((byte) -97);
          return true;
        }
        if (SceneWidgetPart013.computeBoolean1938((byte) 119)) {
          return true;
        }
        if (!MixedSupport115.computeBoolean1659(integerArgument2, integerArgument1, (byte) 10, integerArgument3)) {
          return false;
        }
        return true;
    }

    public static void performAction0806(byte byteArgument1) {
        stringState0254 = null;
        if (byteArgument1 < 18) {
          return;
        }
        mixedSupport091ArrayState0001 = null;
        rawSoundState0012 = null;
        stringState0253 = null;
        stringState0255 = null;
    }

    SceneWidgetPart005(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, SceneWidgetPart005[] sceneWidgetPart005ArrayArgument5, int[] integerArrayArgument6, String[] stringArrayArgument7, char[] characterArrayArgument8) {
        super(longArgument1, sceneWidgetArgument2);
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
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        RuntimeException caughtExceptionLocal17 = null;
        RuntimeException runtimeExceptionLocal18 = null;
        String stringLocal19 = null;
        String stringLocal20 = null;
        Object objectLocal21 = null;
        int integerLocal22 = 0;
        BitmapFont bitmapFontLocal23 = null;
        BitmapFont bitmapFontLocal24 = null;
        this.integerState0329 = -1;
        try {
          this.characterArrayState0005 = characterArrayArgument8;
          this.integerArrayState0101 = integerArrayArgument6;
          this.sceneWidgetPart005ArrayState0001 = sceneWidgetPart005ArrayArgument5;
          this.integerState0325 = this.integerArrayState0101.length;
          bitmapFontLocal23 = sceneWidgetArgument4.bitmapFontState0020;
          bitmapFontLocal24 = bitmapFontLocal23;
          this.integerState0322 = bitmapFontLocal24.integerState0523 + 2 + bitmapFontLocal24.integerState0518;
          this.integerState0321 = 0;
          this.sceneWidgetPart009ArrayState0002 = new SceneWidgetPart009[this.integerState0325];
          this.integerState0326 = this.integerState0322 * this.integerState0325;
          stringLocal19 = "<col=999999>";
          stringLocal20 = "</col>";
          for (integerLocal1 = 0; this.integerState0325 > integerLocal1; integerLocal1++) {
            if (0 < this.characterArrayState0005[integerLocal1]) {
              stringArrayArgument7[integerLocal1] = stringLocal19 + MixedSupport104.computeString1402(this.characterArrayState0005[integerLocal1], (byte) -9).toUpperCase() + ": " + stringLocal20 + stringArrayArgument7[integerLocal1];
            }
            objectLocal21 = null;
            if (this.sceneWidgetPart005ArrayState0001[integerLocal1] != null ||
              this.integerArrayState0101[integerLocal1] == -1) {
              objectLocal21 = NetworkArchiveRequestManager.rgbSpriteState0044;
            }
            this.sceneWidgetPart009ArrayState0002[integerLocal1] = new SceneWidgetPart009(0L, sceneWidgetArgument3, (SceneWidget) null, sceneWidgetArgument4, (RgbSprite) (objectLocal21), stringArrayArgument7[integerLocal1]);
            this.performAction1998(this.sceneWidgetPart009ArrayState0002[integerLocal1], -16834);
            integerLocal22 = bitmapFontLocal23.computeInteger1208(stringArrayArgument7[integerLocal1]);
            if (integerLocal22 > this.integerState0321) {
              this.integerState0321 = integerLocal22;
            }
          }
          this.integerState0321 = this.integerState0321 + (NetworkArchiveRequestManager.rgbSpriteState0044.integerState0254 + 10);
          this.performAction0801((byte) 67, 12);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal17 = caughtParameterLocal25;
          runtimeExceptionLocal18 = caughtExceptionLocal17;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal18;
          stackStringBuilderLocal3 = new StringBuilder().append("ig.<init>(").append(longArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (sceneWidgetPart005ArrayArgument5 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (integerArrayArgument6 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',');
          if (stringArrayArgument7 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          stackStringBuilderLocal15 = ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',');
          if (characterArrayArgument8 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(')').toString());
        }
    }

    final static boolean computeBoolean0803(boolean booleanArgument1) {
        if (!booleanArgument1) {
          rawSoundState0012 = (RawSound) null;
        }
        return MixedSupport134.longState0050 == MixedSupport016.sceneWidgetPart013State0001.longState0053 ? true : false;
    }

    static {
        stringState0253 = "This game option has not yet been unlocked for use.";
        integerState0328 = 0;
        stringState0254 = "Set up new game";
        stringState0255 = "Quit to website";
    }
}
