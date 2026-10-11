/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    long field_c;
    static String field_a;
    static int field_d;
    static boolean[] field_f;
    private jc field_e;
    static ia field_g;
    static String field_b;

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_35_0 = null;
          java.net.URL stackIn_37_0 = null;
          RuntimeException stackIn_40_0 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          StringBuilder stackIn_43_1 = null;
          String stackIn_44_2 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          int var8 = 0;
          Exception var9 = null;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
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
                var7_intLifetime1 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', var6 + 1);
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
                var7_intLifetime3 = var5.indexOf('/', var6 + 1);
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
            var7 = new StringBuilder(var6);
            var8 = -76 % ((param3 - 88) / 32);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param4 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param4));
            }
            if (param1 != null &&
              param1.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param1);
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param2);
            }
            if (var5.length() <= var6) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_35_0 = new java.net.URL(param0, var7.toString());
              return stackIn_35_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (Exception) (Object) decompiledCaughtException;
              var9.printStackTrace();
              stackIn_37_0 = (java.net.URL) (param0);
              return stackIn_37_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_40_0 = var5_ref;
            stackIn_40_1 = new StringBuilder().append("vj.A(");
            if (param0 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
            if (param1 == null) {
              stackIn_44_2 = "null";
            } else {
              stackIn_44_2 = "{...}";
            }
            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
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
        field_d = 0;
        field_a = "Player";
        field_f = new boolean[8];
        field_g = new ia();
        field_b = "Password: ";
    }
}
