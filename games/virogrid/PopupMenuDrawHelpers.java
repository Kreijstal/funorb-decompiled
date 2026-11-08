/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupMenuDrawHelpers {
    static MusicTrack field_b;
    static int field_d;
    static SpriteWidget field_e;
    static int field_f;
    static String field_a;
    static DisplayNameForm field_c;

    final static void drawPopupMenuItems(int param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        boolean stackIn_40_1 = false;
        FrameSkin stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        FrameSkin var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = FullscreenState.field_a;
          if (param0 != -5205) {
            PopupMenuDrawHelpers.releaseStatics(87);
          }
          var2 = 0;
          if (2 == IntrusiveDeque.field_d) {
            var3_long = -AccountCreationSupport.field_e + ClockAndTextHelpers.monotonicMillis(param0 - 4781);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < DrawOfferMenuHelpers.field_c.length; var3++) {
            var4 = FrameSkin.field_h[var3];
            if (0 > var4) {
              var5 = IconLabelWidget.field_Kb;
            } else {
              if (var4 == LoginMethod.field_k.field_d) {
                var5 = AccountChoicePanel.field_E;
              } else {
                var5 = LinkTextPainter.field_b;
              }
            }
            var6 = DrawOfferMenuHelpers.field_c[var3];
            if (2 == IntrusiveDeque.field_d &&
              var2 == 1) {
              if (RankingsRequest.field_o.length <= MarkerSliderPainter.field_d.length) {
                stackIn_18_0 = MarkerSliderPainter.field_d.length;
              } else {
                stackIn_18_0 = RankingsRequest.field_o.length;
              }
              var7 = stackIn_18_0;
              if (var3 >= 6 &&
                var3 < var7 + 6) {
                if (-6 + (var3 + MarkerSliderPainter.field_d.length) - var7 >= 0) {
                  stackIn_24_0 = MarkerSliderPainter.field_d[var3 - (6 - (MarkerSliderPainter.field_d.length - var7))];
                } else {
                  stackIn_24_0 = "";
                }
                var6 = stackIn_24_0;
              }
              if (LoginDialog.field_rb.length <= Js5Archive.field_j.length) {
                stackIn_28_0 = Js5Archive.field_j.length;
              } else {
                stackIn_28_0 = LoginDialog.field_rb.length;
              }
              var8 = stackIn_28_0;
              if (var3 >= 7 + var7 &&
                var3 < var8 + (7 + var7)) {
                if (-7 + (var3 - var7) < Js5Archive.field_j.length) {
                  stackIn_33_0 = Js5Archive.field_j[var3 - 7 - var7];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_39_0 = 1492912648;
            stackIn_40_1 = !(var4 < 0);
            var7Lifetime1 = SectorCacheStore.measureText(stackIn_39_0, stackIn_40_1, var6);
            var8Lifetime1 = PendingHighscoreRequest.field_q - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (LoginMethod.field_k.field_d != var4) {
                stackIn_44_0 = RasterSnapshot.field_l;
              } else {
                stackIn_44_0 = LoginCredentialType.field_g;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + BitwiseHelpers.field_d;
              if (var9 != null) {
                var9.drawFrame(var8Lifetime1 - Js5Archive.field_d, (DelayedPacket.field_j << 1) + DebouncedValidator.field_c, false, var7Lifetime1 + (Js5Archive.field_d << 1), var1_int);
              }
              var1_int = var1_int + DelayedPacket.field_j;
            }
            if (0 > var4) {
              NodeHashTableIterator.field_h.drawLeft(var6, var8Lifetime1, var1_int + LoadingProgressDialog.field_bb, var5, -1);
              var1_int = var1_int + LongAndTextLoginPayload.field_m;
            } else {
              LinkTextPainter.field_g.drawLeft(var6, var8Lifetime1, var1_int + DelegatingCanvas.field_e, var5, -1);
              var1_int = var1_int + (DelayedPacket.field_j - (-BitwiseHelpers.field_d - DebouncedValidator.field_c));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "qi.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 25651) {
          PopupMenuDrawHelpers.releaseStatics(-53);
        }
        field_e = null;
    }

    static {
        field_a = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
