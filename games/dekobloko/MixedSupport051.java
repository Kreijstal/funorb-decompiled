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
    static RenderingSupport007 renderingSupport007State0005;

    final static void performAction0602(int integerArgument1) {
        int integerLocal1 = -63 % ((integerArgument1 + 6) / 38);
        MixedSupport070.integerState0396 = MixedSupport070.integerState0396 + 1;
        if (MixedSupport070.integerState0396 >= 140) {
          MixedSupport070.integerState0396 = 0;
          MixedSupport014.performAction0199((byte) 71);
          if (0 == MixedSupport070.integerState0396 % 20) {
            RenderingSupport002.performAction0247(true);
            return;
          }
          return;
        }
        MixedSupport014.performAction0199((byte) 71);
        if (0 != MixedSupport070.integerState0396 % 20) {
          return;
        }
        RenderingSupport002.performAction0247(true);
    }

    final static void performAction0601(byte byteArgument1) {
        if (byteArgument1 != 11) {
          return;
        }
        MouseInput.longState0054 = MixedSupport062.correctedCurrentTimeMillis(4);
        MixedSupport004.integerState0030 = 0;
    }

    final static void performAction0605(int integerArgument1, boolean booleanArgument2) {
        MixedSupport042.performAction0537(130, 256, 16694016, MixedSupport011.stringState0054, integerArgument1 + 82, SceneWidget.renderingSupport009State0007);
        int integerLocal1 = 1 == AgeValidator.integerState0360 ? 140 : 145;
        MixedSupport035.rgbSpriteArrayArrayState0006[0][1].performAction0280(82 + integerArgument1, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + ((AgeValidator.integerState0360 != 1 ? 16 : 8) + 16 * MixedSupport045.computeInteger0552(198, 0, integerLocal1, ReturnedShape.stringState0474, 16, 64, 16777215, UiComponentPart029.renderingSupport009State0005, (byte) -125, 0, 110 + integerArgument1));
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0280(integerArgument1 + 108, integerLocal1, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0280(integerArgument1 + 108, integerLocal1 + 18, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0280(108 + integerArgument1, integerLocal1 + 36, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[0][2].performAction0280(integerArgument1 + 126, 36 + integerLocal1, 18, 18);
        ComponentDecorator.rgbSpriteState0034.performAction0278(156 + integerArgument1, 10 + integerLocal1);
        RenderingSupport002.performAction0243(0, 2, 6, 230 + integerArgument1, 36 + integerLocal1, 3, -2);
        RenderingSupport002.performAction0243(0, 2, 12, integerArgument1 + 230, integerLocal1 + 18, 3, -1);
        RenderingSupport002.performAction0243(0, 2, 8, integerArgument1 + 230, integerLocal1, 3, -1);
        RenderingSupport002.performAction0243(0, 2, 1, integerArgument1 + 248, integerLocal1 + 36, 2, -2);
        integerLocal1 = integerLocal1 + (54 + (AgeValidator.integerState0360 == 1 ? 8 : 16));
        MixedSupport035.rgbSpriteArrayArrayState0006[3][1].performAction0280(82 + integerArgument1, integerLocal1, 18, 18);
        integerLocal1 = integerLocal1 + MixedSupport045.computeInteger0552(140, 0, integerLocal1, UiComponentPart028.stringState0480, 16, 64, 16777215, UiComponentPart029.renderingSupport009State0005, (byte) -127, 0, 110 + integerArgument1) * 16;
        MixedSupport143.performAction1778(MixedSupport049.integerState0264, TextLineMetrics.integerState0534, integerLocal1 - (90 + (AgeValidator.integerState0360 != 1 ? 0 : 16)), integerArgument1 + 242, -1, 0, MixedSupport070.integerState0396);
        SoftwareRaster.performAction0665(309 + integerArgument1, 117, 242, 263172);
        SoftwareRaster.performAction0665(integerArgument1 + 310, 117, 242, 6316128);
        MixedSupport042.performAction0537(130, 256, 16694016, MixedSupport068.stringState0303, 322 + integerArgument1, SceneWidget.renderingSupport009State0007);
        MixedSupport045.computeInteger0552(120, 0, 145, MixedSupport024.stringState0116, 16, 64, 16777215, UiComponentPart029.renderingSupport009State0005, (byte) -127, 0, integerArgument1 + 320);
        NetworkSupport001.rgbSpriteState0005.performAction0278(455 + integerArgument1, 123);
        if (!booleanArgument2) {
          MixedSupport042.performAction0537(240, 256, 16694016, MixedSupport043.stringState0185, 322 + integerArgument1, SceneWidget.renderingSupport009State0007);
          MixedSupport045.computeInteger0552(120, 0, 255, MixedSupport005.stringState0019, 16, 64, 16777215, UiComponentPart029.renderingSupport009State0005, (byte) -127, 0, 320 + integerArgument1);
          MixedSupport077.rgbSpriteState0032.performAction0278(465 + integerArgument1, 235);
          return;
        }
    }

    final static int computeInteger0603(int integerArgument1, byte byteArgument2) {
        if (byteArgument2 != -122) {
          stringState0214 = (String) null;
          return MixedSupport104.integerArrayState0195[integerArgument1 & 2047];
        }
        return MixedSupport104.integerArrayState0195[integerArgument1 & 2047];
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0211 = null;
        nodeDequeState0009 = null;
        stringState0213 = null;
        stringState0212 = null;
        stringState0214 = null;
        if (byteArgument1 <= -127) {
          stringState0210 = null;
          renderingSupport007State0005 = null;
          return;
        }
    }

    final static boolean computeBoolean0607(boolean booleanArgument1) {
        boolean stackBooleanLocal1 = false;
        if (booleanArgument1) {
          return true;
        }
        if (UiComponentPart023.computeBoolean1242(-30146)) {
          stackBooleanLocal1 = true;
        } else {
          if (Framebuffer.integerState0192 <= 0) {
            return true;
          }
          stackBooleanLocal1 = false;
        }
        return stackBooleanLocal1;
    }

    final static void performAction0606(RenderingSupport007 renderingSupport007Argument1, byte byteArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (DualNodeDeque.computeInteger0037(-28199) != 0) {
            renderingSupport007Argument1 = null;
          }
          if (ComponentContainer.renderingSupport007State0006 != renderingSupport007Argument1 &&
            ComponentContainer.renderingSupport007State0006.integerState0363 > 0) {
            ComponentContainer.renderingSupport007State0006.integerState0363 = ComponentContainer.renderingSupport007State0006.integerState0363 - 1;
          }
          if (MixedSupport097.renderingSupport007State0007 != null &&
            renderingSupport007Argument1 != MixedSupport097.renderingSupport007State0007 &&
            0 < MixedSupport097.renderingSupport007State0007.integerState0363) {
            MixedSupport097.renderingSupport007State0007.integerState0363 = MixedSupport097.renderingSupport007State0007.integerState0363 - 1;
          }
          if (renderingSupport007State0005 != null &&
            renderingSupport007State0005 != renderingSupport007Argument1 &&
            0 < renderingSupport007State0005.integerState0363) {
            renderingSupport007State0005.integerState0363 = renderingSupport007State0005.integerState0363 - 1;
          }
          if (null != MixedSupport020.renderingSupport007State0003 &&
            MixedSupport020.renderingSupport007State0003 != renderingSupport007Argument1 &&
            MixedSupport020.renderingSupport007State0003.integerState0363 > 0) {
            MixedSupport020.renderingSupport007State0003.integerState0363 = MixedSupport020.renderingSupport007State0003.integerState0363 - 1;
          }
          if (null != MixedSupport007.renderingSupport007State0001 &&
            renderingSupport007Argument1 != MixedSupport007.renderingSupport007State0001 &&
            MixedSupport007.renderingSupport007State0001.integerState0363 > 0) {
            MixedSupport007.renderingSupport007State0001.integerState0363 = MixedSupport007.renderingSupport007State0001.integerState0363 - 1;
          }
          if (UiComponentPart004.renderingSupport007State0002 != null &&
            renderingSupport007Argument1 != UiComponentPart004.renderingSupport007State0002 &&
            UiComponentPart004.renderingSupport007State0002.integerState0363 > 0) {
            UiComponentPart004.renderingSupport007State0002.integerState0363 = UiComponentPart004.renderingSupport007State0002.integerState0363 - 1;
          }
          if (null != MixedSupport033.renderingSupport007State0004 &&
            renderingSupport007Argument1 != MixedSupport033.renderingSupport007State0004 &&
            MixedSupport033.renderingSupport007State0004.integerState0363 > 0) {
            MixedSupport033.renderingSupport007State0004.integerState0363 = MixedSupport033.renderingSupport007State0004.integerState0363 - 1;
          }
          if (GameDomainSupport003.rgbSpriteState0020 == MixedSupport128.rgbSpriteState0060 &&
            renderingSupport007Argument1 != null &&
            20 > renderingSupport007Argument1.integerState0363) {
            renderingSupport007Argument1.integerState0365 = renderingSupport007Argument1.integerState0365 + 16;
            renderingSupport007Argument1.integerState0363 = renderingSupport007Argument1.integerState0363 + 1;
          }
          if (null != MixedSupport097.renderingSupport007State0007 &&
            !ResourceSupport002.booleanState0006 &&
            MixedSupport097.renderingSupport007State0007.integerState0363 == 0) {
            MixedSupport097.renderingSupport007State0007 = null;
          }
          if (MixedSupport007.renderingSupport007State0001 != null &&
            !MixedSupport043.booleanState0048 &&
            MixedSupport007.renderingSupport007State0001.integerState0363 == 0) {
            MixedSupport007.renderingSupport007State0001 = null;
          }
          if (null != MixedSupport020.renderingSupport007State0003 &&
            !SceneWidgetPart007.booleanState0114 &&
            MixedSupport020.renderingSupport007State0003.integerState0363 == 0) {
            MixedSupport020.renderingSupport007State0003 = null;
          }
          if (null != renderingSupport007State0005 &&
            !BucketBoard.booleanState0109 &&
            renderingSupport007State0005.integerState0363 == 0) {
            renderingSupport007State0005 = null;
          }
          if (null != UiComponentPart004.renderingSupport007State0002 &&
            !SceneWidgetPart013.booleanState0203 &&
            UiComponentPart004.renderingSupport007State0002.integerState0363 == 0) {
            UiComponentPart004.renderingSupport007State0002 = null;
          }
          if (MixedSupport033.renderingSupport007State0004 != null &&
            !SecondaryNodeHashTable.booleanState0121 &&
            MixedSupport033.renderingSupport007State0004.integerState0363 == 0) {
            MixedSupport033.renderingSupport007State0004 = null;
          }
          if (null != ComponentContainer.renderingSupport007State0006) {
            ComponentContainer.renderingSupport007State0006.performAction0883((byte) 111);
          }
          if (MixedSupport097.renderingSupport007State0007 != null) {
            MixedSupport097.renderingSupport007State0007.performAction0883((byte) 118);
          }
          if (byteArgument2 != 95) {
            return;
          }
          if (null != renderingSupport007State0005) {
            renderingSupport007State0005.performAction0883((byte) 122);
          }
          if (MixedSupport020.renderingSupport007State0003 != null) {
            MixedSupport020.renderingSupport007State0003.performAction0883((byte) 127);
          }
          if (null != MixedSupport007.renderingSupport007State0001) {
            MixedSupport007.renderingSupport007State0001.performAction0883((byte) 122);
          }
          if (null != UiComponentPart004.renderingSupport007State0002) {
            UiComponentPart004.renderingSupport007State0002.performAction0883((byte) 108);
          }
          if (MixedSupport033.renderingSupport007State0004 == null) {
            return;
          }
          MixedSupport033.renderingSupport007State0004.performAction0883((byte) 122);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("h.H(");
          if (renderingSupport007Argument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static int countSetBits(int integerArgument1, int integerArgument2) {
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
