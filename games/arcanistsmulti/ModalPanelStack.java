/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalPanelStack extends SingleChildContainer {
    static aj field_G;
    static String field_E;
    private IntrusiveDeque field_H;
    static String[] field_K;
    static Sprite[] field_I;
    static int field_J;

    final UiComponent getFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 31) {
          this.field_H = (IntrusiveDeque) null;
        }
        var2 = new IntrusiveDequeCursor(this.field_H);
        var3 = (FadingModalPanel) (var2.first(-109));
        while (var3 != null) {
          if (var3.field_G) {
            return var3.getFocusedChild(852710177);
          }
          var3 = (FadingModalPanel) (var2.next(-18502));
        }
        return null;
    }

    public static void releaseStatics(int param0) {
        field_K = null;
        field_E = null;
        if (param0 != 1) {
          return;
        }
        field_G = null;
        field_I = null;
    }

    final void deactivatePanels(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(-82));
        while (var3 != null) {
          var3.field_G = false;
          var3 = (FadingModalPanel) (var2.next(-18502));
        }
        if (param0 >= -105) {
          return;
        }
        this.field_B = null;
    }

    public ModalPanelStack() {
        super(0, 0, SoundCache.field_c, mf.field_c, (WidgetPainter) null, (UiListener) null);
        this.field_H = new IntrusiveDeque();
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_r) {
          this.field_r.paint((UiComponent) (this), 5592405, param1, param3, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_H);
        if (param0 >= -52) {
          return;
        }
        UiComponent var6 = (UiComponent) (var5.last(121));
        while (var6 != null) {
          var6.drawLayer((byte) -53, param1 + this.field_n, param2, this.field_j + param3);
          var6 = (UiComponent) (var5.previous(true));
        }
    }

    final static void setLoginName(long param0, int param1, String param2) {
        CharSequence var5 = null;
        MenuInputState.field_p = param2;
        if (param1 != -30687) {
          return;
        }
        try {
          nj.field_c = 2;
          var5 = (CharSequence) ((Object) param2);
          GridContainer.field_S = Js5ArchiveManager.normalizeNameForLookup(var5, -13);
          gg.field_e = param0;
          uc.openQuickChat(3);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "h.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void recentrePanels(int param0, int param1, int param2) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == this.field_v &&
          this.field_k == param2) {
          return;
        }
        int var4 = (param1 - this.field_v) / 2;
        if (param0 >= -111) {
          this.field_H = (IntrusiveDeque) null;
        }
        int var5 = (param2 - this.field_k) / 2;
        IntrusiveDequeCursor var6 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var7 = (FadingModalPanel) (var6.first(-103));
        while (var7 != null) {
          var7.field_j = var7.field_j + var5;
          var7.field_n = var7.field_n + var4;
          var7 = (FadingModalPanel) (var6.next(-18502));
        }
        this.field_k = param2;
        this.field_v = param1;
    }

    final FadingModalPanel getActivePanel(int param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != 7213) {
          return (FadingModalPanel) null;
        }
        var3 = (FadingModalPanel) (var2.first(-37));
        while (var3 != null) {
          if (var3.field_G) {
            return var3;
          }
          var3 = (FadingModalPanel) (var2.next(-18502));
        }
        return null;
    }

    final static ConditionalTextValue createRememberedUsername(byte param0) {
        int var1 = -73 % ((param0 - 82) / 43);
        String var2 = ed.getStatusMessage(-952);
        if (var2 != null &&
          !(var2.indexOf('@') < 0)) {
          var2 = "";
        }
        return new ConditionalTextValue(ed.getStatusMessage(-952), ConditionalTextValue.isAccountMenuOpen(-1));
    }

    final static void renderLogoBanner(int param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = new Sprite(540, 140);
          fk.setSpriteRasterTarget(var1, -23095);
          MeshRasterState.useRasterClip();
          SoftwareRasterizer.clear();
          SoundCache.field_a = param0;
          SocialListEntry.buildLogoModelFrame(252566882);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          SoundCache.field_k.makeRasterTarget();
          var1.drawHalfSize(0, 0);
          QuickChatCategory.popClipState(-15405);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "h.G(" + param0 + ')');
        }
    }

    final void pushPanel(UiComponent param0, int param1) {
        FadingModalPanel var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof FadingModalPanel)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingModalPanel) (param0);
          this.field_H.addFirst((IntrusiveNode) (var3), (byte) -58);
          var3.field_G = true;
          var3.focusNext(0, (UiComponent) (this));
          if (param1 != 15637) {
            this.field_H = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("h.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePanels(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(param0 ^ -68));
        while (var3 != null) {
          if (var3.updateFade((byte) 112)) {
            var3.unlink(true);
          }
          var3 = (FadingModalPanel) (var2.next(param0 ^ -18498));
        }
        if (param0 != 4) {
          this.drawLayer((byte) -84, -8, -8, 19);
        }
        this.field_B = (UiComponent) ((Object) this.getActivePanel(7213));
    }

    final void removeClosedPanels(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != 83) {
          return;
        }
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(param0 - 131));
        while (var3 != null) {
          if (var3.isFullyFadedOut((byte) 45)) {
            var3.unlink(true);
          }
          var3 = (FadingModalPanel) (var2.next(-18502));
        }
    }

    static {
        field_G = new aj(7, 0, 1, 1);
        field_E = "Disruptive behaviour";
    }
}
