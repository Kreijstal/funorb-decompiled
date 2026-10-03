/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    String field_d;
    String field_a;
    boolean field_c;
    static int field_b;

    final static void updateSpawnQueue(int methodGuard) {
        RuntimeException caughtSpawnQueueFailure = null;
        GameplayEntity queuedEntityThenPooledEntity = null;
        RuntimeException spawnQueueFailureForContext = null;
        double spawnAngleRadians = 0.0;
        float spawnPositionX = 0.0f;
        float spawnPositionY = 0.0f;
        float inwardDirectionX = 0.0f;
        float inwardDirectionY = 0.0f;
        double inverseSpawnDistance = 0.0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          queuedEntityThenPooledEntity = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
          L0: while (true) {
            L1: {
              if (queuedEntityThenPooledEntity != null) {
                queuedEntityThenPooledEntity.advanceEntityAnimation(true);
                queuedEntityThenPooledEntity = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.nextForIteration(1));
                if (clientControlFlowGuard != 0) {
                  break L1;
                }
                if (clientControlFlowGuard == 0) {
                  continue L0;
                }
              }
              if (methodGuard != 255) {
                field_b = -11;
              }
            }
            L3: {
              L4: {
                if (kj.heldInternalKeys[99]) {
                  if (ArchiveNetworkClient.movingEntities.isEmpty(13519)) {
                    break L4;
                  }
                }
                if (~kb.spawnReleaseIntervalTicks <= ~kc.ticksSinceLastEntityRelease) {
                  if (ul.releasedInCurrentTheme != 0) {
                    break L3;
                  }
                  if (el.gameplaySession.tutorialMode) {
                    break L3;
                  }
                }
              }
              if (0 < SecondaryDeque.spawnQueue.countNodes(methodGuard ^ -170)) {
                if (!el.gameplaySession.spawnReleaseDisabled) {
                  ArchiveNetworkClient.movingEntities.addLast(-48, SecondaryDeque.spawnQueue.removeFirst((byte) -124));
                  hd.recordEntityRelease(2);
                  kc.ticksSinceLastEntityRelease = 0;
                }
              }
            }
            kc.ticksSinceLastEntityRelease = kc.ticksSinceLastEntityRelease + 1;
            if (SecondaryDeque.spawnQueue.countNodes(methodGuard ^ 143) < 3) {
              if (ma.c((byte) -53)) {
                if (!el.gameplaySession.canAdvanceSession(true)) {
                  queuedEntityThenPooledEntity = (GameplayEntity) ((Object) ra.availableEntities.removeFirst((byte) -101));
                  if (null != queuedEntityThenPooledEntity) {
                    spawnAngleRadians = 2.0 * Math.random() * 3.141592653589793;
                    spawnPositionX = 240.0f * (float)Math.cos(spawnAngleRadians) + 320.0f;
                    spawnPositionY = 240.0f + (float)Math.sin(spawnAngleRadians) * 240.0f;
                    inwardDirectionX = 320.0f - spawnPositionX;
                    inwardDirectionY = -spawnPositionY + 240.0f;
                    inverseSpawnDistance = 1.0 / Math.sqrt((double)(inwardDirectionY * inwardDirectionY + inwardDirectionX * inwardDirectionX));
                    inwardDirectionY = (float)((double)inwardDirectionY * inverseSpawnDistance);
                    inwardDirectionX = (float)((double)inwardDirectionX * inverseSpawnDistance);
                    queuedEntityThenPooledEntity.initializeEntityMotion(101, spawnPositionX, vd.chooseSpawnSpriteKind(methodGuard ^ 741924143), og.entityMotionSpeed * inwardDirectionX, nf.chooseSpawnSpriteVariant((byte) -67), kc.ticksSinceLastEntityRelease + kb.spawnReleaseIntervalTicks * (1 + SecondaryDeque.spawnQueue.countNodes(111)), 0.0f, spawnPositionY, inwardDirectionY * og.entityMotionSpeed, ij.chooseSpawnEntityCategory(methodGuard ^ 131), 0.0f);
                    SecondaryDeque.spawnQueue.addLast(-47, queuedEntityThenPooledEntity);
                    mf.b(false);
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException spawnQueueFailure) {
          caughtSpawnQueueFailure = spawnQueueFailure;
          spawnQueueFailureForContext = caughtSpawnQueueFailure;
          throw t.a((Throwable) ((Object) spawnQueueFailureForContext), "lc.E(" + methodGuard + ')');
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -2) {
            lc.a((byte) -59);
          }
          oi.field_e = param0;
          ArchiveRequest.field_s = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var3);
          stackIn_8_1 = new StringBuilder().append("lc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void blendScaledDebugOverviewPixels(int sampleXQ16, int destinationHeight, int[] destinationPixels, int sampleXStepQ16, int sampleYStepQ16, int sourceStride, int sampleYQ16, int destinationRowSkip, int destinationIndex, int destinationWidth, byte methodGuard, int[] overviewPixels, int sampleColor) {
        int destinationIndexBeforeIncrement = 0;
        int sampleColorOrRowStartXQ16 = 0;
        RuntimeException blendFailureBeforeArrayDescriptions = null;
        StringBuilder blendMessagePrefix = null;
        String destinationArrayArgumentDescription = null;
        StringBuilder blendMessageBeforeSourceDescription = null;
        String sourceArrayArgumentDescription = null;
        RuntimeException caughtBlendFailure = null;
        int rowStartXQ16 = 0;
        RuntimeException blendFailureForContext = null;
        int debugTintRgb = 0;
        int debugTintRed = 0;
        int debugTintGreenPacked = 0;
        int debugTintBlue = 0;
        int negativeRowCounter = 0;
        int sourceRowOffset = 0;
        int negativeColumnCounter = 0;
        int destinationRgb = 0;
        int doubledDestinationRed = 0;
        int destinationGreen = 0;
        int destinationBlue = 0;
        int weightedDestinationGrayOrTintedRgb = 0;
        int inverseSourceGrayWeight = 0;
        int tintedRed = 0;
        int tintedGreen = 0;
        int tintedBlue = 0;
        int weightedTintRed = 0;
        int weightedTintGreen = 0;
        int weightedTintBlue = 0;
        int modulatedRedThenWeighted = 0;
        int modulatedGreenThenWeighted = 0;
        int modulatedBlueThenWeighted = 0;
        int sourceGrayWeight = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          if (methodGuard > -74) {
            field_b = 78;
          }
          rowStartXQ16 = sampleXQ16;
          debugTintRgb = 1122867;
          debugTintRed = (debugTintRgb & 16711680) >>> 16;
          debugTintGreenPacked = debugTintRgb & 65280;
          debugTintBlue = debugTintRgb & 255;
          negativeRowCounter = -destinationHeight;
          L1: while (true) {
            L2: {
              L3: {
                if (negativeRowCounter < 0) {
                  sourceRowOffset = sourceStride * (sampleYQ16 >> 16);
                  if (clientControlFlowGuard != 0) {
                    break L2;
                  }
                  {
                    negativeColumnCounter = -destinationWidth;
                    L4: while (true) {
                      L5: {
                        if (negativeColumnCounter < 0) {
                          sampleColor = overviewPixels[sourceRowOffset + (sampleXQ16 >> 16)];
                          sampleXQ16 = sampleXQ16 + sampleXStepQ16;
                          sampleColorOrRowStartXQ16 = sampleColor;
                          if (clientControlFlowGuard != 0) {
                            break L5;
                          }
                          L7: {
                            if (sampleColorOrRowStartXQ16 == 0) {
                              destinationIndex++;
                              if (clientControlFlowGuard == 0) {
                                break L7;
                              }
                            }
                            destinationRgb = destinationPixels[destinationIndex];
                            if (destinationRgb == 0) {
                              destinationIndex++;
                              if (clientControlFlowGuard == 0) {
                                break L7;
                              }
                            }
                            doubledDestinationRed = 510 & destinationRgb >> 15;
                            destinationGreen = (destinationRgb & 65429) >> 8;
                            destinationBlue = 255 & destinationRgb;
                            weightedDestinationGrayOrTintedRgb = (destinationBlue + doubledDestinationRed) / 3 + destinationGreen >> 1;
                            inverseSourceGrayWeight = -(((255 & sampleColor) + (sampleColor >> 8 & 255) + (sampleColor >> 16 & 255)) / 3) + 256;
                            tintedRed = debugTintRed * (weightedDestinationGrayOrTintedRgb << 16 >>> 16) >>> 8;
                            tintedGreen = (weightedDestinationGrayOrTintedRgb << 8) * debugTintGreenPacked >>> 24;
                            tintedBlue = debugTintBlue * weightedDestinationGrayOrTintedRgb >>> 8;
                            weightedDestinationGrayOrTintedRgb = (tintedGreen << 8) + (tintedRed << 16) + tintedBlue;
                            weightedTintRed = inverseSourceGrayWeight * ((16711680 & weightedDestinationGrayOrTintedRgb) >> 16);
                            weightedTintGreen = (255 & weightedDestinationGrayOrTintedRgb >> 8) * inverseSourceGrayWeight;
                            weightedTintBlue = (weightedDestinationGrayOrTintedRgb & 255) * inverseSourceGrayWeight;
                            modulatedRedThenWeighted = ((16711680 & destinationRgb) >>> 16) * ((sampleColor & 16711680) >>> 16) >>> 8;
                            modulatedGreenThenWeighted = (destinationRgb & 65280) * (sampleColor & 65280) >>> 24;
                            modulatedBlueThenWeighted = (255 & destinationRgb) * (255 & sampleColor) >>> 8;
                            sourceGrayWeight = 256 - inverseSourceGrayWeight;
                            modulatedRedThenWeighted = modulatedRedThenWeighted * sourceGrayWeight;
                            modulatedGreenThenWeighted = modulatedGreenThenWeighted * sourceGrayWeight;
                            modulatedBlueThenWeighted = modulatedBlueThenWeighted * sourceGrayWeight;
                            destinationIndexBeforeIncrement = destinationIndex;
                            destinationIndex++;
                            destinationPixels[destinationIndexBeforeIncrement] = (weightedTintBlue + modulatedBlueThenWeighted >> 8) + ((modulatedGreenThenWeighted + weightedTintGreen >> 8 << 8) + (weightedTintRed + modulatedRedThenWeighted >> 8 << 16));
                          }
                          negativeColumnCounter++;
                          if (clientControlFlowGuard == 0) {
                            continue L4;
                          }
                        }
                        sampleYQ16 = sampleYQ16 + sampleYStepQ16;
                        destinationIndex = destinationIndex + destinationRowSkip;
                        sampleColorOrRowStartXQ16 = rowStartXQ16;
                      }
                      sampleXQ16 = sampleColorOrRowStartXQ16;
                      negativeRowCounter++;
                      if (clientControlFlowGuard == 0) {
                        continue L1;
                      }
                      break L3;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException debugOverviewBlendFailure) {
          caughtBlendFailure = debugOverviewBlendFailure;
          blendFailureForContext = caughtBlendFailure;
          blendFailureBeforeArrayDescriptions = (RuntimeException) (blendFailureForContext);
          blendMessagePrefix = new StringBuilder().append("lc.C(").append(sampleXQ16).append(',').append(destinationHeight).append(',');
          if (destinationPixels == null) {
            destinationArrayArgumentDescription = "null";
          } else {
            destinationArrayArgumentDescription = "{...}";
          }
          blendMessageBeforeSourceDescription = ((StringBuilder) (Object) blendMessagePrefix).append(destinationArrayArgumentDescription).append(',').append(sampleXStepQ16).append(',').append(sampleYStepQ16).append(',').append(sourceStride).append(',').append(sampleYQ16).append(',').append(destinationRowSkip).append(',').append(destinationIndex).append(',').append(destinationWidth).append(',').append(methodGuard).append(',');
          if (overviewPixels == null) {
            sourceArrayArgumentDescription = "null";
          } else {
            sourceArrayArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) blendFailureBeforeArrayDescriptions), ((StringBuilder) (Object) blendMessageBeforeSourceDescription).append(sourceArrayArgumentDescription).append(',').append(sampleColor).append(')').toString());
        }
    }

    final static MonochromeBitmapFont buildMonochromeFontFromDecodedSprites(int methodGuard, byte[] metrics) {
        MonochromeBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        Object nullFontBeforeReturn = null;
        MonochromeBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (null == metrics) {
            nullFontBeforeReturn = null;
            return (MonochromeBitmapFont) ((Object) nullFontBeforeReturn);
          }
          if (methodGuard != 4520) {
            lc.blendScaledDebugOverviewPixels(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
          }
          font = new MonochromeBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, md.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, hl.decodedSpriteHeights, mj.decodedSpriteIndices);
          kj.clearDecodedSpriteWorkingArrays(true);
          fontBeforeReturn = (MonochromeBitmapFont) (font);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = (RuntimeException) (fontFailureForContext);
          fontMessagePrefix = new StringBuilder().append("lc.B(").append(methodGuard).append(',');
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        j stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        j var5 = null;
        String var5_ref = null;
        String var6 = null;
        j var6_ref = null;
        String var7 = null;
        j var7_ref = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          if (param0 != 104) {
            field_b = 67;
          }
          var1 = eh.field_d;
          var2 = var1.readUnsignedByte((byte) 34);
          if (var2 == 0) {
            if (ug.field_a == null) {
              ug.field_a = new vg(128);
              ca.field_i = 0;
            }
            stackIn_15_0 = (var1.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var4_ref_String = var1.readNullTerminatedText((byte) 105);
            if (var3_int != 0) {
              var1.readNullTerminatedText((byte) 108);
            }
            var5 = ud.a(0, var4_ref_String);
            var6 = var1.readNullTerminatedText((byte) 103);
            var7 = oe.a((CharSequence) ((Object) var4_ref_String), 12);
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = ud.a(param0 ^ 104, var6);
              if (var5 != null) {
                ug.field_a.a((long)var7.hashCode(), 113, var5);
              }
            }
            if (null == var5) {
              var5 = new j();
              ug.field_a.a((long)var7.hashCode(), 94, var5);
              fieldTemp$0 = ca.field_i;
              ca.field_i = ca.field_i + 1;
              var5.field_kb = fieldTemp$0;
              di.field_e.addLast(param0 ^ -86, var5);
            }
            var5.field_hb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (vk.field_a == 1) {
                vk.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (vk.field_a == 2) {
                vk.field_a = 1;
              }
              return;
            }
            if (var2 != 4) {
              gi.a((Throwable) null, "F1: " + og.e(55), (byte) 125);
              Bzip2DecoderState.a((byte) -119);
              return;
            }
            {
              vk.field_a = 1;
              var3 = var1.readNullTerminatedText((byte) 122);
              eg.field_l = ((String) (var3)).intern();
              var4 = var1.readUnsignedByte((byte) 34);
              pi.c(var4, param0 ^ -12742);
              return;
            }
          }
          {
            if (ArchiveSource.field_a == null) {
              ArchiveSource.field_a = new vg(128);
              mg.field_g = 0;
            }
            var3 = var1.readNullTerminatedText((byte) 108);
            if (((String) (var3)).equals("")) {
              var3 = null;
            }
            var4_ref_String = var1.readNullTerminatedText((byte) 102);
            var5_ref = var1.readNullTerminatedText((byte) 110);
            var6_ref = jg.a((byte) -62, var4_ref_String);
            if (null == var6_ref) {
              var6_ref = jg.a((byte) -62, var5_ref);
              if (null != var6_ref) {
                ArchiveSource.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), 12).hashCode(), -63, var6_ref);
              }
            }
            if (null == var6_ref) {
              var6_ref = new j();
              ArchiveSource.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), param0 ^ 100).hashCode(), 110, var6_ref);
              fieldTemp$1 = mg.field_g;
              mg.field_g = mg.field_g + 1;
              var6_ref.field_kb = fieldTemp$1;
              hl.field_B.addLast(-59, var6_ref);
            }
            if (var3 != null) {
              var3 = ((String) (var3)).intern();
            }
            var6_ref.field_hb = var4_ref_String;
            var6_ref.field_mb = (String) (var3);
            var6_ref.unlinkNode(false);
            var7_ref = (j) ((Object) hl.field_B.firstForIteration(0));
            L14: while (true) {
              L15: {
                if (null != var7_ref) {
                  stackIn_61_0 = (j) (var6_ref);
                  if (var8 != 0) {
                    break L15;
                  }
                  if (ul.a(stackIn_61_0, var7_ref, (byte) 127)) {
                    var7_ref = (j) ((Object) hl.field_B.nextForIteration(1));
                    if (var8 == 0) {
                      continue L14;
                    }
                  }
                }
                stackIn_61_0 = (j) (var7_ref);
              }
              L17: {
                if (stackIn_61_0 == null) {
                  hl.field_B.addLast(-39, var6_ref);
                  if (var8 == 0) {
                    break L17;
                  }
                }
                PointerInputListener.a(var7_ref, 121, var6_ref);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.D(" + param0 + ')');
        }
    }

    static {
    }
}
