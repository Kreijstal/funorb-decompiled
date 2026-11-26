/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport007 {
    boolean booleanState0092;
    static int integerState0362;
    int integerState0363;
    private int integerState0364;
    static String stringState0306;
    boolean booleanState0093;
    MixedSupport116 mixedSupport116State0002;
    int integerState0365;
    int integerState0366;
    boolean booleanState0094;
    private int integerState0367;
    private MixedSupport020 mixedSupport020State0001;
    int integerState0368;
    GameDomainSupport002[] gameDomainSupport002ArrayState0001;
    boolean booleanState0095;
    boolean booleanState0096;
    private int integerState0369;
    int integerState0370;
    int integerState0371;
    int integerState0372;
    int[] integerArrayState0121;
    static int[] integerArrayState0122;
    private MixedSupport068 mixedSupport068State0001;
    private int integerState0373;
    int integerState0374;
    int integerState0375;

    final static void performAction0871(byte byteArgument1) {
        int integerLocal1 = 0;
        String[][] cachedStringArrayArrayLocal2 = null;
        long[][] cachedLongArrayArrayLocal3 = null;
        int[][] cachedIntegerArrayArrayLocal4 = null;
        int integerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        byte stackByteLocal9 = 0;
        int stackIntegerLocal10 = 0;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        MixedSupport068 mixedSupport068Local15 = null;
        long longLocal16 = 0L;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        MixedSupport072 mixedSupport072Local19 = null;
        int integerLocal20 = 0;
        String[][] stringArrayArrayLocal21 = null;
        String[][] stringArrayArrayLocal22 = null;
        long[][] longArrayArrayLocal23 = null;
        int[][] integerArrayArrayLocal24 = null;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        String stringLocal33 = null;
        long longLocal34 = 0L;
        int integerLocal35 = 0;
        int integerLocal36 = 0;
        int integerLocal37 = 0;
        CipherPacketBuffer cipherPacketBufferLocal38 = null;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        integerLocal37 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != 48) {
            integerState0362 = 90;
          }
          cipherPacketBufferLocal38 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal13 = cipherPacketBufferLocal38.readUnsignedByte((byte) -106);
          if (integerLocal13 == 0) {
            integerLocal14 = cipherPacketBufferLocal38.readUnsignedShort(byteArgument1 - 45);
            mixedSupport068Local15 = (MixedSupport068) (SecondaryNodeDequeIterator.nodeDequeState0007.beginBackward((byte) -104));
            while (mixedSupport068Local15 != null) {
              if (~mixedSupport068Local15.integerState0358 != ~integerLocal14) {
                mixedSupport068Local15 = (MixedSupport068) (SecondaryNodeDequeIterator.nodeDequeState0007.nextBackward(true));
                continue;
              }
              break;
            }
            if (mixedSupport068Local15 == null) {
              stackByteLocal9 = byteArgument1;
              stackIntegerLocal10 = 121;
              NodeHashTable.performAction1498(stackByteLocal9 ^ stackIntegerLocal10);
              return;
            }
            integerLocal17 = cipherPacketBufferLocal38.readUnsignedByte((byte) -19);
            if (integerLocal17 != 0) {
              integerLocal18 = mixedSupport068Local15.integerState0359;
              PcmPlayerService.inputAdapter003ArrayState0001[0].booleanState0175 = false;
              PcmPlayerService.inputAdapter003ArrayState0001[0].stringState0500 = MixedSupport089.stringState0372;
              integerLocal20 = mixedSupport068Local15.integerState0357;
              PcmPlayerService.inputAdapter003ArrayState0001[0].stringState0499 = null;
              for (integerLocal1 = 1; integerLocal1 < integerLocal17; integerLocal1++) {
                PcmPlayerService.inputAdapter003ArrayState0001[integerLocal1].stringState0500 = cipherPacketBufferLocal38.readNullTerminatedString((byte) -38);
                PcmPlayerService.inputAdapter003ArrayState0001[integerLocal1].booleanState0175 = false;
                if (cipherPacketBufferLocal38.readUnsignedByte((byte) -48) != 1) {
                  PcmPlayerService.inputAdapter003ArrayState0001[integerLocal1].stringState0499 = null;
                } else {
                  PcmPlayerService.inputAdapter003ArrayState0001[integerLocal1].stringState0499 = cipherPacketBufferLocal38.readNullTerminatedString((byte) -38);
                }
              }
              cachedStringArrayArrayLocal2 = new String[3][integerLocal18];
              mixedSupport068Local15.stringArrayArrayState0004 = cachedStringArrayArrayLocal2;
              stringArrayArrayLocal21 = cachedStringArrayArrayLocal2;
              stringArrayArrayLocal22 = new String[3][integerLocal18];
              cachedLongArrayArrayLocal3 = new long[3][integerLocal18];
              mixedSupport068Local15.longArrayArrayState0001 = cachedLongArrayArrayLocal3;
              longArrayArrayLocal23 = cachedLongArrayArrayLocal3;
              cachedIntegerArrayArrayLocal4 = new int[3][integerLocal18 * integerLocal20];
              mixedSupport068Local15.integerArrayArrayState0014 = cachedIntegerArrayArrayLocal4;
              integerArrayArrayLocal24 = cachedIntegerArrayArrayLocal4;
              integerLocal25 = 0;
              integerLocal26 = 0;
              integerLocal27 = 0;
              integerLocal28 = 0;
              integerLocal29 = 0;
              integerLocal30 = 0;
              integerLocal31 = cipherPacketBufferLocal38.readUnsignedByte((byte) -68);
              if (0 < integerLocal31) {
                for (integerLocal5 = 0; integerLocal5 < integerLocal31; integerLocal5++) {
                  integerLocal32 = cipherPacketBufferLocal38.readUnsignedByte((byte) -21);
                  stringLocal33 = PcmPlayerService.inputAdapter003ArrayState0001[integerLocal32].stringState0500;
                  longLocal34 = cipherPacketBufferLocal38.readLong((byte) -108);
                  integerLocal35 = cipherPacketBufferLocal38.position;
                  if (integerLocal18 > integerLocal5) {
                    stringArrayArrayLocal21[0][integerLocal25] = stringLocal33;
                    stringArrayArrayLocal22[0][integerLocal25] = PcmPlayerService.inputAdapter003ArrayState0001[integerLocal32].stringState0499;
                    longArrayArrayLocal23[0][integerLocal25] = longLocal34;
                    for (integerLocal36 = 0; integerLocal20 > integerLocal36; integerLocal36++) {
                      previousIntegerLocal6 = integerLocal28;
                      integerLocal28++;
                      integerArrayArrayLocal24[0][previousIntegerLocal6] = cipherPacketBufferLocal38.readInt(MixedSupport106.computeInteger1387((int) byteArgument1, 7601));
                    }
                    integerLocal25++;
                  }
                  if (stringLocal33 != null &&
                    MixedSupport066.computeBoolean0829(stringLocal33, true)) {
                    stringArrayArrayLocal21[1][integerLocal26] = MixedSupport089.stringState0372;
                    stringArrayArrayLocal22[1][integerLocal26] = null;
                    longArrayArrayLocal23[1][integerLocal26] = longLocal34;
                    integerLocal26++;
                    cipherPacketBufferLocal38.position = integerLocal35;
                    for (integerLocal40 = 0; integerLocal40 < integerLocal20; integerLocal40++) {
                      previousIntegerLocal7 = integerLocal29;
                      integerLocal29++;
                      integerArrayArrayLocal24[1][previousIntegerLocal7] = cipherPacketBufferLocal38.readInt(7553);
                    }
                  }
                  if (integerLocal27 < integerLocal18 &&
                    !PcmPlayerService.inputAdapter003ArrayState0001[integerLocal32].booleanState0175) {
                    PcmPlayerService.inputAdapter003ArrayState0001[integerLocal32].booleanState0175 = true;
                    stringArrayArrayLocal21[2][integerLocal27] = stringLocal33;
                    stringArrayArrayLocal22[2][integerLocal27] = PcmPlayerService.inputAdapter003ArrayState0001[integerLocal32].stringState0499;
                    longArrayArrayLocal23[2][integerLocal27] = longLocal34;
                    integerLocal27++;
                    cipherPacketBufferLocal38.position = integerLocal35;
                    for (integerLocal41 = 0; integerLocal20 > integerLocal41; integerLocal41++) {
                      previousIntegerLocal8 = integerLocal30;
                      integerLocal30++;
                      integerArrayArrayLocal24[2][previousIntegerLocal8] = cipherPacketBufferLocal38.readInt(7553);
                    }
                  }
                }
              }
            }
            mixedSupport068Local15.booleanState0091 = true;
            mixedSupport068Local15.unlink((byte) 107);
            return;
          }
          if (integerLocal13 == 1) {
            integerLocal39 = cipherPacketBufferLocal38.readUnsignedShort(3);
            longLocal16 = cipherPacketBufferLocal38.readLong((byte) -108);
            mixedSupport072Local19 = (MixedSupport072) (GameDomainSupport005.nodeDequeState0023.beginBackward((byte) 114));
            while (mixedSupport072Local19 != null) {
              if (mixedSupport072Local19.integerState0411 != integerLocal39) {
                mixedSupport072Local19 = (MixedSupport072) (GameDomainSupport005.nodeDequeState0023.nextBackward(true));
                continue;
              }
              break;
            }
            if (mixedSupport072Local19 == null) {
              NodeHashTable.performAction1498(103);
              return;
            }
            mixedSupport072Local19.longState0024 = longLocal16;
            mixedSupport072Local19.unlink((byte) 101);
            return;
          }
          NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "HS1: " + BufferedSocket.computeString1379((byte) 30));
          NodeHashTable.performAction1498(122);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal42) {
          caughtExceptionLocal11 = caughtParameterLocal42;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal12), "ke.JA(" + byteArgument1 + ')');
        }
    }

    final void performAction0876(int integerArgument1) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (20 == this.integerState0363) {
          MixedSupport051.performAction0602(-109);
        }
        MixedSupport051.performAction0606(this, (byte) 95);
        while (DualNodeDeque.computeBoolean0027(-128)) {
          this.mixedSupport116State0002.performAction1524(0);
          if (MixedSupport146.integerState0931 == 13) {
            SceneWidgetPart008.performAction1129(115);
            SecondaryNodeHashTable.booleanState0121 = false;
            ComponentContainer.renderingSupport007State0006.performAction0865(integerArgument1 - 2825, false);
            return;
          }
          if ((96 == MixedSupport146.integerState0931 ||
            MixedSupport146.integerState0931 == 98) &&
            0 < this.integerState0367) {
            this.performAction0887(integerArgument1 ^ -8255);
            this.mixedSupport116State0002.performAction1513(1, (byte) -90);
            this.mixedSupport116State0002.booleanState0177 = false;
          }
          if ((MixedSupport146.integerState0931 == 97 ||
            MixedSupport146.integerState0931 == 99) &&
            3 > this.integerState0367) {
            this.performAction0888(87);
            this.mixedSupport116State0002.performAction1513(1, (byte) -66);
            this.mixedSupport116State0002.booleanState0177 = false;
          }
          if (this.computeBoolean0855(false, (byte) -33)) {
            return;
          }
        }
        this.mixedSupport116State0002.performAction1515(this.computeInteger0847(integerArgument1 ^ 2712, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
        if (integerArgument1 != 2824) {
          this.integerState0371 = 44;
        }
        boolean discarded$0 = this.computeBoolean0855(true, (byte) -33);
    }

    final void performAction0873(byte byteArgument1) {
        boolean discarded$0 = false;
        int integerLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport051.performAction0606(this, (byte) 95);
        integerLocal2 = 74 / ((71 - byteArgument1) / 39);
        do {
          if (!DualNodeDeque.computeBoolean0027(-119)) {
            this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
            discarded$0 = this.computeBoolean0862(true, 1);
            return;
          }
          if (MixedSupport146.integerState0931 == 13) {
            SceneWidgetPart008.performAction1129(-26);
            SceneWidgetPart007.booleanState0114 = false;
            UiComponentPart025.performAction1363(false, (byte) -108);
            return;
          }
          if (UiComponentPart023.computeBoolean1242(-30146)) {
            this.mixedSupport116State0002.performAction1512(-38);
          } else {
            this.mixedSupport116State0002.performAction1524(0);
            if (MixedSupport146.integerState0931 == 96) {
              MixedSupport036.integerState0222 = (3 + MixedSupport036.integerState0222 - 1) % 3;
              this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -79);
              SceneWidgetPart008.performAction1129(124);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 97) {
              MixedSupport036.integerState0222 = (1 + MixedSupport036.integerState0222) % 3;
              this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -81);
              SceneWidgetPart008.performAction1129(117);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 98) {
              if (3 != this.mixedSupport116State0002.integerState0754) {
                this.mixedSupport116State0002.performAction1513(3, (byte) -125);
              } else {
                this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -103);
              }
            }
            if (99 == MixedSupport146.integerState0931) {
              if (this.mixedSupport116State0002.integerState0754 >= 0 &&
                this.mixedSupport116State0002.integerState0754 < 3) {
                this.mixedSupport116State0002.performAction1513(3, (byte) -95);
              } else {
                this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -110);
              }
            }
          }
        } while (!this.computeBoolean0862(false, 1));
        return;
    }

    private final int computeInteger0847(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        GameDomainSupport002 gameDomainSupport002Local3;
        int integerLocal4;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = 640 - (640 * this.integerState0363 * this.integerState0363 / integerArgument1 + (this.integerState0369 >> 2));
        integerArgument2 = integerArgument2 - integerLocal2;
        for (integerLocal1 = 0; integerLocal1 < this.mixedSupport116State0002.integerState0756; integerLocal1++) {
          gameDomainSupport002Local3 = this.gameDomainSupport002ArrayState0001[integerLocal1];
          if (gameDomainSupport002Local3.integerState0174 <= integerArgument2 &&
            gameDomainSupport002Local3.integerState0176 + gameDomainSupport002Local3.integerState0174 > integerArgument2 &&
            gameDomainSupport002Local3.integerState0178 <= integerArgument3 &&
            integerArgument3 < gameDomainSupport002Local3.integerState0178 + gameDomainSupport002Local3.integerState0175) {
            return integerLocal1;
          }
        }
        return -1;
    }

    private final int computeInteger0861(boolean booleanArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int[] integerArrayLocal7;
        int[] integerArrayLocal8;
        int[] integerArrayLocal9;
        int[] integerArrayLocal10;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -(640 * this.integerState0363 * this.integerState0363 / 400) + (640 - (this.integerState0369 >> 2));
        integerLocal3 = -1;
        integerArrayLocal7 = PcmPlayerService.computeIntegerArray1411(NodeHashTableIterator.integerArrayState0028, (byte) 47, this.integerArrayState0121);
        integerArrayLocal8 = PcmPlayerService.computeIntegerArray1411(NodeHashTableIterator.integerArrayState0025, (byte) 47, integerArrayLocal7);
        integerLocal4 = -((GameDomainSupport004.computeInteger0797(integerArrayLocal8, 120) - 1) * 18) + 304;
        if (byteArgument2 != -51) {
          return 9;
        }
        integerLocal5 = 80;
        if (this.integerState0366 != 0) {
          integerArrayLocal9 = MixedSupport031.computeIntegerArray0419(NodeHashTableIterator.integerArrayState0025, this.integerArrayState0121, (byte) 106);
          integerLocal4 = 304 - (GameDomainSupport004.computeInteger0797(integerArrayLocal9, byteArgument2 + 146) - 1) * 18;
          if (!UiComponentPart031.computeBoolean1586((byte) 103, integerArrayLocal9)) {
            integerLocal5 -= 20;
          }
          if (MixedSupport004.computeBoolean0053(byteArgument2 + 51, integerArrayLocal9, this.integerArrayState0121)) {
            integerLocal5 += 20;
          }
        }
        integerLocal4 = integerLocal4 + integerLocal2;
        for (integerLocal1 = 0; 31 > integerLocal1; integerLocal1++) {
          if (integerLocal1 == 15) {
            integerLocal4 = 34;
            integerLocal5 += 40;
            if (this.integerState0366 != 0) {
              integerArrayLocal10 = MixedSupport031.computeIntegerArray0419(this.integerArrayState0121, NodeHashTableIterator.integerArrayState0026, (byte) 105);
              integerLocal4 = -(18 * GameDomainSupport004.computeInteger0797(integerArrayLocal10, 96)) + 18 + 304;
            }
            integerLocal4 = integerLocal4 + integerLocal2;
          }
          if ((0 == this.integerState0366 ||
            !MixedSupport035.computeBoolean0502(integerLocal1, 10040319, this.integerArrayState0121)) &&
            !MixedSupport107.computeBoolean1404(-23, integerLocal1, integerArrayLocal7)) {
            if (booleanArgument1) {
              if (integerLocal4 <= UiComponentPart013.integerState0276 &&
                UiComponentPart013.integerState0276 < 32 + integerLocal4 &&
                TextLineMetrics.integerState0535 >= integerLocal5 &&
                TextLineMetrics.integerState0535 < 32 + integerLocal5) {
                if (integerLocal1 != this.integerState0364) {
                  this.integerState0364 = integerLocal1;
                } else {
                  this.integerState0364 = -1;
                }
              }
            } else {
              if (integerLocal1 != this.integerState0364) {
                if (HashNode.integerState0069 >= integerLocal4 &&
                  32 + integerLocal4 > HashNode.integerState0069 &&
                  integerLocal5 <= MixedSupport101.integerState0590 &&
                  MixedSupport101.integerState0590 < 32 + integerLocal5) {
                  if (!MixedSupport107.computeBoolean1404(-113, integerLocal1, this.integerArrayState0121)) {
                    MixedSupport138.rgbSpriteState0063.performAction0271(-2 + integerLocal4, integerLocal5 - 2, 36, 36);
                  } else {
                    CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal1].performAction0258(integerLocal4 - 2, -2 + integerLocal5, 36, 36);
                  }
                  integerLocal3 = integerLocal1;
                } else {
                  if (!MixedSupport107.computeBoolean1404(byteArgument2 + 23, integerLocal1, this.integerArrayState0121)) {
                    MixedSupport138.rgbSpriteState0063.performAction0271(integerLocal4, integerLocal5, 32, 32);
                  } else {
                    ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0029[integerLocal1].performAction0278(integerLocal4, integerLocal5);
                  }
                }
              } else {
                if (MixedSupport107.computeBoolean1404(-112, integerLocal1, this.integerArrayState0121)) {
                  CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal1].performAction0258(integerLocal4 - 4, -4 + integerLocal5, 40, 40);
                } else {
                  MixedSupport138.rgbSpriteState0063.performAction0271(-4 + integerLocal4, integerLocal5 - 4, 40, 40);
                }
              }
            }
            integerLocal4 += 36;
          }
        }
        if (this.integerState0364 >= 0) {
          integerLocal3 = this.integerState0364;
        }
        return integerLocal3;
    }

    final void performAction0881(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = 2147483647;
        integerLocal3 = 2147483647;
        integerLocal4 = -2147483648;
        integerLocal5 = -2147483648;
        integerLocal6 = -99 % ((-41 - byteArgument1) / 33);
        for (integerLocal1 = 0; this.mixedSupport116State0002.integerState0756 > integerLocal1; integerLocal1++) {
          if (integerLocal2 > this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0174) {
            integerLocal2 = this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0174;
          }
          if (this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0176 + this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0174 > integerLocal4) {
            integerLocal4 = this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0174 + this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0176;
          }
          if (integerLocal5 < this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0175 + this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0178) {
            integerLocal5 = this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0178 + this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0175;
          }
          if (this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0178 < integerLocal3) {
            integerLocal3 = this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0178;
          }
        }
        this.integerState0374 = -30 + integerLocal2;
        this.integerState0375 = -20 + integerLocal3;
        this.integerState0368 = integerLocal4 + 30 - this.integerState0374;
        this.integerState0372 = integerLocal5 - (-20 + this.integerState0375);
    }

    final void performAction0864(int integerArgument1) {
        this.performAction0872(16687906);
        this.performAction0858(58);
        if (integerArgument1 != 2) {
          this.performAction0884(-125);
        }
    }

    private final boolean computeBoolean0855(boolean booleanArgument1, byte byteArgument2) {
        if (byteArgument2 != -33) {
          this.integerState0363 = -121;
        }
        this.performAction0878(byteArgument2 + 132);
        int integerLocal1 = -1;
        if (0 <= this.mixedSupport116State0002.integerState0754) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (integerLocal1 == 26 &&
          this.integerState0367 == 3) {
          integerLocal1 = -1;
        }
        if (integerLocal1 == 25 &&
          this.integerState0367 == 0) {
          integerLocal1 = -1;
        }
        if ((integerLocal1 == 13 || !booleanArgument1) &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SecondaryNodeHashTable.booleanState0121 = false;
          ComponentContainer.renderingSupport007State0006.performAction0865(-1, booleanArgument1);
          SceneWidgetPart008.performAction1129(123);
          return true;
        }
        if (25 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          this.performAction0887(-11063);
        }
        if (integerLocal1 == 26) {
          if (!this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
            return false;
          }
          this.performAction0888(-77);
        }
        return false;
    }

    final static void performAction0889(int integerArgument1) {
        NetworkSupport010.integerState0585 = integerArgument1;
        LoginCredentials.booleanState0085 = true;
    }

    final void performAction0852(GameDomainSupport002 gameDomainSupport002Argument1, int integerArgument2) {
        int integerLocal1 = 0;
        try {
          if (integerArgument2 <= 98) {
            this.performAction0858(98);
          }
          integerLocal1 = this.mixedSupport116State0002.integerState0756;
          this.mixedSupport116State0002.integerState0756 = this.mixedSupport116State0002.integerState0756 + 1;
          this.gameDomainSupport002ArrayState0001[integerLocal1] = gameDomainSupport002Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "ke.OA(" + (gameDomainSupport002Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction0848(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, byte byteArgument5) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          SoftwareRaster.drawHorizontalLine(integerArgument1, integerArgument2, 1 + integerArgument3, 10000536);
          SoftwareRaster.drawHorizontalLine(integerArgument1, integerArgument4 + integerArgument2, 1 + integerArgument3, 12105912);
          integerLocal3 = 1;
          if (integerArgument2 + integerLocal3 < SoftwareRaster.integerState0280) {
            integerLocal3 = -integerArgument2 + SoftwareRaster.integerState0280;
          }
          integerLocal5 = integerArgument4;
          if (integerArgument2 + integerLocal5 > SoftwareRaster.integerState0283) {
            integerLocal5 = -integerArgument2 + SoftwareRaster.integerState0283;
          }
          if (byteArgument5 < 98) {
            stringState0306 = (String) null;
          }
          for (integerLocal1 = integerLocal3; integerLocal5 > integerLocal1; integerLocal1++) {
            integerLocal6 = 152 + integerLocal1 * 48 / integerArgument4;
            integerLocal7 = integerLocal6 << 16 | integerLocal6 << 8 | integerLocal6;
            SoftwareRaster.integerArrayState0063[(integerArgument2 + integerLocal1) * SoftwareRaster.integerState0285 + integerArgument1] = integerLocal7;
            SoftwareRaster.integerArrayState0063[integerArgument1 + (integerLocal1 + integerArgument2) * SoftwareRaster.integerState0285 + integerArgument3] = integerLocal7;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal2 = caughtParameterLocal9;
          runtimeExceptionLocal4 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal4), "ke.W(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + byteArgument5 + ')');
        }
    }

    final void performAction0859(int integerArgument1, int integerArgument2) {
        GameDomainSupport002 cachedGameDomainSupport002Local1 = null;
        GameDomainSupport002 cachedGameDomainSupport002Local2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal5;
        for (integerLocal3 = 0; integerLocal3 < this.mixedSupport116State0002.integerState0756; integerLocal3++) {
          cachedGameDomainSupport002Local1 = this.gameDomainSupport002ArrayState0001[integerLocal3];
          cachedGameDomainSupport002Local1.integerState0178 = cachedGameDomainSupport002Local1.integerState0178 + integerArgument1;
        }
        this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
        int integerLocal6 = 0;
        integerLocal5 = integerLocal6;
        while (this.mixedSupport116State0002.integerState0756 > integerLocal6) {
          cachedGameDomainSupport002Local2 = this.gameDomainSupport002ArrayState0001[integerLocal6];
          cachedGameDomainSupport002Local2.integerState0178 = cachedGameDomainSupport002Local2.integerState0178 - integerArgument1;
          integerLocal6++;
        }
        if (integerArgument2 <= 120) {
          this.integerState0366 = 13;
        }
        boolean discarded$2 = this.computeBoolean0890(-1);
    }

    private final void performAction0858(int integerArgument1) {
        int integerLocal1 = -(this.integerState0369 >> 2) + (640 - 640 * (this.integerState0363 * this.integerState0363) / 400);
        if (integerArgument1 < 49) {
          this.booleanState0095 = false;
        }
        RgbSprite rgbSpriteLocal2 = MixedSupport086.rgbSpriteState0036;
        rgbSpriteLocal2.performAction0278(320 - rgbSpriteLocal2.integerState0254 / 2, -(integerLocal1 >> 2) + (50 - rgbSpriteLocal2.integerState0260 / 2));
        SoftwareRaster.fillRectangleAlpha(integerLocal1 + 4 + this.integerState0374, this.integerState0375 + 4, -8 + this.integerState0368, -8 + this.integerState0372, 0, 150);
        GameplayControls.performAction1749(this.integerState0372, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, this.integerState0368, this.integerState0375, integerLocal1 + this.integerState0374);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 362, SceneWidgetPart013.computeString1709(this.integerState0367, 26135), 16777215, 560 + integerLocal1);
        GameDomainSupport006.performAction1823(72, this.integerState0367, integerLocal1);
    }

    final void performAction0877(byte byteArgument1) {
        int integerLocal1 = 0;
        boolean stackBooleanLocal2 = false;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        String stackStringLocal7 = null;
        int integerLocal8;
        RgbSprite rgbSpriteLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        String stringLocal13;
        int integerLocal14;
        int integerLocal15;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        stackBooleanLocal2 = !(this.mixedSupport116State0002.integerState0756 < 3);
        this.performAction0856(stackBooleanLocal2, 15764);
        integerLocal8 = 640 + (-(640 * (this.integerState0363 * this.integerState0363) / 400) - (this.integerState0369 >> 2));
        rgbSpriteLocal9 = DekoBlokoClient.rgbSpriteArrayState0007[this.integerState0366];
        if (byteArgument1 < 23) {
          this.integerState0375 = -77;
        }
        rgbSpriteLocal9.performAction0278(-(rgbSpriteLocal9.integerState0254 / 2) + 320, -(rgbSpriteLocal9.integerState0260 / 2) + 40 - (integerLocal8 >> 2));
        integerLocal10 = this.computeInteger0861(false, (byte) -51);
        if (integerLocal10 < 0) {
          MixedSupport029.performAction0407(16777215, integerLocal8 + 320, MixedSupport134.stringState0579, 200, (byte) 75, SceneWidget.renderingSupport009State0007);
        } else {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal8, BufferedSocket.stringArrayState0035[integerLocal10], 200, (byte) 75, SceneWidget.renderingSupport009State0007);
          integerLocal11 = MixedSupport107.computeBoolean1404(-35, integerLocal10, this.integerArrayState0121) ? 1 : 0;
          if (integerLocal11 == 0) {
            stackIntegerLocal3 = (MixedSupport107.computeBoolean1404(-28, integerLocal10, NodeHashTableIterator.integerArrayState0027)) ? 1 : 0;
          } else {
            stackIntegerLocal3 = 0;
          }
          integerLocal12 = stackIntegerLocal3;
          if (integerLocal11 == 0) {
            MixedSupport138.rgbSpriteState0063.performAction0278(256 + integerLocal8, 210);
          } else {
            CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal10].performAction0278(integerLocal8 + 256, 210);
          }
          if (integerLocal12 == 0) {
            stringLocal13 = GameDomainSupport004.stringArrayState0016[integerLocal10];
          } else {
            stringLocal13 = MixedSupport113.stringState0490;
          }
          integerLocal14 = UiComponentPart029.renderingSupport009State0005.computeInteger1067(stringLocal13, 171);
          MixedSupport045.computeInteger0552(171, 0, -UiComponentPart029.renderingSupport009State0005.integerState0518 + 274 - integerLocal14 * 8, stringLocal13, 16, 1000, 16769088, UiComponentPart029.renderingSupport009State0005, (byte) -124, 0, integerLocal8 + 80);
          stackIntegerLocal4 = 8 * integerLocal14 + 282;
          stackIntegerLocal5 = 256;
          stackIntegerLocal6 = 16777215;
          if (integerLocal11 != 0) {
            stackStringLocal7 = Js5ArchiveManager.stringState0360;
          } else {
            stackStringLocal7 = MixedSupport063.stringState0269;
          }
          MixedSupport042.performAction0537(stackIntegerLocal4, stackIntegerLocal5, stackIntegerLocal6, stackStringLocal7, 80 + integerLocal8, SceneWidget.renderingSupport009State0007);
          MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 271, SceneWidgetPart006.stringState0275, 16777215, integerLocal8 + 500);
          MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 289, NetworkSupport007.stringState0346, 16777215, 500 + integerLocal8);
          if (integerLocal12 == 0) {
            MixedSupport042.performAction0537(271, 256, 16769088, Integer.toString(MixedSupport094.integerArrayState0178[integerLocal10]), integerLocal8 + 500, UiComponentPart029.renderingSupport009State0005);
            for (integerLocal1 = 0; UiComponentPart032.integerArrayState0238[integerLocal10] > integerLocal1; integerLocal1++) {
              MixedSupport111.rgbSpriteState0052.performAction0278(integerLocal1 * 5 + (integerLocal8 + 500), 274);
            }
          } else {
            MixedSupport042.performAction0537(271, 256, 16769088, "???", 500 + integerLocal8, UiComponentPart029.renderingSupport009State0005);
            MixedSupport042.performAction0537(289, 256, 16769088, "???", integerLocal8 + 500, UiComponentPart029.renderingSupport009State0005);
          }
        }
        if (UiComponentPart023.computeBoolean1242(-30146)) {
          MixedSupport029.performAction0407(16777215, integerLocal8 + 320, GzipDecompressor.stringState0327, 360, (byte) 75, UiComponentPart029.renderingSupport009State0005);
        }
        if (MixedSupport107.computeBoolean1404(-80, 5, this.integerArrayState0121)) {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal8, UiComponentPart023.stringState0424, 360, (byte) 75, UiComponentPart029.renderingSupport009State0005);
        }
    }

    private final boolean computeBoolean0850(int integerArgument1, boolean booleanArgument2) {
        boolean discarded$0 = false;
        this.performAction0878(118);
        if (integerArgument1 != -14845) {
          discarded$0 = this.computeBoolean0862(true, 36);
        }
        int integerLocal2 = -1;
        if (!(this.mixedSupport116State0002.integerState0754 < 0)) {
          integerLocal2 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (integerLocal2 == 20 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          UiComponentPart021.performAction1167(false, 6, true);
          SceneWidgetPart008.performAction1129(124);
          return true;
        }
        if ((integerLocal2 == 13 || !booleanArgument2) &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart013.booleanState0203 = false;
          UiComponentPart025.performAction1363(booleanArgument2, (byte) -111);
          SceneWidgetPart008.performAction1129(integerArgument1 ^ -14836);
          return true;
        }
        if (booleanArgument2 &&
          SceneWidgetPart005.integerState0328 != 0 &&
          this.mixedSupport116State0002.integerState0754 != -1) {
          MixedSupport019.integerState0114 = this.mixedSupport116State0002.integerState0754;
          this.mixedSupport116State0002.performAction1513(MixedSupport019.integerState0114, (byte) -109);
          SceneWidgetPart008.performAction1129(125);
          return true;
        }
        return false;
    }

    final void performAction0857(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        RgbSprite rgbSpriteLocal3;
        int integerLocal4;
        Object objectLocal5;
        int integerLocal6;
        String[] stringArrayLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int[] integerArrayLocal16;
        int integerLocal17;
        int integerLocal18;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -(this.integerState0369 >> 2) + (-(640 * this.integerState0363 * this.integerState0363 / 400) + 640);
        this.performAction0856(false, 15764);
        rgbSpriteLocal3 = MixedSupport061.rgbSpriteState0021;
        rgbSpriteLocal3.performAction0278(320 - rgbSpriteLocal3.integerState0254 / 2, 45 - rgbSpriteLocal3.integerState0260 / 2 - (integerLocal2 >> 2));
        if (null == this.mixedSupport068State0001 &&
          !UiComponentPart023.computeBoolean1242(-30146)) {
          this.mixedSupport068State0001 = MixedSupport007.computeMixedSupport0680070(3, false, 1, 0, 10);
        }
        integerLocal4 = RenderingSupport001.computeInteger0135((byte) 107, MixedSupport048.mixedSupport072State0001, MixedSupport036.integerState0222, this.mixedSupport068State0001);
        MixedSupport042.performAction0537(105, 256, 16777215, MixedSupport142.stringState0597, integerLocal2 + 125, SceneWidget.renderingSupport009State0007);
        MixedSupport042.performAction0537(105, 256, 16777215, MixedSupport001.stringState0002, 333 + integerLocal2, SceneWidget.renderingSupport009State0007);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport117.stringState0516, 16777215, 545 + integerLocal2);
        if (byteArgument1 > -42) {
          return;
        }
        for (integerLocal1 = 0; integerLocal1 < 10; integerLocal1++) {
          integerLocal6 = 16777215;
          MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 130 + 20 * integerLocal1, 1 + integerLocal1 + ".", integerLocal6, integerLocal2 + 115);
        }
        objectLocal5 = MixedSupport076.stringState0326;
        integerLocal17 = 1;
        if (null != this.mixedSupport068State0001) {
          if (this.mixedSupport068State0001.booleanState0091) {
            if (null != this.mixedSupport068State0001.stringArrayArrayState0004) {
              stringArrayLocal7 = this.mixedSupport068State0001.stringArrayArrayState0004[MixedSupport036.integerState0222];
              integerArrayLocal16 = this.mixedSupport068State0001.integerArrayArrayState0014[MixedSupport036.integerState0222];
              for (integerLocal10 = 0; integerLocal10 < 10; integerLocal10++) {
                if (stringArrayLocal7[integerLocal10] != null) {
                  objectLocal5 = null;
                  integerLocal11 = 16769088;
                  integerLocal12 = integerArrayLocal16[integerLocal10];
                  integerLocal13 = integerLocal12 % 8;
                  integerLocal14 = integerLocal12 / 8;
                  if (integerLocal4 == integerLocal10) {
                    integerLocal11 = 16777215;
                  }
                  MixedSupport042.performAction0537(integerLocal10 * 20 + 130, 256, integerLocal11, stringArrayLocal7[integerLocal10], 125 + integerLocal2, UiComponentPart029.renderingSupport009State0005);
                  MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 130 + integerLocal10 * 20, NodeHashTableIterator.substituteIndexedPlaceholders(106, MixedSupport070.stringState0315, new String[]{Integer.toString(integerLocal13 + 1)}), integerLocal11, 350 + integerLocal2);
                  MixedSupport042.performAction0537(130 + integerLocal10 * 20, 256, integerLocal11, UiComponentPart018.stringArrayState0021[integerLocal13], integerLocal2 + 350, UiComponentPart029.renderingSupport009State0005);
                  MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 20 * integerLocal10 + 130, Integer.toString(integerLocal14), integerLocal11, 545 + integerLocal2);
                }
              }
            } else {
              objectLocal5 = NanoFrameTimer.stringState0127;
            }
            if (0 > integerLocal4 &&
              MixedSupport048.mixedSupport072State0001 != null &&
              MixedSupport048.mixedSupport072State0001.integerState0414 == 0) {
              MixedSupport042.performAction0537(330, 256, 16777215, MixedSupport089.stringState0372, 125 + integerLocal2, UiComponentPart029.renderingSupport009State0005);
              integerLocal8 = MixedSupport048.mixedSupport072State0001.integerArrayState0139[0];
              integerLocal9 = integerLocal8 % 8;
              integerLocal18 = integerLocal8 / 8;
              MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 330, NodeHashTableIterator.substituteIndexedPlaceholders(81, MixedSupport070.stringState0315, new String[]{Integer.toString(1 + integerLocal9)}), 16777215, integerLocal2 + 350);
              MixedSupport042.performAction0537(330, 256, 16777215, UiComponentPart018.stringArrayState0021[integerLocal9], 350 + integerLocal2, UiComponentPart029.renderingSupport009State0005);
              MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 330, Integer.toString(integerLocal18), 16777215, integerLocal2 + 545);
              integerLocal17 = 0;
            }
          } else {
            objectLocal5 = TextFieldValidator.stringState0633;
          }
        }
        if (objectLocal5 != null) {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal2, (String) (objectLocal5), 220, (byte) 75, SceneWidget.renderingSupport009State0007);
        }
        if (UiComponentPart023.computeBoolean1242(-30146)) {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal2, GzipDecompressor.stringState0327, 330, (byte) 75, UiComponentPart029.renderingSupport009State0005);
        } else {
          if (integerLocal17 != 0) {
            MixedSupport029.performAction0407(16777215, integerLocal2 + 320, MixedSupport004.stringState0014, 330, (byte) 75, UiComponentPart029.renderingSupport009State0005);
          }
        }
        return;
    }

    final void performAction0874(int integerArgument1) {
        this.performAction0856(true, integerArgument1 ^ -23361);
        int integerLocal1 = -(this.integerState0369 >> 2) + 640 - 640 * this.integerState0363 * this.integerState0363 / 400;
        RgbSprite rgbSpriteLocal2 = MixedSupport073.rgbSpriteState0029;
        rgbSpriteLocal2.performAction0278(320 - rgbSpriteLocal2.integerState0254 / 2, -(integerLocal1 >> 2) + (this.integerState0375 / 2 - (-2 + rgbSpriteLocal2.integerState0260 / 2)));
        if (integerArgument1 != -26325) {
          this.integerState0372 = -96;
        }
        int integerLocal3 = !this.booleanState0094 ? 0 : 23;
        SoftwareRaster.fillRectangleAlpha(integerLocal1 + (4 + this.integerState0374), -8 + (this.integerState0372 + this.integerState0375), -8 + this.integerState0368, integerLocal3 + 142, 0, 150);
        GameplayControls.performAction1749(integerLocal3 + 150, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, this.integerState0368, -13 + this.integerState0375 + this.integerState0372, integerLocal1 + this.integerState0374);
        MixedSupport036.performAction0505(this.integerState0372 + this.integerState0375, (byte) 5, this.booleanState0094, integerLocal1 + 185);
        TextLineMetrics.performAction1104(this.integerState0370, integerLocal1 + 333, (byte) 74, this.integerState0372 + this.integerState0375, this.integerState0371);
    }

    final void performAction0884(int integerArgument1) {
        boolean discarded$1 = false;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport051.performAction0606(this, (byte) 95);
        if (integerArgument1 != 128) {
          this.integerArrayState0121 = (int[]) null;
        }
        if (MixedSupport083.booleanState0118) {
          return;
        }
        do {
          if (!DualNodeDeque.computeBoolean0027(26)) {
            this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(integerArgument1 + 272, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
            discarded$1 = this.computeBoolean0870(-108, true);
            return;
          }
          if (13 == MixedSupport146.integerState0931 &&
            this.booleanState0093) {
            SceneWidgetPart008.performAction1129(27);
            MixedSupport016.performAction0205(true);
            return;
          }
          this.mixedSupport116State0002.performAction1512(-127);
        } while (!this.computeBoolean0870(-109, false));
        return;
    }

    final void performAction0868(byte byteArgument1) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int integerLocal6;
        RgbSprite rgbSpriteLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        Object objectLocal13;
        String[] stringArrayLocal14;
        int[] integerArrayLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal6 = -(this.integerState0369 >> 2) + (-(this.integerState0363 * (this.integerState0363 * 640) / 400) + 640);
        this.performAction0856(false, 15764);
        rgbSpriteLocal7 = ResourceSupport001.rgbSpriteState0004;
        rgbSpriteLocal7.performAction0278(-(rgbSpriteLocal7.integerState0254 / 2) + 320, -(rgbSpriteLocal7.integerState0260 / 2) + (45 - (integerLocal6 >> 2)));
        if (this.mixedSupport020State0001 == null &&
          !UiComponentPart023.computeBoolean1242(-30146)) {
          this.mixedSupport020State0001 = UiComponentPart001.computeMixedSupport0200055(7, 10, (byte) -111, 0);
        }
        stackIntegerLocal2 = (AgeValidator.integerState0360 != 3) ? 310 : 305;
        integerLocal8 = stackIntegerLocal2;
        stackIntegerLocal3 = (AgeValidator.integerState0360 == 3) ? 372 : 380;
        integerLocal9 = stackIntegerLocal3;
        stackIntegerLocal4 = (AgeValidator.integerState0360 == 3) ? 427 : 435;
        integerLocal10 = stackIntegerLocal4;
        stackIntegerLocal5 = (AgeValidator.integerState0360 == 3) ? 488 : 490;
        integerLocal11 = stackIntegerLocal5;
        MixedSupport042.performAction0537(105, 256, 16777215, MixedSupport142.stringState0597, 125 + integerLocal6, SceneWidget.renderingSupport009State0007);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport045.stringState0190, 16777215, integerLocal8 + integerLocal6);
        if (byteArgument1 != 45) {
          this.integerState0374 = -41;
        }
        boolean frameRemainderLocal21 = true;
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport093.stringState0391, 16777215, integerLocal6 + integerLocal9);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport053.stringState0221, 16777215, integerLocal10 + integerLocal6);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport136.stringState0583, 16777215, integerLocal6 + integerLocal11);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, GameAssets.stringState0501, 16777215, 545 + integerLocal6);
        integerLocal12 = -1;
        objectLocal13 = BoundedRandomAccessFile.stringState0230;
        if (this.mixedSupport020State0001 != null) {
          if (this.mixedSupport020State0001.booleanState0022) {
            if (this.mixedSupport020State0001.stringArrayArrayState0001 != null) {
              stringArrayLocal14 = this.mixedSupport020State0001.stringArrayArrayState0001[MixedSupport019.integerState0114];
              integerArrayLocal15 = this.mixedSupport020State0001.integerArrayArrayState0005[MixedSupport019.integerState0114];
              for (integerLocal17 = 0; integerLocal17 < 10; integerLocal17++) {
                if (stringArrayLocal14[integerLocal17] != null) {
                  objectLocal13 = null;
                  integerLocal18 = 16769088;
                  if (MixedSupport066.computeBoolean0829(stringArrayLocal14[integerLocal17], true)) {
                    integerLocal12 = integerLocal17;
                    integerLocal18 = 16777215;
                  }
                  this.performAction0853(UiComponentPart029.renderingSupport009State0005, integerLocal18, integerArrayLocal15[4 * integerLocal17 + 2], integerArrayLocal15[4 * integerLocal17 + 3], byteArgument1 - 5373, 130 + 20 * integerLocal17, integerArrayLocal15[1 + 4 * integerLocal17], stringArrayLocal14[integerLocal17], integerArrayLocal15[4 * integerLocal17], integerLocal6);
                }
              }
              if (!(integerLocal12 >= 0)) {
                integerLocal20 = 16777215;
                this.performAction0853(UiComponentPart029.renderingSupport009State0005, integerLocal20, this.mixedSupport020State0001.integerState0118, this.mixedSupport020State0001.integerState0119, -5328, 330, this.mixedSupport020State0001.integerState0120, MixedSupport089.stringState0372, this.mixedSupport020State0001.integerState0117, integerLocal6);
              }
              frameRemainderLocal21 = false;
            }
            else {
              objectLocal13 = NanoFrameTimer.stringState0127;
            }
          } else {
            objectLocal13 = TextFieldValidator.stringState0633;
          }
        }
        for (integerLocal1 = 0; 10 > integerLocal1; integerLocal1++) {
          integerLocal16 = 16777215;
          MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 130 + integerLocal1 * 20, integerLocal1 + 1 + ".", integerLocal16, integerLocal6 + 115);
        }
        if (objectLocal13 != null) {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal6, (String) (objectLocal13), 220, (byte) 75, SceneWidget.renderingSupport009State0007);
        }
        if (UiComponentPart023.computeBoolean1242(-30146)) {
          MixedSupport029.performAction0407(16777215, integerLocal6 + 320, GzipDecompressor.stringState0327, 330, (byte) 75, UiComponentPart029.renderingSupport009State0005);
        }
    }

    private final void performAction0887(int integerArgument1) {
        if (integerArgument1 != -11063) {
          this.performAction0856(false, 73);
        }
        if (0 < this.integerState0367) {
          this.integerState0367 = this.integerState0367 - 1;
          SceneWidgetPart008.performAction1129(-65);
          MixedSupport003.performAction0042((byte) -76);
        }
    }

    private final boolean computeBoolean0860(int integerArgument1, boolean booleanArgument2) {
        this.performAction0878(94);
        int integerLocal1 = integerArgument1;
        if (!(this.mixedSupport116State0002.integerState0754 < 0)) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (20 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          UiComponentPart021.performAction1167(false, 4, true);
          SceneWidgetPart008.performAction1129(integerArgument1 + 37);
          return true;
        }
        if (integerLocal1 == 21 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart010.performAction1466(true);
          ResourceSupport002.booleanState0006 = false;
          UiComponentPart025.performAction1363(booleanArgument2, (byte) -104);
          SceneWidgetPart008.performAction1129(integerArgument1 ^ -126);
          return true;
        }
        return false;
    }

    final void performAction0854(boolean booleanArgument1) {
        if (booleanArgument1) {
          RenderingSupport007.performAction0871((byte) -98);
        }
        this.performAction0856(true, 15764);
        int integerLocal1 = -(this.integerState0363 * this.integerState0363 * 640 / 400) + (640 - (this.integerState0369 >> 2));
        GameDomainSupport006.rgbSpriteState0075.performAction0278(320 - GameDomainSupport006.rgbSpriteState0075.integerState0258 / 2, -(integerLocal1 >> 2) + 20);
    }

    final void performAction0849(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        GameDomainSupport002 gameDomainSupport002Local4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -41 % ((-31 - integerArgument4) / 62);
        integerLocal1 = 0;
        for (integerLocal3 = 0; this.mixedSupport116State0002.integerState0756 > integerLocal3; integerLocal3++) {
          gameDomainSupport002Local4 = this.gameDomainSupport002ArrayState0001[integerLocal3];
          integerLocal5 = gameDomainSupport002Local4.integerState0176;
          if (6 == gameDomainSupport002Local4.integerState0179 ||
            7 == gameDomainSupport002Local4.integerState0179) {
            integerLocal5 += 133;
          }
          gameDomainSupport002Local4.integerState0178 = integerLocal3 * integerArgument5 + integerArgument1;
          if (integerLocal1 < integerLocal5) {
            integerLocal1 = integerLocal5;
          }
          if (booleanArgument3) {
            if (integerLocal3 > 0) {
              gameDomainSupport002Local4.integerState0175 = gameDomainSupport002Local4.integerState0175 - 3;
              gameDomainSupport002Local4.integerState0178 = gameDomainSupport002Local4.integerState0178 + 3;
            }
            if (integerLocal3 < -1 + this.mixedSupport116State0002.integerState0756) {
              gameDomainSupport002Local4.integerState0175 = gameDomainSupport002Local4.integerState0175 - 3;
            }
          }
        }
        for (integerLocal7 = 0; this.mixedSupport116State0002.integerState0756 > integerLocal7; integerLocal7++) {
          this.gameDomainSupport002ArrayState0001[integerLocal7].integerState0176 = integerLocal1;
          this.gameDomainSupport002ArrayState0001[integerLocal7].integerState0174 = integerArgument2 - integerLocal1 / 2;
        }
    }

    final void performAction0883(byte byteArgument1) {
        this.integerState0369 = this.integerState0369 + this.integerState0365 / 2;
        this.integerState0365 = 7 * this.integerState0365 / 8;
        this.integerState0365 = this.integerState0365 - this.integerState0369;
        if (byteArgument1 <= 107) {
          RenderingSupport007.performAction0848(103, -21, -87, 6, (byte) -30);
        }
    }

    final void performAction0869(int integerArgument1) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport051.performAction0606(this, (byte) 95);
        while (DualNodeDeque.computeBoolean0027(-18)) {
          if (MixedSupport146.integerState0931 == 13) {
            SceneWidgetPart008.performAction1129(integerArgument1 + 8749);
            SceneWidgetPart013.booleanState0203 = false;
            UiComponentPart025.performAction1363(false, (byte) -112);
            return;
          }
          if (UiComponentPart023.computeBoolean1242(-30146)) {
            this.mixedSupport116State0002.performAction1512(-31);
          } else {
            this.mixedSupport116State0002.performAction1524(integerArgument1 ^ -8622);
            if (MixedSupport146.integerState0931 == 96) {
              MixedSupport019.integerState0114 = (MixedSupport019.integerState0114 + 1) % 2;
              this.mixedSupport116State0002.performAction1513(MixedSupport019.integerState0114, (byte) -91);
              SceneWidgetPart008.performAction1129(126);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 97) {
              MixedSupport019.integerState0114 = (MixedSupport019.integerState0114 + 1) % 2;
              this.mixedSupport116State0002.performAction1513(MixedSupport019.integerState0114, (byte) -113);
              SceneWidgetPart008.performAction1129(integerArgument1 + 8601);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 98) {
              if (this.mixedSupport116State0002.integerState0754 == 2) {
                this.mixedSupport116State0002.performAction1513(MixedSupport019.integerState0114, (byte) -69);
              } else {
                this.mixedSupport116State0002.performAction1513(2, (byte) -98);
              }
            }
            if (MixedSupport146.integerState0931 == 99) {
              if (this.mixedSupport116State0002.integerState0754 >= 0 &&
                2 > this.mixedSupport116State0002.integerState0754) {
                this.mixedSupport116State0002.performAction1513(2, (byte) -109);
              } else {
                this.mixedSupport116State0002.performAction1513(MixedSupport019.integerState0114, (byte) -101);
              }
            }
          }
          if (this.computeBoolean0850(-14845, false)) {
            return;
          }
        }
        if (integerArgument1 != -8622) {
          this.integerState0374 = 87;
        }
        this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
        boolean discarded$0 = this.computeBoolean0850(-14845, true);
    }

    private final void performAction0872(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        GameDomainSupport002 gameDomainSupport002Local3 = null;
        String stringLocal4 = null;
        int integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal6 = -(this.integerState0369 >> 2) + (640 - 640 * (this.integerState0363 * this.integerState0363) / 400);
        int integerLocal7 = this.integerState0367 <= 0 ? 1 : 0;
        int integerLocal8 = 3 <= this.integerState0367 ? this.mixedSupport116State0002.integerState0756 - 1 : this.mixedSupport116State0002.integerState0756;
        for (integerLocal1 = integerLocal7; integerLocal1 < integerLocal8; integerLocal1++) {
          GameplayControls.performAction1749(this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0175, (byte) 50, MixedSupport094.rgbSpriteArrayState0020, this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0176, this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0178, this.gameDomainSupport002ArrayState0001[integerLocal1].integerState0174 + integerLocal6);
          integerLocal2 = 16687906;
          if (integerLocal1 == this.mixedSupport116State0002.integerState0754) {
            integerLocal2 = 16777215;
          }
          gameDomainSupport002Local3 = this.gameDomainSupport002ArrayState0001[integerLocal1];
          stringLocal4 = gameDomainSupport002Local3.stringState0142;
          MixedSupport045.computeInteger0552(gameDomainSupport002Local3.integerState0176, 1, gameDomainSupport002Local3.integerState0178, stringLocal4, 1, gameDomainSupport002Local3.integerState0175, integerLocal2, MixedSupport001.renderingSupport009State0001, (byte) -125, 1, integerLocal6 + gameDomainSupport002Local3.integerState0174);
        }
        if (integerArgument1 != 16687906) {
          this.integerState0365 = 100;
        }
    }

    private final boolean computeBoolean0867(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1;
        this.performAction0878(118);
        integerLocal1 = -1;
        if (this.mixedSupport116State0002.integerState0754 >= 0) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (20 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          UiComponentPart021.performAction1167(false, 5, true);
          SceneWidgetPart008.performAction1129(-72);
          return true;
        }
        if ((integerLocal1 == 19 ||
          integerLocal1 == 10 ||
          3 == integerLocal1 ||
          13 == integerLocal1 ||
          !booleanArgument1) &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          if (integerLocal1 == 13) {
            UiComponentPart013.booleanState0066 = false;
          }
          BucketBoard.booleanState0109 = false;
          if (integerLocal1 == 3 ||
            13 == integerLocal1) {
            MixedSupport043.booleanState0048 = false;
            SceneWidgetPart007.booleanState0114 = false;
          }
          UiComponentPart025.performAction1363(booleanArgument1, (byte) -102);
          SceneWidgetPart008.performAction1129(115);
          return true;
        }
        if (integerArgument2 < 119) {
          this.performAction0857((byte) -109);
        }
        return false;
    }

    final static void performAction0843(byte byteArgument1) {
        SceneWidgetPart012 stackSceneWidgetPart012Local1 = null;
        boolean stackBooleanLocal2 = false;
        int stackIntegerLocal3 = 0;
        SceneWidgetPart012 stackSceneWidgetPart012Local4 = null;
        boolean stackBooleanLocal5 = false;
        RuntimeException caughtExceptionLocal6 = null;
        CipherPacketBuffer cipherPacketBufferLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        long longLocal10 = 0L;
        int integerLocal11 = 0;
        SceneWidgetPart012 sceneWidgetPart012Local12 = null;
        int integerLocal13 = 0;
        SceneWidgetPart013 sceneWidgetPart013Local14 = null;
        int integerLocal15 = 0;
        String stringLocal16 = null;
        SceneWidgetPart013 sceneWidgetPart013Local17 = null;
        SceneWidgetPart012 sceneWidgetPart012Local18 = null;
        SceneWidgetPart012 sceneWidgetPart012Local19 = null;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        SceneWidgetPart013 sceneWidgetPart013Local24 = null;
        SceneWidgetPart012 sceneWidgetPart012Local25 = null;
        Object objectLocal26 = null;
        SceneWidgetPart013 sceneWidgetPart013Local27 = null;
        Object objectLocal28 = null;
        Object objectLocal29 = null;
        Object objectLocal30 = null;
        SceneWidgetPart013 sceneWidgetPart013Local31 = null;
        SceneWidgetPart012 sceneWidgetPart012Local32 = null;
        Object objectLocal33 = null;
        SceneWidgetPart013 sceneWidgetPart013Local34 = null;
        SceneWidgetPart012 sceneWidgetPart012Local35 = null;
        SceneWidgetPart012 sceneWidgetPart012Local36 = null;
        String stringLocal37 = null;
        String stringLocal38 = null;
        SceneWidgetPart012 sceneWidgetPart012Local39 = null;
        SceneWidgetPart012 sceneWidgetPart012Local40 = null;
        String stringLocal41 = null;
        String stringLocal42 = null;
        SceneWidgetPart012 sceneWidgetPart012Local43 = null;
        SceneWidgetPart013 sceneWidgetPart013Local44 = null;
        SceneWidgetPart013 sceneWidgetPart013Local45 = null;
        SceneWidgetPart012 sceneWidgetPart012Local46 = null;
        SceneWidgetPart012 sceneWidgetPart012Local47;
        long longLocal48;
        long longLocal49;
        int integerLocal50;
        int integerLocal51;
        int integerLocal52;
        int integerLocal53;
        int integerLocal54;
        int integerLocal55;
        int integerLocal56;
        int integerLocal57;
        long longLocal58;
        int integerLocal59;
        objectLocal33 = null;
        objectLocal30 = null;
        objectLocal26 = null;
        objectLocal28 = null;
        objectLocal29 = null;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 < 85) {
            stringState0306 = (String) null;
          }
          cipherPacketBufferLocal7 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal9 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -114);
          if (integerLocal9 != 0 &&
            integerLocal9 != 1 &&
            integerLocal9 != 2 &&
            integerLocal9 != 3 &&
            integerLocal9 != 4) {
            if (integerLocal9 == 5) {
              longLocal10 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
              stringLocal41 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readNullTerminatedString((byte) -38);
              stringLocal16 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readNullTerminatedString((byte) -38);
              stringLocal42 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readNullTerminatedString((byte) -38);
              sceneWidgetPart012Local43 = ComponentDecorator.computeSceneWidgetPart0121012(-102, longLocal10);
              sceneWidgetPart012Local19 = sceneWidgetPart012Local43;
              stackIntegerLocal3 = (stringLocal16.equals("")) ? 0 : 1;
              integerLocal21 = stackIntegerLocal3;
              if (sceneWidgetPart012Local43 != null) {
                if (integerLocal21 != 0) {
                  sceneWidgetPart012Local43.performAction1605((byte) 19, stringLocal42, stringLocal41);
                }
              } else {
                sceneWidgetPart012Local19 = new SceneWidgetPart012(stringLocal41, stringLocal42, longLocal10);
                MixedSupport090.secondaryNodeHashTableState0004.put(sceneWidgetPart012Local19, -1, longLocal10);
              }
              sceneWidgetPart012Local19.longState0047 = MixedSupport062.correctedCurrentTimeMillis(4) - (long)((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readInt(7553);
              sceneWidgetPart012Local19.integerState0781 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
              integerLocal22 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readVarInt(-28);
              stackSceneWidgetPart012Local4 = sceneWidgetPart012Local19;
              stackBooleanLocal5 = ((integerLocal22 & 1) != 0);
              stackSceneWidgetPart012Local4.booleanState0186 = stackBooleanLocal5;
              sceneWidgetPart012Local19.integerState0784 = integerLocal22 >> 1;
              sceneWidgetPart012Local19.integerState0780 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -98);
              sceneWidgetPart012Local19.integerState0782 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -128);
              GameDomainSupport006.performAction1822((byte) 112, sceneWidgetPart012Local19);
              return;
            }
            if (integerLocal9 == 6) {
              longLocal48 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
              integerLocal15 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -89);
              sceneWidgetPart012Local40 = ComponentDecorator.computeSceneWidgetPart0121012(-122, longLocal48);
              if (sceneWidgetPart012Local40 == null) {
                return;
              }
              if (sceneWidgetPart012Local40.booleanState0187) {
                sceneWidgetPart012Local40.booleanState0187 = false;
                MixedSupport019.integerState0113 = MixedSupport019.integerState0113 - 1;
              }
              if (integerLocal15 == 0) {
                sceneWidgetPart012Local40.unlink((byte) 114);
              } else {
                sceneWidgetPart012Local40.integerState0786 = integerLocal15;
                sceneWidgetPart012Local40.integerState0785 = MixedSupport089.integerState0547;
              }
              sceneWidgetPart012Local40.unlinkSecondary((byte) 95);
              return;
            }
            if (integerLocal9 == 7) {
              sceneWidgetPart012Local46 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.beginBackward((byte) 43));
              while (sceneWidgetPart012Local46 != null) {
                sceneWidgetPart012Local46.unlink((byte) 108);
                sceneWidgetPart012Local46.unlinkSecondary((byte) 112);
                sceneWidgetPart012Local46 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.nextBackward(true));
              }
              MixedSupport019.integerState0113 = 0;
              return;
            }
            if (8 == integerLocal9) {
              integerLocal11 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
              sceneWidgetPart013Local14 = (SceneWidgetPart013) (MixedSupport121.secondaryNodeHashTableState0005.get(24710, (long)integerLocal11));
              if (sceneWidgetPart013Local14 == null) {
                sceneWidgetPart013Local14 = new SceneWidgetPart013(MixedSupport063.integerState0336);
                MixedSupport121.secondaryNodeHashTableState0005.put(sceneWidgetPart013Local14, -1, (long)integerLocal11);
              }
              MouseInput.performAction1806(true, cipherPacketBufferLocal7, sceneWidgetPart013Local14, (byte) -89);
              ResourceSupport004.performAction1249(sceneWidgetPart013Local14, (byte) -50);
              return;
            }
            if (integerLocal9 == 9) {
              integerLocal55 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
              integerLocal13 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -41);
              sceneWidgetPart013Local44 = (SceneWidgetPart013) (MixedSupport121.secondaryNodeHashTableState0005.get(24710, (long)integerLocal55));
              if (sceneWidgetPart013Local44 == null) {
                return;
              }
              if (integerLocal13 == 0) {
                sceneWidgetPart013Local44.unlink((byte) 127);
              } else {
                sceneWidgetPart013Local44.integerState0846 = MixedSupport089.integerState0547;
                sceneWidgetPart013Local44.integerState0844 = integerLocal13;
              }
              sceneWidgetPart013Local44.unlinkSecondary((byte) 98);
              return;
            }
            if (integerLocal9 == 10) {
              sceneWidgetPart013Local45 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.beginBackward((byte) 121));
              while (sceneWidgetPart013Local45 != null) {
                sceneWidgetPart013Local45.unlink((byte) 115);
                sceneWidgetPart013Local45.unlinkSecondary((byte) 118);
                sceneWidgetPart013Local45 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.nextBackward(true));
              }
              return;
            }
            if (integerLocal9 != 11 &&
              12 != integerLocal9) {
              if (integerLocal9 == 13) {
                integerLocal56 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
                integerLocal53 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -49);
                sceneWidgetPart013Local27 = (SceneWidgetPart013) (MixedSupport121.secondaryNodeHashTableState0005.get(24710, (long)integerLocal56));
                if (sceneWidgetPart013Local27 != null) {
                  sceneWidgetPart013Local24 = sceneWidgetPart013Local27;
                  sceneWidgetPart013Local17 = sceneWidgetPart013Local24;
                  sceneWidgetPart013Local27.booleanState0206 = false;
                  sceneWidgetPart013Local24.booleanState0200 = false;
                  if (0 != integerLocal53) {
                    sceneWidgetPart013Local27.integerState0846 = MixedSupport089.integerState0547;
                    sceneWidgetPart013Local27.integerState0844 = integerLocal53;
                  }
                  ResourceSupport004.performAction1249(sceneWidgetPart013Local27, (byte) -50);
                }
                return;
              }
              if (integerLocal9 != 14 &&
                integerLocal9 != 16) {
                if (integerLocal9 != 15 &&
                  integerLocal9 != 17) {
                  if (18 == integerLocal9) {
                    longLocal49 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
                    stringLocal37 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readNullTerminatedString((byte) -38);
                    stringLocal38 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readNullTerminatedString((byte) -38);
                    sceneWidgetPart012Local18 = MixedSupport011.computeSceneWidgetPart0120156(longLocal49, (byte) 63);
                    if (sceneWidgetPart012Local18 == null) {
                      sceneWidgetPart012Local18 = new SceneWidgetPart012(stringLocal37, stringLocal38, longLocal49);
                      GameApplet.secondaryNodeHashTableState0002.put(sceneWidgetPart012Local18, -1, longLocal49);
                      MixedSupport016.sceneWidgetPart013State0001.integerState0843 = MixedSupport016.sceneWidgetPart013State0001.integerState0843 + 1;
                    }
                    sceneWidgetPart012Local18.integerState0781 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
                    integerLocal20 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readVarInt(-69);
                    sceneWidgetPart012Local18.integerState0784 = integerLocal20 >> 1;
                    stackSceneWidgetPart012Local1 = sceneWidgetPart012Local18;
                    stackBooleanLocal2 = ((1 & integerLocal20) != 0);
                    stackSceneWidgetPart012Local1.booleanState0186 = stackBooleanLocal2;
                    sceneWidgetPart012Local18.integerState0780 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -29);
                    sceneWidgetPart012Local18.integerState0782 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -79);
                    MixedSupport091.nodeDequeState0021.addFirst(sceneWidgetPart012Local18, 2777);
                    return;
                  }
                  if (19 == integerLocal9) {
                    longLocal49 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
                    integerLocal54 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -41);
                    sceneWidgetPart012Local32 = MixedSupport011.computeSceneWidgetPart0120156(longLocal49, (byte) 79);
                    sceneWidgetPart012Local36 = sceneWidgetPart012Local32;
                    if (sceneWidgetPart012Local36 == null) {
                      return;
                    }
                    if (integerLocal54 == 0) {
                      sceneWidgetPart012Local36.unlink((byte) 105);
                    } else {
                      sceneWidgetPart012Local36.integerState0786 = integerLocal54;
                      sceneWidgetPart012Local36.integerState0785 = MixedSupport089.integerState0547;
                    }
                    sceneWidgetPart012Local36.unlinkSecondary((byte) 84);
                    MixedSupport016.sceneWidgetPart013State0001.integerState0843 = MixedSupport016.sceneWidgetPart013State0001.integerState0843 - 1;
                    return;
                  }
                  if (20 == integerLocal9) {
                    MouseInput.performAction1806(false, cipherPacketBufferLocal7, MixedSupport016.sceneWidgetPart013State0001, (byte) -103);
                    return;
                  }
                  if (21 == integerLocal9) {
                    integerLocal56 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
                    if (integerLocal56 != 0) {
                      SceneWidgetNode.longState0023 = MixedSupport062.correctedCurrentTimeMillis(4) + (long)integerLocal56;
                      return;
                    }
                    SceneWidgetNode.longState0023 = 0L;
                    return;
                  }
                  if (22 == integerLocal9) {
                    UiComponentPart006.integerState0137 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
                    ReturnedShape.integerState0693 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readVarInt(-104);
                    return;
                  }
                  if (23 == integerLocal9) {
                    MixedSupport127.longState0050 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
                    return;
                  }
                  NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "L1: " + BufferedSocket.computeString1379((byte) 49));
                  NodeHashTable.performAction1498(117);
                  return;
                }
                longLocal49 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
                integerLocal59 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -87);
                sceneWidgetPart012Local25 = ComponentDecorator.computeSceneWidgetPart0121012(-119, longLocal49);
                sceneWidgetPart012Local39 = sceneWidgetPart012Local25;
                if (sceneWidgetPart012Local25 != null) {
                  if (integerLocal59 != 0) {
                    sceneWidgetPart012Local25.integerState0785 = MixedSupport089.integerState0547;
                    sceneWidgetPart012Local25.integerState0786 = integerLocal59;
                  }
                  if (integerLocal9 != 15) {
                    if (sceneWidgetPart012Local39.booleanState0187) {
                      MixedSupport019.integerState0113 = MixedSupport019.integerState0113 - 1;
                      sceneWidgetPart012Local39.booleanState0187 = false;
                    }
                  } else {
                    sceneWidgetPart012Local25.booleanState0189 = false;
                  }
                  GameDomainSupport006.performAction1822((byte) 34, sceneWidgetPart012Local39);
                }
                return;
              }
              longLocal58 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readLong((byte) -108);
              sceneWidgetPart012Local35 = ComponentDecorator.computeSceneWidgetPart0121012(-119, longLocal58);
              if (sceneWidgetPart012Local35 == null) {
                return;
              }
              if (14 == integerLocal9) {
                sceneWidgetPart012Local35.booleanState0189 = true;
              } else {
                if (!sceneWidgetPart012Local35.booleanState0187) {
                  sceneWidgetPart012Local35.booleanState0187 = true;
                  MixedSupport019.integerState0113 = MixedSupport019.integerState0113 + 1;
                }
              }
              GameDomainSupport006.performAction1822((byte) 57, sceneWidgetPart012Local35);
              return;
            }
            integerLocal57 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
            sceneWidgetPart013Local31 = (SceneWidgetPart013) (MixedSupport121.secondaryNodeHashTableState0005.get(24710, (long)integerLocal57));
            sceneWidgetPart013Local34 = sceneWidgetPart013Local31;
            if (sceneWidgetPart013Local34 == null) {
              return;
            }
            if (integerLocal9 != 11) {
              sceneWidgetPart013Local34.booleanState0206 = true;
            } else {
              sceneWidgetPart013Local34.booleanState0200 = true;
            }
            ResourceSupport004.performAction1249(sceneWidgetPart013Local34, (byte) -50);
            return;
          }
          sceneWidgetPart012Local12 = (SceneWidgetPart012) (MixedSupport091.nodeDequeState0021.beginBackward((byte) 117));
          while (sceneWidgetPart012Local12 != null) {
            sceneWidgetPart012Local12.unlink((byte) 110);
            sceneWidgetPart012Local12.unlinkSecondary((byte) 73);
            sceneWidgetPart012Local12 = (SceneWidgetPart012) (MixedSupport091.nodeDequeState0021.nextBackward(true));
          }
          sceneWidgetPart012Local47 = (SceneWidgetPart012) (MixedSupport090.secondaryNodeHashTableState0004.first(-9443));
          while (sceneWidgetPart012Local47 != null) {
            if (sceneWidgetPart012Local47.booleanState0189 ||
              sceneWidgetPart012Local47.booleanState0187) {
              if (sceneWidgetPart012Local47.booleanState0187) {
                sceneWidgetPart012Local47.booleanState0187 = false;
                MixedSupport019.integerState0113 = MixedSupport019.integerState0113 - 1;
              }
              sceneWidgetPart012Local47.booleanState0189 = false;
              GameDomainSupport006.performAction1822((byte) 94, sceneWidgetPart012Local47);
            }
            sceneWidgetPart012Local47 = (SceneWidgetPart012) (MixedSupport090.secondaryNodeHashTableState0004.next(-99));
          }
          if (integerLocal9 == 1 &&
            MixedSupport016.sceneWidgetPart013State0001 != null) {
            MixedSupport126.stringState0552 = MixedSupport016.sceneWidgetPart013State0001.stringState0585;
          }
          if (4 == integerLocal9) {
            integerLocal50 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedShort(3);
            MixedSupport016.sceneWidgetPart013State0001 = new SceneWidgetPart013(MixedSupport063.integerState0336);
            MixedSupport016.sceneWidgetPart013State0001.setSecondaryKey((long)integerLocal50, (byte) 111);
            MouseInput.performAction1806(false, cipherPacketBufferLocal7, MixedSupport016.sceneWidgetPart013State0001, (byte) -49);
            SceneWidgetNode.longState0023 = 0L;
          } else {
            MixedSupport016.sceneWidgetPart013State0001 = null;
          }
          if (2 != integerLocal9 &&
            3 != integerLocal9) {
            UiComponentPart011.sceneWidgetPart013State0002 = null;
          } else {
            if (UiComponentPart011.sceneWidgetPart013State0002 == null) {
              UiComponentPart011.sceneWidgetPart013State0002 = new SceneWidgetPart013(MixedSupport063.integerState0336);
            }
          }
          if (integerLocal9 != 3) {
            MixedSupport040.booleanState0047 = false;
            return;
          }
          MixedSupport040.booleanState0047 = true;
          for (integerLocal51 = 0; MixedSupport070.byteArrayState0011.length > integerLocal51; integerLocal51++) {
            MixedSupport070.byteArrayState0011[integerLocal51] = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readByte((byte) -101);
          }
          MixedSupport103.integerState0595 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -95);
          DiagnosticSupport002.integerState0340 = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readUnsignedByte((byte) -128);
          for (integerLocal52 = 0; MixedSupport134.byteArrayState0029.length > integerLocal52; integerLocal52++) {
            MixedSupport134.byteArrayState0029[integerLocal52] = ((PacketBuffer) ((Object) cipherPacketBufferLocal7)).readByte((byte) -119);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal60) {
          caughtExceptionLocal6 = caughtParameterLocal60;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal8), "ke.EA(" + byteArgument1 + ')');
        }
    }

    final static int computeInteger0846(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != 2047) {
          integerArrayState0122 = (int[]) null;
        }
        return MixedSupport104.integerArrayState0196[integerArgument2 & 2047];
    }

    final void performAction0863(byte byteArgument1) {
        if (byteArgument1 != -75) {
          this.booleanState0095 = true;
        }
        this.performAction0856(false, 15764);
        int integerLocal1 = 640 + (-(this.integerState0363 * this.integerState0363 * 640 / 400) - (this.integerState0369 >> 2));
        MixedSupport029.performAction0407(16777215, integerLocal1 + 320, NodeHashTable.stringState0509, 120, (byte) 75, SceneWidget.renderingSupport009State0007);
        MixedSupport029.performAction0407(16777215, integerLocal1 + 320, MixedSupport047.computeString0577(-125, this.booleanState0096, this.booleanState0092, this.booleanState0095), 140, (byte) 75, SceneWidget.renderingSupport009State0007);
        MixedSupport029.performAction0407(16777215, 320 + integerLocal1, DisplayModeController.computeString1440(byteArgument1 ^ -75, this.booleanState0096, this.booleanState0092, this.booleanState0095), 240, (byte) 75, SceneWidget.renderingSupport009State0007);
        MixedSupport029.performAction0407(16777215, integerLocal1 + 320, MixedSupport070.computeString0913(this.booleanState0092, this.booleanState0096, this.booleanState0095, true), 300, (byte) 75, SceneWidget.renderingSupport009State0007);
    }

    final void performAction0880(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        RgbSprite rgbSpriteLocal3;
        int integerLocal4;
        int integerLocal5;
        Object objectLocal6;
        int integerLocal7;
        String[] stringArrayLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int[] integerArrayLocal17;
        int integerLocal18;
        int integerLocal19;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -(this.integerState0369 >> 2) + (-(640 * this.integerState0363 * this.integerState0363 / 400) + 640);
        this.performAction0856(false, 15764);
        rgbSpriteLocal3 = MixedSupport146.rgbSpriteState0074;
        rgbSpriteLocal3.performAction0278(-(rgbSpriteLocal3.integerState0254 / 2) + 320, 45 + (-(rgbSpriteLocal3.integerState0260 / 2) - (integerLocal2 >> 2)));
        if (null == this.mixedSupport068State0001 &&
          !UiComponentPart023.computeBoolean1242(-30146)) {
          this.mixedSupport068State0001 = MixedSupport007.computeMixedSupport0680070(3, false, 1, 1, 10);
        }
        integerLocal4 = -44 / ((63 - integerArgument1) / 44);
        integerLocal5 = RenderingSupport001.computeInteger0135((byte) 107, MixedSupport048.mixedSupport072State0001, MixedSupport036.integerState0222, this.mixedSupport068State0001);
        MixedSupport042.performAction0537(105, 256, 16777215, MixedSupport142.stringState0597, 125 + integerLocal2, SceneWidget.renderingSupport009State0007);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport086.stringState0362, 16777215, integerLocal2 + 400);
        MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 105, MixedSupport117.stringState0516, 16777215, 545 + integerLocal2);
        for (integerLocal1 = 0; integerLocal1 < 10; integerLocal1++) {
          integerLocal7 = 16777215;
          MixedSupport072.performAction0918(SceneWidget.renderingSupport009State0007, (byte) -39, 130 + integerLocal1 * 20, 1 + integerLocal1 + ".", integerLocal7, integerLocal2 + 115);
        }
        objectLocal6 = MixedSupport076.stringState0326;
        integerLocal18 = 1;
        if (null != this.mixedSupport068State0001) {
          if (this.mixedSupport068State0001.booleanState0091) {
            if (null != this.mixedSupport068State0001.stringArrayArrayState0004) {
              stringArrayLocal8 = this.mixedSupport068State0001.stringArrayArrayState0004[MixedSupport036.integerState0222];
              integerArrayLocal17 = this.mixedSupport068State0001.integerArrayArrayState0014[MixedSupport036.integerState0222];
              for (integerLocal11 = 0; 10 > integerLocal11; integerLocal11++) {
                if (null != stringArrayLocal8[integerLocal11]) {
                  objectLocal6 = null;
                  integerLocal12 = 16769088;
                  integerLocal13 = integerArrayLocal17[integerLocal11];
                  integerLocal14 = integerLocal13 >>> 8;
                  if (integerLocal5 == integerLocal11) {
                    integerLocal12 = 16777215;
                  }
                  integerLocal15 = 1 + integerLocal13 % 256;
                  MixedSupport042.performAction0537(130 + 20 * integerLocal11, 256, integerLocal12, stringArrayLocal8[integerLocal11], 125 + integerLocal2, UiComponentPart029.renderingSupport009State0005);
                  MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 20 * integerLocal11 + 130, Integer.toString(integerLocal15), integerLocal12, integerLocal2 + 400);
                  MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, integerLocal11 * 20 + 130, Integer.toString(integerLocal14), integerLocal12, integerLocal2 + 545);
                }
              }
            } else {
              objectLocal6 = NanoFrameTimer.stringState0127;
            }
            if (integerLocal5 < 0 &&
              null != MixedSupport048.mixedSupport072State0001 &&
              MixedSupport048.mixedSupport072State0001.integerState0414 == 1) {
              MixedSupport042.performAction0537(330, 256, 16777215, MixedSupport089.stringState0372, integerLocal2 + 125, UiComponentPart029.renderingSupport009State0005);
              integerLocal9 = MixedSupport048.mixedSupport072State0001.integerArrayState0139[0];
              integerLocal10 = integerLocal9 % 256 + 1;
              MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 330, Integer.toString(integerLocal10), 16777215, 400 + integerLocal2);
              integerLocal19 = integerLocal9 >>> 8;
              integerLocal18 = 0;
              MixedSupport072.performAction0918(UiComponentPart029.renderingSupport009State0005, (byte) -39, 330, Integer.toString(integerLocal19), 16777215, integerLocal2 + 545);
            }
          } else {
            objectLocal6 = TextFieldValidator.stringState0633;
          }
        }
        if (null != objectLocal6) {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal2, (String) (objectLocal6), 220, (byte) 75, SceneWidget.renderingSupport009State0007);
        }
        if (!UiComponentPart023.computeBoolean1242(-30146)) {
          if (integerLocal18 != 0) {
            MixedSupport029.performAction0407(16777215, integerLocal2 + 320, MixedSupport004.stringState0014, 330, (byte) 75, UiComponentPart029.renderingSupport009State0005);
          }
        } else {
          MixedSupport029.performAction0407(16777215, 320 + integerLocal2, GzipDecompressor.stringState0327, 330, (byte) 75, UiComponentPart029.renderingSupport009State0005);
        }
    }

    final void performAction0879(byte byteArgument1) {
        if (byteArgument1 != 39) {
          return;
        }
        this.mixedSupport116State0002.performAction1512(-115);
        boolean discarded$0 = this.computeBoolean0890(-1);
    }

    private final void performAction0856(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        GameSession stackGameSessionLocal2 = null;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int integerLocal5;
        GameDomainSupport002 gameDomainSupport002Local6;
        String stringLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        GameSession gameSessionLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        integerLocal17 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal5 = -(this.integerState0369 >> 2) + (640 - this.integerState0363 * (this.integerState0363 * 640) / 400);
        SoftwareRaster.fillRectangleAlpha(4 + this.integerState0374 + integerLocal5, this.integerState0375 + 4, this.integerState0368 - 8, -8 + this.integerState0372, 0, 150);
        GameplayControls.performAction1749(this.integerState0372, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, this.integerState0368, this.integerState0375, this.integerState0374 + integerLocal5);
        if (integerArgument2 != 15764) {
          this.booleanState0095 = false;
        }
        for (integerLocal1 = 0; integerLocal1 < this.mixedSupport116State0002.integerState0756; integerLocal1++) {
          gameDomainSupport002Local6 = this.gameDomainSupport002ArrayState0001[integerLocal1];
          stringLocal7 = gameDomainSupport002Local6.stringState0142;
          integerLocal8 = gameDomainSupport002Local6.integerState0178;
          integerLocal9 = gameDomainSupport002Local6.integerState0175;
          if (booleanArgument1) {
            integerLocal10 = integerLocal8;
            integerLocal11 = integerLocal9;
            if (integerLocal1 > 0) {
              integerLocal8 -= 3;
              integerLocal9 += 3;
            }
            if (this.mixedSupport116State0002.integerState0756 - 1 > integerLocal1) {
              integerLocal9 += 3;
            }
            SoftwareRaster.setClip(0, integerLocal10, 640, integerLocal11 + integerLocal10);
          }
          integerLocal18 = 16694016;
          if (integerLocal1 != this.mixedSupport116State0002.integerState0754) {
            GameplayControls.performAction1749(integerLocal9, (byte) 50, MixedSupport094.rgbSpriteArrayState0020, gameDomainSupport002Local6.integerState0176, integerLocal8, integerLocal5 + gameDomainSupport002Local6.integerState0174);
          } else {
            integerLocal18 = 16777215;
            GameplayControls.performAction1749(integerLocal9, (byte) 50, CacheWorkQueue.rgbSpriteArrayState0016, gameDomainSupport002Local6.integerState0176, integerLocal8, integerLocal5 + gameDomainSupport002Local6.integerState0174);
          }
          if (gameDomainSupport002Local6.integerState0179 == 15) {
            if ((ComponentContainer.gameSessionState0002.mixedSupport028State0001.integerState0170 & 1 << ComponentContainer.gameSessionState0002.integerState0612) != 0) {
              stringLocal7 = MixedSupport027.stringState0131;
            } else {
              if (ComponentContainer.gameSessionState0002.mixedSupport028State0001.integerState0170 == 0) {
                stringLocal7 = ComponentContainer.stringState0308;
              } else {
                stringLocal7 = MixedSupport100.stringState0421;
                if ((CipherPacketBuffer.integerState0799 & 16) == 0) {
                  integerLocal18 = 16777215;
                }
              }
            }
          }
          if (gameDomainSupport002Local6.integerState0179 == 17) {
            if (ComponentContainer.gameSessionState0002 == null) {
              stackGameSessionLocal2 = UiComponent.gameSessionState0001;
            } else {
              stackGameSessionLocal2 = ComponentContainer.gameSessionState0002;
            }
            gameSessionLocal12 = stackGameSessionLocal2;
            if (gameSessionLocal12.booleanState0138) {
              if ((gameSessionLocal12.mixedSupport028State0001.integerState0169 & 1 << gameSessionLocal12.integerState0612) == 0) {
                if (gameSessionLocal12.mixedSupport028State0001.integerState0169 == 0) {
                  if ((1 << gameSessionLocal12.mixedSupport028State0001.integerState0173) - 1 == (1 << gameSessionLocal12.integerState0612 | gameSessionLocal12.integerState0613)) {
                    stringLocal7 = MixedSupport024.stringState0117;
                  } else {
                    stringLocal7 = MixedSupport062.stringState0261;
                  }
                } else {
                  stringLocal7 = UiComponentPart033.stringState0623;
                  if (0 == (CipherPacketBuffer.integerState0799 & 16)) {
                    integerLocal18 = 16777215;
                  }
                }
              } else {
                stringLocal7 = PcmPlayerService.stringState0467;
              }
            } else {
              if (0 == (1 << gameSessionLocal12.integerState0612 & gameSessionLocal12.mixedSupport028State0001.integerState0169)) {
                if (gameSessionLocal12.mixedSupport028State0001.integerState0169 == 0) {
                  if ((1 << gameSessionLocal12.mixedSupport028State0001.integerState0173) - 1 != (gameSessionLocal12.integerState0613 | 1 << gameSessionLocal12.integerState0612)) {
                    stringLocal7 = ResourceArchive.stringState0287;
                  } else {
                    stringLocal7 = SceneWidgetPart005.stringState0254;
                  }
                } else {
                  if ((CipherPacketBuffer.integerState0799 & 16) == 0) {
                    integerLocal18 = 16777215;
                  }
                  stringLocal7 = MixedSupport066.stringState0294;
                }
              } else {
                stringLocal7 = ProxySocketFactory.stringState0493;
              }
            }
          }
          if (gameDomainSupport002Local6.integerState0179 != 6 &&
            gameDomainSupport002Local6.integerState0179 != 7) {
            if (gameDomainSupport002Local6.integerState0179 == 22 &&
              integerLocal1 == MixedSupport036.integerState0222) {
              integerLocal18 = 16777215;
            }
            if (gameDomainSupport002Local6.integerState0179 == 23 &&
              integerLocal1 == MixedSupport019.integerState0114) {
              integerLocal18 = 16777215;
            }
            MixedSupport045.computeInteger0552(gameDomainSupport002Local6.integerState0176, 1, integerLocal8, stringLocal7, 20, integerLocal9, integerLocal18, MixedSupport001.renderingSupport009State0001, (byte) -128, 1, gameDomainSupport002Local6.integerState0174 + integerLocal5);
          } else {
            integerLocal19 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport101.stringState0434);
            integerLocal13 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport040.stringState0179);
            if (integerLocal13 > integerLocal19) {
              integerLocal19 = integerLocal13;
            }
            integerLocal14 = (integerLocal19 + 5 + (-128 + gameDomainSupport002Local6.integerState0176)) / 2 + gameDomainSupport002Local6.integerState0174;
            SoftwareRaster.fillRectangle(-1 + integerLocal14 + integerLocal5, integerLocal8 + 11, 130, 8, 65793);
            SoftwareRaster.fillRectangle(1 + (integerLocal14 + integerLocal5), 13 + integerLocal8, 126, 4, integerLocal18);
            if (gameDomainSupport002Local6.integerState0179 != 6) {
              stackIntegerLocal3 = MixedSupport001.integerState0011 * 128 / 128;
            } else {
              stackIntegerLocal3 = GameDomainSupport005.integerState0578 * 128 / 128;
            }
            integerLocal15 = stackIntegerLocal3;
            MixedSupport045.computeInteger0552(-5 + integerLocal14 - gameDomainSupport002Local6.integerState0174, 1, integerLocal8, stringLocal7, 20, integerLocal9, integerLocal18, MixedSupport001.renderingSupport009State0001, (byte) -124, 2, gameDomainSupport002Local6.integerState0174 + integerLocal5);
            stackIntegerLocal4 = (gameDomainSupport002Local6.integerState0179 == 6) ? 1 : 3;
            integerLocal16 = stackIntegerLocal4;
            MixedSupport121.computeRgbSprite1601(true, integerLocal16).performAction0280(integerLocal5 + (-9 + integerLocal14) + integerLocal15, 6 + integerLocal8, 18, 18);
          }
          if (gameDomainSupport002Local6.integerState0179 == 2 && (!(UiComponentPart015.integerState0319 >= 3) ||
            MixedSupport051.computeBoolean0607(false))) {
            SoftwareRaster.grayscaleRectangle(8 + (integerLocal5 + gameDomainSupport002Local6.integerState0174), integerLocal8 + 3, gameDomainSupport002Local6.integerState0176 - 16, 2);
            SoftwareRaster.grayscaleRectangle(4 + (integerLocal5 + gameDomainSupport002Local6.integerState0174), integerLocal8 + 5, gameDomainSupport002Local6.integerState0176 - 8, -10 + integerLocal9);
            SoftwareRaster.grayscaleRectangle(8 + (integerLocal5 + gameDomainSupport002Local6.integerState0174), -5 + (integerLocal9 + integerLocal8), -16 + gameDomainSupport002Local6.integerState0176, 2);
          }
        }
        SoftwareRaster.resetClip();
    }

    final void performAction0865(int integerArgument1, boolean booleanArgument2) {
        this.mixedSupport116State0002.performAction1518(booleanArgument2, 117, this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590));
        if (integerArgument1 != -1) {
          this.integerState0375 = -92;
        }
    }

    final void performAction0885(byte byteArgument1) {
        boolean discarded$0 = false;
        int integerLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = 39 / ((47 - byteArgument1) / 51);
        MixedSupport051.performAction0606(this, (byte) 95);
        do {
          if (!DualNodeDeque.computeBoolean0027(-124)) {
            this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
            discarded$0 = this.computeBoolean0866(true, (byte) -76);
            return;
          }
          if (MixedSupport146.integerState0931 == 13) {
            SceneWidgetPart008.performAction1129(-77);
            MixedSupport043.booleanState0048 = false;
            UiComponentPart025.performAction1363(false, (byte) -107);
            return;
          }
          boolean frameRemainderLocal4 = true;
          if (UiComponentPart023.computeBoolean1242(-30146)) {
            this.mixedSupport116State0002.performAction1512(-113);
          } else {
            this.mixedSupport116State0002.performAction1524(0);
            if (MixedSupport146.integerState0931 == 96) {
              MixedSupport036.integerState0222 = (-1 + (3 + MixedSupport036.integerState0222)) % 3;
              this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -113);
              SceneWidgetPart008.performAction1129(4);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 97) {
              MixedSupport036.integerState0222 = (MixedSupport036.integerState0222 + 1) % 3;
              this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -75);
              SceneWidgetPart008.performAction1129(-117);
              this.mixedSupport116State0002.booleanState0177 = false;
            }
            if (MixedSupport146.integerState0931 == 98) {
              if (this.mixedSupport116State0002.integerState0754 >= 3) {
                if (this.mixedSupport116State0002.integerState0754 == 3) {
                  this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -113);
                } else {
                  this.mixedSupport116State0002.performAction1513(this.mixedSupport116State0002.integerState0754 - 1, (byte) -110);
                }
              } else {
                this.mixedSupport116State0002.performAction1513(-1 + this.mixedSupport116State0002.integerState0756, (byte) -76);
              }
            }
            if (MixedSupport146.integerState0931 == 99) {
              if (this.mixedSupport116State0002.integerState0754 >= 0 &&
                -1 + this.mixedSupport116State0002.integerState0756 != this.mixedSupport116State0002.integerState0754) {
                if (this.mixedSupport116State0002.integerState0754 >= 3) {
                  this.mixedSupport116State0002.performAction1513(this.mixedSupport116State0002.integerState0754 + 1, (byte) -95);
                } else {
                  this.mixedSupport116State0002.performAction1513(3, (byte) -126);
                }
                frameRemainderLocal4 = false;
              }
              else {
                this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -123);
              }
            }
          }
        } while (!this.computeBoolean0866(false, (byte) -96));
        return;
    }

    final void performAction0845(int integerArgument1, byte byteArgument2) {
        GameDomainSupport002 cachedGameDomainSupport002Local1 = null;
        GameDomainSupport002 cachedGameDomainSupport002Local2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal5;
        for (integerLocal3 = 0; this.mixedSupport116State0002.integerState0756 > integerLocal3; integerLocal3++) {
          cachedGameDomainSupport002Local1 = this.gameDomainSupport002ArrayState0001[integerLocal3];
          cachedGameDomainSupport002Local1.integerState0178 = cachedGameDomainSupport002Local1.integerState0178 + integerArgument1;
        }
        this.performAction0856(false, 15764);
        int integerLocal6 = 0;
        integerLocal5 = integerLocal6;
        if (byteArgument2 != -54) {
          this.integerArrayState0121 = (int[]) null;
        }
        while (this.mixedSupport116State0002.integerState0756 > integerLocal6) {
          cachedGameDomainSupport002Local2 = this.gameDomainSupport002ArrayState0001[integerLocal6];
          cachedGameDomainSupport002Local2.integerState0178 = cachedGameDomainSupport002Local2.integerState0178 - integerArgument1;
          integerLocal6++;
        }
    }

    private final boolean computeBoolean0866(boolean booleanArgument1, byte byteArgument2) {
        this.performAction0878(123);
        int integerLocal1 = -1;
        if (!(this.mixedSupport116State0002.integerState0754 < 0)) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (20 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          UiComponentPart021.performAction1167(false, 8, true);
          SceneWidgetPart008.performAction1129(-11);
          return true;
        }
        if ((integerLocal1 == 3 || integerLocal1 == 13 || !booleanArgument1) &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          MixedSupport043.booleanState0048 = false;
          if (integerLocal1 == 13) {
            UiComponentPart013.booleanState0066 = false;
          }
          UiComponentPart025.performAction1363(booleanArgument1, (byte) -103);
          SceneWidgetPart008.performAction1129(11);
          return true;
        }
        if (booleanArgument1 &&
          SceneWidgetPart005.integerState0328 != 0 &&
          this.mixedSupport116State0002.integerState0754 != -1) {
          MixedSupport036.integerState0222 = this.mixedSupport116State0002.integerState0754;
          this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -103);
          SceneWidgetPart008.performAction1129(119);
          return true;
        }
        if (byteArgument2 > -41) {
          integerArrayState0122 = (int[]) null;
          return false;
        }
        return false;
    }

    private final void performAction0853(RenderingSupport009 renderingSupport009Argument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, String stringArgument8, int integerArgument9, int integerArgument10) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        try {
          integerLocal11 = integerArgument7 + (integerArgument4 + integerArgument3);
          if (integerLocal11 != 0) {
            integerArgument7 = (integerLocal11 + integerArgument7 * 200) / (integerLocal11 * 2);
            integerArgument4 = (integerLocal11 + integerArgument4 * 200) / (2 * integerLocal11);
            integerArgument3 = (integerLocal11 + 200 * integerArgument3) / (integerLocal11 * 2);
          }
          stackIntegerLocal1 = (AgeValidator.integerState0360 != 3) ? 310 : 305;
          integerLocal13 = stackIntegerLocal1;
          stackIntegerLocal2 = (3 != AgeValidator.integerState0360) ? 380 : 372;
          integerLocal14 = stackIntegerLocal2;
          stackIntegerLocal3 = (AgeValidator.integerState0360 == 3) ? 427 : 435;
          integerLocal15 = stackIntegerLocal3;
          stackIntegerLocal4 = (3 != AgeValidator.integerState0360) ? 490 : 488;
          integerLocal16 = stackIntegerLocal4;
          MixedSupport042.performAction0537(integerArgument6, 256, integerArgument2, stringArgument8, 125 + integerArgument10, renderingSupport009Argument1);
          MixedSupport072.performAction0918(renderingSupport009Argument1, (byte) -39, integerArgument6, Integer.toString(integerArgument9), integerArgument2, integerLocal13 + integerArgument10);
          MixedSupport072.performAction0918(renderingSupport009Argument1, (byte) -39, integerArgument6, Integer.toString(integerLocal11), integerArgument2, integerLocal14 + integerArgument10);
          MixedSupport072.performAction0918(renderingSupport009Argument1, (byte) -39, integerArgument6, integerArgument7 + "%", integerArgument2, integerLocal15 + integerArgument10);
          MixedSupport072.performAction0918(renderingSupport009Argument1, (byte) -39, integerArgument6, integerArgument4 + "%", integerArgument2, integerArgument10 + integerLocal16);
          MixedSupport072.performAction0918(renderingSupport009Argument1, (byte) -39, integerArgument6, integerArgument3 + "%", integerArgument2, integerArgument10 + 545);
          if (integerArgument5 != -5328) {
            this.integerState0369 = 81;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal10 = caughtParameterLocal17;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal12;
          stackStringBuilderLocal6 = new StringBuilder().append("ke.NA(");
          if (renderingSupport009Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (stringArgument8 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument9).append(',').append(integerArgument10).append(')').toString());
        }
    }

    private final void performAction0888(int integerArgument1) {
        if (this.integerState0367 < 3) {
          this.integerState0367 = this.integerState0367 + 1;
          SceneWidgetPart008.performAction1129(120);
          MixedSupport003.performAction0042((byte) -87);
        }
        int integerLocal1 = 116 % ((integerArgument1 - 18) / 61);
    }

    private final boolean computeBoolean0890(int integerArgument1) {
        this.performAction0878(115);
        int integerLocal1 = integerArgument1;
        if (!(0 > this.mixedSupport116State0002.integerState0754)) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (17 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1325(integerArgument1 ^ -77);
          SceneWidgetPart008.performAction1129(-72);
          return true;
        }
        if (integerLocal1 == 18 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          if (MixedSupport043.booleanState0049) {
            MixedSupport121.performAction1600((byte) -46);
          }
          if (MixedSupport034.booleanState0042) {
            MixedSupport045.performAction0554(false, 0, 11);
          }
          SceneWidgetPart008.performAction1129(127);
          return true;
        }
        return false;
    }

    final void performAction0882(int integerArgument1) {
        int discarded$0 = 0;
        int integerLocal2;
        int integerLocal3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport051.performAction0606(this, (byte) 95);
        while (DualNodeDeque.computeBoolean0027(10)) {
          if (13 == MixedSupport146.integerState0931) {
            SceneWidgetPart008.performAction1129(118);
            BucketBoard.booleanState0109 = false;
            UiComponentPart025.performAction1363(false, (byte) -117);
            return;
          }
          this.mixedSupport116State0002.performAction1512(-36);
          if (this.computeBoolean0867(false, 121)) {
            return;
          }
        }
        this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), -20563, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
        integerLocal3 = this.computeBoolean0867(true, 126) ? 1 : 0;
        if (integerArgument1 >= -78) {
          this.performAction0881((byte) -93);
        }
        if (integerLocal3 != 0) {
          return;
        }
        if (SceneWidgetPart005.integerState0328 != 0) {
          discarded$0 = this.computeInteger0861(true, (byte) -51);
        }
    }

    final void performAction0875(byte byteArgument1) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport051.performAction0606(this, (byte) 95);
        while (DualNodeDeque.computeBoolean0027(-126)) {
          this.mixedSupport116State0002.performAction1512(-118);
          integerLocal1 = this.computeBoolean0860(-1, false) ? 1 : 0;
          if (integerLocal1 == 0) {
            continue;
          }
          return;
        }
        this.mixedSupport116State0002.performAction1515(this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), byteArgument1 - 20467, this.computeInteger0847(400, UiComponentPart013.integerState0276, TextLineMetrics.integerState0535));
        if (this.computeBoolean0860(-1, true)) {
          return;
        }
        if (byteArgument1 != -96) {
          integerState0362 = 58;
        }
        return;
    }

    private final boolean computeBoolean0870(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.performAction0878(111);
        integerLocal1 = -1;
        if (this.mixedSupport116State0002.integerState0754 >= 0) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (integerLocal1 == 1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart008.performAction1129(120);
          UiComponentPart024.performAction1277(false, false, true);
          return true;
        }
        if (integerLocal1 == 2 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart008.performAction1129(40);
          GameplayControls.performAction1752(booleanArgument2, (byte) -73);
          return true;
        }
        if (integerLocal1 == 3 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart008.performAction1129(-80);
          PlayerNameAvailabilityValidator.performAction0825(0, booleanArgument2);
          return true;
        }
        if (integerLocal1 == 4 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SecondaryNodeHashTable.booleanState0121 = true;
          MixedSupport033.renderingSupport007State0004 = InteractiveComponent.computeRenderingSupport0070464(booleanArgument2, this.booleanState0093, 640);
          SceneWidgetPart008.performAction1129(7);
          return true;
        }
        if (integerLocal1 == 5 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1328((byte) -68);
          MixedSupport016.performAction0205(true);
          SceneWidgetPart008.performAction1129(116);
          return true;
        }
        integerLocal2 = -97 / ((integerArgument1 + 46) / 55);
        if (integerLocal1 == 6) {
          boolean frameRemainderLocal14 = true;
          if (this.mixedSupport116State0002.computeBoolean1517(true)) {
            integerLocal3 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport101.stringState0434);
            integerLocal4 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport040.stringState0179);
            if (integerLocal4 > integerLocal3) {
              integerLocal3 = integerLocal4;
            }
            integerLocal5 = (integerLocal3 - 128 + (this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0176 + 5)) / 2 + this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0174;
            integerLocal6 = HashNode.integerState0069 - integerLocal5;
            integerLocal7 = 128 * integerLocal6 / 128;
            if (integerLocal7 < 0) {
              integerLocal7 = 0;
            } else {
              if (integerLocal7 <= 128) {
                if ((GameDomainSupport005.integerState0578 != integerLocal7)) {
                  GameDomainSupport005.integerState0578 = integerLocal7;
                  if (!(CipherPacketBuffer.integerState0799 - this.integerState0373 < 5)) {
                    MixedSupport062.performAction0737(106);
                    this.integerState0373 = CipherPacketBuffer.integerState0799;
                  }
                }
                frameRemainderLocal14 = false;
              }
              else {
                integerLocal7 = 128;
              }
            }
            if ((frameRemainderLocal14) &&
              (GameDomainSupport005.integerState0578 != integerLocal7)) {
              GameDomainSupport005.integerState0578 = integerLocal7;
              if (CipherPacketBuffer.integerState0799 - this.integerState0373 >= 5) {
                MixedSupport062.performAction0737(106);
                this.integerState0373 = CipherPacketBuffer.integerState0799;
              }
            }
          } else {
            if (this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
              MixedSupport062.performAction0737(93);
            }
          }
          if (this.mixedSupport116State0002.computeBoolean1523(114)) {
            GameDomainSupport005.integerState0578 = 0;
            MixedSupport062.performAction0737(64);
          }
          if (this.mixedSupport116State0002.computeBoolean1510((byte) -51)) {
            GameDomainSupport005.integerState0578 = 128;
            MixedSupport062.performAction0737(111);
          }
          if (this.mixedSupport116State0002.computeBoolean1522(true) &&
            GameDomainSupport005.integerState0578 > 0) {
            GameDomainSupport005.integerState0578 = -16 & -1 + GameDomainSupport005.integerState0578;
            MixedSupport062.performAction0737(98);
          }
          if (this.mixedSupport116State0002.computeBoolean1521(-20) &&
            GameDomainSupport005.integerState0578 < 128) {
            GameDomainSupport005.integerState0578 = 16 + GameDomainSupport005.integerState0578 & -16;
            MixedSupport062.performAction0737(120);
          }
        }
        if (7 == integerLocal1) {
          if (this.mixedSupport116State0002.computeBoolean1517(true)) {
            integerLocal9 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport101.stringState0434);
            integerLocal10 = MixedSupport001.renderingSupport009State0001.computeInteger1066(MixedSupport040.stringState0179);
            if (integerLocal10 > integerLocal9) {
              integerLocal9 = integerLocal10;
            }
            integerLocal11 = (integerLocal9 + (-128 + this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0176 + 5)) / 2 + this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0174;
            integerLocal12 = HashNode.integerState0069 - integerLocal11;
            integerLocal13 = integerLocal12 * 128 / 128;
            MixedSupport112.booleanState0166 = true;
            if (integerLocal13 >= 0) {
              if (integerLocal13 <= 128) {
                MixedSupport001.integerState0011 = integerLocal13;
              } else {
                MixedSupport001.integerState0011 = 128;
              }
            } else {
              MixedSupport001.integerState0011 = 0;
            }
          }
          if (this.mixedSupport116State0002.computeBoolean1523(122)) {
            MixedSupport001.integerState0011 = 0;
            MixedSupport112.booleanState0166 = true;
          }
          if (this.mixedSupport116State0002.computeBoolean1510((byte) -51)) {
            MixedSupport112.booleanState0166 = true;
            MixedSupport001.integerState0011 = 128;
          }
          if (this.mixedSupport116State0002.computeBoolean1522(true)) {
            MixedSupport001.integerState0011 = MixedSupport001.integerState0011 - 1 & -16;
            if (MixedSupport001.integerState0011 < 0) {
              MixedSupport001.integerState0011 = 0;
            }
            MixedSupport112.booleanState0166 = true;
          }
          if (this.mixedSupport116State0002.computeBoolean1521(101)) {
            MixedSupport001.integerState0011 = -16 & 16 + MixedSupport001.integerState0011;
            if (MixedSupport001.integerState0011 > 128) {
              MixedSupport001.integerState0011 = 128;
            }
            MixedSupport112.booleanState0166 = true;
          }
        }
        if (integerLocal1 == 8 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          if (MixedSupport020.fullscreenCanvasState0001 == null) {
            HuffmanCodec.performAction0823(2, booleanArgument2);
          } else {
            MixedSupport118.performAction1548(false);
          }
          SceneWidgetPart008.performAction1129(119);
          return true;
        }
        if (integerLocal1 == 9 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart013.booleanState0203 = true;
          UiComponentPart004.renderingSupport007State0002 = NetworkSupport009.computeRenderingSupport0071183(booleanArgument2, 415);
          SceneWidgetPart008.performAction1129(-105);
          return true;
        }
        if (integerLocal1 == 10 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart007.booleanState0114 = true;
          MixedSupport020.renderingSupport007State0003 = MixedSupport105.computeRenderingSupport0071369(-108, booleanArgument2);
          SceneWidgetPart008.performAction1129(127);
          return true;
        }
        if (19 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          MixedSupport043.booleanState0048 = true;
          MixedSupport007.renderingSupport007State0001 = UiComponentPart014.computeRenderingSupport0070696((byte) -80, booleanArgument2);
          SceneWidgetPart008.performAction1129(-14);
          return true;
        }
        if (11 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          BucketBoard.booleanState0109 = true;
          MixedSupport051.renderingSupport007State0005 = IterableNodeCollection.computeRenderingSupport0071657(MixedSupport088.integerArrayState0172, booleanArgument2, 0, -128);
          SceneWidgetPart008.performAction1129(114);
          return true;
        }
        if (12 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart008.performAction1129(-38);
          MixedSupport118.performAction1548(false);
          NetworkSupport010.performAction1252((byte) -17, UiComponentPart029.computeApplet1485(25144));
        }
        if (integerLocal1 == 13 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart008.performAction1129(13);
          MixedSupport016.performAction0205(true);
          return true;
        }
        if (integerLocal1 == 14 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1324((byte) 100);
          MixedSupport007.booleanState0005 = false;
          ComponentContainer.renderingSupport007State0006 = MixedSupport033.computeRenderingSupport0070497(false, false, 0, false, ComponentContainer.gameSessionState0002.booleanState0147, 32357, false, false);
          MixedSupport133.performAction1677((byte) -30);
          MixedSupport023.performAction0341(booleanArgument2, 95);
          SceneWidgetPart008.performAction1129(126);
          return true;
        }
        if (integerLocal1 == 15 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1319(-62);
          MixedSupport016.performAction0205(true);
          SceneWidgetPart008.performAction1129(124);
          return true;
        }
        if (integerLocal1 == 16 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1334(-49);
          MixedSupport016.performAction0205(true);
          SceneWidgetPart008.performAction1129(-19);
          return true;
        }
        if (integerLocal1 == 17 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          ComponentContainer.gameSessionState0002.performAction1325(-89);
          MixedSupport016.performAction0205(true);
          SceneWidgetPart008.performAction1129(122);
          return true;
        }
        if (integerLocal1 == 18 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          if (MixedSupport043.booleanState0049) {
            MixedSupport121.performAction1600((byte) -115);
          }
          if (MixedSupport034.booleanState0042) {
            MixedSupport045.performAction0554(false, 0, 11);
          }
          MixedSupport016.performAction0205(true);
          SceneWidgetPart008.performAction1129(-42);
          return true;
        }
        return false;
    }

    private final void performAction0878(int integerArgument1) {
        boolean discarded$0 = false;
        if (integerArgument1 < 93) {
          discarded$0 = this.computeBoolean0860(68, true);
        }
        if (this.mixedSupport116State0002.booleanState0177) {
          MixedSupport040.performAction0530(32, (byte) -89, MixedSupport100.rawSoundState0016);
        }
    }

    final int computeInteger0844(int integerArgument1) {
        if (integerArgument1 != -1) {
          this.integerState0372 = -13;
        }
        int integerLocal1 = -(this.integerState0369 >> 2) + 640 - 640 * this.integerState0363 * this.integerState0363 / 400;
        return integerLocal1;
    }

    public static void performAction0886(int integerArgument1) {
        stringState0306 = null;
        integerArrayState0122 = null;
        if (integerArgument1 < 106) {
          RenderingSupport007.performAction0871((byte) 27);
        }
    }

    final void performAction0851(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        this.mixedSupport116State0002.performAction1516(integerArgument1, 0, this.computeInteger0847(400, HashNode.integerState0069, MixedSupport101.integerState0590), booleanArgument2);
        if (integerArgument3 != -129) {
          this.performAction0888(53);
        }
    }

    private final boolean computeBoolean0862(boolean booleanArgument1, int integerArgument2) {
        this.performAction0878(95);
        int integerLocal1 = -1;
        if (this.mixedSupport116State0002.integerState0754 >= 0) {
          integerLocal1 = this.gameDomainSupport002ArrayState0001[this.mixedSupport116State0002.integerState0754].integerState0179;
        }
        if (20 == integerLocal1 &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          UiComponentPart021.performAction1167(false, 6, true);
          return true;
        }
        if ((integerLocal1 == 13 || !booleanArgument1) &&
          this.mixedSupport116State0002.computeBoolean1520((byte) 114)) {
          SceneWidgetPart007.booleanState0114 = false;
          UiComponentPart025.performAction1363(booleanArgument1, (byte) -103);
          SceneWidgetPart008.performAction1129(122);
          return true;
        }
        if (booleanArgument1 && SceneWidgetPart005.integerState0328 != 0 &&
          this.mixedSupport116State0002.integerState0754 != -1) {
          MixedSupport036.integerState0222 = this.mixedSupport116State0002.integerState0754;
          this.mixedSupport116State0002.performAction1513(MixedSupport036.integerState0222, (byte) -112);
          SceneWidgetPart008.performAction1129(integerArgument2 - 34);
          return true;
        }
        if (integerArgument2 != 1) {
          this.integerState0371 = -102;
          return false;
        }
        return false;
    }

    RenderingSupport007(int integerArgument1) {
        this.integerState0364 = -1;
        this.gameDomainSupport002ArrayState0001 = new GameDomainSupport002[integerArgument1];
        this.mixedSupport116State0002 = new MixedSupport116();
    }

    static {
        stringState0306 = "Your rating is <%0>";
        integerArrayState0122 = new int[8192];
    }
}
