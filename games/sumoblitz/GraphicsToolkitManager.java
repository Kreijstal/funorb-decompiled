/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GraphicsToolkitManager {
    private RendererPreference[] preferences;
    private TextureProvider textures;
    static ResourceArchive field_d;
    private boolean configurationApplied;
    private RendererSession session;

    private final void setRendererPreferences(RendererPreference[] preferences, int guard) {
        try {
          if (guard < 89) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            this.selectToolkit(127, (java.awt.Canvas) null);
          }
          if (preferences != this.preferences) {
            if (preferences.length == 0) {
              throw new IllegalArgumentException();
            }
            this.preferences = preferences;
            this.configurationApplied = false;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ik.G(" + (preferences != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static int topDialogX(int guard) {
        if (guard != -10517) {
          GraphicsToolkitManager.topDialogX(113);
        }
        if (!BeveledCheckboxRenderer.hasOpenDialogs(false) ||
          null == pu.field_e.topOpenDialog((byte) 54)) {
          return -1;
        }
        return pu.field_e.topOpenDialog((byte) 54).x;
    }

    final boolean updateToolkit(boolean guard) {
        if (guard) {
          this.textures = (TextureProvider) null;
        }
        return this.updateToolkitForCanvas(hk.b(-45), 89);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_d = null;
    }

    private final boolean updateToolkitForCanvas(java.awt.Canvas canvas, int guard) {
        RendererSession var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.session;
          if (var3 == null ||
            !this.configurationApplied ||
            canvas != var3.canvas) {
            this.selectToolkit(-101, canvas);
          }
          var4 = 113 / ((12 - guard) / 52);
          if (this.session != null) {
            this.session.toolkit.updateTime((int)(wq.monotonicTimeMillis(-116) - this.session.startTimeMillis));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.session && (var3 == null ||
            this.session.toolkit != var3.toolkit)) {
            stackIn_13_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = false;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ik.A(");
          if (canvas == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void selectToolkit(int guard, java.awt.Canvas canvas) {
        int var5 = 0;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        RendererPreference[] var4 = null;
        RendererPreference var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        RendererSession var8 = null;
        int var9 = 0;
        int var10 = 0;
        GraphicsToolkit var11 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3 = null;
          if (guard != -101) {
            this.getToolkit(-39);
          }
          var4 = this.preferences;
          for (var5 = 0; var5 < var4.length; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = var4[var5];
            if (var6.enabled) {
              var7_int = var6.backend;
              if (var7_int != 0) {
                if (var7_int == 5) {
                  if (!LegacyOpenGlShaderProgram.field_d.loadIndex((byte) 127)) {
                    return;
                  }
                  var7_int = ig.a("hw3d", true);
                  if (var7_int == -1) {
                    var6.enabled = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (100 > var7_int) {
                      return;
                    }
                    var8_int = ig.a("jaclib", true);
                    if (var8_int == -1) {
                      var6.enabled = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var8_int < 100) {
                        return;
                      }
                      var9 = ig.a("jaggl", true);
                      if (var9 == -1) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var9 < 100) {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (1 != var7_int) {
                    if (var7_int == 3) {
                      if (!LegacyOpenGlShaderProgram.field_d.loadIndex((byte) 127)) {
                        return;
                      }
                      var7_int = ig.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = ig.a("jagdx", true);
                        if (var8_int == -1) {
                          var6.enabled = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var8_int < 100) {
                            return;
                          }
                          var9 = ig.a("hw3d", true);
                          if (var9 == -1) {
                            var6.enabled = false;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (100 > var9) {
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (var7_int != 2) {
                        throw new IllegalStateException("UT" + var6.backend);
                      }
                      if (!LegacyOpenGlShaderProgram.field_d.loadIndex((byte) 127)) {
                        return;
                      }
                      var7_int = ig.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (100 > var7_int) {
                          return;
                        }
                        var8_int = ig.a("sw3d", true);
                        if (var8_int == -1) {
                          var6.enabled = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (100 > var8_int) {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!LegacyOpenGlShaderProgram.field_d.loadIndex((byte) 127)) {
                      return;
                    }
                    var7_int = ig.a("jaclib", true);
                    if (-1 == var7_int) {
                      var6.enabled = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (100 > var7_int) {
                        return;
                      }
                      var8_int = ig.a("jaggl", true);
                      if (var8_int == -1) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var8_int < 100) {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.session) {
                  if (this.session.preference.sameBackend(var6, (byte) 95) &&
                    null != this.session.toolkit &&
                    this.session.canvas == canvas &&
                    var6.acceptsSession(this.session, (byte) -123)) {
                    this.configurationApplied = true;
                    return;
                  }
                  if (~this.session.preference.backend == ~var6.backend &&
                    this.session.toolkit != null) {
                    var3 = this.session.captureState(-43);
                    this.session.toolkit.close((byte) -94);
                    this.session = null;
                  }
                }
                try {
                  var11 = HardwareTurbulentWaterNoise.createToolkitForCanvas(var6.backend, canvas, this.textures, true, var6.options, GraphicsToolkit.field_g);
                  if (var11 != null) {
                    var8 = new RendererSession(var11, var6, canvas);
                    if (var6.acceptsSession(var8, (byte) -36)) {
                      if (this.session != null) {
                        if (var8.toolkit == this.session.toolkit &&
                          var8.canvas == this.session.canvas) {
                          this.session = var8;
                          this.configurationApplied = true;
                          return;
                        }
                        var3 = this.session.captureState(79);
                        this.session.toolkit.close((byte) -109);
                      }
                      if (var8.toolkit.usesNativeRendering()) {
                        var8.toolkit.useHeap(var8.toolkit.createHeap(100663296));
                      }
                      if (var3 == null) {
                        var8.startTimeMillis = wq.monotonicTimeMillis(guard + 59);
                      } else {
                        ((RendererStateSnapshot) (var3)).restore(var8, 3);
                      }
                      this.configurationApplied = true;
                      this.session = var8;
                      return;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var7 = decompiledCaughtException;
                  var7.printStackTrace();
                }
                var6.enabled = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_115_0 = var3;
          stackIn_115_1 = new StringBuilder().append("ik.B(").append(guard).append(',');
          if (canvas == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) (stackIn_115_0), ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(')').toString());
        }
    }

    final GraphicsToolkit getToolkit(int guard) {
        if (guard >= -89) {
          return (GraphicsToolkit) null;
        }
        if (this.session == null) {
          return null;
        }
        return this.session.toolkit;
    }

    GraphicsToolkitManager(int nativeArchiveId, int shaderArchiveId, TextureProvider textureProvider) {
        this(kd.a((byte) -123, nativeArchiveId), ScrollControl.b(shaderArchiveId, -1), textureProvider, lt.field_m, IntrusiveNode.b(-16754));
    }

    private GraphicsToolkitManager(ResourceArchive nativeArchive, ResourceArchive shaderArchive, TextureProvider textureProvider, PlatformTaskDispatcher dispatcher, RendererPreference[] rendererPreferences) {
        this.configurationApplied = false;
        try {
          GraphicsToolkit.field_g = shaderArchive;
          this.textures = textureProvider;
          LegacyOpenGlShaderProgram.field_d = nativeArchive;
          ow.a(-18527, nativeArchive, dispatcher);
          this.setRendererPreferences(rendererPreferences, 97);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ik.<init>(" + (nativeArchive != null ? "{...}" : "null") + ',' + (shaderArchive != null ? "{...}" : "null") + ',' + (textureProvider != null ? "{...}" : "null") + ',' + (dispatcher != null ? "{...}" : "null") + ',' + (rendererPreferences != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
