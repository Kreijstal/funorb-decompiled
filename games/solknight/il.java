/*
 * Decompiled by CFR-JS 0.4.0.
 */
class il extends aa {
    private long field_a;
    static va field_c;
    static String field_d;
    static int[] field_e;
    private String field_b;

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 6054) {
                break L1;
              } else {
                il.c(10);
                break L1;
              }
            }
            stackIn_3_0 = v.a(param1 + -6138, param0, 10, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("il.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    wb a(int param0) {
        if (param0 <= 30) {
            gb var3 = (gb) null;
            this.a(-115, (gb) null);
            return qb.field_L;
        }
        return qb.field_L;
    }

    final static boolean b(int param0) {
        if (param0 != 507) {
            il.b(-102);
            return lh.field_l;
        }
        return lh.field_l;
    }

    final void a(int param0, gb param1) {
        RuntimeException runtimeException = null;
        gb var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.a(this.field_a, (byte) 89);
              param1.a(111, this.field_b);
              if (param0 == -12518) {
                break L1;
              } else {
                var4 = (gb) null;
                this.a(-37, (gb) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("il.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2113536) {
            return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
    }

    il(long param0, String param1) {
        try {
            this.field_a = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "il.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{64, 8256, 16416, 2113536, 4202496, 4194368, 4194304, 4210752};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
