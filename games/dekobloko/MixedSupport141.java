/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport141 {
    static String stringState0575;
    static String stringState0576;
    static boolean booleanState0194;
    static String stringState0577;
    static String stringState0578;
    static String stringState0579;
    static byte[] byteArrayState0029;

    final static boolean computeBoolean1908(char characterArgument1, int integerArgument2) {
        if (integerArgument2 != -24380) {
          short[] shortArrayLocal1 = (short[]) null;
          MixedSupport141.computeShortArray1910((CipherPacketBuffer) null, true, (short[]) null, -23);
          if (characterArgument1 < 65) {
            if (characterArgument1 < 97) {
              return false;
            }
            if (122 >= characterArgument1) {
              return true;
            }
            return false;
          }
          if (characterArgument1 <= 90) {
            return true;
          }
          if (characterArgument1 < 97) {
            return false;
          }
          if (122 >= characterArgument1) {
            return true;
          }
          return false;
        }
        if (characterArgument1 >= 65) {
          if (characterArgument1 <= 90) {
            return true;
          }
          if (characterArgument1 < 97) {
            return false;
          }
          if (122 >= characterArgument1) {
            return true;
          }
          return false;
        }
        if (characterArgument1 < 97) {
          return false;
        }
        if (122 >= characterArgument1) {
          return true;
        }
        return false;
    }

    final static void performAction1911(int integerArgument1) {
        if (integerArgument1 != 0) {
          MixedSupport141.performAction1911(118);
          DualNode.performAction0138((byte) 123, GameplayControls.sceneWidgetPart005State0003);
          return;
        }
        DualNode.performAction0138((byte) 123, GameplayControls.sceneWidgetPart005State0003);
    }

    public static void performAction1909(int integerArgument1) {
        stringState0576 = null;
        stringState0577 = null;
        byteArrayState0029 = null;
        stringState0575 = null;
        stringState0578 = null;
        if (integerArgument1 == -66) {
          stringState0579 = null;
          return;
        }
        booleanState0194 = true;
        stringState0579 = null;
    }

    final static short[] computeShortArray1910(CipherPacketBuffer cipherPacketBufferArgument1, boolean booleanArgument2, short[] shortArrayArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        Object stackObjectLocal6 = null;
        short[] stackShortArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!booleanArgument2) {
            MixedSupport141.computeBoolean1908('\016', -20);
          }
          integerLocal1 = cipherPacketBufferArgument1.computeInteger1857(integerArgument4, (byte) 110);
          if (integerLocal1 == 0) {
            stackObjectLocal6 = null;
            return (short[]) (stackObjectLocal6);
          }
          if (shortArrayArgument3 == null ||
            shortArrayArgument3.length != integerLocal1) {
            shortArrayArgument3 = new short[integerLocal1];
          }
          integerLocal2 = cipherPacketBufferArgument1.computeInteger1857(4, (byte) 123);
          integerLocal3 = (short)cipherPacketBufferArgument1.computeInteger1857(16, (byte) 46);
          if (integerLocal2 > 0) {
            for (integerLocal4 = 0; integerLocal1 > integerLocal4; integerLocal4++) {
              shortArrayArgument3[integerLocal4] = (short)(cipherPacketBufferArgument1.computeInteger1857(integerLocal2, (byte) 99) + integerLocal3);
            }
          } else {
            for (integerLocal4 = 0; integerLocal1 > integerLocal4; integerLocal4++) {
              shortArrayArgument3[integerLocal4] = (short)integerLocal3;
            }
          }
          stackShortArrayLocal7 = (short[]) (shortArrayArgument3);
          return stackShortArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal13 = caughtParameterLocal15;
          runtimeExceptionLocal14 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal14;
          stackStringBuilderLocal9 = new StringBuilder().append("v.B(");
          if (cipherPacketBufferArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(booleanArgument2).append(',');
          if (shortArrayArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument4).append(')').toString());
        }
    }

    static {
        stringState0576 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        stringState0575 = "Email: ";
        stringState0577 = "Unpacking music";
        booleanState0194 = true;
        stringState0578 = "Resigned";
        stringState0579 = "Mouse over an icon for details";
    }
}
