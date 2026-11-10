/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private long field_h;
    private int field_i;
    private DualLinkNode field_e;
    static UiComponent field_j;
    static String field_c;
    private int field_g;
    static boolean field_a;
    static int field_f;
    private DualLinkNode[] field_k;
    static UiComponent field_d;
    private DualLinkNode field_b;

    final static void showFramedMessage(int param0, Sprite[] param1, String param2, boolean param3, int param4, int param5, int param6, BitmapFont param7, int param8, byte param9, int param10, int param11, int param12, boolean param13, Sprite[] param14) {
        try {
          aj.initializeLobbyUi(qf.field_c, param8, param4, param0, param5, param10, kk.field_x, param7, param0, param6, SecondaryNodeDeque.field_a, param12, new pd(param14), param12, new pd(param1), param7, DraggableWidget.field_N, ic.field_g, IndexedSpriteState.field_c, (byte) 70);
          gk.showNoticeMenu(param13, 2, param2, param11, param3);
          if (param9 != -103) {
            field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode nextInTraversal(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var8;
        DualLinkNode var11;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_g <= 0) {
          if (param0 <= 94) {
            return (DualLinkNode) null;
          }
          do {
            if (this.field_i <= this.field_g) {
              return null;
            }
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            var4 = this.field_k[fieldTemp$1].secondaryPrevious;
          } while (this.field_k[this.field_g - 1] == var4);
          this.field_e = var4.secondaryPrevious;
          return var4;
        }
        if (this.field_e != this.field_k[this.field_g - 1]) {
          var11 = this.field_e;
          this.field_e = var11.secondaryPrevious;
          return var11;
        }
        if (param0 <= 94) {
          return (DualLinkNode) null;
        }
        do {
          if (this.field_i <= this.field_g) {
            return null;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          var8 = this.field_k[fieldTemp$0].secondaryPrevious;
        } while (this.field_k[this.field_g - 1] == var8);
        this.field_e = var8.secondaryPrevious;
        return var8;
    }

    public static void releaseStatics(boolean param0) {
        field_j = null;
        field_c = null;
        if (!param0) {
          field_f = -125;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void put(int param0, DualLinkNode param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (param1.secondaryNext != null) {
            param1.a(-4564);
          }
          var5 = this.field_k[(int)((long)(this.field_i + param0) & param2)];
          param1.secondaryNext = var5.secondaryNext;
          param1.secondaryPrevious = var5;
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryKey = param2;
          param1.secondaryPrevious.secondaryNext = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final DualLinkNode nextWithSameKey(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        DualLinkNode var2Lifetime1;
        DualLinkNode var3Lifetime1;
        if (null == this.field_b) {
          return null;
        }
        if (param0 != 68) {
          sc.releaseStatics(false);
          var2 = this.field_k[(int)(this.field_h & (long)(this.field_i - 1))];
          while (this.field_b != var2) {
            if (this.field_h == this.field_b.secondaryKey) {
              var3 = this.field_b;
              this.field_b = this.field_b.secondaryPrevious;
              return var3;
            }
            this.field_b = this.field_b.secondaryPrevious;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_k[(int)(this.field_h & (long)(this.field_i - 1))];
        while (this.field_b != var2Lifetime1) {
          if (this.field_h == this.field_b.secondaryKey) {
            var3Lifetime1 = this.field_b;
            this.field_b = this.field_b.secondaryPrevious;
            return var3Lifetime1;
          }
          this.field_b = this.field_b.secondaryPrevious;
        }
        this.field_b = null;
        return null;
    }

    final DualLinkNode firstInTraversal(byte param0) {
        this.field_g = 0;
        if (param0 != 7) {
          sc.closeChatContextState((byte) -11);
          return this.nextInTraversal((byte) 108);
        }
        return this.nextInTraversal((byte) 108);
    }

    final DualLinkNode findByKey(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == -22877) {
          this.field_h = param0;
          var4 = this.field_k[(int)((long)(-1 + this.field_i) & param0)];
          this.field_b = var4.secondaryPrevious;
          while (true) {
            if (this.field_b == var4) {
              this.field_b = null;
              return null;
            }
            if (this.field_b.secondaryKey != param0) {
              this.field_b = this.field_b.secondaryPrevious;
              continue;
            }
            break;
          }
          var5 = this.field_b;
          this.field_b = this.field_b.secondaryPrevious;
          return var5;
        }
        field_j = (UiComponent) null;
        this.field_h = param0;
        var4Lifetime1 = this.field_k[(int)((long)(-1 + this.field_i) & param0)];
        this.field_b = var4Lifetime1.secondaryPrevious;
        while (true) {
          if (this.field_b == var4Lifetime1) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.secondaryKey != param0) {
            this.field_b = this.field_b.secondaryPrevious;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.secondaryPrevious;
        return var5Lifetime1;
    }

    final static void showLoginDialog(int param0, boolean param1) {
        if (param0 >= -71) {
          field_f = -61;
          io.a(-21113, false, param1);
          return;
        }
        io.a(-21113, false, param1);
    }

    final static void closeChatContextState(byte param0) {
        if (NavigationGrid.field_m != null) {
          ec.field_b = NavigationGrid.field_m;
          DraggableWidget.field_E = ke.field_j;
          ec.field_b.field_ob = -1;
          NavigationGrid.field_m = null;
          ec.field_b.field_xb = -1;
          ke.field_j = null;
        }
        SpriteState.field_t = null;
        jk.field_d = null;
        if (param0 != 87) {
          field_f = -103;
          HotspotTextWidget.field_N = true;
          ClickMarker.field_v = null;
          dp.field_c = null;
          IntrusiveNode.field_c = null;
          return;
        }
        HotspotTextWidget.field_N = true;
        ClickMarker.field_v = null;
        dp.field_c = null;
        IntrusiveNode.field_c = null;
    }

    final static void drawFramedMenu(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var1Lifetime1;
        int var2Lifetime1;
        if (param0 != 0) {
          field_d = (UiComponent) null;
          var1 = ReportAbuseDialog.d(false);
          var2 = UiTheme.getMenuHeight((byte) -99);
          MusicPatch.field_l.drawFrame(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1 + (um.field_a << 1), (la.field_m << 1) + var2, 12018);
          HotspotTextWidget.g(param0 + 114);
          return;
        }
        var1Lifetime1 = ReportAbuseDialog.d(false);
        var2Lifetime1 = UiTheme.getMenuHeight((byte) -99);
        MusicPatch.field_l.drawFrame(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1Lifetime1 + (um.field_a << 1), (la.field_m << 1) + var2Lifetime1, 12018);
        HotspotTextWidget.g(param0 + 114);
    }

    final static void clearPhaseImageAndCharacterFont(int param0) {
        PhaseChangeEvent.field_i = null;
        if (param0 != 1) {
          field_j = (UiComponent) null;
          GameCharacter.field_hb = null;
          return;
        }
        GameCharacter.field_hb = null;
    }

    sc(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_g = 0;
        this.field_i = param0;
        this.field_k = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_k[var2] = dupTemp$1;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
        Sprite discarded$0 = new Sprite(640, 480);
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_a = false;
    }
}
