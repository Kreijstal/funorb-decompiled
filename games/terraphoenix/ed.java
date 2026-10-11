/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_c;
    static String field_b;
    static char[] field_a;
    static float field_d;

    public static void a(byte param0) {
        if (param0 != 63) {
          field_b = (String) null;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1, CharSequence param2, byte[] param3, int param4, int param5) {
        int var8 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        try {
          var6_int = 8 % ((param1 - 48) / 51);
          var7 = -param0 + param5;
          for (var8 = 0; var8 < var7; var8++) {
            {
              var9 = param2.charAt(var8 + param0);
              if ((0 >= var9 ||
                var9 >= 128) && (160 > var9 ||
                var9 > 255)) {
                switch (var9) {
                  case 8364:
                    param3[param4 + var8] = (byte)-128;
                    break;
                  case 8218:
                    param3[var8 + param4] = (byte)-126;
                    break;
                  case 402:
                    param3[var8 + param4] = (byte)-125;
                    break;
                  case 8222:
                    param3[var8 + param4] = (byte)-124;
                    break;
                  case 8230:
                    param3[var8 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param3[var8 + param4] = (byte)-122;
                    break;
                  case 8225:
                    param3[var8 + param4] = (byte)-121;
                    break;
                  case 710:
                    param3[var8 + param4] = (byte)-120;
                    break;
                  case 8240:
                    param3[var8 + param4] = (byte)-119;
                    break;
                  case 352:
                    param3[var8 + param4] = (byte)-118;
                    break;
                  case 8249:
                    param3[param4 + var8] = (byte)-117;
                    break;
                  case 338:
                    param3[param4 + var8] = (byte)-116;
                    break;
                  case 381:
                    param3[var8 + param4] = (byte)-114;
                    break;
                  case 8216:
                    param3[param4 + var8] = (byte)-111;
                    break;
                  case 8217:
                    param3[param4 + var8] = (byte)-110;
                    break;
                  case 8220:
                    param3[var8 + param4] = (byte)-109;
                    break;
                  case 8221:
                    param3[var8 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param3[var8 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param3[var8 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param3[var8 + param4] = (byte)-105;
                    break;
                  case 732:
                    param3[var8 + param4] = (byte)-104;
                    break;
                  case 8482:
                    param3[var8 + param4] = (byte)-103;
                    break;
                  case 353:
                    param3[var8 + param4] = (byte)-102;
                    break;
                  case 8250:
                    param3[var8 + param4] = (byte)-101;
                    break;
                  case 339:
                    param3[var8 + param4] = (byte)-100;
                    break;
                  case 382:
                    param3[param4 + var8] = (byte)-98;
                    break;
                  default:
                    param3[param4 + var8] = (byte)63;
                    break;
                  case 376:
                    param3[var8 + param4] = (byte)-97;
                    break;
                }
              } else {
                param3[var8 + param4] = (byte)var9;
              }
            }
          }
          stackIn_67_0 = var7;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("ed.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Terraphoenix.field_V;
        try {
          var5_int = param0 + param4;
          if (param3 != 52) {
            var14 = (byte[]) null;
            ed.a(49, (byte) 110, (CharSequence) null, (byte[]) null, -127, -124);
          }
          var6 = param1 + param2;
          if (param4 <= l.field_b) {
            stackIn_6_0 = l.field_b;
          } else {
            stackIn_6_0 = param4;
          }
          var7 = stackIn_6_0;
          if (l.field_d < param2) {
            stackIn_9_0 = param2;
          } else {
            stackIn_9_0 = l.field_d;
          }
          var8 = stackIn_9_0;
          if (l.field_f <= var5_int) {
            stackIn_12_0 = l.field_f;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < l.field_c) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = l.field_c;
          }
          var10 = stackIn_15_0;
          if (l.field_b <= param4 &&
            l.field_f > param4) {
            var11 = l.field_k * var8 + param4;
            var12 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              l.field_i[var11] = 16777215;
              var11 = var11 + 2 * l.field_k;
            }
          }
          if (l.field_d <= param2 &&
            l.field_c > var6) {
            var11Lifetime1 = var7 + l.field_k * param2;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              l.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (l.field_b <= var5_int &&
            var5_int < l.field_f) {
            var11Lifetime2 = var5_int + (var8 + (-param4 + var5_int & 1)) * l.field_k;
            var12Lifetime2 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              l.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + l.field_k * 2;
            }
          }
          if (param2 >= l.field_d) {
            if (var6 >= l.field_c) {
              return;
            }
            var11Lifetime3 = (1 & -param2 + var6) + (var6 * l.field_k + var7);
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              l.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5), "ed.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = "Email: ";
        field_c = "Quit to website";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
