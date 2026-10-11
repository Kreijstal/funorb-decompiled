/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int[] field_b;
    static int[] field_d;
    static int field_c;
    static bd field_a;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 0 % ((param0 + 77) / 41);
        field_a = null;
        field_b = null;
    }

    final static boolean a(boolean param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0) {
            field_b = (int[]) null;
          }
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 0) {
            var6 = kh.field_hb;
            var2 = var6;
            for (var3 = 0; var3 < var6.length; var3++) {
              var4 = var6[var3];
              if (param1 == var4) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "j.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, byte[] param4, CharSequence param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = param0 - param2;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param5.charAt(var7 + param2);
              if ((var8 <= 0 ||
                128 <= var8) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param1 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[var7 + param1] = (byte)-125;
                    break;
                  case 8222:
                    param4[param1 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[var7 + param1] = (byte)-123;
                    break;
                  case 8224:
                    param4[param1 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param4[param1 + var7] = (byte)-121;
                    break;
                  case 710:
                    param4[param1 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param4[var7 + param1] = (byte)-119;
                    break;
                  case 352:
                    param4[var7 + param1] = (byte)-118;
                    break;
                  case 8249:
                    param4[param1 + var7] = (byte)-117;
                    break;
                  case 338:
                    param4[var7 + param1] = (byte)-116;
                    break;
                  case 381:
                    param4[param1 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param4[var7 + param1] = (byte)-111;
                    break;
                  case 8217:
                    param4[param1 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param4[var7 + param1] = (byte)-109;
                    break;
                  case 8221:
                    param4[param1 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param1] = (byte)-107;
                    break;
                  case 8211:
                    param4[param1 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[param1 + var7] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param1] = (byte)-104;
                    break;
                  case 8482:
                    param4[var7 + param1] = (byte)-103;
                    break;
                  case 353:
                    param4[param1 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param4[var7 + param1] = (byte)-101;
                    break;
                  case 339:
                    param4[var7 + param1] = (byte)-100;
                    break;
                  case 382:
                    param4[param1 + var7] = (byte)-98;
                    break;
                  default:
                    param4[param1 + var7] = (byte)63;
                    break;
                  case 376:
                    param4[param1 + var7] = (byte)-97;
                    break;
                }
              } else {
                param4[param1 + var7] = (byte)var8;
              }
            }
          }
          if (param3 != -125) {
            var10 = (CharSequence) null;
            j.a(-82, -13, -122, (byte) 122, (byte[]) null, (CharSequence) null);
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    static {
        field_d = new int[]{1, 2, 5, 5, 10, 1, 1, 1, 1, 1, 1, 2, 3, 3, 5, 5, 10, 3, 10, 2, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 3, 1, 1, 2, 2, 2, 3, 3, 5, 10};
        field_b = new int[]{24, 27, 5};
        field_c = 0;
    }
}
