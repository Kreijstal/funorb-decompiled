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

    final static void a(String param0, int param1, String[] param2, byte param3) {
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
          TabbedPane.field_Lb = td.field_f;
          if (param3 != -16) {
            LoginTextValue.a(-100);
          }
          if (param1 == 255) {
            stackIn_7_0 = !(ButtonPainter.field_b >= 13);
            QuickChatCategoryDefinition.field_B = ta.a(stackIn_7_0, param3 - 30898);
            return;
          }
          if (param1 < 100) {
            QuickChatCategoryDefinition.field_B = DebouncedValidationProvider.a(param1, true, param0);
            return;
          }
          if (param1 <= 105) {
            QuickChatCategoryDefinition.field_B = PauseMenuScreen.a(param2, 57);
            return;
          }
          QuickChatCategoryDefinition.field_B = DebouncedValidationProvider.a(param1, true, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ke.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (nl.field_c != null) {
            try {
              nl.field_c.seek(param0 ^ 100, 0L);
              nl.field_c.write(24, PlayerContextMenu.field_e.payload, PlayerContextMenu.field_e.position, -1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + 24;
              if (param0 == 100) {
                return;
              }
              field_f = (IntrusiveDeque) null;
              return;
            }
          }
          PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + 24;
          if (param0 != 100) {
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
          LoginTextValue.a(true, 103);
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

    final static int a(boolean param0, int param1) {
        if (65536L > (long)param1) {
          if ((long)param1 < 256L) {
            if (param1 >= 0) {
              return AchievementsScreen.field_J[param1] >> 12;
            }
            if (!param0) {
              return -1;
            }
            LoginTextValue.a(true, 12);
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if ((long)param1 >= 16384L) {
              return AchievementsScreen.field_J[param1 >> 8] >> 8;
            }
            return AchievementsScreen.field_J[param1 >> 6] >> 9;
          }
          if ((long)param1 < 1024L) {
            return AchievementsScreen.field_J[param1 >> 2] >> 11;
          }
          return AchievementsScreen.field_J[param1 >> 4] >> 10;
        }
        if ((long)param1 < 16777216L) {
          if ((long)param1 < 1048576L) {
            if (262144L <= (long)param1) {
              return AchievementsScreen.field_J[param1 >> 12] >> 6;
            }
            return AchievementsScreen.field_J[param1 >> 10] >> 7;
          }
          if ((long)param1 < 4194304L) {
            return AchievementsScreen.field_J[param1 >> 14] >> 5;
          }
          return AchievementsScreen.field_J[param1 >> 16] >> 4;
        }
        if ((long)param1 >= 268435456L) {
          if ((long)param1 >= 1073741824L) {
            return AchievementsScreen.field_J[param1 >> 24];
          }
          return AchievementsScreen.field_J[param1 >> 22] >> 1;
        }
        if (67108864L > (long)param1) {
          return AchievementsScreen.field_J[param1 >> 18] >> 3;
        }
        return AchievementsScreen.field_J[param1 >> 20] >> 2;
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
