/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static MusicTrack[] field_a;
    static int field_b;

    abstract ArchiveIndex getIndex(byte param0);

    abstract int getGroupProgress(int param0, int param1);

    abstract byte[] getPackedGroup(int param0, byte param1);

    final static void createPopupSprites(Sprite[] param0, byte param1) {
        int var2_int = 0;
        int var3 = ZombieDawn.field_J;
        ReflectionQueueHelpers.field_b = param0;
        FullscreenCanvasHelpers.field_d = new Sprite(55, 130);
        if (param1 >= -58) {
          return;
        }
        try {
          FullscreenCanvasHelpers.field_d.setAsRenderTarget();
          ReflectionQueueHelpers.field_b[2].drawSilhouette(5, -5, 16777215);
          ReflectionQueueHelpers.field_b[3].drawSilhouette(5, -5, 16777215);
          Rasterizer.blurRectangle(4, 4, 0, 0, Rasterizer.width, Rasterizer.height);
          ReflectionQueueHelpers.field_b[2].drawSilhouette(5, -5, 0);
          ReflectionQueueHelpers.field_b[3].drawSilhouette(5, -5, 0);
          DialogLayerFrameHelpers.field_a = new Sprite[16];
          PowerupNames.field_c = new Sprite[DialogLayerFrameHelpers.field_a.length];
          for (var2_int = 0; var2_int < DialogLayerFrameHelpers.field_a.length; var2_int++) {
            DialogLayerFrameHelpers.field_a[var2_int] = new Sprite(200, 25);
            DialogLayerFrameHelpers.field_a[var2_int].setAsRenderTarget();
            CacheEntry.field_q.drawStringCentered(PowerupNames.getPowerupName(var2_int, 90), 100, 17, 16777215, -1);
            PowerupNames.field_c[var2_int] = SpriteEffectHelpers.createGlowOutlineSprite(DialogLayerFrameHelpers.field_a[var2_int]);
          }
          MenuScreen.field_f = QuickChatPhraseCache.createTextSprite(false, GameKeyHandler.field_c);
          AccountCreationForm.field_K = QuickChatPhraseCache.createTextSprite(false, WidgetStyleLayer.field_m);
          EditableTextWidget.field_G = QuickChatPhraseCache.createTextSprite(false, NameListEntry.field_b);
          PendingRecordRequest.field_v = QuickChatPhraseCache.createTextSprite(false, AppletHostHelpers.field_a);
          TrackedSoundStream.field_h = SpriteEffectHelpers.createGlowOutlineSprite(MenuScreen.field_f);
          DisplayState.field_i = SpriteEffectHelpers.createGlowOutlineSprite(AccountCreationForm.field_K);
          AccountCreationDialog.field_tb = SpriteEffectHelpers.createGlowOutlineSprite(EditableTextWidget.field_G);
          DropdownArrowPainter.field_b = SpriteEffectHelpers.createGlowOutlineSprite(PendingRecordRequest.field_v);
          DisplayState.field_f.makeRasterTarget(115);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "w.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != -98) {
          Sprite[] var2 = (Sprite[]) null;
          ArchiveProvider.createPopupSprites((Sprite[]) null, (byte) -72);
        }
    }

    static {
        field_a = new MusicTrack[14];
    }
}
