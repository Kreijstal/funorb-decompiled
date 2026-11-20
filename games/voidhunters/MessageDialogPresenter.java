/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogPresenter {
    final static void showMessage(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          TutorialController.field_d = true;
          Debris.field_y.text = param0;
          var2_int = SetClientSideDragging.field_q.width;
          var3 = SetClientSideDragging.field_q.height;
          var4 = Debris.field_y.font.getParagraphHeight(param0, 272, Debris.field_y.field_D);
          var5 = -(var4 / 2) + 7 - 110 + var3 / 2;
          GetTorpedoProjectiles.field_o.setBounds((-320 + var2_int) / 2, 125, 320, var5, -(var5 * 2) + var3 - 120);
          GetTorpedoProjectiles.field_o.field_gb = ShieldInfo.createGradientNineSliceSprites(11579568, GetTorpedoProjectiles.field_o.height, 2105376, 8421504, param1 ^ 77, 3);
          Debris.field_y.setBounds(24, -54, -24 + (GetTorpedoProjectiles.field_o.width - 24), param1, -24 + (-20 + GetTorpedoProjectiles.field_o.height));
          SetTorpedoAcceleration.field_o.setBounds(120, -72, 80, -24 + (-20 + GetTorpedoProjectiles.field_o.height), 24);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kqb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
