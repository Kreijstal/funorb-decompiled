/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pka {
    static int field_b;
    static String field_a;

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          pka.releaseStatics(-110);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        int var1 = param0 ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        if (lca.a(false)) {
          bka.a((byte) -125);
          var1 = 1;
          if (PlayPhase.h(89)) {
            if (una.a((byte) -87)) {
              if (sr.a(125)) {
                var2 = (-1 + PlatformBehaviour.field_o << 8) / 16;
                if (0 < var2) {
                  var1 = 1;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2);
                }
                return var1 != 0;
              }
              return var1 != 0;
            }
            S2CNewRoomPacket.a(dq.field_f == null ? VortexBehaviour.field_n : true, 113);
            var1 = 1;
          }
          if (sr.a(125)) {
            var2Lifetime4 = (-1 + PlatformBehaviour.field_o << 8) / 16;
            if (0 < var2Lifetime4) {
              var1 = 1;
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime4);
            }
            return var1 != 0;
          }
          return var1 != 0;
        }
        if (!una.a((byte) -115)) {
          if (!ofa.d(true)) {
            if (PlayPhase.h(89)) {
              if (una.a((byte) -87)) {
                if (!sr.a(125)) {
                  return var1 != 0;
                }
                var2Lifetime1 = (-1 + PlatformBehaviour.field_o << 8) / 16;
                if (0 < var2Lifetime1) {
                  var1 = 1;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime1);
                }
                return var1 != 0;
              }
              S2CNewRoomPacket.a(dq.field_f == null ? VortexBehaviour.field_n : true, 113);
              var1 = 1;
            }
            if (!sr.a(125)) {
              return var1 != 0;
            }
            var2Lifetime1 = (-1 + PlatformBehaviour.field_o << 8) / 16;
            if (0 < var2Lifetime1) {
              var1 = 1;
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime1);
            }
            return var1 != 0;
          }
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a);
          var1 = 1;
          np.b(-69);
          if (PlayPhase.h(89)) {
            if (una.a((byte) -87)) {
              if (!sr.a(125)) {
                return var1 != 0;
              }
              var2Lifetime1Lifetime1 = (-1 + PlatformBehaviour.field_o << 8) / 16;
              if (0 < var2Lifetime1Lifetime1) {
                var1 = 1;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime1Lifetime1);
              }
              return var1 != 0;
            }
            S2CNewRoomPacket.a(dq.field_f == null ? VortexBehaviour.field_n : true, 113);
            var1 = 1;
          }
          if (!sr.a(125)) {
            return var1 != 0;
          }
          var2Lifetime1Lifetime2 = (-1 + PlatformBehaviour.field_o << 8) / 16;
          if (0 < var2Lifetime1Lifetime2) {
            var1 = 1;
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime1Lifetime2);
          }
          return var1 != 0;
        }
        var1 = 1;
        or.d(-1226152383);
        if (PlayPhase.h(89)) {
          if (una.a((byte) -87)) {
            if (!sr.a(125)) {
              return var1 != 0;
            }
            var2Lifetime2 = (-1 + PlatformBehaviour.field_o << 8) / 16;
            if (0 < var2Lifetime2) {
              var1 = 1;
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime2);
            }
            return var1 != 0;
          }
          S2CNewRoomPacket.a(dq.field_f == null ? VortexBehaviour.field_n : true, 113);
          var1 = 1;
        }
        if (!sr.a(125)) {
          return var1 != 0;
        }
        var2Lifetime3 = (-1 + PlatformBehaviour.field_o << 8) / 16;
        if (0 < var2Lifetime3) {
          var1 = 1;
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a, 0, var2Lifetime3);
        }
        return var1 != 0;
    }

    static {
        field_b = 0;
        field_a = "Discard";
    }
}
