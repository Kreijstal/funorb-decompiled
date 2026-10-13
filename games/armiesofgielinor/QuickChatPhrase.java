/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhrase extends DualLinkedNode {
    static int field_w;
    static String field_v;
    int[] linkedPhraseIds;
    private int[][] commandArguments;
    static RgbSprite field_D;
    static String field_y;
    private String[] textFragments;
    static int field_C;
    private int[] commandIds;
    static String field_x;

    final static void a(int param0, MusicTrack param1) {
        try {
          DropTargetWidgetContainer.a((byte) -93, true, param1);
          if (param0 != 2) {
            QuickChatPhrase.getCampaignMission(87, 100, -49);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ar.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyGlobalIds(boolean obfuscationGuard) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.linkedPhraseIds != null) {
          for (var2 = 0; this.linkedPhraseIds.length > var2; var2++) {
            this.linkedPhraseIds[var2] = oe.bitwiseOr(this.linkedPhraseIds[var2], 32768);
          }
        }
        if (!obfuscationGuard) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.decodeOpcode((byte) -5, 7, (PacketBuffer) null);
        }
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2 != -115) {
          QuickChatPhrase.e((byte) -15);
        }
        if (param1) {
          var4++;
        }
        return cp.field_b[var4];
    }

    final static CampaignMission getCampaignMission(int campaignIndex, int missionIndex, int minimumMissionIndex) {
        CampaignDefinition var4 = br.getCampaign(campaignIndex, (byte) -14);
        CampaignDefinition var3 = var4;
        if (var3 == null) {
          return null;
        }
        if (missionIndex < minimumMissionIndex) {
          return null;
        }
        if (missionIndex >= var3.missions.length) {
          return null;
        }
        return var4.missions[missionIndex];
    }

    final static void a(RgbSprite[][] param0, int[] param1, byte param2, byte[] param3, int param4, ResourceArchive param5, ResourceArchive param6, byte[] param7, String[] param8, int[] param9, boolean param10, int param11, String[][] param12, IndexedSprite[] param13, ResourceArchive param14, String[][] param15, RgbSprite[][] param16) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          tv.a(param13, param7, param0, param1, param14, param16, 1, param5, param4, false, param15, param12, param11, param8, param3, (String[]) null, param10, param6, param9);
          var17_int = -18 / ((param2 + 15) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_4_0 = var17;
          stackIn_4_1 = new StringBuilder().append("ar.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param9 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param13 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param16 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void decode(PacketBuffer packet, byte obfuscationGuard) {
        int opcode = 0;
        int obfuscationControl = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 91) {
            return;
          }
          while (true) {
            opcode = packet.readUnsignedByte(0);
            if (opcode == 0) {
              return;
            }
            this.decodeOpcode((byte) -96, opcode, packet);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ar.A(");
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String getPreviewText(byte obfuscationGuard) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.textFragments == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.textFragments[0]);
        for (var3 = 1; this.textFragments.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.textFragments[var3]);
        }
        if (obfuscationGuard != 97) {
          field_D = (RgbSprite) null;
        }
        return var2.toString();
    }

    public static void e(byte param0) {
        if (param0 != -74) {
          field_C = 84;
        }
        field_v = null;
        field_x = null;
        field_y = null;
        field_D = null;
    }

    QuickChatPhrase() {
    }

    private final void decodeOpcode(byte obfuscationGuard, int opcode, PacketBuffer packet) {
        int[] array$0 = null;
        int argumentIndex = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int guardRemainder = 0;
        RuntimeException var4 = null;
        int entryCount = 0;
        int entryIndex = 0;
        int commandId = 0;
        QuickChatCommandDefinition command = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          guardRemainder = -110 % ((13 - obfuscationGuard) / 56);
          if (opcode != 1) {
            if (opcode == 2) {
              entryCount = packet.readUnsignedByte(0);
              this.linkedPhraseIds = new int[entryCount];
              for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                this.linkedPhraseIds[entryIndex] = packet.readUnsignedShort((byte) -104);
              }
            } else if (opcode == 3) {
              entryCount = packet.readUnsignedByte(0);
              this.commandIds = new int[entryCount];
              this.commandArguments = new int[entryCount][];
              for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                commandId = packet.readUnsignedShort((byte) -104);
                command = UnitInfoPopup.getQuickChatCommand(0, commandId);
                if (command != null) {
                  this.commandIds[entryIndex] = commandId;
                  array$0 = new int[command.definitionArgumentCount];
                  this.commandArguments[entryIndex] = array$0;
                  for (argumentIndex = 0; argumentIndex < command.definitionArgumentCount; argumentIndex++) {
                    this.commandArguments[entryIndex][argumentIndex] = packet.readUnsignedShort((byte) -104);
                  }
                }
              }
            } else {
              if (opcode == 4) {
                return;
              }
            }
          } else {
            this.textFragments = dj.splitText(61, '<', packet.readNullTerminatedString(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ar.B(").append(obfuscationGuard).append(',').append(opcode).append(',');
          if (packet == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_y = "Coat of Arms";
        field_v = "On";
        field_x = "This panel shows the equipment you have purchased. To look through all equipment, click on the 'Store' tab. Selecting equipment for hotseat games and tutorials costs nothing, but equipment must be purchased to use in online multiplayer games.";
    }
}
