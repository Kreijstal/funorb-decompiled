/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayer {
    private long longState0012;
    private int integerState0208;
    int[] integerArrayState0041;
    static int integerState0209;
    private PcmStream pcmStreamState0001;
    static boolean booleanState0038;
    private boolean booleanState0039;
    private static AudioSupport004 audioSupport004State0001;
    private boolean booleanState0040;
    private PcmStream[] pcmStreamArrayState0001;
    private PcmStream[] pcmStreamArrayState0002;
    private int integerState0210;
    private int integerState0211;
    private int integerState0212;
    private long longState0013;
    private static int integerState0213;
    private int integerState0214;
    private long longState0014;
    private int integerState0215;
    private int integerState0216;
    private int integerState0217;

    void performAction0534() throws Exception {
    }

    final synchronized void performAction0541() {
        try {
          Throwable caughtExceptionLocal1 = null;
          long longLocal2 = 0L;
          Exception exceptionLocal3 = null;
          int integerLocal4 = 0;
          int integerLocal5 = 0;
          if (this.booleanState0039) {
            return;
          }
          longLocal2 = MixedSupport063.computeLong0827(4);
          try {
            if (longLocal2 > this.longState0012 + 6000L) {
              this.longState0012 = longLocal2 - 6000L;
            }
            while (longLocal2 > this.longState0012 + 5000L) {
              this.performAction0535(256);
              this.longState0012 = this.longState0012 + (long)(256000 / integerState0209);
              longLocal2 = MixedSupport063.computeLong0827(4);
            }
          } catch (java.lang.Exception caughtParameterLocal6) {
            caughtExceptionLocal1 = caughtParameterLocal6;
            exceptionLocal3 = (Exception) (Object) caughtExceptionLocal1;
            this.longState0012 = longLocal2;
          }
          if (this.integerArrayState0041 == null) {
            return;
          }
          try {
            if (this.longState0014 != 0L) {
              if (longLocal2 < this.longState0014) {
                return;
              }
              this.performAction0527(this.integerState0215);
              this.longState0014 = 0L;
              this.booleanState0040 = true;
            }
            integerLocal4 = this.computeInteger0537();
            if (this.integerState0216 - integerLocal4 > this.integerState0212) {
              this.integerState0212 = this.integerState0216 - integerLocal4;
            }
            integerLocal5 = this.integerState0214 + this.integerState0217;
            if (integerLocal5 + 256 > 16384) {
              integerLocal5 = 16128;
            }
            if (integerLocal5 + 256 > this.integerState0215) {
              this.integerState0215 = this.integerState0215 + 1024;
              if (this.integerState0215 > 16384) {
                this.integerState0215 = 16384;
              }
              this.performAction0538();
              this.performAction0527(this.integerState0215);
              integerLocal4 = 0;
              this.booleanState0040 = true;
              if (integerLocal5 + 256 > this.integerState0215) {
                integerLocal5 = this.integerState0215 - 256;
                this.integerState0217 = integerLocal5 - this.integerState0214;
              }
            }
            while (integerLocal4 < integerLocal5) {
              this.performAction0533(this.integerArrayState0041, 256);
              this.performAction0534();
              integerLocal4 += 256;
            }
            if (longLocal2 > this.longState0013) {
              if (this.booleanState0040) {
                this.booleanState0040 = false;
              } else {
                if (this.integerState0212 == 0 &&
                  this.integerState0211 == 0) {
                  this.performAction0538();
                  this.longState0014 = longLocal2 + 2000L;
                  return;
                }
                this.integerState0217 = Math.min(this.integerState0211, this.integerState0212);
                this.integerState0211 = this.integerState0212;
              }
              this.integerState0212 = 0;
              this.longState0013 = longLocal2 + 2000L;
            }
            this.integerState0216 = integerLocal4;
          } catch (java.lang.Exception caughtParameterLocal7) {
            caughtExceptionLocal1 = caughtParameterLocal7;
            exceptionLocal3 = (Exception) (Object) caughtExceptionLocal1;
            this.performAction0538();
            this.longState0014 = longLocal2 + 2000L;
          }
          return;
        } catch (RuntimeException | Error uncheckedExceptionLocal8) {
          throw uncheckedExceptionLocal8;
        } catch (Throwable checkedExceptionLocal9) {
          throw new RuntimeException(checkedExceptionLocal9);
        }
    }

    void performAction0542() throws Exception {
    }

    void performAction0527(int integerArgument1) throws Exception {
    }

    final static PcmPlayer computePcmPlayer0529(PlatformService platformServiceArgument1, java.awt.Component componentArgument2, int integerArgument3, int integerArgument4) {
        try {
          JavaSoundPcmPlayer javaSoundPcmPlayerLocal1 = null;
          Throwable throwableLocal2 = null;
          JavaSoundPcmPlayer javaSoundPcmPlayerLocal3 = null;
          JavaSoundPcmPlayer stackJavaSoundPcmPlayerLocal4 = null;
          int stackIntegerLocal5 = 0;
          int stackIntegerLocal6 = 0;
          JavaSoundPcmPlayer stackJavaSoundPcmPlayerLocal7 = null;
          Throwable caughtExceptionLocal8 = null;
          if (integerState0209 == 0) {
            throw new IllegalStateException();
          }
          if (integerArgument3 >= 0 &&
            integerArgument3 < 2) {
            if (integerArgument4 < 256) {
              integerArgument4 = 256;
            }
            try {
              javaSoundPcmPlayerLocal3 = new JavaSoundPcmPlayer();
              javaSoundPcmPlayerLocal1 = javaSoundPcmPlayerLocal3;
              stackJavaSoundPcmPlayerLocal4 = javaSoundPcmPlayerLocal1;
              stackIntegerLocal5 = 256;
              if (!booleanState0038) {
                stackIntegerLocal6 = 1;
              } else {
                stackIntegerLocal6 = 2;
              }
              ((PcmPlayer) ((Object) stackJavaSoundPcmPlayerLocal4)).integerArrayState0041 = new int[stackIntegerLocal5 * stackIntegerLocal6];
              ((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).integerState0214 = integerArgument4;
              ((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).performAction0530(componentArgument2);
              ((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).integerState0215 = (integerArgument4 & -1024) + 1024;
              if (((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).integerState0215 > 16384) {
                ((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).integerState0215 = 16384;
              }
              ((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).performAction0527(((PcmPlayer) ((Object) javaSoundPcmPlayerLocal1)).integerState0215);
              if (integerState0213 > 0 &&
                audioSupport004State0001 == null) {
                audioSupport004State0001 = new AudioSupport004();
                audioSupport004State0001.platformServiceState0007 = platformServiceArgument1;
                platformServiceArgument1.computeAsyncTask0563((byte) 122, integerState0213, (Runnable) ((Object) audioSupport004State0001));
              }
              if (audioSupport004State0001 != null) {
                if (audioSupport004State0001.pcmPlayerArrayState0001[integerArgument3] != null) {
                  throw new IllegalArgumentException();
                }
                audioSupport004State0001.pcmPlayerArrayState0001[integerArgument3] = (PcmPlayer) ((Object) javaSoundPcmPlayerLocal3);
              }
              stackJavaSoundPcmPlayerLocal7 = javaSoundPcmPlayerLocal1;
              return (PcmPlayer) ((Object) stackJavaSoundPcmPlayerLocal7);
            } catch (java.lang.Throwable caughtParameterLocal9) {
              caughtExceptionLocal8 = caughtParameterLocal9;
              throwableLocal2 = caughtExceptionLocal8;
              return new PcmPlayer();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    public static void performAction0540() {
        audioSupport004State0001 = null;
    }

    final synchronized void performAction0536(PcmStream pcmStreamArgument1) {
        this.pcmStreamState0001 = pcmStreamArgument1;
    }

    void performAction0530(java.awt.Component componentArgument1) throws Exception {
    }

    final synchronized void performAction0526() {
        try {
          this.booleanState0040 = true;
          try {
            this.performAction0542();
          } catch (Exception exception) {
            this.performAction0538();
            this.longState0014 = MixedSupport063.computeLong0827(4) + 2000L;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal2) {
          throw uncheckedExceptionLocal2;
        } catch (Throwable checkedExceptionLocal3) {
          throw new RuntimeException(checkedExceptionLocal3);
        }
    }

    final static void performAction0528(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        if (integerArgument1 < 8000 ||
          integerArgument1 > 48000) {
          throw new IllegalArgumentException();
        }
        integerState0209 = integerArgument1;
        booleanState0038 = booleanArgument2 ? true : false;
        integerState0213 = integerArgument3;
    }

    private final void performAction0532(PcmStream pcmStreamArgument1, int integerArgument2) {
        int integerLocal1 = integerArgument2 >> 5;
        PcmStream pcmStreamLocal2 = this.pcmStreamArrayState0002[integerLocal1];
        if (pcmStreamLocal2 == null) {
          this.pcmStreamArrayState0001[integerLocal1] = pcmStreamArgument1;
        } else {
          pcmStreamLocal2.pcmStreamState0002 = pcmStreamArgument1;
        }
        this.pcmStreamArrayState0002[integerLocal1] = pcmStreamArgument1;
        pcmStreamArgument1.integerState0567 = integerArgument2;
    }

    void performAction0538() {
    }

    private final void performAction0533(int[] integerArrayArgument1, int integerArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        Object objectLocal6;
        int integerLocal7;
        PcmStream[] pcmStreamArrayLocal8;
        int integerLocal9;
        Object objectLocal10;
        PcmStream pcmStreamLocal11;
        AudioSupport006 audioSupport006Local12;
        int integerLocal13;
        PcmStream pcmStreamLocal14;
        int integerLocal15;
        PcmStream pcmStreamLocal16;
        int integerLocal17;
        int integerLocal18;
        Object objectLocal19;
        PcmStream pcmStreamLocal20;
        PcmStream pcmStreamLocal21;
        integerLocal1 = integerArgument2;
        if (booleanState0038) {
          integerLocal1 = integerLocal1 << 1;
        }
        MixedSupport008.performAction0083(integerArrayArgument1, 0, integerLocal1);
        this.integerState0210 = this.integerState0210 - integerArgument2;
        if (this.pcmStreamState0001 != null &&
          this.integerState0210 <= 0) {
          this.integerState0210 = this.integerState0210 + (integerState0209 >> 4);
          PcmPlayer.performAction0531(this.pcmStreamState0001);
          this.performAction0532(this.pcmStreamState0001, this.pcmStreamState0001.computeInteger0481());
          integerLocal2 = 0;
          integerLocal3 = 255;
          integerLocal4 = 7;
          scanLoop1: while (true) {
            if (integerLocal3 != 0) {
              if (integerLocal4 >= 0) {
                integerLocal5 = integerLocal4;
                integerLocal7 = 0;
              } else {
                integerLocal5 = integerLocal4 & 3;
                integerLocal7 = -(integerLocal4 >> 2);
              }
              integerLocal9 = integerLocal3 >>> integerLocal5 & 286331153;
              while (integerLocal9 != 0) {
                if ((integerLocal9 & 1) != 0) {
                  integerLocal3 = integerLocal3 & ~(1 << integerLocal5);
                  objectLocal10 = null;
                  pcmStreamLocal11 = this.pcmStreamArrayState0001[integerLocal5];
                  pcmStreamLocal14 = pcmStreamLocal11;
                  pcmStreamLocal20 = pcmStreamLocal11;
                  while (pcmStreamLocal11 != null) {
                    audioSupport006Local12 = pcmStreamLocal11.audioSupport006State0001;
                    if (audioSupport006Local12 != null &&
                      audioSupport006Local12.integerState0779 > integerLocal7) {
                      integerLocal3 = integerLocal3 | 1 << integerLocal5;
                      objectLocal10 = pcmStreamLocal11;
                      pcmStreamLocal11 = pcmStreamLocal11.pcmStreamState0002;
                      continue;
                    }
                    pcmStreamLocal11.booleanState0130 = true;
                    integerLocal13 = pcmStreamLocal11.computeInteger0468();
                    integerLocal2 = integerLocal2 + integerLocal13;
                    if (audioSupport006Local12 != null) {
                      audioSupport006Local12.integerState0779 = audioSupport006Local12.integerState0779 + integerLocal13;
                    }
                    if (integerLocal2 >= this.integerState0208) {
                      break scanLoop1;
                    }
                    pcmStreamLocal21 = pcmStreamLocal11.computePcmStream0499();
                    if (pcmStreamLocal21 != null) {
                      integerLocal15 = pcmStreamLocal11.integerState0567;
                      while (pcmStreamLocal21 != null) {
                        this.performAction0532(pcmStreamLocal21, integerLocal15 * pcmStreamLocal21.computeInteger0481() >> 8);
                        pcmStreamLocal21 = pcmStreamLocal11.computePcmStream0494();
                      }
                    }
                    pcmStreamLocal16 = pcmStreamLocal11.pcmStreamState0002;
                    pcmStreamLocal11.pcmStreamState0002 = null;
                    if (objectLocal10 != null) {
                      ((PcmStream) (objectLocal10)).pcmStreamState0002 = pcmStreamLocal16;
                    } else {
                      this.pcmStreamArrayState0001[integerLocal5] = pcmStreamLocal16;
                    }
                    if (pcmStreamLocal16 == null) {
                      this.pcmStreamArrayState0002[integerLocal5] = (PcmStream) (objectLocal10);
                    }
                    pcmStreamLocal11 = pcmStreamLocal16;
                  }
                }
                integerLocal5 += 4;
                integerLocal7++;
                integerLocal9 = integerLocal9 >>> 4;
              }
              integerLocal4--;
              continue;
            }
            break;
          }
          for (integerLocal17 = 0; integerLocal17 < 8; integerLocal17++) {
            objectLocal6 = this.pcmStreamArrayState0001[integerLocal17];
            pcmStreamArrayLocal8 = this.pcmStreamArrayState0001;
            integerLocal18 = integerLocal17;
            this.pcmStreamArrayState0002[integerLocal17] = null;
            pcmStreamArrayLocal8[integerLocal18] = null;
            while (objectLocal6 != null) {
              objectLocal19 = ((PcmStream) (objectLocal6)).pcmStreamState0002;
              ((PcmStream) (objectLocal6)).pcmStreamState0002 = null;
              objectLocal6 = objectLocal19;
            }
          }
        }
        if (this.integerState0210 < 0) {
          this.integerState0210 = 0;
        }
        if (this.pcmStreamState0001 != null) {
          this.pcmStreamState0001.performAction0492(integerArrayArgument1, 0, integerArgument2);
        }
        this.longState0012 = MixedSupport063.computeLong0827(4);
    }

    private final void performAction0535(int integerArgument1) {
        this.integerState0210 = this.integerState0210 - integerArgument1;
        if (this.integerState0210 < 0) {
          this.integerState0210 = 0;
        }
        if (this.pcmStreamState0001 != null) {
          this.pcmStreamState0001.performAction0469(integerArgument1);
          return;
        }
    }

    private final static void performAction0531(PcmStream pcmStreamArgument1) {
        pcmStreamArgument1.booleanState0130 = false;
        if (pcmStreamArgument1.audioSupport006State0001 != null) {
          pcmStreamArgument1.audioSupport006State0001.integerState0779 = 0;
        }
        PcmStream pcmStreamLocal1 = pcmStreamArgument1.computePcmStream0499();
        while (pcmStreamLocal1 != null) {
          PcmPlayer.performAction0531(pcmStreamLocal1);
          pcmStreamLocal1 = pcmStreamArgument1.computePcmStream0494();
        }
    }

    int computeInteger0537() throws Exception {
        return this.integerState0215;
    }

    final synchronized void performAction0539() {
        int integerLocal1 = 0;
        int integerLocal2;
        if (audioSupport004State0001 != null) {
          integerLocal2 = 1;
          for (integerLocal1 = 0; integerLocal1 < 2; integerLocal1++) {
            if (audioSupport004State0001.pcmPlayerArrayState0001[integerLocal1] == this) {
              audioSupport004State0001.pcmPlayerArrayState0001[integerLocal1] = null;
            }
            if (audioSupport004State0001.pcmPlayerArrayState0001[integerLocal1] != null) {
              integerLocal2 = 0;
            }
          }
          if (integerLocal2 != 0) {
            audioSupport004State0001.booleanState0161 = true;
            while (audioSupport004State0001.booleanState0160) {
              MixedSupport132.performAction1837(50L, -128);
            }
            audioSupport004State0001 = null;
          }
        }
        this.performAction0538();
        this.integerArrayState0041 = null;
        this.booleanState0039 = true;
    }

    PcmPlayer() {
        this.integerState0208 = 32;
        this.booleanState0039 = false;
        this.longState0012 = MixedSupport063.computeLong0827(4);
        this.booleanState0040 = true;
        this.pcmStreamArrayState0002 = new PcmStream[8];
        this.integerState0211 = 0;
        this.integerState0210 = 0;
        this.pcmStreamArrayState0001 = new PcmStream[8];
        this.longState0014 = 0L;
        this.integerState0216 = 0;
        this.integerState0212 = 0;
        this.longState0013 = 0L;
    }
}
