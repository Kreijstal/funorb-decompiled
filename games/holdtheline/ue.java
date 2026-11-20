/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param0 != 8911) {
            ue.clearSharedReferences(16);
          }
          for (var2_int = SoftwareRasterizer.width * SoftwareRasterizer.height - 1; var2_int >= 0; var2_int--) {
            var3 = SoftwareRasterizer.pixels[var2_int];
            var4 = 16711935 & var3;
            var3 = var3 & 65280;
            var4 = var4 * param1;
            var4 = var4 & -16711936;
            var3 = var3 * param1;
            var3 = var3 & 16711680;
            var3 = var3 | var4;
            SoftwareRasterizer.pixels[var2_int] = var3 >>> 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ue.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static Sprite a(boolean param0) {
        int var4_int = 0;
        Sprite var4 = null;
        int var5 = HoldTheLine.field_D;
        int var1 = ad.field_d[0] * EditableTextField.field_K[0];
        byte[] var7 = IterableSecondaryNodeDeque.field_e[0];
        int[] var3 = new int[var1];
        Sprite var4Lifetime1;
        int var4_intLifetime1;
        if (param0) {
          for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = StraightRoadSegment.field_E[LoginChoicePanel.a(255, (int) var7[var4_int])];
          }
          var4 = new Sprite(bo.field_b, AchievementUnlockRequest.field_o, DirectByteStorage.field_j[0], Vector2i.field_g[0], EditableTextField.field_K[0], ad.field_d[0], var3);
          tk.clearDecodedSpriteSheet(false);
          return var4;
        }
        field_b = (String) null;
        for (var4_intLifetime1 = 0; var1 > var4_intLifetime1; var4_intLifetime1++) {
          var3[var4_intLifetime1] = StraightRoadSegment.field_E[LoginChoicePanel.a(255, (int) var7[var4_intLifetime1])];
        }
        var4Lifetime1 = new Sprite(bo.field_b, AchievementUnlockRequest.field_o, DirectByteStorage.field_j[0], Vector2i.field_g[0], EditableTextField.field_K[0], ad.field_d[0], var3);
        tk.clearDecodedSpriteSheet(false);
        return var4Lifetime1;
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 19857) {
          field_a = (String) null;
        }
    }

    static {
        field_c = "Next course: ";
        field_b = "start using this feature.";
        field_a = "Just play";
    }
}
