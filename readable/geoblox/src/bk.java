/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static Sprite boardOwnershipRaster;
    static Sprite field_b;
    static String loginUsernameText;

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
            loginUsernameText = null;
            boardOwnershipRaster = null;
            return;
        }
        field_b = (Sprite) null;
        field_b = null;
        loginUsernameText = null;
        boardOwnershipRaster = null;
    }

    final static void a(ResourceArchive param0, int param1, int param2, PcmStreamMixer param3) {
        try {
            DiskCacheWorker.logoStartDelayTicks = param1 * sb.a(true) / 1000;
            EntityMotionSupport.a(99, param0);
            MessageDialogContent.loadLogoMeshesAndMaterials(param0, 0);
            if (param2 < 97) {
                bk.a(true, -54);
            }
            ul.a(-21541, param0);
            jk.b((byte) -91);
            MidiNoteMixer.a((byte) -32);
            DequeCursor.logoAnimationTick = -DiskCacheWorker.logoStartDelayTicks + 0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static ClientSessionSnapshot a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        PacketBuffer var8 = null;
        TextTemplateDefinition var9 = null;
        var7 = Geoblox.clientControlFlowFlag;
        var8 = eh.field_d;
        var3 = var8.readUnsignedByte((byte) 34);
        StrongCacheReference.field_u = var3 & 127;
        stackIn_3_0 = !((param1 & var3) == 0);
        ClientSessionSnapshot.field_l = stackIn_3_0;
        ArchiveIndex.field_s = var8.readUnsignedByte((byte) 34);
        DiskCacheWorker.field_c = var8.readLongBE(2901);
        if (StrongCacheReference.field_u != 2) {
          UsernameAvailabilityValidator.field_o = 0;
          tj.field_b = 0;
        } else {
          tj.field_b = var8.readUnsignedShortBE(true);
          UsernameAvailabilityValidator.field_o = var8.readUnsignedMediumBE(105);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        FrameTimer.field_a = var8.readNullTerminatedText((byte) 117);
        if (var4 == 0) {
          AvatarFeedbackSupport.field_b = FrameTimer.field_a;
        } else {
          AvatarFeedbackSupport.field_b = var8.readNullTerminatedText((byte) 124);
        }
        if (StrongCacheReference.field_u == 1) {
          var8.readUnsignedShortBE(true);
          var8.readNullTerminatedText((byte) 112);
        } else {
          if (StrongCacheReference.field_u == 4) {
            var8.readUnsignedShortBE(true);
            var8.readNullTerminatedText((byte) 112);
          }
        }
        if (!param0) {
          RankedListQuery.field_f = PrefixCodeDecoder.readCompressedText(var8, 0, 80);
          vj.field_c = null;
          return new ClientSessionSnapshot(param0);
        }
        var5 = var8.readUnsignedShortBE(true);
        try {
          var9 = StatefulWidgetRenderer.field_r.getDefinition((byte) -14, var5);
          RankedListQuery.field_f = var9.summarizeLiteralSegments((byte) -69);
          if (!AvatarFeedbackSupport.field_b.equals(SecondaryDeque.field_f)) {
            stackIn_22_0 = var9.referencedTemplateIds;
          } else {
            stackIn_22_0 = null;
          }
          vj.field_c = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          IterableNodeHashTable.a((Throwable) ((Object) var6), "CC1", (byte) 125);
          vj.field_c = null;
          RankedListQuery.field_f = null;
          return new ClientSessionSnapshot(param0);
        }
        return new ClientSessionSnapshot(param0);
    }

    static {
        boardOwnershipRaster = new Sprite(640, 640);
        loginUsernameText = "Username: ";
    }
}
