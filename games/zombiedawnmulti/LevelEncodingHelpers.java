/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelEncodingHelpers {
    static UiComponent field_b;
    static int[] field_c;
    static String field_a;

    final static void setMessageBoxColours(byte param0, int param1, int param2, int param3) {
        PhaseChangeEvent.field_n = param2;
        TabbedOverlayPanel.field_e = param3;
        RandomHelpers.field_k = param1;
        int var4 = -111 % ((param0 + 71) / 49);
    }

    final static void sendUntargetedPowerupRequest(CipherPacketBuffer param0, int param1, int param2, byte param3) {
        try {
          ViewportController.sendPowerupRequest(-105, -1, param0, param1, -1, param2);
          if (param3 != 102) {
            LevelEncodingHelpers.drawDimmedPanel(true);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 72 % ((-49 - param0) / 56);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static LevelData decodeLegacyLevel(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        LevelData stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 100;
          var3 = 100;
          var4 = new byte[param1.length + 8];
          for (var5 = 0; 6 > var5; var5++) {
            LevelEncodingHelpers.putInt(-113, var5, var4, RasterStackHelpers.readIntAt(true, var5, param1));
          }
          LevelEncodingHelpers.putInt(-99, 6, var4, var2_int);
          LevelEncodingHelpers.putInt(-110, 7, var4, var3);
          for (var5Lifetime1 = 6; param1.length / 4 > var5Lifetime1; var5Lifetime1++) {
            LevelEncodingHelpers.putInt(-109, 2 + var5Lifetime1, var4, RasterStackHelpers.readIntAt(true, var5Lifetime1, param1));
          }
          var6 = 52 % ((-44 - param0) / 34);
          stackIn_8_0 = LevelUpgradeHelpers.upgradeLevelDataV5(30270, var4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("nn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void drawDimmedPanel(boolean param0) {
        SoftwareRasterizer.fillRectAlpha(0, 84, 640, 335, 0, 128);
        AccountCreationHelpers.field_c.draw(0, 84);
        if (param0) {
          LevelEncodingHelpers.releaseStatics(126);
        }
    }

    final static java.awt.Container getTopLevelContainer(int param0) {
        if (null != MeltdownPuddleView.field_m) {
          return (java.awt.Container) ((Object) MeltdownPuddleView.field_m);
        }
        if (param0 < 21) {
          LevelEncodingHelpers.releaseStatics(-111);
          return (java.awt.Container) ((Object) StatefulTextPainter.getHostApplet(0));
        }
        return (java.awt.Container) ((Object) StatefulTextPainter.getHostApplet(0));
    }

    final static void putInt(int param0, int param1, byte[] param2, int param3) {
        try {
          if (param0 >= -92) {
            field_c = (int[]) null;
          }
          param2[param1 * 4] = (byte)(param3 >>> 24);
          param2[1 + param1 * 4] = (byte)(param3 >>> 16);
          param2[2 + 4 * param1] = (byte)(param3 >>> 8);
          param2[3 + param1 * 4] = (byte)param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nn.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = new int[128];
        field_a = "Invite";
    }
}
