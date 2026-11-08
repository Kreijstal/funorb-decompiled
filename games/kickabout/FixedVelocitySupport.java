/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FixedVelocitySupport {
    static ResourceArchive field_b;
    static String[] field_c;
    static Sprite field_a;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (Sprite) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        StreetSceneryLoader.field_i = 0;
        if (param0 > 126) {
          TrinketCatalog.field_d = -1;
          LoginPacketSupport.field_a = false;
          EmailAvailabilityValidator.field_o = null;
          AccountNameCharacterSupport.field_e = -1;
          return;
        }
        FixedVelocitySupport.a((byte) -102);
        TrinketCatalog.field_d = -1;
        LoginPacketSupport.field_a = false;
        EmailAvailabilityValidator.field_o = null;
        AccountNameCharacterSupport.field_e = -1;
    }

    final static int decelerateFixedVelocity(boolean param0, int param1) {
        if (param1 < 0) {
          param1 = Math.min(param1 + 91750, 0);
        } else {
          param1 = Math.max(param1 - 91750, 0);
        }
        if (param0) {
          if (Math.abs(param1) < 58982) {
            param1 = 0;
          }
          return param1;
        }
        FixedVelocitySupport.decelerateFixedVelocity(true, -93);
        if (Math.abs(param1) < 58982) {
          param1 = 0;
        }
        return param1;
    }

    static {
        field_c = new String[]{"total kicks", "total passes", "total shots", "total headers"};
    }
}
