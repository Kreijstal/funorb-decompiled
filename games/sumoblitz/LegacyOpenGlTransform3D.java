/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTransform3D extends Transform3D {
    private float m00;
    private float m10;
    private float m22;
    private float m21;
    private float m12;
    private float m11;
    static String[] field_h;
    private float translateX;
    static int field_f;
    private float m20;
    private float translateZ;
    private float m02;
    private float translateY;
    private float m01;

    final static void uploadFloatMipmaps(int width, int height, byte guard, int target, int internalFormat, float[] pixels, int format) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (width > 0 &&
            !IntegerMath.isSingleBitOrZero(width, -112)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !IntegerMath.isSingleBitOrZero(height, -102)) {
            throw new IllegalArgumentException("");
          }
          var7_int = FriendListState.glFormatComponents(format, (byte) -107);
          var8 = 0;
          if (guard != 11) {
            field_f = 114;
          }
          stackIn_13_0 = (width < height) ? width : height;
          var9 = stackIn_13_0;
          var10 = width >> 1;
          var11 = height >> 1;
          var12 = pixels;
          var13 = new float[var7_int * var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(target, var8, internalFormat, width, height, 0, format, 5126, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = var7_int * width;
            for (var17 = 0; var7_int > var17; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var19 + var16;
              for (var21 = 0; var21 < var11; var21++) {
                for (var22 = 0; var10 > var22; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var15 = var15 + var12[var20];
                  var19 = var19 + var7_int;
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = 0.25f * var15;
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var20 = var20 + var16;
                var19 = var19 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            width = var10;
            height = var11;
            var10 = var10 >> 1;
            var8++;
            var11 = var11 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("dl.C(").append(width).append(',').append(height).append(',').append(guard).append(',').append(target).append(',').append(internalFormat).append(',');
          if (pixels == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(format).append(')').toString());
        }
    }

    final void transformPlane(float[] destination, int guard, float normalY, float normalZ, float offset, float normalX) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          destination[2] = this.m22 * normalZ + (this.m20 * normalX + normalY * this.m21);
          destination[1] = this.m10 * normalX + normalY * this.m11 + this.m12 * normalZ;
          destination[0] = this.m01 * normalY + normalX * this.m00 + normalZ * this.m02;
          if (!(normalX > 0.00390625f) &&
            !(normalX < -0.00390625f)) {
            if (!(0.00390625f < normalY) &&
              !(normalY < -0.00390625f)) {
              var10 = -offset / normalZ;
              var7_float = this.translateX + var10 * this.m02;
              var9 = this.m22 * var10 + this.translateZ;
              var8 = this.translateY + this.m12 * var10;
            } else {
              var10 = -offset / normalY;
              var7_float = this.translateX + this.m01 * var10;
              var8 = this.translateY + var10 * this.m11;
              var9 = this.m21 * var10 + this.translateZ;
            }
          } else {
            var10 = -offset / normalX;
            var8 = this.translateY + this.m10 * var10;
            var7_float = this.m00 * var10 + this.translateX;
            var9 = this.translateZ + var10 * this.m20;
          }
          if (guard != 26839) {
            this.m21 = -0.34753671288490295f;
          }
          destination[3] = -(destination[2] * var9 + (destination[1] * var8 + var7_float * destination[0]));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("dl.A(");
          if (destination == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(normalY).append(',').append(normalZ).append(',').append(offset).append(',').append(normalX).append(')').toString());
        }
    }

    private final void resetIdentity(int guard) {
        if (guard != 3489) {
          float[] var3 = (float[]) null;
          LegacyOpenGlTransform3D.uploadFloatMipmaps(-57, 41, (byte) -108, 122, 88, (float[]) null, -31);
        }
        this.m20 = 0.0f;
        this.m11 = 1.0f;
        this.m10 = 0.0f;
        this.m12 = 0.0f;
        this.m21 = 0.0f;
        this.m00 = 1.0f;
        this.translateZ = 0.0f;
        this.m22 = 1.0f;
        this.translateY = 0.0f;
        this.translateX = 0.0f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
    }

    final static void appendChatHistory(ChatMessage message, byte guard) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            DroneVariantScoring.chatPriorityCounts[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; LegacyOpenGlBuffer.chatMessageCount > var2_intLifetime1; var2_intLifetime1++) {
            if (DroneDebris.chatHistory[var2_intLifetime1].type == message.type) {
              dupTemp$3 = DroneDebris.chatHistory[var2_intLifetime1].retentionPriority(-112);
              DroneVariantScoring.chatPriorityCounts[dupTemp$3] = DroneVariantScoring.chatPriorityCounts[dupTemp$3] + 1;
            }
          }
          if (guard < 69) {
            field_h = (String[]) null;
          }
          dupTemp$0 = message.retentionPriority(-82);
          DroneVariantScoring.chatPriorityCounts[dupTemp$0] = DroneVariantScoring.chatPriorityCounts[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; LegacyOpenGlBuffer.chatMessageCount > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (message.type == DroneDebris.chatHistory[var3].type) {
              var4 = DroneDebris.chatHistory[var3].retentionPriority(-120);
              if (SecondaryNodeQueue.field_c < DroneVariantScoring.chatPriorityCounts[var4]) {
                DroneVariantScoring.chatPriorityCounts[var4] = DroneVariantScoring.chatPriorityCounts[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              DroneDebris.chatHistory[incrementValue$2] = DroneDebris.chatHistory[var3];
            }
          }
          LegacyOpenGlBuffer.chatMessageCount = var2_intLifetime2;
          fieldTemp$1 = LegacyOpenGlBuffer.chatMessageCount;
          LegacyOpenGlBuffer.chatMessageCount = LegacyOpenGlBuffer.chatMessageCount + 1;
          DroneDebris.chatHistory[fieldTemp$1] = message;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("dl.B(");
          if (message == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(guard).append(')').toString());
        }
    }

    final float[] rotationMatrix(int guard) {
        PerlinNoise2D.transformMatrixScratch[1] = this.m10;
        PerlinNoise2D.transformMatrixScratch[10] = this.m22;
        PerlinNoise2D.transformMatrixScratch[guard] = this.m11;
        PerlinNoise2D.transformMatrixScratch[8] = this.m02;
        PerlinNoise2D.transformMatrixScratch[6] = this.m21;
        PerlinNoise2D.transformMatrixScratch[2] = this.m20;
        PerlinNoise2D.transformMatrixScratch[12] = 0.0f;
        PerlinNoise2D.transformMatrixScratch[14] = 0.0f;
        PerlinNoise2D.transformMatrixScratch[0] = this.m00;
        PerlinNoise2D.transformMatrixScratch[9] = this.m12;
        PerlinNoise2D.transformMatrixScratch[13] = 0.0f;
        PerlinNoise2D.transformMatrixScratch[4] = this.m01;
        return PerlinNoise2D.transformMatrixScratch;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          LegacyOpenGlTransform3D.releaseStatics(95);
        }
        field_h = null;
    }

    final float[] affineMatrix(byte guard) {
        if (guard <= 50) {
          this.resetIdentity(-118);
        }
        PerlinNoise2D.transformMatrixScratch[0] = this.m00;
        PerlinNoise2D.transformMatrixScratch[6] = this.m21;
        PerlinNoise2D.transformMatrixScratch[8] = this.m02;
        PerlinNoise2D.transformMatrixScratch[14] = this.translateZ;
        PerlinNoise2D.transformMatrixScratch[13] = this.translateY;
        PerlinNoise2D.transformMatrixScratch[1] = this.m10;
        PerlinNoise2D.transformMatrixScratch[12] = this.translateX;
        PerlinNoise2D.transformMatrixScratch[4] = this.m01;
        PerlinNoise2D.transformMatrixScratch[10] = this.m22;
        PerlinNoise2D.transformMatrixScratch[2] = this.m20;
        PerlinNoise2D.transformMatrixScratch[9] = this.m12;
        PerlinNoise2D.transformMatrixScratch[5] = this.m11;
        return PerlinNoise2D.transformMatrixScratch;
    }

    LegacyOpenGlTransform3D() {
        this.resetIdentity(3489);
    }

    static {
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
