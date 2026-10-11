/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport049 {
    static boolean booleanState0058;
    static int integerState0262;
    static int integerState0263;
    static int integerState0264;
    static String stringState0205;

    final static boolean computeBoolean0648(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        if (integerArgument1 != 17) {
          integerState0264 = -63;
          if (integerArgument7 > integerArgument3) {
            return false;
          }
          if (integerArgument4 + integerArgument7 <= integerArgument3) {
            return false;
          }
          if (integerArgument2 < integerArgument5) {
            return false;
          }
          if (integerArgument5 + integerArgument6 > integerArgument2) {
            return true;
          }
          return false;
        }
        if (integerArgument7 > integerArgument3) {
          return false;
        }
        if (integerArgument4 + integerArgument7 <= integerArgument3) {
          return false;
        }
        if (integerArgument2 < integerArgument5) {
          return false;
        }
        if (integerArgument5 + integerArgument6 > integerArgument2) {
          return true;
        }
        return false;
    }

    public static void performAction0646(int integerArgument1) {
        int integerLocal1 = -114 % ((integerArgument1 + 21) / 55);
        stringState0205 = null;
    }

    final static void performAction0647(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        MixedSupport059.sceneWidgetState0055.performAction1994(integerArgument3, 0, integerArgument5, integerArgument1, integerArgument6);
        if (null != SceneWidgetPart007.sceneWidgetPart005State0002) {
          SceneWidgetPart007.sceneWidgetPart005State0002.performAction0800(integerArgument4, -MixedSupport077.integerState0416 + integerArgument4, integerArgument1, integerArgument2, (byte) -18, integerArgument1);
          if (byteArgument7 >= -83) {
            integerState0262 = -12;
            return;
          }
          return;
        }
        if (byteArgument7 < -83) {
          return;
        }
        integerState0262 = -12;
    }

    final static void performAction0649(int integerArgument1, int integerArgument2, int integerArgument3, PacketBuffer packetBufferArgument4, int integerArgument5) {
        try {
          packetBufferArgument4.performAction2073(true, 12);
          packetBufferArgument4.performAction2087(-1, integerArgument3);
          packetBufferArgument4.performAction2087(-1, integerArgument5);
          packetBufferArgument4.performAction2087(-1, integerArgument1);
          packetBufferArgument4.performAction2073(true, integerArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gi.C(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (packetBufferArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ')');
        }
    }

    static {
        stringState0205 = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
