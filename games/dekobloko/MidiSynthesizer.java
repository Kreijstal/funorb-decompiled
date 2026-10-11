/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiSynthesizer extends AudioSupport005 {
    private int integerState0298;
    private int[] integerArrayState0066;
    private int integerState0299;
    private int integerState0300;
    private int[] integerArrayState0067;
    private int integerState0301;
    private int[] integerArrayState0068;
    private int[] integerArrayState0069;
    private int integerState0302;
    private int[] integerArrayState0070;
    private int[] integerArrayState0071;
    private int integerState0303;
    private MusicTrack musicTrackState0002;
    private int[] integerArrayState0072;
    private int integerState0304;
    private int[] integerArrayState0073;
    private int[] integerArrayState0074;
    private int[] integerArrayState0075;
    private int[] integerArrayState0076;
    private int integerState0305;
    private int[] integerArrayState0077;
    private int integerState0306;
    private int[] integerArrayState0078;
    private int integerState0307;
    private MusicTrack musicTrackState0003;
    private int[] integerArrayState0079;
    private int integerState0308;
    private int[] integerArrayState0080;
    private int[] integerArrayState0081;
    private int[] integerArrayState0082;
    private int[] integerArrayState0083;
    private int[] integerArrayState0084;
    private static int[] integerArrayState0085;
    private int integerState0309;
    private int integerState0310;
    private int[] integerArrayState0086;
    private int[] integerArrayState0087;
    private int[] integerArrayState0088;
    private int[] integerArrayState0089;
    private static int[] integerArrayState0090;
    private int integerState0311;
    private int[] integerArrayState0091;
    private int[] integerArrayState0092;
    private int integerState0312;
    private int[] integerArrayState0093;
    private RawPcmStream[] rawPcmStreamArrayState0001;
    private int[] integerArrayState0094;
    private int[] integerArrayState0095;
    private int[] integerArrayState0096;
    private int[] integerArrayState0097;
    private int integerState0313;
    private int integerState0314;
    private boolean booleanState0076;
    private int[] integerArrayState0098;
    private int integerState0315;
    private boolean[] booleanArrayState0005;
    private int[] integerArrayState0099;

    private final void performAction0780() {
        this.integerArrayState0087 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0088 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0073 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0068 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0070 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0084 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0089 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0082 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0075 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0083 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0086 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0071 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0077 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0094 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0095 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0097 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0072 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0076 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0092 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0080 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0069 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0074 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0067 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0096 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0099 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0079 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0066 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0081 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0078 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0091 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0098 = new int[this.musicTrackState0002.integerState0807];
        this.integerArrayState0093 = new int[this.musicTrackState0002.integerState0807];
        this.booleanArrayState0005 = new boolean[this.musicTrackState0002.integerState0807];
        this.rawPcmStreamArrayState0001 = new RawPcmStream[this.musicTrackState0002.integerState0807];
        this.performAction0778();
    }

    private final void performAction0779(int integerArgument1) {
        if (this.rawPcmStreamArrayState0001[integerArgument1] != null) {
          this.rawPcmStreamArrayState0001[integerArgument1].performAction0510(PcmPlayer.integerState0209 >> 7);
          this.rawPcmStreamArrayState0001[integerArgument1] = null;
        }
    }

    final synchronized void performAction0773(MusicTrack musicTrackArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.integerState0307 = integerArgument4;
        if (musicTrackArgument1 != null) {
          this.musicTrackState0003 = musicTrackArgument1;
        }
        this.integerState0315 = integerArgument2;
        this.integerState0306 = integerArgument3;
    }

    final void performAction0774() {
        int integerLocal1 = 0;
        for (integerLocal1 = 0; integerLocal1 < this.musicTrackState0002.integerState0807; integerLocal1++) {
          if (this.rawPcmStreamArrayState0001[integerLocal1] != null) {
            this.pcmStreamMixerState0003.performAction1190(this.rawPcmStreamArrayState0001[integerLocal1]);
          }
        }
    }

    private final void performAction0778() {
        int integerLocal1 = 0;
        int integerLocal2;
        this.integerState0308 = 0;
        this.integerState0301 = 0;
        this.integerState0309 = 0;
        this.integerState0298 = 0;
        this.integerState0299 = 0;
        this.integerState0310 = 0;
        this.integerState0305 = this.musicTrackState0002.integerState0808;
        this.integerState0304 = this.musicTrackState0002.integerState0804;
        this.integerState0314 = 64;
        for (integerLocal1 = 0; integerLocal1 < this.musicTrackState0002.integerState0807; integerLocal1++) {
          this.integerArrayState0089[integerLocal1] = 0;
          this.integerArrayState0082[integerLocal1] = 0;
          this.integerArrayState0075[integerLocal1] = 0;
          this.integerArrayState0083[integerLocal1] = 0;
          this.integerArrayState0086[integerLocal1] = 0;
          this.integerArrayState0071[integerLocal1] = 0;
          this.integerArrayState0077[integerLocal1] = 0;
          this.integerArrayState0094[integerLocal1] = 0;
          this.integerArrayState0095[integerLocal1] = 0;
          this.integerArrayState0097[integerLocal1] = 0;
          this.integerArrayState0072[integerLocal1] = 0;
          this.integerArrayState0076[integerLocal1] = 0;
          this.integerArrayState0092[integerLocal1] = 0;
          this.integerArrayState0080[integerLocal1] = 0;
          this.integerArrayState0069[integerLocal1] = 0;
          this.integerArrayState0074[integerLocal1] = 0;
          this.integerArrayState0067[integerLocal1] = -1;
          this.integerArrayState0096[integerLocal1] = 0;
          this.integerArrayState0099[integerLocal1] = 0;
          this.integerArrayState0079[integerLocal1] = 0;
          this.integerArrayState0066[integerLocal1] = 0;
          this.integerArrayState0081[integerLocal1] = 0;
          this.integerArrayState0078[integerLocal1] = 0;
          this.integerArrayState0093[integerLocal1] = 0;
          this.integerArrayState0091[integerLocal1] = 0;
          this.integerArrayState0098[integerLocal1] = 0;
          this.integerArrayState0068[integerLocal1] = 0;
          this.integerArrayState0087[integerLocal1] = 0;
          this.integerArrayState0088[integerLocal1] = 128;
          this.integerArrayState0073[integerLocal1] = 0;
          this.integerArrayState0070[integerLocal1] = -1;
        }
        this.integerState0307 = 0;
        this.musicTrackState0003 = null;
        this.integerState0315 = -1;
        this.integerState0306 = -1;
        this.integerState0311 = 0;
        this.integerState0300 = 0;
        this.integerState0303 = -1;
        this.integerState0312 = 0;
        int integerLocal3 = 0;
        integerLocal2 = integerLocal3;
        while (integerLocal3 < this.musicTrackState0002.integerState0807) {
          this.rawPcmStreamArrayState0001[integerLocal3] = null;
          this.booleanArrayState0005[integerLocal3] = false;
          integerLocal3++;
        }
        this.integerState0301 = 1;
    }

    final synchronized void performAction0769(int integerArgument1) {
        this.integerState0313 = integerArgument1;
    }

    private final void performAction0770(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (this.rawPcmStreamArrayState0001[integerArgument1] != null) {
          if (integerArgument2 < 0) {
            integerArgument2 = 0;
          } else {
            if (integerArgument2 > 64) {
              integerArgument2 = 64;
            }
          }
          if (integerArgument3 < 0) {
            integerArgument3 = 0;
          } else {
            if (integerArgument3 > 256) {
              integerArgument3 = 256;
            }
          }
          this.rawPcmStreamArrayState0001[integerArgument1].performAction0470(PcmPlayer.integerState0209 >> 7, integerArgument2 * this.integerState0314 * this.integerState0313 >> 12, integerArgument3);
        }
    }

    final void performAction0768() {
        int integerLocal1 = 0;
        for (integerLocal1 = 0; integerLocal1 < this.musicTrackState0002.integerState0807; integerLocal1++) {
          if (this.rawPcmStreamArrayState0001[integerLocal1] != null) {
            this.pcmStreamMixerState0003.performAction1193(this.rawPcmStreamArrayState0001[integerLocal1]);
          }
        }
    }

    public static void performAction0781() {
        integerArrayState0085 = null;
        integerArrayState0090 = null;
    }

    private final boolean computeBoolean0776() {
        int integerLocal1 = 0;
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
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        integerLocal4 = 0;
        if (this.integerState0301 != 1 &&
          this.integerState0301 != 2) {
          this.integerState0308 = 0;
          return false;
        }
        integerLocal14 = 0;
        if (this.integerState0308 == 0) {
          if (this.integerState0301 == 1) {
            this.integerState0301 = 2;
            this.integerState0299 = 0;
            this.integerState0298 = 0;
            this.integerState0310 = this.musicTrackState0002.integerArrayState0220[this.integerState0299];
            this.integerState0309 = 0;
          }
          if (!(this.integerState0298 < this.musicTrackState0002.integerArrayState0212[this.integerState0310]) ||
            this.integerState0312 == 1 ||
            this.integerState0311 != 0 &&
            this.integerState0298 % this.integerState0311 == 0 ||
            this.integerState0307 > 0 &&
            this.integerState0298 % this.integerState0307 == 0) {
            if (this.integerState0311 == 0) {
              this.integerState0299 = this.integerState0299 + 1;
            } else {
              if (this.integerState0300 <= this.integerState0299) {
                integerLocal14 = 1;
              }
              this.integerState0299 = this.integerState0300;
            }
            if (this.integerState0303 != -1) {
              this.integerState0299 = this.integerState0303;
              this.integerState0303 = -1;
            }
            if (this.integerState0299 >= this.musicTrackState0002.integerState0809) {
              this.integerState0299 = 0;
              integerLocal14 = 1;
            }
            this.integerState0298 = 0;
            if (this.integerState0312 == 1) {
              this.integerState0300 = this.integerState0300 / 16 * 10 + this.integerState0300 % 16;
              if (this.integerState0300 >= this.musicTrackState0002.integerArrayState0212[this.integerState0310]) {
                this.integerState0300 = 0;
              }
              this.integerState0298 = this.integerState0300;
            }
            if (this.integerState0315 >= 0 && (this.integerState0307 >= 0 ||
              integerLocal14 != 0)) {
              integerLocal15 = this.integerState0315;
              integerLocal16 = this.integerState0306;
              if (this.musicTrackState0003 != null) {
                for (integerLocal17 = 0; integerLocal17 < this.musicTrackState0002.integerState0807; integerLocal17++) {
                  this.performAction0779(integerLocal17);
                }
                this.musicTrackState0002 = this.musicTrackState0003;
                this.performAction0780();
                this.integerState0301 = 2;
              }
              this.integerState0299 = integerLocal15;
              this.integerState0298 = integerLocal16;
              integerLocal14 = 0;
              this.integerState0307 = 0;
              this.integerState0315 = -1;
              this.integerState0306 = -1;
              this.musicTrackState0003 = null;
            }
            this.integerState0310 = this.musicTrackState0002.integerArrayState0220[this.integerState0299];
            this.integerState0309 = 0;
            for (integerLocal1 = 0; integerLocal1 < this.integerState0298; integerLocal1++) {
              for (integerLocal15 = 0; integerLocal15 < this.musicTrackState0002.integerState0807; integerLocal15++) {
                integerLocal16 = this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][this.integerState0309] & 255;
                this.integerState0309 = this.integerState0309 + 1;
                if (integerLocal16 >= 128) {
                  integerLocal16 -= 128;
                } else {
                  this.integerState0309 = this.integerState0309 - 1;
                  integerLocal16 = 31;
                }
                if ((integerLocal16 & 1) == 1) {
                  this.integerState0309 = this.integerState0309 + 1;
                }
                if ((integerLocal16 & 2) == 2) {
                  this.integerState0309 = this.integerState0309 + 1;
                }
                if ((integerLocal16 & 4) == 4) {
                  this.integerState0309 = this.integerState0309 + 1;
                }
                if ((integerLocal16 & 8) == 8) {
                  this.integerState0309 = this.integerState0309 + 1;
                }
                if ((integerLocal16 & 16) == 16) {
                  this.integerState0309 = this.integerState0309 + 1;
                }
              }
            }
            this.integerState0303 = -1;
            this.integerState0312 = 0;
            this.integerState0311 = 0;
          }
          this.integerState0298 = this.integerState0298 + 1;
        }
        for (integerLocal15 = 0; integerLocal15 < this.musicTrackState0002.integerState0807; integerLocal15++) {
          regionExit1: {
            if (this.integerState0308 != 0) {
              if (this.integerArrayState0067[integerLocal15] < 0) {
                break regionExit1;
              }
              integerLocal16 = this.integerArrayState0067[integerLocal15];
            } else {
              integerLocal16 = this.integerState0309;
            }
            this.integerArrayState0067[integerLocal15] = -1;
            integerLocal17 = integerLocal16;
            integerLocal18 = -1;
            integerLocal19 = -1;
            integerLocal20 = -1;
            integerLocal21 = -1;
            integerLocal22 = -1;
            integerLocal23 = 0;
            integerLocal24 = this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255;
            integerLocal16++;
            if (integerLocal24 >= 128) {
              integerLocal24 -= 128;
            } else {
              integerLocal16--;
              integerLocal24 = 31;
            }
            if ((integerLocal24 & 1) == 1) {
              integerLocal18 = this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255;
              integerLocal16++;
            }
            if ((integerLocal24 & 2) == 2) {
              integerLocal19 = (this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255) - 1;
              integerLocal16++;
            }
            if ((integerLocal24 & 4) == 4) {
              integerLocal20 = (this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255) - 16;
              integerLocal16++;
            }
            if ((integerLocal24 & 8) == 8) {
              integerLocal22 = this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255;
              integerLocal16++;
            }
            if ((integerLocal24 & 16) == 16) {
              integerLocal23 = this.musicTrackState0002.byteArrayArrayState0009[this.integerState0310][integerLocal16] & 255;
              integerLocal16++;
            }
            if (this.integerState0308 == 0) {
              this.integerState0309 = integerLocal16;
            }
            if (!this.booleanArrayState0005[integerLocal15]) {
              if (integerLocal22 == 14) {
                integerLocal22 = integerLocal22 * 16 + integerLocal23 / 16;
                integerLocal23 = integerLocal23 & 15;
              }
              if (integerLocal22 == 236) {
                if (integerLocal23 != 0) {
                  if (this.integerState0308 != integerLocal23) {
                    this.integerArrayState0067[integerLocal15] = integerLocal17;
                  } else {
                    integerLocal18 = 97;
                    integerLocal22 = -1;
                    integerLocal21 = -1;
                    integerLocal20 = -1;
                    integerLocal19 = -1;
                    integerLocal23 = 0;
                  }
                } else {
                  integerLocal18 = 97;
                }
              }
              if (integerLocal22 == 237 &&
                this.integerState0308 < integerLocal23) {
                this.integerArrayState0067[integerLocal15] = integerLocal17;
              } else {
                if (integerLocal20 >= 80 &&
                  integerLocal20 < 96) {
                  this.integerArrayState0091[integerLocal15] = 2;
                  this.integerArrayState0089[integerLocal15] = 80 - integerLocal20;
                  integerLocal20 = -1;
                }
                if (integerLocal20 >= 96 &&
                  integerLocal20 < 112) {
                  this.integerArrayState0091[integerLocal15] = 2;
                  this.integerArrayState0089[integerLocal15] = integerLocal20 - 96;
                  integerLocal20 = -1;
                }
                if (integerLocal20 >= 112 &&
                  integerLocal20 < 128) {
                  integerLocal20 = this.integerArrayState0087[integerLocal15] - (integerLocal20 - 112);
                  if (integerLocal20 >= 0) {
                    if (integerLocal20 > 64) {
                      integerLocal20 = 64;
                    }
                  } else {
                    integerLocal20 = 0;
                  }
                }
                if (integerLocal20 >= 128 &&
                  integerLocal20 < 136) {
                  integerLocal20 = this.integerArrayState0087[integerLocal15] + (integerLocal20 - 128);
                  if (integerLocal20 >= 0) {
                    if (integerLocal20 > 64) {
                      integerLocal20 = 64;
                    }
                  } else {
                    integerLocal20 = 0;
                  }
                }
                if (integerLocal20 >= 176 &&
                  integerLocal20 < 192) {
                  integerLocal21 = (integerLocal20 - 176) * 17;
                  integerLocal20 = -1;
                }
                if (integerLocal20 >= 192 &&
                  integerLocal20 < 208) {
                  this.integerArrayState0098[integerLocal15] = 2;
                  this.integerArrayState0082[integerLocal15] = 192 - integerLocal20;
                  integerLocal20 = -1;
                }
                if (integerLocal20 >= 208 &&
                  integerLocal20 < 224) {
                  this.integerArrayState0098[integerLocal15] = 2;
                  this.integerArrayState0082[integerLocal15] = integerLocal20 - 208;
                  integerLocal20 = -1;
                }
                if (integerLocal20 > 64) {
                  integerLocal20 = -1;
                }
                if (integerLocal22 == 13) {
                  if (this.integerState0311 > 1) {
                    this.integerState0311 = 1;
                  } else {
                    this.integerState0312 = 1;
                    this.integerState0300 = integerLocal23;
                  }
                }
                if (integerLocal22 == 15) {
                  if (integerLocal23 >= 32) {
                    this.integerState0304 = integerLocal23;
                  } else {
                    this.integerState0305 = integerLocal23;
                  }
                }
                if (integerLocal22 == 16) {
                  this.integerState0314 = integerLocal23;
                }
                if (integerLocal22 == 12) {
                  integerLocal20 = integerLocal23;
                }
                if (integerLocal22 == 8) {
                  integerLocal21 = integerLocal23;
                }
                if (integerLocal22 == 11 &&
                  this.integerState0311 <= 1) {
                  this.integerState0311 = 1;
                  this.integerState0300 = integerLocal23;
                }
                if (integerLocal22 == 20) {
                  integerLocal18 = 97;
                }
                if (integerLocal22 == 21) {
                  this.integerArrayState0096[integerLocal15] = integerLocal23;
                  if (this.integerArrayState0096[integerLocal15] >= this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayArrayState0021[integerLocal4].length - 1]) {
                    this.integerArrayState0096[integerLocal15] = this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayArrayState0021[integerLocal4].length - 1] - 1;
                  }
                  this.integerArrayState0099[integerLocal15] = integerLocal23;
                  if (this.integerArrayState0099[integerLocal15] >= this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayArrayState0024[integerLocal4].length - 1]) {
                    this.integerArrayState0099[integerLocal15] = this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayArrayState0024[integerLocal4].length - 1] - 1;
                  }
                }
                if (integerLocal19 >= 0 &&
                  integerLocal18 <= 96) {
                  this.integerArrayState0096[integerLocal15] = 0;
                  this.integerArrayState0099[integerLocal15] = 0;
                  this.integerArrayState0066[integerLocal15] = 1;
                  this.integerArrayState0081[integerLocal15] = 0;
                }
                if (integerLocal22 == 3 &&
                  integerLocal20 < 0 &&
                  integerLocal19 != -1) {
                  integerLocal20 = this.musicTrackState0002.integerArrayState0216[this.integerArrayState0068[integerLocal15]];
                }
                if (integerLocal22 == 3 &&
                  integerLocal21 < 0 &&
                  integerLocal19 != -1) {
                  integerLocal21 = this.musicTrackState0002.integerArrayState0229[this.integerArrayState0068[integerLocal15]];
                }
                if (integerLocal18 >= 0 &&
                  integerLocal18 <= 96 &&
                  integerLocal22 != 3) {
                  if (integerLocal19 == -1 &&
                    integerLocal20 < 0) {
                    integerLocal20 = this.integerArrayState0087[integerLocal15];
                  }
                  if (integerLocal19 == -1 &&
                    integerLocal21 < 0) {
                    integerLocal21 = this.integerArrayState0088[integerLocal15];
                  }
                  if (integerLocal19 != -1) {
                    this.integerArrayState0070[integerLocal15] = integerLocal19;
                    if (integerLocal18 >= 96) {
                      integerLocal19 = this.musicTrackState0002.integerArrayArrayState0025[integerLocal19][95];
                    } else {
                      integerLocal19 = this.musicTrackState0002.integerArrayArrayState0025[integerLocal19][integerLocal18];
                    }
                  } else {
                    integerLocal19 = this.integerArrayState0068[integerLocal15];
                  }
                  if (integerLocal20 < 0) {
                    integerLocal20 = this.musicTrackState0002.integerArrayState0216[integerLocal19];
                  }
                  if (integerLocal21 < 0) {
                    integerLocal21 = this.musicTrackState0002.integerArrayState0229[integerLocal19];
                  }
                  integerLocal25 = 7680 - (integerLocal18 + this.musicTrackState0002.integerArrayState0225[integerLocal19]) * 64 - this.musicTrackState0002.integerArrayState0219[integerLocal19] / 2;
                  if (integerLocal25 >= 0) {
                    if (integerLocal25 > 7999) {
                      integerLocal25 = 7999;
                    }
                  } else {
                    integerLocal25 = 0;
                  }
                  this.integerArrayState0069[integerLocal15] = integerLocal25;
                  integerLocal26 = integerArrayState0085[integerLocal25];
                  this.integerArrayState0068[integerLocal15] = integerLocal19;
                  this.integerArrayState0087[integerLocal15] = integerLocal20;
                  this.integerArrayState0088[integerLocal15] = integerLocal21;
                  this.integerArrayState0073[integerLocal15] = integerLocal25;
                  integerLocal2 = 0;
                  if (integerLocal22 == 9) {
                    if (integerLocal23 * 256 <= this.musicTrackState0002.integerArrayState0214[integerLocal19]) {
                      integerLocal2 = integerLocal23 * 256;
                    } else {
                      integerLocal2 = this.musicTrackState0002.integerArrayState0214[integerLocal19];
                    }
                  }
                  this.performAction0771(integerLocal15, integerLocal19, integerLocal2, integerLocal26, integerLocal20, integerLocal21);
                  this.integerArrayState0086[integerLocal15] = 0;
                } else {
                  if (integerLocal18 <= 96) {
                    if (integerLocal20 >= 0 ||
                      integerLocal21 >= 0) {
                      if (integerLocal20 >= 0) {
                        this.integerArrayState0087[integerLocal15] = integerLocal20;
                      }
                      if (integerLocal21 >= 0) {
                        this.integerArrayState0088[integerLocal15] = integerLocal21;
                      }
                    }
                  } else {
                    if (this.integerArrayState0079[integerLocal15] != 1) {
                      this.performAction0779(integerLocal15);
                    } else {
                      this.integerArrayState0066[integerLocal15] = 0;
                    }
                  }
                }
                regionExit2: {
                  if (integerLocal22 != 3) {
                    if (integerLocal22 != 5) {
                      this.integerArrayState0078[integerLocal15] = 0;
                    }
                  } else {
                    this.integerArrayState0078[integerLocal15] = 1;
                    if (integerLocal18 >= 0) {
                      if (integerLocal18 <= 96) {
                        integerLocal19 = this.integerArrayState0068[integerLocal15];
                        integerLocal25 = 7680 - (integerLocal18 + this.musicTrackState0002.integerArrayState0225[integerLocal19]) * 64 - this.musicTrackState0002.integerArrayState0219[integerLocal19] / 2;
                        if (integerLocal25 >= 0) {
                          if (integerLocal25 <= 7999) {
                            this.integerArrayState0069[integerLocal15] = integerLocal25;
                            if ((integerLocal23 != 0)) {
                              this.integerArrayState0074[integerLocal15] = integerLocal23;
                              if ((this.musicTrackState0002.integerState0803 == 0)) {
                                this.integerArrayState0074[integerLocal15] = this.integerArrayState0074[integerLocal15] * 2;
                              }
                            }
                            break regionExit2;
                          }
                          integerLocal25 = 7999;
                        } else {
                          integerLocal25 = 0;
                        }
                        this.integerArrayState0069[integerLocal15] = integerLocal25;
                        if (integerLocal23 != 0) {
                          this.integerArrayState0074[integerLocal15] = integerLocal23;
                          if (this.musicTrackState0002.integerState0803 == 0) {
                            this.integerArrayState0074[integerLocal15] = this.integerArrayState0074[integerLocal15] * 2;
                          }
                        }
                      } else {
                        if (integerLocal23 != 0) {
                          this.integerArrayState0074[integerLocal15] = integerLocal23;
                          if (this.musicTrackState0002.integerState0803 == 0) {
                            this.integerArrayState0074[integerLocal15] = this.integerArrayState0074[integerLocal15] * 2;
                          }
                        }
                      }
                    } else {
                      if (integerLocal23 != 0) {
                        this.integerArrayState0074[integerLocal15] = integerLocal23;
                        if (this.musicTrackState0002.integerState0803 == 0) {
                          this.integerArrayState0074[integerLocal15] = this.integerArrayState0074[integerLocal15] * 2;
                        }
                      }
                    }
                  }
                }
                if (integerLocal22 != 4) {
                  if (integerLocal22 != 6) {
                    if (this.integerArrayState0071[integerLocal15] != 0) {
                      integerLocal25 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                      this.performAction0775(integerLocal15, integerLocal25);
                    }
                    this.integerArrayState0086[integerLocal15] = 0;
                    this.integerArrayState0071[integerLocal15] = 0;
                  }
                } else {
                  this.integerArrayState0071[integerLocal15] = 1;
                  if (integerLocal23 / 16 > 0) {
                    this.integerArrayState0075[integerLocal15] = integerLocal23 / 16;
                  }
                  if ((integerLocal23 & 15) > 0) {
                    this.integerArrayState0083[integerLocal15] = integerLocal23 & 15;
                  }
                }
                if (integerLocal22 != 17) {
                  this.integerArrayState0093[integerLocal15] = 0;
                } else {
                  this.integerArrayState0093[integerLocal15] = 1;
                  if (integerLocal23 != 0) {
                    this.integerArrayState0084[integerLocal15] = (integerLocal23 & 240) / 16 - (integerLocal23 & 15);
                  }
                }
                if (integerLocal22 != 10 &&
                  integerLocal22 != 6 &&
                  integerLocal22 != 5) {
                  if (this.integerArrayState0091[integerLocal15] != 2) {
                    this.integerArrayState0091[integerLocal15] = 0;
                  } else {
                    this.integerArrayState0091[integerLocal15] = 1;
                  }
                } else {
                  this.integerArrayState0091[integerLocal15] = 1;
                  if (integerLocal23 != 0) {
                    this.integerArrayState0089[integerLocal15] = (integerLocal23 & 240) / 16 - (integerLocal23 & 15);
                  }
                }
                if (integerLocal22 != 25) {
                  if (this.integerArrayState0098[integerLocal15] != 2) {
                    this.integerArrayState0098[integerLocal15] = 0;
                  } else {
                    this.integerArrayState0098[integerLocal15] = 1;
                  }
                } else {
                  this.integerArrayState0098[integerLocal15] = 1;
                  if (integerLocal23 != 0) {
                    this.integerArrayState0082[integerLocal15] = (integerLocal23 & 240) / 16 - (integerLocal23 & 15);
                  }
                }
                if (integerLocal22 == 234) {
                  if (integerLocal23 != 0) {
                    this.integerArrayState0077[integerLocal15] = integerLocal23;
                  } else {
                    integerLocal23 = this.integerArrayState0077[integerLocal15];
                  }
                  this.integerArrayState0087[integerLocal15] = this.integerArrayState0087[integerLocal15] + integerLocal23;
                  if (this.integerArrayState0087[integerLocal15] >= 0) {
                    if (this.integerArrayState0087[integerLocal15] > 64) {
                      this.integerArrayState0087[integerLocal15] = 64;
                    }
                  } else {
                    this.integerArrayState0087[integerLocal15] = 0;
                  }
                }
                if (integerLocal22 == 235) {
                  if (integerLocal23 != 0) {
                    this.integerArrayState0097[integerLocal15] = integerLocal23;
                  } else {
                    integerLocal23 = this.integerArrayState0097[integerLocal15];
                  }
                  this.integerArrayState0087[integerLocal15] = this.integerArrayState0087[integerLocal15] - integerLocal23;
                  if (this.integerArrayState0087[integerLocal15] >= 0) {
                    if (this.integerArrayState0087[integerLocal15] > 64) {
                      this.integerArrayState0087[integerLocal15] = 64;
                    }
                  } else {
                    this.integerArrayState0087[integerLocal15] = 0;
                  }
                }
                if (integerLocal22 != 1) {
                  this.integerArrayState0092[integerLocal15] = 0;
                } else {
                  if (integerLocal23 != 0) {
                    this.integerArrayState0092[integerLocal15] = integerLocal23;
                  }
                }
                if (integerLocal22 != 2) {
                  this.integerArrayState0080[integerLocal15] = 0;
                } else {
                  if (integerLocal23 != 0) {
                    this.integerArrayState0080[integerLocal15] = integerLocal23;
                  }
                }
                switch (integerLocal22) {
                  case 225:
                    if (integerLocal23 != 0) {
                      this.integerArrayState0094[integerLocal15] = integerLocal23;
                    } else {
                      integerLocal23 = this.integerArrayState0094[integerLocal15];
                    }
                    this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] - integerLocal23 * 4;
                    if (this.integerArrayState0073[integerLocal15] >= 0) {
                      if (this.integerArrayState0073[integerLocal15] > 7999) {
                        this.integerArrayState0073[integerLocal15] = 7999;
                      }
                    } else {
                      this.integerArrayState0073[integerLocal15] = 0;
                    }
                    integerLocal25 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                    this.performAction0775(integerLocal15, integerLocal25);
                    break;
                  case 226:
                    if (integerLocal23 != 0) {
                      this.integerArrayState0072[integerLocal15] = integerLocal23;
                    } else {
                      integerLocal23 = this.integerArrayState0072[integerLocal15];
                    }
                    this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] + integerLocal23 * 4;
                    if (this.integerArrayState0073[integerLocal15] >= 0) {
                      if (this.integerArrayState0073[integerLocal15] > 7999) {
                        this.integerArrayState0073[integerLocal15] = 7999;
                      }
                    } else {
                      this.integerArrayState0073[integerLocal15] = 0;
                    }
                    integerLocal25 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                    this.performAction0775(integerLocal15, integerLocal25);
                    break;
                  case 33:
                    if (integerLocal23 / 16 != 1) {
                      integerLocal23 = integerLocal23 & 15;
                      if (integerLocal23 != 0) {
                        this.integerArrayState0076[integerLocal15] = integerLocal23;
                      } else {
                        integerLocal23 = this.integerArrayState0076[integerLocal15];
                      }
                      this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] + integerLocal23;
                      if (this.integerArrayState0073[integerLocal15] >= 0) {
                        if (this.integerArrayState0073[integerLocal15] > 7999) {
                          this.integerArrayState0073[integerLocal15] = 7999;
                        }
                      } else {
                        this.integerArrayState0073[integerLocal15] = 0;
                      }
                      integerLocal25 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                      this.performAction0775(integerLocal15, integerLocal25);
                    } else {
                      integerLocal23 = integerLocal23 & 15;
                      if (integerLocal23 != 0) {
                        this.integerArrayState0095[integerLocal15] = integerLocal23;
                      } else {
                        integerLocal23 = this.integerArrayState0095[integerLocal15];
                      }
                      this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] - integerLocal23;
                      if (this.integerArrayState0073[integerLocal15] >= 0) {
                        if (this.integerArrayState0073[integerLocal15] > 7999) {
                          this.integerArrayState0073[integerLocal15] = 7999;
                        }
                      } else {
                        this.integerArrayState0073[integerLocal15] = 0;
                      }
                      integerLocal25 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                      this.performAction0775(integerLocal15, integerLocal25);
                    }
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
        if (this.integerState0308 > 0) {
          for (integerLocal15 = 0; integerLocal15 < this.musicTrackState0002.integerState0807; integerLocal15++) {
            if (!this.booleanArrayState0005[integerLocal15]) {
              if (this.integerArrayState0093[integerLocal15] != 0) {
                this.integerState0314 = this.integerState0314 + this.integerArrayState0084[integerLocal15];
                if (this.integerState0314 >= 0) {
                  if (this.integerState0314 > 64) {
                    this.integerState0314 = 64;
                  }
                } else {
                  this.integerState0314 = 0;
                }
              }
              if (this.integerArrayState0091[integerLocal15] != 0 ||
                this.integerArrayState0098[integerLocal15] != 0) {
                this.integerArrayState0087[integerLocal15] = this.integerArrayState0087[integerLocal15] + this.integerArrayState0089[integerLocal15];
                if (this.integerArrayState0087[integerLocal15] >= 0) {
                  if (this.integerArrayState0087[integerLocal15] > 64) {
                    this.integerArrayState0087[integerLocal15] = 64;
                  }
                } else {
                  this.integerArrayState0087[integerLocal15] = 0;
                }
                this.integerArrayState0088[integerLocal15] = this.integerArrayState0088[integerLocal15] + this.integerArrayState0082[integerLocal15];
                if (this.integerArrayState0088[integerLocal15] >= 0) {
                  if (this.integerArrayState0088[integerLocal15] > 255) {
                    this.integerArrayState0088[integerLocal15] = 255;
                  }
                } else {
                  this.integerArrayState0088[integerLocal15] = 0;
                }
              }
              if (this.integerArrayState0071[integerLocal15] == 1) {
                this.integerArrayState0086[integerLocal15] = (this.integerArrayState0086[integerLocal15] + this.integerArrayState0075[integerLocal15]) % 68;
                integerLocal3 = integerArrayState0090[this.integerArrayState0086[integerLocal15]] * this.integerArrayState0083[integerLocal15] >> 8;
                integerLocal16 = this.integerArrayState0073[integerLocal15] + integerLocal3;
                this.performAction0775(integerLocal15, integerArrayState0085[integerLocal16]);
              }
              if (this.integerArrayState0092[integerLocal15] > 0) {
                this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] - this.integerArrayState0092[integerLocal15] * 4;
                if (this.integerArrayState0073[integerLocal15] >= 0) {
                  if (this.integerArrayState0073[integerLocal15] > 7999) {
                    this.integerArrayState0073[integerLocal15] = 7999;
                  }
                } else {
                  this.integerArrayState0073[integerLocal15] = 0;
                }
                integerLocal16 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                this.performAction0775(integerLocal15, integerLocal16);
              }
              if (this.integerArrayState0080[integerLocal15] > 0) {
                this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] + this.integerArrayState0080[integerLocal15] * 4;
                if (this.integerArrayState0073[integerLocal15] >= 0) {
                  if (this.integerArrayState0073[integerLocal15] > 7999) {
                    this.integerArrayState0073[integerLocal15] = 7999;
                  }
                } else {
                  this.integerArrayState0073[integerLocal15] = 0;
                }
                integerLocal16 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                this.performAction0775(integerLocal15, integerLocal16);
              }
              if (this.integerArrayState0078[integerLocal15] > 0) {
                if (this.integerArrayState0073[integerLocal15] < this.integerArrayState0069[integerLocal15]) {
                  this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] + this.integerArrayState0074[integerLocal15] * 4;
                  if (this.integerArrayState0073[integerLocal15] > this.integerArrayState0069[integerLocal15]) {
                    this.integerArrayState0073[integerLocal15] = this.integerArrayState0069[integerLocal15];
                  }
                }
                if (this.integerArrayState0073[integerLocal15] > this.integerArrayState0069[integerLocal15]) {
                  this.integerArrayState0073[integerLocal15] = this.integerArrayState0073[integerLocal15] - this.integerArrayState0074[integerLocal15] * 4;
                  if (this.integerArrayState0073[integerLocal15] < this.integerArrayState0069[integerLocal15]) {
                    this.integerArrayState0073[integerLocal15] = this.integerArrayState0069[integerLocal15];
                  }
                }
                if (this.integerArrayState0073[integerLocal15] >= 0) {
                  if (this.integerArrayState0073[integerLocal15] > 7999) {
                    this.integerArrayState0073[integerLocal15] = 7999;
                  }
                } else {
                  this.integerArrayState0073[integerLocal15] = 0;
                }
                integerLocal16 = integerArrayState0085[this.integerArrayState0073[integerLocal15]];
                this.performAction0775(integerLocal15, integerLocal16);
              }
            }
          }
        }
        for (integerLocal15 = 0; integerLocal15 < this.musicTrackState0002.integerState0807; integerLocal15++) {
          if (!this.booleanArrayState0005[integerLocal15]) {
            integerLocal16 = this.integerArrayState0087[integerLocal15];
            integerLocal17 = this.integerArrayState0088[integerLocal15];
            this.integerArrayState0079[integerLocal15] = 0;
            if (this.integerArrayState0070[integerLocal15] >= 0) {
              integerLocal4 = this.integerArrayState0070[integerLocal15];
              if ((this.musicTrackState0002.integerArrayState0226[this.integerArrayState0070[integerLocal15]] & 1) == 1) {
                this.integerArrayState0079[integerLocal15] = 1;
                integerLocal5 = this.integerArrayState0096[integerLocal15];
                for (integerLocal6 = 0; this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][integerLocal6 + 1] < integerLocal5; integerLocal6++) {
                }
                integerLocal7 = this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][integerLocal6];
                integerLocal9 = this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][integerLocal6 + 1];
                integerLocal8 = this.musicTrackState0002.integerArrayArrayState0023[integerLocal4][integerLocal6];
                integerLocal10 = this.musicTrackState0002.integerArrayArrayState0023[integerLocal4][integerLocal6 + 1];
                if (integerLocal9 == integerLocal7) {
                  integerLocal9++;
                }
                integerLocal11 = ((integerLocal9 - integerLocal5) * integerLocal8 + (integerLocal5 - integerLocal7) * integerLocal10) / (integerLocal9 - integerLocal7);
                integerLocal12 = 32768 - this.integerArrayState0081[integerLocal15];
                if (integerLocal12 < 0) {
                  integerLocal12 = 0;
                }
                integerLocal16 = integerLocal16 * integerLocal11 * integerLocal12 >> 21;
                if ((this.musicTrackState0002.integerArrayState0226[integerLocal4] & 2) == 2 &&
                  this.integerArrayState0066[integerLocal15] == 1 &&
                  this.integerArrayState0096[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayState0231[integerLocal4]]) {
                  this.integerArrayState0096[integerLocal15] = this.integerArrayState0096[integerLocal15] - 1;
                }
                if (this.integerArrayState0096[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayArrayState0021[integerLocal4].length - 1]) {
                  this.integerArrayState0096[integerLocal15] = this.integerArrayState0096[integerLocal15] - 1;
                }
                if (this.integerArrayState0066[integerLocal15] == 0) {
                  this.integerArrayState0081[integerLocal15] = this.integerArrayState0081[integerLocal15] + this.musicTrackState0002.integerArrayState0232[integerLocal4];
                }
                this.integerArrayState0096[integerLocal15] = this.integerArrayState0096[integerLocal15] + 1;
                if ((this.musicTrackState0002.integerArrayState0226[integerLocal4] & 4) == 4 &&
                  this.integerArrayState0096[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayState0228[integerLocal4]]) {
                  this.integerArrayState0096[integerLocal15] = this.musicTrackState0002.integerArrayArrayState0021[integerLocal4][this.musicTrackState0002.integerArrayState0217[integerLocal4]];
                }
              }
              if ((this.musicTrackState0002.integerArrayState0222[this.integerArrayState0070[integerLocal15]] & 1) == 1) {
                integerLocal5 = this.integerArrayState0099[integerLocal15];
                for (integerLocal6 = 0; this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][integerLocal6 + 1] < integerLocal5; integerLocal6++) {
                }
                integerLocal7 = this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][integerLocal6];
                integerLocal9 = this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][integerLocal6 + 1];
                integerLocal8 = this.musicTrackState0002.integerArrayArrayState0022[integerLocal4][integerLocal6];
                integerLocal10 = this.musicTrackState0002.integerArrayArrayState0022[integerLocal4][integerLocal6 + 1];
                if (integerLocal9 == integerLocal7) {
                  integerLocal9++;
                }
                integerLocal13 = ((integerLocal9 - integerLocal5) * integerLocal8 + (integerLocal5 - integerLocal7) * integerLocal10) / (integerLocal9 - integerLocal7);
                integerLocal17 = integerLocal17 + ((integerLocal13 - 32) * (128 - Math.abs(integerLocal17 - 128)) >> 5);
                if ((this.musicTrackState0002.integerArrayState0222[integerLocal4] & 2) == 2 &&
                  this.integerArrayState0066[integerLocal15] == 1 &&
                  this.integerArrayState0099[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayState0218[integerLocal4]]) {
                  this.integerArrayState0099[integerLocal15] = this.integerArrayState0099[integerLocal15] - 1;
                }
                if (this.integerArrayState0099[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayArrayState0024[integerLocal4].length - 1]) {
                  this.integerArrayState0099[integerLocal15] = this.integerArrayState0099[integerLocal15] - 1;
                }
                this.integerArrayState0099[integerLocal15] = this.integerArrayState0099[integerLocal15] + 1;
                if ((this.musicTrackState0002.integerArrayState0222[integerLocal4] & 4) == 4 &&
                  this.integerArrayState0099[integerLocal15] == this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayState0215[integerLocal4]]) {
                  this.integerArrayState0099[integerLocal15] = this.musicTrackState0002.integerArrayArrayState0024[integerLocal4][this.musicTrackState0002.integerArrayState0230[integerLocal4]];
                }
              }
            }
            this.performAction0770(integerLocal15, integerLocal16, integerLocal17);
          }
        }
        this.integerState0308 = this.integerState0308 + 1;
        if (this.integerState0308 >= this.integerState0305) {
          this.integerState0308 = 0;
        }
        return integerLocal14 != 0;
    }

    private final void performAction0771(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RawSound stackRawSoundLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RawPcmStream stackRawPcmStreamLocal4 = null;
        int stackIntegerLocal5 = 0;
        RawPcmStream stackRawPcmStreamLocal6 = null;
        boolean stackBooleanLocal7 = false;
        Throwable caughtExceptionLocal8 = null;
        RawPcmStream rawPcmStreamLocal9 = null;
        Object objectLocal10 = null;
        this.performAction0779(integerArgument1);
        if (integerArgument4 > integerArrayState0085[7999] &&
          integerArgument4 < integerArrayState0085[0]) {
          if (integerArgument5 >= 0) {
            if (integerArgument5 > 64) {
              integerArgument5 = 64;
            }
          } else {
            integerArgument5 = 0;
          }
          if (integerArgument6 >= 0) {
            if (integerArgument6 > 255) {
              integerArgument6 = 255;
            }
          } else {
            integerArgument6 = 0;
          }
          stackRawSoundLocal1 = this.musicTrackState0002.rawSoundArrayState0003[integerArgument2];
          stackIntegerLocal2 = integerArgument4 * 256 / PcmPlayer.integerState0209;
          if (integerArgument3 == 0) {
            stackIntegerLocal3 = integerArgument5 * this.integerState0314 * this.integerState0313 >> 12;
          } else {
            stackIntegerLocal3 = 0;
          }
          rawPcmStreamLocal9 = RawPcmStream.computeRawPcmStream0489(stackRawSoundLocal1, stackIntegerLocal2, stackIntegerLocal3, integerArgument6);
          rawPcmStreamLocal9.performAction0508(this.musicTrackState0002.integerArrayState0227[integerArgument2], this.musicTrackState0002.integerArrayState0223[integerArgument2]);
          stackRawPcmStreamLocal4 = rawPcmStreamLocal9;
          stackIntegerLocal5 = (this.musicTrackState0002.integerArrayState0213[integerArgument2] == 0) ? 0 : -1;
          ((RawPcmStream) (Object) stackRawPcmStreamLocal4).performAction0507(stackIntegerLocal5);
          stackRawPcmStreamLocal6 = rawPcmStreamLocal9;
          stackBooleanLocal7 = (this.musicTrackState0002.integerArrayState0213[integerArgument2] != 2) ? false : true;
          ((RawPcmStream) (Object) stackRawPcmStreamLocal6).performAction0477(stackBooleanLocal7);
          if (integerArgument3 != 0) {
            rawPcmStreamLocal9.performAction0504(integerArgument3);
            rawPcmStreamLocal9.performAction0470(PcmPlayer.integerState0209 >> 7, integerArgument5 * this.integerState0314 * this.integerState0313 >> 12, integerArgument6);
          }
          this.rawPcmStreamArrayState0001[integerArgument1] = rawPcmStreamLocal9;
          if (this.pcmStreamMixerState0003 != null) {
            objectLocal10 = this.pcmStreamMixerState0003;
            synchronized (objectLocal10) {
              this.pcmStreamMixerState0003.performAction1190(rawPcmStreamLocal9);
            }
          }
          return;
        }
    }

    final int computeInteger0772(PcmStreamMixer pcmStreamMixerArgument1) {
        if (this.computeBoolean0776() &&
          !this.booleanState0076) {
          return -1;
        }
        int integerLocal1 = PcmPlayer.integerState0209;
        int integerLocal2 = (integerLocal1 << 9) + (integerLocal1 << 7);
        return integerLocal2 / (this.integerState0304 * this.integerState0302);
    }

    private final void performAction0775(int integerArgument1, int integerArgument2) {
        if (this.rawPcmStreamArrayState0001[integerArgument1] != null) {
          this.rawPcmStreamArrayState0001[integerArgument1].performAction0500(integerArgument2 * 256 / PcmPlayer.integerState0209);
        }
    }

    final synchronized void performAction0777(int integerArgument1) {
        this.integerState0302 = integerArgument1;
    }

    MidiSynthesizer(MusicTrack musicTrackArgument1) {
        this.integerState0300 = 0;
        this.integerState0306 = -1;
        this.integerState0301 = 0;
        this.integerState0302 = 256;
        this.musicTrackState0003 = null;
        this.integerState0307 = 0;
        this.integerState0308 = 0;
        this.integerState0303 = -1;
        this.integerState0312 = 0;
        this.booleanState0076 = true;
        this.integerState0313 = 64;
        this.integerState0311 = 0;
        this.integerState0315 = -1;
        this.musicTrackState0002 = musicTrackArgument1;
        this.performAction0780();
    }

    static {
        int integerLocal1 = 0;
        int integerLocal2;
        integerArrayState0085 = new int[8000];
        integerArrayState0090 = new int[68];
        for (integerLocal1 = 0; integerLocal1 < 8000; integerLocal1++) {
          integerArrayState0085[integerLocal1] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - integerLocal1) / 768.0));
        }
        for (integerLocal2 = 0; integerLocal2 < 68; integerLocal2++) {
          integerArrayState0090[integerLocal2] = (int)(-2048.0 * Math.sin((double)integerLocal2 * 0.0923998));
        }
    }
}
