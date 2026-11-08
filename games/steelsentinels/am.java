/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String[] field_d;
    static NodeDeque field_c;
    static RgbSprite[] field_f;
    static boolean field_b;
    static String field_a;
    static String field_e;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 == 2) {
          field_f = null;
          field_d = null;
          return;
        }
        am.releaseStatics(5);
        field_f = null;
        field_d = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = SteelSentinels.obfuscationControl;
        int var1Lifetime1;
        QuickChatMenu.a(IntKeyLookup.field_j, 7411, 5);
        QuickChatMenu.a(MusicPatchEnvelope.field_b, 7411, 6);
        QuickChatMenu.a(SentinelDesigner.field_d, 7411, 8);
        QuickChatMenu.a(MouseWheelInput.field_h, 7411, 13);
        QuickChatMenu.a(IconLabelControl.field_cc, 7411, 14);
        QuickChatMenu.a(SocialListPanel.field_ac, 7411, 20);
        ContentTransitionDialog.field_sb = null;
        if (rd.field_b <= 0) {
          QuickChatMenu.a(ClientException.field_k, 7411, 6);
          QuickChatMenu.a(SingleChildContainer.field_H, 7411, 8);
          var1 = 111 / ((param0 + 35) / 35);
          if (rd.field_b <= 0) {
            QuickChatMenu.a(WeightedLruCache.field_h, 7411, 19);
            if (ArticulatedPart.f((byte) -128)) {
              ImageProducerRasterBuffer.field_A[34] = QuickChatPhraseCache.field_l;
            }
            if (!AccountRegistrationPanel.l(13539)) {
              QuickChatMenu.a(NodeDeque.field_c, 7411, 1);
              QuickChatMenu.a(qi.field_f, 7411, 2);
              QuickChatMenu.a(GzipDecoder.field_b, 7411, 3);
              QuickChatMenu.a(ri.field_a, 7411, 4);
            }
            return;
          }
          QuickChatMenu.a(DualNodeDeque.field_c, 7411, 0);
          QuickChatMenu.a(ArchiveProvider.field_c, 7411, 19);
          if (ArticulatedPart.f((byte) -128)) {
            ImageProducerRasterBuffer.field_A[34] = QuickChatPhraseCache.field_l;
          }
          if (!AccountRegistrationPanel.l(13539)) {
            QuickChatMenu.a(NodeDeque.field_c, 7411, 1);
            QuickChatMenu.a(qi.field_f, 7411, 2);
            QuickChatMenu.a(GzipDecoder.field_b, 7411, 3);
            QuickChatMenu.a(ri.field_a, 7411, 4);
          }
          return;
        }
        QuickChatMenu.a(MusicPatchEnvelope.field_b, 7411, 6);
        QuickChatMenu.a(SentinelDesigner.field_d, 7411, 8);
        var1Lifetime1 = 111 / ((param0 + 35) / 35);
        if (rd.field_b <= 0) {
          QuickChatMenu.a(WeightedLruCache.field_h, 7411, 19);
          if (ArticulatedPart.f((byte) -128)) {
            ImageProducerRasterBuffer.field_A[34] = QuickChatPhraseCache.field_l;
          }
          if (!AccountRegistrationPanel.l(13539)) {
            QuickChatMenu.a(NodeDeque.field_c, 7411, 1);
            QuickChatMenu.a(qi.field_f, 7411, 2);
            QuickChatMenu.a(GzipDecoder.field_b, 7411, 3);
            QuickChatMenu.a(ri.field_a, 7411, 4);
          }
          return;
        }
        QuickChatMenu.a(DualNodeDeque.field_c, 7411, 0);
        QuickChatMenu.a(ArchiveProvider.field_c, 7411, 19);
        if (ArticulatedPart.f((byte) -128)) {
          ImageProducerRasterBuffer.field_A[34] = QuickChatPhraseCache.field_l;
        }
        if (!AccountRegistrationPanel.l(13539)) {
          QuickChatMenu.a(NodeDeque.field_c, 7411, 1);
          QuickChatMenu.a(qi.field_f, 7411, 2);
          QuickChatMenu.a(GzipDecoder.field_b, 7411, 3);
          QuickChatMenu.a(ri.field_a, 7411, 4);
        }
    }

    static {
        field_a = "Breaking real-world laws";
        field_e = "Page <%0> of <%1>";
        field_d = new String[]{"Chassis", "Components", "Weapons", "Modules"};
    }
}
