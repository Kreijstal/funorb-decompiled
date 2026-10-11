/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RenderingSupport001 extends HashNode {
    static SceneWidget sceneWidgetState0004;
    byte[] byteArrayState0003;
    static NetworkSupport002 networkSupport002State0001;
    static Random randomState0001;
    int integerState0063;
    long longState0004;
    static int integerState0064;
    static String stringState0045;
    static RawSound rawSoundState0002;
    static int integerState0065;
    static SceneWidget sceneWidgetState0005;
    static RawSound rawSoundState0003;

    final static void performAction0148(int integerArgument1, boolean booleanArgument2, int integerArgument3, String stringArgument4, java.awt.Color colorArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        Throwable caughtExceptionLocal6 = null;
        Exception exceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        Exception exceptionLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        java.awt.Graphics graphicsLocal12 = null;
        java.awt.Graphics graphicsLocal13 = null;
        try {
          try {
            graphicsLocal12 = GameDomainSupport004.canvasState0001.getGraphics();
            if (SoftwareFramebuffer.fontState0001 == null) {
              SoftwareFramebuffer.fontState0001 = new java.awt.Font("Helvetica", 1, 13);
            }
            if (booleanArgument2) {
              graphicsLocal12.setColor(java.awt.Color.black);
              graphicsLocal12.fillRect(0, 0, UiComponentPart006.integerState0133, MixedSupport095.integerState0548);
            }
            if (colorArgument5 == null) {
              colorArgument5 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == MixedSupport082.imageState0002) {
                MixedSupport082.imageState0002 = GameDomainSupport004.canvasState0001.createImage(304, 34);
              }
              graphicsLocal13 = MixedSupport082.imageState0002.getGraphics();
              graphicsLocal13.setColor(colorArgument5);
              graphicsLocal13.drawRect(0, 0, 303, 33);
              graphicsLocal13.fillRect(2, 2, 3 * integerArgument1, 30);
              graphicsLocal13.setColor(java.awt.Color.black);
              graphicsLocal13.drawRect(1, 1, 301, 31);
              graphicsLocal13.fillRect(integerArgument1 * 3 + 2, 2, 300 - integerArgument1 * 3, 30);
              graphicsLocal13.setFont(SoftwareFramebuffer.fontState0001);
              graphicsLocal13.setColor(java.awt.Color.white);
              graphicsLocal13.drawString(stringArgument4, (-(integerArgument3 * stringArgument4.length()) + 304) / 2, 22);
              graphicsLocal12.drawImage(MixedSupport082.imageState0002, UiComponentPart006.integerState0133 / 2 - 152, MixedSupport095.integerState0548 / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception caughtParameterLocal14) {
              caughtExceptionLocal6 = caughtParameterLocal14;
              exceptionLocal9 = (Exception) (Object) caughtExceptionLocal6;
              integerLocal10 = -152 + UiComponentPart006.integerState0133 / 2;
              integerLocal11 = MixedSupport095.integerState0548 / 2 - 18;
              graphicsLocal12.setColor(colorArgument5);
              graphicsLocal12.drawRect(integerLocal10, integerLocal11, 303, 33);
              graphicsLocal12.fillRect(2 + integerLocal10, integerLocal11 + 2, integerArgument1 * 3, 30);
              graphicsLocal12.setColor(java.awt.Color.black);
              graphicsLocal12.drawRect(1 + integerLocal10, integerLocal11 + 1, 301, 31);
              graphicsLocal12.fillRect(2 + (integerLocal10 + 3 * integerArgument1), 2 + integerLocal11, 300 - integerArgument1 * 3, 30);
              graphicsLocal12.setFont(SoftwareFramebuffer.fontState0001);
              graphicsLocal12.setColor(java.awt.Color.white);
              graphicsLocal12.drawString(stringArgument4, integerLocal10 + (304 - 6 * stringArgument4.length()) / 2, 22 + integerLocal11);
            }
            if (null != MixedSupport126.stringState0526) {
              graphicsLocal12.setFont(SoftwareFramebuffer.fontState0001);
              graphicsLocal12.setColor(java.awt.Color.white);
              graphicsLocal12.drawString(MixedSupport126.stringState0526, UiComponentPart006.integerState0133 / 2 - 6 * MixedSupport126.stringState0526.length() / 2, MixedSupport095.integerState0548 / 2 - 26);
            }
          } catch (java.lang.Exception caughtParameterLocal15) {
            caughtExceptionLocal6 = caughtParameterLocal15;
            exceptionLocal7 = (Exception) (Object) caughtExceptionLocal6;
            GameDomainSupport004.canvasState0001.repaint();
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal6 = caughtParameterLocal16;
          runtimeExceptionLocal8 = (RuntimeException) (Object) caughtExceptionLocal6;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal8;
          stackStringBuilderLocal2 = new StringBuilder().append("bf.B(").append(integerArgument1).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (colorArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static int computeInteger0146(byte byteArgument1, MixedSupport076 mixedSupport076Argument2, int integerArgument3, MixedSupport072 mixedSupport072Argument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (mixedSupport072Argument4 != null &&
            null != mixedSupport072Argument4.integerArrayArrayState0014 &&
            mixedSupport076Argument2 != null &&
            mixedSupport076Argument2.integerState0414 == mixedSupport072Argument4.integerState0358) {
            integerLocal13 = mixedSupport076Argument2.integerArrayState0139.length;
            if (byteArgument1 != 107) {
              stackIntegerLocal4 = -88;
              return stackIntegerLocal4;
            }
            integerLocal15 = mixedSupport072Argument4.integerArrayArrayState0014[integerArgument3].length / integerLocal13;
            for (integerLocal1 = 0; integerLocal15 > integerLocal1; integerLocal1++) {
              boolean frameCompletedLocal17 = true;
              if (mixedSupport072Argument4.longArrayArrayState0001[integerArgument3][integerLocal1] == mixedSupport076Argument2.longState0024 &&
                MixedSupport070.computeBoolean0943(mixedSupport072Argument4.stringArrayArrayState0004[integerArgument3][integerLocal1], true)) {
                for (integerLocal2 = 0; integerLocal2 < integerLocal13; integerLocal2++) {
                  if (mixedSupport072Argument4.integerArrayArrayState0014[integerArgument3][integerLocal13 * integerLocal1 + integerLocal2] != mixedSupport076Argument2.integerArrayState0139[integerLocal2]) {
                    frameCompletedLocal17 = false;
                    break;
                  }
                }
                if (frameCompletedLocal17) {
                  stackIntegerLocal5 = integerLocal1;
                  return stackIntegerLocal5;
                }
              }
            }
            stackIntegerLocal6 = -1;
            return stackIntegerLocal6;
          }
          stackIntegerLocal3 = -1;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal12 = caughtParameterLocal18;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal14;
          stackStringBuilderLocal8 = new StringBuilder().append("bf.D(").append(byteArgument1).append(',');
          if (mixedSupport076Argument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(',');
          if (mixedSupport072Argument4 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    public static void performAction0147(int integerArgument1) {
        rawSoundState0003 = null;
        stringState0045 = null;
        sceneWidgetState0005 = null;
        randomState0001 = null;
        sceneWidgetState0004 = null;
        if (integerArgument1 >= -38) {
          return;
        }
        networkSupport002State0001 = null;
        rawSoundState0002 = null;
    }

    final static void performAction0151(byte byteArgument1) {
        MixedSupport048.sceneWidgetState0041.performAction1994(RenderingSupport004.sceneWidgetState0039.integerState0896 - (!MixedSupport102.booleanState0133 ? 0 : 44 + MixedSupport146.integerState0855), 0, 0, 18, 0);
        int integerLocal1 = 44 / ((-28 - byteArgument1) / 43);
        MixedSupport076.sceneWidgetState0071.performAction1994(MixedSupport146.integerState0855 + 42, 0, 0, 18, -2 + RenderingSupport004.sceneWidgetState0039.integerState0896 - MixedSupport146.integerState0855 - 40);
        GameDomainSupport002.sceneWidgetPart008State0002.performAction1289(6, 20, MixedSupport146.integerState0855, 0, -20 + RenderingSupport004.sceneWidgetState0039.integerState0915, RenderingSupport004.sceneWidgetState0039.integerState0896, 2);
    }

    final static void performAction0150(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != -20861) {
          return;
        }
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
        cipherPacketBufferLocal1.performAction2073(true, 1);
        cipherPacketBufferLocal1.performAction2073(true, 0);
    }

    final static void performAction0149(boolean booleanArgument1) {
        ClientException.stringArrayState0006 = null;
        MixedSupport040.booleanState0046 = booleanArgument1 ? true : false;
        UiComponentPart032.stringArrayState0051 = null;
        SceneWidgetPart014.stringArrayState0057 = null;
        MixedSupport127.stringArrayState0047 = null;
    }

    RenderingSupport001(long longArgument1, int integerArgument2, byte[] byteArrayArgument3) {
        try {
          this.byteArrayState0003 = byteArrayArgument3;
          this.integerState0063 = integerArgument2;
          this.longState0004 = longArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bf.<init>(" + longArgument1 + ',' + integerArgument2 + ',' + (byteArrayArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        randomState0001 = new Random();
        stringState0045 = "Invalid date";
    }
}
