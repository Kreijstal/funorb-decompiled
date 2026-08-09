/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv {
    static int[] field_a;

    final static boolean a(byte param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 <= -71) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (95 != param1) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          wv.a(false);
          if (param1 != 160) {
            if (param1 != 32) {
              if (95 != param1) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = gf.a('_', param2, param0, "");
              if (!param0) {
                break L1;
              } else {
                var4 = (String) null;
                wv.a(true, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ji.a(param2, (byte) 81);
                if (-1 != param1.indexOf(param2)) {
                  break L3;
                } else {
                  if (0 == (param1.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("wv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0) {
        if (param0 != 24238) {
            field_a = (int[]) null;
            lf.a(0, 0);
            return;
        }
        lf.a(0, 0);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            wv.a((byte) 57, 'U');
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (hc.field_c != null) {
                hc.field_c.n(-7);
            }
            no.field_a = new cv(param1, param2, false, true, true);
            if (param0 < 73) {
                String var4 = (String) null;
                wv.a(false, (String) null, (String) null);
            }
            vi.field_y.b((byte) -119, no.field_a);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wv.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
