/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport132 extends MixedSupport147 {
    static String stringState0546;
    static long longState0049;
    static SceneWidget sceneWidgetState0125;
    static String stringState0547;
    static int[] integerArrayState0209;
    static String stringState0548;
    private Object objectState0005;

    final static String computeString1788(CharSequence charSequenceArgument1, boolean booleanArgument2) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          stringLocal1 = TextLayout.computeString0251(0, DualNodeDeque.computeLong0031(117, charSequenceArgument1));
          if (!booleanArgument2) {
            stackStringLocal3 = (String) null;
            return stackStringLocal3;
          }
          if (stringLocal1 == null) {
            stringLocal1 = "";
          }
          stackStringLocal4 = stringLocal1;
          return stackStringLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("ua.A(");
          if (charSequenceArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final Object computeObject1789(int integerArgument1) {
        if (integerArgument1 != -1) {
          integerArrayState0209 = (int[]) null;
          return this.objectState0005;
        }
        return this.objectState0005;
    }

    final static void performAction1792(byte byteArgument1) {
        ResourceArchive resourceArchiveLocal1 = null;
        ResourceArchive resourceArchiveLocal2;
        ResourceArchive resourceArchiveLocal3;
        if (MixedSupport046.integerState0250 == 0 - GameAssets.integerState0747) {
          MixedSupport046.integerState0250 = MixedSupport046.integerState0250 + 1;
          if (byteArgument1 == -70) {
            return;
          }
          resourceArchiveLocal1 = (ResourceArchive) null;
          MixedSupport132.performAction1786(-119, (ResourceArchive) null, false, (ResourceArchive) null);
          return;
        }
        if (MixedSupport046.integerState0250 != -GameAssets.integerState0747 + 250) {
          MixedSupport046.integerState0250 = MixedSupport046.integerState0250 + 1;
          if (byteArgument1 == -70) {
            return;
          }
          resourceArchiveLocal2 = (ResourceArchive) null;
          MixedSupport132.performAction1786(-119, (ResourceArchive) null, false, (ResourceArchive) null);
          return;
        }
        MixedSupport046.integerState0250 = MixedSupport046.integerState0250 + 1;
        if (byteArgument1 == -70) {
          return;
        }
        resourceArchiveLocal3 = (ResourceArchive) null;
        MixedSupport132.performAction1786(-119, (ResourceArchive) null, false, (ResourceArchive) null);
    }

    final static void performAction1786(int integerArgument1, ResourceArchive resourceArchiveArgument2, boolean booleanArgument3, ResourceArchive resourceArchiveArgument4) {
        try {
          CodecSupport003.performAction1569(MixedSupport036.sceneWidgetState0028, UiComponentPart007.sceneWidgetState0019, sceneWidgetState0125, MixedSupport113.sceneWidgetState0104, InputAdapter003.sceneWidgetState0110, booleanArgument3, MixedSupport150.sceneWidgetState0146, DiagnosticSupport001.sceneWidgetState0017, TextLineMetrics.renderingSupport010State0004, NetworkSupport008.sceneWidgetState0094, (byte) 103, MixedSupport130.sceneWidgetPart006State0002);
          UiComponentPart010.rgbSpriteArrayState0010 = MixedSupport011.computeRgbSpriteArray0164(112, resourceArchiveArgument2, "lobby", "chatfilter");
          InputAdapter003.stringArrayState0044[2] = MixedSupport085.stringState0341;
          InputAdapter003.stringArrayState0044[0] = MixedSupport110.stringState0452;
          InputAdapter003.stringArrayState0044[1] = InputAdapter001.stringState0033;
          GameDomainSupport004.performAction0871((byte) 116, MixedSupport127.renderingSupport010State0006, resourceArchiveArgument4);
          int integerLocal1 = 74 / ((-31 - integerArgument1) / 46);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "ua.D(" + integerArgument1 + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ',' + booleanArgument3 + ',' + (resourceArchiveArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1787(long longArgument1, int integerArgument2) {
        if (integerArgument2 > -127) {
          sceneWidgetState0125 = (SceneWidget) null;
          if (longArgument1 <= 0L) {
            return;
          }
          if (0L == longArgument1 % 10L) {
            RenderingSupport013.performAction1475(-1L + longArgument1, -124);
            RenderingSupport013.performAction1475(1L, -109);
            return;
          }
          RenderingSupport013.performAction1475(longArgument1, -111);
          return;
        }
        if (longArgument1 <= 0L) {
          return;
        }
        if (0L == longArgument1 % 10L) {
          RenderingSupport013.performAction1475(-1L + longArgument1, -124);
          RenderingSupport013.performAction1475(1L, -109);
          return;
        }
        RenderingSupport013.performAction1475(longArgument1, -111);
    }

    final static void performAction1793(byte byteArgument1) {
        MixedSupport136 mixedSupport136Local1 = (MixedSupport136) (UiComponentPart025.nodeDequeState0026.computeHashNode1920((byte) -121));
        int integerLocal2 = -11 % ((byteArgument1 - 19) / 35);
        if (mixedSupport136Local1 == null) {
          NodeHashTable.performAction1653(66);
          return;
        }
        CipherPacketBuffer cipherPacketBufferLocal3 = UiComponentPart006.cipherPacketBufferState0001;
        cipherPacketBufferLocal3.computeInteger2046(7553);
        cipherPacketBufferLocal3.computeInteger2046(7553);
        cipherPacketBufferLocal3.computeInteger2046(7553);
        cipherPacketBufferLocal3.computeInteger2046(7553);
        mixedSupport136Local1.performAction0158((byte) 124);
    }

    final boolean computeBoolean1791(byte byteArgument1) {
        if (byteArgument1 != -83) {
          stringState0547 = (String) null;
          return false;
        }
        return false;
    }

    MixedSupport132(Object objectArgument1, int integerArgument2) {
        super(integerArgument2);
        try {
          this.objectState0005 = objectArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "ua.<init>(" + (objectArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public static void performAction1790(int integerArgument1) {
        if (integerArgument1 == 8) {
          stringState0548 = null;
          sceneWidgetState0125 = null;
          stringState0546 = null;
          stringState0547 = null;
          integerArrayState0209 = null;
          return;
        }
        stringState0547 = (String) null;
        stringState0548 = null;
        sceneWidgetState0125 = null;
        stringState0546 = null;
        stringState0547 = null;
        integerArrayState0209 = null;
    }

    static {
        integerArrayState0209 = new int[8];
        stringState0546 = "WELL DONE!";
        stringState0548 = "Login: ";
        stringState0547 = "Type your password again to make sure it's correct";
    }
}
