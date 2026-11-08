/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoRenderHelpers extends IntrusiveNode {
    static ModelMesh field_k;
    static String field_i;
    static SpriteWidget field_h;
    static String field_g;
    static String hotseatmenulabel;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_i = null;
        field_g = null;
        field_h = null;
        hotseatmenulabel = null;
        int var1 = 84 / ((56 - param0) / 52);
    }

    final static void buildLogoModelFrame(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        TriangleMesh var4_ref_wm = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        TriangleMesh var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          MouseHandlerSupport.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ProxySocketConnector.field_n.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_wm = ProxySocketConnector.field_n[var3];
            var4_ref_wm.ensureBounds((byte) 127);
            LogoAndLoginHelpers.computeLogoPieceRotation((byte) 87, var3);
            var5 = var4_ref_wm.field_C + var4_ref_wm.field_U >> 1;
            var6 = var4_ref_wm.field_T + var4_ref_wm.field_g >> 1;
            var7 = var4_ref_wm.field_p + var4_ref_wm.field_L >> 1;
            var8 = MouseHandlerSupport.field_a[9] >> 2;
            var9 = MouseHandlerSupport.field_a[10] >> 2;
            var10_int = MouseHandlerSupport.field_a[11] >> 2;
            var11 = var9 * SectorCacheStore.field_c[4] + (SectorCacheStore.field_c[3] * var8 + SectorCacheStore.field_c[5] * var10_int) >> 14;
            var12 = SectorCacheStore.field_c[8] * var10_int + var9 * SectorCacheStore.field_c[7] + SectorCacheStore.field_c[6] * var8 >> 14;
            var13 = var9 * SectorCacheStore.field_c[10] + (SectorCacheStore.field_c[9] * var8 + var10_int * SectorCacheStore.field_c[11]) >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var6 * var12 >> 16;
          }
          var3Lifetime1 = MouseHandlerSupport.field_a[9] >> 8;
          var4 = MouseHandlerSupport.field_a[10] >> 8;
          var5Lifetime1 = MouseHandlerSupport.field_a[param0] >> 8;
          var6Lifetime1 = DualLinkHashTable.field_e << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = UiTheme.sineLookup(var6Lifetime1, 32) >> 8;
          var9Lifetime1 = TextDecodeHelpers.cosineLookup(21855, var6Lifetime1) >> 8;
          if (StatefulWidgetPainter.field_u != -1 &&
            IconTextComponent.field_Jb != -1) {
            var8Lifetime1 = 240 - IconTextComponent.field_Jb;
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + StatefulWidgetPainter.field_u;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < ProxySocketConnector.field_n.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ProxySocketConnector.field_n.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = ProxySocketConnector.field_n[var16];
            LogoAndLoginHelpers.computeLogoPieceRotation((byte) 104, var16);
            for (var18 = 0; var18 < 3; var18++) {
              SectorCacheStore.field_c[var18] = SectorCacheStore.field_c[var18] + ClientServiceHelpers.field_f[var15][var18];
            }
            NameEntryPopup.projectMeshAndRenderFaces(SectorCacheStore.field_c, true, true, var17, false, MouseHandlerSupport.field_a, false);
            ArrayWidgetContainer.shadeAndDrawMesh(var13Lifetime1, var7Lifetime1, var14, var12Lifetime1, var17, var9Lifetime1, var8Lifetime1, -22085);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "cm.D(" + param0 + ')');
        }
    }

    private LogoRenderHelpers() throws Throwable {
        throw new Error();
    }

    final static void drawClientToCanvas(java.awt.Canvas param0, byte param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (10 > PlayerContextMenu.field_n) {
            var3_int = 0;
            if (DraggableWidget.field_K) {
              var3_int = 1;
              DraggableWidget.field_K = false;
            }
            NetworkArchiveRequest.drawAwtLoadingBar(ThreeSliceButtonPainter.field_v, var3_int != 0, TriangleMesh.getLoadingStatusText((byte) 98), TextFieldValidator.getCommonUiLoadProgress(11108), param1 ^ 83);
          } else {
            if (PopupMenuHelpers.isIntroAnimationFinished(param1 ^ -45)) {
              if (NodeHashTableIterator.field_l == 0) {
                DualLinkNode.drawDimmedBackground(false, (byte) 119, param2);
                CanvasPresentHelpers.drawRasterToCanvas(-30179, param0, 0, 0);
              } else {
                ConditionalTextValue.drawLoadingScreen((byte) 114, param0);
              }
            } else {
              Rasterizer.clear();
              CameraAndLogoHelpers.drawLogoAnimation(240, 0, 320);
              CanvasPresentHelpers.drawRasterToCanvas(-30179, param0, 0, 0);
            }
          }
          if (param1 != -47) {
            field_h = (SpriteWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("cm.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void sendJoinRequest(byte param0, int param1, int param2) {
        CipherPacketBuffer var3 = IterableNodeHashTable.field_g;
        var3.writeCipheredOpcode(param2, 8);
        var3.writeByte(3, param0 ^ 82);
        var3.writeByte(8, -76);
        if (param0 != 20) {
          return;
        }
        var3.writeShort((byte) -107, param1);
    }

    static {
        field_g = "Unrated game";
        field_i = "Public";
        hotseatmenulabel = "Hotseat/Singleplayer";
    }
}
