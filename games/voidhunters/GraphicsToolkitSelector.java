/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GraphicsToolkitSelector {
    static String field_b;
    ToolkitCanvasContext context;
    private GraphicsBackendOption[] backendOptions;
    private boolean selectionCurrent;
    private TextureProvider textureProvider;

    final static void loadPlayerGameData(int param0, byte[] param1) {
        String var4 = null;
        PlayerGameData var2_ref = null;
        GetDebrisThrowable.a(false, "Reading gamedata from server");
        Object var2 = null;
        try {
          var2_ref = (PlayerGameData) (ProjectileFactory.a(param1, 6429, AdjustVariableAction.field_c));
        } catch (Exception exception) {
          var4 = TextNode.formatByteArray(param1, param0 ^ 29411);
          var2_ref = new PlayerGameData();
          GetMissionResnetResourceTickTime.savePlayerGameData((byte) -69);
          FractalNoiseVolumeGenerator.reportClientError((Throwable) ((Object) exception), "Gamedata is corrupted - " + var4, 0);
        }
        if (var2_ref == null) {
          return;
        }
        if (!(1 >= var2_ref.version)) {
          FractalNoiseVolumeGenerator.reportClientError((Throwable) null, "Gamedata is for a version that doesn't exist yet (" + var2_ref.version + ")! The clientdata is probably corrupted.", 0);
          return;
        }
        try {
          GetDebrisThrowable.a(false, "Player gamedata=" + var2_ref);
          if (var2_ref != null) {
            GetDebrisThrowable.a(false, "Player gamedata blueprint=" + var2_ref.blueprint);
          }
          if (param0 != -29365) {
            field_b = (String) null;
          }
          TooltipDisplay.field_b = var2_ref;
          GetSalvoUsesAllEnergy.a(-118);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fab.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static SoftwareMonochromeBitmapFont loadSoftwareMonochromeFontByName(ResourceArchive param0, String param1, int param2, ResourceArchive param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        SoftwareMonochromeBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.getGroupId(param4, -95);
          var6 = param3.getFileId(true, var5_int, param1);
          if (param2 != 0) {
            field_b = (String) null;
          }
          stackIn_3_0 = TextureOperation.a(param3, (byte) -35, param0, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("fab.A(");
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void selectForCanvas(java.awt.Canvas param0, byte param1) {
        int var5 = 0;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        GraphicsBackendOption[] var4 = null;
        GraphicsBackendOption var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        ToolkitCanvasContext var8 = null;
        int var9 = 0;
        int var10 = 0;
        GraphicsToolkit var11 = null;
        var10 = VoidHunters.field_G;
        try {
          var3 = null;
          if (param1 >= -77) {
            return;
          }
          var4 = this.backendOptions;
          for (var5 = 0; var5 < var4.length; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = var4[var5];
            if (var6.enabled) {
              var7_int = var6.backendId;
              if (var7_int != 0) {
                if (var7_int != 5) {
                  if (var7_int == 1) {
                    if (!MissionEventFactory.field_a.loadIndex((byte) 87)) {
                      return;
                    }
                    var7_int = PartitionZoneListFactory.a("jaclib", true);
                    if (var7_int == -1) {
                      var6.enabled = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (100 > var7_int) {
                        return;
                      }
                      var8_int = PartitionZoneListFactory.a("jaggl", true);
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
                  } else {
                    if (3 == var7_int) {
                      if (!MissionEventFactory.field_a.loadIndex((byte) -57)) {
                        return;
                      }
                      var7_int = PartitionZoneListFactory.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = PartitionZoneListFactory.a("jagdx", true);
                        if (-1 == var8_int) {
                          var6.enabled = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (100 > var8_int) {
                            return;
                          }
                          var9 = PartitionZoneListFactory.a("hw3d", true);
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
                      if (var7_int != 2) {
                        throw new IllegalStateException("UT" + var6.backendId);
                      }
                      if (!MissionEventFactory.field_a.loadIndex((byte) -83)) {
                        return;
                      }
                      var7_int = PartitionZoneListFactory.a("jaclib", true);
                      if (-1 == var7_int) {
                        var6.enabled = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = PartitionZoneListFactory.a("sw3d", true);
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
                } else {
                  if (!MissionEventFactory.field_a.loadIndex((byte) 121)) {
                    return;
                  }
                  var7_int = PartitionZoneListFactory.a("hw3d", true);
                  if (var7_int == -1) {
                    var6.enabled = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var7_int < 100) {
                      return;
                    }
                    var8_int = PartitionZoneListFactory.a("jaclib", true);
                    if (-1 == var8_int) {
                      var6.enabled = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var8_int < 100) {
                        return;
                      }
                      var9 = PartitionZoneListFactory.a("jaggl", true);
                      if (-1 == var9) {
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
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.context) {
                  if (this.context.backendOption.hasSameBackend((byte) -94, var6) &&
                    null != this.context.toolkit &&
                    this.context.canvas == param0 &&
                    var6.isCompatibleWithContext(this.context, -78)) {
                    this.selectionCurrent = true;
                    return;
                  }
                  if (var6.backendId == this.context.backendOption.backendId &&
                    this.context.toolkit != null) {
                    var3 = this.context.captureViewState((byte) -126);
                    this.context.toolkit.dispose((byte) 30);
                    this.context = null;
                  }
                }
                try {
                  var11 = SetPhasedEnergyBeamProjectiles.createToolkitForCanvas(false, param0, var6.multisamples, this.textureProvider, lwa.field_xb, var6.backendId);
                  if (var11 != null) {
                    var8 = new ToolkitCanvasContext(var11, var6, param0);
                    if (var6.isCompatibleWithContext(var8, -97)) {
                      if (this.context != null) {
                        if (this.context.toolkit == var8.toolkit &&
                          this.context.canvas == var8.canvas) {
                          this.selectionCurrent = true;
                          this.context = var8;
                          return;
                        }
                        var3 = this.context.captureViewState((byte) -114);
                        this.context.toolkit.dispose((byte) 30);
                      }
                      if (var8.toolkit.supportsMemoryPools()) {
                        var8.toolkit.setHeap(var8.toolkit.createHeap(100663296));
                      }
                      if (var3 == null) {
                        var8.timeOriginMillis = MonotonicMillisClock.currentTimeMillis(false);
                      } else {
                        ((ToolkitViewState) (var3)).restore(1, var8);
                      }
                      this.context = var8;
                      this.selectionCurrent = true;
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
          stackIn_118_0 = var3;
          stackIn_118_1 = new StringBuilder().append("fab.E(");
          if (param0 == null) {
            stackIn_119_2 = "null";
          } else {
            stackIn_119_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_118_0), ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != 10970) {
          field_b = (String) null;
        }
    }

    final static void writeRsaXteaPayload(int param0, int param1, PacketBuffer param2, byte[] param3, java.math.BigInteger param4, byte param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          var7_int = ClientDataReadRequest.alignToEight(param1, -18262);
          if (PartitionZone.field_a == null) {
            PartitionZone.field_a = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param5 != 47) {
            field_b = (String) null;
          }
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = PartitionZone.field_a.nextInt();
          }
          if (null == OpenGlDisplayLists.field_a ||
            !(OpenGlDisplayLists.field_a.payload.length >= var7_int)) {
            OpenGlDisplayLists.field_a = new PacketBuffer(var7_int);
          }
          OpenGlDisplayLists.field_a.position = 0;
          OpenGlDisplayLists.field_a.writeBytes(param0, param3, -1, param1);
          OpenGlDisplayLists.field_a.padToPosition(var7_int, (byte) 66);
          OpenGlDisplayLists.field_a.xteaEncrypt(var13, (byte) 127);
          if (null == GetKeepTeamColours.field_o ||
            !(GetKeepTeamColours.field_o.payload.length >= 100)) {
            GetKeepTeamColours.field_o = new PacketBuffer(100);
          }
          GetKeepTeamColours.field_o.position = 0;
          GetKeepTeamColours.field_o.writeByte(param5 ^ 47, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            GetKeepTeamColours.field_o.writeInt(var13[var11], param5 ^ 332614567);
            var11++;
          }
          GetKeepTeamColours.field_o.writeShort(param1, true);
          GetKeepTeamColours.field_o.rsaEncrypt(param6, param4, 16711680);
          param2.writeBytes(0, GetKeepTeamColours.field_o.payload, -1, GetKeepTeamColours.field_o.position);
          param2.writeBytes(0, OpenGlDisplayLists.field_a.payload, param5 - 48, OpenGlDisplayLists.field_a.position);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("fab.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void setBackendOptions(boolean param0, GraphicsBackendOption[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            GraphicsToolkitSelector.clearSharedReferences(23);
          }
          if (param1 != this.backendOptions) {
            if (param1.length == 0) {
              throw new IllegalArgumentException();
            }
            this.selectionCurrent = false;
            this.backendOptions = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fab.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    GraphicsToolkitSelector(TextureProvider param0, GraphicsBackendOption[] param1) {
        this(GetAiRepairAmount.a(0), DeveloperConsole.getToolkitResourceArchive(0), param0, SetTorpedoProjectiles.field_o, param1);
    }

    private GraphicsToolkitSelector(ResourceArchive param0, ResourceArchive param1, TextureProvider param2, PlatformService param3, GraphicsBackendOption[] param4) {
        this.selectionCurrent = false;
        try {
          lwa.field_xb = param1;
          MissionEventFactory.field_a = param0;
          this.textureProvider = param2;
          TextureLineShape.a(param3, (byte) 127, param0);
          this.setBackendOptions(false, param4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean updateForCanvas(byte param0, java.awt.Canvas param1) {
        ToolkitCanvasContext var3 = null;
        RuntimeException var3_ref = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -110) {
            field_b = (String) null;
          }
          var3 = this.context;
          if (var3 == null ||
            !this.selectionCurrent ||
            var3.canvas != param1) {
            this.selectForCanvas(param1, (byte) -119);
          }
          if (null != this.context) {
            this.context.toolkit.updateFrame((int)(MonotonicMillisClock.currentTimeMillis(false) - this.context.timeOriginMillis));
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.context != null && (var3 == null ||
            var3.toolkit != this.context.toolkit)) {
            stackIn_15_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_15_0 = false;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
