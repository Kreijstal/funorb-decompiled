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
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              ca.field_b = param0.getParameter("overxgames");
              if (null == ca.field_b) {
                ca.field_b = "0";
                break L1;
              } else {
                break L1;
              }
            }
            ji.field_a = param0.getParameter("overxachievements");
            if (param2 < -120) {
              L2: {
                if (ji.field_a != null) {
                  break L2;
                } else {
                  ji.field_a = "0";
                  break L2;
                }
              }
              L3: {
                var6 = param0.getParameter("currency");
                if (var6 == null) {
                  break L3;
                } else {
                  if (fk.a(false, (CharSequence) ((Object) var6))) {
                    gn.a(16777215, (CharSequence) ((Object) var6));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              sf.field_b = new ed[param4.length];
              var7 = 0;
              L4: while (true) {
                if (var7 >= param4.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  sf.field_b[var7] = new ed(317, 34);
                  var7++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var6_ref);

            stackIn_18_1 = new StringBuilder().append("nb.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "OFF";
    }
}
