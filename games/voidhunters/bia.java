/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bia extends tb {
    static int field_d;
    static int field_c;

    bia() {
    }

    final static boolean isVoteOptionAvailable(boolean param0, byte param1, int param2) {
        if (param1 == -31) {
          return ArchiveIndexLoader.field_g.isVoteOptionAvailable(param2, 11, param0);
        }
        bia.isVoteOptionAvailable(true, (byte) 77, 66);
        return ArchiveIndexLoader.field_g.isVoteOptionAvailable(param2, 11, param0);
    }

    final static void popRasterState(byte param0) {
        SoftwareRasterState var1_ref = null;
        Object var1 = null;
        SoftwareRasterState var1_refLifetime1;
        if (param0 != 124) {
          bia.popRasterState((byte) -88);
          var1_ref = (SoftwareRasterState) (NineSliceSprite.rasterStateStack.removeLast((byte) -126));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          SoftwareRasterizer2D.setTarget(var1_ref.pixels, var1_ref.width, var1_ref.height);
          SoftwareRasterizer2D.setClip(var1_ref.clipLeft, var1_ref.clipTop, var1_ref.clipRight, var1_ref.clipBottom);
          var1_ref.pixels = null;
          GetPlayerRepairTime.rasterStatePool.addLast(-10258, var1_ref);
          return;
        }
        var1_refLifetime1 = (SoftwareRasterState) (NineSliceSprite.rasterStateStack.removeLast((byte) -126));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer2D.setTarget(var1_refLifetime1.pixels, var1_refLifetime1.width, var1_refLifetime1.height);
        SoftwareRasterizer2D.setClip(var1_refLifetime1.clipLeft, var1_refLifetime1.clipTop, var1_refLifetime1.clipRight, var1_refLifetime1.clipBottom);
        var1_refLifetime1.pixels = null;
        GetPlayerRepairTime.rasterStatePool.addLast(-10258, var1_refLifetime1);
    }

    final static PcmStreamMixer getPcmStreamMixer(boolean param0) {
        if (!param0) {
          return (PcmStreamMixer) null;
        }
        return MaskedPasswordTextStyle.effectsMixer;
    }

    static {
        field_c = 65000;
    }
}
