/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedResponse extends IntrusiveNode {
    byte[] field_j;
    static IntrusiveDeque field_m;
    static int field_g;
    boolean field_k;
    static int field_h;
    static String field_i;
    static String field_l;

    final static void drawOrbCoinScreen(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        int var4Lifetime8;
        int var4Lifetime9;
        int var4Lifetime10;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var4Lifetime11;
        int var4Lifetime12;
        int var4Lifetime13;
        int var4Lifetime14;
        int var4Lifetime15;
        int var4Lifetime8Lifetime1;
        ValidationState.field_e.drawOpaque(0, 0);
        int var1 = 32;
        int var2 = 80;
        PaddedContainer.field_H[15].drawScaled(var2, NameErrorHelpers.field_d, 160, 64);
        if (null != MembershipOfferScreen.field_o) {
          var3 = 64 * MembershipOfferScreen.field_o.field_n / MembershipOfferScreen.field_o.field_w;
          MembershipOfferScreen.field_o.drawScaled(-(var3 / 2) + 80 + var2, NameErrorHelpers.field_d, var3, 64);
        }
        PaddedContainer.field_H[15].drawScaled(var2 + 160, NameErrorHelpers.field_d, 224, 48);
        PaddedContainer.field_H[15].drawScaled(464, NameErrorHelpers.field_d, 96, 48);
        PointerOriginHelpers.field_e.drawTransparent(464, 8 + NameErrorHelpers.field_d);
        var3Lifetime1 = 53;
        QuickChatInputHelpers.field_b.drawParagraph(Integer.toString(var3Lifetime1), 464, 8 + NameErrorHelpers.field_d, 32, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        QuickChatInputHelpers.field_b.drawParagraph("Orb coins Banked", 496, NameErrorHelpers.field_d, 64, 48, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        PaddedContainer.field_H[15].drawScaled(80, 128 + (64 + NameErrorHelpers.field_d) + 32, 480, 64);
        if ((1 & CredentialKind.field_b) <= 0) {
          if ((CredentialKind.field_b & 2) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4 = 64 + (128 + NameErrorHelpers.field_d + 32);
            PaddedContainer.field_H[6].drawScaled(var2 + 16, var4 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, var4 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 4) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime11 = 64 + (32 + NameErrorHelpers.field_d) + 128;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime11, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, 16 + var4Lifetime11, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (0 < (CredentialKind.field_b & 8)) {
            QuickChatInputHelpers.field_b.drawText("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime12 = NameErrorHelpers.field_d + 32 + 192;
            var5 = 100;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime12, var5, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Yes", var2 + 16, var4Lifetime12 + 16, var5, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            PaddedContainer.field_H[15].drawScaled(240 + var2 + 16 - (24 + var5), 16 + var4Lifetime12, var5, 32);
            QuickChatInputHelpers.field_b.drawParagraph("No", -var5 + (-8 + (var2 + 240)), var4Lifetime12 + 16, var5, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 16) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime13 = 128 + (NameErrorHelpers.field_d + 32) + 64;
            PaddedContainer.field_H[6].drawScaled(328, var4Lifetime13 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime13 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            QuickChatInputHelpers.field_b.drawParagraph("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime13, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (param0 != 2341) {
            QueuedResponse.drawOrbCoinScreen(-26);
          }
          if ((CredentialKind.field_b & 32) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime14 = 64 + (128 + NameErrorHelpers.field_d) + 32;
            QuickChatInputHelpers.field_b.drawParagraph("Purchase completed.", 16 + var2, var4Lifetime14, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (!((CredentialKind.field_b & 64) <= 0)) {
            QuickChatInputHelpers.field_b.drawText("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime15 = NameErrorHelpers.field_d + 160 + 64;
            PaddedContainer.field_H[15].drawScaled(328, 16 + var4Lifetime15, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime15 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          return;
        }
        QuickChatInputHelpers.field_b.drawText("SHOW INFOS", 32, var1, 16777215, 0);
        var1 += 16;
        var4Lifetime1 = NameErrorHelpers.field_d + 64;
        PaddedContainer.field_H[15].drawScaled(var2, var4Lifetime1, 160, 160);
        SoftwareRasterizer.blurRectangle(3, 3, 16 + var2, 16 + var4Lifetime1, 128, 128);
        SoftwareRasterizer.drawRectangle(-64 + (80 + var2) - 1, 15 + var4Lifetime1, 130, 130, 0);
        ResizableViewResizeListener.field_e.drawTransparent(-64 + (var2 + 80), var4Lifetime1 + 16);
        var4Lifetime2 = 48 + NameErrorHelpers.field_d;
        var5Lifetime1 = 176;
        int var6 = var2 + 160;
        int var7 = 320;
        PaddedContainer.field_H[6].drawScaled(var6, var4Lifetime2, var7, var5Lifetime1);
        QuickChatInputHelpers.field_b.drawParagraph(DisplayNameForm.field_L, var6, var4Lifetime2 + 32, var7, 32 + QuickChatInputHelpers.field_b.field_C, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        if ((2 & CredentialKind.field_b) > 0) {
          QuickChatInputHelpers.field_b.drawParagraph("This item is only availiable to members.", var6, 64 + var4Lifetime2, var7, 80, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          IconHighlightPainter.field_d.drawQuarterSize(var6 - (-(var7 / 2) + 16), 80 + (var4Lifetime2 + 64));
          if ((CredentialKind.field_b & 2) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + NameErrorHelpers.field_d + 32);
            PaddedContainer.field_H[6].drawScaled(var2 + 16, var4Lifetime2 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 4) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (32 + NameErrorHelpers.field_d) + 128;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime2, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, 16 + var4Lifetime2, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (0 < (CredentialKind.field_b & 8)) {
            QuickChatInputHelpers.field_b.drawText("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = NameErrorHelpers.field_d + 32 + 192;
            var5Lifetime2 = 100;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime2, var5Lifetime2, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Yes", var2 + 16, var4Lifetime2 + 16, var5Lifetime2, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            PaddedContainer.field_H[15].drawScaled(240 + var2 + 16 - (24 + var5Lifetime2), 16 + var4Lifetime2, var5Lifetime2, 32);
            QuickChatInputHelpers.field_b.drawParagraph("No", -var5Lifetime2 + (-8 + (var2 + 240)), var4Lifetime2 + 16, var5Lifetime2, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 16) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 128 + (NameErrorHelpers.field_d + 32) + 64;
            PaddedContainer.field_H[6].drawScaled(328, var4Lifetime2 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            QuickChatInputHelpers.field_b.drawParagraph("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (param0 != 2341) {
            QueuedResponse.drawOrbCoinScreen(-26);
          }
          if ((CredentialKind.field_b & 32) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + NameErrorHelpers.field_d) + 32;
            QuickChatInputHelpers.field_b.drawParagraph("Purchase completed.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (!((CredentialKind.field_b & 64) <= 0)) {
            QuickChatInputHelpers.field_b.drawText("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = NameErrorHelpers.field_d + 160 + 64;
            PaddedContainer.field_H[15].drawScaled(328, 16 + var4Lifetime2, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          return;
        }
        if (ClientException.field_j != null) {
          QuickChatInputHelpers.field_b.drawParagraph(ClientException.field_j, var6, 64 + var4Lifetime2, var7, 80, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          var4Lifetime2 = -QuickChatInputHelpers.field_b.field_C - 32 + (64 + (128 + (NameErrorHelpers.field_d + 32)));
          QuickChatInputHelpers.field_b.drawParagraph("Orb coins to purchase", var6 + 32 + 32, var4Lifetime2, var7 - 80, 32 + QuickChatInputHelpers.field_b.field_C, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          PointerOriginHelpers.field_e.drawTransparent(var6 + 16, -16 + QuickChatInputHelpers.field_b.field_C / 2 + var4Lifetime2 + 16);
          QuickChatInputHelpers.field_b.drawParagraph(Integer.toString(GameListSortHelpers.field_f), var6 + 16, 16 + (QuickChatInputHelpers.field_b.field_C / 2 + (var4Lifetime2 - 16)), 32, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          if ((CredentialKind.field_b & 2) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + NameErrorHelpers.field_d + 32);
            PaddedContainer.field_H[6].drawScaled(var2 + 16, var4Lifetime2 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 4) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (32 + NameErrorHelpers.field_d) + 128;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime2, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, 16 + var4Lifetime2, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (0 < (CredentialKind.field_b & 8)) {
            QuickChatInputHelpers.field_b.drawText("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = NameErrorHelpers.field_d + 32 + 192;
            var5Lifetime3 = 100;
            PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime2, var5Lifetime3, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Yes", var2 + 16, var4Lifetime2 + 16, var5Lifetime3, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            PaddedContainer.field_H[15].drawScaled(240 + var2 + 16 - (24 + var5Lifetime3), 16 + var4Lifetime2, var5Lifetime3, 32);
            QuickChatInputHelpers.field_b.drawParagraph("No", -var5Lifetime3 + (-8 + (var2 + 240)), var4Lifetime2 + 16, var5Lifetime3, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if ((CredentialKind.field_b & 16) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 128 + (NameErrorHelpers.field_d + 32) + 64;
            PaddedContainer.field_H[6].drawScaled(328, var4Lifetime2 + 16, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
            QuickChatInputHelpers.field_b.drawParagraph("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (param0 != 2341) {
            QueuedResponse.drawOrbCoinScreen(-26);
          }
          if ((CredentialKind.field_b & 32) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + NameErrorHelpers.field_d) + 32;
            QuickChatInputHelpers.field_b.drawParagraph("Purchase completed.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (!((CredentialKind.field_b & 64) <= 0)) {
            QuickChatInputHelpers.field_b.drawText("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = NameErrorHelpers.field_d + 160 + 64;
            PaddedContainer.field_H[15].drawScaled(328, 16 + var4Lifetime2, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          return;
        }
        var4Lifetime3 = -QuickChatInputHelpers.field_b.field_C - 32 + (64 + (128 + (NameErrorHelpers.field_d + 32)));
        QuickChatInputHelpers.field_b.drawParagraph("Orb coins to purchase", var6 + 32 + 32, var4Lifetime3, var7 - 80, 32 + QuickChatInputHelpers.field_b.field_C, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        PointerOriginHelpers.field_e.drawTransparent(var6 + 16, -16 + QuickChatInputHelpers.field_b.field_C / 2 + var4Lifetime3 + 16);
        QuickChatInputHelpers.field_b.drawParagraph(Integer.toString(GameListSortHelpers.field_f), var6 + 16, 16 + (QuickChatInputHelpers.field_b.field_C / 2 + (var4Lifetime3 - 16)), 32, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        if ((CredentialKind.field_b & 2) > 0) {
          QuickChatInputHelpers.field_b.drawText("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime4 = 64 + (128 + NameErrorHelpers.field_d + 32);
          PaddedContainer.field_H[6].drawScaled(var2 + 16, var4Lifetime4 + 16, 216, 32);
          QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, var4Lifetime4 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
        if ((CredentialKind.field_b & 4) > 0) {
          QuickChatInputHelpers.field_b.drawText("SHOW PURCHASE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime5 = 64 + (32 + NameErrorHelpers.field_d) + 128;
          PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime5, 216, 32);
          QuickChatInputHelpers.field_b.drawParagraph("Purchase", var2 + 16, 16 + var4Lifetime5, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
        if (0 < (CredentialKind.field_b & 8)) {
          QuickChatInputHelpers.field_b.drawText("SHOW CONFIRM", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime6 = NameErrorHelpers.field_d + 32 + 192;
          var5Lifetime4 = 100;
          PaddedContainer.field_H[15].drawScaled(var2 + 16, 16 + var4Lifetime6, var5Lifetime4, 32);
          QuickChatInputHelpers.field_b.drawParagraph("Yes", var2 + 16, var4Lifetime6 + 16, var5Lifetime4, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          PaddedContainer.field_H[15].drawScaled(240 + var2 + 16 - (24 + var5Lifetime4), 16 + var4Lifetime6, var5Lifetime4, 32);
          QuickChatInputHelpers.field_b.drawParagraph("No", -var5Lifetime4 + (-8 + (var2 + 240)), var4Lifetime6 + 16, var5Lifetime4, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
        if ((CredentialKind.field_b & 16) > 0) {
          QuickChatInputHelpers.field_b.drawText("SHOW WAIT", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime7 = 128 + (NameErrorHelpers.field_d + 32) + 64;
          PaddedContainer.field_H[6].drawScaled(328, var4Lifetime7 + 16, 216, 32);
          QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime7 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          QuickChatInputHelpers.field_b.drawParagraph("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime7, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
        if (param0 == 2341) {
          if ((CredentialKind.field_b & 32) > 0) {
            QuickChatInputHelpers.field_b.drawText("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime8 = 64 + (128 + NameErrorHelpers.field_d) + 32;
            QuickChatInputHelpers.field_b.drawParagraph("Purchase completed.", 16 + var2, var4Lifetime8, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          if (!((CredentialKind.field_b & 64) <= 0)) {
            QuickChatInputHelpers.field_b.drawText("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime8Lifetime1 = NameErrorHelpers.field_d + 160 + 64;
            PaddedContainer.field_H[15].drawScaled(328, 16 + var4Lifetime8Lifetime1, 216, 32);
            QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime8Lifetime1 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
          }
          return;
        }
        QueuedResponse.drawOrbCoinScreen(-26);
        if ((CredentialKind.field_b & 32) > 0) {
          QuickChatInputHelpers.field_b.drawText("SHOW COMPLETE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime9 = 64 + (128 + NameErrorHelpers.field_d) + 32;
          QuickChatInputHelpers.field_b.drawParagraph("Purchase completed.", 16 + var2, var4Lifetime9, 216, 64, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
        if (!((CredentialKind.field_b & 64) <= 0)) {
          QuickChatInputHelpers.field_b.drawText("SHOW EXIT", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime10 = NameErrorHelpers.field_d + 160 + 64;
          PaddedContainer.field_H[15].drawScaled(328, 16 + var4Lifetime10, 216, 32);
          QuickChatInputHelpers.field_b.drawParagraph("Cancel", 328, var4Lifetime10 + 16, 216, 32, 16777215, 0, 1, 1, QuickChatInputHelpers.field_b.field_C);
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        if (param0 < 52) {
          field_h = -34;
          field_i = null;
          field_m = null;
          return;
        }
        field_i = null;
        field_m = null;
    }

    final static void sendChatLine(int param0, int param1, PendingRequest param2) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = StatusMessageHelpers.field_e;
          CipherPacketBuffer var3 = var6;
          var6.writeOpcode((byte) -80, param1);
          var6.position = var6.position + 1;
          if (param0 != 32) {
            PendingRequest var5 = (PendingRequest) null;
            QueuedResponse.sendChatLine(-102, -101, (PendingRequest) null);
          }
          var4 = var6.position;
          var6.writeByte(1, (byte) -89);
          if (param2.field_k != null) {
            var6.writeByte(param2.field_k.length, (byte) -64);
            var6.writeBytes(param2.field_k, 0, (byte) -86, param2.field_k.length);
          } else {
            var6.writeByte(0, (byte) -92);
          }
          var6.appendCrc32(true, var4);
          var6.position = var6.position - 4;
          param2.field_j = var6.readInt(-10674);
          var6.writeByteLengthAtMark(var6.position - var4, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "pb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    QueuedResponse() {
    }

    static {
        field_m = new IntrusiveDeque();
        field_i = "<%0> is offering an unrated rematch.";
        field_h = 0;
        field_l = "Shields you and your minions up to 5 points per round";
    }
}
