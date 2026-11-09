/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSpriteTexture extends LegacyOpenGlTexture2D {
    int spriteWidth;
    static ToolkitSprite[] field_r;
    float maxV;
    static QuickChatCommand field_t;
    static java.awt.Font field_s;
    float maxU;
    int spriteHeight;
    static boolean field_w;

    public static void releaseStatics(boolean param0) {
        field_s = null;
        field_r = null;
        if (param0) {
          LegacyOpenGlSpriteTexture.loadMasterIndex((byte) 31);
          field_t = null;
          return;
        }
        field_t = null;
    }

    LegacyOpenGlSpriteTexture(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.spriteHeight = param3;
          this.spriteWidth = param2;
          if (this.target != 34037) {
            this.maxU = 1.0f;
            this.maxV = 1.0f;
            return;
          }
          this.maxU = (float)param2;
          this.maxV = (float)param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("f.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    LegacyOpenGlSpriteTexture(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
          this.spriteWidth = param2;
          this.spriteHeight = param3;
          this.uploadBytes(0, param6, param7, 0, param2, 0, 0, true, (byte) -124, param3);
          this.maxU = (float)param2 / (float)param4;
          this.maxV = (float)param3 / (float)param5;
          this.setWrap(false, false, -27365);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static boolean loadMasterIndex(byte guard) {
        if (guard != 63) {
          LegacyOpenGlSpriteTexture.requestedPolicyPath(false);
          return LegacyOpenGlSpecularEffect.field_i.loadMasterIndex((byte) 126);
        }
        return LegacyOpenGlSpecularEffect.field_i.loadMasterIndex((byte) 126);
    }

    LegacyOpenGlSpriteTexture(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.spriteWidth = param3;
          this.spriteHeight = param4;
          if (34037 == this.target) {
            this.maxV = (float)param4;
            this.maxU = (float)param3;
            return;
          }
          this.maxV = 1.0f;
          this.maxU = 1.0f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("f.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(')').toString());
        }
    }

    final static String requestedPolicyPath(boolean guard) {
        if (guard) {
          field_s = (java.awt.Font) null;
          return ArchiveProvider.field_c;
        }
        return ArchiveProvider.field_c;
    }

    LegacyOpenGlSpriteTexture(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
          this.spriteHeight = param2;
          this.spriteWidth = param1;
          this.uploadInts(param2, param1, 0, param5, 0, 0, 0, true, true);
          this.maxV = (float)param2 / (float)param4;
          this.maxU = (float)param1 / (float)param3;
          this.setWrap(false, false, -27365);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = false;
        field_t = new QuickChatCommand(7, 0, 1, 1);
    }
}
