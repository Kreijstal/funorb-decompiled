/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RawPcmStream extends PcmStream {
    private int integerState0193;
    private int integerState0194;
    private int integerState0195;
    private int integerState0196;
    private int integerState0197;
    private int integerState0198;
    private int integerState0199;
    private boolean booleanState0033;
    private int integerState0200;
    private int integerState0201;
    private int integerState0202;
    private int integerState0203;
    private int integerState0204;
    private int integerState0205;
    private int integerState0206;

    private final synchronized int computeInteger0511() {
        return this.integerState0205 < 0 ? -1 : this.integerState0205;
    }

    private final synchronized void performAction0482(int integerArgument1, int integerArgument2) {
        this.integerState0197 = integerArgument1;
        this.integerState0205 = integerArgument2;
        this.integerState0200 = 0;
        this.performAction0506();
    }

    final static RawPcmStream computeRawPcmStream0498(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (rawSoundArgument1.byteArrayState0028 == null) {
          return null;
        }
        if (rawSoundArgument1.byteArrayState0028.length != 0) {
          return new RawPcmStream(rawSoundArgument1, (int)((long)rawSoundArgument1.integerState0794 * 256L * (long)integerArgument2 / (long)(100 * PcmPlayer.integerState0209)), integerArgument3, integerArgument4);
        }
        return null;
    }

    private final static int computeInteger0473(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RawPcmStream rawPcmStreamArgument11, int integerArgument12, int integerArgument13) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        if (integerArgument12 != 0) {
          integerArgument8 = integerArgument6 + (integerArgument10 + 256 - integerArgument5 + integerArgument12) / integerArgument12;
        }
        if (integerArgument12 == 0 ||
          integerArgument6 + (integerArgument10 + 256 - integerArgument5 + integerArgument12) / integerArgument12 > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        while (integerArgument6 < integerArgument8) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2 - 1];
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument2] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument5 = integerArgument5 + integerArgument12;
        }
        if (integerArgument12 != 0) {
          integerArgument8 = integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12) / integerArgument12;
        }
        if (integerArgument12 == 0 ||
          integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12) / integerArgument12 > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        integerArgument1 = integerArgument13;
        integerArgument2 = integerArgument12;
        while (integerArgument6 < integerArgument8) {
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument5 >> 8] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument5 = integerArgument5 + integerArgument2;
        }
        rawPcmStreamArgument11.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    private final static int computeInteger0486(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RawPcmStream rawPcmStreamArgument11, int integerArgument12, int integerArgument13) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        if (integerArgument12 != 0) {
          integerArgument8 = integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12 - 257) / integerArgument12;
        }
        if (integerArgument12 == 0 ||
          integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12 - 257) / integerArgument12 > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        while (integerArgument6 < integerArgument8) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2];
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument2 + 1] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument5 = integerArgument5 + integerArgument12;
        }
        if (integerArgument12 != 0) {
          integerArgument8 = integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12 - 1) / integerArgument12;
        }
        if (integerArgument12 == 0 ||
          integerArgument6 + (integerArgument10 - integerArgument5 + integerArgument12 - 1) / integerArgument12 > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        integerArgument2 = integerArgument13;
        while (integerArgument6 < integerArgument8) {
          integerArgument1 = byteArrayArgument3[integerArgument5 >> 8];
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (((integerArgument1 << 8) + (integerArgument2 - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument5 = integerArgument5 + integerArgument12;
        }
        rawPcmStreamArgument11.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    private final static int computeInteger0497(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, RawPcmStream rawPcmStreamArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        rawPcmStreamArgument12.integerState0206 = rawPcmStreamArgument12.integerState0206 - rawPcmStreamArgument12.integerState0202 * integerArgument6;
        rawPcmStreamArgument12.integerState0204 = rawPcmStreamArgument12.integerState0204 - rawPcmStreamArgument12.integerState0196 * integerArgument6;
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 257) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 257) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        while (integerArgument6 < integerArgument9) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2];
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument2 + 1] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument8;
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 1) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 1) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument2 = integerArgument14;
        while (integerArgument6 < integerArgument9) {
          integerArgument1 = byteArrayArgument3[integerArgument5 >> 8];
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (((integerArgument1 << 8) + (integerArgument2 - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument8;
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        rawPcmStreamArgument12.integerState0206 = rawPcmStreamArgument12.integerState0206 + rawPcmStreamArgument12.integerState0202 * integerArgument6;
        rawPcmStreamArgument12.integerState0204 = rawPcmStreamArgument12.integerState0204 + rawPcmStreamArgument12.integerState0196 * integerArgument6;
        rawPcmStreamArgument12.integerState0195 = integerArgument7;
        rawPcmStreamArgument12.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    final synchronized void performAction0492(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        RawSound rawSoundLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        if (this.integerState0197 == 0 &&
          this.integerState0200 == 0) {
          this.performAction0469(integerArgument3);
          return;
        }
        rawSoundLocal6 = (RawSound) (this.audioSupport006State0001);
        integerLocal7 = this.integerState0193 << 8;
        integerLocal8 = this.integerState0194 << 8;
        integerLocal9 = rawSoundLocal6.byteArrayState0028.length << 8;
        integerLocal10 = integerLocal8 - integerLocal7;
        if (integerLocal10 <= 0) {
          this.integerState0201 = 0;
        }
        integerLocal11 = integerArgument2;
        integerArgument3 = integerArgument3 + integerArgument2;
        if (this.integerState0203 < 0) {
          if (this.integerState0199 <= 0) {
            this.performAction0503();
            this.performAction0161((byte) 121);
            return;
          }
          this.integerState0203 = 0;
        }
        if (this.integerState0203 >= integerLocal9) {
          if (this.integerState0199 >= 0) {
            this.performAction0503();
            this.performAction0161((byte) 113);
            return;
          }
          this.integerState0203 = integerLocal9 - 1;
        }
        if (this.integerState0201 < 0) {
          if (!this.booleanState0033) {
            if (this.integerState0199 >= 0) {
              while (true) {
                integerLocal11 = this.computeInteger0493(integerArrayArgument1, integerLocal11, integerLocal8, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
                if (this.integerState0203 < integerLocal8) {
                  return;
                }
                this.integerState0203 = integerLocal7 + (this.integerState0203 - integerLocal7) % integerLocal10;
              }
            }
            while (true) {
              integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0194 - 1]);
              if (this.integerState0203 >= integerLocal7) {
                return;
              }
              this.integerState0203 = integerLocal8 - 1 - (integerLocal8 - 1 - this.integerState0203) % integerLocal10;
            }
          }
          if (this.integerState0199 < 0) {
            integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
            if (this.integerState0203 >= integerLocal7) {
              return;
            }
            this.integerState0203 = integerLocal7 + integerLocal7 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
          }
          while (true) {
            integerLocal11 = this.computeInteger0493(integerArrayArgument1, integerLocal11, integerLocal8, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0194 - 1]);
            if (this.integerState0203 < integerLocal8) {
              return;
            }
            this.integerState0203 = integerLocal8 + integerLocal8 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
            integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
            if (this.integerState0203 >= integerLocal7) {
              return;
            }
            this.integerState0203 = integerLocal7 + integerLocal7 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
          }
        }
        boolean frameRemainderLocal14 = true;
        if (this.integerState0201 > 0) {
          if (!this.booleanState0033) {
            if (this.integerState0199 < 0) {
              while (true) {
                integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0194 - 1]);
                if (this.integerState0203 >= integerLocal7) {
                  return;
                }
                integerLocal12 = (integerLocal8 - 1 - this.integerState0203) / integerLocal10;
                if (integerLocal12 < this.integerState0201) {
                  this.integerState0203 = this.integerState0203 + integerLocal10 * integerLocal12;
                  this.integerState0201 = this.integerState0201 - integerLocal12;
                  continue;
                }
                break;
              }
              this.integerState0203 = this.integerState0203 + integerLocal10 * this.integerState0201;
              this.integerState0201 = 0;
            } else {
              while (true) {
                integerLocal11 = this.computeInteger0493(integerArrayArgument1, integerLocal11, integerLocal8, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
                if (this.integerState0203 < integerLocal8) {
                  return;
                }
                integerLocal13 = (this.integerState0203 - integerLocal7) / integerLocal10;
                if (integerLocal13 < this.integerState0201) {
                  this.integerState0203 = this.integerState0203 - integerLocal10 * integerLocal13;
                  this.integerState0201 = this.integerState0201 - integerLocal13;
                  continue;
                }
                break;
              }
              this.integerState0203 = this.integerState0203 - integerLocal10 * this.integerState0201;
              this.integerState0201 = 0;
            }
            frameRemainderLocal14 = false;
          }
          else {
            if (this.integerState0199 < 0) {
              integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
              if (this.integerState0203 >= integerLocal7) {
                return;
              }
              this.integerState0203 = integerLocal7 + integerLocal7 - 1 - this.integerState0203;
              this.integerState0199 = -this.integerState0199;
              integerLocal1 = this.integerState0201 - 1;
              this.integerState0201 = this.integerState0201 - 1;
              frameRemainderLocal14 = (integerLocal1 != 0);
            }
            if (frameRemainderLocal14) {
              do {
                integerLocal11 = this.computeInteger0493(integerArrayArgument1, integerLocal11, integerLocal8, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0194 - 1]);
                if (this.integerState0203 < integerLocal8) {
                  return;
                }
                this.integerState0203 = integerLocal8 + integerLocal8 - 1 - this.integerState0203;
                this.integerState0199 = -this.integerState0199;
                integerLocal2 = this.integerState0201 - 1;
                this.integerState0201 = this.integerState0201 - 1;
                if (integerLocal2 == 0) {
                  break;
                }
                integerLocal11 = this.computeInteger0480(integerArrayArgument1, integerLocal11, integerLocal7, integerArgument3, (int) rawSoundLocal6.byteArrayState0028[this.integerState0193]);
                if (this.integerState0203 >= integerLocal7) {
                  return;
                }
                this.integerState0203 = integerLocal7 + integerLocal7 - 1 - this.integerState0203;
                this.integerState0199 = -this.integerState0199;
                integerLocal3 = this.integerState0201 - 1;
                this.integerState0201 = this.integerState0201 - 1;
              } while (integerLocal3 != 0);
            }
          }
        }
        if (this.integerState0199 >= 0) {
          discarded$4 = this.computeInteger0493(integerArrayArgument1, integerLocal11, integerLocal9, integerArgument3, 0);
          if (this.integerState0203 >= integerLocal9) {
            this.integerState0203 = integerLocal9;
            this.performAction0503();
            this.performAction0161((byte) 123);
          }
          return;
        }
        discarded$3 = this.computeInteger0480(integerArrayArgument1, integerLocal11, 0, integerArgument3, 0);
        if (this.integerState0203 >= 0) {
          return;
        }
        this.integerState0203 = -1;
        this.performAction0503();
        this.performAction0161((byte) 124);
        return;
    }

    final synchronized void performAction0477(boolean booleanArgument1) {
        this.booleanState0033 = booleanArgument1 ? true : false;
    }

    final PcmStream computePcmStream0494() {
        return null;
    }

    private final int computeInteger0480(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1;
        do {
          if (this.integerState0200 <= 0) {
            if (this.integerState0199 == -256 &&
              (this.integerState0203 & 255) == 0) {
              if (PcmPlayer.booleanState0038) {
                return RawPcmStream.computeInteger0475(0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, 0, integerArgument4, integerArgument3, this);
              }
              return RawPcmStream.computeInteger0491(((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, 0, integerArgument4, integerArgument3, this);
            }
            if (PcmPlayer.booleanState0038) {
              return RawPcmStream.computeInteger0502(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, 0, integerArgument4, integerArgument3, this, this.integerState0199, integerArgument5);
            }
            return RawPcmStream.computeInteger0473(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, 0, integerArgument4, integerArgument3, this, this.integerState0199, integerArgument5);
          }
          integerLocal1 = integerArgument2 + this.integerState0200;
          if (integerLocal1 > integerArgument4) {
            integerLocal1 = integerArgument4;
          }
          this.integerState0200 = this.integerState0200 + integerArgument2;
          if (this.integerState0199 == -256 &&
            (this.integerState0203 & 255) == 0) {
            if (!PcmPlayer.booleanState0038) {
              integerArgument2 = RawPcmStream.computeInteger0478(((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, this.integerState0198, 0, integerLocal1, integerArgument3, this);
            } else {
              integerArgument2 = RawPcmStream.computeInteger0487(0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, this.integerState0202, this.integerState0196, 0, integerLocal1, integerArgument3, this);
            }
          } else {
            if (!PcmPlayer.booleanState0038) {
              integerArgument2 = RawPcmStream.computeInteger0485(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, this.integerState0198, 0, integerLocal1, integerArgument3, this, this.integerState0199, integerArgument5);
            } else {
              integerArgument2 = RawPcmStream.computeInteger0484(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, this.integerState0202, this.integerState0196, 0, integerLocal1, integerArgument3, this, this.integerState0199, integerArgument5);
            }
          }
          this.integerState0200 = this.integerState0200 - integerArgument2;
          if (this.integerState0200 != 0) {
            return integerArgument2;
          }
        } while (!this.computeBoolean0509());
        return integerArgument4;
    }

    final static RawPcmStream computeRawPcmStream0476(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (rawSoundArgument1.byteArrayState0028 == null) {
          return null;
        }
        if (rawSoundArgument1.byteArrayState0028.length != 0) {
          return new RawPcmStream(rawSoundArgument1, integerArgument2, integerArgument3, integerArgument4);
        }
        return null;
    }

    private final static int computeInteger0487(int integerArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, RawPcmStream rawPcmStreamArgument13) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument4 = integerArgument4 >> 8;
        integerArgument12 = integerArgument12 >> 8;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument7 << 2;
        integerArgument8 = integerArgument8 << 2;
        integerArgument9 = integerArgument9 << 2;
        integerArgument10 = integerArgument5 + integerArgument4 - (integerArgument12 - 1);
        if (integerArgument5 + integerArgument4 - (integerArgument12 - 1) > integerArgument11) {
          integerArgument10 = integerArgument11;
        }
        rawPcmStreamArgument13.integerState0195 = rawPcmStreamArgument13.integerState0195 + rawPcmStreamArgument13.integerState0198 * (integerArgument10 - integerArgument5);
        integerArgument5 = integerArgument5 << 1;
        integerArgument10 = integerArgument10 << 1;
        integerArgument10 -= 6;
        while (integerArgument5 < integerArgument10) {
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal1 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal1] = integerArrayArgument3[previousIntegerLocal1] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal2 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal2] = integerArrayArgument3[previousIntegerLocal2] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal3 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal3] = integerArrayArgument3[previousIntegerLocal3] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal4 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal4] = integerArrayArgument3[previousIntegerLocal4] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal5 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal5] = integerArrayArgument3[previousIntegerLocal5] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal6 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal6] = integerArrayArgument3[previousIntegerLocal6] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal7 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal7] = integerArrayArgument3[previousIntegerLocal7] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal8 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal8] = integerArrayArgument3[previousIntegerLocal8] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
        }
        integerArgument10 += 6;
        while (integerArgument5 < integerArgument10) {
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal9 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal9] = integerArrayArgument3[previousIntegerLocal9] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal10 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal10] = integerArrayArgument3[previousIntegerLocal10] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
        }
        rawPcmStreamArgument13.integerState0206 = integerArgument6 >> 2;
        rawPcmStreamArgument13.integerState0204 = integerArgument7 >> 2;
        rawPcmStreamArgument13.integerState0203 = integerArgument4 << 8;
        return integerArgument5 >> 1;
    }

    private final boolean computeBoolean0509() {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        integerLocal1 = this.integerState0197;
        if (integerLocal1 != -2147483648) {
          integerLocal2 = RawPcmStream.computeInteger0501(integerLocal1, this.integerState0205);
          integerLocal3 = RawPcmStream.computeInteger0496(integerLocal1, this.integerState0205);
        } else {
          integerLocal3 = 0;
          integerLocal2 = 0;
          integerLocal1 = 0;
        }
        if (this.integerState0195 == integerLocal1 &&
          this.integerState0206 == integerLocal2 &&
          this.integerState0204 == integerLocal3) {
          if (this.integerState0197 != -2147483648) {
            this.performAction0506();
            return false;
          }
          this.integerState0197 = 0;
          this.integerState0204 = 0;
          this.integerState0206 = 0;
          this.integerState0195 = 0;
          this.performAction0161((byte) 101);
          return true;
        }
        if (this.integerState0195 >= integerLocal1) {
          if (this.integerState0195 <= integerLocal1) {
            this.integerState0198 = 0;
          } else {
            this.integerState0198 = -1;
            this.integerState0200 = this.integerState0195 - integerLocal1;
          }
        } else {
          this.integerState0198 = 1;
          this.integerState0200 = integerLocal1 - this.integerState0195;
        }
        if (this.integerState0206 >= integerLocal2) {
          if (this.integerState0206 <= integerLocal2) {
            this.integerState0202 = 0;
          } else {
            this.integerState0202 = -1;
            if (this.integerState0200 == 0 ||
              this.integerState0200 > this.integerState0206 - integerLocal2) {
              this.integerState0200 = this.integerState0206 - integerLocal2;
            }
          }
        } else {
          this.integerState0202 = 1;
          if (this.integerState0200 == 0 ||
            this.integerState0200 > integerLocal2 - this.integerState0206) {
            this.integerState0200 = integerLocal2 - this.integerState0206;
          }
        }
        if (this.integerState0204 < integerLocal3) {
          this.integerState0196 = 1;
          if (this.integerState0200 != 0 &&
            this.integerState0200 <= integerLocal3 - this.integerState0204) {
            return false;
          }
          this.integerState0200 = integerLocal3 - this.integerState0204;
          return false;
        }
        if (this.integerState0204 <= integerLocal3) {
          this.integerState0196 = 0;
        } else {
          this.integerState0196 = -1;
          if (this.integerState0200 == 0 ||
            this.integerState0200 > this.integerState0204 - integerLocal3) {
            this.integerState0200 = this.integerState0204 - integerLocal3;
          }
        }
        return false;
    }

    final synchronized void performAction0508(int integerArgument1, int integerArgument2) {
        this.integerState0193 = integerArgument1;
        this.integerState0194 = integerArgument2;
    }

    private final static int computeInteger0478(byte[] byteArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, RawPcmStream rawPcmStreamArgument10) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument3 = integerArgument3 >> 8;
        integerArgument9 = integerArgument9 >> 8;
        integerArgument5 = integerArgument5 << 2;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument4 + integerArgument3 - (integerArgument9 - 1);
        if (integerArgument4 + integerArgument3 - (integerArgument9 - 1) > integerArgument8) {
          integerArgument7 = integerArgument8;
        }
        rawPcmStreamArgument10.integerState0206 = rawPcmStreamArgument10.integerState0206 + rawPcmStreamArgument10.integerState0202 * (integerArgument7 - integerArgument4);
        rawPcmStreamArgument10.integerState0204 = rawPcmStreamArgument10.integerState0204 + rawPcmStreamArgument10.integerState0196 * (integerArgument7 - integerArgument4);
        integerArgument7 -= 3;
        while (integerArgument4 < integerArgument7) {
          previousIntegerLocal1 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal2 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal1] = integerArrayArgument2[previousIntegerLocal1] + byteArrayArgument1[previousIntegerLocal2] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal3 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal4 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal3] = integerArrayArgument2[previousIntegerLocal3] + byteArrayArgument1[previousIntegerLocal4] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal5 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal6 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal5] = integerArrayArgument2[previousIntegerLocal5] + byteArrayArgument1[previousIntegerLocal6] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal7 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal8 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal7] = integerArrayArgument2[previousIntegerLocal7] + byteArrayArgument1[previousIntegerLocal8] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
        }
        integerArgument7 += 3;
        while (integerArgument4 < integerArgument7) {
          previousIntegerLocal9 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal10 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal9] = integerArrayArgument2[previousIntegerLocal9] + byteArrayArgument1[previousIntegerLocal10] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
        }
        rawPcmStreamArgument10.integerState0195 = integerArgument5 >> 2;
        rawPcmStreamArgument10.integerState0203 = integerArgument3 << 8;
        return integerArgument4;
    }

    private final static int computeInteger0472(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, RawPcmStream rawPcmStreamArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 257) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13 - 257) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument6 = integerArgument6 << 1;
        integerArgument9 = integerArgument9 << 1;
        while (integerArgument6 < integerArgument9) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2];
          integerArgument1 = (integerArgument1 << 8) + (byteArrayArgument3[integerArgument2 + 1] - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (integerArgument1 * integerArgument7 >> 6);
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        if (integerArgument13 != 0) {
          integerArgument9 = (integerArgument6 >> 1) + (integerArgument11 - integerArgument5 + integerArgument13 - 1) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          (integerArgument6 >> 1) + (integerArgument11 - integerArgument5 + integerArgument13 - 1) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument9 = integerArgument9 << 1;
        integerArgument2 = integerArgument14;
        while (integerArgument6 < integerArgument9) {
          integerArgument1 = byteArrayArgument3[integerArgument5 >> 8];
          integerArgument1 = (integerArgument1 << 8) + (integerArgument2 - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal3 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal3] = integerArrayArgument4[previousIntegerLocal3] + (integerArgument1 * integerArgument7 >> 6);
          previousIntegerLocal4 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal4] = integerArrayArgument4[previousIntegerLocal4] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        rawPcmStreamArgument12.integerState0203 = integerArgument5;
        return integerArgument6 >> 1;
    }

    private final static int computeInteger0490(byte[] byteArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, RawPcmStream rawPcmStreamArgument10) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument3 = integerArgument3 >> 8;
        integerArgument9 = integerArgument9 >> 8;
        integerArgument5 = integerArgument5 << 2;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument4 + integerArgument9 - integerArgument3;
        if (integerArgument4 + integerArgument9 - integerArgument3 > integerArgument8) {
          integerArgument7 = integerArgument8;
        }
        rawPcmStreamArgument10.integerState0206 = rawPcmStreamArgument10.integerState0206 + rawPcmStreamArgument10.integerState0202 * (integerArgument7 - integerArgument4);
        rawPcmStreamArgument10.integerState0204 = rawPcmStreamArgument10.integerState0204 + rawPcmStreamArgument10.integerState0196 * (integerArgument7 - integerArgument4);
        integerArgument7 -= 3;
        while (integerArgument4 < integerArgument7) {
          previousIntegerLocal1 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal2 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal1] = integerArrayArgument2[previousIntegerLocal1] + byteArrayArgument1[previousIntegerLocal2] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal3 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal4 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal3] = integerArrayArgument2[previousIntegerLocal3] + byteArrayArgument1[previousIntegerLocal4] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal5 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal6 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal5] = integerArrayArgument2[previousIntegerLocal5] + byteArrayArgument1[previousIntegerLocal6] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
          previousIntegerLocal7 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal8 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal7] = integerArrayArgument2[previousIntegerLocal7] + byteArrayArgument1[previousIntegerLocal8] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
        }
        integerArgument7 += 3;
        while (integerArgument4 < integerArgument7) {
          previousIntegerLocal9 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal10 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal9] = integerArrayArgument2[previousIntegerLocal9] + byteArrayArgument1[previousIntegerLocal10] * integerArgument5;
          integerArgument5 = integerArgument5 + integerArgument6;
        }
        rawPcmStreamArgument10.integerState0195 = integerArgument5 >> 2;
        rawPcmStreamArgument10.integerState0203 = integerArgument3 << 8;
        return integerArgument4;
    }

    final synchronized void performAction0470(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.performAction0483(integerArgument1, integerArgument2 << 6, integerArgument3 << 6);
    }

    private final static int computeInteger0496(int integerArgument1, int integerArgument2) {
        return integerArgument2 < 0 ? -integerArgument1 : (int)((double)integerArgument1 * Math.sqrt((double)integerArgument2 * 0.0001220703125) + 0.5);
    }

    final static RawPcmStream computeRawPcmStream0489(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (rawSoundArgument1.byteArrayState0028 == null) {
          return null;
        }
        if (rawSoundArgument1.byteArrayState0028.length != 0) {
          return new RawPcmStream(rawSoundArgument1, integerArgument2, integerArgument3 << 6, integerArgument4 << 6);
        }
        return null;
    }

    private final static int computeInteger0479(byte[] byteArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, RawPcmStream rawPcmStreamArgument9) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument3 = integerArgument3 >> 8;
        integerArgument8 = integerArgument8 >> 8;
        integerArgument5 = integerArgument5 << 2;
        integerArgument6 = integerArgument4 + integerArgument8 - integerArgument3;
        if (integerArgument4 + integerArgument8 - integerArgument3 > integerArgument7) {
          integerArgument6 = integerArgument7;
        }
        integerArgument6 -= 3;
        while (integerArgument4 < integerArgument6) {
          previousIntegerLocal1 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal2 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal1] = integerArrayArgument2[previousIntegerLocal1] + byteArrayArgument1[previousIntegerLocal2] * integerArgument5;
          previousIntegerLocal3 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal4 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal3] = integerArrayArgument2[previousIntegerLocal3] + byteArrayArgument1[previousIntegerLocal4] * integerArgument5;
          previousIntegerLocal5 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal6 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal5] = integerArrayArgument2[previousIntegerLocal5] + byteArrayArgument1[previousIntegerLocal6] * integerArgument5;
          previousIntegerLocal7 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal8 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal7] = integerArrayArgument2[previousIntegerLocal7] + byteArrayArgument1[previousIntegerLocal8] * integerArgument5;
        }
        integerArgument6 += 3;
        while (integerArgument4 < integerArgument6) {
          previousIntegerLocal9 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal10 = integerArgument3;
          integerArgument3++;
          integerArrayArgument2[previousIntegerLocal9] = integerArrayArgument2[previousIntegerLocal9] + byteArrayArgument1[previousIntegerLocal10] * integerArgument5;
        }
        rawPcmStreamArgument9.integerState0203 = integerArgument3 << 8;
        return integerArgument4;
    }

    private final void performAction0506() {
        this.integerState0195 = this.integerState0197;
        this.integerState0206 = RawPcmStream.computeInteger0501(this.integerState0197, this.integerState0205);
        this.integerState0204 = RawPcmStream.computeInteger0496(this.integerState0197, this.integerState0205);
    }

    private final static int computeInteger0475(int integerArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RawPcmStream rawPcmStreamArgument11) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument4 = integerArgument4 >> 8;
        integerArgument10 = integerArgument10 >> 8;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument7 << 2;
        integerArgument8 = integerArgument5 + integerArgument4 - (integerArgument10 - 1);
        if (integerArgument5 + integerArgument4 - (integerArgument10 - 1) > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        integerArgument5 = integerArgument5 << 1;
        integerArgument8 = integerArgument8 << 1;
        integerArgument8 -= 6;
        while (integerArgument5 < integerArgument8) {
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal1 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal1] = integerArrayArgument3[previousIntegerLocal1] + integerArgument1 * integerArgument6;
          previousIntegerLocal2 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal2] = integerArrayArgument3[previousIntegerLocal2] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal3 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal3] = integerArrayArgument3[previousIntegerLocal3] + integerArgument1 * integerArgument6;
          previousIntegerLocal4 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal4] = integerArrayArgument3[previousIntegerLocal4] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal5 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal5] = integerArrayArgument3[previousIntegerLocal5] + integerArgument1 * integerArgument6;
          previousIntegerLocal6 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal6] = integerArrayArgument3[previousIntegerLocal6] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal7 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal7] = integerArrayArgument3[previousIntegerLocal7] + integerArgument1 * integerArgument6;
          previousIntegerLocal8 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal8] = integerArrayArgument3[previousIntegerLocal8] + integerArgument1 * integerArgument7;
        }
        integerArgument8 += 6;
        while (integerArgument5 < integerArgument8) {
          integerArgument1 = byteArrayArgument2[integerArgument4--];
          previousIntegerLocal9 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal9] = integerArrayArgument3[previousIntegerLocal9] + integerArgument1 * integerArgument6;
          previousIntegerLocal10 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal10] = integerArrayArgument3[previousIntegerLocal10] + integerArgument1 * integerArgument7;
        }
        rawPcmStreamArgument11.integerState0203 = integerArgument4 << 8;
        return integerArgument5 >> 1;
    }

    private final static int computeInteger0471(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, RawPcmStream rawPcmStreamArgument14, int integerArgument15, int integerArgument16) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        rawPcmStreamArgument14.integerState0195 = rawPcmStreamArgument14.integerState0195 - rawPcmStreamArgument14.integerState0198 * integerArgument6;
        if (integerArgument15 != 0) {
          integerArgument11 = integerArgument6 + (integerArgument13 - integerArgument5 + integerArgument15 - 257) / integerArgument15;
        }
        if (integerArgument15 == 0 ||
          integerArgument6 + (integerArgument13 - integerArgument5 + integerArgument15 - 257) / integerArgument15 > integerArgument12) {
          integerArgument11 = integerArgument12;
        }
        integerArgument6 = integerArgument6 << 1;
        integerArgument11 = integerArgument11 << 1;
        while (integerArgument6 < integerArgument11) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2];
          integerArgument1 = (integerArgument1 << 8) + (byteArrayArgument3[integerArgument2 + 1] - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (integerArgument1 * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument9;
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument8 = integerArgument8 + integerArgument10;
          integerArgument5 = integerArgument5 + integerArgument15;
        }
        if (integerArgument15 != 0) {
          integerArgument11 = (integerArgument6 >> 1) + (integerArgument13 - integerArgument5 + integerArgument15 - 1) / integerArgument15;
        }
        if (integerArgument15 == 0 ||
          (integerArgument6 >> 1) + (integerArgument13 - integerArgument5 + integerArgument15 - 1) / integerArgument15 > integerArgument12) {
          integerArgument11 = integerArgument12;
        }
        integerArgument11 = integerArgument11 << 1;
        integerArgument2 = integerArgument16;
        while (integerArgument6 < integerArgument11) {
          integerArgument1 = byteArrayArgument3[integerArgument5 >> 8];
          integerArgument1 = (integerArgument1 << 8) + (integerArgument2 - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal3 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal3] = integerArrayArgument4[previousIntegerLocal3] + (integerArgument1 * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument9;
          previousIntegerLocal4 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal4] = integerArrayArgument4[previousIntegerLocal4] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument8 = integerArgument8 + integerArgument10;
          integerArgument5 = integerArgument5 + integerArgument15;
        }
        integerArgument6 = integerArgument6 >> 1;
        rawPcmStreamArgument14.integerState0195 = rawPcmStreamArgument14.integerState0195 + rawPcmStreamArgument14.integerState0198 * integerArgument6;
        rawPcmStreamArgument14.integerState0206 = integerArgument7;
        rawPcmStreamArgument14.integerState0204 = integerArgument8;
        rawPcmStreamArgument14.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    final synchronized void performAction0500(int integerArgument1) {
        if (this.integerState0199 < 0) {
          this.integerState0199 = -integerArgument1;
        } else {
          this.integerState0199 = integerArgument1;
        }
    }

    private final synchronized void performAction0495(int integerArgument1) {
        this.performAction0482(integerArgument1, this.computeInteger0511());
    }

    final synchronized void performAction0483(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        if (integerArgument1 == 0) {
          this.performAction0482(integerArgument2, integerArgument3);
          return;
        }
        int integerLocal3 = RawPcmStream.computeInteger0501(integerArgument2, integerArgument3);
        int integerLocal4 = RawPcmStream.computeInteger0496(integerArgument2, integerArgument3);
        if (this.integerState0206 != integerLocal3) {
          integerLocal1 = integerArgument2 - this.integerState0195;
          if (this.integerState0195 - integerArgument2 > integerLocal1) {
            integerLocal1 = this.integerState0195 - integerArgument2;
          }
          if (integerLocal3 - this.integerState0206 > integerLocal1) {
            integerLocal1 = integerLocal3 - this.integerState0206;
          }
          if (this.integerState0206 - integerLocal3 > integerLocal1) {
            integerLocal1 = this.integerState0206 - integerLocal3;
          }
          if (integerLocal4 - this.integerState0204 > integerLocal1) {
            integerLocal1 = integerLocal4 - this.integerState0204;
          }
          if (this.integerState0204 - integerLocal4 > integerLocal1) {
            integerLocal1 = this.integerState0204 - integerLocal4;
          }
          if (integerArgument1 > integerLocal1) {
            integerArgument1 = integerLocal1;
          }
          this.integerState0200 = integerArgument1;
          this.integerState0197 = integerArgument2;
          this.integerState0205 = integerArgument3;
          this.integerState0198 = (integerArgument2 - this.integerState0195) / integerArgument1;
          this.integerState0202 = (integerLocal3 - this.integerState0206) / integerArgument1;
          this.integerState0196 = (integerLocal4 - this.integerState0204) / integerArgument1;
          return;
        }
        if (this.integerState0204 != integerLocal4) {
          integerLocal2 = integerArgument2 - this.integerState0195;
          if (this.integerState0195 - integerArgument2 > integerLocal2) {
            integerLocal2 = this.integerState0195 - integerArgument2;
          }
          if (integerLocal3 - this.integerState0206 > integerLocal2) {
            integerLocal2 = integerLocal3 - this.integerState0206;
          }
          if (this.integerState0206 - integerLocal3 > integerLocal2) {
            integerLocal2 = this.integerState0206 - integerLocal3;
          }
          if (integerLocal4 - this.integerState0204 > integerLocal2) {
            integerLocal2 = integerLocal4 - this.integerState0204;
          }
          if (this.integerState0204 - integerLocal4 > integerLocal2) {
            integerLocal2 = this.integerState0204 - integerLocal4;
          }
          if (integerArgument1 > integerLocal2) {
            integerArgument1 = integerLocal2;
          }
          this.integerState0200 = integerArgument1;
          this.integerState0197 = integerArgument2;
          this.integerState0205 = integerArgument3;
          this.integerState0198 = (integerArgument2 - this.integerState0195) / integerArgument1;
          this.integerState0202 = (integerLocal3 - this.integerState0206) / integerArgument1;
          this.integerState0196 = (integerLocal4 - this.integerState0204) / integerArgument1;
          return;
        }
        this.integerState0200 = 0;
    }

    private final static int computeInteger0485(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, RawPcmStream rawPcmStreamArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        rawPcmStreamArgument12.integerState0206 = rawPcmStreamArgument12.integerState0206 - rawPcmStreamArgument12.integerState0202 * integerArgument6;
        rawPcmStreamArgument12.integerState0204 = rawPcmStreamArgument12.integerState0204 - rawPcmStreamArgument12.integerState0196 * integerArgument6;
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 + 256 - integerArgument5 + integerArgument13) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 + 256 - integerArgument5 + integerArgument13) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        while (integerArgument6 < integerArgument9) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2 - 1];
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument2] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument8;
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 - integerArgument5 + integerArgument13) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument1 = integerArgument14;
        integerArgument2 = integerArgument13;
        while (integerArgument6 < integerArgument9) {
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (((integerArgument1 << 8) + (byteArrayArgument3[integerArgument5 >> 8] - integerArgument1) * (integerArgument5 & 255)) * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument8;
          integerArgument5 = integerArgument5 + integerArgument2;
        }
        rawPcmStreamArgument12.integerState0206 = rawPcmStreamArgument12.integerState0206 + rawPcmStreamArgument12.integerState0202 * integerArgument6;
        rawPcmStreamArgument12.integerState0204 = rawPcmStreamArgument12.integerState0204 + rawPcmStreamArgument12.integerState0196 * integerArgument6;
        rawPcmStreamArgument12.integerState0195 = integerArgument7;
        rawPcmStreamArgument12.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    final synchronized void performAction0505(int integerArgument1, int integerArgument2) {
        this.performAction0483(integerArgument1, integerArgument2, this.computeInteger0511());
    }

    final int computeInteger0468() {
        if (this.integerState0197 == 0 &&
          this.integerState0200 == 0) {
          return 0;
        }
        return 1;
    }

    private final static int computeInteger0502(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, RawPcmStream rawPcmStreamArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        if (integerArgument13 != 0) {
          integerArgument9 = integerArgument6 + (integerArgument11 + 256 - integerArgument5 + integerArgument13) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          integerArgument6 + (integerArgument11 + 256 - integerArgument5 + integerArgument13) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument6 = integerArgument6 << 1;
        integerArgument9 = integerArgument9 << 1;
        while (integerArgument6 < integerArgument9) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2 - 1];
          integerArgument1 = (integerArgument1 << 8) + (byteArrayArgument3[integerArgument2] - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (integerArgument1 * integerArgument7 >> 6);
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        if (integerArgument13 != 0) {
          integerArgument9 = (integerArgument6 >> 1) + (integerArgument11 - integerArgument5 + integerArgument13) / integerArgument13;
        }
        if (integerArgument13 == 0 ||
          (integerArgument6 >> 1) + (integerArgument11 - integerArgument5 + integerArgument13) / integerArgument13 > integerArgument10) {
          integerArgument9 = integerArgument10;
        }
        integerArgument9 = integerArgument9 << 1;
        integerArgument2 = integerArgument14;
        while (integerArgument6 < integerArgument9) {
          integerArgument1 = (integerArgument2 << 8) + (byteArrayArgument3[integerArgument5 >> 8] - integerArgument2) * (integerArgument5 & 255);
          previousIntegerLocal3 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal3] = integerArrayArgument4[previousIntegerLocal3] + (integerArgument1 * integerArgument7 >> 6);
          previousIntegerLocal4 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal4] = integerArrayArgument4[previousIntegerLocal4] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument5 = integerArgument5 + integerArgument13;
        }
        rawPcmStreamArgument12.integerState0203 = integerArgument5;
        return integerArgument6 >> 1;
    }

    private final static int computeInteger0501(int integerArgument1, int integerArgument2) {
        return integerArgument2 < 0 ? integerArgument1 : (int)((double)integerArgument1 * Math.sqrt((double)(16384 - integerArgument2) * 0.0001220703125) + 0.5);
    }

    final int computeInteger0481() {
        int integerLocal1 = this.integerState0195 * 3 >> 6;
        integerLocal1 = (integerLocal1 ^ integerLocal1 >> 31) + (integerLocal1 >>> 31);
        if (this.integerState0201 == 0) {
          integerLocal1 = integerLocal1 - integerLocal1 * this.integerState0203 / (((RawSound) (this.audioSupport006State0001)).byteArrayState0028.length << 8);
        } else {
          if (this.integerState0201 >= 0) {
            integerLocal1 = integerLocal1 - integerLocal1 * this.integerState0193 / ((RawSound) (this.audioSupport006State0001)).byteArrayState0028.length;
          }
        }
        return integerLocal1 > 255 ? 255 : integerLocal1;
    }

    private final int computeInteger0493(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1;
        do {
          if (this.integerState0200 <= 0) {
            if (this.integerState0199 == 256 &&
              (this.integerState0203 & 255) == 0) {
              if (PcmPlayer.booleanState0038) {
                return RawPcmStream.computeInteger0488(0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, 0, integerArgument4, integerArgument3, this);
              }
              return RawPcmStream.computeInteger0479(((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, 0, integerArgument4, integerArgument3, this);
            }
            if (PcmPlayer.booleanState0038) {
              return RawPcmStream.computeInteger0472(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, 0, integerArgument4, integerArgument3, this, this.integerState0199, integerArgument5);
            }
            return RawPcmStream.computeInteger0486(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, 0, integerArgument4, integerArgument3, this, this.integerState0199, integerArgument5);
          }
          integerLocal1 = integerArgument2 + this.integerState0200;
          if (integerLocal1 > integerArgument4) {
            integerLocal1 = integerArgument4;
          }
          this.integerState0200 = this.integerState0200 + integerArgument2;
          if (this.integerState0199 == 256 &&
            (this.integerState0203 & 255) == 0) {
            if (!PcmPlayer.booleanState0038) {
              integerArgument2 = RawPcmStream.computeInteger0490(((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, this.integerState0198, 0, integerLocal1, integerArgument3, this);
            } else {
              integerArgument2 = RawPcmStream.computeInteger0474(0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, this.integerState0202, this.integerState0196, 0, integerLocal1, integerArgument3, this);
            }
          } else {
            if (!PcmPlayer.booleanState0038) {
              integerArgument2 = RawPcmStream.computeInteger0497(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0195, this.integerState0198, 0, integerLocal1, integerArgument3, this, this.integerState0199, integerArgument5);
            } else {
              integerArgument2 = RawPcmStream.computeInteger0471(0, 0, ((RawSound) (this.audioSupport006State0001)).byteArrayState0028, integerArrayArgument1, this.integerState0203, integerArgument2, this.integerState0206, this.integerState0204, this.integerState0202, this.integerState0196, 0, integerLocal1, integerArgument3, this, this.integerState0199, integerArgument5);
            }
          }
          this.integerState0200 = this.integerState0200 - integerArgument2;
          if (this.integerState0200 != 0) {
            return integerArgument2;
          }
        } while (!this.computeBoolean0509());
        return integerArgument4;
    }

    final synchronized void performAction0510(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        if (integerArgument1 == 0) {
          this.performAction0495(0);
          this.performAction0161((byte) 102);
          return;
        }
        if (this.integerState0206 != 0) {
          integerLocal1 = -this.integerState0195;
          if (this.integerState0195 > integerLocal1) {
            integerLocal1 = this.integerState0195;
          }
          if (-this.integerState0206 > integerLocal1) {
            integerLocal1 = -this.integerState0206;
          }
          if (this.integerState0206 > integerLocal1) {
            integerLocal1 = this.integerState0206;
          }
          if (-this.integerState0204 > integerLocal1) {
            integerLocal1 = -this.integerState0204;
          }
          if (this.integerState0204 > integerLocal1) {
            integerLocal1 = this.integerState0204;
          }
          if (integerArgument1 > integerLocal1) {
            integerArgument1 = integerLocal1;
          }
          this.integerState0200 = integerArgument1;
          this.integerState0197 = -2147483648;
          this.integerState0198 = -this.integerState0195 / integerArgument1;
          this.integerState0202 = -this.integerState0206 / integerArgument1;
          this.integerState0196 = -this.integerState0204 / integerArgument1;
          return;
        }
        if (this.integerState0204 != 0) {
          integerLocal2 = -this.integerState0195;
          if (this.integerState0195 > integerLocal2) {
            integerLocal2 = this.integerState0195;
          }
          if (-this.integerState0206 > integerLocal2) {
            integerLocal2 = -this.integerState0206;
          }
          if (this.integerState0206 > integerLocal2) {
            integerLocal2 = this.integerState0206;
          }
          if (-this.integerState0204 > integerLocal2) {
            integerLocal2 = -this.integerState0204;
          }
          if (this.integerState0204 > integerLocal2) {
            integerLocal2 = this.integerState0204;
          }
          if (integerArgument1 > integerLocal2) {
            integerArgument1 = integerLocal2;
          }
          this.integerState0200 = integerArgument1;
          this.integerState0197 = -2147483648;
          this.integerState0198 = -this.integerState0195 / integerArgument1;
          this.integerState0202 = -this.integerState0206 / integerArgument1;
          this.integerState0196 = -this.integerState0204 / integerArgument1;
          return;
        }
        this.integerState0200 = 0;
        this.integerState0197 = 0;
        this.integerState0195 = 0;
        this.performAction0161((byte) 127);
    }

    private final static int computeInteger0488(int integerArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RawPcmStream rawPcmStreamArgument11) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument4 = integerArgument4 >> 8;
        integerArgument10 = integerArgument10 >> 8;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument7 << 2;
        integerArgument8 = integerArgument5 + integerArgument10 - integerArgument4;
        if (integerArgument5 + integerArgument10 - integerArgument4 > integerArgument9) {
          integerArgument8 = integerArgument9;
        }
        integerArgument5 = integerArgument5 << 1;
        integerArgument8 = integerArgument8 << 1;
        integerArgument8 -= 6;
        while (integerArgument5 < integerArgument8) {
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal1 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal1] = integerArrayArgument3[previousIntegerLocal1] + integerArgument1 * integerArgument6;
          previousIntegerLocal2 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal2] = integerArrayArgument3[previousIntegerLocal2] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal3 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal3] = integerArrayArgument3[previousIntegerLocal3] + integerArgument1 * integerArgument6;
          previousIntegerLocal4 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal4] = integerArrayArgument3[previousIntegerLocal4] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal5 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal5] = integerArrayArgument3[previousIntegerLocal5] + integerArgument1 * integerArgument6;
          previousIntegerLocal6 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal6] = integerArrayArgument3[previousIntegerLocal6] + integerArgument1 * integerArgument7;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal7 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal7] = integerArrayArgument3[previousIntegerLocal7] + integerArgument1 * integerArgument6;
          previousIntegerLocal8 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal8] = integerArrayArgument3[previousIntegerLocal8] + integerArgument1 * integerArgument7;
        }
        integerArgument8 += 6;
        while (integerArgument5 < integerArgument8) {
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal9 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal9] = integerArrayArgument3[previousIntegerLocal9] + integerArgument1 * integerArgument6;
          previousIntegerLocal10 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal10] = integerArrayArgument3[previousIntegerLocal10] + integerArgument1 * integerArgument7;
        }
        rawPcmStreamArgument11.integerState0203 = integerArgument4 << 8;
        return integerArgument5 >> 1;
    }

    final PcmStream computePcmStream0499() {
        return null;
    }

    final synchronized void performAction0507(int integerArgument1) {
        this.integerState0201 = integerArgument1;
    }

    private final static int computeInteger0484(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, RawPcmStream rawPcmStreamArgument14, int integerArgument15, int integerArgument16) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        rawPcmStreamArgument14.integerState0195 = rawPcmStreamArgument14.integerState0195 - rawPcmStreamArgument14.integerState0198 * integerArgument6;
        if (integerArgument15 != 0) {
          integerArgument11 = integerArgument6 + (integerArgument13 + 256 - integerArgument5 + integerArgument15) / integerArgument15;
        }
        if (integerArgument15 == 0 ||
          integerArgument6 + (integerArgument13 + 256 - integerArgument5 + integerArgument15) / integerArgument15 > integerArgument12) {
          integerArgument11 = integerArgument12;
        }
        integerArgument6 = integerArgument6 << 1;
        integerArgument11 = integerArgument11 << 1;
        while (integerArgument6 < integerArgument11) {
          integerArgument2 = integerArgument5 >> 8;
          integerArgument1 = byteArrayArgument3[integerArgument2 - 1];
          integerArgument1 = (integerArgument1 << 8) + (byteArrayArgument3[integerArgument2] - integerArgument1) * (integerArgument5 & 255);
          previousIntegerLocal1 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal1] = integerArrayArgument4[previousIntegerLocal1] + (integerArgument1 * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument9;
          previousIntegerLocal2 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal2] = integerArrayArgument4[previousIntegerLocal2] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument8 = integerArgument8 + integerArgument10;
          integerArgument5 = integerArgument5 + integerArgument15;
        }
        if (integerArgument15 != 0) {
          integerArgument11 = (integerArgument6 >> 1) + (integerArgument13 - integerArgument5 + integerArgument15) / integerArgument15;
        }
        if (integerArgument15 == 0 ||
          (integerArgument6 >> 1) + (integerArgument13 - integerArgument5 + integerArgument15) / integerArgument15 > integerArgument12) {
          integerArgument11 = integerArgument12;
        }
        integerArgument11 = integerArgument11 << 1;
        integerArgument2 = integerArgument16;
        while (integerArgument6 < integerArgument11) {
          integerArgument1 = (integerArgument2 << 8) + (byteArrayArgument3[integerArgument5 >> 8] - integerArgument2) * (integerArgument5 & 255);
          previousIntegerLocal3 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal3] = integerArrayArgument4[previousIntegerLocal3] + (integerArgument1 * integerArgument7 >> 6);
          integerArgument7 = integerArgument7 + integerArgument9;
          previousIntegerLocal4 = integerArgument6;
          integerArgument6++;
          integerArrayArgument4[previousIntegerLocal4] = integerArrayArgument4[previousIntegerLocal4] + (integerArgument1 * integerArgument8 >> 6);
          integerArgument8 = integerArgument8 + integerArgument10;
          integerArgument5 = integerArgument5 + integerArgument15;
        }
        integerArgument6 = integerArgument6 >> 1;
        rawPcmStreamArgument14.integerState0195 = rawPcmStreamArgument14.integerState0195 + rawPcmStreamArgument14.integerState0198 * integerArgument6;
        rawPcmStreamArgument14.integerState0206 = integerArgument7;
        rawPcmStreamArgument14.integerState0204 = integerArgument8;
        rawPcmStreamArgument14.integerState0203 = integerArgument5;
        return integerArgument6;
    }

    final synchronized void performAction0504(int integerArgument1) {
        integerArgument1 = integerArgument1 << 8;
        int integerLocal1 = ((RawSound) (this.audioSupport006State0001)).byteArrayState0028.length << 8;
        if (integerArgument1 < -1) {
          integerArgument1 = -1;
        }
        if (integerArgument1 > integerLocal1) {
          integerArgument1 = integerLocal1;
        }
        this.integerState0203 = integerArgument1;
    }

    private final void performAction0503() {
        if (this.integerState0200 != 0) {
          if (this.integerState0197 == -2147483648) {
            this.integerState0197 = 0;
          }
          this.integerState0200 = 0;
          this.performAction0506();
          return;
        }
    }

    private final static int computeInteger0491(byte[] byteArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, RawPcmStream rawPcmStreamArgument9) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument3 = integerArgument3 >> 8;
        integerArgument8 = integerArgument8 >> 8;
        integerArgument5 = integerArgument5 << 2;
        integerArgument6 = integerArgument4 + integerArgument3 - (integerArgument8 - 1);
        if (integerArgument4 + integerArgument3 - (integerArgument8 - 1) > integerArgument7) {
          integerArgument6 = integerArgument7;
        }
        integerArgument6 -= 3;
        while (integerArgument4 < integerArgument6) {
          previousIntegerLocal1 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal2 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal1] = integerArrayArgument2[previousIntegerLocal1] + byteArrayArgument1[previousIntegerLocal2] * integerArgument5;
          previousIntegerLocal3 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal4 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal3] = integerArrayArgument2[previousIntegerLocal3] + byteArrayArgument1[previousIntegerLocal4] * integerArgument5;
          previousIntegerLocal5 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal6 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal5] = integerArrayArgument2[previousIntegerLocal5] + byteArrayArgument1[previousIntegerLocal6] * integerArgument5;
          previousIntegerLocal7 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal8 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal7] = integerArrayArgument2[previousIntegerLocal7] + byteArrayArgument1[previousIntegerLocal8] * integerArgument5;
        }
        integerArgument6 += 3;
        while (integerArgument4 < integerArgument6) {
          previousIntegerLocal9 = integerArgument4;
          integerArgument4++;
          previousIntegerLocal10 = integerArgument3;
          integerArgument3--;
          integerArrayArgument2[previousIntegerLocal9] = integerArrayArgument2[previousIntegerLocal9] + byteArrayArgument1[previousIntegerLocal10] * integerArgument5;
        }
        rawPcmStreamArgument9.integerState0203 = integerArgument3 << 8;
        return integerArgument4;
    }

    final synchronized void performAction0469(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        RawSound rawSoundLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        if (this.integerState0200 > 0) {
          if (integerArgument1 < this.integerState0200) {
            this.integerState0195 = this.integerState0195 + this.integerState0198 * integerArgument1;
            this.integerState0206 = this.integerState0206 + this.integerState0202 * integerArgument1;
            this.integerState0204 = this.integerState0204 + this.integerState0196 * integerArgument1;
            this.integerState0200 = this.integerState0200 - integerArgument1;
          } else {
            if (this.integerState0197 == -2147483648) {
              this.integerState0197 = 0;
              this.integerState0204 = 0;
              this.integerState0206 = 0;
              this.integerState0195 = 0;
              this.performAction0161((byte) 125);
              integerArgument1 = this.integerState0200;
            }
            this.integerState0200 = 0;
            this.performAction0506();
          }
        }
        rawSoundLocal4 = (RawSound) (this.audioSupport006State0001);
        integerLocal5 = this.integerState0193 << 8;
        integerLocal6 = this.integerState0194 << 8;
        integerLocal7 = rawSoundLocal4.byteArrayState0028.length << 8;
        integerLocal8 = integerLocal6 - integerLocal5;
        if (integerLocal8 <= 0) {
          this.integerState0201 = 0;
        }
        if (this.integerState0203 < 0) {
          if (this.integerState0199 <= 0) {
            this.performAction0503();
            this.performAction0161((byte) 123);
            return;
          }
          this.integerState0203 = 0;
        }
        if (this.integerState0203 >= integerLocal7) {
          if (this.integerState0199 >= 0) {
            this.performAction0503();
            this.performAction0161((byte) 119);
            return;
          }
          this.integerState0203 = integerLocal7 - 1;
        }
        this.integerState0203 = this.integerState0203 + this.integerState0199 * integerArgument1;
        if (this.integerState0201 < 0) {
          if (!this.booleanState0033) {
            if (this.integerState0199 >= 0) {
              if (this.integerState0203 < integerLocal6) {
                return;
              }
              this.integerState0203 = integerLocal5 + (this.integerState0203 - integerLocal5) % integerLocal8;
              return;
            }
            if (this.integerState0203 >= integerLocal5) {
              return;
            }
            this.integerState0203 = integerLocal6 - 1 - (integerLocal6 - 1 - this.integerState0203) % integerLocal8;
            return;
          }
          if (this.integerState0199 < 0) {
            if (this.integerState0203 >= integerLocal5) {
              return;
            }
            this.integerState0203 = integerLocal5 + integerLocal5 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
          }
          while (this.integerState0203 >= integerLocal6) {
            this.integerState0203 = integerLocal6 + integerLocal6 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
            if (this.integerState0203 >= integerLocal5) {
              return;
            }
            this.integerState0203 = integerLocal5 + integerLocal5 - 1 - this.integerState0203;
            this.integerState0199 = -this.integerState0199;
          }
          return;
        }
        boolean frameRemainderLocal10 = true;
        if (this.integerState0201 > 0) {
          if (!this.booleanState0033) {
            if (this.integerState0199 >= 0) {
              if (this.integerState0203 < integerLocal6) {
                return;
              }
              integerLocal9 = (this.integerState0203 - integerLocal5) / integerLocal8;
              if (integerLocal9 >= this.integerState0201) {
                this.integerState0203 = this.integerState0203 - integerLocal8 * this.integerState0201;
                this.integerState0201 = 0;
                frameRemainderLocal10 = false;
              }
              else {
                this.integerState0203 = this.integerState0203 - integerLocal8 * integerLocal9;
                this.integerState0201 = this.integerState0201 - integerLocal9;
              }
            } else {
              if (this.integerState0203 >= integerLocal5) {
                return;
              }
              integerLocal9 = (integerLocal6 - 1 - this.integerState0203) / integerLocal8;
              if (integerLocal9 >= this.integerState0201) {
                this.integerState0203 = this.integerState0203 + integerLocal8 * this.integerState0201;
                this.integerState0201 = 0;
                frameRemainderLocal10 = false;
              }
              else {
                this.integerState0203 = this.integerState0203 + integerLocal8 * integerLocal9;
                this.integerState0201 = this.integerState0201 - integerLocal9;
              }
            }
            if (frameRemainderLocal10) {
              return;
            }
          }
          if (frameRemainderLocal10) {
            if (this.integerState0199 < 0) {
              if (this.integerState0203 >= integerLocal5) {
                return;
              }
              this.integerState0203 = integerLocal5 + integerLocal5 - 1 - this.integerState0203;
              this.integerState0199 = -this.integerState0199;
              integerLocal1 = this.integerState0201 - 1;
              this.integerState0201 = this.integerState0201 - 1;
              frameRemainderLocal10 = (integerLocal1 != 0);
            }
            if (frameRemainderLocal10) {
              do {
                if (this.integerState0203 < integerLocal6) {
                  return;
                }
                this.integerState0203 = integerLocal6 + integerLocal6 - 1 - this.integerState0203;
                this.integerState0199 = -this.integerState0199;
                integerLocal2 = this.integerState0201 - 1;
                this.integerState0201 = this.integerState0201 - 1;
                if (integerLocal2 == 0) {
                  break;
                }
                if (this.integerState0203 >= integerLocal5) {
                  return;
                }
                this.integerState0203 = integerLocal5 + integerLocal5 - 1 - this.integerState0203;
                this.integerState0199 = -this.integerState0199;
                integerLocal3 = this.integerState0201 - 1;
                this.integerState0201 = this.integerState0201 - 1;
              } while (integerLocal3 != 0);
            }
          }
        }
        if (this.integerState0199 >= 0) {
          if (this.integerState0203 >= integerLocal7) {
            this.integerState0203 = integerLocal7;
            this.performAction0503();
            this.performAction0161((byte) 122);
          }
          return;
        }
        if (this.integerState0203 >= 0) {
          return;
        }
        this.integerState0203 = -1;
        this.performAction0503();
        this.performAction0161((byte) 105);
    }

    private final static int computeInteger0474(int integerArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, RawPcmStream rawPcmStreamArgument13) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        integerArgument4 = integerArgument4 >> 8;
        integerArgument12 = integerArgument12 >> 8;
        integerArgument6 = integerArgument6 << 2;
        integerArgument7 = integerArgument7 << 2;
        integerArgument8 = integerArgument8 << 2;
        integerArgument9 = integerArgument9 << 2;
        integerArgument10 = integerArgument5 + integerArgument12 - integerArgument4;
        if (integerArgument5 + integerArgument12 - integerArgument4 > integerArgument11) {
          integerArgument10 = integerArgument11;
        }
        rawPcmStreamArgument13.integerState0195 = rawPcmStreamArgument13.integerState0195 + rawPcmStreamArgument13.integerState0198 * (integerArgument10 - integerArgument5);
        integerArgument5 = integerArgument5 << 1;
        integerArgument10 = integerArgument10 << 1;
        integerArgument10 -= 6;
        while (integerArgument5 < integerArgument10) {
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal1 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal1] = integerArrayArgument3[previousIntegerLocal1] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal2 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal2] = integerArrayArgument3[previousIntegerLocal2] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal3 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal3] = integerArrayArgument3[previousIntegerLocal3] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal4 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal4] = integerArrayArgument3[previousIntegerLocal4] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal5 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal5] = integerArrayArgument3[previousIntegerLocal5] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal6 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal6] = integerArrayArgument3[previousIntegerLocal6] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal7 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal7] = integerArrayArgument3[previousIntegerLocal7] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal8 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal8] = integerArrayArgument3[previousIntegerLocal8] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
        }
        integerArgument10 += 6;
        while (integerArgument5 < integerArgument10) {
          integerArgument1 = byteArrayArgument2[integerArgument4++];
          previousIntegerLocal9 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal9] = integerArrayArgument3[previousIntegerLocal9] + integerArgument1 * integerArgument6;
          integerArgument6 = integerArgument6 + integerArgument8;
          previousIntegerLocal10 = integerArgument5;
          integerArgument5++;
          integerArrayArgument3[previousIntegerLocal10] = integerArrayArgument3[previousIntegerLocal10] + integerArgument1 * integerArgument7;
          integerArgument7 = integerArgument7 + integerArgument9;
        }
        rawPcmStreamArgument13.integerState0206 = integerArgument6 >> 2;
        rawPcmStreamArgument13.integerState0204 = integerArgument7 >> 2;
        rawPcmStreamArgument13.integerState0203 = integerArgument4 << 8;
        return integerArgument5 >> 1;
    }

    private RawPcmStream(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.audioSupport006State0001 = (AudioSupport006) ((Object) rawSoundArgument1);
        this.integerState0193 = rawSoundArgument1.integerState0795;
        this.integerState0194 = rawSoundArgument1.integerState0796;
        this.booleanState0033 = rawSoundArgument1.booleanState0192;
        this.integerState0199 = integerArgument2;
        this.integerState0197 = integerArgument3;
        this.integerState0205 = integerArgument4;
        this.integerState0203 = 0;
        this.performAction0506();
    }
}
