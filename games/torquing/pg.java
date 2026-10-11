/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_a;

    final static void a(byte param0) {
        if (jh.field_z == -pf.field_A + 0) {
          jh.field_z = jh.field_z + 1;
          if (param0 == -3) {
            return;
          }
          field_a = (String) null;
          return;
        }
        if (jh.field_z == 250 - pf.field_A) {
          jh.field_z = jh.field_z + 1;
          if (param0 == -3) {
            return;
          }
          field_a = (String) null;
          return;
        }
        jh.field_z = jh.field_z + 1;
        if (param0 == -3) {
          return;
        }
        field_a = (String) null;
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, int param3, String param4) {
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
          var9 = Torquing.field_u;
          try {
            var5 = param2.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (0 <= param0) {
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
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime2 >= 0) {
                  if (param4 == null) {
                    var6 = var7_intLifetime2;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime3) {
                  if (param1 != null) {
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
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param0 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param0));
            }
            if (param4 != null &&
              param4.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param4);
            }
            if (param1 != null &&
              param1.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param1);
            }
            if (param3 != 47) {
              field_a = (String) null;
            }
            if (var6 >= var5.length()) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_41_0 = new java.net.URL(param2, var7.toString());
              return stackIn_41_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_43_0 = (java.net.URL) (param2);
              return stackIn_43_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
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
            throw rb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dn a(int param0, String param1, int param2) {
        dn var3 = null;
        RuntimeException var3_ref = null;
        dn stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new dn(false);
          var3.field_a = param0;
          var3.field_e = param1;
          if (param2 == -1) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (dn) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("pg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, la param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = param1.c(-19375);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 47) {
          pg.a(-90, (byte) 40);
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        var3 = Torquing.field_u;
        pd.field_c = 0;
        up.field_a = null;
        rd.field_x = null;
        var2 = tl.field_u;
        tl.field_u = gi.field_c;
        if (param0 == 51) {
          nn.field_c.field_k = 2;
        } else {
          if (50 != param0) {
            nn.field_c.field_k = 1;
          } else {
            nn.field_c.field_k = 5;
          }
        }
        nn.field_c.field_g = nn.field_c.field_g + 1;
        gi.field_c = var2;
        if (param1 >= -27) {
          field_a = (String) null;
        }
        if (2 <= nn.field_c.field_g &&
          param0 == 51) {
          return 2;
        }
        if (2 <= nn.field_c.field_g &&
          param0 == 50) {
          return 5;
        }
        if (nn.field_c.field_g >= 4) {
          return 1;
        }
        return -1;
    }

    static {
        field_a = "Waiting for textures";
    }
}
