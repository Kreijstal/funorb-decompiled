/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiSelectionState {
    static int field_i;
    static String field_d;
    static int[][] field_e;
    private int buttonPress;
    private boolean pointerDrivenSelection;
    private int keyCode;
    int selectedIndex;
    private int repeatCountdown;
    int itemCount;
    static int[] field_c;
    private int pressedPointerButton;

    final void pollNavigationKeys(byte obfuscationGuard) {
        this.keyCode = 0;
        this.buttonPress = 0;
        if (this.pressedPointerButton == 0 &&
          rs.field_q == 98) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.pointerDrivenSelection = false;
        }
        if (obfuscationGuard != -120) {
          return;
        }
        if (0 == this.pressedPointerButton) {
          this.keyCode = rs.field_q;
        }
        if (this.pressedPointerButton == 0 &&
          rs.field_q == 99) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
          this.pointerDrivenSelection = false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 96) {
          return true;
        }
        return this.keyCode == 103 ? true : false;
    }

    final boolean isPointerPressed(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return false;
        }
        return this.pressedPointerButton != 0 ? true : false;
    }

    final boolean hasActivationInput(byte obfuscationGuard) {
        boolean stackIn_8_0 = false;
        if (obfuscationGuard < 35) {
          this.buttonPress = -104;
        }
        stackIn_8_0 = (0 != this.buttonPress) || (this.keyCode == 84) || (this.keyCode == 83);
        return stackIn_8_0;
    }

    public static void c(byte param0) {
        field_e = (int[][]) null;
        field_c = null;
        int var1 = -45 / ((param0 + 26) / 46);
        field_d = null;
    }

    final void selectIndex(int index, boolean obfuscationGuard) {
        if (this.pressedPointerButton == 0) {
          this.pointerDrivenSelection = false;
          this.selectedIndex = index;
        }
        if (obfuscationGuard) {
          this.b(15);
        }
    }

    final static void a(byte param0, boolean param1) {
        se.field_g.a(param1, true);
        if (param0 != 32) {
          field_c = (int[]) null;
        }
    }

    final boolean e(int param0) {
        int var2 = -105 % ((param0 + 19) / 60);
        return this.keyCode == 102 ? true : false;
    }

    final void pollNavigationKeysWithFallback(int fallbackIndex, byte obfuscationGuard) {
        this.keyCode = 0;
        int var3 = 61 % ((obfuscationGuard - 78) / 48);
        this.buttonPress = 0;
        if (this.pressedPointerButton == 0) {
          this.keyCode = rs.field_q;
        }
        if (0 == this.pressedPointerButton &&
          rs.field_q == 96) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.pointerDrivenSelection = false;
        }
        if (0 == this.pressedPointerButton &&
          rs.field_q == 97) {
          this.selectedIndex = this.selectedIndex + 1;
          this.pointerDrivenSelection = false;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
        }
        if (this.pressedPointerButton == 0 &&
          (rs.field_q == 98 || rs.field_q == 99)) {
          this.pointerDrivenSelection = false;
          if (this.selectedIndex < 0) {
            this.selectedIndex = fallbackIndex;
          }
        }
    }

    final boolean isIncrementKeyPressed(int obfuscationGuard) {
        if (obfuscationGuard != -98) {
          this.pollKeyForButtonState(6);
        }
        return this.keyCode == 97 ? true : false;
    }

    final static boolean d(int param0) {
        boolean stackIn_12_0 = false;
        if (param0 != 95) {
          UiSelectionState.f(46);
        }
        stackIn_12_0 = ((OwnerChangeEvent.field_B &&
          im.field_w &&
          sh.field_h &&
          ve.field_b &&
          mv.field_b) ||
          DamageEvent.g(105));
        return stackIn_12_0;
    }

    final void pollKeyForButtonState(int pointerButton) {
        this.buttonPress = 0;
        this.keyCode = 0;
        if (pointerButton == this.pressedPointerButton) {
          this.keyCode = rs.field_q;
        }
    }

    final boolean isDecrementKeyPressed(byte obfuscationGuard) {
        if (obfuscationGuard >= -48) {
          this.pressedPointerButton = 73;
        }
        return 96 == this.keyCode ? true : false;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        je var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        mo var9 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (mj.field_c > sj.field_d) {
            sj.field_d = sj.field_d + 1;
          }
          if (gb.field_y != so.field_b.field_g) {
            sh.field_l = sh.field_l + (-gb.field_y + so.field_b.field_g);
            gb.field_y = so.field_b.field_g;
          }
          if (sj.field_d <= 0) {
            return;
          }
          vi.a(-68);
          CombatEvent.field_I.a(true, param3);
          if (BestScoreStrategy.field_i != null) {
            if (NodeIterator.field_a) {
              BestScoreStrategy.field_i.a(param3, -6226, CombatEvent.field_I.field_V, CombatEvent.field_I.field_D);
            } else {
              BestScoreStrategy.field_i = null;
            }
          }
          for (var4_int = param2; var4_int < 5; var4_int++) {
            var5 = gt.field_b[var4_int];
            if (var5 != null) {
              if (0 != var5.field_yb) {
                mq.a(var5, var4_int, false);
              }
              var6 = kp.a(var4_int, -119);
              we.field_g[var4_int].field_cb = dh.field_n[var6];
              bp.field_j[var4_int].field_X = co.field_k[var6];
            }
          }
          if (UnitLossCondition.field_f.field_yb != 0) {
            Spell.field_b = new i(UnitLossCondition.field_f.field_V, UnitLossCondition.field_f.field_D, UnitLossCondition.field_f.field_gb, UnitLossCondition.field_f.field_ob, param0, jm.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, hs.field_H, DualLinkedNode.field_k, (String) null, 0L);
          }
          var9 = wm.a(jn.field_d, mi.field_l, (byte) 127, param1);
          if (var9 != null) {
            pg.a(0, var9);
          }
          var8 = wd.a(false);
          if (var8 != null) {
            ad.field_I = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var4), "dl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void updatePointerSelection(int previousButton, int pressedIndex, int hoverIndex) {
        if (hoverIndex >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        if (pressedIndex >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.buttonPress = 0;
        this.keyCode = 0;
        if (previousButton != DeployEvent.field_A) {
          this.pressedPointerButton = DeployEvent.field_A;
          this.buttonPress = DeployEvent.field_A;
          this.pointerDrivenSelection = true;
          this.selectedIndex = pressedIndex;
          this.repeatCountdown = eu.field_a;
        }
        if (this.pressedPointerButton != 0 &&
          0 != ro.field_ub) {
          if (this.repeatCountdown <= 0) {
            this.repeatCountdown = GameEvent.field_k;
          }
          this.repeatCountdown = this.repeatCountdown - 1;
        }
        if (DeployEvent.field_A == 0 &&
          ro.field_ub == 0) {
          this.pressedPointerButton = 0;
        }
        if (this.pressedPointerButton == 0 && (this.pointerDrivenSelection ||
          lk.field_f)) {
          if (0 > hoverIndex) {
            if (this.pointerDrivenSelection) {
              this.selectedIndex = -1;
            }
          } else {
            if (hoverIndex == this.selectedIndex) {
            }
            this.pointerDrivenSelection = true;
            this.selectedIndex = hoverIndex;
          }
        }
    }

    final static void f(int param0) {
        TurnEffectEvent.a(8, eq.field_h, jm.field_b, cb.field_c, UnitModelPreview.field_m);
        if (param0 != 0) {
          field_i = 123;
        }
    }

    UiSelectionState(int itemCount) {
        this.pointerDrivenSelection = false;
        this.selectedIndex = 0;
        this.itemCount = itemCount;
    }

    final void restoreSelection(int fallbackIndex, boolean pointerDriven, int pointerIndex, int pointerButton) {
        this.pressedPointerButton = pointerButton;
        this.pointerDrivenSelection = pointerDriven ? true : false;
        if (this.pointerDrivenSelection) {
          this.selectedIndex = pointerIndex;
        } else {
          this.selectedIndex = fallbackIndex;
        }
    }

    static {
        field_e = new int[][]{new int[]{0, 0, 0, 0, 0}, new int[]{94, 97, 100, 127, 131}, new int[]{95, 98, 101, 128, 132}, new int[]{96, 99, 102, 129, 133}, new int[]{0, 124, 125, 126, 0}, new int[]{0, 124, 125, 126, 0}, new int[]{105, 106, 107, 130, 134}};
        field_d = "LEVEL";
        field_c = new int[8192];
    }
}
