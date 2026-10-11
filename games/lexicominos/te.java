/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends kf {
    static java.awt.Color field_E;

    private te(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        try {
          this.field_i = nb.field_z.field_b;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private te(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
        try {
          this.field_i = nb.field_z.field_b;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -122) {
          return;
        }
        field_E = null;
    }

    te(String param0, vd param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_C = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_C = !this.field_C ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(String param0, long param1, java.applet.Applet param2, String param3, int param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param4 != 1000) {
              var8 = (String) null;
              te.a((String) null, 24L, (java.applet.Applet) null, (String) null, -63);
            }
            try {
              var9 = param2.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var10 = param0 + "=" + param3 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (0L > param1) {
                var7Lifetime4 = var10 + "; Discard;";
              } else {
                var7Lifetime4 = var10 + "; Expires=" + q.a(1000L * param1 + rf.c(0), (byte) 28) + "; Max-Age=" + param1;
              }
              oa.a("document.cookie=\"" + var7Lifetime4 + "\"", param2, param4 - 31196);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("te.A(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        field_E = new java.awt.Color(10040319);
    }
}
