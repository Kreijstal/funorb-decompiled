/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeController {
    private int integerState0699;
    static int integerState0700;
    private int integerState0701;
    private int integerState0702;
    private int integerState0703;
    static String[] stringArrayState0038;
    private float floatState0004;
    private CallbackContract017 callbackContract017State0001;
    private int integerState0704;
    private int integerState0705;
    static String stringState0479;
    private boolean booleanState0163;
    private int integerState0706;
    private int integerState0707;
    private int integerState0708;
    private int integerState0709;
    private int integerState0710;
    private int integerState0711;
    private int integerState0712;
    private int integerState0713;
    private int integerState0714;

    final static boolean computeBoolean1437(int integerArgument1) {
        int integerLocal1 = -44 / ((-56 - integerArgument1) / 32);
        return BirthDateInput.booleanState0198;
    }

    final static String computeString1440(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4) {
        int integerLocal1;
        integerLocal1 = integerArgument1;
        if (booleanArgument4) {
          integerLocal1 += 4;
        }
        if (booleanArgument3) {
          integerLocal1 += 2;
        }
        if (!booleanArgument2) {
          return MixedSupport062.stringArrayState0014[integerLocal1];
        }
        integerLocal1++;
        return MixedSupport062.stringArrayState0014[integerLocal1];
    }

    final static void writeEncryptedPayload(int integerArgument1, byte byteArgument2, int integerArgument3, java.math.BigInteger bigIntegerArgument4, java.math.BigInteger bigIntegerArgument5, PacketBuffer packetBufferArgument6, byte[] byteArrayArgument7) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int[] integerArrayLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int[] integerArrayLocal17 = null;
        int[] integerArrayLocal18 = null;
        int integerLocal19;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = SceneWidgetPart003.computeInteger0608(integerArgument3, (byte) -126);
          if (EditableTextField.secureRandomState0001 == null) {
            EditableTextField.secureRandomState0001 = new java.security.SecureRandom();
          }
          integerArrayLocal18 = new int[4];
          integerArrayLocal17 = integerArrayLocal18;
          integerArrayLocal13 = integerArrayLocal17;
          for (integerLocal14 = 0; 4 > integerLocal14; integerLocal14++) {
            integerArrayLocal13[integerLocal14] = EditableTextField.secureRandomState0001.nextInt();
          }
          if (null == AlphaWidgetContainer.packetBufferState0004 ||
            !(integerLocal11 <= AlphaWidgetContainer.packetBufferState0004.payload.length)) {
            AlphaWidgetContainer.packetBufferState0004 = new PacketBuffer(integerLocal11);
          }
          AlphaWidgetContainer.packetBufferState0004.position = 0;
          if (byteArgument2 < 101) {
            return;
          }
          AlphaWidgetContainer.packetBufferState0004.writeBytes(false, integerArgument3, byteArrayArgument7, integerArgument1);
          AlphaWidgetContainer.packetBufferState0004.padToLength(102, integerLocal11);
          AlphaWidgetContainer.packetBufferState0004.xteaEncrypt((byte) -105, integerArrayLocal18);
          if (DebouncedFieldValidator.packetBufferState0001 == null ||
            !(100 <= DebouncedFieldValidator.packetBufferState0001.payload.length)) {
            DebouncedFieldValidator.packetBufferState0001 = new PacketBuffer(100);
          }
          DebouncedFieldValidator.packetBufferState0001.position = 0;
          DebouncedFieldValidator.packetBufferState0001.writeByte(true, 10);
          integerLocal16 = 0;
          integerLocal19 = integerLocal16;
          while (4 > integerLocal16) {
            DebouncedFieldValidator.packetBufferState0001.writeInt(integerArrayLocal18[integerLocal16], false);
            integerLocal16++;
          }
          DebouncedFieldValidator.packetBufferState0001.writeShort(-1, integerArgument3);
          DebouncedFieldValidator.packetBufferState0001.rsaEncrypt(bigIntegerArgument5, bigIntegerArgument4, true);
          packetBufferArgument6.writeBytes(false, DebouncedFieldValidator.packetBufferState0001.position, DebouncedFieldValidator.packetBufferState0001.payload, 0);
          packetBufferArgument6.writeBytes(false, AlphaWidgetContainer.packetBufferState0004.position, AlphaWidgetContainer.packetBufferState0004.payload, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal10 = caughtParameterLocal20;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal12;
          stackStringBuilderLocal2 = new StringBuilder().append("ri.B(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
          if (bigIntegerArgument4 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (bigIntegerArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (packetBufferArgument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (byteArrayArgument7 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final FullscreenCanvas enterFullscreen(int integerArgument1) {
        FullscreenCanvas fullscreenCanvasLocal1 = null;
        FullscreenCanvas fullscreenCanvasLocal2;
        if (integerArgument1 == 27134) {
          this.integerState0701 = MixedSupport090.integerState0548;
          this.integerState0702 = LabeledWidgetContainer.integerState0133;
          this.callbackContract017State0001.performAction1613(-4328, this.integerState0709, this.integerState0699);
          LoginCredentials.booleanState0086 = false;
          fullscreenCanvasLocal1 = InputAdapter003.createFullscreenCanvas(this.integerState0699, GzipDecompressor.platformServiceState0003, 0, 0, 67, this.integerState0709);
          if (fullscreenCanvasLocal1 == null) {
            this.restorePreviousSize((byte) -60);
          }
          return fullscreenCanvasLocal1;
        }
        DisplayModeController.computeBoolean1437(-14);
        this.integerState0701 = MixedSupport090.integerState0548;
        this.integerState0702 = LabeledWidgetContainer.integerState0133;
        this.callbackContract017State0001.performAction1613(-4328, this.integerState0709, this.integerState0699);
        LoginCredentials.booleanState0086 = false;
        fullscreenCanvasLocal2 = InputAdapter003.createFullscreenCanvas(this.integerState0699, GzipDecompressor.platformServiceState0003, 0, 0, 67, this.integerState0709);
        if (fullscreenCanvasLocal2 == null) {
          this.restorePreviousSize((byte) -60);
        }
        return fullscreenCanvasLocal2;
    }

    final void updateSize(boolean booleanArgument1) {
        int integerLocal1 = 0;
        if (null != MixedSupport020.fullscreenCanvasState0001) {
          return;
        }
        if (Framebuffer.integerState0192 <= 0) {
          this.booleanState0163 = false;
        }
        if (this.booleanState0163) {
          integerLocal1 = this.integerState0713 - 1;
          this.integerState0713 = this.integerState0713 - 1;
          if (integerLocal1 > 0) {
            return;
          }
          this.integerState0713 = this.integerState0712;
          if (this.integerState0708 > DualNodeDeque.integerState0015) {
            this.booleanState0163 = false;
          } else {
            this.applyRequestedSize(60);
            if (booleanArgument1) {
              DisplayModeController.performAction1438(-99, -30, 116, 96, -46, -122);
            }
          }
          return;
        }
        if (LabeledWidgetContainer.integerState0133 < this.integerState0704) {
          IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
        } else {
          if (this.integerState0704 > 0) {
            IconLabelWidget.integerState0648 = 0;
          }
        }
        if (this.integerState0703 == LabeledWidgetContainer.integerState0133 &&
          MixedSupport090.integerState0548 == this.integerState0706) {
          return;
        }
        this.callbackContract017State0001.performAction1613(-4328, this.integerState0706, this.integerState0703);
    }

    private final void applyRequestedSize(int integerArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = this.integerState0704;
        integerLocal2 = this.integerState0711;
        if (!this.canResize(integerArgument1 - 60)) {
          this.booleanState0163 = false;
          return;
        }
        if (integerLocal1 > this.integerState0710) {
          integerLocal1 = this.integerState0710;
        } else {
          if (integerLocal1 < this.integerState0705) {
            integerLocal1 = this.integerState0705;
          }
        }
        if (integerLocal2 > this.integerState0707) {
          integerLocal2 = this.integerState0707;
        } else {
          if (this.integerState0714 > integerLocal2) {
            integerLocal2 = this.integerState0714;
            if (!(0.0f < this.floatState0004)) {
              if (LabeledWidgetContainer.integerState0133 != integerLocal1) {
                this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
              } else {
                if (MixedSupport090.integerState0548 != integerLocal2) {
                  this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
                }
              }
              if (integerArgument1 != 60) {
                DisplayModeController.clearStaticReferences((byte) 59);
              }
              if (this.integerState0704 > 0) {
                IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
              }
              return;
            }
            integerLocal3 = (int)((float)integerLocal2 * this.floatState0004 + 0.5f);
            if (integerLocal3 <= integerLocal1) {
              if (integerLocal1 > integerLocal3) {
                integerLocal1 = integerLocal3;
              }
            } else {
              integerLocal2 = (int)((float)integerLocal1 / this.floatState0004);
            }
            if (LabeledWidgetContainer.integerState0133 != integerLocal1) {
              this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
            } else {
              if (MixedSupport090.integerState0548 != integerLocal2) {
                this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
              }
            }
            if (integerArgument1 != 60) {
              DisplayModeController.clearStaticReferences((byte) 59);
            }
            if (this.integerState0704 > 0) {
              IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
            }
            return;
          }
        }
        if (!(0.0f < this.floatState0004)) {
          if (LabeledWidgetContainer.integerState0133 != integerLocal1 ||
            MixedSupport090.integerState0548 != integerLocal2) {
            this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
            if (integerArgument1 == 60) {
              if (this.integerState0704 <= 0) {
                return;
              }
              IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
              return;
            }
            DisplayModeController.clearStaticReferences((byte) 59);
            if (this.integerState0704 > 0) {
              IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
            }
            return;
          }
        } else {
          integerLocal5 = (int)((float)integerLocal2 * this.floatState0004 + 0.5f);
          if (integerLocal5 > integerLocal1) {
            integerLocal2 = (int)((float)integerLocal1 / this.floatState0004);
            if (LabeledWidgetContainer.integerState0133 != integerLocal1 ||
              MixedSupport090.integerState0548 != integerLocal2) {
              this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
            }
          } else {
            if (integerLocal1 > integerLocal5) {
              integerLocal1 = integerLocal5;
            }
            if (LabeledWidgetContainer.integerState0133 != integerLocal1) {
              this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
            } else {
              if (MixedSupport090.integerState0548 != integerLocal2) {
                this.callbackContract017State0001.performAction1613(-4328, integerLocal2, integerLocal1);
              }
            }
          }
        }
        if (integerArgument1 != 60) {
          DisplayModeController.clearStaticReferences((byte) 59);
        }
        if (this.integerState0704 <= 0) {
          return;
        }
        IconLabelWidget.integerState0648 = (this.integerState0704 - LabeledWidgetContainer.integerState0133) / 2;
    }

    final static void performAction1439(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (80 <= integerArgument2) {
            stackIntegerLocal2 = 54;
          } else {
            stackIntegerLocal2 = integerArgument2 / 20 * 18;
          }
          integerLocal4 = stackIntegerLocal2;
          integerLocal6 = 0;
          if (integerArgument2 >= 60) {
            if (integerArgument2 < 80) {
              integerLocal4 = integerLocal4 + Bzip2State.computeInteger1754(23841, 80, 40 + integerArgument6 * 18);
            } else {
              if (integerArgument2 >= 93) {
                SoftwareRaster.fillRoundedRectangleAlpha(-30 + integerArgument5, 54 + integerArgument1 - 2, 60, 40, 4, 65280, 100);
              } else {
                integerLocal6 = Bzip2State.computeInteger1754(23841, 80, 40 + LobbyRoomRow.integerArrayState0239[1 + integerArgument2 - 80] * 18);
              }
            }
          } else {
            integerLocal4 = integerLocal4 + Bzip2State.computeInteger1754(23841, 80, integerArgument3 * 18 + 40);
          }
          if (integerArgument4 >= -57) {
            integerState0700 = -11;
          }
          for (integerLocal1 = 0; integerLocal1 < 3; integerLocal1++) {
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument7][1].drawScaled(integerLocal1 * 18 - 27 + integerArgument5, 72 + integerArgument1, 18, 18);
          }
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument7][1].drawScaled(integerArgument5 - 27 + 36, integerLocal6 + integerLocal4 + integerArgument1, 18, -integerLocal6 + 18);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal3 = caughtParameterLocal8;
          runtimeExceptionLocal5 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal5), "ri.G(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    final static void performAction1438(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        ProxyAuthenticationRequiredException.integerArrayState0030[ValidatedTextField.integerState0556] = integerArgument1;
        MixedSupport017.integerArrayState0022[ValidatedTextField.integerState0556] = ValidatedTextField.integerState0556;
        ResourceSupport001.integerArrayState0012[ValidatedTextField.integerState0556] = integerArgument4;
        if (RenderingSupport003.integerState0252 > integerArgument4) {
          UiComponentPart019.integerState0504 = integerArgument4;
        }
        if (integerArgument4 <= MixedSupport010.integerState0066) {
          MixedSupport089.integerArrayState0173[ValidatedTextField.integerState0556] = integerArgument2;
          MixedSupport080.integerArrayState0150[ValidatedTextField.integerState0556] = integerArgument5;
          ByteStorage.integerArrayState0157[ValidatedTextField.integerState0556] = integerArgument6;
          integerLocal3 = integerArgument6 + (integerArgument5 + integerArgument2);
          if (~integerLocal3 == integerArgument3) {
            stackIntegerLocal2 = 0;
          } else {
            stackIntegerLocal2 = integerArgument2 * 1000 / integerLocal3;
          }
          integerLocal4 = stackIntegerLocal2;
          NineSliceSprite.integerArrayState0020[ValidatedTextField.integerState0556] = integerLocal4;
          ValidatedTextField.integerState0556 = ValidatedTextField.integerState0556 + 1;
          if (ReturnedShape.integerState0695 < integerLocal4) {
            ReturnedShape.integerState0695 = integerLocal4;
          }
          if (UiComponentPart019.integerState0504 <= integerLocal4) {
            return;
          }
          UiComponentPart019.integerState0504 = integerLocal4;
          return;
        }
        ReturnedShape.integerState0695 = integerArgument4;
        MixedSupport089.integerArrayState0173[ValidatedTextField.integerState0556] = integerArgument2;
        MixedSupport080.integerArrayState0150[ValidatedTextField.integerState0556] = integerArgument5;
        ByteStorage.integerArrayState0157[ValidatedTextField.integerState0556] = integerArgument6;
        integerLocal5 = integerArgument6 + (integerArgument5 + integerArgument2);
        if (~integerLocal5 == integerArgument3) {
          stackIntegerLocal1 = 0;
        } else {
          stackIntegerLocal1 = integerArgument2 * 1000 / integerLocal5;
        }
        integerLocal6 = stackIntegerLocal1;
        NineSliceSprite.integerArrayState0020[ValidatedTextField.integerState0556] = integerLocal6;
        ValidatedTextField.integerState0556 = ValidatedTextField.integerState0556 + 1;
        if (ReturnedShape.integerState0695 < integerLocal6) {
          ReturnedShape.integerState0695 = integerLocal6;
        }
        if (UiComponentPart019.integerState0504 <= integerLocal6) {
          return;
        }
        UiComponentPart019.integerState0504 = integerLocal6;
    }

    final boolean canResize(int integerArgument1) {
        if (integerArgument1 != 0) {
          this.callbackContract017State0001 = (CallbackContract017) null;
          if (DualNodeDeque.integerState0015 < this.integerState0708) {
            return false;
          }
          if (0 < Framebuffer.integerState0192) {
            return true;
          }
          return false;
        }
        if (DualNodeDeque.integerState0015 < this.integerState0708) {
          return false;
        }
        if (0 < Framebuffer.integerState0192) {
          return true;
        }
        return false;
    }

    final void setRequestedSize(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        this.integerState0711 = integerArgument3;
        this.integerState0704 = integerArgument1;
        if (booleanArgument2) {
          this.enterFullscreen(-56);
        }
    }

    final void restorePreviousSize(byte byteArgument1) {
        if (byteArgument1 <= -49) {
          this.callbackContract017State0001.performAction1613(-4328, this.integerState0701, this.integerState0702);
          return;
        }
        this.integerState0712 = -34;
        this.callbackContract017State0001.performAction1613(-4328, this.integerState0701, this.integerState0702);
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringArrayState0038 = null;
        stringState0479 = null;
        if (byteArgument1 != -91) {
          byte[] byteArrayLocal1 = (byte[]) null;
          DisplayModeController.writeEncryptedPayload(-34, (byte) -93, 92, (java.math.BigInteger) null, (java.math.BigInteger) null, (PacketBuffer) null, (byte[]) null);
        }
    }

    private DisplayModeController() throws Throwable {
        throw new Error();
    }

    static {
        stringState0479 = "DRAW!";
        stringArrayState0038 = new String[8];
        stringArrayState0038[0] = "fruit";
        stringArrayState0038[3] = "bugs";
        stringArrayState0038[5] = "undersea";
        stringArrayState0038[4] = "flowers";
        stringArrayState0038[1] = "animals";
        stringArrayState0038[7] = "eightbit";
        stringArrayState0038[6] = "city";
        stringArrayState0038[2] = "breakfast";
    }
}
