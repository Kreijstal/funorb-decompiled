/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int[] field_a;

    public static void a(byte param0) {
        if (param0 != -117) {
          field_a = (int[]) null;
        }
        field_a = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_68_0 = null;
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
        var6 = ZombieDawn.field_J;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
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
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          if (param0 > 51) {
            stackIn_70_0 = var3;
            return stackIn_70_0;
          }
          stackIn_68_0 = (byte[]) null;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_73_0 = var2;
          stackIn_73_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final synchronized static long a(int param0) {
        if (param0 != -22826) {
          return -16L;
        }
        long var1 = System.currentTimeMillis();
        if (!(td.field_e <= var1)) {
          cc.field_a = cc.field_a + (-var1 + td.field_e);
        }
        td.field_e = var1;
        return var1 + cc.field_a;
    }

    static {
        field_a = new int[]{220, 347, 515, -1};
    }
}
