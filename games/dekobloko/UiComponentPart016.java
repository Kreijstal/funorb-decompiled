/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class UiComponentPart016 extends ComponentDecorator {
    static String stringState0296;
    private NodeDeque nodeDequeState0012;
    static String stringState0297;
    static MixedSupport004 mixedSupport004State0001;
    static NetworkSupport011 networkSupport011State0001;

    final UiComponentPart003 computeUiComponentPart0030836(byte byteArgument1) {
        MixedSupport108 mixedSupport108Local1;
        UiComponentPart003 uiComponentPart003Local2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        mixedSupport108Local1 = new MixedSupport108(this.nodeDequeState0012);
        uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport108Local1.computeHashNode1412((byte) 71));
        if (byteArgument1 > -73) {
          UiComponentPart016.clearStaticReferences((byte) 44);
        }
        while (uiComponentPart003Local2 != null) {
          if (uiComponentPart003Local2.booleanState0011) {
            return uiComponentPart003Local2;
          }
          uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport108Local1.computeHashNode1414(-93));
        }
        return null;
    }

    final void performAction0834(boolean booleanArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument1) {
          stringState0297 = (String) null;
        }
        MixedSupport108 mixedSupport108Local2 = new MixedSupport108(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1412((byte) 71));
        while (uiComponentPart003Local3 != null) {
          uiComponentPart003Local3.booleanState0011 = false;
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1414(-48));
        }
        this.uiComponentState0002 = null;
    }

    final static int computeInteger0830(byte byteArgument1, int integerArgument2, Random randomArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (integerArgument2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (MixedSupport098.computeBoolean1217(922790152, integerArgument2)) {
            stackIntegerLocal4 = (int)(((long)randomArgument3.nextInt() & 4294967295L) * (long)integerArgument2 >> 32);
            return stackIntegerLocal4;
          }
          if (byteArgument1 < 42) {
            networkSupport011State0001 = (NetworkSupport011) null;
          }
          integerLocal1 = -(int)(4294967296L % (long)integerArgument2) + -2147483648;
          do {
            integerLocal3 = randomArgument3.nextInt();
          } while (integerLocal1 <= integerLocal3);
          stackIntegerLocal5 = ReturnedShapeCache.computeInteger1176(integerArgument2, 105, integerLocal3);
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("ka.S(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (randomArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    public UiComponentPart016() {
        super(0, 0, TextLayout.integerState0111, MixedSupport136.integerState0836, (CallbackContract004) null, (CallbackContract006) null);
        this.nodeDequeState0012 = new NodeDeque();
    }

    final static void performAction0833(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1;
        int integerLocal2;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5;
        boolean stackBooleanLocal6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        int stackIntegerLocal10;
        boolean stackBooleanLocal11 = false;
        int stackIntegerLocal12;
        boolean stackBooleanLocal13;
        boolean stackBooleanLocal14;
        int stackIntegerLocal15;
        boolean stackBooleanLocal16;
        MixedSupport113.performAction1473((byte) 123);
        if (GameDomainSupport003.rgbSpriteState0020 == SceneWidgetPart011.rgbSpriteState0058) {
          NetworkSupport004.performAction0600(integerArgument2 - 26499);
        } else {
          if (MixedSupport016.sceneWidgetPart013State0001 != null) {
            stackIntegerLocal3 = (SceneWidgetNode.computeBoolean0916(MixedSupport016.sceneWidgetPart013State0001.integerState0843, -8222)) ? 1 : 0;
          } else {
            stackIntegerLocal3 = 0;
          }
          integerLocal1 = stackIntegerLocal3;
          stackIntegerLocal4 = (GameDomainSupport003.rgbSpriteState0020 == null) ? 0 : 1;
          integerLocal2 = stackIntegerLocal4;
          stackIntegerLocal5 = 0;
          stackBooleanLocal6 = true;
          stackIntegerLocal7 = 14;
          stackIntegerLocal8 = 11;
          stackIntegerLocal9 = 13;
          stackIntegerLocal10 = HuffmanCodec.integerState0353;
          stackBooleanLocal11 = (MixedSupport043.booleanState0049) || (MixedSupport034.booleanState0042) || (integerLocal2 != 0);
          stackIntegerLocal12 = 15;
          stackBooleanLocal13 = booleanArgument1;
          stackBooleanLocal14 = true;
          stackIntegerLocal15 = integerLocal1;
          stackBooleanLocal16 = (50 >= MixedSupport101.integerState0589) ? false : true;
          BucketBoard.performAction0972(stackIntegerLocal5, stackBooleanLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal10, stackBooleanLocal11, stackIntegerLocal12, stackBooleanLocal13, stackBooleanLocal14, stackIntegerLocal15 != 0, stackBooleanLocal16);
        }
        if (integerArgument2 != -3051) {
          return;
        }
        if (MixedSupport118.booleanState0181) {
          DiagnosticSupport002.performAction0763((byte) 126, MixedSupport130.stringState0562);
          MixedSupport118.booleanState0181 = false;
        }
        if (MixedSupport050.booleanState0064) {
          SocketFactory.cipherPacketBufferState0002.performAction1641(58, -4);
          MixedSupport050.booleanState0064 = false;
        }
        if (BufferedFile.booleanState0120) {
          SocketFactory.cipherPacketBufferState0002.performAction1641(10, -4);
          BufferedFile.booleanState0120 = false;
        }
    }

    final void performAction0837(int integerArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 0) {
          stringState0297 = (String) null;
        }
        MixedSupport108 mixedSupport108Local2 = new MixedSupport108(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1412((byte) 71));
        while (uiComponentPart003Local3 != null) {
          if (uiComponentPart003Local3.computeBoolean0169((byte) 39)) {
            uiComponentPart003Local3.unlink((byte) 124);
          }
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1414(integerArgument1 - 70));
        }
        this.uiComponentState0002 = (UiComponent) ((Object) this.computeUiComponentPart0030836((byte) -87));
    }

    public static void clearStaticReferences(byte byteArgument1) {
        networkSupport011State0001 = null;
        stringState0297 = null;
        stringState0296 = null;
        mixedSupport004State0001 = null;
        int integerLocal1 = 99 % ((-85 - byteArgument1) / 40);
    }

    final UiComponent computeUiComponent0832(int integerArgument1) {
        MixedSupport108 mixedSupport108Local1;
        UiComponentPart003 uiComponentPart003Local2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        mixedSupport108Local1 = new MixedSupport108(this.nodeDequeState0012);
        if (integerArgument1 != 14) {
          return (UiComponent) null;
        }
        uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport108Local1.computeHashNode1412((byte) 71));
        while (uiComponentPart003Local2 != null) {
          if (uiComponentPart003Local2.booleanState0011) {
            return uiComponentPart003Local2.computeUiComponent0166((byte) -74);
          }
          uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport108Local1.computeHashNode1414(-93));
        }
        return null;
    }

    final void performAction0835(byte byteArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 != -66) {
          mixedSupport004State0001 = (MixedSupport004) null;
        }
        MixedSupport108 mixedSupport108Local2 = new MixedSupport108(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1412((byte) 71));
        while (uiComponentPart003Local3 != null) {
          if (uiComponentPart003Local3.computeBoolean0167((byte) 110)) {
            uiComponentPart003Local3.unlink((byte) 120);
          }
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport108Local2.computeHashNode1414(byteArgument1 ^ 8));
        }
    }

    final void performAction0831(byte byteArgument1, UiComponent uiComponentArgument2) {
        UiComponentPart003 uiComponentPart003Local1 = null;
        try {
          if (!(uiComponentArgument2 instanceof UiComponentPart003)) {
            throw new IllegalArgumentException();
          }
          if (byteArgument1 > -104) {
            UiComponent uiComponentLocal2 = (UiComponent) null;
            this.performAction0831((byte) -72, (UiComponent) null);
          }
          uiComponentPart003Local1 = (UiComponentPart003) (uiComponentArgument2);
          this.nodeDequeState0012.addLast(uiComponentPart003Local1, 7143);
          uiComponentPart003Local1.booleanState0011 = true;
          uiComponentPart003Local1.computeBoolean0221(false, (UiComponent) (this));
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "ka.F(" + byteArgument1 + ',' + (uiComponentArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0162(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (null != this.callbackContract004State0006) {
          this.callbackContract004State0006.performAction0017(true, integerArgument1, integerArgument4, (byte) -100, (UiComponent) (this));
        }
        MixedSupport108 mixedSupport108Local2 = new MixedSupport108(this.nodeDequeState0012);
        if (integerArgument2 > -103) {
          return;
        }
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport108Local2.computeHashNode1420(true));
        while (uiComponentLocal3 != null) {
          uiComponentLocal3.performAction0162(integerArgument1 + this.integerState0110, -116, integerArgument3, this.integerState0104 + integerArgument4);
          uiComponentLocal3 = (UiComponent) (mixedSupport108Local2.computeHashNode1423(2078965185));
        }
    }

    static {
        stringState0296 = "CHALLENGE!";
        stringState0297 = "Members' Benefits";
    }
}
