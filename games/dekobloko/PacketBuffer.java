/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends HashNode {
    byte[] payload;
    int position;
    static String stringState0631;
    static boolean booleanState0228;
    static int integerState0936;
    static String stringState0632;

    final int computeInteger2095(int integerArgument1) {
        if (integerArgument1 != 65280) {
          this.computeBoolean2094(20);
        }
        this.position = this.position + 3;
        return ((this.payload[this.position - 3] & 255) << 16) + ((65280 & this.payload[this.position - 2] << 8) + (255 & this.payload[this.position - 1]));
    }

    final int computeInteger2088(byte byteArgument1) {
        int integerLocal1 = -108 % ((byteArgument1 - 71) / 55);
        int integerLocal2 = this.payload[this.position] & 255;
        if (integerLocal2 < 128) {
          return -64 + this.computeInteger2085((byte) -78);
        }
        return this.computeInteger2089(3) - 49152;
    }

    final long computeLong2091(byte byteArgument1) {
        long longLocal1 = (long)this.computeInteger2096(7553) & 4294967295L;
        if (byteArgument1 != -108) {
          return 17L;
        }
        long longLocal2 = (long)this.computeInteger2096(byteArgument1 ^ -7659) & 4294967295L;
        return longLocal2 + (longLocal1 << 32);
    }

    final void performAction2066(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        CharSequence charSequenceLocal2 = null;
        int integerLocal3 = 0;
        try {
          integerLocal1 = stringArgument2.indexOf('\0');
          if (integerLocal1 >= 0) {
            throw new IllegalArgumentException("");
          }
          charSequenceLocal2 = (CharSequence) ((Object) stringArgument2);
          this.position = this.position + MixedSupport022.computeInteger0357(stringArgument2.length(), this.position, -8218, charSequenceLocal2, this.payload, integerArgument1);
          integerLocal3 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal3] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wl.N(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction2079(int integerArgument1, boolean booleanArgument2) {
        if (!booleanArgument2) {
          this.computeInteger2092(22);
        }
        this.payload[this.position - (integerArgument1 + 1)] = (byte)integerArgument1;
    }

    final void performAction2075(byte[] byteArrayArgument1, int integerArgument2, byte byteArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument3 < 124) {
            return;
          }
          for (integerLocal1 = integerArgument2; integerLocal1 < integerArgument4 + integerArgument2; integerLocal1++) {
            integerLocal2 = this.position;
            this.position = this.position + 1;
            byteArrayArgument1[integerLocal1] = this.payload[integerLocal2];
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal6 = caughtParameterLocal9;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("wl.FA(");
          if (byteArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(byteArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction2068(long longArgument1, byte byteArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(int)(longArgument1 >> 56);
        if (byteArgument2 != 0) {
          return;
        }
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)(int)(longArgument1 >> 48);
        int integerLocal3 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal3] = (byte)(int)(longArgument1 >> 40);
        int integerLocal4 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal4] = (byte)(int)(longArgument1 >> 32);
        int integerLocal5 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal5] = (byte)(int)(longArgument1 >> 24);
        int integerLocal6 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal6] = (byte)(int)(longArgument1 >> 16);
        int integerLocal7 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal7] = (byte)(int)(longArgument1 >> 8);
        int integerLocal8 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal8] = (byte)(int)longArgument1;
    }

    final int computeInteger2096(int integerArgument1) {
        this.position = this.position + 4;
        if (integerArgument1 != 7553) {
          integerState0936 = -83;
        }
        return (65280 & this.payload[this.position - 2] << 8) + (this.payload[-3 + this.position] << 16 & 16711680) + (((this.payload[-4 + this.position] & 255) << 24) + (255 & this.payload[-1 + this.position]));
    }

    final int computeInteger2089(int integerArgument1) {
        if (integerArgument1 != 3) {
          this.computeInteger2072(false);
        }
        this.position = this.position + 2;
        return (255 & this.payload[this.position - 1]) + ((255 & this.payload[this.position - 2]) << 8);
    }

    final int computeInteger2061(byte byteArgument1, int integerArgument2) {
        if (byteArgument1 != -15) {
          return 11;
        }
        int integerLocal1 = MixedSupport103.computeInteger1396(this.payload, this.position, -109, integerArgument2);
        this.performAction2067(integerLocal1, false);
        return integerLocal1;
    }

    final String computeString2082(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerLocal2 = this.position;
        if (byteArgument1 != -38) {
          this.payload = (byte[]) null;
        }
        do {
          integerLocal1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[integerLocal1] != 0);
        integerLocal3 = -1 - integerLocal2 + this.position;
        if (integerLocal3 != 0) {
          return MixedSupport140.computeString1906(this.payload, 0, integerLocal2, integerLocal3);
        }
        return "";
    }

    final String computeString2083(int integerArgument1) {
        if (integerArgument1 != -16829) {
          this.payload = (byte[]) null;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.computeString2082((byte) -38);
    }

    final boolean computeBoolean2094(int integerArgument1) {
        this.position = this.position - 4;
        int integerLocal1 = MixedSupport103.computeInteger1396(this.payload, this.position, -112, integerArgument1);
        int integerLocal2 = this.computeInteger2096(7553);
        if (integerLocal1 != integerLocal2) {
          return false;
        }
        return true;
    }

    final void performAction2087(int integerArgument1, int integerArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(integerArgument2 >> 8);
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)integerArgument2;
        if (integerArgument1 != -1) {
          this.computeString2082((byte) -104);
        }
    }

    final int computeInteger2064(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal6 = this.position;
        this.position = this.position + 1;
        integerLocal2 = this.payload[integerLocal6];
        integerLocal4 = -49 / ((integerArgument1 - 60) / 55);
        integerLocal3 = 0;
        while (integerLocal2 < 0) {
          integerLocal3 = (integerLocal3 | 127 & integerLocal2) << 7;
          integerLocal1 = this.position;
          this.position = this.position + 1;
          integerLocal2 = this.payload[integerLocal1];
        }
        return integerLocal3 | integerLocal2;
    }

    final void performAction2081(boolean booleanArgument1, int integerArgument2) {
        this.payload[-2 + (-integerArgument2 + this.position)] = (byte)(integerArgument2 >> 8);
        if (!booleanArgument1) {
          booleanState0228 = false;
        }
        this.payload[-1 + this.position - integerArgument2] = (byte)integerArgument2;
    }

    final void performAction2065(int integerArgument1, long longArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(int)(longArgument2 >> 32);
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)(int)(longArgument2 >> 24);
        int integerLocal3 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal3] = (byte)(int)(longArgument2 >> 16);
        if (integerArgument1 > -70) {
          return;
        }
        int integerLocal4 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal4] = (byte)(int)(longArgument2 >> 8);
        int integerLocal5 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal5] = (byte)(int)longArgument2;
    }

    final void performAction2074(boolean booleanArgument1, int integerArgument2, byte[] byteArrayArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument1) {
            this.computeInteger2092(50);
          }
          for (integerLocal1 = integerArgument4; integerLocal1 < integerArgument2 + integerArgument4; integerLocal1++) {
            integerLocal2 = this.position;
            this.position = this.position + 1;
            this.payload[integerLocal2] = byteArrayArgument3[integerLocal1];
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal6 = caughtParameterLocal9;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("wl.DA(").append(booleanArgument1).append(',').append(integerArgument2).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction2067(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(integerArgument1 >> 24);
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)(integerArgument1 >> 16);
        int integerLocal3 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal3] = (byte)(integerArgument1 >> 8);
        if (booleanArgument2) {
          integerState0936 = -50;
        }
        int integerLocal4 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal4] = (byte)integerArgument1;
    }

    private final void performAction2069(long longArgument1, int integerArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(int)(longArgument1 >> 48);
        if (integerArgument2 != -34637912) {
          return;
        }
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)(int)(longArgument1 >> 40);
        int integerLocal3 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal3] = (byte)(int)(longArgument1 >> 32);
        int integerLocal4 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal4] = (byte)(int)(longArgument1 >> 24);
        int integerLocal5 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal5] = (byte)(int)(longArgument1 >> 16);
        int integerLocal6 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal6] = (byte)(int)(longArgument1 >> 8);
        int integerLocal7 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal7] = (byte)(int)longArgument1;
    }

    final void performAction2071(java.math.BigInteger bigIntegerArgument1, java.math.BigInteger bigIntegerArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        byte[] byteArrayLocal2 = null;
        java.math.BigInteger bigIntegerLocal3 = null;
        java.math.BigInteger bigIntegerLocal4 = null;
        byte[] byteArrayLocal5 = null;
        if (!booleanArgument3) {
          return;
        }
        try {
          integerLocal1 = this.position;
          this.position = 0;
          byteArrayLocal2 = new byte[integerLocal1];
          this.performAction2075(byteArrayLocal2, 0, (byte) 125, integerLocal1);
          bigIntegerLocal3 = new java.math.BigInteger(byteArrayLocal2);
          bigIntegerLocal4 = bigIntegerLocal3.modPow(bigIntegerArgument1, bigIntegerArgument2);
          byteArrayLocal5 = bigIntegerLocal4.toByteArray();
          this.position = 0;
          this.performAction2087(-1, byteArrayLocal5.length);
          this.performAction2074(false, byteArrayLocal5.length, byteArrayLocal5, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wl.T(" + (bigIntegerArgument1 != null ? "{...}" : "null") + ',' + (bigIntegerArgument2 != null ? "{...}" : "null") + ',' + booleanArgument3 + ')');
        }
    }

    final void performAction2090(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 <= 87) {
          PacketBuffer.performAction2086(11);
        }
        while (this.position < integerArgument2) {
          integerLocal1 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal1] = (byte) 0;
        }
    }

    final int computeInteger2085(byte byteArgument1) {
        if (byteArgument1 >= -18) {
          return 39;
        }
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[integerLocal1];
    }

    final void performAction2077(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 24 % ((-42 - integerArgument1) / 34);
        if (integerArgument2 < 64 &&
          -64 <= integerArgument2) {
          this.performAction2073(true, integerArgument2 + 64);
          return;
        }
        if (integerArgument2 < 16384 &&
          -16384 <= integerArgument2) {
          this.performAction2087(-1, 49152 + integerArgument2);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void performAction2063(byte byteArgument1, int[] integerArrayArgument2) {
        int previousIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal6 = this.position / 8;
          this.position = 0;
          integerLocal8 = 0;
          while (true) {
            if (integerLocal6 <= integerLocal8) {
              if (byteArgument1 >= -4) {
                stringState0631 = (String) null;
              }
              return;
            }
            integerLocal9 = this.computeInteger2096(7553);
            integerLocal10 = this.computeInteger2096(7553);
            integerLocal11 = 0;
            integerLocal12 = -1640531527;
            integerLocal13 = 32;
            while (true) {
              previousIntegerLocal1 = integerLocal13;
              integerLocal13--;
              if (0 < previousIntegerLocal1) {
                integerLocal9 = integerLocal9 + (integerLocal11 + integerArrayArgument2[3 & integerLocal11] ^ (integerLocal10 >>> 5 ^ integerLocal10 << 4) + integerLocal10);
                integerLocal11 = integerLocal11 + integerLocal12;
                integerLocal10 = integerLocal10 + (integerLocal11 + integerArrayArgument2[(integerLocal11 & 7108) >>> 11] ^ integerLocal9 + (integerLocal9 << 4 ^ integerLocal9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.performAction2067(integerLocal9, false);
            this.performAction2067(integerLocal10, false);
            integerLocal8++;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal5 = caughtParameterLocal15;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("wl.H(").append(byteArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final String computeString2080(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5 = this.position;
        this.position = this.position + 1;
        integerLocal2 = this.payload[integerLocal5];
        if (0 != integerLocal2) {
          throw new IllegalStateException("");
        }
        integerLocal3 = this.position;
        do {
          integerLocal1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[integerLocal1] != 0);
        integerLocal4 = -1 + this.position - integerLocal3;
        if (!booleanArgument1) {
          booleanState0228 = true;
        }
        if (integerLocal4 != 0) {
          return MixedSupport140.computeString1906(this.payload, 0, integerLocal3, integerLocal4);
        }
        return "";
    }

    final void performAction2084(int integerArgument1, int integerArgument2) {
        if (0 <= integerArgument1 &&
          integerArgument1 < 128) {
          this.performAction2073(true, integerArgument1);
          return;
        }
        if (integerArgument1 >= 0 &&
          32768 > integerArgument1) {
          this.performAction2087(-1, integerArgument1 + 32768);
          return;
        }
        if (integerArgument2 != 57) {
          this.position = 112;
        }
        throw new IllegalArgumentException();
    }

    final void performAction2076(byte byteArgument1, int integerArgument2) {
        if (byteArgument1 != 46) {
          stringState0632 = (String) null;
        }
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)(integerArgument2 >> 16);
        int integerLocal2 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal2] = (byte)(integerArgument2 >> 8);
        int integerLocal3 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal3] = (byte)integerArgument2;
    }

    final void performAction2070(String stringArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        long longLocal6 = 0L;
        RuntimeException runtimeExceptionLocal7 = null;
        long longLocal8 = 0L;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          longLocal6 = 0L;
          longLocal8 = 0L;
          integerLocal9 = stringArgument1.length();
          for (integerLocal1 = 19; integerLocal1 >= 0; integerLocal1--) {
            longLocal6 = longLocal6 * 38L;
            if (integerLocal9 > integerLocal1) {
              integerLocal10 = stringArgument1.charAt(integerLocal1);
              if (integerLocal10 >= 65 &&
                integerLocal10 <= 90) {
                longLocal6 = longLocal6 + (long)(integerLocal10 + 2 - 65);
              } else {
                if (97 <= integerLocal10 &&
                  integerLocal10 <= 122) {
                  longLocal6 = longLocal6 + (long)(-95 + integerLocal10);
                } else {
                  if (48 <= integerLocal10 &&
                    57 >= integerLocal10) {
                    longLocal6 = longLocal6 + (long)(-20 + integerLocal10);
                  } else {
                    longLocal6 = longLocal6 + 1L;
                  }
                }
              }
            }
            if (10 == integerLocal1) {
              longLocal8 = longLocal6;
              longLocal6 = 0L;
            }
          }
          if (!booleanArgument2) {
            this.computeInteger2072(false);
          }
          this.performAction2069(longLocal6, -34637912);
          this.performAction2069(longLocal8, -34637912);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal5 = caughtParameterLocal12;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("wl.S(");
          if (stringArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    public static void performAction2086(int integerArgument1) {
        if (integerArgument1 != 8) {
          stringState0632 = (String) null;
        }
        stringState0632 = null;
        stringState0631 = null;
    }

    final int computeInteger2072(boolean booleanArgument1) {
        if (booleanArgument1) {
          return -54;
        }
        int integerLocal1 = 255 & this.payload[this.position];
        if (integerLocal1 >= 128) {
          return this.computeInteger2089(3) - 32768;
        }
        return this.computeInteger2085((byte) -32);
    }

    final byte computeByte2093(byte byteArgument1) {
        if (byteArgument1 > -83) {
          this.computeInteger2072(false);
        }
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        return this.payload[integerLocal1];
    }

    PacketBuffer(int integerArgument1) {
        this.position = 0;
        this.payload = MixedSupport137.computeByteArray1886(5, integerArgument1);
    }

    final int computeInteger2092(int integerArgument1) {
        if (integerArgument1 != 21663) {
          this.computeInteger2096(-114);
        }
        if (this.payload[this.position] < 0) {
          return 2147483647 & this.computeInteger2096(7553);
        }
        return this.computeInteger2089(3);
    }

    final void performAction2073(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1 = this.position;
        this.position = this.position + 1;
        this.payload[integerLocal1] = (byte)integerArgument2;
        if (!booleanArgument1) {
          integerState0936 = 83;
        }
    }

    PacketBuffer(byte[] byteArrayArgument1) {
        try {
          this.position = 0;
          this.payload = byteArrayArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wl.<init>(" + (byteArrayArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction2078(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        CharSequence charSequenceLocal3 = null;
        int integerLocal4 = 0;
        try {
          if (integerArgument1 != 8) {
            this.computeInteger2092(-80);
          }
          integerLocal1 = stringArgument2.indexOf('\0');
          if (integerLocal1 >= 0) {
            throw new IllegalArgumentException("");
          }
          integerLocal2 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal2] = (byte) 0;
          charSequenceLocal3 = (CharSequence) ((Object) stringArgument2);
          this.position = this.position + MixedSupport022.computeInteger0357(stringArgument2.length(), this.position, -8218, charSequenceLocal3, this.payload, 0);
          integerLocal4 = this.position;
          this.position = this.position + 1;
          this.payload[integerLocal4] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wl.G(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction2062(byte byteArgument1, int integerArgument2, int[] integerArrayArgument3, int integerArgument4) {
        int previousIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal6 = this.position;
          this.position = integerArgument2;
          if (byteArgument1 < 10) {
            this.payload = (byte[]) null;
          }
          integerLocal8 = (-integerArgument2 + integerArgument4) / 8;
          integerLocal9 = 0;
          while (true) {
            if (integerLocal9 >= integerLocal8) {
              this.position = integerLocal6;
              return;
            }
            integerLocal10 = this.computeInteger2096(7553);
            integerLocal11 = this.computeInteger2096(7553);
            integerLocal12 = -957401312;
            integerLocal13 = -1640531527;
            integerLocal14 = 32;
            while (true) {
              previousIntegerLocal1 = integerLocal14;
              integerLocal14--;
              if (previousIntegerLocal1 > 0) {
                integerLocal11 = integerLocal11 - (integerLocal12 + integerArrayArgument3[(7483 & integerLocal12) >>> 11] ^ integerLocal10 + (integerLocal10 << 4 ^ integerLocal10 >>> 5));
                integerLocal12 = integerLocal12 - integerLocal13;
                integerLocal10 = integerLocal10 - (integerLocal12 + integerArrayArgument3[3 & integerLocal12] ^ (integerLocal11 >>> 5 ^ integerLocal11 << 4) + integerLocal11);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.performAction2067(integerLocal10, false);
            this.performAction2067(integerLocal11, false);
            integerLocal9++;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal5 = caughtParameterLocal16;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("wl.F(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(')').toString());
        }
    }

    static {
        integerState0936 = 2;
        stringState0631 = "Defeated";
        stringState0632 = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
