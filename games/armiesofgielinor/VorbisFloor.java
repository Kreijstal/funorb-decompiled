/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisFloor {
    private int[] classSubclassBits;
    private int[] classDimensions;
    private static float[] inverseDbGains;
    private int[][] classSubbooks;
    private static int[] floorRanges;
    private int[] xList;
    private static boolean[] activePoints;
    private static int[] pointYs;
    private int[] partitionClasses;
    private int multiplier;
    private int[] classMasterbooks;
    private static int[] pointXs;

    public static void releaseScratch() {
        floorRanges = null;
        inverseDbGains = null;
        pointXs = null;
        pointYs = null;
        activePoints = null;
    }

    final boolean decodeFloor() {
        int partitionIndex = 0;
        int classPointIndex = 0;
        int writePointIndex = 0;
        int presenceFlag = 0;
        int[] pointLevelTarget = null;
        int targetPointIndex = 0;
        int decodedPointLevel = 0;
        int present;
        int pointCount;
        int levelRange;
        int levelBits;
        int pointCursor;
        int classId;
        int classDimension;
        int subclassBits;
        int subclassMask;
        int classWord;
        int subbookId;
        presenceFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
        present = presenceFlag;
        if (present == 0) {
          return false;
        }
        pointCount = this.xList.length;
        System.arraycopy(this.xList, 0, pointXs, 0, pointCount);
        levelRange = floorRanges[this.multiplier - 1];
        levelBits = ModalDialog.bitLength(levelRange - 1, -13337);
        pointYs[0] = VorbisSample.readBits(levelBits);
        pointYs[1] = VorbisSample.readBits(levelBits);
        pointCursor = 2;
        for (partitionIndex = 0; partitionIndex < this.partitionClasses.length; partitionIndex++) {
          classId = this.partitionClasses[partitionIndex];
          classDimension = this.classDimensions[classId];
          subclassBits = this.classSubclassBits[classId];
          subclassMask = (1 << subclassBits) - 1;
          classWord = 0;
          if (subclassBits > 0) {
            classWord = VorbisSample.codebooks[this.classMasterbooks[classId]].decodeScalar();
          }
          for (classPointIndex = 0; classPointIndex < classDimension; classPointIndex++) {
            subbookId = this.classSubbooks[classId][classWord & subclassMask];
            classWord = classWord >>> subclassBits;
            writePointIndex = pointCursor;
            pointCursor++;
            pointLevelTarget = (int[]) (pointYs);
            targetPointIndex = writePointIndex;
            if (subbookId < 0) {
              decodedPointLevel = 0;
            } else {
              decodedPointLevel = VorbisSample.codebooks[subbookId].decodeScalar();
            }
            pointLevelTarget[targetPointIndex] = decodedPointLevel;
          }
        }
        return true;
    }

    private final static int lowNeighbour(int[] xs, int pointIndex) {
        int candidateIndex = 0;
        int x;
        int neighbourIndex;
        int nearestX;
        int candidateX;
        x = xs[pointIndex];
        neighbourIndex = -1;
        nearestX = -2147483648;
        for (candidateIndex = 0; candidateIndex < pointIndex; candidateIndex++) {
          candidateX = xs[candidateIndex];
          if (candidateX < x &&
            candidateX > nearestX) {
            neighbourIndex = candidateIndex;
            nearestX = candidateX;
          }
        }
        return neighbourIndex;
    }

    private final void sortPoints(int firstIndex, int lastIndex) {
        int scanIndex = 0;
        int pivotIndex;
        int pivotX;
        int pivotY;
        int pivotActive;
        int candidateX;
        if (firstIndex >= lastIndex) {
          return;
        }
        pivotIndex = firstIndex;
        pivotX = pointXs[pivotIndex];
        pivotY = pointYs[pivotIndex];
        pivotActive = activePoints[pivotIndex] ? 1 : 0;
        for (scanIndex = firstIndex + 1; scanIndex <= lastIndex; scanIndex++) {
          candidateX = pointXs[scanIndex];
          if (candidateX < pivotX) {
            pointXs[pivotIndex] = candidateX;
            pointYs[pivotIndex] = pointYs[scanIndex];
            activePoints[pivotIndex] = activePoints[scanIndex];
            pivotIndex++;
            pointXs[scanIndex] = pointXs[pivotIndex];
            pointYs[scanIndex] = pointYs[pivotIndex];
            activePoints[scanIndex] = activePoints[pivotIndex];
          }
        }
        pointXs[pivotIndex] = pivotX;
        pointYs[pivotIndex] = pivotY;
        activePoints[pivotIndex] = pivotActive != 0;
        this.sortPoints(firstIndex, pivotIndex - 1);
        this.sortPoints(pivotIndex + 1, lastIndex);
    }

    private final int interpolatePoint(int x0, int y0, int x1, int y1, int x) {
        int deltaY = y1 - y0;
        int deltaX = x1 - x0;
        int absoluteDeltaY = deltaY < 0 ? -deltaY : deltaY;
        int scaledDistance = absoluteDeltaY * (x - x0);
        int levelOffset = scaledDistance / deltaX;
        return deltaY < 0 ? y0 - levelOffset : y0 + levelOffset;
    }

    private final static int highNeighbour(int[] xs, int pointIndex) {
        int candidateIndex = 0;
        int x;
        int neighbourIndex;
        int nearestX;
        int candidateX;
        x = xs[pointIndex];
        neighbourIndex = -1;
        nearestX = 2147483647;
        for (candidateIndex = 0; candidateIndex < pointIndex; candidateIndex++) {
          candidateX = xs[candidateIndex];
          if (candidateX > x &&
            candidateX < nearestX) {
            neighbourIndex = candidateIndex;
            nearestX = candidateX;
          }
        }
        return neighbourIndex;
    }

    VorbisFloor() {
        int subclassBits = 0;
        int classPointIndex = 0;
        int writePointIndex = 0;
        int floorType;
        int partitionCount;
        int classCount;
        int partitionIndex;
        int classId;
        int pointCountPartitionIndex;
        int[] subbookIds;
        int subbookIndex;
        int[] subbooksAlias;
        int[] subbooks;
        int classIndex;
        int rangeBits;
        int pointPartitionIndex;
        int pointClassId;
        int subclassBitsOrCount;
        int pointCount;
        int pointCursor;
        floorType = VorbisSample.readBits(16);
        if (floorType != 1) {
          throw new RuntimeException();
        }
        partitionCount = VorbisSample.readBits(5);
        classCount = 0;
        this.partitionClasses = new int[partitionCount];
        for (partitionIndex = 0; partitionIndex < partitionCount; partitionIndex++) {
          classId = VorbisSample.readBits(4);
          this.partitionClasses[partitionIndex] = classId;
          if (classId >= classCount) {
            classCount = classId + 1;
          }
        }
        this.classDimensions = new int[classCount];
        this.classSubclassBits = new int[classCount];
        this.classMasterbooks = new int[classCount];
        this.classSubbooks = new int[classCount][];
        for (classIndex = 0; classIndex < classCount; classIndex++) {
          this.classDimensions[classIndex] = VorbisSample.readBits(3) + 1;
          subclassBits = VorbisSample.readBits(2);
          this.classSubclassBits[classIndex] = subclassBits;
          subclassBitsOrCount = subclassBits;
          if (subclassBitsOrCount != 0) {
            this.classMasterbooks[classIndex] = VorbisSample.readBits(8);
          }
          subclassBitsOrCount = 1 << subclassBitsOrCount;
          subbooks = new int[subclassBitsOrCount];
          subbooksAlias = subbooks;
          subbookIds = subbooksAlias;
          this.classSubbooks[classIndex] = subbooks;
          for (subbookIndex = 0; subbookIndex < subclassBitsOrCount; subbookIndex++) {
            subbookIds[subbookIndex] = VorbisSample.readBits(8) - 1;
          }
        }
        this.multiplier = VorbisSample.readBits(2) + 1;
        rangeBits = VorbisSample.readBits(4);
        pointCount = 2;
        for (pointCountPartitionIndex = 0; pointCountPartitionIndex < partitionCount; pointCountPartitionIndex++) {
          pointCount = pointCount + this.classDimensions[this.partitionClasses[pointCountPartitionIndex]];
        }
        this.xList = new int[pointCount];
        this.xList[0] = 0;
        this.xList[1] = 1 << rangeBits;
        pointCursor = 2;
        for (pointPartitionIndex = 0; pointPartitionIndex < partitionCount; pointPartitionIndex++) {
          pointClassId = this.partitionClasses[pointPartitionIndex];
          for (classPointIndex = 0; classPointIndex < this.classDimensions[pointClassId]; classPointIndex++) {
            writePointIndex = pointCursor;
            pointCursor++;
            this.xList[writePointIndex] = VorbisSample.readBits(rangeBits);
          }
        }
        if (pointXs != null &&
          pointXs.length >= pointCursor) {
          return;
        }
        pointXs = new int[pointCursor];
        pointYs = new int[pointCursor];
        activePoints = new boolean[pointCursor];
        return;
    }

    private final void applyLine(int x0, int y0, int x1, int y1, float[] spectrum, int sampleCount) {
        int x = 0;
        int deltaY = y1 - y0;
        int deltaX = x1 - x0;
        int slopeRemainder = deltaY < 0 ? -deltaY : deltaY;
        int baseStep = deltaY / deltaX;
        int level = y0;
        int error = 0;
        int alternateStep = deltaY < 0 ? baseStep - 1 : baseStep + 1;
        slopeRemainder = slopeRemainder - (baseStep < 0 ? -baseStep : baseStep) * deltaX;
        spectrum[x0] = spectrum[x0] * inverseDbGains[level];
        if (x1 > sampleCount) {
          x1 = sampleCount;
        }
        for (x = x0 + 1; x < x1; x++) {
          error = error + slopeRemainder;
          if (error >= deltaX) {
            error = error - deltaX;
            level = level + alternateStep;
          } else {
            level = level + baseStep;
          }
          spectrum[x] = spectrum[x] * inverseDbGains[level];
        }
    }

    final void applyFloor(float[] spectrum, int sampleCount) {
        int smallerRoom = 0;
        int[] outsideRoomLevels = null;
        int outsideRoomPointIndex = 0;
        int outsideRoomLevel = 0;
        int[] insideRoomLevels = null;
        int insideRoomPointIndex = 0;
        int insideRoomLevel = 0;
        int pointCount;
        int levelRange;
        boolean[] endpointActiveFlags;
        int pointIndex;
        int lowIndex;
        int highIndex;
        float tailGain;
        int predictedLevel;
        int encodedLevel;
        int highRoom;
        int lowRoom;
        int doubleRoom;
        boolean[] lowActiveFlags;
        int lowActiveIndex;
        int renderPointIndex;
        int previousX;
        int previousLevel;
        int initialRenderPointIndex;
        int x;
        int tailX;
        int level;
        pointCount = this.xList.length;
        levelRange = floorRanges[this.multiplier - 1];
        endpointActiveFlags = activePoints;
        activePoints[1] = true;
        endpointActiveFlags[0] = true;
        for (pointIndex = 2; pointIndex < pointCount; pointIndex++) {
          lowIndex = VorbisFloor.lowNeighbour(pointXs, pointIndex);
          highIndex = VorbisFloor.highNeighbour(pointXs, pointIndex);
          predictedLevel = this.interpolatePoint(pointXs[lowIndex], pointYs[lowIndex], pointXs[highIndex], pointYs[highIndex], pointXs[pointIndex]);
          encodedLevel = pointYs[pointIndex];
          highRoom = levelRange - predictedLevel;
          lowRoom = predictedLevel;
          smallerRoom = (highRoom >= lowRoom) ? lowRoom : highRoom;
          doubleRoom = smallerRoom << 1;
          if (encodedLevel == 0) {
            activePoints[pointIndex] = false;
            pointYs[pointIndex] = predictedLevel;
          } else {
            lowActiveFlags = activePoints;
            lowActiveIndex = lowIndex;
            activePoints[highIndex] = true;
            lowActiveFlags[lowActiveIndex] = true;
            activePoints[pointIndex] = true;
            if (encodedLevel < doubleRoom) {
              insideRoomLevels = (int[]) (pointYs);
              insideRoomPointIndex = pointIndex;
              if ((encodedLevel & 1) == 0) {
                insideRoomLevel = predictedLevel + encodedLevel / 2;
              } else {
                insideRoomLevel = predictedLevel - (encodedLevel + 1) / 2;
              }
              insideRoomLevels[insideRoomPointIndex] = insideRoomLevel;
            } else {
              outsideRoomLevels = (int[]) (pointYs);
              outsideRoomPointIndex = pointIndex;
              if (highRoom <= lowRoom) {
                outsideRoomLevel = predictedLevel - encodedLevel + highRoom - 1;
              } else {
                outsideRoomLevel = encodedLevel - lowRoom + predictedLevel;
              }
              outsideRoomLevels[outsideRoomPointIndex] = outsideRoomLevel;
            }
          }
        }
        this.sortPoints(0, pointCount - 1);
        previousX = 0;
        previousLevel = pointYs[0] * this.multiplier;
        renderPointIndex = 1;
        initialRenderPointIndex = renderPointIndex;
        while (renderPointIndex < pointCount) {
          if (activePoints[renderPointIndex]) {
            x = pointXs[renderPointIndex];
            level = pointYs[renderPointIndex] * this.multiplier;
            this.applyLine(previousX, previousLevel, x, level, spectrum, sampleCount);
            if (x >= sampleCount) {
              return;
            }
            previousX = x;
            previousLevel = level;
          }
          renderPointIndex++;
        }
        tailGain = inverseDbGains[previousLevel];
        for (tailX = previousX; tailX < sampleCount; tailX++) {
          spectrum[tailX] = spectrum[tailX] * tailGain;
        }
    }

    static {
        inverseDbGains = new float[]{1.0649863213529898e-7f, 1.1341951022814101e-7f, 1.2079014766186447e-7f, 1.2863978327004588e-7f, 1.3699950329737476e-7f, 1.459025043004658e-7f, 1.553840860424316e-7f, 1.654818078122844e-7f, 1.7623574422032107e-7f, 1.8768855625239667e-7f, 1.998856049567621e-7f, 2.128753067154321e-7f, 2.2670913324418507e-7f, 2.4144196686393116e-7f, 2.5713222839840455e-7f, 2.738421187586937e-7f, 2.9163791737119027e-7f, 3.105902237621194e-7f, 3.3077409966608684e-7f, 3.5226966588197683e-7f, 3.7516213069466176e-7f, 3.9954230146577174e-7f, 4.2550681200737017e-7f, 4.531586341727234e-7f, 4.826074473385233e-7f, 5.139700078871101e-7f, 5.473706323755323e-7f, 5.829418796565733e-7f, 6.208247214090079e-7f, 6.611693947888853e-7f, 7.041359140202985e-7f, 7.498946388295735e-7f, 7.98627013409714e-7f, 8.505263053848466e-7f, 9.057982879312476e-7f, 9.646621492720442e-7f, 0.0000010273513453284977f, 0.0000010941143955278676f, 0.0000011652160765152075f, 0.0000012409384453349048f, 0.0000013215816352385445f, 0.0000014074654473006376f, 0.000001498930487286998f, 0.0000015963394162099576f, 0.0000017000785419440945f, 0.0000018105591834682855f, 0.0000019282194898551097f, 0.0000020535260318865767f, 0.0000021869757347303675f, 0.0000023290976969292387f, 0.0000024804558051982895f, 0.0000026416496439196635f, 0.000002813319042616058f, 0.0000029961443033243995f, 0.000003190850520695676f, 0.0000033982100831053685f, 0.000003619044946390204f, 0.000003854230726574315f, 0.0000041047005652217194f, 0.000004371447175799403f, 0.000004655528300645528f, 0.000004958070803695591f, 0.000005280273853713879f, 0.000005623416200251086f, 0.00000598885708313901f, 0.0000063780466916796286f, 0.000006792528438381851f, 0.000007233945325424429f, 0.000007704047675360925f, 0.000008204699952329975f, 0.000008737887583265547f, 0.000009305725143349264f, 0.000009910463631968014f, 0.000010554501386650372f, 0.000011240392268518917f, 0.00001197085566673195f, 0.000012748789231409319f, 0.000013577277968579438f, 0.000014459606063610408f, 0.00001539927143312525f, 0.000016400004824390635f, 0.000017465768905822188f, 0.000018600792827783152f, 0.000019809576770057902f, 0.00002109691376972478f, 0.00002246791154902894f, 0.000023928001610329375f, 0.000025482977434876375f, 0.00002713900539674796f, 0.000028902650228701532f, 0.000030780909582972527f, 0.000032781226764200255f, 0.00003491153256618418f, 0.000037180281651671976f, 0.00003959646710427478f, 0.00004216966772219166f, 0.00004491009167395532f, 0.000047828601964283735f, 0.00005093677464174107f, 0.00005424693154054694f, 0.00005777220212621614f, 0.00006152656715130433f, 0.00006552490958711132f, 0.00006978308374527842f, 0.00007431798439938575f, 0.00007914758316474035f, 0.00008429103763774037f, 0.00008976874960353598f, 0.00009560242324369028f, 0.00010181521065533161f, 0.00010843174095498398f, 0.0001154782366938889f, 0.00012298267392907292f, 0.00013097477494738996f, 0.00013948624837212265f, 0.00014855085464660078f, 0.00015820453700143844f, 0.000168485552421771f, 0.00017943468992598355f, 0.00019109535787720233f, 0.00020351381681393832f, 0.00021673929586540908f, 0.0002308242255821824f, 0.00024582448531873524f, 0.0002617995487526059f, 0.0002788127458188683f, 0.0002969315683003515f, 0.00031622787355445325f, 0.00033677814644761384f, 0.0003586638777051121f, 0.0003819718840532005f, 0.0004067945701535791f, 0.00043323036516085267f, 0.0004613841010723263f, 0.000491367478389293f, 0.0005232992698438466f, 0.0005573062226176262f, 0.0005935230874456465f, 0.0006320935790427029f, 0.000673170608934015f, 0.0007169169839471579f, 0.0007635062793269753f, 0.0008131232461892068f, 0.0008659645682200789f, 0.0009222398512065411f, 0.0009821722051128745f, 0.001045999233610928f, 0.0011139742564409971f, 0.0011863665422424674f, 0.001263463287614286f, 0.0013455701991915703f, 0.0014330128906294703f, 0.0015261381631717086f, 0.00162531528621912f, 0.0017309373943135142f, 0.0018434234661981463f, 0.001963219605386257f, 0.002090800553560257f, 0.002226672600954771f, 0.002371374284848571f, 0.002525479532778263f, 0.0026895992923527956f, 0.0028643847908824682f, 0.0030505286995321512f, 0.0032487690914422274f, 0.0034598924685269594f, 0.003684735856950283f, 0.003924190532416105f, 0.0041792066767811775f, 0.004450794775038958f, 0.004740032833069563f, 0.005048066843301058f, 0.005376118700951338f, 0.005725488997995853f, 0.0060975635424256325f, 0.006493817549198866f, 0.006915822625160217f, 0.007365251425653696f, 0.00784388743340969f, 0.008353627286851406f, 0.008896492421627045f, 0.009474636986851692f, 0.010090352036058903f, 0.010746080428361893f, 0.01144442055374384f, 0.012188144028186798f, 0.012980197556316853f, 0.013823725283145905f, 0.0147220678627491f, 0.01567879132926464f, 0.016697686165571213f, 0.017782796174287796f, 0.018938422203063965f, 0.020169148221611977f, 0.021479854360222816f, 0.02287573553621769f, 0.02436232939362526f, 0.025945531204342842f, 0.027631618082523346f, 0.02942727692425251f, 0.031339626759290695f, 0.03337625041604042f, 0.0355452261865139f, 0.037855155766010284f, 0.04031519964337349f, 0.04293510690331459f, 0.045725274831056595f, 0.04869675636291504f, 0.05186134949326515f, 0.05523158982396126f, 0.058820851147174835f, 0.06264336407184601f, 0.06671427935361862f, 0.0710497498512268f, 0.07566696405410767f, 0.08058422803878784f, 0.08582104742527008f, 0.09139817953109741f, 0.0973377451300621f, 0.10366330295801163f, 0.11039993166923523f, 0.11757434159517288f, 0.12521497905254364f, 0.1333521455526352f, 0.142018124461174f, 0.15124726295471191f, 0.16107617318630219f, 0.17154380679130554f, 0.18269167840480804f, 0.19456401467323303f, 0.20720787346363068f, 0.22067342698574066f, 0.23501402139663696f, 0.2502865493297577f, 0.26655158400535583f, 0.28387361764907837f, 0.30232131481170654f, 0.32196786999702454f, 0.342891126871109f, 0.36517414450645447f, 0.38890519738197327f, 0.4141784608364105f, 0.44109413027763367f, 0.46975889801979065f, 0.5002864599227905f, 0.5327979326248169f, 0.567422091960907f, 0.6042963862419128f, 0.6435669660568237f, 0.6853895783424377f, 0.72993004322052f, 0.7773650288581848f, 0.8278825879096985f, 0.8816830515861511f, 0.9389798045158386f, 1.0f};
        floorRanges = new int[]{256, 128, 86, 64};
    }
}
