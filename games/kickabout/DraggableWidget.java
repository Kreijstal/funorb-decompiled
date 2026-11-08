/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildContainer {
    static Sprite field_K;
    static String field_F;
    private int field_E;
    static String field_I;
    static ResourceArchive field_J;
    private int field_D;
    static String field_A;
    private int field_H;
    private boolean field_L;
    private boolean field_B;
    private int field_C;

    final static void a(int param0, CoverageBitmapFont param1, byte param2) {
        try {
          AlternateKeyedLoginCredentials.field_m = 150;
          DirectByteStorage.field_o = param1;
          if (param2 != -46) {
            DraggableWidget.a(-114, (byte) -103, false, 80);
          }
          TutorialChoiceDialog.field_J = AlternateKeyedLoginCredentials.field_m + 20 + param0 >> 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = Kickabout.field_G;
        try {
          if (SocialListLayoutSupport.field_c == null) {
            return;
          }
          var7 = SocialListLayoutSupport.field_c[param0];
          if (param4) {
            var7 = ShopPlayerSlot.field_Hb[param0];
          }
          if (param6 != 4) {
            return;
          }
          if (!param5) {
            if (param4) {
              var7.c(param3, param2);
            } else {
              if (!param1) {
                var7.c(param3, param2);
              } else {
                var7.drawScaled(-3 + param3, -3 + param2, 6 + var7.field_o, 6 + var7.field_v);
              }
            }
            return;
          }
          if (DualLinkNode.field_k != param0) {
            if (LobbyGameRecord.field_m == null) {
              LobbyGameRecord.field_m = new Sprite(var7.field_o + 8, var7.field_v + 8);
            }
            PacketBuffer.a(-56, LobbyGameRecord.field_m);
            SoftwareRasterizer.clearFramebuffer();
            var7.c(4, 4);
            SpritePixelSupport.adjustSpriteHsv(LobbyGameRecord.field_m, 0.0, 1.3, 1.2);
            SoftwareDrawingSupport.outlineSpriteInPlace(LobbyGameRecord.field_m, 65793);
            SoftwareDrawingSupport.outlineSpriteInPlace(LobbyGameRecord.field_m, 16777215);
            SoftwareDrawingSupport.outlineSpriteInPlace(LobbyGameRecord.field_m, 7829367);
            AuctionListing.a(95, -22914, 14, 88, 22);
            var12 = new int[255];
            var11 = var12;
            var8 = var11;
            for (var9 = 0; var9 < 255; var9++) {
              var8[var9] = 65793 * var9;
            }
            SpritePixelSupport.drawGlowingLine(20, 40, -20 + SoftwareRasterizer.field_g, 40, 28, 40, var12);
            TeamManagementScreen.e(119);
            TeamManagementScreen.e(param6 + 123);
            DualLinkNode.field_k = param0;
          }
          LobbyGameRecord.field_m.c(param3 - 4, -4 + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var7_ref), "jg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void h(byte param0) {
        field_F = null;
        int var1 = 35 / ((-16 - param0) / 63);
        field_I = null;
        field_J = null;
        field_K = null;
        field_A = null;
    }

    final boolean handlePointerPress(boolean param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        StringBuilder var9 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var9 = (StringBuilder) null;
            this.appendDebugTree(-45, -42, (Hashtable) null, (StringBuilder) null);
          }
          var8_int = super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_B) {
            return true;
          }
          if (!this.containsPointer((byte) 58, param5, param1, param2, param4)) {
            stackIn_13_0 = var8_int;
            return stackIn_13_0 != 0;
          }
          if (param6 == 1) {
            this.field_D = -param1 + (-this.field_g + param4);
            BlobSubmission.field_g = this;
            this.field_E = -param5 + param2 - this.field_t;
          }
          this.field_p = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("jg.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_z instanceof TextButton) ||
            ((TextButton) (this.field_z)).field_y) &&
            this.field_p == 1) {
            var5_int = BytePlusOneCommand.field_A - (this.field_E + param2);
            var6 = -this.field_D + ArchiveManager.field_m - param3;
            if (var5_int != this.field_t ||
              this.field_g != var6) {
              this.field_t = var5_int;
              this.field_g = var6;
              if (this.field_k instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.field_k)).dragged(param0 - 18830, this, param3, param2);
              }
            }
          } else {
            if (!this.field_L) {
              super.updatePointerState(param0, param1, param2, param3);
              return;
            }
            if (this.field_t != this.field_H) {
              var5_int = this.field_H - this.field_t;
              stackIn_17_1 = this.field_t;
              if (Math.abs(var5_int) > 2) {
                stackIn_18_2 = var5_int >> 1;
              } else {
                if (var5_int > 0) {
                  stackIn_18_2 = 1;
                } else {
                  stackIn_18_2 = -1;
                }
              }
              this.field_t = stackIn_17_1 + stackIn_18_2;
            }
            if (this.field_C != this.field_g) {
              var5_int = this.field_C - this.field_g;
              stackIn_22_1 = this.field_g;
              if (Math.abs(var5_int) <= 2) {
                if (0 >= var5_int) {
                  stackIn_25_2 = -1;
                } else {
                  stackIn_25_2 = 1;
                }
              } else {
                stackIn_25_2 = var5_int >> 1;
              }
              this.field_g = stackIn_22_1 + stackIn_25_2;
            }
          }
          super.updatePointerState(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("jg.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        try {
          super.handlePointerRelease(param0, param1, param2, param3, param4 ^ 0, param5);
          this.field_p = 0;
          if (param4 != -1) {
            this.field_L = false;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jg.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder appendDebugTree(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(1, param3, param2, param1)) {
            this.appendWidgetDiagnosticProperties(param1, param3, param2, -18568);
            this.a(param2, 127, param3, param1);
            discarded$64 = param3.append(" revert=").append(this.field_L);
            if (this.field_H != 2147483647 &&
              this.field_C != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_H).append(',').append(this.field_C);
            }
          }
          if (param0 != 17883) {
            field_I = (String) null;
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("jg.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_C = 2147483647;
        try {
          this.field_z = param6;
          this.field_B = param8 ? true : false;
          this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void refreshChildLayout(byte param0) {
        super.refreshChildLayout(param0);
        this.field_z.setBounds(this.field_i, 1, 0, this.field_n, 0);
        this.field_H = this.field_t;
        this.field_C = this.field_g;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        if (!DebugConsole.field_s) {
          return;
        }
        LeaguesHelpScreen.field_E.updateInput(0, param2);
        int var4 = ClassNameSupport.field_g.h(-113) ? 1 : 0;
        if (WidgetContainer.field_A != 0 &&
          var4 == 0) {
          param2 = false;
          ClientInteractionSupport.dismissQuickChat((byte) 114);
        }
        if (param2) {
          ClassNameSupport.field_g.processClicks(param3, param0, (byte) -127);
        }
        int var6 = -116 % ((param1 - 17) / 36);
        if (var4 != 0) {
          LeaguesHelpScreen.field_E.updateInput(0, param2);
        }
        int var5 = ClassNameSupport.field_g.getTotalWidth((byte) 49) + ClassNameSupport.field_g.field_F;
        if (var5 > 640) {
          NumericDateInputWidget.field_I = NumericDateInputWidget.field_I + 5;
        } else {
          if (var5 < 635 &&
            NumericDateInputWidget.field_I > 0) {
            NumericDateInputWidget.field_I = NumericDateInputWidget.field_I - 5;
          }
        }
    }

    static {
        field_A = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_F = "Public";
        field_I = "Your team still earns 10% of the winnings and have earnt <%0>.";
    }
}
