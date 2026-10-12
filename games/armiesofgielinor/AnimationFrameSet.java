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
        int var2;
        int var3_int;
        NodeDeque var3;
        int var4;
        int var6;
        PacketBuffer var8;
        int var9;
        Object var10;
        AnimationSkeleton var11;
        int var12;
        int var13;
        PacketBuffer var16;
        int[] var27;
        byte[] var28;
        int[] var29;
        byte[] var30;
        int var3_intLifetime1;
        int var6Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -65) {
          field_v = (String[]) null;
        }
        if (null != this.frames) {
          return true;
        }
        if (this.encodedFrames == null) {
          if (!jj.field_c.ensureGroupAvailable(11894, this.groupId)) {
            return false;
          }
          var27 = jj.field_c.getFileIds(-26, this.groupId);
          this.encodedFrames = new byte[var27.length][];
          for (var3_int = 0; var27.length > var3_int; var3_int++) {
            this.encodedFrames[var3_int] = jj.field_c.getFile((byte) 114, var27[var3_int], this.groupId);
          }
        }
        var2 = 1;
        var13 = 0;
        var3_intLifetime1 = var13;
        while (var13 < this.encodedFrames.length) {
          var28 = this.encodedFrames[var13];
          var16 = new PacketBuffer(var28);
          var16.position = 1;
          var6 = var16.readUnsignedShort((byte) -104);
          var2 = var2 != 0 & PortalLossCondition.field_e.ensureFlatFileAvailable(var6, (byte) -56) ? 1 : 0;
          var13++;
        }
        if (var2 == 0) {
          return false;
        }
        var3 = new NodeDeque();
        var4 = jj.field_c.getFileCapacity(this.groupId, obfuscationGuard ^ 65);
        this.frames = new AnimationFrame[var4];
        var29 = jj.field_c.getFileIds(-92, this.groupId);
        for (var6Lifetime1 = 0; var6Lifetime1 < var29.length; var6Lifetime1++) {
          var30 = this.encodedFrames[var6Lifetime1];
          var8 = new PacketBuffer(var30);
          var8.position = 1;
          var9 = var8.readUnsignedShort((byte) -104);
          var10 = null;
          var11 = (AnimationSkeleton) (var3.first((byte) 124));
          while (var11 != null) {
            if (~var11.skeletonId != ~var9) {
              var11 = (AnimationSkeleton) (var3.next((byte) 123));
              continue;
            }
            var10 = var11;
            break;
          }
          if (var10 == null) {
            var10 = new AnimationSkeleton(var9, PortalLossCondition.field_e.getFlatFile(var9, (byte) 81));
            var3.addLast((byte) -119, (IntrusiveNode) (var10));
          }
          this.frames[var29[var6Lifetime1]] = new AnimationFrame(var30, (AnimationSkeleton) (var10));
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
