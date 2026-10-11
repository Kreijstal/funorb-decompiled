/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReturnedShapeCache {
    private ReturnedShape[] returnedShapeArrayState0002;
    static String stringState0385;
    static MixedSupport111 mixedSupport111State0007;
    static MixedSupport032 mixedSupport032State0001;
    static String stringState0386;

    final static int computeInteger1349(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = integerArgument1 - 1 & integerArgument3 >> 31;
        if (integerArgument2 >= 76) {
          return integerLocal1 + (integerArgument3 + (integerArgument3 >>> 31)) % integerArgument1;
        }
        MixedSupport118 mixedSupport118Local2 = (MixedSupport118) null;
        ReturnedShapeCache.performAction1350(106, 18, (MixedSupport118) null);
        return integerLocal1 + (integerArgument3 + (integerArgument3 >>> 31)) % integerArgument1;
    }

    private final void performAction1347(byte byteArgument1) {
        int integerLocal1 = 0;
        ReturnedShape[] returnedShapeArrayLocal2;
        ReturnedShape returnedShapeLocal3;
        int integerLocal4;
        ReturnedShape[] returnedShapeArrayLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        returnedShapeArrayLocal5 = new ReturnedShape[this.returnedShapeArrayState0002.length * 2];
        returnedShapeArrayLocal2 = returnedShapeArrayLocal5;
        if (byteArgument1 <= 103) {
          return;
        }
        for (integerLocal1 = 0; this.returnedShapeArrayState0002.length > integerLocal1; integerLocal1++) {
          returnedShapeLocal3 = this.returnedShapeArrayState0002[integerLocal1];
          if (returnedShapeLocal3 != null) {
            returnedShapeArrayLocal2[returnedShapeLocal3.integerState0688 % returnedShapeArrayLocal5.length] = returnedShapeLocal3;
          }
        }
        this.returnedShapeArrayState0002 = returnedShapeArrayLocal2;
    }

    final ReturnedShape computeReturnedShape1354(boolean booleanArgument1, boolean booleanArgument2, CipherPacketBuffer cipherPacketBufferArgument3) {
        int integerLocal1 = 0;
        ReturnedShape stackReturnedShapeLocal2 = null;
        ReturnedShape stackReturnedShapeLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        ReturnedShape returnedShapeLocal10 = null;
        int integerLocal11 = 0;
        ReturnedShape returnedShapeLocal12 = null;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!booleanArgument1) {
            mixedSupport032State0001 = (MixedSupport032) null;
          }
          integerLocal8 = cipherPacketBufferArgument3.computeInteger2064(118);
          returnedShapeLocal12 = this.returnedShapeArrayState0002[integerLocal8 % this.returnedShapeArrayState0002.length];
          returnedShapeLocal10 = returnedShapeLocal12;
          if (returnedShapeLocal10 != null &&
            integerLocal8 == returnedShapeLocal12.integerState0688) {
            if (!booleanArgument2) {
              this.returnedShapeArrayState0002[integerLocal8 % this.returnedShapeArrayState0002.length] = null;
            }
            stackReturnedShapeLocal2 = returnedShapeLocal10;
            return stackReturnedShapeLocal2;
          }
          while (booleanArgument2) {
            if (this.returnedShapeArrayState0002[integerLocal8 % this.returnedShapeArrayState0002.length] != null) {
              this.performAction1347((byte) 115);
              continue;
            }
            break;
          }
          returnedShapeLocal10 = new ReturnedShape(integerLocal8);
          returnedShapeLocal10.width = cipherPacketBufferArgument3.computeInteger2085((byte) -102);
          returnedShapeLocal10.height = cipherPacketBufferArgument3.computeInteger2085((byte) -79);
          returnedShapeLocal10.packedCells = new byte[returnedShapeLocal10.width * returnedShapeLocal10.height];
          cipherPacketBufferArgument3.performAction1865((byte) -108);
          for (integerLocal1 = 0; returnedShapeLocal10.packedCells.length > integerLocal1; integerLocal1++) {
            returnedShapeLocal10.packedCells[integerLocal1] = (byte)cipherPacketBufferArgument3.computeInteger1857(5, (byte) 75);
          }
          cipherPacketBufferArgument3.performAction1867((byte) -128);
          if (booleanArgument2) {
            this.returnedShapeArrayState0002[integerLocal8 % this.returnedShapeArrayState0002.length] = returnedShapeLocal10;
          }
          stackReturnedShapeLocal3 = returnedShapeLocal10;
          return stackReturnedShapeLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal7 = caughtParameterLocal13;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("oi.F(").append(booleanArgument1).append(',').append(booleanArgument2).append(',');
          if (cipherPacketBufferArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final ReturnedShape computeReturnedShape1353(boolean booleanArgument1, int integerArgument2) {
        ReturnedShape returnedShapeLocal1 = null;
        ReturnedShape returnedShapeLocal2;
        if (booleanArgument1) {
          ReturnedShape returnedShapeLocal3 = (ReturnedShape) null;
          this.performAction1351((ReturnedShape) null, (byte) -73);
          returnedShapeLocal1 = this.returnedShapeArrayState0002[integerArgument2 % this.returnedShapeArrayState0002.length];
          if (returnedShapeLocal1 == null) {
            return null;
          }
          if (returnedShapeLocal1.integerState0688 == integerArgument2) {
            return returnedShapeLocal1;
          }
          return null;
        }
        returnedShapeLocal2 = this.returnedShapeArrayState0002[integerArgument2 % this.returnedShapeArrayState0002.length];
        if (returnedShapeLocal2 == null) {
          return null;
        }
        if (returnedShapeLocal2.integerState0688 == integerArgument2) {
          return returnedShapeLocal2;
        }
        return null;
    }

    final void performAction1351(ReturnedShape returnedShapeArgument1, byte byteArgument2) {
        int integerLocal1 = returnedShapeArgument1.integerState0688;
        if (returnedShapeArgument1 != this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length]) {
          throw new IllegalArgumentException();
        }
        if (byteArgument2 < 24) {
          return;
        }
        try {
          this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length] = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oi.A(" + (returnedShapeArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    ReturnedShapeCache(int integerArgument1) {
        this.returnedShapeArrayState0002 = new ReturnedShape[integerArgument1];
    }

    public static void performAction1348(int integerArgument1) {
        mixedSupport111State0007 = null;
        mixedSupport032State0001 = null;
        stringState0386 = null;
        stringState0385 = null;
        if (integerArgument1 == 2) {
          return;
        }
        stringState0385 = (String) null;
    }

    final void performAction1352(ReturnedShape returnedShapeArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = returnedShapeArgument1.integerState0688;
          if (this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length] != null &&
            returnedShapeArgument1.integerState0688 == this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length].integerState0688) {
            throw new IllegalArgumentException();
          }
          while (null != this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length]) {
            this.performAction1347((byte) 116);
          }
          if (integerArgument2 != 0) {
            ReturnedShapeCache.computeInteger1349(93, 98, -46);
          }
          this.returnedShapeArrayState0002[integerLocal1 % this.returnedShapeArrayState0002.length] = returnedShapeArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oi.G(" + (returnedShapeArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction1350(int integerArgument1, int integerArgument2, MixedSupport118 mixedSupport118Argument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
          cipherPacketBufferLocal1.performAction2073(true, 2);
          cipherPacketBufferLocal1.performAction2073(true, 0);
          if (integerArgument1 > -57) {
            ReturnedShapeCache.computeInteger1349(-93, 111, -125);
          }
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport118Argument3.integerState0731);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oi.E(" + integerArgument1 + ',' + integerArgument2 + ',' + (mixedSupport118Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0385 = "Winner!";
        mixedSupport111State0007 = new MixedSupport111(7, 0, 1, 1);
        stringState0386 = "Drawn";
    }
}
