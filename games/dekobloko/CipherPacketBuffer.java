/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CipherPacketBuffer extends PacketBuffer {
    private int integerState0797;
    private MixedSupport030 mixedSupport030State0002;
    private int integerState0798;
    static int integerState0799;
    static NodeDeque nodeDequeState0033;
    static RgbSprite rgbSpriteState0061;
    static String stringState0558;
    static RgbSprite[] rgbSpriteArrayState0030;
    static String[] stringArrayState0049;

    CipherPacketBuffer(byte[] byteArrayArgument1) {
        super(byteArrayArgument1);
    }

    final int computeInteger1864(byte byteArgument1) {
        int integerLocal1 = -7 / ((byteArgument1 + 78) / 33);
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        return this.payload[integerLocal2] - this.mixedSupport030State0002.computeInteger0455(false) & 255;
    }

    final void performAction1869(int integerArgument1) {
        this.payload[this.position] = (byte) 0;
        this.integerState0797 = 8;
        if (integerArgument1 <= 44) {
          CipherPacketBuffer.computeString1856((byte) 40, -33L);
        }
    }

    final void performAction1866(int integerArgument1) {
        if (this.integerState0797 < 8) {
          this.position = this.position + 1;
          this.integerState0797 = 8;
        }
        if (integerArgument1 != 20) {
          this.computeInteger1864((byte) -104);
        }
    }

    CipherPacketBuffer(int integerArgument1) {
        super(integerArgument1);
    }

    final void performAction1858(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerArgument3 = integerArgument3 & MixedSupport030.integerArrayState0037[integerArgument1];
        if (integerArgument2 != 0) {
          rgbSpriteState0061 = (RgbSprite) null;
        }
        while (integerArgument1 > this.integerState0797) {
          integerArgument1 = integerArgument1 - this.integerState0797;
          integerLocal1 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal1] = (byte)(this.payload[integerLocal1] + (integerArgument3 >>> integerArgument1));
          this.payload[this.position] = (byte) 0;
          this.integerState0797 = 8;
        }
        if (this.integerState0797 == integerArgument1) {
          integerLocal2 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal2] = (byte)(this.payload[integerLocal2] + integerArgument3);
          this.payload[this.position] = (byte) 0;
          this.integerState0797 = 8;
        } else {
          this.integerState0797 = this.integerState0797 - integerArgument1;
          this.payload[this.position] = (byte)(this.payload[this.position] + (integerArgument3 << this.integerState0797));
        }
    }

    final static void performAction1862(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 != -2093) {
            rgbSpriteState0061 = (RgbSprite) null;
          }
          MixedSupport042.performAction0595(130, 256, 16694016, NetworkSupport006.stringState0339, integerArgument1 + 80, SceneWidget.renderingSupport010State0007);
          integerLocal3 = 140;
          integerLocal5 = 0;
          for (integerLocal1 = 0; integerLocal1 < 6; integerLocal1++) {
            integerLocal6 = 245 * (integerLocal1 % 2) + (80 + integerArgument1);
            MixedSupport042.performAction0595(integerLocal3 + 14, 256, 16777215, CollectionSupport003.stringArrayArrayState0006[integerLocal1][0], integerLocal6, SceneWidget.renderingSupport010State0007);
            MixedSupport127.computeRgbSprite1815(true, integerLocal1).performAction0302(integerLocal6 + integerArgument1, 20 + integerLocal3, 18, 18);
            integerLocal7 = MixedSupport045.computeInteger0612(211, 0, integerLocal3 + 20, CollectionSupport003.stringArrayArrayState0006[integerLocal1][1], 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -128, 0, integerLocal6 + 24);
            if (integerLocal5 < integerLocal7) {
              integerLocal5 = integerLocal7;
            }
            if (integerLocal1 % 2 == 1) {
              integerLocal3 = integerLocal3 + (16 * integerLocal5 + 20 + 8);
              integerLocal5 = 0;
              if (integerLocal1 < 4) {
                SoftwareRaster.performAction0718(integerArgument1 + 80, -5 + integerLocal3, 480, 394758);
                SoftwareRaster.performAction0718(integerArgument1 + 80, -4 + integerLocal3, 480, 6316128);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal2 = caughtParameterLocal9;
          runtimeExceptionLocal4 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "uf.NA(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final void performAction1865(byte byteArgument1) {
        this.integerState0798 = 8 * this.position;
        if (byteArgument1 != -108) {
          this.performAction1866(119);
        }
    }

    final static void performAction1868(int integerArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (UiComponentPart017.integerState0437 > 0) {
          UiComponentPart017.integerState0437 = UiComponentPart017.integerState0437 - 1;
        } else {
          if (RenderingSupport001.integerState0064 > 0) {
            RenderingSupport001.integerState0064 = RenderingSupport001.integerState0064 - 1;
          } else {
            if (MixedSupport127.integerState0778 > 0) {
              MixedSupport127.integerState0778 = MixedSupport127.integerState0778 - 1;
            }
          }
        }
        if (!(UiComponentPart017.integerState0437 <= 0)) {
          UiComponentPart022.performAction1383((byte) -89);
        }
        if (RenderingSupport001.integerState0064 > 0) {
          InputAdapter005.performAction1530(RenderingSupport001.integerState0064, 114);
        }
        if (!(MixedSupport127.integerState0778 <= 0)) {
          InputAdapter005.performAction1530(MixedSupport127.integerState0778, 112);
        }
        if (integerArgument1 != -4840) {
          CipherPacketBuffer.performAction1863((byte) 73);
        }
    }

    final void performAction1859(int integerArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal8 = 55 / ((5 - integerArgument1) / 45);
          for (integerLocal1 = 0; integerLocal1 < integerArgument3; integerLocal1++) {
            integerLocal2 = this.position;
            this.position = this.position + 1;
            byteArrayArgument2[integerArgument4 + integerLocal1] = (byte)(this.payload[integerLocal2] - this.mixedSupport030State0002.computeInteger0455(false));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal6 = caughtParameterLocal10;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("uf.TA(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction1867(byte byteArgument1) {
        this.position = (7 + this.integerState0798) / 8;
        if (byteArgument1 >= -97) {
          rgbSpriteState0061 = (RgbSprite) null;
        }
    }

    public static void performAction1863(byte byteArgument1) {
        nodeDequeState0033 = null;
        rgbSpriteArrayState0030 = null;
        if (byteArgument1 <= 111) {
          integerState0799 = -90;
        }
        stringState0558 = null;
        rgbSpriteState0061 = null;
        stringArrayState0049 = null;
    }

    final void performAction1861(int integerArgument1, int integerArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(integerArgument1 + this.mixedSupport030State0002.computeInteger0455(false));
        if (integerArgument2 != -4) {
          rgbSpriteArrayState0030 = (RgbSprite[]) null;
        }
    }

    final int computeInteger1857(int integerArgument1, byte byteArgument2) {
        int previousIntegerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument2 <= 39) {
          return 9;
        }
        int integerLocal3 = this.integerState0798 >> 3;
        int integerLocal4 = -(7 & this.integerState0798) + 8;
        int integerLocal5 = 0;
        this.integerState0798 = this.integerState0798 + integerArgument1;
        while (integerLocal4 < integerArgument1) {
          previousIntegerLocal1 = integerLocal3;
          integerLocal3++;
          integerLocal5 = integerLocal5 + ((MixedSupport030.integerArrayState0037[integerLocal4] & this.payload[previousIntegerLocal1]) << integerArgument1 - integerLocal4);
          integerArgument1 = integerArgument1 - integerLocal4;
          integerLocal4 = 8;
        }
        if (integerArgument1 != integerLocal4) {
          integerLocal5 = integerLocal5 + (this.payload[integerLocal3] >> -integerArgument1 + integerLocal4 & MixedSupport030.integerArrayState0037[integerArgument1]);
        } else {
          integerLocal5 = integerLocal5 + (MixedSupport030.integerArrayState0037[integerLocal4] & this.payload[integerLocal3]);
        }
        return integerLocal5;
    }

    final static String computeString1856(byte byteArgument1, long longArgument2) {
        MixedSupport029.calendarState0001.setTime(new Date(longArgument2));
        int integerLocal1 = MixedSupport029.calendarState0001.get(7);
        int integerLocal2 = MixedSupport029.calendarState0001.get(5);
        int integerLocal3 = MixedSupport029.calendarState0001.get(2);
        int integerLocal4 = MixedSupport029.calendarState0001.get(1);
        int integerLocal5 = MixedSupport029.calendarState0001.get(11);
        if (byteArgument1 != 60) {
          CipherPacketBuffer.computeString1856((byte) -1, 45L);
        }
        int integerLocal6 = MixedSupport029.calendarState0001.get(12);
        int integerLocal7 = MixedSupport029.calendarState0001.get(13);
        return MixedSupport130.stringArrayState0048[-1 + integerLocal1] + ", " + integerLocal2 / 10 + integerLocal2 % 10 + "-" + DiagnosticSupport001.stringArrayState0004[integerLocal3] + "-" + integerLocal4 + " " + integerLocal5 / 10 + integerLocal5 % 10 + ":" + integerLocal6 / 10 + integerLocal6 % 10 + ":" + integerLocal7 / 10 + integerLocal7 % 10 + " GMT";
    }

    final void performAction1860(int[] integerArrayArgument1, byte byteArgument2) {
        try {
          this.mixedSupport030State0002 = new MixedSupport030(integerArrayArgument1);
          if (byteArgument2 <= 61) {
            this.computeInteger1864((byte) -25);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "uf.RA(" + (integerArrayArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    static {
        stringState0558 = "Concluded";
        stringArrayState0049 = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
