/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlFramebuffer implements OpenGlFramebufferBinding {
    private int framebufferId;
    private int bindingMask;
    private OpenGlToolkit toolkit;
    private int field_i;
    private int field_j;
    static TextureCoordinateMode field_c;
    private int boundTarget;
    private int attachmentMask;
    static volatile int field_b;
    private OpenGlFramebufferAttachment[] attachments;

    final void setReadBuffer(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.boundTarget == -1) {
            throw new RuntimeException();
          }
          jaggl.OpenGL.glReadBuffer(SetOndamageParticleSpeed.field_o[param1]);
          if (param0 > 118) {
            return;
          }
          this.attachmentMask = 14;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "rpa.M(" + param0 + ',' + param1 + ')');
        }
    }

    public final void unbindReadFramebuffer(int param0) {
        try {
          if (param0 <= 7) {
            this.field_i = -33;
          }
          jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
          this.bindingMask = this.bindingMask & -2;
          this.boundTarget = this.getBoundTarget(2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.E(" + param0 + ')');
        }
    }

    public final void bindFramebuffer(int param0) {
        if (param0 != -5574) {
          return;
        }
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36160, this.framebufferId);
          this.bindingMask = this.bindingMask | 4;
          this.boundTarget = this.getBoundTarget(2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.F(" + param0 + ')');
        }
    }

    final static Ship a(int param0, int param1, boolean param2) {
        Ship stackIn_9_0 = null;
        Ship stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ShipComponent var4 = null;
        int var5 = 0;
        int var6 = 0;
        Ship var7 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 == 0) {
            stackIn_9_0 = TimedSpecialOrderBehaviour.a(!param2);
            return stackIn_9_0;
          }
          var7 = new Ship();
          var4 = new ShipComponent(param0);
          var5 = param0;
          if (var5 == 3) {
            waa.a(var4, 18632);
          } else {
            if (var5 != 7) {
              if (var5 == 8) {
                UiSingleChildContainer.a(var4, 27);
              } else {
                if (var5 != 9) {
                  if (10 == var5) {
                    SetPhasedEnergyBeamProjectiles.a(var4, 116);
                  } else {
                    if (var5 == 11) {
                      PlayerVoteFactory.a(param2, var4);
                    } else {
                      if (var5 == 4) {
                        GrapplingHookFactory.a((byte) 127, var4);
                      } else {
                        if (var5 == 5) {
                          lc.a(38, var4);
                        } else {
                          if (var5 != 6) {
                            if (var5 == 1) {
                              if (param1 == 0) {
                                GetExplosionProjectileDamage.a(var4, -14);
                              } else {
                                if (1 == param1) {
                                  ArbProgram.a((byte) -94, var4);
                                }
                              }
                            } else {
                              if (var5 == 2) {
                                if (param1 == 0) {
                                  mb.a(-1688588312, var4);
                                } else {
                                  if (param1 != 1) {
                                    if (param1 == 2) {
                                      LoadBlackboxRecording.a(var4, (byte) -10);
                                    }
                                  } else {
                                    eqb.a(var4, 14670);
                                  }
                                }
                              }
                            }
                          } else {
                            GetMpSandboxEnemySpawnLimit.a(var4, (byte) 127);
                          }
                        }
                      }
                    }
                  }
                } else {
                  GetMissilesExplosionPower.a(var4, -77);
                }
              }
            } else {
              GetUseBackgroundInFullscreen.a((byte) -107, var4);
            }
          }
          var7.chassis = var4;
          if (!param2) {
            field_c = (TextureCoordinateMode) null;
          }
          var7.recalculateMassProperties((byte) 119);
          var7.chassis.configureThrusterBindings((byte) -128, (ShipBody) (var7));
          stackIn_64_0 = var7;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "rpa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setDrawBuffer(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (~this.boundTarget == param0) {
            throw new RuntimeException();
          }
          jaggl.OpenGL.glDrawBuffer(SetOndamageParticleSpeed.field_o[param1]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "rpa.O(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isComplete(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.boundTarget);
          var3 = 10 % ((28 - param0) / 58);
          if (var2_int == 36053) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "rpa.H(" + param0 + ')');
        }
    }

    public final void bindDrawFramebuffer(int param0) {
        if (param0 != 31636) {
          return;
        }
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36009, this.framebufferId);
          this.bindingMask = this.bindingMask | 2;
          this.boundTarget = this.getBoundTarget(param0 - 31634);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.B(" + param0 + ')');
        }
    }

    public final void unbindFramebuffer(byte param0) {
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          if (param0 > -42) {
            this.framebufferId = 16;
          }
          this.bindingMask = this.bindingMask & -5;
          this.boundTarget = this.getBoundTarget(2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.A(" + param0 + ')');
        }
    }

    private final void attachTexture(OpenGlTexture2D param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.boundTarget == -1) {
            throw new RuntimeException();
          }
          if (param3 <= 23) {
            this.bindDrawFramebuffer(-123);
          }
          var5_int = 1 << param2;
          if ((~var5_int & this.attachmentMask) != 0) {
            if (param0.width != this.field_j ||
              param0.height != this.field_i) {
              throw new RuntimeException();
            }
          } else {
            this.field_i = param0.height;
            this.field_j = param0.width;
          }
          param0.attachToFramebuffer(this.boundTarget, SetOndamageParticleSpeed.field_o[param2], param1, false);
          this.attachments[param2] = (OpenGlFramebufferAttachment) ((Object) param0);
          this.attachmentMask = this.attachmentMask | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rpa.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        try {
          this.toolkit.enqueueFramebufferDisposal((byte) 107, this.framebufferId);
          super.finalize();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.finalize()");
        }
    }

    final void attachRenderbuffer(int param0, OpenGlRenderbuffer param1, byte param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (-1 == this.boundTarget) {
            throw new RuntimeException();
          }
          if (param2 != -20) {
            return;
          }
          var4_int = 1 << param0;
          if ((~var4_int & this.attachmentMask) != 0) {
            if (param1.width != this.field_j ||
              this.field_i != param1.height) {
              throw new RuntimeException();
            }
          } else {
            this.field_i = param1.height;
            this.field_j = param1.width;
          }
          param1.attachToFramebuffer(1, SetOndamageParticleSpeed.field_o[param0], this.boundTarget);
          this.attachments[param0] = (OpenGlFramebufferAttachment) ((Object) param1);
          this.attachmentMask = this.attachmentMask | var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("rpa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void detachAttachment(int param0, byte param1) {
        try {
          if (this.attachments[param0] != null) {
            this.attachments[param0].detachFromFramebuffer(31294);
          }
          int var3_int = 115 / ((53 - param1) / 55);
          this.attachmentMask = this.attachmentMask & ~(1 << param0);
          this.attachments[param0] = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void unbindDrawFramebuffer(byte param0) {
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          this.bindingMask = this.bindingMask & -3;
          this.boundTarget = this.getBoundTarget(2);
          if (param0 <= 52) {
            this.boundTarget = 85;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.D(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        try {
          field_c = null;
          if (param0 != 1) {
            field_c = (TextureCoordinateMode) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.P(" + param0 + ')');
        }
    }

    public final void bindReadFramebuffer(int param0) {
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36008, this.framebufferId);
          int var2_int = 32 / ((param0 - 3) / 57);
          this.bindingMask = this.bindingMask | 1;
          this.boundTarget = this.getBoundTarget(2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rpa.C(" + param0 + ')');
        }
    }

    private final int getBoundTarget(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if ((4 & this.bindingMask) != 0) {
            stackIn_4_0 = 36160;
            return stackIn_4_0;
          }
          if ((param0 & this.bindingMask) != 0) {
            stackIn_7_0 = 36009;
            return stackIn_7_0;
          }
          if ((1 & this.bindingMask) != 0) {
            stackIn_12_0 = 36008;
            return stackIn_12_0;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "rpa.G(" + param0 + ')');
        }
    }

    final void attachTexture(int param0, byte param1, OpenGlTexture2D param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.attachTexture(param2, 0, param0, 77);
          if (param1 > -124) {
            this.framebufferId = -30;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rpa.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    OpenGlFramebuffer(OpenGlToolkit param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.bindingMask = 0;
        this.boundTarget = -1;
        this.attachments = new OpenGlFramebufferAttachment[9];
        try {
          if (!param0.field_U) {
            throw new IllegalStateException("");
          }
          this.toolkit = param0;
          jaggl.OpenGL.glGenFramebuffersEXT(1, SetLaserRandomness.field_r, 0);
          this.framebufferId = SetLaserRandomness.field_r[0];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("rpa.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_c = new TextureCoordinateMode();
        field_b = 0;
    }
}
