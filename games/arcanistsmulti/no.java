/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends ContentTransitionDialog {
    static String field_wb;
    static String[] field_ub;
    static int[] field_tb;
    static String[] field_vb;

    final static void attachMouseInput(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(ResizableModalPanel.field_hb);
          param0.addMouseMotionListener(ResizableModalPanel.field_hb);
          if (param1 != 0) {
            no.setViewSize(-101, (byte) -112, -11);
          }
          param0.addFocusListener(ResizableModalPanel.field_hb);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "no.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_ub = null;
        if (param0 != -11) {
          no.setViewSize(-63, (byte) 100, -16);
        }
        field_wb = null;
        field_vb = null;
        field_tb = null;
    }

    final static aj findEntryById(int param0, int param1) {
        int var3 = 0;
        aj[] var2;
        int var4;
        aj[] var5;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = MenuInputState.getRegisteredEntries(96);
        var2 = var5;
        for (var3 = param1; var3 < var5.length; var3++) {
          if (var5[var3].field_c == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    no(ModalPanelStack param0, UiComponent param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void tickSocialEntries(int param0) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        SocialListEntry var1 = null;
        LobbyGameEntry var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        SocialListEntry var1Lifetime1;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = (SocialListEntry) (LinkButtonPainter.field_j.first(param0 + 12624));
          while (var1 != null) {
            if (var1.field_Eb > 0) {
              var1.field_Eb = var1.field_Eb - 1;
              if (var1.field_Eb == 0) {
                var1.field_Sb = 0;
                if (var1.isUnlisted(183874081)) {
                  var1.unlink(true);
                }
              }
            }
            var1 = (SocialListEntry) (LinkButtonPainter.field_j.next(0));
          }
          var1_ref = (LobbyGameEntry) (UiTheme.field_a.first(param0 + 12624));
          while (var1_ref != null) {
            if (var1_ref.field_bc > 0) {
              var1_ref.field_bc = var1_ref.field_bc - 1;
              if (var1_ref.field_bc == 0) {
                var1_ref.field_ac = 0;
                if (var1_ref.isUnlisted(-100)) {
                  var1_ref.unlink(true);
                }
              }
            }
            var1_ref = (LobbyGameEntry) (UiTheme.field_a.next(0));
          }
          var1Lifetime1 = (SocialListEntry) (ph.field_a.first(param0 ^ -12624));
          while (var1Lifetime1 != null) {
            stackIn_25_0 = ~var1Lifetime1.field_Eb;
            stackIn_25_1 = -1;
            if (stackIn_25_0 < stackIn_25_1) {
              var1Lifetime1.field_Eb = var1Lifetime1.field_Eb - 1;
              if (0 != var1Lifetime1.field_Eb) {
                var1Lifetime1 = (SocialListEntry) (ph.field_a.next(0));
                continue;
              }
              var1Lifetime1.field_Sb = 0;
              if (var1Lifetime1.isUnlisted(183874081)) {
                var1Lifetime1.unlink(true);
              }
            }
            var1Lifetime1 = (SocialListEntry) (ph.field_a.next(0));
          }
          if (param0 != -1) {
            no.releaseStatics((byte) 65);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref2), "no.G(" + param0 + ')');
        }
    }

    final static void setViewSize(int param0, byte param1, int param2) {
        MusicPatchNode.field_r = param2;
        tn.field_Eb = param2;
        co.field_c = param0;
        wh.field_c = param0;
        if (param1 != -61) {
          field_ub = (String[]) null;
        }
        TextWidgetPainter.field_j = true;
    }

    final void setContent(byte param0, UiComponent param1) {
        try {
          super.setContent(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "no.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ub = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_tb = new int[]{287, 359, 424, 482, 544};
        field_vb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_wb = "Mute this player for 48 hours";
    }
}
