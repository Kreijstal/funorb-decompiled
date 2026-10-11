/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AnimatedTileRegion extends HashNode {
    int integerState0811;
    static java.math.BigInteger bigIntegerState0004;
    int integerState0812;
    int integerState0813;
    int integerState0814;
    int integerState0815;
    int integerState0816;
    int integerState0817;
    int integerState0818;
    IndexedSprite[] indexedSpriteArrayState0005;
    static long[] longArrayState0010;
    static int[] integerArrayState0233;
    static long[][] longArrayArrayState0002;
    static String stringState0566;

    final void performAction1889(int integerArgument1, int integerArgument2) {
        IndexedSprite stackIndexedSpriteLocal1 = null;
        IndexedSprite stackIndexedSpriteLocal2 = null;
        IndexedSprite stackIndexedSpriteLocal3 = null;
        IndexedSprite stackIndexedSpriteLocal4 = null;
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
        IndexedSprite indexedSpriteLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        IndexedSprite indexedSpriteLocal22;
        IndexedSprite indexedSpriteLocal23;
        int integerLocal24;
        AnimatedTileRegion animatedTileRegionLocal25;
        IndexedSprite indexedSpriteLocal26;
        IndexedSprite indexedSpriteLocal27;
        IndexedSprite indexedSpriteLocal28;
        IndexedSprite indexedSpriteLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        IndexedSprite indexedSpriteLocal45;
        IndexedSprite indexedSpriteLocal46;
        IndexedSprite indexedSpriteLocal47;
        int integerLocal48;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        int integerLocal52;
        int integerLocal53;
        int integerLocal54;
        int integerLocal55;
        int integerLocal56;
        integerLocal24 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument2 >= this.integerState0813) {
          return;
        }
        boolean frameRemainderLocal57 = true;
        animatedTileRegionLocal25 = new AnimatedTileRegion();
        animatedTileRegionLocal25.integerState0811 = this.integerState0811;
        animatedTileRegionLocal25.integerState0818 = this.integerState0818;
        animatedTileRegionLocal25.integerState0817 = this.integerState0817;
        animatedTileRegionLocal25.integerState0816 = this.integerState0816;
        animatedTileRegionLocal25.integerState0814 = this.integerState0814;
        animatedTileRegionLocal25.integerState0815 = this.integerState0815;
        animatedTileRegionLocal25.indexedSpriteArrayState0005 = new IndexedSprite[this.integerState0815 * this.integerState0817];
        if (this.integerState0817 > this.integerState0815) {
          integerLocal5 = UiComponentPart016.computeInteger0944((byte) 53, this.integerState0816 * this.integerState0815, UiComponentPart031.randomState0003) + this.integerState0816 * (this.integerState0817 - this.integerState0815) / 2;
          integerLocal6 = -1 + (this.integerState0817 * this.integerState0816 - integerLocal5);
          integerLocal7 = UiComponentPart016.computeInteger0944((byte) 117, 1 + 2 * this.integerState0815 * this.integerState0816, UiComponentPart031.randomState0003) - this.integerState0815 * this.integerState0816;
          animatedTileRegionLocal25.integerState0813 = (this.integerState0817 * this.integerState0816 / 2 - integerLocal7 / 6) * this.integerState0813 / (this.integerState0816 * this.integerState0817);
          this.integerState0813 = this.integerState0813 - animatedTileRegionLocal25.integerState0813;
          integerLocal8 = this.integerState0815 * this.integerState0811;
          integerLocal9 = integerLocal8 * integerLocal8;
          integerLocal10 = 0;
          integerLocal11 = 0;
          while (this.integerState0815 > integerLocal11) {
            integerLocal12 = this.integerState0817;
            integerLocal13 = 0;
            for (integerLocal14 = 0; this.integerState0811 > integerLocal14; integerLocal14++) {
              integerLocal15 = integerLocal5 + (integerLocal10 * (integerLocal6 - integerLocal5) / integerLocal8 + (integerLocal8 - integerLocal10) * (integerLocal10 * integerLocal7) / integerLocal9);
              MixedSupport133.integerArrayState0210[integerLocal14] = integerLocal15;
              integerLocal10++;
              if (integerLocal12 > (integerLocal15 / this.integerState0816)) {
                integerLocal12 = integerLocal15 / this.integerState0816;
              }
              if ((this.integerState0816 + integerLocal15 - 1) / this.integerState0816 > integerLocal13) {
                integerLocal13 = (integerLocal15 - (-this.integerState0816 + 1)) / this.integerState0816;
              }
            }
            if (integerLocal12 < 0) {
              integerLocal12 = 0;
            }
            if (integerLocal13 > this.integerState0817) {
              integerLocal13 = this.integerState0817;
            }
            integerLocal48 = integerLocal11 * this.integerState0817;
            for (integerLocal49 = 0; integerLocal12 > integerLocal49; integerLocal49++) {
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal48 + integerLocal49] = NetworkSupport007.indexedSpriteState0002;
            }
            for (integerLocal50 = integerLocal12; integerLocal13 > integerLocal50; integerLocal50++) {
              indexedSpriteLocal17 = this.indexedSpriteArrayState0005[integerLocal48 + integerLocal50];
              if (indexedSpriteLocal17 != null &&
                NetworkSupport007.indexedSpriteState0002 != indexedSpriteLocal17) {
                indexedSpriteLocal17 = indexedSpriteLocal17.computeIndexedSprite1424();
              }
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal50 + integerLocal48] = indexedSpriteLocal17;
            }
            for (integerLocal51 = integerLocal13; this.integerState0817 > integerLocal51; integerLocal51++) {
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal48 + integerLocal51] = this.indexedSpriteArrayState0005[integerLocal51 + integerLocal48];
              this.indexedSpriteArrayState0005[integerLocal51 + integerLocal48] = NetworkSupport007.indexedSpriteState0002;
            }
            integerLocal52 = 0;
            while (true) {
              if (this.integerState0811 <= integerLocal52) {
                integerLocal11++;
                break;
              }
              integerLocal16 = MixedSupport133.integerArrayState0210[integerLocal52];
              integerLocal18 = this.integerState0816 * integerLocal12;
              integerLocal19 = integerLocal12;
              integerLocal20 = 0;
              scanLoop1: while (true) {
                if (integerLocal18 < integerLocal16) {
                  indexedSpriteLocal22 = animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal11 * this.integerState0817 + integerLocal19];
                  while (integerLocal20 < this.integerState0816) {
                    if (integerLocal18 >= integerLocal16) {
                      break scanLoop1;
                    }
                    stackIndexedSpriteLocal1 = indexedSpriteLocal22;
                    stackIndexedSpriteLocal2 = NetworkSupport007.indexedSpriteState0002;
                    if (stackIndexedSpriteLocal1 != stackIndexedSpriteLocal2) {
                      if (indexedSpriteLocal22 == null) {
                        indexedSpriteLocal26 = new IndexedSprite(this.integerState0816, this.integerState0811, 0);
                        indexedSpriteLocal22 = indexedSpriteLocal26;
                        MixedSupport008.performAction0081(indexedSpriteLocal26.byteArrayState0021, 0, this.integerState0816 * this.integerState0811, (byte) 1);
                        animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal19 + this.integerState0817 * integerLocal11] = indexedSpriteLocal26;
                      }
                      indexedSpriteLocal22.byteArrayState0021[integerLocal20 + integerLocal52 * this.integerState0816] = (byte) 0;
                    }
                    integerLocal18++;
                    integerLocal20++;
                  }
                  integerLocal19++;
                  integerLocal20 = 0;
                  continue;
                }
                break;
              }
              while (integerLocal19 < integerLocal13) {
                indexedSpriteLocal46 = this.indexedSpriteArrayState0005[integerLocal19 + this.integerState0817 * integerLocal11];
                while (this.integerState0816 > integerLocal20) {
                  if (NetworkSupport007.indexedSpriteState0002 != indexedSpriteLocal46) {
                    if (indexedSpriteLocal46 == null) {
                      indexedSpriteLocal27 = new IndexedSprite(this.integerState0816, this.integerState0811, 0);
                      indexedSpriteLocal46 = indexedSpriteLocal27;
                      MixedSupport008.performAction0081(indexedSpriteLocal27.byteArrayState0021, 0, this.integerState0816 * this.integerState0811, (byte) 1);
                      this.indexedSpriteArrayState0005[this.integerState0817 * integerLocal11 + integerLocal19] = indexedSpriteLocal27;
                    }
                    indexedSpriteLocal46.byteArrayState0021[integerLocal52 * this.integerState0816 + integerLocal20] = (byte) 0;
                  }
                  integerLocal20++;
                  integerLocal18++;
                }
                integerLocal19++;
                integerLocal20 = 0;
              }
              integerLocal52++;
            }
          }
          frameRemainderLocal57 = false;
        }
        else {
          integerLocal30 = UiComponentPart016.computeInteger0944((byte) 51, this.integerState0817 * this.integerState0811, UiComponentPart031.randomState0003) + this.integerState0811 * (this.integerState0815 - this.integerState0817) / 2;
          integerLocal31 = this.integerState0811 * this.integerState0815 - 1 - integerLocal30;
          integerLocal32 = UiComponentPart016.computeInteger0944((byte) 56, this.integerState0817 * (this.integerState0811 * 2) + 1, UiComponentPart031.randomState0003) - this.integerState0811 * this.integerState0817;
          animatedTileRegionLocal25.integerState0813 = (-(integerLocal32 / 6) + this.integerState0815 * this.integerState0811 / 2) * this.integerState0813 / (this.integerState0815 * this.integerState0811);
          this.integerState0813 = this.integerState0813 - animatedTileRegionLocal25.integerState0813;
          integerLocal33 = this.integerState0817 * this.integerState0816;
          integerLocal34 = integerLocal33 * integerLocal33;
          integerLocal35 = 0;
          integerLocal36 = 0;
          while (this.integerState0817 > integerLocal36) {
            integerLocal37 = this.integerState0815;
            integerLocal38 = 0;
            for (integerLocal39 = 0; this.integerState0816 > integerLocal39; integerLocal39++) {
              integerLocal40 = integerLocal30 - (-(integerLocal35 * (-integerLocal30 + integerLocal31) / integerLocal33) - integerLocal35 * integerLocal32 * (integerLocal33 - integerLocal35) / integerLocal34);
              MixedSupport133.integerArrayState0210[integerLocal39] = integerLocal40;
              if (integerLocal37 > integerLocal40 / this.integerState0811) {
                integerLocal37 = integerLocal40 / this.integerState0811;
              }
              integerLocal35++;
              if ((this.integerState0811 + integerLocal40 - 1) / this.integerState0811 > integerLocal38) {
                integerLocal38 = (-1 + this.integerState0811 + integerLocal40) / this.integerState0811;
              }
            }
            if (integerLocal38 > this.integerState0815) {
              integerLocal38 = this.integerState0815;
            }
            if (integerLocal37 < 0) {
              integerLocal37 = 0;
            }
            integerLocal53 = integerLocal36;
            integerLocal54 = this.integerState0817 * integerLocal37;
            while (integerLocal53 < integerLocal54) {
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal53] = NetworkSupport007.indexedSpriteState0002;
              integerLocal53 = integerLocal53 + this.integerState0817;
            }
            integerLocal55 = this.integerState0817 * integerLocal38;
            while (integerLocal53 < integerLocal55) {
              indexedSpriteLocal45 = this.indexedSpriteArrayState0005[integerLocal53];
              if (indexedSpriteLocal45 != null &&
                NetworkSupport007.indexedSpriteState0002 != indexedSpriteLocal45) {
                indexedSpriteLocal45 = indexedSpriteLocal45.computeIndexedSprite1424();
              }
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal53] = indexedSpriteLocal45;
              integerLocal53 = integerLocal53 + this.integerState0817;
            }
            integerLocal56 = this.integerState0817 * this.integerState0815;
            while (integerLocal56 > integerLocal53) {
              animatedTileRegionLocal25.indexedSpriteArrayState0005[integerLocal53] = this.indexedSpriteArrayState0005[integerLocal53];
              this.indexedSpriteArrayState0005[integerLocal53] = NetworkSupport007.indexedSpriteState0002;
              integerLocal53 = integerLocal53 + this.integerState0817;
            }
            integerLocal41 = 0;
            while (true) {
              if (integerLocal41 >= this.integerState0816) {
                integerLocal36++;
                break;
              }
              integerLocal42 = MixedSupport133.integerArrayState0210[integerLocal41];
              integerLocal43 = integerLocal37 * this.integerState0811;
              integerLocal44 = integerLocal37;
              integerLocal21 = 0;
              scanLoop2: while (true) {
                if (integerLocal43 < integerLocal42) {
                  indexedSpriteLocal23 = animatedTileRegionLocal25.indexedSpriteArrayState0005[this.integerState0817 * integerLocal44 + integerLocal36];
                  while (this.integerState0811 > integerLocal21) {
                    if (integerLocal42 <= integerLocal43) {
                      break scanLoop2;
                    }
                    stackIndexedSpriteLocal3 = NetworkSupport007.indexedSpriteState0002;
                    stackIndexedSpriteLocal4 = indexedSpriteLocal23;
                    if (stackIndexedSpriteLocal3 != stackIndexedSpriteLocal4) {
                      if (indexedSpriteLocal23 == null) {
                        indexedSpriteLocal28 = new IndexedSprite(this.integerState0816, this.integerState0811, 0);
                        indexedSpriteLocal23 = indexedSpriteLocal28;
                        MixedSupport008.performAction0081(indexedSpriteLocal28.byteArrayState0021, 0, this.integerState0816 * this.integerState0811, (byte) 1);
                        animatedTileRegionLocal25.indexedSpriteArrayState0005[this.integerState0817 * integerLocal44 + integerLocal36] = indexedSpriteLocal28;
                      }
                      indexedSpriteLocal23.byteArrayState0021[integerLocal21 * this.integerState0816 + integerLocal41] = (byte) 0;
                    }
                    integerLocal21++;
                    integerLocal43++;
                  }
                  integerLocal44++;
                  integerLocal21 = 0;
                  continue;
                }
                break;
              }
              while (integerLocal38 > integerLocal44) {
                indexedSpriteLocal47 = this.indexedSpriteArrayState0005[integerLocal36 + this.integerState0817 * integerLocal44];
                while (this.integerState0811 > integerLocal21) {
                  if (indexedSpriteLocal47 != NetworkSupport007.indexedSpriteState0002) {
                    if (indexedSpriteLocal47 == null) {
                      indexedSpriteLocal29 = new IndexedSprite(this.integerState0816, this.integerState0811, 0);
                      indexedSpriteLocal47 = indexedSpriteLocal29;
                      MixedSupport008.performAction0081(indexedSpriteLocal29.byteArrayState0021, 0, this.integerState0816 * this.integerState0811, (byte) 1);
                      this.indexedSpriteArrayState0005[integerLocal36 + integerLocal44 * this.integerState0817] = indexedSpriteLocal29;
                    }
                    indexedSpriteLocal47.byteArrayState0021[integerLocal41 + this.integerState0816 * integerLocal21] = (byte) 0;
                  }
                  integerLocal43++;
                  integerLocal21++;
                }
                integerLocal44++;
                integerLocal21 = 0;
              }
              integerLocal41++;
            }
          }
        }
        this.performAction1892((byte) 116);
        animatedTileRegionLocal25.performAction1892((byte) -110);
        animatedTileRegionLocal25.previous = this.previous;
        animatedTileRegionLocal25.next = (HashNode) (this);
        animatedTileRegionLocal25.next.previous = (HashNode) ((Object) animatedTileRegionLocal25);
        animatedTileRegionLocal25.previous.next = (HashNode) ((Object) animatedTileRegionLocal25);
        this.performAction1889(11976, integerArgument2);
        animatedTileRegionLocal25.performAction1889(integerArgument1, integerArgument2);
    }

    final static boolean computeBoolean1890(byte byteArgument1) {
        if (byteArgument1 != -17) {
          AnimatedTileRegion.computeBoolean1890((byte) 22);
        }
        return UiComponentPart022.mixedSupport004State0003 == UiComponentPart016.mixedSupport004State0001 ? true : false;
    }

    public static void performAction1891(int integerArgument1) {
        longArrayState0010 = null;
        integerArrayState0233 = null;
        longArrayArrayState0002 = (long[][]) null;
        stringState0566 = null;
        if (integerArgument1 <= 122) {
          return;
        }
        bigIntegerState0004 = null;
    }

    final static boolean computeBoolean1888(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument1 != -22802) {
          stringState0566 = (String) null;
        }
        stackBooleanLocal1 = (MixedSupport131.uiComponentPart016State0003 != null) && (MixedSupport131.uiComponentPart016State0003.computeUiComponentPart0030950((byte) -104) != null);
        return stackBooleanLocal1;
    }

    private final void performAction1892(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        IndexedSprite stackIndexedSpriteLocal3 = null;
        IndexedSprite stackIndexedSpriteLocal4 = null;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        IndexedSprite[] indexedSpriteArrayLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal5 = 0;
        integerLocal6 = this.integerState0817;
        integerLocal7 = 0;
        integerLocal8 = this.integerState0815;
        scanLoop1: while (integerLocal7 < integerLocal8) {
          integerLocal8--;
          integerLocal9 = integerLocal5;
          while (true) {
            if (integerLocal9 >= integerLocal6) {
              continue scanLoop1;
            }
            if (this.indexedSpriteArrayState0005[integerLocal8 * this.integerState0817 + integerLocal9] == NetworkSupport007.indexedSpriteState0002) {
              integerLocal9++;
              continue;
            }
            break;
          }
          integerLocal8++;
          break;
        }
        integerLocal14 = 32 / ((-48 - byteArgument1) / 43);
        scanLoop2: while (true) {
          if (integerLocal8 > integerLocal7) {
            for (integerLocal10 = integerLocal5; integerLocal10 < integerLocal6; integerLocal10++) {
              if (NetworkSupport007.indexedSpriteState0002 != this.indexedSpriteArrayState0005[integerLocal7 * this.integerState0817 + integerLocal10]) {
                break scanLoop2;
              }
            }
            integerLocal7++;
            continue;
          }
          break;
        }
        scanLoop3: while (integerLocal6 > integerLocal5) {
          integerLocal6--;
          integerLocal15 = integerLocal7;
          while (true) {
            if (integerLocal15 >= integerLocal8) {
              continue scanLoop3;
            }
            if (this.indexedSpriteArrayState0005[integerLocal6 + this.integerState0817 * integerLocal15] == NetworkSupport007.indexedSpriteState0002) {
              integerLocal15++;
              continue;
            }
            break;
          }
          integerLocal6++;
          break;
        }
        scanLoop4: while (true) {
          if (integerLocal5 < integerLocal6) {
            for (integerLocal16 = integerLocal7; integerLocal16 < integerLocal8; integerLocal16++) {
              stackIndexedSpriteLocal3 = NetworkSupport007.indexedSpriteState0002;
              stackIndexedSpriteLocal4 = this.indexedSpriteArrayState0005[integerLocal5 + this.integerState0817 * integerLocal16];
              if (stackIndexedSpriteLocal3 != stackIndexedSpriteLocal4) {
                break scanLoop4;
              }
            }
            integerLocal5++;
            continue;
          }
          break;
        }
        if (0 >= integerLocal5 &&
          this.integerState0817 <= integerLocal6 &&
          0 >= integerLocal7 &&
          this.integerState0815 <= integerLocal8) {
          return;
        }
        integerLocal17 = integerLocal6 - integerLocal5;
        integerLocal11 = -integerLocal7 + integerLocal8;
        indexedSpriteArrayLocal12 = new IndexedSprite[integerLocal17 * integerLocal11];
        for (integerLocal1 = 0; integerLocal11 > integerLocal1; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal17 > integerLocal2; integerLocal2++) {
            indexedSpriteArrayLocal12[integerLocal2 + integerLocal1 * integerLocal17] = this.indexedSpriteArrayState0005[(integerLocal1 + integerLocal7) * this.integerState0817 - (-integerLocal5 - integerLocal2)];
          }
        }
        this.integerState0818 = this.integerState0818 + integerLocal7;
        this.integerState0817 = integerLocal17;
        this.integerState0815 = integerLocal11;
        this.integerState0814 = this.integerState0814 + integerLocal5;
        this.indexedSpriteArrayState0005 = indexedSpriteArrayLocal12;
        return;
    }

    AnimatedTileRegion() {
    }

    static {
        int integerLocal1 = 0;
        long longLocal2 = 0L;
        long longLocal3 = 0L;
        long longLocal4 = 0L;
        long longLocal5 = 0L;
        long longLocal6 = 0L;
        long longLocal7 = 0L;
        int integerLocal8 = 0;
        bigIntegerState0004 = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        integerArrayState0233 = new int[8192];
        longArrayState0010 = new long[11];
        longArrayArrayState0002 = new long[8][256];
        int integerLocal9 = 0;
        while (256 > integerLocal9) {
            integerLocal1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(integerLocal9 / 2);
            longLocal2 = 0 == (1 & integerLocal9) ? (long)(integerLocal1 >>> 8) : (long)(integerLocal1 & 255);
            longLocal3 = longLocal2 << 1;
            if (!(longLocal3 < 256L)) {
                longLocal3 = longLocal3 ^ 285L;
            }
            longLocal4 = longLocal3 << 1;
            if (longLocal4 >= 256L) {
                longLocal4 = longLocal4 ^ 285L;
            }
            longLocal5 = longLocal2 ^ longLocal4;
            longLocal6 = longLocal4 << 1;
            if (longLocal6 >= 256L) {
                longLocal6 = longLocal6 ^ 285L;
            }
            longLocal7 = longLocal6 ^ longLocal2;
            longArrayArrayState0002[0][integerLocal9] = ThemeTips.computeLong0929(ThemeTips.computeLong0929(ThemeTips.computeLong0929(longLocal5 << 16, ThemeTips.computeLong0929(longLocal6 << 24, ThemeTips.computeLong0929(ThemeTips.computeLong0929(longLocal4 << 40, ThemeTips.computeLong0929(longLocal2 << 48, longLocal2 << 56)), longLocal2 << 32))), longLocal3 << 8), longLocal7);
            for (integerLocal8 = 1; integerLocal8 < 8; integerLocal8++) {
                longArrayArrayState0002[integerLocal8][integerLocal9] = ThemeTips.computeLong0929(longArrayArrayState0002[integerLocal8 - 1][integerLocal9] >>> 8, longArrayArrayState0002[integerLocal8 - 1][integerLocal9] << 56);
            }
            integerLocal9++;
        }
        longArrayState0010[0] = 0L;
        for (integerLocal9 = 1; 10 >= integerLocal9; integerLocal9++) {
            integerLocal1 = (-1 + integerLocal9) * 8;
            longArrayState0010[integerLocal9] = ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893(255L, longArrayArrayState0002[7][7 + integerLocal1]), ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893(longArrayArrayState0002[1][integerLocal1 + 1], 71776119061217280L), LoginCredentials.computeLong0893(longArrayArrayState0002[0][integerLocal1], -72057594037927936L)), LoginCredentials.computeLong0893(longArrayArrayState0002[2][2 + integerLocal1], 280375465082880L)), LoginCredentials.computeLong0893(1095216660480L, longArrayArrayState0002[3][integerLocal1 + 3])), LoginCredentials.computeLong0893(4278190080L, longArrayArrayState0002[4][integerLocal1 + 4])), LoginCredentials.computeLong0893(16711680L, longArrayArrayState0002[5][integerLocal1 + 5])), LoginCredentials.computeLong0893(65280L, longArrayArrayState0002[6][integerLocal1 + 6])));
        }
        stringState0566 = "Passwords can only contain letters and numbers";
    }
}
