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

    final UiComponentPart003 computeUiComponentPart0030921(byte byteArgument1) {
        MixedSupport113 mixedSupport113Local1;
        UiComponentPart003 uiComponentPart003Local2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0012);
        uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport113Local1.computeHashNode1553((byte) 71));
        if (byteArgument1 > -73) {
          UiComponentPart016.performAction0923((byte) 44);
        }
        while (uiComponentPart003Local2 != null) {
          if (uiComponentPart003Local2.booleanState0011) {
            return uiComponentPart003Local2;
          }
          uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport113Local1.computeHashNode1555(-93));
        }
        return null;
    }

    final void performAction0919(boolean booleanArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument1) {
          stringState0297 = (String) null;
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1553((byte) 71));
        while (uiComponentPart003Local3 != null) {
          uiComponentPart003Local3.booleanState0011 = false;
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1555(-48));
        }
        this.uiComponentState0002 = null;
    }

    final static int computeInteger0915(byte byteArgument1, int integerArgument2, Random randomArgument3) {
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
          if (MixedSupport103.computeBoolean1346(922790152, integerArgument2)) {
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
          stackIntegerLocal5 = ReturnedShapeCache.computeInteger1301(integerArgument2, 105, integerLocal3);
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
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    public UiComponentPart016() {
        super(0, 0, TextLayout.integerState0111, MixedSupport143.integerState0836, (CallbackContract004) null, (CallbackContract006) null);
        this.nodeDequeState0012 = new NodeDeque();
    }

    final static void performAction0918(boolean booleanArgument1, int integerArgument2) {
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
        MixedSupport118.performAction1626((byte) 123);
        if (GameDomainSupport003.rgbSpriteState0020 == SceneWidgetPart011.rgbSpriteState0058) {
          NetworkSupport004.performAction0649(integerArgument2 - 26499);
        } else {
          if (MixedSupport016.sceneWidgetPart013State0001 != null) {
            stackIntegerLocal3 = (SceneWidgetNode.computeBoolean1007(MixedSupport016.sceneWidgetPart013State0001.integerState0843, -8222)) ? 1 : 0;
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
          stackIntegerLocal10 = MixedSupport068.integerState0353;
          stackBooleanLocal11 = (MixedSupport043.booleanState0049) || (MixedSupport034.booleanState0042) || (integerLocal2 != 0);
          stackIntegerLocal12 = 15;
          stackBooleanLocal13 = booleanArgument1;
          stackBooleanLocal14 = true;
          stackIntegerLocal15 = integerLocal1;
          stackBooleanLocal16 = (50 >= MixedSupport106.integerState0589) ? false : true;
          BucketBoard.performAction1068(stackIntegerLocal5, stackBooleanLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal10, stackBooleanLocal11, stackIntegerLocal12, stackBooleanLocal13, stackBooleanLocal14, stackIntegerLocal15 != 0, stackBooleanLocal16);
        }
        if (integerArgument2 != -3051) {
          return;
        }
        if (MixedSupport123.booleanState0181) {
          DiagnosticSupport002.performAction0836((byte) 126, MixedSupport137.stringState0562);
          MixedSupport123.booleanState0181 = false;
        }
        if (MixedSupport050.booleanState0064) {
          SocketFactory.cipherPacketBufferState0002.performAction1811(58, -4);
          MixedSupport050.booleanState0064 = false;
        }
        if (MixedSupport091.booleanState0120) {
          SocketFactory.cipherPacketBufferState0002.performAction1811(10, -4);
          MixedSupport091.booleanState0120 = false;
        }
    }

    final void performAction0922(int integerArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 0) {
          stringState0297 = (String) null;
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1553((byte) 71));
        while (uiComponentPart003Local3 != null) {
          if (uiComponentPart003Local3.computeBoolean0179((byte) 39)) {
            uiComponentPart003Local3.performAction0158((byte) 124);
          }
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1555(integerArgument1 - 70));
        }
        this.uiComponentState0002 = (UiComponent) ((Object) this.computeUiComponentPart0030921((byte) -87));
    }

    public static void performAction0923(byte byteArgument1) {
        networkSupport011State0001 = null;
        stringState0297 = null;
        stringState0296 = null;
        mixedSupport004State0001 = null;
        int integerLocal1 = 99 % ((-85 - byteArgument1) / 40);
    }

    final UiComponent computeUiComponent0917(int integerArgument1) {
        MixedSupport113 mixedSupport113Local1;
        UiComponentPart003 uiComponentPart003Local2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        mixedSupport113Local1 = new MixedSupport113(this.nodeDequeState0012);
        if (integerArgument1 != 14) {
          return (UiComponent) null;
        }
        uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport113Local1.computeHashNode1553((byte) 71));
        while (uiComponentPart003Local2 != null) {
          if (uiComponentPart003Local2.booleanState0011) {
            return uiComponentPart003Local2.computeUiComponent0176((byte) -74);
          }
          uiComponentPart003Local2 = (UiComponentPart003) (mixedSupport113Local1.computeHashNode1555(-93));
        }
        return null;
    }

    final void performAction0920(byte byteArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 != -66) {
          mixedSupport004State0001 = (MixedSupport004) null;
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0012);
        UiComponentPart003 uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1553((byte) 71));
        while (uiComponentPart003Local3 != null) {
          if (uiComponentPart003Local3.computeBoolean0177((byte) 110)) {
            uiComponentPart003Local3.performAction0158((byte) 120);
          }
          uiComponentPart003Local3 = (UiComponentPart003) (mixedSupport113Local2.computeHashNode1555(byteArgument1 ^ 8));
        }
    }

    final void performAction0916(byte byteArgument1, UiComponent uiComponentArgument2) {
        UiComponentPart003 uiComponentPart003Local1 = null;
        try {
          if (!(uiComponentArgument2 instanceof UiComponentPart003)) {
            throw new IllegalArgumentException();
          }
          if (byteArgument1 > -104) {
            UiComponent uiComponentLocal2 = (UiComponent) null;
            this.performAction0916((byte) -72, (UiComponent) null);
          }
          uiComponentPart003Local1 = (UiComponentPart003) (uiComponentArgument2);
          this.nodeDequeState0012.performAction1918(uiComponentPart003Local1, 7143);
          uiComponentPart003Local1.booleanState0011 = true;
          uiComponentPart003Local1.computeBoolean0237(false, (UiComponent) (this));
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "ka.F(" + byteArgument1 + ',' + (uiComponentArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0172(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (null != this.callbackContract004State0006) {
          this.callbackContract004State0006.performAction0018(true, integerArgument1, integerArgument4, (byte) -100, (UiComponent) (this));
        }
        MixedSupport113 mixedSupport113Local2 = new MixedSupport113(this.nodeDequeState0012);
        if (integerArgument2 > -103) {
          return;
        }
        UiComponent uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1561(true));
        while (uiComponentLocal3 != null) {
          uiComponentLocal3.performAction0172(integerArgument1 + this.integerState0110, -116, integerArgument3, this.integerState0104 + integerArgument4);
          uiComponentLocal3 = (UiComponent) (mixedSupport113Local2.computeHashNode1565(2078965185));
        }
    }

    static {
        stringState0296 = "CHALLENGE!";
        stringState0297 = "Members' Benefits";
    }
}
