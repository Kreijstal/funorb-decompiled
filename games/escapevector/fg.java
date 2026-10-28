/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static PcmSample field_a;
    static int field_b;

    final static int a(boolean param0, int param1, int param2) {
        int var3 = param1 >> 16;
        if (!param0) {
          int var4 = param1 & 65535;
          int var5 = param2 >> 16;
          int var6 = param2 & 65535;
          return var4 * var5 + param2 * var3 + (var6 * var4 >> 16);
        }
        field_a = (PcmSample) null;
        int var4Lifetime1 = param1 & 65535;
        int var5Lifetime1 = param2 >> 16;
        int var6Lifetime1 = param2 & 65535;
        return var4Lifetime1 * var5Lifetime1 + param2 * var3 + (var6Lifetime1 * var4Lifetime1 >> 16);
    }

    final static boolean c(int param0) {
        boolean var1 = (mm.a(4, 5));
        sl.field_b[6][param0] = uj.field_a;
        return (var1);
    }

    final static IndexedSprite[] a(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        IndexedSprite[] var1 = new IndexedSprite[qk.spriteCount];
        if (param0 == 13029) {
          for (int var2 = 0; qk.spriteCount > var2; var2++) {
            var1[var2] = new IndexedSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[var2], gi.spriteOffsetYs[var2], qh.spriteWidths[var2], SavedDataQuerySupport.spriteHeights[var2], qe.spriteIndices[var2], qk.spritePalette);
          }
          of.a(false);
          return var1;
        }
        fg.b(16);
        for (int var2Lifetime1 = 0; qk.spriteCount > var2Lifetime1; var2Lifetime1++) {
          var1[var2Lifetime1] = new IndexedSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[var2Lifetime1], gi.spriteOffsetYs[var2Lifetime1], qh.spriteWidths[var2Lifetime1], SavedDataQuerySupport.spriteHeights[var2Lifetime1], qe.spriteIndices[var2Lifetime1], qk.spritePalette);
        }
        of.a(false);
        return var1;
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        if (guard >= -113) {
          field_a = (PcmSample) null;
        }
    }

    final static void b(int param0) {
        int var6 = EscapeVector.obfuscationControl;
        if (!UiContainer.e((byte) 118)) {
          return;
        }
        String var1 = "simulator";
        if (!IndexedSpriteState.field_j.tryLoadNamedGroup(param0, var1)) {
          return;
        }
        try {
          ArchiveProvider.field_b = new Sprite[17];
          String[] var2 = AlternateUsernameCredentials.field_k;
          for (int var3_int = 0; var2.length > var3_int; var3_int++) {
            String var4 = var2[var3_int];
            Sprite var5 = fe.a(var1, IndexedSpriteState.field_j, var4, true);
            ArchiveProvider.field_b[var3_int] = var5;
          }
          String var3 = "infrastructure_virtual";
          v.field_a = kh.a(IndexedSpriteState.field_j, (byte) 126, var1, var3);
          String var3Lifetime1 = "seeker_mine";
          TerrainMaskSupport.field_a = fe.a(var1, IndexedSpriteState.field_j, var3Lifetime1, true);
          String var3Lifetime2 = "rock_buster";
          ej.field_a = fe.a(var1, IndexedSpriteState.field_j, var3Lifetime2, true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ')');
        }
    }

    static {
    }
}
