/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_h;
    static wo field_g;
    static int[] field_f;
    static int field_j;
    static int[] field_e;
    static int field_a;
    static String field_i;
    static int field_d;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_i = null;
        if (param0 != 938035464) {
          cl.a(107, -93, (byte) 122);
        }
        field_h = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (param0 != 8231) {
          return;
        }
        ln.field_q = false;
        lh.field_g = 0 == vi.field_o.f(255) ? true : false;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
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
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var6_int = param2 - param4;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param4 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[param0 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[var7 + param0] = (byte)-126;
                    break;
                  case 402:
                    param1[param0 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param0] = (byte)-124;
                    break;
                  case 8230:
                    param1[param0 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param0] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param0] = (byte)-121;
                    break;
                  case 710:
                    param1[param0 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[param0 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[var7 + param0] = (byte)-118;
                    break;
                  case 8249:
                    param1[param0 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param1[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param0] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param0] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param0] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param0] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param0] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param0] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param0] = (byte)-105;
                    break;
                  case 732:
                    param1[param0 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[var7 + param0] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param0] = (byte)-102;
                    break;
                  case 8250:
                    param1[param0 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[var7 + param0] = (byte)-100;
                    break;
                  case 382:
                    param1[var7 + param0] = (byte)-98;
                    break;
                  case 376:
                    param1[param0 + var7] = (byte)-97;
                    break;
                  default:
                    param1[param0 + var7] = (byte)63;
                    break;
                }
              } else {
                param1[var7 + param0] = (byte)var8;
              }
            }
          }
          if (param5 != -21809) {
            cl.a(19, 73, (byte) -104);
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("cl.B(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static tf a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param2 >= -40) {
          return (tf) null;
        }
        tf var6 = new tf(param0, param0);
        tf var3 = var6;
        for (var4 = 0; var4 < var3.field_G.length; var4++) {
          var6.field_G[var4] = param1;
        }
        return var3;
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        if (param0 > -97) {
          cl.a((byte) -91, -19);
        }
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param1 & ~var2;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -93 / ((-55 - param0) / 55);
        if (null != up.field_o) {
          dp.a(up.field_o, -2);
        }
        if (null != eg.field_n) {
          eg.field_n.a(param1, (byte) 20);
        }
        de.a((byte) 28, param1);
        if (hc.field_M != null) {
          hc.field_M.a(param1, 0);
        }
        kd.c(param1, -24721);
    }

    static {
        field_f = new int[]{2};
        field_j = 4;
        field_e = new int[]{5, 10, 20};
        field_a = 5;
        field_i = "Show game chat from my friends";
        field_b = "Friends";
        field_c = "Quit";
    }
}
