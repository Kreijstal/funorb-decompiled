/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static CipherPacketBuffer field_g;
    static byte[][][] field_c;
    int field_a;
    static IntrusiveDeque field_f;
    IntrusiveNode[] field_h;
    static SpriteWidget field_b;
    private IntrusiveNode field_d;
    static SpriteWidget field_e;

    public static void releaseStatics(byte param0) {
        try {
          field_b = null;
          field_c = (byte[][][]) null;
          field_f = null;
          field_g = null;
          field_e = null;
          int var1_int = 118 / ((param0 + 72) / 50);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gk.E(" + param0 + ')');
        }
    }

    final IntrusiveNode get(long param0, int param1) {
        IntrusiveNode var4 = null;
        int var6 = 0;
        IntrusiveNode stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        IntrusiveNode stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        IntrusiveNode var5 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = this.field_h[(int)((long)(this.field_a - 1) & param0)];
          this.field_d = var4.previous;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_d == var4))) {
            stackIn_12_0 = compareLongs(param0, this.field_d.key);
            if (var6 == 0) {
              if (stackIn_12_0 == 0) {
                var5 = this.field_d;
                this.field_d = this.field_d.previous;
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              this.field_d = this.field_d.previous;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = param1;
          }
          if (stackIn_12_0 != -18348) {
            stackIn_14_0 = (IntrusiveNode) null;
            return stackIn_14_0;
          }
          this.field_d = null;
          stackIn_16_0 = null;
          return (IntrusiveNode) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var4_ref), "gk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static SocialListEntry updateFriendListControls(byte param0, int param1, boolean param2) {
        ScrollPane stackIn_7_0;
        int stackIn_7_1;
        boolean stackIn_7_2;
        boolean stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        boolean stackIn_8_6 = false;
        SocialListEntry stackIn_12_0 = null;
        SpriteWidget stackIn_37_0 = null;
        String stackIn_38_1 = null;
        SpriteWidget stackIn_41_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        SocialListEntry stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        SocialListEntry var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        PlayerContextMenu var17 = null;
        String var18 = null;
        int var19 = 0;
        PlayerContextMenu var17Lifetime1;
        String var18Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 >= -6) {
            IterableNodeHashTable.showOverlayMessage(true, (String) null, true);
          }
          stackIn_7_0 = EmailValidator.field_q.field_Ib;
          stackIn_7_1 = LobbySortHelpers.field_e + 2;
          stackIn_7_2 = param2;
          stackIn_7_3 = false;
          stackIn_7_4 = 2;
          stackIn_7_5 = param1 * (3 * (LobbySortHelpers.field_e + 2));
          stackIn_8_6 = (EmailValidator.field_q.field_Ib == RasterBuffer.field_d);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((ScrollPane) (Object) stackIn_7_0).updateContentLayout(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_8_6) ? 1 : 0;
          var4 = EmailValidator.field_q.field_Lb.field_W;
          var5 = null;
          if (CachedArchiveSource.field_q == 2) {
            StripedProgressBar.field_E.field_Y = true;
            GuestPlayHelpers.field_e.field_V = MenuScreen.formatIndexedText(new String[]{AudioSetupHelpers.field_a}, FadingModalPanel.field_J, 2);
            EmailValidator.field_q.field_Ib.field_Eb.field_V = null;
            var6 = null;
            var7 = (SocialListEntry) (var4.first((byte) -41));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7))) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_87_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 == 0) {
                if (stackIn_12_0.field_W == null) {
                  var7.field_Eb = new SpriteWidget(0L, FadingModalPanel.field_F);
                  var7.addChild(0, var7.field_Eb);
                  var7.field_Gb = new SpriteWidget(0L, GzipDecompressor.field_d);
                  var7.addChild(0, var7.field_Gb);
                  var7.field_Mb = new SpriteWidget(0L, FadingModalPanel.field_F);
                  var7.addChild(0, var7.field_Mb);
                  var7.field_Gb.field_lb = 2;
                  var8 = 1;
                  var7.markTreeDirty((byte) 42);
                }
                var7.field_K = EmailValidator.field_q.field_Lb.field_K;
                var9 = 0;
                if (var7.field_Pb == null) {
                  var11 = 16737894;
                  var10 = 13369344;
                } else if (var7.field_Pb != AudioSetupHelpers.field_a) {
                  var10 = 13421568;
                  var11 = 16777062;
                } else {
                  var10 = 52224;
                  var11 = 6750054;
                }
                var12 = 0;
                if (null != var7.field_Jb &&
                  !var7.field_Jb.equals("")) {
                  var7.field_Mb.field_ab = var11;
                  var7.field_Mb.normalSprite = RasterSnapshot.displayNameChangedIcon;
                  var7.field_Mb.setGeometry(0, LobbySortHelpers.field_e, RasterSnapshot.displayNameChangedIcon.field_u + 3, (byte) -94, var9);
                  var12 = 1;
                }
                var7.field_Gb.field_bb = var11;
                var7.field_Eb.field_bb = var11;
                var7.field_Gb.field_E = var10;
                var7.field_Eb.field_E = var10;
                var7.field_Gb.field_A = var11;
                var7.field_Eb.field_A = var11;
                var7.field_Gb.field_ab = var11;
                var7.field_Eb.field_ab = var11;
                var13 = 0;
                var14 = var7.field_K - 82;
                if (var12 != 0) {
                  var13 = RasterSnapshot.displayNameChangedIcon.field_u + 3;
                  var14 = var14 - var13;
                }
                stackIn_37_0 = var7.field_Eb;
                if (var14 <= 0) {
                  stackIn_38_1 = var7.field_Hb;
                } else {
                  stackIn_38_1 = BitmapFont.truncateWithEllipsis(var7.field_Eb.field_C, var7.field_Hb, var14);
                }
                stackIn_37_0.field_V = stackIn_38_1;
                var7.field_Eb.setGeometry(var13, LobbySortHelpers.field_e, var14, (byte) -46, var9);
                stackIn_41_0 = var7.field_Gb;
                if (var7.field_Pb == null) {
                  stackIn_42_1 = NodeHashTable.field_a;
                } else {
                  stackIn_42_1 = var7.field_Pb;
                }
                stackIn_41_0.field_V = stackIn_42_1;
                var7.field_Gb.setGeometry(-80 + var7.field_K, LobbySortHelpers.field_e, 80, (byte) -54, var9);
                stackIn_46_0 = (var7.field_Eb.field_V.equals(var7.field_Hb)) ? 0 : 1;
                var15 = stackIn_46_0;
                var9 = var9 + LobbySortHelpers.field_e;
                if (var3_int == 0) {
                  var7.field_kb = -var7.field_ub + var9;
                }
                if (var8 != 0) {
                  EmailValidator.field_q.field_Lb.positionAfter(2, var7, (SpriteWidget) (var6), (byte) 113);
                }
                if (var7.field_Mb != null &&
                  var7.field_Mb.field_S) {
                  QuickChatCategoryCache.field_g = var7.field_Jb;
                } else if (var7.field_nb == 0) {
                  if (var7.field_Eb.field_S &&
                    var15 != 0) {
                    QuickChatCategoryCache.field_g = var7.field_Hb;
                  }
                } else {
                  var16 = var7.field_Hb;
                  ContextMenuHelpers.openContextMenu(-1, EmailValidator.field_q.field_Ib, (int[]) null, (String) null, 0L, var16, -1, var7, 111);
                  if (var7.field_Pb != null &&
                    !DecodedSpriteHelpers.isPrivateChatTarget(IntKeyLookup.field_e.field_g, false) &&
                    !FrameSkin.field_f) {
                    if (!RankingsRequest.field_n) {
                      var17 = IntKeyLookup.field_e;
                      var18 = MenuScreen.formatIndexedText(new String[]{var16}, Js5ArchiveManager.field_d, 2);
                      var17.field_a.addItem(1, var18, 8);
                    }
                    var17Lifetime1 = IntKeyLookup.field_e;
                    var18Lifetime1 = MenuScreen.formatIndexedText(new String[]{var16}, BoundedUrlRequest.field_c, 2);
                    var17Lifetime1.field_a.addItem(1, var18Lifetime1, 18);
                  }
                  var5 = var7;
                }
                var6 = var7;
                var7 = (SocialListEntry) (var4.next(16213));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_87_0 = EmailValidator.field_q.field_Fb;
            }
            if (((SpriteWidget) (stackIn_87_0)).field_nb != 0) {
              LobbyGame.field_Xb = new NameEntryPopup(EmailValidator.field_q.field_Fb.field_Bb, EmailValidator.field_q.field_Fb.field_J, EmailValidator.field_q.field_Fb.field_K, EmailValidator.field_q.field_Fb.field_ub, GzipDecompressor.field_e, InputSetupHelpers.field_f, LinkTextPainter.field_h, LinkTextPainter.field_h);
              AccountDialogHelpers.field_d = 0;
            }
            if (EmailValidator.field_q.field_Mb.field_nb != 0) {
              LobbyGame.field_Xb = new NameEntryPopup(EmailValidator.field_q.field_Mb.field_Bb, EmailValidator.field_q.field_Mb.field_J, EmailValidator.field_q.field_Mb.field_K, EmailValidator.field_q.field_Mb.field_ub, SingleChildWidget.field_D, InputSetupHelpers.field_f, LinkTextPainter.field_h, LinkTextPainter.field_h);
              AccountDialogHelpers.field_d = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            StripedProgressBar.field_E.field_Y = false;
            GuestPlayHelpers.field_e.field_V = QuickChatCategoryCache.field_b;
            if (CachedArchiveSource.field_q != 1) {
              EmailValidator.field_q.field_Ib.field_Eb.field_V = LoginCredentialType.field_e;
              if (var19 != 0) {
                EmailValidator.field_q.field_Ib.field_Eb.field_V = DraggableWidget.field_H;
              }
            } else {
              EmailValidator.field_q.field_Ib.field_Eb.field_V = DraggableWidget.field_H;
            }
            TextEncodingHelpers.resetChildLayouts(16377, EmailValidator.field_q.field_Lb);
          }
          stackIn_102_0 = var5;
          return (SocialListEntry) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "gk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void put(IntrusiveNode param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        IntrusiveNode var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.next) {
            param0.unlink(false);
          }
          if (param1 > -83) {
            return;
          }
          var5 = this.field_h[(int)((long)(-1 + this.field_a) & param2)];
          param0.previous = var5;
          param0.next = var5.next;
          param0.next.previous = param0;
          param0.key = param2;
          param0.previous.next = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("gk.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    IterableNodeHashTable(int param0) {
        IntrusiveNode dupTemp$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        IntrusiveNode var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_a = param0;
          this.field_h = new IntrusiveNode[param0];
          var2_int = 0;
          while (param0 > var2_int) {
            dupTemp$0 = new IntrusiveNode();
            this.field_h[var2_int] = dupTemp$0;
            var3 = dupTemp$0;
            var3.previous = var3;
            var3.next = var3;
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "gk.<init>(" + param0 + ')');
        }
    }

    public final Iterator iterator() {
        NodeHashTableIterator stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = new NodeHashTableIterator(this);
          return (Iterator) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "gk.iterator()");
        }
    }

    final static void showOverlayMessage(boolean param0, String param1, boolean param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          IntrusiveDeque.field_f = param0;
          if (param2) {
            field_c = (byte[][][]) null;
          }
          NameEntryPopup.field_Fb = true;
          ThreeSliceButtonPainter.field_w = new ProgressMessageDialog(QueuedListRequest.field_l, LoginRsaKey.arezzo14BoldFont, param1, ChatPanelSetupHelpers.field_c, IntrusiveDeque.field_f);
          QueuedListRequest.field_l.pushLayer(0, ThreeSliceButtonPainter.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = null;
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
