/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoftwareFramebuffer extends Framebuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel colorModelState0001;
    static MixedSupport132 mixedSupport132State0011;
    static MixedSupport132 mixedSupport132State0012;
    private java.awt.image.ImageConsumer imageConsumerState0001;
    static String stringState0616;
    static BitmapFont bitmapFontState0021;
    static int[] integerArrayState0259;
    static String stringState0617;
    static RawPcmStream[] rawPcmStreamArrayState0003;
    static String stringState0618;
    static java.awt.Font fontState0001;

    final static void performAction1797(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4) {
        TextFieldValidator.integerState0937 = integerArgument2;
        NetworkSupport004.integerState0266 = integerArgument1;
        MixedSupport143.integerState0918 = integerArgument3;
        if (!booleanArgument4) {
          SoftwareFramebuffer.clearDeclaredStaticReferences(-31);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer imageConsumerArgument1) {
        try {
          this.imageConsumerState0001 = imageConsumerArgument1;
          imageConsumerArgument1.setDimensions(this.integerState0190, this.integerState0191);
          imageConsumerArgument1.setProperties((Hashtable) null);
          imageConsumerArgument1.setColorModel(this.colorModelState0001);
          imageConsumerArgument1.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wf.addConsumer(" + (imageConsumerArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void performAction1802(int integerArgument1) {
        if (integerArgument1 >= -113) {
          this.performAction1802(-60);
        }
        if (null == this.imageConsumerState0001) {
          return;
        }
        this.imageConsumerState0001.setPixels(0, 0, this.integerState0190, this.integerState0191, this.colorModelState0001, this.integerArrayState0040, 0, this.integerState0190);
        this.imageConsumerState0001.imageComplete(2);
    }

    final static SceneWidget computeSceneWidget1800(int integerArgument1) {
        int integerLocal1 = 12 % ((-44 - integerArgument1) / 51);
        return MixedSupport066.sceneWidgetPart010State0003.sceneWidgetState0108;
    }

    final void performAction0424(int integerArgument1, byte byteArgument2, int integerArgument3, java.awt.Component componentArgument4) {
        try {
          this.integerState0190 = integerArgument1;
          this.integerArrayState0040 = new int[1 + integerArgument1 * integerArgument3];
          if (byteArgument2 != 83) {
            stringState0617 = (String) null;
          }
          this.integerState0191 = integerArgument3;
          this.colorModelState0001 = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.imageState0001 = componentArgument4.createImage((java.awt.image.ImageProducer) (this));
          this.performAction1802(-117);
          componentArgument4.prepareImage(this.imageState0001, (java.awt.image.ImageObserver) (this));
          this.performAction1802(-123);
          componentArgument4.prepareImage(this.imageState0001, (java.awt.image.ImageObserver) (this));
          this.performAction1802(byteArgument2 ^ -46);
          componentArgument4.prepareImage(this.imageState0001, (java.awt.image.ImageObserver) (this));
          this.performAction0420((byte) -98);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wf.C(" + integerArgument1 + ',' + byteArgument2 + ',' + integerArgument3 + ',' + (componentArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer imageConsumerArgument1) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer imageConsumerArgument1) {
        return this.imageConsumerState0001 == imageConsumerArgument1;
    }

    public final void startProduction(java.awt.image.ImageConsumer imageConsumerArgument1) {
        try {
          this.addConsumer(imageConsumerArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wf.startProduction(" + (imageConsumerArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(int integerArgument1) {
        fontState0001 = null;
        integerArrayState0259 = null;
        mixedSupport132State0011 = null;
        int integerLocal1 = 4 / ((integerArgument1 - 24) / 42);
        stringState0618 = null;
        stringState0616 = null;
        mixedSupport132State0012 = null;
        rawPcmStreamArrayState0003 = null;
        stringState0617 = null;
        bitmapFontState0021 = null;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer imageConsumerArgument1) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (this.imageConsumerState0001 == imageConsumerArgument1) {
            this.imageConsumerState0001 = null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("wf.removeConsumer(");
          if (imageConsumerArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    final static void performAction1801(int integerArgument1) {
        Throwable caughtExceptionLocal1 = null;
        Object objectLocal2 = null;
        if (MixedSupport033.keyboardInputHandlerState0001 != null) {
          objectLocal2 = MixedSupport033.keyboardInputHandlerState0001;
          synchronized (objectLocal2) {
            MixedSupport033.keyboardInputHandlerState0001 = null;
          }
        }
        if (integerArgument1 < 88) {
          fontState0001 = (java.awt.Font) null;
        }
    }

    final static void performAction1796(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, boolean booleanArgument13, int integerArgument14, int integerArgument15, int integerArgument16) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument2 > integerArgument12) {
          if (integerArgument9 > integerArgument2) {
            NetworkSupport009.performAction1182(integerArgument4, integerArgument8, integerArgument14, integerArgument2, integerArgument5, integerArgument15, integerArgument16, (byte) -105, integerArgument10, integerArgument11, integerArgument3, integerArgument12, SoftwareRaster.integerArrayState0063, integerArgument7, integerArgument9, integerArgument6, integerArgument1);
          } else {
            if (integerArgument9 > integerArgument12) {
              NetworkSupport009.performAction1182(integerArgument10, integerArgument7, integerArgument14, integerArgument9, integerArgument15, integerArgument5, integerArgument11, (byte) -101, integerArgument4, integerArgument16, integerArgument3, integerArgument12, SoftwareRaster.integerArrayState0063, integerArgument8, integerArgument2, integerArgument6, integerArgument1);
            } else {
              NetworkSupport009.performAction1182(integerArgument10, integerArgument1, integerArgument11, integerArgument12, integerArgument3, integerArgument5, integerArgument14, (byte) -120, integerArgument6, integerArgument16, integerArgument15, integerArgument9, SoftwareRaster.integerArrayState0063, integerArgument8, integerArgument2, integerArgument4, integerArgument7);
            }
          }
        } else {
          if (integerArgument12 < integerArgument9) {
            NetworkSupport009.performAction1182(integerArgument4, integerArgument1, integerArgument16, integerArgument12, integerArgument3, integerArgument15, integerArgument14, (byte) -52, integerArgument6, integerArgument11, integerArgument5, integerArgument2, SoftwareRaster.integerArrayState0063, integerArgument7, integerArgument9, integerArgument10, integerArgument8);
          } else {
            if (integerArgument9 > integerArgument2) {
              NetworkSupport009.performAction1182(integerArgument6, integerArgument7, integerArgument16, integerArgument9, integerArgument15, integerArgument3, integerArgument11, (byte) -95, integerArgument4, integerArgument14, integerArgument5, integerArgument2, SoftwareRaster.integerArrayState0063, integerArgument1, integerArgument12, integerArgument10, integerArgument8);
            } else {
              NetworkSupport009.performAction1182(integerArgument6, integerArgument8, integerArgument11, integerArgument2, integerArgument5, integerArgument3, integerArgument16, (byte) -39, integerArgument10, integerArgument14, integerArgument15, integerArgument9, SoftwareRaster.integerArrayState0063, integerArgument1, integerArgument12, integerArgument4, integerArgument7);
            }
          }
        }
        if (!booleanArgument13) {
          mixedSupport132State0011 = (MixedSupport132) null;
        }
    }

    final static boolean computeBoolean1798(boolean booleanArgument1) {
        if (MixedSupport074.booleanState0097) {
          return true;
        }
        if (!EmailFormatValidator.resourceArchiveState0008.computeBoolean0811("benefits", (byte) -75)) {
          return false;
        }
        if (booleanArgument1) {
          return true;
        }
        RgbSprite rgbSpriteLocal1 = UiComponentPart015.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "borders", "benefits", 8192);
        RgbSprite rgbSpriteLocal2 = UiComponentPart015.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "price", "benefits", 8192);
        RgbSprite rgbSpriteLocal3 = UiComponentPart015.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "logo", "benefits", 8192);
        RgbSprite[] rgbSpriteArrayLocal4 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "benefits", "screenshots");
        MixedSupport062.performAction0735(200, rgbSpriteLocal1, UiComponentPart023.stringState0425);
        UiComponentPart015.performAction0703(103, 92, 2, -2400, 35, 13, 8192, rgbSpriteLocal2, 15);
        UiComponentPart014.performAction0697((byte) -108, rgbSpriteArrayLocal4);
        UiComponentPart033.performAction1815(rgbSpriteLocal3, 369179521);
        MixedSupport074.booleanState0097 = true;
        return true;
    }

    final static void performAction1799(int integerArgument1) {
        Object objectLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6 = 0;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          objectLocal1 = MixedSupport033.keyboardInputHandlerState0001;
          synchronized (objectLocal1) {
            if (integerArgument1 != 19012) {
              mixedSupport132State0011 = (MixedSupport132) null;
            }
            MixedSupport115.integerState0746 = RichTextLayout.integerState0160;
            MixedSupport093.integerState0569 = MixedSupport093.integerState0569 + 1;
            if (MixedSupport147.integerState0933 < 0) {
              integerLocal6 = 0;
              integerLocal2 = integerLocal6;
              while (integerLocal6 < 112) {
                MixedSupport011.booleanArrayState0002[integerLocal6] = false;
                integerLocal6++;
              }
              MixedSupport147.integerState0933 = PcmPlayerService.integerState0685;
            } else {
              while (MixedSupport147.integerState0933 != PcmPlayerService.integerState0685) {
                integerLocal2 = MixedSupport074.integerArrayState0141[PcmPlayerService.integerState0685];
                PcmPlayerService.integerState0685 = 1 + PcmPlayerService.integerState0685 & 127;
                if (0 > integerLocal2) {
                  MixedSupport011.booleanArrayState0002[~integerLocal2] = false;
                  continue;
                }
                MixedSupport011.booleanArrayState0002[integerLocal2] = true;
              }
            }
            RichTextLayout.integerState0160 = GameDomainSupport004.integerState0349;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal4 = caughtParameterLocal7;
          runtimeExceptionLocal5 = (RuntimeException) (Object) caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal5), "wf.A(" + integerArgument1 + ')');
        }
    }

    SoftwareFramebuffer() {
    }

    final void performAction0421(byte byteArgument1, java.awt.Graphics graphicsArgument2, int integerArgument3, int integerArgument4) {
        try {
          this.performAction1802(-127);
          graphicsArgument2.drawImage(this.imageState0001, integerArgument3, integerArgument4, (java.awt.image.ImageObserver) (this));
          if (byteArgument1 < 38) {
            java.awt.image.ImageConsumer imageConsumerLocal1 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wf.H(" + byteArgument1 + ',' + (graphicsArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image imageArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("wf.imageUpdate(");
          if (imageArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    static {
        mixedSupport132State0011 = new MixedSupport132();
        stringState0616 = "Loading...";
        mixedSupport132State0012 = new MixedSupport132();
        rawPcmStreamArrayState0003 = new RawPcmStream[8];
        stringState0618 = "Account created successfully!";
    }
}
