/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchivePreloadEntry {
    String field_g;
    ResourceArchive field_h;
    String field_c;
    static int field_e;
    static String field_f;
    String field_d;
    static String field_b;
    int field_a;

    final static Sprite buildFirstDecodedSprite(byte param0) {
        byte[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var9 = null;
        int var5 = 0;
        byte[] var17 = null;
        Object var3 = null;
        int var7 = Kickabout.field_G;
        int var1 = MouseInputHandler.field_c[0] * PasswordValidator.field_j[0];
        if (param0 == 75) {
          var16 = SquadPickerDialog.field_O[0];
          if (RankingsScreen.field_B[0]) {
            var17 = RowRangeRequest.field_e[0];
            var13 = new int[var1];
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var1 > var6; var6++) {
              var5_ref_int__[var6] = PainterStyle.a(lt.field_a[TextLayoutLine.b((int) var16[var6], 255)], TextLayoutLine.b(-16777216, var17[var6] << 24));
            }
            var3 = new ArgbSprite(AvailabilityCheckRequest.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[0], fc.field_g[0], MouseInputHandler.field_c[0], PasswordValidator.field_j[0], var13);
          } else {
            var9 = new int[var1];
            for (var5 = 0; var1 > var5; var5++) {
              var9[var5] = lt.field_a[TextLayoutLine.b((int) var16[var5], 255)];
            }
            var3 = new Sprite(AvailabilityCheckRequest.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[0], fc.field_g[0], MouseInputHandler.field_c[0], PasswordValidator.field_j[0], var9);
          }
          ScrollContainer.h((byte) -111);
          return (Sprite) (var3);
        }
        return (Sprite) null;
    }

    final static void clearAccountChoiceResources(byte param0) {
        AccountChoicePanel.field_D = false;
        pg.field_a = null;
        CaptionedContainer.field_E = null;
        if (param0 < -10) {
          TrinketIcon.field_Eb = null;
          StrongCacheEntry.field_D = null;
          return;
        }
        ArchivePreloadEntry.buildFirstDecodedSprite((byte) -42);
        TrinketIcon.field_Eb = null;
        StrongCacheEntry.field_D = null;
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -48) {
          ArchivePreloadEntry.buildFirstDecodedSprite((byte) 119);
          field_b = null;
          field_f = null;
          return;
        }
        field_b = null;
        field_f = null;
    }

    static {
        field_e = 49;
        field_b = "My Squad";
    }
}
