/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tt extends ms {
    static String field_k;
    static int field_l;

    final static wb[] a(byte param0, int param1, ki param2, int param3) {
        RuntimeException var4 = null;
        wb[] stackIn_5_0 = null;
        wb[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (k.a(param2, param1, param3, -23046)) {
              if (param0 <= -79) {
                stackIn_7_0 = ul.a(255);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (wb[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("tt.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0) {
        if (param0 != 30692) {
          field_k = (String) null;
          ki.field_f = c.field_u[0];
          iv.field_i = c.field_u[1];
          hc.field_f = c.field_u[2];
          return;
        } else {
          ki.field_f = c.field_u[0];
          iv.field_i = c.field_u[1];
          hc.field_f = c.field_u[2];
          return;
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
            field_k = (String) null;
        }
    }

    tt(int param0, boolean param1) {
    }

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        if (param0 < -127) {
          var3 = param1;
          if (var3 != 6) {
            if (var3 == 7) {
              var2 = dp.a(-26346, 0);
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            } else {
              var2 = dp.a(-26346, param1);
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            }
          } else {
            var2 = dp.a(-26346, 0);
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          }
        } else {
          field_l = -86;
          var3 = param1;
          if (var3 == 6) {
            var2 = dp.a(-26346, 0);
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          } else {
            L0: {
              if (var3 != 7) {
                var2 = dp.a(-26346, param1);
                break L0;
              } else {
                var2 = dp.a(-26346, 0);
                break L0;
              }
            }
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          }
        }
    }

    static {
        field_k = "DEFEAT.";
        field_l = 256;
    }
}
