/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu extends BitmapTextWidgetPainter {
    private RgbSprite[] field_v;
    private int field_y;
    private int field_x;
    static int[] field_z;
    private int field_u;
    static String field_w;

    public static void a(int param0) {
        field_z = null;
        if (param0 != -26601) {
          return;
        }
        field_w = null;
    }

    final static CampaignDefinition loadCampaign(int obfuscationGuard, ResourceArchive archive, int campaignIndex) {
        CampaignDefinition stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        CipherPacketBuffer packet = null;
        String campaignName = null;
        int localGodId = 0;
        String localPlayerName = null;
        String description = null;
        int[] initialUnitTypes = null;
        CampaignDefinition campaign = null;
        int participantCount = 0;
        int participantIndexThenOverrideCount = 0;
        int overrideIndexThenMissionCount = 0;
        RuntimeException var13_ref_RuntimeException = null;
        int participantThenMissionIndex = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        CampaignParticipant decodedParticipant = null;
        CampaignParticipant[] participants = null;
        CampaignParticipant participant = null;
        CampaignMission decodedMission = null;
        byte[] var23 = null;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var23 = archive.getFileByName("missions", -91, gk.field_O[campaignIndex]);
          var18 = var23;
          var17 = var18;
          var3 = var17;
          packet = new CipherPacketBuffer(var23);
          campaignName = packet.readNullCircumfixedString((byte) 121);
          localGodId = packet.readUnsignedByte(obfuscationGuard - 23948);
          localPlayerName = packet.readNullCircumfixedString((byte) 121);
          description = packet.readNullCircumfixedString((byte) 121);
          initialUnitTypes = ev.readNullableUnsignedByteArray(packet, (byte) -98);
          campaign = new CampaignDefinition(campaignName);
          campaign.description = description;
          campaign.campaignIndex = campaignIndex;
          campaign.localPlayerName = localPlayerName;
          campaign.localGodId = localGodId;
          campaign.initialUnitTypes = initialUnitTypes;
          cd.campaigns[campaignIndex] = campaign;
          participantCount = packet.readUnsignedByte(obfuscationGuard - 23948);
          campaign.participants = new CampaignParticipant[participantCount];
          for (participantIndexThenOverrideCount = 0; participantCount > participantIndexThenOverrideCount; participantIndexThenOverrideCount++) {
            try {
              decodedParticipant = ResourceRequest.readCampaignParticipant(900, campaign, packet);
              campaign.participants[decodedParticipant.participantId] = decodedParticipant;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var13_ref_RuntimeException = decompiledCaughtException;
            }
          }
          participantIndexThenOverrideCount = packet.readUnsignedByte(0);
          for (overrideIndexThenMissionCount = 0; overrideIndexThenMissionCount < participantIndexThenOverrideCount; overrideIndexThenMissionCount++) {
            TickCounter.readCampaignUnitOverride(campaign, (byte) -7, packet);
          }
          participants = campaign.participants;
          participantThenMissionIndex = 0;
          if (obfuscationGuard != 23948) {
            nu.a(49L, 110);
          }
          while (participantThenMissionIndex < participants.length) {
            participant = participants[participantThenMissionIndex];
            if (0 == participant.overrideCount) {
              participant.unitOverrides = null;
            }
            participantThenMissionIndex++;
          }
          overrideIndexThenMissionCount = packet.readUnsignedByte(0);
          campaign.missions = new CampaignMission[overrideIndexThenMissionCount];
          for (participantThenMissionIndex = 0; overrideIndexThenMissionCount > participantThenMissionIndex; participantThenMissionIndex++) {
            try {
              decodedMission = BattleCharacter.readCampaignMission(campaign, packet, archive, (byte) -73);
              campaign.missions[decodedMission.missionId] = decodedMission;
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = decompiledCaughtException;
              System.out.println("Error reading mission: " + var15);
              var15.printStackTrace();
            }
          }
          packet.l(obfuscationGuard ^ 24048);
          stackIn_24_0 = campaign;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var3_ref = decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("nu.A(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(campaignIndex).append(')').toString());
        }
    }

    public nu() {
        this(2188450, 2591221, 9543);
    }

    final static void a(long param0, int param1) {
        if (param0 <= (long)param1) {
          return;
        }
        if (param0 % 10L == 0L) {
          SocketResourceClient.a(-1L + param0, 116);
          SocketResourceClient.a(1L, param1 ^ 125);
        } else {
          SocketResourceClient.a(param0, 53);
        }
    }

    final static ResourceArchive a(int param0, boolean param1) {
        if (!param1) {
          nu.a(-81L, -76);
        }
        return tk.a(param0, true, 1, false, false, 1);
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        Widget var9 = null;
        try {
          if (!widget.field_t) {
            stackIn_6_0 = (widget.a(false)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (widget instanceof fw) {
            renderFlag = renderFlag & ((fw) (widget)).field_I;
          }
          if (obfuscationGuard > -79) {
            var9 = (Widget) null;
            this.paintWidget((Widget) null, 31, -37, true, 10);
          }
          if (!renderFlag) {
            stackIn_16_0 = this.field_y;
          } else {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_u;
            } else {
              stackIn_16_0 = this.field_x;
            }
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (!renderFlag) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          AdaptiveMidiPcmStream.a(var7, this.field_v, widget.width, originX + widget.x, widget.y + originY + (-this.field_v[0].canvasHeight + widget.height >> 1), -3225);
          this.font.drawParagraph(widget.text, widget.x + originX, originY + widget.y - 2, widget.width, widget.height, var8, -1, 1, 1, this.font.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("nu.C(");
          if (widget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    private nu(int param0, int param1, int param2) {
        this.field_x = param0;
        this.field_v = NodeIterator.field_b;
        this.field_u = param1;
        this.font = CipherPacketBuffer.field_t;
        this.field_y = param2;
    }

    static {
        CachedArchiveProvider.a((byte) -81, 50);
        field_z = new int[]{20, 10, 5};
        field_w = "Store";
    }
}
