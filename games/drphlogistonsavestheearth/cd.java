/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_b;
    static sa field_c;
    static String field_a;
    static int field_d;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -47) {
            cd.a(115);
        }
    }

    final static void a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ol.field_a) {
                ol.field_a.d(true);
                break L1;
              } else {
                break L1;
              }
            }
            pi.field_O = new wa(param0, param2, false, true, true);
            fb.field_e.a(33, pi.field_O);
            if (param1 <= -2) {
              break L0;
            } else {
              cd.b((byte) 3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("cd.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final static double a(byte param0) {
        if (param0 <= 70) {
          field_c = (sa) null;
          return Math.pow(3.0, (double)(-1 + hc.field_G));
        } else {
          return Math.pow(3.0, (double)(-1 + hc.field_G));
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (mi.field_f != null) {
              try {
                L0: {
                  mi.field_f.a(0L, (byte) -63);
                  mi.field_f.a(24, dh.field_N.field_j, 18017, dh.field_N.field_h);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                dh.field_N.field_j = dh.field_N.field_j + 24;
                if (param0 != 4) {
                  cd.a(4);
                  return;
                } else {
                  return;
                }
              }
              L1: {
                dh.field_N.field_j = dh.field_N.field_j + 24;
                if (param0 == 4) {
                  break L1;
                } else {
                  cd.a(4);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                dh.field_N.field_j = dh.field_N.field_j + 24;
                if (param0 == 4) {
                  break L2;
                } else {
                  cd.a(4);
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Continue";
        field_c = new sa(2, 4, 4, 0);
        field_d = 10;
    }
}
