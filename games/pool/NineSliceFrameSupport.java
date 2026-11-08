/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceFrameSupport {
    static UiComponent field_d;
    static LoginPayloadKind field_b;
    static String sendPmToX;
    static String waitingforGraphics;

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 == 13) {
          field_d = null;
          sendPmToX = null;
          waitingforGraphics = null;
          return;
        }
        waitingforGraphics = (String) null;
        field_d = null;
        sendPmToX = null;
        waitingforGraphics = null;
    }

    final static void initializeSocialListContainers(UiComponent friendsContainer, UiComponent ignoresContainer, int obfuscationGuard) {
        try {
          if (null == friendsContainer.children) {
            friendsContainer.children = new IntrusiveDeque();
          }
          if (ignoresContainer.children == null) {
            ignoresContainer.children = new IntrusiveDeque();
          }
          if (null == AimTarget.field_b) {
            AimTarget.field_b = new DualLinkNodeHashTable(64);
          }
          if (LoginTextSupport.field_c == null) {
            LoginTextSupport.field_c = new DualLinkNodeHashTable(64);
          }
          SoundCache.field_k = friendsContainer.children;
          QuickChatNavigationSupport.field_c = ignoresContainer.children;
          DialogLayer.clearSocialLists(-65);
          int var3_int = 107 / ((obfuscationGuard - 50) / 36);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "rp.C(" + (friendsContainer != null ? "{...}" : "null") + ',' + (ignoresContainer != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static Sprite[] buildNineSliceFrameSprites(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var25 = null;
        Sprite var26 = null;
        Sprite var27 = null;
        Sprite var28 = null;
        Sprite var29 = null;
        Sprite var30 = null;
        Sprite var24 = null;
        int var8 = 0;
        Object var14 = null;
        int[] var18 = SoftwareRasterizer.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer.width;
        int var8Lifetime1;
        if (param0 == 32450) {
          var8 = SoftwareRasterizer.height;
          var25 = new Sprite(param1, -(param1 * 2) + param3);
          var25.bindAsRenderTarget();
          SoftwareRasterizer.fillVerticalGradient(0, 0, param1, -(param1 * 2) + param3, param4, param5);
          var26 = new Sprite(param1, param1);
          var26.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param4);
          var27 = new Sprite(16, param1);
          var27.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param4);
          var28 = new Sprite(param1, param1);
          var28.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param5);
          var29 = new Sprite(16, param1);
          var29.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param5);
          var14 = null;
          if (param2 > 0) {
            var30 = new Sprite(16, 16);
            var14 = var30;
            var30.bindAsRenderTarget();
            SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param2);
          }
          SoftwareRasterizer.setTarget(var18, var7, var8);
          return new Sprite[]{var26, var27, var26, var25, (Sprite) (var14), var25, var28, var29, var28};
        }
        NineSliceFrameSupport.releaseStatics((byte) -47);
        var8Lifetime1 = SoftwareRasterizer.height;
        Sprite var19 = new Sprite(param1, -(param1 * 2) + param3);
        var19.bindAsRenderTarget();
        SoftwareRasterizer.fillVerticalGradient(0, 0, param1, -(param1 * 2) + param3, param4, param5);
        Sprite var20 = new Sprite(param1, param1);
        var20.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param4);
        Sprite var21 = new Sprite(16, param1);
        var21.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param4);
        Sprite var22 = new Sprite(param1, param1);
        var22.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param5);
        Sprite var23 = new Sprite(16, param1);
        var23.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param5);
        var14 = null;
        if (param2 > 0) {
          var24 = new Sprite(16, 16);
          var14 = var24;
          var24.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param2);
        }
        SoftwareRasterizer.setTarget(var18, var7, var8Lifetime1);
        return new Sprite[]{var20, var21, var20, var19, (Sprite) (var14), var19, var22, var23, var22};
    }

    static {
        sendPmToX = "Send private message to <%0>";
        field_b = new LoginPayloadKind(2);
        waitingforGraphics = "Waiting for graphics";
    }
}
