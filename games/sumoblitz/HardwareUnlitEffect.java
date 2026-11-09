/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareUnlitEffect extends ShaderEffect {
    static int field_f;
    static int field_e;
    static long field_g;

    final void enable(boolean lighting, int guard) {
        if (guard != 20186) {
          return;
        }
        this.toolkit.setLightingSuppressed(true, true);
    }

    HardwareUnlitEffect(HardwareGraphicsToolkit owner) {
        super(owner);
    }

    final static void placeAndRegisterDrone(Drone drone, boolean guard) {
        int var2_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ArenaPad var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Drone var11 = null;
        IntrusiveDequeCursor var12 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var2_int = 0; ServerDataWriteRequest.droneSlotLimit > var2_int; var2_int++) {
            var11 = SpriteMask.drones[var2_int];
            if (var11 != null) {
              var4 = var11.radiusQ8 + drone.radiusQ8;
              if (DroneProximitySupport.isWithinRadius(var11.yQ8, var4, -104, drone.xQ8, var11.xQ8, drone.yQ8)) {
                var5 = -var11.xQ8 + drone.xQ8;
                var6 = drone.yQ8 - var11.yQ8;
                if (var5 == 0) {
                  var5 = -1 + (2 & TextureFormat.elapsedTicks << 1);
                }
                if (var6 == 0) {
                  var6 = ((1 & TextureFormat.elapsedTicks) << 1) - 1;
                }
                var7 = (int)Math.round(Math.sqrt((double)((float)var5 * (float)var5 + (float)var6 * (float)var6)));
                if (var4 > var7) {
                  var8 = var5 * (-var7 + var4) / var7;
                  var9 = (var4 - var7) * var6 / var7;
                  drone.xQ8 = drone.xQ8 + var8;
                  drone.yQ8 = drone.yQ8 + var9;
                  var11.xQ8 = var11.xQ8 - var8;
                  var11.yQ8 = var11.yQ8 - var9;
                }
              }
            }
          }
          var12 = new IntrusiveDequeCursor(QuickChatPhraseProvider.arenaPads);
          var3 = (ArenaPad) (var12.first((byte) -80));
          if (guard) {
            return;
          }
          while (var3 != null) {
            var4Lifetime1 = (var3.radiusPixels << 8) + drone.radiusQ8;
            if (DroneProximitySupport.isWithinRadius(drone.yQ8, var4Lifetime1, -114, var3.xQ8, drone.xQ8, var3.yQ8)) {
              var5Lifetime1 = -var3.xQ8 + drone.xQ8;
              if (var5Lifetime1 == 0) {
                var5Lifetime1 = -1 + (2 & TextureFormat.elapsedTicks << 1);
              }
              var6Lifetime1 = -var3.yQ8 + drone.yQ8;
              if (var6Lifetime1 == 0) {
                var6Lifetime1 = -1 + ((TextureFormat.elapsedTicks & 1) << 1);
              }
              var7Lifetime1 = (int)Math.round(Math.sqrt((double)((float)var6Lifetime1 * (float)var6Lifetime1 + (float)var5Lifetime1 * (float)var5Lifetime1)));
              if (var4Lifetime1 > var7Lifetime1) {
                var8Lifetime1 = var5Lifetime1 * (-var7Lifetime1 + var4Lifetime1) / var7Lifetime1;
                drone.xQ8 = drone.xQ8 + (var8Lifetime1 << 1);
                var9Lifetime1 = (var4Lifetime1 - var7Lifetime1) * var6Lifetime1 / var7Lifetime1;
                drone.yQ8 = drone.yQ8 + (var9Lifetime1 << 1);
              }
            }
            var3 = (ArenaPad) (var12.next(0));
          }
          if (-drone.radiusQ8 + drone.xQ8 < 6656) {
            drone.xQ8 = drone.xQ8 + (26 << 9 + drone.radiusQ8);
          }
          if (-drone.radiusQ8 + drone.yQ8 < 6656) {
            drone.yQ8 = drone.yQ8 + (26 << drone.radiusQ8 + 9);
          }
          if (drone.radiusQ8 + drone.xQ8 > ArchiveCatalog.field_c - 26 << 8) {
            drone.xQ8 = drone.xQ8 - (26 << 9 + drone.radiusQ8);
          }
          if (RasterStateFrame.field_k - 26 << 8 < drone.radiusQ8 + drone.yQ8) {
            drone.yQ8 = drone.yQ8 - (26 << 9 + drone.radiusQ8);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < ServerDataWriteRequest.droneSlotLimit; var4Lifetime2++) {
            if (SpriteMask.drones[var4Lifetime2] == null &&
              var4Lifetime2 != 0) {
              SpriteMask.drones[var4Lifetime2] = drone;
              return;
            }
          }
          if (SpriteMask.drones.length > ServerDataWriteRequest.droneSlotLimit) {
            fieldTemp$0 = ServerDataWriteRequest.droneSlotLimit;
            ServerDataWriteRequest.droneSlotLimit = ServerDataWriteRequest.droneSlotLimit + 1;
            SpriteMask.drones[fieldTemp$0] = drone;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("oc.P(");
          if (drone == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(guard).append(')').toString());
        }
    }

    final static int completedLevelCount(int guard) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          if (guard != 17079) {
            field_f = -57;
          }
          for (var2 = 0; var2 < 25; var2++) {
            if (TextureMetadata.completedLevels[var2]) {
              var1_int++;
            }
          }
          stackIn_10_0 = var1_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "oc.N(" + guard + ')');
        }
    }

    final static void showAccountProgressDialog(String message, boolean returnToLogin, byte guard) {
        try {
          StatusMessagePanel.field_A = true;
          int var3_int = -70 % ((guard + 39) / 44);
          LoginDialogState.field_c = returnToLogin ? true : false;
          AccountStatusDialogState.activeDialog = new MessageDialog(RenderPresentationException.field_a, LegacyOpenGlDisplayLists.field_a, message, ReconnectState.reconnecting, LoginDialogState.field_c);
          RenderPresentationException.field_a.pushDialog((byte) 108, AccountStatusDialogState.activeDialog);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "oc.C(" + (message != null ? "{...}" : "null") + ',' + returnToLogin + ',' + guard + ')');
        }
    }

    final void disable(boolean guard) {
        this.toolkit.setLightingSuppressed(guard, true);
    }

    final boolean isSupported(byte guard) {
        if (guard > -8) {
          Drone var3 = (Drone) null;
          HardwareUnlitEffect.placeAndRegisterDrone((Drone) null, false);
        }
        return true;
    }

    final static boolean containsPoint(int top, byte guard, int x, int left, int height, int y, int width) {
        boolean stackIn_8_0 = false;
        if (guard != 122) {
          HardwareUnlitEffect.completedLevelCount(-55);
        }
        stackIn_8_0 = (left <= x) && (x < width + left) && (y >= top) && (height + top > y);
        return stackIn_8_0;
    }

    final static void appendHiscoreRow(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        OpenGlUnderwaterEffect.field_p[LoginCredentials.field_d] = param3;
        FourIntReadRequest.field_q[LoginCredentials.field_d] = LoginCredentials.field_d;
        LoginFieldValue.field_a[LoginCredentials.field_d] = param5;
        if (!(param5 >= GameplaySession.field_k)) {
          NoiseSliceGenerator.field_c = param5;
        }
        if (!(GameApplet.field_l >= param5)) {
          field_f = param5;
        }
        ContentTransitionPhase.field_f[LoginCredentials.field_d] = param1;
        LegacyOpenGlInterleavedStream.field_c[LoginCredentials.field_d] = param4;
        SlowBurstParticle.field_z[LoginCredentials.field_d] = param0;
        int var6 = param0 + param4 + param1;
        if (!param2) {
          String var8 = (String) null;
          HardwareUnlitEffect.showAccountProgressDialog((String) null, false, (byte) 69);
        }
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        IntroductionOverlaySupport.field_c[LoginCredentials.field_d] = var7;
        LoginCredentials.field_d = LoginCredentials.field_d + 1;
        if (NoiseSliceGenerator.field_c > var7) {
          NoiseSliceGenerator.field_c = var7;
        }
        if (var7 > field_f) {
          field_f = var7;
        }
    }

    final static String repeatCharacter(int count, char character, int guard) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        char[] var6 = new char[count];
        char[] var3 = var6;
        for (var4 = 0; count > var4; var4++) {
          var6[var4] = character;
        }
        if (guard != -1) {
          HardwareUnlitEffect.containsPoint(-114, (byte) 68, -4, 84, 1, -123, 101);
        }
        return new String(var3);
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        try {
          this.toolkit.bindTexture(texture, 106);
          if (guard != 18834) {
            field_f = -50;
          }
          this.toolkit.setTextureCombineMode(109, combineMode);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "oc.E(" + combineMode + ',' + guard + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final void refreshState(boolean lighting, byte guard) {
        if (guard > -71) {
          field_g = 53L;
        }
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        if (guard != 34023) {
          String var5 = (String) null;
          HardwareUnlitEffect.showAccountProgressDialog((String) null, false, (byte) -121);
        }
    }

    static {
        field_e = 1000;
    }
}
