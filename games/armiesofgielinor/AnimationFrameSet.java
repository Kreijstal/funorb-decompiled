/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationFrameSet extends DualLinkedNode {
    private byte[][] encodedFrames;
    static int[][] unitUnlockGroups;
    static int[] field_w;
    private int groupId;
    static int[] field_D;
    static int field_E;
    static String field_y;
    static String field_I;
    static nt field_z;
    static String field_u;
    static String[] field_v;
    AnimationFrame[] frames;
    static String field_B;
    static String field_F;

    final boolean ensureFramesAvailable(byte obfuscationGuard) {
        int allSkeletonsAvailable;
        int encodedFileOrdinal;
        NodeDeque loadedSkeletons;
        int frameCapacity;
        int requiredSkeletonId;
        PacketBuffer frameHeader;
        int skeletonId;
        Object resolvedSkeleton;
        AnimationSkeleton cachedSkeleton;
        int obfuscationControl;
        int dependencyOrdinal;
        PacketBuffer dependencyHeader;
        int[] encodedFileIds;
        byte[] dependencyBytes;
        int[] frameFileIds;
        byte[] frameBytes;
        int initialDependencyCursor;
        int decodedFileOrdinal;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -65) {
          field_v = (String[]) null;
        }
        if (null != this.frames) {
          return true;
        }
        if (this.encodedFrames == null) {
          if (!jj.animationFramesArchive.ensureGroupAvailable(11894, this.groupId)) {
            return false;
          }
          encodedFileIds = jj.animationFramesArchive.getFileIds(-26, this.groupId);
          this.encodedFrames = new byte[encodedFileIds.length][];
          for (encodedFileOrdinal = 0; encodedFileIds.length > encodedFileOrdinal; encodedFileOrdinal++) {
            this.encodedFrames[encodedFileOrdinal] = jj.animationFramesArchive.getFile((byte) 114, encodedFileIds[encodedFileOrdinal], this.groupId);
          }
        }
        allSkeletonsAvailable = 1;
        dependencyOrdinal = 0;
        initialDependencyCursor = dependencyOrdinal;
        while (dependencyOrdinal < this.encodedFrames.length) {
          dependencyBytes = this.encodedFrames[dependencyOrdinal];
          dependencyHeader = new PacketBuffer(dependencyBytes);
          dependencyHeader.position = 1;
          requiredSkeletonId = dependencyHeader.readUnsignedShort((byte) -104);
          allSkeletonsAvailable = allSkeletonsAvailable != 0 & PortalLossCondition.animationSkeletonsArchive.ensureFlatFileAvailable(requiredSkeletonId, (byte) -56) ? 1 : 0;
          dependencyOrdinal++;
        }
        if (allSkeletonsAvailable == 0) {
          return false;
        }
        loadedSkeletons = new NodeDeque();
        frameCapacity = jj.animationFramesArchive.getFileCapacity(this.groupId, obfuscationGuard ^ 65);
        this.frames = new AnimationFrame[frameCapacity];
        frameFileIds = jj.animationFramesArchive.getFileIds(-92, this.groupId);
        for (decodedFileOrdinal = 0; decodedFileOrdinal < frameFileIds.length; decodedFileOrdinal++) {
          frameBytes = this.encodedFrames[decodedFileOrdinal];
          frameHeader = new PacketBuffer(frameBytes);
          frameHeader.position = 1;
          skeletonId = frameHeader.readUnsignedShort((byte) -104);
          resolvedSkeleton = null;
          cachedSkeleton = (AnimationSkeleton) (loadedSkeletons.first((byte) 124));
          while (cachedSkeleton != null) {
            if (~cachedSkeleton.skeletonId != ~skeletonId) {
              cachedSkeleton = (AnimationSkeleton) (loadedSkeletons.next((byte) 123));
              continue;
            }
            resolvedSkeleton = cachedSkeleton;
            break;
          }
          if (resolvedSkeleton == null) {
            resolvedSkeleton = new AnimationSkeleton(skeletonId, PortalLossCondition.animationSkeletonsArchive.getFlatFile(skeletonId, (byte) 81));
            loadedSkeletons.addLast((byte) -119, (IntrusiveNode) (resolvedSkeleton));
          }
          this.frames[frameFileIds[decodedFileOrdinal]] = new AnimationFrame(frameBytes, (AnimationSkeleton) (resolvedSkeleton));
        }
        this.encodedFrames = (byte[][]) null;
        return true;
    }

    AnimationFrameSet(int groupId) {
        this.groupId = groupId;
    }

    final static void d(byte param0) {
        if (param0 != -13) {
          AnimationFrameSet.d((byte) 11);
        }
    }

    public static void e(byte param0) {
        field_z = null;
        unitUnlockGroups = (int[][]) null;
        if (param0 >= -54) {
          field_B = (String) null;
        }
        field_F = null;
        field_y = null;
        field_v = null;
        field_B = null;
        field_w = null;
        field_u = null;
        field_D = null;
        field_I = null;
    }

    static {
        field_y = "Remove friend";
        field_I = "Full";
        field_E = 4;
        unitUnlockGroups = new int[][]{new int[]{0, 2, 1, 3, 5, 6, 7, 74, 4}, new int[]{10, 8, 9, 16, 12, 11, 15, 13, 14, 17, 18}, new int[]{19, 20, 21, 25, 23, 22, 26, 27, 24, 28, 29}, new int[]{31, 32, 33, 36, 30, 34, 38, 35, 37, 39, 40}, new int[]{42, 41, 47, 48, 46, 44, 43, 45, 49, 50, 51}, new int[]{52, 53, 54, 55, 57, 59, 61, 58, 60, 56, 62}, new int[]{64, 68, 70, 67, 66, 69, 65, 71, 72, 63, 73}};
        field_D = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 13};
        field_z = null;
        field_u = "Match by...";
        field_B = "PER MONTH";
        field_F = "Portal";
    }
}
