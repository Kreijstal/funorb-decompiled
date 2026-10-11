/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends gn {
    static int field_i;
    static String field_e;
    static boolean field_j;
    static ut field_k;
    bc field_g;
    static boolean field_h;
    int field_f;

    final static boolean a(int param0, int param1, int param2) {
        String var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        if (param2 == 3) {
          return mt.a((byte) -43);
        }
        var3 = "";
        var4 = 0;
        var5 = -71 / ((param0 + 58) / 61);
        if (param2 != 2) {
          if (param2 == 1) {
            var4 = 3;
            var3 = "goal_pipe";
          } else {
            if (param1 == 0) {
              var3 = "goal_park";
              var4 = 6;
            }
            if (1 == param1) {
              var4 = 5;
              var3 = "goal_beach";
            }
            if (param1 == 2) {
              var3 = "goal_street";
              var4 = 4;
            }
          }
        } else {
          var3 = "goal_rusty";
          var4 = 2;
        }
        if (kc.field_g[var4] != null) {
          return true;
        }
        if (!bo.field_Cb.a("scenery", var3, (byte) -10)) {
          return false;
        }
        kc.field_g[var4] = bg.a("scenery", bo.field_Cb, (byte) 76, var3);
        return true;
    }

    public static void a(byte param0) {
        if (param0 != -123) {
          byte[] var2 = (byte[]) null;
          iu.a(92, (CharSequence) null, 36, (byte[]) null, 126, 18);
        }
        field_k = null;
        field_e = null;
    }

    final static int a(int param0, CharSequence param1, int param2, byte[] param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          var6_int = -param4 + param0;
          var7 = 0;
          if (param5 <= 39) {
            stackIn_3_0 = 23;
            return stackIn_3_0;
          }
          while (var7 < var6_int) {
            {
              var8 = param1.charAt(var7 + param4);
              if ((var8 <= 0 ||
                128 <= var8) && (160 > var8 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param3[var7 + param2] = (byte)-128;
                    break;
                  case 8218:
                    param3[var7 + param2] = (byte)-126;
                    break;
                  case 402:
                    param3[param2 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param3[var7 + param2] = (byte)-124;
                    break;
                  case 8230:
                    param3[var7 + param2] = (byte)-123;
                    break;
                  case 8224:
                    param3[var7 + param2] = (byte)-122;
                    break;
                  case 8225:
                    param3[var7 + param2] = (byte)-121;
                    break;
                  case 710:
                    param3[var7 + param2] = (byte)-120;
                    break;
                  case 8240:
                    param3[param2 + var7] = (byte)-119;
                    break;
                  case 352:
                    param3[var7 + param2] = (byte)-118;
                    break;
                  case 8249:
                    param3[var7 + param2] = (byte)-117;
                    break;
                  case 338:
                    param3[var7 + param2] = (byte)-116;
                    break;
                  case 381:
                    param3[param2 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param3[param2 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param3[param2 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param3[param2 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param3[param2 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param3[param2 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param3[param2 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param3[var7 + param2] = (byte)-105;
                    break;
                  case 732:
                    param3[param2 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param3[var7 + param2] = (byte)-103;
                    break;
                  case 353:
                    param3[var7 + param2] = (byte)-102;
                    break;
                  case 8250:
                    param3[var7 + param2] = (byte)-101;
                    break;
                  case 339:
                    param3[var7 + param2] = (byte)-100;
                    break;
                  case 382:
                    param3[param2 + var7] = (byte)-98;
                    break;
                  default:
                    param3[var7 + param2] = (byte)63;
                    break;
                  case 376:
                    param3[var7 + param2] = (byte)-97;
                    break;
                }
              } else {
                param3[param2 + var7] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("iu.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        hg.g(-88);
        int var2 = -23 / ((param0 + 81) / 34);
    }

    iu(bc param0, int param1) {
        try {
          this.field_f = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "<%0> has declined the invitation.";
    }
}
