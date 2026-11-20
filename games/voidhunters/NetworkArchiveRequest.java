/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    PacketBuffer buffer;
    int blockPosition;
    static int field_o;
    byte padding;
    static String field_s;

    public static void clearSharedReferences(byte param0) {
        field_s = null;
        if (param0 != 114) {
          NetworkArchiveRequest.clearSharedReferences((byte) -103);
        }
    }

    final byte[] getData(int param0) {
        int var2;
        if (this.pending) {
          throw new RuntimeException();
        }
        if (this.buffer.position < this.buffer.payload.length - this.padding) {
          throw new RuntimeException();
        }
        var2 = 9 / ((17 - param0) / 58);
        return this.buffer.payload;
    }

    final static void activatePublicChatInput(int param0) {
        SetFightersPerPlayerMaximum.chatInputActive = true;
        NetworkMessageState.chatChannel = 0;
        if (param0 != 1) {
          field_o = -76;
        }
    }

    final static void loadLogoMeshes(ResourceArchive param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        LogoMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        int var9 = 0;
        IsaacPacketBuffer var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          var8 = new IsaacPacketBuffer(param0.fetchNamedFile("", true, "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) -87);
          var10.beginBitRead(-23497);
          SettingsChangeFactory.logoMaterials = MapClearanceCircleFactory.decodeLogoMaterials(var10, (byte) -122);
          SetMachineGunFireForce.logoMeshCenters = new int[var3][];
          SetMissileLauncherFireForce.logoMeshes = new LogoMesh[var3];
          for (var4 = 0; var3 > var4; var4++) {
            SetMissileLauncherFireForce.logoMeshes[var4] = GetBuildViewAutozoomTimeout.decodeLogoMesh(var8, (byte) -105);
          }
          var10.endBitRead((byte) -79);
          var9 = 0;
          var4Lifetime1 = var9;
          if (param1 != 36) {
            return;
          }
          while (var9 < var3) {
            var5 = SetMissileLauncherFireForce.logoMeshes[var9];
            var5.scale(-21227, 6, 6, 6, 1);
            var5.calculateBounds(param1 + 83);
            var6 = new int[]{var5.maxX + var5.minX >> 1, var5.maxY + var5.minY >> 1, var5.minZ + var5.maxZ >> 1};
            SetMachineGunFireForce.logoMeshCenters[var9] = var6;
            var5.translate(param1 - 45, -var6[2], -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("km.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void prepareReconnectUi(byte param0) {
        if (param0 != -119) {
          NetworkArchiveRequest.clearSharedReferences((byte) 33);
        }
        if (GetSpinningBladeAimspeed.field_q == 10) {
          SpawnChoice.showReconnectStatusDialog(param0 ^ -108);
          GetSpinningBladeAimspeed.field_q = 11;
        } else {
          if (!SetAutoaim.b(true)) {
            SpawnChoice.showReconnectStatusDialog(param0 ^ -108);
            GetSpinningBladeAimspeed.field_q = 11;
          }
        }
        OpenGlFaceAttachmentState.field_a = true;
    }

    NetworkArchiveRequest() {
    }

    final int getLoadPercent(byte param0) {
        if (null == this.buffer) {
          return 0;
        }
        if (param0 != -4) {
          return -96;
        }
        return this.buffer.position * 100 / (this.buffer.payload.length - this.padding);
    }

    static {
        field_o = 5;
        field_s = "External ship design loaded";
    }
}
