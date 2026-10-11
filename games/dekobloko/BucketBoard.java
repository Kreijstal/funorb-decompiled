/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BucketBoard {
    int dropIntervalTicks;
    ReturnedShape[] returnedShapeArrayState0001;
    int[] settledCells;
    int pieceHeight;
    private int verticalParity;
    String stringState0335;
    private int integerState0442;
    MixedSupport117 mixedSupport117State0001;
    private int deepestPieceCenterY2;
    int integerState0444;
    private boolean booleanState0103;
    private int integerState0445;
    int integerState0446;
    private int horizontalRepeatTicks;
    static String stringState0336;
    private int integerState0448;
    private int[] activePieceCells;
    private int forcedDropCountdown;
    int integerState0450;
    private int[] integerArrayState0144;
    int integerState0451;
    boolean landed;
    static int integerState0452;
    int integerState0453;
    private int[] integerArrayState0145;
    int integerState0454;
    int boardWidth;
    int pieceX;
    int integerState0457;
    int integerState0458;
    private int integerState0459;
    private int integerState0460;
    private boolean booleanState0105;
    int pieceAcknowledgement;
    int integerState0462;
    private int dropCountdown;
    int integerState0464;
    int integerState0465;
    int integerState0466;
    int[] selectedCellIndices;
    int integerState0467;
    private int integerState0468;
    private int horizontalParity;
    int integerState0470;
    int integerState0471;
    boolean booleanState0106;
    int integerState0472;
    int integerState0473;
    NodeDeque nodeDequeState0017;
    int integerState0474;
    int integerState0475;
    private int[] integerArrayState0147;
    private boolean grounded;
    int integerState0476;
    int integerState0477;
    int integerState0478;
    private int integerState0479;
    boolean booleanState0108;
    int livesRemaining;
    private int integerState0481;
    int pieceY;
    int integerState0483;
    MixedSupport030 mixedSupport030State0001;
    static boolean booleanState0109;
    int integerState0484;
    private boolean booleanState0110;
    private int integerState0485;
    private int[] integerArrayState0148;
    private boolean booleanState0111;
    int integerState0486;
    NodeDeque nodeDequeState0018;
    int dominoDescriptor;
    int integerState0488;
    int boardHeight;
    private int integerState0490;
    int integerState0491;
    private int previousControls;
    int integerState0493;
    int integerState0494;
    int pieceWidth;
    int integerState0496;

    final int computeInteger1113(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = -1;
        integerLocal3 = this.pieceWidth * this.pieceHeight;
        if (integerArgument1 > -36) {
          this.performAction1115(5);
        }
        for (integerLocal1 = 0; integerLocal1 < integerLocal3; integerLocal1++) {
          integerLocal4 = this.activePieceCells[integerLocal1];
          if ((integerLocal4 & 24) == 24) {
            integerLocal4 = integerLocal4 & 7;
            if (integerLocal4 > integerLocal2) {
              integerLocal2 = integerLocal4;
            }
          }
        }
        return integerLocal2;
    }

    private final boolean computeBoolean1120(int integerArgument1) {
        int[] integerArrayLocal1 = null;
        int previousIntegerLocal2 = 0;
        int integerLocal3 = 0;
        int[] integerArrayLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int[] integerArrayLocal10;
        int[] integerArrayLocal11;
        int[] integerArrayLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerArrayLocal12 = this.integerArrayState0148;
        integerArrayLocal11 = integerArrayLocal12;
        integerArrayLocal10 = integerArrayLocal11;
        integerArrayLocal4 = integerArrayLocal10;
        if (integerArrayLocal10 == null ||
          integerArrayLocal12.length < this.pieceWidth * this.pieceHeight) {
          integerArrayLocal1 = new int[this.pieceWidth * this.pieceHeight];
          integerArrayLocal4 = integerArrayLocal1;
          this.integerArrayState0148 = integerArrayLocal1;
        }
        integerLocal5 = 0;
        if (integerArgument1 != 21200) {
          this.stringState0335 = (String) null;
        }
        for (integerLocal6 = 0; integerLocal6 < this.pieceHeight; integerLocal6++) {
          integerLocal7 = -integerLocal6 + (-1 + this.pieceHeight);
          for (integerLocal8 = 0; this.pieceWidth > integerLocal8; integerLocal8++) {
            previousIntegerLocal2 = integerLocal5;
            integerLocal5++;
            this.integerArrayState0148[integerLocal7] = this.activePieceCells[previousIntegerLocal2];
            integerLocal7 = integerLocal7 + this.pieceHeight;
          }
        }
        integerLocal16 = this.horizontalParity - this.pieceHeight + this.pieceWidth + this.verticalParity >> 1;
        integerLocal17 = this.verticalParity + (this.pieceHeight + (-this.pieceWidth - this.horizontalParity)) >> 1;
        this.pieceX = this.pieceX + integerLocal16;
        integerLocal13 = this.pieceWidth;
        this.pieceY = this.pieceY + integerLocal17;
        this.pieceWidth = this.pieceHeight;
        this.integerArrayState0148 = this.activePieceCells;
        this.pieceHeight = integerLocal13;
        this.activePieceCells = integerArrayLocal4;
        if (this.pieceCollides((byte) -117)) {
          this.activePieceCells = this.integerArrayState0148;
          this.integerArrayState0148 = integerArrayLocal4;
          this.pieceHeight = this.pieceWidth;
          this.pieceY = this.pieceY - integerLocal17;
          this.pieceWidth = integerLocal13;
          this.pieceX = this.pieceX - integerLocal16;
          return false;
        }
        this.integerState0485 = this.integerState0485 + 1;
        integerLocal14 = this.horizontalParity;
        this.horizontalParity = -this.verticalParity;
        this.verticalParity = integerLocal14;
        this.recordDeepestPiecePosition(30968);
        integerLocal15 = 0;
        this.updateGroundedAfterMovement(-1);
        for (integerLocal18 = 0; integerLocal18 < this.pieceHeight; integerLocal18++) {
          for (integerLocal3 = 0; integerLocal3 < this.pieceWidth; integerLocal3++) {
            this.integerArrayState0147[integerLocal15] = 0;
            this.integerArrayState0144[integerLocal15] = (-1 + (this.pieceWidth + this.horizontalParity - integerLocal3 * 2)) * -8 / this.pieceWidth;
            integerLocal15++;
          }
        }
        RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 4, (byte) 127, UiComponentPart014.rawSoundState0010);
        return true;
    }

    private final void performAction1096(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 > -88) {
          return;
        }
        integerLocal1 = 0;
        integerLocal2 = 0;
        for (integerLocal3 = 0; this.boardHeight * this.boardWidth > integerLocal3; integerLocal3++) {
          integerLocal4 = this.settledCells[integerLocal3];
          if ((1879048192 & integerLocal4) == 0) {
            this.settledCells[integerLocal3] = MixedSupport079.computeInteger1051(2147483647, integerLocal4);
          } else {
            if (8 == (integerLocal4 & 24)) {
              integerLocal2++;
            }
            if (16 == (integerLocal4 & 24)) {
              integerLocal1++;
            }
            integerLocal5 = (1879048192 & integerLocal4) / 268435456;
            if (8 == (integerLocal4 & 24) &&
              integerLocal5 > MixedSupport086.integerState0514) {
              MixedSupport086.integerState0514 = integerLocal5;
            }
            this.integerState0467 = integerArgument3;
            if ((-1879048193 & integerLocal4) == 23 &&
              integerLocal5 > MixedSupport041.integerState0234) {
              MixedSupport041.integerState0234 = integerLocal5;
            }
            if (booleanArgument2) {
              this.settledCells[integerLocal3] = 56;
            } else {
              this.settledCells[integerLocal3] = UiComponentPart006.computeInteger0388(32, MixedSupport079.computeInteger1051(integerLocal4, 268435455));
            }
          }
        }
        if (booleanArgument2) {
          integerLocal7 = ((int)((double)this.integerState0446 * Math.sqrt((double)(integerLocal1 + (16 + integerLocal2)))) + 8) / 16;
          if (this.integerState0446 < integerLocal7) {
            integerLocal7 = this.integerState0446;
          }
          RenderingSupport003.performAction0631(this.integerState0458, integerLocal7, (byte) 127, MixedSupport030.rawSoundState0006);
        } else {
          if (integerLocal1 > 0) {
            integerLocal7 = ((int)((double)this.integerState0446 * Math.sqrt((double)integerLocal1)) + 1) / 2;
            if (this.integerState0446 < integerLocal7) {
              integerLocal7 = this.integerState0446;
            }
            RenderingSupport003.performAction0631(this.integerState0458, integerLocal7, (byte) 127, MixedSupport152.rawSoundState0023);
          }
          if (0 < integerLocal2) {
            integerLocal7 = (2 + (int)((double)this.integerState0446 * Math.sqrt((double)integerLocal2))) / 4;
            if (integerLocal7 > this.integerState0446) {
              integerLocal7 = this.integerState0446;
            }
            RenderingSupport003.performAction0631(this.integerState0458, integerLocal7, (byte) 127, MixedSupport117.rawSoundState0020);
          }
        }
        return;
    }

    private final int computeInteger1116(int integerArgument1) {
        int integerLocal1 = 95 % ((integerArgument1 - 43) / 54);
        return 80 + this.dropIntervalTicks * this.boardHeight;
    }

    final int computeInteger1091(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal1 = 0;
        if (integerArgument1 >= 0 &&
          integerArgument3 >= 0 &&
          integerArgument1 < this.boardWidth &&
          this.boardHeight > integerArgument3) {
          integerLocal1 = this.settledCells[integerArgument1 + this.boardWidth * integerArgument3];
        }
        integerLocal2 = 101 / ((integerArgument2 - 24) / 52);
        if (this.pieceWidth != 0 &&
          !this.booleanState0106) {
          integerLocal3 = -this.pieceX + integerArgument1;
          integerLocal4 = -this.pieceY + integerArgument3;
          if (integerLocal3 >= 0 &&
            integerLocal4 >= 0 &&
            this.pieceWidth > integerLocal3 &&
            this.pieceHeight > integerLocal4) {
            integerLocal5 = this.activePieceCells[integerLocal4 * this.pieceWidth + integerLocal3];
            if (integerLocal5 != 0) {
              integerLocal1 = integerLocal5;
            }
          }
        }
        return integerLocal1;
    }

    final static void performAction1097(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7, int integerArgument8, boolean booleanArgument9, boolean booleanArgument10, boolean booleanArgument11, boolean booleanArgument12) {
        MixedSupport128.performAction1817(16777215, integerArgument3, booleanArgument7, integerArgument8, booleanArgument11, booleanArgument12, booleanArgument2, 16777215, integerArgument1, integerArgument5, integerArgument4, (byte) 103, integerArgument6, booleanArgument9);
        if (!booleanArgument10) {
          BucketBoard.performAction1114(-50);
        }
    }

    private final void updateGroundedAfterMovement(int integerArgument1) {
        if (integerArgument1 != -1) {
          return;
        }
        if (!this.grounded) {
        } else {
          if (!this.tryDropAndReportCollision((byte) -93, true)) {
            this.grounded = false;
            this.advanceDropCountdown(30000, this.dropIntervalTicks, 1);
          } else {
            this.dropCountdown = 20;
          }
        }
    }

    private final int computeInteger1103(boolean booleanArgument1, int integerArgument2, int integerArgument3, BucketBoard bucketBoardArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7, int integerArgument8, ReturnedShapeCache returnedShapeCacheArgument9, boolean booleanArgument10, byte byteArgument11) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        Object stackObjectLocal5;
        BucketBoard stackBucketBoardLocal6;
        ReturnedShapeCache stackReturnedShapeCacheLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        Object stackObjectLocal10;
        int stackIntegerLocal11;
        int stackIntegerLocal12 = 0;
        RuntimeException stackRuntimeExceptionLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        RuntimeException caughtExceptionLocal18 = null;
        int integerLocal19 = 0;
        RuntimeException runtimeExceptionLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        integerLocal30 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal19 = this.settledCells[integerArgument7];
          if ((integerLocal19 & -1879048193) >> 3 != integerArgument2) {
            stackIntegerLocal3 = 0;
            return stackIntegerLocal3;
          }
          integerLocal21 = 0;
          if (integerArgument6 < 0 &&
            (integerLocal19 & -1879048193) == 23) {
            if (-2 == integerArgument6) {
              for (integerLocal22 = 0; integerLocal22 < 7; integerLocal22++) {
                integerLocal21 = integerLocal21 + this.computeInteger1103(booleanArgument1, integerArgument2, integerArgument3, bucketBoardArgument4, booleanArgument5, integerLocal22, integerArgument7, integerArgument8, returnedShapeCacheArgument9, booleanArgument10, (byte) 111);
              }
            }
            stackIntegerLocal4 = integerLocal21;
            return stackIntegerLocal4;
          }
          if (this.booleanState0110) {
            integerArgument8 = 3;
          }
          integerLocal31 = 0;
          this.selectedCellIndices[0] = integerArgument7;
          integerLocal23 = 1;
          this.settledCells[integerArgument7] = UiComponentPart006.computeInteger0388(-2147483648, integerLocal19);
          integerLocal24 = 0;
          if (integerArgument6 >= 0) {
            integerLocal24 = 1;
            integerLocal19 = (-1879048200 & integerLocal19) + integerArgument6;
          }
          boolean frameRemainderLocal34 = true;
          if (!booleanArgument1) {
            integerLocal25 = -119 / ((byteArgument11 - 7) / 60);
            frameRemainderLocal34 = (integerLocal24 == 0);
            if ((frameRemainderLocal34) &&
              (frameRemainderLocal34 = !(integerLocal23 < integerArgument3))) {
              integerLocal19 = 8 | integerLocal19 & 7;
              integerLocal31 = 0;
              for (integerLocal26 = 0; integerLocal26 < integerLocal23; integerLocal26++) {
                integerLocal27 = this.selectedCellIndices[integerLocal26];
                integerLocal28 = this.settledCells[integerLocal27];
                if (1879048192 > (1879048192 & integerLocal28)) {
                  this.settledCells[integerLocal27] = integerLocal28 + 268435456;
                }
              }
            }
          } else {
            if (booleanArgument10) {
              integerLocal25 = 24 ^ integerLocal19;
            } else {
              integerLocal25 = 23;
            }
            while (integerLocal31 < integerLocal23) {
              previousIntegerLocal1 = integerLocal31;
              integerLocal31++;
              integerLocal26 = this.selectedCellIndices[previousIntegerLocal1];
              if (integerLocal24 != 0 &&
                23 != (this.settledCells[integerLocal26] & 268435455)) {
                integerLocal24 = 0;
              }
              if (0 < integerLocal26 % this.boardWidth) {
                integerLocal23 = this.computeInteger1092(-1 + integerLocal26, 124, integerLocal25, integerLocal23, integerLocal19);
              }
              if (this.boardWidth - 1 > integerLocal26 % this.boardWidth) {
                integerLocal23 = this.computeInteger1092(1 + integerLocal26, 126, integerLocal25, integerLocal23, integerLocal19);
              }
              if (integerLocal26 >= this.boardWidth) {
                integerLocal23 = this.computeInteger1092(-this.boardWidth + integerLocal26, 126, integerLocal25, integerLocal23, integerLocal19);
              }
              if ((-1 + this.boardHeight) * this.boardWidth <= integerLocal26) {
                continue;
              }
              integerLocal23 = this.computeInteger1092(integerLocal26 + this.boardWidth, 125, integerLocal25, integerLocal23, integerLocal19);
            }
            integerLocal25 = -119 / ((byteArgument11 - 7) / 60);
            frameRemainderLocal34 = (integerLocal24 == 0);
            if ((frameRemainderLocal34) &&
              (frameRemainderLocal34 = !(integerLocal23 < integerArgument3))) {
              integerLocal19 = 8 | integerLocal19 & 7;
              integerLocal31 = 0;
              for (integerLocal26 = 0; integerLocal26 < integerLocal23; integerLocal26++) {
                integerLocal27 = this.selectedCellIndices[integerLocal26];
                integerLocal28 = this.settledCells[integerLocal27];
                if (1879048192 > (1879048192 & integerLocal28)) {
                  this.settledCells[integerLocal27] = integerLocal28 + 268435456;
                }
              }
            }
          }
          if (frameRemainderLocal34) {
            integerLocal26 = integerLocal23;
            if (booleanArgument5) {
              while (integerLocal23 > integerLocal31) {
                previousIntegerLocal2 = integerLocal31;
                integerLocal31++;
                integerLocal27 = this.selectedCellIndices[previousIntegerLocal2];
                if (integerLocal27 % this.boardWidth > 0) {
                  integerLocal23 = this.computeInteger1090(integerLocal23, integerLocal27 - 1, (byte) -44, integerLocal19);
                }
                if (integerLocal27 % this.boardWidth < -1 + this.boardWidth) {
                  integerLocal23 = this.computeInteger1090(integerLocal23, integerLocal27 + 1, (byte) -44, integerLocal19);
                }
                if (this.boardWidth <= integerLocal27) {
                  integerLocal23 = this.computeInteger1090(integerLocal23, -this.boardWidth + integerLocal27, (byte) -44, integerLocal19);
                }
                if (integerLocal27 >= (this.boardHeight - 1) * this.boardWidth) {
                  continue;
                }
                integerLocal23 = this.computeInteger1090(integerLocal23, this.boardWidth + integerLocal27, (byte) -44, integerLocal19);
              }
            }
            if (!booleanArgument10 &&
              null != this.nodeDequeState0018) {
              if (integerArgument8 == 3 &&
                null != this.nodeDequeState0018) {
                integerLocal27 = RenderingSupport004.computeInteger0642(integerLocal23, 27935);
                integerLocal28 = integerLocal27;
                UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal28;
                MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal28;
                this.integerState0475 = this.integerState0475 + integerLocal27;
                this.nodeDequeState0018.performAction1963(new MixedSupport117(false, this.computeInteger1107(0, integerLocal23, 81), this.computeInteger1102(true, integerLocal23, 0), integerLocal27, MixedSupport001.integerArrayState0002, -1 + integerLocal23, 8 | 7 & integerLocal19, new String[]{" <times> ", Integer.toString(integerLocal23), " = <b>", Integer.toString(integerLocal27)}), 2777);
              } else {
                if (this.nodeDequeState0018 != null) {
                  integerLocal27 = UiComponentPart022.computeInteger1382(integerLocal26, 65);
                  integerLocal28 = RenderingSupport004.computeInteger0642(integerLocal23 - integerLocal26, 27935);
                  this.integerState0464 = this.integerState0464 + integerLocal27;
                  integerLocal29 = integerLocal27;
                  UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal29;
                  MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal29;
                  this.integerState0475 = this.integerState0475 + integerLocal28;
                  integerLocal33 = integerLocal28;
                  MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal33;
                  UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal33;
                  if (0 < integerLocal28) {
                    this.nodeDequeState0018.performAction1963(new MixedSupport117(false, this.computeInteger1107(integerLocal26, integerLocal23, 65), this.computeInteger1102(true, integerLocal23, integerLocal26), integerLocal28, MixedSupport001.integerArrayState0002, integerLocal23 - integerLocal26 - 1, 8 | 7 & integerLocal19, new String[]{" <times> ", Integer.toString(integerLocal23 - integerLocal26), " = <b>", Integer.toString(integerLocal28)}), 2777);
                  }
                  this.nodeDequeState0018.performAction1963(new MixedSupport117(false, this.computeInteger1107(0, integerLocal26, 112), this.computeInteger1102(true, integerLocal26, 0), integerLocal27, MixedSupport009.integerArrayState0015, -4 + integerLocal26, 16 | 7 & integerLocal19, new String[]{" <times> ", Integer.toString(integerLocal26), " = <b>", Integer.toString(integerLocal27)}), 2777);
                }
              }
            }
            integerLocal21 = integerLocal23;
            if (this.integerState0483 >= integerArgument8) {
              stackObjectLocal5 = this;
              stackBucketBoardLocal6 = (BucketBoard) (bucketBoardArgument4);
              stackReturnedShapeCacheLocal7 = (ReturnedShapeCache) (returnedShapeCacheArgument9);
              stackIntegerLocal8 = integerLocal19;
              stackIntegerLocal9 = 0;
              if (this.integerState0483 < 2) {
                stackObjectLocal10 = this;
                stackIntegerLocal11 = integerLocal26;
              } else {
                stackObjectLocal10 = this;
                stackIntegerLocal11 = integerLocal23;
              }
              this.buildCookedFeedbackShape(stackBucketBoardLocal6, stackReturnedShapeCacheLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal11);
            }
          }
          if (!booleanArgument10) {
            for (integerLocal26 = 0; integerLocal26 < integerLocal23; integerLocal26++) {
              integerLocal27 = this.selectedCellIndices[integerLocal26];
              integerLocal28 = this.settledCells[integerLocal27];
              integerLocal32 = integerLocal28 & 268435455;
              if (23 == integerLocal32 ||
                integerLocal32 >> 3 != 2) {
                integerLocal28 = integerLocal28 & 2147483647;
                this.settledCells[integerLocal27] = integerLocal28;
              }
            }
          }
          stackIntegerLocal12 = integerLocal21;
          return stackIntegerLocal12;
        } catch (java.lang.RuntimeException caughtParameterLocal35) {
          caughtExceptionLocal18 = caughtParameterLocal35;
          runtimeExceptionLocal20 = caughtExceptionLocal18;
          stackRuntimeExceptionLocal13 = runtimeExceptionLocal20;
          stackStringBuilderLocal14 = new StringBuilder().append("lk.SA(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (bucketBoardArgument4 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(booleanArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',');
          if (returnedShapeCacheArgument9 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',').append(booleanArgument10).append(',').append(byteArgument11).append(')').toString());
        }
    }

    final void applyControls(int controls, int obfuscationGuard) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int newlyPressedControls;
        int forceDrop;
        int obfuscationControlSnapshot;
        obfuscationControlSnapshot = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (0 == this.pieceWidth) {
          throw new IllegalStateException();
        }
        newlyPressedControls = ~this.previousControls & controls;
        this.previousControls = controls;
        forceDrop = 0;
        if (this.forcedDropCountdown <= 0) {
          forceDrop = 1;
        } else {
          this.forcedDropCountdown = this.forcedDropCountdown - 1;
          if (0 != (1 & newlyPressedControls)) {
            this.moveLeft((byte) -116);
            this.horizontalRepeatTicks = -10;
          } else {
            if ((newlyPressedControls & 2) != 0) {
              this.moveRight(obfuscationGuard ^ -1674843003);
              this.horizontalRepeatTicks = 10;
            }
          }
          if (0 > this.horizontalRepeatTicks) {
            if ((controls & 1) != 0) {
              integerLocal1 = this.horizontalRepeatTicks + 1;
              this.horizontalRepeatTicks = this.horizontalRepeatTicks + 1;
              if (integerLocal1 == 0) {
                this.moveLeft((byte) -116);
                this.horizontalRepeatTicks = -3;
              }
            } else {
              this.horizontalRepeatTicks = 0;
            }
          } else {
            if (this.horizontalRepeatTicks > 0) {
              if ((controls & 2) == 0) {
                this.horizontalRepeatTicks = 0;
              } else {
                integerLocal2 = this.horizontalRepeatTicks - 1;
                this.horizontalRepeatTicks = this.horizontalRepeatTicks - 1;
                if (integerLocal2 == 0) {
                  this.moveRight(4);
                  this.horizontalRepeatTicks = 3;
                }
              }
            }
          }
          if (0 != (newlyPressedControls & 4)) {
            this.rotateCounterClockwise(false);
          }
          if (0 != (16 & controls)) {
            forceDrop = 1;
          }
          if ((8 & newlyPressedControls) != 0) {
            this.rotateClockwise(0);
          }
        }
        if (obfuscationGuard != -1674843007) {
          BucketBoard.computeBoolean1093(50, -101, 127, 94, false, 20, 66);
        }
        if (forceDrop != 0) {
          if (0 != this.forcedDropCountdown &&
            (controls & 16) == 0) {
            forceDrop = 0;
          } else {
            if (this.dropCountdown > 2) {
              if (!this.grounded &&
                this.forcedDropCountdown > 0 &&
                this.dropIntervalTicks == this.dropCountdown &&
                this.getPieceCenterY2(32) == this.deepestPieceCenterY2 &&
                null != this.nodeDequeState0018) {
                this.integerState0493 = this.integerState0493 + 5;
                UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + 5;
                MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 5;
              }
              this.dropCountdown = 2;
            }
          }
        }
        if (this.dropCountdown > 0) {
          this.advanceDropCountdown(30000, -1 + this.dropCountdown, 0);
        }
        return;
    }

    final ReturnedShape computeReturnedShape1104(int integerArgument1) {
        int integerLocal1;
        ReturnedShape returnedShapeLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.performAction1110(0);
        for (integerLocal1 = 0; this.integerState0465 > integerLocal1; integerLocal1++) {
          if (this.returnedShapeArrayState0001[integerLocal1].integerState0692 != 0) {
            continue;
          }
          break;
        }
        if (this.integerState0465 <= integerLocal1) {
          throw new IllegalStateException();
        }
        if (integerArgument1 != -19939) {
          return (ReturnedShape) null;
        }
        returnedShapeLocal2 = this.returnedShapeArrayState0001[integerLocal1];
        returnedShapeLocal2.integerState0692 = returnedShapeLocal2.integerState0692 + 1;
        return returnedShapeLocal2;
    }

    final void performAction1094(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, int integerArgument5, int integerArgument6) {
        int[] integerArrayLocal1 = null;
        int[] integerArrayLocal2 = null;
        int[] integerArrayLocal3 = null;
        int[] integerArrayLocal4 = null;
        int[] integerArrayLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        int integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal12;
        this.pieceY = integerArgument6;
        this.pieceX = integerArgument5;
        for (integerArgument3 = integerArgument1 & -this.integerState0485 + integerArgument3; integerArgument3 > 0; integerArgument3--) {
          integerArrayLocal1 = this.integerArrayState0148;
          integerArrayLocal2 = integerArrayLocal1;
          integerArrayLocal3 = integerArrayLocal2;
          integerArrayLocal4 = integerArrayLocal3;
          if (integerArrayLocal3 == null ||
            this.pieceHeight * this.pieceWidth > integerArrayLocal1.length) {
            integerArrayLocal5 = new int[this.pieceWidth * this.pieceHeight];
            integerArrayLocal4 = integerArrayLocal5;
            this.integerArrayState0148 = integerArrayLocal5;
          }
          integerLocal6 = 0;
          for (integerLocal7 = 0; this.pieceHeight > integerLocal7; integerLocal7++) {
            integerLocal8 = -1 + this.pieceHeight - integerLocal7;
            for (integerLocal9 = 0; this.pieceWidth > integerLocal9; integerLocal9++) {
              previousIntegerLocal10 = integerLocal6;
              integerLocal6++;
              this.integerArrayState0148[integerLocal8] = this.activePieceCells[previousIntegerLocal10];
              integerLocal8 = integerLocal8 + this.pieceHeight;
            }
          }
          integerLocal12 = this.pieceWidth;
          this.pieceWidth = this.pieceHeight;
          this.integerArrayState0148 = this.activePieceCells;
          this.pieceHeight = integerLocal12;
          this.activePieceCells = integerArrayLocal4;
        }
        this.finalizePiecePlacement(integerArgument2, (byte) 126, booleanArgument4);
    }

    final void performAction1095(int integerArgument1, int integerArgument2, ReturnedShape returnedShapeArgument3) {
        int stackIntegerLocal1 = 0;
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
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          this.pieceHeight = returnedShapeArgument3.height;
          this.pieceAcknowledgement = this.pieceAcknowledgement + 1;
          this.pieceWidth = returnedShapeArgument3.width;
          this.integerArrayState0144 = new int[this.pieceWidth * this.pieceHeight];
          this.activePieceCells = new int[this.pieceWidth * this.pieceHeight];
          if (integerArgument1 <= 73) {
            this.performAction1101(false);
          }
          this.integerArrayState0147 = new int[this.pieceWidth * this.pieceHeight];
          for (integerLocal6 = 0; this.pieceHeight * this.pieceWidth > integerLocal6; integerLocal6++) {
            this.activePieceCells[integerLocal6] = MixedSupport079.computeInteger1051(255, (int) returnedShapeArgument3.packedCells[integerLocal6]);
          }
          for (integerLocal14 = 0; this.pieceWidth * this.pieceHeight > integerLocal14; integerLocal14++) {
            this.integerArrayState0144[integerLocal14] = 8;
          }
          this.verticalParity = 0;
          this.horizontalParity = 0;
          if ((1 & (this.pieceWidth ^ this.pieceHeight)) != 0) {
            integerLocal15 = 0;
            integerLocal8 = 0;
            integerLocal9 = 0;
            integerLocal10 = 0;
            for (integerLocal11 = 0; integerLocal11 < this.pieceHeight; integerLocal11++) {
              for (integerLocal12 = 0; integerLocal12 < this.pieceWidth; integerLocal12++) {
                if (0 != this.activePieceCells[integerLocal10]) {
                  integerLocal8 = integerLocal8 + integerLocal11;
                  integerLocal9++;
                  integerLocal15 = integerLocal15 + integerLocal12;
                }
                integerLocal10++;
              }
            }
            integerLocal16 = (-1 + this.pieceWidth) * integerLocal9 >> 1;
            integerLocal17 = integerLocal9 * (this.pieceHeight - 1) >> 1;
            if (-integerLocal17 + integerLocal8 > integerLocal15 - integerLocal16 &&
              integerLocal8 - integerLocal17 > integerLocal16 - integerLocal15) {
              this.verticalParity = 1;
            } else {
              if (integerLocal8 - integerLocal17 < -integerLocal16 + integerLocal15 &&
                -integerLocal17 + integerLocal8 < -integerLocal15 + integerLocal16) {
                this.verticalParity = -1;
              } else {
                if (integerLocal15 < integerLocal16) {
                  this.horizontalParity = -1;
                } else {
                  this.horizontalParity = 1;
                }
              }
            }
          }
          this.horizontalRepeatTicks = 0;
          this.pieceX = -this.pieceWidth + this.boardWidth >> 1;
          this.previousControls = 0;
          this.pieceY = -this.pieceHeight + 1 + this.integerState0473;
          this.dominoDescriptor = integerArgument2;
          this.integerState0485 = 0;
          if (this.dropIntervalTicks >= 2) {
            stackIntegerLocal1 = this.dropIntervalTicks;
          } else {
            stackIntegerLocal1 = 2;
          }
          this.dropCountdown = stackIntegerLocal1;
          this.grounded = false;
          this.forcedDropCountdown = this.computeInteger1116(123);
          this.deepestPieceCenterY2 = this.getPieceCenterY2(32);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal5 = caughtParameterLocal18;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("lk.AA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (returnedShapeArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction1100(ReturnedShape returnedShapeArgument1, byte byteArgument2) {
        ReturnedShape[] returnedShapeArrayLocal1 = null;
        ReturnedShape[] returnedShapeArrayLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.integerState0465 >= this.returnedShapeArrayState0001.length) {
            returnedShapeArrayLocal1 = new ReturnedShape[2 * this.returnedShapeArrayState0001.length];
            returnedShapeArrayLocal2 = returnedShapeArrayLocal1;
            ReturnedShape[] returnedShapeArrayLocal6 = returnedShapeArrayLocal2;
            for (integerLocal3 = 0; integerLocal3 < this.returnedShapeArrayState0001.length; integerLocal3++) {
              returnedShapeArrayLocal1[integerLocal3] = this.returnedShapeArrayState0001[integerLocal3];
            }
            this.returnedShapeArrayState0001 = returnedShapeArrayLocal2;
          }
          if (byteArgument2 > -116) {
            this.verticalParity = 45;
          }
          returnedShapeArgument1.integerState0691 = this.integerState0442;
          this.integerState0442 = this.integerState0442 + 3;
          integerLocal4 = this.integerState0465;
          this.integerState0465 = this.integerState0465 + 1;
          this.returnedShapeArrayState0001[integerLocal4] = returnedShapeArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "lk.O(" + (returnedShapeArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    private final boolean computeBoolean1111(int integerArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
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
        int stackIntegerLocal13;
        int stackIntegerLocal14;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 5) {
          return false;
        }
        if (integerArgument2 != -15303) {
          this.landed = false;
        }
        integerLocal3 = 0;
        while (true) {
          if (integerLocal3 >= 5) {
            return false;
          }
          integerLocal4 = this.selectedCellIndices[integerLocal3];
          integerLocal5 = integerLocal4 % this.boardWidth;
          integerLocal6 = integerLocal4 / this.boardWidth;
          integerLocal7 = 15;
          integerLocal8 = 0;
          scanLoop1: while (true) {
            if (5 > integerLocal8) {
              stackIntegerLocal1 = integerLocal8;
              stackIntegerLocal2 = integerLocal3;
              boolean frameRemainderLocal15 = true;
              if (stackIntegerLocal1 != stackIntegerLocal2) {
                integerLocal9 = this.selectedCellIndices[integerLocal8];
                integerLocal10 = integerLocal9 % this.boardWidth;
                integerLocal10 = integerLocal10 - integerLocal5;
                integerLocal11 = integerLocal9 / this.boardWidth;
                integerLocal11 = integerLocal11 - integerLocal6;
                if (integerLocal11 == 0 && (integerLocal10 == -1 ||
                  integerLocal10 == 1)) {
                  integerLocal7 = integerLocal7 & 3;
                  frameRemainderLocal15 = false;
                }
                else {
                  if (integerLocal10 == 0 && (integerLocal11 == -1 ||
                    integerLocal11 == 1)) {
                    integerLocal7 = integerLocal7 & 12;
                    frameRemainderLocal15 = false;
                  }
                  else {
                    if (-1 == integerLocal10 &&
                      integerLocal11 == -1) {
                      integerLocal7 = integerLocal7 & 5;
                    } else {
                      if (integerLocal10 == 1 &&
                        integerLocal11 == -1) {
                        integerLocal7 = integerLocal7 & 9;
                      } else {
                        if (integerLocal10 == -1 &&
                          integerLocal11 == 1) {
                          integerLocal7 = integerLocal7 & 6;
                        } else {
                          if (integerLocal10 != 1) {
                            break scanLoop1;
                          }
                          if (integerLocal11 != 1) {
                            break scanLoop1;
                          }
                          integerLocal7 = integerLocal7 & 10;
                        }
                      }
                    }
                  }
                }
              }
              integerLocal8++;
              continue;
            }
            stackIntegerLocal13 = -1;
            stackIntegerLocal14 = ~integerLocal7;
            if (stackIntegerLocal13 != stackIntegerLocal14) {
              return true;
            }
            break;
          }
          integerLocal3++;
        }
    }

    final void performAction1115(int integerArgument1) {
        if (integerArgument1 != -9897) {
          this.integerState0460 = 92;
        }
        if (this.pieceWidth > 0 &&
          !this.booleanState0106) {
          this.integerState0460 = this.pieceWidth;
          this.integerState0448 = this.pieceY;
          this.integerState0459 = 1;
          this.integerState0490 = this.pieceHeight;
          this.integerState0479 = this.pieceX;
          this.integerArrayState0145 = this.activePieceCells;
          RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 2, (byte) 127, MixedSupport138.rawSoundState0021);
          this.booleanState0106 = true;
          this.integerState0454 = 0;
          this.integerState0445 = 0;
          this.landed = false;
          this.integerState0491 = 0;
        }
        this.pieceWidth = 0;
    }

    private final void performAction1109(boolean booleanArgument1) {
        int integerLocal1 = -300 + UiComponentPart016.computeInteger0944((byte) 122, 601, UiComponentPart031.randomState0003);
        integerLocal1 = integerLocal1 * (integerLocal1 * integerLocal1) / 90000;
        MixedSupport001.performAction0008(integerLocal1, this.integerState0474 / 4, MixedSupport006.rawSoundState0001, this.integerState0462, 256);
        if (booleanArgument1) {
          this.deepestPieceCenterY2 = -21;
        }
    }

    private final void rotateClockwise(int integerArgument1) {
        if (this.computeBoolean1120(21200)) {
          return;
        }
        if ((this.horizontalParity | this.verticalParity) != integerArgument1) {
          this.verticalParity = -this.verticalParity;
          this.horizontalParity = -this.horizontalParity;
          if (this.computeBoolean1120(integerArgument1 ^ 21200)) {
            return;
          }
          this.verticalParity = -this.verticalParity;
          this.horizontalParity = -this.horizontalParity;
        }
    }

    private final int computeInteger1086(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal4 = this.pieceWidth * this.pieceHeight;
        for (integerLocal1 = 0; integerLocal4 > integerLocal1; integerLocal1++) {
          integerLocal2 = this.activePieceCells[integerLocal1];
          if (0 != integerLocal2) {
            return (integerLocal2 & 24) >> 3;
          }
        }
        if (byteArgument1 < 35) {
          this.activePieceCells = (int[]) null;
          return 0;
        }
        return 0;
    }

    final boolean computeBoolean1118(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        BucketBoard bucketBoardLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = this.boardWidth * this.boardHeight;
        for (integerLocal1 = 0; integerLocal2 > integerLocal1; integerLocal1++) {
          integerLocal3 = this.settledCells[integerLocal1];
          if ((24 & integerLocal3) == 24) {
            integerLocal3 = integerLocal3 & 7;
            if (1 != integerLocal3 &&
              integerLocal3 != 3) {
              return true;
            }
          }
        }
        if (integerArgument1 != -22477) {
          bucketBoardLocal5 = (BucketBoard) null;
          this.performAction1099((ReturnedShapeCache) null, 112, true, (BucketBoard) null);
        }
        return false;
    }

    final static boolean computeBoolean1093(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = -122 / ((integerArgument2 + 36) / 55);
        if (RichTextLayout.computeBoolean0437((byte) 69)) {
          CacheWorkQueue.performAction0836(-93, integerArgument7, booleanArgument5, integerArgument6);
          if (SceneWidget.mixedSupport104State0001 != null &&
            SceneWidget.mixedSupport104State0001.computeBoolean1411(booleanArgument5, integerArgument4, integerArgument1, 0, integerArgument6)) {
            booleanArgument5 = false;
            UiComponentPart031.performAction1811((byte) -78);
          }
          MixedSupport083.performAction1128(booleanArgument5, 0, integerArgument6);
          ResourceArchive.performAction0914(integerArgument3, 0, booleanArgument5);
          booleanArgument5 = false;
        }
        return booleanArgument5;
    }

    final void performAction1101(boolean booleanArgument1) {
        if (booleanArgument1) {
          return;
        }
        this.integerState0491 = 0;
        this.integerState0445 = 0;
        this.booleanState0106 = true;
        this.integerState0454 = 0;
    }

    final void performAction1099(ReturnedShapeCache returnedShapeCacheArgument1, int integerArgument2, boolean booleanArgument3, BucketBoard bucketBoardArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        RawSound stackRawSoundLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        int integerLocal14 = 0;
        RuntimeException runtimeExceptionLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        RawSound rawSoundLocal20 = null;
        int integerLocal21 = 0;
        RawPcmStream rawPcmStreamLocal22 = null;
        RawPcmStream rawPcmStreamLocal23 = null;
        int integerLocal24 = 0;
        RawPcmStream[] rawPcmStreamArrayLocal25 = null;
        int integerLocal26 = 0;
        RawPcmStream rawPcmStreamLocal27 = null;
        int integerLocal28 = 0;
        RawPcmStream rawPcmStreamLocal29 = null;
        RawPcmStream rawPcmStreamLocal30 = null;
        RawPcmStream rawPcmStreamLocal31 = null;
        RawPcmStream rawPcmStreamLocal32 = null;
        RawPcmStream[] rawPcmStreamArrayLocal33;
        RawPcmStream rawPcmStreamLocal34;
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
        int integerLocal45;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        integerLocal28 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport086.integerState0514 = 0;
          if (integerArgument2 <= 124) {
            return;
          }
          boolean frameRemainderLocal52 = true;
          boolean frameRemainderLocal53 = true;
          boolean frameRemainderLocal54 = true;
          MixedSupport026.booleanState0029 = false;
          MixedSupport041.integerState0234 = 0;
          MixedSupport011.booleanState0010 = false;
          UiComponentPart024.booleanState0137 = false;
          integerLocal14 = 0;
          if (1 == this.integerState0467) {
            integerLocal16 = 1;
            for (integerLocal17 = 0; this.boardHeight * this.boardWidth > integerLocal17; integerLocal17++) {
              integerLocal18 = this.settledCells[integerLocal17];
              if (integerLocal18 >= 32) {
                integerLocal18 += 32;
                if (integerLocal18 < 416) {
                  integerLocal16 = 0;
                } else {
                  integerLocal18 = 0;
                }
                integerLocal14 = 1;
                this.settledCells[integerLocal17] = integerLocal18;
              }
            }
            if (integerLocal16 != 0) {
              this.integerState0467 = 0;
              frameRemainderLocal54 = false;
            }
            else {
              frameRemainderLocal52 = (integerLocal14 == 0);
              if ((frameRemainderLocal52) &&
                (frameRemainderLocal52 = !(this.booleanState0111)) &&
                (frameRemainderLocal52 = !(booleanArgument3))) {
                RenderingSupport004.integerState0257 = 2147483647;
                MixedSupport049.integerState0263 = 0;
                integerLocal16 = 0;
                for (integerLocal17 = 0; integerLocal17 < this.boardHeight * this.boardWidth; integerLocal17++) {
                  integerLocal18 = this.computeInteger1103(true, 2, 4, bucketBoardArgument4, true, -1, integerLocal17, 1, returnedShapeCacheArgument1, false, (byte) 71);
                  if (integerLocal18 > 0) {
                    if (this.booleanState0108) {
                      if (this.computeBoolean1089(-101, integerLocal18)) {
                        MixedSupport011.booleanState0010 = true;
                      }
                      if (this.computeBoolean1111(integerLocal18, -15303)) {
                        MixedSupport026.booleanState0029 = true;
                      }
                      if (this.computeBoolean1106(integerLocal18, -1)) {
                        UiComponentPart024.booleanState0137 = true;
                      }
                    }
                    integerLocal16++;
                  }
                }
                frameRemainderLocal53 = false;
              }
            }
          }
          if ((frameRemainderLocal53) &&
            (frameRemainderLocal54) &&
            (frameRemainderLocal52) &&
            (this.integerState0467 == 0)) {
            integerLocal16 = 0;
            integerLocal17 = 0;
            integerLocal18 = -1 + this.boardHeight * this.boardWidth;
            for (integerLocal19 = this.boardHeight - 1; integerLocal19 >= 0; integerLocal19--) {
              for (integerLocal21 = -1 + this.boardWidth; integerLocal21 >= 0; integerLocal21--) {
                boolean frameRemainderLocal55 = true;
                integerLocal24 = this.settledCells[integerLocal18];
                if (integerLocal24 != 0) {
                  if (!booleanArgument3 && (16 == (integerLocal24 & 24) ||
                    (integerLocal24 & 24) == 24) && (integerLocal19 < -1 + this.boardHeight &&
                    this.settledCells[integerLocal18 + this.boardWidth] == 0)) {
                    this.settledCells[integerLocal18 + this.boardWidth] = UiComponentPart006.computeInteger0388(MixedSupport079.computeInteger1051(integerLocal24, 31), 32);
                    this.settledCells[integerLocal18] = 0;
                    integerLocal16++;
                    integerLocal14 = 1;
                    frameRemainderLocal55 = false;
                  }
                  else {
                    if (!booleanArgument3 && ((integerLocal24 & 24) == 16 ||
                      (24 & integerLocal24) == 24) && (this.boardHeight - 1 > integerLocal19 &&
                      integerLocal21 + this.integerState0481 >= 0 &&
                      integerLocal21 + this.integerState0481 < this.boardWidth &&
                      this.settledCells[this.integerState0481 + integerLocal18] == 0 &&
                      this.settledCells[this.boardWidth + integerLocal18 + this.integerState0481] == 0)) {
                      this.settledCells[this.integerState0481 + integerLocal18] = UiComponentPart006.computeInteger0388(MixedSupport079.computeInteger1051(31, integerLocal24), 32);
                      this.settledCells[integerLocal18] = 0;
                      integerLocal14 = 1;
                      integerLocal16++;
                      frameRemainderLocal55 = false;
                    }
                    else {
                      if (!booleanArgument3 && ((integerLocal24 & 24) == 16 ||
                        (integerLocal24 & 24) == 24) && (this.boardHeight - 1 > integerLocal19 &&
                        -this.integerState0481 + integerLocal21 >= 0 &&
                        this.boardWidth > -this.integerState0481 + integerLocal21 &&
                        this.settledCells[-this.integerState0481 + integerLocal18] == 0 &&
                        this.settledCells[-this.integerState0481 + (integerLocal18 + this.boardWidth)] == 0)) {
                        this.settledCells[-this.integerState0481 + integerLocal18] = UiComponentPart006.computeInteger0388(MixedSupport079.computeInteger1051(31, integerLocal24), 32);
                        integerLocal14 = 1;
                        this.settledCells[integerLocal18] = 0;
                        integerLocal16++;
                        frameRemainderLocal55 = false;
                      }
                      else {
                        if (32 <= integerLocal24) {
                          if (booleanArgument3 &&
                            integerLocal24 < 64) {
                            integerLocal24 = integerLocal24 & 31;
                          } else {
                            if (integerLocal24 < 64) {
                              integerLocal17++;
                            }
                            integerLocal24 += 32;
                            if (integerLocal24 >= 448) {
                              integerLocal24 = integerLocal24 & 31;
                            }
                          }
                          this.settledCells[integerLocal18] = integerLocal24;
                          integerLocal14 = 1;
                        }
                      }
                    }
                  }
                }
                integerLocal18--;
              }
            }
            if (this.integerState0481 != 0) {
              stackRawSoundLocal7 = AudioSupport004.rawSoundState0019;
            } else {
              stackRawSoundLocal7 = RenderingSupport001.rawSoundState0003;
            }
            rawSoundLocal20 = stackRawSoundLocal7;
            if (integerLocal16 > 0) {
              MixedSupport105.booleanArrayState0008[this.integerState0453] = true;
              integerLocal43 = (int)(0.5 + (double)this.integerState0446 * Math.sqrt((double)integerLocal16));
              if (4 * this.integerState0446 < integerLocal43) {
                integerLocal43 = 4 * this.integerState0446;
              }
              rawPcmStreamLocal29 = SoftwareFramebuffer.rawPcmStreamArrayState0003[this.integerState0453];
              rawPcmStreamLocal23 = rawPcmStreamLocal29;
              if (rawPcmStreamLocal23 != null) {
                rawPcmStreamLocal29.performAction0507(-1);
              }
              if (rawPcmStreamLocal23 != null &&
                rawPcmStreamLocal29.computeBoolean0156((byte) 93) &&
                rawPcmStreamLocal29.audioSupport006State0001 == rawSoundLocal20) {
                rawPcmStreamLocal23.performAction0483(PcmPlayer.integerState0209 / 50, integerLocal43 * GameDomainSupport005.integerState0578, this.integerState0458 << 6);
              } else {
                if (rawPcmStreamLocal23 != null) {
                  rawPcmStreamLocal29.performAction0510(PcmPlayer.integerState0209 / 50);
                }
                rawPcmStreamLocal30 = RawPcmStream.computeRawPcmStream0498(rawSoundLocal20, 100, integerLocal43 * GameDomainSupport005.integerState0578, this.integerState0458 << 6);
                rawPcmStreamLocal23 = rawPcmStreamLocal30;
                rawPcmStreamLocal30.performAction0507(-1);
                CollectionSupport002.pcmStreamMixerState0001.performAction1190(rawPcmStreamLocal30);
                SoftwareFramebuffer.rawPcmStreamArrayState0003[this.integerState0453] = rawPcmStreamLocal30;
              }
            } else {
              rawPcmStreamLocal22 = SoftwareFramebuffer.rawPcmStreamArrayState0003[this.integerState0453];
              if (rawPcmStreamLocal22 != null) {
                rawPcmStreamLocal22.performAction0510(PcmPlayer.integerState0209 / 50);
                SoftwareFramebuffer.rawPcmStreamArrayState0003[this.integerState0453] = null;
              }
            }
            if (0 < integerLocal17) {
              integerLocal44 = (2 + (int)((double)this.integerState0446 * Math.sqrt((double)integerLocal17))) / 4;
              if (this.integerState0446 < integerLocal44) {
                integerLocal44 = this.integerState0446;
              }
              RenderingSupport003.performAction0631(this.integerState0458, integerLocal44, (byte) 127, MixedSupport011.rawSoundState0004);
            }
            if (integerLocal14 != 0) {
              this.integerState0481 = -this.integerState0481;
            } else {
              this.integerState0467 = 2;
              this.integerState0481 = 0;
            }
          }
          if ((frameRemainderLocal53) && ((frameRemainderLocal52) &&
            (frameRemainderLocal52 = (integerLocal14 == 0)) &&
            (frameRemainderLocal52 = !(this.booleanState0111)) &&
            (frameRemainderLocal52 = !(booleanArgument3)))) {
            RenderingSupport004.integerState0257 = 2147483647;
            MixedSupport049.integerState0263 = 0;
            integerLocal16 = 0;
            for (integerLocal17 = 0; integerLocal17 < this.boardHeight * this.boardWidth; integerLocal17++) {
              integerLocal18 = this.computeInteger1103(true, 2, 4, bucketBoardArgument4, true, -1, integerLocal17, 1, returnedShapeCacheArgument1, false, (byte) 71);
              if (integerLocal18 > 0) {
                if (this.booleanState0108) {
                  if (this.computeBoolean1089(-101, integerLocal18)) {
                    MixedSupport011.booleanState0010 = true;
                  }
                  if (this.computeBoolean1111(integerLocal18, -15303)) {
                    MixedSupport026.booleanState0029 = true;
                  }
                  if (this.computeBoolean1106(integerLocal18, -1)) {
                    UiComponentPart024.booleanState0137 = true;
                  }
                }
                integerLocal16++;
              }
            }
          }
          if (frameRemainderLocal52) {
            this.performAction1096(-99, false, 1);
            if (integerLocal16 > 0) {
              this.integerState0454 = this.integerState0454 + integerLocal16;
              if (integerLocal16 >= 2) {
                integerLocal17 = ((int)((double)this.integerState0446 * Math.sqrt((double)integerLocal16)) + 1) / 2;
                if (this.integerState0446 < integerLocal17) {
                  integerLocal17 = this.integerState0446;
                }
                RenderingSupport003.performAction0631(this.integerState0458, integerLocal17, (byte) 127, RenderingSupport001.rawSoundState0002);
              }
              this.integerState0491 = this.integerState0491 + 1;
              if (this.integerState0491 >= 2) {
                integerLocal17 = (this.integerState0491 - 1) % 4;
                integerLocal18 = (-1 + this.integerState0491) / 4 * 3;
                if (integerLocal17 == 3) {
                  integerLocal18++;
                }
                UiComponentPart001.performAction0063(62, integerLocal18, MixedSupport069.rawSoundArrayState0002[integerLocal17], this.integerState0458, this.integerState0446);
              }
              if (null != this.nodeDequeState0018) {
                integerLocal17 = MixedSupport063.computeInteger0826((byte) 126, integerLocal16);
                integerLocal18 = integerLocal17;
                MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal18;
                UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal18;
                this.integerState0488 = this.integerState0488 + integerLocal17;
                if (0 < integerLocal17) {
                  integerLocal1 = RenderingSupport004.integerState0257;
                  RenderingSupport004.integerState0257 = RenderingSupport004.integerState0257 - 1;
                  this.nodeDequeState0018.performAction1963(new MixedSupport117(true, this.boardWidth * 128, -384 + integerLocal1 * 256, integerLocal17, LoginCredentials.integerArrayState0115, -2 + integerLocal16, 0, new String[]{CollectionSupport001.computeString0336(85, MixedSupport099.stringState0395, new String[]{Integer.toString(integerLocal16)}), " = <b>", Integer.toString(integerLocal17)}), 2777);
                }
                integerLocal18 = MixedSupport080.computeInteger1073(32085, this.integerState0491);
                if (0 < integerLocal18) {
                  integerLocal2 = RenderingSupport004.integerState0257;
                  RenderingSupport004.integerState0257 = RenderingSupport004.integerState0257 - 1;
                  this.mixedSupport117State0001 = new MixedSupport117(true, 128 * this.boardWidth, -384 + integerLocal2 * 256, integerLocal18, TextLineMetrics.integerArrayState0167, this.integerState0491 - 2, 0, new String[]{CollectionSupport001.computeString0336(115, MixedSupport027.stringState0132, new String[]{Integer.toString(this.integerState0491)}), " = <b>", Integer.toString(integerLocal18)});
                }
              }
              integerLocal14 = 1;
            } else {
              this.booleanState0111 = true;
            }
          }
          if (integerLocal14 == 0 &&
            !booleanArgument3) {
            integerLocal16 = 1;
            for (integerLocal17 = 0; integerLocal17 < this.boardHeight * this.boardWidth; integerLocal17++) {
              integerLocal18 = this.settledCells[integerLocal17];
              if (integerLocal18 >= 32 &&
                (integerLocal18 & 31) != 25 &&
                (integerLocal18 & 31) != 27) {
                integerLocal18 += 32;
                if (integerLocal18 < 416) {
                  integerLocal16 = 0;
                } else {
                  integerLocal18 = 0;
                }
                this.settledCells[integerLocal17] = integerLocal18;
                integerLocal14 = 1;
              }
            }
            integerLocal17 = -1 + (-1 + this.boardHeight) * this.boardWidth;
            for (integerLocal18 = this.boardHeight - 2; integerLocal18 >= 0; integerLocal18--) {
              for (integerLocal35 = -1 + this.boardWidth; integerLocal35 >= 0; integerLocal35--) {
                integerLocal37 = this.settledCells[integerLocal17];
                if (integerLocal37 == 25) {
                  discarded$4 = this.computeInteger1103(false, 2, 1, bucketBoardArgument4, false, -2, this.boardWidth + integerLocal17, 3, returnedShapeCacheArgument1, false, (byte) 109);
                  this.performAction1108(-1, this.boardWidth + integerLocal17, false);
                }
                if (27 == integerLocal37) {
                  discarded$5 = this.computeInteger1103(true, 2, 1, bucketBoardArgument4, true, -2, this.boardWidth + integerLocal17, 3, returnedShapeCacheArgument1, false, (byte) -99);
                  this.performAction1108(-1, integerLocal17 + this.boardWidth, false);
                }
                integerLocal17--;
              }
            }
            integerLocal17 = this.boardWidth * (-1 + this.boardHeight) - 1;
            for (integerLocal18 = -2 + this.boardHeight; integerLocal18 >= 0; integerLocal18--) {
              for (integerLocal45 = -1 + this.boardWidth; integerLocal45 >= 0; integerLocal45--) {
                integerLocal48 = this.settledCells[integerLocal17];
                if (integerLocal48 == 25 &&
                  (this.settledCells[integerLocal17 + this.boardWidth] & 1879048192) == 0) {
                  discarded$2 = this.computeInteger1103(false, 1, 1, bucketBoardArgument4, false, -1, integerLocal17 + this.boardWidth, 3, returnedShapeCacheArgument1, false, (byte) 123);
                }
                if (integerLocal48 == 27 &&
                  0 == (this.settledCells[this.boardWidth + integerLocal17] & 1879048192)) {
                  discarded$3 = this.computeInteger1103(false, 1, 1, bucketBoardArgument4, true, -1, this.boardWidth + integerLocal17, 3, returnedShapeCacheArgument1, false, (byte) 72);
                }
                integerLocal17--;
              }
            }
            this.performAction1096(-121, false, 2);
            integerLocal18 = 0;
            integerLocal17 = -1 + this.boardWidth * this.boardHeight;
            integerLocal46 = 0;
            for (integerLocal49 = -1 + this.boardHeight; integerLocal49 >= 0; integerLocal49--) {
              for (integerLocal39 = this.boardWidth - 1; integerLocal39 >= 0; integerLocal39--) {
                integerLocal26 = this.settledCells[integerLocal17];
                if ((31 & integerLocal26) == 25 ||
                  27 == (integerLocal26 & 31)) {
                  integerLocal14 = 1;
                  if (32 > integerLocal26) {
                    if (-1 + this.boardHeight > integerLocal49) {
                      this.settledCells[integerLocal17 + this.boardWidth] = integerLocal26;
                    }
                    this.settledCells[integerLocal17] = integerLocal26 + 32;
                    integerLocal16 = 0;
                    if ((7 & integerLocal26) == 3) {
                      integerLocal46++;
                    } else {
                      integerLocal18++;
                    }
                  } else {
                    integerLocal26 += 32;
                    if (integerLocal26 < 416) {
                      integerLocal16 = 0;
                    } else {
                      integerLocal26 = 0;
                    }
                    this.settledCells[integerLocal17] = integerLocal26;
                  }
                }
                integerLocal17--;
              }
            }
            if (0 < integerLocal18) {
              integerLocal50 = RenderingSupport007.integerArrayArrayState0015[0][this.integerState0453];
              rawPcmStreamArrayLocal25 = MixedSupport121.rawPcmStreamArrayArrayState0001[0];
              integerLocal41 = (1 + (int)((double)this.integerState0446 * Math.sqrt((double)integerLocal18))) / 2;
              if (integerLocal41 > this.integerState0446) {
                integerLocal41 = this.integerState0446;
              }
              if (integerLocal41 < integerLocal50) {
                integerLocal41 = integerLocal50;
              }
              RenderingSupport007.integerArrayArrayState0015[0][this.integerState0453] = integerLocal41;
              rawPcmStreamLocal27 = rawPcmStreamArrayLocal25[this.integerState0453];
              if (rawPcmStreamLocal27 == null) {
                rawPcmStreamLocal31 = RawPcmStream.computeRawPcmStream0498(MixedSupport095.rawSoundState0015, 100, GameDomainSupport005.integerState0578 * integerLocal41, this.integerState0458 << 6);
                rawPcmStreamLocal31.performAction0507(-1);
                CollectionSupport002.pcmStreamMixerState0001.performAction1190(rawPcmStreamLocal31);
                rawPcmStreamArrayLocal25[this.integerState0453] = rawPcmStreamLocal31;
              } else {
                rawPcmStreamLocal27.performAction0483(PcmPlayer.integerState0209 / 50, integerLocal41 * GameDomainSupport005.integerState0578, this.integerState0458 << 6);
              }
            }
            if (0 < integerLocal46) {
              integerLocal51 = RenderingSupport007.integerArrayArrayState0015[1][this.integerState0453];
              rawPcmStreamArrayLocal33 = MixedSupport121.rawPcmStreamArrayArrayState0001[1];
              integerLocal42 = (1 + (int)((double)this.integerState0446 * Math.sqrt((double)integerLocal46))) / 2;
              if (this.integerState0446 < integerLocal42) {
                integerLocal42 = this.integerState0446;
              }
              if (integerLocal42 < integerLocal51) {
                integerLocal42 = integerLocal51;
              }
              RenderingSupport007.integerArrayArrayState0015[1][this.integerState0453] = integerLocal42;
              rawPcmStreamLocal34 = rawPcmStreamArrayLocal33[this.integerState0453];
              if (rawPcmStreamLocal34 == null) {
                rawPcmStreamLocal32 = RawPcmStream.computeRawPcmStream0498(MixedSupport095.rawSoundState0015, 120, integerLocal42 * GameDomainSupport005.integerState0578, this.integerState0458 << 6);
                rawPcmStreamLocal32.performAction0507(-1);
                CollectionSupport002.pcmStreamMixerState0001.performAction1190(rawPcmStreamLocal32);
                rawPcmStreamArrayLocal33[this.integerState0453] = rawPcmStreamLocal32;
              } else {
                rawPcmStreamLocal34.performAction0483(PcmPlayer.integerState0209 / 50, GameDomainSupport005.integerState0578 * integerLocal42, this.integerState0458 << 6);
              }
            }
            if (integerLocal14 != 0 &&
              integerLocal16 != 0) {
              this.integerState0467 = 0;
              this.booleanState0111 = false;
            }
          }
          if (!booleanArgument3 &&
            this.integerState0468 != 0) {
            integerLocal16 = this.integerState0468;
            this.integerState0468 = 0;
            integerLocal17 = 0;
            for (integerLocal18 = 0; this.boardHeight * this.boardWidth > integerLocal18; integerLocal18++) {
              integerLocal36 = this.settledCells[integerLocal18];
              integerLocal38 = integerLocal36 >> 3;
              if (2 == integerLocal38 ||
                integerLocal38 == 1) {
                integerLocal40 = 1 << (7 & integerLocal36);
                if (0 != (integerLocal16 & integerLocal40)) {
                  integerLocal17 = integerLocal17 + this.computeInteger1103(true, integerLocal38, 1, bucketBoardArgument4, false, -1, integerLocal18, 3, returnedShapeCacheArgument1, true, (byte) -72);
                }
              }
            }
            this.performAction1096(-107, true, this.integerState0467);
            if (integerLocal17 > 0) {
              integerLocal14 = 1;
              if (null != this.nodeDequeState0018) {
                integerLocal18 = RenderingSupport004.computeInteger0642(integerLocal17, 27935);
                integerLocal47 = integerLocal18;
                UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal47;
                MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal47;
                this.integerState0475 = this.integerState0475 + integerLocal18;
                this.nodeDequeState0018.performAction1963(new MixedSupport117(true, this.boardWidth * 128, this.boardWidth * -32, integerLocal18, NetworkSupport008.integerArrayState0176, -1 + MixedSupport051.computeInteger0667(integerLocal16, 63), 26, new String[]{" = <b>", Integer.toString(integerLocal18)}), 2777);
              }
            }
          }
          if (!booleanArgument3 && (this.booleanState0103 ||
            this.booleanState0105)) {
            for (integerLocal16 = 0; this.boardWidth * this.boardHeight > integerLocal16; integerLocal16++) {
              integerLocal17 = this.settledCells[integerLocal16];
              if (integerLocal17 != 23 && (this.booleanState0103 &&
                integerLocal17 >> 3 == 1 ||
                this.booleanState0105 &&
                integerLocal17 >> 3 == 2)) {
                this.settledCells[integerLocal16] = MixedSupport111.computeInteger1576(24, integerLocal17);
              }
            }
            if (this.booleanState0103) {
              this.booleanState0110 = true;
              RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446, (byte) 127, MixedSupport040.rawSoundState0008);
            }
            if (this.booleanState0105) {
              RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446, (byte) 127, SceneWidget.rawSoundState0022);
            }
            this.booleanState0105 = false;
            this.booleanState0103 = false;
          }
          if (this.integerArrayState0145 != null) {
            this.integerState0459 = this.integerState0459 + 1;
            if (13 == this.integerState0459) {
              this.integerArrayState0145 = null;
            }
          }
          if (!booleanArgument3 &&
            integerLocal14 == 0 &&
            null == this.integerArrayState0145 &&
            this.livesRemaining > 0 &&
            this.integerState0484 != this.integerState0473) {
            RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446, (byte) 127, MixedSupport108.rawSoundState0018);
            for (integerLocal16 = this.integerState0473; integerLocal16 < this.integerState0484; integerLocal16++) {
              for (integerLocal17 = 0; integerLocal17 < this.boardWidth; integerLocal17++) {
                integerLocal18 = this.settledCells[integerLocal16 * this.boardWidth + integerLocal17];
                if (integerLocal18 != 0) {
                  this.settledCells[integerLocal16 * this.boardWidth + integerLocal17] = 32 + integerLocal18;
                  this.integerState0467 = 1;
                }
              }
            }
            this.pieceY = this.pieceY + (this.integerState0484 - this.integerState0473);
            integerLocal14 = 1;
            this.integerState0473 = this.integerState0484;
          }
          if (integerLocal14 == 0 &&
            this.integerArrayState0145 == null) {
            if (booleanArgument3) {
              return;
            }
            this.booleanState0106 = false;
            this.booleanState0111 = false;
            this.integerState0467 = 0;
            this.booleanState0110 = false;
            if (this.nodeDequeState0018 != null &&
              this.mixedSupport117State0001 != null) {
              this.integerState0450 = this.integerState0450 + this.mixedSupport117State0001.integerState0730;
              integerLocal16 = this.mixedSupport117State0001.integerState0730;
              MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + integerLocal16;
              UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + integerLocal16;
              this.nodeDequeState0018.performAction1963(this.mixedSupport117State0001, 2777);
              this.mixedSupport117State0001 = null;
            }
            if (this.pieceCollides((byte) -117)) {
              this.pieceY = this.pieceY - 1;
            }
            this.deepestPieceCenterY2 = this.getPieceCenterY2(32);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal56) {
          caughtExceptionLocal13 = caughtParameterLocal56;
          runtimeExceptionLocal15 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal15;
          stackStringBuilderLocal9 = new StringBuilder().append("lk.WA(");
          if (returnedShapeCacheArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(',');
          if (bucketBoardArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    public static void performAction1114(int integerArgument1) {
        if (integerArgument1 < 35) {
          BitmapFont bitmapFontLocal1 = (BitmapFont) null;
          BucketBoard.performAction1098((BitmapFont) null, true, (BitmapFont) null, -73);
        }
        stringState0336 = null;
    }

    private final void moveLeft(byte byteArgument1) {
        this.pieceX = this.pieceX - 1;
        if (this.pieceCollides((byte) -117)) {
          this.pieceX = this.pieceX + 1;
        } else {
          this.updateGroundedAfterMovement(byteArgument1 + 115);
          RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 4, (byte) 127, InputAdapter003.rawSoundState0009);
        }
        if (byteArgument1 != -116) {
          this.integerState0450 = 63;
        }
    }

    private final void performAction1110(int integerArgument1) {
        if (integerArgument1 != 0) {
          this.integerState0496 = -32;
        }
        RenderingSupport003.performAction0631(this.integerState0462, this.integerState0474 / 8, (byte) 127, MixedSupport138.rawSoundState0021);
    }

    private final ReturnedShape computeReturnedShape1119(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.integerState0465 <= 0) {
          throw new IllegalStateException();
        }
        ReturnedShape returnedShapeLocal3 = this.returnedShapeArrayState0001[0];
        for (integerLocal1 = 1; this.integerState0465 > integerLocal1; integerLocal1++) {
          this.returnedShapeArrayState0001[-1 + integerLocal1] = this.returnedShapeArrayState0001[integerLocal1];
        }
        this.integerState0476 = this.integerState0476 + 1;
        if (integerArgument1 <= 121) {
          return (ReturnedShape) null;
        }
        this.integerState0465 = this.integerState0465 - 1;
        return returnedShapeLocal3;
    }

    final void decodeMultiplayerSnapshot(boolean booleanArgument1, PacketBuffer packet, byte byteArgument3) {
        boolean stackBooleanLocal1 = false;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal7 = packet.computeInteger2089(3);
          stackBooleanLocal1 = ((integerLocal7 & 256) != 0);
          this.booleanState0106 = stackBooleanLocal1;
          this.integerState0485 = (1616 & integerLocal7) >> 9;
          this.verticalParity = (-1073741824 & integerLocal7 << 27) >> 30;
          stackBooleanLocal2 = (0 != (64 & integerLocal7));
          this.grounded = stackBooleanLocal2;
          if ((32 & integerLocal7) == 0) {
            this.integerState0467 = 1;
          } else {
            this.integerState0467 = 0;
          }
          this.horizontalParity = (-1073741824 & integerLocal7 << 29) >> 30;
          this.livesRemaining = packet.computeInteger2085((byte) -74);
          if (booleanArgument1) {
            for (integerLocal9 = this.livesRemaining; 3 > integerLocal9; integerLocal9++) {
              UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 + 30000;
              MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 30000;
            }
          }
          for (integerLocal13 = 0; this.boardHeight * this.boardWidth > integerLocal13; integerLocal13++) {
            integerLocal10 = packet.computeInteger2085((byte) -40);
            if (integerLocal10 >= 128) {
              integerLocal11 = packet.computeInteger2085((byte) -102);
              integerLocal10 = 127 & integerLocal10 | integerLocal11 << 7;
            }
            this.settledCells[integerLocal13] = integerLocal10;
          }
          this.pieceAcknowledgement = packet.computeInteger2085((byte) -71);
          this.pieceWidth = packet.computeInteger2085((byte) -38);
          this.pieceHeight = packet.computeInteger2085((byte) -39);
          this.activePieceCells = new int[this.pieceWidth * this.pieceHeight];
          this.integerArrayState0144 = new int[this.pieceWidth * this.pieceHeight];
          this.integerArrayState0147 = new int[this.pieceHeight * this.pieceWidth];
          for (integerLocal14 = 0; integerLocal14 < this.pieceWidth * this.pieceHeight; integerLocal14++) {
            this.activePieceCells[integerLocal14] = packet.computeInteger2085((byte) -42);
          }
          for (integerLocal15 = 0; this.pieceWidth * this.pieceHeight > integerLocal15; integerLocal15++) {
            this.integerArrayState0144[integerLocal15] = 8;
          }
          this.pieceX = packet.computeByte2093((byte) -123);
          this.pieceY = packet.computeByte2093((byte) -84);
          this.dropCountdown = packet.computeInteger2085((byte) -45);
          this.forcedDropCountdown = packet.computeInteger2089(3);
          this.previousControls = packet.computeInteger2085((byte) -104);
          this.horizontalRepeatTicks = packet.computeByte2093((byte) -122);
          this.dominoDescriptor = packet.computeInteger2085((byte) -102);
          if (byteArgument3 < 116) {
            this.performAction1096(84, false, 99);
          }
          this.integerState0454 = packet.computeInteger2085((byte) -52);
          this.integerState0473 = packet.computeInteger2085((byte) -100);
          this.landed = false;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal6 = caughtParameterLocal16;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("lk.JA(").append(booleanArgument1).append(',');
          if (packet == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument3).append(')').toString());
        }
    }

    private final int getPieceCenterY2(int integerArgument1) {
        if (integerArgument1 != 32) {
          stringState0336 = (String) null;
        }
        return this.verticalParity + this.pieceHeight + 2 * this.pieceY;
    }

    private final void recordDeepestPiecePosition(int integerArgument1) {
        int integerLocal1 = this.getPieceCenterY2(32);
        if (this.deepestPieceCenterY2 < integerLocal1) {
          this.deepestPieceCenterY2 = integerLocal1;
        }
        if (integerArgument1 != 30968) {
          BucketBoard bucketBoardLocal2 = (BucketBoard) null;
          this.performAction1099((ReturnedShapeCache) null, -76, false, (BucketBoard) null);
        }
    }

    private final int computeInteger1092(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int previousIntegerLocal1 = 0;
        if (integerArgument2 <= 123) {
          this.integerState0496 = -105;
        }
        int integerLocal2 = this.settledCells[integerArgument1];
        if ((-1879048193 & integerLocal2) == integerArgument5 ||
          (integerLocal2 & -1879048193) == integerArgument3) {
          previousIntegerLocal1 = integerArgument4;
          integerArgument4++;
          this.selectedCellIndices[previousIntegerLocal1] = integerArgument1;
          this.settledCells[integerArgument1] = integerLocal2 + -2147483648;
        }
        return integerArgument4;
    }

    private final void performAction1108(int integerArgument1, int integerArgument2, boolean booleanArgument3) {
        int integerLocal1;
        integerLocal1 = this.settledCells[integerArgument2];
        if (booleanArgument3) {
          return;
        }
        if (24 == (-1879048200 & integerLocal1)) {
          if (1 == (7 & integerLocal1)) {
            return;
          }
          if ((7 & integerLocal1) == 3) {
            return;
          }
          if ((integerLocal1 & -1879048193) == 24 &&
            0 == this.integerState0481) {
            this.integerState0481 = 1;
            RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 2, (byte) 127, NetworkSupport010.rawSoundState0017);
          }
          if ((integerLocal1 & -1879048193) == 29) {
            this.booleanState0105 = true;
          }
          if ((integerLocal1 & -1879048193) == 26 &&
            integerArgument1 >= 0) {
            this.integerState0468 = this.integerState0468 | 1 << integerArgument1;
          }
          if ((-1879048193 & integerLocal1) == 28) {
            this.booleanState0103 = true;
          }
          if ((1879048192 & integerLocal1) == 0) {
            this.settledCells[integerArgument2] = 268435456 + integerLocal1;
            if (this.nodeDequeState0018 != null) {
              UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + 2000;
              MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 2000;
              this.integerState0494 = this.integerState0494 + 2000;
              this.nodeDequeState0018.performAction1963(new MixedSupport117(true, 128 + 256 * (integerArgument2 % this.boardWidth), integerArgument2 / this.boardWidth * 256 + 128, 2000, (int[]) null, 13684944, integerLocal1, new String[]{" = <b>", Integer.toString(2000)}), 2777);
            }
          }
        }
    }

    private final boolean computeBoolean1123(int integerArgument1) {
        int[] integerArrayLocal1 = null;
        int previousIntegerLocal2 = 0;
        int integerLocal3 = 0;
        int[] integerArrayLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int[] integerArrayLocal10;
        int[] integerArrayLocal11;
        int[] integerArrayLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerArrayLocal12 = this.integerArrayState0148;
        integerArrayLocal11 = integerArrayLocal12;
        integerArrayLocal10 = integerArrayLocal11;
        integerArrayLocal4 = integerArrayLocal10;
        if (integerArrayLocal10 == null ||
          integerArrayLocal12.length < this.pieceWidth * this.pieceHeight) {
          integerArrayLocal1 = new int[this.pieceWidth * this.pieceHeight];
          integerArrayLocal4 = integerArrayLocal1;
          this.integerArrayState0148 = integerArrayLocal1;
        }
        integerLocal5 = integerArgument1;
        for (integerLocal6 = 0; this.pieceHeight > integerLocal6; integerLocal6++) {
          integerLocal7 = (-1 + this.pieceWidth) * this.pieceHeight + integerLocal6;
          for (integerLocal8 = 0; integerLocal8 < this.pieceWidth; integerLocal8++) {
            previousIntegerLocal2 = integerLocal5;
            integerLocal5++;
            this.integerArrayState0148[integerLocal7] = this.activePieceCells[previousIntegerLocal2];
            integerLocal7 = integerLocal7 - this.pieceHeight;
          }
        }
        integerLocal16 = -this.verticalParity - this.pieceHeight + (this.pieceWidth + this.horizontalParity) >> 1;
        this.pieceX = this.pieceX + integerLocal16;
        integerLocal17 = this.verticalParity + this.horizontalParity + (-this.pieceWidth + this.pieceHeight) >> 1;
        this.pieceY = this.pieceY + integerLocal17;
        integerLocal13 = this.pieceWidth;
        this.pieceWidth = this.pieceHeight;
        this.pieceHeight = integerLocal13;
        this.integerArrayState0148 = this.activePieceCells;
        this.activePieceCells = integerArrayLocal4;
        if (this.pieceCollides((byte) -117)) {
          this.activePieceCells = this.integerArrayState0148;
          this.pieceHeight = this.pieceWidth;
          this.integerArrayState0148 = integerArrayLocal4;
          this.pieceY = this.pieceY - integerLocal17;
          this.pieceX = this.pieceX - integerLocal16;
          this.pieceWidth = integerLocal13;
          return false;
        }
        this.integerState0485 = this.integerState0485 - 1;
        integerLocal14 = this.horizontalParity;
        this.horizontalParity = this.verticalParity;
        this.verticalParity = -integerLocal14;
        this.recordDeepestPiecePosition(30968);
        integerLocal15 = 0;
        this.updateGroundedAfterMovement(~integerArgument1);
        for (integerLocal18 = 0; this.pieceHeight > integerLocal18; integerLocal18++) {
          for (integerLocal3 = 0; integerLocal3 < this.pieceWidth; integerLocal3++) {
            this.integerArrayState0147[integerLocal15] = 0;
            this.integerArrayState0144[integerLocal15] = 8 * (-1 - integerLocal3 * 2 + this.horizontalParity + this.pieceWidth) / this.pieceWidth;
            integerLocal15++;
          }
        }
        RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 4, (byte) 127, UiComponentPart014.rawSoundState0010);
        return true;
    }

    final int computeInteger1088(int integerArgument1, byte byteArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4;
        if (0 != this.pieceWidth &&
          !this.booleanState0106) {
          integerLocal3 = integerArgument3 - this.pieceX;
          integerLocal1 = -this.pieceY + integerArgument1;
          if (integerLocal3 >= 0 &&
            integerLocal1 >= 0 &&
            this.pieceWidth > integerLocal3) {
            if (integerLocal1 >= this.pieceHeight) {
              integerLocal3 = 119 / ((45 - byteArgument2) / 37);
              return 0;
            }
            integerLocal2 = integerLocal1 * this.pieceWidth + integerLocal3;
            if (this.activePieceCells[integerLocal2] != 0) {
              return this.integerArrayState0147[integerLocal2];
            }
          }
        }
        integerLocal4 = 119 / ((45 - byteArgument2) / 37);
        return 0;
    }

    private final int computeInteger1107(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int discarded$0 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal5 = 0;
        for (integerLocal1 = integerArgument1; integerLocal1 < integerArgument2; integerLocal1++) {
          integerLocal2 = this.selectedCellIndices[integerLocal1];
          integerLocal5 = integerLocal5 + integerLocal2 % this.boardWidth;
        }
        if (integerArgument3 <= 49) {
          discarded$0 = this.computeInteger1086((byte) -117);
        }
        return 128 + integerLocal5 * 256 / (-integerArgument1 + integerArgument2);
    }

    final int computeInteger1121(int integerArgument1) {
        if (integerArgument1 != 3837) {
          return -4;
        }
        if (0 > this.pieceY) {
          return this.pieceY;
        }
        return 0;
    }

    private final boolean tryDropAndReportCollision(byte byteArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3;
        this.pieceY = this.pieceY + 1;
        if (this.pieceCollides((byte) -117)) {
          this.pieceY = this.pieceY - 1;
          return true;
        }
        this.recordDeepestPiecePosition(30968);
        if (booleanArgument2) {
          integerLocal1 = this.computeInteger1086((byte) 103);
          if (integerLocal1 != 1) {
            RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 4, (byte) 127, MixedSupport105.rawSoundState0016);
          } else {
            RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 8, (byte) 127, DekoBlokoClient.rawSoundState0005);
          }
        }
        int integerLocal4 = 0;
        integerLocal3 = integerLocal4;
        while (this.pieceHeight * this.pieceWidth > integerLocal4) {
          this.integerArrayState0147[integerLocal4] = 0;
          this.integerArrayState0144[integerLocal4] = 8;
          integerLocal4++;
        }
        if (byteArgument1 >= -27) {
          this.finalizePiecePlacement(-71, (byte) 28, false);
        }
        return false;
    }

    private final boolean pieceCollides(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal3 = 0;
        integerLocal4 = this.pieceX + this.pieceY * this.boardWidth;
        for (integerLocal1 = 0; integerLocal1 < this.pieceHeight; integerLocal1++) {
          for (integerLocal2 = 0; this.pieceWidth > integerLocal2; integerLocal2++) {
            boolean frameRemainderLocal6 = true;
            if (this.activePieceCells[integerLocal3] != 0) {
              if (this.pieceX + integerLocal2 >= 0 &&
                this.boardWidth > this.pieceX + integerLocal2) {
                if (this.pieceY + integerLocal1 >= this.boardHeight) {
                  return true;
                }
                if ((!(integerLocal1 + this.pieceY < 0)) &&
                  (this.settledCells[integerLocal4] != 0)) {
                  return true;
                }
                frameRemainderLocal6 = false;
              }
              else {
                return true;
              }
            }
            integerLocal3++;
            integerLocal4++;
          }
          integerLocal4 = integerLocal4 + (this.boardWidth - this.pieceWidth);
        }
        if (byteArgument1 == -117) {
          return false;
        }
        return true;
    }

    final int computeInteger1105(int integerArgument1, byte byteArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        if (byteArgument2 <= 102) {
          return -33;
        }
        if (this.integerArrayState0145 != null) {
          integerLocal1 = -this.integerState0479 + integerArgument1;
          integerLocal2 = -this.integerState0448 + integerArgument3;
          if (integerLocal1 >= 0 &&
            integerLocal2 >= 0 &&
            integerLocal1 < this.integerState0460 &&
            integerLocal2 < this.integerState0490) {
            integerLocal3 = this.integerArrayState0145[integerLocal2 * this.integerState0460 + integerLocal1];
            if (integerLocal3 != 0) {
              integerLocal4 = this.integerState0459;
            }
          }
        }
        return integerLocal4;
    }

    final void finalizePiecePlacement(int integerArgument1, byte byteArgument2, boolean booleanArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = 0;
        integerLocal2 = -97 % ((83 - byteArgument2) / 37);
        while (this.pieceWidth * this.pieceHeight > integerLocal1) {
          if (this.activePieceCells[integerLocal1] != 0) {
            this.integerState0478 = this.integerState0478 + 1;
          }
          integerLocal1++;
        }
        this.integerState0484 = integerArgument1;
        if (this.integerState0473 <= this.pieceY) {
          integerLocal9 = 0;
          integerLocal8 = this.pieceY * this.boardWidth + this.pieceX;
          integerLocal3 = 0;
          for (integerLocal4 = 0; integerLocal4 < this.pieceHeight; integerLocal4++) {
            for (integerLocal5 = 0; integerLocal5 < this.pieceWidth; integerLocal5++) {
              integerLocal6 = this.activePieceCells[integerLocal9];
              if (integerLocal6 != 0) {
                if ((24 & integerLocal6) == 16 ||
                  integerLocal4 == 0 ||
                  this.activePieceCells[-this.pieceWidth + integerLocal9] == 0) {
                  integerLocal6 = integerLocal6 | 32;
                }
                this.settledCells[integerLocal8] = integerLocal6;
                if ((24 & integerLocal6) == 16 &&
                  this.nodeDequeState0018 != null) {
                  this.integerState0466 = this.integerState0466 + 25;
                  MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 25;
                  UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + 25;
                }
                if (8 == (24 & integerLocal6)) {
                  integerLocal3++;
                }
              }
              integerLocal8++;
              integerLocal9++;
            }
            integerLocal8 = integerLocal8 + (this.boardWidth - this.pieceWidth);
          }
          if (0 < integerLocal3) {
            integerLocal4 = ((int)((double)this.integerState0446 * Math.sqrt((double)integerLocal3)) + 4) / 8;
            if (integerLocal4 > this.integerState0446) {
              integerLocal4 = this.integerState0446;
            }
            RenderingSupport003.performAction0631(this.integerState0458, integerLocal4, (byte) 127, MixedSupport039.rawSoundState0007);
          }
        } else {
          this.livesRemaining = this.livesRemaining - 1;
          if (booleanArgument3) {
            MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 30000;
            UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 + 30000;
          }
          if (this.livesRemaining <= 0) {
            this.performAction1115(-9897);
            return;
          }
          this.integerState0448 = this.pieceY;
          this.integerState0460 = this.pieceWidth;
          this.integerState0479 = this.pieceX;
          this.integerState0490 = this.pieceHeight;
          integerLocal9 = this.integerState0460 * this.integerState0490;
          this.integerArrayState0145 = new int[integerLocal9];
          integerLocal8 = integerLocal9;
          for (integerLocal3 = -1 + (this.pieceY + this.pieceHeight); this.pieceY <= integerLocal3; integerLocal3--) {
            for (integerLocal4 = -1 + (this.pieceX + this.pieceWidth); this.pieceX <= integerLocal4; integerLocal4--) {
              integerLocal8--;
              integerLocal5 = this.activePieceCells[integerLocal8];
              if ((24 & integerLocal5) != 16 &&
                24 != (integerLocal5 & 24)) {
                this.integerArrayState0145[integerLocal8] = integerLocal5;
              } else {
                integerLocal6 = integerLocal3;
                if (integerLocal6 < this.integerState0473) {
                  integerLocal6 = this.integerState0473;
                }
                if (this.boardHeight > integerLocal6 &&
                  this.settledCells[integerLocal4 + this.boardWidth * integerLocal6] == 0) {
                  this.settledCells[integerLocal4 + this.boardWidth * integerLocal6] = 32 + integerLocal5;
                  if (16 == (integerLocal5 & 24) &&
                    this.nodeDequeState0018 != null) {
                    MixedSupport035.integerState0220 = MixedSupport035.integerState0220 + 25;
                    UiComponentPart013.integerState0275 = UiComponentPart013.integerState0275 + 25;
                    this.integerState0466 = this.integerState0466 + 25;
                  }
                } else {
                  this.integerArrayState0145[integerLocal8] = integerLocal5;
                }
              }
            }
          }
          this.integerState0459 = 1;
          RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 2, (byte) 127, MixedSupport138.rawSoundState0021);
        }
        this.integerState0445 = 0;
        this.booleanState0106 = true;
        this.landed = false;
        this.integerState0491 = 0;
        this.integerState0454 = 0;
        this.pieceWidth = 0;
    }

    final static void performAction1098(BitmapFont bitmapFontArgument1, boolean booleanArgument2, BitmapFont bitmapFontArgument3, int integerArgument4) {
        try {
          UiComponentPart028.bitmapFontState0019 = bitmapFontArgument3;
          MixedSupport098.integerState0568 = integerArgument4;
          MixedSupport010.bitmapFontState0005 = bitmapFontArgument1;
          ResourceSupport004.performAction1426(31004, SoftwareRaster.integerState0285 / 2, SoftwareRaster.integerState0284 / 2);
          SceneWidgetPart010.performAction1662(bitmapFontArgument3.integerState0517, bitmapFontArgument1.integerState0523 + bitmapFontArgument1.integerState0517, (byte) -91, bitmapFontArgument1.integerState0517, bitmapFontArgument3.integerState0517 + bitmapFontArgument3.integerState0523);
          if (!booleanArgument2) {
            stringState0336 = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "lk.HA(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ',' + (bitmapFontArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ')');
        }
    }

    private final boolean computeBoolean1106(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        boolean stackBooleanLocal6 = false;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal2 = 0;
        integerLocal3 = 0;
        for (integerLocal1 = 0; integerLocal1 < integerArgument1; integerLocal1++) {
          integerLocal4 = this.selectedCellIndices[integerLocal1];
          if (integerLocal4 < this.boardWidth) {
            integerLocal2 = 1;
          }
          if (this.boardWidth * (this.boardHeight - 1) <= integerLocal4) {
            integerLocal3 = 1;
          }
        }
        if (integerArgument2 != -1) {
          return true;
        }
        stackBooleanLocal6 = (integerLocal2 != 0) && (integerLocal3 != 0);
        return stackBooleanLocal6;
    }

    private final void advanceDropCountdown(int obfuscationGuard, int countdown, int stepsDropped) {
        int integerLocal1;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        int integerLocal4;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 30000) {
          this.boardWidth = -79;
        }
        this.dropCountdown = countdown;
        while (countdown == 0) {
          if (this.grounded) {
            this.landed = true;
          } else {
            stackIntegerLocal2 = -126;
            stackBooleanLocal3 = (0 == stepsDropped);
            if (!this.tryDropAndReportCollision((byte) stackIntegerLocal2, stackBooleanLocal3)) {
              stepsDropped++;
              countdown = this.dropIntervalTicks;
              this.dropCountdown = this.dropIntervalTicks;
              continue;
            }
            this.dropCountdown = 20;
            this.grounded = true;
          }
          break;
        }
        if (this.dropIntervalTicks == 0 &&
          stepsDropped > 0) {
          integerLocal4 = ((int)((double)this.integerState0446 * Math.sqrt((double)(this.boardHeight + stepsDropped) / ((double)this.boardHeight * 2.0))) + 4) / 8;
          if (integerLocal4 > this.integerState0446) {
            integerLocal4 = this.integerState0446;
          }
          RenderingSupport003.performAction0631(this.integerState0458, integerLocal4, (byte) 127, MixedSupport039.rawSoundState0007);
        }
    }

    final boolean computeBoolean1112(int integerArgument1) {
        int integerLocal1 = -106 % ((integerArgument1 + 22) / 51);
        if (this.integerState0465 > 0 &&
          this.returnedShapeArrayState0001[0].integerState0691 == 0) {
          return true;
        }
        if (this.integerState0496 >= 18) {
          return true;
        }
        return false;
    }

    private final boolean computeBoolean1089(int integerArgument1, int integerArgument2) {
        int discarded$1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (4 != integerArgument2) {
          return false;
        }
        if (integerArgument1 >= -45) {
          discarded$1 = this.computeInteger1090(-31, -66, (byte) 71, -102);
        }
        integerLocal2 = 0;
        scanLoop1: while (true) {
          if (integerLocal2 >= 4) {
            return false;
          }
          integerLocal3 = this.selectedCellIndices[integerLocal2];
          integerLocal4 = integerLocal3 % this.boardWidth;
          integerLocal5 = integerLocal3 / this.boardWidth;
          integerLocal6 = 0;
          while (4 > integerLocal6) {
            if (integerLocal2 != integerLocal6) {
              integerLocal8 = this.selectedCellIndices[integerLocal6];
              integerLocal9 = integerLocal8 % this.boardWidth;
              integerLocal10 = integerLocal8 / this.boardWidth;
              integerLocal9 = integerLocal9 - integerLocal4;
              integerLocal10 = integerLocal10 - integerLocal5;
              if ((0 != integerLocal9 ||
                integerLocal10 != -1 &&
                integerLocal10 != 1) &&
                (0 != integerLocal10 ||
                integerLocal9 != -1 &&
                integerLocal9 != 1)) {
                integerLocal2++;
                continue scanLoop1;
              }
            }
            integerLocal6++;
          }
          break;
        }
        return true;
    }

    private final void buildCookedFeedbackShape(BucketBoard destinationBucket, ReturnedShapeCache shapeCache, int packedColour, int selectedOffset, int selectedCount) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        int integerLocal9 = 0;
        RuntimeException runtimeExceptionLocal10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        Object objectLocal18 = null;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        ReturnedShape returnedShapeLocal25 = null;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (destinationBucket == null &&
            shapeCache == null) {
            return;
          }
          integerLocal9 = -1 + this.boardWidth;
          integerLocal11 = -1 + this.boardHeight;
          integerLocal12 = selectedOffset;
          integerLocal13 = 0;
          for (integerLocal14 = 0; selectedCount > integerLocal14; integerLocal14++) {
            integerLocal15 = this.selectedCellIndices[integerLocal14];
            integerLocal16 = integerLocal15 % this.boardWidth;
            integerLocal17 = integerLocal15 / this.boardWidth;
            if (integerLocal16 < integerLocal9) {
              integerLocal9 = integerLocal16;
            }
            if (integerLocal16 > integerLocal12) {
              integerLocal12 = integerLocal16;
            }
            if (integerLocal13 < integerLocal17) {
              integerLocal13 = integerLocal17;
            }
            if (integerLocal17 < integerLocal11) {
              integerLocal11 = integerLocal17;
            }
          }
          integerLocal26 = -integerLocal9 + 1 + integerLocal12;
          integerLocal27 = integerLocal13 + 1 - integerLocal11;
          integerLocal30 = integerLocal26 * integerLocal27;
          integerLocal1 = this.integerState0486;
          this.integerState0486 = this.integerState0486 + 1;
          integerLocal28 = integerLocal1;
          objectLocal18 = null;
          if (shapeCache != null) {
            objectLocal18 = shapeCache.computeReturnedShape1353(false, integerLocal28);
          }
          if (objectLocal18 == null) {
            returnedShapeLocal25 = new ReturnedShape(integerLocal28);
            objectLocal18 = returnedShapeLocal25;
            integerLocal2 = this.integerState0445;
            this.integerState0445 = this.integerState0445 + 1;
            returnedShapeLocal25.integerState0687 = integerLocal2;
            if (shapeCache != null) {
              shapeCache.performAction1352(returnedShapeLocal25, 0);
            }
          }
          ((ReturnedShape) (objectLocal18)).width = integerLocal26;
          ((ReturnedShape) (objectLocal18)).packedCells = new byte[integerLocal30];
          ((ReturnedShape) (objectLocal18)).height = integerLocal27;
          for (integerLocal19 = 0; integerLocal19 < integerLocal30; integerLocal19++) {
            ((ReturnedShape) (objectLocal18)).packedCells[integerLocal19] = (byte) 0;
          }
          integerLocal24 = 0;
          integerLocal29 = integerLocal24;
          while (integerLocal24 < selectedCount) {
            integerLocal20 = this.selectedCellIndices[integerLocal24];
            integerLocal21 = -integerLocal9 + integerLocal20 % this.boardWidth;
            integerLocal22 = integerLocal20 / this.boardWidth - integerLocal11;
            ((ReturnedShape) (objectLocal18)).packedCells[integerLocal21 + integerLocal22 * integerLocal26] = (byte)packedColour;
            integerLocal24++;
          }
          if (destinationBucket != null) {
            destinationBucket.performAction1100((ReturnedShape) (objectLocal18), (byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal31) {
          caughtExceptionLocal8 = caughtParameterLocal31;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal10;
          stackStringBuilderLocal4 = new StringBuilder().append("lk.T(");
          if (destinationBucket == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (shapeCache == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(packedColour).append(',').append(selectedOffset).append(',').append(selectedCount).append(')').toString());
        }
    }

    final void selectDropSpeed(int speedLevel, int obfuscationGuard, boolean alternateSpeedTable) {
        int discarded$0 = 0;
        if (obfuscationGuard != 2113050941) {
          discarded$0 = this.computeInteger1090(80, 86, (byte) -26, -11);
        }
        if (!alternateSpeedTable) {
          this.dropIntervalTicks = MixedSupport087.integerArrayState0165[speedLevel];
        } else {
          this.dropIntervalTicks = UiComponentPart024.integerArrayState0184[speedLevel];
        }
    }

    private final void rotateCounterClockwise(boolean booleanArgument1) {
        boolean discarded$0 = false;
        if (this.computeBoolean1123(0)) {
          return;
        }
        if (booleanArgument1) {
          discarded$0 = this.computeBoolean1111(61, 75);
        }
        if ((this.horizontalParity | this.verticalParity) != 0) {
          this.horizontalParity = -this.horizontalParity;
          this.verticalParity = -this.verticalParity;
          if (this.computeBoolean1123(0)) {
            return;
          }
          this.horizontalParity = -this.horizontalParity;
          this.verticalParity = -this.verticalParity;
        }
    }

    private final int computeInteger1090(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4) {
        int previousIntegerLocal1 = 0;
        int discarded$1 = 0;
        int integerLocal3 = this.settledCells[integerArgument2];
        if (integerArgument4 != (-1879048193 & integerLocal3)) {
          this.performAction1108(7 & integerArgument4, integerArgument2, false);
        } else {
          if ((integerLocal3 & 1879048192) < 1879048192) {
            integerLocal3 = integerLocal3 + 268435456;
          }
          previousIntegerLocal1 = integerArgument1;
          integerArgument1++;
          this.selectedCellIndices[previousIntegerLocal1] = integerArgument2;
          this.settledCells[integerArgument2] = integerLocal3 + -2147483648;
        }
        if (byteArgument3 != -44) {
          ReturnedShapeCache returnedShapeCacheLocal4 = (ReturnedShapeCache) null;
          discarded$1 = this.computeInteger1103(true, 26, -7, (BucketBoard) null, true, 84, -39, 24, (ReturnedShapeCache) null, false, (byte) -94);
        }
        return integerArgument1;
    }

    private final void moveRight(int integerArgument1) {
        this.pieceX = this.pieceX + 1;
        if (!this.pieceCollides((byte) -117)) {
          this.updateGroundedAfterMovement(-1);
          RenderingSupport003.performAction0631(this.integerState0458, this.integerState0446 / 4, (byte) 127, InputAdapter003.rawSoundState0009);
        } else {
          this.pieceX = this.pieceX - 1;
        }
        if (integerArgument1 != 4) {
          this.integerState0459 = -42;
        }
    }

    private final int computeInteger1102(boolean booleanArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal4 = 0;
        int integerLocal5 = integerArgument3;
        if (!booleanArgument1) {
          this.integerArrayState0145 = (int[]) null;
        }
        while (integerLocal5 < integerArgument2) {
          integerLocal1 = this.selectedCellIndices[integerLocal5];
          integerLocal2 = integerLocal1 / this.boardWidth;
          if (RenderingSupport004.integerState0257 > integerLocal2) {
            RenderingSupport004.integerState0257 = integerLocal2;
          }
          if (MixedSupport049.integerState0263 < integerLocal2) {
            MixedSupport049.integerState0263 = integerLocal2;
          }
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal5++;
        }
        return 128 + integerLocal4 * 256 / (integerArgument2 - integerArgument3);
    }

    final int computeInteger1087(int integerArgument1) {
        if (integerArgument1 != 0) {
          this.previousControls = -70;
        }
        return this.integerState0450 + (this.integerState0488 + this.integerState0475) + (this.integerState0493 + this.integerState0466) - (-this.integerState0494 - this.integerState0464);
    }

    final int computeInteger1117(int integerArgument1) {
        int integerLocal1 = 0;
        if (1 <= this.integerState0471) {
          integerLocal1++;
        }
        int integerLocal2 = this.mixedSupport030State0001.computeInteger0454(79, integerLocal1 + this.integerState0477);
        int integerLocal3 = this.mixedSupport030State0001.computeInteger0454(107, this.integerState0477 + integerLocal1);
        if (integerArgument1 != 26580) {
          return -69;
        }
        if (this.integerState0477 == integerLocal2) {
          integerLocal2 = 7;
        }
        if (this.integerState0477 == integerLocal3) {
          integerLocal3 = 7;
        }
        return integerLocal3 + (integerLocal2 << 4);
    }

    final void performAction1122(int integerArgument1) {
        ReturnedShape discarded$0 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        ReturnedShape returnedShapeLocal9;
        int integerLocal10;
        RawPcmStream rawPcmStreamLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        RawPcmStream rawPcmStreamLocal17;
        RawPcmStream rawPcmStreamLocal18;
        int[] integerArrayLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!this.booleanState0106) {
          integerLocal6 = 0;
          for (integerLocal7 = 0; this.pieceHeight > integerLocal7; integerLocal7++) {
            for (integerLocal8 = 0; this.pieceWidth > integerLocal8; integerLocal8++) {
              integerLocal10 = this.integerArrayState0147[integerLocal6];
              integerLocal12 = this.integerArrayState0144[integerLocal6];
              if (integerLocal10 < 0) {
                integerLocal12 = integerLocal12 - (integerLocal10 >> 1);
              } else {
                integerLocal12 = integerLocal12 + (-integerLocal10 >> 1);
              }
              integerLocal10 = integerLocal10 + integerLocal12;
              if (0 <= integerLocal10) {
                integerLocal10 = integerLocal10 + (-integerLocal10 >> 4);
              } else {
                integerLocal10 = integerLocal10 - (integerLocal10 >> 4);
              }
              this.integerArrayState0147[integerLocal6] = integerLocal10;
              this.integerArrayState0144[integerLocal6] = integerLocal12;
              integerLocal6++;
            }
          }
          for (integerLocal27 = 0; integerLocal27 < this.pieceWidth; integerLocal27++) {
            integerLocal28 = -1073741824;
            for (integerLocal10 = 0; integerLocal10 < this.pieceHeight; integerLocal10++) {
              integerLocal26 = integerLocal27 + integerLocal10 * this.pieceWidth;
              integerLocal29 = this.pieceX + integerLocal27;
              if (integerLocal29 >= 0 &&
                this.boardWidth > integerLocal29) {
                integerLocal13 = this.pieceY - (-integerLocal10 + 1);
                integerLocal14 = 0;
                while (integerLocal13 >= 0) {
                  if (integerLocal28 >= integerLocal14) {
                    break;
                  }
                  if (integerLocal13 < this.boardHeight &&
                    0 != this.settledCells[integerLocal29 + integerLocal13 * this.boardWidth]) {
                    integerLocal28 = integerLocal14;
                    break;
                  }
                  integerLocal13--;
                  integerLocal14 -= 80;
                }
              }
              integerLocal33 = this.integerArrayState0147[integerLocal26];
              integerLocal34 = this.integerArrayState0144[integerLocal26];
              if (integerLocal33 < integerLocal28) {
                integerLocal33 = integerLocal28;
                if (0 > integerLocal34) {
                  integerLocal34 = -integerLocal34;
                }
              }
              this.integerArrayState0147[integerLocal26] = integerLocal33;
              this.integerArrayState0144[integerLocal26] = integerLocal34;
              integerLocal28 -= 80;
              if (this.activePieceCells[integerLocal26] != 0 &&
                integerLocal28 < integerLocal33) {
                integerLocal28 = integerLocal33;
              }
            }
            integerLocal10 = 1073741823;
            for (integerLocal36 = -1 + this.pieceHeight; 0 <= integerLocal36; integerLocal36--) {
              integerLocal35 = this.pieceWidth * integerLocal36 + integerLocal27;
              integerLocal30 = integerLocal27 + this.pieceX;
              if (integerLocal30 >= 0 &&
                this.boardWidth > integerLocal30) {
                integerLocal31 = this.pieceY + integerLocal36 + 1;
                integerLocal15 = 0;
                while (integerLocal10 > integerLocal15) {
                  if (integerLocal31 < this.boardHeight && (integerLocal31 < 0 ||
                    this.settledCells[integerLocal30 + this.boardWidth * integerLocal31] == 0)) {
                    integerLocal15 += 80;
                    integerLocal31++;
                    continue;
                  }
                  integerLocal10 = integerLocal15;
                  break;
                }
              }
              integerLocal37 = this.integerArrayState0147[integerLocal35];
              integerLocal32 = this.integerArrayState0144[integerLocal35];
              if (integerLocal37 > integerLocal10) {
                if (integerLocal32 > 0) {
                  integerLocal32 = -integerLocal32;
                }
                integerLocal37 = integerLocal10;
              }
              this.integerArrayState0147[integerLocal35] = integerLocal37;
              this.integerArrayState0144[integerLocal35] = integerLocal32;
              integerLocal10 += 80;
              if (this.activePieceCells[integerLocal35] != 0 &&
                integerLocal10 > integerLocal37) {
                integerLocal10 = integerLocal37;
              }
            }
          }
        }
        if (this.stringState0335 != null) {
          this.integerState0472 = this.integerState0472 + 1;
          if (100 <= this.integerState0472) {
            this.stringState0335 = null;
          }
        }
        integerLocal20 = 1;
        for (integerLocal21 = 0; this.integerState0465 > integerLocal21; integerLocal21++) {
          returnedShapeLocal9 = this.returnedShapeArrayState0001[integerLocal21];
          if (null == returnedShapeLocal9.packedCells &&
            returnedShapeLocal9.integerState0691 <= 18) {
            integerLocal20 = 0;
          }
          if (integerLocal20 != 0 &&
            0 < returnedShapeLocal9.integerState0691) {
            if (18 == returnedShapeLocal9.integerState0691) {
              this.performAction1109(false);
            }
            returnedShapeLocal9.integerState0691 = returnedShapeLocal9.integerState0691 - 1;
            integerLocal10 = returnedShapeLocal9.integerState0687 + 1;
            if (returnedShapeLocal9.integerState0691 == 12 &&
              integerLocal10 >= 5) {
              this.stringState0335 = CollectionSupport001.computeString0336(105, MixedSupport137.stringState0564, new String[]{Integer.toString(integerLocal10)});
              this.integerState0451 = UiComponentPart016.computeInteger0944((byte) 62, 7, UiComponentPart031.randomState0003) - 3;
              this.integerState0457 = UiComponentPart016.computeInteger0944((byte) 126, 7, UiComponentPart031.randomState0003) - 3;
              this.integerState0472 = 0;
              integerArrayLocal19 = MixedSupport148.integerArrayState0252;
              integerLocal25 = integerLocal10 / 10;
              if (integerArrayLocal19.length <= integerLocal25) {
                integerLocal25 = integerArrayLocal19.length - 1;
              }
              this.integerState0470 = integerArrayLocal19[integerLocal25];
            }
          }
          if (returnedShapeLocal9.integerState0692 > 0) {
            returnedShapeLocal9.integerState0692 = returnedShapeLocal9.integerState0692 + 1;
          }
        }
        if (integerArgument1 != -21142) {
          this.updateGroundedAfterMovement(13);
        }
        stackIntegerLocal2 = (!this.computeBoolean1112(-124)) ? 0 : 1;
        integerLocal22 = stackIntegerLocal2;
        while (this.integerState0465 > 0) {
          if (this.returnedShapeArrayState0001[0].integerState0692 >= 13) {
            discarded$0 = this.computeReturnedShape1119(127);
            continue;
          }
          break;
        }
        if (this.nodeDequeState0017 != null &&
          this.nodeDequeState0017.computeHashNode1970((byte) 70) != null) {
          stackIntegerLocal3 = -1;
          stackIntegerLocal4 = ~this.integerState0496;
          if (stackIntegerLocal3 == stackIntegerLocal4) {
            this.performAction1109(false);
          }
          if (this.integerState0496 == 322) {
            this.performAction1110(0);
          }
          this.integerState0496 = this.integerState0496 + 1;
          if (335 == this.integerState0496) {
            this.integerState0496 = 0;
            this.nodeDequeState0017.computeHashNode1960(integerArgument1 + 21146);
          }
        }
        stackIntegerLocal5 = (!this.computeBoolean1112(integerArgument1 ^ 21190)) ? 0 : 1;
        integerLocal23 = stackIntegerLocal5;
        if (integerLocal20 != 0 &&
          18 < this.integerState0442) {
          this.integerState0442 = this.integerState0442 - 1;
        }
        if (integerLocal22 != 0 &&
          integerLocal23 == 0) {
          RenderingSupport003.performAction0631(this.integerState0462, this.integerState0474 / 8, (byte) 127, SceneWidgetPart005.rawSoundState0012);
        }
        if (integerLocal23 != 0) {
          MixedSupport005.booleanArrayState0001[this.integerState0453] = true;
          rawPcmStreamLocal11 = MixedSupport063.rawPcmStreamArrayState0002[this.integerState0453];
          if (rawPcmStreamLocal11 == null) {
            integerLocal24 = 100 + MixedSupport113.computeInteger1604((byte) 16, 4, this.integerState0453);
            rawPcmStreamLocal17 = RawPcmStream.computeRawPcmStream0498(ComponentContainer.rawSoundState0014, integerLocal24, GameDomainSupport005.integerState0578 * this.integerState0474, this.integerState0462 << 6);
            rawPcmStreamLocal18 = rawPcmStreamLocal17;
            rawPcmStreamLocal18.performAction0507(-1);
            CollectionSupport002.pcmStreamMixerState0001.performAction1190(rawPcmStreamLocal17);
            MixedSupport063.rawPcmStreamArrayState0002[this.integerState0453] = rawPcmStreamLocal17;
          } else {
            rawPcmStreamLocal11.performAction0483(PcmPlayer.integerState0209 / 50, GameDomainSupport005.integerState0578 * this.integerState0474, this.integerState0462 << 6);
          }
        }
    }

    BucketBoard(boolean booleanArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        this.integerState0446 = 128;
        this.booleanState0103 = false;
        this.integerState0450 = 0;
        this.integerState0442 = 18;
        this.pieceAcknowledgement = -1;
        this.integerState0454 = 0;
        this.stringState0335 = null;
        this.returnedShapeArrayState0001 = new ReturnedShape[1];
        this.integerState0462 = 48;
        this.integerState0468 = 0;
        this.integerState0458 = 128;
        this.booleanState0105 = false;
        this.integerState0472 = 0;
        this.booleanState0106 = false;
        this.integerState0466 = 0;
        this.integerState0464 = 0;
        this.integerState0481 = 0;
        this.integerState0467 = 0;
        this.mixedSupport030State0001 = null;
        this.integerState0453 = -1;
        this.booleanState0110 = false;
        this.integerState0474 = 128;
        this.integerState0475 = 0;
        this.integerState0488 = 0;
        this.booleanState0111 = false;
        this.landed = false;
        this.integerState0494 = 0;
        this.integerState0493 = 0;
        this.livesRemaining = 3;
        this.integerState0496 = 0;
        if (booleanArgument1) {
          this.boardWidth = 12;
          this.boardHeight = 27;
        } else {
          this.boardHeight = 18;
          this.boardWidth = 8;
        }
        this.integerState0477 = integerArgument4;
        this.selectedCellIndices = new int[this.boardWidth * this.boardHeight];
        this.integerState0483 = integerArgument3;
        this.integerState0471 = integerArgument5;
        this.settledCells = new int[this.boardWidth * this.boardHeight];
        this.selectDropSpeed(integerArgument2, 2113050941, false);
        this.integerState0465 = 0;
        this.integerState0476 = 0;
    }

    static {
        integerState0452 = 3;
        stringState0336 = "There are no valid types of game that match your preferences.";
    }
}
