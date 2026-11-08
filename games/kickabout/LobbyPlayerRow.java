/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayerRow extends UiLayoutNode {
    int field_Sb;
    static String field_Kb;
    static ValidationState field_yb;
    UiLayoutNode field_Hb;
    boolean field_Gb;
    static String field_Ub;
    String field_Rb;
    long field_Ab;
    String field_Nb;
    int field_Qb;
    UiLayoutNode field_zb;
    static String field_Eb;
    int field_Mb;
    boolean field_Fb;
    long field_Ib;
    UiLayoutNode field_Tb;
    UiLayoutNode field_Lb;
    boolean field_Cb;
    int field_Db;
    UiLayoutNode field_Ob;
    int field_Jb;
    int field_Pb;
    static String field_Bb;

    public static void releaseStatics(int param0) {
        field_yb = null;
        field_Bb = null;
        field_Eb = null;
        if (param0 != 240) {
          field_Bb = (String) null;
        }
        field_Kb = null;
        field_Ub = null;
    }

    final static int sumInts(byte param0, int[] param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          var3_ref_int__ = param1;
          for (var4 = 0; var4 < var3_ref_int__.length; var4++) {
            var5 = var3_ref_int__[var4];
            var2_int = var2_int + var5;
          }
          var3 = -10 / ((param0 - 40) / 37);
          stackIn_5_0 = var2_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean precedes(LobbyPlayerRow param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this.field_Fb;
          if (param0.field_Fb) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_6_0 = this.field_Fb;
            return stackIn_6_0;
          }
          stackIn_10_0 = (this.field_Gb) ? 0 : 1;
          if (stackIn_10_0 == (param0.field_Gb ? 1 : 0)) {
            stackIn_13_0 = this.field_Gb;
            return stackIn_13_0;
          }
          if (param1 == -82) {
            stackIn_20_0 = !(this.field_Ib >= param0.field_Ib);
            return stackIn_20_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("he.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String getCurrentAccountNameText(int param0) {
        if (PlayerModelPreview.field_f == ClubStateFactory.field_f) {
          return AccountInputValidationResult.field_a;
        }
        if (param0 != 320) {
          PcmSampleStream var2 = (PcmSampleStream) null;
          LobbyPlayerRow.removeSoundSubstream((PcmSampleStream) null, false);
        }
        if (!DualLinkDequeIterator.field_e.isComplete((byte) -80)) {
          return DualLinkDequeIterator.field_e.getQuery(3);
        }
        if (PitchAppearanceSupport.field_a == PlayerModelPreview.field_f) {
          return DualLinkDequeIterator.field_e.getQuery(param0 ^ 323);
        }
        return TutorialMessages.field_b;
    }

    final static void updateTeammateMarkerIntersections(int param0) {
        int var5 = 0;
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        OffscreenPlayerArrow[] var4 = null;
        OffscreenPlayerArrow var6 = null;
        int var7 = 0;
        int var9 = 0;
        RenderedFootballer var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var9 = Kickabout.field_G;
        try {
          if (null != AuctionPriceLimits.field_a &&
            IntrusiveDequeCursor.field_b.participantStatus[TrinketShopDialog.field_G].isActive(3511)) {
            var10 = (RenderedFootballer) (IntrusiveDequeCursor.field_b.getControlledFootballer((byte) -76, TrinketShopDialog.field_G));
            var2 = SocialListLayoutSupport.worldToScreenX(param0, var10.field_kb >> 16);
            var3 = IntKeyLookup.projectPitchY((byte) -119, var10.field_bb >> 16);
            if (!TextHotspotWidget.intersectsPlayerViewport(var2, var3, param0 ^ 480)) {
              var2 = 320;
              var3 = 240;
            }
            var4 = AuctionPriceLimits.field_a;
            for (var5 = 0; var5 < var4.length; var5++) {
              var6 = var4[var5];
              var7 = -1;
              for (var8 = 0; IntrusiveDequeCursor.field_b.playerCount > var8; var8++) {
                if (IntrusiveDequeCursor.field_b.field_g[TrinketShopDialog.field_G].team == IntrusiveDequeCursor.field_b.field_g[var8].team &&
                  var6.field_h == IntrusiveDequeCursor.field_b.participantStatus[var8].controlledSlot) {
                  var7 = var8;
                }
                var6.updateScreenIntersection(var2, var3, var7, -113);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "he.F(" + param0 + ')');
        }
    }

    LobbyPlayerRow(String param0, String param1, long param2) {
        super(0L, (UiLayoutNode) null);
        CharSequence var6 = null;
        try {
          this.field_Ab = param2;
          this.field_Rb = param0;
          this.field_Nb = param1;
          var6 = (CharSequence) ((Object) this.field_Rb);
          MatchAgent.normalizeAccountName(0, var6);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean isDetachedFromPlayerTable(int param0) {
        if (param0 != -13356) {
          this.field_Db = -100;
        }
        return !this.isSecondaryLinked((byte) -60) ? true : false;
    }

    final static FadingSoundPlayer createFadingSoundPlayer(int param0, boolean param1, int param2, int param3, int param4) {
        if (param2 != 240) {
          field_Ub = (String) null;
        }
        return ArrayWidgetContainer.createFadingSoundPlayer(param3, TextInputWidget.field_O[param4], DualLinkHashTable.field_e ? !param1 ? true : false : param1, param4, param0, -121);
    }

    final static void removeSoundSubstream(PcmSampleStream param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != TextFieldNode.field_Bb) {
            TextFieldNode.field_Bb.removeSubstream(param0);
          }
          if (!param1) {
            LobbyPlayerRow.updateTeammateMarkerIntersections(10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setNames(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        this.field_Rb = param2;
        if (param0 != -2) {
          return;
        }
        try {
          this.field_Nb = param1;
          var5 = (CharSequence) ((Object) this.field_Rb);
          MatchAgent.normalizeAccountName(param0 ^ -2, var5);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "he.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Ub = "home";
        field_Kb = "Visit the Account Management section on the main site to view.";
        field_Eb = "Bid";
        field_Bb = "MANAGEMENT";
        field_yb = new ValidationState();
    }
}
