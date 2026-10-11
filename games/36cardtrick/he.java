/*
 * Decompiled by CFR-JS 0.4.0.
 */
class he extends qb {
    he field_i;
    static float field_g;
    long field_j;
    he field_h;

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
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
          var7 = Main.field_T;
          try {
            try {
              var3 = (String) (vh.a("getcookies", param0 + 12798, param1));
              if (param0 != -24949) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var4 = rh.a(';', var3, -85);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
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
            stackIn_17_1 = new StringBuilder().append("he.UA(").append(param0).append(',');
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
            throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected he() {
    }

    final static void a(int param0, String param1) {
        try {
          pk.field_a = param1;
          gh.a(12, 31888);
          if (param0 != 0) {
            field_g = -1.2815539836883545f;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "he.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Boolean a(int param0) {
        if (param0 != 59) {
          return (Boolean) null;
        }
        Boolean var1 = ni.field_f;
        ni.field_f = null;
        return var1;
    }

    final void d(int param0) {
        if (null == this.field_i) {
          return;
        }
        this.field_i.field_h = this.field_h;
        this.field_h.field_i = this.field_i;
        this.field_h = null;
        if (param0 != 12) {
          this.field_i = (he) null;
        }
        this.field_i = null;
    }

    static {
    }
}
