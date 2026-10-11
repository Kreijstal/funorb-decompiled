/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static int integerState0111;
    static SceneWidget sceneWidgetState0010;
    static String stringState0081;
    TextLineMetrics[] lines;
    static String stringState0082;
    static SceneWidget sceneWidgetState0011;
    static String stringState0083;
    static String stringState0084;
    static boolean booleanState0019;
    static String stringState0085;

    final static String computeString0254(int integerArgument1, long longArgument2) {
        long longLocal1 = 0L;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        StringBuilder discarded$0 = null;
        int integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (longArgument2 <= (long)integerArgument1) {
          return null;
        }
        if (6582952005840035281L <= longArgument2) {
          return null;
        }
        if (0L == longArgument2 % 37L) {
          return null;
        }
        int integerLocal6 = 0;
        long longLocal7 = longArgument2;
        while (0L != longLocal7) {
          longLocal7 = longLocal7 / 37L;
          integerLocal6++;
        }
        StringBuilder stringBuilderLocal8 = new StringBuilder(integerLocal6);
        while (longArgument2 != 0L) {
          longLocal1 = longArgument2;
          longArgument2 = longArgument2 / 37L;
          integerLocal2 = DiagnosticSupport001.characterArrayState0004[(int)(longLocal1 - 37L * longArgument2)];
          if (integerLocal2 == 95) {
            integerLocal3 = -1 + stringBuilderLocal8.length();
            stringBuilderLocal8.setCharAt(integerLocal3, Character.toUpperCase(stringBuilderLocal8.charAt(integerLocal3)));
            integerLocal2 = 160;
          }
          discarded$0 = stringBuilderLocal8.append((char) integerLocal2);
        }
        stringBuilderLocal8.reverse();
        stringBuilderLocal8.setCharAt(0, Character.toUpperCase(stringBuilderLocal8.charAt(0)));
        return stringBuilderLocal8.toString();
    }

    final static byte[] computeByteArray0257(boolean booleanArgument1, int integerArgument2, Object objectArgument3) {
        byte[] byteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        MixedSupport086 mixedSupport086Local3 = null;
        byte[] stackByteArrayLocal4 = null;
        byte[] stackByteArrayLocal5 = null;
        byte[] stackByteArrayLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (objectArgument3 == null) {
            return null;
          }
          if (objectArgument3 instanceof byte[]) {
            byteArrayLocal1 = (byte[]) (objectArgument3);
            if (!booleanArgument1) {
              stackByteArrayLocal5 = byteArrayLocal1;
              return stackByteArrayLocal5;
            }
            stackByteArrayLocal4 = SceneWidgetPart006.computeByteArray0873(0, byteArrayLocal1);
            return stackByteArrayLocal4;
          }
          if (objectArgument3 instanceof MixedSupport086) {
            mixedSupport086Local3 = (MixedSupport086) (objectArgument3);
            stackByteArrayLocal6 = mixedSupport086Local3.computeByteArray0605(256);
            return stackByteArrayLocal6;
          }
          if (integerArgument2 <= 18) {
            TextLayout.computeString0254(52, 9L);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("cf.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',');
          if (objectArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final int computeInteger0255(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        TextLineMetrics[] textLineMetricsArrayLocal3;
        TextLineMetrics textLineMetricsLocal4;
        int integerLocal5;
        int integerLocal6;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -1;
        if (booleanArgument1) {
          return 85;
        }
        if (this.lines != null) {
          textLineMetricsArrayLocal3 = this.lines;
          for (integerLocal1 = 0; textLineMetricsArrayLocal3.length > integerLocal1; integerLocal1++) {
            textLineMetricsLocal4 = textLineMetricsArrayLocal3[integerLocal1];
            if (textLineMetricsLocal4 != null) {
              integerLocal6 = textLineMetricsLocal4.getRightX(-6375);
              if (integerLocal2 < integerLocal6) {
                integerLocal2 = integerLocal6;
              }
            }
          }
        }
        return integerLocal2;
    }

    final int computeInteger0258(int integerArgument1) {
        int stackIntegerLocal1 = 0;
        if (integerArgument1 != -1) {
          return -39;
        }
        if (this.lines != null &&
          this.lines.length > 0) {
          stackIntegerLocal1 = this.lines[this.lines.length - 1].bottomY - this.lines[0].topY;
        } else {
          stackIntegerLocal1 = 0;
        }
        return stackIntegerLocal1;
    }

    public static void performAction0248(byte byteArgument1) {
        if (byteArgument1 != 126) {
          stringState0085 = (String) null;
        }
        stringState0081 = null;
        sceneWidgetState0010 = null;
        sceneWidgetState0011 = null;
        stringState0085 = null;
        stringState0083 = null;
        stringState0084 = null;
        stringState0082 = null;
    }

    final static String computeString0251(int integerArgument1) {
        if (!(UiComponentPart004.integerState0091 >= 2)) {
          return UiComponentPart010.stringState0150;
        }
        if (null != NodeDeque.resourceArchiveState0025) {
          if (!NodeDeque.resourceArchiveState0025.computeBoolean0904((byte) 121)) {
            return MixedSupport037.stringState0174;
          }
          return MixedSupport028.stringState0137;
        }
        if (!MixedSupport121.resourceArchiveState0021.computeBoolean0904((byte) 121)) {
          return MixedSupport090.stringState0365;
        }
        if (!MixedSupport121.resourceArchiveState0021.computeBoolean0918("commonui", (byte) 118)) {
          return MixedSupport013.stringState0064 + " - " + MixedSupport121.resourceArchiveState0021.computeInteger0915(-128, "commonui") + "%";
        }
        if (!AudioSupport004.resourceArchiveState0020.computeBoolean0904((byte) 121)) {
          return CodecSupport002.stringState0361;
        }
        if (integerArgument1 != -11777) {
          TextLayout.computeString0251(-68);
        }
        if (!AudioSupport004.resourceArchiveState0020.computeBoolean0918("commonui", (byte) 124)) {
          return MixedSupport140.stringState0574 + " - " + AudioSupport004.resourceArchiveState0020.computeInteger0915(-125, "commonui") + "%";
        }
        if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0904((byte) 121)) {
          return SceneWidgetPart001.stringState0058;
        }
        if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0921(false)) {
          return MixedSupport010.stringState0048 + " - " + UiComponentPart023.resourceArchiveState0016.computeInteger0923((byte) -61) + "%";
        }
        return MixedSupport155.stringState0633;
    }

    final int computeInteger0249(byte byteArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        TextLineMetrics textLineMetricsLocal2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        TextLineMetrics[] textLineMetricsArrayLocal4 = this.lines;
        TextLineMetrics[] textLineMetricsArrayLocal5 = textLineMetricsArrayLocal4;
        if (byteArgument1 != -94) {
          TextLayout.computeString0251(102);
        }
        for (integerLocal1 = 0; integerLocal1 < textLineMetricsArrayLocal4.length; integerLocal1++) {
          textLineMetricsLocal2 = textLineMetricsArrayLocal4[integerLocal1];
          if (integerArgument2 < textLineMetricsLocal2.characterXPositions.length) {
            return textLineMetricsLocal2.characterXPositions[integerArgument2];
          }
          integerArgument2 = integerArgument2 - (textLineMetricsLocal2.characterXPositions.length - 1);
        }
        return 0;
    }

    final int computeInteger0253(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        TextLineMetrics textLineMetricsLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument3 != -31917) {
          TextLayout.computeString0254(-31, -100L);
        }
        if (null == this.lines ||
          this.lines.length == 0 ||
          integerArgument2 < this.lines[0].topY) {
          return -1;
        }
        if (integerArgument2 > this.lines[this.lines.length - 1].bottomY) {
          return -1;
        }
        if (1 == this.lines.length) {
          return this.lines[0].findNearestCharacterIndex(integerArgument1, 109);
        }
        int integerLocal5 = 0;
        for (integerLocal1 = 0; this.lines.length > integerLocal1; integerLocal1++) {
          textLineMetricsLocal2 = this.lines[integerLocal1];
          if (textLineMetricsLocal2.topY <= integerArgument2 &&
            !(integerArgument2 > textLineMetricsLocal2.bottomY)) {
            integerLocal3 = textLineMetricsLocal2.findNearestCharacterIndex(integerArgument1, 109);
            if (-1 == integerLocal3) {
              return -1;
            }
            return integerLocal5 + integerLocal3;
          }
          integerLocal5 = integerLocal5 + (-1 + textLineMetricsLocal2.characterXPositions.length);
        }
        return -1;
    }

    final int computeInteger0256(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        TextLineMetrics textLineMetricsLocal2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (booleanArgument1) {
          return -107;
        }
        for (integerLocal1 = 0; integerLocal1 < this.lines.length; integerLocal1++) {
          textLineMetricsLocal2 = this.lines[integerLocal1];
          if (textLineMetricsLocal2.characterXPositions.length > integerArgument2) {
            return integerLocal1;
          }
          integerArgument2 = integerArgument2 - (-1 + textLineMetricsLocal2.characterXPositions.length);
        }
        return this.lines.length;
    }

    final int computeInteger0250(byte byteArgument1, int integerArgument2, String stringArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        int stackIntegerLocal9 = 0;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = 0;
          if (byteArgument1 != 64) {
            stackIntegerLocal8 = -43;
            return stackIntegerLocal8;
          }
          integerLocal4 = 0;
          integerLocal5 = stringArgument3.length();
          for (integerLocal1 = 0; integerLocal5 > integerLocal1; integerLocal1++) {
            integerLocal6 = stringArgument3.charAt(integerLocal1);
            if (integerLocal6 != 60) {
              if (integerLocal6 != 62) {
                if (integerLocal4 == 0 &&
                  integerLocal6 == 32) {
                  integerLocal2++;
                }
              } else {
                integerLocal4 = 0;
              }
            } else {
              integerLocal4 = 1;
            }
          }
          if (integerLocal2 <= 0) {
            return 0;
          }
          stackIntegerLocal9 = (integerArgument4 - integerArgument2 << 8) / integerLocal2;
          return stackIntegerLocal9;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal3 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal3;
          stackStringBuilderLocal11 = new StringBuilder().append("cf.I(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction0252(int integerArgument1, byte byteArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int[] integerArrayLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int[] integerArrayLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int[] integerArrayLocal11 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument2 != 57) {
            integerArrayLocal2 = (int[]) null;
            TextLayout.performAction0252(-62, (byte) 71, (int[]) null, 113, -87);
          }
          integerArgument5--;
          while (integerArgument5 >= 0) {
            integerArrayLocal11 = integerArrayArgument3;
            integerArrayLocal7 = integerArrayLocal11;
            integerLocal9 = integerArgument1;
            integerLocal10 = integerArgument4;
            integerArrayLocal11[integerLocal9] = integerLocal10 + (MixedSupport079.computeInteger1051(16711422, integerArrayLocal11[integerLocal9]) >> 1);
            integerArgument1++;
            integerArgument5--;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal6 = caughtParameterLocal12;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("cf.A(").append(integerArgument1).append(',').append(byteArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    static {
        integerState0111 = 640;
        stringState0083 = "FIGHT!";
        stringState0084 = "Quit";
        stringState0082 = "Game options changed (<%0>)";
        stringState0085 = "Honour";
    }
}
