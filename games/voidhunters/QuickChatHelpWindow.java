/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpWindow extends Widget {
    private Widget closeButton;
    static String loadingExtraDataText;
    static ResourceArchive field_xb;

    final boolean updateAndCheckDismissed(boolean param0, boolean param1) {
        boolean stackIn_9_0 = false;
        if (param1) {
          this.updateAndCheckDismissed(false, true);
        }
        boolean decompiledFrameRemainder0 = true;
        this.updateInput(true, 1332);
        if ((0 == SetDebrisPartitioned.field_o ||
          this.field_o != 0) && 0 == this.closeButton.field_o) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static int getEffectsBufferSize(byte param0) {
        if (param0 != 73) {
          loadingExtraDataText = (String) null;
        }
        return LegacyOpenGlWaveWaterEffect.effectsBufferSize;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        loadingExtraDataText = null;
        field_xb = null;
    }

    final static int findGraphicsBackendIndex(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (param1 != -1) {
            loadingExtraDataText = (String) null;
          }
          for (var2_int = 0; DebugSendable.graphicsBackendOrder.length > var2_int; var2_int++) {
            if (DebugSendable.graphicsBackendOrder[var2_int] == param0) {
              stackIn_8_0 = var2_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "lwa.D(" + param0 + ',' + param1 + ')');
        }
    }

    QuickChatHelpWindow(Widget param0, Widget param1, Widget param2, Widget param3, Widget param4, Widget param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        Widget var8 = null;
        Widget var9 = null;
        int var10 = 0;
        int var11 = 0;
        Widget var13 = null;
        Widget var14 = null;
        int var15 = 0;
        Widget var17 = null;
        int var10Lifetime1;
        try {
          var17 = new Widget(0L, param1, SetPhasedEnergyBeamEnergyUsed.field_p.toUpperCase());
          var17.field_F = 1;
          this.closeButton = new Widget(0L, param2);
          var8 = new Widget(0L, param3);
          var9 = new Widget(0L, param3, TextInputWidget.field_Jb);
          var9.field_F = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; var12 < HelloCommand.field_q.length; var12++) {
            var13 = new Widget(0L, param3, GetKeepTeamColours.field_r[var12]);
            var14 = new Widget(0L, param3, HelloCommand.field_q[var12]);
            var15 = param3.font.getStringWidth(HelloCommand.field_q[var12]);
            if (var15 > var11) {
              var11 = var15;
            }
            var13.setBounds(20, 121, 65, var10, 15);
            var14.setBounds(90, 124, 640, var10, 15);
            var8.addChild(-561, var13);
            var10 += 30;
            var8.addChild(-561, var14);
          }
          var10 += 15;
          var17.setBounds(0, 116, 20 + (var11 + 90), 0, 24);
          this.setBounds(100, 23, var17.width, 100, var10 + var17.height);
          this.closeButton.setBounds(-20 + var17.width, 8, 15, 5, 15);
          var8.setBounds(0, 119, this.width, var17.height, -var17.height + this.height);
          var9.setBounds(0, 121, this.width, 20, 15);
          var8.field_gb = ShieldInfo.createGradientNineSliceSprites(11579568, var8.height, 2105376, 8421504, 119, 3);
          var17.addChild(-561, this.closeButton);
          var8.addChild(-561, var9);
          this.addChild(-561, var17);
          this.addChild(-561, var8);
          var10Lifetime1 = -(this.height >> 1) + 240;
          this.x = 320 - (this.width >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("lwa.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        loadingExtraDataText = "Loading extra data";
    }
}
