/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ShaderEffect {
    static String enterTheNameYouText;
    static boolean field_d;
    static SpriteData field_c;
    HardwareGraphicsToolkit toolkit;

    void updateTransformUniforms(int guard) {
        int var2 = -35 / ((guard - 41) / 46);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == EmailCredentials.field_e) {
          if (!param0) {
            return;
          }
          ShaderEffect.releaseStatics(106);
          return;
        }
        var1 = EmailCredentials.field_e;
        synchronized (var1) {
          EmailCredentials.field_e = null;
        }
        if (param0) {
          ShaderEffect.releaseStatics(106);
        }
    }

    abstract void setParameters(int guard, int parameters1, int parameters0);

    public static void releaseStatics(int param0) {
        field_c = null;
        enterTheNameYouText = null;
        if (param0 >= -99) {
          field_c = (SpriteData) null;
        }
    }

    abstract void enable(boolean lighting, int guard);

    abstract void disable(boolean guard);

    void updateViewUniforms(byte guard) {
        if (guard <= 0) {
          this.updateTextureUniforms((byte) -128);
        }
    }

    void updateFogUniforms(int guard) {
        if (guard != 260) {
          this.updateViewUniforms((byte) -26);
        }
    }

    abstract void bindTexture(int combineMode, int guard, GpuTexture texture);

    void updateTextureUniforms(byte guard) {
        if (guard >= -47) {
          this.updateViewUniforms((byte) 119);
        }
    }

    ShaderEffect(HardwareGraphicsToolkit owner) {
        try {
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rq.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    final static int glTextureCombineOperation(int guard, TextureCombineOperation operation) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -9267) {
            ShaderEffect.releaseStatics(38);
          }
          if (operation == lf.REPLACE) {
            stackIn_4_0 = 7681;
            return stackIn_4_0;
          }
          if (operation == SlowBurstParticle.MODULATE) {
            stackIn_16_0 = 8448;
            return stackIn_16_0;
          }
          if (operation == OpenGlBuffer.INTERPOLATE) {
            stackIn_8_0 = 34165;
            return stackIn_8_0;
          }
          if (LoginForm.ADD == operation) {
            stackIn_14_0 = 260;
            return stackIn_14_0;
          }
          if (EmailAvailabilityRequest.SUBTRACT != operation) {
            throw new IllegalArgumentException();
          }
          stackIn_12_0 = 34023;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("rq.T(").append(guard).append(',');
          if (operation == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static RasterIndexedSprite[] a(String param0, ResourceArchive param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RasterIndexedSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 28) {
            enterTheNameYouText = (String) null;
          }
          var4_int = param1.groupId(0, param3);
          var5 = param1.fileId(var4_int, param0, (byte) 127);
          stackIn_3_0 = LegacyOpenGlTextureCache.loadIndexedSprites(var4_int, -1, var5, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rq.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void updateProjectionUniforms(boolean guard) {
        if (guard) {
          field_c = (SpriteData) null;
        }
    }

    abstract boolean isSupported(byte guard);

    abstract void refreshState(boolean lighting, byte guard);

    static {
        enterTheNameYouText = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
