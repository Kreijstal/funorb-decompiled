/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_b;
    static ea[] field_a;
    static int field_c;
    static ki field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        ed.a((String) null, km.field_b, -1);
        if (param0 >= -93) {
          field_c = 16;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 125) {
          r.b((byte) 54);
        }
    }

    final static int a(CharSequence param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
        var9 = MinerDisturbance.field_ab;
        try {
          var6_int = -param3 + param4;
          if (param5 != 8211) {
            field_c = -5;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param0.charAt(param3 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param1[var7 + param2] = (byte)-128;
                    break;
                  case 8218:
                    param1[param2 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[var7 + param2] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param2] = (byte)-124;
                    break;
                  case 8230:
                    param1[var7 + param2] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param2] = (byte)-122;
                    break;
                  case 8225:
                    param1[param2 + var7] = (byte)-121;
                    break;
                  case 710:
                    param1[param2 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[var7 + param2] = (byte)-119;
                    break;
                  case 352:
                    param1[param2 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[param2 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[param2 + var7] = (byte)-116;
                    break;
                  case 381:
                    param1[param2 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param2] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param2] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param2] = (byte)-109;
                    break;
                  case 8221:
                    param1[param2 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param1[param2 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param1[param2 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param2] = (byte)-105;
                    break;
                  case 732:
                    param1[param2 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[param2 + var7] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param2] = (byte)-102;
                    break;
                  case 8250:
                    param1[var7 + param2] = (byte)-101;
                    break;
                  case 339:
                    param1[param2 + var7] = (byte)-100;
                    break;
                  case 382:
                    param1[param2 + var7] = (byte)-98;
                    break;
                  case 376:
                    param1[param2 + var7] = (byte)-97;
                    break;
                  default:
                    param1[var7 + param2] = (byte)63;
                    break;
                }
              } else {
                param1[param2 + var7] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("r.C(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static ea[] a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = -91 / ((param0 + 27) / 36);
        return sc.a(3, param1, 1, param3, param4, 1, (byte) -81, param2, 1);
    }

    final static void a(int param0) {
        if (!qc.field_b) {
          throw new IllegalStateException();
        }
        if (param0 != -14475) {
          return;
        }
        jb.field_q = true;
        ed.a((byte) -101, false);
        fh.field_b = 0;
    }

    static {
        field_b = "Eaten Alive";
    }
}
