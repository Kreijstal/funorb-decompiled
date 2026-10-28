/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[] field_b;
    static String field_d;
    static BitmapFont field_a;
    static PcmStreamMixer field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -38) {
          field_d = (String) null;
          field_d = null;
          field_b = null;
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          MouseWheelInput.field_b = param0.getParameter("overxgames");
          if (null == MouseWheelInput.field_b) {
            MouseWheelInput.field_b = "0";
          }
          ji.field_a = param0.getParameter("overxachievements");
          if (param2 >= -120) {
            return;
          }
          if (ji.field_a == null) {
            ji.field_a = "0";
          }
          String var6 = param0.getParameter("currency");
          if (var6 != null &&
            fk.a(false, (CharSequence) ((Object) var6))) {
            gn.a(16777215, (CharSequence) ((Object) var6));
          }
          sf.field_b = new Sprite[param4.length];
          for (int var7 = 0; var7 < param4.length; var7++) {
            sf.field_b[var7] = new Sprite(317, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var6_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("nb.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_d = "OFF";
    }
}
