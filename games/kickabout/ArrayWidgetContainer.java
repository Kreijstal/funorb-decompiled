/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetContainer extends UiWidget implements UiContainerMarker {
    static int field_v;
    static int field_x;
    static Sprite field_y;
    static Sprite[] field_z;
    UiWidget[] field_w;
    static PlatformTask field_A;

    private final boolean focusNextChildByStep(UiWidget param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiWidget var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param1 != -28) {
            return true;
          }
          var4_int = 0;
          while (var4_int < this.field_w.length) {
            var5 = this.field_w[var4_int];
            if (var5 != null &&
              var5.isFocused(100)) {
              for (var4_int = var4_int + param2; var4_int < this.field_w.length; var4_int = var4_int + param2) {
                var6 = this.field_w[var4_int];
                if (var6 != null &&
                  var6.requestKeyboardFocus(param0, param1 ^ -28)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("wt.I(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 < 10) {
          return true;
        }
        return this.getFocusedChild(true) != null ? true : false;
    }

    final StringBuilder appendDebugTree(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17883) {
            var6 = (UiWidget) null;
            this.handlePointerWheel(125, (UiWidget) null, 11, -44, 107, -118, 34);
          }
          if (this.beginWidgetDiagnosticVisit(1, param3, param2, param1)) {
            this.appendWidgetDiagnosticProperties(param1, param3, param2, param0 ^ -3421);
            this.appendChildDebugTrees(param2, 10, param1, param3);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wt.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static FadingSoundPlayer createFadingSoundPlayer(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (StrongCacheEntry.field_z.size(false) >= 16) {
          return null;
        }
        int var7 = -79 % ((-85 - param5) / 32);
        FadingSoundPlayer var6 = new FadingSoundPlayer(param3, param0, param4, param2, param1);
        StrongCacheEntry.field_z.addLast(var6, 3);
        return var6;
    }

    public static void releaseStatics(boolean param0) {
        field_y = null;
        field_z = null;
        if (param0) {
          field_y = (Sprite) null;
        }
        field_A = null;
    }

    private final void appendChildDebugTrees(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        UiWidget var7 = null;
        int var9 = 0;
        UiWidget var10 = null;
        UiWidget[] var11 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return;
          }
          if (param1 != 10) {
            var10 = (UiWidget) null;
            this.updatePointerState((byte) 88, (UiWidget) null, 119, 67);
          }
          var11 = this.field_w;
          for (var6 = 0; var6 < var11.length; var6++) {
            var7 = var11[var6];
            discarded$6 = param3.append('\n');
            for (var8 = 0; param2 >= var8; var8++) {
              discarded$8 = param3.append(' ');
            }
            if (var7 != null) {
              var7.appendDebugTree(17883, param2 + 1, param0, param3);
            } else {
              discarded$7 = param3.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("wt.M(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final boolean focusPreviousChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 9) {
            stackIn_4_0 = this.focusPreviousChildByStep(-17305, param1, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wt.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.a((byte) -118);
    }

    private final boolean focusNextChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 84) {
            this.getLastRenderPass((byte) 119);
          }
          stackIn_3_0 = this.focusNextChildByStep(param0, -28, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wt.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, byte param1, UiWidget param2, int param3) {
        int var6 = 0;
        UiWidget[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiWidget var7 = null;
        int var8 = 0;
        UiWidget[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return false;
          }
          var9 = this.field_w;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.isFocused(35) &&
              var7.handleKeyInput(param0, (byte) -123, param2, param3)) {
              return true;
            }
          }
          if (param1 >= -60) {
            field_v = -42;
          }
          var5_int = param3;
          if (80 != var5_int) {
            return false;
          }
          if (!GameplayHelpScreen.field_G[81]) {
            stackIn_19_0 = this.focusNextChild(param2, 87);
          } else {
            stackIn_19_0 = this.focusPreviousChild(9, param2);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("wt.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void initializePlayerArrows(int param0, CommonGame param1, int param2, Sprite[] param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Kickabout.field_G;
        try {
          IntrusiveDequeCursor.field_b = param1;
          TrinketShopDialog.field_G = param2;
          ConsoleCommand.field_n = param3;
          if (param0 != 0) {
            return;
          }
          if (TrinketShopDialog.field_G != -2) {
            AuctionPriceLimits.field_a = new OffscreenPlayerArrow[4];
            for (var4_int = 0; var4_int < 4; var4_int++) {
              AuctionPriceLimits.field_a[var4_int] = new OffscreenPlayerArrow((RenderedFootballer) (IntrusiveDequeCursor.field_b.field_P[IntrusiveDequeCursor.field_b.field_g[TrinketShopDialog.field_G].team][var4_int + 1]), var4_int + 1);
            }
            return;
          }
          AuctionPriceLimits.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wt.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean tryKeeperDive(BallAgent param0, FootballerAgent param1, byte param2, int param3) {
        FootballerAgent stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        try {
          if (-1 == param0.possessorTeam &&
            0 != param0.velocityY) {
            var4_int = -(param1.field_o >> 1) + 20;
            if (param2 != -75) {
              var8 = (String[]) null;
              ArrayWidgetContainer.createNameSuggestionResponse(69, (String[]) null);
            }
            var5 = (param1.positionY - param0.positionY) / param0.velocityY;
            var5 = 9 * var5 >> 3;
            if (var5 > 2 &&
              var5 < var4_int) {
              var6 = param0.positionX + param0.velocityX * var5;
              var7 = Math.abs(-var6 + param1.positionX);
              if (var6 > 24379392 &&
                var6 < 34275328) {
                if (-28 + (var7 >> 16) > 12) {
                  param1.startDive(var6, 5);
                  return true;
                }
                stackIn_17_0 = (FootballerAgent) (param1);
                if (param1.positionX < var6) {
                  stackIn_18_1 = 8;
                } else {
                  stackIn_18_1 = 2;
                }
                stackIn_17_0.directionMask = stackIn_18_1;
                return true;
              }
              param1.directionMask = 0;
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("wt.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static AccountRegistrationResponse createNameSuggestionResponse(int param0, String[] param1) {
        AccountRegistrationResponse var2 = null;
        RuntimeException var2_ref = null;
        AccountRegistrationResponse stackIn_2_0 = null;
        AccountRegistrationResponse stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -108) {
            stackIn_2_0 = (AccountRegistrationResponse) null;
            return stackIn_2_0;
          }
          var2 = new AccountRegistrationResponse(false);
          var2.nameSuggestions = param1;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("wt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract void a(byte param0);

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        UiWidget var6;
        int var7;
        var7 = Kickabout.field_G;
        if (0 == param0 &&
          null != this.field_r) {
          this.field_r.drawWidget(126, true, param3, (UiWidget) (this), param2);
        }
        if (param1 != 65) {
          field_x = -84;
        }
        if (this.field_w != null) {
          for (var5 = this.field_w.length - 1; var5 >= 0; var5--) {
            var6 = this.field_w[var5];
            if (var6 != null) {
              var6.drawLayer(param0, 65, param2 + this.field_t, this.field_g + param3);
            }
          }
        }
    }

    final String getTooltip(int param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var6;
        UiWidget[] var7;
        String var5;
        var6 = Kickabout.field_G;
        if (this.field_w == null) {
          return null;
        }
        var7 = this.field_w;
        var2 = var7;
        if (param0 != -1) {
          field_A = (PlatformTask) null;
        }
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var5 = var4.getTooltip(-1);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final int getLastRenderPass(byte param0) {
        int var4 = 0;
        int var2;
        UiWidget[] var3;
        UiWidget var5;
        int var7;
        int var6;
        UiWidget var8;
        var7 = Kickabout.field_G;
        var2 = 0;
        var3 = this.field_w;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.getLastRenderPass((byte) 118);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        if (param0 != 118) {
          var8 = (UiWidget) null;
          this.handlePointerWheel(20, (UiWidget) null, 22, -126, -123, 63, -127);
        }
        return var2;
    }

    ArrayWidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
    }

    final boolean handlePointerPress(boolean param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        int var9 = 0;
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (!param0) {
            field_v = -64;
          }
          var12 = this.field_w;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.handlePointerPress(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_t, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("wt.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final UiWidget getFocusedChild(boolean param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var5;
        UiWidget[] var6;
        var5 = Kickabout.field_G;
        if (null == this.field_w) {
          return null;
        }
        var6 = this.field_w;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.isFocused(100)) {
            return var4;
          }
        }
        if (param0) {
          return null;
        }
        this.getTooltip(91);
        return null;
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        int var8 = 0;
        UiWidget[] var7 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return;
          }
          var11 = this.field_w;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.handlePointerRelease(this.field_g + param0, param1, param2, param3, -1, this.field_t + param5);
            }
          }
          if (param4 != -1) {
            ArrayWidgetContainer.createFadingSoundPlayer(-45, false, false, 110, 69, -102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_13_0 = var7_ref;
          stackIn_13_1 = new StringBuilder().append("wt.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        int var6 = 0;
        UiWidget[] var5 = null;
        UiWidget var7 = null;
        int var8 = 0;
        UiWidget[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Kickabout.field_G;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          if (null == this.field_w) {
            return;
          }
          var9 = this.field_w;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.updatePointerState((byte) 12, param1, this.field_t + param2, this.field_g + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("wt.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean focusPreviousChildByStep(int param0, UiWidget param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiWidget var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param0 != -17305) {
            field_z = (Sprite[]) null;
          }
          var4_int = -1 + this.field_w.length;
          while (var4_int >= 0) {
            var5 = this.field_w[var4_int];
            if (var5 != null &&
              var5.isFocused(92)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_w[var4_int];
                if (var6 != null &&
                  var6.requestKeyboardFocus(param1, 0)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("wt.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var5;
        UiWidget[] var6;
        var5 = Kickabout.field_G;
        var6 = this.field_w;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.clearKeyboardFocus(84);
          }
        }
        if (param0 != 84) {
          field_z = (Sprite[]) null;
        }
    }

    final boolean handlePointerWheel(int param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return false;
          }
          var12 = this.field_w;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.isFocused(127) &&
              var10.handlePointerWheel(param0, param1, param2, param3, param4, param5, -87)) {
              return true;
            }
          }
          var9Lifetime1 = -27 / ((param6 - 63) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("wt.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(UiWidget param0, int param1) {
        int var4 = 0;
        UiWidget[] var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var5 = null;
        int var6 = 0;
        UiWidget[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.requestKeyboardFocus(param0, param1 + 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("wt.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
