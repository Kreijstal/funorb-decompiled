/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends fj {
    static int field_u;
    static String field_t;
    static cb field_s;
    private Object field_r;

    final static void a(byte param0, int param1, ea param2) {
        pk var3 = null;
        try {
            var3 = fj.field_q;
            var3.a(5, (byte) -80);
            int var4 = 0;
            var3.d((byte) 122, 2);
            var3.d((byte) 125, 0);
            var3.d((byte) -90, param2.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gj.E(" + -88 + ',' + 5 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Geoblox.field_C;
        try {
          kd.field_b = va.field_e;
          if (param2 == 30) {
            if (param1 != 255) {
              if (param1 < 100) {
                int discarded$4 = 0;
                dl.field_a = ig.a(param0, param1);
                return;
              } else {
                if (param1 <= 105) {
                  dl.field_a = ac.a(28, param3);
                  return;
                } else {
                  int discarded$5 = 0;
                  dl.field_a = ig.a(param0, param1);
                  return;
                }
              }
            } else {
              L0: {
                stackOut_4_0 = -106;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (rd.field_u >= 13) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L0;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L0;
                }
              }
              dl.field_a = hh.a(stackIn_7_0, stackIn_7_1 != 0);
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("gj.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          L2: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final Object e(byte param0) {
        if (param0 <= 50) {
            Object var3 = null;
            gj.a((String) null, 21, (byte) -91, (String[]) null);
            return ((gj) this).field_r;
        }
        return ((gj) this).field_r;
    }

    final boolean g(int param0) {
        if (param0 != 13) {
            return true;
        }
        return false;
    }

    final static void f(byte param0) {
        ja var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            var1 = (ja) (Object) a.field_d.g(0);
            L1: while (true) {
              if (var1 == null) {
                if (param0 <= -33) {
                  break L0;
                } else {
                  gj.f((byte) 90);
                  return;
                }
              } else {
                L2: {
                  if (var1.field_z == 0) {
                    break L2;
                  } else {
                    var1.e(1643839728);
                    break L2;
                  }
                }
                var1 = (ja) (Object) a.field_d.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "gj.B(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            gj.h(-23);
            field_s = null;
            field_t = null;
            return;
        }
        field_s = null;
        field_t = null;
    }

    gj(Object param0, int param1) {
        super(param1);
        try {
            ((gj) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Login / Register";
    }
}
