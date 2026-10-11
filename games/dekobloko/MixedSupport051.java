/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport051 {
    static String stringState0210;
    static String stringState0211;
    static String stringState0212;
    static String stringState0213;
    static NodeDeque nodeDequeState0009;
    static String stringState0214;
    static RenderingSupport008 renderingSupport008State0005;

    final static void performAction0665(int integerArgument1) {
        int integerLocal1 = -63 % ((integerArgument1 + 6) / 38);
        MixedSupport074.integerState0396 = MixedSupport074.integerState0396 + 1;
        if (MixedSupport074.integerState0396 >= 140) {
          MixedSupport074.integerState0396 = 0;
          MixedSupport014.performAction0215((byte) 71);
          if (0 == MixedSupport074.integerState0396 % 20) {
            RenderingSupport002.performAction0267(true);
            return;
          }
          return;
        }
        MixedSupport014.performAction0215((byte) 71);
        if (0 != MixedSupport074.integerState0396 % 20) {
          return;
        }
        RenderingSupport002.performAction0267(true);
    }

    final static void performAction0664(byte byteArgument1) {
        if (byteArgument1 != 11) {
          return;
        }
        MouseInput.longState0054 = MixedSupport063.computeLong0827(4);
        MixedSupport004.integerState0030 = 0;
    }

    final static void performAction0668(int integerArgument1, boolean booleanArgument2) {
        MixedSupport042.performAction0595(130, 256, 16694016, MixedSupport011.stringState0054, integerArgument1 + 82, SceneWidget.renderingSupport010State0007);
        int integerLocal1 = 1 == RenderingSupport007.integerState0360 ? 140 : 145;
        MixedSupport035.rgbSpriteArrayArrayState0006[0][1].performAction0302(82 + integerArgument1, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + ((RenderingSupport007.integerState0360 != 1 ? 16 : 8) + 16 * MixedSupport045.computeInteger0612(198, 0, integerLocal1, ReturnedShape.stringState0474, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -125, 0, 110 + integerArgument1));
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0302(integerArgument1 + 108, integerLocal1, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0302(integerArgument1 + 108, integerLocal1 + 18, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0302(108 + integerArgument1, integerLocal1 + 36, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0302(integerArgument1 + 126, 36 + integerLocal1, 18, 18);
        ComponentDecorator.rgbSpriteState0034.performAction0300(156 + integerArgument1, 10 + integerLocal1);
        RenderingSupport002.performAction0263(0, 2, 6, 230 + integerArgument1, 36 + integerLocal1, 3, -2);
        RenderingSupport002.performAction0263(0, 2, 12, integerArgument1 + 230, integerLocal1 + 18, 3, -1);
        RenderingSupport002.performAction0263(0, 2, 8, integerArgument1 + 230, integerLocal1, 3, -1);
        RenderingSupport002.performAction0263(0, 2, 1, integerArgument1 + 248, integerLocal1 + 36, 2, -2);
        integerLocal1 = integerLocal1 + (54 + (RenderingSupport007.integerState0360 == 1 ? 8 : 16));
        MixedSupport035.rgbSpriteArrayArrayState0006[3][1].performAction0302(82 + integerArgument1, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + MixedSupport045.computeInteger0612(140, 0, integerLocal1, UiComponentPart028.stringState0480, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -127, 0, 110 + integerArgument1) * 16;
        MixedSupport150.performAction2008(MixedSupport049.integerState0264, TextLineMetrics.integerState0534, integerLocal1 - (90 + (RenderingSupport007.integerState0360 != 1 ? 0 : 16)), integerArgument1 + 242, -1, 0, MixedSupport074.integerState0396);
        SoftwareRaster.performAction0744(309 + integerArgument1, 117, 242, 263172);
        SoftwareRaster.performAction0744(integerArgument1 + 310, 117, 242, 6316128);
        MixedSupport042.performAction0595(130, 256, 16694016, MixedSupport072.stringState0303, 322 + integerArgument1, SceneWidget.renderingSupport010State0007);
        MixedSupport045.computeInteger0612(120, 0, 145, MixedSupport024.stringState0116, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -127, 0, integerArgument1 + 320);
        NetworkSupport001.rgbSpriteState0005.performAction0300(455 + integerArgument1, 123);
        if (!booleanArgument2) {
          MixedSupport042.performAction0595(240, 256, 16694016, MixedSupport043.stringState0185, 322 + integerArgument1, SceneWidget.renderingSupport010State0007);
          MixedSupport045.computeInteger0612(120, 0, 255, MixedSupport005.stringState0019, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -127, 0, 320 + integerArgument1);
          MixedSupport081.rgbSpriteState0032.performAction0300(465 + integerArgument1, 235);
          return;
        }
    }

    final static int computeInteger0666(int integerArgument1, byte byteArgument2) {
        if (byteArgument2 != -122) {
          stringState0214 = (String) null;
          return MixedSupport109.integerArrayState0195[integerArgument1 & 2047];
        }
        return MixedSupport109.integerArrayState0195[integerArgument1 & 2047];
    }

    public static void performAction0671(byte byteArgument1) {
        stringState0211 = null;
        nodeDequeState0009 = null;
        stringState0213 = null;
        stringState0212 = null;
        stringState0214 = null;
        if (byteArgument1 <= -127) {
          stringState0210 = null;
          renderingSupport008State0005 = null;
          return;
        }
    }

    final static boolean computeBoolean0670(boolean booleanArgument1) {
        boolean stackBooleanLocal1 = false;
        if (booleanArgument1) {
          return true;
        }
        if (UiComponentPart023.computeBoolean1421(-30146)) {
          stackBooleanLocal1 = true;
        } else {
          if (Framebuffer.integerState0192 <= 0) {
            return true;
          }
          stackBooleanLocal1 = false;
        }
        return stackBooleanLocal1;
    }

    final static void performAction0669(RenderingSupport008 renderingSupport008Argument1, byte byteArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (DualNodeDeque.computeInteger0038(-28199) != 0) {
            renderingSupport008Argument1 = null;
          }
          if (ComponentContainer.renderingSupport008State0006 != renderingSupport008Argument1 &&
            ComponentContainer.renderingSupport008State0006.integerState0363 > 0) {
            ComponentContainer.renderingSupport008State0006.integerState0363 = ComponentContainer.renderingSupport008State0006.integerState0363 - 1;
          }
          if (MixedSupport102.renderingSupport008State0007 != null &&
            renderingSupport008Argument1 != MixedSupport102.renderingSupport008State0007 &&
            0 < MixedSupport102.renderingSupport008State0007.integerState0363) {
            MixedSupport102.renderingSupport008State0007.integerState0363 = MixedSupport102.renderingSupport008State0007.integerState0363 - 1;
          }
          if (renderingSupport008State0005 != null &&
            renderingSupport008State0005 != renderingSupport008Argument1 &&
            0 < renderingSupport008State0005.integerState0363) {
            renderingSupport008State0005.integerState0363 = renderingSupport008State0005.integerState0363 - 1;
          }
          if (null != MixedSupport020.renderingSupport008State0003 &&
            MixedSupport020.renderingSupport008State0003 != renderingSupport008Argument1 &&
            MixedSupport020.renderingSupport008State0003.integerState0363 > 0) {
            MixedSupport020.renderingSupport008State0003.integerState0363 = MixedSupport020.renderingSupport008State0003.integerState0363 - 1;
          }
          if (null != MixedSupport007.renderingSupport008State0001 &&
            renderingSupport008Argument1 != MixedSupport007.renderingSupport008State0001 &&
            MixedSupport007.renderingSupport008State0001.integerState0363 > 0) {
            MixedSupport007.renderingSupport008State0001.integerState0363 = MixedSupport007.renderingSupport008State0001.integerState0363 - 1;
          }
          if (UiComponentPart004.renderingSupport008State0002 != null &&
            renderingSupport008Argument1 != UiComponentPart004.renderingSupport008State0002 &&
            UiComponentPart004.renderingSupport008State0002.integerState0363 > 0) {
            UiComponentPart004.renderingSupport008State0002.integerState0363 = UiComponentPart004.renderingSupport008State0002.integerState0363 - 1;
          }
          if (null != MixedSupport033.renderingSupport008State0004 &&
            renderingSupport008Argument1 != MixedSupport033.renderingSupport008State0004 &&
            MixedSupport033.renderingSupport008State0004.integerState0363 > 0) {
            MixedSupport033.renderingSupport008State0004.integerState0363 = MixedSupport033.renderingSupport008State0004.integerState0363 - 1;
          }
          if (GameDomainSupport003.rgbSpriteState0020 == MixedSupport135.rgbSpriteState0060 &&
            renderingSupport008Argument1 != null &&
            20 > renderingSupport008Argument1.integerState0363) {
            renderingSupport008Argument1.integerState0365 = renderingSupport008Argument1.integerState0365 + 16;
            renderingSupport008Argument1.integerState0363 = renderingSupport008Argument1.integerState0363 + 1;
          }
          if (null != MixedSupport102.renderingSupport008State0007 &&
            !ResourceSupport002.booleanState0006 &&
            MixedSupport102.renderingSupport008State0007.integerState0363 == 0) {
            MixedSupport102.renderingSupport008State0007 = null;
          }
          if (MixedSupport007.renderingSupport008State0001 != null &&
            !MixedSupport043.booleanState0048 &&
            MixedSupport007.renderingSupport008State0001.integerState0363 == 0) {
            MixedSupport007.renderingSupport008State0001 = null;
          }
          if (null != MixedSupport020.renderingSupport008State0003 &&
            !SceneWidgetPart007.booleanState0114 &&
            MixedSupport020.renderingSupport008State0003.integerState0363 == 0) {
            MixedSupport020.renderingSupport008State0003 = null;
          }
          if (null != renderingSupport008State0005 &&
            !BucketBoard.booleanState0109 &&
            renderingSupport008State0005.integerState0363 == 0) {
            renderingSupport008State0005 = null;
          }
          if (null != UiComponentPart004.renderingSupport008State0002 &&
            !SceneWidgetPart013.booleanState0203 &&
            UiComponentPart004.renderingSupport008State0002.integerState0363 == 0) {
            UiComponentPart004.renderingSupport008State0002 = null;
          }
          if (MixedSupport033.renderingSupport008State0004 != null &&
            !CollectionSupport003.booleanState0121 &&
            MixedSupport033.renderingSupport008State0004.integerState0363 == 0) {
            MixedSupport033.renderingSupport008State0004 = null;
          }
          if (null != ComponentContainer.renderingSupport008State0006) {
            ComponentContainer.renderingSupport008State0006.performAction1000((byte) 111);
          }
          if (MixedSupport102.renderingSupport008State0007 != null) {
            MixedSupport102.renderingSupport008State0007.performAction1000((byte) 118);
          }
          if (byteArgument2 != 95) {
            return;
          }
          if (null != renderingSupport008State0005) {
            renderingSupport008State0005.performAction1000((byte) 122);
          }
          if (MixedSupport020.renderingSupport008State0003 != null) {
            MixedSupport020.renderingSupport008State0003.performAction1000((byte) 127);
          }
          if (null != MixedSupport007.renderingSupport008State0001) {
            MixedSupport007.renderingSupport008State0001.performAction1000((byte) 122);
          }
          if (null != UiComponentPart004.renderingSupport008State0002) {
            UiComponentPart004.renderingSupport008State0002.performAction1000((byte) 108);
          }
          if (MixedSupport033.renderingSupport008State0004 == null) {
            return;
          }
          MixedSupport033.renderingSupport008State0004.performAction1000((byte) 122);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("h.H(");
          if (renderingSupport008Argument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static int computeInteger0667(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 77 / ((integerArgument2 + 6) / 41);
        integerArgument1 = ((integerArgument1 & -1431655766) >>> 1) + (integerArgument1 & 1431655765);
        integerArgument1 = (integerArgument1 & 858993459) + ((-858993460 & integerArgument1) >>> 2);
        integerArgument1 = 252645135 & integerArgument1 + (integerArgument1 >>> 4);
        integerArgument1 = integerArgument1 + (integerArgument1 >>> 8);
        integerArgument1 = integerArgument1 + (integerArgument1 >>> 16);
        return integerArgument1 & 255;
    }

    static {
        stringState0211 = "Please send me news and updates (I can unsubscribe at any time)";
        stringState0213 = "Enter name of friend to add to list";
        stringState0210 = "Waiting for <%0> to start the game...";
        stringState0214 = "Yes";
    }
}
