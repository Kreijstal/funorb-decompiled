/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerTickFactory implements GameStateFactory {
    static int field_d;
    static byte[][] field_b;
    static int[] field_a;
    static double outgoingLagStdDevMillis;

    public final SerializableGameState create(byte param0) {
        int var2 = -15 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ServerTick());
    }

    final static void drawGradientBorder(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          if (param1 != 115) {
            field_b = (byte[][]) null;
          }
          SoftwareRasterizer2D.drawHorizontalLine(param4, param0, param3 + 1, 10000536);
          SoftwareRasterizer2D.drawHorizontalLine(param4, param0 + param2, param3 + 1, 12105912);
          var5_int = 1;
          if (param0 + var5_int < SoftwareRasterizer2D.clipTop) {
            var5_int = SoftwareRasterizer2D.clipTop - param0;
          }
          var6 = param2;
          if (SoftwareRasterizer2D.clipBottom < var6 + param0) {
            var6 = SoftwareRasterizer2D.clipBottom - param0;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 48 * var7 / param2 + 152;
            var9 = var8 | (var8 << 16 | var8 << 8);
            SoftwareRasterizer2D.pixels[SoftwareRasterizer2D.width * (param0 + var7) + param4] = var9;
            SoftwareRasterizer2D.pixels[(param0 + var7) * SoftwareRasterizer2D.width + param4 + param3] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var5), "npa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var7 = null;
        SocialListEntry var8 = null;
        IsaacPacketBuffer var9 = null;
        CharSequence var10 = null;
        var6 = VoidHunters.field_G;
        try {
          var10 = (CharSequence) ((Object) param1);
          if (!ChatPanelUpdater.isValidNormalizablePlayerName(var10, (byte) -118)) {
            stackIn_4_0 = QuickChatMenuWidget.field_Cb;
            return stackIn_4_0;
          }
          if (PendingRequestResender.field_b != 2) {
            stackIn_8_0 = UiAngleDialRenderer.field_e;
            return stackIn_8_0;
          }
          var8 = FlipTextureOperation.a(param1, param0 - 90);
          if (var8 == null) {
            stackIn_12_0 = SetReverbGain.a(SetSniperCannonAimarc.field_q, new String[]{param1}, 118);
            return stackIn_12_0;
          }
          DisplayModeErrorDialog.field_M.startAt(3, var8);
          while (true) {
            var7 = (SocialListEntry) (DisplayModeErrorDialog.field_M.next((byte) 72));
            if (var7 != null) {
              var7.insertionIndex = var7.insertionIndex - 1;
              continue;
            }
            break;
          }
          var8.unlink(-3846);
          var8.unlinkSecondary((byte) -35);
          GetBoostersCooldown.field_p = GetBoostersCooldown.field_p - 1;
          var9 = RequestNewestBlackboxRecording.field_p;
          if (param0 != 90) {
            outgoingLagStdDevMillis = 0.9397013753078566;
          }
          var9.writeIsaacByte(param0 ^ 24405, param2);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.writeByte(param0 - 90, 1);
          var9.writeString(true, param1);
          var9.writeLengthByte(var9.position - var5, -129);
          stackIn_19_0 = null;
          return (String) (stackIn_19_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("npa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static StringBuilder resizeStringBuilder(int param0, boolean param1, StringBuilder param2, char param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        String var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var4_int = param2.length();
          param2.setLength(param0);
          if (param1) {
            var7 = (String) null;
            ServerTickFactory.a((byte) -60, (String) null, -96);
          }
          for (var5 = var4_int; param0 > var5; var5++) {
            param2.setCharAt(var5, param3);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("npa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_a = null;
        if (!param0) {
          field_a = (int[]) null;
          field_b = (byte[][]) null;
          return;
        }
        field_b = (byte[][]) null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (int[]) null;
          return (SerializableGameState[]) ((Object) new ServerTick[param1]);
        }
        return (SerializableGameState[]) ((Object) new ServerTick[param1]);
    }

    static {
        field_b = new byte[50][];
        field_a = new int[128];
        outgoingLagStdDevMillis = 0.0;
    }
}
