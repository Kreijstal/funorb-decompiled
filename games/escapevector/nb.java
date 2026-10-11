/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[] field_b;
    static String field_d;
    static wl field_a;
    static hj field_c;

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
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = EscapeVector.field_A;
        try {
          ca.field_b = param0.getParameter("overxgames");
          if (null == ca.field_b) {
            ca.field_b = "0";
          }
          ji.field_a = param0.getParameter("overxachievements");
          if (param2 >= -120) {
            return;
          }
          if (ji.field_a == null) {
            ji.field_a = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 != null &&
            fk.a(false, (CharSequence) ((Object) var6))) {
            gn.a(16777215, (CharSequence) ((Object) var6));
          }
          sf.field_b = new ed[param4.length];
          for (var7 = 0; var7 < param4.length; var7++) {
            sf.field_b[var7] = new ed(317, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_18_0 = var6_ref;
          stackIn_18_1 = new StringBuilder().append("nb.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
