/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ClientUiNode extends DualLinkedNode {
    private static int[] field_u;
    static PcmSample[] field_v;
    static ClientUiComponent field_x;
    static RgbSprite field_y;
    static boolean field_w;

    final static int getProfileMissionScore(CampaignMission mission, int obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 19) {
            ClientUiNode.b(49, 30);
          }
          var2_int = mission.campaign.campaignIndex;
          var3 = mission.missionId;
          stackIn_3_0 = mh.getProfileMissionScore(var2_int, -125, var3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("im.BA(");
          if (mission == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        MaskedTextEntryPainter.field_B = (param0 & 51) >> 4;
        if (param1 != -27498) {
          field_x = (ClientUiComponent) null;
        }
        QuickChatCategory.field_D = (param0 & 13) >> 2;
        if (2 < MaskedTextEntryPainter.field_B) {
          MaskedTextEntryPainter.field_B = 2;
        }
        if (QuickChatCategory.field_D > 2) {
          QuickChatCategory.field_D = 2;
        }
        cd.field_c = param0 & 3;
        if (!(cd.field_c <= 2)) {
          cd.field_c = 2;
        }
    }

    public static void g(int param0) {
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != 31343) {
          return;
        }
        field_y = null;
    }

    ClientUiNode() {
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param2; var5 < param0; var5++) {
            var4_int = var4_int >>> 8 ^ field_u[(param1[var5] ^ var4_int) & 255];
          }
          var4_int = ~var4_int;
          if (param3 == -8779) {
            stackIn_8_0 = var4_int;
            return stackIn_8_0;
          }
          stackIn_6_0 = -54;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("im.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String setCoatFromQuery(int obfuscationGuard, String query) {
        int valueIndex = 0;
        String queryAlias = null;
        RuntimeException failure = null;
        String[] values = null;
        int obfuscationControl = 0;
        String guardResult = null;
        String successResult = null;
        String errorResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String queryDescription = null;
        RuntimeException caughtFailure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          queryAlias = query;
          values = dj.splitText(14, ':', queryAlias.substring(queryAlias.indexOf('=') + 1));
          if (obfuscationGuard <= 88) {
            guardResult = (String) null;
            return guardResult;
          }
          for (valueIndex = 0; valueIndex < values.length; valueIndex++) {
            if (valueIndex % 2 == 0) {
              ah.localCoat.setPart(119, Integer.parseInt(values[valueIndex]), valueIndex / 2);
            } else {
              ah.localCoat.setColour(valueIndex / 2, Integer.parseInt(values[valueIndex]), (byte) -128);
            }
          }
          successResult = "done.";
          return successResult;
        } catch (java.lang.RuntimeException caughtParseFailure) {
          caughtFailure = caughtParseFailure;
          try {
            failure = caughtFailure;
            failure.printStackTrace();
            errorResult = "Error. See console for details.";
            return errorResult;
          } catch (java.lang.RuntimeException caughtParameter) {
            caughtFailure = caughtParameter;
            failure = caughtFailure;
            failureForContext = failure;
            errorContext = new StringBuilder().append("im.AA(").append(obfuscationGuard).append(',');
            if (query == null) {
              queryDescription = "null";
            } else {
              queryDescription = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(queryDescription).append(')').toString());
          }
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_u = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 == (1 & var0)) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_u[var1] = var0;
        }
        field_v = new PcmSample[19];
    }
}
