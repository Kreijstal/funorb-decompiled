/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuFaceAttachmentState {
    static String[] waitingForTextMessages;
    static int field_a;
    static String field_c;

    public static void clearSharedReferences(int param0) {
        waitingForTextMessages = null;
        field_c = null;
        if (param0 != 15) {
          GpuFaceAttachmentState.setTicksPerSecond(100, 43);
        }
    }

    GpuFaceAttachmentState(int param0) {
    }

    final static void showProgressDialog(byte param0) {
        GetLagStandardDeviationIn.field_r.closeAllPanels((byte) -17);
        if (null == MatchingFieldValidator.field_i) {
          MatchingFieldValidator.field_i = new ProgressDialog(GetLagStandardDeviationIn.field_r, EnvironmentReflectionGpuMaterialEffect.field_j);
        }
        GetLagStandardDeviationIn.field_r.pushPanel(false, MatchingFieldValidator.field_i);
        if (param0 < -32) {
          return;
        }
        field_c = (String) null;
    }

    final static LoginMethod readLastLoginMethod(int param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethod[] var3 = null;
        LoginMethod var5 = null;
        int var6 = 0;
        LoginMethod stackIn_6_0 = null;
        LoginMethod stackIn_12_0 = null;
        LoginMethod stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var2 = AppletCookieReader.readCookie("jagex-last-login-method", param0 ^ 19227, param1);
          if (param0 != 19314) {
            waitingForTextMessages = (String[]) null;
          }
          if (var2 == null) {
            stackIn_6_0 = SetMassDriverFireForce.field_p;
            return stackIn_6_0;
          }
          var3 = LoginMethodCatalog.getLoginMethods((byte) 123);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.matchesCookieValue(0, var2)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = SetMassDriverFireForce.field_p;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("gib.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void setTicksPerSecond(int param0, int param1) {
        OpenGlGlyphMask.tickIntervalNanos = 1000000000L / (long)param1;
        int var2 = 38 % ((param0 + 37) / 54);
    }

    static {
        waitingForTextMessages = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_c = "Who can join";
        field_a = 15;
    }
}
