/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static boolean field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
        }
        field_b = null;
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
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
          java.net.URL stackIn_40_0 = null;
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
          var9 = Main.field_T;
          try {
            var5 = param1.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param3 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(var7_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((0 <= var7_int) &&
                      (decompiledFrameRemainder0 = (param2 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param3 > 0) {
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
                    if (var5.length() > var6) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                    } else {
                      discarded$8 = var7.append('/');
                    }
                    if (param4 != 353) {
                      stackIn_40_0 = (java.net.URL) null;
                      return stackIn_40_0;
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
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("hi.D(");
            if (param0 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param1 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param2 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Main.field_T;
        try {
          Main.field_G = Main.field_G + 1;
          if (ca.field_a == -1 &&
            ug.field_h == -1) {
            ca.field_a = eg.field_b;
            ug.field_h = ij.field_e;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(t.field_e));
          } else {
            decompiledFrameRemainder0 = (t.field_e == null);
          }
          if (decompiledFrameRemainder0) {
            if (!k.field_b) {
              if (Main.field_G >= ek.field_e) {
                stackIn_16_0 = (ek.field_e + ra.field_e > Main.field_G) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_16_0;
            if (param0 != null && (k.field_b ||
              var2_int != 0)) {
              Main.field_G = ek.field_e;
              decompiledFrameRemainder1 = false;
            }
            else {
              Main.field_G = 0;
            }
            ti.field_a = ug.field_h;
            p.field_k = ca.field_a;
            if (param0 == null) {
              if (var2_int != 0) {
                k.field_b = true;
              }
            } else {
              k.field_b = false;
            }
          }
          t.field_e = param0;
          if (!k.field_b &&
            ek.field_e > Main.field_G &&
            d.field_s) {
            ti.field_a = ug.field_h;
            Main.field_G = 0;
            p.field_k = ca.field_a;
          }
          ca.field_a = -1;
          ug.field_h = -1;
          if (k.field_b &&
            id.field_b == Main.field_G) {
            Main.field_G = 0;
            k.field_b = false;
          }
          if (param1 >= -32) {
            field_a = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("hi.B(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte[] param2, CharSequence param3, int param4, boolean param5) {
        int var7 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          var6_int = -param1 + param0;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param1 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param2[param4 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param2[param4 + var7] = (byte)-126;
                    break;
                  case 402:
                    param2[param4 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param2[param4 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param2[param4 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param2[var7 + param4] = (byte)-122;
                    break;
                  case 8225:
                    param2[var7 + param4] = (byte)-121;
                    break;
                  case 710:
                    param2[param4 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param2[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param2[var7 + param4] = (byte)-118;
                    break;
                  case 8249:
                    param2[param4 + var7] = (byte)-117;
                    break;
                  case 338:
                    param2[param4 + var7] = (byte)-116;
                    break;
                  case 381:
                    param2[var7 + param4] = (byte)-114;
                    break;
                  case 8216:
                    param2[var7 + param4] = (byte)-111;
                    break;
                  case 8217:
                    param2[param4 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param2[var7 + param4] = (byte)-109;
                    break;
                  case 8221:
                    param2[param4 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param2[param4 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param2[var7 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param2[param4 + var7] = (byte)-105;
                    break;
                  case 732:
                    param2[param4 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[var7 + param4] = (byte)-103;
                    break;
                  case 353:
                    param2[param4 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param2[param4 + var7] = (byte)-101;
                    break;
                  case 339:
                    param2[var7 + param4] = (byte)-100;
                    break;
                  case 382:
                    param2[var7 + param4] = (byte)-98;
                    break;
                  case 376:
                    param2[var7 + param4] = (byte)-97;
                    break;
                  default:
                    param2[param4 + var7] = (byte)63;
                    break;
                }
              } else {
                param2[var7 + param4] = (byte)var8;
              }
            }
          }
          if (!param5) {
            stackIn_70_0 = var6_int;
            return stackIn_70_0;
          }
          stackIn_68_0 = 14;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          for (var2_int = param1; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!cf.a((byte) 112, (char) var3) &&
              !Main.a(param1 ^ -49, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("hi.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = false;
    }
}
