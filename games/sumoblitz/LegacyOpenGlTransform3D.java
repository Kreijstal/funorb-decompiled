/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTransform3D extends Transform3D {
    private float field_n;
    private float field_j;
    private float field_d;
    private float field_o;
    private float field_k;
    private float field_e;
    static String[] field_h;
    private float field_c;
    static int field_f;
    private float field_l;
    private float field_g;
    private float field_m;
    private float field_i;
    private float field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, float[] param5, int param6) {
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
          if (param0 > 0 &&
            !IntegerMath.isSingleBitOrZero(param0, -112)) {
            throw new IllegalArgumentException("");
          }
          if (param1 > 0 &&
            !IntegerMath.isSingleBitOrZero(param1, -102)) {
            throw new IllegalArgumentException("");
          }
          var7_int = pc.glFormatComponents(param6, (byte) -107);
          var8 = 0;
          if (param2 != 11) {
            field_f = 114;
          }
          stackIn_13_0 = (param0 < param1) ? param0 : param1;
          var9 = stackIn_13_0;
          var10 = param0 >> 1;
          var11 = param1 >> 1;
          var12 = param5;
          var13 = new float[var7_int * var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param3, var8, param4, param0, param1, 0, param6, 5126, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = var7_int * param0;
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
            param0 = var10;
            param1 = var11;
            var10 = var10 >> 1;
            var8++;
            var11 = var11 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("dl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(float[] param0, int param1, float param2, float param3, float param4, float param5) {
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
          param0[2] = this.field_d * param3 + (this.field_l * param5 + param2 * this.field_o);
          param0[1] = this.field_j * param5 + param2 * this.field_e + this.field_k * param3;
          param0[0] = this.field_b * param2 + param5 * this.field_n + param3 * this.field_m;
          if (!(param5 > 0.00390625f) &&
            !(param5 < -0.00390625f)) {
            if (!(0.00390625f < param2) &&
              !(param2 < -0.00390625f)) {
              var10 = -param4 / param3;
              var7_float = this.field_c + var10 * this.field_m;
              var9 = this.field_d * var10 + this.field_g;
              var8 = this.field_i + this.field_k * var10;
            } else {
              var10 = -param4 / param2;
              var7_float = this.field_c + this.field_b * var10;
              var8 = this.field_i + var10 * this.field_e;
              var9 = this.field_o * var10 + this.field_g;
            }
          } else {
            var10 = -param4 / param5;
            var8 = this.field_i + this.field_j * var10;
            var7_float = this.field_n * var10 + this.field_c;
            var9 = this.field_g + var10 * this.field_l;
          }
          if (param1 != 26839) {
            this.field_o = -0.34753671288490295f;
          }
          param0[3] = -(param0[2] * var9 + (param0[1] * var8 + var7_float * param0[0]));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("dl.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void c(int param0) {
        if (param0 != 3489) {
          float[] var3 = (float[]) null;
          LegacyOpenGlTransform3D.a(-57, 41, (byte) -108, 122, 88, (float[]) null, -31);
        }
        this.field_l = 0.0f;
        this.field_e = 1.0f;
        this.field_j = 0.0f;
        this.field_k = 0.0f;
        this.field_o = 0.0f;
        this.field_n = 1.0f;
        this.field_g = 0.0f;
        this.field_d = 1.0f;
        this.field_i = 0.0f;
        this.field_c = 0.0f;
        this.field_b = 0.0f;
        this.field_m = 0.0f;
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
            vp.chatPriorityCounts[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; LegacyOpenGlBuffer.chatMessageCount > var2_intLifetime1; var2_intLifetime1++) {
            if (DroneDebris.chatHistory[var2_intLifetime1].type == message.type) {
              dupTemp$3 = DroneDebris.chatHistory[var2_intLifetime1].retentionPriority(-112);
              vp.chatPriorityCounts[dupTemp$3] = vp.chatPriorityCounts[dupTemp$3] + 1;
            }
          }
          if (guard < 69) {
            field_h = (String[]) null;
          }
          dupTemp$0 = message.retentionPriority(-82);
          vp.chatPriorityCounts[dupTemp$0] = vp.chatPriorityCounts[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; LegacyOpenGlBuffer.chatMessageCount > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (message.type == DroneDebris.chatHistory[var3].type) {
              var4 = DroneDebris.chatHistory[var3].retentionPriority(-120);
              if (SecondaryNodeQueue.field_c < vp.chatPriorityCounts[var4]) {
                vp.chatPriorityCounts[var4] = vp.chatPriorityCounts[var4] - 1;
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

    final float[] a(int param0) {
        mo.field_n[1] = this.field_j;
        mo.field_n[10] = this.field_d;
        mo.field_n[param0] = this.field_e;
        mo.field_n[8] = this.field_m;
        mo.field_n[6] = this.field_o;
        mo.field_n[2] = this.field_l;
        mo.field_n[12] = 0.0f;
        mo.field_n[14] = 0.0f;
        mo.field_n[0] = this.field_n;
        mo.field_n[9] = this.field_k;
        mo.field_n[13] = 0.0f;
        mo.field_n[4] = this.field_b;
        return mo.field_n;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          LegacyOpenGlTransform3D.releaseStatics(95);
        }
        field_h = null;
    }

    final float[] b(byte param0) {
        if (param0 <= 50) {
          this.c(-118);
        }
        mo.field_n[0] = this.field_n;
        mo.field_n[6] = this.field_o;
        mo.field_n[8] = this.field_m;
        mo.field_n[14] = this.field_g;
        mo.field_n[13] = this.field_i;
        mo.field_n[1] = this.field_j;
        mo.field_n[12] = this.field_c;
        mo.field_n[4] = this.field_b;
        mo.field_n[10] = this.field_d;
        mo.field_n[2] = this.field_l;
        mo.field_n[9] = this.field_k;
        mo.field_n[5] = this.field_e;
        return mo.field_n;
    }

    LegacyOpenGlTransform3D() {
        this.c(3489);
    }

    static {
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
