/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static int field_a;
    static int field_b;

    final static int a(byte[] param0, int param1, int param2, int param3, CharSequence param4, int param5) {
        int var7 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        try {
          var6_int = param5 - param3;
          var8 = 0 % ((71 - param1) / 48);
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var9 = param4.charAt(var7 + param3);
              if ((var9 <= 0 ||
                var9 >= 128) && (var9 < 160 ||
                var9 > 255)) {
                switch (var9) {
                  case 8364:
                    param0[var7 + param2] = (byte)-128;
                    break;
                  case 8218:
                    param0[var7 + param2] = (byte)-126;
                    break;
                  case 402:
                    param0[param2 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param0[param2 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param0[param2 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param0[param2 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param0[param2 + var7] = (byte)-121;
                    break;
                  case 710:
                    param0[var7 + param2] = (byte)-120;
                    break;
                  case 8240:
                    param0[var7 + param2] = (byte)-119;
                    break;
                  case 352:
                    param0[param2 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param0[param2 + var7] = (byte)-117;
                    break;
                  case 338:
                    param0[var7 + param2] = (byte)-116;
                    break;
                  case 381:
                    param0[var7 + param2] = (byte)-114;
                    break;
                  case 8216:
                    param0[var7 + param2] = (byte)-111;
                    break;
                  case 8217:
                    param0[var7 + param2] = (byte)-110;
                    break;
                  case 8220:
                    param0[var7 + param2] = (byte)-109;
                    break;
                  case 8221:
                    param0[var7 + param2] = (byte)-108;
                    break;
                  case 8226:
                    param0[var7 + param2] = (byte)-107;
                    break;
                  case 8211:
                    param0[param2 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param0[param2 + var7] = (byte)-105;
                    break;
                  case 732:
                    param0[var7 + param2] = (byte)-104;
                    break;
                  case 8482:
                    param0[param2 + var7] = (byte)-103;
                    break;
                  case 353:
                    param0[var7 + param2] = (byte)-102;
                    break;
                  case 8250:
                    param0[var7 + param2] = (byte)-101;
                    break;
                  case 339:
                    param0[param2 + var7] = (byte)-100;
                    break;
                  case 382:
                    param0[var7 + param2] = (byte)-98;
                    break;
                  case 376:
                    param0[param2 + var7] = (byte)-97;
                    break;
                  default:
                    param0[var7 + param2] = (byte)63;
                    break;
                }
              } else {
                param0[param2 + var7] = (byte)var9;
              }
            }
          }
          stackIn_67_0 = var6_int;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("qi.A(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
