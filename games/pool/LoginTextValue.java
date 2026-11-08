/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginTextValue {
    static String pressEscapeForOptionsMenu;
    static String field_g;
    static String[] guideNames;
    static IntrusiveDeque field_f;
    private String text;
    private boolean includeInLookupRequest;
    static String gameoptMightchange;

    final static void completeAccountCreationRequest(String message, int code, String[] suggestions, byte obfuscationGuard) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          TabbedPane.field_Lb = Base37Support.field_f;
          if (obfuscationGuard != -16) {
            LoginTextValue.persistRandomSeedFromPacket(-100);
          }
          if (code == 255) {
            stackIn_7_0 = !(ButtonPainter.field_b >= 13);
            QuickChatCategoryDefinition.field_B = GradientPaletteSupport.createLoginResponse(stackIn_7_0, obfuscationGuard - 30898);
            return;
          }
          if (code < 100) {
            QuickChatCategoryDefinition.field_B = DebouncedValidationProvider.createLoginErrorResponse(code, true, message);
            return;
          }
          if (code <= 105) {
            QuickChatCategoryDefinition.field_B = PauseMenuScreen.createUsernameSuggestionsResponse(suggestions, 57);
            return;
          }
          QuickChatCategoryDefinition.field_B = DebouncedValidationProvider.createLoginErrorResponse(code, true, message);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ke.A(");
          if (message == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(code).append(',');
          if (suggestions == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void persistRandomSeedFromPacket(int obfuscationGuard) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (ServerListLauncher.field_c != null) {
            try {
              ServerListLauncher.field_c.seek(obfuscationGuard ^ 100, 0L);
              ServerListLauncher.field_c.write(24, PlayerContextMenu.field_e.payload, PlayerContextMenu.field_e.position, -1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + 24;
              if (obfuscationGuard == 100) {
                return;
              }
              field_f = (IntrusiveDeque) null;
              return;
            }
          }
          PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + 24;
          if (obfuscationGuard != 100) {
            field_f = (IntrusiveDeque) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isIncludedInLookupRequest(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.includeInLookupRequest;
    }

    final String getText(byte param0) {
        if (param0 != 104) {
          LoginTextValue.approximateIntegerSquareRoot(true, 103);
          return this.text;
        }
        return this.text;
    }

    LoginTextValue(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.text = param0;
          if (this.text == null) {
            this.text = "";
          }
          stackIn_6_1 = (param1);
          this.includeInLookupRequest = stackIn_6_1;
          if (this.text.length() != 0) {
            return;
          }
          this.includeInLookupRequest = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ke.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    LoginTextValue(String param0) {
        this(param0, false);
    }

    final static int approximateIntegerSquareRoot(boolean obfuscationGuard, int value) {
        if (65536L > (long)value) {
          if ((long)value < 256L) {
            if (value >= 0) {
              return AchievementsScreen.field_J[value] >> 12;
            }
            if (!obfuscationGuard) {
              return -1;
            }
            LoginTextValue.approximateIntegerSquareRoot(true, 12);
            return -1;
          }
          if ((long)value >= 4096L) {
            if ((long)value >= 16384L) {
              return AchievementsScreen.field_J[value >> 8] >> 8;
            }
            return AchievementsScreen.field_J[value >> 6] >> 9;
          }
          if ((long)value < 1024L) {
            return AchievementsScreen.field_J[value >> 2] >> 11;
          }
          return AchievementsScreen.field_J[value >> 4] >> 10;
        }
        if ((long)value < 16777216L) {
          if ((long)value < 1048576L) {
            if (262144L <= (long)value) {
              return AchievementsScreen.field_J[value >> 12] >> 6;
            }
            return AchievementsScreen.field_J[value >> 10] >> 7;
          }
          if ((long)value < 4194304L) {
            return AchievementsScreen.field_J[value >> 14] >> 5;
          }
          return AchievementsScreen.field_J[value >> 16] >> 4;
        }
        if ((long)value >= 268435456L) {
          if ((long)value >= 1073741824L) {
            return AchievementsScreen.field_J[value >> 24];
          }
          return AchievementsScreen.field_J[value >> 22] >> 1;
        }
        if (67108864L > (long)value) {
          return AchievementsScreen.field_J[value >> 18] >> 3;
        }
        return AchievementsScreen.field_J[value >> 20] >> 2;
    }

    public static void releaseStatics(boolean param0) {
        gameoptMightchange = null;
        field_f = null;
        if (param0) {
          return;
        }
        pressEscapeForOptionsMenu = null;
        guideNames = null;
        field_g = null;
    }

    static {
        pressEscapeForOptionsMenu = "Press <img=3> for the options menu. Hover your mouse over <col=ccccff>blue text</col> for an explanation.";
        gameoptMightchange = "<%0> might change the options - wait and see.";
        guideNames = new String[]{"On", "Off"};
        field_f = new IntrusiveDeque();
    }
}
