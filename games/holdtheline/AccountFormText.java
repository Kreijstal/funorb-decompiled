/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountFormText {
    static IntrusiveDeque field_c;
    static String field_f;
    private String text;
    private boolean submitText;
    static int field_b;
    static String field_a;

    final String getText(byte param0) {
        if (param0 != -41) {
          this.submitText = true;
          return this.text;
        }
        return this.text;
    }

    final static String formatRaceTime(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        char[] var4 = null;
        char[] var4Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (0 > param0) {
          return "--:--";
        }
        if (param1 == -61) {
          var2 = param0 / 50;
          var3 = var2 / 60;
          var2 = var2 % 60;
          var4 = new char[5];
          var4[3] = (char)(var2 / 10 + 48);
          var4[0] = (char)(48 + var3 / 10 % 10);
          var4[1] = (char)(var3 % 10 + 48);
          var4[2] = (char)58;
          var4[4] = (char)(var2 % 10 + 48);
          return new String(var4);
        }
        AccountFormText.formatRaceTime(34, (byte) -85);
        var2Lifetime1 = param0 / 50;
        var3Lifetime1 = var2Lifetime1 / 60;
        var2Lifetime1 = var2Lifetime1 % 60;
        var4Lifetime1 = new char[5];
        var4Lifetime1[3] = (char)(var2Lifetime1 / 10 + 48);
        var4Lifetime1[0] = (char)(48 + var3Lifetime1 / 10 % 10);
        var4Lifetime1[1] = (char)(var3Lifetime1 % 10 + 48);
        var4Lifetime1[2] = (char)58;
        var4Lifetime1[4] = (char)(var2Lifetime1 % 10 + 48);
        return new String(var4Lifetime1);
    }

    final boolean shouldSubmitText(byte param0) {
        if (param0 >= -22) {
          field_c = (IntrusiveDeque) null;
          return this.submitText;
        }
        return this.submitText;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != 10) {
          field_f = (String) null;
        }
    }

    AccountFormText(String param0, boolean param1) {
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
          this.submitText = stackIn_6_1;
          if (0 != this.text.length()) {
            return;
          }
          this.submitText = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("io.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    AccountFormText(String param0) {
        this(param0, false);
    }

    static {
        field_f = "You can also choose to play either <col=1>Practice</col> or <col=1>Demolition</col> games. The course selection in these modes depends on your progress through the <col=1>Championship</col>.<br><br><col=1>Practice</col> mode allows you to try out a course for as many laps as you like, with or without computer-controlled competitors, to help you improve your lap times.<br><br>In <col=1>Demolition</col> mode, use your shields, weaponry and front bumper to damage opponents. Eliminate <col=1>5</col> opponents to win the round.<br><br>";
        field_c = new IntrusiveDeque();
        field_b = 0;
        field_a = "Set";
    }
}
