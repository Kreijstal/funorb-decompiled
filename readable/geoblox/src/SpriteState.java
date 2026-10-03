/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SpriteState extends DualLinkNode {
    int fullWidth;
    int width;
    int height;
    int trimY;
    int fullHeight;
    static long field_n;
    static ck field_t;
    int trimX;
    static String field_q;

    final static void a(boolean param0, ResourceArchive param1) {
        RuntimeException stackIn_310_0 = null;
        StringBuilder stackIn_310_1 = null;
        String stackIn_311_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          pf.field_O = param1;
          var2 = ih.a(122, "achievement_names,0");
          if (null != var2) {
            pg.achievementTitles[0] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_names,1");
          if (var2 != null) {
            pg.achievementTitles[1] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_names,2");
          if (var2 != null) {
            pg.achievementTitles[2] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_names,3");
          if (null != var2) {
            pg.achievementTitles[3] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "achievement_names,4");
          if (null != var2) {
            pg.achievementTitles[4] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_names,5");
          if (var2 != null) {
            pg.achievementTitles[5] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_names,6");
          if (var2 != null) {
            pg.achievementTitles[6] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_names,7");
          if (null != var2) {
            pg.achievementTitles[7] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "achievement_names,8");
          if (null != var2) {
            pg.achievementTitles[8] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_names,9");
          if (var2 != null) {
            pg.achievementTitles[9] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_names,10");
          if (null != var2) {
            pg.achievementTitles[10] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_names,11");
          if (null != var2) {
            pg.achievementTitles[11] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_names,12");
          if (var2 != null) {
            pg.achievementTitles[12] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_names,13");
          if (null != var2) {
            pg.achievementTitles[13] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "achievement_names,14");
          if (var2 != null) {
            pg.achievementTitles[14] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "achievement_names,15");
          if (null != var2) {
            pg.achievementTitles[15] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "achievement_names,16");
          if (var2 != null) {
            pg.achievementTitles[16] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_criteria,0");
          if (null != var2) {
            ri.field_b[0] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,1");
          if (null != var2) {
            ri.field_b[1] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,2");
          if (null != var2) {
            ri.field_b[2] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,3");
          if (var2 != null) {
            ri.field_b[3] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,4");
          if (null != var2) {
            ri.field_b[4] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,5");
          if (null != var2) {
            ri.field_b[5] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,6");
          if (var2 != null) {
            ri.field_b[6] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,7");
          if (var2 != null) {
            ri.field_b[7] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,8");
          if (null != var2) {
            ri.field_b[8] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,9");
          if (null != var2) {
            ri.field_b[9] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "achievement_criteria,10");
          if (null != var2) {
            ri.field_b[10] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,11");
          if (var2 != null) {
            ri.field_b[11] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,12");
          if (var2 != null) {
            ri.field_b[12] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "achievement_criteria,13");
          if (null != var2) {
            ri.field_b[13] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,14");
          if (null != var2) {
            ri.field_b[14] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "achievement_criteria,15");
          if (null != var2) {
            ri.field_b[15] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,16");
          if (null != var2) {
            ri.field_b[16] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "starting");
          if (null != var2) {
            uj.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "gameName");
          if (var2 != null) {
            od.field_b = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "caption1");
          if (var2 != null) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "caption2");
          if (null != var2) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "caption3");
          if (var2 != null) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "caption4");
          if (null != var2) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "caption5");
          if (null != var2) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "youreGreat");
          if (null != var2) {
            ld.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "bubbleBonus");
          if (var2 != null) {
            sg.field_f = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "endOfFreeGame");
          if (var2 != null) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "itsTheBubbleBonus");
          if (var2 != null) {
            kd.field_d = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "countdown");
          if (null != var2) {
            w.field_e = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "levelsLastGeoblox");
          if (null != var2) {
            tj.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "clearBonus");
          if (null != var2) {
            KeyboardInputListener.field_b = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "cheat");
          if (!param0) {
            field_t = (ck) null;
          }
          if (var2 != null) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "bonus");
          if (var2 != null) {
            ic.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "fps");
          if (null != var2) {
            sh.field_z = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "level");
          if (var2 != null) {
            qg.field_e = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "score");
          if (var2 != null) {
            LimitedRandomAccessFile.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "waitingForPumpkin");
          if (var2 != null) {
            s.field_F = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "loadingPumpkin");
          if (var2 != null) {
            uj.field_c = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "skipText");
          if (var2 != null) {
            v.tutorialSkipMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "tutorial1");
          if (null != var2) {
            vh.tutorialRotationMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "tutorial2");
          if (var2 != null) {
            oi.tutorialColourMatchMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "tutorial3");
          if (null != var2) {
            vd.tutorialShapeMatchMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "tutorial4");
          if (var2 != null) {
            li.tutorialCompleteMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "tutorial5");
          if (null != var2) {
            qh.tutorialFailedMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "cont");
          if (null != var2) {
            mi.field_y = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "restartTutorial");
          if (var2 != null) {
            cf.field_j = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "discardResults");
          if (var2 != null) {
            PacketByteCipher.field_c = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "replayTutorial");
          if (null != var2) {
            ArchiveCatalog.field_a = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "subscribe");
          if (null != var2) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "createAnAccount");
          if (null != var2) {
            ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "fetchingHS");
          if (null != var2) {
            eb.field_f = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "instructionTitles,0");
          if (var2 != null) {
            a.field_a[0] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(127, "instructionTitles,1");
          if (var2 != null) {
            a.field_a[1] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "instructionTitles,2");
          if (null != var2) {
            a.field_a[2] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "instructionTitles,3");
          if (null != var2) {
            a.field_a[3] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "instructionTitles,4");
          if (var2 != null) {
            a.field_a[4] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "instructionTitles,5");
          if (null != var2) {
            a.field_a[5] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(124, "instructionText,0");
          if (null != var2) {
            ec.field_e[0] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "instructionText,1");
          if (var2 != null) {
            ec.field_e[1] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "instructionText,2");
          if (var2 != null) {
            ec.field_e[2] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(121, "instructionText,3");
          if (var2 != null) {
            ec.field_e[3] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(123, "instructionText,4");
          if (null != var2) {
            ec.field_e[4] = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(126, "pleaseLogin");
          if (var2 != null) {
            Geoblox.loginMessage = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "youAreNotLoggedIn");
          if (null != var2) {
            r.field_sb = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(120, "alternatively");
          if (var2 != null) {
            bd.field_b = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(125, "login");
          if (var2 != null) {
            gj.field_t = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "notAcheived");
          if (null != var2) {
            ib.field_d = ag.decodeTextBytes(1, var2);
          }
          var2 = ih.a(122, "keycode_reverseControls");
          if (null != var2) {
            jg.swapRotationControlsKeyCode = var2[0] & 255;
          }
          pf.field_O = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_310_0 = (RuntimeException) (var2_ref);
          stackIn_310_1 = new StringBuilder().append("wh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_311_2 = "null";
          } else {
            stackIn_311_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_310_0), ((StringBuilder) (Object) stackIn_310_1).append(stackIn_311_2).append(')').toString());
        }
        if (ch.field_h) {
          var3++;
          Geoblox.field_C = var3;
        }
    }

    final static byte[] computeWhirlpoolDigest(int length, int sourceOffset, byte[] source, int bitsPerByte) {
        byte[] digestInput = null;
        RuntimeException digestFailureForContext = null;
        int copiedByteIndex = 0;
        WhirlpoolHash hash = null;
        byte[] digest = null;
        int clientControlFlowGuard = 0;
        byte[] digestBeforeReturn = null;
        RuntimeException digestFailureBeforeContext = null;
        StringBuilder digestMessagePrefix = null;
        String sourceDescription = null;
        RuntimeException caughtDigestFailure = null;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (sourceOffset > 0) {
                digestInput = new byte[length];
                copiedByteIndex = 0;
                while (~length < ~copiedByteIndex) {
                  digestInput[copiedByteIndex] = source[sourceOffset + copiedByteIndex];
                  copiedByteIndex++;
                  if (clientControlFlowGuard != 0) {
                    break L0;
                  }
                  if (clientControlFlowGuard == 0) {
                    continue;
                  }
                  break;
                }
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
                break L1;
              }
            }
            digestInput = source;
          }
          hash = new WhirlpoolHash();
          hash.reset(52);
          hash.updateBits(digestInput, (long)(bitsPerByte * length), 0);
          digest = new byte[64];
          hash.finishDigest(digest, 0, true);
          digestBeforeReturn = (byte[]) (digest);
          return digestBeforeReturn;
        } catch (java.lang.RuntimeException digestFailure) {
          caughtDigestFailure = digestFailure;
          digestFailureForContext = caughtDigestFailure;
          digestFailureBeforeContext = (RuntimeException) (digestFailureForContext);
          digestMessagePrefix = new StringBuilder().append("wh.MA(").append(length).append(',').append(sourceOffset).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) digestFailureBeforeContext), ((StringBuilder) (Object) digestMessagePrefix).append(sourceDescription).append(',').append(bitsPerByte).append(')').toString());
        }
    }

    final static void drawSortedHalfBlendRgbTriangle(int bottomGreen, int topRed, int topX, int middleGreen, int bottomY, int bottomBlue, int bottomRed, int middleBlue, int topY, int middleX, int middleRed, int[] destinationPixels, int topGreen, int bottomX, int topBlue, int middleY, int guard) {
        int invertedClipWidthOrLowerRows = 0;
        int invertedSpanStartOrNegativeOne = 0;
        RuntimeException rasterFailureBeforeContext = null;
        StringBuilder rasterMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtRasterFailure = null;
        int leftXQ16 = 0;
        RuntimeException rasterFailure = null;
        int rightXQ16 = 0;
        int leftXStepQ16 = 0;
        int rightXStepQ16 = 0;
        int leftRedQ16 = 0;
        int rightRedQ16 = 0;
        int leftRedStepQ16 = 0;
        int rightRedStepQ16 = 0;
        int leftGreenQ16 = 0;
        int rightGreenQ16 = 0;
        int leftGreenStepQ16 = 0;
        int rightGreenStepQ16 = 0;
        int leftBlueQ16 = 0;
        int rightBlueQ16 = 0;
        int leftBlueStepQ16 = 0;
        int rightBlueStepQ16 = 0;
        int middleVertexOnRight = 0;
        int topToBottomRows = 0;
        int edgeSegmentRowsThenRowBase = 0;
        int edgeSwapOrRowBaseOrLowerRowsThenLeftX = 0;
        int spanStartOrWidthOrBottomXQ16 = 0;
        int spanWidthOrRedStepOrBottomRedQ16 = 0;
        int spanRedStepOrGreenStepOrBottomGreenQ16 = 0;
        int spanGreenStepOrBlueStepOrBottomBlueQ16 = 0;
        int spanBlueStepQ16 = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.field_C;
        try {
          if ((bottomY >= 0) &&
              (~TriangleRasterState.clipHeight < ~topY)) {
            if ((topX < 0) &&
                (middleX < 0) &&
                (bottomX < 0)) {
              return;
            }
            if ((~TriangleRasterState.clipWidth >= ~topX) &&
                (~TriangleRasterState.clipWidth >= ~middleX) &&
                (bottomX >= TriangleRasterState.clipWidth)) {
              return;
            }
            if (guard != -1275583984) {
              return;
            }
            L3: {
              topToBottomRows = -topY + bottomY;
              if (topY == middleY) {
                L5: {
                  if (~bottomY == ~topY) {
                    leftBlueQ16 = topBlue;
                    leftXQ16 = topX << 16;
                    leftBlueStepQ16 = 0;
                    rightBlueQ16 = middleBlue;
                    leftXStepQ16 = 0;
                    leftRedQ16 = topRed;
                    rightRedStepQ16 = 0;
                    rightBlueStepQ16 = 0;
                    rightXStepQ16 = 0;
                    rightGreenQ16 = middleGreen;
                    leftRedStepQ16 = 0;
                    rightRedQ16 = middleRed;
                    leftGreenStepQ16 = 0;
                    rightGreenStepQ16 = 0;
                    rightXQ16 = middleX << 16;
                    leftGreenQ16 = topGreen;
                    if (controlFlagSnapshot == 0) {
                      break L5;
                    }
                  }
                  edgeSegmentRowsThenRowBase = -middleY + bottomY;
                  if (middleX <= topX) {
                    leftGreenStepQ16 = (bottomGreen - middleGreen << 16) / edgeSegmentRowsThenRowBase;
                    leftBlueQ16 = middleBlue << 16;
                    rightXStepQ16 = (bottomX - topX << 16) / topToBottomRows;
                    rightRedStepQ16 = (bottomRed - topRed << 16) / topToBottomRows;
                    leftXQ16 = middleX << 16;
                    leftRedStepQ16 = (-middleRed + bottomRed << 16) / edgeSegmentRowsThenRowBase;
                    rightXQ16 = topX << 16;
                    leftBlueStepQ16 = (-middleBlue + bottomBlue << 16) / edgeSegmentRowsThenRowBase;
                    rightBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                    leftGreenQ16 = middleGreen << 16;
                    rightBlueQ16 = topBlue << 16;
                    rightGreenStepQ16 = (-topGreen + bottomGreen << 16) / topToBottomRows;
                    leftXStepQ16 = (-middleX + bottomX << 16) / edgeSegmentRowsThenRowBase;
                    leftRedQ16 = middleRed << 16;
                    rightRedQ16 = topRed << 16;
                    rightGreenQ16 = topGreen << 16;
                    if (controlFlagSnapshot == 0) {
                      break L5;
                    }
                  }
                  rightGreenStepQ16 = (bottomGreen - middleGreen << 16) / edgeSegmentRowsThenRowBase;
                  leftRedStepQ16 = (bottomRed - topRed << 16) / topToBottomRows;
                  leftXStepQ16 = (bottomX - topX << 16) / topToBottomRows;
                  leftGreenQ16 = topGreen << 16;
                  rightRedQ16 = middleRed << 16;
                  rightBlueStepQ16 = (bottomBlue - middleBlue << 16) / edgeSegmentRowsThenRowBase;
                  rightGreenQ16 = middleGreen << 16;
                  leftXQ16 = topX << 16;
                  rightRedStepQ16 = (-middleRed + bottomRed << 16) / edgeSegmentRowsThenRowBase;
                  leftRedQ16 = topRed << 16;
                  rightBlueQ16 = middleBlue << 16;
                  rightXQ16 = middleX << 16;
                  rightXStepQ16 = (bottomX - middleX << 16) / edgeSegmentRowsThenRowBase;
                  leftBlueStepQ16 = (bottomBlue - topBlue << 16) / topToBottomRows;
                  leftGreenStepQ16 = (bottomGreen - topGreen << 16) / topToBottomRows;
                  leftBlueQ16 = topBlue << 16;
                }
                middleVertexOnRight = 0;
                if (0 <= topY) {
                  break L3;
                }
                topY = Math.min(-topY, middleY - topY);
                rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
                rightBlueQ16 = rightBlueQ16 + topY * rightBlueStepQ16;
                rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
                leftXQ16 = leftXQ16 + leftXStepQ16 * topY;
                leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
                leftRedQ16 = leftRedQ16 + leftRedStepQ16 * topY;
                leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                topY = 0;
                if (controlFlagSnapshot == 0) {
                  break L3;
                }
              }
              L8: {
                rightXQ16 = topX << 16;
                leftXQ16 = topX << 16;
                rightBlueQ16 = topBlue << 16;
                leftBlueQ16 = topBlue << 16;
                rightGreenQ16 = topGreen << 16;
                leftGreenQ16 = topGreen << 16;
                rightRedQ16 = topRed << 16;
                leftRedQ16 = topRed << 16;
                edgeSegmentRowsThenRowBase = middleY - topY;
                rightXStepQ16 = (-topX + bottomX << 16) / topToBottomRows;
                leftXStepQ16 = (middleX - topX << 16) / edgeSegmentRowsThenRowBase;
                if (rightXStepQ16 <= leftXStepQ16) {
                  leftRedStepQ16 = (-topRed + bottomRed << 16) / topToBottomRows;
                  leftGreenStepQ16 = (-topGreen + bottomGreen << 16) / topToBottomRows;
                  leftBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                  edgeSwapOrRowBaseOrLowerRowsThenLeftX = leftXStepQ16;
                  leftXStepQ16 = rightXStepQ16;
                  rightXStepQ16 = edgeSwapOrRowBaseOrLowerRowsThenLeftX;
                  rightGreenStepQ16 = (-topGreen + middleGreen << 16) / edgeSegmentRowsThenRowBase;
                  middleVertexOnRight = 1;
                  rightBlueStepQ16 = (-topBlue + middleBlue << 16) / edgeSegmentRowsThenRowBase;
                  rightRedStepQ16 = (-topRed + middleRed << 16) / edgeSegmentRowsThenRowBase;
                  if (controlFlagSnapshot == 0) {
                    break L8;
                  }
                }
                rightBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                rightGreenStepQ16 = (bottomGreen - topGreen << 16) / topToBottomRows;
                leftRedStepQ16 = (middleRed - topRed << 16) / edgeSegmentRowsThenRowBase;
                rightRedStepQ16 = (-topRed + bottomRed << 16) / topToBottomRows;
                leftBlueStepQ16 = (middleBlue - topBlue << 16) / edgeSegmentRowsThenRowBase;
                leftGreenStepQ16 = (-topGreen + middleGreen << 16) / edgeSegmentRowsThenRowBase;
                middleVertexOnRight = 0;
              }
              L10: {
                L11: {
                  L12: {
                    if (topY < 0) {
                      if (middleY >= 0) {
                        topY = -topY;
                        rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16 * topY;
                        rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                        leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                        leftGreenQ16 = leftGreenQ16 + topY * leftGreenStepQ16;
                        leftXQ16 = leftXQ16 + topY * leftXStepQ16;
                        rightXQ16 = rightXQ16 + topY * rightXStepQ16;
                        rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
                        leftRedQ16 = leftRedQ16 + topY * leftRedStepQ16;
                        topY = 0;
                        if (controlFlagSnapshot == 0) {
                          break L12;
                        }
                      }
                      topY = middleY - topY;
                      leftRedQ16 = leftRedQ16 + topY * leftRedStepQ16;
                      rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                      leftXQ16 = leftXQ16 + topY * leftXStepQ16;
                      rightXQ16 = rightXQ16 + topY * rightXStepQ16;
                      leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
                      rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16 * topY;
                      rightRedQ16 = rightRedQ16 + topY * rightRedStepQ16;
                      leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                      topY = middleY;
                      if (controlFlagSnapshot == 0) {
                        break L11;
                      }
                    }
                  }
                  edgeSwapOrRowBaseOrLowerRowsThenLeftX = TriangleRasterState.rowBaseOffsets[topY];
                  while (true) {
                    if (~middleY >= ~topY) {
                      break L11;
                    }
                    spanStartOrWidthOrBottomXQ16 = leftXQ16 >> 16;
                    invertedClipWidthOrLowerRows = ~TriangleRasterState.clipWidth;
                    invertedSpanStartOrNegativeOne = ~spanStartOrWidthOrBottomXQ16;
                    if (controlFlagSnapshot != 0) {
                      break L10;
                    }
                    L15: {
                      if (invertedClipWidthOrLowerRows < invertedSpanStartOrNegativeOne) {
                        spanWidthOrRedStepOrBottomRedQ16 = (rightXQ16 >> 16) - (leftXQ16 >> 16);
                        if (spanWidthOrRedStepOrBottomRedQ16 != 0) {
                          spanRedStepOrGreenStepOrBottomGreenQ16 = (rightRedQ16 - leftRedQ16) / spanWidthOrRedStepOrBottomRedQ16;
                          spanGreenStepOrBlueStepOrBottomBlueQ16 = (-leftGreenQ16 + rightGreenQ16) / spanWidthOrRedStepOrBottomRedQ16;
                          spanBlueStepQ16 = (rightBlueQ16 - leftBlueQ16) / spanWidthOrRedStepOrBottomRedQ16;
                          if (TriangleRasterState.clipWidth <= spanWidthOrRedStepOrBottomRedQ16 + spanStartOrWidthOrBottomXQ16) {
                            spanWidthOrRedStepOrBottomRedQ16 = -1 + (TriangleRasterState.clipWidth - spanStartOrWidthOrBottomXQ16);
                          }
                          L18: {
                            if (0 <= spanStartOrWidthOrBottomXQ16) {
                              jf.drawHalfBlendRgbGradientSpan(spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanRedStepOrGreenStepOrBottomGreenQ16, 33423689, leftRedQ16, spanBlueStepQ16, leftGreenQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, spanWidthOrRedStepOrBottomRedQ16, leftBlueQ16, destinationPixels);
                              if (controlFlagSnapshot == 0) {
                                break L18;
                              }
                            }
                            jf.drawHalfBlendRgbGradientSpan(edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanRedStepOrGreenStepOrBottomGreenQ16, 33423689, -(spanRedStepOrGreenStepOrBottomGreenQ16 * spanStartOrWidthOrBottomXQ16) + leftRedQ16, spanBlueStepQ16, leftGreenQ16 - spanStartOrWidthOrBottomXQ16 * spanGreenStepOrBlueStepOrBottomBlueQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, spanWidthOrRedStepOrBottomRedQ16 + spanStartOrWidthOrBottomXQ16, -(spanBlueStepQ16 * spanStartOrWidthOrBottomXQ16) + leftBlueQ16, destinationPixels);
                          }
                          if (controlFlagSnapshot == 0) {
                            break L15;
                          }
                        }
                        if ((spanStartOrWidthOrBottomXQ16 >= 0) &&
                            (~spanStartOrWidthOrBottomXQ16 > ~TriangleRasterState.clipWidth)) {
                          jf.drawHalfBlendRgbGradientSpan(spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, 0, 33423689, leftRedQ16, 0, leftGreenQ16, 0, spanWidthOrRedStepOrBottomRedQ16, leftBlueQ16, destinationPixels);
                        }
                      }
                    }
                    topY++;
                    if (~topY <= ~TriangleRasterState.clipHeight) {
                      return;
                    }
                    rightXQ16 = rightXQ16 + rightXStepQ16;
                    rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16;
                    rightRedQ16 = rightRedQ16 + rightRedStepQ16;
                    leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16;
                    leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16;
                    rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16;
                    leftXQ16 = leftXQ16 + leftXStepQ16;
                    leftRedQ16 = leftRedQ16 + leftRedStepQ16;
                    edgeSwapOrRowBaseOrLowerRowsThenLeftX = edgeSwapOrRowBaseOrLowerRowsThenLeftX + SoftwareRasterizer.stride;
                    if (controlFlagSnapshot == 0) {
                      continue;
                    }
                    break L11;
                  }
                }
                edgeSwapOrRowBaseOrLowerRowsThenLeftX = bottomY - middleY;
                invertedClipWidthOrLowerRows = ~edgeSwapOrRowBaseOrLowerRowsThenLeftX;
                invertedSpanStartOrNegativeOne = -1;
              }
              if (invertedClipWidthOrLowerRows == invertedSpanStartOrNegativeOne) {
                leftRedStepQ16 = 0;
                leftGreenStepQ16 = 0;
                rightXStepQ16 = 0;
                leftXStepQ16 = 0;
                rightRedStepQ16 = 0;
                leftBlueStepQ16 = 0;
                rightGreenStepQ16 = 0;
                rightBlueStepQ16 = 0;
                if (controlFlagSnapshot == 0) {
                  break L3;
                }
              }
              L21: {
                spanStartOrWidthOrBottomXQ16 = bottomX << 16;
                spanWidthOrRedStepOrBottomRedQ16 = bottomRed << 16;
                spanRedStepOrGreenStepOrBottomGreenQ16 = bottomGreen << 16;
                spanGreenStepOrBlueStepOrBottomBlueQ16 = bottomBlue << 16;
                if (middleVertexOnRight == 0) {
                  leftXQ16 = middleX << 16;
                  leftBlueQ16 = middleBlue << 16;
                  leftRedQ16 = middleRed << 16;
                  leftGreenQ16 = middleGreen << 16;
                  if (controlFlagSnapshot == 0) {
                    break L21;
                  }
                }
                rightRedQ16 = middleRed << 16;
                rightXQ16 = middleX << 16;
                rightGreenQ16 = middleGreen << 16;
                rightBlueQ16 = middleBlue << 16;
              }
              rightGreenStepQ16 = (spanRedStepOrGreenStepOrBottomGreenQ16 - rightGreenQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftBlueStepQ16 = (-leftBlueQ16 + spanGreenStepOrBlueStepOrBottomBlueQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftXStepQ16 = (spanStartOrWidthOrBottomXQ16 - leftXQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftRedStepQ16 = (-leftRedQ16 + spanWidthOrRedStepOrBottomRedQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftGreenStepQ16 = (spanRedStepOrGreenStepOrBottomGreenQ16 - leftGreenQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightRedStepQ16 = (spanWidthOrRedStepOrBottomRedQ16 - rightRedQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightXStepQ16 = (spanStartOrWidthOrBottomXQ16 - rightXQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightBlueStepQ16 = (-rightBlueQ16 + spanGreenStepOrBlueStepOrBottomBlueQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
            }
            if (topY < 0) {
              topY = -topY;
              rightXQ16 = rightXQ16 + topY * rightXStepQ16;
              leftXQ16 = leftXQ16 + topY * leftXStepQ16;
              rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
              rightBlueQ16 = rightBlueQ16 + topY * rightBlueStepQ16;
              leftRedQ16 = leftRedQ16 + leftRedStepQ16 * topY;
              leftBlueQ16 = leftBlueQ16 + topY * leftBlueStepQ16;
              rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16 * topY;
              leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
              topY = 0;
            }
            edgeSegmentRowsThenRowBase = TriangleRasterState.rowBaseOffsets[topY];
            while (true) {
              if (bottomY > topY) {
                edgeSwapOrRowBaseOrLowerRowsThenLeftX = leftXQ16 >> 16;
                if (controlFlagSnapshot != 0) {
                  return;
                }
                L27: {
                  if (edgeSwapOrRowBaseOrLowerRowsThenLeftX < TriangleRasterState.clipWidth) {
                    spanStartOrWidthOrBottomXQ16 = -(leftXQ16 >> 16) + (rightXQ16 >> 16);
                    if (spanStartOrWidthOrBottomXQ16 != 0) {
                      spanWidthOrRedStepOrBottomRedQ16 = (rightRedQ16 - leftRedQ16) / spanStartOrWidthOrBottomXQ16;
                      spanRedStepOrGreenStepOrBottomGreenQ16 = (rightGreenQ16 - leftGreenQ16) / spanStartOrWidthOrBottomXQ16;
                      spanGreenStepOrBlueStepOrBottomBlueQ16 = (-leftBlueQ16 + rightBlueQ16) / spanStartOrWidthOrBottomXQ16;
                      if (spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX >= TriangleRasterState.clipWidth) {
                        spanStartOrWidthOrBottomXQ16 = TriangleRasterState.clipWidth - edgeSwapOrRowBaseOrLowerRowsThenLeftX - 1;
                      }
                      L30: {
                        if (edgeSwapOrRowBaseOrLowerRowsThenLeftX < 0) {
                          jf.drawHalfBlendRgbGradientSpan(edgeSegmentRowsThenRowBase, spanWidthOrRedStepOrBottomRedQ16, 33423689, leftRedQ16 - spanWidthOrRedStepOrBottomRedQ16 * edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanGreenStepOrBlueStepOrBottomBlueQ16, leftGreenQ16 - edgeSwapOrRowBaseOrLowerRowsThenLeftX * spanRedStepOrGreenStepOrBottomGreenQ16, spanRedStepOrGreenStepOrBottomGreenQ16, spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, -(edgeSwapOrRowBaseOrLowerRowsThenLeftX * spanGreenStepOrBlueStepOrBottomBlueQ16) + leftBlueQ16, destinationPixels);
                          if (controlFlagSnapshot == 0) {
                            break L30;
                          }
                        }
                        jf.drawHalfBlendRgbGradientSpan(edgeSwapOrRowBaseOrLowerRowsThenLeftX + edgeSegmentRowsThenRowBase, spanWidthOrRedStepOrBottomRedQ16, 33423689, leftRedQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, leftGreenQ16, spanRedStepOrGreenStepOrBottomGreenQ16, spanStartOrWidthOrBottomXQ16, leftBlueQ16, destinationPixels);
                      }
                      if (controlFlagSnapshot == 0) {
                        break L27;
                      }
                    }
                    if ((edgeSwapOrRowBaseOrLowerRowsThenLeftX >= 0) &&
                        (TriangleRasterState.clipWidth > edgeSwapOrRowBaseOrLowerRowsThenLeftX)) {
                      jf.drawHalfBlendRgbGradientSpan(edgeSegmentRowsThenRowBase + edgeSwapOrRowBaseOrLowerRowsThenLeftX, 0, 33423689, leftRedQ16, 0, leftGreenQ16, 0, spanStartOrWidthOrBottomXQ16, leftBlueQ16, destinationPixels);
                    }
                  }
                }
                topY++;
                if (~TriangleRasterState.clipHeight >= ~topY) {
                  return;
                }
                rightXQ16 = rightXQ16 + rightXStepQ16;
                rightRedQ16 = rightRedQ16 + rightRedStepQ16;
                edgeSegmentRowsThenRowBase = edgeSegmentRowsThenRowBase + SoftwareRasterizer.stride;
                leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16;
                rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16;
                leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16;
                leftRedQ16 = leftRedQ16 + leftRedStepQ16;
                leftXQ16 = leftXQ16 + leftXStepQ16;
                rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16;
                if (controlFlagSnapshot == 0) {
                  continue;
                }
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtRasterParameter) {
          caughtRasterFailure = caughtRasterParameter;
          rasterFailure = caughtRasterFailure;
          rasterFailureBeforeContext = (RuntimeException) (rasterFailure);
          rasterMessagePrefix = new StringBuilder().append("wh.KA(").append(bottomGreen).append(',').append(topRed).append(',').append(topX).append(',').append(middleGreen).append(',').append(bottomY).append(',').append(bottomBlue).append(',').append(bottomRed).append(',').append(middleBlue).append(',').append(topY).append(',').append(middleX).append(',').append(middleRed).append(',');
          if (destinationPixels == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rasterFailureBeforeContext), ((StringBuilder) (Object) rasterMessagePrefix).append(destinationDescription).append(',').append(topGreen).append(',').append(bottomX).append(',').append(topBlue).append(',').append(middleY).append(',').append(guard).append(')').toString());
        }
    }

    final static void a(ByteArrayBuffer param0, boolean param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var5 = 0;
            int stackIn_17_0 = 0;
            int stackIn_17_1 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_36_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            var5 = Geoblox.field_C;
            try {
              L0: {
                var2 = new byte[24];
                if (null != af.field_b) {
                  try {
                    L2: {
                      af.field_b.seek(51, 0L);
                      af.field_b.readAll((byte) -76, var2);
                      var3_int = 0;
                      while (true) {
                        L4: {
                          L5: {
                            if (var3_int < 24) {
                              stackIn_17_0 = ~var2[var3_int];
                              stackIn_17_1 = -1;
                              if (var5 != 0) {
                                break L4;
                              }
                              if ((stackIn_17_0 != stackIn_17_1) &&
                                  (var5 == 0)) {
                                break L5;
                              }
                              var3_int++;
                              if (var5 == 0) {
                                continue;
                              }
                            }
                          }
                          stackIn_17_0 = 24;
                          stackIn_17_1 = var3_int;
                        }
                        if (stackIn_17_0 <= stackIn_17_1) {
                          throw new IOException();
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      while (var4 < 24) {
                        var2[var4] = (byte) -1;
                        var4++;
                        if (var5 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L7;
                        }
                        if (var5 == 0) {
                          continue;
                        }
                        break;
                      }
                      decompiledRegionSelector0 = 0;
                      break L7;
                    }
                  }
                  if (!(decompiledRegionSelector0 == 0)) {
                    break L0;
                  }
                }
                param0.writeBytes(24, -97, var2, 0);
              }
              if (!param1) {
                field_t = (ck) null;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_35_0 = (RuntimeException) (runtimeException);
              stackIn_35_1 = new StringBuilder().append("wh.IA(");
              if (param0 == null) {
                stackIn_36_2 = "null";
              } else {
                stackIn_36_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 5514) {
            SpriteState.f(32);
          }
          field_q = null;
          field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "wh.LA(" + param0 + ')');
        }
    }

    final static boolean e(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = cf.field_i;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "wh.NA(" + param0 + ')');
        }
    }

    SpriteState() {
    }

    static {
        field_q = null;
        field_t = new ck(9, 0, 4, 1);
    }
}
