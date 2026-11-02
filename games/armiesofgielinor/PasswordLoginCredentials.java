/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordLoginCredentials extends LoginCredentials {
    static String field_n;
    private String password;
    static ClientUiComponent field_h;
    static String field_k;
    static int pointerButtonMask;
    static String field_e;
    static String field_g;
    static String[] field_m;
    static String field_i;
    static String field_j;
    private String accountName;

    final void writeCredentials(PacketBuffer packet, int obfuscationGuard) {
        try {
          packet.writeNullCircumfixedString(this.accountName, 413740432);
          packet.writeBase38Name(-33, this.password);
          if (obfuscationGuard != -11436) {
            this.password = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "eq.C(" + (packet != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var11 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_8_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 <= 125) {
            field_g = (String) null;
          }
          param3 = param3 | param3 << 8;
          var8_int = param3 ^ param3 >> 1;
          for (var11 = 0; var11 < 4; var11++) {
            var9 = -44 + CachedArchiveProvider.field_y[var11][0] + (param6 + (7 & var8_int));
            var10 = -64 + (param0 + CachedArchiveProvider.field_y[var11][1] + (param3 & 3));
            stackIn_7_0 = param1;
            stackIn_8_1 = !(var10 <= param0 - 60);
            if (stackIn_7_0 ^ stackIn_8_1) {
              NineSliceFrame.activeFoliageSprites[0 + param3 % 6].drawFadedToColour(var9, var10, param4, param7);
            }
            var8_int = var8_int >> 1;
            param3 = param3 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var8), "eq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final LoginKind getLoginKind(byte obfuscationGuard) {
        int var2 = -87 / ((obfuscationGuard + 63) / 45);
        return ContentTransitionDialog.field_db;
    }

    public static void releaseStatics(boolean obfuscationGuard) {
        field_n = null;
        field_m = null;
        if (obfuscationGuard) {
          field_h = null;
          field_g = null;
          field_j = null;
          field_e = null;
          field_i = null;
          field_k = null;
          return;
        }
        PasswordLoginCredentials.$cfr$intArgs$a$de73e65787eb(0, true, 4, 16, -48, false, 102, -124);
        field_h = null;
        field_g = null;
        field_j = null;
        field_e = null;
        field_i = null;
        field_k = null;
    }

    PasswordLoginCredentials(String param0, String param1) {
        try {
          this.password = param1;
          this.accountName = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "eq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Create a free account to start using this feature";
        pointerButtonMask = 0;
        field_e = "Return to Main Menu";
        field_k = "This item can only be used on a Kalphite Queen.";
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_g = "This unit has not moved yet.";
        field_j = "Withdraw request to join <%0>'s game";
        field_i = "Account created successfully!";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$de73e65787eb(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var11 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_8_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 <= 125) {
            field_g = (String) null;
          }
          param3 = param3 | param3 << 8;
          var8_int = param3 ^ param3 >> 1;
          for (var11 = 0; var11 < 4; var11++) {
            var9 = -44 + CachedArchiveProvider.field_y[var11][0] + (param6 + (7 & var8_int));
            var10 = -64 + (param0 + CachedArchiveProvider.field_y[var11][1] + (param3 & 3));
            stackIn_7_0 = param1;
            stackIn_8_1 = !(var10 <= param0 - 60);
            if (stackIn_7_0 ^ stackIn_8_1) {
              NineSliceFrame.activeFoliageSprites[0 + param3 % 6].drawFadedToColour(var9, var10, param4, param7);
            }
            var8_int = var8_int >> 1;
            param3 = param3 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var8), "eq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }
}
