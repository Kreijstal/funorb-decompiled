/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements UiContainerMarker {
    static int[] field_x;
    IntrusiveDeque field_y;
    static String[] field_w;
    static boolean field_z;
    static int field_A;
    static MeshData[][] field_v;

    UiWidget findFocusedChild(boolean param0) {
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        UiWidget var3 = null;
        int var4 = 0;
        UiWidget stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_y);
          if (param0) {
            field_v = (MeshData[][]) null;
          }
          var3 = (UiWidget) (var2.a((byte) 77));
          while (null != var3) {
            if (var3.isFocused(42)) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            var3 = (UiWidget) (var2.a(0));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = null;
          return (UiWidget) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "wj.Q(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -336184828) {
          return;
        }
        try {
          field_v = (MeshData[][]) null;
          field_w = null;
          field_x = null;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wj.RA(" + param0 + ')');
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
        this.field_y = new IntrusiveDeque();
    }

    final boolean focusNextChild(UiWidget param0, byte param1) {
        IntrusiveDequeCursor var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_30_0 = false;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        boolean stackOut_20_0;
        RuntimeException var3_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 <= 122) {
            this.isFocused(-52);
          }
          if (this.field_y.isEmpty((byte) -4)) {
            return false;
          }
          var3 = new IntrusiveDequeCursor(this.field_y);
          var4 = (UiWidget) (var3.a((byte) 73));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            stackOut_11_0 = var4.isFocused(24);
            stackIn_30_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var7 == 0) {
              if (stackIn_12_0) {
                var5 = new IntrusiveDequeCursor(this.field_y);
                var5.a(395869153, var4);
                var6 = (UiWidget) (var5.a(0));
                while (var6 != null) {
                  stackOut_20_0 = var6.requestKeyboardFocus(param0, 0);
                  stackIn_30_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (stackIn_21_0) {
                    return true;
                  }
                  var6 = (UiWidget) (var5.a(0));
                }
              }
              var4 = (UiWidget) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_30_0 = false;
          }
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("wj.O(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(UiWidget param0, int param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = Kickabout.field_G;
        try {
          if (param1 != 0) {
            return false;
          }
          var3 = new IntrusiveDequeCursor(this.field_y);
          var4 = (UiWidget) (var3.a((byte) -97));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            stackOut_6_0 = var4.requestKeyboardFocus(param0, 0);
            stackIn_14_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var5 == 0) {
              if (stackIn_7_0) {
                return true;
              }
              var4 = (UiWidget) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = false;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wj.HA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addChild(int param0, UiWidget param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_y.addLast(param1, 3);
          if (param0 >= -15) {
            this.field_y = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean handlePointerPress(boolean param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = Kickabout.field_G;
        try {
          var8 = new IntrusiveDequeCursor(this.field_y);
          var9 = (UiWidget) (var8.a((byte) 111));
          if (!param0) {
            field_x = (int[]) null;
          }
          scanLoop1: while (true) {
            if (var9 != null) {
              stackOut_5_0 = var9.isLinked((byte) -113);
              stackIn_16_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var10 != 0) {
                break scanLoop1;
              }
              if (stackIn_6_0) {
                if (var9.handlePointerPress(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_t, param6)) {
                  return true;
                }
                var9 = (UiWidget) (var8.a(0));
                continue;
              }
            }
            stackIn_16_0 = false;
            break;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("wj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int param0) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var2 = null;
        UiWidget var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_y);
          if (param0 != 84) {
            this.requestKeyboardFocus((UiWidget) null, -46);
          }
          var3 = (UiWidget) (var2.a((byte) -99));
          while (var3 != null) {
            var3.clearKeyboardFocus(param0 ^ 0);
            var3 = (UiWidget) (var2.a(0));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wj.FA(" + param0 + ')');
        }
    }

    final int getLastRenderPass(byte param0) {
        int var2_int = 0;
        IntrusiveDequeCursor var3 = null;
        UiWidget var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          var3 = new IntrusiveDequeCursor(this.field_y);
          var4 = (UiWidget) (var3.a((byte) -80));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            var5 = var4.getLastRenderPass((byte) 118);
            stackIn_11_0 = var2_int;
            stackIn_11_1 = var5;
            if (var6 == 0) {
              if (stackIn_11_0 < stackIn_11_1) {
                var2_int = var5;
              }
              var4 = (UiWidget) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param0;
            stackIn_11_1 = 118;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            field_w = (String[]) null;
          }
          stackIn_15_0 = var2_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "wj.NA(" + param0 + ')');
        }
    }

    final boolean focusPreviousChild(UiWidget param0, byte param1) {
        IntrusiveDequeCursor var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_29_0 = false;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        boolean stackOut_19_0;
        RuntimeException var3_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_y.isEmpty((byte) -106)) {
            return false;
          }
          var3 = new IntrusiveDequeCursor(this.field_y);
          var4 = (UiWidget) (var3.b(0));
          if (param1 != -100) {
            this.addChild(-56, (UiWidget) null);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            stackOut_10_0 = var4.isFocused(82);
            stackIn_29_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (var7 == 0) {
              if (stackIn_11_0) {
                var5 = new IntrusiveDequeCursor(this.field_y);
                var5.a((byte) 104, (IntrusiveNode) (var4));
                var6 = (UiWidget) (var5.b((byte) 46));
                while (var6 != null) {
                  stackOut_19_0 = var6.requestKeyboardFocus(param0, 0);
                  stackIn_29_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (stackIn_20_0) {
                    return true;
                  }
                  var6 = (UiWidget) (var5.b((byte) 46));
                }
              }
              var4 = (UiWidget) (var3.b((byte) 46));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = false;
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("wj.U(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 != 65) {
            return;
          }
          if (param0 == 0 &&
            this.field_r != null) {
            this.field_r.drawWidget(-103, true, param3, (UiWidget) (this), param2);
          }
          var5 = new IntrusiveDequeCursor(this.field_y);
          var6 = (UiWidget) (var5.b(0));
          while (var6 != null) {
            var6.drawLayer(param0, 65, this.field_t + param2, this.field_g + param3);
            var6 = (UiWidget) (var5.b((byte) 46));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var5_ref), "wj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void drawParticipantPanelBackground(int param0, int param1, String param2, int param3, int param4, int param5) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var6_int = -127 % ((param5 - 63) / 51);
          AuctionListing.a(160 + param3, -22914, param3, param4 + 21, param4);
          SoftwareRasterizer.fillRoundedRectangle(param3, param4, 160, 42, 10, 65793);
          TeamManagementScreen.e(123);
          if (param2 != null) {
            ByteArrayPool.field_d.drawCentered(param2, 80 + param3, 17 + param4, 16777215, -1);
          }
          var7 = 0;
          while (param1 > var7) {
            var8 = 65793;
            var9 = 128;
            if (var10 != 0) {
              return;
            }
            if (~param0 == ~var7) {
              var8 = 16777215;
              var9 = 50;
            }
            SoftwareRasterizer.fillRectangleAlpha(param3, param4 + (var7 + 1) * 23, 160, 21, var8, var9);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("wj.TA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, TriangleMesh param1, int param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_42_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Kickabout.field_G;
        try {
          var5_int = ResizableModalPanel.bitLength(true, 3 * (-param2 + param3));
          var6 = param2 * 3;
          var7 = -10 + var5_int;
          if (param0 != -336184828) {
            return;
          }
          SpriteResourceSupport.clearTemporaryRaster((byte) -105);
          if (param1.field_u > 0 &&
            param1.field_G != null) {
            SessionUrlSupport.clearSharedRaster(82);
          }
          ShopPlayerSlot.field_Ob = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param1.field_g)))) {
            var9 = param1.field_n[var8];
            var10 = param1.field_z[var8];
            var11 = param1.field_T[var8];
            stackOut_11_0 = param4;
            stackIn_51_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = NumericDateInputWidget.field_M[var9];
                var13 = WaitForPlayersView.field_k[var9];
                var14 = -var12 + NumericDateInputWidget.field_M[var10];
                var15 = NumericDateInputWidget.field_M[var11] - var12;
                var16 = WaitForPlayersView.field_k[var10] - var13;
                var17 = WaitForPlayersView.field_k[var11] - var13;
              }
              if (!stackIn_12_0 ||
                !(var17 * var14 - var15 * var16 >= 0)) {
                var12Lifetime1 = AccountInputValidationResult.field_e[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = AccountInputValidationResult.field_e[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = AccountInputValidationResult.field_e[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var12Lifetime1 - (-var13Lifetime1 + var6);
                      stackIn_31_0 = -1;
                      stackIn_31_1 = ArchivePreloader.field_b.length;
                      if (var7 < 0) {
                        stackIn_32_2 = var15 << -var7;
                      } else {
                        stackIn_32_2 = var15 >> var7;
                      }
                      var16 = stackIn_31_0 + (stackIn_31_1 - stackIn_32_2);
                      var17 = ArchivePreloader.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_42_0 = var16;
                          if (stackIn_42_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ArchivePreloader.field_b[var16];
                          continue;
                        }
                        stackIn_42_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_42_0Lifetime1;
                        GameSoundEffect.field_e[var18] = var8;
                        ArchivePreloader.field_b[var16] = 1 + var17;
                        if (param1.field_u > 0 &&
                          param1.field_G != null) {
                          dupTemp$0 = param1.field_G[var8];
                          ContextMenuItem.field_zb[dupTemp$0] = ContextMenuItem.field_zb[dupTemp$0] + 1;
                        }
                        ShopPlayerSlot.field_Ob = ShopPlayerSlot.field_Ob + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_51_0 = param1.field_u;
          }
          if (stackIn_51_0 > 0 &&
            param1.field_G != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ContextMenuItem.field_zb.length)) {
              var10Lifetime1 = ContextMenuItem.field_zb[var9Lifetime1];
              ContextMenuItem.field_zb[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_65_0 = var5;
          stackIn_65_1 = new StringBuilder().append("wj.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 10) {
            this.field_y = (IntrusiveDeque) null;
          }
          stackIn_7_0 = (null != this.findFocusedChild(false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "wj.KA(" + param0 + ')');
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param1.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            do {
              var9_int = param3.indexOf(param0, var9_int);
              if (var9_int < 0) {
                if (var12 == 0) {
                  break;
                }
              } else {
                var7 = var7 + var8;
                var9_int = var9_int + var5;
              }
            } while (var12 == 0);
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          scanLoop1: while (true) {
            var11 = param3.indexOf(param0, var10);
            if (0 > var11) {
              if (var12 == 0) {
                break scanLoop1;
              }
            } else {
              discarded$0 = var9.append(param3.substring(var10, var11));
              discarded$1 = var9.append(param1);
              var10 = var5 + var11;
            }
            if (var12 == 0) {
              continue;
            }
            break;
          }
          discarded$2 = var9.append(param3.substring(var10));
          if (!param2) {
            field_A = 15;
          }
          stackIn_26_0 = var9.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("wj.S(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Kickabout.field_G;
        try {
          if (param4 != -1) {
            WidgetContainer.a(104, (TriangleMesh) null, 40, 112, false);
          }
          var7 = new IntrusiveDequeCursor(this.field_y);
          var8 = (UiWidget) (var7.a((byte) -93));
          while (var8 != null) {
            if (var8.isLinked((byte) -113)) {
              var8.handlePointerRelease(param0 + this.field_g, param1, param2, param3, -1, this.field_t + param5);
              var8 = (UiWidget) (var7.a(0));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("wj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void appendChildrenDebugTree(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var5 = new IntrusiveDequeCursor(this.field_y);
          if (param3 != 24745) {
            return;
          }
          var6 = (UiWidget) (var5.a((byte) 63));
          while (null != var6) {
            discarded$2 = param0.append('\n');
            if (var8 != 0) {
              return;
            }
            var7 = 0;
            while (param2 >= var7) {
              discarded$3 = param0.append(' ');
              var7++;
            }
            var6.appendDebugTree(param3 ^ 9586, 1 + param2, param1, param0);
            var6 = (UiWidget) (var5.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("wj.SA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        try {
          super.setBounds(param0, param1, param2, param3, param4);
          this.refreshChildrenLayout(5);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wj.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    String getTooltip(int param0) {
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        UiWidget var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_y);
          var3 = (UiWidget) (var2.a((byte) -56));
          if (param0 != -1) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var3))) {
            var4 = var3.getTooltip(-1);
            stackIn_15_0 = null;
            if (var5 == 0) {
              if (stackIn_15_0 != var4) {
                stackIn_12_0 = var4;
                return stackIn_12_0;
              }
              var3 = (UiWidget) (var2.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = null;
          }
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "wj.MA(" + param0 + ')');
        }
    }

    final StringBuilder appendDebugTree(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17883) {
            field_v = (MeshData[][]) null;
          }
          if (this.beginWidgetDiagnosticVisit(1, param3, param2, param1)) {
            this.appendWidgetDiagnosticProperties(param1, param3, param2, param0 - 36451);
            this.appendChildrenDebugTree(param3, param2, param1, 24745);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wj.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean handleKeyInput(char param0, byte param1, UiWidget param2, int param3) {
        IntrusiveDequeCursor var5 = null;
        RuntimeException var5_ref = null;
        UiWidget var6_ref_fd = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_20_0 = 0;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var7 = Kickabout.field_G;
        try {
          if (param1 > -60) {
            field_A = 114;
          }
          var5 = new IntrusiveDequeCursor(this.field_y);
          var6_ref_fd = (UiWidget) (var5.a((byte) -108));
          scanLoop1: while (true) {
            if (var6_ref_fd != null) {
              stackOut_6_0 = var6_ref_fd.isLinked((byte) -113);
              stackIn_20_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var7 != 0) {
                break scanLoop1;
              }
              if (stackIn_7_0) {
                if (var6_ref_fd.isFocused(52) &&
                  var6_ref_fd.handleKeyInput(param0, (byte) -76, param2, param3)) {
                  return true;
                }
                var6_ref_fd = (UiWidget) (var5.a(0));
                continue;
              }
            }
            stackIn_20_0 = param3;
            break;
          }
          var6 = stackIn_20_0;
          if (var6 != 80) {
            return false;
          }
          if (!GameplayHelpScreen.field_G[81]) {
            stackIn_27_0 = this.focusNextChild(param2, (byte) 123);
          } else {
            stackIn_27_0 = this.focusPreviousChild(param2, (byte) -100);
          }
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_33_0 = var5_ref;
          stackIn_33_1 = new StringBuilder().append("wj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.field_y);
          var6 = (UiWidget) (var5.a((byte) -34));
          while (null != var6) {
            if (var6.isLinked((byte) -113)) {
              var6.updatePointerState((byte) 12, param1, this.field_t + param2, param3 + this.field_g);
              var6 = (UiWidget) (var5.a(0));
              if (var7 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("wj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void refreshChildrenLayout(int param0) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var2 = null;
        UiWidget var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_y);
          if (param0 != 5) {
            WidgetContainer.releaseStatics(-127);
          }
          var3 = (UiWidget) (var2.a((byte) 106));
          while (null != var3) {
            var3.refreshLayout(-1947);
            var3 = (UiWidget) (var2.a(0));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wj.R(" + param0 + ')');
        }
    }

    final boolean handlePointerWheel(int param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var11 = Kickabout.field_G;
        try {
          var8 = new IntrusiveDequeCursor(this.field_y);
          var9 = (UiWidget) (var8.a((byte) 54));
          var10 = -61 % ((63 - param6) / 56);
          scanLoop1: while (true) {
            if (var9 != null) {
              stackOut_3_0 = var9.isLinked((byte) -113);
              stackIn_19_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var11 != 0) {
                break scanLoop1;
              }
              if (stackIn_4_0) {
                if (var9.isFocused(82) &&
                  var9.handlePointerWheel(param0, param1, param2, param3, param4, param5, -10)) {
                  return true;
                }
                var9 = (UiWidget) (var8.a(0));
                continue;
              }
            }
            stackIn_19_0 = false;
            break;
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_23_0 = var8_ref;
          stackIn_23_1 = new StringBuilder().append("wj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_z = true;
        field_A = 0;
        field_v = new MeshData[5][5];
    }
}
