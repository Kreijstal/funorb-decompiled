/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    boolean showUnderageInfo;
    static ToolkitSprite field_f;
    int errorCode;
    boolean success;
    String[] nameSuggestions;
    String errorMessage;
    static int waveIndex;
    static PrimitiveType TRIANGLE_FAN;

    final static float noiseGradientDot(float offsetY, float offsetZ, int gradientIndex, float offsetX, int guard) {
        float[] var6 = null;
        if (guard == 2) {
          var6 = GameplaySession.noiseGradients[gradientIndex];
          float[] var5 = var6;
          return var6[1] * offsetY + offsetX * var6[0] + var6[2] * offsetZ;
        }
        return 1.2348530292510986f;
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 < 4) {
          waveIndex = 11;
          TRIANGLE_FAN = null;
          return;
        }
        TRIANGLE_FAN = null;
    }

    final static void a(int param0, byte param1, GameProgressUpdate param2) {
        try {
          SoftwareRenderTarget.field_f.addLast((IntrusiveNode) (param2), (byte) 39);
          ToolkitRasterStateStack.sendProgressUpdate(param0, 1, param2);
          if (param1 <= 5) {
            field_f = (ToolkitSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "an.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    AccountServiceResult(boolean successful) {
        this.success = successful ? true : false;
    }

    static {
        TRIANGLE_FAN = new PrimitiveType();
    }
}
