/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends r {
    static String field_p;
    private tl field_n;
    static int field_o;
    private boolean field_r;
    private String field_s;
    static String field_q;

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n.a(160, param1) == ml.field_K) {
            stackIn_2_0 = this.field_n.a((byte) -27, param1);
            return stackIn_2_0;
          }
          var3_int = 21 % ((param0 - 24) / 46);
          if (this.a(160, param1) != ml.field_K) {
            stackIn_7_0 = ha.field_j;
            return stackIn_7_0;
          }
          stackIn_5_0 = aj.field_r;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 != 2) {
          ck.c((byte) 106);
        }
    }

    ck(c param0, c param1) {
        super(param0);
        this.field_r = false;
        this.field_s = "";
        try {
          this.field_n = new tl(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wd a(int param0, String param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n.a((int) (char)param0, param1) == ml.field_K) {
            stackIn_2_0 = ml.field_K;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_s)) {
            var3 = aj.a(param1, -1);
            if (!var3.a(param0 - 282)) {
              stackIn_7_0 = w.field_e;
              return stackIn_7_0;
            }
            this.field_s = param1;
            this.field_r = var3.b(param0 ^ 28033);
          }
          if (this.field_r) {
            stackIn_12_0 = hm.field_b;
          } else {
            stackIn_12_0 = ml.field_K;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = fleas.field_A ? 1 : 0;
          try {
            try {
              var3 = (String) (eb.a("getcookies", param2, -250));
              var4 = m.a(';', 121, var3);
              if (param0 != -5174) {
                ck.c((byte) 90);
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ck.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_q = "Email: ";
        field_p = "Accept";
    }
}
