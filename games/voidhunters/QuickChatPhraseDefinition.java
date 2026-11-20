/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    int[] linkedPhraseIds;
    private String[] textSegments;
    private int[][] dynamicCommandArguments;
    private int[] dynamicCommandIds;

    private final void decodeOpcode(PacketBuffer param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        QuickChatDynamicCommand var7 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param2 != 0) {
            QuickChatPhraseDefinition.drawModalUiBackground((byte) 3, false, false);
          }
          if (param1 == 1) {
            this.textSegments = SetFighterBayAimspeed.a((byte) -67, '<', param0.readString(-1));
          } else {
            if (param1 == 2) {
              var4_int = param0.readUnsignedByte((byte) -113);
              this.linkedPhraseIds = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.linkedPhraseIds[var5] = param0.readUnsignedShort(1869);
              }
            } else if (param1 == 3) {
              var4_int = param0.readUnsignedByte((byte) -107);
              this.dynamicCommandIds = new int[var4_int];
              this.dynamicCommandArguments = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.readUnsignedShort(param2 ^ 1869);
                var7 = SetPhasedEnergyBeamPulseFadetime.a(0, var6);
                if (var7 != null) {
                  this.dynamicCommandIds[var5] = var6;
                  array$0 = new int[var7.parameterCount];
                  this.dynamicCommandArguments[var5] = array$0;
                  for (var8 = 0; var8 < var7.parameterCount; var8++) {
                    this.dynamicCommandArguments[var5][var8] = param0.readUnsignedShort(1869);
                  }
                }
              }
            } else {
              if (param1 != 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("pi.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String getPreviewText(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = VoidHunters.field_G;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (null == this.textSegments) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.textSegments[0]);
        for (var3 = 1; this.textSegments.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.textSegments[var3]);
        }
        return var2.toString();
    }

    final void markAlternateArchiveReferences(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != 97) {
          return;
        }
        if (null != this.linkedPhraseIds) {
          for (var2 = 0; this.linkedPhraseIds.length > var2; var2++) {
            this.linkedPhraseIds[var2] = SetAngularForceDownshift.orBits(this.linkedPhraseIds[var2], 32768);
          }
        }
    }

    final void decode(PacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          while (true) {
            var3_int = param0.readUnsignedByte((byte) -104);
            if (var3_int != 0) {
              this.decodeOpcode(param0, var3_int, 0);
              continue;
            }
            break;
          }
          if (param1 != -1) {
            this.linkedPhraseIds = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pi.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawModalUiBackground(byte param0, boolean param1, boolean param2) {
        if (param0 > -6) {
          return;
        }
        if (!param1) {
          SoftwareRasterizer2D.clear();
        } else {
          SoftwareRasterizer2D.fillRectangleAlpha(0, 0, SoftwareRasterizer2D.width, SoftwareRasterizer2D.height, 0, 192);
        }
        GetPointDefenceLaserProjectileDamage.drawModalPanels(param1, 76);
    }

    QuickChatPhraseDefinition() {
    }

    static {
    }
}
