/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends AppletGameShell implements ShellListener {
    static String field_B;
    static UiComponent field_C;

    abstract boolean handleGamePacket(int param0, BitPacketBuffer param1, byte param2);

    final void draw(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        java.awt.Canvas var2 = LegacyOpenGlRidgedWaterEffect.getActiveCanvas((byte) -97);
        if (ColourGradientOperator.isLoginFlowIncomplete(-127)) {
          WallTile.drawLoadingScreen(PortalComponent.A(90), var2, param0 ^ 0);
          return;
        }
        if (!lla.field_b) {
          C2SSubmitSettingsPacket.a(var2, (byte) 101);
          return;
        }
        if (!MazeSolver.field_e &&
          !TextWidgetPainter.a(109)) {
          ima.a(100.0f, WindZoneBehaviour.field_u, -75);
          C2SSubmitSettingsPacket.a(var2, (byte) 111);
          return;
        }
        cna.field_a = true;
        if (param0 != 0) {
          return;
        }
        for (var3 = -1 + HuffmanCodec.field_c.size(); var3 >= 0; var3--) {
          ((ShellListener) (HuffmanCodec.field_c.elementAt(var3))).drawOverlay(param0 + 1);
        }
        if (!cna.field_a) {
          this.c(true);
        } else {
          pka.a(false);
          fga.drawFramebufferToCanvas(0, false, 0, var2);
        }
    }

    final void a(LoadingStage param0, int param1) {
        try {
          dma.field_l = param0;
          this.enableDefaultMessageGroups((byte) 106, true);
          if (param1 <= 34) {
            return;
          }
          try {
            this.enableMessageGroup1(-1);
            this.enableMessageGroup2(-13);
            this.enableMessageGroup5(9822);
            this.enableMessageGroup4((byte) -126);
            this.enableMessageGroup6(22);
            this.enableMessageGroups11To13((byte) 87);
            S2CEventPacket.field_c[9] = -1;
            S2CEventPacket.field_c[10] = -1;
            HuffmanCodec.field_c = new Vector();
            aca.addShellListenerFirst((ShellListener) (this), 19711);
          } catch (RuntimeException runtimeException) {
            throw tba.wrapException((Throwable) ((Object) runtimeException), "rfa.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        if (!param0) {
          field_B = (String) null;
        }
    }

    public abstract void updateScreen(boolean param0, boolean param1);

    public static void releaseStatics(int param0) {
        field_C = null;
        if (param0 < 105) {
          Sprite[] var2 = (Sprite[]) null;
          rfa.useFullSpriteBounds((Sprite[]) null, 100);
        }
        field_B = null;
    }

    abstract void pollMessageGroups(int param0, int param1);

    private final void b(boolean param0) {
        boolean stackIn_3_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_47_2 = false;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        ShellListener var6;
        int var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        stackIn_3_0 = !param0;
        if (SnakePitTile.a(stackIn_3_0)) {
          this.updateScreen(param0, false);
        } else {
          if (!una.a((byte) 127)) {
            if (PlayPhase.beginReconnectGracePeriod(105)) {
              stackIn_46_1 = -85;
              stackIn_47_2 = (null != dq.field_f);
              var3 = this.pollLogin(stackIn_46_1, stackIn_47_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.updateScreen(true, false);
              } else {
                if (dq.field_f != null) {
                  og.b(0);
                }
                if (2 == var3) {
                  ArchiveRequest.openQuitPage(di.getApplet(110), (byte) -95);
                }
                this.updateScreen(true, false);
              }
            } else {
              if (ofa.d(true)) {
                if (sr.a(119)) {
                  au.b(false);
                } else {
                  var3 = kc.pollKeyEvents(true);
                  if (var3 == 1) {
                    RoomEffectTraps.a((byte) -63, ura.field_a, true);
                  }
                  this.updateScreen(true, false);
                }
              } else {
                if (!sr.a(125)) {
                  var2 = 1;
                  var3 = -1;
                  while (NanoTickClock.pollKeyEvent(true)) {
                    if (MenuEntry.field_h == -1) {
                      if (MenuEntry.field_h == -1 &&
                        var3 != -1) {
                        MenuEntry.field_h = var3;
                        var3 = -1;
                      }
                    } else {
                      if (TeleportState.a((byte) 15, MenuEntry.field_h)) {
                        var3 = MenuEntry.field_h;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (HuffmanCodec.field_c.size() > var4) {
                      if (((ShellListener) (HuffmanCodec.field_c.elementAt(var4))).handleKey((byte) -72, HardwareOpenGlToolkit.field_td, MenuEntry.field_h)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  au.b(!param0);
                }
              }
            }
          } else {
            if (sr.a(126)) {
              au.b(false);
            } else {
              var3 = CourseLayoutFactory.c(107);
              if (var3 != 2) {
                if (var3 == 3) {
                  StringCursor.a(-30600, true);
                  this.updateScreen(true, false);
                } else {
                  if (var3 == 4) {
                    RoomEffectTraps.a((byte) -63, ck.field_b, false);
                    FlagSet.field_c = true;
                    this.updateScreen(true, false);
                  } else {
                    this.updateScreen(true, false);
                  }
                }
              } else {
                og.b(0);
              }
            }
          }
        }
        if (!param0) {
          return;
        }
        for (var3Lifetime1 = 0; HuffmanCodec.field_c.size() > var3Lifetime1; var3Lifetime1++) {
          var6 = (ShellListener) (HuffmanCodec.field_c.elementAt(var3Lifetime1));
          var6.updateScreen(true, var2 != 0);
          stackIn_63_0 = var2;
          if (var6.isModal(-2)) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          var2 = stackIn_63_0 & stackIn_64_1;
        }
    }

    public abstract void drawOverlay(int param0);

    public final boolean isModal(int param0) {
        if (param0 != -2) {
          field_C = (UiComponent) null;
          return true;
        }
        return true;
    }

    final static Sprite[] useFullSpriteBounds(Sprite[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Sprite var3 = null;
        int var4 = 0;
        Sprite[] stackIn_3_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 < 111) {
            stackIn_3_0 = (Sprite[]) null;
            return stackIn_3_0;
          }
          while (param0.length > var2_int) {
            var3 = param0[var2_int];
            param0[var2_int].field_p = 0;
            var3.field_o = 0;
            param0[var2_int].field_n = param0[var2_int].field_m;
            param0[var2_int].field_k = param0[var2_int].field_q;
            var2_int++;
          }
          stackIn_7_0 = (Sprite[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("rfa.HB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void tick(boolean param0) {
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        int var2;
        int var3;
        int var4;
        cga var5;
        var4 = TombRacer.field_G ? 1 : 0;
        if (dq.field_f != null &&
          dq.field_f.field_b) {
          og.b(0);
          RandomMazeBehaviour.b(1);
        }
        stackIn_5_1 = -127;
        stackIn_6_2 = (dq.field_f != null);
        this.serviceFramework((byte) stackIn_5_1, stackIn_6_2);
        if (PlatformBehaviour.field_w) {
          dma.field_l.openArchives((byte) -38);
          PlatformBehaviour.field_w = false;
        }
        if (ColourGradientOperator.isLoginFlowIncomplete(-128)) {
          this.r(114);
          if (ColourGradientOperator.isLoginFlowIncomplete(-112)) {
            return;
          }
        }
        this.u(97);
        if (!lla.field_b) {
          tc.a(pg.field_y, -2886);
          if (dma.field_l.loadStep(-4171)) {
            dma.field_l.finishLoading((byte) -49);
            lla.field_b = true;
          }
        } else {
          if (!MazeSolver.field_e) {
            if (!TextWidgetPainter.a(84)) {
              if (dma.field_l.isReadyToStart(-127)) {
                MazeSolver.field_e = true;
                this.onLoadingComplete(24230);
                PlatformComponent.A(116);
              }
            } else {
              this.b(true);
            }
          } else {
            this.b(true);
          }
        }
        if (!TextWidgetPainter.a(66)) {
          while (true) {
            var5 = (cga) (RotaterMountComponent.field_H.removeFirst(119));
            if (var5 == null) {
              break;
            }
            woa.a(4, var5, false);
          }
        }
        dra.sendReflectionCheckResponses(param0);
        BridgeModel.flushGamePackets((byte) 120, 0);
        if (uma.b(-1)) {
          var2 = this.updateConnection(8);
          if (0 == var2 ||
            var2 == 1) {
            this.pollMessageGroups(var2, 120);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.isConnectionBusy((byte) 84)) {
            var3 = 1;
          }
          if (!uma.b(-1)) {
            var3 = 0;
          }
          if (var3 != 0) {
            TextureMetadata.b((byte) -16);
          }
        }
    }

    abstract void onLoadingComplete(int param0);

    private final void u(int param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 68 % ((param0 - 52) / 40);
        while (cj.readNextGamePacket(S2CEventPacket.field_c, 0)) {
          if (this.handleGamePacket(MembersUpsellMenu.field_z, WeaveOperator.field_q, (byte) 105)) {
            continue;
          }
          this.dispatchServerPacket(-5);
        }
    }

    public abstract boolean handleKey(byte param0, char param1, int param2);

    abstract boolean isConnectionBusy(byte param0);

    static {
    }
}
