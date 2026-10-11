/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    static String stringState0286;
    int integerState0350;
    private ResourceSupport001 resourceSupport001State0001;
    private ResourceSupport003 resourceSupport003State0001;
    static String stringState0287;
    private Object[][] objectArrayArrayState0001;
    private Object[] objectArrayState0001;
    boolean booleanState0088;

    private final synchronized void performAction0910(int integerArgument1, int integerArgument2) {
        if (this.booleanState0088) {
          this.objectArrayState0001[integerArgument2] = this.resourceSupport003State0001.computeByteArray1067(integerArgument2, (byte) 91);
        } else {
          this.objectArrayState0001[integerArgument2] = BufferedSocket.computeObject1558(this.resourceSupport003State0001.computeByteArray1067(integerArgument2, (byte) 91), -1389597532, false);
        }
        if (integerArgument1 != 20351) {
          stringState0287 = (String) null;
        }
    }

    final synchronized boolean computeBoolean0924(int integerArgument1, byte byteArgument2) {
        if (!this.computeBoolean0909(integerArgument1, (byte) -83)) {
          return false;
        }
        if (this.objectArrayState0001[integerArgument1] != null) {
          return true;
        }
        if (byteArgument2 != -106) {
          return ((boolean[]) (this.objectArrayState0001[0]))[0];
        }
        this.performAction0910(20351, integerArgument1);
        if (null != this.objectArrayState0001[integerArgument1]) {
          return true;
        }
        return false;
    }

    final int computeInteger0926(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!this.computeBoolean0904((byte) 121)) {
            stackIntegerLocal4 = -1;
            return stackIntegerLocal4;
          }
          if (integerArgument1 != -1) {
            stringState0286 = (String) null;
          }
          stringArgument2 = stringArgument2.toLowerCase();
          charSequenceLocal3 = (CharSequence) ((Object) stringArgument2);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal3, 90));
          if (this.computeBoolean0909(integerLocal1, (byte) -83)) {
            return integerLocal1;
          }
          stackIntegerLocal5 = -1;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("ji.D(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    final boolean computeBoolean0920(String stringArgument1, boolean booleanArgument2, String stringArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        CharSequence charSequenceLocal4 = null;
        CharSequence charSequenceLocal5 = null;
        boolean stackBooleanLocal6 = false;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (!booleanArgument2) {
            return true;
          }
          if (!this.computeBoolean0904((byte) 121)) {
            return false;
          }
          stringArgument3 = stringArgument3.toLowerCase();
          stringArgument1 = stringArgument1.toLowerCase();
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument3);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal4, -10));
          if (!this.computeBoolean0909(integerLocal1, (byte) -83)) {
            return false;
          }
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument1);
          integerLocal3 = this.resourceSupport001State0001.mixedSupport096ArrayState0001[integerLocal1].computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal5, 11));
          stackBooleanLocal6 = this.computeBoolean0906((byte) -84, integerLocal3, integerLocal1);
          return stackBooleanLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("ji.N(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    final int computeInteger0925(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != -5228) {
          return -48;
        }
        if (!this.computeBoolean0909(integerArgument2, (byte) -83)) {
          return 0;
        }
        return this.resourceSupport001State0001.integerArrayState0006[integerArgument2];
    }

    public static void performAction0908(int integerArgument1) {
        stringState0287 = null;
        stringState0286 = null;
        if (integerArgument1 < 125) {
          stringState0287 = (String) null;
        }
    }

    final boolean computeBoolean0918(String stringArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        CharSequence charSequenceLocal4 = null;
        boolean stackBooleanLocal5 = false;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!this.computeBoolean0904((byte) 121)) {
            return false;
          }
          stringArgument1 = stringArgument1.toLowerCase();
          integerLocal1 = -49 / ((byteArgument2 - 13) / 42);
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument1);
          integerLocal3 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal4, -112));
          stackBooleanLocal5 = this.computeBoolean0924(integerLocal3, (byte) -106);
          return stackBooleanLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("ji.K(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final boolean computeBoolean0919(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!this.computeBoolean0904((byte) 121)) {
            return false;
          }
          stringArgument1 = stringArgument1.toLowerCase();
          charSequenceLocal3 = (CharSequence) ((Object) stringArgument1);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal3, 86));
          if (integerLocal1 >= integerArgument2) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("ji.W(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    private final synchronized boolean computeBoolean0922(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        Object[] objectArrayLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        byte[] byteArrayLocal4 = null;
        boolean stackBooleanLocal5 = false;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        boolean stackBooleanLocal8 = false;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        int[] integerArrayLocal15 = null;
        Object[] objectArrayLocal16 = null;
        int integerLocal17 = 0;
        byte[] byteArrayLocal18 = null;
        int integerLocal19 = 0;
        RuntimeException runtimeExceptionLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int[] integerArrayLocal24 = null;
        int integerLocal25 = 0;
        byte[][] byteArrayArrayLocal26 = null;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        byte[] byteArrayLocal33 = null;
        int[] integerArrayLocal34 = null;
        byte[] byteArrayLocal35 = null;
        PacketBuffer packetBufferLocal36 = null;
        byte[] byteArrayLocal37 = null;
        PacketBuffer packetBufferLocal38 = null;
        int[] integerArrayLocal39 = null;
        byte[][] byteArrayArrayLocal40 = null;
        PacketBuffer packetBufferLocal41 = null;
        int[] integerArrayLocal42 = null;
        byte[] byteArrayLocal43 = null;
        byte[] byteArrayLocal44 = null;
        int[] integerArrayLocal45 = null;
        byte[][] byteArrayArrayLocal46 = null;
        byte[] byteArrayLocal47 = null;
        byte[] byteArrayLocal48 = null;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        int integerLocal52;
        int integerLocal53;
        int integerLocal54;
        int integerLocal55;
        int integerLocal56;
        int integerLocal57;
        int integerLocal58;
        int integerLocal59;
        int integerLocal60;
        int integerLocal61;
        int integerLocal62;
        int integerLocal63;
        integerLocal32 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!this.computeBoolean0909(integerArgument2, (byte) -83)) {
            return false;
          }
          if (null == this.objectArrayState0001[integerArgument2]) {
            return false;
          }
          integerLocal13 = this.resourceSupport001State0001.integerArrayState0011[integerArgument2];
          integerArrayLocal42 = this.resourceSupport001State0001.integerArrayArrayState0001[integerArgument2];
          integerArrayLocal34 = integerArrayLocal42;
          integerArrayLocal15 = integerArrayLocal34;
          if (this.objectArrayArrayState0001[integerArgument2] == null) {
            objectArrayLocal1 = new Object[this.resourceSupport001State0001.integerArrayState0006[integerArgument2]];
            this.objectArrayArrayState0001[integerArgument2] = objectArrayLocal1;
          }
          if (integerArgument4 != 26687) {
            stackBooleanLocal5 = ((boolean[]) (((Object[]) (this.objectArrayState0001[3]))[13]))[3];
            return stackBooleanLocal5;
          }
          objectArrayLocal16 = this.objectArrayArrayState0001[integerArgument2];
          integerLocal17 = 1;
          for (integerLocal2 = 0; integerLocal2 < integerLocal13; integerLocal2++) {
            if (integerArrayLocal15 != null) {
              integerLocal19 = integerArrayLocal42[integerLocal2];
            } else {
              integerLocal19 = integerLocal2;
            }
            if (objectArrayLocal16[integerLocal19] != null) {
              continue;
            }
            integerLocal17 = 0;
            break;
          }
          if (integerLocal17 != 0) {
            return true;
          }
          boolean frameRemainderLocal64 = true;
          if (integerArrayArgument1 != null && (integerArrayArgument1[0] != 0 ||
            integerArrayArgument1[1] != 0 ||
            integerArrayArgument1[2] != 0 ||
            0 != integerArrayArgument1[3])) {
            byteArrayLocal43 = TextLayout.computeByteArray0257(true, 78, this.objectArrayState0001[integerArgument2]);
            byteArrayLocal35 = byteArrayLocal43;
            byteArrayLocal18 = byteArrayLocal35;
            packetBufferLocal36 = new PacketBuffer(byteArrayLocal43);
            packetBufferLocal36.performAction2062((byte) 51, 5, integerArrayArgument1, packetBufferLocal36.payload.length);
            frameRemainderLocal64 = false;
          }
          else {
            byteArrayLocal18 = TextLayout.computeByteArray0257(false, integerArgument4 ^ 26717, this.objectArrayState0001[integerArgument2]);
          }
          try {
            byteArrayLocal44 = MixedSupport057.computeByteArray0766(byteArrayLocal18, -120);
            byteArrayLocal37 = byteArrayLocal44;
            byteArrayLocal33 = byteArrayLocal37;
            byteArrayLocal47 = byteArrayLocal33;
          } catch (java.lang.RuntimeException caughtParameterLocal65) {
            caughtExceptionLocal12 = caughtParameterLocal65;
            runtimeExceptionLocal20 = caughtExceptionLocal12;
            stackRuntimeExceptionLocal6 = runtimeExceptionLocal20;
            stackStringBuilderLocal7 = new StringBuilder();
            stackBooleanLocal8 = (integerArrayArgument1 != null);
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackBooleanLocal8).append(" ").append(integerArgument2).append(" ").append(byteArrayLocal18.length).append(" ").append(SceneWidgetPart012.computeInteger1821(byteArrayLocal18.length, 0, byteArrayLocal18)).append(" ").append(SceneWidgetPart012.computeInteger1821(-2 + byteArrayLocal18.length, 0, byteArrayLocal18)).append(" ").append(this.resourceSupport001State0001.integerArrayState0010[integerArgument2]).append(" ").append(this.resourceSupport001State0001.integerState0024).toString());
          }
          if (this.booleanState0088) {
            this.objectArrayState0001[integerArgument2] = null;
          }
          if (integerLocal13 > 1) {
            if (this.integerState0350 == 2) {
              integerLocal21 = byteArrayLocal44.length;
              integerLocal21--;
              integerLocal22 = 255 & byteArrayLocal33[integerLocal21];
              integerLocal21 = integerLocal21 - integerLocal22 * integerLocal13 * 4;
              packetBufferLocal41 = new PacketBuffer(byteArrayLocal47);
              integerLocal23 = 0;
              packetBufferLocal41.position = integerLocal21;
              integerLocal25 = 0;
              for (integerLocal27 = 0; integerLocal22 > integerLocal27; integerLocal27++) {
                integerLocal28 = 0;
                for (integerLocal29 = 0; integerLocal29 < integerLocal13; integerLocal29++) {
                  integerLocal28 = integerLocal28 + packetBufferLocal41.computeInteger2096(7553);
                  if (integerArrayLocal15 == null) {
                    integerLocal30 = integerLocal29;
                  } else {
                    integerLocal30 = integerArrayLocal42[integerLocal29];
                  }
                  if (integerArgument3 == integerLocal30) {
                    integerLocal25 = integerLocal30;
                    integerLocal23 = integerLocal23 + integerLocal28;
                  }
                }
              }
              if (integerLocal23 == 0) {
                return true;
              }
              byteArrayLocal48 = new byte[integerLocal23];
              packetBufferLocal41.position = integerLocal21;
              integerLocal57 = 0;
              integerLocal61 = 0;
              for (integerLocal62 = 0; integerLocal62 < integerLocal22; integerLocal62++) {
                integerLocal63 = 0;
                for (integerLocal3 = 0; integerLocal3 < integerLocal13; integerLocal3++) {
                  integerLocal63 = integerLocal63 + packetBufferLocal41.computeInteger2096(integerArgument4 ^ 30142);
                  if (integerArrayLocal15 != null) {
                    integerLocal31 = integerArrayLocal42[integerLocal3];
                  } else {
                    integerLocal31 = integerLocal3;
                  }
                  if (integerLocal31 == integerArgument3) {
                    MixedSupport008.performAction0082(byteArrayLocal47, integerLocal61, byteArrayLocal48, integerLocal57, integerLocal63);
                    integerLocal57 = integerLocal57 + integerLocal63;
                  }
                  integerLocal61 = integerLocal61 + integerLocal63;
                }
              }
              objectArrayLocal16[integerLocal25] = byteArrayLocal48;
              return true;
            }
            integerLocal21 = byteArrayLocal44.length;
            integerLocal21--;
            integerLocal49 = byteArrayLocal33[integerLocal21] & 255;
            integerLocal21 = integerLocal21 - 4 * (integerLocal49 * integerLocal13);
            packetBufferLocal38 = new PacketBuffer(byteArrayLocal47);
            integerArrayLocal45 = new int[integerLocal13];
            integerArrayLocal39 = integerArrayLocal45;
            integerArrayLocal24 = integerArrayLocal39;
            packetBufferLocal38.position = integerLocal21;
            for (integerLocal50 = 0; integerLocal50 < integerLocal49; integerLocal50++) {
              integerLocal58 = 0;
              for (integerLocal51 = 0; integerLocal13 > integerLocal51; integerLocal51++) {
                integerLocal58 = integerLocal58 + packetBufferLocal38.computeInteger2096(7553);
                integerArrayLocal24[integerLocal51] = integerArrayLocal24[integerLocal51] + integerLocal58;
              }
            }
            byteArrayArrayLocal46 = new byte[integerLocal13][];
            byteArrayArrayLocal40 = byteArrayArrayLocal46;
            byteArrayArrayLocal26 = byteArrayArrayLocal40;
            for (integerLocal59 = 0; integerLocal13 > integerLocal59; integerLocal59++) {
              byteArrayLocal4 = new byte[integerArrayLocal45[integerLocal59]];
              byteArrayArrayLocal26[integerLocal59] = byteArrayLocal4;
              integerArrayLocal45[integerLocal59] = 0;
            }
            packetBufferLocal38.position = integerLocal21;
            integerLocal60 = 0;
            for (integerLocal52 = 0; integerLocal52 < integerLocal49; integerLocal52++) {
              integerLocal54 = 0;
              for (integerLocal56 = 0; integerLocal56 < integerLocal13; integerLocal56++) {
                integerLocal54 = integerLocal54 + packetBufferLocal38.computeInteger2096(7553);
                MixedSupport008.performAction0082(byteArrayLocal47, integerLocal60, byteArrayArrayLocal46[integerLocal56], integerArrayLocal45[integerLocal56], integerLocal54);
                integerArrayLocal24[integerLocal56] = integerArrayLocal24[integerLocal56] + integerLocal54;
                integerLocal60 = integerLocal60 + integerLocal54;
              }
            }
            for (integerLocal53 = 0; integerLocal53 < integerLocal13; integerLocal53++) {
              if (integerArrayLocal15 != null) {
                integerLocal55 = integerArrayLocal42[integerLocal53];
              } else {
                integerLocal55 = integerLocal53;
              }
              if (this.integerState0350 == 0) {
                objectArrayLocal16[integerLocal55] = BufferedSocket.computeObject1558(byteArrayArrayLocal46[integerLocal53], -1389597532, false);
              } else {
                objectArrayLocal16[integerLocal55] = byteArrayArrayLocal46[integerLocal53];
              }
            }
          } else {
            if (integerArrayLocal15 == null) {
              integerLocal21 = 0;
            } else {
              integerLocal21 = integerArrayLocal42[0];
            }
            if (this.integerState0350 != 0) {
              objectArrayLocal16[integerLocal21] = byteArrayLocal47;
            } else {
              objectArrayLocal16[integerLocal21] = BufferedSocket.computeObject1558(byteArrayLocal44, -1389597532, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal66) {
          caughtExceptionLocal12 = caughtParameterLocal66;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal14;
          stackStringBuilderLocal10 = new StringBuilder().append("ji.U(");
          if (integerArrayArgument1 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final synchronized int computeInteger0923(byte byteArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!this.computeBoolean0904((byte) 121)) {
          return 0;
        }
        if (byteArgument1 > -44) {
          this.performAction0910(91, ((int[]) (((Object[]) (this.objectArrayState0001[2]))[0]))[0]);
        }
        integerLocal1 = 0;
        integerLocal2 = 0;
        for (integerLocal3 = 0; this.objectArrayState0001.length > integerLocal3; integerLocal3++) {
          if (this.resourceSupport001State0001.integerArrayState0011[integerLocal3] > 0) {
            integerLocal2 = integerLocal2 + this.computeInteger0905((byte) 34, integerLocal3);
            integerLocal1 += 100;
          }
        }
        if (0 == integerLocal1) {
          return 100;
        }
        integerLocal5 = 100 * integerLocal2 / integerLocal1;
        return integerLocal5;
    }

    final synchronized boolean computeBoolean0904(byte byteArgument1) {
        if (this.resourceSupport001State0001 == null) {
          this.resourceSupport001State0001 = this.resourceSupport003State0001.computeResourceSupport0011070(true);
          if (null == this.resourceSupport001State0001) {
            return false;
          }
          this.objectArrayArrayState0001 = new Object[this.resourceSupport001State0001.integerState0023][];
          this.objectArrayState0001 = new Object[this.resourceSupport001State0001.integerState0023];
        }
        if (byteArgument1 != 121) {
          return false;
        }
        return true;
    }

    final synchronized byte[] computeByteArray0916(int integerArgument1, String stringArgument2, String stringArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        CharSequence charSequenceLocal4 = null;
        CharSequence charSequenceLocal5 = null;
        Object stackObjectLocal6 = null;
        byte[] stackByteArrayLocal7 = null;
        byte[] stackByteArrayLocal8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        try {
          if (!this.computeBoolean0904((byte) 121)) {
            stackObjectLocal6 = null;
            return (byte[]) (stackObjectLocal6);
          }
          stringArgument3 = stringArgument3.toLowerCase();
          stringArgument2 = stringArgument2.toLowerCase();
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument3);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal4, 79));
          if (!this.computeBoolean0909(integerLocal1, (byte) -83)) {
            return null;
          }
          if (integerArgument1 != 0) {
            stackByteArrayLocal7 = (byte[]) null;
            return stackByteArrayLocal7;
          }
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument2);
          integerLocal3 = this.resourceSupport001State0001.mixedSupport096ArrayState0001[integerLocal1].computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal5, -112));
          stackByteArrayLocal8 = this.computeByteArray0912(integerLocal3, 32, integerLocal1);
          return stackByteArrayLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal14 = caughtParameterLocal15;
          runtimeExceptionLocal2 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal2;
          stackStringBuilderLocal10 = new StringBuilder().append("ji.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (stringArgument3 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(')').toString());
        }
    }

    private final synchronized boolean computeBoolean0911(int integerArgument1, int integerArgument2, byte byteArgument3) {
        if (!this.computeBoolean0904((byte) 121)) {
          return false;
        }
        if (byteArgument3 != -33) {
          this.computeInteger0905((byte) 6, ((int[]) (this.objectArrayState0001[0]))[26]);
        }
        if (integerArgument1 >= 0 &&
          integerArgument2 >= 0 &&
          integerArgument1 < this.resourceSupport001State0001.integerArrayState0006.length &&
          this.resourceSupport001State0001.integerArrayState0006[integerArgument1] > integerArgument2) {
          return true;
        }
        if (MixedSupport016.booleanState0015) {
          throw new IllegalArgumentException(integerArgument1 + " " + integerArgument2);
        }
        return false;
    }

    final byte[] computeByteArray0912(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 118 / ((integerArgument2 + 44) / 62);
        return this.computeByteArray0917(integerArgument1, (int[]) null, integerArgument3, (byte) -33);
    }

    final static String[] computeStringArray0907(char characterArgument1, byte byteArgument2, String stringArgument3) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        String[] stringArrayLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        CharSequence charSequenceLocal10 = null;
        String[] stackStringArrayLocal11 = null;
        String[] stackStringArrayLocal12 = null;
        RuntimeException stackRuntimeExceptionLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument2 != 66) {
            stackStringArrayLocal11 = (String[]) null;
            return stackStringArrayLocal11;
          }
          charSequenceLocal10 = (CharSequence) ((Object) stringArgument3);
          integerLocal3 = MouseInput.computeInteger2038(true, charSequenceLocal10, characterArgument1);
          stringArrayLocal5 = new String[1 + integerLocal3];
          integerLocal6 = 0;
          integerLocal7 = 0;
          for (integerLocal1 = 0; integerLocal1 < integerLocal3; integerLocal1++) {
            for (integerLocal8 = integerLocal7; stringArgument3.charAt(integerLocal8) != characterArgument1; integerLocal8++) {
            }
            previousIntegerLocal2 = integerLocal6;
            integerLocal6++;
            stringArrayLocal5[previousIntegerLocal2] = stringArgument3.substring(integerLocal7, integerLocal8);
            integerLocal7 = integerLocal8 + 1;
          }
          stringArrayLocal5[integerLocal3] = stringArgument3.substring(integerLocal7);
          stackStringArrayLocal12 = stringArrayLocal5;
          return stackStringArrayLocal12;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal16 = caughtParameterLocal17;
          runtimeExceptionLocal4 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal13 = runtimeExceptionLocal4;
          stackStringBuilderLocal14 = new StringBuilder().append("ji.A(").append(characterArgument1).append(',').append(byteArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(')').toString());
        }
    }

    private final synchronized boolean computeBoolean0909(int integerArgument1, byte byteArgument2) {
        if (byteArgument2 != -83) {
          this.resourceSupport003State0001 = (ResourceSupport003) (this.objectArrayState0001[0]);
        }
        if (!this.computeBoolean0904((byte) 121)) {
          return false;
        }
        if (integerArgument1 < 0 ||
          integerArgument1 >= this.resourceSupport001State0001.integerArrayState0006.length ||
          this.resourceSupport001State0001.integerArrayState0006[integerArgument1] == 0) {
          if (!MixedSupport016.booleanState0015) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(integerArgument1));
        }
        return true;
    }

    final static void performAction0914(int integerArgument1, int integerArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (null != MixedSupport102.sceneWidgetPart007State0001) {
          integerLocal1 = MixedSupport102.sceneWidgetPart007State0001.computeInteger1185(497, booleanArgument3);
          if (-2 != integerLocal1) {
            if (integerLocal1 != -1) {
              integerLocal2 = MixedSupport102.sceneWidgetPart007State0001.computeBoolean1186(5658) ? 1 : 0;
              MixedSupport123.performAction1750(MixedSupport102.sceneWidgetPart007State0001.longState0031, integerArgument1, MixedSupport102.sceneWidgetPart007State0001.computeString1188((byte) -96), 97, integerLocal2 != 0, integerLocal1);
            }
            MixedSupport102.sceneWidgetPart007State0001 = null;
            UiComponentPart031.performAction1811((byte) -76);
          }
        }
        if (integerArgument2 != 0) {
          stringState0287 = (String) null;
        }
    }

    final int computeInteger0913(int integerArgument1, int integerArgument2, String stringArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (!this.computeBoolean0909(integerArgument1, (byte) -83)) {
            stackIntegerLocal4 = -1;
            return stackIntegerLocal4;
          }
          if (integerArgument2 != 13030) {
            this.objectArrayState0001 = new Object[6];
          }
          stringArgument3 = stringArgument3.toLowerCase();
          charSequenceLocal3 = (CharSequence) ((Object) stringArgument3);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096ArrayState0001[integerArgument1].computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal3, -127));
          if (this.computeBoolean0911(integerArgument1, integerLocal1, (byte) -33)) {
            stackIntegerLocal6 = integerLocal1;
            return stackIntegerLocal6;
          }
          stackIntegerLocal5 = -1;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("ji.C(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final static void performAction0927(int integerArgument1, int integerArgument2) {
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument1, integerArgument2 ^ -3);
        cipherPacketBufferLocal1.performAction2073(true, integerArgument2);
        cipherPacketBufferLocal1.performAction2073(true, 3);
    }

    final synchronized int computeInteger0905(byte byteArgument1, int integerArgument2) {
        if (!this.computeBoolean0909(integerArgument2, (byte) -83)) {
          return 0;
        }
        if (byteArgument1 != 34) {
          stringState0286 = (String) null;
        }
        if (this.objectArrayState0001[integerArgument2] != null) {
          return 100;
        }
        return this.resourceSupport003State0001.computeInteger1068(integerArgument2, byteArgument1 ^ -102);
    }

    final int computeInteger0915(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        CharSequence charSequenceLocal4 = null;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (!this.computeBoolean0904((byte) 121)) {
            stackIntegerLocal5 = 0;
            return stackIntegerLocal5;
          }
          stringArgument2 = stringArgument2.toLowerCase();
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument2);
          integerLocal1 = this.resourceSupport001State0001.mixedSupport096State0001.computeInteger1316((byte) -68, MixedSupport124.computeInteger1769(charSequenceLocal4, -128));
          integerLocal3 = 39 / ((integerArgument1 + 55) / 53);
          stackIntegerLocal6 = this.computeInteger0905((byte) 34, integerLocal1);
          return stackIntegerLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("ji.G(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    private final synchronized byte[] computeByteArray0917(int integerArgument1, int[] integerArrayArgument2, int integerArgument3, byte byteArgument4) {
        Object stackObjectLocal1 = null;
        Object stackObjectLocal2 = null;
        Object stackObjectLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        Object objectLocal7 = null;
        byte[] byteArrayLocal8 = null;
        try {
          if (!this.computeBoolean0911(integerArgument3, integerArgument1, byteArgument4)) {
            stackObjectLocal1 = null;
            return (byte[]) (stackObjectLocal1);
          }
          objectLocal7 = null;
          if ((this.objectArrayArrayState0001[integerArgument3] == null ||
            this.objectArrayArrayState0001[integerArgument3][integerArgument1] == null) && !this.computeBoolean0922(integerArrayArgument2, integerArgument3, integerArgument1, 26687)) {
            this.performAction0910(20351, integerArgument3);
            if (!this.computeBoolean0922(integerArrayArgument2, integerArgument3, integerArgument1, byteArgument4 + 26720)) {
              return null;
            }
          }
          if (null == this.objectArrayArrayState0001[integerArgument3]) {
            throw new RuntimeException("");
          }
          if (this.objectArrayArrayState0001[integerArgument3][integerArgument1] != null) {
            byteArrayLocal8 = TextLayout.computeByteArray0257(false, 95, this.objectArrayArrayState0001[integerArgument3][integerArgument1]);
            objectLocal7 = byteArrayLocal8;
            if (byteArrayLocal8 == null) {
              throw new RuntimeException("");
            }
          }
          if (objectLocal7 != null) {
            if (this.integerState0350 == 1) {
              this.objectArrayArrayState0001[integerArgument3][integerArgument1] = null;
              if (this.resourceSupport001State0001.integerArrayState0006[integerArgument3] == 1) {
                this.objectArrayArrayState0001[integerArgument3] = null;
              }
            } else {
              if (this.integerState0350 == 2) {
                this.objectArrayArrayState0001[integerArgument3] = null;
              }
            }
          }
          stackObjectLocal2 = objectLocal7;
          return (byte[]) (stackObjectLocal2);
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal6 = caughtParameterLocal9;
          objectLocal7 = caughtExceptionLocal6;
          stackObjectLocal3 = objectLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("ji.AA(").append(integerArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final synchronized boolean computeBoolean0921(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!this.computeBoolean0904((byte) 121)) {
          return false;
        }
        if (booleanArgument1) {
          return true;
        }
        integerLocal2 = 1;
        for (integerLocal1 = 0; integerLocal1 < this.resourceSupport001State0001.integerArrayState0008.length; integerLocal1++) {
          integerLocal3 = this.resourceSupport001State0001.integerArrayState0008[integerLocal1];
          if (this.objectArrayState0001[integerLocal3] == null) {
            this.performAction0910(20351, integerLocal3);
            if (null == this.objectArrayState0001[integerLocal3]) {
              integerLocal2 = 0;
            }
          }
        }
        return integerLocal2 != 0;
    }

    final synchronized boolean computeBoolean0906(byte byteArgument1, int integerArgument2, int integerArgument3) {
        if (!this.computeBoolean0911(integerArgument3, integerArgument2, (byte) -33)) {
          return false;
        }
        if (null != this.objectArrayArrayState0001[integerArgument3] &&
          this.objectArrayArrayState0001[integerArgument3][integerArgument2] != null) {
          return true;
        }
        if (null != this.objectArrayState0001[integerArgument3]) {
          return true;
        }
        this.performAction0910(20351, integerArgument3);
        if (null != this.objectArrayState0001[integerArgument3]) {
          return true;
        }
        if (byteArgument1 >= -59) {
          this.computeBoolean0921(false);
          return false;
        }
        return false;
    }

    ResourceArchive(ResourceSupport003 resourceSupport003Argument1, boolean booleanArgument2, int integerArgument3) {
        this.resourceSupport001State0001 = null;
        try {
          if (integerArgument3 < 0 ||
            2 < integerArgument3) {
            throw new IllegalArgumentException("");
          }
          this.booleanState0088 = booleanArgument2 ? true : false;
          this.resourceSupport003State0001 = resourceSupport003Argument1;
          this.integerState0350 = integerArgument3;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ji.<init>(" + (resourceSupport003Argument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ',' + integerArgument3 + ')');
        }
    }

    static {
        stringState0287 = "Offer rematch";
        stringState0286 = "FINAL!";
    }
}
