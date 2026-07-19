/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_c;
    static vn[] field_a;
    static vn[] field_b;

    final static void a(int param0) {
        r.a(da.field_i, -49, true, to.field_d);
        pk.field_J = true;
        if (param0 != 419) {
            ed.a(-38);
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        qd.field_e = param1;
        var2 = qd.field_e;
        if ((var2 ^ -1) != -2) {
          if (var2 != 0) {
            if (param0 != -11325) {
              field_c = (String) null;
              return;
            } else {
              return;
            }
          } else {
            no.field_G = new int[]{230, 150, 180, 100};
            sf.field_d = new int[]{26, 182, 370, 463};
            ki.field_X = new int[]{-1, 160, 342, 435};
            gj.field_n = new int[]{178, 50, 134, 33};
            cj.field_c = new int[]{220, 347, 515, -1};
            fl.field_c = new int[]{170, 150, 140, 160};
            pj.field_u = new int[]{135, 135, 90, 120};
            if (param0 == -11325) {
              return;
            } else {
              field_c = (String) null;
              return;
            }
          }
        } else {
          fl.field_c = new int[]{180, 180, 180, 180};
          gj.field_n = new int[]{165, 21, 108, 30};
          pj.field_u = new int[]{135, 135, 140, 140};
          ki.field_X = new int[]{-1, 110, 290, 415};
          cj.field_c = new int[]{220, 307, 490, -1};
          sf.field_d = new int[]{26, 117, 304, 419};
          no.field_G = new int[]{230, 80, 160, 100};
          if (param0 == -11325) {
            return;
          } else {
            field_c = (String) null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -115 / ((3 - param0) / 39);
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        if (param0 < 81) {
          return;
        } else {
          System.out.println("Error: " + fg.a("%0a", -127, "\n", param1));
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String discarded$2 = null;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -105) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = ed.a((CharSequence) null, (byte) -46);
                break L1;
              }
            }
            stackOut_2_0 = fh.a(param0, param1 ^ -7154, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ed.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_c = null;
    }
}
