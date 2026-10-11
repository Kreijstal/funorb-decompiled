/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static int field_e;
    static ut[] field_d;
    static int[][] field_f;
    static int field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5;
        var5 = Kickabout.field_G;
        if (param2) {
          if (!param1) {
            return;
          }
          if (2 != param0) {
            if (param0 != 3) {
              return;
            }
            if (!param3) {
              gu.b(2, (byte) 60, vc.field_E[5]);
            } else {
              ui.a(2, 7, vc.field_E[4], 2147483647);
            }
            return;
          }
          if (param3) {
            ui.a(2, 5, vc.field_E[4], 2147483647);
            if (param0 != 3) {
              return;
            }
            ui.a(2, 7, vc.field_E[4], 2147483647);
            return;
          }
          gu.b(2, (byte) 60, vc.field_E[5]);
        } else {
          so.a(44, true, true, false);
          if (!param1) {
            return;
          }
          if (2 == param0) {
            if (!param3) {
              gu.b(2, (byte) 60, vc.field_E[5]);
            } else {
              ui.a(2, 5, vc.field_E[4], 2147483647);
            }
          }
        }
        if (param0 != 3) {
          return;
        }
        if (param3) {
          ui.a(2, 7, vc.field_E[4], 2147483647);
        } else {
          gu.b(2, (byte) 60, vc.field_E[5]);
        }
    }

    final static boolean a(sj param0, boolean param1, sj param2, sj param3) {
        RuntimeException var4 = null;
        sj var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.d(-38) &&
            param0.a(false, "commonui")) {
            if (!param2.d(-57)) {
              return false;
            }
            if (!param2.a(false, "commonui")) {
              return false;
            }
            if (param3.d(-124) &&
              param3.a(false, "button.gif")) {
              if (!param1) {
                var5 = (sj) null;
                so.a((sj) null, true, (sj) null, (sj) null);
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("so.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -113) {
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = (int[][]) null;
          return;
        }
        sj var2 = (sj) null;
        so.a((sj) null, false, (sj) null, (sj) null);
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = (int[][]) null;
    }

    final static java.applet.Applet a(int param0) {
        if (null != qs.field_M) {
          return qs.field_M;
        }
        int var1 = -80 / ((-28 - param0) / 43);
        return (java.applet.Applet) ((Object) ap.field_p);
    }

    static {
        field_b = -1;
        field_c = "Create your own free Jagex account";
        field_a = "Spend";
    }
}
