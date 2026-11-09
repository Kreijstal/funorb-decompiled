/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClientShell extends GameApplet {
    private int field_r;
    private int field_w;
    private int field_E;
    static int field_t;
    private int field_v;
    static int field_s;
    private boolean field_q;
    private boolean field_z;
    static String waitingForSoundEffectsText;
    private long field_y;
    private int field_C;
    private int field_x;
    static String[] field_u;
    String field_D;
    private boolean field_B;

    private final void p(int param0) {
        RasterBuffer.field_e[1] = 16;
        RasterBuffer.field_e[13] = -1;
        RasterBuffer.field_e[16] = -1;
        RasterBuffer.field_e[4] = -1;
        RasterBuffer.field_e[9] = param0;
        RasterBuffer.field_e[6] = -2;
        RasterBuffer.field_e[12] = -1;
        RasterBuffer.field_e[10] = -1;
        RasterBuffer.field_e[11] = -1;
        RasterBuffer.field_e[5] = -1;
        RasterBuffer.field_e[17] = -1;
        RasterBuffer.field_e[18] = 1;
        RasterBuffer.field_e[3] = -1;
        RasterBuffer.field_e[7] = -1;
        RasterBuffer.field_e[2] = -2;
        RasterBuffer.field_e[8] = -2;
    }

    private final void d(byte param0) {
        if (param0 != 68) {
          return;
        }
        InteractiveWidget.field_z[5] = true;
    }

    final void b(boolean param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_106_0 = 0;
        boolean stackIn_107_1 = false;
        String stackIn_109_2 = null;
        boolean stackIn_110_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (SecondaryNodeDequeIterator.field_b != null) {
          if (null == CompactMeshGeometry.field_o) {
            var6 = km.gameContainer(false);
            var4 = var6.getSize();
            SecondaryNodeDequeIterator.field_b.a(var4.height, var4.width, (byte) -123);
          }
          SecondaryNodeDequeIterator.field_b.d(2);
        }
        PasswordInputRenderer.pollKeyboardState((byte) 124);
        LegacyOpenGlReflectionEffect.d(123);
        if (!FadingWidget.g(-66) &&
          11 != jv.field_a) {
          LegacyRidgedWaterNoise.updateDisplayDialogs(1886067877);
        }
        if (null != InwardSparkParticle.field_w) {
          OpenGlUnderwaterEffect.field_r = InwardSparkParticle.field_w.pollDelta(-88);
        }
        if (param1 >= -97) {
          this.field_D = (String) null;
        }
        if (TimedSceneEffect.a((byte) 90)) {
          var3 = 1200 * vm.a(-79);
          if (this.field_B ||
            !(var3 >= HiscorePlayerName.a((byte) 114)) &&
            !(GraphicsHeap.c(false) <= var3)) {
            this.field_B = false;
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -112);
            ScrollViewport.a((byte) 16);
            ArchiveCatalog.a((byte) 87, 2, NoiseSliceGenerator.weClosedTheConnectionText);
            GraphicsToolkit.a(-36);
            QuickChatCommand.field_d = true;
            sj.field_a = 15000L + wq.monotonicTimeMillis(-96);
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l == -1 ||
          LegacyOpenGlShoreWaveWaterEffect.field_l == 0) {
          stackIn_27_0 = (LegacyOpenGlShoreWaveWaterEffect.field_l != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_27_0;
          LegacyOpenGlShoreWaveWaterEffect.field_l = LegacyOpenGlFramebuffer.g(-5);
          if (var3Lifetime1 != 0 &&
            LegacyOpenGlShoreWaveWaterEffect.field_l == 0 &&
            11 == jv.field_a &&
            !FixedPointPerlinNoise3D.a(-23517)) {
            RasterBuffer.b(2);
          }
          if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
            0 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
            sj.field_a = wq.monotonicTimeMillis(-47) + 15000L;
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l != 0) {
          if (TextureCoordinateGeneration.field_a < 10) {
            if (3 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
              if (LegacyOpenGlShoreWaveWaterEffect.field_l != 4) {
                if (LegacyOpenGlShoreWaveWaterEffect.field_l != 2) {
                  if (LegacyOpenGlShoreWaveWaterEffect.field_l != 5) {
                    this.a("js5connect", 21253);
                  } else {
                    this.a("outofdate", 21253);
                  }
                } else {
                  this.a("js5connect_full", 21253);
                }
              } else {
                this.a("js5io", 21253);
              }
            } else {
              this.a("js5crc", 21253);
            }
          } else {
            if (10 <= jv.field_a) {
              ScrollViewport.a((byte) 70);
              if (LegacyOpenGlShoreWaveWaterEffect.field_l == 3) {
                ArchiveCatalog.a((byte) -97, 256, o.field_a);
              } else {
                if (LegacyOpenGlShoreWaveWaterEffect.field_l == 4) {
                  ArchiveCatalog.a((byte) 61, 256, ServerIntArrayRequest.field_n);
                } else {
                  if (LegacyOpenGlShoreWaveWaterEffect.field_l == 2) {
                    ArchiveCatalog.a((byte) 90, 256, ValidationMessageWidget.dataServerFullOrText);
                  } else {
                    if (LegacyOpenGlShoreWaveWaterEffect.field_l == 5) {
                      ArchiveCatalog.a((byte) -113, 5, TextHotspot.thisGameHasBeenText);
                    } else {
                      ArchiveCatalog.a((byte) -97, 256, ArrayWidgetContainer.unableToConnectToText);
                    }
                  }
                }
              }
              QuickChatCommand.field_d = true;
            }
          }
        }
        if ((LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l != 0 ||
          FixedPointPerlinNoise3D.a(-23517)) &&
          wq.monotonicTimeMillis(-87) >= sj.field_a) {
          QuickChatCommand.field_d = false;
          if (-1 != LegacyOpenGlShoreWaveWaterEffect.field_l &&
            0 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
            LegacyOpenGlShoreWaveWaterEffect.field_l = -1;
            ic.a(4);
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l == 0 &&
          !FixedPointPerlinNoise3D.a(-23517)) {
          LegacyWaterTextureResources.field_h = false;
        }
        if (TextureCoordinateGeneration.field_a == 0 &&
          LegacyOpenGlSpriteTexture.d((byte) 63)) {
          TextureCoordinateGeneration.field_a = 1;
        }
        if (TextureCoordinateGeneration.field_a == 1) {
          if (EmailValidationError.field_c != 0) {
            DropDownListWidget.field_H = EmailCredentials.a(DisplayModeErrorDialog.field_P, (byte) 125);
          }
          EmailCredentials.field_j = LegacyOpenGlPostProcessEffect.a(11880, true, OpenGlUnderwaterEffect.field_i, 1, false);
          LegacyOpenGlPostProcessManager.field_f = LegacyOpenGlPostProcessEffect.a(11880, true, AudioServiceThread.field_h, 1, false);
          hw.field_a = LegacyOpenGlPostProcessEffect.a(11880, true, LegacyOpenGlUnlitEffect.field_f, 1, false);
          pi.field_c = EmailCredentials.field_j;
          TextureCoordinateGeneration.field_a = 2;
          RotarySelectorWidget.field_J = LegacyOpenGlPostProcessManager.field_f;
        }
        if (TextureCoordinateGeneration.field_a == 2) {
          if (null != DropDownListWidget.field_H &&
            DropDownListWidget.field_H.loadIndex((byte) 127)) {
            if (!DropDownListWidget.field_H.hasGroupName((byte) -99, "")) {
              DropDownListWidget.field_H = null;
            } else {
              if (DropDownListWidget.field_H.tryLoadNamedGroup("", 100)) {
                FallbackShaderEffect.a(7, DropDownListWidget.field_H);
                DropDownListWidget.field_H = null;
                VertexAttribute.b(0);
              }
            }
          }
          if (DropDownListWidget.field_H == null) {
            TextureCoordinateGeneration.field_a = 3;
          }
        }
        if (3 == TextureCoordinateGeneration.field_a &&
          ReflectionCheck.commonUiResourcesReady(LegacyOpenGlPostProcessManager.field_f, (byte) 124, hw.field_a, EmailCredentials.field_j) &&
          DroneWave.tryLoadArchive(hw.field_a, 40)) {
          LruNodeCache.releaseValidationIcons((byte) -93);
          UnderageAccountInfoPanel.e(true);
          pu.field_m = false;
          LegacyOpenGlVertexBuffer.field_k = ToolkitImageProducerBuffer.loadingText;
          ea.a(hw.field_a, NineSlicePanel.field_a, (byte) 40, LegacyOpenGlPostProcessManager.field_f, EmailCredentials.field_j);
          if (hv.field_c ||
            DropTargetWidget.field_B != null) {
            stackIn_106_0 = 1;
            stackIn_107_1 = !(hv.field_c);
            stackIn_109_2 = DropTargetWidget.field_B;
            stackIn_110_3 = !(hv.field_c);
            ea.a(stackIn_106_0, stackIn_107_1, stackIn_109_2, stackIn_110_3);
          }
          if (gn.field_b) {
            SlowBurstParticle.e(4);
          }
          if (ProxyAuthenticationRequiredException.field_d == null) {
            ProxyAuthenticationRequiredException.field_d = ea.a(14263);
            ContentTransitionDialog.field_O = LoginForm.e(false);
          }
          ss.a(ProxyAuthenticationRequiredException.field_d, (byte) 127, hw.field_a, ContentTransitionDialog.field_O);
          hw.field_a = null;
          LegacyOpenGlPostProcessManager.field_f = null;
          EmailCredentials.field_j = null;
          DirectByteArrayStorage.a((java.applet.Applet) (this), (byte) -96);
          VertexAttribute.b(0);
          TextureCoordinateGeneration.field_a = 10;
        }
        if (TextureCoordinateGeneration.field_a == 10) {
          if (0 != EmailValidationError.field_c) {
            vf.field_a = EmailCredentials.a(MenuScreen.field_f, (byte) 125);
          }
          TextureCoordinateGeneration.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (TextureCoordinateGeneration.field_a == 11) {
          if (vf.field_a != null && (!vf.field_a.loadIndex((byte) 127) ||
            !vf.field_a.tryLoadAllGroups(true))) {
            NameSuggestionsPanel.a(20, 0.0f, lq.a(117, AccountRequestState.field_c, LegacyOpenGlTexture3D.field_k, vf.field_a));
            decompiledFrameRemainder0 = false;
          }
          else {
            RidgedNoise3D.field_u = true;
            TextureCoordinateGeneration.field_a = 12;
          }
        }
        if (TextureCoordinateGeneration.field_a == 12 &&
          !RidgedNoise3D.field_u) {
          TextureCoordinateGeneration.field_a = 13;
        }
        if (TextureCoordinateGeneration.field_a == 13) {
          var3Lifetime2 = 1;
          if (ih.field_a != null) {
            stackIn_138_0 = (!ih.field_a.a(100)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            NameSuggestionsPanel.a(20, ih.field_a.field_d, ih.field_a.field_f);
          }
          if (var3Lifetime2 != 0) {
            TextureCoordinateGeneration.field_a = 20;
          }
        }
        if (!param0 &&
          DroneDebris.field_A) {
          CheckboxWidget.a(true, NineSlicePanel.field_f);
          this.e(1000);
          ServerDataWriteRequest.attachInputHandlers(false, NineSlicePanel.field_f);
        }
        if (InteractiveWidget.field_z[8]) {
          qi.a(8);
        }
    }

    private final int c(byte param0) {
        int var2;
        if (this.field_d) {
          return -1;
        }
        if (!FixedPointPerlinNoise3D.a(-23517)) {
          return -1;
        }
        if (QuickChatCommand.field_d) {
          return -1;
        }
        var2 = UsernameCredentials.pollLogin(LegacyOpenGlRidgedWaterEffect.c((byte) -2), this.field_z, (byte) 56, true, this.field_w, ResourceRequest.c((byte) -97));
        if (-1 == var2) {
          return -1;
        }
        if (param0 >= -38) {
          return 99;
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!BeveledTextInputRenderer.field_o) {
            this.a("reconnect", 21253);
          }
          ScrollViewport.a((byte) 63);
          ArchiveCatalog.a((byte) 114, var2, MouseWheelInput.field_c);
          QuickChatCommand.field_d = true;
          sj.field_a = 15000L + wq.monotonicTimeMillis(-50);
          return var2;
        }
        if (jv.field_a == 11 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l == 0) {
          RasterBuffer.b(2);
        }
        return var2;
    }

    private final void n(int param0) {
        InteractiveWidget.field_z[param0] = true;
    }

    final void m(int param0) {
        int discarded$33 = 0;
        int discarded$34 = 0;
        int var3;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 <= 94) {
          waitingForSoundEffectsText = (String) null;
        }
        if (ScrollViewport.g(-1)) {
          stackIn_11_1 = 16981;
          stackIn_12_2 = (CompactMeshGeometry.field_o != null);
          discarded$33 = this.a(stackIn_11_1, stackIn_12_2, false);
        } else {
          if (TextureCoordinateGeneration.field_a >= 10) {
            if (!lf.b(-251)) {
              rm.a((byte) 126);
            } else {
              if (jv.field_a != 0) {
                ModalDialog.a((byte) 55, OpenGlUnderwaterEffect.field_r);
              } else {
                discarded$34 = this.a(16981, false, false);
              }
            }
          }
        }
    }

    final void q(int param0) {
        boolean stackIn_28_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 9289) {
          return;
        }
        var2 = TextureFormat.field_a;
        if (var2 < 64 &&
          InteractiveWidget.field_z[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              SpriteStripButtonRenderer.a((byte) -70);
            } else {
              if (var2 == 3) {
                LegacyOpenGlNormalMapGenerator.a(-30084);
              } else {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            ScrollViewport.e((byte) -93);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                AccountCreationForm.f((byte) 117);
                                return;
                              }
                              if (var2 == 17) {
                                this.f((byte) -76);
                                return;
                              }
                              if (var2 == 18) {
                                LegacyOpenGlEffect.a(8192);
                                return;
                              }
                              IntrusiveNode.reportClientError("MGS1: " + VictoryScreen.b((byte) -22), (Throwable) null, 0);
                              LegacyOpenGlTextureCache.closeAccountSocket((byte) -128);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = r.readChatMessage(stackIn_28_0, (byte) -62);
                            ByteArrayStorage.receiveChatMessage(var3, (byte) 60);
                          }
                        } else {
                          SecondaryNodeQueue.readReflectionCheck((byte) 127, ig.field_a, lt.field_m, gu.field_d);
                        }
                      } else {
                        this.o(-1);
                      }
                    } else {
                      SlowBurstParticle.c((byte) -77);
                    }
                  } else {
                    HotspotTextWidget.readServerDataReply((byte) -93);
                  }
                } else {
                  pt.a(-22683);
                }
              }
            }
          } else {
            MusicVoice.c(false);
          }
          return;
        }
        IntrusiveNode.reportClientError("MGS2: " + VictoryScreen.b((byte) 86), (Throwable) null, 0);
        LegacyOpenGlTextureCache.closeAccountSocket((byte) -112);
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(false, param0, (byte) 111, param3, param5, param2, param4, param1);
        if (!param6) {
          this.m(-95);
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 != -1) {
          return 50;
        }
        return this.a(16981, param1, true);
    }

    private final void o(int param0) {
        String var2 = VertexAttribute.a((byte) -62);
        if (param0 != -1) {
          return;
        }
        SingleChildWidget.setSessionCookie(61, var2, LegacyOpenGlUnlitEffect.c(2));
    }

    private final void l(int param0) {
        InteractiveWidget.field_z[2] = true;
        if (param0 != 8) {
          this.field_E = 114;
        }
    }

    final int b(boolean param0) {
        int var2;
        var2 = this.c((byte) -99);
        if (!param0) {
          return -127;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (InteractiveWidget.field_z[1]) {
            UiStyle.a((byte) 115, 2);
          }
          if (InteractiveWidget.field_z[2]) {
            SlowBurstParticle.a(3, (byte) -73);
          }
          if (InteractiveWidget.field_z[3]) {
            ko.resendProgressAndArrayRequests(0, 4);
          }
          if (InteractiveWidget.field_z[4]) {
            GraphicsOptionsDialog.a(28778, 5);
          }
          if (InteractiveWidget.field_z[5]) {
            TextureMetadata.resendServerDataRequests(false, 6);
          }
          if (InteractiveWidget.field_z[6]) {
            jl.a(7, param0);
          }
          if (InteractiveWidget.field_z[8]) {
            LegacyOpenGlAssemblyProgram.a(-58);
          }
        }
        return var2;
    }

    private final void f(byte param0) {
        int var2 = ig.field_a.readUnsignedByte(-31302);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gu.field_d;
        byte[] var5 = new byte[var4];
        ig.field_a.readCipherBytes(var5, 0, 0, var4);
        if (param0 > -55) {
          this.field_w = -30;
        }
        LegacyOpenGlFlowingWaterEffect.a(-23166, LegacyOpenGlUnlitEffect.c(2), var3 != 0, MusicVoice.a(0, var5));
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4) {
        if (param2 == 60) {
          this.c(false, -12605);
          if (param1) {
            this.n(1);
          }
          if (param3) {
            this.l(8);
          }
          if (param4) {
            this.e((byte) 30);
          }
          if (param0) {
            this.d((byte) 68);
          }
          return;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 79) {
          field_t = -119;
        }
        field_u = null;
        waitingForSoundEffectsText = null;
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a(param0, param2 ^ 480, 640, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fn.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        try {
          try {
            if (!this.i(-1)) {
              return;
            }
            this.field_D = this.getCodeBase().getHost();
            var6 = this.field_D.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_z = stackIn_8_1;
            if (param1 != 0) {
              this.o(-5);
            }
            this.field_r = Integer.parseInt(this.getParameter("gameport1"));
            this.field_E = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_C = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_y = Long.parseLong(this.getParameter("instanceid"));
            this.field_q = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_v = Integer.parseInt(var8);
            }
            if (this.field_v >= 5) {
              this.field_v = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_w = Integer.parseInt(var9);
            }
            gn.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param4, (byte) 44, param2, this.field_C, param3, param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            IntrusiveNode.reportClientError((String) null, (Throwable) ((Object) var6_ref), param1 ^ 0);
            this.a("crash", 21253);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("fn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Sumoblitz.field_L ? 1 : 0;
          var4 = sb.a(param1, OpenGlUnderwaterEffect.field_r, EmailValidationError.field_c, (byte) 81);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (param0 != 16981) {
            this.field_w = 90;
          }
          if (var4 == 1) {
            var5_int = AlternateUsernameCredentials.a(LegacyOpenGlTexture.c(true), 0, SelectionOverlay.a((byte) 21));
            if (var5_int != -1) {
              jv.a(var5_int, mn.field_g, MouseWheelInput.field_c, true);
              MouseWheelInput.field_c = null;
              mn.field_g = null;
            }
            var11 = ToolkitImageProducerBuffer.c(82);
            if (var11 != null) {
              kd.a(var11.booleanValue(), -80);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = IntList.a(BeveledCheckboxRenderer.b(-98), LegacyOpenGlRidgedWaterEffect.c((byte) -2), Transform3D.a((byte) -97), of.c(-86), this.field_w, 119, ResourceRequest.c((byte) -109));
            if (var5_intLifetime1 != -1) {
              Sumoblitz.completeAccountCreation(mn.field_g, param0 ^ 16984, var5_intLifetime1, MouseWheelInput.field_c);
              MouseWheelInput.field_c = null;
              mn.field_g = null;
            }
          }
          if (3 == var4) {
            if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
              LegacyOpenGlShoreWaveWaterEffect.field_l != 0) {
              LegacyOpenGlShoreWaveWaterEffect.field_l = -1;
              ic.a(4);
            }
            if (param2) {
              QuickChatCommand.field_d = false;
            } else {
              var5_intLifetime2 = UsernameCredentials.pollLogin(LegacyOpenGlRidgedWaterEffect.c((byte) -2), this.field_z, (byte) 21, false, this.field_w, ResourceRequest.c((byte) -124));
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 == 0) {
                  km.field_k = StringBuilderSupport.field_a;
                  RasterBuffer.b(2);
                  jv.field_a = 10;
                  IntrusiveNode.field_a = false;
                } else {
                  ArchiveCatalog.a((byte) -118, var5_intLifetime2, MouseWheelInput.field_c);
                  MouseWheelInput.field_c = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (NineSlicePanel.field_a) {
              MessageDialog.a(-1540, LegacyOpenGlUnlitEffect.c(param0 ^ 16983));
            } else {
              IntrusiveNode.field_a = true;
              jv.field_a = 10;
            }
          }
          if (var4 == 5) {
            jl.a(LegacyOpenGlUnlitEffect.c(param0 - 16979), false);
          }
          if (var4 == 6 &&
            pu.field_m) {
            jv.field_a = 10;
          }
          if (var4 == 7) {
            ic.a(false, LegacyOpenGlUnlitEffect.c(2));
          }
          if (8 == var4) {
            MessageDialog.a(-1540, LegacyOpenGlUnlitEffect.c(param0 - 16979));
          }
          if (9 == var4) {
            LegacyOpenGlTexture2D.openSupportPage(LegacyOpenGlUnlitEffect.c(2), (byte) -124);
          }
          if (var4 == 10) {
            InwardSparkParticle.field_v.writeCipherByte(17, param0 ^ 16989);
          }
          if (var4 == 11) {
            of.a(8192, LegacyOpenGlUnlitEffect.c(2));
          }
          if (var4 == 12) {
            SocialContact.openAppletPage(LegacyOpenGlSpriteTexture.e(false), LegacyOpenGlUnlitEffect.c(2), (byte) -103);
          }
          if (var4 == 13) {
            try {
              if (null == IntrusiveNode.field_e) {
                IntrusiveNode.field_e = new JaggrabDownloader(lt.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (IntrusiveNode.field_e.a((byte) -110)) {
                var12 = IntrusiveNode.field_e.b((byte) 126);
                if (var12 != null) {
                  var7 = SoftLruCache.decodeCp1252(var12.payload, 0, var12.position, 26564);
                  GraphicsToolkit.a((byte) 115, var7);
                } else {
                  var9 = (String) null;
                  GraphicsToolkit.a((byte) 122, (String) null);
                }
                IntrusiveNode.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              IntrusiveNode.reportClientError("S1", (Throwable) ((Object) var5), 0);
              var10 = (String) null;
              GraphicsToolkit.a((byte) 111, (String) null);
              IntrusiveNode.field_e = null;
            }
          }
          if (15 == var4) {
            jv.field_a = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(byte param0) {
        int var2 = 76 / ((param0 + 76) / 48);
        InteractiveWidget.field_z[4] = true;
    }

    private final void c(boolean param0, int param1) {
        InteractiveWidget.field_z[0] = true;
        InteractiveWidget.field_z[7] = true;
        InteractiveWidget.field_z[18] = true;
        if (param1 != -12605) {
          this.q(112);
        }
        InteractiveWidget.field_z[3] = true;
        InteractiveWidget.field_z[8] = param0;
        InteractiveWidget.field_z[17] = true;
        InteractiveWidget.field_z[16] = true;
    }

    protected GameClientShell() {
    }

    private final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        EmailValidationError.field_c = this.field_v;
        jq.setLoadingLanguage(EmailValidationError.field_c, 13586);
        EmptyWidgetRenderer.a(param0, (byte) 84, lt.field_m, 5000, this.field_E, param1, this.field_C, this.field_r, 5000, this.field_D, this.field_q, this.field_x, EmailValidationError.field_c, this.field_y);
        PacketBuffer.a(lt.field_m, this.field_r, this.field_E, this.field_D, (byte) -56, this.field_C, this.field_x, param1, EmailValidationError.field_c);
        SoftwareRenderContext.initializePunctuationKeyMap(false);
        InwardSparkParticle.field_w = EmailValidationError.createMouseWheelInput((byte) -126);
        int var10 = -116 / ((2 - param2) / 36);
        ServerDataWriteRequest.attachInputHandlers(false, NineSlicePanel.field_f);
        MenuScreen.field_f = param7;
        DisplayModeErrorDialog.field_P = param4;
        OpenGlUnderwaterEffect.field_i = param5;
        LegacyOpenGlUnlitEffect.field_f = param3;
        AudioServiceThread.field_h = param6;
        this.p(-1);
        LegacyOpenGlSpecularEffect.c(8193);
    }

    static {
        field_s = 50;
        waitingForSoundEffectsText = "Waiting for sound effects";
    }
}
