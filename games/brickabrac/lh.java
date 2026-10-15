/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh extends km {
    static String field_r;
    static String field_t;
    static tg field_s;

    lh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void f(byte param0) {
        field_t = null;
        if (param0 >= -64) {
          lh.f(72);
          field_s = null;
          field_r = null;
          return;
        }
        field_s = null;
        field_r = null;
    }

    final void g(int param0) {
        q var5 = null;
        q var2 = this.field_m[0];
        if (param0 > 34) {
          var5 = this.field_m[this.field_h.field_r - 1];
          im.a(30 + (-this.field_j + this.field_l), 0, -var2.field_a + var5.field_d + (var5.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + this.field_j);
          return;
        }
        field_t = (String) null;
        q var4 = this.field_m[this.field_h.field_r - 1];
        im.a(30 + (-this.field_j + this.field_l), 0, -var2.field_a + var4.field_d + (var4.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + this.field_j);
    }

    final static mh f(int param0) {
        if (param0 <= 94) {
          field_t = (String) null;
          return f.field_c.field_Xb;
        }
        return f.field_c.field_Xb;
    }

    final static java.net.URL a(String param0, byte param1, String param2, int param3, java.net.URL param4) {
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
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = BrickABrac.field_J ? 1 : 0;
          try {
            var5 = param4.getFile();
            var6 = 0;
            if (param1 != 60) {
              lh.f((byte) 78);
            }
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  if (0 <= param3) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
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
                if (0 <= var7_intLifetime2) {
                  if (param0 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime3 >= 0) {
                  if (param2 == null) {
                    var6 = var7_intLifetime3;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                  continue;
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (0 < param3) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param3));
            }
            if (param0 != null &&
              param0.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param0);
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param2);
            }
            if (var6 >= var5.length()) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_41_0 = new java.net.URL(param4, var7.toString());
              return stackIn_41_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_43_0 = (java.net.URL) (param4);
              return stackIn_43_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("lh.KA(");
            if (param0 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b(int param0, int param1) {
        int var3 = super.b(param0, param1);
        if (param0 == -1 + this.field_h.field_r) {
          var3 = var3 + this.field_q / 2;
        }
        return var3;
    }

    final static int g(byte param0) {
        if (param0 != -44) {
          return 92;
        }
        return ki.field_d;
    }

    static {
        field_r = "Account created successfully!";
        field_t = "Level <%0>";
    }
}
