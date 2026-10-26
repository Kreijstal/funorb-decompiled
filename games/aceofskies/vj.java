/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    long field_c;
    static String field_a;
    static int pressedMouseButton;
    static boolean[] field_f;
    private jc field_e;
    static ia field_g;
    static String field_b;

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, int param4) {
        try {
          String stackIn_41_2 = null;
          String stackIn_44_2 = null;
          String stackIn_47_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            String var5 = param0.getFile();
            int var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                int var7_int = var5.indexOf('/', 1 + var6);
                if (0 <= var7_int) {
                  if (param4 < 0) {
                    var6 = var7_int;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                int var7_intLifetime1 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                int var7_intLifetime2 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime2 >= 0) {
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                int var7_intLifetime3 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime3 >= 0) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
            StringBuilder var7 = new StringBuilder(var6);
            int var8 = -76 % ((param3 - 88) / 32);
            StringBuilder discarded$0 = var7.append(var5.substring(0, var6));
            if (param4 > 0) {
              StringBuilder discarded$1 = var7.append("/l=");
              StringBuilder discarded$2 = var7.append(Integer.toString(param4));
            }
            if (param1 != null &&
              param1.length() > 0) {
              StringBuilder discarded$3 = var7.append("/p=");
              StringBuilder discarded$4 = var7.append(param1);
            }
            if (param2 != null &&
              param2.length() > 0) {
              StringBuilder discarded$5 = var7.append("/s=");
              StringBuilder discarded$6 = var7.append(param2);
            }
            if (var5.length() <= var6) {
              StringBuilder discarded$7 = var7.append('/');
            } else {
              StringBuilder discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              java.net.URL stackIn_35_0 = new java.net.URL(param0, var7.toString());
              return stackIn_35_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var9 = (Exception) (Object) decompiledCaughtException;
              var9.printStackTrace();
              java.net.URL stackIn_37_0 = (java.net.URL) (param0);
              return stackIn_37_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_40_0 = var5_ref;
            StringBuilder stackIn_40_1 = new StringBuilder().append("vj.A(");
            if (param0 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            StringBuilder stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
            if (param1 == null) {
              stackIn_44_2 = "null";
            } else {
              stackIn_44_2 = "{...}";
            }
            StringBuilder stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
            if (param2 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
          return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        this.field_e.a(-25160, this.field_c);
        super.finalize();
    }

    vj(jc param0, long param1, int param2) {
        try {
          this.field_c = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        pressedMouseButton = 0;
        field_a = "Player";
        field_f = new boolean[8];
        field_g = new ia();
        field_b = "Password: ";
    }
}
