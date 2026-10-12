/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    static oo field_a;
    static String[] field_b;
    static SocialListPanel field_g;
    static ClientUiComponent field_e;
    static boolean[] heldKeys;
    static ResourceArchive field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 11) {
          br.getCampaign(65, (byte) 100);
        }
        field_c = null;
        field_d = null;
        field_g = null;
        field_e = null;
        heldKeys = null;
    }

    final static boolean a(String param0, boolean param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if (!PlatformTaskService.lowercaseOsName.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (!param1) {
              br.getCampaign(-60, (byte) -36);
            }
            for (var3 = 0; var3 < param0.length(); var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("br.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        DiskCacheWorker.a(-10232);
        ContextualRuntimeException.b(-6145);
        if (param0 != -97) {
          field_e = (ClientUiComponent) null;
        }
    }

    final static CampaignDefinition getCampaign(int campaignIndex, byte obfuscationGuard) {
        if (obfuscationGuard > -4) {
          heldKeys = (boolean[]) null;
        }
        return cd.campaigns[campaignIndex];
    }

    final static void a(BitmapFont param0, int param1, int param2, BitmapFont param3) {
        try {
          pf.field_d = param1;
          TaggedMapData.field_b = param0;
          AiInfluenceMap.field_h = param3;
          pt.c(SoftwareRaster.width / 2, SoftwareRaster.height / 2, 75);
          uc.a(param0.field_L + param0.field_z, param0.field_z, param3.field_z, false, param3.field_L + param3.field_z);
          if (param2 != 333) {
            heldKeys = (boolean[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "br.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        heldKeys = new boolean[112];
        field_c = new int[]{276, 215, 253, 292, 329, 288, 333, 353, 244, 182, 122, 160, 126, 147, 189, 68};
    }
}
