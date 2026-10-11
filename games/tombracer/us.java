/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    private boolean field_d;
    private String field_a;
    private boolean field_b;
    static sla field_e;
    static String field_c;

    final boolean c(int param0) {
        int var2 = -59 % ((param0 + 57) / 37);
        return this.field_b;
    }

    final boolean b(int param0) {
        if (param0 < 42) {
          return false;
        }
        return this.field_d;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, int param3, String param4) {
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
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
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
          var9 = TombRacer.field_G ? 1 : 0;
          try {
            var5 = param1.getFile();
            if (param0 < 29) {
              field_c = (String) null;
            }
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param3 >= 0) {
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
                  if (param4 != null) {
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
            discarded$0 = var7.append(var5.substring(0, var6));
            if (0 < param3) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param3));
            }
            if (param4 != null &&
              param4.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param4);
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param2);
            }
            if (var5.length() > var6) {
              discarded$7 = var7.append(var5.substring(var6, var5.length()));
            } else {
              discarded$8 = var7.append('/');
            }
            try {
              stackIn_42_0 = new java.net.URL(param1, var7.toString());
              return stackIn_42_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_44_0 = (java.net.URL) (param1);
              return stackIn_44_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("us.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param2 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(byte param0) {
        if (param0 < 78) {
          field_e = (sla) null;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1) {
        this.field_b = param1 ? true : false;
        int var3 = 97 % ((13 - param0) / 39);
        this.field_d = true;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var4 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_70_0 = var3;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_73_0 = var2;
          stackIn_73_1 = new StringBuilder().append("us.G(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != -1) {
          field_c = (String) null;
        }
    }

    final static void a(int param0, jea param1, jea param2) {
        if (param1.field_J == null) {
          param1.field_J = new vna();
        }
        if (null == param2.field_J) {
          param2.field_J = new vna();
        }
        if (hia.field_s == null) {
          hia.field_s = new af(64);
        }
        if (bla.field_G == null) {
          bla.field_G = new af(64);
        }
        wv.field_l = param2.field_J;
        if (param0 != -8250) {
          return;
        }
        try {
          fla.field_f = param1.field_J;
          ub.b(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "us.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    us(String param0) {
        this.field_b = false;
        this.field_d = false;
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "us.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new sla();
        field_c = "Please select your treasure";
    }
}
