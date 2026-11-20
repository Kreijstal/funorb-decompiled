/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlSpriteTexture extends OpenGlTexture2D {
    float vMax;
    static IsaacPacketBuffer field_q;
    int logicalHeight;
    int logicalWidth;
    float uMax;
    boolean fullNormalizedCoordinates;

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        try {
          this.logicalWidth = param2;
          if (this.target == 34037) {
            this.vMax = (float)param3;
            this.uMax = (float)param2;
            this.fullNormalizedCoordinates = false;
          } else {
            this.fullNormalizedCoordinates = true;
            this.uMax = 1.0f;
            this.vMax = 1.0f;
          }
          this.logicalHeight = param3;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
          this.logicalHeight = param3;
          this.logicalWidth = param2;
          this.updatePixels(param3, param7, 0, param6, 0, param2, 0, 0, true, 1);
          this.vMax = (float)param3 / (float)param5;
          this.fullNormalizedCoordinates = false;
          this.uMax = (float)param2 / (float)param4;
          this.setWrap(false, false, 10497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
          this.logicalWidth = param3;
          if (this.target == 34037) {
            this.vMax = (float)param4;
            this.fullNormalizedCoordinates = false;
            this.uMax = (float)param3;
          } else {
            this.uMax = 1.0f;
            this.vMax = 1.0f;
            this.fullNormalizedCoordinates = true;
          }
          this.logicalHeight = param4;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
          this.logicalWidth = param1;
          this.logicalHeight = param2;
          this.updatePixels((byte) 32, 0, param1, 0, param2, 0, 0, true, param5);
          this.uMax = (float)param1 / (float)param3;
          this.vMax = (float)param2 / (float)param4;
          this.fullNormalizedCoordinates = false;
          this.setWrap(false, false, 10497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.logicalWidth = param3;
          this.logicalHeight = param4;
          if (this.target != 34037) {
            this.uMax = 1.0f;
            this.fullNormalizedCoordinates = true;
            this.vMax = 1.0f;
            return;
          }
          this.fullNormalizedCoordinates = false;
          this.vMax = (float)param4;
          this.uMax = (float)param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("im.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 105) {
          return;
        }
        field_q = null;
    }

    OpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, 3553, param1, param4, param5);
        try {
          this.vMax = (float)param3 / (float)param5;
          this.uMax = (float)param2 / (float)param4;
          this.logicalHeight = param3;
          this.logicalWidth = param2;
          this.fullNormalizedCoordinates = false;
          this.setWrap(false, false, 10497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
