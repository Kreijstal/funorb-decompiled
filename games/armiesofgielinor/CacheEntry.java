/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheEntry extends DualLinkedNode {
    static int[] field_u;
    static String field_v;
    static String field_w;
    int weight;
    static String field_x;
    static String field_y;

    final static int a(String param0, gl param1, int param2, int param3, int param4, gl param5, boolean param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        PacketBuffer stackIn_10_0 = null;
        String stackIn_11_1 = null;
        PacketBuffer stackIn_13_0 = null;
        String stackIn_14_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var14 = param1.a(param2 ^ -20049);
          var8 = param5.a(-91);
          if (null == MoveAttackRequest.sessionSocket &&
            !EffectPresentation.a(false, 0)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (ov.connectionState == sg.field_a) {
            vl.outgoingPacket.position = 0;
            CampaignMenu.field_s = null;
            if (param0 != null) {
              var9 = 0;
              vd.field_b.position = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              vd.field_b.writeInt((byte) -108, CampaignMenuButton.connectionRandom.nextInt());
              vd.field_b.writeInt((byte) -52, CampaignMenuButton.connectionRandom.nextInt());
              vd.field_b.a(var14, 413740432);
              vd.field_b.a(var8, 413740432);
              var15 = (CharSequence) ((Object) param0);
              vd.field_b.a(CommunityTabGroup.a(param2 + 18820, var15), 413740432);
              vd.field_b.writeShort(true, param4);
              vd.field_b.writeByte(1, param3);
              vd.field_b.writeByte(param2 + 20033, var9);
              vl.outgoingPacket.writeByte(param2 + 20033, 18);
              vl.outgoingPacket.position = vl.outgoingPacket.position + 2;
              var10 = vl.outgoingPacket.position;
              var11_ref_String = ByteStorage.a(0, CombatEvent.d((byte) 55));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              vl.outgoingPacket.writeNullTerminatedString(var11_ref_String, param2 + 33883);
              IconLabelControl.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, vl.outgoingPacket);
              vl.outgoingPacket.f(0, -var10 + vl.outgoingPacket.position);
            } else {
              vd.field_b.position = 0;
              vd.field_b.writeInt((byte) -57, CampaignMenuButton.connectionRandom.nextInt());
              vd.field_b.writeInt((byte) -54, CampaignMenuButton.connectionRandom.nextInt());
              stackIn_10_0 = vd.field_b;
              if (!param1.a((byte) 125)) {
                stackIn_11_1 = "";
              } else {
                stackIn_11_1 = var14;
              }
              ((PacketBuffer) (Object) stackIn_10_0).a(stackIn_11_1, param2 ^ -413754288);
              stackIn_13_0 = vd.field_b;
              if (param5.a((byte) -111)) {
                stackIn_14_1 = var8;
              } else {
                stackIn_14_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_13_0).a(stackIn_14_1, 413740432);
              vl.outgoingPacket.writeByte(1, 16);
              vl.outgoingPacket.position = vl.outgoingPacket.position + 1;
              var9 = vl.outgoingPacket.position;
              IconLabelControl.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, vl.outgoingPacket);
              vl.outgoingPacket.writeByteLengthPrefix(vl.outgoingPacket.position - var9, 5930);
            }
            hb.$cfr$intArgs$a$e9dea5688aa5(54, -1);
            ov.connectionState = DirectByteStorage.field_m;
          }
          if (ov.connectionState == DirectByteStorage.field_m &&
            ConsoleTokenCursor.receivePacketBytes(param2 ^ 20080, 1)) {
            var9Lifetime1 = ByteStorage.incomingPacket.readUnsignedByte(0);
            ByteStorage.incomingPacket.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ov.connectionState = mv.field_c;
              br.field_b = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                tf.a((byte) -99, CombatEvent.d((byte) -127));
                lk.field_r = CampaignMission.field_s;
                dj.a((byte) -128);
                ev.field_b = false;
                stackIn_31_0 = var9Lifetime1;
                return stackIn_31_0;
              }
              if (var9Lifetime1 == 99) {
                ConsoleTokenCursor.receivePacketBytes(-81, qa.h(1));
                CampaignMenu.field_s = new Boolean(rr.a((byte) -76, ByteStorage.incomingPacket));
                ByteStorage.incomingPacket.position = 0;
              } else {
                fk.packetPayloadLength = -1;
                MusicCrossfadeStream.deliveredOpcode = var9Lifetime1;
                ov.connectionState = da.field_b;
              }
            }
          }
          if (mv.field_c == ov.connectionState) {
            var9Lifetime2 = 2;
            if (ConsoleTokenCursor.receivePacketBytes(-79, var9Lifetime2)) {
              var10Lifetime1 = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
              ByteStorage.incomingPacket.position = 0;
              if (ConsoleTokenCursor.receivePacketBytes(-83, var10Lifetime1)) {
                var11 = br.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  br.field_b[var12] = ByteStorage.incomingPacket.readNullCircumfixedString((byte) 121);
                }
                dj.a((byte) -128);
                ev.field_b = false;
                stackIn_44_0 = 100 + var11;
                return stackIn_44_0;
              }
            }
          }
          if (da.field_b == ov.connectionState &&
            jh.isPacketPayloadReady(2)) {
            if (MusicCrossfadeStream.deliveredOpcode == 255) {
              var9_ref_String = ByteStorage.incomingPacket.c((byte) -85);
              if (var9_ref_String != null) {
                ph.a(var9_ref_String, CombatEvent.d((byte) -5), false);
              }
            } else {
              lk.field_r = ByteStorage.incomingPacket.readNullTerminatedString(1);
            }
            dj.a((byte) -127);
            ev.field_b = false;
            stackIn_53_0 = MusicCrossfadeStream.deliveredOpcode;
            return stackIn_53_0;
          }
          if (param2 != -20032) {
            field_v = (String) null;
          }
          if (MoveAttackRequest.sessionSocket == null) {
            if (ev.field_b) {
              if (TileMetadata.b(0) > 30000L) {
                lk.field_r = gu.field_a;
              } else {
                lk.field_r = DamageEvent.field_y;
              }
              ev.field_b = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = rn.field_d;
            rn.field_d = AiPlanningStrategy.field_c;
            ev.field_b = true;
            AiPlanningStrategy.field_c = var9Lifetime3;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("uq.D(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(')').toString());
        }
    }

    abstract Object getValue(boolean obfuscationGuard);

    abstract boolean isReferenceBacked(boolean obfuscationGuard);

    public static void g(int param0) {
        if (param0 >= -11) {
          field_y = (String) null;
        }
        field_y = null;
        field_v = null;
        field_x = null;
        field_w = null;
        field_u = null;
    }

    CacheEntry(int weight) {
        this.weight = weight;
    }

    final static CoatOfArms readSignedCoatOfArms(PacketBuffer packet, boolean obfuscationGuard) {
        int var3 = 0;
        CoatOfArms var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        CoatOfArms var5 = null;
        CoatOfArms stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = new CoatOfArms();
          var2 = var5;
          if (obfuscationGuard) {
            CacheEntry.g(56);
          }
          for (var3 = 0; var3 < 6; var3++) {
            var5.parts[var3] = packet.readByte((byte) 103);
            var5.colourIndices[var3] = packet.readByte((byte) 120);
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("uq.E(");
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_u = new int[8192];
        field_w = "Chat view has been scrolled up. Scroll down to chat.";
        field_v = "Fast";
        field_x = "<%0> is not on your ignore list.";
        field_y = "Show chat (1 unread message)";
    }
}
