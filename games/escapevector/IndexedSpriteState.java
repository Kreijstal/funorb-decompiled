/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_d;
    static String field_c;
    static ResourceArchive field_j;
    int field_g;
    int field_h;
    static String field_b;
    static String field_e;
    int field_i;
    int field_a;
    int field_f;

    public static void releaseStatics(int guard) {
        field_c = null;
        field_j = null;
        field_e = null;
        if (guard != -26317) {
          field_c = (String) null;
        }
        field_b = null;
    }

    final static void renderLogoMeshes(int guard) {
        int var19 = EscapeVector.obfuscationControl;
        try {
          SpriteArchiveSupport.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          int var1_int = ByteStorage.logoMeshes.length;
          int[] var21 = new int[var1_int];
          int[] var20 = var21;
          int[] var2 = var20;
          for (int var3 = 0; var3 < var1_int; var3++) {
            TriangleMesh var4_ref_ia = ByteStorage.logoMeshes[var3];
            var4_ref_ia.updateBounds((byte) 49);
            LoginMethod.updateLogoMeshRotation(var3, 103);
            int var5 = var4_ref_ia.maxX + var4_ref_ia.minX >> 1;
            int var6 = var4_ref_ia.minY + var4_ref_ia.maxY >> 1;
            int var7 = var4_ref_ia.minZ + var4_ref_ia.maxZ >> 1;
            int var8 = SpriteArchiveSupport.field_a[9] >> 2;
            int var9 = SpriteArchiveSupport.field_a[10] >> 2;
            int var10_int = SpriteArchiveSupport.field_a[11] >> 2;
            int var11 = var8 * TerrainMaskSupport.field_c[3] + (var9 * TerrainMaskSupport.field_c[4] + var10_int * TerrainMaskSupport.field_c[5]) >> 14;
            int var12 = var10_int * TerrainMaskSupport.field_c[8] + TerrainMaskSupport.field_c[6] * var8 + TerrainMaskSupport.field_c[7] * var9 >> 14;
            int var13 = var8 * TerrainMaskSupport.field_c[9] + var9 * TerrainMaskSupport.field_c[10] + TerrainMaskSupport.field_c[11] * var10_int >> 14;
            var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
          }
          int var3Lifetime1 = SpriteArchiveSupport.field_a[9] >> 8;
          int var4 = SpriteArchiveSupport.field_a[10] >> 8;
          int var5Lifetime1 = SpriteArchiveSupport.field_a[11] >> 8;
          int var6Lifetime1 = SocketConnector.field_d << 4;
          int var7Lifetime1 = 0;
          int var8Lifetime1 = AccountNoticeKind.sinQ16(10758, var6Lifetime1) >> 8;
          int var9Lifetime1 = EditableTextWidget.cosQ16(-127, var6Lifetime1) >> 8;
          if (guard >= -107) {
            IndexedSpriteState.renderLogoMeshes(56);
          }
          if (GzipDecoder.field_d != -1 &&
            -1 != UiContainer.field_y) {
            var7Lifetime1 = -320 + GzipDecoder.field_d;
            var8Lifetime1 = -UiContainer.field_y + 240;
            var9Lifetime1 = -128;
          }
          double var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          int var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          int var13Lifetime1 = -var4 + var8Lifetime1;
          int var14 = -var5Lifetime1 + var9Lifetime1;
          double var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (int var15 = 0; ByteStorage.logoMeshes.length > var15; var15++) {
            int var16 = 0;
            for (int var17_int = 1; var17_int < ByteStorage.logoMeshes.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            TriangleMesh var17 = ByteStorage.logoMeshes[var16];
            LoginMethod.updateLogoMeshRotation(var16, 61);
            for (int var18 = 0; 3 > var18; var18++) {
              TerrainMaskSupport.field_c[var18] = TerrainMaskSupport.field_c[var18] + SectorCacheStore.field_c[var15][var18];
            }
            MeshProjectionSupport.projectAndBucketMesh(true, TerrainMaskSupport.field_c, false, SpriteArchiveSupport.field_a, false, true, var17);
            ShipHullGeometry.drawLitMesh(var13Lifetime1, -16711760, var7Lifetime1, var12Lifetime1, var14, var17, var9Lifetime1, var8Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "fi.F(" + guard + ')');
        }
    }

    final static void setLegacyButtonColors(LegacyButton[] buttons, int startIndex) {
        String stackIn_13_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (buttons == null) {
            return;
          }
          int[] var9 = new int[]{3170352, 8421504, 8421504};
          int[] var3 = new int[]{6340704, 16777215, 16777215};
          int[] var4 = new int[]{6340704, 16777215, 16777215};
          LegacyButton[] var5 = buttons;
          for (int var6 = startIndex; var6 < var5.length; var6++) {
            LegacyButton var7 = var5[var6];
            if (var7 != null) {
              var7.setColors(var3, var9, (byte) -122, var4);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("fi.E(");
          if (buttons == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(startIndex).append(')').toString());
        }
    }

    abstract void drawAlpha(int x, int y, int alpha);

    abstract void draw(int x, int y);

    static {
        field_b = "Name";
        field_c = "Invalid password.";
        field_e = "Player";
    }
}
