/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroAudioSupport {
    static int field_a;
    static String field_b;
    static int spriteSheetWidth;
    static int[] field_g;
    static String field_c;
    static String field_d;
    static String[] field_f;

    final static void decodeLogoAudio(ResourceArchive archive, int guard) {
        try {
          VorbisSample.decodeSetup(archive.getNamedFile(-4, "", "headers.packvorbis"));
          VorbisSample var2 = VorbisSample.loadNamed(archive, "jagex logo2.packvorbis", "");
          if (guard != -58) {
            field_c = (String) null;
          }
          var2.decodeToPcm();
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "on.C(" + (archive != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static int rightmostButtonEdge(LegacyButton[] buttons, int guard) {
        String stackIn_18_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var2_int = -2147483648;
          LegacyButton[] var3 = buttons;
          if (guard != -49) {
            IntroAudioSupport.isAsciiDigit('\030', true);
          }
          for (int var4 = 0; var4 < var3.length; var4++) {
            LegacyButton var5 = var3[var4];
            int var6 = var5.x + var5.width;
            if (var6 > var2_int) {
              var2_int = var6;
            }
          }
          if (-2147483648 != var2_int) {
            int stackIn_14_0 = var2_int;
            return stackIn_14_0;
          }
          int stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2;
          StringBuilder stackIn_17_1 = new StringBuilder().append("on.D(");
          if (buttons == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void checkReleaseGuard(int guard) {
        if (guard > -65) {
          field_f = (String[]) null;
        }
    }

    final static boolean isAsciiDigit(char character, boolean guard) {
        if (guard) {
          return false;
        }
        boolean stackIn_6_0 = (character >= 48) && (character <= 57);
        return stackIn_6_0;
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (guard <= 72) {
          ResourceArchive var2 = (ResourceArchive) null;
          IntroAudioSupport.decodeLogoAudio((ResourceArchive) null, -94);
        }
        field_f = null;
    }

    static {
        field_c = "Enter the caves, find the containers, land next to them to attach your tether,<br>and steer them out and up to the mothership.";
        field_g = new int[8192];
        field_d = "Cannot load power-up - please land beside it";
        field_b = null;
        field_f = new String[]{"infracstructure_asteroid", "infracstructure_ice", "infracstructure_moon", "infracstructure_alien", null};
    }
}
