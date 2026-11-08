/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends UiLayoutNode {
    private int field_Cb;
    static String field_Ib;
    private int field_Hb;
    private UiLayoutNode field_Lb;
    private UiLayoutNode field_Nb;
    private int field_Fb;
    static Sprite field_zb;
    private int[] field_Kb;
    private int field_Ab;
    private Sprite[] field_Ob;
    static char[] field_yb;
    static String field_Db;
    private int field_Eb;
    static String field_Jb;
    private int field_Gb;
    private ContextMenuItem[] field_Bb;
    private int field_Mb;

    final static void setMusicFadeOutStep(int param0, byte param1, int param2) {
        if (param1 != 60) {
          return;
        }
        LoadingProgressSupport.field_d.field_n[param0] = -param2;
    }

    final static boolean isAccountNameCheckPending(int param0) {
        if (param0 != -20010) {
          field_Ib = (String) null;
        }
        return PitchAppearanceSupport.field_a == PlayerModelPreview.field_f ? true : false;
    }

    final int getSelectedActionId(byte param0, boolean param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = Kickabout.field_G;
        this.updateInput(0, param1);
        if (!param1) {
          return -2;
        }
        var3 = 109 % ((param0 + 76) / 43);
        for (var4 = 0; var4 < this.field_Ab; var4++) {
          if (0 != this.field_Bb[var4].field_sb) {
            return this.field_Kb[var4];
          }
        }
        if (0 == WidgetContainer.field_A) {
          return this.field_Gb;
        }
        return -1;
    }

    final void layoutItems(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        int var9;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        if (0 == this.field_Ab) {
          this.field_Bb[this.field_Ab] = new ContextMenuItem(0L, (UiLayoutNode) null, (UiLayoutNode) null, this.field_Nb, (Sprite) null, TextInputWidget.field_M);
          this.field_Bb[this.field_Ab].field_p = 1;
          this.addChild((byte) -111, (UiLayoutNode) (this.field_Bb[this.field_Ab]));
          this.field_Kb[this.field_Ab] = -1;
          this.field_Ab = this.field_Ab + 1;
        }
        var6 = 0;
        for (var7 = 0; var7 < this.field_Ab; var7++) {
          var8 = this.field_Bb[var7].measureWidthWithPadding(this.field_Eb, 0, this.field_Hb);
          if (var8 > var6) {
            var6 = var8;
          }
        }
        var6 = var6 + 2 * this.field_Mb;
        var7Lifetime1 = this.field_Fb + this.field_Ab * this.field_Cb + this.field_Fb;
        var8Lifetime1 = StripedProgressBar.choosePopupX(var6, param2, param1, param0 ^ 127);
        var9 = MonotonicClock.placePopupVertically(param3, param4, var7Lifetime1, 29079);
        this.setBounds(true, var6, var8Lifetime1, var9, var7Lifetime1);
        for (var10 = param0; var10 < this.field_Ab; var10++) {
          this.field_Bb[var10].setBoundsAndLayout(this.field_Eb, this.field_Hb, -(this.field_Mb * 2) + var6, this.field_Cb * var10 + this.field_Fb, this.field_Mb, 15114, this.field_Cb);
        }
    }

    final void addItem(int param0, int param1, String param2) {
        try {
          this.field_Bb[this.field_Ab] = new ContextMenuItem((long)param0, (UiLayoutNode) null, (UiLayoutNode) null, this.field_Lb, (Sprite) null, param2);
          this.field_Bb[this.field_Ab].field_S = this.field_Ob;
          this.field_Bb[this.field_Ab].field_ob = true;
          this.field_Bb[this.field_Ab].field_p = 1;
          this.addChild((byte) -115, (UiLayoutNode) (this.field_Bb[this.field_Ab]));
          this.field_Kb[this.field_Ab] = param1;
          this.field_Ab = this.field_Ab + 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gu.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean consumeSelection(int param0) {
        if (this.field_Gb != param0) {
          return false;
        }
        if (FixedQuaternion.field_e != 13) {
          return true;
        }
        this.field_Gb = -1;
        return true;
    }

    final static ResourceArchive createResourceArchive(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param4 <= 107) {
          return (ResourceArchive) null;
        }
        return SetLagCommand.createResourceArchive(param1, (byte) 112, param2, param0, false, param3);
    }

    final void addItemWithIcon(String param0, boolean param1, int param2, Sprite param3) {
        try {
          this.field_Bb[this.field_Ab] = new ContextMenuItem(0L, (UiLayoutNode) null, (UiLayoutNode) null, this.field_Lb, param3, param0);
          this.field_Bb[this.field_Ab].field_S = this.field_Ob;
          this.field_Bb[this.field_Ab].field_ob = param1 ? true : false;
          this.field_Bb[this.field_Ab].field_p = 1;
          this.addChild((byte) -117, (UiLayoutNode) (this.field_Bb[this.field_Ab]));
          this.field_Kb[this.field_Ab] = param2;
          this.field_Ab = this.field_Ab + 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gu.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ContextMenu(ContextMenu param0) {
        this(param0, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Mb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Cb);
    }

    final static void enqueueAuctionListingDialog(byte param0, AuctionListing param1, boolean param2) {
        PopupDialog var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Kickabout.field_G;
        try {
          var3 = (PopupDialog) (ScrollPane.field_Jb.first(24009));
          while (var3 != null) {
            if (var3 instanceof AuctionListingDialog &&
              ((AuctionListingDialog) (var3)).field_J.isSameListing(param1, param0 ^ -5275)) {
              return;
            }
            var3 = (PopupDialog) (ScrollPane.field_Jb.next(33));
          }
          ScrollPane.field_Jb.addLast(new AuctionListingDialog(param1, param2), 3);
          if (param0 != -25) {
            ContextMenu.setMusicFadeOutStep(-42, (byte) 4, 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("gu.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 13) {
          return;
        }
        field_zb = null;
        field_Jb = null;
        field_Ib = null;
        field_yb = null;
        field_Db = null;
    }

    final static void sendGameWithdrawalRequest(int param0, byte param1, int param2) {
        if (param1 > -75) {
          field_yb = (char[]) null;
        }
        CipherPacketBuffer var3 = FootballerAiOverlaySupport.field_d;
        var3.writeIsaacByte(param2, (byte) -76);
        var3.writeByte(111, 3);
        var3.writeByte(125, 9);
        var3.writeShort(-1207444472, param0);
    }

    ContextMenu(UiLayoutNode param0, Sprite[] param1, UiLayoutNode param2, UiLayoutNode param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Kb = new int[256];
        this.field_Bb = new ContextMenuItem[256];
        this.field_Gb = -2;
        try {
          this.field_Lb = param3;
          this.field_Nb = param2;
          this.field_Fb = param7;
          this.field_Hb = param5;
          this.field_Cb = param8;
          this.field_Eb = param6;
          this.field_Ob = param1;
          this.field_Mb = param4;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_Ib = "scroll up";
        field_Jb = null;
        field_yb = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_Db = "Click a player on the left to view.";
    }
}
