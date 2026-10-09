/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicDecodeStage {
    private int[] classMasterbooks;
    private static int[] sharedFloorX;
    private int[][] classSubclassBooks;
    private int[] classDimensions;
    private int[] configuredFloorX;
    private int[] partitionClasses;
    private int floorMultiplier;
    private static boolean[] sharedStepFlags;
    private static int[] sharedFloorY;
    private static float[] inverseDbGains;
    private int[] classSubclassBits;
    private static int[] multiplierRanges;

    private final void sortFloorPoints(int startIndex, int endIndexInclusive) {
        int scanIndex = 0;
        int partitionIndex;
        int pivotX;
        int pivotY;
        int pivotStepFlagValue;
        int candidateX;
        if (startIndex >= endIndexInclusive) {
          return;
        }
        partitionIndex = startIndex;
        pivotX = sharedFloorX[partitionIndex];
        pivotY = sharedFloorY[partitionIndex];
        pivotStepFlagValue = sharedStepFlags[partitionIndex] ? 1 : 0;
        for (scanIndex = startIndex + 1; scanIndex <= endIndexInclusive; scanIndex++) {
          candidateX = sharedFloorX[scanIndex];
          if (candidateX >= pivotX) {
            continue;
          }
          sharedFloorX[partitionIndex] = candidateX;
          sharedFloorY[partitionIndex] = sharedFloorY[scanIndex];
          sharedStepFlags[partitionIndex] = sharedStepFlags[scanIndex];
          partitionIndex++;
          sharedFloorX[scanIndex] = sharedFloorX[partitionIndex];
          sharedFloorY[scanIndex] = sharedFloorY[partitionIndex];
          sharedStepFlags[scanIndex] = sharedStepFlags[partitionIndex];
        }
        sharedFloorX[partitionIndex] = pivotX;
        sharedFloorY[partitionIndex] = pivotY;
        sharedStepFlags[partitionIndex] = pivotStepFlagValue != 0;
        this.sortFloorPoints(startIndex, partitionIndex - 1);
        this.sortFloorPoints(partitionIndex + 1, endIndexInclusive);
    }

    private final static int findLowNeighbor(int[] xPoints, int pointIndex) {
        int earlierPointIndex = 0;
        int currentX;
        int neighborIndex;
        int bestNeighborX;
        int candidateX;
        currentX = xPoints[pointIndex];
        neighborIndex = -1;
        bestNeighborX = -2147483648;
        for (earlierPointIndex = 0; earlierPointIndex < pointIndex; earlierPointIndex++) {
          candidateX = xPoints[earlierPointIndex];
          if (candidateX >= currentX) {
            continue;
          }
          if (candidateX <= bestNeighborX) {
            continue;
          }
          neighborIndex = earlierPointIndex;
          bestNeighborX = candidateX;
        }
        return neighborIndex;
    }

    private final static int findHighNeighbor(int[] xPoints, int pointIndex) {
        int earlierPointIndex = 0;
        int currentX;
        int neighborIndex;
        int bestNeighborX;
        int candidateX;
        currentX = xPoints[pointIndex];
        neighborIndex = -1;
        bestNeighborX = 2147483647;
        for (earlierPointIndex = 0; earlierPointIndex < pointIndex; earlierPointIndex++) {
          candidateX = xPoints[earlierPointIndex];
          if (candidateX <= currentX) {
            continue;
          }
          if (candidateX >= bestNeighborX) {
            continue;
          }
          neighborIndex = earlierPointIndex;
          bestNeighborX = candidateX;
        }
        return neighborIndex;
    }

    private final int predictFloorY(int x0, int y0, int x1, int y1, int x) {
        int deltaY = y1 - y0;
        int deltaX = x1 - x0;
        int absoluteDeltaY = deltaY < 0 ? -deltaY : deltaY;
        int scaledDistance = absoluteDeltaY * (x - x0);
        int interpolatedOffset = scaledDistance / deltaX;
        return deltaY < 0 ? y0 - interpolatedOffset : y0 + interpolatedOffset;
    }

    final void applyFloorCurve(float[] spectrum, int sampleLimit) {
        int minRoomBeforeDoubling = 0;
        int[] largeResidualYArray = null;
        int largeResidualYIndex = 0;
        int largeResidualYResult = 0;
        int[] smallResidualYArray = null;
        int smallResidualYIndex = 0;
        int smallResidualYResult = 0;
        int pointCount;
        int multiplierRange;
        boolean[] initialStepFlagsAlias;
        int reconstructionIndexOrLineStartX;
        int lowNeighborIndexOrLineStartY;
        int highNeighborIndexOrUnusedActiveCursorSnapshot;
        float tailGain;
        int predictedYOrLineEndXOrTailIndex;
        int encodedResidualOrLineEndY;
        int highRoom;
        int lowRoom;
        int doubledRoom;
        boolean[] activatedStepFlagsAlias;
        int lowNeighborForActivation;
        int activePointIndex;
        pointCount = this.configuredFloorX.length;
        multiplierRange = multiplierRanges[this.floorMultiplier - 1];
        initialStepFlagsAlias = sharedStepFlags;
        sharedStepFlags[1] = true;
        initialStepFlagsAlias[0] = true;
        reconstructionIndexOrLineStartX = 2;
        while (true) {
          if (reconstructionIndexOrLineStartX >= pointCount) {
            this.sortFloorPoints(0, pointCount - 1);
            reconstructionIndexOrLineStartX = 0;
            lowNeighborIndexOrLineStartY = sharedFloorY[0] * this.floorMultiplier;
            activePointIndex = 1;
            highNeighborIndexOrUnusedActiveCursorSnapshot = activePointIndex;
            while (true) {
              if (activePointIndex >= pointCount) {
                tailGain = inverseDbGains[lowNeighborIndexOrLineStartY];
                for (predictedYOrLineEndXOrTailIndex = reconstructionIndexOrLineStartX; predictedYOrLineEndXOrTailIndex < sampleLimit; predictedYOrLineEndXOrTailIndex++) {
                  spectrum[predictedYOrLineEndXOrTailIndex] = spectrum[predictedYOrLineEndXOrTailIndex] * tailGain;
                }
                return;
              }
              if (!sharedStepFlags[activePointIndex]) {
                activePointIndex++;
                continue;
              }
              predictedYOrLineEndXOrTailIndex = sharedFloorX[activePointIndex];
              encodedResidualOrLineEndY = sharedFloorY[activePointIndex] * this.floorMultiplier;
              this.applyFloorLine(reconstructionIndexOrLineStartX, lowNeighborIndexOrLineStartY, predictedYOrLineEndXOrTailIndex, encodedResidualOrLineEndY, spectrum, sampleLimit);
              if (predictedYOrLineEndXOrTailIndex >= sampleLimit) {
                return;
              }
              reconstructionIndexOrLineStartX = predictedYOrLineEndXOrTailIndex;
              lowNeighborIndexOrLineStartY = encodedResidualOrLineEndY;
              activePointIndex++;
            }
          }
          lowNeighborIndexOrLineStartY = MusicDecodeStage.findLowNeighbor(sharedFloorX, reconstructionIndexOrLineStartX);
          highNeighborIndexOrUnusedActiveCursorSnapshot = MusicDecodeStage.findHighNeighbor(sharedFloorX, reconstructionIndexOrLineStartX);
          predictedYOrLineEndXOrTailIndex = this.predictFloorY(sharedFloorX[lowNeighborIndexOrLineStartY], sharedFloorY[lowNeighborIndexOrLineStartY], sharedFloorX[highNeighborIndexOrUnusedActiveCursorSnapshot], sharedFloorY[highNeighborIndexOrUnusedActiveCursorSnapshot], sharedFloorX[reconstructionIndexOrLineStartX]);
          encodedResidualOrLineEndY = sharedFloorY[reconstructionIndexOrLineStartX];
          highRoom = multiplierRange - predictedYOrLineEndXOrTailIndex;
          lowRoom = predictedYOrLineEndXOrTailIndex;
          minRoomBeforeDoubling = (highRoom >= lowRoom) ? lowRoom : highRoom;
          doubledRoom = minRoomBeforeDoubling << 1;
          if (encodedResidualOrLineEndY == 0) {
            sharedStepFlags[reconstructionIndexOrLineStartX] = false;
            sharedFloorY[reconstructionIndexOrLineStartX] = predictedYOrLineEndXOrTailIndex;
            reconstructionIndexOrLineStartX++;
            continue;
          }
          activatedStepFlagsAlias = sharedStepFlags;
          lowNeighborForActivation = lowNeighborIndexOrLineStartY;
          sharedStepFlags[highNeighborIndexOrUnusedActiveCursorSnapshot] = true;
          activatedStepFlagsAlias[lowNeighborForActivation] = true;
          sharedStepFlags[reconstructionIndexOrLineStartX] = true;
          if (encodedResidualOrLineEndY < doubledRoom) {
            smallResidualYArray = (int[]) (sharedFloorY);
            smallResidualYIndex = reconstructionIndexOrLineStartX;
            if ((encodedResidualOrLineEndY & 1) == 0) {
              smallResidualYResult = predictedYOrLineEndXOrTailIndex + encodedResidualOrLineEndY / 2;
            } else {
              smallResidualYResult = predictedYOrLineEndXOrTailIndex - (encodedResidualOrLineEndY + 1) / 2;
            }
            smallResidualYArray[smallResidualYIndex] = smallResidualYResult;
            reconstructionIndexOrLineStartX++;
            continue;
          }
          largeResidualYArray = (int[]) (sharedFloorY);
          largeResidualYIndex = reconstructionIndexOrLineStartX;
          if (highRoom <= lowRoom) {
            largeResidualYResult = predictedYOrLineEndXOrTailIndex - encodedResidualOrLineEndY + highRoom - 1;
          } else {
            largeResidualYResult = encodedResidualOrLineEndY - lowRoom + predictedYOrLineEndXOrTailIndex;
          }
          largeResidualYArray[largeResidualYIndex] = largeResidualYResult;
          reconstructionIndexOrLineStartX++;
        }
    }

    final boolean decodeFloorPacket() {
        int partitionIndex = 0;
        int pointWithinClass = 0;
        int decodedYIndexBeforeIncrement = 0;
        int floorPresentBeforeStore = 0;
        int[] decodedYArray = null;
        int decodedYIndex = 0;
        int decodedYValue = 0;
        int floorPresentValue;
        int pointCount;
        int multiplierRange;
        int initialYBitCount;
        int pointCursor;
        int partitionClass;
        int classDimension;
        int subclassBits;
        int subclassMask;
        int masterbookValueOrSubclassSelector;
        int subclassBook;
        floorPresentBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
        floorPresentValue = floorPresentBeforeStore;
        if (floorPresentValue == 0) {
          return false;
        }
        pointCount = this.configuredFloorX.length;
        System.arraycopy(this.configuredFloorX, 0, sharedFloorX, 0, pointCount);
        multiplierRange = multiplierRanges[this.floorMultiplier - 1];
        initialYBitCount = SpriteConstructionSupport.unsignedBitLength((byte) 58, multiplierRange - 1);
        sharedFloorY[0] = MusicDecoder.readBits(initialYBitCount);
        sharedFloorY[1] = MusicDecoder.readBits(initialYBitCount);
        pointCursor = 2;
        for (partitionIndex = 0; partitionIndex < this.partitionClasses.length; partitionIndex++) {
          partitionClass = this.partitionClasses[partitionIndex];
          classDimension = this.classDimensions[partitionClass];
          subclassBits = this.classSubclassBits[partitionClass];
          subclassMask = (1 << subclassBits) - 1;
          masterbookValueOrSubclassSelector = 0;
          if (subclassBits > 0) {
            masterbookValueOrSubclassSelector = MusicDecoder.codebooks[this.classMasterbooks[partitionClass]].readScalar();
          }
          for (pointWithinClass = 0; pointWithinClass < classDimension; pointWithinClass++) {
            subclassBook = this.classSubclassBooks[partitionClass][masterbookValueOrSubclassSelector & subclassMask];
            masterbookValueOrSubclassSelector = masterbookValueOrSubclassSelector >>> subclassBits;
            decodedYIndexBeforeIncrement = pointCursor;
            pointCursor++;
            decodedYArray = (int[]) (sharedFloorY);
            decodedYIndex = decodedYIndexBeforeIncrement;
            if (subclassBook < 0) {
              decodedYValue = 0;
            } else {
              decodedYValue = MusicDecoder.codebooks[subclassBook].readScalar();
            }
            decodedYArray[decodedYIndex] = decodedYValue;
          }
        }
        return true;
    }

    private final void applyFloorLine(int x0, int y0, int x1, int y1, float[] spectrum, int sampleLimit) {
        int xIndex = 0;
        int deltaY = y1 - y0;
        int deltaX = x1 - x0;
        int absoluteDeltaYOrRemainder = deltaY < 0 ? -deltaY : deltaY;
        int baseStep = deltaY / deltaX;
        int currentY = y0;
        int errorAccumulator = 0;
        int correctionStep = deltaY < 0 ? baseStep - 1 : baseStep + 1;
        absoluteDeltaYOrRemainder = absoluteDeltaYOrRemainder - (baseStep < 0 ? -baseStep : baseStep) * deltaX;
        spectrum[x0] = spectrum[x0] * inverseDbGains[currentY];
        if (x1 > sampleLimit) {
            x1 = sampleLimit;
        }
        for (xIndex = x0 + 1; xIndex < x1; xIndex++) {
            errorAccumulator = errorAccumulator + absoluteDeltaYOrRemainder;
            if (errorAccumulator >= deltaX) {
                errorAccumulator = errorAccumulator - deltaX;
                currentY = currentY + correctionStep;
            } else {
                currentY = currentY + baseStep;
            }
            spectrum[xIndex] = spectrum[xIndex] * inverseDbGains[currentY];
        }
    }

    MusicDecodeStage() {
        int subclassBitsSnapshot = 0;
        int pointWithinPartition = 0;
        int pointCursorBeforeIncrement = 0;
        int floorType;
        int partitionCount;
        int classCount;
        int partitionOrClassIndexOrRangeBits;
        int classIdOrSubclassBitsOrBookCountOrPointCursor;
        int partitionIndex;
        int[] subclassBooksAlias;
        int subclassBookIndexOrPartitionClass;
        int[] intermediateSubclassBooksAlias;
        int[] allocatedSubclassBooks;
        int partitionOrClassIndexOrRangeBitsPhase2;
        int partitionOrClassIndexOrRangeBitsPhase3;
        int partitionIndexPhase2;
        int subclassBookIndexOrPartitionClassPhase2;
        floorType = MusicDecoder.readBits(16);
        if (floorType != 1) {
          throw new RuntimeException();
        }
        partitionCount = MusicDecoder.readBits(5);
        classCount = 0;
        this.partitionClasses = new int[partitionCount];
        for (partitionOrClassIndexOrRangeBits = 0; partitionOrClassIndexOrRangeBits < partitionCount; partitionOrClassIndexOrRangeBits++) {
          classIdOrSubclassBitsOrBookCountOrPointCursor = MusicDecoder.readBits(4);
          this.partitionClasses[partitionOrClassIndexOrRangeBits] = classIdOrSubclassBitsOrBookCountOrPointCursor;
          if (classIdOrSubclassBitsOrBookCountOrPointCursor < classCount) {
            continue;
          }
          classCount = classIdOrSubclassBitsOrBookCountOrPointCursor + 1;
        }
        this.classDimensions = new int[classCount];
        this.classSubclassBits = new int[classCount];
        this.classMasterbooks = new int[classCount];
        this.classSubclassBooks = new int[classCount][];
        for (partitionOrClassIndexOrRangeBitsPhase2 = 0; partitionOrClassIndexOrRangeBitsPhase2 < classCount; partitionOrClassIndexOrRangeBitsPhase2++) {
          this.classDimensions[partitionOrClassIndexOrRangeBitsPhase2] = MusicDecoder.readBits(3) + 1;
          subclassBitsSnapshot = MusicDecoder.readBits(2);
          this.classSubclassBits[partitionOrClassIndexOrRangeBitsPhase2] = subclassBitsSnapshot;
          classIdOrSubclassBitsOrBookCountOrPointCursor = subclassBitsSnapshot;
          if (classIdOrSubclassBitsOrBookCountOrPointCursor != 0) {
            this.classMasterbooks[partitionOrClassIndexOrRangeBitsPhase2] = MusicDecoder.readBits(8);
          }
          classIdOrSubclassBitsOrBookCountOrPointCursor = 1 << classIdOrSubclassBitsOrBookCountOrPointCursor;
          allocatedSubclassBooks = new int[classIdOrSubclassBitsOrBookCountOrPointCursor];
          intermediateSubclassBooksAlias = allocatedSubclassBooks;
          subclassBooksAlias = intermediateSubclassBooksAlias;
          this.classSubclassBooks[partitionOrClassIndexOrRangeBitsPhase2] = allocatedSubclassBooks;
          for (subclassBookIndexOrPartitionClass = 0; subclassBookIndexOrPartitionClass < classIdOrSubclassBitsOrBookCountOrPointCursor; subclassBookIndexOrPartitionClass++) {
            subclassBooksAlias[subclassBookIndexOrPartitionClass] = MusicDecoder.readBits(8) - 1;
          }
        }
        this.floorMultiplier = MusicDecoder.readBits(2) + 1;
        partitionOrClassIndexOrRangeBitsPhase3 = MusicDecoder.readBits(4);
        classIdOrSubclassBitsOrBookCountOrPointCursor = 2;
        for (partitionIndex = 0; partitionIndex < partitionCount; partitionIndex++) {
          classIdOrSubclassBitsOrBookCountOrPointCursor = classIdOrSubclassBitsOrBookCountOrPointCursor + this.classDimensions[this.partitionClasses[partitionIndex]];
        }
        this.configuredFloorX = new int[classIdOrSubclassBitsOrBookCountOrPointCursor];
        this.configuredFloorX[0] = 0;
        this.configuredFloorX[1] = 1 << partitionOrClassIndexOrRangeBitsPhase3;
        classIdOrSubclassBitsOrBookCountOrPointCursor = 2;
        for (partitionIndexPhase2 = 0; partitionIndexPhase2 < partitionCount; partitionIndexPhase2++) {
          subclassBookIndexOrPartitionClassPhase2 = this.partitionClasses[partitionIndexPhase2];
          for (pointWithinPartition = 0; pointWithinPartition < this.classDimensions[subclassBookIndexOrPartitionClassPhase2]; pointWithinPartition++) {
            pointCursorBeforeIncrement = classIdOrSubclassBitsOrBookCountOrPointCursor;
            classIdOrSubclassBitsOrBookCountOrPointCursor++;
            this.configuredFloorX[pointCursorBeforeIncrement] = MusicDecoder.readBits(partitionOrClassIndexOrRangeBitsPhase3);
          }
        }
        if (sharedFloorX != null &&
            sharedFloorX.length >= classIdOrSubclassBitsOrBookCountOrPointCursor) {
          return;
        }
        sharedFloorX = new int[classIdOrSubclassBitsOrBookCountOrPointCursor];
        sharedFloorY = new int[classIdOrSubclassBitsOrBookCountOrPointCursor];
        sharedStepFlags = new boolean[classIdOrSubclassBitsOrBookCountOrPointCursor];
        return;
    }

    public static void releaseSharedFloorResources() {
        multiplierRanges = null;
        inverseDbGains = null;
        sharedFloorX = null;
        sharedFloorY = null;
        sharedStepFlags = null;
    }

    static {
        inverseDbGains = new float[]{1.0649863213529898e-7f, 1.1341951022814101e-7f, 1.2079014766186447e-7f, 1.2863978327004588e-7f, 1.3699950329737476e-7f, 1.459025043004658e-7f, 1.553840860424316e-7f, 1.654818078122844e-7f, 1.7623574422032107e-7f, 1.8768855625239667e-7f, 1.998856049567621e-7f, 2.128753067154321e-7f, 2.2670913324418507e-7f, 2.4144196686393116e-7f, 2.5713222839840455e-7f, 2.738421187586937e-7f, 2.9163791737119027e-7f, 3.105902237621194e-7f, 3.3077409966608684e-7f, 3.5226966588197683e-7f, 3.7516213069466176e-7f, 3.9954230146577174e-7f, 4.2550681200737017e-7f, 4.531586341727234e-7f, 4.826074473385233e-7f, 5.139700078871101e-7f, 5.473706323755323e-7f, 5.829418796565733e-7f, 6.208247214090079e-7f, 6.611693947888853e-7f, 7.041359140202985e-7f, 7.498946388295735e-7f, 7.98627013409714e-7f, 8.505263053848466e-7f, 9.057982879312476e-7f, 9.646621492720442e-7f, 0.0000010273513453284977f, 0.0000010941143955278676f, 0.0000011652160765152075f, 0.0000012409384453349048f, 0.0000013215816352385445f, 0.0000014074654473006376f, 0.000001498930487286998f, 0.0000015963394162099576f, 0.0000017000785419440945f, 0.0000018105591834682855f, 0.0000019282194898551097f, 0.0000020535260318865767f, 0.0000021869757347303675f, 0.0000023290976969292387f, 0.0000024804558051982895f, 0.0000026416496439196635f, 0.000002813319042616058f, 0.0000029961443033243995f, 0.000003190850520695676f, 0.0000033982100831053685f, 0.000003619044946390204f, 0.000003854230726574315f, 0.0000041047005652217194f, 0.000004371447175799403f, 0.000004655528300645528f, 0.000004958070803695591f, 0.000005280273853713879f, 0.000005623416200251086f, 0.00000598885708313901f, 0.0000063780466916796286f, 0.000006792528438381851f, 0.000007233945325424429f, 0.000007704047675360925f, 0.000008204699952329975f, 0.000008737887583265547f, 0.000009305725143349264f, 0.000009910463631968014f, 0.000010554501386650372f, 0.000011240392268518917f, 0.00001197085566673195f, 0.000012748789231409319f, 0.000013577277968579438f, 0.000014459606063610408f, 0.00001539927143312525f, 0.000016400004824390635f, 0.000017465768905822188f, 0.000018600792827783152f, 0.000019809576770057902f, 0.00002109691376972478f, 0.00002246791154902894f, 0.000023928001610329375f, 0.000025482977434876375f, 0.00002713900539674796f, 0.000028902650228701532f, 0.000030780909582972527f, 0.000032781226764200255f, 0.00003491153256618418f, 0.000037180281651671976f, 0.00003959646710427478f, 0.00004216966772219166f, 0.00004491009167395532f, 0.000047828601964283735f, 0.00005093677464174107f, 0.00005424693154054694f, 0.00005777220212621614f, 0.00006152656715130433f, 0.00006552490958711132f, 0.00006978308374527842f, 0.00007431798439938575f, 0.00007914758316474035f, 0.00008429103763774037f, 0.00008976874960353598f, 0.00009560242324369028f, 0.00010181521065533161f, 0.00010843174095498398f, 0.0001154782366938889f, 0.00012298267392907292f, 0.00013097477494738996f, 0.00013948624837212265f, 0.00014855085464660078f, 0.00015820453700143844f, 0.000168485552421771f, 0.00017943468992598355f, 0.00019109535787720233f, 0.00020351381681393832f, 0.00021673929586540908f, 0.0002308242255821824f, 0.00024582448531873524f, 0.0002617995487526059f, 0.0002788127458188683f, 0.0002969315683003515f, 0.00031622787355445325f, 0.00033677814644761384f, 0.0003586638777051121f, 0.0003819718840532005f, 0.0004067945701535791f, 0.00043323036516085267f, 0.0004613841010723263f, 0.000491367478389293f, 0.0005232992698438466f, 0.0005573062226176262f, 0.0005935230874456465f, 0.0006320935790427029f, 0.000673170608934015f, 0.0007169169839471579f, 0.0007635062793269753f, 0.0008131232461892068f, 0.0008659645682200789f, 0.0009222398512065411f, 0.0009821722051128745f, 0.001045999233610928f, 0.0011139742564409971f, 0.0011863665422424674f, 0.001263463287614286f, 0.0013455701991915703f, 0.0014330128906294703f, 0.0015261381631717086f, 0.00162531528621912f, 0.0017309373943135142f, 0.0018434234661981463f, 0.001963219605386257f, 0.002090800553560257f, 0.002226672600954771f, 0.002371374284848571f, 0.002525479532778263f, 0.0026895992923527956f, 0.0028643847908824682f, 0.0030505286995321512f, 0.0032487690914422274f, 0.0034598924685269594f, 0.003684735856950283f, 0.003924190532416105f, 0.0041792066767811775f, 0.004450794775038958f, 0.004740032833069563f, 0.005048066843301058f, 0.005376118700951338f, 0.005725488997995853f, 0.0060975635424256325f, 0.006493817549198866f, 0.006915822625160217f, 0.007365251425653696f, 0.00784388743340969f, 0.008353627286851406f, 0.008896492421627045f, 0.009474636986851692f, 0.010090352036058903f, 0.010746080428361893f, 0.01144442055374384f, 0.012188144028186798f, 0.012980197556316853f, 0.013823725283145905f, 0.0147220678627491f, 0.01567879132926464f, 0.016697686165571213f, 0.017782796174287796f, 0.018938422203063965f, 0.020169148221611977f, 0.021479854360222816f, 0.02287573553621769f, 0.02436232939362526f, 0.025945531204342842f, 0.027631618082523346f, 0.02942727692425251f, 0.031339626759290695f, 0.03337625041604042f, 0.0355452261865139f, 0.037855155766010284f, 0.04031519964337349f, 0.04293510690331459f, 0.045725274831056595f, 0.04869675636291504f, 0.05186134949326515f, 0.05523158982396126f, 0.058820851147174835f, 0.06264336407184601f, 0.06671427935361862f, 0.0710497498512268f, 0.07566696405410767f, 0.08058422803878784f, 0.08582104742527008f, 0.09139817953109741f, 0.0973377451300621f, 0.10366330295801163f, 0.11039993166923523f, 0.11757434159517288f, 0.12521497905254364f, 0.1333521455526352f, 0.142018124461174f, 0.15124726295471191f, 0.16107617318630219f, 0.17154380679130554f, 0.18269167840480804f, 0.19456401467323303f, 0.20720787346363068f, 0.22067342698574066f, 0.23501402139663696f, 0.2502865493297577f, 0.26655158400535583f, 0.28387361764907837f, 0.30232131481170654f, 0.32196786999702454f, 0.342891126871109f, 0.36517414450645447f, 0.38890519738197327f, 0.4141784608364105f, 0.44109413027763367f, 0.46975889801979065f, 0.5002864599227905f, 0.5327979326248169f, 0.567422091960907f, 0.6042963862419128f, 0.6435669660568237f, 0.6853895783424377f, 0.72993004322052f, 0.7773650288581848f, 0.8278825879096985f, 0.8816830515861511f, 0.9389798045158386f, 1.0f};
        multiplierRanges = new int[]{256, 128, 86, 64};
    }
}
