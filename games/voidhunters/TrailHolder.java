/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrailHolder implements DiffableState {
    private int[] sampleIntensities;
    private int[] field_f;
    private int sampleHead;
    private int[] field_b;
    private int intensity;
    private int sampleTicks;
    private int[] field_e;

    public final void copyTo(byte param0, SerializableGameState param1) {
        TrailHolder var3 = null;
        try {
          var3 = (TrailHolder) (param1);
          var3.field_b = SetTeamSelectionSpeedup.copyIntsReusingArray(var3.field_b, (byte) -124, this.field_b);
          var3.field_f = SetTeamSelectionSpeedup.copyIntsReusingArray(var3.field_f, (byte) -105, this.field_f);
          var3.field_e = SetTeamSelectionSpeedup.copyIntsReusingArray(var3.field_e, (byte) -29, this.field_e);
          var3.sampleIntensities = SetTeamSelectionSpeedup.copyIntsReusingArray(var3.sampleIntensities, (byte) -103, this.sampleIntensities);
          if (param0 <= 54) {
            this.field_b = (int[]) null;
          }
          var3.intensity = this.intensity;
          var3.sampleTicks = this.sampleTicks;
          var3.sampleHead = this.sampleHead;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tbb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 >= -109) {
            this.sampleTicks = -81;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tbb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void updateTrail(byte param0) {
        SerializableGameState var3 = null;
        SerializableGameState var3Lifetime1;
        this.intensity = this.intensity - 8;
        this.sampleTicks = this.sampleTicks + 1;
        if (this.intensity < 0) {
          this.intensity = 0;
        }
        if (this.sampleTicks > 4) {
          this.sampleHead = (1 + this.sampleHead) % 64;
          this.sampleIntensities[this.sampleHead] = 0;
          this.sampleTicks = 0;
          if (param0 >= -123) {
            var3 = (SerializableGameState) null;
            this.copyTo((byte) -29, (SerializableGameState) null);
            return;
          }
          return;
        }
        if (param0 >= -123) {
          var3Lifetime1 = (SerializableGameState) null;
          this.copyTo((byte) -29, (SerializableGameState) null);
          return;
        }
    }

    final void increaseIntensity(byte param0, int param1) {
        SerializableGameState var4 = null;
        SerializableGameState var4Lifetime1;
        this.intensity = this.intensity + param1;
        if (this.intensity > 255) {
          this.intensity = 255;
          if (param0 <= 93) {
            var4 = (SerializableGameState) null;
            this.reportDifferences((SerializableGameState) null, 104);
            return;
          }
          return;
        }
        if (param0 <= 93) {
          var4Lifetime1 = (SerializableGameState) null;
          this.reportDifferences((SerializableGameState) null, 104);
          return;
        }
    }

    final void recordSample(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        if (param2 < -104) {
          var8 = this.sampleHead << 1;
          this.field_b[var8] = param4;
          this.field_b[1 + var8] = param6;
          this.field_f[var8] = param1;
          this.field_f[1 + var8] = param0;
          this.field_e[var8] = param3;
          this.field_e[var8 + 1] = param5;
          this.sampleIntensities[this.sampleHead] = this.intensity;
          return;
        }
        this.field_b = (int[]) null;
        var8Lifetime1 = this.sampleHead << 1;
        this.field_b[var8Lifetime1] = param4;
        this.field_b[1 + var8Lifetime1] = param6;
        this.field_f[var8Lifetime1] = param1;
        this.field_f[1 + var8Lifetime1] = param0;
        this.field_e[var8Lifetime1] = param3;
        this.field_e[var8Lifetime1 + 1] = param5;
        this.sampleIntensities[this.sampleHead] = this.intensity;
    }

    final void drawTrail(Camera2D param0, int param1, int param2) {
        try {
          if (param1 != 1325107016) {
            this.field_f = (int[]) null;
          }
          PointLight.a(param0, this.field_f, 6407, this.sampleTicks, this.field_b, this.field_e, this.sampleHead, this.sampleIntensities, param2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tbb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ChatMessage readChatMessage(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        IsaacPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = VoidHunters.field_G;
        var8 = AccountNameAvailabilityReplies.field_b;
        var2 = var8;
        if (param0 < 4) {
          return (ChatMessage) null;
        }
        var3 = var8.readUnsignedByte((byte) -121);
        IncomingChatState.channelType = 127 & var3;
        stackIn_5_0 = ((128 & var3) != 0);
        TickCondition.field_e = stackIn_5_0;
        ModalPanel.field_A = var8.readUnsignedByte((byte) -106);
        SetSniperCannonFiringLeeway.field_q = var8.readLong(255);
        if (IncomingChatState.channelType == 2) {
          SetSalvoUsesAllEnergy.field_o = var8.readUnsignedShort(1869);
          GraphicsPresentException.field_b = var8.readUnsignedMedium((byte) -38);
        } else {
          SetSalvoUsesAllEnergy.field_o = 0;
          GraphicsPresentException.field_b = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte((byte) -106) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        LegacyOpenGlEnvironmentMappedWaterEffect.field_h = var8.readString(-1);
        if (var4 != 0) {
          TextureCoordinateMode.field_a = var8.readString(-1);
        } else {
          TextureCoordinateMode.field_a = LegacyOpenGlEnvironmentMappedWaterEffect.field_h;
        }
        if (IncomingChatState.channelType == 1) {
          EmailAvailabilityChecks.field_a = var8.readUnsignedShort(1869);
          SpawnEnemyShipOrderDefinition.field_f = var8.readString(-1);
        } else {
          if (IncomingChatState.channelType != 4) {
            EmailAvailabilityChecks.field_a = 0;
            SpawnEnemyShipOrderDefinition.field_f = null;
          } else {
            EmailAvailabilityChecks.field_a = var8.readUnsignedShort(1869);
            SpawnEnemyShipOrderDefinition.field_f = var8.readString(-1);
          }
        }
        if (!param1) {
          SetCountermeasureLauncherProjectiles.field_p = ImageProducerAppletRasterBuffer.readHuffmanString(80, var8, (byte) 112);
          AlternateNumericLoginCredentials.field_h = null;
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort(1869);
        try {
          var9 = GetTorpedoAimarc.field_o.getPhrase(var5, -119);
          SetCountermeasureLauncherProjectiles.field_p = var9.getPreviewText(80);
          if (TextureCoordinateMode.field_a.equals(IntIndexTable.field_a)) {
            stackIn_26_0 = null;
          } else {
            stackIn_26_0 = var9.linkedPhraseIds;
          }
          AlternateNumericLoginCredentials.field_h = stackIn_26_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          FractalNoiseVolumeGenerator.reportClientError((Throwable) ((Object) var6), "CC1", 0);
          AlternateNumericLoginCredentials.field_h = null;
          SetCountermeasureLauncherProjectiles.field_p = null;
          return new ChatMessage(param1);
        }
        return new ChatMessage(param1);
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            this.field_e = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tbb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void reset(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; this.field_b.length > var2; var2++) {
          this.field_b[var2] = 0;
          this.field_f[var2] = 0;
          this.field_f[var2] = 0;
        }
        for (var2Lifetime1 = 0; this.sampleIntensities.length > var2Lifetime1; var2Lifetime1++) {
          this.sampleIntensities[var2Lifetime1] = 0;
        }
        var2Lifetime2 = 104 / ((37 - param0) / 55);
        this.sampleHead = 0;
        this.intensity = 0;
        this.sampleTicks = 0;
    }

    final static void fillCaretPositions(BitmapFont param0, int param1, TextLayoutLine param2, String param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param4 != 18126) {
            TrailHolder.readChatMessage(-98, false);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param3.length() > var7; var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) - (-param2.caretXs[0] - param0.getStringWidth(param3.substring(0, var7)));
            }
            if (-1 != var6) {
              param2.caretXs[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param1;
              }
              param2.caretXs[var7] = param2.caretXs[0] + ((var5_int >> 8) + (param0.getStringWidth(param3.substring(0, 1 + var7)) - param0.getCharacterAdvance((char) var8)));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("tbb.K(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 74 / ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("tbb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        try {
          if (obfuscationGuard > -19) {
            this.recordSample(-95, 21, (byte) 84, 30, -19, 64, 55);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tbb.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    TrailHolder() {
        this.sampleIntensities = new int[64];
        this.sampleHead = 0;
        this.field_f = new int[128];
        this.field_b = new int[128];
        this.intensity = 0;
        this.sampleTicks = 0;
        this.field_e = new int[128];
    }

    static {
    }
}
