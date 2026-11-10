/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    static QuickChatMenu field_t;
    static int field_v;
    private int[][] field_s;
    int[] field_r;
    private String[] field_u;
    private int[] field_q;

    final static boolean isPrivateRecipientReachable(byte param0) {
        if (param0 != -20) {
          field_v = 88;
        }
        return FramePainter.isOnlineFriendOrLobbyPlayer(PhantomDecoy.field_M, RasterStackHelpers.field_a, param0 + 22);
    }

    final void decode(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.readUnsignedByte(31365);
            if (var3_int != 0) {
              this.decodeOpcode(88, param0, var3_int);
              continue;
            }
            break;
          }
          if (param1 != 118) {
            field_v = -62;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tl.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyGlobalIds(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_r != null) {
          for (var2 = 0; var2 < this.field_r.length; var2++) {
            this.field_r[var2] = PendingStatusRequest.bitOr(this.field_r[var2], 32768);
          }
        }
        if (param0 <= 98) {
          this.field_u = (String[]) null;
        }
    }

    final String getPreview(int param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_u == null) {
          return "";
        }
        StringBuilder discarded$15 = var5.append(this.field_u[0]);
        if (param0 != -18572) {
          return (String) null;
        }
        for (var3 = 1; var3 < this.field_u.length; var3++) {
          discarded$16 = var2.append("...");
          discarded$17 = var5.append(this.field_u[var3]);
        }
        return var2.toString();
    }

    private final void decodeOpcode(int param0, PacketBuffer param1, int param2) {
        int[] array$0 = null;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        QuickChatCommandType var8 = null;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = 3 / ((param0 + 33) / 46);
          if (param2 != 1) {
            if (2 == param2) {
              var5 = param1.readUnsignedByte(31365);
              this.field_r = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                this.field_r[var6] = param1.readUnsignedShort((byte) 69);
              }
            } else if (param2 == 3) {
              var5 = param1.readUnsignedByte(31365);
              this.field_s = new int[var5][];
              this.field_q = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                var7 = param1.readUnsignedShort((byte) 69);
                var8 = MusicPatchLoadHelpers.findKindById(var7, (byte) 35);
                if (var8 != null) {
                  this.field_q[var6] = var7;
                  array$0 = new int[var8.field_f];
                  this.field_s[var6] = array$0;
                  for (var9 = 0; var8.field_f > var9; var9++) {
                    this.field_s[var6][var9] = param1.readUnsignedShort((byte) 69);
                  }
                }
              }
            } else {
              if (param2 == 4) {
                return;
              }
            }
          } else {
            this.field_u = WidgetStyleLayer.splitAtCharacter('<', false, param1.readString((byte) -62));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("tl.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void sendCheatCommand(int param0, byte param1, CipherPacketBuffer param2, int param3, int param4, int param5) {
        if (PortalEntryEvent.field_m.field_c) {
          return;
        }
        if (FadingDialog.field_I) {
          UiWidget.field_s.executeCheat(param4, param0, 0, param3, 3, param5);
          return;
        }
        try {
          param2.writeCipheredOpcode((byte) -35, 65);
          param2.writeByte(param1 ^ -102, param0);
          param2.writeShort(param5, (byte) -45);
          if (param1 != -11) {
            CipherPacketBuffer var7 = (CipherPacketBuffer) null;
            QuickChatPhraseDefinition.sendCheatCommand(-103, (byte) 41, (CipherPacketBuffer) null, -22, 121, -61);
          }
          param2.writeShort(param3, (byte) -110);
          param2.writeShort(param4, (byte) -64);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tl.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        if (param0 != 32768) {
          field_t = (QuickChatMenu) null;
        }
    }

    QuickChatPhraseDefinition() {
    }

    static {
        field_v = 65;
    }
}
