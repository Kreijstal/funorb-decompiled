/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResourceRequest extends DualLinkedNode {
    boolean requestFlag;
    static String[] field_u;
    static String field_v;
    static ResourceArchive field_A;
    static int field_y;
    volatile boolean pending;
    boolean field_w;

    public static void e(byte param0) {
        field_v = null;
        if (param0 >= -11) {
          field_y = 76;
          field_u = null;
          field_A = null;
          return;
        }
        field_u = null;
        field_A = null;
    }

    abstract byte[] getBytes(byte obfuscationGuard);

    abstract int getProgress(int obfuscationGuard);

    final static CampaignParticipant readCampaignParticipant(int obfuscationGuard, CampaignDefinition campaign, PacketBuffer packet) {
        CampaignParticipant var3 = null;
        RuntimeException var3_ref = null;
        CampaignParticipant stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 900) {
            ResourceRequest.e((byte) 15);
          }
          var3 = new CampaignParticipant();
          var3.participantId = packet.readUnsignedByte(0);
          var3.displayName = packet.readNullCircumfixedString((byte) 121);
          var3.availableUnitTypes = RasterViewportResizeHandler.readNullableUnsignedByteArray(packet, (byte) -98);
          var3.coatOfArms = CacheEntry.readSignedCoatOfArms(packet, false);
          var3.godFavourLevels = gt.readSixUnsignedBytes(-2, packet);
          var3.equippedSpellIds = DateInputWidget.readUnsignedByteArray(packet, (byte) -24);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ks.F(").append(obfuscationGuard).append(',');
          if (campaign == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(ModelMeshBase param0, boolean param1, int param2, AnimationPlayer param3, int param4, int param5, int param6, MeshData param7, int param8) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var9_int = 0;
          if (param8 != -10374) {
            field_u = (String[]) null;
          }
          var10 = param5;
          var11 = 1024;
          var12 = 2048;
          var13 = 12;
          var14 = var12 - var12 / var13;
          var15 = 0;
          stackIn_5_0 = (param1) ? 900 : 800;
          var16 = stackIn_5_0;
          var17 = -1400;
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(40 + param6, 60 + param2);
          if (param7 == null &&
            param0 == null) {
            return;
          }
          if (param0 == null) {
            param0 = param7.createModel(SummonAction.field_x, fm.field_a, var15, var16, var17);
          }
          if (param3 != null) {
            param0 = param3.applyCurrentFrame(false, true, false, param0);
          }
          param0.scaleGeometry(param4, param4, param4);
          param0.a(var9_int, var10, var11, var14, var15, var16, var17, -1L);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_18_0 = var9;
          stackIn_18_1 = new StringBuilder().append("ks.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param8).append(')').toString());
        }
    }

    ResourceRequest() {
        this.pending = true;
    }

    static {
        field_v = "Log in";
    }
}
