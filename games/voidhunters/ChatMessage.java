/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    int[] field_m;
    Widget widget;
    static CommonArchiveId field_b;
    String senderName;
    int field_h;
    long senderKey;
    int field_q;
    String text;
    boolean unfiltered;
    String field_e;
    int field_f;
    String field_o;
    int channelType;
    int field_c;
    static GameStateFactory field_g;
    static String field_l;
    static String field_p;

    final static void writePackedIntArray(int param0, int param1, int param2, IsaacPacketBuffer param3, int[] param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = VoidHunters.field_G;
        try {
          if (param4 != null &&
            param1 != 0) {
            var5_int = 2147483647;
            var6 = -2147483648;
            var7_ref_int__ = param4;
            for (var8 = 0; var8 < var7_ref_int__.length; var8++) {
              var9 = var7_ref_int__[var8];
              if (var9 > var6) {
                var6 = var9;
              }
              if (var9 < var5_int) {
                var5_int = var9;
              }
            }
            param3.writeBits(-632, param1, param0);
            var7 = BodyInZoneCondition.getIntegerEncodingBitLength(-103, -var5_int + var6);
            param3.writeBits(-632, var7, 6);
            param3.writeBits(-632, var5_int, 32);
            if (var7 > 0) {
              for (var8Lifetime1 = 0; var8Lifetime1 < param1; var8Lifetime1++) {
                param3.writeBits(-632, -var5_int + param4[var8Lifetime1], var7);
              }
            }
            var8Lifetime2 = 72 % ((-35 - param2) / 54);
            return;
          }
          param3.writeBits(-632, 0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("pgb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int getVisibilityPriority(int param0) {
        if (!this.unfiltered && (this.channelType != 2 ||
          0 >= this.field_c)) {
          if (~this.senderKey == ~BodyInZoneConditionFactory.field_a) {
            return 1;
          }
          if (PendingRequestResender.field_b == 2 &&
            GetTorqueDownshift.isFriend(this.senderName, (byte) -105)) {
            return 1;
          }
          if (param0 == 1) {
            return 0;
          }
          return -30;
        }
        return 2;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 <= 49) {
          return;
        }
        field_b = null;
        field_g = null;
        field_l = null;
        field_p = null;
    }

    ChatMessage(boolean param0) {
        this.field_f = SetSalvoUsesAllEnergy.field_o;
        this.field_o = SpawnEnemyShipOrderDefinition.field_f;
        this.senderKey = SetSniperCannonFiringLeeway.field_q;
        if (!param0) {
          this.field_m = null;
        } else {
          this.field_m = AlternateNumericLoginCredentials.field_h;
        }
        this.field_q = EmailAvailabilityChecks.field_a;
        this.field_c = ModalPanel.field_A;
        this.channelType = IncomingChatState.channelType;
        this.unfiltered = TickCondition.field_e;
        this.field_e = LegacyOpenGlEnvironmentMappedWaterEffect.field_h;
        this.field_h = GraphicsPresentException.field_b;
        this.senderName = TextureCoordinateMode.field_a;
        this.text = SetCountermeasureLauncherProjectiles.field_p;
    }

    ChatMessage(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.senderName = param1;
          this.field_e = param1;
          this.field_q = param2;
          this.text = param4;
          this.field_f = 0;
          this.channelType = param0;
          this.field_c = 0;
          this.unfiltered = true;
          this.field_h = 0;
          this.field_m = null;
          this.field_o = param3;
          this.senderKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pgb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new CommonArchiveId(3);
        field_g = (GameStateFactory) ((Object) new EscapePodFactory());
        field_p = "Toggle condition not";
        field_l = "ESC - cancel private message";
    }
}
