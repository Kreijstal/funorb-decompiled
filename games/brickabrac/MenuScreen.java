/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen extends GameScreen {
    int buttonTop;
    int buttonSpacing;
    int buttonRight;
    static n field_k;
    int buttonLeft;
    MenuSelection selection;
    MenuButton[] buttons;
    static String field_n;
    static String field_o;
    static int field_i;

    void drawScreen(byte obfuscationGuard) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (im.field_e <= 0) {
          pa.a(true);
        } else {
          var2 = (-50 + im.field_e) * 640 / 50;
          if (0 != hc.field_h) {
            ed.a(-640 - var2, 0);
            MainMenuScreen.field_s.drawAt(-var2, 0);
          } else {
            ed.a(640 + var2, 0);
            MainMenuScreen.field_s.drawAt(var2, 0);
          }
        }
        if (obfuscationGuard >= -14) {
          return;
        }
        pg.d(0);
    }

    final void initializeButtons(int[] actionIds, int startIndex) {
        int var3_int = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        try {
          this.buttons = new MenuButton[actionIds.length];
          this.selection = new MenuSelection(this.buttons.length);
          for (var3_int = startIndex; actionIds.length > var3_int; var3_int++) {
            this.buttons[var3_int] = new MenuButton(actionIds[var3_int], this);
            this.buttons[var3_int].resetPressed(-97);
          }
          this.layoutButtons(true);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.Q(" + (actionIds != null ? "{...}" : "null") + ',' + startIndex + ')');
        }
    }

    String e(byte param0) {
        int discarded$0 = 0;
        if (param0 <= 53) {
          discarded$0 = this.findButtonAt(18, (byte) 84, -33);
        }
        return ag.buttonLabels[7];
    }

    int getParentScreenId(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_n = (String) null;
          return 0;
        }
        return 0;
    }

    private final void c(boolean param0, int param1) {
        if (this.selection.selectedIndex != -1 &&
          param1 != this.selection.selectedIndex) {
          PlayerBoard.a(ta.field_e[0], -106, FramedMenuScreen.g((byte) -44) / 4);
        }
        if (!param0) {
          this.buttonLeft = -36;
        }
    }

    final void e(int param0) {
        int dupTemp$0 = 0;
        int var4 = 0;
        String stackIn_5_0 = null;
        int var2;
        int var3;
        MenuButton var4_ref_q;
        String var5;
        int var6;
        String var7;
        MenuButton var8;
        int var3Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        for (var3 = 0; this.buttons.length > var3; var3++) {
          var4_ref_q = this.buttons[var3];
          if (var4_ref_q.actionId == 8) {
            stackIn_5_0 = this.e((byte) 108);
          } else {
            stackIn_5_0 = ag.buttonLabels[var4_ref_q.actionId];
          }
          var7 = stackIn_5_0;
          var5 = var7;
          dupTemp$0 = nn.field_g.c(var7) + 30;
          var4_ref_q.width = dupTemp$0;
          var2 = var2 + dupTemp$0;
          if (var3 > 0) {
            var2 += 10;
          }
        }
        var3Lifetime1 = (640 - var2) / param0;
        for (var4 = 0; var4 < this.buttons.length; var4++) {
          var8 = this.buttons[var4];
          var8.x = var3Lifetime1;
          var8.y = this.getButtonTop(var4, param0 ^ 3);
          var8.height = this.getButtonHeight((byte) 125, var4);
          var3Lifetime1 = var3Lifetime1 + (var8.width + 10);
        }
    }

    int getButtonRight(int obfuscationGuard, int buttonIndex) {
        if (obfuscationGuard >= -71) {
          this.markButton(true, 87);
        }
        return this.buttonRight;
    }

    MenuScreen(int screenId, int buttonLeft, int buttonRight, int buttonTop, int buttonSpacing, int[] actionIds) {
        super(screenId);
        try {
          this.buttonTop = buttonTop;
          this.buttonRight = buttonRight;
          this.buttonSpacing = buttonSpacing;
          if (actionIds == null) {
            actionIds = new int[]{};
          }
          this.buttonLeft = buttonLeft;
          this.initializeButtons(actionIds, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.<init>(" + screenId + ',' + buttonLeft + ',' + buttonRight + ',' + buttonTop + ',' + buttonSpacing + ',' + (actionIds != null ? "{...}" : "null") + ')');
        }
    }

    void refreshMenu(int obfuscationGuard) {
        if (obfuscationGuard > -60) {
          this.onEnter(true, -25, 10);
        }
    }

    boolean handleKey(char character, int keyCode, int obfuscationGuard) {
        int var4 = 0;
        if (13 != obfuscationGuard) {
          var4 = this.selection.selectedIndex;
          this.handleNavigationKey(-120, obfuscationGuard, character);
          this.selection.pollKeyboardCode((byte) -124);
          if (this.a(false, (byte) 126)) {
            wp.a(8, ta.field_e[0]);
          }
          this.c(true, var4);
        } else {
          this.navigateBack(-1);
        }
        if (keyCode <= 98) {
          return true;
        }
        return true;
    }

    int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          this.advanceScreen(true, true, -57);
        }
        return this.buttonSpacing * buttonIndex + this.buttonTop;
    }

    void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        this.selection.navigateVertical(obfuscationGuard + 119);
        if (obfuscationGuard != -120) {
          this.c(true, 117);
        }
    }

    void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int var5 = 0;
        int fieldTemp$2 = 0;
        MenuButton[] var4_ref_q__;
        int var4;
        MenuButton var6;
        int var7;
        MenuButton[] var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        si.field_k.e(1);
        var8 = this.buttons;
        var4_ref_q__ = var8;
        for (var5 = 0; var8.length > var5; var5++) {
          var6 = var8[var5];
          var6.updatePressed(-2217);
        }
        if (obfuscationGuard > -52) {
          this.onEnter(true, -79, -10);
        }
        var4 = this.selection.selectedIndex;
        MouseInput.field_b = sa.a(MembershipBenefitsScreen.field_x * 20, -4097);
        if (inputEnabled &&
          !vh.field_L &&
          !ed.field_d) {
          this.selection.updatePointer(this.findButtonAt(po.pointerY, (byte) -106, pq.pointerX), 27479, this.findButtonAt(qo.pressY, (byte) -80, tb.pressX));
          if (this.a(true, (byte) -117)) {
            wp.a(8, ta.field_e[0]);
          }
        }
        this.c(true, var4);
        if (lp.currentScreen == this &&
          im.field_e > 0) {
          fieldTemp$2 = im.field_e - 1;
          im.field_e = im.field_e - 1;
          if (fieldTemp$2 == 0) {
            hc.field_h = 1;
            c.field_g = 250;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3;
        MenuButton stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        for (var2 = param0; var2 < this.selection.itemCount; var2++) {
          if (this.isButtonEnabled((byte) 99, var2)) {
            stackIn_7_0 = this.buttons[var2];
            stackIn_7_1 = 4;
            stackIn_8_2 = (this.selection.selectedIndex == var2);
            ((MenuButton) (Object) stackIn_7_0).draw((byte) stackIn_7_1, stackIn_8_2);
          }
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 5 % ((param1 - 69) / 51);
        if (this.buttons.length != 0 &&
          0 <= this.selection.selectedIndex) {
          return this.handleMenuAction(this.selection.selectedIndex, param0, (byte) 123);
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 > -66) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != HighscoresScreen.a(false, var3)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("km.HA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    void navigateBack(int obfuscationGuard) {
        ng.requestScreen(false, 97, this.getParentScreenId(true));
        if (obfuscationGuard != -1) {
          field_n = (String) null;
        }
    }

    boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_143_0 = 0;
        boolean stackIn_165_0 = false;
        int var4;
        MenuButton var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 123) {
          return true;
        }
        regionExit1: {
          var4 = 0;
          var5 = this.buttons[buttonIndex];
          var6 = var5.actionId;
          var8 = var6;
          if (0 != var8) {
            if (var8 != 38 &&
              var8 != 27) {
              if (var8 == 37) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  be.field_a = true;
                  cq.a(16727, inputFlag, 0, new LevelSequence(na.field_L[0]));
                }
                break regionExit1;
              }
              if (var8 == 1) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  if (!og.h(-26090)) {
                    cb.b(true);
                  } else {
                    sl.field_z = -2;
                    dk.a(sb.field_b, true, 0, inputFlag, 46);
                  }
                }
                break regionExit1;
              }
              if (var8 == 2) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 69, -1);
                }
                break regionExit1;
              }
              if (var8 == 7) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 74, 0);
                }
                break regionExit1;
              }
              if (var8 == 24) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  eb.field_l = true;
                  ng.requestScreen(inputFlag, obfuscationGuard ^ 61, 0);
                }
                break regionExit1;
              }
              if (var8 == 22) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 67, 8);
                }
                break regionExit1;
              }
              if (var8 == 5) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 126, 7);
                }
                break regionExit1;
              }
              if (var8 == 8) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, obfuscationGuard ^ 28, this.getParentScreenId(true));
                }
                break regionExit1;
              }
              if (var8 == 4) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 71, 6);
                }
                break regionExit1;
              }
              if (var8 == 3) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 86, 5);
                }
                break regionExit1;
              }
              if (var8 == 20) {
                var7 = 0;
                if (this.selection.isHomeKey(-103) &&
                  FramedMenuScreen.g((byte) -44) > 0) {
                  ma.a((byte) -113, 0);
                  var7 = 1;
                }
                if (this.selection.isEndKey(-1) &&
                  FramedMenuScreen.g((byte) -44) < MenuSelection.e((byte) 44)) {
                  ma.a((byte) 47, MenuSelection.e((byte) 31));
                  var7 = 1;
                }
                if (this.selection.isLeftArrow((byte) -57) &&
                  FramedMenuScreen.g((byte) -44) > 0) {
                  k.d((byte) 116);
                  var7 = 1;
                }
                if (this.selection.isRightArrow(-98) &&
                  FramedMenuScreen.g((byte) -44) < MenuSelection.e((byte) 90)) {
                  var7 = 1;
                  th.a((byte) -63);
                }
                if (this.selection.isHeld(false)) {
                  var8 = -120 + var5.width + var5.x + var5.x + dg.field_d >> 1;
                  var9 = pq.pointerX - var8;
                  var10 = var9 * MenuSelection.e((byte) 51) / 120;
                  if (var10 <= 0) {
                    ma.a((byte) -114, 0);
                  } else {
                    if (var10 < MenuSelection.e((byte) 81)) {
                      ma.a((byte) -127, var10);
                    } else {
                      ma.a((byte) 95, MenuSelection.e((byte) 32));
                    }
                  }
                  var7 = 1;
                }
                if (((var7 != 0)) && ((!(this.selection.isHeld(false)) ||
                  !(MembershipBenefitsScreen.field_x <= ea.field_d)))) {
                  wp.a(8, ta.field_e[1]);
                  ea.field_d = MembershipBenefitsScreen.field_x + 20;
                }
                break regionExit1;
              }
              if (var8 == 21) {
                if (this.selection.isHomeKey(obfuscationGuard ^ -30)) {
                  il.a((byte) 86, 0);
                }
                if (this.selection.isEndKey(-1)) {
                  il.a((byte) 86, 256);
                }
                if (this.selection.isLeftArrow((byte) -57)) {
                  RankingsScreen.f(-1);
                }
                if (this.selection.isRightArrow(obfuscationGuard ^ -27)) {
                  nf.a((byte) 109);
                }
                if (!(!this.selection.isHeld(false))) {
                  var8 = -120 + (dg.field_d + (var5.x + var5.width) + var5.x) >> 1;
                  var9 = -var8 + pq.pointerX;
                  var10 = 256 * var9 / 120;
                  if (var10 <= 0) {
                    il.a((byte) 86, 0);
                  } else {
                    if (var10 >= 256) {
                      il.a((byte) 86, 256);
                    } else {
                      il.a((byte) 86, var10);
                    }
                  }
                }
                break regionExit1;
              }
              if (var8 == 6) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  var4 = 1;
                  if (null == ua.field_d) {
                    cp.a(inputFlag, 21543);
                  } else {
                    LevelPack.b(82);
                  }
                }
                break regionExit1;
              }
              if (var8 == 9) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  pe.gameplayScreen.a((byte) 40, inputFlag);
                  NewAchievementsScreen.field_G = true;
                }
                break regionExit1;
              }
              if (var8 == 11) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  pe.gameplayScreen.b(29);
                  ng.requestScreen(inputFlag, 73, -1);
                }
                break regionExit1;
              }
              if (var8 == 12) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  pe.gameplayScreen.f(69);
                }
                break regionExit1;
              }
              if (13 == var8) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  da.f((byte) 122);
                }
                break regionExit1;
              }
              if (var8 == 23) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  if (this.screenId != 10) {
                    he.a(LevelPackLoader.field_a, true, (byte) 126);
                    sl.field_z = 2147483647;
                  } else {
                    var12 = (String) null;
                    he.a((String) null, true, (byte) 123);
                    if (ib.a(pl.pendingAchievementMask, -1)) {
                      sl.field_z = 9;
                    } else {
                      stackIn_143_0 = (null != fj.field_Ub) ? 5 : 0;
                      sl.field_z = stackIn_143_0;
                    }
                  }
                }
                break regionExit1;
              }
              if (19 == var8) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  var4 = 1;
                  nk.a(2048, uc.e((byte) -66));
                }
                break regionExit1;
              }
              if (var8 == 32) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  ng.requestScreen(inputFlag, 62, 14);
                }
                break regionExit1;
              }
              if (var8 == 33) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  cq.a(16727, inputFlag, pe.gameplayScreen.field_r, pe.gameplayScreen.match.configuration);
                }
                break regionExit1;
              }
              if (var8 == 34) {
                if (!(!this.selection.isActivated((byte) 113))) {
                  var8 = 13;
                  if (gq.field_Yb == 1) {
                    var8 = 15;
                  }
                  ng.requestScreen(inputFlag, obfuscationGuard ^ 25, var8);
                  NewAchievementsScreen.field_G = true;
                }
                break regionExit1;
              }
              switch (var8) {
                case 35:
                  if (!this.selection.isActivated((byte) 113)) {
                    break regionExit1;
                  }
                  pe.gameplayScreen.a(inputFlag, (byte) 69);
                  NewAchievementsScreen.field_G = true;
                  break regionExit1;
                default:
                  break regionExit1;
                case 42:
                  if (!this.selection.isActivated((byte) 113)) {
                    break regionExit1;
                  }
                  var4 = 1;
                  ng.requestScreen(inputFlag, 110, 12);
                  break regionExit1;
                case 36:
                  if (!this.selection.isActivated((byte) 113)) {
                    break regionExit1;
                  }
                  stackIn_165_0 = !(be.field_a);
                  be.field_a = stackIn_165_0;
                  r.field_A = stackIn_165_0;
                  if (r.field_A &&
                    pe.gameplayScreen != null) {
                    hd.a(true);
                  }
                  var4 = 1;
                  break regionExit1;
              }
            }
            if (this.selection.isActivated((byte) 113)) {
              GameplayScreen.b((byte) -126, inputFlag);
            }
          } else {
            if (this.selection.isActivated((byte) 113)) {
              stackIn_47_0 = inputFlag;
              stackIn_47_1 = obfuscationGuard - 44;
              if (pg.c(72)) {
                stackIn_48_2 = 13;
              } else {
                stackIn_48_2 = 16;
              }
              ng.requestScreen(stackIn_47_0, stackIn_47_1, stackIn_48_2);
            }
          }
        }
        return var4 != 0;
    }

    final static void a(MultiplayerMatch param0, PlayerBoard param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = param3;
          var8 = param2;
          if (!param4) {
            return;
          }
          var9 = 0;
          var10 = 0;
          for (var11 = 0; var11 < 29; var11++) {
            if ((1 << var11 & param1.field_S) != 0) {
              oc.a(var8, var11, var7_int, param1, param0, (byte) 115);
              var7_int += 25;
              var9++;
              if (var9 == param5) {
                var10++;
                if (var10 == param6) {
                  return;
                }
                var9 = 0;
                var8 += 25;
                var7_int = param3;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("km.EA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean isButtonEnabled(byte obfuscationGuard, int buttonIndex) {
        if (obfuscationGuard <= 80) {
          return false;
        }
        return true;
    }

    void layoutButtons(boolean obfuscationGuard) {
        int var2 = 0;
        MenuButton var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (!obfuscationGuard) {
          this.e((byte) -7);
        }
        for (var2 = 0; var2 < this.buttons.length; var2++) {
          var3 = this.buttons[var2];
          var3.x = this.getButtonLeft(true, var2);
          var3.y = this.getButtonTop(var2, 1);
          var3.width = this.getButtonRight(-109, var2) - this.getButtonLeft(obfuscationGuard, var2);
          this.buttons[var2].height = this.getButtonHeight((byte) -78, var2);
        }
    }

    int getButtonLeft(boolean obfuscationGuard, int buttonIndex) {
        if (!obfuscationGuard) {
          this.handleNavigationKey(109, -54, 'ￃ');
        }
        return this.buttonLeft;
    }

    final static void a(int param0, int param1, long param2, String param3, int param4) {
        try {
          ep.field_k = param0;
          bo.field_l = true;
          wd.field_z = param4;
          MultiplayerExitScreen.field_E = param2;
          ba.field_z = param3;
          if (param1 != 29295) {
            MenuScreen.b(48);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_n = null;
        if (param0 >= -57) {
          PlayerBoard var2 = (PlayerBoard) null;
          MenuScreen.a((MultiplayerMatch) null, (PlayerBoard) null, 113, 61, false, -53, 18);
        }
        field_k = null;
    }

    void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        if (obfuscationGuard <= 96) {
          this.handleKey('F', -76, -96);
        }
        this.selection.initializeSelection(this.findButtonAt(po.pointerY, (byte) -106, pq.pointerX), initialSelection, usePointer, (byte) -127);
    }

    void onExit(byte obfuscationGuard) {
        if (obfuscationGuard != 79) {
          this.getButtonTop(-57, -105);
        }
    }

    int getButtonHeight(byte obfuscationGuard, int buttonIndex) {
        int var3 = 11 % ((obfuscationGuard - 66) / 45);
        return 30;
    }

    final void markButton(boolean marked, int buttonIndex) {
        int var4 = 0;
        MenuButton var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        MenuButton[] var7 = this.buttons;
        MenuButton[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          var5.marked = false;
        }
        this.buttons[buttonIndex].marked = marked ? true : false;
    }

    private final int findButtonAt(int pointY, byte obfuscationGuard, int pointX) {
        int var4;
        MenuButton var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        if (obfuscationGuard >= -77) {
          this.selection = (MenuSelection) null;
        }
        while (var4 < this.buttons.length) {
          var5 = this.buttons[var4];
          if (this.isButtonEnabled((byte) 122, var4) &&
            var5.containsPoint(pointX, pointY, -79)) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    static {
        field_k = new n();
        field_o = "Names should contain a maximum of 12 characters";
        field_n = "Your request to join has been declined.";
    }
}
