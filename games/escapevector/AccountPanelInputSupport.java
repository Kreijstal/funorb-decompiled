/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountPanelInputSupport {
    static String field_b;
    static boolean[] field_a;
    static SpriteOffset[] field_d;
    static PcmSampleStream field_c;

    final static void drawCachedEdgeSegments(int offsetY, int guard, int offsetX) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          GameAppletShell.field_k = true;
          oh var3 = (oh) (TrackerGainSupport.field_c.first(false));
          while (var3 != null) {
            if (var3.field_m < 0) {
              SoftwareRasterizer.drawHorizontalLine(var3.field_i - var3.field_s + offsetX, offsetY + var3.field_q, var3.field_s, EmailSyntaxValidator.field_q);
            } else {
              SoftwareRasterizer.drawHorizontalLine(offsetX + var3.field_i, offsetY + var3.field_q, var3.field_s, EmailSyntaxValidator.field_q);
            }
            var3 = (oh) (TrackerGainSupport.field_c.next((byte) 70));
          }
          oh var3Lifetime1 = (oh) (QuickChatPhraseDefinition.field_u.first(false));
          while (var3Lifetime1 != null) {
            if (var3Lifetime1.field_m >= 0) {
              SoftwareRasterizer.drawVerticalLine(offsetX + var3Lifetime1.field_i, offsetY + var3Lifetime1.field_q, var3Lifetime1.field_s, EmailSyntaxValidator.field_q);
            } else {
              SoftwareRasterizer.drawVerticalLine(var3Lifetime1.field_i + offsetX, offsetY - var3Lifetime1.field_s + var3Lifetime1.field_q, var3Lifetime1.field_s, EmailSyntaxValidator.field_q);
            }
            var3Lifetime1 = (oh) (QuickChatPhraseDefinition.field_u.next((byte) 70));
          }
          if (guard < -5) {
            return;
          }
          field_c = (PcmSampleStream) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3_ref), "dj.B(" + offsetY + ',' + guard + ',' + offsetX + ')');
        }
    }

    final static char decodeCp1252Byte(int guard, byte value) {
        if (guard > -34) {
          AccountPanelInputSupport.decodeCp1252Byte(-28, (byte) 6);
          int var2 = value & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 < 128) {
            return (char)var2;
          }
          if (var2 < 160) {
            int var3 = IntrusiveDeque.field_c[-128 + var2];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        int var2Lifetime1 = value & 255;
        if (0 == var2Lifetime1) {
          throw new IllegalArgumentException("" + Integer.toString(var2Lifetime1, 16));
        }
        if (var2Lifetime1 < 128) {
          return (char)var2Lifetime1;
        }
        if (var2Lifetime1 >= 160) {
          return (char)var2Lifetime1;
        }
        int var3Lifetime1 = IntrusiveDeque.field_c[-128 + var2Lifetime1];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        int var2Lifetime2 = var3Lifetime1;
        return (char)var2Lifetime2;
    }

    final static int serviceAccountPanelInput(int guard) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          Checkbox.field_F.handlePointerFrame(true, (byte) -33, ValidationIndicator.field_G, ph.field_a);
          Checkbox.field_F.updatePanels(0);
          while (AccountRequestDialog.pollKeyEvent(-116)) {
            Checkbox.field_F.handleKey(KeyCodeSupport.currentKeyCharacter, PasswordValidator.field_n, (byte) -116);
          }
          if (guard != 6445) {
            int stackIn_6_0 = -79;
            return stackIn_6_0;
          }
          if (-1 != ValidationState.field_a) {
            int var1_int = ValidationState.field_a;
            WhirlpoolHasher.a(-1, guard - 6378);
            int stackIn_10_0 = var1_int;
            return stackIn_10_0;
          }
          if (SavedDataQuery.field_i) {
            int stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (MeshMaterial.field_b == EmailAvailabilityValidator.field_o) {
            int stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!di.field_g.isComplete(0)) {
            int stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (EmailAvailabilityValidator.field_o != dn.field_q) {
            int stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          int stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "dj.C(" + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = 22 % ((guard - 83) / 40);
        field_b = null;
    }

    static {
        field_b = null;
    }
}
