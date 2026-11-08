/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerTrailBubble extends IntrusiveNode {
    static BitmapFont field_u;
    static int field_s;
    int field_p;
    int field_n;
    static JoinStatusTextHelpers field_o;
    int field_r;
    static DisplayNameForm field_q;
    static int field_t;

    public static void releaseStatics(byte param0) {
        field_o = null;
        if (param0 > -81) {
          PointerTrailBubble.releaseStatics((byte) -79);
        }
        field_q = null;
        field_u = null;
    }

    PointerTrailBubble(int param0, int param1, int param2) {
        this.field_n = param2;
        this.field_r = param0;
        this.field_p = param1;
    }

    final static void updateNameListPanel(int param0, boolean param1, byte param2) {
        ScrollPane stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_3_4;
        boolean stackIn_4_5 = false;
        UiComponent stackIn_23_0 = null;
        String stackIn_24_1 = null;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        SocialListEntry var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PlayerContextMenu var16 = null;
        PlayerContextMenu var17 = null;
        var15 = TetraLink.field_J;
        try {
          stackIn_3_0 = BufferedSocket.field_n.field_Rb;
          stackIn_3_1 = 2;
          stackIn_3_2 = 2 + GameKeyHandler.field_d;
          stackIn_3_3 = 123;
          stackIn_3_4 = param1;
          stackIn_4_5 = (BufferedSocket.field_n.field_Rb == PendingMove.field_d);
          var3_int = ((ScrollPane) (Object) stackIn_3_0).layoutAndScrollToContent(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5, param0 * ((GameKeyHandler.field_d + 2) * 3)) ? 1 : 0;
          if (param2 != -64) {
            field_t = 122;
          }
          var4 = BufferedSocket.field_n.field_Kb.field_fb;
          if (TwoColumnListPanel.field_Tb != 2 &&
            1 != TwoColumnListPanel.field_Tb) {
            BufferedSocket.field_n.field_S = false;
            BufferedSocket.field_n.field_Rb.field_Ob.field_jb = FullscreenFocusCanvas.field_f;
            EmailAvailabilityValidator.resetChildLayouts(BufferedSocket.field_n.field_Kb, (byte) -104);
            return;
          }
          BufferedSocket.field_n.field_S = true;
          BufferedSocket.field_n.field_Rb.field_Ob.field_jb = null;
          var5 = null;
          var6 = (SocialListEntry) (var4.first(false));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_fb) {
              var6.field_Tb = new UiComponent(0L, SectorCacheStore.field_h);
              var6.addChild((byte) -103, var6.field_Tb);
              var6.field_Kb = new UiComponent(0L, SectorCacheStore.field_h);
              var6.addChild((byte) 43, var6.field_Kb);
              var6.markTreeDirty((byte) 112);
              var7 = 1;
            }
            var6.field_Hb = BufferedSocket.field_n.field_Kb.field_Hb;
            var6.field_Tb.setBounds((byte) -107, var6.field_Hb, 0, GameKeyHandler.field_d, 0);
            var8 = 0;
            if (null != var6.field_Vb &&
              !var6.field_Vb.equals("")) {
              var6.field_Kb.field_L = 16737894;
              var6.field_Kb.field_vb = QuickChatCommandType.field_b;
              var6.field_Kb.setBounds((byte) -79, 3 + QuickChatCommandType.field_b.field_t, 0, GameKeyHandler.field_d, 0);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_Hb;
            if (var8 != 0) {
              var9 = 3 + QuickChatCommandType.field_b.field_t;
              var10 = var10 - var9;
            }
            stackIn_23_0 = var6.field_Tb;
            if (var10 > 0) {
              stackIn_24_1 = BitmapFont.truncateWithEllipsis(var6.field_Tb.field_Ib, var6.field_Mb, var10);
            } else {
              stackIn_24_1 = var6.field_Mb;
            }
            stackIn_23_0.field_jb = stackIn_24_1;
            stackIn_27_0 = (var6.field_Tb.field_jb.equals(var6.field_Mb)) ? 0 : 1;
            var11 = stackIn_27_0;
            var6.field_Tb.setBounds((byte) -107, var10, 0, GameKeyHandler.field_d, var9);
            if (var3_int == 0) {
              var6.field_mb = -var6.field_R + GameKeyHandler.field_d;
            }
            if (var7 != 0) {
              BufferedSocket.field_n.field_Kb.placeBelow((UiComponent) (var5), true, var6, 2);
            }
            if (null != var6.field_Kb &&
              var6.field_Kb.field_Y) {
              CheckboxWidget.field_P = var6.field_Vb;
            } else {
              if (var6.field_Tb.field_Y &&
                var11 != 0) {
                CheckboxWidget.field_P = var6.field_Mb;
              }
            }
            var5 = var6;
            if (var6.field_F != 0) {
              LobbyPlayerEntry.openPlayerContextMenu(var6.field_Lb, 255, var6.field_Mb, -1, BufferedSocket.field_n.field_Rb, (int[]) null, 0L, var6, -1);
              var16 = EmailAvailabilityValidator.field_s;
              var13_ref_String = MarkerSlider.field_P;
              var16.field_j.addItem(var13_ref_String, param2 ^ -63, 7);
              var17 = EmailAvailabilityValidator.field_s;
              var13 = PasswordFieldPainter.field_B;
              var14 = WhirlpoolHasher.field_o;
              var17.field_j.openAt(0, var14, param2 ^ 77, 0, var13);
            }
            var6 = (SocialListEntry) (var4.next((byte) -70));
          }
          if (BufferedSocket.field_n.field_Sb.field_F != 0) {
            BevelFrameSpriteFactory.field_b = new NameEntryPopup(BufferedSocket.field_n.field_Sb.field_eb, BufferedSocket.field_n.field_Sb.field_z, BufferedSocket.field_n.field_Sb.field_Hb, BufferedSocket.field_n.field_Sb.field_R, PendingListRequest.field_p, TextFieldValidator.field_n, TextLayoutLine.field_i, TextLayoutLine.field_i);
            DiskCacheWorker.field_c = 2;
          }
          if (BufferedSocket.field_n.field_Pb.field_F == 0) {
            return;
          }
          BevelFrameSpriteFactory.field_b = new NameEntryPopup(BufferedSocket.field_n.field_Pb.field_eb, BufferedSocket.field_n.field_Pb.field_z, BufferedSocket.field_n.field_Pb.field_Hb, BufferedSocket.field_n.field_Pb.field_R, MouseInputHandler.field_d, TextFieldValidator.field_n, TextLayoutLine.field_i, TextLayoutLine.field_i);
          DiskCacheWorker.field_c = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "ko.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_s = 0;
        field_o = new JoinStatusTextHelpers();
    }
}
