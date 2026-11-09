/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DroneProximitySupport {
    static int field_a;
    static TextureCoordinateGeneration EYE_LINEAR;

    public static void releaseStatics(int param0) {
        EYE_LINEAR = null;
        if (param0 != 0) {
          DroneProximitySupport.hasMaskBit16(71, -52, 50);
        }
    }

    final static boolean hasMaskBit16(int mask, int unused, int guard) {
        int var3 = 106 / ((-16 - guard) / 45);
        return (mask & 16) != 0 ? true : false;
    }

    final static void showGuestLogin(boolean requireLogin) {
        if (!IntrusiveNode.field_a) {
          throw new IllegalStateException();
        }
        HardwareTextureSprite.field_m = requireLogin;
        LoginDialogNavigation.showLoginDialog(false, !requireLogin ? true : false);
        LoginDialogNavigation.field_a = 0;
    }

    final static boolean isWithinRadius(int y, int radius, int guard, int centerX, int x, int centerY) {
        x = x - centerX;
        y = y - centerY;
        if (x < -radius) {
          return false;
        }
        if (y < -radius) {
          return false;
        }
        if (radius < x) {
          return false;
        }
        if (radius < y) {
          return false;
        }
        if (guard > -93) {
          return false;
        }
        int var6 = -13 + Math.max(OpenGlAssemblyProgram.floorLog2Magnitude(-123, radius), Math.max(OpenGlAssemblyProgram.floorLog2Magnitude(-122, x), OpenGlAssemblyProgram.floorLog2Magnitude(-127, y)));
        if (0 < var6) {
          radius = radius >> var6;
          x = x >> var6;
          y = y >> var6;
        }
        if (radius <= 0) {
          return false;
        }
        if ((x | y) == 0) {
          return true;
        }
        return x * x + y * y <= radius * radius ? true : false;
    }

    static {
        EYE_LINEAR = new TextureCoordinateGeneration();
    }
}
