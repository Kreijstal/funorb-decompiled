/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static String field_c;
    static NineSlicePanelPainter field_a;
    static String field_d;
    static IntrusiveDeque field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = Kickabout.field_G;
        try {
          var6_int = 487 + (param3 + (8 + param5) + 8);
          uf.field_b.setBounds(true, -6 + var6_int, 3, 3, -6 + GrayscalePaletteSupport.field_a.field_mb);
          var7 = -5 + uf.field_b.field_mb;
          if (param0 != -24823) {
            field_c = (String) null;
          }
          DebugConsole.field_z.setBounds(true, param3 + 485 - (-2 - param5), 5, -param4 + var7, param4);
          RotaryDialPainter.field_b.setBounds(true, -param3 + DebugConsole.field_z.field_q - WeightedCacheEntry.field_s.field_q, param3, 0, param4);
          WeightedCacheEntry.field_s.setBounds(true, WeightedCacheEntry.field_s.field_q, RotaryDialPainter.field_b.field_q + param3, 0, param4);
          var7 = var7 - (param4 + 2);
          AuctionSettingsDialog.field_G.setLayout(2, 110, var7 - 5, 5, 5, 485 + (param3 - (-2 - param5)), param5);
          if (null != PlayArea.field_a) {
            PlayArea.field_a.setBounds(AuctionSettingsDialog.field_G.field_mb, param0 ^ -24824, AuctionSettingsDialog.field_G.field_s, AuctionSettingsDialog.field_G.field_q, AuctionSettingsDialog.field_G.field_J);
          }
          var8 = -var6_int + (-param3 + GrayscalePaletteSupport.field_a.field_q);
          var9 = var8 / 2;
          var10 = param1 + var9 + param3;
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (var12 >= 5 ||
              null != ValidatedTextWidget.field_W[var12]) {
              var13 = (GrayscalePaletteSupport.field_a.field_mb - 4) * var11 / (1 + MatchPhaseView.field_e) + 3;
              var11++;
              var7Lifetime1 = -var13 + (var11 * (-4 + GrayscalePaletteSupport.field_a.field_mb) / (MatchPhaseView.field_e + 1) + 3 - 2);
              if (var12 >= 5) {
                ChatInputState.field_a.setBounds(true, var8, var6_int, var13, var7Lifetime1);
              } else {
                ValidatedTextWidget.field_W[var12].setBounds(true, var8, var6_int, var13, var7Lifetime1);
                BlackFadeScreen.field_m[var12].setBounds(true, -param3 + var9, param3, 0, var7Lifetime1);
                SocketConnector.field_b[var12].setBounds(true, param1, var9, param2, -param2 + (var7Lifetime1 - param2));
                ModelMaterialDecoder.field_a[var12].setBounds(true, -var10 - param3 + var8, var10, param2, -param2 - param2 + var7Lifetime1);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var6), "qn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 30 / ((-84 - param0) / 38);
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_d = "Rated game";
        field_c = "bank";
    }
}
