/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport140 {
    static String stringState0572;
    static String stringState0573;
    static String stringState0574;

    final static void performAction1901(byte byteArgument1) {
        ComponentContainer.gameSessionState0002 = null;
        int integerLocal1 = -59 / ((-91 - byteArgument1) / 32);
        UiComponent.gameSessionState0001 = null;
    }

    final static MixedSupport016 computeMixedSupport0161904(int integerArgument1, String stringArgument2, int integerArgument3) {
        MixedSupport016 mixedSupport016Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        MixedSupport016 stackMixedSupport016Local4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          mixedSupport016Local1 = new MixedSupport016(false);
          mixedSupport016Local1.stringState0075 = stringArgument2;
          integerLocal3 = -78 % ((integerArgument3 - 59) / 32);
          mixedSupport016Local1.integerState0101 = integerArgument1;
          stackMixedSupport016Local4 = mixedSupport016Local1;
          return stackMixedSupport016Local4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("un.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static char computeCharacter1902(int integerArgument1, char characterArgument2) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 228) {
          return 'N';
        }
        integerLocal1 = characterArgument2;
        if (integerLocal1 != 32 &&
          integerLocal1 != 160 &&
          integerLocal1 != 95 &&
          integerLocal1 != 45) {
          if (integerLocal1 != 91 &&
            integerLocal1 != 93 &&
            35 != integerLocal1) {
            if (integerLocal1 != 224 &&
              integerLocal1 != 225 &&
              226 != integerLocal1 &&
              228 != integerLocal1 &&
              integerLocal1 != 227 &&
              integerLocal1 != 192 &&
              integerLocal1 != 193 &&
              integerLocal1 != 194 &&
              integerLocal1 != 196 &&
              195 != integerLocal1) {
              if (integerLocal1 != 232 &&
                integerLocal1 != 233 &&
                integerLocal1 != 234 &&
                integerLocal1 != 235 &&
                200 != integerLocal1 &&
                integerLocal1 != 201 &&
                integerLocal1 != 202 &&
                integerLocal1 != 203) {
                if (integerLocal1 != 237 &&
                  integerLocal1 != 238 &&
                  integerLocal1 != 239 &&
                  205 != integerLocal1 &&
                  integerLocal1 != 206 &&
                  integerLocal1 != 207) {
                  if (integerLocal1 != 242 &&
                    243 != integerLocal1 &&
                    integerLocal1 != 244 &&
                    integerLocal1 != 246 &&
                    245 != integerLocal1 &&
                    integerLocal1 != 210 &&
                    integerLocal1 != 211 &&
                    integerLocal1 != 212 &&
                    integerLocal1 != 214 &&
                    213 != integerLocal1) {
                    if (249 != integerLocal1 &&
                      integerLocal1 != 250 &&
                      integerLocal1 != 251 &&
                      252 != integerLocal1 &&
                      217 != integerLocal1 &&
                      integerLocal1 != 218 &&
                      219 != integerLocal1 &&
                      integerLocal1 != 220) {
                      if (231 != integerLocal1 &&
                        integerLocal1 != 199) {
                        if (integerLocal1 != 255 &&
                          integerLocal1 != 376) {
                          if (integerLocal1 != 241 &&
                            209 != integerLocal1) {
                            if (integerLocal1 == 223) {
                              return 'b';
                            }
                            return Character.toLowerCase(characterArgument2);
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return characterArgument2;
        }
        return '_';
    }

    final static String computeString1906(byte[] byteArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        char[] characterArrayLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        String stackStringLocal9 = null;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          characterArrayLocal3 = new char[integerArgument4];
          integerLocal5 = 0;
          for (integerLocal1 = integerArgument2; integerLocal1 < integerArgument4; integerLocal1++) {
            integerLocal6 = byteArrayArgument1[integerLocal1 + integerArgument3] & 255;
            if (0 != integerLocal6) {
              if (integerLocal6 >= 128 &&
                integerLocal6 < 160) {
                integerLocal7 = MixedSupport091.characterArrayState0006[-128 + integerLocal6];
                if (0 == integerLocal7) {
                  integerLocal7 = 63;
                }
                integerLocal6 = integerLocal7;
              }
              previousIntegerLocal2 = integerLocal5;
              integerLocal5++;
              characterArrayLocal3[previousIntegerLocal2] = (char)integerLocal6;
            }
          }
          stackStringLocal9 = new String(characterArrayLocal3, 0, integerLocal5);
          return stackStringLocal9;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal4 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal4;
          stackStringBuilderLocal11 = new StringBuilder().append("un.C(");
          if (byteArrayArgument1 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean1903(int integerArgument1, int integerArgument2, int integerArgument3, byte byteArgument4) {
        if (byteArgument4 != 52) {
          stringState0574 = (String) null;
        }
        if (0 <= integerArgument2 &&
          integerArgument2 <= 11) {
          if (integerArgument3 >= 1 &&
            integerArgument3 <= UiComponentPart012.computeInteger0654(integerArgument1, 1, integerArgument2)) {
            return true;
          }
          return false;
        }
        return false;
    }

    final static MixedSupport145 computeMixedSupport1451905(int integerArgument1, CipherPacketBuffer cipherPacketBufferArgument2) {
        int integerLocal1 = 0;
        MixedSupport145 stackMixedSupport145Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        MixedSupport145 mixedSupport145Local11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        CipherPacketBuffer cipherPacketBufferLocal14 = null;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal7 = cipherPacketBufferArgument2.computeInteger1857(8, (byte) 87);
          if (integerLocal7 > 0) {
            throw new IllegalStateException("" + integerLocal7);
          }
          integerLocal9 = MouseInput.computeBoolean2036(cipherPacketBufferArgument2, (byte) -127) ? 1 : 0;
          if (integerArgument1 != -128) {
            cipherPacketBufferLocal14 = (CipherPacketBuffer) null;
            MixedSupport140.computeMixedSupport1451905(36, (CipherPacketBuffer) null);
          }
          integerLocal10 = MouseInput.computeBoolean2036(cipherPacketBufferArgument2, (byte) -112) ? 1 : 0;
          mixedSupport145Local11 = new MixedSupport145();
          mixedSupport145Local11.shortState0003 = (short)cipherPacketBufferArgument2.computeInteger1857(16, (byte) 103);
          mixedSupport145Local11.shortArrayState0001 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0001, 16);
          mixedSupport145Local11.shortArrayState0004 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0004, 16);
          mixedSupport145Local11.shortArrayState0009 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0009, 16);
          mixedSupport145Local11.shortState0001 = (short)cipherPacketBufferArgument2.computeInteger1857(16, (byte) 55);
          mixedSupport145Local11.shortArrayState0002 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0002, 16);
          mixedSupport145Local11.shortArrayState0015 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0015, 16);
          mixedSupport145Local11.shortArrayState0008 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0008, 16);
          if (integerLocal9 != 0) {
            mixedSupport145Local11.shortState0002 = (short)cipherPacketBufferArgument2.computeInteger1857(16, (byte) 90);
            mixedSupport145Local11.shortArrayState0013 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0013, 16);
            mixedSupport145Local11.shortArrayState0011 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0011, 16);
            mixedSupport145Local11.shortArrayState0007 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0007, 16);
            mixedSupport145Local11.shortArrayState0005 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0005, 16);
            mixedSupport145Local11.shortArrayState0014 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0014, 16);
            mixedSupport145Local11.shortArrayState0006 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0006, 16);
          }
          if (integerLocal10 != 0) {
            cipherPacketBufferArgument2.computeInteger1857(16, (byte) 125);
            mixedSupport145Local11.shortArrayState0018 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0018, 16);
            mixedSupport145Local11.shortArrayState0010 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0010, 16);
            mixedSupport145Local11.shortArrayState0017 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0017, 16);
            mixedSupport145Local11.shortArrayState0003 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0003, 16);
            mixedSupport145Local11.shortArrayState0016 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0016, 16);
          }
          if (MouseInput.computeBoolean2036(cipherPacketBufferArgument2, (byte) -123)) {
            mixedSupport145Local11.shortArrayState0012 = MixedSupport141.computeShortArray1910(cipherPacketBufferArgument2, true, mixedSupport145Local11.shortArrayState0012, 16);
          }
          if (MouseInput.computeBoolean2036(cipherPacketBufferArgument2, (byte) -115)) {
            mixedSupport145Local11.byteArrayState0033 = UiComponentPart013.computeByteArray0687((byte) 5, mixedSupport145Local11.byteArrayState0033, 16, cipherPacketBufferArgument2);
            integerLocal12 = 0;
            for (integerLocal1 = 0; mixedSupport145Local11.byteArrayState0033.length > integerLocal1; integerLocal1++) {
              if (integerLocal12 < (mixedSupport145Local11.byteArrayState0033[integerLocal1] & 255)) {
                integerLocal12 = mixedSupport145Local11.byteArrayState0033[integerLocal1] & 255;
              }
            }
            if (integerLocal12 != 0) {
              mixedSupport145Local11.byteState0004 = (byte)(integerLocal12 + 1);
            } else {
              mixedSupport145Local11.byteArrayState0033 = null;
            }
          }
          stackMixedSupport145Local2 = mixedSupport145Local11;
          return stackMixedSupport145Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal6 = caughtParameterLocal15;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("un.G(").append(integerArgument1).append(',');
          if (cipherPacketBufferArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void performAction1907(byte byteArgument1) {
        stringState0572 = null;
        if (byteArgument1 < 84) {
          return;
        }
        stringState0574 = null;
        stringState0573 = null;
    }

    static {
        stringState0573 = "Names cannot contain consecutive spaces";
        stringState0574 = "Loading fonts";
        stringState0572 = "Kick <%0> from this game";
    }
}
