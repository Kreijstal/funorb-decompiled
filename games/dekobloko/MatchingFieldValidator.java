/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static String stringState0468;
    static String stringState0469;
    static String[] stringArrayState0037;
    static String stringState0470;
    static int integerState0686;
    static String stringState0471;
    private EditableTextField uiComponentPart028State0006;
    static RgbSprite rgbSpriteState0051;
    static SceneWidget sceneWidgetState0105;

    final String getValidationMessage(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        Object stackObjectLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        FieldValidator callbackContract011Local10 = null;
        try {
          if (byteArgument2 != -11) {
            this.getValidationStatus((String) null, (byte) -68);
          }
          if (this.uiComponentPart028State0006 instanceof FieldValidatorProvider) {
            callbackContract011Local10 = ((FieldValidatorProvider) ((Object) this.uiComponentPart028State0006)).getFieldValidator(byteArgument2 - 78);
            if (callbackContract011Local10 != null) {
              if (callbackContract011Local10.getValidationStatus(20350) == MixedSupport023.validationStatusState0001 &&
                !stringArgument1.equals(this.uiComponentPart028State0006.stringState0078)) {
                stackStringLocal2 = MixedSupport006.stringState0030;
                return stackStringLocal2;
              }
              stackStringLocal3 = callbackContract011Local10.getValidationMessage((byte) 103);
              return stackStringLocal3;
            }
          }
          if (!stringArgument1.equals(this.uiComponentPart028State0006.stringState0078)) {
            stackStringLocal4 = MixedSupport006.stringState0030;
            return stackStringLocal4;
          }
          stackObjectLocal5 = null;
          return (String) (stackObjectLocal5);
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal1;
          stackStringBuilderLocal7 = new StringBuilder().append("re.A(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction1425(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, RgbSprite rgbSpriteArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RgbSprite rgbSpriteLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int[] integerArrayLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int[] integerArrayLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int[] integerArrayLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int stackIntegerLocal20;
        int stackIntegerLocal21;
        integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (SoftwareRaster.integerState0282 > integerArgument3) {
            integerArgument7 = integerArgument7 - (-integerArgument3 + SoftwareRaster.integerState0282);
            integerArgument3 = SoftwareRaster.integerState0282;
          }
          if (SoftwareRaster.integerState0281 < integerArgument3 + integerArgument7) {
            integerArgument7 = -integerArgument3 + SoftwareRaster.integerState0281;
          }
          if (integerArgument6 < SoftwareRaster.integerState0280) {
            integerArgument8 = integerArgument8 - (-integerArgument6 + SoftwareRaster.integerState0280);
            integerArgument6 = SoftwareRaster.integerState0280;
          }
          if (SoftwareRaster.integerState0283 < integerArgument8 + integerArgument6) {
            integerArgument8 = SoftwareRaster.integerState0283 - integerArgument6;
          }
          if (integerArgument7 > 0 &&
            0 < integerArgument8) {
            rgbSpriteLocal7 = rgbSpriteArgument5.computeRgbSprite0277();
            integerArrayLocal9 = SoftwareRaster.integerArrayState0063;
            integerLocal10 = SoftwareRaster.integerState0285;
            integerLocal11 = SoftwareRaster.integerState0284;
            integerArrayLocal12 = new int[4];
            SoftwareRaster.saveClip(integerArrayLocal12);
            rgbSpriteArgument5.performAction0256();
            SoftwareRaster.intersectClip(integerArrayLocal12[0], integerArrayLocal12[1], integerArrayLocal12[integerArgument4], integerArrayLocal12[3]);
            integerLocal13 = integerArgument6 * rgbSpriteArgument5.integerState0258 + integerArgument3;
            integerLocal14 = rgbSpriteArgument5.integerState0258 - integerArgument7;
            integerArrayLocal15 = rgbSpriteLocal7.integerArrayState0024;
            integerLocal16 = integerArgument6;
            while ((integerArgument8 + integerArgument6) > integerLocal16) {
              if (integerLocal19 != 0) {
                return;
              }
              integerLocal17 = integerArgument3;
              while (integerLocal17 < integerArgument7 + integerArgument3) {
                integerLocal18 = integerArrayLocal15[integerLocal13];
                stackIntegerLocal1 = 0;
                stackIntegerLocal2 = integerLocal18;
                if (stackIntegerLocal1 != stackIntegerLocal2 && (0 < integerLocal17 &&
                  integerArrayLocal15[-1 + integerLocal13] == 0 ||
                  integerLocal16 > 0 &&
                  integerArrayLocal15[integerLocal13 - rgbSpriteArgument5.integerState0258] == 0 ||
                  integerLocal17 < (rgbSpriteArgument5.integerState0258 - 1) &&
                  integerArrayLocal15[1 + integerLocal13] == 0 ||
                  !(-1 + rgbSpriteArgument5.integerState0255 <= integerLocal16) &&
                  integerArrayLocal15[rgbSpriteArgument5.integerState0258 + integerLocal13] == 0)) {
                  SoftwareRaster.fillCircle(integerLocal17, integerLocal16, integerArgument1, integerArgument2);
                }
                integerLocal13++;
                integerLocal17++;
              }
              stackIntegerLocal20 = integerLocal13;
              stackIntegerLocal21 = integerLocal14;
              integerLocal13 = stackIntegerLocal20 + stackIntegerLocal21;
              integerLocal16++;
            }
            rgbSpriteLocal7.performAction0278(-rgbSpriteArgument5.integerState0259, -rgbSpriteArgument5.integerState0256);
            SoftwareRaster.setRasterBuffer(integerArrayLocal9, integerLocal10, integerLocal11);
            SoftwareRaster.restoreClip(integerArrayLocal12);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal6 = caughtParameterLocal22;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("re.C(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (rgbSpriteArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    public static void performAction1427(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          stringState0468 = null;
          sceneWidgetState0105 = null;
          if (byteArgument1 >= 0) {
            stringState0471 = (String) null;
          }
          stringArrayState0037 = null;
          stringState0471 = null;
          stringState0469 = null;
          rgbSpriteState0051 = null;
          stringState0470 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "re.M(" + byteArgument1 + ')');
        }
    }

    final static void writeEncryptedBuffer(java.math.BigInteger bigIntegerArgument1, java.math.BigInteger bigIntegerArgument2, PacketBuffer packetBufferArgument3, PacketBuffer packetBufferArgument4, int integerArgument5) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          DisplayModeController.writeEncryptedPayload(integerArgument5, (byte) 115, packetBufferArgument4.position, bigIntegerArgument1, bigIntegerArgument2, packetBufferArgument3, packetBufferArgument4.payload);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeException = caughtExceptionLocal11;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("re.E(");
          if (bigIntegerArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (bigIntegerArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (packetBufferArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (packetBufferArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static boolean computeBoolean1424(int integerArgument1, char characterArgument2, CharSequence charSequenceArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!UiComponentPart020.computeBoolean1153(characterArgument2, -6237)) {
            return false;
          }
          if (null == charSequenceArgument3) {
            return false;
          }
          integerLocal1 = charSequenceArgument3.length();
          if (12 <= integerLocal1) {
            return false;
          }
          if (MixedSupport129.computeBoolean1650(characterArgument2, 32) &&
            0 == integerLocal1) {
            return false;
          }
          integerLocal3 = 110 % ((integerArgument1 - 23) / 47);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("re.D(").append(integerArgument1).append(',').append(characterArgument2).append(',');
          if (charSequenceArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final ValidationStatus getValidationStatus(String stringArgument1, byte byteArgument2) {
        FieldValidator callbackContract011Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        ValidationStatus stackValidationStatusLocal3 = null;
        ValidationStatus stackValidationStatusLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (this.uiComponentPart028State0006 instanceof FieldValidatorProvider) {
            callbackContract011Local1 = ((FieldValidatorProvider) ((Object) this.uiComponentPart028State0006)).getFieldValidator(-87);
            if (callbackContract011Local1 != null &&
              callbackContract011Local1.getValidationStatus(20350) != MixedSupport023.validationStatusState0001) {
              stackValidationStatusLocal3 = ReturnedShapeUpdate.validationStatusState0005;
              return stackValidationStatusLocal3;
            }
          }
          if (byteArgument2 != -40) {
            sceneWidgetState0105 = (SceneWidget) null;
          }
          if (stringArgument1.equals(this.uiComponentPart028State0006.stringState0078)) {
            stackValidationStatusLocal4 = MixedSupport023.validationStatusState0001;
          } else {
            stackValidationStatusLocal4 = ReturnedShapeUpdate.validationStatusState0005;
          }
          return stackValidationStatusLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("re.B(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(')').toString());
        }
    }

    MatchingFieldValidator(EditableTextField uiComponentPart028Argument1, EditableTextField uiComponentPart028Argument2) {
        super(uiComponentPart028Argument1);
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          this.uiComponentPart028State0006 = uiComponentPart028Argument2;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeException = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("re.<init>(");
          if (uiComponentPart028Argument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (uiComponentPart028Argument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static void performAction1426(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, SceneWidget sceneWidgetArgument5, boolean booleanArgument6, SceneWidget sceneWidgetArgument7, SceneWidget sceneWidgetArgument8, BitmapFont bitmapFontArgument9, SceneWidget sceneWidgetArgument10, byte byteArgument11, SceneWidgetPart006 sceneWidgetPart006Argument12) {
        String stackStringLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
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
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        StringBuilder stackStringBuilderLocal21 = null;
        String stackStringLocal22 = null;
        StringBuilder stackStringBuilderLocal23 = null;
        String stackStringLocal24 = null;
        RuntimeException caughtExceptionLocal25 = null;
        RgbSprite rgbSpriteLocal26 = null;
        RuntimeException runtimeExceptionLocal27 = null;
        int[] integerArrayLocal28 = null;
        int[] integerArrayLocal29 = null;
        int[] integerArrayLocal30 = null;
        RgbSprite[] rgbSpriteArrayLocal31 = null;
        SceneWidget sceneWidgetLocal32 = null;
        int integerLocal33 = 0;
        String stringLocal34 = null;
        int integerLocal35 = 0;
        integerLocal35 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[1] = 6356832;
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[0] = 16764000;
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[3] = 16736511;
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[4] = 16711935;
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[2] = 9474303;
          MixedSupport040.sceneWidgetState0032 = sceneWidgetArgument2;
          EmailFormatValidator.booleanState0077 = booleanArgument6;
          MixedSupport038.bitmapFontState0013 = bitmapFontArgument9;
          MixedSupport131.integerArrayState0234[0] = 16764000;
          ConfirmedEmailAvailabilityValidator.integerArrayState0207[4] = 16711935;
          MixedSupport131.integerArrayState0234[3] = 16736511;
          MixedSupport131.integerArrayState0234[2] = 16736352;
          MixedSupport131.integerArrayState0234[1] = 6356832;
          MixedSupport061.integerState0332 = 8421504;
          rgbSpriteLocal26 = new RgbSprite(4, 4);
          integerArrayLocal28 = rgbSpriteLocal26.integerArrayState0024;
          integerArrayLocal29 = rgbSpriteLocal26.integerArrayState0024;
          integerArrayLocal30 = rgbSpriteLocal26.integerArrayState0024;
          rgbSpriteLocal26.integerArrayState0024[15] = 7368816;
          integerArrayLocal30[8] = 7368816;
          integerArrayLocal29[5] = 7368816;
          integerArrayLocal28[2] = 7368816;
          rgbSpriteArrayLocal31 = new RgbSprite[9];
          rgbSpriteArrayLocal31[4] = rgbSpriteLocal26;
          RichTextLayout.sceneWidgetState0021 = new SceneWidget(0L, sceneWidgetArgument7);
          sceneWidgetState0105 = new SceneWidget(0L, sceneWidgetArgument8);
          RichTextLayout.sceneWidgetState0021.performAction1768(sceneWidgetState0105, -16834);
          sceneWidgetLocal32 = new SceneWidget(0L, (SceneWidget) null);
          sceneWidgetLocal32.nodeDequeState0034 = new NodeDeque();
          NanoFrameTimer.sceneWidgetPart008State0001 = new SceneWidgetPart008(0L, sceneWidgetLocal32, sceneWidgetArgument5, sceneWidgetPart006Argument12);
          sceneWidgetState0105.performAction1768(NanoFrameTimer.sceneWidgetPart008State0001, -16834);
          MixedSupport116.sceneWidgetState0111 = new SceneWidget(0L, sceneWidgetArgument1);
          sceneWidgetState0105.performAction1768(MixedSupport116.sceneWidgetState0111, -16834);
          UiComponentPart033.sceneWidgetState0150 = new SceneWidget(0L, sceneWidgetArgument3);
          UiComponentPart033.sceneWidgetState0150.bitmapFontState0020 = MixedSupport038.bitmapFontState0013;
          MixedSupport116.sceneWidgetState0111.performAction1768(UiComponentPart033.sceneWidgetState0150, -16834);
          MixedSupport116.sceneWidgetState0111.performAction1774(-25);
          DiagnosticSupport002.sceneWidgetState0057 = new SceneWidget(0L, (SceneWidget) null);
          DiagnosticSupport002.sceneWidgetState0057.rgbSpriteArrayState0033 = rgbSpriteArrayLocal31;
          MixedSupport116.sceneWidgetState0111.performAction1768(DiagnosticSupport002.sceneWidgetState0057, -16834);
          ClientException.sceneWidgetArrayState0001 = new SceneWidget[5];
          MusicTrack.sceneWidgetArrayState0007 = new SceneWidget[5];
          NodeHashTable.sceneWidgetArrayState0004 = new SceneWidget[5];
          MixedSupport076.sceneWidgetArrayState0002 = new SceneWidget[5];
          integerLocal33 = 0;
          boolean naturalLoopExitLocal36 = false;
          while (!(naturalLoopExitLocal36 = (integerLocal33 >= 5))) {
            stackIntegerLocal2 = ~integerLocal33;
            stackIntegerLocal3 = -1;
            if (integerLocal35 == 0) {
              boolean frameRemainderLocal37 = true;
              if (stackIntegerLocal2 == stackIntegerLocal3) {
                if (EmailFormatValidator.booleanState0077) {
                  stackStringLocal1 = MixedSupport127.stringState0554;
                } else {
                  stackStringLocal1 = MixedSupport106.stringState0457;
                }
                stringLocal34 = stackStringLocal1;
              } else if (1 != integerLocal33 ||
                !EmailFormatValidator.booleanState0077) {
                frameRemainderLocal37 = (2 == integerLocal33);
                if (frameRemainderLocal37) {
                  stringLocal34 = MixedSupport116.stringState0512;
                }
              } else {
                stringLocal34 = MixedSupport031.stringState0152;
              }
              if (frameRemainderLocal37) {
                ClientException.sceneWidgetArrayState0001[integerLocal33] = new SceneWidget(0L, sceneWidgetArgument4);
                MusicTrack.sceneWidgetArrayState0007[integerLocal33] = new SceneWidget(0L, MixedSupport040.sceneWidgetState0032, stringLocal34);
                NodeHashTable.sceneWidgetArrayState0004[integerLocal33] = new SceneWidget(0L, (SceneWidget) null);
                NodeHashTable.sceneWidgetArrayState0004[integerLocal33].integerState0885 = 1;
                MixedSupport076.sceneWidgetArrayState0002[integerLocal33] = new SceneWidget(0L, MixedSupport040.sceneWidgetState0032);
                MixedSupport076.sceneWidgetArrayState0002[integerLocal33].integerState0885 = 1;
                ClientException.sceneWidgetArrayState0001[integerLocal33].performAction1768(MusicTrack.sceneWidgetArrayState0007[integerLocal33], -16834);
                ClientException.sceneWidgetArrayState0001[integerLocal33].performAction1768(NodeHashTable.sceneWidgetArrayState0004[integerLocal33], byteArgument11 - 16937);
                ClientException.sceneWidgetArrayState0001[integerLocal33].performAction1768(MixedSupport076.sceneWidgetArrayState0002[integerLocal33], -16834);
                ClientException.sceneWidgetArrayState0001[integerLocal33].performAction1774(-64);
                RichTextLayout.sceneWidgetState0021.performAction1768(ClientException.sceneWidgetArrayState0001[integerLocal33], byteArgument11 ^ -16807);
                ClientException.integerState0140 = ClientException.integerState0140 + 1;
              }
              integerLocal33++;
              continue;
            }
            break;
          }
          if (naturalLoopExitLocal36) {
            stackIntegerLocal2 = byteArgument11;
            stackIntegerLocal3 = 103;
          }
          if (stackIntegerLocal2 != stackIntegerLocal3) {
            MatchingFieldValidator.performAction1427((byte) -47);
          }
          NetworkArchiveRequestManager.sceneWidgetState0098 = new SceneWidget(0L, sceneWidgetArgument10);
          NetworkArchiveRequestManager.sceneWidgetState0098.stringState0598 = BoundedRandomAccessFile.stringState0231;
          RichTextLayout.sceneWidgetState0021.performAction1768(NetworkArchiveRequestManager.sceneWidgetState0098, -16834);
          if (NodeHashTable.computeBoolean1506(-12851) &&
            !MixedSupport144.booleanState0221) {
            return;
          }
          MixedSupport009.uiComponentPart019State0001 = new UiComponentPart019(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal38) {
          caughtExceptionLocal25 = caughtParameterLocal38;
          runtimeExceptionLocal27 = caughtExceptionLocal25;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal27;
          stackStringBuilderLocal5 = new StringBuilder().append("re.L(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',');
          if (sceneWidgetArgument5 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          stackStringBuilderLocal15 = ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(booleanArgument6).append(',');
          if (sceneWidgetArgument7 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          stackStringBuilderLocal17 = ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',');
          if (sceneWidgetArgument8 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',');
          if (bitmapFontArgument9 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          stackStringBuilderLocal21 = ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',');
          if (sceneWidgetArgument10 == null) {
            stackStringLocal22 = "null";
          } else {
            stackStringLocal22 = "{...}";
          }
          stackStringBuilderLocal23 = ((StringBuilder) (Object) stackStringBuilderLocal21).append(stackStringLocal22).append(',').append(byteArgument11).append(',');
          if (sceneWidgetPart006Argument12 == null) {
            stackStringLocal24 = "null";
          } else {
            stackStringLocal24 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal23).append(stackStringLocal24).append(')').toString());
        }
    }

    static {
        stringState0469 = "Theme:";
        stringState0470 = "Error connecting to server. Please try using a different server.";
        stringState0468 = "Fullscreen";
        stringState0471 = "Quick Chat lobby";
        stringArrayState0037 = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
