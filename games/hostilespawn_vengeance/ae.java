/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae extends dk {
    static volatile int field_s;
    static int[] field_q;
    volatile boolean field_v;
    static String field_r;
    boolean field_t;
    boolean field_w;
    static int field_u;

    abstract byte[] c(byte param0);

    public static void a(boolean param0) {
        field_r = null;
        if (!param0) {
          field_u = 115;
        }
        field_q = null;
    }

    abstract int d(int param0);

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_6_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = HostileSpawn.field_I ? 1 : 0;
          try {
            try {
              var3 = (String) (a.a("getcookies", param0, -120));
              var4 = cj.a(var3, -84, ';');
              for (var5 = param2; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_6_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return (String) (stackIn_11_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("ae.B(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ae() {
        this.field_v = true;
    }

    final static void a(gb param0, int param1, gb param2) {
        cl.field_i = param2;
        if (param1 < 27) {
          return;
        }
        try {
          jk.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ae.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = 0;
        field_q = new int[8192];
        field_r = "Completed";
        field_u = -1;
    }
}
