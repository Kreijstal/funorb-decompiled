/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements jm {
    static tk field_a;
    static String[] field_b;
    static String field_c;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        r var3 = null;
        int var2 = Chess.field_G;
        ud.field_b = false;
        pd.field_Rb = null;
        ib.field_d = null;
        if (!param0) {
            return;
        }
        try {
            if (!(null == bb.field_d)) {
                bb.field_d.e(-31023);
                bb.field_d = null;
            }
            d.field_Mb = null;
            if (!(null == nk.field_t)) {
                nk.field_t.e(-31023);
                nk.field_t = null;
            }
            ae.field_f = null;
            if (null != pd.field_Sb) {
                pd.field_Sb.e(-31023);
                pd.field_Sb = null;
            }
            cm.field_v = null;
            if (null != d.field_Mb) {
                var3 = (r) ((Object) d.field_Mb.a(false));
                while (var3 != null) {
                    var3.d(-1);
                    var3 = (r) ((Object) d.field_Mb.a(0));
                }
                d.field_Mb = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "vf.B(" + param0 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        km var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 58) {
              L1: {
                var6_int = param1 + param4.field_u;
                var7 = param4.field_r + param2;
                vj.a(var7, param4.field_C, param4.field_y, (byte) 119, var6_int);
                var8 = uh.field_p[1];
                if (!(param4 instanceof fb)) {
                  break L1;
                } else {
                  if (!((fb) ((Object) param4)).field_I) {
                    break L1;
                  } else {
                    var8.d((param4.field_y - var8.field_v >> 1488190753) + (var6_int - -1), (-var8.field_u + param4.field_C >> 492452417) + 1 + var7, 256);
                    break L1;
                  }
                }
              }
              if (param4.d((byte) -67)) {
                rc.a(param4.field_C - 4, false, var6_int - -2, param4.field_y - 4, 2 + var7);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0) {
          field_e = (String) null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        in.a((byte) 123, param0, false);
        if (param1 > -121) {
            field_b = (String[]) null;
        }
    }

    static {
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_a = new tk();
        field_c = "Go Back";
        field_d = "To <%0>: ";
        field_e = "Unable to delete name - system busy";
    }
}
