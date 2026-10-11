/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_c;
    static mn field_b;
    static String field_d;
    static String field_e;
    static int field_a;
    static volatile boolean field_f;
    static boolean field_g;
    static int field_h;

    final static int a(byte[] param0, byte param1, CharSequence param2, int param3, int param4, int param5) {
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
        var9 = Confined.field_J ? 1 : 0;
        try {
          var6_int = -param3 + param5;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param2.charAt(param3 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param0[var7 + param4] = (byte)-128;
                    break;
                  case 8218:
                    param0[param4 + var7] = (byte)-126;
                    break;
                  case 402:
                    param0[var7 + param4] = (byte)-125;
                    break;
                  case 8222:
                    param0[param4 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param0[var7 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param0[var7 + param4] = (byte)-122;
                    break;
                  case 8225:
                    param0[var7 + param4] = (byte)-121;
                    break;
                  case 710:
                    param0[param4 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param0[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param0[var7 + param4] = (byte)-118;
                    break;
                  case 8249:
                    param0[var7 + param4] = (byte)-117;
                    break;
                  case 338:
                    param0[param4 + var7] = (byte)-116;
                    break;
                  case 381:
                    param0[param4 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param0[var7 + param4] = (byte)-111;
                    break;
                  case 8217:
                    param0[param4 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param0[param4 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param0[var7 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param0[var7 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param0[var7 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param0[var7 + param4] = (byte)-105;
                    break;
                  case 732:
                    param0[var7 + param4] = (byte)-104;
                    break;
                  case 8482:
                    param0[var7 + param4] = (byte)-103;
                    break;
                  case 353:
                    param0[param4 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param0[var7 + param4] = (byte)-101;
                    break;
                  case 339:
                    param0[param4 + var7] = (byte)-100;
                    break;
                  case 382:
                    param0[param4 + var7] = (byte)-98;
                    break;
                  default:
                    param0[param4 + var7] = (byte)63;
                    break;
                  case 376:
                    param0[var7 + param4] = (byte)-97;
                    break;
                }
              } else {
                param0[param4 + var7] = (byte)var8;
              }
            }
          }
          if (param1 != -116) {
            field_b = (mn) null;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("ve.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -340) {
          field_a = 68;
        }
    }

    static {
        field_c = "Power-ups awarded when your score crosses a threshold";
        field_d = "<%0> metres to Level <%1>";
        field_a = 0;
        field_e = "\"There's light at the end of the tunnel.\" - Ian T";
        field_b = new mn();
        field_f = true;
    }
}
