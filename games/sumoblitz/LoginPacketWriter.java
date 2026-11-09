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
          StrongCacheReference.a(SoftLruCache.field_e, true);
          SoftLruCache.field_e.writeShort(guard + 12917, affiliateId);
          credentials.writeCredentials(SoftLruCache.field_e, (byte) -113);
          InwardSparkParticle.field_v.position = 0;
          if (reconnect) {
            InwardSparkParticle.field_v.writeByte((byte) 89, 18);
          } else {
            InwardSparkParticle.field_v.writeByte((byte) 96, 16);
          }
          InwardSparkParticle.field_v.position = InwardSparkParticle.field_v.position + 2;
          var5_int = InwardSparkParticle.field_v.position;
          InwardSparkParticle.field_v.writeInt(48, MidiNoteMixer.field_p);
          InwardSparkParticle.field_v.writeLong(false, jm.field_b);
          var6 = 0;
          if (qn.field_a) {
            var6 = var6 | 1;
          }
          if (gn.field_d) {
            var6 = var6 | 4;
          }
          if (jagexHosted) {
            var6 = var6 | 8;
          }
          if (SoftwareRenderContext.field_b != null) {
            var6 = var6 | 16;
          }
          InwardSparkParticle.field_v.writeByte((byte) 108, var6);
          var7 = DropDownLabelRenderer.readAppletSettings(-22, LegacyOpenGlUnlitEffect.c(2));
          if (var7 == null) {
            var7 = "";
          }
          InwardSparkParticle.field_v.writeCp1252String(var7, (byte) -106);
          if (SoftwareRenderContext.field_b != null) {
            InwardSparkParticle.field_v.writeCircumfixedString(SoftwareRenderContext.field_b, (byte) 19);
          }
          HardwareTurbulentWaterNoise.a(gh.field_a, OpenGlShaderProgram.field_c, false, InwardSparkParticle.field_v, SoftLruCache.field_e);
          InwardSparkParticle.field_v.patchShortLength(guard + 12793, InwardSparkParticle.field_v.position - var5_int);
          MessageDialog.a(guard + 12793, -1);
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
