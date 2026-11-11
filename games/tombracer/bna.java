/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends IntrusiveNode {
    boolean field_g;
    int[] field_f;

    final static void writeEncryptedBlock(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, PacketBuffer param3, PacketBuffer param4) {
        try {
          C2SChooseRewardPacket.writeEncryptedPayload(param4.position, (byte) -81, param4.payload, param2, param3, param0, 0);
          if (param1) {
            bna.a((byte) 109);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "bna.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayerEntry var1 = null;
        LobbyGameWidget var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        LobbyPlayerEntry var1Lifetime1;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          var1 = (LobbyPlayerEntry) (uma.field_b.first(-80));
          while (var1 != null) {
            if (var1.field_xb > 0) {
              var1.field_xb = var1.field_xb - 1;
              if (var1.field_xb == 0) {
                var1.field_Lb = 0;
                if (var1.f(param0 ^ 168)) {
                  var1.unlink(19);
                }
              }
            }
            var1 = (LobbyPlayerEntry) (uma.field_b.next(122));
          }
          if (param0 != 10) {
            return;
          }
          var1_ref = (LobbyGameWidget) (AffineTransform3D.field_j.first(-80));
          while (var1_ref != null) {
            if (var1_ref.field_zb > 0) {
              var1_ref.field_zb = var1_ref.field_zb - 1;
              if (var1_ref.field_zb == 0) {
                var1_ref.field_Ib = 0;
                if (var1_ref.g(0)) {
                  var1_ref.unlink(59);
                }
              }
            }
            var1_ref = (LobbyGameWidget) (AffineTransform3D.field_j.next(120));
          }
          var1Lifetime1 = (LobbyPlayerEntry) (DemoCourseGenerator.field_g.first(param0 ^ -70));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_xb > 0) {
              var1Lifetime1.field_xb = var1Lifetime1.field_xb - 1;
              if (var1Lifetime1.field_xb != 0) {
                var1Lifetime1 = (LobbyPlayerEntry) (DemoCourseGenerator.field_g.next(param0 + 101));
                continue;
              }
              var1Lifetime1.field_Lb = 0;
              if (var1Lifetime1.f(162)) {
                var1Lifetime1.unlink(72);
              }
            }
            var1Lifetime1 = (LobbyPlayerEntry) (DemoCourseGenerator.field_g.next(param0 + 101));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1_ref2), "bna.A(" + param0 + ')');
        }
    }

    bna() {
        this.field_g = false;
    }

    static {
    }
}
