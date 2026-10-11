/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends rg {
    static String field_D;
    static String field_z;
    static dd field_C;
    static wh field_x;
    static int field_y;
    static String field_A;
    static String field_B;
    static String field_w;

    o() {
    }

    final static int a(int param0, byte param1) {
        param0 = param0 & 8191;
        int var2 = 13 / ((param1 + 21) / 41);
        if (param0 < 4096) {
          return param0 >= 2048 ? -wf.field_b[param0 - 2048] : wf.field_b[2048 - param0];
        }
        return param0 < 6144 ? -wf.field_b[6144 - param0] : wf.field_b[-6144 + param0];
    }

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Pool.field_O;
        try {
          var4_int = param2.length();
          var5 = param1.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (param3 != 1) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(param2.substring(var9));
              stackIn_13_0 = var8.toString();
              return stackIn_13_0;
            }
            discarded$2 = var8.append(param2.substring(var9, var10));
            discarded$3 = var8.append(param1);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("o.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 > 89) {
          field_C = null;
          field_x = null;
          field_z = null;
          field_A = null;
          field_w = null;
          return;
        }
    }

    final static void c(byte param0) {
        if (gk.field_kb) {
          mf.field_o = true;
          ii.a(true, 0);
          fk.field_ab = 0;
          if (param0 <= 18) {
            field_z = (String) null;
          }
          return;
        }
        throw new IllegalStateException();
    }

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        try {
          var6_int = -param4 + param3;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param1.charAt(param4 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param0[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param0[var7 + param5] = (byte)-126;
                    break;
                  case 402:
                    param0[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param0[var7 + param5] = (byte)-124;
                    break;
                  case 8230:
                    param0[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param0[param5 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param0[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param0[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param0[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param0[var7 + param5] = (byte)-118;
                    break;
                  case 8249:
                    param0[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param0[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param0[param5 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param0[var7 + param5] = (byte)-111;
                    break;
                  case 8217:
                    param0[param5 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param0[param5 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param0[var7 + param5] = (byte)-108;
                    break;
                  case 8226:
                    param0[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param0[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param0[var7 + param5] = (byte)-105;
                    break;
                  case 732:
                    param0[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param0[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param0[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param0[param5 + var7] = (byte)-101;
                    break;
                  case 339:
                    param0[param5 + var7] = (byte)-100;
                    break;
                  case 382:
                    param0[var7 + param5] = (byte)-98;
                    break;
                  case 376:
                    param0[var7 + param5] = (byte)-97;
                    break;
                  default:
                    param0[param5 + var7] = (byte)63;
                    break;
                }
              } else {
                param0[var7 + param5] = (byte)var8;
              }
            }
          }
          if (param2 != -24984) {
            o.e(82);
          }
          stackIn_68_0 = var6_int;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("o.P(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_z = "Staff impersonation";
        field_D = "You lost 1 life!";
        field_y = 0;
        field_B = "You<%0> are all offering a rematch.";
        field_w = "To server list";
        field_A = "Loading...";
    }
}
