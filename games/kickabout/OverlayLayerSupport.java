/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class OverlayLayerSupport {
    static Calendar field_a;
    static UiLayoutNode field_b;

    final static void shutdownSharedAudio(int param0) {
        GameMediaSupport.releaseSharedAudioStream((byte) -25);
        IsaacRandom.installMusicRootStream((byte) -125);
        if (param0 != -23217) {
          field_a = (Calendar) null;
        }
    }

    final static Sprite buildStadiumSeatRow(boolean param0, int param1, byte param2) {
        IndexedSprite[] var17 = null;
        int[] var15 = null;
        Sprite var16 = null;
        IndexedSprite[] var10 = null;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var4Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        if (param2 > 94) {
          var10 = AudioOutputSupport.field_e[!param0 ? 3 : 1];
          var17 = var10;
          var4 = var10[0].field_a;
          var15 = new int[]{var10[0].field_i, var10[1].field_i, var10[2].field_i};
          var16 = new Sprite(var15[1] * param1 + var15[0] + var15[2], var4);
          PacketBuffer.pushSpriteRaster(-122, var16);
          var7 = 0;
          var10[0].draw(var7, 0);
          var7 = var7 + var15[0];
          for (var8 = 0; param1 > var8; var8++) {
            var10[1].draw(var7, 0);
            var7 = var7 + var15[1];
          }
          var17[2].draw(var7, 0);
          TeamManagementScreen.popRasterState(122);
          LoginForm.tintSpriteForSurface(var16, 20684);
          return var16;
        }
        OverlayLayerSupport.shutdownSharedAudio(-53);
        var10 = AudioOutputSupport.field_e[!param0 ? 3 : 1];
        IndexedSprite[] var14 = var10;
        var4Lifetime1 = var10[0].field_a;
        int[] var12 = new int[]{var10[0].field_i, var10[1].field_i, var10[2].field_i};
        Sprite var13 = new Sprite(var12[1] * param1 + var12[0] + var12[2], var4Lifetime1);
        PacketBuffer.pushSpriteRaster(-122, var13);
        var7Lifetime1 = 0;
        var10[0].draw(var7Lifetime1, 0);
        var7Lifetime1 = var7Lifetime1 + var12[0];
        for (var8Lifetime1 = 0; param1 > var8Lifetime1; var8Lifetime1++) {
          var10[1].draw(var7Lifetime1, 0);
          var7Lifetime1 = var7Lifetime1 + var12[1];
        }
        var14[2].draw(var7Lifetime1, 0);
        TeamManagementScreen.popRasterState(122);
        LoginForm.tintSpriteForSurface(var13, 20684);
        return var13;
    }

    final static void sendGameSetupPreferences(boolean param0, int param1, int param2, boolean param3, int param4, byte[] param5) {
        CipherPacketBuffer var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var10 = FootballerAiOverlaySupport.field_d;
          if (param0) {
            byte[] var9 = (byte[]) null;
            OverlayLayerSupport.sendGameSetupPreferences(true, 43, -115, false, -33, (byte[]) null);
          }
          var10.writeIsaacByte(param1, (byte) 120);
          var10.field_n = var10.field_n + 1;
          var7 = var10.field_n;
          var10.writeByte(124, 4);
          var10.writeByte(104, param2);
          var8 = param4;
          if (param3) {
            var8 += 128;
          }
          var10.writeByte(108, var8);
          var10.writeBytes(0, param5.length, 1991220144, param5);
          var10.backpatchByteLength(62, -var7 + var10.field_n);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "oa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void registerOverlay(boolean param0, OverlayLayer param1) {
        try {
          if (param0) {
            field_a = (Calendar) null;
          }
          UrlRequest.field_g.insertElementAt(param1, 0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "oa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static void drawSharedWidget(byte param0, boolean param1) {
        RankingsRequest.field_l.renderWidgetPassesAndTooltip(0, 0, (byte) -114);
        if (param0 > -98) {
          field_b = (UiLayoutNode) null;
        }
    }

    static {
        field_a = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }
}
