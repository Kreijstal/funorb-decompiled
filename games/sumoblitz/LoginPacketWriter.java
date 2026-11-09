/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPacketWriter {
    static int field_a;

    final static void sendLoginPacket(boolean reconnect, boolean jagexHosted, int guard, int affiliateId, LoginCredentials credentials) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        LoginCredentials var8 = null;
        try {
          RendererSession.isaacSeed[0] = NanoTickClock.field_d.nextInt();
          if (guard != -12793) {
            var8 = (LoginCredentials) null;
            LoginPacketWriter.sendLoginPacket(true, true, -109, -21, (LoginCredentials) null);
          }
          RendererSession.isaacSeed[1] = NanoTickClock.field_d.nextInt();
          RendererSession.isaacSeed[2] = (int)(HardwareUnlitEffect.field_g >> 32);
          SoftLruCache.field_e.position = 0;
          RendererSession.isaacSeed[3] = (int)HardwareUnlitEffect.field_g;
          SoftLruCache.field_e.writeInt(48, RendererSession.isaacSeed[0]);
          SoftLruCache.field_e.writeInt(48, RendererSession.isaacSeed[1]);
          SoftLruCache.field_e.writeInt(48, RendererSession.isaacSeed[2]);
          SoftLruCache.field_e.writeInt(48, RendererSession.isaacSeed[3]);
          StrongCacheReference.writeRandomSeed(SoftLruCache.field_e, true);
          SoftLruCache.field_e.writeShort(guard + 12917, affiliateId);
          credentials.writeCredentials(SoftLruCache.field_e, (byte) -113);
          InwardSparkParticle.outgoingPacket.position = 0;
          if (reconnect) {
            InwardSparkParticle.outgoingPacket.writeByte((byte) 89, 18);
          } else {
            InwardSparkParticle.outgoingPacket.writeByte((byte) 96, 16);
          }
          InwardSparkParticle.outgoingPacket.position = InwardSparkParticle.outgoingPacket.position + 2;
          var5_int = InwardSparkParticle.outgoingPacket.position;
          InwardSparkParticle.outgoingPacket.writeInt(48, MidiNoteMixer.field_p);
          InwardSparkParticle.outgoingPacket.writeLong(false, MouseInputShutdown.field_b);
          var6 = 0;
          if (NineSlicePanel.field_a) {
            var6 = var6 | 1;
          }
          if (ArchiveLoadRequirement.field_d) {
            var6 = var6 | 4;
          }
          if (jagexHosted) {
            var6 = var6 | 8;
          }
          if (SoftwareRenderContext.requestedDisplayName != null) {
            var6 = var6 | 16;
          }
          InwardSparkParticle.outgoingPacket.writeByte((byte) 108, var6);
          var7 = DropDownLabelRenderer.readAppletSettings(-22, LegacyOpenGlUnlitEffect.activeApplet(2));
          if (var7 == null) {
            var7 = "";
          }
          InwardSparkParticle.outgoingPacket.writeCp1252String(var7, (byte) -106);
          if (SoftwareRenderContext.requestedDisplayName != null) {
            InwardSparkParticle.outgoingPacket.writeCircumfixedString(SoftwareRenderContext.requestedDisplayName, (byte) 19);
          }
          HardwareTurbulentWaterNoise.writeRsaXteaEnvelope(AccountRsaModulus.modulus, OpenGlShaderProgram.field_c, false, InwardSparkParticle.outgoingPacket, SoftLruCache.field_e);
          InwardSparkParticle.outgoingPacket.patchShortLength(guard + 12793, InwardSparkParticle.outgoingPacket.position - var5_int);
          MessageDialog.flushAccountWrites(guard + 12793, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("fb.A(").append(reconnect).append(',').append(jagexHosted).append(',').append(guard).append(',').append(affiliateId).append(',');
          if (credentials == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
    }
}
