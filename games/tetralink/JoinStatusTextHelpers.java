/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JoinStatusTextHelpers {
    static long field_f;
    static UrlFetchTask field_g;
    static int field_h;
    static String field_b;
    static ModelData field_c;
    static int[] field_e;
    static String field_d;
    static int[] field_a;
    static String field_i;

    final static String describeGameJoinStatus(byte param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (1 == param1) {
            stackIn_2_0 = SectorCacheStore.formatTemplate(new String[]{param2}, DualLinkNodeHashTable.field_k, 121);
            return stackIn_2_0;
          }
          if (param1 == 2) {
            stackIn_5_0 = SectorCacheStore.formatTemplate(new String[]{param2}, LabelPairWidget.field_Mb, 127);
            return stackIn_5_0;
          }
          if (param1 == 3) {
            stackIn_8_0 = SectorCacheStore.formatTemplate(new String[]{param2}, EmailAvailabilityValidator.field_z, 124);
            return stackIn_8_0;
          }
          if (param1 == 4) {
            stackIn_11_0 = SectorCacheStore.formatTemplate(new String[]{param2}, RsaKeyAndTextGlobals.field_d, 125);
            return stackIn_11_0;
          }
          if (param1 == 5) {
            stackIn_15_0 = SectorCacheStore.formatTemplate(new String[]{param2}, ErrorPrintHelpers.field_f, 120);
            return stackIn_15_0;
          }
          if (param1 == 6) {
            stackIn_18_0 = SectorCacheStore.formatTemplate(new String[]{param2}, CameraAndChatHelpers.field_d, 124);
            return stackIn_18_0;
          }
          if (param1 == 7) {
            stackIn_22_0 = SectorCacheStore.formatTemplate(new String[]{param2}, LoginCredentials.field_c, 119);
            return stackIn_22_0;
          }
          if (param1 == 8) {
            stackIn_26_0 = SectorCacheStore.formatTemplate(new String[]{param2}, field_i, 121);
            return stackIn_26_0;
          }
          if (param0 < 95) {
            JoinStatusTextHelpers.renderLogoGlow(-15);
          }
          if (param1 == 11) {
            stackIn_32_0 = SectorCacheStore.formatTemplate(new String[]{param2}, FontAndBrightnessHelpers.field_d, 123);
            return stackIn_32_0;
          }
          if (param1 == 12) {
            stackIn_35_0 = SectorCacheStore.formatTemplate(new String[]{param2}, SoundMixerHelpers.field_a, 126);
            return stackIn_35_0;
          }
          if (param1 != 13) {
            return null;
          }
          stackIn_39_0 = SectorCacheStore.formatTemplate(new String[]{param2}, ConditionalTextValue.field_e, 120);
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("af.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static QueuedListRequest findOrSendListRequest(int param0, byte param1, int param2, int param3) {
        QueuedListRequest var4;
        int var5;
        int var6;
        QueuedListRequest var4Lifetime1;
        var6 = TetraLink.field_J;
        var4 = (QueuedListRequest) (DelayedIncomingPacket.field_p.first(false));
        var5 = 90 / ((-53 - param1) / 40);
        while (var4 != null) {
          if (param0 == var4.field_n) {
            return var4;
          }
          var4 = (QueuedListRequest) (DelayedIncomingPacket.field_p.next((byte) -70));
        }
        var4Lifetime1 = new QueuedListRequest();
        var4Lifetime1.field_n = param0;
        var4Lifetime1.field_q = param3;
        DelayedIncomingPacket.field_p.addLast(var4Lifetime1, false);
        DiskArchiveRequest.writeEntryRequestPacket(-68, param2, var4Lifetime1);
        return var4Lifetime1;
    }

    final static void renderLogoGlow(int param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        try {
          var1 = new Sprite(540, 140);
          SectorCacheStore.setRasterTarget((byte) 110, var1);
          TriangleRasterizer.useRasterClip();
          SoftwareRasterizer.clear();
          SingleChildWidget.field_K = 0;
          Js5ArchiveManager.buildLogoModelFrame((byte) 71);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          IndexedSpriteState.field_e.makeRasterTarget();
          var1.drawHalfSize(0, 0);
          if (param0 != 18428) {
            field_d = (String) null;
          }
          LruTextureCache.popRaster(-581);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "af.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_d = null;
        field_i = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_e = null;
        if (param0 > -70) {
          JoinStatusTextHelpers.releaseStatics(6);
        }
    }

    static {
        field_d = "Reject";
        field_i = "<%0> has declined the invitation.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_a = new int[]{1, 1, 1, 1, 2, 1, 1, 2};
        field_e = new int[128];
    }
}
