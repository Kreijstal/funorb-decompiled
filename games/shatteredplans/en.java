/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static String field_d;
    static int field_c;
    static int field_a;
    static int[] field_b;
    static String field_e;

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        AnimatedPanel dupTemp$0 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        AnimatedPanel stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_59_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        AnimatedPanel var7_ref_qr = null;
        int var7 = 0;
        int var8 = 0;
        AnimatedPanel var8_ref_qr = null;
        sg var9_ref_sg = null;
        int var9 = 0;
        int var10 = 0;
        sg var10_ref_sg = null;
        int var12 = 0;
        int var13 = 0;
        AnimatedPanel var14 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          kh.field_Mb = SoftwareRasterizer.field_b;
          TertiaryNodeList.field_c = SoftwareRasterizer.field_k;
          stackIn_3_0 = 22353;
          if (!param1) {
            stackIn_4_1 = PrivateChatMessage.field_k;
          } else {
            stackIn_4_1 = Archive.field_b;
          }
          TextLayout.a(stackIn_3_0, stackIn_4_1);
          n.field_h.a(0, -42 + am.field_xb.field_mb, (byte) 95, am.field_xb.field_K, 0);
          DefendTask.field_x.setTarget(so.field_t.field_K, cr.field_c, (byte) 107, 0, 0);
          stackIn_6_0 = lr.field_a;
          stackIn_6_1 = so.field_t.field_K;
          if (AccountStatusDialog.field_pb) {
            stackIn_7_2 = 4 + (UnderageAccountInfoPanel.field_K + 40);
          } else {
            stackIn_7_2 = 0;
          }
          ((AnimatedPanel) (Object) stackIn_6_0).setTarget(stackIn_6_1 - stackIn_7_2, 18, (byte) 57, cr.field_c + 2, 0);
          if (param0 != 15471) {
            return;
          }
          MenuComponent.field_q.setTarget(42 + UnderageAccountInfoPanel.field_K, 18, (byte) 84, cr.field_c + 2, -40 + (so.field_t.field_K - UnderageAccountInfoPanel.field_K) - 2);
          ro.field_a.a(so.field_t.field_K, 22 + cr.field_c, 0, 2, -128, -cr.field_c + (so.field_t.field_mb - 2) - 20, UnderageAccountInfoPanel.field_K);
          DialPainter.field_g.setTarget(am.field_xb.field_K, 40, (byte) 107, -40 + am.field_xb.field_mb, 0);
          ArchiveSourceManager.field_f.setTarget(IntrusiveDeque.field_g.field_K, 30, (byte) 44, 0, 0);
          NameSuggestionsPanel.field_D.setTarget(IntrusiveDeque.field_g.field_K, -42 + (IntrusiveDeque.field_g.field_mb - 30), (byte) 125, 30, 0);
          var2_int = 3 + ProductionContent.field_k;
          if (nl.field_a.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = (-20 + (NameSuggestionsPanel.field_D.field_mb + (2 + (var2_int + 1) / 2))) / (var2_int + 1) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -(var2_int * (var3 + 2)) - 5 + (NameSuggestionsPanel.field_D.field_mb - 5);
          if (var4 > 40) {
            var4 = 40;
          }
          StarAnnotation.field_l.setTarget(NameSuggestionsPanel.field_D.field_K - 5 - 5, var4, (byte) 83, 5, 5);
          var5 = 2 + var4 + 5;
          for (var6 = 0; ProductionContent.field_k + 4 > var6; var6++) {
            if ((var6 != 1 ||
              !(nl.field_a.length < 2)) && (3 != var6 ||
              !(FleetMove.field_A <= 1))) {
              if (!param1 &&
                var6 == 3) {
                var7_ref_qr = QuickChatCategoryRegistry.field_g[var6];
                QuickChatCategoryRegistry.field_g[var6].field_mb = 0;
                var7_ref_qr.field_K = 0;
                for (var8 = 0; var8 < ByteArrayNode.field_p[var6].length; var8++) {
                  if (ByteArrayNode.field_p[var6][var8] != null) {
                    var9_ref_sg = ByteArrayNode.field_p[var6][var8];
                    ByteArrayNode.field_p[var6][var8].field_mb = 0;
                    var9_ref_sg.field_K = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                dupTemp$0 = QuickChatCategoryRegistry.field_g[var6];
                var14 = dupTemp$0;
                var7_ref_qr = dupTemp$0;
                QuickChatCategoryRegistry.field_g[var6].field_mb = 0;
                var14.field_K = 0;
                for (var8 = 0; ByteArrayNode.field_p[var6].length > var8; var8++) {
                  if (null != ByteArrayNode.field_p[var6][var8]) {
                    var9_ref_sg = ByteArrayNode.field_p[var6][var8];
                    ByteArrayNode.field_p[var6][var8].field_mb = 0;
                    var9_ref_sg.field_K = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (RandomAccessCacheFile.field_i != null) {
                      stackIn_59_0 = (RandomAccessCacheFile.field_i[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_59_0 = 0;
                    }
                  } else {
                    stackIn_59_0 = 0;
                  }
                } else {
                  stackIn_59_0 = 0;
                }
                var7 = stackIn_59_0;
                if (var7 != 0) {
                  var8_ref_qr = QuickChatCategoryRegistry.field_g[var6];
                  QuickChatCategoryRegistry.field_g[var6].field_mb = 0;
                  var8_ref_qr.field_K = 0;
                  for (var9 = 0; var9 < ByteArrayNode.field_p[var6].length; var9++) {
                    if (null != ByteArrayNode.field_p[var6][var9]) {
                      var10_ref_sg = ByteArrayNode.field_p[var6][var9];
                      ByteArrayNode.field_p[var6][var9].field_mb = 0;
                      var10_ref_sg.field_K = 0;
                    }
                  }
                } else {
                  QuickChatCategoryRegistry.field_g[var6].setTarget(103, var3, (byte) 74, var5, 5);
                  var8 = 110;
                  if (param1) {
                    ByteArrayNode.field_p[var6][0].a(50, var3, var5, 2, TextLayout.field_b, 38, var8);
                    var8 += 40;
                  } else {
                    if (ByteArrayNode.field_p[var6][0] != null) {
                      var9_ref_sg = ByteArrayNode.field_p[var6][0];
                      ByteArrayNode.field_p[var6][0].field_mb = 0;
                      var9_ref_sg.field_K = 0;
                    }
                  }
                  var9 = 2 + (-5 + (IntrusiveDeque.field_g.field_K - var8));
                  var10 = ByteArrayNode.field_p[var6].length - 1;
                  for (var11 = 0; var11 < var10; var11++) {
                    var12 = var11 * var9 / var10;
                    ByteArrayNode.field_p[var6][1 + var11].a(50, var3, var5, 2, TextLayout.field_b, -var12 + (-2 + (1 + var11) * var9 / var10), var12 + var8);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          MouseInputHandler.field_d.setTarget(360, -10 + SoftwareRasterizer.field_k - 120 - 4 - 10, (byte) 122, 10, -360 + SoftwareRasterizer.field_b >> 1);
          ValidationIndicator.field_K.setTarget(MouseInputHandler.field_d.field_K, 24, (byte) 80, 0, 0);
          QuickChatPhraseRegistry.field_a.setTarget(MouseInputHandler.field_d.field_K, -24 + MouseInputHandler.field_d.field_mb, (byte) 106, 24, 0);
          QuickChatPhraseRegistry.field_a.field_F = Wormhole.a(16, 3, QuickChatPhraseRegistry.field_a.field_mb, 11579568, 8421504, 1);
          MenuList.field_v.setTarget(QuickChatPhraseRegistry.field_a.field_K - 10, -2 + QuickChatPhraseRegistry.field_a.field_mb - 10 - 24, (byte) 115, 5, 5);
          oo.field_c.setTarget(80, 24, (byte) 108, -5 + QuickChatPhraseRegistry.field_a.field_mb - 24, (QuickChatPhraseRegistry.field_a.field_K - 80) / 2);
          CachedArchiveSource.d(18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "en.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_d = null;
        if (param0 != -5) {
          field_c = 21;
        }
        field_e = null;
        field_b = null;
    }

    static {
        field_d = "Accept rematch";
        field_a = 0;
        field_e = "Total number of projects deployed.";
    }
}
