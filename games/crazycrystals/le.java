/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends ScoreModifier {
    static RgbSprite[][] field_g;

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ca var11 = null;
        CipherPacketBuffer var12 = null;
        ProfileDataRequest var13 = null;
        int[] var14 = null;
        ProfileDataRequest var15 = null;
        int[] var16 = null;
        var8 = CrazyCrystals.field_B;
        try {
          var12 = ConfirmedEmailAvailabilityValidator.field_n;
          if (param0 != 15295) {
            le.clearStaticReferences(115);
          }
          var2 = var12.readUnsignedByte(255);
          if (var2 == 0) {
            var10 = ArchiveRequest.a((byte) -93);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(255);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt((byte) -75);
            }
            var15 = (ProfileDataRequest) (pm.field_c.beginForward(32073));
            if (var15 == null) {
              jj.a(4);
              return;
            }
            var15.field_k = true;
            var15.field_g = var3;
            var15.field_f = var16[0];
            var15.unlink(false);
            return;
          }
          if (var2 == 1) {
            var11 = (ca) (gn.field_Q.beginForward(param0 ^ 18166));
            if (var11 == null) {
              jj.a(4);
              return;
            }
            var11.unlink(false);
          } else {
            if (var2 == 2) {
              var13 = (ProfileDataRequest) (pm.field_c.beginForward(param0 ^ 18166));
              if (var13 == null) {
                jj.a(param0 - 15291);
                return;
              }
              var13.field_g = ArchiveRequest.a((byte) -117);
              var13.field_k = true;
              var13.field_f = var13.field_g[0];
              var13.unlink(false);
            } else {
              wp.a((Throwable) null, "A1: " + IntrusiveNodeHashTable.a(-1815), 21862);
              jj.a(4);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.wrapClientException((Throwable) ((Object) var1), "le.B(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_g = (RgbSprite[][]) null;
        if (param0 != -1) {
          field_g = (RgbSprite[][]) null;
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (ImageProducerRasterBuffer.field_i != null) {
          return ImageProducerRasterBuffer.field_i;
        }
        if (param0 != -20) {
          le.a(-107);
        }
        return (java.applet.Applet) ((Object) BoundedRandomAccessFile.field_h);
    }

    le(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int countPlayerApplications(int param0, byte param1) {
        int var3 = 27 % ((param1 - 55) / 50);
        return ue.field_c ? 1 : 0;
    }

    static {
    }
}
