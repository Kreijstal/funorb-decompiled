/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelectionSupport {
    static int[] field_b;
    static int field_a;
    static char[] field_c;

    final static String formatMinutesSeconds(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param0 >= 60) {
          return ModelInstance.formatTimer(param0 % 60, param1, 45, param0 / 60);
        }
        String var7 = DialogLayer.timerMinutesSeconds;
        char[] var9 = var7.toCharArray();
        char[] var8 = var9;
        char[] var4 = var8;
        if (param2 == 10) {
          var5 = var7.indexOf("mm");
          incrementValue$0 = var5;
          var5++;
          var4[incrementValue$0] = (char)(param0 >= 0 ? 48 + param0 / 10 : 45);
          incrementValue$1 = var5;
          var5++;
          var4[incrementValue$1] = (char)(param0 < 0 ? 45 : param0 % 10 + 48);
          var5Lifetime3 = var7.indexOf("ss");
          incrementValue$2 = var5Lifetime3;
          var5Lifetime3++;
          var4[incrementValue$2] = (char)(0 <= param1 ? param1 / 10 + 48 : 45);
          incrementValue$3 = var5Lifetime3;
          var5Lifetime3++;
          var4[incrementValue$3] = (char)(param1 < 0 ? 45 : param1 % 10 + 48);
          return new String(var9);
        }
        UiComponent var6 = (UiComponent) null;
        MenuSelectionSupport.selectComponentTreeByKey((UiComponent) null, (byte) 119, -128);
        var5Lifetime1 = var7.indexOf("mm");
        int incrementValue$4 = var5Lifetime1;
        var5Lifetime1++;
        var4[incrementValue$4] = (char)(param0 >= 0 ? 48 + param0 / 10 : 45);
        int incrementValue$5 = var5Lifetime1;
        var5Lifetime1++;
        var4[incrementValue$5] = (char)(param0 < 0 ? 45 : param0 % 10 + 48);
        var5Lifetime2 = var7.indexOf("ss");
        int incrementValue$6 = var5Lifetime2;
        var5Lifetime2++;
        var4[incrementValue$6] = (char)(0 <= param1 ? param1 / 10 + 48 : 45);
        int incrementValue$7 = var5Lifetime2;
        var5Lifetime2++;
        var4[incrementValue$7] = (char)(param1 < 0 ? 45 : param1 % 10 + 48);
        return new String(var9);
    }

    final static int[] createEmptyGameStateWords(int param0) {
        int var1 = 53 % ((param0 - 72) / 37);
        return new int[8];
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -39) {
          field_a = 27;
        }
    }

    final static void selectComponentTreeByKey(UiComponent param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var3 = null;
        UiComponent var4 = null;
        UiComponent stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -38) {
            return;
          }
          stackIn_5_0 = (UiComponent) (param0);
          stackIn_6_1 = (param2 != -1) && ((long)param2 == param0.key);
          stackIn_5_0.selected = stackIn_6_1;
          if (null != param0.children &&
            !param0.children.isEmpty(0)) {
            var3 = new IntrusiveDequeCursor(param0.children);
            var4 = (UiComponent) (var3.last((byte) -92));
            while (var4 != null) {
              MenuSelectionSupport.selectComponentTreeByKey(var4, (byte) -69, param2);
              var4 = (UiComponent) (var3.previous(-111));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("ek.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int pollAccountDialogResult(byte param0, boolean param1, int param2, int param3) {
        if (param0 != -88) {
          field_b = (int[]) null;
          return AccountProtocolStage.pollAccountDialogResult((byte) -115);
        }
        return AccountProtocolStage.pollAccountDialogResult((byte) -115);
    }

    static {
        field_b = new int[12];
        field_a = 14;
        field_c = new char[128];
    }
}
