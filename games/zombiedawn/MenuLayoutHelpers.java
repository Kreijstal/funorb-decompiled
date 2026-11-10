/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuLayoutHelpers {
    static String field_c;
    static Sprite[] field_a;
    static Sprite[] field_b;

    final static void showReconnectLogin(int param0) {
        GridContainer.showLoggingInDialog(AchievementBanner.field_i, -49, true, IntroSpeedHelpers.field_d);
        DropdownItemList.field_J = true;
        if (param0 != 419) {
          MenuLayoutHelpers.showReconnectLogin(-38);
        }
    }

    final static void selectMenuLayout(int param0, int param1) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        CutsceneStateHelpers.field_e = param1;
        var2 = CutsceneStateHelpers.field_e;
        if (var2 == 1) {
          AccountResultHelpers.field_c = new int[]{180, 180, 180, 180};
          WidgetStyleLayer.field_n = new int[]{165, 21, 108, 30};
          ArchiveRequest.field_u = new int[]{135, 135, 140, 140};
          ContentTransitionDialog.field_X = new int[]{-1, 110, 290, 415};
          IntrusiveDequeCursor.field_c = new int[]{220, 307, 490, -1};
          BufferedFile.field_d = new int[]{26, 117, 304, 419};
          RopeLadder.field_G = new int[]{230, 80, 160, 100};
        } else {
          if (var2 == 0) {
            RopeLadder.field_G = new int[]{230, 150, 180, 100};
            BufferedFile.field_d = new int[]{26, 182, 370, 463};
            ContentTransitionDialog.field_X = new int[]{-1, 160, 342, 435};
            WidgetStyleLayer.field_n = new int[]{178, 50, 134, 33};
            IntrusiveDequeCursor.field_c = new int[]{220, 347, 515, -1};
            AccountResultHelpers.field_c = new int[]{170, 150, 140, 160};
            ArchiveRequest.field_u = new int[]{135, 135, 90, 120};
          }
        }
        if (param0 == -11325) {
          return;
        }
        field_c = (String) null;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        int var1 = -115 / ((3 - param0) / 39);
        field_a = null;
        field_b = null;
    }

    final static void printError(int param0, String param1) {
        if (param0 >= 81) {
          System.out.println("Error: " + InstructionsScreen.replaceAll("%0a", -127, "\n", param1));
          return;
        }
    }

    final static String formatName(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -105) {
            var3 = (CharSequence) null;
            MenuLayoutHelpers.formatName((CharSequence) null, (byte) -46);
          }
          stackIn_3_0 = DisplayNameForm.validateDisplayName(param0, param1 ^ -7154, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ed.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = null;
    }
}
