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
            var3.a(param1, (byte) -80);
            int var4 = 66 % ((param0 - 23) / 51);
            var3.d((byte) 122, 2);
            var3.d((byte) 125, 0);
            var3.d((byte) -90, param2.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gj.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            kd.field_b = va.field_e;
            if (param2 == 30) {
              if (param1 != 255) {
                if ((param1 ^ -1) > -101) {
                  dl.field_a = ig.a(param0, param1, false);
                  return;
                } else {
                  if (-106 <= (param1 ^ -1)) {
                    dl.field_a = ac.a(28, param3);
                    return;
                  } else {
                    dl.field_a = ig.a(param0, param1, false);
                    return;
                  }
                }
              } else {
                L1: {
                  stackIn_6_0 = -106;

                  if ((rd.field_u ^ -1) <= -14) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 1;
                    break L1;
                  }
                }
                dl.field_a = hh.a(stackIn_7_0, stackIn_7_1 != 0);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gj.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final Object e(byte param0) {
        if (param0 <= 50) {
            String[] var3 = (String[]) null;
            gj.a((String) null, 21, (byte) -91, (String[]) null);
            return this.field_r;
        }
        return this.field_r;
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
            var1 = (ja) ((Object) a.field_d.g(0));
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
                  if (-1 == (var1.field_z ^ -1)) {
                    break L2;
                  } else {
                    var1.e(1643839728);
                    break L2;
                  }
                }
                var1 = (ja) ((Object) a.field_d.d(1));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "gj.B(" + param0 + ')');
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
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = "Login / Register";
    }
}
