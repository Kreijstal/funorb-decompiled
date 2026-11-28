/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    int field_f;
    static e field_a;
    static RgbSprite field_e;
    static int field_c;
    static String field_g;
    int field_d;
    static IntrusiveDeque field_b;

    final static qg[] a(int param0) {
        qg[] var1 = null;
        int var2 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        qg[] var1Lifetime1;
        int var2Lifetime1;
        if (param0 != 17867) {
          field_b = (IntrusiveDeque) null;
        } else {
          var1 = new qg[DialogMessagePane.field_K];
          for (var2 = 0; DialogMessagePane.field_K > var2; var2++) {
            var1[var2] = new qg(ModalDialog.field_B, MusicPatchNode.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], fl.field_a[var2], vc.field_g);
          }
          md.clearIndexedSpriteDecodeBuffersWithIntGuard(-127);
          return var1;
        }
        var1Lifetime1 = new qg[DialogMessagePane.field_K];
        for (var2Lifetime1 = 0; DialogMessagePane.field_K > var2Lifetime1; var2Lifetime1++) {
          var1Lifetime1[var2Lifetime1] = new qg(ModalDialog.field_B, MusicPatchNode.field_r, jd.field_g[var2Lifetime1], wc.field_a[var2Lifetime1], wh.field_b[var2Lifetime1], m.field_a[var2Lifetime1], fl.field_a[var2Lifetime1], vc.field_g);
        }
        md.clearIndexedSpriteDecodeBuffersWithIntGuard(-127);
        return var1Lifetime1;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = OrbDefence.field_D ? 1 : 0;
        try {
          FullscreenNoticeType.field_a = new RgbSprite(640, 58);
          hc.field_i = new RgbSprite(640, 122);
          FullscreenNoticeType.field_a.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(3, 3, 634, 50, 0);
          SoftwareRasterizer.fillRectangle(65, 3, 511, 50, 10359);
          for (var1_int = 0; var1_int < 256; var1_int++) {
            SoftwareRasterizer.drawVerticalLineAlpha(320 + var1_int, 3, 50, 0, var1_int * var1_int >> 8);
            SoftwareRasterizer.drawVerticalLineAlpha(-var1_int + 320, 3, 50, 0, var1_int * var1_int >> 8);
          }
          SoftwareRasterizer.drawVerticalLineAlpha(150, 2, 50, 8947848, 32);
          SoftwareRasterizer.drawVerticalLineAlpha(151, 2, 50, 8947848, 32);
          SoftwareRasterizer.drawVerticalLineAlpha(256, 2, 50, 8947848, 32);
          SoftwareRasterizer.drawVerticalLineAlpha(257, 2, 50, 8947848, 32);
          SoftwareRasterizer.drawVerticalLineAlpha(390, 2, 50, 8947848, 32);
          SoftwareRasterizer.drawVerticalLineAlpha(391, 2, 50, 8947848, 32);
          MouseInputListener.field_a.drawScaledAdditive(2, 2, 636, 50, 32);
          if (param0 != -27) {
            ba.a(-15);
          }
          SoftwareRasterizer.drawHorizontalLine(3, 53, 634, 0);
          SoftwareRasterizer.drawHorizontalLine(2, 54, 636, 13749446);
          SoftwareRasterizer.drawHorizontalLine(1, 55, 638, 13749446);
          SoftwareRasterizer.drawHorizontalLine(2, 56, 636, 13749446);
          SoftwareRasterizer.drawHorizontalLine(3, 57, 634, 0);
          SoftwareRasterizer.setClip(0, 0, 150, 480);
          ProgressMessageDialog.field_X.draw(-(ProgressMessageDialog.field_X.field_s / 2) + 295, 0);
          SoftwareRasterizer.setClip(200, 0, 300, 480);
          ProgressMessageDialog.field_X.draw(-(ProgressMessageDialog.field_X.field_s / 2) + 320, 0);
          SoftwareRasterizer.setClip(300, 0, 640, 480);
          ProgressMessageDialog.field_X.draw(210 - ProgressMessageDialog.field_X.field_s / 2, 0);
          SoftwareRasterizer.resetClip();
          RegistrationAgreementPane.field_I.drawRightAligned(gb.field_e, 85, 30, 16777215, -1);
          jd.field_c.drawRightAligned(cf.field_g, 200, 40, 16777215, -1);
          RegistrationAgreementPane.field_I.drawRightAligned(nh.field_a, 339, 30, 16777215, -1);
          SoftwareRasterizer.setClip(0, 0, 640, 2);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 0, 640, 480, 11184810, 4605510);
          BufferedSocket.field_a.setAsRasterTarget(-40);
          hc.field_i.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangleVerticalGradient(3, 2, 634, 117, 0, 10359);
          SoftwareRasterizer.setClip(0, 120, 640, 480);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, -358, 640, 480, 11184810, 4605510);
          SoftwareRasterizer.resetClip();
          MatchingFieldValidator.a(param0 + 90, 39, 172, 72, 295);
          MatchingFieldValidator.a(42, 0, 2, 120, 175);
          MatchingFieldValidator.a(42, 0, 462, 120, 176);
          SoftwareRasterizer.fillRectangleVerticalGradient(468, 6, 164, 24, 5132630, 1644825);
          SoftwareRasterizer.drawRectangleOutline(468, 6, 164, 24, 8947848);
          BufferedSocket.field_a.setAsRasterTarget(-40);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ba.A(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        if (param0 != 50) {
          return;
        }
        field_g = null;
        field_e = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ba(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_d = param0;
    }

    static {
        field_g = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = new e();
        field_b = new IntrusiveDeque();
    }
}
