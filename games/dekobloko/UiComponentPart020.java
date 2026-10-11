/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class UiComponentPart020 extends UiComponent implements CallbackContract014 {
    UiComponent[] uiComponentArrayState0001;
    static NodeDeque nodeDequeState0022;
    static String[] stringArrayState0025;
    static boolean[] booleanArrayState0007;
    static int[] integerArrayState0175;
    static int integerState0551;
    static int integerState0552;

    final int computeInteger0245(int integerArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent[] uiComponentArrayLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        UiComponent uiComponentLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int stackIntegerLocal9 = 0;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 0;
          uiComponentArrayLocal3 = this.uiComponentArrayState0001;
          integerLocal4 = 22 % ((36 - integerArgument1) / 51);
          integerLocal5 = 0;
          while (integerLocal5 < uiComponentArrayLocal3.length) {
            uiComponentLocal6 = uiComponentArrayLocal3[integerLocal5];
            if (uiComponentLocal6 != null) {
              integerLocal7 = uiComponentLocal6.computeInteger0245(-30);
              if (integerLocal1 < integerLocal7) {
                integerLocal1 = integerLocal7;
              }
            }
            integerLocal5++;
            if (integerLocal8 == 0) {
              continue;
            }
            break;
          }
          stackIntegerLocal9 = integerLocal1;
          return stackIntegerLocal9;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "oe.DC(" + integerArgument1 + ')');
        }
    }

    UiComponentPart020(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5, (CallbackContract006) null);
    }

    final boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        UiComponent[] uiComponentArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          uiComponentArrayLocal1 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          boolean naturalLoopExitLocal10 = false;
          while (!(naturalLoopExitLocal10 = (uiComponentArrayLocal1.length <= integerLocal3))) {
            uiComponentLocal4 = uiComponentArrayLocal1[integerLocal3];
            if (integerLocal5 == 0) {
              if (null != uiComponentLocal4 &&
                uiComponentLocal4.computeBoolean0240(false, uiComponentArgument2)) {
                return true;
              }
              integerLocal3++;
              continue;
            }
            break;
          }
          if ((naturalLoopExitLocal10) &&
            (booleanArgument1)) {
            this.uiComponentArrayState0001 = (UiComponent[]) null;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    private final boolean computeBoolean1326(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == this.uiComponentArrayState0001) {
            return false;
          }
          integerLocal1 = this.uiComponentArrayState0001.length - 1;
          boolean naturalLoopExitLocal10 = false;
          while (!(naturalLoopExitLocal10 = (integerLocal1 < 0))) {
            uiComponentLocal3 = this.uiComponentArrayState0001[integerLocal1];
            if (integerLocal5 == 0) {
              if (uiComponentLocal3 != null &&
                uiComponentLocal3.computeBoolean0239(true)) {
                integerLocal1 = integerLocal1 - integerArgument2;
                while (integerLocal1 >= 0) {
                  uiComponentLocal4 = this.uiComponentArrayState0001[integerLocal1];
                  if (null != uiComponentLocal4 &&
                    uiComponentLocal4.computeBoolean0240(false, uiComponentArgument1)) {
                    return true;
                  }
                  integerLocal1 = integerLocal1 - integerArgument2;
                }
              }
              integerLocal1--;
              continue;
            }
            break;
          }
          if ((naturalLoopExitLocal10) &&
            (integerArgument3 != 0)) {
            UiComponentPart020.performAction1324(-94, -2, 108, 7, 101, 46, -99);
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.P(");
          if (uiComponentArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeException = null;
        UiComponent[] uiComponentArrayLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          super.performAction0237(uiComponentArgument1, 102, integerArgument3, integerArgument4);
          if (this.uiComponentArrayState0001 == null) {
            return;
          }
          if (integerArgument2 <= 38) {
            return;
          }
          uiComponentArrayLocal2 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          while (uiComponentArrayLocal2.length > integerLocal3) {
            uiComponentLocal4 = uiComponentArrayLocal2[integerLocal3];
            if (integerLocal5 != 0) {
              return;
            }
            if (uiComponentLocal4 != null) {
              uiComponentLocal4.performAction0237(uiComponentArgument1, 109, integerArgument3 + this.integerState0104, this.integerState0110 + integerArgument4);
            }
            integerLocal3++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeException = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeException;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction1324(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        RuntimeException caughtExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 == 0) {
            integerArgument1 = 1;
          }
          integerLocal2 = 0;
          integerLocal4 = 65536 / integerArgument1;
          if (integerArgument4 != -1) {
            integerState0551 = -1;
          }
          if (integerArgument7 < SoftwareRaster.integerState0280) {
            integerLocal2 = integerLocal2 + integerLocal4 * (SoftwareRaster.integerState0280 - integerArgument7);
            integerArgument2 = integerArgument2 - (SoftwareRaster.integerState0280 - integerArgument7);
            integerArgument7 = SoftwareRaster.integerState0280;
          }
          if (SoftwareRaster.integerState0282 > integerArgument6) {
            integerArgument1 = integerArgument1 - (SoftwareRaster.integerState0282 - integerArgument6);
            integerArgument6 = SoftwareRaster.integerState0282;
          }
          if (SoftwareRaster.integerState0283 < integerArgument2 + integerArgument7) {
            integerArgument2 = SoftwareRaster.integerState0283 - integerArgument7;
          }
          if (SoftwareRaster.integerState0281 < integerArgument6 + integerArgument1) {
            integerArgument1 = SoftwareRaster.integerState0281 - integerArgument6;
          }
          integerLocal5 = integerArgument6 + SoftwareRaster.integerState0285 * (integerArgument7 + integerArgument2);
          integerLocal6 = -integerArgument1;
          while (0 > integerLocal6) {
            integerLocal7 = -integerLocal2 + 65536 >> 8;
            integerLocal8 = integerLocal2 >> 8;
            integerLocal9 = (integerLocal7 * (integerArgument5 & 16711935) + integerLocal8 * (integerArgument3 & 16711935) & -16711936) + (16711680 & integerLocal8 * (65280 & integerArgument3) + (65280 & integerArgument5) * integerLocal7) >>> 8;
            if (integerLocal11 != 0) {
              return;
            }
            integerLocal10 = -integerArgument2;
            while (0 > integerLocal10) {
              SoftwareRaster.integerArrayState0063[SoftwareRaster.integerState0285 * integerLocal10 + integerLocal5] = integerLocal9;
              integerLocal10++;
            }
            integerLocal5++;
            integerLocal2 = integerLocal2 + integerLocal4;
            integerLocal6++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal1 = caughtParameterLocal12;
          runtimeExceptionLocal3 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "oe.Q(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    public static void performAction1331(boolean booleanArgument1) {
        stringArrayState0025 = null;
        nodeDequeState0022 = null;
        booleanArrayState0007 = null;
        if (!booleanArgument1) {
          return;
        }
        try {
          integerArrayState0175 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oe.N(" + booleanArgument1 + ')');
        }
    }

    final void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException runtimeException = null;
        UiComponent[] uiComponentArrayLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == this.uiComponentArrayState0001) {
            return;
          }
          uiComponentArrayLocal2 = this.uiComponentArrayState0001;
          if (integerArgument2 != 64) {
            this.performAction0237((UiComponent) null, -80, 51, 84);
          }
          integerLocal3 = 0;
          while (uiComponentArrayLocal2.length > integerLocal3) {
            uiComponentLocal4 = uiComponentArrayLocal2[integerLocal3];
            if (integerLocal5 != 0) {
              return;
            }
            if (null != uiComponentLocal4) {
              uiComponentLocal4.performAction0232(integerArgument1, integerArgument2 + 0, this.integerState0110 + integerArgument3, uiComponentArgument4, integerArgument5 + this.integerState0104, integerArgument6);
            }
            integerLocal3++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeException = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeException;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.IB(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    private final void performAction1327(StringBuilder stringBuilderArgument1, int integerArgument2, int integerArgument3, Hashtable hashtableArgument4) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        RuntimeException runtimeException = null;
        UiComponent[] uiComponentArrayLocal5 = null;
        int integerLocal6 = 0;
        UiComponent uiComponentLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int stackIntegerLocal10 = 0;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == this.uiComponentArrayState0001) {
            return;
          }
          uiComponentArrayLocal5 = this.uiComponentArrayState0001;
          integerLocal6 = 0;
          scanLoop1: while (true) {
            if (uiComponentArrayLocal5.length > integerLocal6) {
              uiComponentLocal7 = uiComponentArrayLocal5[integerLocal6];
              discarded$4 = stringBuilderArgument1.append('\n');
              stackIntegerLocal10 = 0;
              if (integerLocal9 != 0) {
                break scanLoop1;
              }
              integerLocal8 = stackIntegerLocal10;
              while (true) {
                if (integerLocal8 <= integerArgument2) {
                  discarded$5 = stringBuilderArgument1.append(' ');
                  integerLocal8++;
                  continue;
                }
                if (uiComponentLocal7 == null) {
                  discarded$6 = stringBuilderArgument1.append("null");
                } else {
                  uiComponentLocal7.computeStringBuilder0238(hashtableArgument4, integerArgument2 + 1, stringBuilderArgument1, true);
                }
                break;
              }
              integerLocal6++;
              continue scanLoop1;
            }
            stackIntegerLocal10 = integerArgument3;
            break;
          }
          if (stackIntegerLocal10 != 3370) {
            this.computeBoolean0198(85, -91, (UiComponent) null, '￬');
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal16 = caughtParameterLocal17;
          runtimeException = caughtExceptionLocal16;
          stackRuntimeExceptionLocal11 = runtimeException;
          stackStringBuilderLocal12 = new StringBuilder().append("oe.M(");
          if (stringBuilderArgument1 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (hashtableArgument4 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(')').toString());
        }
    }

    final boolean computeBoolean0239(boolean booleanArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          if (booleanArgument1) {
            stackBooleanLocal2 = (null != this.computeUiComponent1323(-98));
            return stackBooleanLocal2;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "oe.TB(" + booleanArgument1 + ')');
        }
    }

    final static MixedSupport066 computeMixedSupport0661321(byte byteArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        Object stackObjectLocal6 = null;
        MixedSupport066 stackMixedSupport066Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = stringArgument2.length();
          if (byteArgument1 <= 64) {
            UiComponentPart020.performAction1332(true);
          }
          integerLocal3 = 0;
          while (integerLocal3 < integerLocal1) {
            integerLocal4 = stringArgument2.charAt(integerLocal3);
            if (integerLocal4 >= 48 &&
              57 >= integerLocal4) {
              integerLocal3++;
              if (integerLocal5 == 0) {
                continue;
              }
            } else {
              stackObjectLocal6 = null;
              return (MixedSupport066) (stackObjectLocal6);
            }
            break;
          }
          stackMixedSupport066Local7 = DualNode.mixedSupport066State0001;
          return stackMixedSupport066Local7;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("oe.U(").append(byteArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final void performAction0244(byte byteArgument1) {
        RuntimeException runtimeException = null;
        UiComponent[] uiComponentArrayLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          uiComponentArrayLocal2 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          while (integerLocal3 < uiComponentArrayLocal2.length) {
            uiComponentLocal4 = uiComponentArrayLocal2[integerLocal3];
            if (integerLocal5 != 0) {
              return;
            }
            if (uiComponentLocal4 != null) {
              uiComponentLocal4.performAction0244((byte) -95);
            }
            integerLocal3++;
          }
          if (byteArgument1 != -95) {
            UiComponentPart020.computeBoolean1322('ﾤ', -111);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeException = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oe.WB(" + byteArgument1 + ')');
        }
    }

    final static void performAction1332(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        boolean stackBooleanLocal4 = false;
        int stackIntegerLocal5 = 0;
        RuntimeException caughtExceptionLocal6 = null;
        boolean stackOut_56_0;
        CipherPacketBuffer cipherPacketBufferLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        Object objectLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        String stringLocal14 = null;
        String stringLocal15 = null;
        SceneWidgetPart014 sceneWidgetPart014Local16 = null;
        SceneWidgetPart014 sceneWidgetPart014Local17 = null;
        String stringLocal18 = null;
        String stringLocal19 = null;
        int integerLocal20 = 0;
        Object objectLocal21;
        String stringLocal22;
        String stringLocal23;
        SceneWidgetPart014 sceneWidgetPart014Local24;
        integerLocal20 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument1) {
            return;
          }
          cipherPacketBufferLocal8 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal10 = cipherPacketBufferLocal8.computeInteger2085((byte) -25);
          if (integerLocal10 == 0) {
            if (null == MixedSupport054.collectionSupport003State0001) {
              MixedSupport054.collectionSupport003State0001 = new CollectionSupport003(128);
              MixedSupport029.integerState0182 = 0;
            }
            stackIntegerLocal3 = (cipherPacketBufferLocal8.computeInteger2085((byte) -111) != 1) ? 0 : 1;
            integerLocal12 = stackIntegerLocal3;
            stringLocal14 = cipherPacketBufferLocal8.computeString2082((byte) -38);
            if (integerLocal12 != 0) {
              stringLocal15 = cipherPacketBufferLocal8.computeString2082((byte) -38);
            }
            if (integerLocal12 == 0 ||
              integerLocal20 != 0) {
              stringLocal15 = stringLocal14;
            }
            sceneWidgetPart014Local16 = UiComponentPart011.computeSceneWidgetPart0140610(-3805, stringLocal14);
            stringLocal18 = cipherPacketBufferLocal8.computeString2082((byte) -38);
            stringLocal19 = ComponentContainer.computeString1011((CharSequence) ((Object) stringLocal14), (byte) 2);
            if (null == stringLocal19) {
              stringLocal19 = stringLocal14;
            }
            if (null == sceneWidgetPart014Local16) {
              sceneWidgetPart014Local16 = UiComponentPart011.computeSceneWidgetPart0140610(-3805, stringLocal18);
              if (null != sceneWidgetPart014Local16) {
                MixedSupport054.collectionSupport003State0001.performAction1281(sceneWidgetPart014Local16, -1, (long)stringLocal19.hashCode());
              }
            }
            if (sceneWidgetPart014Local16 == null) {
              sceneWidgetPart014Local16 = new SceneWidgetPart014();
              MixedSupport054.collectionSupport003State0001.performAction1281(sceneWidgetPart014Local16, -1, (long)stringLocal19.hashCode());
              integerLocal1 = MixedSupport029.integerState0182;
              MixedSupport029.integerState0182 = MixedSupport029.integerState0182 + 1;
              sceneWidgetPart014Local16.integerState0920 = integerLocal1;
              CipherPacketBuffer.nodeDequeState0033.performAction1963(sceneWidgetPart014Local16, 2777);
            }
            sceneWidgetPart014Local16.stringState0603 = stringLocal15;
            sceneWidgetPart014Local16.stringState0606 = stringLocal14;
            sceneWidgetPart014Local16.stringState0605 = stringLocal18;
            return;
          }
          if (1 != integerLocal10) {
            if (2 == integerLocal10) {
              if (1 == ThemeTips.integerState0351) {
                ThemeTips.integerState0351 = 2;
              }
              return;
            }
            if (integerLocal10 == 3) {
              if (ThemeTips.integerState0351 == 2) {
                ThemeTips.integerState0351 = 1;
              }
              return;
            }
            if (4 != integerLocal10) {
              NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "F1: " + BufferedSocket.computeString1563((byte) 17));
              NodeHashTable.performAction1703(100);
              return;
            }
            ThemeTips.integerState0351 = 1;
            objectLocal11 = cipherPacketBufferLocal8.computeString2082((byte) -38);
            MixedSupport033.stringState0159 = ((String) (objectLocal11)).intern();
            integerLocal13 = cipherPacketBufferLocal8.computeInteger2085((byte) -125);
            MixedSupport091.performAction1265((byte) 12, integerLocal13);
            return;
          }
          if (MixedSupport085.collectionSupport003State0003 == null) {
            MixedSupport085.collectionSupport003State0003 = new CollectionSupport003(128);
            UiComponentPart018.integerState0502 = 0;
          }
          objectLocal21 = cipherPacketBufferLocal8.computeString2082((byte) -38);
          if (((String) (objectLocal21)).equals("")) {
            objectLocal21 = null;
          }
          stringLocal22 = cipherPacketBufferLocal8.computeString2082((byte) -38);
          stringLocal23 = cipherPacketBufferLocal8.computeString2082((byte) -38);
          sceneWidgetPart014Local24 = MixedSupport029.computeSceneWidgetPart0140448(stringLocal22, (byte) -109);
          if (null == sceneWidgetPart014Local24) {
            sceneWidgetPart014Local24 = MixedSupport029.computeSceneWidgetPart0140448(stringLocal23, (byte) 71);
            if (null != sceneWidgetPart014Local24) {
              MixedSupport085.collectionSupport003State0003.performAction1281(sceneWidgetPart014Local24, -1, (long)ComponentContainer.computeString1011((CharSequence) ((Object) stringLocal22), (byte) 2).hashCode());
            }
          }
          if (sceneWidgetPart014Local24 == null) {
            sceneWidgetPart014Local24 = new SceneWidgetPart014();
            MixedSupport085.collectionSupport003State0003.performAction1281(sceneWidgetPart014Local24, -1, (long)ComponentContainer.computeString1011((CharSequence) ((Object) stringLocal22), (byte) 2).hashCode());
            integerLocal2 = UiComponentPart018.integerState0502;
            UiComponentPart018.integerState0502 = UiComponentPart018.integerState0502 + 1;
            sceneWidgetPart014Local24.integerState0920 = integerLocal2;
            UiComponentPart025.nodeDequeState0027.performAction1963(sceneWidgetPart014Local24, 2777);
          }
          if (objectLocal21 != null) {
            objectLocal21 = ((String) (objectLocal21)).intern();
          }
          sceneWidgetPart014Local24.stringState0604 = (String) (objectLocal21);
          sceneWidgetPart014Local24.stringState0606 = stringLocal22;
          sceneWidgetPart014Local24.stringState0605 = stringLocal23;
          sceneWidgetPart014Local24.performAction0161((byte) 125);
          sceneWidgetPart014Local17 = (SceneWidgetPart014) (UiComponentPart025.nodeDequeState0027.computeHashNode1970((byte) 18));
          scanLoop1: while (true) {
            boolean frameRemainderLocal25 = true;
            if (sceneWidgetPart014Local17 != null) {
              stackOut_56_0 = UiComponentPart024.computeBoolean1455(sceneWidgetPart014Local17, sceneWidgetPart014Local24, false);
              stackIntegerLocal5 = stackOut_56_0 ? 1 : 0;
              stackBooleanLocal4 = stackOut_56_0;
              frameRemainderLocal25 = (integerLocal20 == 0);
              if ((frameRemainderLocal25) &&
                (stackBooleanLocal4)) {
                sceneWidgetPart014Local17 = (SceneWidgetPart014) (UiComponentPart025.nodeDequeState0027.computeHashNode1974(true));
                continue;
              }
            }
            if (frameRemainderLocal25) {
              if (null == sceneWidgetPart014Local17) {
                break scanLoop1;
              }
              stackIntegerLocal5 = 121;
            }
            MixedSupport043.performAction0598(stackIntegerLocal5, sceneWidgetPart014Local24, sceneWidgetPart014Local17);
            if (integerLocal20 == 0) {
              return;
            }
            break;
          }
          UiComponentPart025.nodeDequeState0027.performAction1963(sceneWidgetPart014Local24, 2777);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal26) {
          caughtExceptionLocal6 = caughtParameterLocal26;
          runtimeExceptionLocal9 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal9), "oe.S(" + booleanArgument1 + ')');
        }
    }

    void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        UiComponent uiComponentLocal5 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (0 == integerArgument3 &&
            null != this.callbackContract004State0006) {
            this.callbackContract004State0006.performAction0018(true, integerArgument1, integerArgument4, (byte) -62, (UiComponent) (this));
          }
          if (null != this.uiComponentArrayState0001) {
            integerLocal3 = -1 + this.uiComponentArrayState0001.length;
            while (integerLocal3 >= 0) {
              uiComponentLocal5 = this.uiComponentArrayState0001[integerLocal3];
              if (integerLocal1 != 0) {
                return;
              }
              if (uiComponentLocal5 != null) {
                uiComponentLocal5.performAction0175(this.integerState0110 + integerArgument1, -109, integerArgument3, integerArgument4 + this.integerState0104);
              }
              integerLocal3--;
            }
          }
          if (integerArgument2 >= -103) {
            this.performAction0241(36, 0, -79, -102, 25);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal2 = caughtParameterLocal6;
          runtimeExceptionLocal4 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "oe.C(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        UiComponent[] uiComponentArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.uiComponentArrayState0001 == null) {
            return false;
          }
          uiComponentArrayLocal1 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          boolean naturalLoopExitLocal10 = false;
          while (!(naturalLoopExitLocal10 = (integerLocal3 >= uiComponentArrayLocal1.length))) {
            uiComponentLocal4 = uiComponentArrayLocal1[integerLocal3];
            if (integerLocal5 == 0) {
              if (uiComponentLocal4 != null &&
                uiComponentLocal4.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, integerArgument5 + this.integerState0104, this.integerState0110 + integerArgument6, (byte) -55)) {
                return true;
              }
              integerLocal3++;
              continue;
            }
            break;
          }
          if ((naturalLoopExitLocal10) &&
            (byteArgument7 != -55)) {
            integerState0551 = -1;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    private final boolean computeBoolean1330(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == this.uiComponentArrayState0001) {
            return false;
          }
          if (integerArgument3 >= -127) {
            stringArrayState0025 = (String[]) null;
          }
          integerLocal1 = 0;
          while (integerLocal1 < this.uiComponentArrayState0001.length) {
            boolean frameCompletedLocal10 = true;
            uiComponentLocal3 = this.uiComponentArrayState0001[integerLocal1];
            if (uiComponentLocal3 != null &&
              uiComponentLocal3.computeBoolean0239(true)) {
              integerLocal1 = integerLocal1 + integerArgument2;
              while (integerLocal1 < this.uiComponentArrayState0001.length) {
                uiComponentLocal4 = this.uiComponentArrayState0001[integerLocal1];
                if (integerLocal5 != 0) {
                  frameCompletedLocal10 = false;
                  break;
                }
                if (null != uiComponentLocal4 &&
                  uiComponentLocal4.computeBoolean0240(false, uiComponentArgument1)) {
                  return true;
                }
                integerLocal1 = integerLocal1 + integerArgument2;
              }
            }
            if (frameCompletedLocal10) {
              integerLocal1++;
            }
            if (integerLocal5 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("oe.O(");
          if (uiComponentArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final StringBuilder computeStringBuilder0238(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (this.computeBoolean0234(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0225((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
            this.performAction1327(stringBuilderArgument3, integerArgument2, 3370, hashtableArgument1);
          }
          if (booleanArgument4) {
            stackStringBuilderLocal3 = (StringBuilder) (stringBuilderArgument3);
            return stackStringBuilderLocal3;
          }
          stackStringBuilderLocal2 = (StringBuilder) null;
          return stackStringBuilderLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("oe.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    private final boolean computeBoolean1329(UiComponent uiComponentArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != 0) {
            this.uiComponentArrayState0001 = (UiComponent[]) null;
          }
          stackBooleanLocal2 = this.computeBoolean1330(uiComponentArgument1, 1, integerArgument2 ^ -128);
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("oe.T(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    private final UiComponent computeUiComponent1323(int integerArgument1) {
        UiComponent[] uiComponentArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        UiComponent uiComponentLocal5 = null;
        int integerLocal6 = 0;
        Object stackObjectLocal7 = null;
        UiComponent stackUiComponentLocal8 = null;
        Object stackObjectLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.uiComponentArrayState0001 == null) {
            stackObjectLocal7 = null;
            return (UiComponent) (stackObjectLocal7);
          }
          integerLocal3 = 36 % ((integerArgument1 - 6) / 63);
          uiComponentArrayLocal1 = this.uiComponentArrayState0001;
          integerLocal4 = 0;
          boolean naturalLoopExitLocal11 = false;
          while (!(naturalLoopExitLocal11 = (integerLocal4 >= uiComponentArrayLocal1.length))) {
            uiComponentLocal5 = uiComponentArrayLocal1[integerLocal4];
            stackObjectLocal9 = null;
            if (integerLocal6 == 0) {
              if (stackObjectLocal9 != uiComponentLocal5 &&
                uiComponentLocal5.computeBoolean0239(true)) {
                stackUiComponentLocal8 = uiComponentLocal5;
                return stackUiComponentLocal8;
              }
              integerLocal4++;
              continue;
            }
            break;
          }
          if (naturalLoopExitLocal11) {
            stackObjectLocal9 = null;
          }
          return (UiComponent) (stackObjectLocal9);
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal10 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "oe.J(" + integerArgument1 + ')');
        }
    }

    final static int computeInteger1328(int integerArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          integerArgument2--;
          integerArgument2 = integerArgument2 | integerArgument2 >>> 1;
          integerArgument2 = integerArgument2 | integerArgument2 >>> 2;
          if (integerArgument1 != -10498) {
            UiComponentPart020.computeBoolean1322('ﾏ', -43);
          }
          integerArgument2 = integerArgument2 | integerArgument2 >>> 4;
          integerArgument2 = integerArgument2 | integerArgument2 >>> 8;
          integerArgument2 = integerArgument2 | integerArgument2 >>> 16;
          stackIntegerLocal2 = integerArgument2 + 1;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "oe.L(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final static boolean computeBoolean1322(char characterArgument1, int integerArgument2) {
        char[] characterArrayLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        char stackCharacterLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        char stackCharacterLocal8 = 0;
        int stackIntegerLocal9 = 0;
        RuntimeException caughtExceptionLocal10 = null;
        char stackOut_14_0;
        char stackOut_25_0;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14;
        int stackIntegerLocal15;
        int stackIntegerLocal16;
        char stackCharacterLocal17;
        char stackOut_25_0Lifetime1;
        int integerLocal19;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (Character.isISOControl(characterArgument1)) {
            return false;
          }
          if (MixedSupport064.computeBoolean0850(-8241, characterArgument1)) {
            return true;
          }
          characterArrayLocal1 = ProxySocketFactory.characterArrayState0008;
          if (integerArgument2 != -6237) {
            UiComponentPart020.performAction1324(35, -84, -82, 125, 125, -43, -29);
          }
          integerLocal2 = 0;
          scanLoop1: while (true) {
            boolean frameRemainderLocal20 = true;
            boolean frameCompletedLocal21 = true;
            if (characterArrayLocal1.length > integerLocal2) {
              integerLocal3 = characterArrayLocal1[integerLocal2];
              stackOut_14_0 = characterArgument1;
              stackIntegerLocal6 = stackOut_14_0;
              stackCharacterLocal5 = stackOut_14_0;
              stackIntegerLocal7 = integerLocal3;
              if (integerLocal4 != 0) {
                if (stackIntegerLocal6 < stackIntegerLocal7) {
                  integerLocal19 = characterArrayLocal1[integerLocal2];
                  stackOut_25_0 = characterArgument1;
                  stackIntegerLocal9 = stackOut_25_0;
                  stackCharacterLocal8 = stackOut_25_0;
                  break scanLoop1;
                }
                frameRemainderLocal20 = false;
              }
              else {
                if (stackCharacterLocal5 == stackIntegerLocal7) {
                  return true;
                }
                integerLocal2++;
                continue;
              }
            }
            if (frameRemainderLocal20) {
              characterArrayLocal1 = NetworkSupport008.characterArrayState0007;
              integerLocal2 = 0;
              while (true) {
                stackIntegerLocal15 = ~characterArrayLocal1.length;
                stackIntegerLocal16 = ~integerLocal2;
                if (stackIntegerLocal15 >= stackIntegerLocal16) {
                  frameCompletedLocal21 = false;
                  break;
                }
                integerLocal14 = characterArrayLocal1[integerLocal2];
                stackOut_25_0Lifetime1 = characterArgument1;
                stackIntegerLocal9 = stackOut_25_0Lifetime1;
                stackCharacterLocal17 = stackOut_25_0Lifetime1;
                if (integerLocal4 != 0) {
                  break scanLoop1;
                }
                if (stackCharacterLocal17 == integerLocal14) {
                  break;
                }
                integerLocal2++;
              }
              if (frameCompletedLocal21) {
                return true;
              }
            }
            stackIntegerLocal9 = 0;
            break;
          }
          return stackIntegerLocal9 != 0;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal10 = caughtParameterLocal22;
          runtimeExceptionLocal13 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal13), "oe.K(" + characterArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent[] uiComponentArrayLocal3 = null;
        int integerLocal4 = 0;
        UiComponent uiComponentLocal5 = null;
        int integerLocal6 = 0;
        boolean stackBooleanLocal7 = false;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.uiComponentArrayState0001 == null) {
            return false;
          }
          integerLocal1 = -117 % ((integerArgument1 + 22) / 49);
          uiComponentArrayLocal3 = this.uiComponentArrayState0001;
          integerLocal4 = 0;
          boolean naturalLoopExitLocal12 = false;
          while (!(naturalLoopExitLocal12 = (uiComponentArrayLocal3.length <= integerLocal4))) {
            uiComponentLocal5 = uiComponentArrayLocal3[integerLocal4];
            if (integerLocal6 == 0) {
              if (null != uiComponentLocal5 &&
                uiComponentLocal5.computeBoolean0239(true) &&
                uiComponentLocal5.computeBoolean0198(98, integerArgument2, uiComponentArgument3, characterArgument4)) {
                return true;
              }
              integerLocal4++;
              continue;
            }
            break;
          }
          if (naturalLoopExitLocal12) {
            integerLocal1 = integerArgument2;
          }
          if (integerLocal1 != 80) {
            return false;
          }
          if (!MixedSupport011.booleanArrayState0002[81]) {
            stackBooleanLocal7 = this.computeBoolean1329(uiComponentArgument3, 0);
          } else {
            stackBooleanLocal7 = this.computeBoolean1325(uiComponentArgument3, 113);
          }
          return stackBooleanLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal11 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("oe.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(characterArgument4).append(')').toString());
        }
    }

    final String computeString0242(byte byteArgument1) {
        UiComponent[] uiComponentArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        String stringLocal5 = null;
        int integerLocal6 = 0;
        Object stackObjectLocal7 = null;
        String stackStringLocal8 = null;
        Object stackObjectLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.uiComponentArrayState0001 == null) {
            stackObjectLocal7 = null;
            return (String) (stackObjectLocal7);
          }
          uiComponentArrayLocal1 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          boolean naturalLoopExitLocal11 = false;
          while (!(naturalLoopExitLocal11 = (integerLocal3 >= uiComponentArrayLocal1.length))) {
            uiComponentLocal4 = uiComponentArrayLocal1[integerLocal3];
            stackObjectLocal9 = null;
            if (integerLocal6 == 0) {
              if (stackObjectLocal9 != uiComponentLocal4) {
                stringLocal5 = uiComponentLocal4.computeString0242((byte) 113);
                if (stringLocal5 != null) {
                  stackStringLocal8 = stringLocal5;
                  return stackStringLocal8;
                }
              }
              integerLocal3++;
              continue;
            }
            break;
          }
          if (naturalLoopExitLocal11) {
            if (byteArgument1 != 113) {
              this.uiComponentArrayState0001 = (UiComponent[]) null;
            }
            stackObjectLocal9 = null;
          }
          return (String) (stackObjectLocal9);
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal10 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "oe.R(" + byteArgument1 + ')');
        }
    }

    final boolean computeBoolean0233(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        UiComponent[] uiComponentArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        UiComponent stackUiComponentLocal6 = null;
        boolean stackBooleanLocal7 = false;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.uiComponentArrayState0001 == null) {
            return false;
          }
          if (booleanArgument7) {
            integerState0552 = -21;
          }
          uiComponentArrayLocal1 = this.uiComponentArrayState0001;
          integerLocal3 = 0;
          while (uiComponentArrayLocal1.length > integerLocal3) {
            uiComponentLocal4 = uiComponentArrayLocal1[integerLocal3];
            if (uiComponentLocal4 != null) {
              stackUiComponentLocal6 = uiComponentLocal4;
              stackBooleanLocal7 = !(booleanArgument7);
              if (((UiComponent) (Object) stackUiComponentLocal6).computeBoolean0239(stackBooleanLocal7) &&
                uiComponentLocal4.computeBoolean0233(integerArgument1, integerArgument2, integerArgument3, uiComponentArgument4, integerArgument5, integerArgument6, false)) {
                return true;
              }
            }
            integerLocal3++;
            if (integerLocal5 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("oe.FC(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    private final boolean computeBoolean1325(UiComponent uiComponentArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 > 33) {
            stackBooleanLocal2 = this.computeBoolean1326(uiComponentArgument1, 1, 0);
            return stackBooleanLocal2;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("oe.V(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    abstract void performAction1176(int integerArgument1);

    final void performAction0241(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          super.performAction0241(integerArgument1, integerArgument2, integerArgument3, integerArgument4, -16555);
          if (integerArgument5 != -16555) {
            UiComponentPart020.computeInteger1328(71, 20);
          }
          this.performAction1176(30);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "oe.DA(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    static {
        stringArrayState0025 = new String[]{"Showing by rating", "Showing by win percentage"};
        nodeDequeState0022 = new NodeDeque();
        integerArrayState0175 = new int[8];
    }
}
