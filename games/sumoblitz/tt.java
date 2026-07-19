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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb[] stackOut_6_0 = null;
        wb[] stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (k.a(param2, param1, param3, -23046)) {
              if (param0 <= -79) {
                stackOut_6_0 = ul.a(255);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (wb[]) null;
                stackIn_5_0 = stackOut_4_0;
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
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("tt.J(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
        int var2 = 0;
        int var3 = 0;
        if (param0 < -127) {
          var3 = param1;
          if (var3 != 6) {
            if (var3 == 7) {
              L0: {
                var2 = dp.a(-26346, 0);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  var2 = dp.a(-26346, param1);
                  break L0;
                }
              }
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            } else {
              var2 = dp.a(-26346, param1);
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            }
          } else {
            L1: {
              var2 = dp.a(-26346, 0);
              if (!Sumoblitz.field_L) {
                break L1;
              } else {
                var2 = dp.a(-26346, param1);
                break L1;
              }
            }
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          }
        } else {
          field_l = -86;
          var3 = param1;
          if (var3 == 6) {
            L2: {
              var2 = dp.a(-26346, 0);
              if (!Sumoblitz.field_L) {
                break L2;
              } else {
                var2 = dp.a(-26346, param1);
                break L2;
              }
            }
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          } else {
            L3: {
              L4: {
                if (var3 != 7) {
                  break L4;
                } else {
                  var2 = dp.a(-26346, 0);
                  if (!Sumoblitz.field_L) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = dp.a(-26346, param1);
              break L3;
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
