/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationFrameSet extends DualLinkNode {
    static UiComponent field_x;
    static String field_w;
    static String[] field_A;
    static String field_t;
    static int field_z;
    private int field_y;
    AnimationFrame[] field_u;
    private byte[][] field_v;

    public static void releaseStatics(byte param0) {
        field_A = null;
        field_w = null;
        if (param0 != 87) {
          field_w = (String) null;
        }
        field_x = null;
        field_t = null;
    }

    final boolean ensureFramesLoaded(byte param0) {
        int var2;
        int var3_int;
        IntrusiveDeque var3;
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
        var12 = TetraLink.field_J;
        if (null != this.field_u) {
          return true;
        }
        if (null == this.field_v) {
          if (!NodeHashTableIterator.field_c.ensureGroupLoaded(this.field_y, 0)) {
            return false;
          }
          var27 = NodeHashTableIterator.field_c.getFileIds(this.field_y, param0 ^ -106);
          this.field_v = new byte[var27.length][];
          for (var3_int = 0; var3_int < var27.length; var3_int++) {
            this.field_v[var3_int] = NodeHashTableIterator.field_c.getFile(-107, var27[var3_int], this.field_y);
          }
        }
        var2 = 1;
        var13 = 0;
        var3_intLifetime1 = var13;
        while (this.field_v.length > var13) {
          var28 = this.field_v[var13];
          var16 = new PacketBuffer(var28);
          var16.position = 1;
          var6 = var16.readUnsignedShort(param0 ^ -23);
          var2 = var2 != 0 & EditableTextWidget.field_T.isFlatFileReady(var6, 88) ? 1 : 0;
          var13++;
        }
        if (var2 == 0) {
          return false;
        }
        var3 = new IntrusiveDeque();
        var4 = NodeHashTableIterator.field_c.getFileCount(-23126, this.field_y);
        this.field_u = new AnimationFrame[var4];
        if (param0 != -106) {
          field_z = -125;
        }
        var29 = NodeHashTableIterator.field_c.getFileIds(this.field_y, param0 ^ -106);
        for (var6Lifetime1 = 0; var6Lifetime1 < var29.length; var6Lifetime1++) {
          var30 = this.field_v[var6Lifetime1];
          var8 = new PacketBuffer(var30);
          var8.position = 1;
          var9 = var8.readUnsignedShort(127);
          var10 = null;
          var11 = (AnimationSkeleton) (var3.first(false));
          while (var11 != null) {
            if (~var9 != ~var11.field_o) {
              var11 = (AnimationSkeleton) (var3.next((byte) -70));
              continue;
            }
            var10 = var11;
            break;
          }
          if (var10 == null) {
            var10 = new AnimationSkeleton(var9, EditableTextWidget.field_T.getFlatFile(0, var9));
            var3.addLast((IntrusiveNode) (var10), false);
          }
          this.field_u[var29[var6Lifetime1]] = new AnimationFrame(var30, (AnimationSkeleton) (var10));
        }
        this.field_v = (byte[][]) null;
        return true;
    }

    AnimationFrameSet(int param0) {
        this.field_y = param0;
    }

    static {
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = "Type your email address again to make sure it's correct";
        field_w = "Unable to add name - system busy";
    }
}
