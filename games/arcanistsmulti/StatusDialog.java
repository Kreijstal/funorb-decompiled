/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class StatusDialog extends MainMenuDialog implements ButtonListener {
    static String field_Lb;
    private AccountRegistrationPanel field_Kb;
    static String field_Ub;
    static String field_Rb;
    static int field_Sb;
    static boolean field_Pb;
    static int field_Vb;
    static IndexedSprite[] field_Tb;
    private boolean field_Wb;
    static String field_Mb;
    private boolean field_Ob;
    static String field_Jb;
    static String field_Nb;
    static IntrusiveNodeHashTable field_Qb;

    final static boolean pollStatusSocket(int param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (CacheEntry.field_o == null) {
          CacheEntry.field_o = ClientRuntimeException.field_b.queueDirectSocketOpen(TermsNoticePanel.field_G, true, ProxySocketConnector.field_q);
        }
        if (param0 >= -35) {
          StatusDialog.layoutTopBar((byte) 23);
        }
        if (CacheEntry.field_o.field_e == 0) {
          return false;
        }
        dupTemp$2 = TimeAndInputHelpers.monotonicTimeMillis(-26572);
        MessageCaptionGlobals.field_d = dupTemp$2;
        ViewControllerHelpers.field_d = dupTemp$2;
        if (CacheEntry.field_o.field_e != 1) {
        }
        ResizableModalPanel.field_eb = IconTextSceneWidget.field_Ib;
        CacheEntry.field_o = null;
        return true;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        if (!param0) {
          field_Tb = (IndexedSprite[]) null;
        }
        if (this.field_Wb) {
          ValidationHelpWidget.showLoginPanelWithOptions(true, false, false);
          return;
        }
        try {
          IntrusiveNodeHashTable.openLoginFlow(-1);
          this.dismiss(77);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ie.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    StatusDialog(ModalPanelStack param0, AccountRegistrationPanel param1) {
        super(param0, SocketConnector.field_k, QueuedPacket.field_l, false, false);
        try {
          this.field_Kb = param1;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean updateFade(byte param0) {
        ServerMessage var2 = null;
        if (param0 <= 19) {
          return false;
        }
        if (this.field_G &&
          !this.field_Ob) {
          var2 = ContextActionMenu.getCurrentMessage(false);
          if (var2 != null) {
            this.showMessageLines(var2, (byte) 119, false);
          }
        }
        return super.updateFade((byte) 83);
    }

    final static boolean openUrlWithWindowsShell(byte param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          try {
            if (!PlatformTaskDispatcher.field_s.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param1.length(); var3++) {
              if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                return false;
              }
            }
            var4 = -39 / ((param0 - 77) / 37);
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("ie.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Qb = null;
        field_Lb = null;
        if (param0 <= 13) {
          StatusDialog.releaseStatics((byte) 103);
        }
        field_Jb = null;
        field_Nb = null;
        field_Mb = null;
        field_Ub = null;
        field_Rb = null;
        field_Tb = null;
    }

    final void showMessageById(int param0) {
        this.showMessageLines(CipherPacketBuffer.createMessage(0, param0, SupportPageHelpers.field_c), (byte) 124, true);
    }

    private final void showMessageLines(ServerMessage param0, byte param1, boolean param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MenuButtonPanel var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_Ob = true;
          if (param1 < 115) {
            field_Mb = (String) null;
          }
          if (!param0.field_f) {
            if (param0.field_b == null) {
              var4 = param0.field_e;
              if (param0.field_a == 248) {
                if (!param2) {
                  LobbyGameEntry.clearStatusCookieForApplet((byte) 105);
                }
                var4 = SupportPageHelpers.field_c;
                this.field_Wb = true;
              }
            } else {
              var4 = SpriteFrame.field_e;
              if (this.field_Kb != null) {
                this.field_Kb.onSuggestionsChanged((byte) -7);
              }
            }
          } else {
            var4 = CommonUiHelpers.field_h;
          }
          var5 = new MenuButtonPanel((MainMenuDialog) (this), SocketConnector.field_k, var4);
          if (param0.field_f) {
            if (param0.field_h) {
              this.setContent((byte) -92, (UiComponent) (new TermsNoticePanel(this)));
              return;
            }
            var5.addButton(73, MessageDialog.field_lb, (UiListener) (this));
          } else {
            if (!this.field_Wb) {
              if (5 != param0.field_a) {
                var5.addMenuItem(LobbyRequestHelpers.field_b, (byte) 115, -1);
              } else {
                var5.addMenuItem(DebouncedValidator.field_f, (byte) 111, 11);
                var5.addMenuItem(EmailValidator.field_u, (byte) 10, 17);
              }
            } else {
              var5.addButton(116, MessageDialog.field_lb, (UiListener) (this));
            }
            if (3 == param0.field_a) {
              var5.addMenuItem(LoginCredentials.field_b, (byte) 10, 7);
            } else {
              if (param0.field_a == 6) {
                var5.addMenuItem(DiskCacheRequest.field_B, (byte) -121, 9);
              }
            }
          }
          this.setContent((byte) -92, (UiComponent) (var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("ie.WA(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void layoutTopBar(byte param0) {
        QuickChatHelpers.field_d.setBounds(-(!SpriteDecodeHelpers.field_a ? 0 : 40 + (2 + (CacheEntry.field_p + 2))) + StatefulTextPainter.field_s.field_x, 0, 0, 18, (byte) -120);
        StrongCacheEntry.field_z.setBounds(CacheEntry.field_p + 42, -40 + (-CacheEntry.field_p + StatefulTextPainter.field_s.field_x) - 2, 0, 18, (byte) -120);
        NameCheckHelpers.field_m.setBoundsAndLayout(20, CacheEntry.field_p, StatefulTextPainter.field_s.field_x, false, 0, StatefulTextPainter.field_s.field_I - 20, 2);
        int var1 = -112 % ((param0 - 45) / 37);
    }

    static {
        field_Lb = "Character Creation";
        field_Rb = "<shad><col=<%0>>COGS</col></shad>";
        field_Ub = "Try changing the following settings:  ";
        field_Vb = 1;
        field_Jb = "This is the Book of Frost. Frost spells focus on high damage attacks and the summoning of powerful minions. You require 5 wands to purchase this spellbook; you currently have ";
        field_Mb = "Select the Lava Bomb spell below.";
    }
}
