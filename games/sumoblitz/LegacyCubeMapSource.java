/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyCubeMapSource extends CubeMapSource {
    static int field_d;
    static ToolkitSprite field_e;
    static volatile long field_f;

    public static void releaseStatics(byte param0) {
        if (param0 != -21) {
          field_f = 90L;
          field_e = null;
          return;
        }
        field_e = null;
    }

    private LegacyCubeMapSource() throws Throwable {
        throw new Error();
    }

    final static boolean isEmailAvailabilityPending(int guard) {
        if (guard <= 64) {
          return false;
        }
        return !AffineTransform3D.emailAvailabilityRequest.isComplete(true) ? true : false;
    }

    final static TickClock createTickClock(boolean guard) {
        if (guard) {
          field_e = (ToolkitSprite) null;
          return (TickClock) ((Object) new NanoTickClock());
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    abstract LegacyOpenGlCubeTexture cubeTexture(byte guard);

    static {
        field_f = 0L;
    }
}
