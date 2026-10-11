/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class UiComponentPart003 extends ComponentContainer {
    static int integerState0073;
    boolean booleanState0011;
    private UiComponentPart016 uiComponentPart016State0002;
    static String stringState0059;
    static PlatformService platformServiceState0001;
    static SceneWidget sceneWidgetState0008;
    private int integerState0074;
    static char[] characterArrayState0003;
    static String stringState0060;

    private final int computeInteger0173(int integerArgument1) {
        if (integerArgument1 != -10604) {
          return -74;
        }
        return !this.booleanState0011 ? 0 : this.uiComponentPart016State0002.computeUiComponentPart0030950((byte) -83) == this ? 256 : 0;
    }

    final void performAction0174(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument1 <= 92) {
          this.computeBoolean0182((byte) -10);
        }
        this.performAction0241(integerArgument3, integerArgument2, TextLayout.integerState0111 - integerArgument2 >> 1, -integerArgument3 + MixedSupport143.integerState0836 >> 1, -16555);
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (this.integerState0074 == 0) {
          return;
        }
        if (256 <= this.integerState0074) {
          if (integerArgument3 != 0) {
            return;
          }
          this.performAction0178(-128, integerArgument4 + this.integerState0104, integerArgument1 + this.integerState0110);
          super.performAction0175(integerArgument1, -122, integerArgument3, integerArgument4);
          return;
        }
        if (null == NodeHashTable.rgbSpriteState0055 ||
          !(this.integerState0107 <= NodeHashTable.rgbSpriteState0055.integerState0258) ||
          !(this.integerState0108 <= NodeHashTable.rgbSpriteState0055.integerState0255)) {
          NodeHashTable.rgbSpriteState0055 = new RgbSprite(this.integerState0107, this.integerState0108);
        }
        RenderingSupport015.performAction1778(true, NodeHashTable.rgbSpriteState0055);
        SoftwareRaster.performAction0727();
        this.performAction0178(-128, 0, 0);
        super.performAction0175(-this.integerState0110 - integerArgument1, -116, integerArgument3, -integerArgument4 - this.integerState0104);
        MixedSupport086.performAction1200((byte) -5);
        NodeHashTable.rgbSpriteState0055.performAction0301(this.integerState0110 + integerArgument1, this.integerState0104 + integerArgument4, this.integerState0074);
        if (integerArgument2 >= -103) {
          this.integerState0074 = -41;
        }
    }

    UiComponentPart003(UiComponentPart016 uiComponentPart016Argument1, int integerArgument2, int integerArgument3) {
        super(-integerArgument2 + TextLayout.integerState0111 >> 1, MixedSupport143.integerState0836 - integerArgument3 >> 1, integerArgument2, integerArgument3, (CallbackContract004) null);
        try {
          this.booleanState0011 = false;
          this.integerState0074 = 0;
          this.uiComponentPart016State0002 = uiComponentPart016Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bl.<init>(" + (uiComponentPart016Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final UiComponent computeUiComponent0179(byte byteArgument1) {
        UiComponent uiComponentLocal1 = super.computeUiComponent0179(byteArgument1);
        if (uiComponentLocal1 != null) {
          return uiComponentLocal1;
        }
        return (UiComponent) (this);
    }

    final static void performAction0176(int integerArgument1, int integerArgument2, boolean booleanArgument3) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        String[] stackStringArrayLocal3 = null;
        int stackIntegerLocal4 = 0;
        String stackStringLocal5 = null;
        String[] stackStringArrayLocal6 = null;
        int stackIntegerLocal7 = 0;
        String stackStringLocal8 = null;
        boolean stackBooleanLocal9 = false;
        String stackStringLocal10 = null;
        boolean stackBooleanLocal11 = false;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        RuntimeException caughtExceptionLocal14 = null;
        int integerLocal15 = 0;
        RuntimeException runtimeExceptionLocal16 = null;
        int integerLocal17 = 0;
        String[] stringArrayLocal18 = null;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        String[] stringArrayLocal24 = null;
        String stringLocal25 = null;
        String stringLocal26 = null;
        String[] stringArrayLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport040.booleanState0046 = true;
          MixedSupport009.integerState0054 = integerArgument2;
          if (MixedSupport009.integerState0054 == 0) {
            integerLocal15 = MixedSupport126.computeInteger1794(UiComponentPart007.stringState0112, 124, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
            integerLocal17 = 3 + integerLocal15;
            UiComponentPart028.stringArrayState0039 = new String[integerLocal17];
            MixedSupport070.integerArrayState0119 = new int[integerLocal17];
            for (integerLocal19 = 0; integerLocal19 < integerLocal17; integerLocal19++) {
              MixedSupport070.integerArrayState0119[integerLocal19] = -1;
            }
            InputAdapter005.integerArrayState0192 = new int[2];
            for (integerLocal19 = 0; integerLocal15 > integerLocal19; integerLocal19++) {
              UiComponentPart028.stringArrayState0039[integerLocal19] = MixedSupport145.stringArrayState0053[integerLocal19];
            }
            UiComponentPart028.stringArrayState0039[integerLocal17 - 3] = "";
            UiComponentPart028.stringArrayState0039[-2 + integerLocal17] = NetworkSupport007.stringState0345;
            MixedSupport070.integerArrayState0119[integerLocal17 - 2] = 0;
            InputAdapter005.integerArrayState0192[0] = 4;
            UiComponentPart028.stringArrayState0039[-1 + integerLocal17] = UiComponentPart021.stringState0383;
            MixedSupport070.integerArrayState0119[-1 + integerLocal17] = 1;
            InputAdapter005.integerArrayState0192[1] = 5;
          } else if (MixedSupport009.integerState0054 == 1) {
            integerLocal15 = MixedSupport126.computeInteger1794(UiComponentPart007.stringState0112, 96, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
            integerLocal17 = integerLocal15 + 2;
            MixedSupport070.integerArrayState0119 = new int[integerLocal17];
            UiComponentPart028.stringArrayState0039 = new String[integerLocal17];
            for (integerLocal19 = 0; integerLocal17 > integerLocal19; integerLocal19++) {
              MixedSupport070.integerArrayState0119[integerLocal19] = -1;
            }
            InputAdapter005.integerArrayState0192 = new int[1];
            for (integerLocal19 = 0; integerLocal19 < integerLocal15; integerLocal19++) {
              UiComponentPart028.stringArrayState0039[integerLocal19] = MixedSupport145.stringArrayState0053[integerLocal19];
            }
            UiComponentPart028.stringArrayState0039[-2 + integerLocal17] = "";
            UiComponentPart028.stringArrayState0039[-1 + integerLocal17] = UiComponentPart021.stringState0383;
            MixedSupport070.integerArrayState0119[-1 + integerLocal17] = 0;
            InputAdapter005.integerArrayState0192[0] = 5;
          } else if (MixedSupport009.integerState0054 != 2) {
            if (MixedSupport009.integerState0054 == 3) {
              if (!CodecSupport001.platformServiceState0003.booleanState0043) {
                integerLocal15 = MixedSupport126.computeInteger1794(NodeHashTable.stringState0507, 81, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
              } else {
                integerLocal15 = MixedSupport126.computeInteger1794(MixedSupport112.stringState0465, 99, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
              }
              integerLocal17 = 2 + integerLocal15;
              UiComponentPart028.stringArrayState0039 = new String[integerLocal17];
              MixedSupport070.integerArrayState0119 = new int[integerLocal17];
              for (integerLocal19 = 0; integerLocal19 < integerLocal17; integerLocal19++) {
                MixedSupport070.integerArrayState0119[integerLocal19] = -1;
              }
              InputAdapter005.integerArrayState0192 = new int[1];
              for (integerLocal19 = 0; integerLocal19 < integerLocal15; integerLocal19++) {
                UiComponentPart028.stringArrayState0039[integerLocal19] = MixedSupport145.stringArrayState0053[integerLocal19];
              }
              UiComponentPart028.stringArrayState0039[integerLocal17 - 2] = "";
              UiComponentPart028.stringArrayState0039[integerLocal17 - 1] = UiComponentPart021.stringState0383;
              MixedSupport070.integerArrayState0119[-1 + integerLocal17] = 0;
              InputAdapter005.integerArrayState0192[0] = 5;
            } else if (MixedSupport009.integerState0054 == 4) {
              integerLocal15 = MixedSupport126.computeInteger1794(MixedSupport023.stringState0103, 117, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
              integerLocal17 = 2 + integerLocal15;
              MixedSupport070.integerArrayState0119 = new int[integerLocal17];
              UiComponentPart028.stringArrayState0039 = new String[integerLocal17];
              for (integerLocal19 = 0; integerLocal17 > integerLocal19; integerLocal19++) {
                MixedSupport070.integerArrayState0119[integerLocal19] = -1;
              }
              InputAdapter005.integerArrayState0192 = new int[1];
              for (integerLocal19 = 0; integerLocal15 > integerLocal19; integerLocal19++) {
                UiComponentPart028.stringArrayState0039[integerLocal19] = MixedSupport145.stringArrayState0053[integerLocal19];
              }
              UiComponentPart028.stringArrayState0039[-2 + integerLocal17] = "";
              UiComponentPart028.stringArrayState0039[integerLocal17 - 1] = UiComponentPart021.stringState0383;
              MixedSupport070.integerArrayState0119[-1 + integerLocal17] = 0;
              InputAdapter005.integerArrayState0192[0] = 5;
            } else {
              if (MixedSupport009.integerState0054 != 5) {
                throw new IllegalArgumentException();
              }
              integerLocal15 = MixedSupport126.computeInteger1794(MixedSupport046.stringState0197, 76, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
              integerLocal17 = 3 + integerLocal15;
              UiComponentPart028.stringArrayState0039 = new String[integerLocal17];
              MixedSupport070.integerArrayState0119 = new int[integerLocal17];
              for (integerLocal19 = 0; integerLocal19 < integerLocal17; integerLocal19++) {
                MixedSupport070.integerArrayState0119[integerLocal19] = -1;
              }
              InputAdapter005.integerArrayState0192 = new int[2];
              for (integerLocal19 = 0; integerLocal15 > integerLocal19; integerLocal19++) {
                UiComponentPart028.stringArrayState0039[integerLocal19] = MixedSupport145.stringArrayState0053[integerLocal19];
              }
              UiComponentPart028.stringArrayState0039[-3 + integerLocal17] = "";
              UiComponentPart028.stringArrayState0039[integerLocal17 - 2] = MixedSupport040.stringState0178;
              MixedSupport070.integerArrayState0119[-2 + integerLocal17] = 0;
              InputAdapter005.integerArrayState0192[0] = 3;
              UiComponentPart028.stringArrayState0039[integerLocal17 - 1] = UiComponentPart021.stringState0383;
              MixedSupport070.integerArrayState0119[-1 + integerLocal17] = 1;
              InputAdapter005.integerArrayState0192[1] = 5;
            }
          } else {
            integerLocal15 = MixedSupport126.computeInteger1794(CollectionSupport001.computeString0336(91, UiComponentPart006.stringState0108, new String[]{"<br><%0><br>"}), 86, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
            integerLocal17 = -1;
            for (integerLocal19 = 0; integerLocal19 < integerLocal15; integerLocal19++) {
              if (!"<%0>".equals(MixedSupport145.stringArrayState0053[integerLocal19])) {
                continue;
              }
              integerLocal17 = integerLocal19;
              break;
            }
            if (integerLocal17 == -1) {
              throw new IllegalStateException();
            }
            MixedSupport127.stringArrayState0047 = new String[integerLocal17];
            MixedSupport008.performAction0086(MixedSupport145.stringArrayState0053, 0, MixedSupport127.stringArrayState0047, 0, integerLocal17);
            ClientException.stringArrayState0006 = new String[-1 + (integerLocal15 - integerLocal17)];
            MixedSupport008.performAction0086(MixedSupport145.stringArrayState0053, 1 + integerLocal17, ClientException.stringArrayState0006, 0, -integerLocal17 + integerLocal15 - 1);
            integerLocal17 = -1;
            integerLocal15 = MixedSupport126.computeInteger1794(CollectionSupport001.computeString0336(86, MixedSupport045.stringState0189, new String[]{"<br><%0><br>"}), 112, MixedSupport098.integerState0568, MixedSupport145.stringArrayState0053, UiComponentPart028.bitmapFontState0019);
            for (integerLocal19 = 0; integerLocal19 < integerLocal15; integerLocal19++) {
              if (!"<%0>".equals(MixedSupport145.stringArrayState0053[integerLocal19])) {
                continue;
              }
              integerLocal17 = integerLocal19;
              break;
            }
            if (-1 == integerLocal17) {
              throw new IllegalStateException();
            }
            UiComponentPart032.stringArrayState0051 = new String[integerLocal17];
            MixedSupport008.performAction0086(MixedSupport145.stringArrayState0053, 0, UiComponentPart032.stringArrayState0051, 0, integerLocal17);
            SceneWidgetPart014.stringArrayState0057 = new String[integerLocal15 - (integerLocal17 + 1)];
            MixedSupport008.performAction0086(MixedSupport145.stringArrayState0053, integerLocal17 + 1, SceneWidgetPart014.stringArrayState0057, 0, -1 + (-integerLocal17 + integerLocal15));
            if (MixedSupport127.stringArrayState0047.length >= UiComponentPart032.stringArrayState0051.length) {
              stackIntegerLocal1 = MixedSupport127.stringArrayState0047.length;
            } else {
              stackIntegerLocal1 = UiComponentPart032.stringArrayState0051.length;
            }
            integerLocal19 = stackIntegerLocal1;
            if (ClientException.stringArrayState0006.length < SceneWidgetPart014.stringArrayState0057.length) {
              stackIntegerLocal2 = SceneWidgetPart014.stringArrayState0057.length;
            } else {
              stackIntegerLocal2 = ClientException.stringArrayState0006.length;
            }
            integerLocal20 = stackIntegerLocal2;
            integerLocal21 = integerLocal19 + (7 + integerLocal20);
            UiComponentPart028.stringArrayState0039 = new String[integerLocal21];
            MixedSupport070.integerArrayState0119 = new int[integerLocal21];
            for (integerLocal22 = 0; integerLocal21 > integerLocal22; integerLocal22++) {
              MixedSupport070.integerArrayState0119[integerLocal22] = -1;
            }
            InputAdapter005.integerArrayState0192 = new int[2];
            UiComponentPart028.stringArrayState0039[1] = MixedSupport057.stringState0245;
            MixedSupport070.integerArrayState0119[1] = 0;
            UiComponentPart028.stringArrayState0039[0] = UiComponentPart031.stringState0528;
            InputAdapter005.integerArrayState0192[0] = 5;
            UiComponentPart028.stringArrayState0039[2] = MixedSupport154.stringState0622;
            MixedSupport070.integerArrayState0119[3] = 1;
            UiComponentPart028.stringArrayState0039[3] = ProxySocketFactory.stringState0494;
            UiComponentPart028.stringArrayState0039[4] = MixedSupport137.stringState0565;
            InputAdapter005.integerArrayState0192[1] = 2;
            UiComponentPart028.stringArrayState0039[5] = "";
            for (integerLocal39 = 0; integerLocal39 < integerLocal19; integerLocal39++) {
              stackStringArrayLocal3 = UiComponentPart028.stringArrayState0039;
              stackIntegerLocal4 = integerLocal39 + 6;
              if (-integerLocal19 + (integerLocal39 + UiComponentPart032.stringArrayState0051.length) >= 0) {
                stackStringLocal5 = UiComponentPart032.stringArrayState0051[-integerLocal19 + (UiComponentPart032.stringArrayState0051.length + integerLocal39)];
              } else {
                stackStringLocal5 = "";
              }
              stackStringArrayLocal3[stackIntegerLocal4] = stackStringLocal5;
            }
            UiComponentPart028.stringArrayState0039[integerLocal19 + 6] = null;
            MixedSupport070.integerArrayState0119[integerLocal19 + 6] = -2;
            for (integerLocal40 = 0; integerLocal40 < integerLocal20; integerLocal40++) {
              stackStringArrayLocal6 = UiComponentPart028.stringArrayState0039;
              stackIntegerLocal7 = 7 - (-integerLocal19 - integerLocal40);
              if (SceneWidgetPart014.stringArrayState0057.length <= integerLocal40) {
                stackStringLocal8 = "";
              } else {
                stackStringLocal8 = SceneWidgetPart014.stringArrayState0057[integerLocal40];
              }
              stackStringArrayLocal6[stackIntegerLocal7] = stackStringLocal8;
            }
            MixedSupport024.longState0007 = MixedSupport063.computeLong0827(4);
          }
          if (integerArgument1 > -8) {
            platformServiceState0001 = (PlatformService) null;
          }
          MixedSupport070.mixedSupport121State0001.integerState0756 = InputAdapter005.integerArrayState0192.length;
          integerLocal33 = 0;
          for (integerLocal34 = 0; integerLocal34 < UiComponentPart028.stringArrayState0039.length; integerLocal34++) {
            stackBooleanLocal9 = false;
            stackStringLocal10 = UiComponentPart028.stringArrayState0039[integerLocal34];
            stackBooleanLocal11 = !(MixedSupport070.integerArrayState0119[integerLocal34] < 0);
            integerLocal28 = NodeHashTable.computeInteger1709(stackBooleanLocal9, stackStringLocal10, stackBooleanLocal11);
            if (integerLocal28 > integerLocal33) {
              integerLocal33 = integerLocal28;
            }
          }
          if (MixedSupport009.integerState0054 == 2) {
            stringArrayLocal24 = MixedSupport127.stringArrayState0047;
            stringArrayLocal18 = stringArrayLocal24;
            for (integerLocal29 = 0; stringArrayLocal24.length > integerLocal29; integerLocal29++) {
              stringLocal25 = stringArrayLocal24[integerLocal29];
              integerLocal37 = NodeHashTable.computeInteger1709(false, stringLocal25, false);
              if (integerLocal37 > integerLocal33) {
                integerLocal33 = integerLocal37;
              }
            }
            stringArrayLocal27 = ClientException.stringArrayState0006;
            for (integerLocal41 = 0; integerLocal41 < stringArrayLocal27.length; integerLocal41++) {
              stringLocal26 = stringArrayLocal27[integerLocal41];
              integerLocal42 = NodeHashTable.computeInteger1709(false, stringLocal26, false);
              if (integerLocal33 < integerLocal42) {
                integerLocal33 = integerLocal42;
              }
            }
          }
          SceneWidgetPart005.integerState0330 = (BufferedSocket.integerState0665 + UiComponentPart022.integerState0575 << 1) * MixedSupport070.mixedSupport121State0001.integerState0756;
          CodecSupport004.integerState0700 = -(integerLocal33 >> 1) + (integerLocal33 + BufferedSocket.integerState0661);
          RenderingSupport003.integerState0251 = BufferedSocket.integerState0661 - (integerLocal33 >> 1);
          for (integerLocal35 = 0; UiComponentPart028.stringArrayState0039.length > integerLocal35; integerLocal35++) {
            stackIntegerLocal12 = SceneWidgetPart005.integerState0330;
            if (MixedSupport070.integerArrayState0119[integerLocal35] < 0) {
              stackIntegerLocal13 = RenderingSupport008.integerState0362;
            } else {
              stackIntegerLocal13 = MixedSupport015.integerState0100;
            }
            SceneWidgetPart005.integerState0330 = stackIntegerLocal12 + stackIntegerLocal13;
          }
          MixedSupport036.integerState0221 = MixedSupport138.integerState0819 - (SceneWidgetPart005.integerState0330 >> 1);
          SceneWidgetPart012.integerArrayArrayState0020 = new int[UiComponentPart028.stringArrayState0039.length][];
          integerLocal36 = 0;
          integerLocal30 = MixedSupport036.integerState0221;
          while (UiComponentPart028.stringArrayState0039.length > integerLocal36) {
            integerLocal31 = MixedSupport070.integerArrayState0119[integerLocal36];
            if (integerLocal31 >= 0) {
              integerLocal38 = NodeHashTable.computeInteger1709(false, UiComponentPart028.stringArrayState0039[integerLocal36], true);
              integerLocal30 = integerLocal30 + BufferedSocket.integerState0665;
              integerLocal32 = BufferedSocket.integerState0661 - (integerLocal38 >> 1);
              SceneWidgetPart012.integerArrayArrayState0020[integerLocal36] = new int[4];
              SceneWidgetPart012.integerArrayArrayState0020[integerLocal36][0] = integerLocal32 - NetworkSupport006.integerState0499;
              SceneWidgetPart012.integerArrayArrayState0020[integerLocal36][1] = integerLocal30;
              SceneWidgetPart012.integerArrayArrayState0020[integerLocal36][2] = integerLocal38 + (NetworkSupport006.integerState0499 << 1);
              integerLocal30 = integerLocal30 + ((UiComponentPart022.integerState0575 << 1) + BufferedSocket.integerState0665 + MixedSupport015.integerState0100);
              SceneWidgetPart012.integerArrayArrayState0020[integerLocal36][3] = MixedSupport015.integerState0100 + (UiComponentPart022.integerState0575 << 1);
            } else {
              integerLocal30 = integerLocal30 + RenderingSupport008.integerState0362;
            }
            integerLocal36++;
          }
          if (MixedSupport009.integerState0054 != 2) {
            MixedSupport070.mixedSupport121State0001.performAction1722(0, 0, MixedSupport133.computeInteger1845(HashNode.integerState0069, (byte) -81, MixedSupport106.integerState0590), booleanArgument3);
          } else {
            MixedSupport070.mixedSupport121State0001.performAction1722(-1, 0, -1, booleanArgument3);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal43) {
          caughtExceptionLocal14 = caughtParameterLocal43;
          runtimeExceptionLocal16 = caughtExceptionLocal14;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal16), "bl.IC(" + integerArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ')');
        }
    }

    final static void performAction0177(int integerArgument1, int integerArgument2) {
        int integerLocal1;
        MixedSupport042.performAction0595(130, integerArgument2 ^ 12362, 16694016, NetworkSupport006.stringState0339, 80 + integerArgument1, SceneWidget.renderingSupport010State0007);
        int integerLocal2 = 145;
        RenderingSupport007.rgbSpriteState0026.performAction0302(integerArgument1 + 82, integerLocal2, 18, 18);
        integerLocal2 = integerLocal2 + (16 + MixedSupport045.computeInteger0612(188, 0, integerLocal2, CollectionSupport003.stringState0367, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -127, 0, integerArgument1 + 110) * 16);
        MixedSupport127.computeRgbSprite1815(true, 2).performAction0302(82 + integerArgument1, integerLocal2, 18, 18);
        integerLocal2 = integerLocal2 + ((RenderingSupport007.integerState0360 == 0 ? 16 : 0) + MixedSupport045.computeInteger0612(188, 0, integerLocal2, MixedSupport071.stringState0301, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -127, 0, integerArgument1 + 110) * 16);
        GameplayControls.performAction1979(TextLineMetrics.integerState0534, integerArgument1 + 190, 3, MixedSupport049.integerState0264, MixedSupport074.integerState0396, integerLocal2, -22981);
        SoftwareRaster.performAction0744(309 + integerArgument1, 117, 242, 263172);
        SoftwareRaster.performAction0744(310 + integerArgument1, 117, 242, 6316128);
        MixedSupport042.performAction0595(130, integerArgument2 ^ 12362, 16694016, MixedSupport054.stringState0233, 320 + integerArgument1, SceneWidget.renderingSupport010State0007);
        integerLocal1 = 145;
        MixedSupport127.computeRgbSprite1815(true, 0).performAction0302(320 + integerArgument1, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + (16 * MixedSupport045.computeInteger0612(212, 0, integerLocal1, PlatformSupport002.stringState0123, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -128, 0, 348 + integerArgument1) + 16);
        if (integerArgument2 != 12618) {
          UiComponentPart003.performAction0176(105, 85, false);
        }
        MixedSupport042.performAction0595(integerLocal1 + 14, 256, 16694016, MixedSupport072.stringState0303, integerArgument1 + 320, SceneWidget.renderingSupport010State0007);
        integerLocal1 += 29;
        MixedSupport127.computeRgbSprite1815(true, 3).performAction0302(integerArgument1 + 320, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + (16 + MixedSupport045.computeInteger0612(212, 0, integerLocal1, NetworkSupport005.stringState0313, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -128, 0, 348 + integerArgument1) * 16);
    }

    boolean computeBoolean0180(byte byteArgument1) {
        boolean stackBooleanLocal1 = false;
        this.integerState0074 = this.computeInteger0173(-10604);
        if (byteArgument1 < 77) {
          this.booleanState0011 = false;
        }
        stackBooleanLocal1 = (0 == this.integerState0074) && (!this.booleanState0011);
        return stackBooleanLocal1;
    }

    boolean computeBoolean0182(byte byteArgument1) {
        int integerLocal1;
        int integerLocal2;
        boolean stackBooleanLocal3 = false;
        integerLocal1 = this.computeInteger0173(-10604);
        integerLocal2 = integerLocal1 - this.integerState0074;
        if (byteArgument1 <= 15) {
          this.performAction0175(-126, -71, 58, -27);
        }
        if (0 < integerLocal2) {
          this.integerState0074 = this.integerState0074 + (-1 + integerLocal2 + 8) / 8;
        }
        if (integerLocal2 < 0) {
          this.integerState0074 = this.integerState0074 + (1 + (-16 + integerLocal2)) / 16;
        }
        stackBooleanLocal3 = (this.integerState0074 == 0) && (integerLocal1 == 0) && (!this.booleanState0011);
        return stackBooleanLocal3;
    }

    abstract void performAction0178(int integerArgument1, int integerArgument2, int integerArgument3);

    final static void performAction0181(byte byteArgument1) {
        RenderingSupport001.networkSupport002State0001 = MixedSupport010.computeNetworkSupport0020154(true);
        if (byteArgument1 > -12) {
          characterArrayState0003 = (char[]) null;
        }
        MixedSupport005.uiComponentPart016State0001 = new UiComponentPart016();
        NetworkSupport003.performAction0380(true, true, (byte) 66);
    }

    public static void performAction0183(int integerArgument1) {
        sceneWidgetState0008 = null;
        if (integerArgument1 != 2) {
          stringState0060 = (String) null;
        }
        platformServiceState0001 = null;
        stringState0059 = null;
        stringState0060 = null;
        characterArrayState0003 = null;
    }

    static {
        stringState0059 = "Chat view has been scrolled up. Scroll down to chat.";
        characterArrayState0003 = new char[128];
        stringState0060 = "Back";
    }
}
