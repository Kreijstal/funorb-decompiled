/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bia extends tb {
    static int field_d;
    static int field_c;

    bia() {
    }

    final static boolean a(boolean param0, byte param1, int param2) {
        if (param1 == -31) {
          return ArchiveIndexLoader.field_g.isVoteOptionAvailable(param2, 11, param0);
        }
        bia.a(true, (byte) 77, 66);
        return ArchiveIndexLoader.field_g.isVoteOptionAvailable(param2, 11, param0);
    }

    final static void a(byte param0) {
        ajb var1_ref = null;
        Object var1 = null;
        ajb var1_refLifetime1;
        if (param0 != 124) {
          bia.a((byte) -88);
          var1_ref = (ajb) (bc.field_b.removeLast((byte) -126));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          SoftwareRasterizer2D.setTarget(var1_ref.field_k, var1_ref.field_d, var1_ref.field_i);
          SoftwareRasterizer2D.setClip(var1_ref.field_j, var1_ref.field_g, var1_ref.field_h, var1_ref.field_e);
          var1_ref.field_k = null;
          GetPlayerRepairTime.field_p.addLast(-10258, var1_ref);
          return;
        }
        var1_refLifetime1 = (ajb) (bc.field_b.removeLast((byte) -126));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer2D.setTarget(var1_refLifetime1.field_k, var1_refLifetime1.field_d, var1_refLifetime1.field_i);
        SoftwareRasterizer2D.setClip(var1_refLifetime1.field_j, var1_refLifetime1.field_g, var1_refLifetime1.field_h, var1_refLifetime1.field_e);
        var1_refLifetime1.field_k = null;
        GetPlayerRepairTime.field_p.addLast(-10258, var1_refLifetime1);
    }

    final static PcmStreamMixer a(boolean param0) {
        if (!param0) {
          return (PcmStreamMixer) null;
        }
        return kpb.field_q;
    }

    static {
        field_c = 65000;
    }
}
