/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart010 extends SceneWidget {
    SceneWidget sceneWidgetState0106;
    static RgbSprite[] rgbSpriteArrayState0025;
    static int integerState0722;
    SceneWidget sceneWidgetState0107;
    SceneWidgetPart008 sceneWidgetPart008State0005;
    SceneWidget sceneWidgetState0108;

    final void performAction1664(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        this.integerState0903 = integerArgument4;
        this.integerState0896 = integerArgument7;
        this.integerState0890 = integerArgument1;
        this.integerState0915 = integerArgument3;
        if (integerArgument2 != 1) {
          this.sceneWidgetState0107 = (SceneWidget) null;
        }
        this.performAction1663(integerArgument5, integerArgument8, integerArgument6, 16);
    }

    final static int computeInteger1666(boolean booleanArgument1, int integerArgument2, int integerArgument3, CharSequence charSequenceArgument4) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (2 <= integerArgument3 &&
            integerArgument3 <= 36) {
            integerLocal7 = 0;
            integerLocal9 = 0;
            integerLocal10 = 0;
            if (integerArgument2 != 4) {
              SceneWidgetPart010.performAction1668(true);
            }
            integerLocal11 = charSequenceArgument4.length();
            for (integerLocal1 = 0; integerLocal11 > integerLocal1; integerLocal1++) {
              boolean frameRemainderLocal15 = true;
              integerLocal12 = charSequenceArgument4.charAt(integerLocal1);
              if ((integerLocal1 == 0) &&
                (45 == integerLocal12)) {
                integerLocal7 = 1;
                frameRemainderLocal15 = false;
              }
              if ((frameRemainderLocal15) && (integerLocal1 != 0 || (integerLocal12 != 43 ||
                !booleanArgument1))) {
                if (integerLocal12 >= 48 &&
                  57 >= integerLocal12) {
                  integerLocal12 -= 48;
                } else if (integerLocal12 >= 65 &&
                  integerLocal12 <= 90) {
                  integerLocal12 -= 55;
                } else if (97 <= integerLocal12 &&
                  integerLocal12 <= 122) {
                  integerLocal12 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (integerLocal12 >= integerArgument3) {
                  throw new NumberFormatException();
                }
                if (integerLocal7 != 0) {
                  integerLocal12 = -integerLocal12;
                }
                integerLocal13 = integerArgument3 * integerLocal10 + integerLocal12;
                if (integerLocal10 != integerLocal13 / integerArgument3) {
                  throw new NumberFormatException();
                }
                integerLocal10 = integerLocal13;
                integerLocal9 = 1;
              }
            }
            if (integerLocal9 == 0) {
              throw new NumberFormatException();
            }
            stackIntegerLocal2 = integerLocal10;
            return stackIntegerLocal2;
          }
          throw new IllegalArgumentException("" + integerArgument3);
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal6 = caughtParameterLocal16;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("s.E(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (charSequenceArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static void performAction1662(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5) {
        MixedSupport001.integerState0013 = integerArgument4;
        MixedSupport089.integerState0531 = integerArgument1;
        if (byteArgument3 != -91) {
          SceneWidgetPart010.computeInteger1667((byte) 18, 119);
        }
        RenderingSupport008.integerState0362 = integerArgument5;
        MixedSupport015.integerState0100 = integerArgument2;
    }

    final static void performAction1670(byte byteArgument1) {
        MixedSupport123.performAction1754(false);
        if (null != GameDomainSupport004.canvasState0001) {
          SceneWidgetPart012.performAction1824(false, GameDomainSupport004.canvasState0001);
        }
        SoftwareFramebuffer.performAction2033(90);
        ReturnedShape.performAction1621((byte) 0);
        MixedSupport036.performAction0554((byte) 67);
        if (MixedSupport024.computeBoolean0402(false)) {
          SocketFactory.cipherPacketBufferState0002.performAction1861(1, -4);
          UiComponentPart033.performAction2052(4792, 0);
        }
        NodeHashTable.performAction1703(80);
        if (byteArgument1 <= 69) {
          ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
          SceneWidgetPart010.performAction1665(-57, -79, (RgbSprite[][]) null, (byte[]) null, (RgbSprite[][]) null, -19, false, (String[][]) null, (int[]) null, (byte[]) null, (ResourceArchive) null, (int[]) null, (ResourceArchive) null, (IndexedSprite[]) null, (String[]) null, (String[][]) null, (ResourceArchive) null);
        }
    }

    public static void performAction1671(byte byteArgument1) {
        int integerLocal1 = 8 % ((byteArgument1 + 32) / 55);
        rgbSpriteArrayState0025 = null;
    }

    SceneWidgetPart010(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidgetPart006 sceneWidgetPart006Argument4, SceneWidget sceneWidgetArgument5, String stringArgument6, String stringArgument7) {
        super(longArgument1, sceneWidgetArgument2);
        try {
          this.sceneWidgetState0108 = new SceneWidget(0L, (SceneWidget) null);
          this.sceneWidgetPart008State0005 = new SceneWidgetPart008(0L, this.sceneWidgetState0108, sceneWidgetArgument3, sceneWidgetPart006Argument4);
          this.sceneWidgetState0106 = new SceneWidget(0L, sceneWidgetArgument5);
          this.sceneWidgetState0107 = new SceneWidget(0L, sceneWidgetArgument5);
          this.sceneWidgetState0106.stringState0598 = stringArgument6;
          this.sceneWidgetState0107.stringState0598 = stringArgument7;
          this.performAction1998(this.sceneWidgetPart008State0005, -16834);
          this.performAction1998(this.sceneWidgetState0106, -16834);
          this.performAction1998(this.sceneWidgetState0107, -16834);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "s.<init>(" + longArgument1 + ',' + (sceneWidgetArgument2 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument3 != null ? "{...}" : "null") + ',' + (sceneWidgetPart006Argument4 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument5 != null ? "{...}" : "null") + ',' + (stringArgument6 != null ? "{...}" : "null") + ',' + (stringArgument7 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction1663(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = (this.integerState0896 + integerArgument3) / 2;
        int integerLocal2 = this.integerState0915 - integerArgument2;
        this.sceneWidgetPart008State0005.performAction1289(6, 0, integerArgument1, 0, -integerArgument3 + integerLocal2, this.integerState0896, integerArgument3);
        this.sceneWidgetState0106.integerState0903 = integerLocal2;
        if (integerArgument4 != 16) {
          rgbSpriteArrayState0025 = (RgbSprite[]) null;
        }
        this.sceneWidgetState0106.integerState0915 = integerArgument2;
        this.sceneWidgetState0106.integerState0896 = integerLocal1 - integerArgument3;
        this.sceneWidgetState0106.integerState0890 = 0;
        this.sceneWidgetState0107.integerState0896 = this.integerState0896 - integerLocal1;
        this.sceneWidgetState0107.integerState0890 = integerLocal1;
        this.sceneWidgetState0107.integerState0903 = integerLocal2;
        this.sceneWidgetState0107.integerState0915 = integerArgument2;
    }

    final static void performAction1669(byte byteArgument1) {
        if (MixedSupport005.uiComponentPart016State0001 != null) {
          MixedSupport005.uiComponentPart016State0001.performAction0949((byte) -66);
        }
        if (null != NetworkSupport010.uiComponentPart026State0001) {
          NetworkSupport010.uiComponentPart026State0001.performAction1583((byte) 114);
        }
        GameAssets.performAction1699(0);
        int integerLocal1 = 62 % ((-55 - byteArgument1) / 60);
    }

    final static int computeInteger1667(byte byteArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        if (integerArgument2 < 0 ||
          integerArgument2 >= 65536) {
          integerArgument2 = integerArgument2 >>> 16;
          integerLocal1 += 16;
        }
        if (256 <= integerArgument2) {
          integerLocal1 += 8;
          integerArgument2 = integerArgument2 >>> 8;
        }
        if (integerArgument2 >= 16) {
          integerArgument2 = integerArgument2 >>> 4;
          integerLocal1 += 4;
        }
        if (4 <= integerArgument2) {
          integerLocal1 += 2;
          integerArgument2 = integerArgument2 >>> 2;
        }
        if (integerArgument2 >= 1) {
          integerArgument2 = integerArgument2 >>> 1;
          integerLocal1++;
        }
        int integerLocal2 = -60 % ((byteArgument1 - 69) / 45);
        return integerLocal1 + integerArgument2;
    }

    SceneWidgetPart010(long longArgument1, SceneWidgetPart010 sceneWidgetPart010Argument2, String stringArgument3, String stringArgument4) {
        this(longArgument1, sceneWidgetPart010Argument2, sceneWidgetPart010Argument2.sceneWidgetPart008State0005.sceneWidgetState0089, sceneWidgetPart010Argument2.sceneWidgetPart008State0005.sceneWidgetPart006State0001, sceneWidgetPart010Argument2.sceneWidgetState0106, stringArgument3, stringArgument4);
    }

    final static void performAction1668(boolean booleanArgument1) {
        int[] integerArrayLocal1 = null;
        int[] integerArrayLocal2 = null;
        int[] integerArrayLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int[] integerArrayLocal7;
        int integerLocal8;
        try {
          MixedSupport048.mixedSupport076State0001 = null;
          RenderingSupport003.booleanState0056 = false;
          UiComponentPart013.booleanState0066 = false;
          NetworkSupport004.booleanState0065 = false;
          NodeHashTable.nodeDequeState0031 = new NodeDeque();
          if (!booleanArgument1) {
            CharSequence charSequenceLocal9 = (CharSequence) null;
            SceneWidgetPart010.computeInteger1666(true, -23, -56, (CharSequence) null);
          }
          MixedSupport069.nodeDequeState0011 = new NodeDeque();
          integerArrayLocal1 = MixedSupport093.integerArrayState0172;
          integerArrayLocal2 = integerArrayLocal1;
          for (integerLocal5 = 0; integerLocal5 < 8; integerLocal5++) {
            integerArrayLocal1[integerLocal5] = 0;
          }
          integerArrayLocal3 = MixedSupport064.integerArrayState0111;
          integerArrayLocal7 = integerArrayLocal3;
          integerLocal4 = 0;
          integerLocal8 = integerLocal4;
          while (integerLocal4 < 8) {
            integerArrayLocal3[integerLocal4] = 0;
            integerLocal4++;
          }
          UiComponentPart015.integerState0319 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "s.A(" + booleanArgument1 + ')');
        }
    }

    final static void performAction1665(int integerArgument1, int integerArgument2, RgbSprite[][] rgbSpriteArrayArrayArgument3, byte[] byteArrayArgument4, RgbSprite[][] rgbSpriteArrayArrayArgument5, int integerArgument6, boolean booleanArgument7, String[][] stringArrayArrayArgument8, int[] integerArrayArgument9, byte[] byteArrayArgument10, ResourceArchive resourceArchiveArgument11, int[] integerArrayArgument12, ResourceArchive resourceArchiveArgument13, IndexedSprite[] indexedSpriteArrayArgument14, String[] stringArrayArgument15, String[][] stringArrayArrayArgument16, ResourceArchive resourceArchiveArgument17) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        StringBuilder stackStringBuilderLocal18 = null;
        String stackStringLocal19 = null;
        StringBuilder stackStringBuilderLocal20 = null;
        String stackStringLocal21 = null;
        StringBuilder stackStringBuilderLocal22 = null;
        String stackStringLocal23 = null;
        StringBuilder stackStringBuilderLocal24 = null;
        String stackStringLocal25 = null;
        StringBuilder stackStringBuilderLocal26 = null;
        String stackStringLocal27 = null;
        RuntimeException caughtExceptionLocal28 = null;
        RuntimeException runtimeExceptionLocal29 = null;
        String[] stringArrayLocal30 = null;
        try {
          stringArrayLocal30 = (String[]) null;
          InputAdapter006.performAction1697(stringArrayArrayArgument16, booleanArgument7, byteArrayArgument10, resourceArchiveArgument17, integerArrayArgument12, (byte) -57, stringArrayArrayArgument8, stringArrayArgument15, 1, byteArrayArgument4, indexedSpriteArrayArgument14, integerArrayArgument9, integerArgument2, resourceArchiveArgument13, (String[]) null, resourceArchiveArgument11, rgbSpriteArrayArrayArgument5, rgbSpriteArrayArrayArgument3, integerArgument6);
          if (integerArgument1 < 66) {
            integerState0722 = 77;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal31) {
          caughtExceptionLocal28 = caughtParameterLocal31;
          runtimeExceptionLocal29 = caughtExceptionLocal28;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal29;
          stackStringBuilderLocal2 = new StringBuilder().append("s.I(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (rgbSpriteArrayArrayArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (byteArrayArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (rgbSpriteArrayArrayArgument5 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(',');
          if (stringArrayArrayArgument8 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (integerArrayArgument9 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (byteArrayArgument10 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',');
          if (resourceArchiveArgument11 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',');
          if (integerArrayArgument12 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',');
          if (resourceArchiveArgument13 == null) {
            stackStringLocal19 = "null";
          } else {
            stackStringLocal19 = "{...}";
          }
          stackStringBuilderLocal20 = ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',');
          if (indexedSpriteArrayArgument14 == null) {
            stackStringLocal21 = "null";
          } else {
            stackStringLocal21 = "{...}";
          }
          stackStringBuilderLocal22 = ((StringBuilder) (Object) stackStringBuilderLocal20).append(stackStringLocal21).append(',');
          if (stringArrayArgument15 == null) {
            stackStringLocal23 = "null";
          } else {
            stackStringLocal23 = "{...}";
          }
          stackStringBuilderLocal24 = ((StringBuilder) (Object) stackStringBuilderLocal22).append(stackStringLocal23).append(',');
          if (stringArrayArrayArgument16 == null) {
            stackStringLocal25 = "null";
          } else {
            stackStringLocal25 = "{...}";
          }
          stackStringBuilderLocal26 = ((StringBuilder) (Object) stackStringBuilderLocal24).append(stackStringLocal25).append(',');
          if (resourceArchiveArgument17 == null) {
            stackStringLocal27 = "null";
          } else {
            stackStringLocal27 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal26).append(stackStringLocal27).append(')').toString());
        }
    }

    static {
        rgbSpriteArrayState0025 = new RgbSprite[8];
    }
}
