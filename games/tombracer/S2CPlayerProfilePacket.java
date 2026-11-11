/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CPlayerProfilePacket implements GamePacket {
    private PlayerProfile profile;
    static apa field_b;

    public final void encode(int param0, BitPacketBuffer param1) {
        if (param0 != 200) {
          return;
        }
        try {
          this.profile.encode(-2016804080, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "aoa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void fadeMusicChannelOut(int param0, int param1) {
        if (param0 < 38) {
          return;
        }
        if (null == MenuEntry.field_j) {
          return;
        }
        int var2 = (int)(LegacyOpenGlSpriteTexture.field_w[param1] * 20000.0);
        if (var2 == 0) {
          var2 = 1;
        }
        ((FadingMidiPcmStream) (RewardChoicePhase.field_n.field_n)).rampChannelVolumeSamples(-30515, 0, var2, param1);
    }

    final static void b(boolean param0) {
        wt.a((byte) 126);
        jsa.a(false, 4);
        if (!param0) {
          S2CPlayerProfilePacket.b(false);
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        int var1 = 20 % ((-9 - param0) / 59);
    }

    final PlayerProfile getProfile(boolean param0) {
        if (param0) {
          this.profile = (PlayerProfile) null;
          return this.profile;
        }
        return this.profile;
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        try {
          this.profile = new PlayerProfile();
          this.profile.decode(param0, (byte) 122);
          if (param1 != -19) {
            field_b = (apa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "aoa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
