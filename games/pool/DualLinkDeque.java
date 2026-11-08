/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    static String[] doubleplusgoodShot;
    static boolean field_c;
    private DualLinkNode field_d;
    private DualLinkNode field_e;
    static ScrollPane field_f;
    static int field_a;
    static ServerListLauncher field_g;

    final DualLinkNode first(byte obfuscationGuard) {
        int var3 = -47 % ((obfuscationGuard - 25) / 39);
        DualLinkNode var2 = this.field_d.field_q;
        if (this.field_d != var2) {
          this.field_e = var2.field_q;
          return var2;
        }
        this.field_e = null;
        return null;
    }

    final int size(int param0) {
        int var4 = Pool.field_O;
        int var2 = param0;
        DualLinkNode var3 = this.field_d.field_q;
        while (this.field_d != var3) {
          var2++;
          var3 = var3.field_q;
        }
        return var2;
    }

    final void addLast(DualLinkNode node, boolean obfuscationGuard) {
        try {
          if (obfuscationGuard) {
            this.field_e = (DualLinkNode) null;
          }
          if (node.field_n != null) {
            node.unlinkNode(obfuscationGuard);
          }
          node.field_q = this.field_d;
          node.field_n = this.field_d.field_n;
          node.field_n.field_q = node;
          node.field_q.field_n = node;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wo.E(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void initializeSocialListPanels(int alignment, ResourceArchive archive) {
        UiComponent var5 = null;
        UiComponent var6 = null;
        UiComponent var3 = null;
        try {
          IntegerRecordSubmission.field_o = WidgetStyleLayer.loadSprite("basic", (byte) 54, "display_name_changed", archive);
          NameEntryPopup.field_Mb = new ScrollPaneWithFooter(0L, HighscoresScreen.field_J, StateIconLabel.muLobbyFriendAdd, PacketBuffer.muLobbyFriendRm);
          InputIdleSupport.field_c = new ScrollPaneWithFooter(0L, HighscoresScreen.field_J, ScreenProjectionSupport.muLobbyNameAdd, LookupRetrySupport.muLobbyNameRm);
          SingleChildWidget.field_J = new UiComponent(0L, (UiComponent) null);
          AccountContentDialog.field_sb = new UiComponent(0L, AlignedIconLabel.field_Lb);
          AccountContentDialog.field_sb.horizontalAlignment = alignment;
          PoolUiText.field_e = new UiComponent(0L, LoginEncryptionSupport.field_d, MenuScreenBase.muLobbyName);
          ByteStorage.field_f = new UiComponent(0L, Under13NoticePanel.field_Q, LobbyPanelLayoutSupport.muLobbyLocation);
          AccountTextSupport.field_b = new UiComponent(0L, UiWidget.field_A);
          SingleChildWidget.field_J.addChild(alignment - 103, AccountContentDialog.field_sb);
          SingleChildWidget.field_J.addChild(92, PoolUiText.field_e);
          SingleChildWidget.field_J.addChild(14, ByteStorage.field_f);
          SingleChildWidget.field_J.addChild(127, NameEntryPopup.field_Mb);
          SingleChildWidget.field_J.addChild(alignment ^ -107, AccountTextSupport.field_b);
          NameEntryPopup.field_Mb.scrollPane.viewport.copyStyle((byte) -87, AlignedIconLabel.field_Lb);
          NameEntryPopup.field_Mb.scrollPane.viewport.verticalAlignment = 1;
          var5 = NameEntryPopup.field_Mb.scrollPane.viewport;
          var6 = var5;
          var6.horizontalAlignment = 1;
          InputIdleSupport.field_c.scrollPane.viewport.copyStyle((byte) -87, AlignedIconLabel.field_Lb);
          var3 = InputIdleSupport.field_c.scrollPane.viewport;
          InputIdleSupport.field_c.scrollPane.viewport.verticalAlignment = 1;
          var3.horizontalAlignment = 1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wo.D(" + alignment + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode removeFirst(int obfuscationGuard) {
        DualLinkNode var2 = this.field_d.field_q;
        if (this.field_d == var2) {
          return null;
        }
        var2.unlinkNode(false);
        if (obfuscationGuard == 0) {
          return var2;
        }
        this.first((byte) -4);
        return var2;
    }

    public DualLinkDeque() {
        this.field_d = new DualLinkNode();
        this.field_d.field_q = this.field_d;
        this.field_d.field_n = this.field_d;
    }

    final DualLinkNode next(byte param0) {
        if (param0 > -66) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_e;
        if (var2 == this.field_d) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_q;
        return var2;
    }

    public static void releaseStatics(boolean param0) {
        doubleplusgoodShot = null;
        if (!param0) {
          return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        doubleplusgoodShot = new String[]{"Awesome shot!", "Pure skill!"};
        field_a = 5;
        field_g = new ServerListLauncher();
    }
}
