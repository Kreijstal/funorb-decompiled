/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceSupport004 extends MixedSupport120 {
    int integerState0582;
    static String stringState0427;
    static String stringState0428;
    static String[] stringArrayState0031;
    static String stringState0429;
    static RgbSprite rgbSpriteState0043;
    PacketBuffer packetBufferState0007;
    byte byteState0003;

    final int computeInteger0516(boolean booleanArgument1) {
        if (booleanArgument1) {
          return -110;
        }
        if (this.packetBufferState0007 == null) {
          return 0;
        }
        return 100 * this.packetBufferState0007.position / (-this.byteState0003 + this.packetBufferState0007.payload.length);
    }

    static long computeLong1427(long longArgument1, long longArgument2) {
        return longArgument1 ^ longArgument2;
    }

    public static void performAction1430(byte byteArgument1) {
        stringArrayState0031 = null;
        stringState0427 = null;
        stringState0429 = null;
        rgbSpriteState0043 = null;
        stringState0428 = null;
        if (byteArgument1 < 78) {
          ResourceSupport004.computeInteger1429(-100);
        }
    }

    final byte[] computeByteArray0518(byte byteArgument1) {
        if (this.booleanState0173) {
          throw new RuntimeException();
        }
        if (this.packetBufferState0007.payload.length - this.byteState0003 > this.packetBufferState0007.position) {
          throw new RuntimeException();
        }
        if (byteArgument1 > 65) {
          return this.packetBufferState0007.payload;
        }
        ResourceSupport004.computeInteger1429(9);
        return this.packetBufferState0007.payload;
    }

    final static int computeInteger1429(int integerArgument1) {
        int integerLocal1 = -62 % ((integerArgument1 - 81) / 40);
        return MixedSupport003.integerState0018;
    }

    final static void performAction1428(SceneWidgetPart013 sceneWidgetPart013Argument1, byte byteArgument2) {
        SceneWidgetPart013 sceneWidgetPart013Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          sceneWidgetPart013Argument1.performAction0161((byte) 108);
          if (byteArgument2 != -50) {
            return;
          }
          sceneWidgetPart013Local1 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.computeHashNode1970((byte) -99));
          while (sceneWidgetPart013Local1 != null) {
            if (sceneWidgetPart013Local1.computeBoolean1935(sceneWidgetPart013Argument1, false)) {
              sceneWidgetPart013Local1 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.computeHashNode1974(true));
              continue;
            }
            break;
          }
          if (sceneWidgetPart013Local1 == null) {
            MixedSupport051.nodeDequeState0009.performAction1963(sceneWidgetPart013Argument1, 2777);
            return;
          }
          stackIntegerLocal4 = 114;
          MixedSupport043.performAction0598(stackIntegerLocal4, sceneWidgetPart013Argument1, sceneWidgetPart013Local1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("pj.E(");
          if (sceneWidgetPart013Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction1426(int integerArgument1, int integerArgument2, int integerArgument3) {
        MixedSupport138.integerState0819 = integerArgument3;
        BufferedSocket.integerState0661 = integerArgument2;
        if (integerArgument1 != 31004) {
          ResourceSupport004.computeInteger1429(-44);
        }
    }

    ResourceSupport004() {
    }

    static {
        stringState0428 = "This game option is only available to members.";
        stringState0427 = "Add <%0> to ignore list";
        stringArrayState0031 = new String[16];
        stringState0429 = "Enter name of player to add to list";
    }
}
