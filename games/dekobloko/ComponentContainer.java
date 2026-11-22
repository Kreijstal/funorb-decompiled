/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ComponentContainer extends UiComponent implements CallbackContract014 {
    static int integerState0376;
    static String stringState0307;
    static GameSession gameSessionState0002;
    static String stringState0308;
    static RawSound rawSoundState0014;
    static SceneWidget sceneWidgetState0069;
    static int integerState0377;
    static int integerState0378;
    NodeDeque nodeDequeState0013;
    static RenderingSupport008 renderingSupport008State0006;
    static String stringState0309;
    static int integerState0379;

    final boolean computeBoolean0220(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return false;
        }
        return null != this.computeUiComponent0166((byte) -74) ? true : false;
    }

    void performAction0218(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeException = null;
        MixedSupport113 mixedSupport113Local2 = null;
        UiComponent uiComponentLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 <= 38) {
            this.computeBoolean0220(false);
          }
          super.performAction0218(uiComponentArgument1, 68, integerArgument3, integerArgument4);
          mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1439((byte) 71));
          while (uiComponentLocal3 != null) {
            if (uiComponentLocal3.computeBoolean0144((byte) 38)) {
              uiComponentLocal3.performAction0218(uiComponentArgument1, 47, this.integerState0104 + integerArgument3, integerArgument4 + this.integerState0110);
              uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1441(-62));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeException = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeException;
          stackStringBuilderLocal6 = new StringBuilder().append("kf.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction0914(UiComponent uiComponentArgument1, byte byteArgument2) {
        try {
          if (byteArgument2 != -55) {
            UiComponent uiComponentLocal1 = (UiComponent) null;
            this.computeBoolean0221(false, (UiComponent) null);
          }
          this.nodeDequeState0013.performAction1766(uiComponentArgument1, 2777);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "kf.KC(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    boolean computeBoolean0182(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        UiComponent uiComponentLocal5 = null;
        MixedSupport113 mixedSupport113Local6 = null;
        boolean stackBooleanLocal7 = false;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport113Local6 = new MixedSupport113(this.nodeDequeState0013);
          integerLocal2 = 18 % ((-22 - integerArgument1) / 49);
          uiComponentLocal5 = (UiComponent) (mixedSupport113Local6.computeHashNode1439((byte) 71));
          while (uiComponentLocal5 != null) {
            if (uiComponentLocal5.computeBoolean0144((byte) 124)) {
              if (uiComponentLocal5.computeBoolean0220(true) &&
                uiComponentLocal5.computeBoolean0182(-79, integerArgument2, uiComponentArgument3, characterArgument4)) {
                return true;
              }
              uiComponentLocal5 = (UiComponent) (mixedSupport113Local6.computeHashNode1441(-78));
              continue;
            }
            break;
          }
          integerLocal3 = integerArgument2;
          if (integerLocal3 != 80) {
            return false;
          }
          if (!MixedSupport011.booleanArrayState0002[81]) {
            stackBooleanLocal7 = this.computeBoolean0911(32, uiComponentArgument3);
          } else {
            stackBooleanLocal7 = this.computeBoolean0912(uiComponentArgument3, (byte) -120);
          }
          return stackBooleanLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal1 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal1;
          stackStringBuilderLocal9 = new StringBuilder().append("kf.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(characterArgument4).append(')').toString());
        }
    }

    final void performAction0213(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        MixedSupport113 mixedSupport113Local1 = null;
        UiComponent uiComponentLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal2 = (UiComponent) (mixedSupport113Local1.computeHashNode1439((byte) 71));
          while (uiComponentLocal2 != null) {
            if (uiComponentLocal2.computeBoolean0144((byte) 119)) {
              uiComponentLocal2.performAction0213(integerArgument1, integerArgument2 ^ 0, this.integerState0110 + integerArgument3, uiComponentArgument4, this.integerState0104 + integerArgument5, integerArgument6);
              uiComponentLocal2 = (UiComponent) (mixedSupport113Local1.computeHashNode1441(-126));
              continue;
            }
            break;
          }
          if (integerArgument2 != 64) {
            stringState0309 = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("kf.IB(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static String computeString0913(CharSequence charSequenceArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        StringBuilder discarded$0 = null;
        Object stackObjectLocal3 = null;
        String stackStringLocal4 = null;
        Object stackObjectLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        StringBuilder stringBuilderLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        integerLocal18 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (charSequenceArgument1 == null) {
            stackObjectLocal3 = null;
            return (String) (stackObjectLocal3);
          }
          integerLocal11 = 0;
          integerLocal13 = charSequenceArgument1.length();
          while (integerLocal13 > integerLocal11) {
            if (MixedSupport136.computeBoolean1681(charSequenceArgument1.charAt(integerLocal11), 32)) {
              integerLocal11++;
              continue;
            }
            break;
          }
          while (integerLocal11 < integerLocal13) {
            if (MixedSupport136.computeBoolean1681(charSequenceArgument1.charAt(integerLocal13 - 1), 32)) {
              integerLocal13--;
              continue;
            }
            break;
          }
          integerLocal14 = -integerLocal11 + integerLocal13;
          if (integerLocal14 < 1) {
            return null;
          }
          if (12 < integerLocal14) {
            return null;
          }
          stringBuilderLocal15 = new StringBuilder(integerLocal14);
          if (byteArgument2 != 2) {
            stackStringLocal4 = (String) null;
            return stackStringLocal4;
          }
          for (integerLocal1 = integerLocal11; integerLocal13 > integerLocal1; integerLocal1++) {
            integerLocal16 = charSequenceArgument1.charAt(integerLocal1);
            if (UiComponentPart020.computeBoolean1180((char) integerLocal16, byteArgument2 ^ -6239)) {
              integerLocal17 = MixedSupport140.computeCharacter1709(228, (char) integerLocal16);
              if (integerLocal17 != 0) {
                discarded$0 = stringBuilderLocal15.append((char) integerLocal17);
              }
            }
          }
          if (0 != stringBuilderLocal15.length()) {
            stackStringLocal6 = stringBuilderLocal15.toString();
            return stackStringLocal6;
          }
          stackObjectLocal5 = null;
          return (String) (stackObjectLocal5);
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal10 = caughtParameterLocal19;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal12;
          stackStringBuilderLocal8 = new StringBuilder().append("kf.MC(");
          if (charSequenceArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final int computeInteger0226(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3 = 0;
        MixedSupport113 mixedSupport113Local4 = new MixedSupport113(this.nodeDequeState0013);
        UiComponent uiComponentLocal5 = (UiComponent) (mixedSupport113Local4.computeHashNode1439((byte) 71));
        int integerLocal6;
        while (uiComponentLocal5 != null) {
          integerLocal1 = uiComponentLocal5.computeInteger0226(-31);
          if (integerLocal3 < integerLocal1) {
            integerLocal3 = integerLocal1;
          }
          uiComponentLocal5 = (UiComponent) (mixedSupport113Local4.computeHashNode1441(-61));
        }
        integerLocal6 = -18 / ((36 - integerArgument1) / 51);
        return integerLocal3;
    }

    String computeString0223(byte byteArgument1) {
        MixedSupport113 mixedSupport113Local1;
        UiComponent uiComponentLocal2;
        String stringLocal3;
        int integerLocal4;
        UiComponent uiComponentLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0013);
        uiComponentLocal2 = (UiComponent) (mixedSupport113Local1.computeHashNode1439((byte) 71));
        if (byteArgument1 != 113) {
          uiComponentLocal5 = (UiComponent) null;
          this.computeBoolean0214(59, 12, 76, (UiComponent) null, -65, -4, true);
        }
        while (uiComponentLocal2 != null) {
          stringLocal3 = uiComponentLocal2.computeString0223((byte) 113);
          if (stringLocal3 != null) {
            return stringLocal3;
          }
          uiComponentLocal2 = (UiComponent) (mixedSupport113Local1.computeHashNode1441(-47));
        }
        return null;
    }

    private final void performAction0915(int integerArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 0) {
          integerState0378 = -109;
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0013);
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1439((byte) 71));
        while (uiComponentLocal3 != null) {
          uiComponentLocal3.performAction0228(121);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1441(integerArgument1 - 57));
        }
    }

    void performAction0222(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (integerArgument5 != -16555) {
          UiComponent uiComponentLocal1 = (UiComponent) null;
          this.computeBoolean0912((UiComponent) null, (byte) 126);
        }
        super.performAction0222(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5 + 0);
        this.performAction0915(0);
    }

    final boolean computeBoolean0912(UiComponent uiComponentArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent uiComponentLocal2 = null;
        MixedSupport113 mixedSupport113Local3 = null;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        MixedSupport113 mixedSupport113Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.nodeDequeState0013.computeBoolean1769(-105)) {
            return false;
          }
          mixedSupport113Local6 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal2 = (UiComponent) (mixedSupport113Local6.computeHashNode1447(true));
          while (uiComponentLocal2 != null) {
            if (uiComponentLocal2.computeBoolean0220(true)) {
              mixedSupport113Local3 = new MixedSupport113(this.nodeDequeState0013);
              mixedSupport113Local3.computeHashNode1442(uiComponentLocal2, (byte) -88);
              uiComponentLocal4 = (UiComponent) (mixedSupport113Local3.computeHashNode1450(2078965185));
              while (uiComponentLocal4 != null) {
                if (uiComponentLocal4.computeBoolean0221(false, uiComponentArgument1)) {
                  return true;
                }
                uiComponentLocal4 = (UiComponent) (mixedSupport113Local3.computeHashNode1450(2078965185));
              }
            }
            uiComponentLocal2 = (UiComponent) (mixedSupport113Local6.computeHashNode1450(2078965185));
          }
          if (byteArgument2 < -16) {
            return false;
          }
          sceneWidgetState0069 = (SceneWidget) null;
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal1;
          stackStringBuilderLocal8 = new StringBuilder().append("kf.QC(");
          if (uiComponentArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final void performAction0225(byte byteArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0013);
        if (byteArgument1 != -95) {
          this.computeString0223((byte) 50);
        }
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1439((byte) 71));
        while (uiComponentLocal3 != null) {
          uiComponentLocal3.performAction0225((byte) -95);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1441(-98));
        }
    }

    final boolean computeBoolean0056(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        MixedSupport113 mixedSupport113Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local1.computeHashNode1439((byte) 71));
          if (byteArgument7 != -55) {
            return true;
          }
          while (uiComponentLocal3 != null) {
            if (uiComponentLocal3.computeBoolean0144((byte) 120)) {
              if (uiComponentLocal3.computeBoolean0056(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, this.integerState0104 + integerArgument5, this.integerState0110 + integerArgument6, (byte) -55)) {
                return true;
              }
              uiComponentLocal3 = (UiComponent) (mixedSupport113Local1.computeHashNode1441(-113));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("kf.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    ComponentContainer(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5, (CallbackContract006) null);
        this.nodeDequeState0013 = new NodeDeque();
    }

    final boolean computeBoolean0214(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent uiComponentLocal2 = null;
        int integerLocal3 = 0;
        UiComponent uiComponentLocal4 = null;
        MixedSupport113 mixedSupport113Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport113Local5 = new MixedSupport113(this.nodeDequeState0013);
          if (booleanArgument7) {
            uiComponentLocal4 = (UiComponent) null;
            this.computeBoolean0221(true, (UiComponent) null);
          }
          uiComponentLocal2 = (UiComponent) (mixedSupport113Local5.computeHashNode1439((byte) 71));
          while (uiComponentLocal2 != null) {
            if (uiComponentLocal2.computeBoolean0144((byte) 67)) {
              if (uiComponentLocal2.computeBoolean0220(true) &&
                uiComponentLocal2.computeBoolean0214(integerArgument1, integerArgument2, integerArgument3, uiComponentArgument4, integerArgument5, integerArgument6, booleanArgument7)) {
                return true;
              }
              uiComponentLocal2 = (UiComponent) (mixedSupport113Local5.computeHashNode1441(-128));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal1;
          stackStringBuilderLocal7 = new StringBuilder().append("kf.FC(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    private final void performAction0910(int integerArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, Hashtable hashtableArgument4) {
        StringBuilder discarded$3 = null;
        int integerLocal2 = 0;
        StringBuilder discarded$4 = null;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        StringBuilder stringBuilderLocal6 = null;
        MixedSupport113 mixedSupport113Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 != 0) {
            stringBuilderLocal6 = (StringBuilder) null;
            this.computeStringBuilder0219((Hashtable) null, -83, (StringBuilder) null, true);
          }
          mixedSupport113Local7 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal4 = (UiComponent) (mixedSupport113Local7.computeHashNode1439((byte) 71));
          while (uiComponentLocal4 != null) {
            discarded$3 = stringBuilderArgument3.append('\n');
            for (integerLocal2 = 0; integerLocal2 <= integerArgument1; integerLocal2++) {
              discarded$4 = stringBuilderArgument3.append(' ');
            }
            uiComponentLocal4.computeStringBuilder0219(hashtableArgument4, 1 + integerArgument1, stringBuilderArgument3, true);
            uiComponentLocal4 = (UiComponent) (mixedSupport113Local7.computeHashNode1441(-113));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal13 = caughtParameterLocal15;
          runtimeExceptionLocal14 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal14;
          stackStringBuilderLocal9 = new StringBuilder().append("kf.OC(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (hashtableArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    void performAction0162(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument3 == 0 &&
          this.callbackContract004State0006 != null) {
          this.callbackContract004State0006.performAction0017(true, integerArgument1, integerArgument4, (byte) -108, (UiComponent) (this));
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0013);
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1447(true));
        while (uiComponentLocal3 != null) {
          uiComponentLocal3.performAction0162(integerArgument1 + this.integerState0110, -124, integerArgument3, integerArgument4 + this.integerState0104);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1450(2078965185));
        }
        if (integerArgument2 > -103) {
          this.performAction0162(59, -115, 20, 76);
        }
    }

    final StringBuilder computeStringBuilder0219(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (this.computeBoolean0215(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0206((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
            this.performAction0910(integerArgument2, 0, stringBuilderArgument3, hashtableArgument1);
          }
          if (!booleanArgument4) {
            rawSoundState0014 = (RawSound) null;
          }
          stackStringBuilderLocal2 = (StringBuilder) (stringBuilderArgument3);
          return stackStringBuilderLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("kf.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final boolean computeBoolean0911(int integerArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent uiComponentLocal2 = null;
        MixedSupport113 mixedSupport113Local3 = null;
        UiComponent uiComponentLocal4 = null;
        int integerLocal5 = 0;
        MixedSupport113 mixedSupport113Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.nodeDequeState0013.computeBoolean1769(-15)) {
            return false;
          }
          mixedSupport113Local6 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal2 = (UiComponent) (mixedSupport113Local6.computeHashNode1439((byte) 71));
          while (uiComponentLocal2 != null) {
            if (uiComponentLocal2.computeBoolean0220(true)) {
              mixedSupport113Local3 = new MixedSupport113(this.nodeDequeState0013);
              mixedSupport113Local3.computeHashNode1443(uiComponentLocal2, false);
              uiComponentLocal4 = (UiComponent) (mixedSupport113Local3.computeHashNode1441(integerArgument1 ^ -24));
              while (uiComponentLocal4 != null) {
                if (uiComponentLocal4.computeBoolean0221(false, uiComponentArgument2)) {
                  return true;
                }
                uiComponentLocal4 = (UiComponent) (mixedSupport113Local3.computeHashNode1441(integerArgument1 - 119));
              }
            }
            uiComponentLocal2 = (UiComponent) (mixedSupport113Local6.computeHashNode1441(-109));
          }
          if (integerArgument1 != 32) {
            ComponentContainer.performAction0916(-42);
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal1;
          stackStringBuilderLocal8 = new StringBuilder().append("kf.PC(").append(integerArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    public static void performAction0916(int integerArgument1) {
        if (integerArgument1 < 72) {
          ComponentContainer.performAction0916(-51);
        }
        rawSoundState0014 = null;
        stringState0308 = null;
        sceneWidgetState0069 = null;
        gameSessionState0002 = null;
        stringState0309 = null;
        stringState0307 = null;
        renderingSupport008State0006 = null;
    }

    UiComponent computeUiComponent0166(byte byteArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0013);
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1439((byte) 71));
        while (uiComponentLocal3 != null) {
          if (uiComponentLocal3.computeBoolean0220(true)) {
            return uiComponentLocal3;
          }
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1441(-92));
        }
        if (byteArgument1 == -74) {
          return null;
        }
        rawSoundState0014 = (RawSound) null;
        return null;
    }

    final boolean computeBoolean0221(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        MixedSupport113 mixedSupport113Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument1) {
            integerState0377 = -99;
          }
          mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0013);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local1.computeHashNode1439((byte) 71));
          while (true) {
            if (uiComponentLocal3 == null) {
              return false;
            }
            if (!uiComponentLocal3.computeBoolean0221(false, uiComponentArgument2)) {
              uiComponentLocal3 = (UiComponent) (mixedSupport113Local1.computeHashNode1441(-69));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("kf.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        stringState0308 = "Offer draw";
        stringState0307 = "Unable to connect to the data server. Please check any firewall you are using.";
        integerState0378 = -1;
        stringState0309 = "This is your RuneScape clan if you have one.";
    }
}
