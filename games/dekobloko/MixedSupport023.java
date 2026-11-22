/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport023 {
    static ValidationStatus validationStatusState0001;
    static boolean booleanState0025;
    static String stringState0103;
    static String stringState0104;
    static String stringState0105;
    int integerState0126;
    int integerState0127;
    int integerState0128;
    int integerState0129;
    static MixedSupport006 mixedSupport006State0001;
    static String stringState0106;

    final static boolean computeBoolean0339(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument3 != 6774) {
          stringState0104 = (String) null;
        }
        int integerLocal1 = UiComponentPart011.sceneWidgetPart013State0002 != null ? 1 : 0;
        if (MixedSupport146.integerState0931 == 9 &&
          MixedSupport096.computeBoolean1213(IterableNodeCollection.integerState0802, integerArgument3 - 6772, MixedSupport086.longState0032, UiComponentPart013.stringState0226, SoftwareFramebuffer.integerArrayState0259)) {
          if (2 != IterableNodeCollection.integerState0802 &&
            integerLocal1 != 0) {
            return false;
          }
          return MixedSupport142.computeBoolean1759(SoftwareFramebuffer.integerArrayState0259, MixedSupport086.longState0032, UiComponentPart013.stringState0226, -12, IterableNodeCollection.integerState0802);
        }
        if (MixedSupport146.integerState0931 == 10) {
          if (integerLocal1 != 0) {
            return false;
          }
          NetworkSupport001.performAction0061(-1045);
          return true;
        }
        if (11 == MixedSupport146.integerState0931) {
          if (!MixedSupport017.booleanState0020) {
            return false;
          }
          if (MixedSupport103.integerState0596 == 2 &&
            !InputAdapter003.computeBoolean1490(MixedSupport034.stringState0164, integerArgument3 ^ 6671, MixedSupport077.longState0029)) {
            return false;
          }
          if (MixedSupport103.integerState0596 != 2 &&
            integerLocal1 != 0) {
            return false;
          }
          if (MixedSupport139.computeBoolean1724((byte) 70)) {
            String stringLocal2 = (String) null;
            UiComponent.performAction0208(integerArgument2, (byte) -85, MixedSupport103.integerState0596, MixedSupport034.stringState0164, MixedSupport016.integerState0102, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void performAction0341(boolean booleanArgument1, int integerArgument2) {
        boolean stackBooleanLocal1 = false;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        if (UiComponentPart023.computeBoolean1242(-30146) && (UiComponentPart031.computeBoolean1586((byte) 38, MixedSupport063.integerArrayState0111) ||
          MixedSupport048.mixedSupport072State0001 != null ||
          !(UiComponentPart015.integerState0319 <= 0))) {
          ResourceSupport002.booleanState0006 = true;
          stackBooleanLocal1 = true;
          stackBooleanLocal2 = !(UiComponentPart015.integerState0319 <= 0);
          stackBooleanLocal3 = (null != MixedSupport048.mixedSupport072State0001);
          MixedSupport097.renderingSupport007State0007 = PcmPlayerService.computeRenderingSupport0071410(stackBooleanLocal1, stackBooleanLocal2, stackBooleanLocal3, (byte) -61, booleanArgument1);
          return;
        }
        ResourceSupport002.booleanState0006 = false;
        MixedSupport090.booleanState0124 = false;
        if (UiComponentPart031.computeBoolean1586((byte) 64, MixedSupport063.integerArrayState0111)) {
          BucketBoard.booleanState0109 = true;
        }
        if (RenderingSupport003.booleanState0056) {
          RenderingSupport003.booleanState0056 = false;
          MixedSupport043.booleanState0048 = true;
        }
        if (NetworkSupport004.booleanState0065) {
          SceneWidgetPart007.booleanState0114 = true;
          NetworkSupport004.booleanState0065 = false;
        }
        if (integerArgument2 <= 75) {
          stringState0106 = (String) null;
        }
        UiComponentPart025.performAction1363(booleanArgument1, (byte) -108);
    }

    final static boolean computeBoolean0340(CharSequence charSequenceArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!MixedSupport014.computeBoolean0198(true, charSequenceArgument1, 4564)) {
            return false;
          }
          for (integerLocal1 = 0; charSequenceArgument1.length() > integerLocal1; integerLocal1++) {
            if (!UiComponentPart020.computeBoolean1153(charSequenceArgument1.charAt(integerLocal1), -6237)) {
              return false;
            }
          }
          if (byteArgument2 == -70) {
            return true;
          }
          stringState0106 = (String) null;
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("dc.A(");
          if (charSequenceArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction0338(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        int[] integerArrayLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int[] integerArrayLocal7 = null;
        int[] integerArrayLocal8 = null;
        int integerLocal9 = 0;
        int[] integerArrayLocal10 = null;
        int[] integerArrayLocal11 = null;
        int[] integerArrayLocal12 = null;
        int[] integerArrayLocal13 = null;
        int[] integerArrayLocal14 = null;
        int[] integerArrayLocal15 = null;
        int[] integerArrayLocal16;
        int integerLocal17;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!SceneWidgetPart008.booleanState0123) {
            if (null == MixedSupport025.mixedSupport033State0001) {
              MixedSupport025.mixedSupport033State0001 = MixedSupport015.computeMixedSupport0330201(4, (byte) -115);
            }
            if (MixedSupport025.mixedSupport033State0001.booleanState0041) {
              integerArrayLocal12 = MixedSupport088.integerArrayState0172;
              integerArrayLocal10 = integerArrayLocal12;
              integerArrayLocal7 = integerArrayLocal10;
              integerArrayLocal2 = integerArrayLocal7;
              integerArrayLocal14 = MixedSupport025.mixedSupport033State0001.integerArrayState0042;
              for (integerLocal5 = 0; integerLocal5 < 8; integerLocal5++) {
                integerArrayLocal7[integerLocal5] = UiComponentPart006.bitwiseOr(integerArrayLocal12[integerLocal5], integerArrayLocal14[integerLocal5]);
              }
              integerArrayLocal13 = MixedSupport063.integerArrayState0111;
              integerArrayLocal11 = integerArrayLocal13;
              integerArrayLocal8 = integerArrayLocal11;
              integerArrayLocal16 = integerArrayLocal8;
              integerArrayLocal15 = MixedSupport025.mixedSupport033State0001.integerArrayState0042;
              integerLocal9 = 0;
              integerLocal17 = integerLocal9;
              while (integerLocal9 < 8) {
                integerArrayLocal8[integerLocal9] = MixedSupport075.computeInteger0930(integerArrayLocal13[integerLocal9], ~integerArrayLocal15[integerLocal9]);
                integerLocal9++;
              }
              SceneWidgetPart008.booleanState0123 = true;
              MixedSupport025.mixedSupport033State0001 = null;
            }
          }
          if (!MixedSupport105.booleanState0153) {
            if (null == UiComponentPart019.mixedSupport113State0001) {
              UiComponentPart019.mixedSupport113State0001 = MixedSupport126.computeMixedSupport1131628(1, 5, 0, 107);
            }
            if (UiComponentPart019.mixedSupport113State0001.booleanState0168) {
              integerLocal3 = UiComponentPart019.mixedSupport113State0001.integerArrayState0202[0];
              UiComponentPart019.mixedSupport113State0001 = null;
              MixedSupport105.booleanState0153 = true;
              if (UiComponentPart015.integerState0319 < integerLocal3) {
                UiComponentPart015.integerState0319 = integerLocal3;
              }
            }
          }
          if (integerArgument1 > -59) {
            MixedSupport023.performAction0341(true, 110);
          }
          if (SceneWidgetPart008.booleanState0123 &&
            MixedSupport105.booleanState0153) {
            MixedSupport039.performAction0528((byte) -125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal1 = caughtParameterLocal18;
          runtimeExceptionLocal4 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal4), "dc.D(" + integerArgument1 + ')');
        }
    }

    public static void clearStaticReferences(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return;
        }
        stringState0106 = null;
        stringState0104 = null;
        mixedSupport006State0001 = null;
        validationStatusState0001 = null;
        stringState0105 = null;
        stringState0103 = null;
    }

    static {
        stringState0103 = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        stringState0104 = "Shortcut Reference";
        booleanState0025 = false;
        stringState0105 = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        validationStatusState0001 = new ValidationStatus();
        stringState0106 = "You have withdrawn your request to join.";
    }
}
