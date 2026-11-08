/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends SpriteWidget {
    static String textError;
    static Sprite[] frameTopSprites;
    static IntrusiveDeque field_Mb;
    private SpriteWidget field_Fb;
    private SpriteWidget field_Jb;
    static String field_Hb;
    private SpriteWidget field_Nb;
    private SpriteWidget field_Eb;
    private int field_Ib;
    private SpriteWidget field_Lb;
    static String field_Gb;
    private SpriteWidget field_Pb;

    final boolean pollLineDown(int param0) {
        if (this.field_Nb.field_nb != 0) {
          this.field_Ib = 20;
          return true;
        }
        if (~this.field_Nb.field_w != param0) {
          if (this.field_Ib > 0) {
            this.field_Ib = this.field_Ib - 1;
          }
          if (this.field_Ib == 0) {
            this.field_Ib = 3;
            return true;
          }
        }
        return false;
    }

    final boolean pollLineUp(byte param0) {
        if (0 != this.field_Fb.field_nb) {
          this.field_Ib = 20;
          return true;
        }
        if (this.field_Fb.field_w != 0) {
          if (this.field_Ib > 0) {
            this.field_Ib = this.field_Ib - 1;
          }
          if (this.field_Ib == 0) {
            this.field_Ib = 3;
            return true;
          }
        }
        if (param0 > -45) {
          this.getDraggedScrollOffset((byte) 125, 17, true, -125);
          return false;
        }
        return false;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_F = param4;
        this.field_ub = param1;
        this.field_K = param6;
        this.field_tb = param5;
        this.layoutScrollbar(param2, param3, param7, -1);
        if (param0 != 0) {
          this.getDraggedScrollOffset((byte) -78, -45, true, -23);
        }
    }

    final static boolean isGuestSession(int param0) {
        if (param0 != 20) {
          return true;
        }
        return MenuScreen.field_d;
    }

    VerticalScrollbar(long param0, SpriteWidget param1, SpriteWidget param2, SpriteWidget param3, SpriteWidget param4) {
        super(param0, (SpriteWidget) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        SpriteWidget var9 = null;
        SpriteWidget var10 = null;
        try {
          this.field_Fb = new SpriteWidget(0L, param1);
          this.field_Nb = new SpriteWidget(0L, param2);
          this.addChild(0, this.field_Fb);
          this.addChild(0, this.field_Nb);
          this.field_Eb = new SpriteWidget(0L, (SpriteWidget) null);
          this.addChild(0, this.field_Eb);
          this.field_Lb = new SpriteWidget(0L, param3);
          this.field_Jb = new SpriteWidget(0L, param3);
          var9 = this.field_Lb;
          var10 = var9;
          this.field_Jb.field_ib = true;
          var10.field_ib = true;
          this.field_Eb.addChild(0, this.field_Lb);
          this.field_Eb.addChild(0, this.field_Jb);
          this.field_Pb = new SpriteWidget(0L, param4);
          this.field_Pb.field_X = true;
          this.field_Eb.addChild(0, this.field_Pb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("qm.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean pollPageDown(byte param0) {
        if (this.field_Jb.field_nb != 0) {
          this.field_Ib = 20;
          return true;
        }
        if (this.field_Jb.field_w != 0) {
          if (this.field_Ib > 0) {
            this.field_Ib = this.field_Ib - 1;
          }
          if (0 == this.field_Ib &&
            !(IconTextComponent.field_Jb < this.field_Pb.field_kb + this.field_Pb.field_ub + this.field_Pb.field_J + this.field_Pb.field_Cb)) {
            this.field_Ib = 3;
            return true;
          }
        }
        int var2 = -106 % ((82 - param0) / 37);
        return false;
    }

    public static void releaseStatics(int param0) {
        field_Gb = null;
        field_Hb = null;
        if (param0 < 103) {
          field_Gb = (String) null;
        }
        textError = null;
        frameTopSprites = null;
        field_Mb = null;
    }

    final static void openPrivateChatTo(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          if (param0 >= -6) {
            VerticalScrollbar.openPrivateChatTo(-58, (String) null, -100L);
          }
          ArchiveFactoryHelpers.field_d = param1;
          ChatFilterHelpers.field_e = 2;
          var5 = (CharSequence) ((Object) param1);
          TabbedPanel.field_Gb = DisplayNameHelpers.normalizeDisplayName(var5, true);
          PendingScoreQuery.field_n = param2;
          PatchNoteUsage.openRootQuickChatMenu(0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void updateIgnoreList(int param0, boolean param1, byte param2) {
        ScrollPane stackIn_5_0;
        int stackIn_5_1;
        boolean stackIn_5_2;
        boolean stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        boolean stackIn_6_6 = false;
        SpriteWidget stackIn_21_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
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
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 < 111) {
            textError = (String) null;
          }
          stackIn_5_0 = SharedTextGlobals.field_a.field_Ib;
          stackIn_5_1 = 2 + LobbySortHelpers.field_e;
          stackIn_5_2 = param1;
          stackIn_5_3 = false;
          stackIn_5_4 = 2;
          stackIn_5_5 = param0 * (6 + 3 * LobbySortHelpers.field_e);
          stackIn_6_6 = (RasterBuffer.field_d == SharedTextGlobals.field_a.field_Ib);
          var3_int = ((ScrollPane) (Object) stackIn_5_0).updateContentLayout(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_6_6) ? 1 : 0;
          var4 = SharedTextGlobals.field_a.field_Lb.field_W;
          if (CachedArchiveSource.field_q != 2 &&
            1 != CachedArchiveSource.field_q) {
            SharedTextGlobals.field_a.field_Y = false;
            SharedTextGlobals.field_a.field_Ib.field_Eb.field_V = LoginCredentialType.field_e;
            TextEncodingHelpers.resetChildLayouts(16377, SharedTextGlobals.field_a.field_Lb);
            return;
          }
          SharedTextGlobals.field_a.field_Y = true;
          SharedTextGlobals.field_a.field_Ib.field_Eb.field_V = null;
          var5 = null;
          var6 = (SocialListEntry) (var4.first((byte) -108));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_W) {
              var6.field_Eb = new SpriteWidget(0L, FadingModalPanel.field_F);
              var6.addChild(0, var6.field_Eb);
              var6.field_Mb = new SpriteWidget(0L, FadingModalPanel.field_F);
              var6.addChild(0, var6.field_Mb);
              var6.markTreeDirty((byte) 42);
              var7 = 1;
            }
            var6.field_K = SharedTextGlobals.field_a.field_Lb.field_K;
            var6.field_Eb.setGeometry(0, LobbySortHelpers.field_e, var6.field_K, (byte) -56, 0);
            var8 = 0;
            if (var6.field_Jb != null &&
              !var6.field_Jb.equals("")) {
              var6.field_Mb.normalSprite = RasterSnapshot.displayNameChangedIcon;
              var6.field_Mb.field_ab = 16737894;
              var8 = 1;
              var6.field_Mb.setGeometry(0, LobbySortHelpers.field_e, RasterSnapshot.displayNameChangedIcon.field_u + 3, (byte) -60, 0);
            }
            var9 = 0;
            var10 = var6.field_K;
            if (var8 != 0) {
              var9 = RasterSnapshot.displayNameChangedIcon.field_u + 3;
              var10 = var10 - var9;
            }
            stackIn_21_0 = var6.field_Eb;
            if (var10 <= 0) {
              stackIn_22_1 = var6.field_Hb;
            } else {
              stackIn_22_1 = BitmapFont.truncateWithEllipsis(var6.field_Eb.field_C, var6.field_Hb, var10);
            }
            stackIn_21_0.field_V = stackIn_22_1;
            stackIn_25_0 = (var6.field_Eb.field_V.equals(var6.field_Hb)) ? 0 : 1;
            var11 = stackIn_25_0;
            var6.field_Eb.setGeometry(var9, LobbySortHelpers.field_e, var10, (byte) -111, 0);
            if (var3_int == 0) {
              var6.field_kb = LobbySortHelpers.field_e - var6.field_ub;
            }
            if (var7 != 0) {
              SharedTextGlobals.field_a.field_Lb.positionAfter(2, var6, (SpriteWidget) (var5), (byte) 109);
            }
            if (null != var6.field_Mb &&
              var6.field_Mb.field_S) {
              QuickChatCategoryCache.field_g = var6.field_Jb;
            } else {
              if (var6.field_Eb.field_S &&
                var11 != 0) {
                QuickChatCategoryCache.field_g = var6.field_Hb;
              }
            }
            if (0 != var6.field_nb) {
              ContextMenuHelpers.openContextMenu(-1, SharedTextGlobals.field_a.field_Ib, (int[]) null, var6.field_Hb, 0L, var6.field_Ob, -1, var6, 104);
              var16 = IntKeyLookup.field_e;
              var13_ref_String = PasswordFieldPainter.field_A;
              var16.field_a.addItem(1, var13_ref_String, 7);
              var17 = IntKeyLookup.field_e;
              var13 = HuffmanCodec.field_b;
              var14 = PasswordFieldPainter.field_y;
              var17.field_a.openAt(0, 0, 0, var13, var14);
            }
            var5 = var6;
            var6 = (SocialListEntry) (var4.next(16213));
          }
          if (SharedTextGlobals.field_a.field_Fb.field_nb != 0) {
            LobbyGame.field_Xb = new NameEntryPopup(SharedTextGlobals.field_a.field_Fb.field_Bb, SharedTextGlobals.field_a.field_Fb.field_J, SharedTextGlobals.field_a.field_Fb.field_K, SharedTextGlobals.field_a.field_Fb.field_ub, TextDecodeHelpers.field_c, InputSetupHelpers.field_f, LinkTextPainter.field_h, LinkTextPainter.field_h);
            AccountDialogHelpers.field_d = 2;
          }
          if (0 == SharedTextGlobals.field_a.field_Mb.field_nb) {
            return;
          }
          LobbyGame.field_Xb = new NameEntryPopup(SharedTextGlobals.field_a.field_Mb.field_Bb, SharedTextGlobals.field_a.field_Mb.field_J, SharedTextGlobals.field_a.field_Mb.field_K, SharedTextGlobals.field_a.field_Mb.field_ub, TypeCode.field_f, InputSetupHelpers.field_f, LinkTextPainter.field_h, LinkTextPainter.field_h);
          AccountDialogHelpers.field_d = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "qm.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean isThumbHeld(byte param0) {
        if (param0 < 52) {
          this.pollLineDown(51);
        }
        return this.field_Pb.field_w != 0 ? true : false;
    }

    final boolean pollPageUp(int param0) {
        if (this.field_Lb.field_nb != 0) {
          this.field_Ib = 20;
          return true;
        }
        if (this.field_Lb.field_w != 0) {
          if (this.field_Ib > 0) {
            this.field_Ib = this.field_Ib - 1;
          }
          if (this.field_Ib == 0 &&
            this.field_Pb.field_J + this.field_Pb.field_Cb > IconTextComponent.field_Jb) {
            this.field_Ib = 3;
            return true;
          }
        }
        if (param0 > -40) {
          this.pollPageUp(-44);
          return false;
        }
        return false;
    }

    final void layoutScrollbar(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        if (this.field_ub < this.field_K * 2) {
          var6 = this.field_ub / 2;
          var5 = this.field_ub / 2;
        } else {
          var6 = -this.field_K + this.field_ub;
          var5 = this.field_K;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (0 < param0) {
          var8 = var8 * param2 / param0;
          if (var8 < this.field_K) {
            var8 = this.field_K;
          }
          if (var7 < var8) {
            var8 = var7;
          }
        }
        int var9 = -param2 + param0;
        int var10 = var7 - var8;
        int var11 = 0;
        if (0 < var9) {
          var11 = (var9 / 2 + param1 * var10) / var9;
        }
        int var12 = var8 / 2 + var11;
        SpriteWidget var14 = this.field_Fb;
        var14.field_tb = 0;
        var14.field_F = 0;
        var14.field_ub = var5;
        var14.field_K = this.field_K;
        SpriteWidget var15 = this.field_Nb;
        var15.field_K = this.field_K;
        var15.field_ub = -var6 + this.field_ub;
        var15.field_F = var6;
        var15.field_tb = 0;
        SpriteWidget var16 = this.field_Eb;
        var16.field_tb = 0;
        var16.field_F = var5;
        var16.field_K = this.field_K;
        if (param3 != -1) {
          return;
        }
        var16.field_ub = var7;
        SpriteWidget var17 = this.field_Lb;
        var17.field_K = this.field_K;
        var17.field_F = 0;
        var17.field_tb = 0;
        var17.field_ub = var12;
        SpriteWidget var18 = this.field_Jb;
        var18.field_tb = 0;
        var18.field_K = this.field_K;
        var18.field_ub = -var12 + var7;
        var18.field_F = var12;
        SpriteWidget var19 = this.field_Pb;
        this.field_Eb.field_Y = param2 < param0 ? true : false;
        this.field_Nb.field_Y = param2 < param0 ? true : false;
        this.field_Fb.field_Y = param2 < param0 ? true : false;
        var19.field_F = var11;
        var19.field_ub = var8;
        var19.field_K = this.field_K;
        var19.field_tb = 0;
    }

    final int getDraggedScrollOffset(byte param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        if (param0 != 61) {
          this.pollLineDown(-35);
        }
        var6 = this.field_Eb.field_ub - this.field_Pb.field_ub;
        if (var6 > 0) {
          var7 = this.field_Pb.field_F;
          var8 = param3 - param1;
          var5 = (var8 * var7 + var6 / 2) / var6;
        }
        if (param2) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (-param1 + param3 < var5) {
            var5 = -param1 + param3;
          }
        } else {
          if (var5 > -param1 + param3) {
            var5 = -param1 + param3;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        }
        return var5;
    }

    VerticalScrollbar(long param0, VerticalScrollbar param1) {
        this(param0, param1.field_Fb, param1.field_Nb, param1.field_Lb, param1.field_Pb);
    }

    static {
        textError = "Error";
        field_Gb = "Show players in <%0>'s game";
        field_Hb = "Invite <%0> to this game";
    }
}
