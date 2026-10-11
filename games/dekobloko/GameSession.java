/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameSession {
    boolean booleanState0138;
    private int integerState0599;
    private int integerState0600;
    private boolean booleanState0139;
    int integerState0601;
    int integerState0602;
    static String[] stringArrayState0033;
    private int integerState0603;
    private boolean booleanState0140;
    private byte[] byteArrayState0022;
    private int integerState0604;
    private NodeDeque[] nodeDequeArrayState0001;
    private int[][] integerArrayArrayState0019;
    static boolean booleanState0141;
    int integerState0605;
    private int integerState0606;
    private BucketBoard[] buckets;
    MixedSupport028 mixedSupport028State0001;
    int integerState0607;
    static ResourceArchive resourceArchiveState0019;
    private int integerState0608;
    static SceneWidget sceneWidgetState0099;
    int integerState0609;
    private int integerState0610;
    private int integerState0611;
    int integerState0612;
    int[] integerArrayState0187;
    int integerState0613;
    private NodeDeque[] nodeDequeArrayState0002;
    MixedSupport079[] mixedSupport079ArrayState0001;
    ReturnedShapeCache returnedShapeCache;
    static BufferedSocket bufferedSocketState0002;
    private int[] integerArrayState0188;
    boolean booleanState0142;
    private int integerState0614;
    private int[] integerArrayState0189;
    int integerState0615;
    NodeDeque nodeDequeState0024;
    int integerState0616;
    private int integerState0617;
    boolean booleanState0143;
    static int integerState0618;
    private int integerState0619;
    static String stringState0439;
    int integerState0620;
    private int integerState0621;
    private int integerState0622;
    int integerState0623;
    private int integerState0624;
    private int integerState0625;
    private int integerState0626;
    private int integerState0627;
    private int integerState0628;
    private int integerState0629;
    private int integerState0630;
    private boolean booleanState0144;
    private int integerState0631;
    private int integerState0632;
    private int integerState0633;
    private boolean booleanState0145;
    private int[] integerArrayState0190;
    private int integerState0634;
    private boolean booleanState0146;
    private int integerState0635;
    private int integerState0636;
    private int integerState0637;
    private int integerState0638;
    private int integerState0639;
    private int integerState0640;
    private int integerState0641;
    private RenderingSupport008 renderingSupport008State0008;
    private int integerState0642;
    private int integerState0643;
    boolean booleanState0147;
    private int integerState0644;
    private int integerState0645;
    private boolean booleanState0148;
    private int integerState0646;
    private boolean booleanState0149;

    final boolean computeBoolean1501(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        BucketBoard cachedBucketBoardLocal3 = null;
        BucketBoard cachedBucketBoardLocal4 = null;
        BucketBoard cachedBucketBoardLocal5 = null;
        MixedSupport117 cachedMixedSupport117Local6 = null;
        BucketBoard stackBucketBoardLocal7 = null;
        int stackIntegerLocal8 = 0;
        BucketBoard stackBucketBoardLocal9 = null;
        int stackIntegerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        boolean stackBooleanLocal12 = false;
        boolean stackBooleanLocal13 = false;
        int stackIntegerLocal14 = 0;
        boolean stackBooleanLocal15 = false;
        boolean stackBooleanLocal16 = false;
        int stackIntegerLocal17 = 0;
        boolean stackBooleanLocal18 = false;
        Object stackObjectLocal19;
        boolean stackBooleanLocal20;
        RenderingSupport006 stackRenderingSupport006Local21 = null;
        int stackIntegerLocal22 = 0;
        BucketBoard stackBucketBoardLocal23 = null;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        BucketBoard bucketBoardLocal30;
        int integerLocal31;
        BucketBoard bucketBoardLocal32;
        int integerLocal33;
        ReturnedShape returnedShapeLocal34;
        int integerLocal35;
        NodeDeque nodeDequeLocal36;
        HashNode hashNodeLocal37;
        BucketBoard bucketBoardLocal38;
        int integerLocal39;
        int integerLocal40;
        RenderingSupport006 renderingSupport006Local41;
        byte[] byteArrayLocal42;
        int integerLocal43;
        Object objectLocal44;
        int integerLocal45;
        BucketBoard bucketBoardLocal46;
        int integerLocal47;
        String stringLocal48;
        MusicTrack[] musicTrackArrayLocal49;
        int integerLocal50;
        MixedSupport117 mixedSupport117Local51;
        Object objectLocal52;
        RenderingSupport006 renderingSupport006Local53;
        Object objectLocal54;
        RenderingSupport006 renderingSupport006Local55;
        BucketBoard bucketBoardLocal56;
        BucketBoard bucketBoardLocal57;
        byte[] byteArrayLocal58;
        ReturnedShape returnedShapeLocal59;
        Object objectLocal60;
        MixedSupport117 mixedSupport117Local61;
        MixedSupport117 mixedSupport117Local62;
        BucketBoard bucketBoardLocal63;
        BucketBoard bucketBoardLocal64;
        byte[] byteArrayLocal65;
        int integerLocal66;
        int integerLocal67;
        int integerLocal68;
        int integerLocal69;
        int integerLocal70;
        int integerLocal71;
        int integerLocal72;
        int integerLocal73;
        int integerLocal74;
        int integerLocal75;
        int integerLocal76;
        int integerLocal77;
        int integerLocal78;
        int integerLocal79;
        int integerLocal80;
        int integerLocal81;
        int integerLocal82;
        int integerLocal83;
        int integerLocal84;
        int integerLocal85;
        int integerLocal86;
        int integerLocal87;
        int integerLocal88;
        int integerLocal89;
        int integerLocal90;
        int integerLocal91;
        int integerLocal92;
        int integerLocal93;
        Object objectLocal94;
        BucketBoard bucketBoardLocal95;
        BucketBoard bucketBoardLocal96;
        int integerLocal97;
        int integerLocal98;
        int integerLocal99;
        objectLocal52 = null;
        objectLocal54 = null;
        objectLocal60 = null;
        integerLocal50 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal24 = MixedSupport153.integerState0931 / 2;
        UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - 2 * integerLocal24;
        MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal24;
        MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - 2 * integerLocal24;
        UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal24;
        if (!this.booleanState0140) {
          if (!this.booleanState0147) {
            if (this.integerState0600 == 0) {
              integerLocal66 = 0;
            } else {
              if (this.integerState0600 != 1) {
                integerLocal66 = 2 + this.integerState0600 / 4;
                if (integerLocal66 > 4) {
                  integerLocal66 = 4;
                }
              } else {
                integerLocal66 = 1;
              }
            }
          } else {
            integerLocal66 = this.integerState0603;
            if (integerLocal66 > 4) {
              integerLocal66 = 4;
            }
          }
          integerLocal25 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0471;
          integerLocal26 = integerLocal66;
          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - integerLocal25 * 2;
          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - integerLocal26 * 2;
          UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal26;
          MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal25;
          if (!this.booleanState0147) {
            integerLocal90 = 3 + this.integerState0600 / 4;
            if (5 < integerLocal90) {
              integerLocal90 = 5;
            }
          } else {
            integerLocal90 = 3 + this.integerState0603;
            if (integerLocal90 > 7) {
              integerLocal90 = 7;
            }
          }
          integerLocal81 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0477;
          integerLocal86 = integerLocal90;
          MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal81;
          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - 2 * integerLocal81;
          UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal86;
          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - 2 * integerLocal86;
          integerLocal91 = -4 + this.mixedSupport028State0001.bucketBoardArrayState0001[0].dominoDescriptor * 7;
          integerLocal82 = this.integerState0615;
          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - integerLocal91 * 2;
          MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal91;
          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - integerLocal82 * 2;
          UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal82;
          if (this.booleanState0147) {
            integerLocal92 = this.integerState0603 / 2;
          } else {
            integerLocal92 = (this.integerState0600 < 2) ? 0 : 1;
          }
          integerLocal83 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0483;
          integerLocal87 = integerLocal92;
          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - integerLocal87 * 2;
          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - 2 * integerLocal83;
          MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal83;
          UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal87;
          if (!this.booleanState0147) {
            integerLocal84 = this.integerState0600;
            if (integerLocal84 > 16) {
              integerLocal84 = 16;
            }
            integerLocal93 = UiComponentPart024.integerArrayState0184[integerLocal84];
          } else {
            integerLocal93 = MixedSupport087.integerArrayState0165[this.integerState0603];
          }
          integerLocal85 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].dropIntervalTicks;
          integerLocal88 = integerLocal93;
          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - integerLocal88 * 2;
          MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal85;
          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - integerLocal85 * 2;
          UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal88;
        }
        integerLocal67 = 0;
        integerLocal68 = 0;
        integerLocal69 = 0;
        if (0 < this.integerState0609) {
          this.integerState0609 = this.integerState0609 - 1;
          if (this.integerState0609 < 150) {
            this.integerState0608 = this.integerState0608 + 1;
            integerLocal27 = this.integerState0609 + this.integerState0608;
            if (integerLocal27 - this.integerState0604 >= this.integerState0608) {
              integerLocal69 = 1;
            }
            integerLocal28 = integerLocal27 / 2;
            if (this.integerState0608 > integerLocal28 &&
              -this.integerState0619 + integerLocal27 >= this.integerState0608) {
              integerLocal68 = 1;
            }
            if (this.integerState0608 <= integerLocal28 - this.integerState0606) {
              integerLocal67 = 1;
            }
          }
        }
        if (integerLocal67 != 0 &&
          10 > this.integerState0606) {
          this.integerState0606 = this.integerState0606 + 1;
        }
        if (integerLocal68 != 0 &&
          this.integerState0619 < 10) {
          this.integerState0619 = this.integerState0619 + 1;
        }
        if (integerLocal67 == 0 &&
          this.integerState0606 > 0) {
          this.integerState0606 = this.integerState0606 - 1;
        }
        if (integerLocal69 != 0 &&
          this.integerState0604 < 10) {
          this.integerState0604 = this.integerState0604 + 1;
        }
        if (integerLocal68 == 0 &&
          this.integerState0619 > 0) {
          this.integerState0619 = this.integerState0619 - 1;
        }
        if (integerLocal69 == 0 &&
          this.integerState0604 > 0) {
          this.integerState0604 = this.integerState0604 - 1;
        }
        boolean frameRemainderLocal100 = true;
        boolean frameCompletedLocal101 = true;
        boolean frameCompletedLocal102 = true;
        boolean frameCompletedLocal103 = true;
        boolean frameCompletedLocal104 = true;
        boolean frameCompletedLocal105 = true;
        boolean frameCompletedLocal106 = true;
        boolean frameCompletedLocal107 = true;
        boolean frameCompletedLocal108 = true;
        boolean frameCompletedLocal109 = true;
        boolean frameCompletedLocal110 = true;
        boolean frameCompletedLocal111 = true;
        boolean frameCompletedLocal112 = true;
        boolean frameCompletedLocal113 = true;
        boolean frameCompletedLocal114 = true;
        boolean frameRemainderLocal115 = true;
        renderingSupport006Local53 = (RenderingSupport006) (this.nodeDequeState0024.computeHashNode1970((byte) 118));
        if (renderingSupport006Local53 != null) {
          if ((this.integerState0631 == 120) &&
            (frameRemainderLocal115 = (!(this.mixedSupport028State0001.booleanState0031) ||
            this.nodeDequeState0024.hashNodeState0009 != renderingSupport006Local53.previous))) {
            renderingSupport006Local53.performAction0161((byte) 126);
            this.integerState0631 = 0;
            while (true) {
              renderingSupport006Local55 = (RenderingSupport006) (this.nodeDequeState0024.computeHashNode1970((byte) -82));
              if (renderingSupport006Local55 == null) {
                if (this.booleanState0140) {
                  frameCompletedLocal101 = false;
                  break;
                }
                if (this.integerState0639 != 0) {
                  frameCompletedLocal102 = false;
                  break;
                }
                if (this.mixedSupport028State0001.booleanState0031) {
                  frameCompletedLocal103 = false;
                  break;
                }
                if (this.integerState0623 != 0) {
                  frameCompletedLocal104 = false;
                  break;
                }
                if (!this.booleanState0147) {
                  frameCompletedLocal105 = false;
                  break;
                }
                if (this.integerState0603 >= 4) {
                  frameCompletedLocal106 = false;
                  break;
                }
                this.integerState0614 = this.integerState0614 + 1;
                frameCompletedLocal107 = false;
                break;
              }
              if (!renderingSupport006Local55.booleanState0081) {
                if (this.booleanState0140) {
                  frameCompletedLocal108 = false;
                  break;
                }
                if (this.integerState0639 != 0) {
                  frameCompletedLocal109 = false;
                  break;
                }
                if (this.mixedSupport028State0001.booleanState0031) {
                  frameCompletedLocal110 = false;
                  break;
                }
                if (this.integerState0623 != 0) {
                  frameCompletedLocal111 = false;
                  break;
                }
                if (!this.booleanState0147) {
                  frameCompletedLocal112 = false;
                  break;
                }
                if (this.integerState0603 >= 4) {
                  frameCompletedLocal113 = false;
                  break;
                }
                this.integerState0614 = this.integerState0614 + 1;
                frameCompletedLocal114 = false;
                break;
              }
              if (renderingSupport006Local55.previous != this.nodeDequeState0024.hashNodeState0009) {
                renderingSupport006Local55.performAction0161((byte) 127);
                continue;
              }
              break;
            }
            if ((frameCompletedLocal101) &&
              (frameCompletedLocal102) &&
              (frameCompletedLocal103) &&
              (frameCompletedLocal104) &&
              (frameCompletedLocal105) &&
              (frameCompletedLocal106) &&
              (frameCompletedLocal107) &&
              (frameCompletedLocal108) &&
              (frameCompletedLocal109) &&
              (frameCompletedLocal110) &&
              (frameCompletedLocal111) &&
              (frameCompletedLocal112) &&
              (frameCompletedLocal113) &&
              (frameCompletedLocal114)) {
              if ((!(this.booleanState0140)) &&
                ((this.integerState0639 == 0)) &&
                (!(this.mixedSupport028State0001.booleanState0031)) &&
                ((this.integerState0623 == 0)) &&
                ((this.booleanState0147)) &&
                (!(this.integerState0603 >= 4))) {
                this.integerState0614 = this.integerState0614 + 1;
              }
              frameRemainderLocal100 = false;
            }
          }
          if ((frameRemainderLocal100) &&
            (frameRemainderLocal115) &&
            (frameCompletedLocal101) &&
            (frameCompletedLocal102) &&
            (frameCompletedLocal103) &&
            (frameCompletedLocal104) &&
            (frameCompletedLocal105) &&
            (frameCompletedLocal106) &&
            (frameCompletedLocal107) &&
            (frameCompletedLocal108) &&
            (frameCompletedLocal109) &&
            (frameCompletedLocal110) &&
            (frameCompletedLocal111) &&
            (frameCompletedLocal112) &&
            (frameCompletedLocal113) &&
            (frameCompletedLocal114)) {
            if (this.integerState0631 <= 0) {
              if (this.booleanState0145) {
                if ((!(this.booleanState0140)) &&
                  ((this.integerState0639 == 0)) &&
                  (!(this.mixedSupport028State0001.booleanState0031)) &&
                  ((this.integerState0623 == 0)) &&
                  ((this.booleanState0147)) &&
                  (!(this.integerState0603 >= 4))) {
                  this.integerState0614 = this.integerState0614 + 1;
                }
                frameRemainderLocal100 = false;
              }
              else {
                if (this.integerState0609 != 0) {
                  if ((!(this.booleanState0140)) &&
                    ((this.integerState0639 == 0)) &&
                    (!(this.mixedSupport028State0001.booleanState0031)) &&
                    ((this.integerState0623 == 0)) &&
                    ((this.booleanState0147)) &&
                    (!(this.integerState0603 >= 4))) {
                    this.integerState0614 = this.integerState0614 + 1;
                  }
                  frameRemainderLocal100 = false;
                }
              }
            }
            if (frameRemainderLocal100) {
              this.integerState0631 = this.integerState0631 + 1;
            }
          }
        }
        if ((frameRemainderLocal100) && (frameCompletedLocal101) && (frameCompletedLocal102) && (frameCompletedLocal103) && (frameCompletedLocal104) && (frameCompletedLocal105) && (frameCompletedLocal106) && (frameCompletedLocal107) && (frameCompletedLocal108) && (frameCompletedLocal109) && (frameCompletedLocal110) && (frameCompletedLocal111) && (frameCompletedLocal112) && (frameCompletedLocal113) && (frameCompletedLocal114) && (!this.booleanState0140 &&
          this.integerState0639 == 0 &&
          !this.mixedSupport028State0001.booleanState0031 &&
          this.integerState0623 == 0 &&
          this.booleanState0147 &&
          this.integerState0603 < 4)) {
          this.integerState0614 = this.integerState0614 + 1;
        }
        for (integerLocal28 = 0; this.mixedSupport028State0001.integerState0173 > integerLocal28; integerLocal28++) {
          bucketBoardLocal30 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal28];
          bucketBoardLocal56 = bucketBoardLocal30;
          bucketBoardLocal95 = bucketBoardLocal30;
          if (bucketBoardLocal30 == null) {
            if (0 < this.integerArrayState0187[integerLocal28] && (!(this.mixedSupport028State0001.integerState0168 <= 2) ||
              this.integerArrayState0187[integerLocal28] < 200)) {
              this.integerArrayState0187[integerLocal28] = this.integerArrayState0187[integerLocal28] - 1;
            }
            bucketBoardLocal96 = this.buckets[integerLocal28];
            if (bucketBoardLocal96 != null) {
              bucketBoardLocal96.performAction1099((ReturnedShapeCache) null, 127, true, (BucketBoard) null);
              bucketBoardLocal96.performAction1122(-21142);
              this.integerArrayState0189[integerLocal28] = this.integerArrayState0189[integerLocal28] + 1;
              if (this.integerArrayState0189[integerLocal28] == 75) {
                this.buckets[integerLocal28] = null;
                this.nodeDequeArrayState0001[integerLocal28] = null;
                this.nodeDequeArrayState0002[integerLocal28] = null;
                this.integerArrayArrayState0019[integerLocal28] = null;
              }
            }
          } else {
            if (bucketBoardLocal30.pieceAcknowledgement >= 0) {
              if (integerLocal28 != this.integerState0612) {
                integerLocal31 = 1 + this.mixedSupport079ArrayState0001[integerLocal28].integerState0420 / 20;
                for (integerLocal33 = 0; integerLocal33 < integerLocal31; integerLocal33++) {
                  this.computeBoolean1499(integerArgument1 ^ 30, integerLocal28);
                }
              } else {
                regionExit1: {
                  if (bucketBoardLocal30.booleanState0106 &&
                    this.integerState0639 == 0 &&
                    0 == this.integerState0623) {
                    if (this.booleanState0140) {
                      stackBucketBoardLocal7 = null;
                    } else {
                      stackBucketBoardLocal7 = bucketBoardLocal30;
                    }
                    bucketBoardLocal57 = stackBucketBoardLocal7;
                    bucketBoardLocal32 = bucketBoardLocal57;
                    bucketBoardLocal30.performAction1099(this.returnedShapeCache, 125, false, bucketBoardLocal57);
                    if (MixedSupport011.booleanState0010 &&
                      MixedSupport026.booleanState0029) {
                      this.performAction1505(0, -81, 255);
                    }
                    if (MixedSupport041.integerState0234 >= 2) {
                      this.performAction1505(1, 31, 254);
                    }
                    if (MixedSupport041.integerState0234 >= 3) {
                      this.performAction1505(2, integerArgument1 + 98, 253);
                    }
                    if (MixedSupport041.integerState0234 >= 7) {
                      this.performAction1505(3, 63, 252);
                    }
                    if (MixedSupport086.integerState0514 >= 2) {
                      this.performAction1505(4, -84, 251);
                    }
                    if (MixedSupport086.integerState0514 >= 3) {
                      this.performAction1505(5, -93, 250);
                    }
                    if (bucketBoardLocal30.integerState0491 >= 5) {
                      this.performAction1505(6, integerArgument1 ^ -65, 249);
                    }
                    if (bucketBoardLocal30.integerState0491 >= 10) {
                      this.performAction1505(7, 112, 248);
                    }
                    if (UiComponentPart024.booleanState0137) {
                      this.performAction1505(8, integerArgument1 ^ 109, 247);
                    }
                    if (!this.booleanState0140) {
                      if (!this.booleanState0147 ||
                        this.integerState0603 >= 4) {
                        this.integerState0614 = this.integerState0614 + bucketBoardLocal30.integerState0478;
                      }
                      bucketBoardLocal30.integerState0478 = 0;
                    }
                    if ((!(this.booleanState0140)) &&
                      (!(bucketBoardLocal30.booleanState0106))) {
                      if (2 <= bucketBoardLocal30.integerState0454 &&
                        this.mixedSupport028State0001.integerState0172 >= 2) {
                        integerLocal1 = bucketBoardLocal30.integerState0486;
                        bucketBoardLocal30.integerState0486 = bucketBoardLocal30.integerState0486 + 1;
                        returnedShapeLocal59 = new ReturnedShape(integerLocal1);
                        integerLocal35 = 1;
                        if (bucketBoardLocal30.integerState0454 >= 4) {
                          integerLocal35 = 2;
                        }
                        integerLocal39 = 1;
                        if (bucketBoardLocal30.integerState0454 >= 7) {
                          integerLocal39 = 2;
                        }
                        byteArrayLocal65 = new byte[integerLocal35 * integerLocal39];
                        byteArrayLocal58 = byteArrayLocal65;
                        byteArrayLocal42 = byteArrayLocal58;
                        for (integerLocal43 = 0; integerLocal43 < byteArrayLocal65.length; integerLocal43++) {
                          byteArrayLocal42[integerLocal43] = (byte)this.mixedSupport028State0001.computeInteger0442(6);
                        }
                        returnedShapeLocal59.width = integerLocal35;
                        returnedShapeLocal59.packedCells = byteArrayLocal42;
                        returnedShapeLocal59.height = integerLocal39;
                        bucketBoardLocal30.performAction1100(returnedShapeLocal59, (byte) -126);
                      }
                      if (!(bucketBoardLocal30.livesRemaining <= 0)) {
                        integerLocal33 = this.computeInteger1497((byte) 114);
                        if (integerLocal33 > 0) {
                          stackIntegerLocal8 = (this.integerState0614 >= integerLocal33) ? 1 : 0;
                        } else {
                          stackIntegerLocal8 = 0;
                        }
                        integerLocal35 = stackIntegerLocal8;
                        if ((integerLocal35 != 0)) {
                          this.booleanState0148 = true;
                          MixedSupport095.booleanState0124 = true;
                          if (!this.booleanState0149) {
                            bucketBoardLocal30.performAction1101(false);
                          } else {
                            if (this.booleanState0147) {
                              bucketBoardLocal30.performAction1101(false);
                            } else {
                              if (-1 + UiComponentPart028.stringArrayState0040.length > this.integerState0600) {
                                integerLocal99 = -1;
                                if (this.booleanState0144 &&
                                  this.integerState0600 == 2) {
                                  integerLocal99 = 1;
                                  UiComponentPart013.booleanState0066 = true;
                                }
                                this.performAction1500(0, integerLocal99, this.integerState0600 + 1);
                              }
                              bucketBoardLocal30.performAction1101(false);
                            }
                          }
                        }
                      }
                    }
                    break regionExit1;
                  }
                  if (!this.mixedSupport028State0001.booleanState0031 &&
                    !bucketBoardLocal30.landed &&
                    bucketBoardLocal30.livesRemaining > 0 &&
                    this.integerState0639 == 0 &&
                    this.integerState0623 == 0 &&
                    this.integerState0609 == 0) {
                    integerLocal31 = 0;
                    if (booleanArgument2) {
                      if (MixedSupport011.booleanArrayState0002[96]) {
                        integerLocal31++;
                      }
                      if (MixedSupport011.booleanArrayState0002[97]) {
                        integerLocal31 += 2;
                      }
                      if (MixedSupport011.booleanArrayState0002[NetworkSupport008.integerState0558]) {
                        integerLocal31 += 4;
                      }
                      if (MixedSupport011.booleanArrayState0002[MixedSupport139.integerState0821] ||
                        MixedSupport011.booleanArrayState0002[98] ||
                        MixedSupport011.booleanArrayState0002[83]) {
                        integerLocal31 += 8;
                      }
                      if (MixedSupport011.booleanArrayState0002[99]) {
                        integerLocal31 += 16;
                      }
                    }
                    bucketBoardLocal30.applyControls(integerLocal31, integerArgument1 - 1674843009);
                    if (this.booleanState0140) {
                      integerLocal2 = this.integerState0601;
                      this.integerState0601 = this.integerState0601 + 1;
                      this.byteArrayState0022[integerLocal2] = (byte)integerLocal31;
                      if ((this.integerState0601 == 20 ||
                        bucketBoardLocal30.landed)) {
                        SocketFactory.cipherPacketBufferState0002.performAction1861(60, integerArgument1 ^ -2);
                        SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 1;
                        integerLocal33 = SocketFactory.cipherPacketBufferState0002.position;
                        SocketFactory.cipherPacketBufferState0002.performAction2073(true, this.integerState0601);
                        SocketFactory.cipherPacketBufferState0002.performAction1869(integerArgument1 ^ 61);
                        for (integerLocal35 = 0; this.integerState0601 > integerLocal35; integerLocal35++) {
                          SocketFactory.cipherPacketBufferState0002.performAction1858(5, 0, (int) this.byteArrayState0022[integerLocal35]);
                        }
                        SocketFactory.cipherPacketBufferState0002.performAction1866(integerArgument1 + 18);
                        SocketFactory.cipherPacketBufferState0002.performAction2079(-integerLocal33 + SocketFactory.cipherPacketBufferState0002.position, true);
                        this.integerState0601 = 0;
                      }
                      break regionExit1;
                    }
                    if (bucketBoardLocal30.landed) {
                      if (bucketBoardLocal30.integerState0465 <= 0) {
                        returnedShapeLocal34 = Sprite.computeReturnedShape1056(0, 0, bucketBoardLocal30.dominoDescriptor);
                        integerLocal35 = bucketBoardLocal30.computeInteger1117(26580);
                      } else {
                        returnedShapeLocal34 = bucketBoardLocal30.computeReturnedShape1104(integerArgument1 - 19941);
                        integerLocal35 = bucketBoardLocal30.dominoDescriptor;
                      }
                      stackBucketBoardLocal9 = bucketBoardLocal30;
                      stackIntegerLocal10 = bucketBoardLocal30.integerState0484;
                      stackIntegerLocal11 = 127;
                      stackBooleanLocal12 = (this.integerState0612 == integerLocal28);
                      ((BucketBoard) (Object) stackBucketBoardLocal9).finalizePiecePlacement(stackIntegerLocal10, (byte) stackIntegerLocal11, stackBooleanLocal12);
                      if (bucketBoardLocal30.livesRemaining > 0) {
                        bucketBoardLocal30.performAction1095(integerArgument1 ^ 98, integerLocal35, returnedShapeLocal34);
                        this.integerState0615 = -4 + integerLocal35 * 7;
                      }
                    }
                  }
                }
                if (!this.booleanState0140 &&
                  this.booleanState0147) {
                  integerLocal31 = bucketBoardLocal30.computeInteger1087(0);
                  if (integerLocal31 >= 50000) {
                    this.performAction1505(15, integerArgument1 ^ 84, 240);
                  }
                  if (100000 <= integerLocal31) {
                    this.performAction1505(16, integerArgument1 ^ 62, 239);
                  }
                  if (integerLocal31 >= 200000) {
                    this.performAction1505(17, integerArgument1 - 107, 238);
                  }
                  if (integerLocal31 >= 50000 &&
                    this.integerState0603 < 2) {
                    this.performAction1505(23, -101, 232);
                  }
                }
              }
              bucketBoardLocal30.performAction1122(-21142);
              this.performAction1496(true, bucketBoardLocal30, 600, 200, bucketBoardLocal30.livesRemaining, integerLocal28, true);
              if (bucketBoardLocal30.livesRemaining == 0 &&
                null != this.nodeDequeArrayState0002[integerLocal28]) {
                this.integerArrayState0189[integerLocal28] = this.integerArrayState0189[integerLocal28] + 1;
                if (this.integerArrayState0189[integerLocal28] == 75) {
                  this.nodeDequeArrayState0002[integerLocal28] = null;
                }
              }
            }
          }
        }
        integerLocal28 = 0;
        if (this.booleanState0148 &&
          !this.booleanState0145) {
          if (this.booleanState0147) {
            if (UiComponentPart015.integerState0319 == this.integerState0603 &&
              !this.booleanState0139) {
              MixedSupport069.nodeDequeState0011.performAction1963(new MixedSupport038(0, this.integerState0603, MixedSupport035.integerState0220, UiComponentPart013.integerState0275, UiComponentPart028.integerState0716, MixedSupport039.integerState0232), 2777);
              UiComponentPart015.integerState0319 = UiComponentPart015.integerState0319 + 1;
              this.nodeDequeState0024.performAction1963(new RenderingSupport006(RenderingSupport015.stringState0524, 9, false), 2777);
            }
            this.integerState0603 = this.integerState0603 + 1;
            MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 50;
            UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 + 50;
            UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - 50;
            MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 50;
            if (this.integerState0603 == 4) {
              this.performAction1505(12, integerArgument1 ^ 62, 243);
            }
            if (this.integerState0603 == 6) {
              this.performAction1505(13, integerArgument1 - 84, 242);
            }
            if (this.integerState0603 == 7) {
              this.performAction1505(14, -61, 241);
            }
            this.integerState0642 = this.mixedSupport028State0001.integerState0166;
            this.integerState0623 = 38;
            this.mixedSupport028State0001.integerState0166 = this.integerState0603;
            this.integerState0614 = 0;
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0483 = this.integerState0603 / 2;
            integerLocal29 = 3 + this.integerState0603;
            if (7 < integerLocal29) {
              integerLocal29 = 7;
            }
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0477 = integerLocal29;
            integerLocal71 = this.integerState0603;
            if (integerLocal71 > 4) {
              integerLocal71 = 4;
            }
            cachedBucketBoardLocal3 = this.mixedSupport028State0001.bucketBoardArrayState0001[0];
            cachedBucketBoardLocal3.integerState0471 = integerLocal71;
            this.mixedSupport028State0001.integerState0172 = integerLocal71;
            this.integerState0607 = this.integerState0603;
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].selectDropSpeed(this.integerState0603, 2113050941, false);
            this.booleanState0148 = false;
          } else {
            if (this.integerState0600 < 3 &&
              this.integerState0600 == UiComponentPart015.integerState0319 &&
              !this.booleanState0139) {
              MixedSupport069.nodeDequeState0011.performAction1963(new MixedSupport038(0, this.integerState0600, MixedSupport035.integerState0220, UiComponentPart013.integerState0275, UiComponentPart028.integerState0716, MixedSupport039.integerState0232), 2777);
              UiComponentPart015.integerState0319 = UiComponentPart015.integerState0319 + 1;
              this.nodeDequeState0024.performAction1963(new RenderingSupport006(RenderingSupport015.stringState0524, 9, false), 2777);
            }
            this.integerState0623 = 38;
            this.integerState0642 = this.mixedSupport028State0001.integerState0166;
            MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 50;
            UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 + 50;
            UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - 50;
            MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 50;
            this.integerState0600 = this.integerState0600 + 1;
            integerLocal29 = 3;
            if (integerLocal29 < UiComponentPart015.integerState0319) {
              integerLocal29 = UiComponentPart015.integerState0319;
            }
            if (2 > this.integerState0600) {
              this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0483 = 0;
            } else {
              this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0483 = 1;
            }
            this.integerState0614 = 0;
            this.mixedSupport028State0001.integerState0166 = this.integerState0600 % (integerLocal29 + 1);
            integerLocal71 = this.integerState0600 / 4 + 3;
            if (integerLocal71 > 5) {
              integerLocal71 = 5;
            }
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0477 = integerLocal71;
            if (this.integerState0600 != 0) {
              if (this.integerState0600 != 1) {
                integerLocal73 = this.integerState0600 / 4 + 2;
                if (integerLocal73 > 4) {
                  integerLocal73 = 4;
                }
              } else {
                integerLocal73 = 1;
              }
            } else {
              integerLocal73 = 0;
            }
            cachedBucketBoardLocal4 = this.mixedSupport028State0001.bucketBoardArrayState0001[0];
            cachedBucketBoardLocal4.integerState0471 = integerLocal73;
            this.mixedSupport028State0001.integerState0172 = integerLocal73;
            integerLocal97 = this.integerState0600;
            if (integerLocal97 > 16) {
              integerLocal97 = 16;
              cachedBucketBoardLocal5 = this.mixedSupport028State0001.bucketBoardArrayState0001[0];
              cachedBucketBoardLocal5.integerState0484 = cachedBucketBoardLocal5.integerState0484 + 1;
            }
            this.integerState0607 = integerLocal97;
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].selectDropSpeed(integerLocal97, 2113050941, true);
            this.booleanState0148 = false;
          }
          integerLocal28 = 1;
        }
        integerLocal70 = this.integerState0617;
        integerLocal72 = this.integerState0620;
        while (this.integerState0605 < integerLocal72) {
          integerLocal72--;
          if (~integerLocal72 != ~this.integerState0605 &&
            null == this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal72 % this.mixedSupport028State0001.integerState0173]) {
            continue;
          }
          integerLocal70 += 1024;
        }
        while (this.integerState0605 > integerLocal72) {
          integerLocal72++;
          if (~integerLocal72 != ~this.integerState0605 &&
            this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal72 % this.mixedSupport028State0001.integerState0173] == null) {
            continue;
          }
          integerLocal70 -= 1024;
        }
        boolean frameCompletedLocal116 = true;
        integerLocal74 = integerLocal70 * 31 / 32 - integerLocal70;
        if (this.integerState0617 == 0 &&
          integerLocal74 > 0) {
          this.integerState0616 = this.integerState0620;
          while (true) {
            this.integerState0616 = this.integerState0616 + 1;
            if (this.integerState0605 == this.integerState0616) {
              break;
            }
            if (this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0616 % this.mixedSupport028State0001.integerState0173] == null) {
              continue;
            }
            this.integerState0617 = this.integerState0617 + integerLocal74;
            frameCompletedLocal116 = false;
            break;
          }
        }
        if (frameCompletedLocal116) {
          this.integerState0617 = this.integerState0617 + integerLocal74;
        }
        while (true) {
          if (this.integerState0617 < 0) {
            this.integerState0616 = this.integerState0620;
            do {
              this.integerState0620 = this.integerState0620 - 1;
            } while (this.integerState0620 != this.integerState0605 &&
              null == this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0620 % this.mixedSupport028State0001.integerState0173]);
            this.integerState0617 = this.integerState0617 + 1024;
            continue;
          }
          break;
        }
        while (true) {
          if (this.integerState0617 >= 1024) {
            this.integerState0620 = this.integerState0616;
            do {
              this.integerState0616 = this.integerState0616 + 1;
            } while (this.integerState0616 != this.integerState0605 &&
              this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0616 % this.mixedSupport028State0001.integerState0173] == null);
            this.integerState0617 = this.integerState0617 - 1024;
            continue;
          }
          break;
        }
        if (this.mixedSupport028State0001.integerState0168 <= integerArgument1 &&
          this.integerState0602 > 0) {
          this.integerState0602 = this.integerState0602 - 1;
        }
        while (this.mixedSupport028State0001.integerState0173 <= this.integerState0620) {
          if (this.integerState0605 >= this.mixedSupport028State0001.integerState0173 &&
            this.integerState0616 >= this.mixedSupport028State0001.integerState0173) {
            this.integerState0620 = this.integerState0620 - this.mixedSupport028State0001.integerState0173;
            this.integerState0616 = this.integerState0616 - this.mixedSupport028State0001.integerState0173;
            this.integerState0605 = this.integerState0605 - this.mixedSupport028State0001.integerState0173;
            continue;
          }
          break;
        }
        if (!this.booleanState0140) {
          this.integerState0637 = this.integerState0637 + 1;
          nodeDequeLocal36 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].nodeDequeState0018;
          hashNodeLocal37 = nodeDequeLocal36.hashNodeState0009.next;
          while (hashNodeLocal37 != nodeDequeLocal36.hashNodeState0009) {
            if (((MixedSupport117) (hashNodeLocal37)).integerState0723 == 0) {
              hashNodeLocal37 = hashNodeLocal37.next;
              continue;
            }
            break;
          }
          integerLocal40 = 50 + this.integerState0637;
          if (nodeDequeLocal36.hashNodeState0009 != hashNodeLocal37) {
            integerLocal79 = 5 + ((MixedSupport117) (hashNodeLocal37)).integerState0723;
            if (integerLocal40 < integerLocal79) {
              integerLocal40 = integerLocal79;
            }
          }
          while (true) {
            hashNodeLocal37 = hashNodeLocal37.previous;
            if (hashNodeLocal37 != nodeDequeLocal36.hashNodeState0009) {
              mixedSupport117Local61 = (MixedSupport117) (hashNodeLocal37);
              mixedSupport117Local61.integerState0723 = integerLocal40;
              mixedSupport117Local61.integerState0727 = this.integerState0637;
              if (16 != (24 & mixedSupport117Local61.integerState0729)) {
                if ((mixedSupport117Local61.integerState0729 & 24) != 8) {
                  if (24 == (mixedSupport117Local61.integerState0729 & 24)) {
                    mixedSupport117Local61.rgbSpriteState0053 = MixedSupport127.computeRgbSprite1815(true, mixedSupport117Local61.integerState0729 & 7);
                  }
                } else {
                  mixedSupport117Local61.rgbSpriteState0053 = RenderingSupport002.computeRgbSprite0262(this.mixedSupport028State0001.integerState0166, 7 & mixedSupport117Local61.integerState0729, 0);
                }
              } else {
                mixedSupport117Local61.rgbSpriteState0053 = MixedSupport035.rgbSpriteArrayArrayState0006[this.mixedSupport028State0001.integerState0166][mixedSupport117Local61.integerState0729 & 7];
              }
              integerLocal40 += 5;
              continue;
            }
            break;
          }
          while (true) {
            cachedMixedSupport117Local6 = (MixedSupport117) (nodeDequeLocal36.computeHashNode1970((byte) -123));
            mixedSupport117Local51 = cachedMixedSupport117Local6;
            objectLocal44 = cachedMixedSupport117Local6;
            if (mixedSupport117Local51 != null &&
              this.integerState0637 >= mixedSupport117Local51.integerState0723) {
              this.integerState0599 = this.integerState0599 + mixedSupport117Local51.integerState0730;
              mixedSupport117Local51.performAction0161((byte) 124);
              continue;
            }
            break;
          }
          mixedSupport117Local62 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].mixedSupport117State0001;
          if (mixedSupport117Local62 != null) {
            mixedSupport117Local62.integerState0725 = mixedSupport117Local62.integerState0725 - 10;
          }
        }
        integerLocal98 = this.integerState0605;
        if (this.mixedSupport028State0001.integerState0168 == 2 &&
          this.integerState0612 >= 0) {
          integerLocal98 = this.integerState0612;
        }
        bucketBoardLocal63 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal98 % this.mixedSupport028State0001.integerState0173];
        bucketBoardLocal38 = bucketBoardLocal63;
        if (!this.mixedSupport028State0001.booleanState0031 &&
          bucketBoardLocal38 != null &&
          bucketBoardLocal63.livesRemaining > 0) {
          integerLocal75 = -1;
          objectLocal94 = null;
          if (this.booleanState0140) {
            for (integerLocal45 = 1; integerLocal45 < this.mixedSupport028State0001.integerState0173; integerLocal45++) {
              bucketBoardLocal64 = this.mixedSupport028State0001.bucketBoardArrayState0001[(integerLocal98 + integerLocal45) % this.mixedSupport028State0001.integerState0173];
              bucketBoardLocal46 = bucketBoardLocal64;
              if (bucketBoardLocal46 != null &&
                0 < bucketBoardLocal64.livesRemaining) {
                integerLocal75 = (integerLocal45 + integerLocal98) % this.mixedSupport028State0001.integerState0173;
                objectLocal94 = bucketBoardLocal46;
                break;
              }
            }
          }
          integerLocal89 = MixedSupport033.computeInteger0546(bucketBoardLocal63, (BucketBoard) (objectLocal94), this.integerState0641, (byte) -119);
          if ((0 > this.integerState0612 ||
            bucketBoardLocal38 == null ||
            0 == bucketBoardLocal63.livesRemaining) && this.mixedSupport028State0001.integerState0168 == 2) {
            integerLocal47 = MixedSupport033.computeInteger0546((BucketBoard) (objectLocal94), bucketBoardLocal63, this.integerState0641, (byte) -119);
            if (integerLocal47 > integerLocal89) {
              integerLocal89 = integerLocal47;
            }
            if (integerLocal89 == 3) {
              integerLocal89 = 2;
            }
          }
          if (integerLocal89 == 3 &&
            this.integerState0641 != 3) {
            stringLocal48 = this.mixedSupport028State0001.stringArrayState0009[integerLocal75];
            this.nodeDequeState0024.performAction1963(new RenderingSupport006(CollectionSupport001.computeString0336(108, MixedSupport101.stringState0409, new String[]{stringLocal48}), 8, true), integerArgument1 + 2775);
          }
          if (this.booleanState0140 &&
            this.integerState0607 == 10) {
            musicTrackArrayLocal49 = MixedSupport030.musicTrackArrayState0001;
          } else {
            musicTrackArrayLocal49 = MixedSupport118.musicTrackArrayArrayState0001[this.mixedSupport028State0001.integerState0166];
          }
          if (integerLocal28 != 0) {
            MixedSupport092.performAction1301(this.computeInteger1502(true), musicTrackArrayLocal49[integerLocal89], true);
          } else {
            MixedSupport095.performAction1312(this.computeInteger1502(true), musicTrackArrayLocal49[integerLocal89], (byte) 118);
          }
          this.integerState0641 = integerLocal89;
        }
        if (this.booleanState0140) {
          GameDomainSupport003.stringState0236 = MixedSupport074.stringState0314;
          if (this.integerState0612 < 0) {
            stackBooleanLocal13 = UiComponentPart021.booleanState0128;
          } else {
            stackBooleanLocal13 = CollectionSupport003.booleanState0122;
          }
          integerLocal76 = stackBooleanLocal13 ? 1 : 0;
          if (integerLocal76 == 0) {
            if (MixedSupport010.integerState0067 > 1) {
              GameDomainSupport003.stringState0236 = CollectionSupport001.computeString0336(96, InputAdapter005.stringState0445, new String[]{Integer.toString(MixedSupport010.integerState0067)});
            } else {
              if (MixedSupport010.integerState0067 != 1) {
                GameDomainSupport003.stringState0236 = SceneWidgetPart012.stringState0531;
              } else {
                GameDomainSupport003.stringState0236 = MixedSupport079.stringState0324;
              }
            }
          }
          integerLocal80 = MixedSupport001.renderingSupport010State0001.computeInteger1208(GameDomainSupport003.stringState0236);
          MixedSupport130.integerState0788 = integerLocal80 + 32;
        }
        if (this.booleanState0140) {
          if (booleanArgument2) {
            if (0 <= this.integerState0612 &&
              LoginCredentials.booleanState0085) {
              TextLineMetrics.booleanState0119 = false;
            } else {
              TextLineMetrics.booleanState0119 = false;
              if (this.integerState0602 >= 50) {
                stackIntegerLocal14 = 0;
              } else {
                stackIntegerLocal14 = 320 - MixedSupport130.integerState0788 / 2;
              }
              integerLocal77 = stackIntegerLocal14;
              if (HashNode.integerState0069 >= integerLocal77 &&
                HashNode.integerState0069 < integerLocal77 + MixedSupport130.integerState0788 &&
                RichTextLayout.sceneWidgetState0021.integerState0903 - 28 <= MixedSupport106.integerState0590 &&
                RichTextLayout.sceneWidgetState0021.integerState0903 > MixedSupport106.integerState0590) {
                TextLineMetrics.booleanState0119 = true;
              }
              if (SceneWidgetPart005.integerState0328 != 0 &&
                integerLocal77 <= UiComponentPart013.integerState0276 &&
                MixedSupport130.integerState0788 + integerLocal77 > UiComponentPart013.integerState0276 &&
                -28 + RichTextLayout.sceneWidgetState0021.integerState0903 <= TextLineMetrics.integerState0535 &&
                RichTextLayout.sceneWidgetState0021.integerState0903 > TextLineMetrics.integerState0535) {
                if (this.integerState0612 < 0) {
                  stackBooleanLocal16 = !(UiComponentPart021.booleanState0128);
                  UiComponentPart021.booleanState0128 = stackBooleanLocal16;
                } else {
                  stackBooleanLocal15 = !(CollectionSupport003.booleanState0122);
                  CollectionSupport003.booleanState0122 = stackBooleanLocal15;
                }
              }
            }
          } else {
            TextLineMetrics.booleanState0119 = false;
          }
        } else {
          TextLineMetrics.booleanState0119 = false;
        }
        if (this.mixedSupport028State0001.booleanState0031) {
          if (!this.booleanState0140 &&
            this.integerState0630 >= 60 &&
            this.integerState0640 > 1) {
            this.integerState0640 = this.integerState0640 - 1;
          }
          if (this.integerState0630 < 60) {
            renderingSupport006Local41 = (RenderingSupport006) (this.nodeDequeState0024.computeHashNode1969(true));
            if (null == this.nodeDequeState0024.computeHashNode1972(true)) {
              if (this.booleanState0140) {
                if (0 == this.integerState0630) {
                  stackIntegerLocal17 = integerArgument1 ^ 88;
                  stackBooleanLocal18 = false;
                  if (this.integerState0612 >= 0) {
                    stackObjectLocal19 = this;
                    stackBooleanLocal20 = false;
                  } else {
                    stackObjectLocal19 = this;
                    stackBooleanLocal20 = true;
                  }
                  this.renderingSupport008State0008 = MixedSupport152.computeRenderingSupport0082021(stackIntegerLocal17, stackBooleanLocal18, stackBooleanLocal20);
                }
                if (this.integerState0630 >= 40) {
                  this.renderingSupport008State0008.integerState0365 = this.renderingSupport008State0008.integerState0365 + 16;
                  this.renderingSupport008State0008.integerState0363 = this.renderingSupport008State0008.integerState0363 + 1;
                }
              }
              this.integerState0630 = this.integerState0630 + 1;
              stackRenderingSupport006Local21 = renderingSupport006Local41;
              if (this.booleanState0140) {
                stackIntegerLocal22 = 19;
              } else {
                stackIntegerLocal22 = 16;
              }
              stackRenderingSupport006Local21.integerState0334 = stackIntegerLocal22 * this.integerState0630 / 4;
            }
          }
        }
        if (null != this.renderingSupport008State0008) {
          if (booleanArgument2) {
            this.renderingSupport008State0008.performAction0976(RichTextLayout.sceneWidgetState0021.integerState0903 / 2, 122);
          }
          this.renderingSupport008State0008.performAction1000((byte) 114);
        }
        if (this.booleanState0145 &&
          50 > this.integerState0644) {
          this.integerState0644 = this.integerState0644 + 1;
        }
        if (this.booleanState0145 &&
          this.integerState0639 < 50) {
          this.integerState0639 = this.integerState0639 + 1;
        }
        if (!this.booleanState0145 &&
          this.integerState0644 > 0) {
          this.integerState0644 = this.integerState0644 - 1;
        }
        if (!this.booleanState0145 &&
          0 < this.integerState0639) {
          this.integerState0639 = this.integerState0639 - 1;
        }
        if (50 == this.integerState0644) {
          this.integerState0628 = this.integerState0628 + 1;
          if (this.integerState0628 >= 140) {
            this.integerState0628 = 0;
          }
          this.performAction1472((byte) -107);
          if (this.integerState0628 % 20 == 0) {
            this.performAction1510(false);
          }
        }
        if (SceneWidgetPart005.integerState0328 != 0 &&
          this.mixedSupport028State0001.booleanState0031 &&
          !this.booleanState0140) {
          this.performAction1503((byte) -13);
          MixedSupport007.booleanState0005 = false;
          MixedSupport140.performAction1901((byte) 96);
          ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080548(false, false, 0, false, this.booleanState0147, 32357, false, false);
          MixedSupport023.performAction0373(false, 95);
          return true;
        }
        if (SceneWidgetPart005.integerState0328 != 0 &&
          this.booleanState0145) {
          if (this.integerState0646 >= 0) {
            this.performAction1500(0, -1, this.integerState0624);
          } else {
            if (this.booleanState0147 &&
              this.integerState0624 < -1 + MixedSupport137.stringArrayState0050.length) {
              this.performAction1500(0, -1, 1 + this.integerState0624);
            } else {
              this.booleanState0145 = false;
            }
          }
        }
        if (this.integerState0623 > 0 &&
          this.integerState0639 == 0) {
          this.integerState0623 = this.integerState0623 - 1;
        }
        if (this.booleanState0140) {
          return false;
        }
        this.booleanState0146 = false;
        if (this.integerState0643 != -3) {
          this.booleanState0146 = true;
          this.integerState0629 = this.integerState0643;
        } else {
          if (this.booleanState0149) {
            stackBucketBoardLocal23 = this.mixedSupport028State0001.bucketBoardArrayState0001[0];
            integerLocal78 = ((BucketBoard) (Object) stackBucketBoardLocal23).computeInteger1113(-65);
            if (integerLocal78 < 0) {
              if (!this.booleanState0147 &&
                this.mixedSupport028State0001.bucketBoardArrayState0001[0].computeBoolean1118(-22477)) {
                this.integerState0629 = -2;
                this.booleanState0146 = true;
              } else {
                if (!this.booleanState0147 &&
                  this.integerState0600 == 0 &&
                  !this.booleanState0148) {
                  this.integerState0629 = -1;
                  this.booleanState0146 = true;
                }
              }
            } else {
              this.booleanState0146 = true;
              this.integerState0629 = integerLocal78;
            }
          }
        }
        if (this.booleanState0146 &&
          20 > this.integerState0633) {
          this.integerState0633 = this.integerState0633 + 1;
        }
        if (!this.booleanState0146 &&
          this.integerState0633 > 0) {
          this.integerState0633 = this.integerState0633 - 1;
        }
        return false;
    }

    final static void performAction1479(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (0 > MixedSupport046.integerState0250) {
          return;
        }
        if (integerArgument3 != 19759) {
          return;
        }
        integerLocal1 = -135 + integerArgument2;
        integerLocal2 = -35 + integerArgument1;
        integerLocal3 = 256;
        if (75 > MixedSupport046.integerState0250) {
          integerLocal3 = (MixedSupport046.integerState0250 << 8) / 75;
        }
        if (200 < MixedSupport046.integerState0250) {
          integerLocal3 = (250 - MixedSupport046.integerState0250 << 8) / 50;
        }
        RenderingSupport015.performAction1778(true, MixedSupport155.rgbSpriteState0077);
        MixedSupport109.performAction1539();
        SoftwareRaster.performAction0727();
        GameplayControls.performAction1977(0);
        if (256 > integerLocal3) {
          SoftwareRaster.performAction0720(0, 0, SoftwareRaster.integerState0285, SoftwareRaster.integerState0284, 0, 256 - integerLocal3);
        }
        MixedSupport086.performAction1200((byte) -5);
        if (MixedSupport046.integerState0250 >= 150) {
          CodecSupport003.rgbSpriteState0051.performAction0301(15 + integerLocal1, 10 + integerLocal2, integerLocal3);
        } else {
          MixedSupport155.rgbSpriteState0077.performAction0307(integerLocal1, integerLocal2);
        }
        integerLocal4 = -125 + MixedSupport046.integerState0250;
        if (integerLocal4 > 0 &&
          integerLocal4 < 50) {
          if (integerLocal4 >= 20) {
            if (integerLocal4 < 30) {
              UiComponentPart025.rgbSpriteState0045.performAction0317(integerLocal1, integerLocal2, 256);
            } else {
              integerLocal5 = 256 * (-integerLocal4 + 50) / 20;
              UiComponentPart025.rgbSpriteState0045.performAction0317(integerLocal1, integerLocal2, integerLocal5);
            }
          } else {
            integerLocal5 = integerLocal4 * 256 / 20;
            UiComponentPart025.rgbSpriteState0045.performAction0317(integerLocal1, integerLocal2, integerLocal5);
          }
        }
        integerLocal7 = -140 + MixedSupport046.integerState0250;
        if (integerLocal7 > 0) {
          integerLocal8 = 256;
          if (integerLocal7 < 20) {
            integerLocal8 = 256 * integerLocal7 / 20;
          }
          MixedSupport110.rgbSpriteState0046.performAction0301(15 + integerLocal1, 10 + integerLocal2, integerLocal3 * integerLocal8 >> 8);
        }
        return;
    }

    final void performAction1503(byte byteArgument1) {
        if (this.booleanState0140) {
          throw new IllegalStateException();
        }
        if (!this.mixedSupport028State0001.booleanState0031) {
          this.performAction1506(false);
        }
        int integerLocal1 = -76 / ((byteArgument1 - 52) / 48);
    }

    private final void performAction1508(int integerArgument1) {
        SoftwareRaster.performAction0720(0, 0, 640, 480, 65793, this.integerState0630 << 1);
        int integerLocal1 = -(240 * this.integerState0630 * this.integerState0630 / 3600) + 240;
        SoftwareRaster.performAction0720(175, 180 + integerLocal1, 290, 180, 0, 180);
        GameplayControls.performAction1978(200, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 310, 170 + integerLocal1, 165);
        int integerLocal2 = this.integerState0640;
        int integerLocal3 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0466 / integerLocal2;
        int integerLocal4 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0464 / integerLocal2;
        int integerLocal5 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0475 / integerLocal2;
        int integerLocal6 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0488 / integerLocal2;
        int integerLocal7 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0450 / integerLocal2;
        int integerLocal8 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0494 / integerLocal2;
        int integerLocal9 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0493 / integerLocal2;
        MixedSupport042.performAction0595(integerLocal1 + 200, 256, 16694016, MixedSupport128.stringState0530, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 200, Integer.toString(integerLocal3), 16777215, 455);
        MixedSupport042.performAction0595(integerLocal1 + 220, 256, 16694016, UiComponentPart030.stringState0519, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 220, Integer.toString(integerLocal4), 16777215, 455);
        MixedSupport042.performAction0595(integerLocal1 + 240, 256, 16694016, MixedSupport061.stringState0256, 185, SceneWidget.renderingSupport010State0007);
        if (integerArgument1 != 24) {
          return;
        }
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 240, Integer.toString(integerLocal5), 16777215, 455);
        MixedSupport042.performAction0595(integerLocal1 + 260, integerArgument1 ^ 280, 16694016, MixedSupport066.stringState0272, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 260, Integer.toString(integerLocal6), 16777215, 455);
        MixedSupport042.performAction0595(280 + integerLocal1, 256, 16694016, MixedSupport155.stringState0635, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 280, Integer.toString(integerLocal7), 16777215, 455);
        MixedSupport042.performAction0595(integerLocal1 + 300, integerArgument1 ^ 280, 16694016, MixedSupport099.stringState0397, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, 300 + integerLocal1, Integer.toString(integerLocal8), 16777215, 455);
        MixedSupport042.performAction0595(320 + integerLocal1, 256, 16694016, UiComponentPart025.stringState0449, 185, SceneWidget.renderingSupport010State0007);
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal1 + 320, Integer.toString(integerLocal9), 16777215, 455);
        SoftwareRaster.performAction0719(183, 327 + integerLocal1, 274, 7, 0);
        SoftwareRaster.performAction0719(185, integerLocal1 + 329, 270, 3, 16777215);
        MixedSupport042.performAction0595(350 + integerLocal1, 256, 16694016, InputAdapter004.stringState0357, 185, SceneWidget.renderingSupport010State0007);
        int integerLocal10 = integerLocal9 + integerLocal7 + integerLocal4 + (integerLocal3 - (-integerLocal5 - integerLocal6 - integerLocal8));
        MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, 350 + integerLocal1, Integer.toString(integerLocal10), 16777215, 455);
        MixedSupport029.performAction0447(16777215, 320, MixedSupport006.stringState0029, integerLocal1 + 390, (byte) 75, SceneWidget.renderingSupport010State0007);
    }

    final void performAction1484(int integerArgument1, BucketBoard bucketBoardArgument2, int integerArgument3) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int integerLocal6 = 0;
        String cachedStringLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        NodeDeque nodeDequeLocal14 = null;
        int[] integerArrayLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        AnimatedTileRegion animatedTileRegionLocal21 = null;
        String stringLocal22 = null;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int integerLocal33 = 0;
        String stringLocal34 = null;
        int[] integerArrayLocal35 = null;
        int[] integerArrayLocal36 = null;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        int integerLocal45;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        integerLocal33 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (bucketBoardArgument2.pieceAcknowledgement >= 0) {
            this.buckets[integerArgument3] = bucketBoardArgument2;
            integerLocal12 = bucketBoardArgument2.boardHeight * -2 / 18;
            nodeDequeLocal14 = UiComponentPart026.computeNodeDeque1577(-integerLocal12 + bucketBoardArgument2.boardHeight + 1, integerLocal12, -1, 1000, 36, bucketBoardArgument2.boardWidth + 2, 36, integerArgument1 + 100);
            this.nodeDequeArrayState0001[integerArgument3] = nodeDequeLocal14;
            this.performAction1496(true, bucketBoardArgument2, 600, 450, 0, integerArgument3, false);
            RenderingSupport003.performAction0631(bucketBoardArgument2.integerState0458, bucketBoardArgument2.integerState0446 / 2, (byte) 127, MixedSupport059.rawSoundState0011);
            if (integerArgument3 == this.integerState0605) {
              RenderingSupport003.performAction0631(-1, bucketBoardArgument2.integerState0446, (byte) 127, LoginCredentials.rawSoundState0013);
            }
            this.integerArrayState0189[integerArgument3] = 0;
            integerArrayLocal36 = new int[bucketBoardArgument2.boardHeight * bucketBoardArgument2.boardWidth + 1];
            integerArrayLocal35 = integerArrayLocal36;
            integerArrayLocal15 = integerArrayLocal35;
            this.integerArrayArrayState0019[integerArgument3] = integerArrayLocal36;
            for (integerLocal16 = 0; bucketBoardArgument2.boardHeight > integerLocal16; integerLocal16++) {
              for (integerLocal17 = 0; integerLocal17 < bucketBoardArgument2.boardWidth; integerLocal17++) {
                if (0 == integerArrayLocal15[integerLocal16 * bucketBoardArgument2.boardWidth + integerLocal17]) {
                  integerLocal18 = bucketBoardArgument2.settledCells[integerLocal16 * bucketBoardArgument2.boardWidth + integerLocal17];
                  if (0 != (24 & integerLocal18)) {
                    integerLocal19 = integerLocal17;
                    integerLocal20 = integerLocal17;
                    integerLocal23 = integerLocal16;
                    integerLocal24 = integerLocal16;
                    integerLocal25 = 0;
                    bucketBoardArgument2.selectedCellIndices[0] = bucketBoardArgument2.boardWidth * integerLocal16 + integerLocal17;
                    integerLocal26 = 1;
                    bucketBoardArgument2.settledCells[integerLocal16 * bucketBoardArgument2.boardWidth + integerLocal17] = bucketBoardArgument2.settledCells[integerLocal16 * bucketBoardArgument2.boardWidth + integerLocal17] + -2147483648;
                    if ((integerLocal18 & 24) == 8) {
                      integerLocal27 = integerLocal18 & 31;
                      while (integerLocal25 < integerLocal26) {
                        previousIntegerLocal1 = integerLocal25;
                        integerLocal25++;
                        integerLocal28 = bucketBoardArgument2.selectedCellIndices[previousIntegerLocal1];
                        integerLocal29 = integerLocal28 % bucketBoardArgument2.boardWidth;
                        integerLocal30 = integerLocal28 / bucketBoardArgument2.boardWidth;
                        if (integerLocal29 > integerLocal20) {
                          integerLocal20 = integerLocal29;
                        }
                        if (integerLocal19 > integerLocal29) {
                          integerLocal19 = integerLocal29;
                        }
                        if (integerLocal24 < integerLocal30) {
                          integerLocal24 = integerLocal30;
                        }
                        if (integerLocal29 > 0 &&
                          integerLocal27 == (bucketBoardArgument2.settledCells[integerLocal28 - 1] & -2147483617)) {
                          previousIntegerLocal2 = integerLocal26;
                          integerLocal26++;
                          bucketBoardArgument2.selectedCellIndices[previousIntegerLocal2] = -1 + integerLocal28;
                          bucketBoardArgument2.settledCells[-1 + integerLocal28] = bucketBoardArgument2.settledCells[-1 + integerLocal28] + -2147483648;
                        }
                        if (integerLocal23 > integerLocal30) {
                          integerLocal23 = integerLocal30;
                        }
                        if (integerLocal29 < -1 + bucketBoardArgument2.boardWidth &&
                          (-2147483617 & bucketBoardArgument2.settledCells[integerLocal28 + 1]) == integerLocal27) {
                          previousIntegerLocal3 = integerLocal26;
                          integerLocal26++;
                          bucketBoardArgument2.selectedCellIndices[previousIntegerLocal3] = 1 + integerLocal28;
                          bucketBoardArgument2.settledCells[integerLocal28 + 1] = bucketBoardArgument2.settledCells[integerLocal28 + 1] + -2147483648;
                        }
                        if (integerLocal30 > 0 &&
                          (-2147483617 & bucketBoardArgument2.settledCells[-bucketBoardArgument2.boardWidth + integerLocal28]) == integerLocal27) {
                          previousIntegerLocal4 = integerLocal26;
                          integerLocal26++;
                          bucketBoardArgument2.selectedCellIndices[previousIntegerLocal4] = -bucketBoardArgument2.boardWidth + integerLocal28;
                          bucketBoardArgument2.settledCells[-bucketBoardArgument2.boardWidth + integerLocal28] = bucketBoardArgument2.settledCells[-bucketBoardArgument2.boardWidth + integerLocal28] + -2147483648;
                        }
                        if (-1 + bucketBoardArgument2.boardHeight <= integerLocal30) {
                          continue;
                        }
                        if (integerLocal27 != (bucketBoardArgument2.settledCells[integerLocal28 + bucketBoardArgument2.boardWidth] & -2147483617)) {
                          continue;
                        }
                        previousIntegerLocal5 = integerLocal26;
                        integerLocal26++;
                        bucketBoardArgument2.selectedCellIndices[previousIntegerLocal5] = integerLocal28 + bucketBoardArgument2.boardWidth;
                        bucketBoardArgument2.settledCells[bucketBoardArgument2.boardWidth + integerLocal28] = bucketBoardArgument2.settledCells[bucketBoardArgument2.boardWidth + integerLocal28] + -2147483648;
                      }
                    }
                    integerLocal45 = 1 + (integerLocal19 + (integerLocal20 - bucketBoardArgument2.boardWidth));
                    integerLocal46 = 1 + (integerLocal23 + (integerLocal24 - bucketBoardArgument2.boardHeight));
                    integerLocal47 = 350 + UiComponentPart016.computeInteger0944((byte) 126, 101, UiComponentPart031.randomState0003);
                    integerLocal48 = -(integerLocal47 * (integerLocal45 * integerLocal45 + integerLocal46 * integerLocal46) / (2 * bucketBoardArgument2.boardHeight * bucketBoardArgument2.boardHeight)) + integerLocal47;
                    integerLocal31 = (65280 & integerLocal46 << 8) + (integerLocal45 & 255) + (integerLocal48 << 16);
                    for (integerLocal6 = 0; integerLocal6 < integerLocal26; integerLocal6++) {
                      integerLocal32 = bucketBoardArgument2.selectedCellIndices[integerLocal6];
                      bucketBoardArgument2.settledCells[integerLocal32] = bucketBoardArgument2.settledCells[integerLocal32] - -2147483648;
                      integerArrayLocal36[integerLocal32] = integerLocal31;
                    }
                  }
                }
              }
            }
            integerLocal37 = -bucketBoardArgument2.boardWidth + bucketBoardArgument2.pieceWidth + bucketBoardArgument2.pieceX * 2;
            integerLocal39 = -bucketBoardArgument2.boardHeight + bucketBoardArgument2.pieceY * 2 + bucketBoardArgument2.pieceHeight;
            integerLocal41 = UiComponentPart016.computeInteger0944((byte) 68, 101, UiComponentPart031.randomState0003) + 350;
            integerLocal43 = -(integerLocal41 * (integerLocal37 * integerLocal37 + integerLocal39 * integerLocal39) / (bucketBoardArgument2.boardHeight * bucketBoardArgument2.boardHeight * 2)) + integerLocal41;
            integerLocal44 = (255 & integerLocal37) + ((integerLocal39 & 255) << 8) + (integerLocal43 << 16);
            integerArrayLocal15[bucketBoardArgument2.boardWidth * bucketBoardArgument2.boardHeight] = integerLocal44;
            animatedTileRegionLocal21 = (AnimatedTileRegion) (nodeDequeLocal14.computeHashNode1970((byte) -105));
            while (animatedTileRegionLocal21 != null) {
              integerLocal38 = -bucketBoardArgument2.boardWidth + animatedTileRegionLocal21.integerState0814 * 2 + animatedTileRegionLocal21.integerState0817;
              integerLocal40 = animatedTileRegionLocal21.integerState0818 * 2 + animatedTileRegionLocal21.integerState0815 - bucketBoardArgument2.boardHeight;
              integerLocal42 = UiComponentPart016.computeInteger0944((byte) 52, 151, UiComponentPart031.randomState0003) + 200;
              animatedTileRegionLocal21.integerState0812 = -(integerLocal42 * (integerLocal40 * integerLocal40 + integerLocal38 * integerLocal38) / (bucketBoardArgument2.boardHeight * bucketBoardArgument2.boardHeight * 2)) + integerLocal42;
              animatedTileRegionLocal21 = (AnimatedTileRegion) (nodeDequeLocal14.computeHashNode1974(true));
            }
            PlatformSupport006.performAction1568(nodeDequeLocal14, -122, nodeDequeLocal14.computeInteger1959((byte) 124));
            if (integerArgument3 == this.integerState0612) {
              this.nodeDequeState0024.performAction1963(new RenderingSupport006(MixedSupport014.stringState0070, 13, true), 2777);
            } else {
              if (this.mixedSupport028State0001.integerState0173 >= 4 &&
                this.mixedSupport028State0001.integerState0168 == 3) {
                this.nodeDequeState0024.performAction1963(new RenderingSupport006(ResourceArchive.stringState0286, 8, true), 2777);
              } else {
                cachedStringLocal7 = this.mixedSupport028State0001.stringArrayState0009[integerArgument3].toUpperCase();
                stringLocal34 = cachedStringLocal7;
                stringLocal22 = cachedStringLocal7;
                this.nodeDequeState0024.performAction1963(new RenderingSupport006(CollectionSupport001.computeString0336(122, MixedSupport001.stringState0001, new String[]{stringLocal34}), 14, true), 2777);
              }
            }
          }
          if (integerArgument1 != 18) {
            this.computeInteger1502(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal49) {
          caughtExceptionLocal11 = caughtParameterLocal49;
          runtimeExceptionLocal13 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal13;
          stackStringBuilderLocal9 = new StringBuilder().append("qc.F(").append(integerArgument1).append(',');
          if (bucketBoardArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final void performAction1493(MusicTrack musicTrackArgument1, int integerArgument2) {
        MusicTrack musicTrackLocal1 = null;
        MusicTrack[] musicTrackArrayLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        Throwable caughtExceptionLocal7 = null;
        Object objectLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          objectLocal8 = SceneWidgetNode.pcmPlayerState0002;
          synchronized (objectLocal8) {
            MixedSupport092.performAction1301(256, musicTrackArgument1, true);
            if (!this.mixedSupport028State0001.booleanState0031) {
              if (this.booleanState0140 &&
                this.integerState0607 == 10) {
                musicTrackArrayLocal2 = MixedSupport030.musicTrackArrayState0001;
              } else {
                musicTrackArrayLocal2 = MixedSupport118.musicTrackArrayArrayState0001[this.mixedSupport028State0001.integerState0166];
              }
              musicTrackLocal1 = musicTrackArrayLocal2[0];
            } else {
              musicTrackLocal1 = LoginCredentials.musicTrackState0004;
            }
            MixedSupport128.performAction1819(musicTrackLocal1, integerArgument2 + 0);
            this.integerState0641 = integerArgument2;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal7 = caughtParameterLocal10;
          runtimeExceptionLocal9 = (RuntimeException) (Object) caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("qc.LA(");
          if (musicTrackArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final void performAction1513(int integerArgument1) {
        if (!this.booleanState0140) {
          throw new IllegalStateException();
        }
        SocketFactory.cipherPacketBufferState0002.performAction1861(62, -4);
        int integerLocal1 = -9 / ((integerArgument1 - 24) / 56);
    }

    private final void performAction1483(int integerArgument1, String stringArgument2, int integerArgument3, int integerArgument4, int integerArgument5, String stringArgument6, int integerArgument7) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        Object stackObjectLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        Object objectLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int[] integerArrayLocal15 = null;
        int integerLocal16 = 0;
        int[] integerArrayLocal17 = null;
        try {
          if (integerArgument7 == this.integerState0612) {
            SoftwareRaster.performAction0720(145 + integerArgument1, integerArgument3, 349, 18, 2587569, 100);
          }
          if (integerArgument7 == this.integerState0625) {
            SoftwareRaster.performAction0720(integerArgument1 + 145, integerArgument3, 349, 18, 8454016, 40);
          }
          objectLocal9 = null;
          if (integerArgument4 < 28) {
            stringState0439 = (String) null;
          }
          integerLocal10 = 0;
          integerLocal11 = 0;
          if (this.integerState0612 >= 0 &&
            (1 << integerArgument7 & this.integerState0613) != 0) {
            integerArgument5 = 8421504;
            integerLocal10 = 1;
            objectLocal9 = AudioSupport004.stringState0466;
          } else if (0 <= this.integerState0612 &&
            (this.mixedSupport028State0001.integerState0169 & 1 << integerArgument7) != 0) {
            stackIntegerLocal1 = ((1 << this.integerState0612 & this.mixedSupport028State0001.integerState0169) != 0) ? 0 : 1;
            integerLocal11 = stackIntegerLocal1;
            objectLocal9 = SocketFactory.stringState0612;
          } else {
            if (!this.mixedSupport028State0001.booleanState0031 &&
              (1 << integerArgument7 & this.mixedSupport028State0001.integerState0170) != 0) {
              objectLocal9 = MixedSupport121.stringState0513;
              if (this.integerState0612 >= 0) {
                if ((1 << this.integerState0612 & this.mixedSupport028State0001.integerState0170) == 0) {
                  if (null != this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612]) {
                    stackIntegerLocal2 = (0 < this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612].livesRemaining) ? 1 : 0;
                  } else {
                    stackIntegerLocal2 = 0;
                  }
                } else {
                  stackIntegerLocal2 = 0;
                }
              } else {
                stackIntegerLocal2 = 0;
              }
              integerLocal11 = stackIntegerLocal2;
            }
          }
          MixedSupport042.performAction0595(14 + integerArgument3, 256, integerArgument5, this.mixedSupport028State0001.stringArrayState0009[integerArgument7], 152 + integerArgument1, UiComponentPart029.renderingSupport010State0005);
          if (objectLocal9 != null) {
            integerLocal12 = UiComponentPart029.renderingSupport010State0005.computeInteger1208((String) (objectLocal9));
            integerLocal13 = integerArgument1 + (126 - integerLocal12);
            integerLocal14 = integerArgument3;
            SoftwareRaster.performAction0735(integerLocal13 - 2, integerLocal14 - 3, integerLocal12 + 8, 17, 4, 65793);
            integerArrayLocal15 = new int[]{integerLocal13 + integerLocal12, 11 + integerLocal14, integerLocal13 - (-integerLocal12 - 15), integerLocal14 + 15, 15 + (integerLocal13 + integerLocal12), 15 + integerLocal14, integerLocal12 + (integerLocal13 + 15), 13 + integerLocal14, integerLocal13 + integerLocal12 + 6, 4 + integerLocal14};
            MixedSupport097.performAction1363(integerArrayLocal15, 65793);
            integerLocal16 = 16777215;
            if (integerLocal11 != 0 &&
              0 != (CipherPacketBuffer.integerState0799 & 16)) {
              integerLocal16 = 15782016;
            }
            if (integerLocal10 != 0) {
              integerLocal16 = 8421504;
            }
            SoftwareRaster.performAction0735(integerLocal13 - 1, -3 + integerLocal14 + 1, integerLocal12 + 6, 15, 4, integerLocal16);
            integerArrayLocal17 = new int[]{1 + integerLocal12 + integerLocal13, 10 + integerLocal14, 14 + integerLocal12 + integerLocal13, integerLocal14 + 14, integerLocal12 + (integerLocal13 + 5), integerLocal14 + 5};
            MixedSupport097.performAction1363(integerArrayLocal17, integerLocal16);
            UiComponentPart029.renderingSupport010State0005.performAction1211((String) (objectLocal9), integerLocal13 + 2, 10 + integerLocal14, 65793, -1);
          }
          MixedSupport029.performAction0447(integerArgument5, 353 + integerArgument1, stringArgument2, integerArgument3 + 14, (byte) 75, UiComponentPart029.renderingSupport010State0005);
          MixedSupport029.performAction0447(integerArgument5, integerArgument1 + 450, stringArgument6, 14 + integerArgument3, (byte) 75, UiComponentPart029.renderingSupport010State0005);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal8 = caughtParameterLocal18;
          objectLocal9 = caughtExceptionLocal8;
          stackObjectLocal3 = objectLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("qc.QA(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (stringArgument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument7).append(')').toString());
        }
    }

    private final static void performAction1489(BucketBoard bucketBoardArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RgbSprite rgbSpriteArgument11, IndexedSprite indexedSpriteArgument12, boolean booleanArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = integerArgument8;
        int integerLocal8 = -integerArgument6;
        int integerLocal9 = bucketBoardArgument1.boardWidth * 32;
        int integerLocal10 = integerArgument3 + (integerArgument9 * integerArgument6 * bucketBoardArgument1.boardWidth * 2 + integerLocal7 * 16) / integerLocal9;
        int integerLocal11 = integerArgument3 + ((integerArgument9 + 1) * integerArgument6 * bucketBoardArgument1.boardWidth * 2 + integerLocal7 * 16) / integerLocal9;
        int integerLocal12 = integerArgument4 + integerArgument10 * integerArgument7 / 36 + bucketBoardArgument1.integerState0473 * integerArgument7 / bucketBoardArgument1.boardHeight;
        int integerLocal13 = integerArgument4 + (integerArgument10 + 1) * integerArgument7 / 36 + bucketBoardArgument1.integerState0473 * integerArgument7 / bucketBoardArgument1.boardHeight;
        int integerLocal14 = integerArgument5 + (integerArgument9 * integerArgument8 * bucketBoardArgument1.boardWidth * 2 + integerLocal8 * 16) / integerLocal9;
        int integerLocal15 = integerArgument5 + ((integerArgument9 + 1) * integerArgument8 * bucketBoardArgument1.boardWidth * 2 + integerLocal8 * 16) / integerLocal9;
        if (integerLocal14 >= 500) {
          if (integerLocal15 < 500) {
            return;
          }
          integerLocal1 = 320 + integerLocal10 * 1000 / integerLocal14;
          integerLocal2 = 320 + integerLocal11 * 1000 / integerLocal15;
          integerLocal3 = integerArgument2 + integerLocal12 * 1000 / integerLocal14;
          integerLocal4 = integerArgument2 + integerLocal12 * 1000 / integerLocal15;
          integerLocal5 = integerArgument2 + integerLocal13 * 1000 / integerLocal14;
          integerLocal6 = integerArgument2 + integerLocal13 * 1000 / integerLocal15;
          RenderingSupport002.performAction0265(rgbSpriteArgument11, indexedSpriteArgument12, integerLocal1, integerLocal2, integerLocal3, integerLocal4, integerLocal5, integerLocal6, booleanArgument13, booleanArgument13, 0, -1);
          return;
        }
    }

    private final void performAction1476(int integerArgument1, byte byteArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5) {
        if (40 > integerArgument1) {
          integerArgument4 = integerArgument4 - (40 - integerArgument1) / 2;
          integerArgument1 = 40;
        }
        if (booleanArgument3) {
          MixedSupport046.rgbSpriteArrayState0015[1].performAction0302(integerArgument4 + 19, integerArgument5, -19 + (integerArgument1 - 19), 36);
          MixedSupport046.rgbSpriteArrayState0015[0].performAction0300(integerArgument4, integerArgument5);
          MixedSupport046.rgbSpriteArrayState0015[2].performAction0300(integerArgument4 + (integerArgument1 - 19), integerArgument5);
        } else {
          UiComponent.rgbSpriteArrayState0005[1].performAction0302(19 + integerArgument4, integerArgument5, -19 + integerArgument1 - 19, 36);
          UiComponent.rgbSpriteArrayState0005[0].performAction0300(integerArgument4, integerArgument5);
          UiComponent.rgbSpriteArrayState0005[2].performAction0300(-19 + integerArgument4 + integerArgument1, integerArgument5);
        }
        if (byteArgument2 != 123) {
          this.integerState0635 = -46;
        }
    }

    private final void performAction1506(boolean booleanArgument1) {
        int integerLocal1;
        BucketBoard bucketBoardLocal2;
        if (booleanArgument1) {
          bucketBoardLocal2 = (BucketBoard) null;
          this.performAction1496(true, (BucketBoard) null, -88, -111, 33, -46, false);
        }
        integerLocal1 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].computeInteger1087(0);
        if (!this.booleanState0139 &&
          integerLocal1 > 0) {
          if (this.booleanState0147) {
            MixedSupport048.mixedSupport076State0001 = new MixedSupport076(0, 65535, MixedSupport035.integerState0220, UiComponentPart013.integerState0275, UiComponentPart028.integerState0716, MixedSupport039.integerState0232, new int[]{8 * integerLocal1 + this.integerState0603});
            if (!UiComponentPart023.computeBoolean1421(-30146)) {
              NetworkArchiveRequestManager.performAction1466(3, (byte) 85, MixedSupport048.mixedSupport076State0001);
            }
            NetworkSupport004.booleanState0065 = true;
          } else {
            MixedSupport048.mixedSupport076State0001 = new MixedSupport076(1, 65534, MixedSupport035.integerState0220, UiComponentPart013.integerState0275, UiComponentPart028.integerState0716, MixedSupport039.integerState0232, new int[]{this.integerState0600 + integerLocal1 * 256});
            if (!UiComponentPart023.computeBoolean1421(-30146)) {
              NetworkArchiveRequestManager.performAction1466(3, (byte) 85, MixedSupport048.mixedSupport076State0001);
            }
            RenderingSupport003.booleanState0056 = true;
          }
        }
    }

    final int computeInteger1502(boolean booleanArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int stackIntegerLocal4 = 0;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!this.booleanState0140 &&
          !this.booleanState0147) {
          integerLocal1 = 4;
        } else {
          integerLocal1 = 8;
        }
        if (this.booleanState0140) {
          stackIntegerLocal4 = (10 == this.integerState0607) ? 10 : 3;
          integerLocal2 = stackIntegerLocal4;
        } else {
          integerLocal2 = 0;
        }
        if (!booleanArgument1) {
          this.computeInteger1502(true);
        }
        return NetworkSupport006.computeInteger1153(this.booleanState0143, integerLocal1, (byte) -122, this.integerState0607, integerLocal2);
    }

    public static void performAction1494(boolean booleanArgument1) {
        if (booleanArgument1) {
          integerState0618 = -69;
        }
        resourceArchiveState0019 = null;
        bufferedSocketState0002 = null;
        stringState0439 = null;
        sceneWidgetState0099 = null;
        stringArrayState0033 = null;
    }

    private final boolean computeBoolean1511(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument1 != -20459) {
          this.integerState0644 = 0;
        }
        boolean frameRemainderLocal2 = true;
        if (this.booleanState0140 &&
          this.integerState0609 == 0 && (!this.mixedSupport028State0001.booleanState0031 &&
          MixedSupport011.booleanArrayState0002[1] ||
          this.integerState0630 == 60)) {
          stackBooleanLocal1 = true;
          frameRemainderLocal2 = false;
        }
        else {
          stackBooleanLocal1 = false;
        }
        return stackBooleanLocal1;
    }

    private final static void performAction1486(int integerArgument1, BucketBoard bucketBoardArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, String stringArgument10, AnimatedTileRegion animatedTileRegionArgument11, int[] integerArrayArgument12, int integerArgument13, NodeDeque nodeDequeArgument14, int integerArgument15, int integerArgument16) {
        int previousIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
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
        Object objectLocal22;
        int integerLocal23;
        AnimatedTileRegion animatedTileRegionLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        IndexedSprite indexedSpriteLocal28;
        int integerLocal29;
        int integerLocal30;
        IndexedSprite indexedSpriteLocal31;
        RgbSprite rgbSpriteLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        Object objectLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        int integerLocal45;
        int[] integerArrayLocal46;
        int integerLocal47;
        int integerLocal48;
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
        int integerLocal64;
        int integerLocal65;
        int integerLocal66;
        int integerLocal67;
        int integerLocal68;
        int integerLocal69;
        int integerLocal70;
        int integerLocal71;
        AnimatedTileRegion animatedTileRegionLocal72;
        Object objectLocal73;
        Object objectLocal74;
        Object objectLocal75;
        objectLocal22 = null;
        integerArgument7 = integerArgument7 - integerArgument4;
        integerArgument8 = integerArgument8 - integerArgument5;
        integerArgument9 = integerArgument9 - integerArgument6;
        integerLocal8 = -1;
        integerLocal9 = bucketBoardArgument2.boardWidth + 1;
        integerLocal10 = bucketBoardArgument2.computeInteger1121(3837);
        integerLocal11 = bucketBoardArgument2.boardHeight + 1;
        integerLocal12 = -1;
        integerLocal13 = bucketBoardArgument2.boardWidth + 1;
        integerLocal14 = -2 * bucketBoardArgument2.boardHeight / 18;
        integerLocal15 = bucketBoardArgument2.boardHeight + 1;
        if (integerLocal10 > integerLocal14) {
          integerLocal10 = integerLocal14;
        }
        if (animatedTileRegionArgument11 != null) {
          if (integerLocal8 < animatedTileRegionArgument11.integerState0814) {
            integerLocal8 = animatedTileRegionArgument11.integerState0814;
          }
          if (integerLocal9 > animatedTileRegionArgument11.integerState0814 + animatedTileRegionArgument11.integerState0817) {
            integerLocal9 = animatedTileRegionArgument11.integerState0814 + animatedTileRegionArgument11.integerState0817;
          }
          if (integerLocal10 < animatedTileRegionArgument11.integerState0818) {
            integerLocal10 = animatedTileRegionArgument11.integerState0818;
          }
          if (integerLocal11 > animatedTileRegionArgument11.integerState0818 + animatedTileRegionArgument11.integerState0815) {
            integerLocal11 = animatedTileRegionArgument11.integerState0818 + animatedTileRegionArgument11.integerState0815;
          }
          if (integerLocal12 < animatedTileRegionArgument11.integerState0814) {
            integerLocal12 = animatedTileRegionArgument11.integerState0814;
          }
          if (integerLocal13 > animatedTileRegionArgument11.integerState0814 + animatedTileRegionArgument11.integerState0817) {
            integerLocal13 = animatedTileRegionArgument11.integerState0814 + animatedTileRegionArgument11.integerState0817;
          }
          if (integerLocal14 < animatedTileRegionArgument11.integerState0818) {
            integerLocal14 = animatedTileRegionArgument11.integerState0818;
          }
          if (integerLocal15 > animatedTileRegionArgument11.integerState0818 + animatedTileRegionArgument11.integerState0815) {
            integerLocal15 = animatedTileRegionArgument11.integerState0818 + animatedTileRegionArgument11.integerState0815;
          }
        }
        integerLocal16 = MixedSupport148.computeInteger1983(23841, integerArgument7 * integerArgument7 + integerArgument9 * integerArgument9, -(integerArgument4 * integerArgument7 + integerArgument6 * integerArgument9) * bucketBoardArgument2.boardWidth);
        integerLocal17 = MixedSupport148.computeInteger1983(23841, integerArgument8, -integerArgument5 * bucketBoardArgument2.boardHeight);
        integerLocal18 = integerLocal16;
        if (integerLocal16 >= integerLocal8) {
          if (integerLocal16 > integerLocal9) {
            integerLocal16 = integerLocal9;
          }
        } else {
          integerLocal16 = integerLocal8;
        }
        if (integerLocal17 >= integerLocal10) {
          if (integerLocal17 > integerLocal11) {
            integerLocal17 = integerLocal11;
          }
        } else {
          integerLocal17 = integerLocal10;
        }
        if (integerArrayArgument12 == null) {
          for (integerLocal19 = integerLocal14; integerLocal19 < integerLocal15; integerLocal19++) {
            integerLocal20 = integerArgument1;
            integerLocal21 = 0;
            if (integerArgument15 > 0) {
              integerLocal21 = 38 - integerLocal19 * 25 / bucketBoardArgument2.boardHeight;
              if (integerArgument15 >= integerLocal21) {
                integerLocal20 = integerArgument16;
              }
            }
            for (integerLocal23 = integerLocal12; integerLocal23 < integerLocal13; integerLocal23++) {
              GameSession.performAction1490(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal23, integerLocal19, SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal20], animatedTileRegionArgument11, false);
            }
            if (integerArgument15 < integerLocal21 &&
              integerArgument15 >= integerLocal21 - 3) {
              for (integerLocal66 = integerLocal12; integerLocal66 < integerLocal13; integerLocal66++) {
                GameSession.performAction1490(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal66, integerLocal19, SceneWidgetPart010.rgbSpriteArrayState0025[integerArgument16], animatedTileRegionArgument11, true);
                if (integerArgument15 == integerLocal21 - 1) {
                  GameSession.performAction1490(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal66, integerLocal19, SceneWidgetPart010.rgbSpriteArrayState0025[integerArgument16], animatedTileRegionArgument11, true);
                }
                if (integerArgument15 == integerLocal21 - 3) {
                  GameSession.performAction1490(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal66, integerLocal19, SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal20], animatedTileRegionArgument11, true);
                }
              }
            }
          }
        }
        for (integerLocal47 = integerLocal8; integerLocal47 < integerLocal16; integerLocal47++) {
          for (integerLocal49 = integerLocal10; integerLocal49 < integerLocal17; integerLocal49++) {
            GameSession.performAction1485(integerArgument1, bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal47, integerLocal49, integerLocal18, integerLocal14, animatedTileRegionArgument11, integerArrayArgument12, integerArgument13, integerArgument15, integerArgument16);
          }
          for (integerLocal70 = integerLocal11 - 1; integerLocal70 >= integerLocal17; integerLocal70--) {
            GameSession.performAction1485(integerArgument1, bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal47, integerLocal70, integerLocal18, integerLocal14, animatedTileRegionArgument11, integerArrayArgument12, integerArgument13, integerArgument15, integerArgument16);
          }
        }
        for (integerLocal48 = integerLocal9 - 1; integerLocal48 >= integerLocal16; integerLocal48--) {
          for (integerLocal50 = integerLocal10; integerLocal50 < integerLocal17; integerLocal50++) {
            GameSession.performAction1485(integerArgument1, bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal48, integerLocal50, integerLocal18, integerLocal14, animatedTileRegionArgument11, integerArrayArgument12, integerArgument13, integerArgument15, integerArgument16);
          }
          for (integerLocal71 = integerLocal11 - 1; integerLocal71 >= integerLocal17; integerLocal71--) {
            GameSession.performAction1485(integerArgument1, bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal48, integerLocal71, integerLocal18, integerLocal14, animatedTileRegionArgument11, integerArrayArgument12, integerArgument13, integerArgument15, integerArgument16);
          }
        }
        if (animatedTileRegionArgument11 != null) {
          return;
        }
        integerArrayLocal46 = SoftwareRaster.integerArrayState0063;
        integerLocal51 = SoftwareRaster.integerState0285;
        integerLocal52 = SoftwareRaster.integerState0284;
        for (integerLocal53 = 0; integerLocal53 < 4; integerLocal53++) {
          for (integerLocal25 = 0; integerLocal25 < 16; integerLocal25++) {
            integerLocal26 = integerLocal53 * 16 + integerLocal25;
            MixedSupport077.rgbSpriteArrayState0017[integerLocal26].performAction0278();
            SoftwareRaster.performAction0727();
            MixedSupport045.computeInteger0612(144, 1, -9 * integerLocal53, stringArgument10, 0, 36, 16777215, SceneWidget.renderingSupport010State0007, (byte) -126, 1, -9 * integerLocal25);
            integerLocal26++;
          }
        }
        SoftwareRaster.performAction0724(integerArrayLocal46, integerLocal51, integerLocal52);
        if (nodeDequeArgument14 != null) {
          animatedTileRegionLocal24 = (AnimatedTileRegion) (nodeDequeArgument14.computeHashNode1970((byte) -96));
          while (animatedTileRegionLocal24 != null) {
            integerLocal55 = 0;
            for (integerLocal58 = 0; integerLocal58 < animatedTileRegionLocal24.integerState0815; integerLocal58++) {
              for (integerLocal27 = 0; integerLocal27 < animatedTileRegionLocal24.integerState0817; integerLocal27++) {
                indexedSpriteLocal28 = animatedTileRegionLocal24.indexedSpriteArrayState0005[integerLocal55];
                if (indexedSpriteLocal28 != NetworkSupport007.indexedSpriteState0002) {
                  integerLocal30 = (animatedTileRegionLocal24.integerState0818 + integerLocal58 + 4) * 16 + (animatedTileRegionLocal24.integerState0814 + integerLocal27);
                  rgbSpriteLocal32 = MixedSupport077.rgbSpriteArrayState0017[integerLocal30];
                  integerLocal34 = 0;
                  for (integerLocal35 = 0; integerLocal35 < 9; integerLocal35++) {
                    for (integerLocal36 = 0; integerLocal36 < 9; integerLocal36++) {
                      if (indexedSpriteLocal28 == null ||
                        indexedSpriteLocal28.byteArrayState0021[integerLocal34] != 0) {
                        if (integerLocal36 <= 0) {
                          if (integerLocal27 <= 0) {
                            if (animatedTileRegionLocal24.integerState0814 <= 0) {
                              objectLocal37 = null;
                            } else {
                              objectLocal37 = NetworkSupport007.indexedSpriteState0002;
                            }
                          } else {
                            objectLocal37 = animatedTileRegionLocal24.indexedSpriteArrayState0005[integerLocal55 - 1];
                          }
                        } else {
                          objectLocal37 = indexedSpriteLocal28;
                        }
                        if (integerLocal36 <= 0) {
                          stackIntegerLocal2 = integerLocal34 + 9 - 1;
                        } else {
                          stackIntegerLocal2 = integerLocal34 - 1;
                        }
                        integerLocal39 = stackIntegerLocal2;
                        if (objectLocal37 == NetworkSupport007.indexedSpriteState0002 ||
                          objectLocal37 != null &&
                          ((IndexedSprite) (objectLocal37)).byteArrayState0021[integerLocal39] == 0) {
                          rgbSpriteLocal32.integerArrayState0024[integerLocal34] = 6328512;
                        }
                        if (integerLocal36 >= 8) {
                          if (integerLocal27 >= animatedTileRegionLocal24.integerState0817 - 1) {
                            if (animatedTileRegionLocal24.integerState0814 + animatedTileRegionLocal24.integerState0817 >= 16) {
                              objectLocal73 = null;
                            } else {
                              objectLocal73 = NetworkSupport007.indexedSpriteState0002;
                            }
                          } else {
                            objectLocal73 = animatedTileRegionLocal24.indexedSpriteArrayState0005[integerLocal55 + 1];
                          }
                        } else {
                          objectLocal73 = indexedSpriteLocal28;
                        }
                        if (integerLocal36 >= 8) {
                          stackIntegerLocal3 = integerLocal34 - 9 + 1;
                        } else {
                          stackIntegerLocal3 = integerLocal34 + 1;
                        }
                        integerLocal67 = stackIntegerLocal3;
                        if (objectLocal73 == NetworkSupport007.indexedSpriteState0002 ||
                          objectLocal73 != null &&
                          ((IndexedSprite) (objectLocal73)).byteArrayState0021[integerLocal67] == 0) {
                          rgbSpriteLocal32.integerArrayState0024[integerLocal34] = 4223136;
                        }
                        if (integerLocal35 <= 0) {
                          if (integerLocal58 <= 0) {
                            if (animatedTileRegionLocal24.integerState0818 <= -4) {
                              objectLocal74 = null;
                            } else {
                              objectLocal74 = NetworkSupport007.indexedSpriteState0002;
                            }
                          } else {
                            objectLocal74 = animatedTileRegionLocal24.indexedSpriteArrayState0005[integerLocal55 - animatedTileRegionLocal24.integerState0817];
                          }
                        } else {
                          objectLocal74 = indexedSpriteLocal28;
                        }
                        if (integerLocal35 <= 0) {
                          stackIntegerLocal4 = integerLocal34 + 72;
                        } else {
                          stackIntegerLocal4 = integerLocal34 - 9;
                        }
                        integerLocal68 = stackIntegerLocal4;
                        if (objectLocal74 == NetworkSupport007.indexedSpriteState0002 ||
                          objectLocal74 != null &&
                          ((IndexedSprite) (objectLocal74)).byteArrayState0021[integerLocal68] == 0) {
                          rgbSpriteLocal32.integerArrayState0024[integerLocal34] = 8438015;
                        }
                        if (integerLocal35 >= 8) {
                          if (integerLocal58 >= animatedTileRegionLocal24.integerState0815 - 1) {
                            if (animatedTileRegionLocal24.integerState0818 + animatedTileRegionLocal24.integerState0815 >= 0) {
                              objectLocal75 = null;
                            } else {
                              objectLocal75 = NetworkSupport007.indexedSpriteState0002;
                            }
                          } else {
                            objectLocal75 = animatedTileRegionLocal24.indexedSpriteArrayState0005[integerLocal55 + animatedTileRegionLocal24.integerState0817];
                          }
                        } else {
                          objectLocal75 = indexedSpriteLocal28;
                        }
                        if (integerLocal35 >= 8) {
                          stackIntegerLocal5 = integerLocal34 - 72;
                        } else {
                          stackIntegerLocal5 = integerLocal34 + 9;
                        }
                        integerLocal69 = stackIntegerLocal5;
                        if (objectLocal75 != NetworkSupport007.indexedSpriteState0002) {
                          if ((objectLocal75 != null) &&
                            (((IndexedSprite) (objectLocal75)).byteArrayState0021[integerLocal69] == 0)) {
                            rgbSpriteLocal32.integerArrayState0024[integerLocal34] = 16512;
                          }
                        } else {
                          rgbSpriteLocal32.integerArrayState0024[integerLocal34] = 16512;
                        }
                      }
                      integerLocal34++;
                    }
                  }
                }
                integerLocal55++;
              }
            }
            animatedTileRegionLocal24 = (AnimatedTileRegion) (nodeDequeArgument14.computeHashNode1974(true));
          }
        }
        if (integerArgument13 <= 0) {
          for (integerLocal54 = -4; integerLocal54 < 0; integerLocal54++) {
            for (integerLocal56 = 0; integerLocal56 < 16; integerLocal56++) {
              integerLocal59 = (integerLocal54 + 4) * 16 + integerLocal56;
              GameSession.performAction1489(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal56, integerLocal54, SceneWidgetPart013.rgbSpriteArrayArrayState0013[integerArgument1][integerLocal59], (IndexedSprite) null, true);
              GameSession.performAction1489(bucketBoardArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, integerArgument9, integerLocal56, integerLocal54, MixedSupport077.rgbSpriteArrayState0017[integerLocal59], (IndexedSprite) null, false);
            }
          }
          return;
        }
        if (nodeDequeArgument14 != null) {
          animatedTileRegionLocal72 = (AnimatedTileRegion) (nodeDequeArgument14.computeHashNode1970((byte) 55));
          while (animatedTileRegionLocal72 != null) {
            integerLocal57 = 0;
            for (integerLocal60 = animatedTileRegionLocal72.integerState0818; integerLocal60 < animatedTileRegionLocal72.integerState0818 + animatedTileRegionLocal72.integerState0815; integerLocal60++) {
              integerLocal45 = animatedTileRegionLocal72.integerState0814;
              integerLocal61 = integerLocal45;
              while (integerLocal45 < animatedTileRegionLocal72.integerState0814 + animatedTileRegionLocal72.integerState0817) {
                integerLocal29 = (integerLocal60 + 4) * 16 + integerLocal45;
                previousIntegerLocal1 = integerLocal57;
                integerLocal57++;
                indexedSpriteLocal31 = animatedTileRegionLocal72.indexedSpriteArrayState0005[previousIntegerLocal1];
                if (indexedSpriteLocal31 != NetworkSupport007.indexedSpriteState0002) {
                  integerLocal33 = animatedTileRegionLocal72.integerState0814 * 2 + animatedTileRegionLocal72.integerState0817 - 16;
                  integerLocal62 = animatedTileRegionLocal72.integerState0818 * 2 + animatedTileRegionLocal72.integerState0815 + 4;
                  integerLocal63 = animatedTileRegionLocal72.integerState0812 * integerArgument13;
                  integerLocal64 = integerLocal63 * integerLocal33 / 36;
                  integerLocal38 = integerLocal63 * integerLocal62 / 36;
                  integerLocal65 = (integerLocal64 * integerArgument7 + integerLocal63 * integerArgument9) / 1440;
                  integerLocal40 = (integerLocal64 * integerArgument9 - integerLocal63 * integerArgument7) / 1440;
                  stackIntegerLocal6 = (integerArrayArgument12 == null) ? 6480 : 1620;
                  integerLocal41 = stackIntegerLocal6;
                  integerLocal42 = -4860;
                  integerLocal43 = integerLocal41 + (integerLocal42 - integerLocal41) * bucketBoardArgument2.integerState0473 / bucketBoardArgument2.boardHeight;
                  stackIntegerLocal7 = (integerArrayArgument12 == null) ? 6480 : 37260;
                  integerLocal44 = stackIntegerLocal7;
                  integerLocal44 = integerLocal44 * (bucketBoardArgument2.boardHeight - bucketBoardArgument2.integerState0473) / bucketBoardArgument2.boardHeight;
                  integerLocal38 = integerLocal38 + integerArgument13 * integerLocal43 / 75;
                  integerLocal38 = integerLocal38 + integerArgument13 * integerArgument13 * integerLocal44 / 5625;
                  GameSession.performAction1489(bucketBoardArgument2, integerArgument3, integerArgument4 + integerLocal65, integerArgument5 + integerLocal38, integerArgument6 + integerLocal40, integerArgument7, integerArgument8, integerArgument9, integerLocal45, integerLocal60, SceneWidgetPart013.rgbSpriteArrayArrayState0013[integerArgument1][integerLocal29], indexedSpriteLocal31, true);
                  GameSession.performAction1489(bucketBoardArgument2, integerArgument3, integerArgument4 + integerLocal65, integerArgument5 + integerLocal38, integerArgument6 + integerLocal40, integerArgument7, integerArgument8, integerArgument9, integerLocal45, integerLocal60, MixedSupport077.rgbSpriteArrayState0017[integerLocal29], indexedSpriteLocal31, false);
                }
                integerLocal45++;
              }
            }
            animatedTileRegionLocal72 = (AnimatedTileRegion) (nodeDequeArgument14.computeHashNode1974(true));
          }
          return;
        }
        return;
    }

    final boolean computeBoolean1499(int integerArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        BucketBoard stackBucketBoardLocal2;
        int stackIntegerLocal3;
        int stackIntegerLocal4;
        int stackIntegerLocal5;
        boolean stackBooleanLocal6 = false;
        MixedSupport079 mixedSupport079Local7;
        int integerLocal8;
        HashNode hashNodeLocal9;
        int integerLocal10;
        int integerLocal11;
        BucketBoard bucketBoardLocal12;
        int integerLocal13;
        CipherPacketBuffer cipherPacketBufferLocal14;
        BucketBoard bucketBoardLocal15;
        MixedSupport149 mixedSupport149Local16;
        CipherPacketBuffer cipherPacketBufferLocal17;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        bucketBoardLocal15 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerArgument2];
        if (bucketBoardLocal15.booleanState0106) {
          bucketBoardLocal15.performAction1099(this.returnedShapeCache, 125, false, (BucketBoard) null);
          return true;
        }
        mixedSupport079Local7 = this.mixedSupport079ArrayState0001[integerArgument2];
        integerLocal8 = 19 % ((-32 - integerArgument1) / 48);
        hashNodeLocal9 = mixedSupport079Local7.nodeDequeState0014.computeHashNode1970((byte) -86);
        if (hashNodeLocal9 == null) {
          return false;
        }
        if (mixedSupport079Local7.integerState0421 == 0) {
          if (hashNodeLocal9 instanceof CipherPacketBuffer) {
            cipherPacketBufferLocal14 = (CipherPacketBuffer) (mixedSupport079Local7.nodeDequeState0014.computeHashNode1970((byte) 63));
            mixedSupport079Local7.integerState0421 = cipherPacketBufferLocal14.computeInteger2085((byte) -29);
            cipherPacketBufferLocal14.performAction1865((byte) -108);
          } else {
            if (!(hashNodeLocal9 instanceof MixedSupport149)) {
              throw new IllegalStateException(hashNodeLocal9.getClass().getName());
            }
            regionExit1: {
              mixedSupport149Local16 = (MixedSupport149) (hashNodeLocal9);
              mixedSupport149Local16.performAction0161((byte) 103);
              if (mixedSupport149Local16.returnedShapeState0001.packedCells == null) {
                integerLocal10 = -1;
                integerLocal11 = 0;
                while (this.mixedSupport028State0001.integerState0173 > integerLocal11) {
                  bucketBoardLocal12 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal11];
                  if (bucketBoardLocal12 != null &&
                    bucketBoardLocal12.integerState0486 <= mixedSupport149Local16.returnedShapeState0001.integerState0688 &&
                    mixedSupport149Local16.returnedShapeState0001.integerState0688 < bucketBoardLocal12.integerState0444) {
                    integerLocal10 = integerLocal11;
                  } else {
                    integerLocal11++;
                    continue;
                  }
                  break;
                }
                if (integerLocal10 < 0) {
                  NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "T2");
                  NodeHashTable.performAction1703(67);
                  return true;
                }
                do {
                  if (mixedSupport149Local16.returnedShapeState0001.packedCells != null) {
                    break regionExit1;
                  }
                  stackIntegerLocal1 = (!this.computeBoolean1499(24, integerLocal10)) ? 0 : 1;
                  integerLocal11 = stackIntegerLocal1;
                } while (integerLocal11 != 0);
                NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "T3");
                NodeHashTable.performAction1703(59);
                return true;
              }
            }
            this.returnedShapeCache.performAction1351(mixedSupport149Local16.returnedShapeState0001, (byte) 69);
            stackBucketBoardLocal2 = bucketBoardLocal15;
            stackIntegerLocal3 = 3;
            stackIntegerLocal4 = mixedSupport149Local16.integerState0881;
            stackIntegerLocal5 = 3 & mixedSupport149Local16.integerState0876;
            stackBooleanLocal6 = (integerArgument2 != this.integerState0612) ? false : true;
            ((BucketBoard) (Object) stackBucketBoardLocal2).performAction1094(stackIntegerLocal3, stackIntegerLocal4, stackIntegerLocal5, stackBooleanLocal6, mixedSupport149Local16.integerState0882, mixedSupport149Local16.integerState0878);
            bucketBoardLocal15.selectDropSpeed(mixedSupport149Local16.integerState0876 >> 2, 2113050941, false);
            bucketBoardLocal15.performAction1095(103, mixedSupport149Local16.integerState0879, mixedSupport149Local16.returnedShapeState0001);
            if (this.integerState0612 == integerArgument2) {
              this.integerState0615 = -4 + 7 * mixedSupport149Local16.integerState0879;
            }
          }
        }
        if (mixedSupport079Local7.integerState0421 > 0) {
          cipherPacketBufferLocal17 = (CipherPacketBuffer) (mixedSupport079Local7.nodeDequeState0014.computeHashNode1970((byte) 49));
          integerLocal10 = cipherPacketBufferLocal17.computeInteger1857(5, (byte) 110);
          mixedSupport079Local7.integerState0420 = mixedSupport079Local7.integerState0420 - 1;
          mixedSupport079Local7.integerState0421 = mixedSupport079Local7.integerState0421 - 1;
          if (mixedSupport079Local7.integerState0421 == 0) {
            cipherPacketBufferLocal17.performAction0161((byte) 111);
          }
          if (bucketBoardLocal15.livesRemaining > 0 &&
            !bucketBoardLocal15.landed) {
            bucketBoardLocal15.applyControls(integerLocal10, -1674843007);
          } else {
            NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "T5: " + integerArgument2 + " " + bucketBoardLocal15.livesRemaining + " " + bucketBoardLocal15.landed);
            NodeHashTable.performAction1703(107);
            return true;
          }
        }
        return true;
    }

    final void performAction1504(int integerArgument1) {
        int integerLocal1 = -50 / ((31 - integerArgument1) / 40);
        if (!this.booleanState0140) {
          throw new IllegalStateException();
        }
        SocketFactory.cipherPacketBufferState0002.performAction1861(63, -4);
    }

    private final void performAction1475(int integerArgument1, byte byteArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        RgbSprite rgbSpriteLocal8;
        int integerLocal9;
        int integerLocal10;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = -74 + RichTextLayout.sceneWidgetState0021.integerState0903 / 2;
        integerLocal2 = integerArgument1 + 250;
        integerLocal3 = integerLocal2 + 7;
        SoftwareRaster.performAction0739(-5 + integerLocal2, -5 + integerLocal1, 150, 142, 14676, 87166);
        SoftwareRaster.performAction0739(integerLocal2, integerLocal1, 140, 127, 14676, 4427445);
        GameplayControls.performAction1978(158, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, -16 + integerLocal1, -15 + integerLocal2);
        integerLocal4 = integerLocal1;
        MixedSupport029.performAction0447(16777215, 70 + integerLocal2, GameAssets.stringState0503, integerLocal4 + 16, (byte) 75, UiComponentPart029.renderingSupport010State0005);
        this.performAction1480(12769767, integerLocal3 - 2, 22, integerLocal4 + 20, 0, 130, 9918);
        for (integerLocal5 = 0; 7 > integerLocal5; integerLocal5++) {
          if (integerLocal5 >= this.integerState0621) {
            MixedSupport035.rgbSpriteArrayArrayState0006[this.mixedSupport028State0001.integerState0166][integerLocal5].performAction0303(integerLocal5 * 18 + integerLocal3, 22 + integerLocal4, 18, 18, 14676);
          } else {
            MixedSupport035.rgbSpriteArrayArrayState0006[this.mixedSupport028State0001.integerState0166][integerLocal5].performAction0302(integerLocal5 * 18 + integerLocal3, 22 + integerLocal4, 18, 18);
          }
        }
        integerLocal4 += 40;
        MixedSupport029.performAction0447(16777215, 70 + integerLocal2, UiComponentPart018.stringState0344, 16 + integerLocal4, (byte) 75, UiComponentPart029.renderingSupport010State0005);
        this.performAction1480(12769767, integerLocal3 - 2, 22, 20 + integerLocal4, 0, 130, 9918);
        if (this.integerState0610 < 1) {
          RenderingSupport007.rgbSpriteState0026.performAction0303(integerLocal3, integerLocal4 + 22, 18, 18, 14676);
        } else {
          RenderingSupport007.rgbSpriteState0026.performAction0302(integerLocal3, integerLocal4 + 22, 18, 18);
        }
        integerLocal9 = 0;
        if (2 <= this.integerState0610) {
          integerLocal9 = 2;
        }
        if (3 <= this.integerState0610) {
          integerLocal9 = 4;
        }
        if (4 <= this.integerState0610) {
          integerLocal9 = 6;
        }
        for (integerLocal7 = 0; integerLocal7 < 6; integerLocal7++) {
          if (integerLocal7 >= integerLocal9) {
            MixedSupport127.computeRgbSprite1815(true, integerLocal7).performAction0303(18 * integerLocal7 + integerLocal3 + 18, 22 + integerLocal4, 18, 18, 14676);
          } else {
            MixedSupport127.computeRgbSprite1815(true, integerLocal7).performAction0302(18 + integerLocal3 + integerLocal7 * 18, 22 + integerLocal4, 18, 18);
          }
        }
        integerLocal4 += 40;
        MixedSupport029.performAction0447(16777215, 70 + integerLocal2, Framebuffer.stringState0154, integerLocal4 + 16, (byte) 75, UiComponentPart029.renderingSupport010State0005);
        this.performAction1480(12769767, -2 + integerLocal3, 22, integerLocal4 + 20, 0, 130, 9918);
        integerLocal10 = this.integerState0611;
        rgbSpriteLocal8 = CodecSupport001.rgbSpriteArrayState0018[integerLocal10 - 1];
        rgbSpriteLocal8.performAction0308(integerLocal3 + 1, 22 + integerLocal4, 0);
        rgbSpriteLocal8.performAction0308(integerLocal3 + 3, 22 + integerLocal4, 0);
        rgbSpriteLocal8.performAction0308(integerLocal3 + 3 + 2, -2 + (integerLocal4 + 24), 0);
        rgbSpriteLocal8.performAction0308(3 + (integerLocal3 - 2), 24 + integerLocal4, 0);
        rgbSpriteLocal8.performAction0308(2 + (integerLocal3 + 3), 24 + integerLocal4, 0);
        if (byteArgument2 != 83) {
          return;
        }
        rgbSpriteLocal8.performAction0308(3 + (integerLocal3 - 2), 2 + (24 + integerLocal4), 0);
        rgbSpriteLocal8.performAction0308(3 + integerLocal3, integerLocal4 + 24 + 2, 0);
        rgbSpriteLocal8.performAction0308(3 + (integerLocal3 + 2), integerLocal4 + 26, 0);
        rgbSpriteLocal8.performAction0300(3 + integerLocal3, integerLocal4 + 24);
        MixedSupport042.performAction0595(integerLocal4 + 36, 256, 16777215, MixedSupport127.stringArrayArrayState0008[4][integerLocal10 - 1], 3 + (integerLocal3 - (-rgbSpriteLocal8.integerState0254 - 6)), SceneWidget.renderingSupport010State0007);
    }

    final void performAction1474(int integerArgument1) {
        String stringLocal1;
        int integerLocal2;
        String stringLocal3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.mixedSupport028State0001.integerState0170 = 0;
        this.integerState0609 = 0;
        if (integerArgument1 != 100) {
          this.integerState0615 = -122;
        }
        if (this.mixedSupport028State0001.integerState0165 == this.integerState0612) {
          this.nodeDequeState0024.performAction1963(new RenderingSupport006(UiComponentPart005.stringState0101, 10, false), 2777);
        } else {
          if (this.mixedSupport028State0001.integerState0165 >= 0) {
            stringLocal3 = this.mixedSupport028State0001.stringArrayState0009[this.mixedSupport028State0001.integerState0165].toUpperCase();
            stringLocal1 = stringLocal3;
            this.nodeDequeState0024.performAction1963(new RenderingSupport006(CollectionSupport001.computeString0336(93, MixedSupport039.stringState0176, new String[]{stringLocal3}), 11, false), 2777);
          } else {
            this.nodeDequeState0024.performAction1963(new RenderingSupport006(CodecSupport004.stringState0479, 9, false), 2777);
          }
        }
    }

    private final static void performAction1490(BucketBoard bucketBoardArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, RgbSprite rgbSpriteArgument11, AnimatedTileRegion animatedTileRegionArgument12, boolean booleanArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        Object objectLocal7 = null;
        if (animatedTileRegionArgument12 != null) {
          objectLocal7 = animatedTileRegionArgument12.indexedSpriteArrayState0005[(integerArgument10 - animatedTileRegionArgument12.integerState0818) * animatedTileRegionArgument12.integerState0817 + (integerArgument9 - animatedTileRegionArgument12.integerState0814)];
          if (objectLocal7 == NetworkSupport007.indexedSpriteState0002) {
            return;
          }
        }
        int integerLocal8 = integerArgument8;
        int integerLocal9 = -integerArgument6;
        int integerLocal10 = bucketBoardArgument1.boardWidth * 2;
        int integerLocal11 = integerArgument9 * 4;
        int integerLocal12 = (integerArgument9 + 1) * 4;
        int integerLocal13 = integerArgument10 * 2;
        int integerLocal14 = (integerArgument10 + 1) * 2;
        if (integerLocal11 < 0) {
          integerLocal11 += 3;
        }
        if (integerLocal12 > bucketBoardArgument1.boardWidth * 4) {
          integerLocal12 -= 3;
        }
        if (integerLocal14 > bucketBoardArgument1.boardHeight * 2) {
          integerLocal14--;
        }
        int integerLocal15 = integerArgument3 + (integerLocal11 * integerArgument6 / 2 - integerLocal8) / integerLocal10;
        int integerLocal16 = integerArgument3 + (integerLocal12 * integerArgument6 / 2 - integerLocal8) / integerLocal10;
        int integerLocal17 = integerArgument4 + integerLocal13 * integerArgument7 / (bucketBoardArgument1.boardHeight * 2);
        int integerLocal18 = integerArgument4 + integerLocal14 * integerArgument7 / (bucketBoardArgument1.boardHeight * 2);
        int integerLocal19 = integerArgument5 + (integerLocal11 * integerArgument8 / 2 - integerLocal9) / integerLocal10;
        int integerLocal20 = integerArgument5 + (integerLocal12 * integerArgument8 / 2 - integerLocal9) / integerLocal10;
        if (integerLocal19 >= 500) {
          if (integerLocal20 < 500) {
            return;
          }
          integerLocal1 = 320 + integerLocal15 * 1000 / integerLocal19;
          integerLocal2 = 320 + integerLocal16 * 1000 / integerLocal20;
          integerLocal3 = integerArgument2 + integerLocal17 * 1000 / integerLocal19;
          integerLocal4 = integerArgument2 + integerLocal17 * 1000 / integerLocal20;
          integerLocal5 = integerArgument2 + integerLocal18 * 1000 / integerLocal19;
          integerLocal6 = integerArgument2 + integerLocal18 * 1000 / integerLocal20;
          RenderingSupport002.performAction0265(rgbSpriteArgument11, (IndexedSprite) (objectLocal7), integerLocal1, integerLocal2, integerLocal3, integerLocal4, integerLocal5, integerLocal6, booleanArgument13, booleanArgument13, 0, -1);
          return;
        }
    }

    private final void performAction1472(byte byteArgument1) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (0 > this.integerState0632) {
          this.integerState0638 = this.integerState0638 - (this.integerState0632 >> 1);
        } else {
          this.integerState0638 = this.integerState0638 + (-this.integerState0632 >> 1);
        }
        this.integerState0632 = this.integerState0632 + this.integerState0638;
        if (this.integerState0636 < 0) {
          this.integerState0635 = this.integerState0635 - (this.integerState0636 >> 1);
        } else {
          this.integerState0635 = this.integerState0635 + (-this.integerState0636 >> 1);
        }
        if (this.integerState0632 >= 0) {
          this.integerState0632 = this.integerState0632 + (-this.integerState0632 >> 4);
        } else {
          this.integerState0632 = this.integerState0632 - (this.integerState0632 >> 4);
        }
        this.integerState0636 = this.integerState0636 + this.integerState0635;
        if (this.integerState0636 < 0) {
          this.integerState0636 = this.integerState0636 - (this.integerState0636 >> 4);
        } else {
          this.integerState0636 = this.integerState0636 + (-this.integerState0636 >> 4);
        }
        integerLocal1 = 40 / ((byteArgument1 + 32) / 33);
        if (this.integerState0636 > 0) {
          this.integerState0636 = 0;
          if (this.integerState0635 > 0) {
            this.integerState0635 = -this.integerState0635;
          }
        }
    }

    private final void performAction1500(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.integerState0646 = integerArgument2;
        this.integerState0624 = integerArgument3;
        this.booleanState0145 = true;
        this.integerState0628 = integerArgument1;
        this.performAction1510(false);
    }

    private final float computeFloat1478(int integerArgument1, int integerArgument2) {
        if (integerArgument1 >= -92) {
          return -0.03768528252840042f;
        }
        return (float)integerArgument2 * ((0.00007500000356230885f - (float)integerArgument2 * 2.499999993688107e-7f) * (float)integerArgument2);
    }

    final boolean computeBoolean1512(boolean booleanArgument1) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        boolean stackBooleanLocal6 = false;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal7 = 3 + MixedSupport153.integerState0931 / 16;
        MixedSupport039.integerState0232 = MixedSupport039.integerState0232 - integerLocal7 * 2;
        UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 - integerLocal7;
        MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal7;
        UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 - 2 * integerLocal7;
        if (booleanArgument1) {
          this.performAction1476(81, (byte) 21, false, -2, -23);
        }
        if (MixedSupport153.integerState0931 == 13) {
          if (this.integerState0612 >= 0) {
            if (!this.mixedSupport028State0001.booleanState0031) {
              stackIntegerLocal1 = (null != this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612]) ? 1 : 0;
            } else {
              stackIntegerLocal1 = 0;
            }
          } else {
            stackIntegerLocal1 = 0;
          }
          integerLocal10 = stackIntegerLocal1;
          if (this.integerState0612 >= 0) {
            stackIntegerLocal2 = (this.mixedSupport028State0001.booleanState0031) ? 1 : 0;
          } else {
            stackIntegerLocal2 = 0;
          }
          integerLocal8 = stackIntegerLocal2;
          stackBooleanLocal3 = this.booleanState0140;
          stackIntegerLocal4 = integerLocal10;
          stackIntegerLocal5 = this.mixedSupport028State0001.integerState0166;
          stackBooleanLocal6 = (!this.booleanState0140) && (!this.booleanState0145);
          ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080548(stackBooleanLocal3, stackIntegerLocal4 != 0, stackIntegerLocal5, stackBooleanLocal6, false, 32357, integerLocal8 != 0, true);
          SceneWidgetPart008.performAction1296(-53);
          return true;
        }
        if (this.renderingSupport008State0008 != null) {
          this.renderingSupport008State0008.performAction0996((byte) 39);
        }
        if ((83 == MixedSupport153.integerState0931 ||
          84 == MixedSupport153.integerState0931) &&
          (this.mixedSupport028State0001.booleanState0031 &&
          !this.booleanState0140)) {
          this.performAction1503((byte) -14);
          MixedSupport007.booleanState0005 = false;
          MixedSupport140.performAction1901((byte) -2);
          ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080548(false, false, 0, false, this.booleanState0147, 32357, false, false);
          MixedSupport023.performAction0373(false, 93);
          return true;
        }
        if ((83 == MixedSupport153.integerState0931 ||
          84 == MixedSupport153.integerState0931) && this.booleanState0145) {
          if (this.integerState0646 >= 0) {
            this.performAction1500(0, -1, this.integerState0624);
          } else {
            if (this.booleanState0147 &&
              MixedSupport137.stringArrayState0050.length - 1 > this.integerState0624) {
              this.performAction1500(0, -1, this.integerState0624 + 1);
            } else {
              this.booleanState0145 = false;
            }
          }
        }
        if ((this.integerState0612 < 0 ||
          this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612] == null &&
          this.buckets[this.integerState0612] == null) && this.mixedSupport028State0001.integerState0168 > 2) {
          if (MixedSupport153.integerState0931 == 96) {
            do {
              this.integerState0605 = this.integerState0605 - 1;
              if (this.integerState0605 < 0) {
                this.integerState0605 = this.integerState0605 + this.mixedSupport028State0001.integerState0173;
                this.integerState0616 = this.integerState0616 + this.mixedSupport028State0001.integerState0173;
                this.integerState0620 = this.integerState0620 + this.mixedSupport028State0001.integerState0173;
              }
            } while (this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0605 % this.mixedSupport028State0001.integerState0173] == null);
          }
          if (MixedSupport153.integerState0931 == 97) {
            do {
              this.integerState0605 = this.integerState0605 + 1;
            } while (null == this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0605 % this.mixedSupport028State0001.integerState0173]);
          }
        }
        if (MixedSupport126.integerState0776 >= 2) {
          if (48 <= ArchiveRequestManager.characterState0002 &&
            ArchiveRequestManager.characterState0002 <= 55) {
            this.integerState0642 = this.mixedSupport028State0001.integerState0166;
            this.mixedSupport028State0001.integerState0166 = -48 + ArchiveRequestManager.characterState0002;
            this.integerState0623 = 38;
          }
          if (MixedSupport153.integerState0931 >= 1 &&
            8 >= MixedSupport153.integerState0931) {
            MixedSupport041.integerArrayState0048[1] = MixedSupport041.integerArrayState0048[0];
            MixedSupport041.integerArrayState0048[0] = MixedSupport153.integerState0931 - 1;
            if (!this.booleanState0140) {
              this.booleanState0139 = true;
              this.mixedSupport028State0001.bucketBoardArrayState0001[0].dominoDescriptor = MixedSupport041.integerArrayState0048[0] + (MixedSupport041.integerArrayState0048[1] << 4);
              return false;
            }
          }
        }
        return false;
    }

    final void performAction1498(int integerArgument1) {
        if (!this.booleanState0140) {
          throw new IllegalStateException();
        }
        if (integerArgument1 > -51) {
          return;
        }
        SocketFactory.cipherPacketBufferState0002.performAction1861(61, -4);
    }

    private final void performAction1505(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (this.booleanState0139) {
          return;
        }
        if (MixedSupport112.computeBoolean1594(-23, integerArgument1, MixedSupport093.integerArrayState0172)) {
          return;
        }
        int[] integerArrayLocal1 = MixedSupport093.integerArrayState0172;
        int[] integerArrayLocal2 = integerArrayLocal1;
        int integerLocal3 = integerArgument1;
        integerArrayLocal1[integerLocal3 >> 5] = UiComponentPart006.computeInteger0388(integerArrayLocal1[integerLocal3 >> 5], 1 << MixedSupport079.computeInteger1051(31, integerLocal3));
        int[] integerArrayLocal4 = MixedSupport064.integerArrayState0111;
        integerArrayLocal2 = integerArrayLocal4;
        int integerLocal5 = 79 / ((integerArgument2 + 15) / 42);
        integerLocal3 = integerArgument1;
        integerArrayLocal4[integerLocal3 >> 5] = UiComponentPart006.computeInteger0388(integerArrayLocal4[integerLocal3 >> 5], 1 << MixedSupport079.computeInteger1051(31, integerLocal3));
        if (this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612] != null) {
          this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612].nodeDequeState0017.performAction1963(new MixedSupport143(integerArgument1), 2777);
        }
        NodeHashTable.nodeDequeState0031.performAction1963(new NetworkSupport005(integerArgument1, integerArgument3, MixedSupport035.integerState0220, UiComponentPart013.integerState0275, UiComponentPart028.integerState0716, MixedSupport039.integerState0232), 2777);
    }

    private final void performAction1510(boolean booleanArgument1) {
        if (booleanArgument1) {
          this.integerState0624 = -108;
        }
        this.integerState0632 = 0;
        this.integerState0638 = 8;
        this.integerState0635 = 8;
        this.integerState0636 = 0;
    }

    private final void performAction1473(byte byteArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        float floatLocal10 = 0.0f;
        int integerLocal11 = 0;
        int integerLocal12;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 == 100) {
            return;
          }
          integerLocal5 = this.mixedSupport028State0001.integerState0173;
          integerLocal7 = 0;
          integerLocal8 = 0;
          if (byteArgument1 != -17) {
            return;
          }
          while (integerLocal5 > integerLocal8) {
            if (integerArrayArgument4[integerLocal8] == 200) {
              integerLocal7++;
            }
            integerLocal8++;
          }
          integerLocal12 = this.integerState0605;
          if (integerArrayArgument4[integerLocal12 % integerLocal5] == 200) {
            integerLocal7--;
          }
          while (integerLocal7 > 1) {
            integerLocal12--;
            if (200 != integerArrayArgument4[(integerLocal5 + integerLocal12) % integerLocal5]) {
              continue;
            }
            integerLocal7 -= 2;
          }
          if (integerArgument3 >= integerLocal12 &&
            integerLocal12 + integerLocal5 > integerArgument3) {
            while (integerLocal7 > 0) {
              integerLocal12--;
              if (integerArrayArgument4[(integerLocal12 + integerLocal5) % integerLocal5] != 200) {
                continue;
              }
              integerLocal7 -= 2;
            }
            SceneWidgetPart009.booleanState0150 = false;
            integerLocal9 = -800;
            while (integerLocal12 != integerArgument3) {
              if (integerArgument3 != integerLocal5 + integerLocal12) {
                if (this.mixedSupport028State0001.bucketBoardArrayState0001[(integerLocal5 + integerLocal12) % integerLocal5] != null) {
                  integerLocal9 = 800;
                  SceneWidgetPart009.booleanState0150 = true;
                }
                integerLocal12++;
                continue;
              }
              break;
            }
            floatLocal10 = this.computeFloat1487(integerArgument2, true);
            NetworkSupport012.integerState0758 = 10000 + (int)(floatLocal10 * (float)(NetworkSupport012.integerState0758 - 10000));
            MixedSupport025.integerState0152 = integerLocal9 + (int)(floatLocal10 * (float)(-integerLocal9 + MixedSupport025.integerState0152));
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal4 = caughtParameterLocal13;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("qc.N(").append(byteArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (integerArrayArgument4 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    private final void performAction1481(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, boolean booleanArgument8) {
        int integerLocal1 = 0;
        BucketBoard bucketBoardLocal2 = null;
        if (!booleanArgument8) {
          bucketBoardLocal2 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerArgument1];
        } else {
          bucketBoardLocal2 = this.buckets[integerArgument1];
          integerLocal1 = this.integerArrayState0189[integerArgument1];
          integerArgument3 = integerArgument3 + 10000 * (integerLocal1 * integerLocal1) / 5625;
        }
        this.performAction1491(bucketBoardLocal2, integerArgument5, integerArgument2, integerArgument7, integerArgument3, true, integerArgument4, this.mixedSupport028State0001.integerState0166);
        if (integerArgument6 != 4) {
          this.performAction1504(20);
        }
    }

    private final void performAction1477(int integerArgument1, float floatArgument2, int integerArgument3, boolean booleanArgument4, int[] integerArrayArgument5, int integerArgument6) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        float floatLocal14 = 0.0f;
        int integerLocal15 = 0;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 == 100 &&
            !booleanArgument4) {
            return;
          }
          boolean frameRemainderLocal19 = true;
          integerLocal5 = (MixedSupport025.integerState0152 + BufferedSocket.integerState0664) / integerArgument6;
          integerLocal7 = (MixedSupport056.integerState0289 + NetworkSupport012.integerState0758) / 2;
          if (!booleanArgument4) {
            integerLocal10 = this.mixedSupport028State0001.integerState0173;
            integerLocal11 = 0;
            for (integerLocal12 = 0; integerLocal12 < integerLocal10; integerLocal12++) {
              if (200 == integerArrayArgument5[integerLocal12]) {
                integerLocal11++;
              }
            }
            integerLocal18 = this.integerState0605;
            if (integerArrayArgument5[integerLocal18 % integerLocal10] == 200) {
              integerLocal11--;
            }
            while (integerLocal11 > 0) {
              integerLocal18--;
              if (integerArrayArgument5[(integerLocal18 + integerLocal10) % integerLocal10] != 200) {
                continue;
              }
              integerLocal11 -= 2;
            }
            if (integerLocal18 <= integerArgument1 &&
              integerLocal10 + integerLocal18 > integerArgument1) {
              integerLocal13 = -2100;
              while (integerArgument1 > integerLocal18) {
                if (null != this.mixedSupport028State0001.bucketBoardArrayState0001[(integerLocal10 + integerLocal18) % integerLocal10]) {
                  integerLocal13 = 2100;
                }
                integerLocal18++;
              }
              floatLocal14 = this.computeFloat1487(integerArgument3, true);
              integerLocal9 = 10000 + (int)((float)(integerLocal7 - 10000) * floatLocal14);
              floatArgument2 = floatArgument2 * floatLocal14;
              integerLocal8 = (int)((float)(integerLocal5 - integerLocal13) * floatLocal14) + integerLocal13;
              frameRemainderLocal19 = false;
            }
            else {
              return;
            }
          }
          if (frameRemainderLocal19) {
            integerLocal8 = integerLocal5;
            integerLocal9 = integerLocal7;
          }
          integerLocal16 = (int)(0.5 + 720.0 * Math.cos((double)floatArgument2));
          integerLocal17 = (int)(720.0 * Math.sin((double)floatArgument2) + 0.5);
          BufferedSocket.integerState0664 = integerLocal16 + integerLocal8;
          NetworkSupport012.integerState0758 = integerLocal9 - integerLocal17;
          MixedSupport056.integerState0289 = integerLocal9 + integerLocal17;
          MixedSupport025.integerState0152 = -integerLocal16 + integerLocal8;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal4 = caughtParameterLocal20;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("qc.O(").append(integerArgument1).append(',').append(floatArgument2).append(',').append(integerArgument3).append(',').append(booleanArgument4).append(',');
          if (integerArrayArgument5 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument6).append(')').toString());
        }
    }

    private final void performAction1480(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        if (integerArgument7 != 9918) {
          this.integerState0640 = 122;
        }
        SoftwareRaster.performAction0743(integerArgument2, integerArgument4, integerArgument6, integerArgument3, integerArgument5);
        SoftwareRaster.performAction0743(integerArgument2 + 1, integerArgument4 + 1, -2 + integerArgument6, -2 + integerArgument3, integerArgument1);
    }

    final void performAction1495(boolean booleanArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, boolean booleanArgument5) {
        int integerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int cachedIntegerLocal3 = 0;
        int cachedIntegerLocal4 = 0;
        int cachedIntegerLocal5 = 0;
        int cachedIntegerLocal6 = 0;
        int cachedIntegerLocal7 = 0;
        int cachedIntegerLocal8 = 0;
        int cachedIntegerLocal9 = 0;
        int integerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        int stackIntegerLocal14 = 0;
        int stackIntegerLocal15 = 0;
        int stackIntegerLocal16 = 0;
        String[] stackStringArrayLocal17 = null;
        int stackIntegerLocal18 = 0;
        int stackIntegerLocal19 = 0;
        int stackIntegerLocal20 = 0;
        int stackIntegerLocal21 = 0;
        int stackIntegerLocal22 = 0;
        int stackIntegerLocal23 = 0;
        int integerLocal24;
        int integerLocal25;
        RenderingSupport006 renderingSupport006Local26;
        int integerLocal27;
        int integerLocal28;
        BucketBoard bucketBoardLocal29;
        int integerLocal30;
        BucketBoard bucketBoardLocal31;
        int integerLocal32;
        int[] integerArrayLocal33;
        double doubleLocal34;
        int integerLocal35;
        int integerLocal36;
        MixedSupport117 mixedSupport117Local37;
        int integerLocal38;
        Object objectLocal39;
        int integerLocal40;
        int integerLocal41;
        String stringLocal42;
        RgbSprite rgbSpriteLocal43;
        int integerLocal44;
        String stringLocal45;
        float floatLocal46;
        int integerLocal47;
        int integerLocal48;
        float floatLocal49;
        float floatLocal50;
        int integerLocal51;
        float floatLocal52;
        int integerLocal53;
        float floatLocal54;
        int integerLocal55;
        float floatLocal56;
        int integerLocal57;
        float floatLocal58;
        int integerLocal59;
        float floatLocal60;
        float floatLocal61;
        float floatLocal62;
        float floatLocal63;
        int integerLocal64;
        int integerLocal65;
        float floatLocal66;
        int integerLocal67;
        float floatLocal68;
        float floatLocal69;
        int integerLocal70;
        float floatLocal71;
        int integerLocal72;
        float floatLocal73;
        int integerLocal74;
        float floatLocal75;
        float floatLocal76;
        int integerLocal77;
        float floatLocal78;
        int integerLocal79;
        float floatLocal80;
        float floatLocal81;
        int integerLocal82;
        int integerLocal83;
        BucketBoard bucketBoardLocal84;
        float floatLocal85;
        int integerLocal86;
        float floatLocal87;
        int integerLocal88;
        float floatLocal89;
        int integerLocal90;
        float floatLocal91;
        float floatLocal92;
        int integerLocal93;
        int integerLocal94;
        int integerLocal95;
        float floatLocal96;
        float floatLocal97;
        int integerLocal98;
        int integerLocal99;
        int integerLocal100;
        int integerLocal101;
        int integerLocal102;
        int integerLocal103;
        String stringLocal104;
        Object objectLocal105;
        BucketBoard bucketBoardLocal106;
        String stringLocal107;
        BucketBoard bucketBoardLocal108;
        String stringLocal109;
        BucketBoard bucketBoardLocal110;
        NodeDeque nodeDequeLocal111;
        RgbSprite rgbSpriteLocal112;
        NodeDeque nodeDequeLocal113;
        MixedSupport117 mixedSupport117Local114;
        int integerLocal115;
        int integerLocal116;
        int integerLocal117;
        int integerLocal118;
        int integerLocal119;
        int integerLocal120;
        int integerLocal121;
        int integerLocal122;
        int integerLocal123;
        int integerLocal124;
        int integerLocal125;
        int integerLocal126;
        float floatLocal127;
        int integerLocal128;
        float floatLocal129;
        int integerLocal130;
        float floatLocal131;
        int integerLocal132;
        int integerLocal133;
        float floatLocal134;
        int integerLocal135;
        int integerLocal136;
        int integerLocal137;
        int integerLocal138;
        float floatLocal139;
        int integerLocal140;
        float floatLocal141;
        int integerLocal142;
        float floatLocal143;
        int integerLocal144;
        float floatLocal145;
        float floatLocal146;
        int integerLocal147;
        int integerLocal148;
        int integerLocal149;
        float floatLocal150;
        float floatLocal151;
        int integerLocal152;
        int integerLocal153;
        int integerLocal154;
        int integerLocal155;
        int integerLocal156;
        int integerLocal157;
        BucketBoard bucketBoardLocal158;
        float floatLocal159;
        int integerLocal160;
        int integerLocal161;
        int integerLocal162;
        int integerLocal163;
        int integerLocal164;
        int integerLocal165;
        int integerLocal166;
        int integerLocal167;
        int integerLocal168;
        int integerLocal169;
        int integerLocal170;
        int integerLocal171;
        float floatLocal172;
        int integerLocal173;
        int integerLocal174;
        int integerLocal175;
        int integerLocal176;
        int integerLocal177;
        int integerLocal178;
        int integerLocal179;
        int integerLocal180;
        int integerLocal181;
        float floatLocal182;
        objectLocal105 = null;
        if (integerArgument3 == 1 &&
          booleanArgument4) {
          return;
        }
        regionExit1: {
          if (this.booleanState0140) {
            integerLocal24 = RichTextLayout.sceneWidgetState0021.integerState0903 / 2;
            integerLocal25 = this.mixedSupport028State0001.integerState0173;
            for (integerLocal27 = 0; integerLocal27 < integerLocal25; integerLocal27++) {
              bucketBoardLocal29 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
              if (bucketBoardLocal29 != null) {
                bucketBoardLocal31 = bucketBoardLocal29;
                bucketBoardLocal29.integerState0474 = 0;
                bucketBoardLocal31.integerState0446 = 0;
              }
            }
            if (booleanArgument4 &&
              integerArgument2 == 0 ||
              integerArgument3 == 1) {
              this.integerState0645 = this.integerState0617;
              this.integerState0626 = this.integerState0620;
              this.integerState0634 = this.integerState0616;
              MixedSupport008.performAction0085(this.integerArrayState0187, 0, this.integerArrayState0190, 0, integerLocal25);
              this.integerState0627 = this.integerState0602;
            }
            if (!booleanArgument4) {
              integerLocal27 = this.integerState0617;
              integerLocal28 = this.integerState0620;
              integerLocal30 = this.integerState0616;
              integerArrayLocal33 = this.integerArrayState0187;
              integerLocal35 = this.integerState0602;
              integerLocal36 = this.integerState0622;
            } else {
              integerLocal27 = this.integerState0645;
              integerLocal28 = this.integerState0626;
              integerLocal30 = this.integerState0634;
              integerArrayLocal33 = this.integerArrayState0190;
              integerLocal35 = this.integerState0627;
              if (this.integerState0645 < 512) {
                stackIntegerLocal11 = this.integerState0626;
              } else {
                stackIntegerLocal11 = this.integerState0634;
              }
              integerLocal36 = stackIntegerLocal11;
              integerLocal36 = integerLocal36 % integerLocal25;
              if (integerArgument2 == integerArgument3 - 1) {
                this.integerState0622 = integerLocal36;
              }
            }
            integerLocal38 = integerLocal25;
            integerLocal40 = integerLocal25;
            integerLocal41 = integerLocal25;
            integerLocal44 = integerLocal25;
            floatLocal46 = 0.0f;
            for (integerLocal48 = 0; integerLocal48 < integerLocal25; integerLocal48++) {
              floatLocal46 = floatLocal46 + this.computeFloat1478(-121, integerArrayLocal33[integerLocal48]);
            }
            floatLocal49 = (float)integerLocal27 * 0.0009765625f;
            floatLocal50 = this.computeFloat1478(-107, integerArrayLocal33[integerLocal28 % integerLocal25]);
            floatLocal52 = this.computeFloat1478(-125, integerArrayLocal33[integerLocal30 % integerLocal25]);
            floatLocal49 = 0.5f + ((floatLocal49 - 1.0f) * floatLocal50 + floatLocal49 * floatLocal52) * 0.5f;
            floatLocal54 = 0.0f;
            floatLocal56 = 1.0f;
            floatLocal58 = 0.0f;
            floatLocal60 = 0.0f;
            floatLocal61 = 0.0f;
            floatLocal62 = 0.0f;
            floatLocal63 = 0.0f;
            for (integerLocal64 = 0; integerLocal64 < 10; integerLocal64++) {
              floatLocal58 = (floatLocal54 + floatLocal56) * 0.5f;
              floatLocal60 = 0.0f;
              floatLocal66 = 144.0f * (1.0f + (floatLocal58 - 1.0f) * floatLocal49);
              floatLocal68 = 126.0f * (1.0f + (floatLocal58 - 1.0f) * floatLocal49);
              floatLocal69 = -1.0f + floatLocal49 * 2.0f;
              for (integerLocal70 = 0; integerLocal70 < integerLocal38; integerLocal70++) {
                floatLocal73 = this.computeFloat1478(-125, integerArrayLocal33[(integerLocal28 - integerLocal70 + integerLocal25) % integerLocal25]);
                floatLocal75 = floatLocal73;
                floatLocal69 = floatLocal69 + floatLocal75;
                if ((double)floatLocal69 + 0.0001 >= (double)floatLocal46) {
                  floatLocal62 = floatLocal69 - floatLocal46;
                  floatLocal75 = floatLocal75 - floatLocal62;
                  integerLocal38 = integerLocal70 + 1;
                  integerLocal40 = integerLocal70;
                }
                floatLocal60 = floatLocal60 + floatLocal66 * floatLocal75;
                floatLocal66 = floatLocal66 * (1.0f + (floatLocal58 - 1.0f) * floatLocal75);
                if (integerLocal70 < integerLocal40) {
                  floatLocal76 = floatLocal73;
                  floatLocal69 = floatLocal69 + floatLocal76;
                  if ((double)floatLocal69 + 0.0001 >= (double)floatLocal46) {
                    floatLocal62 = floatLocal69 - floatLocal46;
                    floatLocal76 = floatLocal76 - floatLocal62;
                    integerLocal38 = integerLocal70 + 1;
                    integerLocal40 = integerLocal70 + 1;
                  }
                  floatLocal60 = floatLocal60 + floatLocal68 * floatLocal76;
                  floatLocal68 = floatLocal68 * (1.0f + (floatLocal58 - 1.0f) * floatLocal76);
                  continue;
                }
                break;
              }
              floatLocal61 = floatLocal60;
              floatLocal71 = 126.0f * (floatLocal58 + (1.0f - floatLocal58) * floatLocal49);
              floatLocal129 = 144.0f * (floatLocal58 + (1.0f - floatLocal58) * floatLocal49);
              floatLocal127 = 1.0f - floatLocal49 * 2.0f;
              for (integerLocal74 = 0; integerLocal74 < integerLocal44; integerLocal74++) {
                floatLocal159 = this.computeFloat1478(-109, integerArrayLocal33[(integerLocal28 + 1 + integerLocal74) % integerLocal25]);
                floatLocal78 = floatLocal159;
                floatLocal127 = floatLocal127 + floatLocal78;
                if ((double)floatLocal127 + 0.0001 >= (double)floatLocal46) {
                  floatLocal63 = floatLocal127 - floatLocal46;
                  floatLocal78 = floatLocal78 - floatLocal63;
                  integerLocal44 = integerLocal74 + 1;
                  integerLocal41 = integerLocal74;
                }
                floatLocal61 = floatLocal61 + floatLocal71 * floatLocal78;
                floatLocal71 = floatLocal71 * (1.0f + (floatLocal58 - 1.0f) * floatLocal78);
                if (integerLocal74 < integerLocal41) {
                  floatLocal80 = floatLocal159;
                  floatLocal127 = floatLocal127 + floatLocal80;
                  if ((double)floatLocal127 + 0.0001 >= (double)floatLocal46) {
                    floatLocal63 = floatLocal127 - floatLocal46;
                    floatLocal80 = floatLocal80 - floatLocal63;
                    integerLocal44 = integerLocal74 + 1;
                    integerLocal41 = integerLocal74 + 1;
                  }
                  floatLocal61 = floatLocal61 + floatLocal129 * floatLocal80;
                  floatLocal129 = floatLocal129 * (1.0f + (floatLocal58 - 1.0f) * floatLocal80);
                  continue;
                }
                break;
              }
              if (!(floatLocal61 > 600.0f)) {
                floatLocal54 = floatLocal58;
              } else {
                floatLocal56 = floatLocal58;
              }
            }
            integerLocal126 = (int)((640.0f - floatLocal61) * 0.5f + floatLocal60 + 0.5f);
            integerLocal65 = (integerLocal126 - 320) * 10000 / 1000;
            stackIntegerLocal12 = (integerLocal27 < 512) ? 0 : 1;
            integerLocal67 = stackIntegerLocal12;
            for (integerLocal1 = 0; integerLocal1 < 2; integerLocal1++) {
              integerLocal128 = integerLocal126;
              integerLocal72 = integerLocal65;
              integerLocal130 = 10000;
              floatLocal131 = 0.0f;
              stackIntegerLocal13 = integerLocal67;
              if (integerLocal1 != 0) {
                stackIntegerLocal14 = 0;
              } else {
                stackIntegerLocal14 = 1;
              }
              {
                if (stackIntegerLocal13 == stackIntegerLocal14) {
                  integerLocal77 = integerLocal38 - integerLocal38 * (integerArgument2 + 1) / integerArgument3;
                  integerLocal79 = integerLocal38 - integerLocal38 * integerArgument2 / integerArgument3;
                  floatLocal81 = 270.0f * (1.0f + (floatLocal58 - 1.0f) * floatLocal49);
                  for (integerLocal82 = 0; integerLocal82 < integerLocal38; integerLocal82++) {
                    integerLocal83 = (integerLocal28 - integerLocal82 + integerLocal25) % integerLocal25;
                    if (integerArrayLocal33[integerLocal83] != 0) {
                      floatLocal85 = this.computeFloat1478(-122, integerArrayLocal33[integerLocal83]);
                      floatLocal87 = floatLocal81;
                      floatLocal89 = 2700.0f;
                      if (integerLocal82 >= integerLocal40) {
                        floatLocal87 = floatLocal87 * 144.0f / 270.0f;
                        floatLocal89 = 1440.0f;
                      }
                      floatLocal87 = floatLocal87 * floatLocal85;
                      floatLocal89 = floatLocal89 * floatLocal85;
                      integerLocal128 = integerLocal128 - (int)(floatLocal87 + 0.5f);
                      NetworkSupport007.integerArrayState0156[integerLocal82] = integerLocal72;
                      UiComponentPart020.integerArrayState0175[integerLocal82] = integerLocal130;
                      floatLocal91 = 0.0f;
                      floatLocal92 = 1.5707963705062866f;
                      integerLocal93 = 0;
                      integerLocal94 = 0;
                      for (integerLocal95 = 0; integerLocal95 < 10; integerLocal95++) {
                        floatLocal172 = (floatLocal91 + floatLocal92) * 0.5f;
                        integerLocal162 = integerLocal72 - (int)((double)floatLocal89 * Math.cos((double)floatLocal172) + 0.5);
                        integerLocal163 = integerLocal130 + (int)((double)floatLocal89 * Math.sin((double)floatLocal172) + 0.5);
                        integerLocal98 = 320 + integerLocal162 * 1000 / integerLocal163;
                        if (integerLocal98 < integerLocal128) {
                          floatLocal91 = floatLocal172;
                        } else {
                          floatLocal92 = floatLocal172;
                        }
                      }
                      floatLocal172 = floatLocal91;
                      floatLocal96 = floatLocal87 * 128.0f / 270.0f;
                      floatLocal97 = floatLocal96;
                      if (integerLocal82 == integerLocal40) {
                        floatLocal172 = floatLocal172 * ((1.0f - floatLocal62) * (1.0f - floatLocal62));
                        floatLocal96 = floatLocal96 * (1.0f - floatLocal62);
                      }
                      cachedIntegerLocal2 = integerLocal72 - (int)((double)(1440.0f * floatLocal85) * Math.cos((double)floatLocal172) + 0.5);
                      integerLocal72 = cachedIntegerLocal2;
                      CollectionSupport003.integerArrayState0169[integerLocal82] = cachedIntegerLocal2;
                      cachedIntegerLocal3 = integerLocal130 + (int)((double)(1440.0f * floatLocal85) * Math.sin((double)floatLocal172) + 0.5);
                      integerLocal130 = cachedIntegerLocal3;
                      MixedSupport132.integerArrayState0209[integerLocal82] = cachedIntegerLocal3;
                      if (integerLocal82 < integerLocal40) {
                        if (integerLocal82 == integerLocal38 - 1) {
                          floatLocal172 = floatLocal172 * ((1.0f - floatLocal62) * (1.0f - floatLocal62));
                          floatLocal97 = floatLocal97 * (1.0f - floatLocal62);
                        }
                        cachedIntegerLocal4 = integerLocal72 - (int)((double)(1260.0f * floatLocal85) * Math.cos((double)floatLocal172) + 0.5);
                        integerLocal72 = cachedIntegerLocal4;
                        MixedSupport077.integerArrayState0140[integerLocal82] = cachedIntegerLocal4;
                        cachedIntegerLocal5 = integerLocal130 + (int)((double)(1260.0f * floatLocal85) * Math.sin((double)floatLocal172) + 0.5);
                        integerLocal130 = cachedIntegerLocal5;
                        RenderingSupport013.integerArrayState0191[integerLocal82] = cachedIntegerLocal5;
                      }
                      MixedSupport108.floatArrayState0002[integerLocal82] = -floatLocal172;
                      floatLocal81 = floatLocal81 * (1.0f + (floatLocal58 - 1.0f) * floatLocal85);
                      bucketBoardLocal106 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal83];
                      if (bucketBoardLocal106 != null) {
                        integerLocal99 = (int)(floatLocal96 + 0.5f);
                        MixedSupport025.integerState0152 = CollectionSupport003.integerArrayState0169[integerLocal82];
                        BufferedSocket.integerState0664 = NetworkSupport007.integerArrayState0156[integerLocal82];
                        NetworkSupport012.integerState0758 = MixedSupport132.integerArrayState0209[integerLocal82];
                        MixedSupport056.integerState0289 = UiComponentPart020.integerArrayState0175[integerLocal82];
                        this.performAction1477(integerLocal28 - integerLocal82, MixedSupport108.floatArrayState0002[integerLocal82], integerLocal35, false, integerArrayLocal33, 2);
                        integerLocal100 = 128 + (MixedSupport025.integerState0152 + BufferedSocket.integerState0664) * 400 / (NetworkSupport012.integerState0758 + MixedSupport056.integerState0289);
                        if (integerLocal100 >= 0) {
                          if (integerLocal100 > 256) {
                            integerLocal100 = 256;
                          }
                        } else {
                          integerLocal100 = 0;
                        }
                        integerLocal101 = bucketBoardLocal106.integerState0446 + integerLocal99;
                        if (integerLocal101 > 0) {
                          bucketBoardLocal106.integerState0458 = (bucketBoardLocal106.integerState0458 * bucketBoardLocal106.integerState0446 + integerLocal100 * integerLocal99 + integerLocal101 / 2) / integerLocal101;
                        }
                        bucketBoardLocal106.integerState0446 = integerLocal101;
                        if (integerLocal82 < integerLocal40) {
                          integerLocal102 = (int)(floatLocal97 + 0.5f);
                          MixedSupport025.integerState0152 = (MixedSupport077.integerArrayState0140[integerLocal82] + CollectionSupport003.integerArrayState0169[integerLocal82]) / 2;
                          NetworkSupport012.integerState0758 = (RenderingSupport013.integerArrayState0191[integerLocal82] + MixedSupport132.integerArrayState0209[integerLocal82]) / 2;
                          this.performAction1473((byte) -17, integerLocal35, integerLocal28 - integerLocal82, integerArrayLocal33);
                          integerLocal103 = 128 + (MixedSupport025.integerState0152 * 400 + NetworkSupport012.integerState0758 / 2) / NetworkSupport012.integerState0758;
                          if (integerLocal103 >= 0) {
                            if (integerLocal103 > 256) {
                              integerLocal103 = 256;
                            }
                          } else {
                            integerLocal103 = 0;
                          }
                          integerLocal164 = bucketBoardLocal106.integerState0474 + integerLocal102;
                          if (integerLocal164 > 0) {
                            bucketBoardLocal106.integerState0462 = (bucketBoardLocal106.integerState0462 * bucketBoardLocal106.integerState0474 + integerLocal103 * integerLocal102 + integerLocal164 / 2) / integerLocal164;
                          }
                          bucketBoardLocal106.integerState0474 = integerLocal164;
                        }
                      }
                    } else {
                      NetworkSupport007.integerArrayState0156[integerLocal82] = integerLocal72;
                      UiComponentPart020.integerArrayState0175[integerLocal82] = integerLocal130;
                      CollectionSupport003.integerArrayState0169[integerLocal82] = integerLocal72;
                      MixedSupport132.integerArrayState0209[integerLocal82] = integerLocal130;
                      if (integerLocal82 < integerLocal40) {
                        MixedSupport077.integerArrayState0140[integerLocal82] = integerLocal72;
                        RenderingSupport013.integerArrayState0191[integerLocal82] = integerLocal130;
                      }
                    }
                  }
                  if (!(booleanArgument5)) {
                    for (integerLocal160 = integerLocal38 - 1; integerLocal160 >= 0; integerLocal160--) {
                      regionExit2: {
                        integerLocal161 = (integerLocal28 - integerLocal160 + integerLocal25) % integerLocal25;
                        if (integerArgument3 > 1) {
                          if (!booleanArgument4) {
                            if (integerLocal161 != integerLocal36) {
                              floatLocal62 = 0.0f;
                              break regionExit2;
                            }
                          } else {
                            if (integerLocal161 == integerLocal36) {
                              floatLocal62 = 0.0f;
                              break regionExit2;
                            }
                            if (integerLocal160 >= integerLocal79) {
                              floatLocal62 = 0.0f;
                              break regionExit2;
                            }
                            if (integerLocal160 < integerLocal77) {
                              break;
                            }
                          }
                        }
                        bucketBoardLocal84 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal161];
                        integerLocal86 = 0;
                        if (bucketBoardLocal84 == null) {
                          bucketBoardLocal84 = this.buckets[integerLocal161];
                          integerLocal86 = 1;
                        }
                        if (bucketBoardLocal84 != null &&
                          bucketBoardLocal84.pieceAcknowledgement >= 0) {
                          if (integerLocal160 < integerLocal40) {
                            integerLocal88 = (int)(floatLocal62 * (float)UiComponentPart020.integerArrayState0175[integerLocal160] * 0.10000000149011612f);
                            floatLocal62 = 0.0f;
                            MixedSupport025.integerState0152 = (MixedSupport077.integerArrayState0140[integerLocal160] + CollectionSupport003.integerArrayState0169[integerLocal160]) / 2 - integerLocal88;
                            NetworkSupport012.integerState0758 = (RenderingSupport013.integerArrayState0191[integerLocal160] + MixedSupport132.integerArrayState0209[integerLocal160]) / 2;
                            this.performAction1473((byte) -17, integerLocal35, integerLocal28 - integerLocal160, integerArrayLocal33);
                            this.performAction1481(integerLocal161, MixedSupport025.integerState0152, 120, integerLocal24, NetworkSupport012.integerState0758, 4, integerLocal35, integerLocal86 != 0);
                          }
                          stringLocal107 = this.mixedSupport028State0001.stringArrayState0009[integerLocal161];
                          integerLocal90 = (int)(floatLocal62 * (float)UiComponentPart020.integerArrayState0175[integerLocal160] * 0.10000000149011612f);
                          floatLocal62 = 0.0f;
                          MixedSupport025.integerState0152 = CollectionSupport003.integerArrayState0169[integerLocal160] - integerLocal90;
                          BufferedSocket.integerState0664 = NetworkSupport007.integerArrayState0156[integerLocal160] - integerLocal90;
                          NetworkSupport012.integerState0758 = MixedSupport132.integerArrayState0209[integerLocal160];
                          MixedSupport056.integerState0289 = UiComponentPart020.integerArrayState0175[integerLocal160];
                          this.performAction1477(integerLocal28 - integerLocal160, MixedSupport108.floatArrayState0002[integerLocal160], integerLocal35, integerLocal86 != 0, integerArrayLocal33, 2);
                          this.performAction1482(BufferedSocket.integerState0664, MixedSupport056.integerState0289, stringLocal107, (byte) -43, -1500, integerLocal24, integerLocal161, 1740, MixedSupport025.integerState0152, integerLocal86 != 0, NetworkSupport012.integerState0758);
                        } else {
                          floatLocal62 = 0.0f;
                        }
                      }
                    }
                  }
                } else {
                  integerLocal132 = integerLocal44 - integerLocal44 * (integerArgument2 + 1) / integerArgument3;
                  integerLocal133 = integerLocal44 - integerLocal44 * integerArgument2 / integerArgument3;
                  floatLocal134 = 270.0f * (floatLocal58 + (1.0f - floatLocal58) * floatLocal49);
                  for (integerLocal135 = 0; integerLocal135 < integerLocal44; integerLocal135++) {
                    integerLocal137 = (integerLocal28 + 1 + integerLocal135) % integerLocal25;
                    if (integerArrayLocal33[integerLocal137] != 0) {
                      floatLocal139 = this.computeFloat1478(-113, integerArrayLocal33[integerLocal137]);
                      floatLocal141 = floatLocal134;
                      floatLocal143 = 2700.0f;
                      if (integerLocal135 >= integerLocal41) {
                        floatLocal141 = floatLocal141 * 126.0f / 270.0f;
                        floatLocal143 = 1260.0f;
                      }
                      floatLocal141 = floatLocal141 * floatLocal139;
                      floatLocal143 = floatLocal143 * floatLocal139;
                      integerLocal128 = integerLocal128 + (int)(floatLocal141 + 0.5f);
                      MixedSupport077.integerArrayState0140[integerLocal135] = integerLocal72;
                      RenderingSupport013.integerArrayState0191[integerLocal135] = integerLocal130;
                      floatLocal145 = 0.0f;
                      floatLocal146 = 1.5707963705062866f;
                      integerLocal147 = 0;
                      integerLocal148 = 0;
                      for (integerLocal149 = 0; integerLocal149 < 10; integerLocal149++) {
                        floatLocal182 = (floatLocal145 + floatLocal146) * 0.5f;
                        integerLocal173 = integerLocal72 + (int)((double)floatLocal143 * Math.cos((double)floatLocal182) + 0.5);
                        integerLocal174 = integerLocal130 + (int)((double)floatLocal143 * Math.sin((double)floatLocal182) + 0.5);
                        integerLocal152 = 320 + integerLocal173 * 1000 / integerLocal174;
                        if (integerLocal152 >= integerLocal128) {
                          floatLocal145 = floatLocal182;
                        } else {
                          floatLocal146 = floatLocal182;
                        }
                      }
                      floatLocal182 = floatLocal145;
                      floatLocal150 = floatLocal141 * 128.0f / 270.0f;
                      floatLocal151 = floatLocal150;
                      if (integerLocal135 == integerLocal41) {
                        floatLocal182 = floatLocal182 * ((1.0f - floatLocal63) * (1.0f - floatLocal63));
                        floatLocal151 = floatLocal151 * (1.0f - floatLocal63);
                      }
                      cachedIntegerLocal6 = integerLocal72 + (int)((double)(1260.0f * floatLocal139) * Math.cos((double)floatLocal182) + 0.5);
                      integerLocal72 = cachedIntegerLocal6;
                      CollectionSupport003.integerArrayState0169[integerLocal135] = cachedIntegerLocal6;
                      cachedIntegerLocal7 = integerLocal130 + (int)((double)(1260.0f * floatLocal139) * Math.sin((double)floatLocal182) + 0.5);
                      integerLocal130 = cachedIntegerLocal7;
                      MixedSupport132.integerArrayState0209[integerLocal135] = cachedIntegerLocal7;
                      if (integerLocal135 < integerLocal41) {
                        if (integerLocal135 == integerLocal44 - 1) {
                          floatLocal182 = floatLocal182 * ((1.0f - floatLocal63) * (1.0f - floatLocal63));
                          floatLocal150 = floatLocal150 * (1.0f - floatLocal63);
                        }
                        cachedIntegerLocal8 = integerLocal72 + (int)((double)(1440.0f * floatLocal139) * Math.cos((double)floatLocal182) + 0.5);
                        integerLocal72 = cachedIntegerLocal8;
                        NetworkSupport007.integerArrayState0156[integerLocal135] = cachedIntegerLocal8;
                        cachedIntegerLocal9 = integerLocal130 + (int)((double)(1440.0f * floatLocal139) * Math.sin((double)floatLocal182) + 0.5);
                        integerLocal130 = cachedIntegerLocal9;
                        UiComponentPart020.integerArrayState0175[integerLocal135] = cachedIntegerLocal9;
                      }
                      MixedSupport108.floatArrayState0002[integerLocal135] = floatLocal182;
                      floatLocal134 = floatLocal134 * (1.0f + (floatLocal58 - 1.0f) * floatLocal139);
                      bucketBoardLocal108 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal137];
                      if (bucketBoardLocal108 != null) {
                        integerLocal153 = (int)(floatLocal151 + 0.5f);
                        MixedSupport025.integerState0152 = (MixedSupport077.integerArrayState0140[integerLocal135] + CollectionSupport003.integerArrayState0169[integerLocal135]) / 2;
                        NetworkSupport012.integerState0758 = (RenderingSupport013.integerArrayState0191[integerLocal135] + MixedSupport132.integerArrayState0209[integerLocal135]) / 2;
                        this.performAction1473((byte) -17, integerLocal35, integerLocal28 + 1 + integerLocal135, integerArrayLocal33);
                        integerLocal154 = 128 + (MixedSupport025.integerState0152 * 400 + NetworkSupport012.integerState0758 / 2) / NetworkSupport012.integerState0758;
                        if (integerLocal154 >= 0) {
                          if (integerLocal154 > 256) {
                            integerLocal154 = 256;
                          }
                        } else {
                          integerLocal154 = 0;
                        }
                        integerLocal155 = bucketBoardLocal108.integerState0474 + integerLocal153;
                        if (integerLocal155 > 0) {
                          bucketBoardLocal108.integerState0462 = (bucketBoardLocal108.integerState0462 * bucketBoardLocal108.integerState0474 + integerLocal154 * integerLocal153 + integerLocal155 / 2) / integerLocal155;
                        }
                        bucketBoardLocal108.integerState0474 = integerLocal155;
                        if (integerLocal135 < integerLocal41) {
                          integerLocal156 = (int)(floatLocal150 + 0.5f);
                          MixedSupport025.integerState0152 = CollectionSupport003.integerArrayState0169[integerLocal135];
                          BufferedSocket.integerState0664 = NetworkSupport007.integerArrayState0156[integerLocal135];
                          NetworkSupport012.integerState0758 = MixedSupport132.integerArrayState0209[integerLocal135];
                          MixedSupport056.integerState0289 = UiComponentPart020.integerArrayState0175[integerLocal135];
                          this.performAction1477(integerLocal28 + 1 + integerLocal135, MixedSupport108.floatArrayState0002[integerLocal135], integerLocal35, false, integerArrayLocal33, 2);
                          integerLocal157 = 128 + (MixedSupport025.integerState0152 + BufferedSocket.integerState0664) * 400 / (NetworkSupport012.integerState0758 + MixedSupport056.integerState0289);
                          if (integerLocal157 >= 0) {
                            if (integerLocal157 > 256) {
                              integerLocal157 = 256;
                            }
                          } else {
                            integerLocal157 = 0;
                          }
                          integerLocal175 = bucketBoardLocal108.integerState0446 + integerLocal156;
                          if (integerLocal175 > 0) {
                            bucketBoardLocal108.integerState0458 = (bucketBoardLocal108.integerState0458 * bucketBoardLocal108.integerState0446 + integerLocal157 * integerLocal156 + integerLocal175 / 2) / integerLocal175;
                          }
                          bucketBoardLocal108.integerState0446 = integerLocal175;
                        }
                      }
                    } else {
                      MixedSupport077.integerArrayState0140[integerLocal135] = integerLocal72;
                      RenderingSupport013.integerArrayState0191[integerLocal135] = integerLocal130;
                      CollectionSupport003.integerArrayState0169[integerLocal135] = integerLocal72;
                      MixedSupport132.integerArrayState0209[integerLocal135] = integerLocal130;
                      if (integerLocal135 < integerLocal41) {
                        NetworkSupport007.integerArrayState0156[integerLocal135] = integerLocal72;
                        UiComponentPart020.integerArrayState0175[integerLocal135] = integerLocal130;
                      }
                    }
                  }
                  if (!booleanArgument5) {
                    for (integerLocal136 = integerLocal44 - 1; integerLocal136 >= 0; integerLocal136--) {
                      regionExit3: {
                        integerLocal138 = (integerLocal28 + 1 + integerLocal136) % integerLocal25;
                        if (integerArgument3 > 1) {
                          if (!booleanArgument4) {
                            if (integerLocal138 != integerLocal36) {
                              floatLocal63 = 0.0f;
                              break regionExit3;
                            }
                          } else {
                            if (integerLocal138 == integerLocal36) {
                              floatLocal63 = 0.0f;
                              break regionExit3;
                            }
                            if (integerLocal136 >= integerLocal133) {
                              floatLocal63 = 0.0f;
                              break regionExit3;
                            }
                            if (integerLocal136 < integerLocal132) {
                              break;
                            }
                          }
                        }
                        bucketBoardLocal158 = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal138];
                        integerLocal140 = 0;
                        if (bucketBoardLocal158 == null) {
                          bucketBoardLocal158 = this.buckets[integerLocal138];
                          integerLocal140 = 1;
                        }
                        if (bucketBoardLocal158 != null &&
                          bucketBoardLocal158.pieceAcknowledgement >= 0) {
                          if (integerLocal136 < integerLocal41) {
                            stringLocal109 = this.mixedSupport028State0001.stringArrayState0009[integerLocal138];
                            integerLocal144 = (int)(floatLocal63 * (float)RenderingSupport013.integerArrayState0191[integerLocal136] * 0.10000000149011612f);
                            floatLocal63 = 0.0f;
                            MixedSupport025.integerState0152 = CollectionSupport003.integerArrayState0169[integerLocal136] + integerLocal144;
                            BufferedSocket.integerState0664 = NetworkSupport007.integerArrayState0156[integerLocal136] + integerLocal144;
                            NetworkSupport012.integerState0758 = MixedSupport132.integerArrayState0209[integerLocal136];
                            MixedSupport056.integerState0289 = UiComponentPart020.integerArrayState0175[integerLocal136];
                            this.performAction1477(integerLocal28 + 1 + integerLocal136, MixedSupport108.floatArrayState0002[integerLocal136], integerLocal35, integerLocal140 != 0, integerArrayLocal33, 2);
                            this.performAction1482(BufferedSocket.integerState0664, MixedSupport056.integerState0289, stringLocal109, (byte) 118, -1500, integerLocal24, integerLocal138, 1740, MixedSupport025.integerState0152, integerLocal140 != 0, NetworkSupport012.integerState0758);
                          }
                          integerLocal142 = (int)(floatLocal63 * (float)RenderingSupport013.integerArrayState0191[integerLocal136] * 0.10000000149011612f);
                          floatLocal63 = 0.0f;
                          MixedSupport025.integerState0152 = (MixedSupport077.integerArrayState0140[integerLocal136] + CollectionSupport003.integerArrayState0169[integerLocal136]) / 2 + integerLocal142;
                          NetworkSupport012.integerState0758 = (RenderingSupport013.integerArrayState0191[integerLocal136] + MixedSupport132.integerArrayState0209[integerLocal136]) / 2;
                          this.performAction1473((byte) -17, integerLocal35, integerLocal28 + 1 + integerLocal136, integerArrayLocal33);
                          this.performAction1481(integerLocal138, MixedSupport025.integerState0152, 120, integerLocal24, NetworkSupport012.integerState0758, 4, integerLocal35, integerLocal140 != 0);
                        } else {
                          floatLocal63 = 0.0f;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (booleanArgument4) {
              break regionExit1;
            }
            if (booleanArgument5) {
              return;
            }
            integerLocal24 = 240;
            integerLocal25 = 50 - this.integerState0639;
            integerLocal27 = 480 - 480 * integerLocal25 * integerLocal25 / 2500;
            bucketBoardLocal110 = this.mixedSupport028State0001.bucketBoardArrayState0001[0];
            nodeDequeLocal111 = this.nodeDequeArrayState0002[0];
            integerLocal32 = this.integerArrayState0189[0];
            doubleLocal34 = 0.0;
            integerLocal38 = (int)(720.0 * Math.cos(doubleLocal34));
            integerLocal40 = (int)(720.0 * Math.sin(doubleLocal34));
            this.performAction1491(bucketBoardLocal110, 10000, -1800, this.integerState0602, 120, true, integerLocal24, this.mixedSupport028State0001.integerState0166);
            GameSession.performAction1486(this.mixedSupport028State0001.integerState0166, bucketBoardLocal110, integerLocal24 - integerLocal27, -integerLocal38, -1500, 10000 - integerLocal40, integerLocal38, 1740, 10000 + integerLocal40, (String) null, (AnimatedTileRegion) null, (int[]) null, integerLocal32, nodeDequeLocal111, this.integerState0623, this.integerState0642);
          }
          if (!booleanArgument4) {
            if (booleanArgument5) {
              return;
            }
            regionExit4: {
              this.integerState0643 = -3;
              if (!this.booleanState0140) {
                stackIntegerLocal15 = (!this.booleanState0147) ? 127 : 167;
                integerLocal115 = stackIntegerLocal15;
                SoftwareRaster.performAction0739(447, 61, 150, integerLocal115 + 15 + 27, 14676, 87166);
                SoftwareRaster.performAction0739(452, 66, 140, integerLocal115, 14676, 4427445);
                GameplayControls.performAction1978(16 + integerLocal115 + 15, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, 50, 437);
                GameplayControls.performAction1978(45, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, 66 + integerLocal115 + 15 - 13, 437);
                integerLocal116 = 66;
                if (!this.booleanState0147) {
                  MixedSupport042.performAction0595(integerLocal116 + 16, 256, 16777215, MixedSupport108.stringState0437, 457, UiComponentPart029.renderingSupport010State0005);
                  this.performAction1480(12769767, 457, 22, integerLocal116 + 20, 0, 49, 9918);
                  MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal116 + 36, Integer.toString(this.integerState0600 + 1), 16777215, 501);
                } else {
                  MixedSupport042.performAction0595(integerLocal116 + 16, 256, 16777215, CodecSupport003.stringState0469, 457, UiComponentPart029.renderingSupport010State0005);
                  this.performAction1480(12769767, 457, 22, integerLocal116 + 20, 0, 49, 9918);
                  MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal116 + 36, this.integerState0603 + 1 + "/" + 8, 16777215, 501);
                }
                stackIntegerLocal16 = (!this.booleanState0139) ? 16777215 : 16711680;
                integerLocal117 = stackIntegerLocal16;
                MixedSupport076.performAction1039(UiComponentPart029.renderingSupport010State0005, (byte) -39, integerLocal116 + 16, MixedSupport015.stringState0071.trim(), integerLocal117, 587);
                this.performAction1480(12769767, 514, 22, integerLocal116 + 20, 0, 73, 9918);
                integerLocal118 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0493 + this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0466 + this.integerState0599;
                MixedSupport076.performAction1039(SceneWidget.renderingSupport010State0007, (byte) -39, integerLocal116 + 36, Integer.toString(integerLocal118), integerLocal117, 582);
                integerLocal116 += 40;
                MixedSupport029.performAction0447(16777215, 522, GameAssets.stringState0503, integerLocal116 + 16, (byte) 75, UiComponentPart029.renderingSupport010State0005);
                this.performAction1480(12769767, 457, 22, integerLocal116 + 20, 0, 130, 9918);
                for (integerLocal119 = 0; integerLocal119 < 7; integerLocal119++) {
                  if (integerLocal119 >= this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0477) {
                    MixedSupport035.rgbSpriteArrayArrayState0006[this.mixedSupport028State0001.integerState0166][integerLocal119].performAction0303(459 + integerLocal119 * 18, integerLocal116 + 22, 18, 18, 14676);
                  } else {
                    MixedSupport035.rgbSpriteArrayArrayState0006[this.mixedSupport028State0001.integerState0166][integerLocal119].performAction0302(459 + integerLocal119 * 18, integerLocal116 + 22, 18, 18);
                  }
                }
                integerLocal116 += 40;
                MixedSupport029.performAction0447(16777215, 522, UiComponentPart018.stringState0344, integerLocal116 + 16, (byte) 75, UiComponentPart029.renderingSupport010State0005);
                this.performAction1480(12769767, 457, 22, integerLocal116 + 20, 0, 130, 9918);
                integerLocal178 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0471;
                if (integerLocal178 < 1) {
                  RenderingSupport007.rgbSpriteState0026.performAction0303(459, integerLocal116 + 22, 18, 18, 14676);
                } else {
                  RenderingSupport007.rgbSpriteState0026.performAction0302(459, integerLocal116 + 22, 18, 18);
                  if (HashNode.integerState0069 >= 459 &&
                    HashNode.integerState0069 < 477 &&
                    MixedSupport106.integerState0590 >= integerLocal116 + 22 &&
                    MixedSupport106.integerState0590 < integerLocal116 + 22 + 18) {
                    this.integerState0643 = 6;
                  }
                }
                integerLocal120 = 0;
                if (integerLocal178 >= 2) {
                  integerLocal120 = 2;
                }
                if (integerLocal178 >= 3) {
                  integerLocal120 = 4;
                }
                if (integerLocal178 >= 4) {
                  integerLocal120 = 6;
                }
                for (integerLocal36 = 0; integerLocal36 < 6; integerLocal36++) {
                  if (integerLocal36 >= integerLocal120) {
                    MixedSupport127.computeRgbSprite1815(true, integerLocal36).performAction0303(477 + 18 * integerLocal36, integerLocal116 + 22, 18, 18, 14676);
                  } else {
                    MixedSupport127.computeRgbSprite1815(true, integerLocal36).performAction0302(477 + 18 * integerLocal36, integerLocal116 + 22, 18, 18);
                    if (HashNode.integerState0069 >= 477 + 18 * integerLocal36 &&
                      HashNode.integerState0069 < 477 + 18 * integerLocal36 + 18 &&
                      MixedSupport106.integerState0590 >= integerLocal116 + 22 &&
                      MixedSupport106.integerState0590 < integerLocal116 + 22 + 18) {
                      this.integerState0643 = integerLocal36;
                    }
                  }
                }
                integerLocal116 += 40;
                if (this.booleanState0147) {
                  MixedSupport029.performAction0447(16777215, 522, Framebuffer.stringState0154, integerLocal116 + 16, (byte) 75, UiComponentPart029.renderingSupport010State0005);
                  this.performAction1480(12769767, 457, 22, integerLocal116 + 20, 0, 130, 9918);
                  integerLocal36 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0483;
                  if (integerLocal36 != 0) {
                    rgbSpriteLocal112 = CodecSupport001.rgbSpriteArrayState0018[integerLocal36 - 1];
                    rgbSpriteLocal112.performAction0308(460, integerLocal116 + 24 - 2, 0);
                    rgbSpriteLocal112.performAction0308(462, integerLocal116 + 24 - 2, 0);
                    rgbSpriteLocal112.performAction0308(464, integerLocal116 + 24 - 2, 0);
                    rgbSpriteLocal112.performAction0308(460, integerLocal116 + 24, 0);
                    rgbSpriteLocal112.performAction0308(464, integerLocal116 + 24, 0);
                    rgbSpriteLocal112.performAction0308(460, integerLocal116 + 24 + 2, 0);
                    rgbSpriteLocal112.performAction0308(462, integerLocal116 + 24 + 2, 0);
                    rgbSpriteLocal112.performAction0308(464, integerLocal116 + 24 + 2, 0);
                    rgbSpriteLocal112.performAction0300(462, integerLocal116 + 24);
                    MixedSupport042.performAction0595(integerLocal116 + 36, 256, 16777215, MixedSupport127.stringArrayArrayState0008[4][integerLocal36 - 1], 462 + rgbSpriteLocal112.integerState0254 + 6, SceneWidget.renderingSupport010State0007);
                  } else {
                    MixedSupport042.performAction0595(integerLocal116 + 36, 256, 16777215, MixedSupport127.stringArrayArrayState0008[4][3], 462, SceneWidget.renderingSupport010State0007);
                  }
                  integerLocal116 += 40;
                }
                mixedSupport117Local37 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].mixedSupport117State0001;
                if (mixedSupport117Local37 != null) {
                  this.performAction1492(mixedSupport117Local37, (byte) 119);
                }
                nodeDequeLocal113 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].nodeDequeState0018;
                mixedSupport117Local114 = (MixedSupport117) (nodeDequeLocal113.computeHashNode1969(true));
                while (mixedSupport117Local114 != null) {
                  this.performAction1492(mixedSupport117Local114, (byte) 115);
                  mixedSupport117Local114 = (MixedSupport117) (nodeDequeLocal113.computeHashNode1972(true));
                }
                if (this.booleanState0147 &&
                  this.integerState0603 < 7 &&
                  this.integerState0603 != -1) {
                  MixedSupport035.rgbSpriteArrayArrayState0006[this.integerState0603 % 8][this.integerState0603 % 7].performAction0302(452, 66 + integerLocal115 + 16, 18, 18);
                  MixedSupport035.rgbSpriteArrayArrayState0006[(this.integerState0603 + 1) % 8][(this.integerState0603 + 1) % 7].performAction0302(574, 66 + integerLocal115 + 16, 18, 18);
                  this.performAction1480(0, 473, 16, 66 + integerLocal115 + 17, 12769767, 98, 9918);
                  SoftwareRaster.performAction0719(476, 66 + integerLocal115 + 20, 92, 10, 0);
                  SoftwareRaster.performAction0728(0, 0, 476 + 92 * this.integerState0614 / this.computeInteger1497((byte) -122), 480);
                  UiComponentPart020.performAction1324(92, 10, 16776960, -1, 16711680, 476, 66 + integerLocal115 + 20);
                  SoftwareRaster.performAction0736();
                } else {
                  if (!this.booleanState0147) {
                    integerLocal121 = 3;
                    if (UiComponentPart015.integerState0319 > integerLocal121) {
                      integerLocal121 = UiComponentPart015.integerState0319;
                    }
                    MixedSupport035.rgbSpriteArrayArrayState0006[this.integerState0600 % (integerLocal121 + 1)][this.integerState0600 % 7].performAction0302(452, 66 + integerLocal115 + 16, 18, 18);
                    MixedSupport035.rgbSpriteArrayArrayState0006[(this.integerState0600 + 1) % (integerLocal121 + 1)][(this.integerState0600 + 1) % 7].performAction0302(574, 66 + integerLocal115 + 16, 18, 18);
                    this.performAction1480(0, 473, 16, 66 + integerLocal115 + 17, 12769767, 98, 9918);
                    SoftwareRaster.performAction0719(476, 66 + integerLocal115 + 20, 92, 10, 0);
                    SoftwareRaster.performAction0728(0, 0, 476 + 92 * this.integerState0614 / this.computeInteger1497((byte) 125), 480);
                    UiComponentPart020.performAction1324(92, 10, 16776960, -1, 16711680, 476, 66 + integerLocal115 + 20);
                    SoftwareRaster.performAction0736();
                  }
                }
                if (this.integerState0644 > 0) {
                  integerLocal179 = 480 - 480 * this.integerState0644 * this.integerState0644 / 2500;
                  if (!this.booleanState0147) {
                    if (this.integerState0646 < 0) {
                      stringLocal104 = CollectionSupport001.computeString0336(103, UiComponentPart009.stringState0126, new String[]{Integer.toString(this.integerState0624 + 1)});
                      stringLocal42 = stringLocal104;
                      stringLocal42 = CollectionSupport001.computeString0336(119, UiComponentPart015.stringState0252, new String[]{stringLocal104, UiComponentPart018.stringArrayState0021[this.integerState0624]});
                    } else {
                      stringLocal42 = NetworkSupport004.stringState0209;
                    }
                  } else {
                    stringLocal42 = UiComponentPart002.stringState0037;
                  }
                  if (this.integerState0646 < 0) {
                    if (!this.booleanState0147) {
                      stackStringArrayLocal17 = UiComponentPart028.stringArrayState0040;
                    } else {
                      stackStringArrayLocal17 = MixedSupport137.stringArrayState0050;
                    }
                    stringLocal45 = stackStringArrayLocal17[this.integerState0624];
                  } else {
                    stringLocal45 = InputAdapter006.stringArrayState0043[this.integerState0646];
                  }
                  integerLocal47 = MixedSupport001.renderingSupport010State0001.computeInteger1209(stringLocal42, 164);
                  integerLocal124 = UiComponentPart029.renderingSupport010State0005.computeInteger1209(stringLocal45, 164);
                  integerLocal51 = SceneWidget.renderingSupport010State0007.computeInteger1209(MixedSupport006.stringState0029, 164);
                  integerLocal53 = 0;
                  if (this.integerState0646 < 0 &&
                    !this.booleanState0147) {
                    if (this.integerState0624 == 0) {
                      integerLocal125 = 92;
                    } else if (this.integerState0624 == 1) {
                      integerLocal125 = 92;
                    } else if (this.integerState0624 == 2) {
                      integerLocal125 = 93;
                    } else {
                      if (this.integerState0624 != 3) {
                        throw new IllegalStateException();
                      }
                      integerLocal125 = 92;
                    }
                  } else {
                    integerLocal125 = 0;
                  }
                  integerLocal55 = 12 + integerLocal47 * 16 + 12 + integerLocal124 * 16 + 8 + integerLocal125 + 8 + integerLocal51 * 16 + 14;
                  integerLocal176 = (480 - integerLocal55) / 2 + integerLocal179;
                  SoftwareRaster.performAction0720(224, integerLocal176 + 4, 192, integerLocal55 - 8, 0, 160);
                  GameplayControls.performAction1978(integerLocal55, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 200, integerLocal176, 220);
                  integerLocal176 += 12;
                  MixedSupport045.computeInteger0612(164, 0, integerLocal176, stringLocal42, 16, 180, 16777215, MixedSupport001.renderingSupport010State0001, (byte) -128, 1, 239);
                  integerLocal176 = integerLocal176 + (integerLocal47 * 16 + 12);
                  MixedSupport045.computeInteger0612(164, 0, integerLocal176, stringLocal45, 16, 180, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -128, 1, 238);
                  integerLocal176 = integerLocal176 + (integerLocal124 * 16 + 8);
                  if (this.integerState0646 < 0 &&
                    !this.booleanState0147) {
                    if (this.integerState0624 != 0) {
                      if (this.integerState0624 == 1) {
                        if (this.integerState0628 >= 80) {
                          stackIntegerLocal18 = 54;
                        } else {
                          stackIntegerLocal18 = this.integerState0628 / 20 * 18;
                        }
                        integerLocal57 = stackIntegerLocal18;
                        integerLocal59 = 0;
                        if (this.integerState0628 >= 60) {
                          if (this.integerState0628 >= 80) {
                            if (this.integerState0628 >= 93) {
                              SoftwareRaster.performAction0721(281, integerLocal176 + 54 - 2, 78, 40, 4, 65280, 100);
                            } else {
                              integerLocal59 = MixedSupport148.computeInteger1983(23841, 80, SceneWidgetPart013.integerArrayState0239[this.integerState0628 - 80 + 1] * 18 + 40);
                            }
                          } else {
                            integerLocal57 = integerLocal57 + MixedSupport148.computeInteger1983(23841, 80, this.integerState0636 * 18 + 40);
                          }
                        } else {
                          integerLocal57 = integerLocal57 + MixedSupport148.computeInteger1983(23841, 80, this.integerState0632 * 18 + 40);
                        }
                        for (integerLocal10 = 0; integerLocal10 < 3; integerLocal10++) {
                          MixedSupport035.rgbSpriteArrayArrayState0006[1][0].performAction0302(302 + integerLocal10 * 18, integerLocal176 + 72, 18, 18);
                        }
                        MixedSupport035.rgbSpriteArrayArrayState0006[1][2].performAction0302(302, integerLocal176 + 54, 18, 18);
                        MixedSupport035.rgbSpriteArrayArrayState0006[1][2].performAction0302(284, integerLocal176 + 54, 18, 18);
                        MixedSupport035.rgbSpriteArrayArrayState0006[1][2].performAction0302(284, integerLocal176 + 72, 18, 18);
                        RenderingSupport007.rgbSpriteState0026.performAction0302(320, integerLocal176 + integerLocal57 + integerLocal59, 18, 18 - integerLocal59);
                      } else {
                        if (this.integerState0624 != 2) {
                          if (this.integerState0624 != 3) {
                            throw new IllegalStateException();
                          }
                          GameplayControls.performAction1979(this.integerState0636, 320, 3, this.integerState0632, this.integerState0628, integerLocal176, -22981);
                        } else {
                          MixedSupport043.performAction0602(2, 320, integerLocal176, this.integerState0632, this.integerState0628, 123, this.integerState0636);
                        }
                      }
                    } else {
                      CodecSupport004.performAction1634(integerLocal176, this.integerState0628, this.integerState0632, -115, 320, this.integerState0636, 0);
                    }
                  }
                  integerLocal176 = integerLocal176 + (integerLocal125 + 8);
                  MixedSupport045.computeInteger0612(164, 0, integerLocal176, MixedSupport006.stringState0029, 16, 120, 16777215, SceneWidget.renderingSupport010State0007, (byte) -126, 1, 238);
                }
                if (!this.booleanState0140) {
                  if (!this.booleanState0147) {
                    stackIntegerLocal20 = (this.integerState0633 <= 0) ? 0 : 1;
                    integerLocal180 = stackIntegerLocal20;
                    integerLocal177 = 480 - 200 * this.integerState0633 * this.integerState0633 / 400;
                  } else {
                    stackIntegerLocal19 = (!this.booleanState0146) ? 0 : 1;
                    integerLocal180 = stackIntegerLocal19;
                    integerLocal177 = 66 + integerLocal115 + 34;
                  }
                  if (integerLocal180 == 0) {
                    if ((this.booleanState0147)) {
                      integerLocal122 = UiComponentPart029.renderingSupport010State0005.computeInteger1209(ThemeTips.themeTips[this.integerState0603], 140);
                      integerLocal123 = 32 + integerLocal122 * 16 + 13;
                      SoftwareRaster.performAction0720(441, integerLocal177 + 4, 163, integerLocal123 - 8, 0, 150);
                      GameplayControls.performAction1978(integerLocal123, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, integerLocal177, 437);
                      MixedSupport042.performAction0595(integerLocal177 + 26, 256, 16777215, CollectionSupport001.computeString0336(102, DekoBlokoClient.stringState0095, new String[]{Integer.toString(this.integerState0603 + 1)}), 452, SceneWidget.renderingSupport010State0007);
                      MixedSupport045.computeInteger0612(140, 0, integerLocal177 + 32, ThemeTips.themeTips[this.integerState0603], 16, 120, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -126, 0, 452);
                    }
                    break regionExit4;
                  }
                  if (this.integerState0629 == -1) {
                    SoftwareRaster.performAction0720(441, integerLocal177 + 4, 163, 140, 0, 150);
                    GameplayControls.performAction1978(148, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, integerLocal177, 437);
                    MixedSupport036.performAction0557(integerLocal177 + 10, (byte) 5, false, 452);
                  } else {
                    if (this.integerState0629 == -2) {
                      SoftwareRaster.performAction0720(441, integerLocal177 + 4, 163, 140, 0, 150);
                      GameplayControls.performAction1978(148, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, integerLocal177, 437);
                      MixedSupport042.performAction0595(integerLocal177 + 26, 256, 16777215, NetworkSupport006.stringState0339, 452, SceneWidget.renderingSupport010State0007);
                      MixedSupport045.computeInteger0612(140, 0, integerLocal177 + 32, RenderingSupport013.stringState0443, 16, 120, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -126, 0, 452);
                    } else {
                      SoftwareRaster.performAction0720(441, integerLocal177 + 4, 163, 140, 0, 150);
                      GameplayControls.performAction1978(148, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 171, integerLocal177, 437);
                      if (this.integerState0629 != 6) {
                        rgbSpriteLocal43 = MixedSupport127.computeRgbSprite1815(true, this.integerState0629);
                      } else {
                        rgbSpriteLocal43 = RenderingSupport007.rgbSpriteState0026;
                      }
                      rgbSpriteLocal43.performAction0302(452, integerLocal177 + 14, 18, 18);
                      MixedSupport042.performAction0595(integerLocal177 + 28, 256, 16777215, CollectionSupport003.stringArrayArrayState0006[this.integerState0629][0], 474, SceneWidget.renderingSupport010State0007);
                      MixedSupport045.computeInteger0612(140, 0, integerLocal177 + 34, CollectionSupport003.stringArrayArrayState0006[this.integerState0629][1], 16, 120, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -126, 0, 452);
                    }
                  }
                }
              }
            }
            if (this.mixedSupport028State0001.booleanState0031 &&
              !this.booleanState0140) {
              this.performAction1508(24);
            }
            if (this.booleanState0140 &&
              this.integerState0630 > 0) {
              this.performAction1509(this.integerState0630, 104, this.renderingSupport008State0008.computeInteger0961(-1));
            } else {
              if (this.computeBoolean1511(-20459)) {
                this.performAction1509(0, 105, 0);
              }
            }
            renderingSupport006Local26 = (RenderingSupport006) (this.nodeDequeState0024.computeHashNode1970((byte) 55));
            if (renderingSupport006Local26 != null) {
              if (this.mixedSupport028State0001.booleanState0031) {
                stackIntegerLocal21 = (renderingSupport006Local26.previous == this.nodeDequeState0024.hashNodeState0009) ? 1 : 0;
              } else {
                stackIntegerLocal21 = 0;
              }
              integerLocal165 = stackIntegerLocal21;
              renderingSupport006Local26.performAction0844(1000, 1, integerLocal24, 320, integerLocal165 != 0, this.mixedSupport028State0001.integerState0166, this.integerState0631);
            }
            if (this.booleanState0140) {
              if (TextLineMetrics.booleanState0119 &&
                booleanArgument1) {
                stackIntegerLocal22 = 1;
              } else {
                if (MixedSupport010.integerState0067 > 0) {
                  stackIntegerLocal22 = ((CipherPacketBuffer.integerState0799 & 16) == 0) ? 1 : 0;
                } else {
                  stackIntegerLocal22 = 0;
                }
              }
              integerLocal166 = stackIntegerLocal22;
              integerLocal167 = MixedSupport130.integerState0788;
              if (this.integerState0602 < 50) {
                integerLocal168 = 320 - MixedSupport130.integerState0788 / 2;
                integerLocal169 = this.integerState0602;
              } else {
                integerLocal168 = 0;
                integerLocal169 = 100 - this.integerState0602;
              }
              integerLocal169 = 28 * integerLocal169 * integerLocal169 / 2500;
              this.performAction1476(integerLocal167, (byte) 123, integerLocal166 != 0, integerLocal168, RichTextLayout.sceneWidgetState0021.integerState0903 - 28 + integerLocal169);
              stackIntegerLocal23 = (integerLocal166 == 0) ? 16694016 : 16777215;
              integerLocal170 = stackIntegerLocal23;
              MixedSupport042.performAction0595(RichTextLayout.sceneWidgetState0021.integerState0903 - 6 + integerLocal169, 256, integerLocal170, GameDomainSupport003.stringState0236, integerLocal168 + 16 + 1, MixedSupport001.renderingSupport010State0001);
              if (this.mixedSupport028State0001.integerState0170 != 0 &&
                !this.mixedSupport028State0001.booleanState0031) {
                integerLocal36 = 0;
                objectLocal39 = null;
                for (integerLocal171 = 0; integerLocal171 < this.mixedSupport028State0001.integerState0173; integerLocal171++) {
                  if ((this.mixedSupport028State0001.integerState0170 & 1 << integerLocal171) != 0 &&
                    this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal171] != null &&
                    this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal171].livesRemaining > 0) {
                    if (integerLocal36 == 0) {
                      objectLocal39 = this.mixedSupport028State0001.stringArrayState0009[integerLocal171];
                    }
                    integerLocal36++;
                  }
                }
                if (integerLocal36 != 1) {
                  objectLocal39 = CollectionSupport001.computeString0336(120, SocketFactory.stringState0613, new String[]{Integer.toString(integerLocal36)});
                } else {
                  if ((this.mixedSupport028State0001.integerState0170 & 1 << this.integerState0612) == 0) {
                    objectLocal39 = CollectionSupport001.computeString0336(89, MixedSupport016.stringState0076, new String[]{(String) (objectLocal39)});
                  } else {
                    objectLocal39 = InputAdapter006.stringState0498;
                  }
                }
                if (this.integerState0612 >= 0 &&
                  (this.mixedSupport028State0001.integerState0170 & 1 << this.integerState0612) == 0 &&
                  this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612] != null &&
                  this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612].livesRemaining > 0) {
                  objectLocal39 = (String) (objectLocal39) + RenderingSupport002.stringState0086;
                }
                integerLocal181 = UiComponentPart029.renderingSupport010State0005.computeInteger1208((String) (objectLocal39));
                SoftwareRaster.performAction0721(636 - integerLocal181 - 4, 4, 4 + integerLocal181 + 100, 21, 3, 0, 200);
                UiComponentPart029.renderingSupport010State0005.performAction1228((String) (objectLocal39), 636, 19, 16777215, -1);
              }
            }
            if (this.renderingSupport008State0008 != null) {
              this.renderingSupport008State0008.performAction0962(RichTextLayout.sceneWidgetState0021.integerState0903 / 2, (byte) -54);
            }
            if (this.integerState0604 > 0) {
              this.performAction1475(640 - this.integerState0604 * this.integerState0604 * 640 / 100, (byte) 83);
            }
            if (this.integerState0606 > 0) {
              MixedSupport029.performAction0447(16694016, 960 - this.integerState0606 * this.integerState0606 * 640 / 100, MixedSupport133.stringState0551, -95 + RichTextLayout.sceneWidgetState0021.integerState0903 / 2, (byte) 75, GameApplet.renderingSupport010State0002);
            }
            if (this.integerState0619 <= 0) {
              return;
            }
            MixedSupport029.performAction0447(16694016, 960 - this.integerState0619 * this.integerState0619 * 640 / 100, MusicTrack.stringState0560, -95 + RichTextLayout.sceneWidgetState0021.integerState0903 / 2, (byte) 75, GameApplet.renderingSupport010State0002);
            return;
          }
        }
    }

    final void performAction1507(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (byteArgument1 != -68) {
          this.booleanState0146 = false;
        }
        this.booleanState0149 = true;
        if (this.booleanState0147) {
          this.performAction1500(0, -1, 0);
        } else {
          integerLocal1 = this.integerState0600;
          if (!(UiComponentPart028.stringArrayState0040.length - 1 >= integerLocal1)) {
            integerLocal1 = UiComponentPart028.stringArrayState0040.length - 1;
          }
          integerLocal2 = -1;
          if (this.booleanState0144) {
            if (integerLocal1 == 0) {
              integerLocal2 = 0;
            }
            if (integerLocal1 == 3) {
              integerLocal2 = 1;
            }
          }
          this.performAction1500(0, integerLocal2, integerLocal1);
        }
    }

    private final static void performAction1485(int integerArgument1, BucketBoard bucketBoardArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, AnimatedTileRegion animatedTileRegionArgument14, int[] integerArrayArgument15, int integerArgument16, int integerArgument17, int integerArgument18) {
        RgbSprite[] stackRgbSpriteArrayLocal1 = null;
        Object stackObjectLocal2 = null;
        int stackIntegerLocal3 = 0;
        Object stackObjectLocal4;
        Object stackObjectLocal5;
        int stackIntegerLocal6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        int stackIntegerLocal10;
        int stackIntegerLocal11;
        boolean stackBooleanLocal12;
        Object stackObjectLocal13 = null;
        int stackIntegerLocal14 = 0;
        Object stackObjectLocal15;
        Object stackObjectLocal16;
        int stackIntegerLocal17;
        int stackIntegerLocal18;
        int stackIntegerLocal19;
        int stackIntegerLocal20;
        int stackIntegerLocal21;
        int stackIntegerLocal22;
        boolean stackBooleanLocal23;
        Object stackObjectLocal24 = null;
        int stackIntegerLocal25 = 0;
        Object stackObjectLocal26;
        Object stackObjectLocal27;
        int stackIntegerLocal28;
        int stackIntegerLocal29;
        int stackIntegerLocal30;
        int stackIntegerLocal31;
        int stackIntegerLocal32;
        int stackIntegerLocal33;
        boolean stackBooleanLocal34;
        int[] stackIntegerArrayLocal35 = null;
        int stackIntegerLocal36 = 0;
        int stackIntegerLocal37 = 0;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        Object objectLocal45;
        Object objectLocal46;
        Object objectLocal47;
        Object objectLocal48;
        Object objectLocal49;
        Object objectLocal50;
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
        RgbSprite[] rgbSpriteArrayLocal62;
        int integerLocal63;
        IndexedSprite indexedSpriteLocal64;
        RgbSprite[] rgbSpriteArrayLocal65;
        int integerLocal66;
        IndexedSprite[] indexedSpriteArrayLocal67;
        int integerLocal68;
        int integerLocal69;
        int integerLocal70;
        int integerLocal71;
        int integerLocal72;
        int integerLocal73;
        int integerLocal74;
        int integerLocal75;
        int integerLocal76;
        int integerLocal77;
        int integerLocal78;
        int integerLocal79;
        int integerLocal80;
        int integerLocal81;
        int integerLocal82;
        int integerLocal83;
        int integerLocal84;
        RgbSprite[] rgbSpriteArrayLocal85;
        RgbSprite[] rgbSpriteArrayLocal86;
        RgbSprite[] rgbSpriteArrayLocal87;
        IndexedSprite[] indexedSpriteArrayLocal88;
        RgbSprite[] rgbSpriteArrayLocal89;
        RgbSprite[] rgbSpriteArrayLocal90;
        RgbSprite[] rgbSpriteArrayLocal91;
        IndexedSprite[] indexedSpriteArrayLocal92;
        RgbSprite[] rgbSpriteArrayLocal93;
        RgbSprite[] rgbSpriteArrayLocal94;
        IndexedSprite[] indexedSpriteArrayLocal95;
        IndexedSprite indexedSpriteLocal96;
        integerLocal38 = 0;
        if (integerArgument17 > 0) {
          integerLocal38 = 38 - integerArgument11 * 25 / bucketBoardArgument2.boardHeight;
          if (integerArgument17 >= integerLocal38) {
            integerArgument1 = integerArgument18;
          }
        }
        if (animatedTileRegionArgument14 != null &&
          integerArgument10 >= 0 &&
          integerArgument10 < bucketBoardArgument2.boardWidth &&
          integerArgument11 < bucketBoardArgument2.boardHeight) {
          return;
        }
        integerLocal39 = integerArgument9;
        integerLocal40 = -integerArgument7;
        integerLocal41 = bucketBoardArgument2.computeInteger1091(integerArgument10, 126, integerArgument11);
        integerLocal42 = (integerLocal41 & 24) >> 3;
        integerLocal43 = integerLocal41 >> 5;
        integerLocal44 = bucketBoardArgument2.integerState0467;
        if (integerLocal41 == 0) {
          integerLocal43 = bucketBoardArgument2.computeInteger1105(integerArgument10, (byte) 107, integerArgument11);
          if (integerLocal43 != 0) {
            integerLocal44 = 1;
          }
        }
        regionExit1: {
          objectLocal45 = null;
          objectLocal46 = null;
          objectLocal47 = null;
          objectLocal48 = null;
          objectLocal49 = null;
          objectLocal50 = null;
          integerLocal51 = 0;
          integerLocal52 = 0;
          integerLocal53 = 0;
          integerLocal54 = 2;
          integerLocal55 = 1;
          integerLocal56 = Math.abs(integerArgument9);
          integerLocal57 = 0;
          integerLocal58 = 0;
          if (integerLocal43 != 0 && (integerLocal44 == 1 ||
            integerLocal44 == 2)) {
            if (integerLocal42 != 3) {
              stackRgbSpriteArrayLocal1 = MixedSupport094.rgbSpriteArrayState0019;
            } else {
              stackRgbSpriteArrayLocal1 = InputAdapter005.rgbSpriteArrayState0022;
            }
            objectLocal45 = stackRgbSpriteArrayLocal1[integerLocal43 - 1 >> 1];
            break regionExit1;
          }
          if (integerLocal43 != 0) {
            integerLocal57 = SceneWidgetPart013.integerArrayState0239[integerLocal43];
            integerLocal58 = integerLocal57;
            if (integerLocal42 == 2 ||
              integerLocal42 == 3) {
              for (integerLocal59 = (integerArgument11 + 1) * bucketBoardArgument2.boardWidth + integerArgument10; integerLocal59 < bucketBoardArgument2.boardWidth * bucketBoardArgument2.boardHeight; integerLocal59 = integerLocal59 + bucketBoardArgument2.boardWidth) {
                integerLocal60 = bucketBoardArgument2.settledCells[integerLocal59] >> 5;
                if (integerLocal60 == 0) {
                  break;
                }
                integerLocal58 = integerLocal58 + SceneWidgetPart013.integerArrayState0239[integerLocal60];
              }
            }
          }
          if (integerLocal42 != 0 &&
            integerArgument17 < integerLocal38 &&
            integerArgument17 >= integerLocal38 - MixedSupport094.rgbSpriteArrayState0019.length * 2) {
            objectLocal46 = MixedSupport094.rgbSpriteArrayState0019[integerLocal38 - 1 - integerArgument17 >> 1];
          }
          if (integerArgument17 >= integerLocal38 ||
            !(integerArgument17 >= integerLocal38 - MixedSupport094.rgbSpriteArrayState0019.length)) {
            switch (integerLocal42) {
              case 3:
                objectLocal45 = MixedSupport127.computeRgbSprite1815(true, integerLocal41 & 7);
                break;
              case 2:
                objectLocal45 = MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][integerLocal41 & 7];
                break;
              case 1:
                if (((bucketBoardArgument2.computeInteger1091(integerArgument10 - 1, 119, integerArgument11) ^ integerLocal41) & 31) == 0) {
                  integerLocal51++;
                }
                if (((bucketBoardArgument2.computeInteger1091(integerArgument10 + 1, 82, integerArgument11) ^ integerLocal41) & 31) == 0) {
                  integerLocal51 += 2;
                }
                if (((bucketBoardArgument2.computeInteger1091(integerArgument10, 84, integerArgument11 - 1) ^ integerLocal41) & 31) == 0) {
                  integerLocal51 += 4;
                }
                if (((bucketBoardArgument2.computeInteger1091(integerArgument10, -97, integerArgument11 + 1) ^ integerLocal41) & 31) == 0) {
                  integerLocal51 += 8;
                }
                objectLocal48 = MixedSupport095.rgbSpriteArrayArrayArrayState0001[integerArgument1][integerLocal41 & 7];
                objectLocal50 = MixedSupport047.indexedSpriteArrayState0003[integerLocal51];
                break;
              default:
                break;
            }
          }
        }
        integerLocal59 = bucketBoardArgument2.computeInteger1088(integerArgument11, (byte) 105, integerArgument10);
        integerLocal60 = integerLocal59 + integerLocal58;
        integerLocal61 = integerLocal59 + integerLocal58 - integerLocal57;
        if (integerArrayArgument15 == null) {
          if (integerArgument10 == -1 &&
            integerArgument11 >= integerArgument13 &&
            integerArgument11 < bucketBoardArgument2.boardHeight + 1) {
            rgbSpriteArrayLocal85 = MixedSupport137.rgbSpriteArrayArrayState0012[integerArgument1];
            rgbSpriteArrayLocal62 = rgbSpriteArrayLocal85;
            if (rgbSpriteArrayLocal62 != null) {
              objectLocal47 = rgbSpriteArrayLocal62[rgbSpriteArrayLocal85.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal85.length - 1)];
              integerLocal54 = 6;
              integerLocal55 = 2;
              integerLocal53 = 1;
              rgbSpriteArrayLocal86 = GameDomainSupport001.rgbSpriteArrayArrayState0002[integerArgument1];
              rgbSpriteArrayLocal62 = rgbSpriteArrayLocal86;
              if (rgbSpriteArrayLocal62 != null) {
                objectLocal49 = rgbSpriteArrayLocal62[rgbSpriteArrayLocal86.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal86.length - 1)];
              }
            }
            rgbSpriteArrayLocal87 = PlatformSupport004.rgbSpriteArrayArrayState0007[integerArgument1];
            rgbSpriteArrayLocal65 = rgbSpriteArrayLocal87;
            if (rgbSpriteArrayLocal65 != null) {
              objectLocal45 = rgbSpriteArrayLocal65[rgbSpriteArrayLocal87.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal87.length - 1)];
            }
            indexedSpriteArrayLocal88 = MixedSupport015.indexedSpriteArrayArrayState0001[integerArgument1];
            indexedSpriteArrayLocal67 = indexedSpriteArrayLocal88;
            if (indexedSpriteArrayLocal67 != null) {
              objectLocal50 = indexedSpriteArrayLocal67[indexedSpriteArrayLocal88.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (indexedSpriteArrayLocal88.length - 1)];
            }
          }
          if (integerArgument10 == bucketBoardArgument2.boardWidth &&
            integerArgument11 >= integerArgument13 &&
            integerArgument11 < bucketBoardArgument2.boardHeight + 1) {
            rgbSpriteArrayLocal89 = MixedSupport112.rgbSpriteArrayArrayState0009[integerArgument1];
            rgbSpriteArrayLocal62 = rgbSpriteArrayLocal89;
            if (rgbSpriteArrayLocal62 != null) {
              objectLocal47 = rgbSpriteArrayLocal62[rgbSpriteArrayLocal89.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal89.length - 1)];
              integerLocal54 = 6;
              integerLocal55 = 2;
              integerLocal53 = 1;
              rgbSpriteArrayLocal90 = CollectionSupport002.rgbSpriteArrayArrayState0005[integerArgument1];
              rgbSpriteArrayLocal62 = rgbSpriteArrayLocal90;
              if (rgbSpriteArrayLocal62 != null) {
                objectLocal49 = rgbSpriteArrayLocal62[rgbSpriteArrayLocal90.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal90.length - 1)];
              }
            }
            rgbSpriteArrayLocal91 = MixedSupport112.rgbSpriteArrayArrayState0010[integerArgument1];
            rgbSpriteArrayLocal65 = rgbSpriteArrayLocal91;
            if (rgbSpriteArrayLocal65 != null) {
              objectLocal45 = rgbSpriteArrayLocal65[rgbSpriteArrayLocal91.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (rgbSpriteArrayLocal91.length - 1)];
            }
            indexedSpriteArrayLocal92 = ProxySocketFactory.indexedSpriteArrayArrayState0003[integerArgument1];
            indexedSpriteArrayLocal67 = indexedSpriteArrayLocal92;
            if (indexedSpriteArrayLocal67 != null) {
              objectLocal50 = indexedSpriteArrayLocal67[indexedSpriteArrayLocal92.length - 2 - (bucketBoardArgument2.boardHeight - 1 - integerArgument11) % (indexedSpriteArrayLocal92.length - 1)];
            }
          }
          if (integerArgument11 == bucketBoardArgument2.boardHeight &&
            integerArgument10 >= 0 &&
            integerArgument10 < bucketBoardArgument2.boardWidth) {
            rgbSpriteArrayLocal93 = ResourceSupport001.rgbSpriteArrayArrayState0001[integerArgument1];
            rgbSpriteArrayLocal62 = rgbSpriteArrayLocal93;
            if (rgbSpriteArrayLocal62 != null) {
              objectLocal47 = rgbSpriteArrayLocal62[integerArgument10 % rgbSpriteArrayLocal93.length];
              integerLocal54 = 6;
              integerLocal55 = 2;
              integerLocal53 = 1;
            }
            rgbSpriteArrayLocal94 = HashNode.rgbSpriteArrayArrayState0004[integerArgument1];
            rgbSpriteArrayLocal65 = rgbSpriteArrayLocal94;
            if (rgbSpriteArrayLocal65 != null) {
              objectLocal47 = rgbSpriteArrayLocal65[integerArgument10 % rgbSpriteArrayLocal94.length];
              integerLocal52 = 1;
              integerLocal54 = 6;
              integerLocal55 = 2;
            }
            indexedSpriteArrayLocal95 = MixedSupport041.indexedSpriteArrayArrayState0002[integerArgument1];
            indexedSpriteArrayLocal67 = indexedSpriteArrayLocal95;
            if (indexedSpriteArrayLocal67 != null) {
              objectLocal50 = indexedSpriteArrayLocal67[integerArgument10 % indexedSpriteArrayLocal95.length];
            }
          }
        }
        if (integerArrayArgument15 != null) {
          integerLocal63 = 0;
          if (integerArgument10 >= 0 &&
            integerArgument10 < bucketBoardArgument2.boardWidth &&
            integerArgument11 >= 0 &&
            integerArgument11 < bucketBoardArgument2.boardHeight) {
            integerLocal63 = integerArrayArgument15[integerArgument11 * bucketBoardArgument2.boardWidth + integerArgument10];
          }
          if (integerLocal63 == 0) {
            integerLocal63 = integerArrayArgument15[bucketBoardArgument2.boardWidth * bucketBoardArgument2.boardHeight];
          }
          integerLocal66 = (byte)integerLocal63;
          integerLocal68 = (byte)(integerLocal63 >> 8);
          integerLocal69 = integerLocal63 >>> 16;
          integerLocal70 = integerLocal69 * integerArgument16;
          integerLocal71 = integerLocal70 * integerLocal66 / (bucketBoardArgument2.boardHeight * 4);
          integerLocal72 = integerLocal70 * integerLocal68 / (bucketBoardArgument2.boardHeight * 4);
          integerLocal73 = (integerLocal71 * integerArgument7 + integerLocal70 * integerArgument9) / 1440;
          integerLocal74 = (integerLocal71 * integerArgument9 - integerLocal70 * integerArgument7) / 1440;
          integerArgument4 = integerArgument4 + integerLocal73;
          integerArgument5 = integerArgument5 + integerLocal72;
          integerArgument6 = integerArgument6 + integerLocal74;
        }
        if (animatedTileRegionArgument14 != null) {
          indexedSpriteLocal96 = animatedTileRegionArgument14.indexedSpriteArrayState0005[(integerArgument11 - animatedTileRegionArgument14.integerState0818) * animatedTileRegionArgument14.integerState0817 + (integerArgument10 - animatedTileRegionArgument14.integerState0814)];
          indexedSpriteLocal64 = indexedSpriteLocal96;
          if (indexedSpriteLocal64 != null) {
            if (indexedSpriteLocal64 == NetworkSupport007.indexedSpriteState0002) {
              return;
            }
            if (objectLocal50 != null) {
              for (integerLocal66 = 0; integerLocal66 < 1296; integerLocal66++) {
                MixedSupport021.indexedSpriteState0001.byteArrayState0021[integerLocal66] = (byte)(((IndexedSprite) (objectLocal50)).byteArrayState0021[integerLocal66] & indexedSpriteLocal96.byteArrayState0021[integerLocal66]);
              }
              objectLocal50 = MixedSupport021.indexedSpriteState0001;
            } else {
              objectLocal50 = indexedSpriteLocal64;
            }
          }
        }
        if (objectLocal47 != null ||
          objectLocal48 != null) {
          if (integerLocal56 <= integerArgument7) {
            integerLocal54 = integerLocal55 + ((integerLocal54 - integerLocal55) * integerLocal56 + integerArgument7 / 2) / integerArgument7;
          } else {
            integerLocal54 = integerLocal55 + ((integerLocal54 - integerLocal55) * integerArgument7 + integerLocal56 / 2) / integerLocal56;
          }
          integerLocal63 = -integerLocal54;
          if (objectLocal49 == null) {
            objectLocal49 = objectLocal47;
          }
          if (integerArgument9 > integerArgument7) {
            integerLocal63 = integerLocal54 + 1;
            if (integerLocal53 != 0) {
              integerLocal63 = integerLocal54;
            }
            for (integerLocal66 = integerLocal54; integerLocal66 >= 0; integerLocal66--) {
              integerLocal68 = bucketBoardArgument2.boardWidth * integerLocal54 * 2;
              integerLocal69 = integerArgument4 + ((integerArgument10 * integerArgument7 * integerLocal54 + integerLocal66 * integerArgument7) * 2 - integerLocal39 * integerLocal54) / integerLocal68;
              integerLocal70 = integerArgument4 + ((integerArgument10 * integerArgument7 * integerLocal54 + integerLocal66 * integerArgument7) * 2 + integerLocal39 * integerLocal54) / integerLocal68;
              integerLocal71 = integerArgument5 + (integerArgument11 * 80 + integerLocal60) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
              integerLocal72 = integerArgument5 + ((integerArgument11 + 1) * 80 + integerLocal61) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
              integerLocal73 = integerArgument6 + ((integerArgument10 * integerArgument9 * integerLocal54 + integerLocal66 * integerArgument9) * 2 - integerLocal40 * integerLocal54) / integerLocal68;
              integerLocal74 = integerArgument6 + ((integerArgument10 * integerArgument9 * integerLocal54 + integerLocal66 * integerArgument9) * 2 + integerLocal40 * integerLocal54) / integerLocal68;
              if (integerLocal73 >= 500 &&
                integerLocal74 >= 500) {
                integerLocal75 = 320 + integerLocal69 * 1000 / integerLocal73;
                integerLocal76 = 320 + integerLocal70 * 1000 / integerLocal74;
                integerLocal77 = integerArgument3 + integerLocal71 * 1000 / integerLocal73;
                integerLocal78 = integerArgument3 + integerLocal71 * 1000 / integerLocal74;
                integerLocal79 = integerArgument3 + integerLocal72 * 1000 / integerLocal73;
                integerLocal80 = integerArgument3 + integerLocal72 * 1000 / integerLocal74;
                if (objectLocal48 != null) {
                  stackObjectLocal2 = objectLocal48;
                  if (integerLocal66 != 0) {
                    stackIntegerLocal3 = integerLocal51;
                  } else {
                    stackIntegerLocal3 = integerLocal51 & 12;
                  }
                  objectLocal49 = ((Object[]) (stackObjectLocal2))[stackIntegerLocal3];
                }
                integerLocal81 = 0;
                if (integerLocal53 == 0) {
                  integerLocal81 = integerLocal66 * ((RgbSprite) (objectLocal49)).integerState0254 / integerLocal54;
                }
                integerLocal82 = -1;
                if (integerLocal53 != 0) {
                  integerLocal82 = (integerLocal66 * 2 + 1) * ((RgbSprite) (objectLocal49)).integerState0254 / ((integerLocal54 + 1) * 2);
                }
                regionExit2: {
                  stackObjectLocal4 = objectLocal49;
                  stackObjectLocal5 = objectLocal50;
                  stackIntegerLocal6 = integerLocal75;
                  stackIntegerLocal7 = integerLocal76;
                  stackIntegerLocal8 = integerLocal77;
                  stackIntegerLocal9 = integerLocal78;
                  stackIntegerLocal10 = integerLocal79;
                  stackIntegerLocal11 = integerLocal80;
                  if (integerLocal53 == 0 && (integerLocal52 != 0 ||
                    integerLocal66 != 0)) {
                    stackBooleanLocal12 = false;
                    break regionExit2;
                  }
                  stackBooleanLocal12 = true;
                }
                RenderingSupport002.performAction0265((RgbSprite) (stackObjectLocal4), (IndexedSprite) (stackObjectLocal5), stackIntegerLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal10, stackIntegerLocal11, stackBooleanLocal12, false, integerLocal81, integerLocal82);
              }
            }
          }
          if (integerArgument9 < -integerArgument7) {
            integerLocal63 = integerLocal54 + 1;
            if (integerLocal53 != 0) {
              integerLocal63 = integerLocal54;
            }
            for (integerLocal66 = 0; integerLocal66 <= integerLocal54; integerLocal66++) {
              integerLocal68 = bucketBoardArgument2.boardWidth * integerLocal54 * 2;
              integerLocal69 = integerArgument4 + ((integerArgument10 * integerArgument7 * integerLocal54 + integerLocal66 * integerArgument7) * 2 + integerLocal39 * integerLocal54) / integerLocal68;
              integerLocal70 = integerArgument4 + ((integerArgument10 * integerArgument7 * integerLocal54 + integerLocal66 * integerArgument7) * 2 - integerLocal39 * integerLocal54) / integerLocal68;
              integerLocal71 = integerArgument5 + (integerArgument11 * 80 + integerLocal60) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
              integerLocal72 = integerArgument5 + ((integerArgument11 + 1) * 80 + integerLocal61) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
              integerLocal73 = integerArgument6 + ((integerArgument10 * integerArgument9 * integerLocal54 + integerLocal66 * integerArgument9) * 2 + integerLocal40 * integerLocal54) / integerLocal68;
              integerLocal74 = integerArgument6 + ((integerArgument10 * integerArgument9 * integerLocal54 + integerLocal66 * integerArgument9) * 2 - integerLocal40 * integerLocal54) / integerLocal68;
              if (integerLocal73 >= 500 &&
                integerLocal74 >= 500) {
                integerLocal75 = 320 + integerLocal69 * 1000 / integerLocal73;
                integerLocal76 = 320 + integerLocal70 * 1000 / integerLocal74;
                integerLocal77 = integerArgument3 + integerLocal71 * 1000 / integerLocal73;
                integerLocal78 = integerArgument3 + integerLocal71 * 1000 / integerLocal74;
                integerLocal79 = integerArgument3 + integerLocal72 * 1000 / integerLocal73;
                integerLocal80 = integerArgument3 + integerLocal72 * 1000 / integerLocal74;
                if (objectLocal48 != null) {
                  stackObjectLocal13 = objectLocal48;
                  if (integerLocal66 != integerLocal54) {
                    stackIntegerLocal14 = integerLocal51;
                  } else {
                    stackIntegerLocal14 = integerLocal51 & 12;
                  }
                  objectLocal49 = ((Object[]) (stackObjectLocal13))[stackIntegerLocal14];
                }
                integerLocal81 = 0;
                if (integerLocal53 == 0) {
                  integerLocal81 = integerLocal66 * ((RgbSprite) (objectLocal49)).integerState0254 / integerLocal54;
                }
                integerLocal82 = -1;
                if (integerLocal53 != 0) {
                  integerLocal82 = (integerLocal66 * 2 + 1) * ((RgbSprite) (objectLocal49)).integerState0254 / ((integerLocal54 + 1) * 2);
                }
                regionExit3: {
                  stackObjectLocal15 = objectLocal49;
                  stackObjectLocal16 = objectLocal50;
                  stackIntegerLocal17 = integerLocal75;
                  stackIntegerLocal18 = integerLocal76;
                  stackIntegerLocal19 = integerLocal77;
                  stackIntegerLocal20 = integerLocal78;
                  stackIntegerLocal21 = integerLocal79;
                  stackIntegerLocal22 = integerLocal80;
                  if (integerLocal53 == 0 && (integerLocal52 != 0 ||
                    integerLocal66 != integerLocal54)) {
                    stackBooleanLocal23 = false;
                    break regionExit3;
                  }
                  stackBooleanLocal23 = true;
                }
                RenderingSupport002.performAction0265((RgbSprite) (stackObjectLocal15), (IndexedSprite) (stackObjectLocal16), stackIntegerLocal17, stackIntegerLocal18, stackIntegerLocal19, stackIntegerLocal20, stackIntegerLocal21, stackIntegerLocal22, stackBooleanLocal23, false, integerLocal81, integerLocal82);
              }
            }
          }
          for (integerLocal66 = integerLocal63; integerLocal66 <= integerLocal54; integerLocal66 += 2) {
            integerLocal68 = integerLocal66;
            integerLocal69 = integerLocal66;
            integerLocal70 = bucketBoardArgument2.boardWidth * integerLocal54 * 2;
            integerLocal71 = integerArgument4 + (integerArgument10 * integerArgument7 * integerLocal54 * 2 + integerLocal39 * integerLocal68) / integerLocal70;
            integerLocal72 = integerArgument4 + ((integerArgument10 + 1) * integerArgument7 * integerLocal54 * 2 + integerLocal39 * integerLocal69) / integerLocal70;
            integerLocal73 = integerArgument5 + (integerArgument11 * 80 + integerLocal60) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
            integerLocal74 = integerArgument5 + ((integerArgument11 + 1) * 80 + integerLocal61) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
            integerLocal75 = integerArgument6 + (integerArgument10 * integerArgument9 * integerLocal54 * 2 + integerLocal40 * integerLocal68) / integerLocal70;
            integerLocal76 = integerArgument6 + ((integerArgument10 + 1) * integerArgument9 * integerLocal54 * 2 + integerLocal40 * integerLocal69) / integerLocal70;
            if (integerLocal75 >= 500 &&
              integerLocal76 >= 500) {
              integerLocal77 = 320 + integerLocal71 * 1000 / integerLocal75;
              integerLocal78 = 320 + integerLocal72 * 1000 / integerLocal76;
              integerLocal79 = integerArgument3 + integerLocal73 * 1000 / integerLocal75;
              integerLocal80 = integerArgument3 + integerLocal73 * 1000 / integerLocal76;
              integerLocal81 = integerArgument3 + integerLocal74 * 1000 / integerLocal75;
              integerLocal82 = integerArgument3 + integerLocal74 * 1000 / integerLocal76;
              if (objectLocal48 != null) {
                stackObjectLocal24 = objectLocal48;
                if (integerLocal66 != integerLocal54) {
                  stackIntegerLocal25 = integerLocal51 & 12;
                } else {
                  stackIntegerLocal25 = integerLocal51;
                }
                objectLocal47 = ((Object[]) (stackObjectLocal24))[stackIntegerLocal25];
              }
              integerLocal83 = 0;
              if (integerLocal52 == 0) {
                if (integerArgument10 < integerArgument12) {
                  integerLocal83 = (integerLocal54 - integerLocal66) * ((RgbSprite) (objectLocal47)).integerState0254 / (integerLocal54 * 2);
                }
                if (integerArgument10 > integerArgument12) {
                  integerLocal83 = (integerLocal54 + integerLocal66) * ((RgbSprite) (objectLocal47)).integerState0254 / (integerLocal54 * 2);
                }
              }
              integerLocal84 = -1;
              if (integerLocal52 != 0) {
                integerLocal84 = (integerLocal54 + 1 + integerLocal66) * ((RgbSprite) (objectLocal47)).integerState0254 / ((integerLocal54 + 1) * 2);
              }
              stackObjectLocal26 = objectLocal47;
              stackObjectLocal27 = objectLocal50;
              stackIntegerLocal28 = integerLocal77;
              stackIntegerLocal29 = integerLocal78;
              stackIntegerLocal30 = integerLocal79;
              stackIntegerLocal31 = integerLocal80;
              stackIntegerLocal32 = integerLocal81;
              stackIntegerLocal33 = integerLocal82;
              stackBooleanLocal34 = (integerLocal52 == 0) && (integerLocal66 < integerLocal54);
              RenderingSupport002.performAction0265((RgbSprite) (stackObjectLocal26), (IndexedSprite) (stackObjectLocal27), stackIntegerLocal28, stackIntegerLocal29, stackIntegerLocal30, stackIntegerLocal31, stackIntegerLocal32, stackIntegerLocal33, stackBooleanLocal34, false, integerLocal83, integerLocal84);
            }
          }
        }
        while (true) {
          if (objectLocal45 == null &&
            objectLocal46 == null) {
            return;
          }
          if (objectLocal45 == null) {
            objectLocal45 = objectLocal46;
            objectLocal46 = null;
            objectLocal50 = null;
          }
          integerLocal63 = integerArgument10 * 4 + 2;
          integerLocal66 = integerArgument7 / bucketBoardArgument2.boardWidth;
          integerLocal68 = integerArgument9 / bucketBoardArgument2.boardWidth;
          if (integerLocal63 < 0) {
            integerLocal63++;
            integerLocal66 = integerLocal66 / 2;
          }
          if (integerLocal63 > bucketBoardArgument2.boardWidth * 4) {
            integerLocal63--;
            integerLocal66 = integerLocal66 / 2;
          }
          integerLocal69 = integerArgument4 + integerLocal63 * integerArgument7 / (bucketBoardArgument2.boardWidth * 4);
          integerLocal70 = integerArgument5 + (integerArgument11 * 80 + integerLocal60) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
          integerLocal71 = integerArgument5 + ((integerArgument11 + 1) * 80 + integerLocal61) * integerArgument8 / (bucketBoardArgument2.boardHeight * 80);
          integerLocal72 = integerArgument6 + integerLocal63 * integerArgument9 / (bucketBoardArgument2.boardWidth * 4);
          if (integerLocal72 >= 500) {
            integerLocal73 = 640 + integerLocal69 * 2000 / integerLocal72;
            integerLocal74 = integerArgument3 + integerLocal70 * 1000 / integerLocal72;
            integerLocal75 = integerArgument3 + integerLocal71 * 1000 / integerLocal72;
            integerLocal76 = ((int)(Math.sqrt((double)(integerLocal66 * integerLocal66 + integerLocal68 * integerLocal68)) + 0.5) * 1000 + integerLocal72 / 2) / integerLocal72;
            if (objectLocal50 != null) {
              for (integerLocal77 = 0; integerLocal77 < 1296; integerLocal77++) {
                stackIntegerArrayLocal35 = UiComponentPart019.rgbSpriteState0035.integerArrayState0024;
                stackIntegerLocal36 = integerLocal77;
                if (((IndexedSprite) (objectLocal50)).byteArrayState0021[integerLocal77] == 0) {
                  stackIntegerLocal37 = 0;
                } else {
                  stackIntegerLocal37 = ((RgbSprite) (objectLocal45)).integerArrayState0024[integerLocal77];
                }
                stackIntegerArrayLocal35[stackIntegerLocal36] = stackIntegerLocal37;
              }
              objectLocal45 = UiComponentPart019.rgbSpriteState0035;
            }
            ((RgbSprite) (objectLocal45)).performAction0302(integerLocal73 - integerLocal76 >> 1, integerLocal74, integerLocal76, integerLocal75 - integerLocal74);
          }
          objectLocal45 = null;
        }
    }

    private final int computeInteger1497(byte byteArgument1) {
        if (!this.booleanState0147 &&
          this.mixedSupport028State0001.bucketBoardArrayState0001[0].boardHeight > this.mixedSupport028State0001.bucketBoardArrayState0001[0].integerState0484) {
          return 50;
        }
        int integerLocal1 = -74 / ((63 - byteArgument1) / 36);
        if (this.booleanState0147 &&
          this.integerState0603 < 2) {
          return 3000;
        }
        if (this.booleanState0147 &&
          this.integerState0603 < 4) {
          return 6000;
        }
        if (this.booleanState0147) {
          if (7 <= this.integerState0603) {
            return 0;
          }
          return 144;
        }
        return 0;
    }

    private final void performAction1488(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, BucketBoard bucketBoardArgument7) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        boolean stackBooleanLocal6 = false;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        RenderingSupport010 renderingSupport010Local14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        RgbSprite rgbSpriteLocal19 = null;
        float floatLocal20 = 0.0f;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = bucketBoardArgument7.integerState0472;
          if (integerLocal11 > 88) {
            integerLocal11 = 88;
          }
          if (booleanArgument2) {
            return;
          }
          integerLocal13 = integerLocal11 * (integerLocal11 * 35) / 7744 + integerLocal11 * 35 / 88;
          renderingSupport010Local14 = GameApplet.renderingSupport010State0002;
          integerLocal15 = renderingSupport010Local14.computeInteger1208(bucketBoardArgument7.stringState0335);
          if (this.booleanState0140) {
            stackIntegerLocal2 = integerArgument4;
            stackIntegerLocal3 = -integerArgument4 + integerArgument5;
            if (SceneWidgetPart009.booleanState0150) {
              stackIntegerLocal4 = 160;
            } else {
              stackIntegerLocal4 = 16;
            }
            integerLocal17 = stackIntegerLocal2 + stackIntegerLocal3 * (stackIntegerLocal4 + bucketBoardArgument7.integerState0451) / 176;
            if (SceneWidgetPart009.booleanState0150) {
              integerLocal17 = integerLocal17 - integerLocal15;
            }
            integerLocal18 = integerArgument4 + (integerArgument5 - integerArgument4) * (88 + bucketBoardArgument7.integerState0451) / 176;
            stackIntegerLocal5 = integerArgument6;
            stackBooleanLocal6 = !(booleanArgument2);
            floatLocal20 = this.computeFloat1487(stackIntegerLocal5, stackBooleanLocal6);
            integerLocal16 = (int)(floatLocal20 * (float)(integerLocal18 - integerLocal17) + 0.5f) + integerLocal17;
          } else {
            integerLocal16 = (integerArgument5 - integerArgument4) * (bucketBoardArgument7.integerState0451 + 88) / 176 + integerArgument4;
            integerLocal16 = integerLocal16 - integerLocal15 / 2;
          }
          integerLocal23 = (integerArgument3 - integerArgument1) * (bucketBoardArgument7.integerState0457 + (592 - integerLocal13)) / 702 + integerArgument1;
          if (88 > bucketBoardArgument7.integerState0472) {
            renderingSupport010Local14.performAction1211(bucketBoardArgument7.stringState0335, integerLocal16 - 1, integerLocal23 + 6, 0, -1);
            renderingSupport010Local14.performAction1211(bucketBoardArgument7.stringState0335, 1 + integerLocal16, -1 + integerLocal23 + 7, 0, -1);
            renderingSupport010Local14.performAction1211(bucketBoardArgument7.stringState0335, -1 + integerLocal16, 7 + integerLocal23 + 1, 0, -1);
            renderingSupport010Local14.performAction1211(bucketBoardArgument7.stringState0335, 1 + integerLocal16, 1 + (integerLocal23 + 7), 0, -1);
            renderingSupport010Local14.performAction1211(bucketBoardArgument7.stringState0335, integerLocal16, integerLocal23 + 7, bucketBoardArgument7.integerState0470, -1);
          } else {
            rgbSpriteLocal19 = MixedSupport094.rgbSpriteArrayState0019[(bucketBoardArgument7.integerState0472 - 88) / 2];
            integerLocal21 = integerLocal15 / 27;
            if (integerLocal21 >= 2) {
              for (integerLocal1 = 0; integerLocal1 < integerLocal21; integerLocal1++) {
                rgbSpriteLocal19.performAction0302((-27 + integerLocal15) * integerLocal1 / (integerLocal21 - 1) + integerLocal16, integerLocal23 - 13, 27, 27);
              }
              return;
            }
            rgbSpriteLocal19.performAction0302(integerLocal15 / 2 + (integerLocal16 - 13), -13 + integerLocal23, 27, 27);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal10 = caughtParameterLocal24;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal12;
          stackStringBuilderLocal8 = new StringBuilder().append("qc.NA(").append(integerArgument1).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',');
          if (bucketBoardArgument7 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final void performAction1496(boolean booleanArgument1, BucketBoard bucketBoardArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        AnimatedTileRegion animatedTileRegionLocal6 = null;
        RenderingSupport006 renderingSupport006Local7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        NodeDeque nodeDequeLocal12 = null;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          while (true) {
            if (this.integerArrayState0188[integerArgument6] <= integerArgument5) {
              if (!booleanArgument1) {
                this.integerState0605 = -124;
              }
              return;
            }
            this.integerArrayState0188[integerArgument6] = this.integerArrayState0188[integerArgument6] - 1;
            if (booleanArgument7 ||
              this.integerArrayState0188[integerArgument6] == 0) {
              RenderingSupport003.performAction0631(bucketBoardArgument2.integerState0458, bucketBoardArgument2.integerState0446 / 2, (byte) 127, SceneWidgetPart003.rawSoundArrayState0001[this.integerArrayState0188[integerArgument6]]);
            }
            if (this.integerArrayState0188[integerArgument6] == 2) {
              this.nodeDequeArrayState0002[integerArgument6] = UiComponentPart026.computeNodeDeque1577(4, -4, 0, 3000, 9, 16, 9, 60);
            }
            if (this.integerArrayState0188[integerArgument6] == 1) {
              SceneWidgetPart001.performAction0170((byte) -93, 500, this.nodeDequeArrayState0002[integerArgument6]);
            }
            if (0 != this.integerArrayState0188[integerArgument6]) {
              continue;
            }
            nodeDequeLocal12 = this.nodeDequeArrayState0002[integerArgument6];
            animatedTileRegionLocal6 = (AnimatedTileRegion) (nodeDequeLocal12.computeHashNode1970((byte) -115));
            while (animatedTileRegionLocal6 != null) {
              integerLocal8 = animatedTileRegionLocal6.integerState0817 + animatedTileRegionLocal6.integerState0814 * 2 - 16;
              integerLocal9 = animatedTileRegionLocal6.integerState0815 + (animatedTileRegionLocal6.integerState0818 * 2 + 4);
              integerLocal10 = UiComponentPart016.computeInteger0944((byte) 114, 1 + integerArgument3 - integerArgument4, UiComponentPart031.randomState0003) + integerArgument4;
              animatedTileRegionLocal6.integerState0812 = -((integerLocal9 * integerLocal9 + integerLocal8 * integerLocal8) * integerLocal10 / 2592) + integerLocal10;
              animatedTileRegionLocal6 = (AnimatedTileRegion) (nodeDequeLocal12.computeHashNode1974(true));
            }
            PlatformSupport006.performAction1568(nodeDequeLocal12, -116, nodeDequeLocal12.computeInteger1959((byte) 124));
            if (this.booleanState0140) {
              continue;
            }
            this.mixedSupport028State0001.booleanState0031 = true;
            this.performAction1506(false);
            renderingSupport006Local7 = new RenderingSupport006(MixedSupport132.stringState0546, 10, false);
            this.nodeDequeState0024.performAction1963(renderingSupport006Local7, 2777);
            this.integerState0630 = 0;
            this.integerState0640 = 128;
            if (this.booleanState0147 &&
              this.integerState0603 >= 6) {
              this.performAction1493(SceneWidgetPart004.musicTrackState0001, 0);
              continue;
            }
            this.performAction1493(MixedSupport115.musicTrackState0006, 0);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal4 = caughtParameterLocal13;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("qc.BA(").append(booleanArgument1).append(',');
          if (bucketBoardArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    private final float computeFloat1487(int integerArgument1, boolean booleanArgument2) {
        if (!booleanArgument2) {
          this.integerState0633 = 11;
        }
        return (0.0003000000142492354f - (float)integerArgument1 * 0.0000019999999949504854f) * (float)integerArgument1 * (float)integerArgument1;
    }

    private final void performAction1491(BucketBoard bucketBoardArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, boolean booleanArgument6, int integerArgument7, int integerArgument8) {
        int previousIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RgbSprite stackRgbSpriteLocal4;
        int stackIntegerLocal5;
        int stackIntegerLocal6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9 = 0;
        RgbSprite stackRgbSpriteLocal10;
        int stackIntegerLocal11;
        int stackIntegerLocal12;
        int stackIntegerLocal13;
        int stackIntegerLocal14;
        int stackIntegerLocal15;
        int stackIntegerLocal16 = 0;
        boolean stackBooleanLocal17 = false;
        RuntimeException stackRuntimeExceptionLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        RuntimeException caughtExceptionLocal21 = null;
        int integerLocal22 = 0;
        RuntimeException runtimeExceptionLocal23 = null;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int integerLocal33 = 0;
        int integerLocal34 = 0;
        int integerLocal35 = 0;
        int integerLocal36 = 0;
        int integerLocal37 = 0;
        int integerLocal38 = 0;
        int integerLocal39 = 0;
        int integerLocal40 = 0;
        int integerLocal41 = 0;
        int integerLocal42 = 0;
        int integerLocal43 = 0;
        double doubleLocal44 = 0.0;
        double doubleLocal45 = 0.0;
        int integerLocal46 = 0;
        int integerLocal47 = 0;
        double doubleLocal48 = 0.0;
        double doubleLocal49 = 0.0;
        String stringLocal50 = null;
        int integerLocal51 = 0;
        int integerLocal52 = 0;
        double doubleLocal53 = 0.0;
        double doubleLocal54 = 0.0;
        int integerLocal55 = 0;
        int integerLocal56 = 0;
        int integerLocal57 = 0;
        int integerLocal58 = 0;
        int integerLocal59 = 0;
        int integerLocal60 = 0;
        RgbSprite rgbSpriteLocal61 = null;
        int integerLocal62 = 0;
        int integerLocal63 = 0;
        int integerLocal64 = 0;
        int integerLocal65 = 0;
        int integerLocal66 = 0;
        int integerLocal67 = 0;
        int integerLocal68 = 0;
        int integerLocal69 = 0;
        int integerLocal70 = 0;
        IndexedSprite indexedSpriteLocal71 = null;
        ReturnedShape returnedShapeLocal72 = null;
        int integerLocal73 = 0;
        ReturnedShape returnedShapeLocal74 = null;
        RgbSprite rgbSpriteLocal75 = null;
        RgbSprite rgbSpriteLocal76;
        int integerLocal77;
        int integerLocal78;
        int integerLocal79;
        int integerLocal80;
        int integerLocal81;
        int integerLocal82;
        int integerLocal83;
        int integerLocal84;
        int integerLocal85;
        int integerLocal86;
        int integerLocal87;
        int integerLocal88;
        int integerLocal89;
        int integerLocal90;
        int integerLocal91;
        int integerLocal92;
        int integerLocal93;
        int integerLocal94;
        int integerLocal95;
        int integerLocal96;
        int integerLocal97;
        int integerLocal98;
        int integerLocal99;
        int integerLocal100;
        int integerLocal101;
        int integerLocal102;
        integerLocal70 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal22 = -1890 + integerArgument5;
          integerLocal24 = integerArgument5 + 1620;
          integerLocal25 = ((-integerLocal22 + integerLocal24) * 176 + 702) / 1404;
          integerLocal26 = integerArgument3 - integerLocal25;
          integerLocal27 = integerLocal25 + integerArgument3;
          integerLocal28 = 320 + MixedSupport148.computeInteger1983(23841, integerArgument2, integerLocal26 * 1000 + integerArgument2 / 2);
          integerLocal29 = MixedSupport148.computeInteger1983(23841, integerArgument2, 1000 * integerLocal27 + integerArgument2 / 2) + 320;
          integerLocal30 = integerArgument7 + MixedSupport148.computeInteger1983(23841, integerArgument2, 1000 * integerLocal22 + integerArgument2 / 2);
          integerLocal31 = integerArgument7 + MixedSupport148.computeInteger1983(23841, integerArgument2, 1000 * integerLocal24 + integerArgument2 / 2);
          if (bucketBoardArgument1.booleanState0106) {
            stackIntegerLocal2 = (0 < bucketBoardArgument1.livesRemaining) ? 1 : 0;
          } else {
            stackIntegerLocal2 = 0;
          }
          integerLocal32 = stackIntegerLocal2;
          if (bucketBoardArgument1.integerState0465 == 0) {
            stackIntegerLocal3 = (integerLocal32 == 0) ? 1 : 0;
          } else {
            stackIntegerLocal3 = 0;
          }
          integerLocal33 = stackIntegerLocal3;
          integerLocal34 = bucketBoardArgument1.computeBoolean1112(68) ? 1 : 0;
          if (integerLocal33 != 0) {
            MixedSupport066.rgbSpriteState0023.performAction0302(integerLocal28, integerLocal30, -integerLocal28 + integerLocal29, integerLocal31 - integerLocal30);
          } else {
            MixedSupport002.rgbSpriteState0002.performAction0302(integerLocal28, integerLocal30, -integerLocal28 + integerLocal29, integerLocal31 - integerLocal30);
          }
          if (integerLocal34 == 0) {
            MixedSupport016.rgbSpriteState0010.performAction0302(integerLocal28, integerLocal30, -integerLocal28 + integerLocal29, integerLocal31 - integerLocal30);
          } else {
            MixedSupport027.rgbSpriteState0014.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, -integerLocal30 + integerLocal31);
          }
          MixedSupport131.rgbSpriteState0059.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, -integerLocal30 + integerLocal31);
          if (!booleanArgument6) {
            indexedSpriteLocal71 = (IndexedSprite) null;
            GameSession.performAction1489((BucketBoard) null, 116, -39, 60, -104, 82, -73, 38, 43, 29, (RgbSprite) null, (IndexedSprite) null, true);
          }
          integerLocal35 = bucketBoardArgument1.dominoDescriptor & 15;
          integerLocal36 = bucketBoardArgument1.dominoDescriptor >> 4;
          stackRgbSpriteLocal4 = MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument8][integerLocal35];
          stackIntegerLocal5 = (integerLocal29 - integerLocal28) * 52 / 176 + integerLocal28;
          stackIntegerLocal6 = integerLocal30 + 56 * (integerLocal31 - integerLocal30) / 702;
          stackIntegerLocal7 = 36 * (integerLocal29 - integerLocal28) / 176;
          stackIntegerLocal8 = 36 * (-integerLocal30 + integerLocal31) / 702;
          if (integerLocal33 != 0) {
            stackIntegerLocal9 = 256;
          } else {
            stackIntegerLocal9 = 192;
          }
          ((RgbSprite) (Object) stackRgbSpriteLocal4).performAction0310(stackIntegerLocal5, stackIntegerLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9);
          stackRgbSpriteLocal10 = MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument8][integerLocal36];
          stackIntegerLocal11 = integerLocal28 + (integerLocal29 - integerLocal28) * 88 / 176;
          stackIntegerLocal12 = 56 * (integerLocal31 - integerLocal30) / 702 + integerLocal30;
          stackIntegerLocal13 = 36 * (-integerLocal28 + integerLocal29) / 176;
          stackIntegerLocal14 = (integerLocal31 - integerLocal30) * 36 / 702;
          if (integerLocal33 != 0) {
            stackIntegerLocal15 = 256;
          } else {
            stackIntegerLocal15 = 192;
          }
          ((RgbSprite) (Object) stackRgbSpriteLocal10).performAction0310(stackIntegerLocal11, stackIntegerLocal12, stackIntegerLocal13, stackIntegerLocal14, stackIntegerLocal15);
          SoftwareRaster.performAction0731(UiComponentPart012.integerArrayState0051);
          integerLocal37 = integerLocal28 + (integerLocal29 - integerLocal28) * 10 / 176;
          integerLocal38 = integerLocal28 + 166 * (-integerLocal28 + integerLocal29) / 176;
          integerLocal39 = integerLocal30 + (-integerLocal30 + integerLocal31) * 115 / 702;
          integerLocal40 = integerLocal30 + 677 * (-integerLocal30 + integerLocal31) / 702;
          SoftwareRaster.performAction0742(integerLocal37, integerLocal39, integerLocal38, integerLocal40);
          MixedSupport126.integerState0774 = 0;
          for (integerLocal41 = 0; bucketBoardArgument1.integerState0465 > integerLocal41; integerLocal41++) {
            integerLocal42 = CipherPacketBuffer.integerState0799;
            doubleLocal44 = 1.9634954084936207 * (double)(bucketBoardArgument1.integerState0476 + integerLocal41 & 15) + 0.04908738521234052 * (double)(integerLocal42 & 127);
            doubleLocal48 = Math.sin(doubleLocal44);
            doubleLocal53 = Math.cos(doubleLocal44);
            returnedShapeLocal72 = bucketBoardArgument1.returnedShapeArrayState0001[integerLocal41];
            returnedShapeLocal74 = returnedShapeLocal72;
            if (null != returnedShapeLocal74.packedCells) {
              integerLocal57 = returnedShapeLocal74.width;
              integerLocal58 = returnedShapeLocal74.height;
              integerLocal59 = 0;
              integerLocal60 = 6144;
              integerLocal62 = 17408;
              if (0 < returnedShapeLocal74.integerState0691 &&
                returnedShapeLocal74.integerState0691 < 10) {
                integerLocal62 = integerLocal62 - 18432 * ((-returnedShapeLocal74.integerState0691 + 10) * returnedShapeLocal74.integerState0691) / 100;
              }
              integerLocal62 = integerLocal62 / (integerLocal57 + 1);
              if (integerLocal62 < integerLocal60) {
                integerLocal60 = integerLocal62;
              }
              integerLocal63 = 33792 / integerLocal58;
              if (integerLocal60 > integerLocal63) {
                integerLocal60 = integerLocal63;
              }
              for (integerLocal64 = 0; integerLocal64 < integerLocal58; integerLocal64++) {
                for (integerLocal65 = 0; integerLocal65 < integerLocal57; integerLocal65++) {
                  previousIntegerLocal1 = integerLocal59;
                  integerLocal59++;
                  integerLocal66 = 255 & returnedShapeLocal72.packedCells[previousIntegerLocal1];
                  if (0 != integerLocal66) {
                    if (returnedShapeLocal74.integerState0692 > 0) {
                      integerLocal66 = -returnedShapeLocal74.integerState0692;
                    }
                    integerLocal67 = (int)Math.floor((double)integerLocal60 * ((double)(integerLocal65 + 1) * doubleLocal48) + 0.5);
                    integerLocal68 = 8192 * returnedShapeLocal74.integerState0691 + integerLocal60 * (integerLocal64 - integerLocal58);
                    integerLocal69 = (int)Math.floor((double)integerLocal60 * ((double)(1 + integerLocal65) * doubleLocal53) * 256.0);
                    MixedSupport054.performAction0707(114, integerLocal67, integerLocal66, integerLocal60, integerLocal69, integerLocal68);
                  }
                }
              }
            }
          }
          MixedSupport151.performAction2018(MixedSupport126.integerState0774, 0, -32186);
          integerLocal43 = CipherPacketBuffer.integerState0799;
          doubleLocal45 = 0.04908738521234052 * (double)(127 & integerLocal43) + 29.45243112740431;
          doubleLocal49 = Math.sin(doubleLocal45);
          doubleLocal54 = Math.cos(doubleLocal45);
          integerLocal77 = (int)Math.floor(0.5 + 4096.0 * doubleLocal49);
          integerLocal78 = (int)Math.floor(256.0 * (doubleLocal54 * 4096.0));
          integerLocal73 = 0;
          integerLocal79 = integerLocal73;
          integerLocal46 = 0;
          while (integerLocal46 < 2) {
            scanLoop1: while (true) {
              if (MixedSupport126.integerState0774 > integerLocal73) {
                if (integerLocal46 == 0) {
                  integerLocal47 = NetworkSupport004.integerArrayState0052[3 + integerLocal73];
                  if (integerLocal78 > integerLocal47) {
                    break scanLoop1;
                  }
                }
                integerLocal47 = NetworkSupport004.integerArrayState0052[integerLocal73];
                integerLocal51 = NetworkSupport004.integerArrayState0052[1 + integerLocal73];
                integerLocal52 = NetworkSupport004.integerArrayState0052[2 + integerLocal73];
                integerLocal55 = NetworkSupport004.integerArrayState0052[4 + integerLocal73];
                integerLocal56 = integerLocal28 + (-integerLocal28 + integerLocal29) * (integerLocal51 + 22528 - integerLocal55 / 2) / 45056;
                integerLocal86 = (integerLocal29 - integerLocal28) * (22528 + (integerLocal55 / 2 + integerLocal51)) / 45056 + integerLocal28;
                integerLocal88 = (integerLocal31 - integerLocal30) * (integerLocal52 + 65536) / 179712 + integerLocal30;
                integerLocal90 = integerLocal30 + (-integerLocal30 + integerLocal31) * (65536 + (integerLocal55 + integerLocal52)) / 179712;
                if (integerLocal47 < 0) {
                  rgbSpriteLocal61 = MixedSupport094.rgbSpriteArrayState0019[~integerLocal47 >> 1];
                } else {
                  if (integerLocal47 >> 3 != 3) {
                    rgbSpriteLocal61 = MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument8][integerLocal47 & 7];
                  } else {
                    rgbSpriteLocal61 = MixedSupport127.computeRgbSprite1815(true, 7 & integerLocal47);
                  }
                }
                rgbSpriteLocal61.performAction0302(integerLocal56, integerLocal88, -integerLocal56 + integerLocal86, integerLocal90 - integerLocal88);
                integerLocal73 += 5;
                continue;
              }
              break;
            }
            if (integerLocal46 == 0 &&
              bucketBoardArgument1.integerState0496 > 0) {
              integerLocal97 = ((MixedSupport143) (bucketBoardArgument1.nodeDequeState0017.computeHashNode1970((byte) 101))).integerState0837;
              integerLocal82 = bucketBoardArgument1.integerState0496;
              integerLocal98 = 18 - integerLocal82;
              if (integerLocal98 < 0) {
                integerLocal98 = 0;
              }
              integerLocal99 = -8192 + integerLocal98 * 8192;
              integerLocal85 = (-integerLocal28 + integerLocal29) * (integerLocal77 + 14336) / 45056 + integerLocal28;
              integerLocal100 = integerLocal28 + (integerLocal77 + 30720) * (-integerLocal28 + integerLocal29) / 45056;
              integerLocal101 = (57344 + integerLocal99) * (integerLocal31 - integerLocal30) / 179712 + integerLocal30;
              integerLocal102 = (-integerLocal30 + integerLocal31) * (73728 + integerLocal99) / 179712 + integerLocal30;
              if (integerLocal82 <= 322) {
                rgbSpriteLocal76 = CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal97];
                rgbSpriteLocal76.performAction0280(integerLocal85, integerLocal101, -integerLocal85 + integerLocal100, integerLocal102 - integerLocal101);
              } else {
                rgbSpriteLocal76 = MixedSupport094.rgbSpriteArrayState0019[-1 + integerLocal82 - 322 >> 1];
                rgbSpriteLocal76.performAction0302(integerLocal85, integerLocal101, integerLocal100 - integerLocal85, -integerLocal101 + integerLocal102);
              }
            }
            integerLocal46++;
          }
          SoftwareRaster.performAction0723(UiComponentPart012.integerArrayState0051);
          if (null != bucketBoardArgument1.stringState0335) {
            stackIntegerLocal16 = integerLocal30;
            stackBooleanLocal17 = !(booleanArgument6);
            this.performAction1488(stackIntegerLocal16, stackBooleanLocal17, integerLocal31, integerLocal28, integerLocal29, integerArgument4, bucketBoardArgument1);
          }
          GameDomainSupport001.rgbSpriteState0006.performAction0294(integerLocal28, integerLocal30, -integerLocal28 + integerLocal29, integerLocal31 - integerLocal30, 192);
          MixedSupport013.rgbSpriteState0007.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, integerLocal31 - integerLocal30);
          MixedSupport084.rgbSpriteState0033.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, -integerLocal30 + integerLocal31);
          CipherPacketBuffer.rgbSpriteState0061.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, integerLocal31 - integerLocal30);
          UiComponentPart004.rgbSpriteState0009.performAction0302(integerLocal28, integerLocal30, integerLocal29 - integerLocal28, integerLocal31 - integerLocal30);
          if (bucketBoardArgument1.integerState0496 > 0) {
            integerLocal80 = ((MixedSupport143) (bucketBoardArgument1.nodeDequeState0017.computeHashNode1970((byte) 100))).integerState0837;
            integerLocal81 = bucketBoardArgument1.integerState0496;
            if (integerLocal81 <= 18) {
              return;
            }
            stringLocal50 = BufferedSocket.stringArrayState0035[integerLocal80];
            integerLocal83 = (integerLocal28 + integerLocal29) / 2;
            integerLocal84 = -84 * (integerLocal81 * integerLocal81) / 335 + 150080;
            integerLocal84 = integerLocal30 + integerLocal84 * (-integerLocal30 + integerLocal31) / 235170;
            if (integerLocal81 <= 322) {
              MixedSupport045.computeInteger0612(88, 1, -500 + integerLocal84, stringLocal50, 16, 1000, 16777215, MixedSupport001.renderingSupport010State0001, (byte) -128, 1, integerLocal83 - 44);
              return;
            }
            rgbSpriteLocal75 = MixedSupport094.rgbSpriteArrayState0019[-1 + (-322 + integerLocal81) >> 1];
            integerLocal87 = MixedSupport001.renderingSupport010State0001.computeInteger1222(stringLocal50, 88);
            integerLocal89 = MixedSupport001.renderingSupport010State0001.computeInteger1223(stringLocal50, 88, 16);
            integerLocal91 = integerLocal87 / 18;
            integerLocal92 = integerLocal89 / 18;
            for (integerLocal93 = 0; integerLocal93 < integerLocal92; integerLocal93++) {
              integerLocal94 = integerLocal84;
              if (integerLocal92 >= 2) {
                integerLocal94 = integerLocal84 - integerLocal89 / 2 + integerLocal93 * (-18 + integerLocal89) / (-1 + integerLocal92);
              }
              for (integerLocal95 = 0; integerLocal91 > integerLocal95; integerLocal95++) {
                integerLocal96 = integerLocal83;
                if (integerLocal91 >= 2) {
                  integerLocal96 = integerLocal95 * (integerLocal87 - 18) / (integerLocal91 - 1) + integerLocal83 - integerLocal87 / 2;
                }
                rgbSpriteLocal75.performAction0302(integerLocal96, integerLocal94, 18, 18);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal103) {
          caughtExceptionLocal21 = caughtParameterLocal103;
          runtimeExceptionLocal23 = caughtExceptionLocal21;
          stackRuntimeExceptionLocal18 = runtimeExceptionLocal23;
          stackStringBuilderLocal19 = new StringBuilder().append("qc.Q(");
          if (bucketBoardArgument1 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal18), ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(booleanArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    private final void performAction1492(MixedSupport117 mixedSupport117Argument1, byte byteArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        RenderingSupport010 renderingSupport010Local6 = null;
        int integerLocal7 = 0;
        try {
          integerLocal1 = 248 + 144 * mixedSupport117Argument1.integerState0728 / 2048;
          integerLocal2 = mixedSupport117Argument1.integerState0725 * 326 / 4608 + 89;
          integerLocal3 = this.integerState0637 - mixedSupport117Argument1.integerState0727;
          integerLocal4 = mixedSupport117Argument1.integerState0723 - mixedSupport117Argument1.integerState0727;
          if (byteArgument2 < 79) {
            this.integerArrayState0188 = (int[]) null;
          }
          if (integerLocal4 > 0) {
            integerLocal3 = integerLocal3 * integerLocal3;
            integerLocal4 = integerLocal4 * integerLocal4;
            integerLocal2 = integerLocal2 + (-integerLocal2 + 97) * integerLocal3 / integerLocal4;
            integerLocal1 = integerLocal1 + (555 - integerLocal1) * integerLocal3 / integerLocal4;
          }
          integerLocal5 = !mixedSupport117Argument1.booleanState0167 ? 12 : 18;
          renderingSupport010Local6 = mixedSupport117Argument1.booleanState0167 ? GameApplet.renderingSupport010State0002 : MixedSupport001.renderingSupport010State0001;
          integerLocal7 = mixedSupport117Argument1.booleanState0167 ? 7 : 5;
          integerLocal1 = integerLocal1 - renderingSupport010Local6.computeInteger1208(mixedSupport117Argument1.stringState0488) / 2;
          if (null != mixedSupport117Argument1.rgbSpriteState0053) {
            integerLocal1 = integerLocal1 + integerLocal5 * 2 / 3;
            mixedSupport117Argument1.rgbSpriteState0053.performAction0303(-1 + (-(4 * integerLocal5 / 3) + integerLocal1), -(integerLocal5 / 2) + integerLocal2, integerLocal5, integerLocal5, mixedSupport117Argument1.integerState0724);
            mixedSupport117Argument1.rgbSpriteState0053.performAction0303(1 + (-(4 * integerLocal5 / 3) + integerLocal1), -(integerLocal5 / 2) + integerLocal2, integerLocal5, integerLocal5, mixedSupport117Argument1.integerState0724);
            mixedSupport117Argument1.rgbSpriteState0053.performAction0303(-(integerLocal5 * 4 / 3) + integerLocal1, integerLocal2 + (-(integerLocal5 / 2) - 1), integerLocal5, integerLocal5, mixedSupport117Argument1.integerState0724);
            mixedSupport117Argument1.rgbSpriteState0053.performAction0303(-(4 * integerLocal5 / 3) + integerLocal1, 1 - integerLocal5 / 2 + integerLocal2, integerLocal5, integerLocal5, mixedSupport117Argument1.integerState0724);
            mixedSupport117Argument1.rgbSpriteState0053.performAction0302(-(integerLocal5 * 4 / 3) + integerLocal1, -(integerLocal5 / 2) + integerLocal2, integerLocal5, integerLocal5);
          }
          renderingSupport010Local6.performAction1211(mixedSupport117Argument1.stringState0488, -1 + integerLocal1, integerLocal2 - (-integerLocal7 + 1), 0, -1);
          renderingSupport010Local6.performAction1211(mixedSupport117Argument1.stringState0488, integerLocal1 + 1, integerLocal7 + (integerLocal2 - 1), 0, -1);
          renderingSupport010Local6.performAction1211(mixedSupport117Argument1.stringState0488, -1 + integerLocal1, 1 + integerLocal2 + integerLocal7, 0, -1);
          renderingSupport010Local6.performAction1211(mixedSupport117Argument1.stringState0488, integerLocal1 + 1, 1 + (integerLocal7 + integerLocal2), 0, -1);
          renderingSupport010Local6.performAction1211(MixedSupport064.computeString0852("<b>", mixedSupport117Argument1.stringState0488, "<col=FFFFFF>", 0), integerLocal1, integerLocal2 + integerLocal7, mixedSupport117Argument1.integerState0724, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qc.G(" + (mixedSupport117Argument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    private final void performAction1509(int integerArgument1, int integerArgument2, int integerArgument3) {
        String cachedStringLocal1 = null;
        int integerLocal2;
        int integerLocal3;
        String stringLocal4;
        String stringLocal5;
        int integerLocal6;
        String stringLocal7;
        int integerLocal8;
        int integerLocal9;
        String stringLocal10;
        String stringLocal11;
        String stringLocal12;
        String stringLocal13;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        SoftwareRaster.performAction0720(0, 0, 640, 480, 65793, integerArgument1);
        integerLocal2 = RichTextLayout.sceneWidgetState0021.integerState0903 / 2 - 100;
        SoftwareRaster.performAction0720(integerArgument3 + 145, integerLocal2, 350, 177, 0, 160);
        GameplayControls.performAction1978(197, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 370, integerLocal2 - 10, integerArgument3 + 135);
        MixedSupport042.performAction0595(integerLocal2 + 17, 256, 16694016, MixedSupport133.stringState0550, 152 + integerArgument3, SceneWidget.renderingSupport010State0007);
        SoftwareRaster.performAction0744(integerArgument3 + 300, 4 + integerLocal2, 170, 263172);
        SoftwareRaster.performAction0744(integerArgument3 + 301, integerLocal2 + 4, 170, 6316128);
        MixedSupport029.performAction0447(16694016, 353 + integerArgument3, UiComponentPart031.stringState0529, 17 + integerLocal2, (byte) 75, SceneWidget.renderingSupport010State0007);
        SoftwareRaster.performAction0744(406 + integerArgument3, 4 + integerLocal2, 170, 263172);
        SoftwareRaster.performAction0744(integerArgument3 + 407, integerLocal2 + 4, 170, 6316128);
        MixedSupport029.performAction0447(16694016, 450 + integerArgument3, MixedSupport100.stringState0399, integerLocal2 + 17, (byte) 75, SceneWidget.renderingSupport010State0007);
        SoftwareRaster.performAction0718(152 + integerArgument3, 22 + integerLocal2, 336, 263172);
        SoftwareRaster.performAction0718(integerArgument3 + 152, integerLocal2 + 23, 336, 6316128);
        integerLocal2 += 25;
        if (integerArgument2 <= 90) {
          return;
        }
        for (integerLocal3 = 0; integerLocal3 < this.mixedSupport028State0001.bucketBoardArrayState0001.length; integerLocal3++) {
          if (null != this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal3] &&
            this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal3].livesRemaining > 0 &&
            (this.mixedSupport028State0001.integerState0171 & 1 << integerLocal3) == 0) {
            stringLocal4 = MixedSupport031.stringState0151;
            stringLocal5 = "-";
            stringLocal12 = stringLocal5;
            stringLocal13 = stringLocal5;
            if (this.mixedSupport028State0001.booleanState0031) {
              if (this.mixedSupport028State0001.integerState0165 != integerLocal3) {
                stringLocal13 = ReturnedShapeCache.stringState0386;
              } else {
                stringLocal13 = ReturnedShapeCache.stringState0385;
                stringLocal5 = MixedSupport046.computeString0627(false, RenderingSupport007.integerState0360, 1, 1);
              }
            }
            this.performAction1483(integerArgument3, stringLocal13, integerLocal2, 107, 16777215, stringLocal5, integerLocal3);
            integerLocal2 += 18;
          }
        }
        SoftwareRaster.performAction0718(152 + integerArgument3, 1 + integerLocal2, 336, 263172);
        SoftwareRaster.performAction0718(152 + integerArgument3, 2 + integerLocal2, 336, 6316128);
        integerLocal2 += 4;
        integerLocal2 = integerLocal2 + (-1 + this.mixedSupport028State0001.integerState0167) * 18;
        integerLocal8 = 0;
        integerLocal9 = integerLocal8;
        while (integerLocal8 < this.mixedSupport028State0001.integerState0167) {
          cachedStringLocal1 = MixedSupport046.computeString0627(false, RenderingSupport007.integerState0360, 1, -integerLocal8 + this.mixedSupport028State0001.integerState0173);
          stringLocal7 = cachedStringLocal1;
          stringLocal10 = cachedStringLocal1;
          stringLocal11 = PacketBuffer.stringState0631;
          if ((1 << this.mixedSupport028State0001.integerArrayState0034[integerLocal8] & this.mixedSupport028State0001.integerState0171) != 0) {
            stringLocal11 = MixedSupport141.stringState0578;
          }
          this.performAction1483(integerArgument3, stringLocal11, integerLocal2, 62, 11579568, stringLocal7, this.mixedSupport028State0001.integerArrayState0034[integerLocal8]);
          integerLocal2 -= 18;
          integerLocal8++;
        }
        return;
    }

    private final void performAction1482(int integerArgument1, int integerArgument2, String stringArgument3, byte byteArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, boolean booleanArgument10, int integerArgument11) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        BucketBoard bucketBoardLocal3 = null;
        NodeDeque nodeDequeLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        Object objectLocal7 = null;
        AnimatedTileRegion animatedTileRegionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        String stringLocal17 = null;
        NodeDeque nodeDequeLocal18 = null;
        int[] integerArrayLocal19 = null;
        RuntimeException stackRuntimeExceptionLocal20 = null;
        StringBuilder stackStringBuilderLocal21 = null;
        String stackStringLocal22 = null;
        RuntimeException caughtExceptionLocal23 = null;
        RuntimeException runtimeExceptionLocal24 = null;
        NodeDeque nodeDequeLocal25;
        NodeDeque nodeDequeLocal26;
        objectLocal7 = null;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = -95 / ((byteArgument4 - 76) / 35);
          nodeDequeLocal18 = this.nodeDequeArrayState0002[integerArgument7];
          nodeDequeLocal4 = nodeDequeLocal18;
          nodeDequeLocal25 = nodeDequeLocal18;
          integerLocal1 = this.integerArrayState0189[integerArgument7];
          if (booleanArgument10) {
            bucketBoardLocal3 = this.buckets[integerArgument7];
            nodeDequeLocal26 = this.nodeDequeArrayState0001[integerArgument7];
            integerArrayLocal19 = this.integerArrayArrayState0019[integerArgument7];
            integerLocal5 = integerArgument1 - integerArgument9;
            integerLocal6 = integerArgument2 - integerArgument11;
            animatedTileRegionLocal8 = (AnimatedTileRegion) (nodeDequeLocal26.computeHashNode1970((byte) -78));
            while (animatedTileRegionLocal8 != null) {
              integerLocal9 = 2 * animatedTileRegionLocal8.integerState0814 - (-animatedTileRegionLocal8.integerState0817 + bucketBoardLocal3.boardWidth);
              integerLocal10 = -bucketBoardLocal3.boardHeight + (animatedTileRegionLocal8.integerState0815 + 2 * animatedTileRegionLocal8.integerState0818);
              integerLocal11 = integerLocal1 * animatedTileRegionLocal8.integerState0812;
              integerLocal12 = integerLocal11 * integerLocal9 / (bucketBoardLocal3.boardHeight * 4);
              integerLocal13 = integerLocal11 * integerLocal10 / (4 * bucketBoardLocal3.boardHeight);
              integerLocal14 = (integerLocal12 * integerLocal5 + integerLocal11 * integerLocal6) / 1440;
              integerLocal15 = (-(integerLocal11 * integerLocal5) + integerLocal12 * integerLocal6) / 1440;
              GameSession.performAction1486(this.mixedSupport028State0001.integerState0166, bucketBoardLocal3, integerArgument6, integerLocal14 + integerArgument9, integerLocal13 + integerArgument5, integerArgument11 + integerLocal15, integerLocal14 + integerArgument1, integerLocal13 + integerArgument8, integerArgument2 + integerLocal15, stringArgument3, animatedTileRegionLocal8, (int[]) null, 0, (NodeDeque) null, this.integerState0623, this.integerState0642);
              animatedTileRegionLocal8 = (AnimatedTileRegion) (nodeDequeLocal26.computeHashNode1974(true));
            }
            GameSession.performAction1486(this.mixedSupport028State0001.integerState0166, bucketBoardLocal3, integerArgument6, integerArgument9, integerArgument5, integerArgument11, integerArgument1, integerArgument8, integerArgument2, stringArgument3, (AnimatedTileRegion) null, integerArrayLocal19, integerLocal1, nodeDequeLocal18, this.integerState0623, this.integerState0642);
            return;
          }
          stringLocal17 = (String) null;
          GameSession.performAction1486(this.mixedSupport028State0001.integerState0166, this.mixedSupport028State0001.bucketBoardArrayState0001[integerArgument7], integerArgument6, integerArgument9, integerArgument5, integerArgument11, integerArgument1, integerArgument8, integerArgument2, stringArgument3, (AnimatedTileRegion) null, (int[]) ((Object) (String) null), integerLocal1, nodeDequeLocal18, this.integerState0623, this.integerState0642);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal27) {
          caughtExceptionLocal23 = caughtParameterLocal27;
          runtimeExceptionLocal24 = caughtExceptionLocal23;
          stackRuntimeExceptionLocal20 = runtimeExceptionLocal24;
          stackStringBuilderLocal21 = new StringBuilder().append("qc.M(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal22 = "null";
          } else {
            stackStringLocal22 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal20), ((StringBuilder) (Object) stackStringBuilderLocal21).append(stackStringLocal22).append(',').append(byteArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',').append(booleanArgument10).append(',').append(integerArgument11).append(')').toString());
        }
    }

    GameSession(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, String[] stringArrayArgument8, int integerArgument9, boolean booleanArgument10, boolean booleanArgument11, boolean booleanArgument12) {
        boolean stackBooleanLocal1 = false;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        boolean stackBooleanLocal5 = false;
        boolean stackBooleanLocal6 = false;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        ReturnedShape returnedShapeLocal17 = null;
        int integerLocal18;
        this.booleanState0139 = false;
        this.nodeDequeState0024 = new NodeDeque();
        this.integerState0625 = -1;
        this.integerState0633 = 0;
        this.booleanState0145 = false;
        this.integerState0637 = 0;
        this.integerState0623 = 0;
        this.integerState0641 = 0;
        this.booleanState0147 = true;
        this.integerState0639 = 50;
        this.integerState0630 = 0;
        this.integerState0643 = -3;
        this.integerState0644 = 0;
        this.booleanState0148 = false;
        this.integerState0640 = 0;
        this.integerState0631 = 0;
        this.integerState0646 = -1;
        try {
          this.integerState0610 = integerArgument7;
          stackBooleanLocal1 = (booleanArgument11);
          this.booleanState0147 = stackBooleanLocal1;
          stackBooleanLocal2 = (booleanArgument12);
          this.booleanState0144 = stackBooleanLocal2;
          this.integerState0612 = integerArgument9;
          stackBooleanLocal3 = (booleanArgument10);
          this.booleanState0138 = stackBooleanLocal3;
          this.integerState0621 = integerArgument6;
          stackBooleanLocal4 = (booleanArgument1);
          this.booleanState0140 = stackBooleanLocal4;
          this.integerState0611 = integerArgument5;
          this.integerState0607 = integerArgument4;
          UiComponentPart028.integerState0716 = 255;
          MixedSupport035.integerState0220 = 100;
          UiComponentPart013.integerState0275 = 144;
          MixedSupport039.integerState0232 = 480;
          this.mixedSupport028State0001 = new MixedSupport028(integerArgument2, booleanArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, stringArrayArgument8);
          if (this.integerState0612 >= 0) {
            this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612].booleanState0108 = true;
            this.mixedSupport028State0001.bucketBoardArrayState0001[this.integerState0612].nodeDequeState0017 = new NodeDeque();
          }
          if (this.booleanState0140) {
            this.returnedShapeCache = new ReturnedShapeCache(32);
            this.mixedSupport079ArrayState0001 = new MixedSupport079[this.mixedSupport028State0001.integerState0173];
            this.byteArrayState0022 = new byte[20];
            for (integerLocal13 = 0; integerLocal13 < this.mixedSupport028State0001.integerState0173; integerLocal13++) {
              this.mixedSupport079ArrayState0001[integerLocal13] = new MixedSupport079();
              this.mixedSupport079ArrayState0001[integerLocal13].nodeDequeState0014 = new NodeDeque();
            }
            this.buckets = new BucketBoard[this.mixedSupport028State0001.integerState0173];
            this.integerArrayState0190 = new int[this.mixedSupport028State0001.integerState0173];
            this.integerArrayState0187 = new int[this.mixedSupport028State0001.integerState0173];
            this.integerArrayArrayState0019 = new int[this.mixedSupport028State0001.integerState0173][];
            this.nodeDequeArrayState0001 = new NodeDeque[this.mixedSupport028State0001.integerState0173];
          }
          this.nodeDequeArrayState0002 = new NodeDeque[this.mixedSupport028State0001.integerState0173];
          this.integerArrayState0188 = new int[this.mixedSupport028State0001.integerState0173];
          integerLocal16 = 0;
          integerLocal18 = integerLocal16;
          while (this.mixedSupport028State0001.integerState0173 > integerLocal16) {
            this.integerArrayState0188[integerLocal16] = this.mixedSupport028State0001.bucketBoardArrayState0001[integerLocal16].livesRemaining;
            integerLocal16++;
          }
          this.integerArrayState0189 = new int[this.mixedSupport028State0001.integerState0173];
          this.performAction1495(false, 0, 1, false, true);
          if (!this.booleanState0140) {
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].nodeDequeState0018 = new NodeDeque();
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].mixedSupport030State0001 = new MixedSupport030(MixedSupport077.computeIntegerArray1042(4));
            returnedShapeLocal17 = Sprite.computeReturnedShape1056(0, 0, this.mixedSupport028State0001.bucketBoardArrayState0001[0].computeInteger1117(26580));
            integerLocal15 = this.mixedSupport028State0001.bucketBoardArrayState0001[0].computeInteger1117(26580);
            this.integerState0615 = integerLocal15 * 7 - 4;
            this.mixedSupport028State0001.bucketBoardArrayState0001[0].performAction1095(84, integerLocal15, returnedShapeLocal17);
            if (!this.booleanState0147) {
              stackBooleanLocal6 = !(UiComponentPart015.integerState0319 >= 3);
              this.booleanState0149 = stackBooleanLocal6;
            } else {
              stackBooleanLocal5 = !(UiComponentPart015.integerState0319 >= 4);
              this.booleanState0149 = stackBooleanLocal5;
            }
            if (this.booleanState0149) {
              stackIntegerLocal7 = 0;
              if (this.booleanState0144) {
                stackIntegerLocal8 = 0;
              } else {
                stackIntegerLocal8 = -1;
              }
              this.performAction1500(stackIntegerLocal7, stackIntegerLocal8, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal12 = caughtParameterLocal19;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal14;
          stackStringBuilderLocal10 = new StringBuilder().append("qc.<init>(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (stringArrayArgument8 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument9).append(',').append(booleanArgument10).append(',').append(booleanArgument11).append(',').append(booleanArgument12).append(')').toString());
        }
    }

    static {
        stringArrayState0033 = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        integerState0618 = 360;
        stringState0439 = "Who can join";
    }
}
