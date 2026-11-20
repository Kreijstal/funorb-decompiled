/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GraphicsToolkit {
    TextureProvider field_a;
    int field_b;

    abstract ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    final void fillRectangle(int param0, byte param1, int param2, int param3, int param4, int param5) {
        this.fillRectangle(param5, param4, param0, param3, param2, 1);
        if (param1 != 120) {
          this.field_b = 8;
        }
    }

    final void drawCircle(int param0, int param1, int param2, byte param3, int param4) {
        this.drawCircle(param2, param1, param0, param4, 1);
        int var6 = -99 % ((47 - param3) / 49);
    }

    final void drawThickLine(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        this.drawThickLine(param1, param2, param5, param0, param3, param6, 1);
        if (param4) {
          this.field_a = (TextureProvider) null;
        }
    }

    abstract void drawVerticalLine(int param0, int param1, int param2, int param3, int param4);

    final void present(int param0) throws GraphicsPresentException {
        int var2 = -72 / ((-30 - param0) / 53);
        this.present(0, 0);
    }

    void setRenderTarget(ToolkitSprite param0, boolean param1) {
        try {
          this.bindFramebuffer(this.createFramebuffer(param0, param1 ? this.createDepthBuffer(param0.getWidth(), param0.getHeight()) : null));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ha.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void setBloomParameters(float param0, float param1, float param2);

    abstract void fillGradientTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    final void drawLineTo(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.drawLine(param4, param5, param0, param3, param2, param1);
    }

    abstract GraphicsHeap createHeap(int param0);

    abstract void restoreDefaultFramebuffer();

    abstract boolean hasSlowOffscreenRendering();

    abstract void drawThickLine(int param0, int param1, int param2, int param3, int param4, int param5, int param6);

    abstract int[] readPixels(int param0, int param1, int param2, int param3);

    abstract boolean supportsMultipleThreads();

    abstract void updateFrame(int param0);

    abstract boolean isBloomSupported();

    abstract void applyPostProcessing();

    abstract boolean hasVolatileBackbuffer();

    abstract void intersectClip(int param0, int param1, int param2, int param3);

    abstract void clearDepth();

    final synchronized static GraphicsToolkit create(int param0, ResourceArchive param1, int param2, int param3, TextureProvider param4, java.awt.Canvas param5, int param6, int param7) {
        RuntimeException var8 = null;
        GraphicsToolkit stackIn_3_0 = null;
        GraphicsToolkit stackIn_7_0 = null;
        GraphicsToolkit stackIn_12_0 = null;
        GraphicsToolkit stackIn_16_0 = null;
        GraphicsToolkit stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param7 == 0) {
            stackIn_3_0 = SetWorldWidthUpshift.a(param4, param0, 42, param5, param3);
            return stackIn_3_0;
          }
          if (param7 == 2) {
            stackIn_7_0 = SetShipAimLines.a((byte) 113, param3, param5, param4, param0);
            return stackIn_7_0;
          }
          if (param6 <= 0) {
            GraphicsToolkit.a(false, -43, -73, 67);
          }
          if (param7 == 1) {
            stackIn_12_0 = AsteroidFieldFactory.a(param4, (byte) 16, param2, param5);
            return stackIn_12_0;
          }
          if (5 == param7) {
            stackIn_16_0 = pbb.a(param1, param2, -1588388127, param4, param5);
            return stackIn_16_0;
          }
          if (param7 != 3) {
            throw new IllegalArgumentException("UM");
          }
          stackIn_19_0 = jsa.a(param1, param2, 27908, param5, param4);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    abstract Framebuffer createFramebuffer(ColorBuffer param0, DepthBuffer param1);

    abstract boolean supportsMultipleCanvases();

    protected void finalize() {
        this.dispose((byte) 30);
    }

    abstract void setDirectionalLighting(int param0, float param1, float param2, float param3, float param4, float param5);

    abstract void copyFrontToBackBuffer();

    abstract void setViewTransform(Transform3D param0);

    abstract int[] getProjectionParameters();

    abstract void setProjectionParameters(int param0, int param1, int param2, int param3);

    abstract boolean supportsShadows();

    abstract void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract boolean supportsOffscreenRendering();

    abstract void fillCircle(int param0, int param1, int param2, int param3, int param4);

    abstract void beginPostProcessing(int param0, int param1, int param2, int param3);

    final ToolkitSprite createSprite(int param0, int param1, int[] param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        ToolkitSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 18) {
            this.drawThickLine(-25, -48, -23, 85, -120, -118, 69);
          }
          stackIn_3_0 = this.createSprite(param2, param3, param1, param0, param5, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ha.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    abstract boolean isBloomEnabled();

    final boolean supportsPointLights(int param0) {
        if (param0 < -16) {
          return this.getMaxPointLights() > 0 ? true : false;
        }
        this.supportsUnderwaterEffects();
        return this.getMaxPointLights() > 0 ? true : false;
    }

    abstract void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract boolean supportsAntialiasing();

    abstract boolean supportsFarClipPlane();

    abstract void drawRectangle(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void drawLine(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void setHeap(GraphicsHeap param0);

    abstract boolean supportsMemoryPools();

    abstract boolean supportsResizableBackbuffer();

    GraphicsToolkit(TextureProvider param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          this.field_a = param0;
          var2_int = -1;
          for (var3 = 0; var3 < 8; var3++) {
            if (!SetLaserProjectiles.field_o[var3]) {
              SetLaserProjectiles.field_o[var3] = true;
              var2_int = var3;
              break;
            }
          }
          if (-1 == var2_int) {
            throw new IllegalStateException("NFTI");
          }
          this.field_b = var2_int;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawHorizontalLineDefaultBlend(int param0, int param1, int param2, int param3, int param4) {
        this.drawHorizontalLine(param0, param3, param4, param2, 1);
        if (param1 != -25559) {
          this.restoreDefaultFramebuffer();
        }
    }

    abstract int getFarPlane();

    abstract ToolkitSprite createSprite(IndexedSpriteData param0, boolean param1);

    final void fillCircle(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 120 / ((param4 + 44) / 63);
        this.fillCircle(param2, param3, param1, param0, 1);
    }

    abstract void getClip(int[] param0);

    final void drawRectangleDefaultBlend(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -111 / ((-20 - param0) / 57);
        this.drawRectangle(param4, param1, param2, param5, param3, 1);
    }

    abstract boolean supportsFastTexturedParticles();

    abstract void releaseResources();

    abstract int getMaxPointLights();

    abstract void setDepthRange(int param0, int param1);

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (!uga.field_d) {
          return;
        }
        GetGrapplingHookFireForce.field_o.updateInput(param0, param3 ^ 1329);
        var4 = MidiNote.field_m.hasClickedItem(-25675) ? 1 : 0;
        boolean decompiledFrameRemainder0 = true;
        if (SetDebrisPartitioned.field_o != 0) {
          if (var4 != 0) {
            if (param3 != 5) {
              return;
            }
            if ((param0)) {
              MidiNote.field_m.updateSelection(param2, param1, (byte) 115);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            fj.b(18444);
            param0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param3 != 5) {
            return;
          }
          if (param0) {
            MidiNote.field_m.updateSelection(param2, param1, (byte) 115);
          }
        }
        if (var4 != 0) {
          GetGrapplingHookFireForce.field_o.updateInput(param0, param3 ^ 1329);
        }
        var5 = MidiNote.field_m.getOpenMenuWidth(-4109) + MidiNote.field_m.screenX;
        if (var5 > 640) {
          GetLaserAimspeed.field_p = GetLaserAimspeed.field_p + 5;
          return;
        }
        if (var5 >= 635) {
          return;
        }
        if (GetLaserAimspeed.field_p <= 0) {
          return;
        }
        GetLaserAimspeed.field_p = GetLaserAimspeed.field_p - 5;
        return;
    }

    abstract void setClip(int param0, int param1, int param2, int param3);

    abstract int getNearPlane();

    abstract void clearColor(int param0);

    abstract ToolkitFont createFont(ToolkitFontMetrics param0, IndexedSpriteData[] param1, boolean param2);

    abstract void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4);

    abstract DepthBuffer createDepthBuffer(int param0, int param1);

    abstract ka createModel(cbb param0, int param1, int param2, int param3, int param4);

    final void dispose(byte param0) {
        if (param0 != 30) {
          return;
        }
        SetLaserProjectiles.field_o[this.field_b] = false;
        this.releaseResources();
    }

    abstract ToolkitSprite createSprite(int param0, int param1, boolean param2);

    abstract void bindFramebuffer(Framebuffer param0);

    abstract void present(int param0, int param1) throws GraphicsPresentException;

    abstract boolean supportsEnvironmentMaps();

    abstract boolean enableBloom();

    abstract void setAmbientLight(float param0);

    abstract boolean supportsUnderwaterEffects();

    abstract Transform3D createTransform();

    abstract void drawCircle(int param0, int param1, int param2, int param3, int param4);

    static {
    }
}
