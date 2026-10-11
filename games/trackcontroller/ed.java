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
        String[] var5 = null;
        int var6 = 0;
        String[] var7 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var4_int = 67 / ((param3 + 20) / 57);
          rk.field_X = cj.field_e;
          if (param1 == 255) {
            stackIn_5_0 = !(da.field_o >= 13);
            fh.field_c = oc.a(stackIn_5_0, -21017);
            var7 = (String[]) null;
            gk.a((String[]) null, (byte) -93);
            return;
          }
          if (100 > param1) {
            fh.field_c = wg.a((byte) -118, param1, param2);
            return;
          }
          if (param1 > 105) {
            fh.field_c = wg.a((byte) -118, param1, param2);
            return;
          }
          var5 = args;
          gk.a(var5, (byte) -98);
          fh.field_c = qg.a(args, 74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ed.HA(");
          if (args == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!ag.b(15)) {
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
