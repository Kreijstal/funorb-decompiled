/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ResourceSupport002 implements CallbackContract011 {
    static MixedSupport139 mixedSupport139State0001;
    static String stringState0038;
    private long longState0001;
    static PacketBuffer packetBufferState0001;
    static int integerState0050;
    static boolean booleanState0006;

    public final void performAction0099(byte byteArgument1) {
        if (byteArgument1 != -51) {
          this.longState0001 = -32L;
        }
        this.longState0001 = MixedSupport063.computeLong0827(byteArgument1 + 55);
    }

    final static boolean computeBoolean0096(ResourceArchive resourceArchiveArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != -2147483648) {
            mixedSupport139State0001 = (MixedSupport139) null;
          }
          stackBooleanLocal2 = resourceArchiveArgument1.computeBoolean0921(false);
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ba.AA(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    abstract String computeString0101(byte byteArgument1);

    public static void performAction0100(byte byteArgument1) {
        mixedSupport139State0001 = null;
        stringState0038 = null;
        if (byteArgument1 < 70) {
          return;
        }
        packetBufferState0001 = null;
    }

    public final String computeString0097(byte byteArgument1) {
        if (this.computeBoolean1239((byte) -101)) {
          return null;
        }
        if (byteArgument1 < 52) {
          return (String) null;
        }
        if (MixedSupport063.computeLong0827(4) < (350L + this.longState0001)) {
          return null;
        }
        return this.computeString0101((byte) 49);
    }

    abstract RenderingSupport015 computeRenderingSupport0150098(int integerArgument1);

    final static void performAction0095(int integerArgument1, CipherPacketBuffer cipherPacketBufferArgument2) {
        try {
          int integerLocal1 = 0;
          int integerLocal2 = 0;
          RuntimeException stackRuntimeExceptionLocal3 = null;
          StringBuilder stackStringBuilderLocal4 = null;
          String stackStringLocal5 = null;
          Throwable caughtExceptionLocal6 = null;
          RuntimeException runtimeExceptionLocal7 = null;
          int integerLocal8 = 0;
          int integerLocal9 = 0;
          int integerLocal10 = 0;
          ClassNotFoundException classNotFoundExceptionLocal11 = null;
          InvalidClassException invalidClassExceptionLocal12 = null;
          StreamCorruptedException streamCorruptedExceptionLocal13 = null;
          OptionalDataException optionalDataExceptionLocal14 = null;
          IllegalAccessException illegalAccessExceptionLocal15 = null;
          IllegalArgumentException illegalArgumentExceptionLocal16 = null;
          java.lang.reflect.InvocationTargetException invocationTargetExceptionLocal17 = null;
          SecurityException securityExceptionLocal18 = null;
          IOException iOExceptionLocal19 = null;
          NullPointerException nullPointerExceptionLocal20 = null;
          Exception exceptionLocal21 = null;
          Throwable throwableLocal22 = null;
          int integerLocal23 = 0;
          Object[] objectArrayLocal24 = null;
          Object objectLocal25 = null;
          ObjectInputStream objectInputStreamLocal26 = null;
          int integerLocal27 = 0;
          MixedSupport075 mixedSupport075Local28 = null;
          java.lang.reflect.Field fieldLocal29 = null;
          Object objectLocal30 = null;
          java.lang.reflect.Field fieldLocal31 = null;
          MixedSupport075 mixedSupport075Local32 = null;
          Object objectLocal33 = null;
          java.lang.reflect.Field fieldLocal34 = null;
          Object objectLocal35 = null;
          Object objectLocal36 = null;
          byte[][] byteArrayArrayLocal37 = null;
          java.lang.reflect.Field fieldLocal38 = null;
          java.lang.reflect.Method methodLocal39 = null;
          java.lang.reflect.Method methodLocal40 = null;
          int integerLocal41;
          objectLocal33 = null;
          objectLocal30 = null;
          objectLocal35 = null;
          objectLocal36 = null;
          integerLocal27 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            mixedSupport075Local28 = (MixedSupport075) (MixedSupport002.nodeDequeState0001.computeHashNode1970((byte) -54));
            mixedSupport075Local32 = mixedSupport075Local28;
            if (mixedSupport075Local32 == null) {
              return;
            }
            integerLocal8 = 0;
            if (integerArgument1 != -32141) {
              return;
            }
            for (integerLocal9 = 0; mixedSupport075Local32.integerState0407 > integerLocal9; integerLocal9++) {
              if (mixedSupport075Local28.asyncTaskArrayState0002[integerLocal9] != null) {
                if (mixedSupport075Local28.asyncTaskArrayState0002[integerLocal9].integerState0510 == 2) {
                  mixedSupport075Local28.integerArrayState0135[integerLocal9] = -5;
                }
                if (mixedSupport075Local28.asyncTaskArrayState0002[integerLocal9].integerState0510 == 0) {
                  integerLocal8 = 1;
                }
              }
              if (mixedSupport075Local28.asyncTaskArrayState0001[integerLocal9] != null) {
                if (mixedSupport075Local28.asyncTaskArrayState0001[integerLocal9].integerState0510 == 2) {
                  mixedSupport075Local28.integerArrayState0135[integerLocal9] = -6;
                }
                if (mixedSupport075Local28.asyncTaskArrayState0001[integerLocal9].integerState0510 == 0) {
                  integerLocal8 = 1;
                }
              }
            }
            if (integerLocal8 != 0) {
              return;
            }
            integerLocal9 = cipherPacketBufferArgument2.position;
            cipherPacketBufferArgument2.performAction2067(mixedSupport075Local32.integerState0406, false);
            for (integerLocal1 = 0; integerLocal1 < mixedSupport075Local32.integerState0407; integerLocal1++) {
              if (0 == mixedSupport075Local32.integerArrayState0135[integerLocal1]) {
                try {
                  integerLocal10 = mixedSupport075Local32.integerArrayState0138[integerLocal1];
                  if (integerLocal10 == 0) {
                    fieldLocal29 = (java.lang.reflect.Field) (mixedSupport075Local32.asyncTaskArrayState0002[integerLocal1].objectState0004);
                    integerLocal23 = fieldLocal29.getInt((Object) null);
                    cipherPacketBufferArgument2.performAction2073(true, 0);
                    cipherPacketBufferArgument2.performAction2067(integerLocal23, false);
                  } else {
                    if (integerLocal10 == 1) {
                      fieldLocal31 = (java.lang.reflect.Field) (mixedSupport075Local32.asyncTaskArrayState0002[integerLocal1].objectState0004);
                      fieldLocal34 = fieldLocal31;
                      fieldLocal34.setInt((Object) null, mixedSupport075Local32.integerArrayState0136[integerLocal1]);
                      cipherPacketBufferArgument2.performAction2073(true, 0);
                    } else {
                      if (integerLocal10 == 2) {
                        fieldLocal38 = (java.lang.reflect.Field) (mixedSupport075Local32.asyncTaskArrayState0002[integerLocal1].objectState0004);
                        integerLocal23 = fieldLocal38.getModifiers();
                        cipherPacketBufferArgument2.performAction2073(true, 0);
                        cipherPacketBufferArgument2.performAction2067(integerLocal23, false);
                      }
                    }
                  }
                  if (3 == integerLocal10) {
                    methodLocal39 = (java.lang.reflect.Method) (mixedSupport075Local32.asyncTaskArrayState0001[integerLocal1].objectState0004);
                    byteArrayArrayLocal37 = mixedSupport075Local32.byteArrayArrayArrayState0002[integerLocal1];
                    objectArrayLocal24 = new Object[byteArrayArrayLocal37.length];
                    for (integerLocal2 = 0; integerLocal2 < byteArrayArrayLocal37.length; integerLocal2++) {
                      objectInputStreamLocal26 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(byteArrayArrayLocal37[integerLocal2])));
                      objectArrayLocal24[integerLocal2] = objectInputStreamLocal26.readObject();
                    }
                    objectLocal25 = methodLocal39.invoke((Object) null, objectArrayLocal24);
                    if (objectLocal25 == null) {
                      cipherPacketBufferArgument2.performAction2073(true, 0);
                    } else if (objectLocal25 instanceof Number) {
                      cipherPacketBufferArgument2.performAction2073(true, 1);
                      cipherPacketBufferArgument2.performAction2068(((Number) (objectLocal25)).longValue(), (byte) 0);
                    } else if (!(objectLocal25 instanceof String)) {
                      cipherPacketBufferArgument2.performAction2073(true, 4);
                    } else {
                      cipherPacketBufferArgument2.performAction2073(true, 2);
                      cipherPacketBufferArgument2.performAction2066(0, (String) (objectLocal25));
                    }
                  } else {
                    if (4 == integerLocal10) {
                      methodLocal40 = (java.lang.reflect.Method) (mixedSupport075Local32.asyncTaskArrayState0001[integerLocal1].objectState0004);
                      integerLocal41 = methodLocal40.getModifiers();
                      cipherPacketBufferArgument2.performAction2073(true, 0);
                      cipherPacketBufferArgument2.performAction2067(integerLocal41, false);
                    }
                  }
                } catch (java.lang.ClassNotFoundException caughtParameterLocal42) {
                  caughtExceptionLocal6 = caughtParameterLocal42;
                  classNotFoundExceptionLocal11 = (ClassNotFoundException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -10);
                } catch (java.io.InvalidClassException caughtParameterLocal43) {
                  caughtExceptionLocal6 = caughtParameterLocal43;
                  invalidClassExceptionLocal12 = (InvalidClassException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -11);
                } catch (java.io.StreamCorruptedException caughtParameterLocal44) {
                  caughtExceptionLocal6 = caughtParameterLocal44;
                  streamCorruptedExceptionLocal13 = (StreamCorruptedException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -12);
                } catch (java.io.OptionalDataException caughtParameterLocal45) {
                  caughtExceptionLocal6 = caughtParameterLocal45;
                  optionalDataExceptionLocal14 = (OptionalDataException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -13);
                } catch (java.lang.IllegalAccessException caughtParameterLocal46) {
                  caughtExceptionLocal6 = caughtParameterLocal46;
                  illegalAccessExceptionLocal15 = (IllegalAccessException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -14);
                } catch (java.lang.IllegalArgumentException caughtParameterLocal47) {
                  caughtExceptionLocal6 = caughtParameterLocal47;
                  illegalArgumentExceptionLocal16 = (IllegalArgumentException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -15);
                } catch (java.lang.reflect.InvocationTargetException caughtParameterLocal48) {
                  caughtExceptionLocal6 = caughtParameterLocal48;
                  invocationTargetExceptionLocal17 = (java.lang.reflect.InvocationTargetException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -16);
                } catch (java.lang.SecurityException caughtParameterLocal49) {
                  caughtExceptionLocal6 = caughtParameterLocal49;
                  securityExceptionLocal18 = (SecurityException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -17);
                } catch (java.io.IOException caughtParameterLocal50) {
                  caughtExceptionLocal6 = caughtParameterLocal50;
                  iOExceptionLocal19 = (IOException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -18);
                } catch (java.lang.NullPointerException caughtParameterLocal51) {
                  caughtExceptionLocal6 = caughtParameterLocal51;
                  nullPointerExceptionLocal20 = (NullPointerException) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -19);
                } catch (java.lang.Exception caughtParameterLocal52) {
                  caughtExceptionLocal6 = caughtParameterLocal52;
                  exceptionLocal21 = (Exception) (Object) caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -20);
                } catch (java.lang.Throwable caughtParameterLocal53) {
                  caughtExceptionLocal6 = caughtParameterLocal53;
                  throwableLocal22 = caughtExceptionLocal6;
                  cipherPacketBufferArgument2.performAction2073(true, -21);
                }
              } else {
                cipherPacketBufferArgument2.performAction2073(true, mixedSupport075Local32.integerArrayState0135[integerLocal1]);
              }
            }
            cipherPacketBufferArgument2.computeInteger2061((byte) -15, integerLocal9);
            mixedSupport075Local32.performAction0161((byte) 103);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal54) {
            caughtExceptionLocal6 = caughtParameterLocal54;
            runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal6;
            stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
            stackStringBuilderLocal4 = new StringBuilder().append("ba.V(").append(integerArgument1).append(',');
            if (cipherPacketBufferArgument2 == null) {
              stackStringLocal5 = "null";
            } else {
              stackStringLocal5 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal55) {
          throw uncheckedExceptionLocal55;
        } catch (Throwable checkedExceptionLocal56) {
          throw new RuntimeException(checkedExceptionLocal56);
        }
    }

    public final RenderingSupport015 computeRenderingSupport0150093(int integerArgument1) {
        if (this.computeBoolean1239((byte) 119)) {
          return NetworkSupport005.renderingSupport015State0003;
        }
        if (integerArgument1 != 20350) {
          ResourceSupport002.performAction0094(-21, -85, -33);
        }
        if (!(MixedSupport063.computeLong0827(4) >= this.longState0001 + 350L)) {
          return MixedSupport080.renderingSupport015State0004;
        }
        return this.computeRenderingSupport0150098(integerArgument1 - 25870);
    }

    final static void performAction0094(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (null == DiagnosticSupport001.integerArrayState0030 ||
          !(DiagnosticSupport001.integerArrayState0030.length >= integerArgument2)) {
          DiagnosticSupport001.integerArrayState0030 = new int[2 * integerArgument2];
        }
        if (ResourceSupport001.integerArrayState0012 == null ||
          !(ResourceSupport001.integerArrayState0012.length >= integerArgument2)) {
          ResourceSupport001.integerArrayState0012 = new int[integerArgument2 * 2];
        }
        if (MixedSupport094.integerArrayState0173 == null ||
          !(MixedSupport094.integerArrayState0173.length >= integerArgument2)) {
          MixedSupport094.integerArrayState0173 = new int[2 * integerArgument2];
        }
        if (MixedSupport084.integerArrayState0150 == null ||
          !(integerArgument2 <= MixedSupport084.integerArrayState0150.length)) {
          MixedSupport084.integerArrayState0150 = new int[2 * integerArgument2];
        }
        if (null == MixedSupport086.integerArrayState0157 ||
          !(integerArgument2 <= MixedSupport086.integerArrayState0157.length)) {
          MixedSupport086.integerArrayState0157 = new int[2 * integerArgument2];
        }
        if (null == MixedSupport015.integerArrayState0020 ||
          !(MixedSupport015.integerArrayState0020.length >= integerArgument2)) {
          MixedSupport015.integerArrayState0020 = new int[integerArgument2 * 2];
        }
        if (null == MixedSupport017.integerArrayState0022 ||
          !(MixedSupport017.integerArrayState0022.length >= integerArgument2 + integerArgument3)) {
          MixedSupport017.integerArrayState0022 = new int[(integerArgument3 + integerArgument2) * 2];
        }
        if (null == UiComponentPart020.booleanArrayState0007 ||
          !(UiComponentPart020.booleanArrayState0007.length >= integerArgument2)) {
          UiComponentPart020.booleanArrayState0007 = new boolean[2 * integerArgument2];
        }
        RenderingSupport003.integerState0252 = 2147483647;
        MixedSupport010.integerState0066 = -2147483648;
        UiComponentPart021.integerState0556 = 0;
        UiComponentPart019.integerState0504 = integerArgument1;
        ReturnedShape.integerState0695 = -2147483648;
    }

    static {
        stringState0038 = "Players";
        mixedSupport139State0001 = new MixedSupport139();
    }
}
