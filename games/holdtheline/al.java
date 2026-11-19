/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static RotatedSpriteAsset[] field_a;
    static int[] field_b;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        int var1 = -117 % ((8 - param0) / 62);
        field_a = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 == 100 &&
          TextFieldValidator.field_g > 0) {
          fieldTemp$3 = TextFieldValidator.field_g - 1;
          TextFieldValidator.field_g = TextFieldValidator.field_g - 1;
          var2_ref_byte__ = HuffmanDecoder.field_a[fieldTemp$3];
          HuffmanDecoder.field_a[TextFieldValidator.field_g] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          Vector2f.field_a > 0) {
          fieldTemp$4 = Vector2f.field_a - 1;
          Vector2f.field_a = Vector2f.field_a - 1;
          var2_ref_byte__Lifetime1 = cd.field_e[fieldTemp$4];
          cd.field_e[Vector2f.field_a] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param0 &&
          NameAvailabilityResult.field_g > 0) {
          fieldTemp$5 = NameAvailabilityResult.field_g - 1;
          NameAvailabilityResult.field_g = NameAvailabilityResult.field_g - 1;
          var2_ref_byte__Lifetime2 = FullscreenFocusCanvas.field_h[fieldTemp$5];
          FullscreenFocusCanvas.field_h[NameAvailabilityResult.field_g] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 <= 84) {
          field_a = (RotatedSpriteAsset[]) null;
        }
        if (GrowableObjectList.field_c != null) {
          for (var2 = 0; var2 < SpriteState.field_p.length; var2++) {
            if (SpriteState.field_p[var2] == param0 &&
              ArchiveLoadStage.field_f[var2] > 0) {
              dupTemp$6 = ArchiveLoadStage.field_f[var2] - 1;
              arrayValue$7 = GrowableObjectList.field_c[var2];
              ArchiveLoadStage.field_f[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              GrowableObjectList.field_c[var2][ArchiveLoadStage.field_f[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    static {
        field_b = new int[16384];
    }
}
