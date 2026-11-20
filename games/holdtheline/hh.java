/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static ValidationState field_d;
    static Sprite field_e;
    static QuickChatDynamicCommand field_a;
    static ViewportSizingController field_c;
    static String field_b;

    final static int a(int param0) {
        if (param0 <= 32) {
          field_e = (Sprite) null;
          if (SpriteSheetAsset.field_k) {
            return -1;
          }
          if (HoldTheLine.field_A > SecondaryNodeDeque.field_f) {
            return -1;
          }
          if (!(SecondaryNodeDeque.field_f >= HoldTheLine.field_A + EmailValidationResult.field_h)) {
            return AccountCreationForm.field_I;
          }
          return -1;
        }
        if (SpriteSheetAsset.field_k) {
          return -1;
        }
        if (HoldTheLine.field_A > SecondaryNodeDeque.field_f) {
          return -1;
        }
        if (SecondaryNodeDeque.field_f < HoldTheLine.field_A + EmailValidationResult.field_h) {
          return AccountCreationForm.field_I;
        }
        return -1;
    }

    final static void sendAchievementStatusRequest(int param0, byte param1) {
        IsaacPacketBuffer var2 = IsaacPacketBuffer.field_p;
        var2.writeCipheredOpcode((byte) 33, param0);
        var2.writeByte(111, 1);
        if (param1 == -23) {
          var2.writeByte(param1 + 134, 2);
          return;
        }
        hh.clearSharedReferences(111);
        var2.writeByte(param1 + 134, 2);
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        if (param0 != 10) {
          return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_d = new ValidationState();
        field_b = "Cancel";
        field_c = null;
        field_a = new QuickChatDynamicCommand(10, 2, 2, 0);
    }
}
