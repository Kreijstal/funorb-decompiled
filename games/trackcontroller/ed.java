/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends rh {
    static kk field_I;

    private ed(String param0, tg param1) {
        this(param0, lb.field_O.field_h, param1);
        try {
            this.field_y = lb.field_O.field_j;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ed(String param0, t param1, tg param2) {
        super(param0, param1, param2);
        try {
            this.field_y = lb.field_O.field_j;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        String[] var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var5 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var4_int = 67 / ((param3 - -20) / 57);
          rk.field_X = cj.field_e;
          if (-256 != (param1 ^ -1)) {
            if (100 > param1) {
              fh.field_c = wg.a((byte) -118, param1, param2);
              return;
            } else {
              if ((param1 ^ -1) < -106) {
                fh.field_c = wg.a((byte) -118, param1, param2);
                return;
              } else {
                var5 = args;
                gk.a(var5, (byte) -98);
                fh.field_c = qg.a(args, 74);
                return;
              }
            }
          } else {
            L0: {
              if ((da.field_o ^ -1) <= -14) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            fh.field_c = oc.a(stackIn_5_0 != 0, -21017);
            var7 = (String[]) null;
            gk.a((String[]) null, (byte) -93);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ed.HA(");

            if (args == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        if (!(ag.b(15))) {
            return;
        }
        ij.a((byte) 111, 4, false);
        if (param0 > -91) {
            field_I = (kk) null;
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != -3621) {
            String var2 = (String) null;
            ed.a((String[]) null, 26, (String) null, (byte) 99);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_G = !this.field_G ? true : false;
        super.b(param0, param1, param2, param3);
    }

    ed(String param0, tg param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_G = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
