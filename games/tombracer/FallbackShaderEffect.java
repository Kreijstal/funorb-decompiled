/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FallbackShaderEffect extends ShaderEffect {
    static String field_e;
    static int field_f;
    static String field_d;

    FallbackShaderEffect(HardwareGraphicsToolkit param0) {
        super(param0);
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        try {
          this.owner.bindTexture(true, param1);
          if (param2 != 24595) {
            field_e = (String) null;
          }
          this.owner.setTextureCombineMode((byte) -108, param0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vu.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 != 5744) {
          this.setParameters((byte) 31, 78, -5);
        }
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          field_d = (String) null;
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        int var1 = -45 % ((-36 - param0) / 51);
        field_d = null;
        field_e = null;
    }

    final static void updateOpponentSearchControls(byte param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_23_0 = null;
        UiComponent stackIn_34_0 = null;
        String stackIn_35_1 = null;
        UiComponent stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_2 = null;
        UiComponent stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        boolean stackIn_68_2 = false;
        UiComponent stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        boolean stackIn_73_2 = false;
        UiComponent stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        boolean stackIn_78_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        UiComponent var15 = null;
        String var16 = null;
        UiComponent var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          dga.layoutBottomPanels(GameKeyHandler.field_a, 199);
          if (null != WaveformOperator.field_n) {
            HiscoresScreen.field_z.field_t = 0;
            var15 = HiscoresScreen.field_z;
            var17 = var15;
            var17.field_G = 0;
            hw.field_a.field_t = 0;
            var5 = hw.field_a;
            var5.field_G = 0;
            var6 = MessageOverlay.field_t;
            MessageOverlay.field_t.field_t = 0;
            var6.field_G = 0;
            StatusEffect.field_g.field_r = dka.field_a.toUpperCase();
            var7 = (dka.field_b.field_G + 2) / 2;
            MessageOverlay.field_t.setBounds(-2 + var7, 40, -23776, -40 + dka.field_b.field_t, 0);
            hw.field_a.setBounds(dka.field_b.field_G - var7, 40, param0 - 23777, -40 + dka.field_b.field_t, var7);
            if (SafeZoneBehaviour.field_u.length == 1 &&
              SafeZoneBehaviour.field_u[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < SafeZoneBehaviour.field_u.length) {
                  stackIn_10_0 = ((CourseLayoutFactory.field_b[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    SafeZoneBehaviour.field_u[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            hw.field_a.field_X = true;
            if (!PlayerViewport.field_o) {
              stackIn_34_0 = hw.field_a;
              if (var8 != 0) {
                stackIn_35_1 = kk.field_a;
              } else {
                stackIn_35_1 = rf.field_b;
              }
              stackIn_34_0.field_r = ((String) (Object) stackIn_35_1).toUpperCase();
              stackIn_37_0 = HazardModel.field_t;
              stackIn_37_1 = 114;
              if (var8 != 0) {
                stackIn_38_2 = ResourceArchive.field_c;
              } else {
                stackIn_38_2 = TombRacer.field_F;
              }
              stackIn_37_0.field_r = LegacyOpenGlFlowingWaterEffect.formatText(stackIn_37_1, stackIn_38_2, new String[]{hw.field_a.field_r});
              MessageOverlay.field_t.field_r = RenderLayer.field_h;
              bc.field_b.field_X = true;
              TouchSwitchBehaviour.field_s = true;
              if (null != PlatformModel.field_A) {
                TouchSwitchBehaviour.field_s = false;
                if (null == MonochromeRowCacheEntry.field_m) {
                  MonochromeRowCacheEntry.field_m = new byte[ColourRowCache.field_b];
                  sda.field_f = new boolean[ColourRowCache.field_b];
                }
                mm.field_g = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (ColourRowCache.field_b > var13) {
                  sda.field_f[var13] = false;
                  var13++;
                }
                MatchOverlayQueue.findValidSettingCombination(param0 + 108, ColourRowCache.field_b, WaveformOperator.field_n, 0, -1, -1, -1, true);
                if (!(ld.field_e < 2) &&
                  VerticalScrollbar.field_tb[12]) {
                  TouchSwitchBehaviour.field_s = true;
                }
              }
              if (!TouchSwitchBehaviour.field_s) {
                hw.field_a.field_X = false;
                if (hw.field_a.field_pb) {
                  var9 = null;
                  if (mm.field_g) {
                    var9 = "<col=A00000>" + ConsoleToken.field_j + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < ColourRowCache.field_b; var10Lifetime1++) {
                    if (sda.field_f[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + DebouncedValidationSource.field_e[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  ArchiveNetworkClient.field_b = "<col=A00000>" + SequencePlayer.field_a + "<br>" + WhiteLightSensorComponent.field_J + (String) (var9);
                }
              }
            } else {
              bc.field_b.field_X = false;
              HazardModel.field_t.field_r = ThresholdOperator.field_n;
              if (var8 != 0) {
                stackIn_23_0 = HardwareGraphicsHeap.field_l;
              } else {
                stackIn_23_0 = ChatMessage.field_k;
              }
              var16 = stackIn_23_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = MessageOverlay.field_t.field_H.stringWidth(var16) + 3 * MessageOverlay.field_t.field_H.charWidth('.');
              if ((lh.field_a & 48) == 16) {
                var9 = var16 + ".";
              }
              MessageOverlay.field_t.field_x = (MessageOverlay.field_t.field_G - var10Lifetime1) / 2;
              MessageOverlay.field_t.field_z = 0;
              if ((lh.field_a & 48) == 32) {
                var9 = (String) (var9) + "..";
              }
              if (48 == (lh.field_a & 48)) {
                var9 = (String) (var9) + "...";
              }
              MessageOverlay.field_t.field_r = (String) (var9);
              hw.field_a.field_r = mq.field_d.toUpperCase();
            }
          }
          stackIn_67_0 = C2SRoomResultPacket.field_c;
          stackIn_67_1 = param0 ^ -102;
          stackIn_68_2 = (param1) && (!param2) && (!OpenGlDisplayLists.field_e);
          ((UiComponent) (Object) stackIn_67_0).layoutFullScreen(stackIn_67_1, stackIn_68_2);
          stackIn_72_0 = dka.field_b;
          stackIn_72_1 = -111;
          stackIn_73_2 = (param1) && (!param2) && (!OpenGlDisplayLists.field_e);
          ((UiComponent) (Object) stackIn_72_0).layoutFullScreen(stackIn_72_1, stackIn_73_2);
          stackIn_77_0 = PlayerModel.field_a;
          stackIn_77_1 = -113;
          stackIn_78_2 = (param1) && (!param2) && (OpenGlDisplayLists.field_e);
          ((UiComponent) (Object) stackIn_77_0).layoutFullScreen(stackIn_77_1, stackIn_78_2);
          rm.field_e.field_a.processTabPresses((byte) -99);
          if (param0 != 1) {
            FallbackShaderEffect.releaseStatics(-121);
          }
          if (null != WaveformOperator.field_n) {
            if (bc.field_b.field_y != 0) {
              gk.a(param3, (byte) 28);
            }
            if (hw.field_a.field_y != 0) {
              if (PlayerViewport.field_o) {
                ItemBehaviour.a((byte) 34, param3);
              } else {
                HardwareSceneLight.a(param3, (byte) -128);
              }
            }
            cm.updateLobbyGameOptionControls(param3, WaveformOperator.field_n, -21290, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var4), "vu.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void setParameters(byte param0, int param1, int param2) {
        if (param0 != 55) {
          field_e = (String) null;
        }
    }

    final void disable(int param0) {
        if (param0 > -4) {
          field_f = 59;
        }
    }

    final void enable(int param0, boolean param1) {
        int var3 = -103 % ((param0 - 41) / 62);
    }

    static {
        field_f = 0;
        field_d = "Race Winner";
        field_e = "Invite";
    }
}
