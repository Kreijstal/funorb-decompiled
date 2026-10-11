/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_e;
    static String field_d;
    static int field_a;
    static volatile boolean field_b;
    static int[] field_c;

    final static int a(boolean param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
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
        var9 = ZombieDawn.field_J;
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
                    param2[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param2[param5 + var7] = (byte)-126;
                    break;
                  case 402:
                    param2[var7 + param5] = (byte)-125;
                    break;
                  case 8222:
                    param2[var7 + param5] = (byte)-124;
                    break;
                  case 8230:
                    param2[var7 + param5] = (byte)-123;
                    break;
                  case 8224:
                    param2[param5 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param2[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param2[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param2[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param2[var7 + param5] = (byte)-118;
                    break;
                  case 8249:
                    param2[param5 + var7] = (byte)-117;
                    break;
                  case 338:
                    param2[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param2[param5 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param2[param5 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param2[var7 + param5] = (byte)-110;
                    break;
                  case 8220:
                    param2[param5 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param2[param5 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param2[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param2[param5 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param2[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param2[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[param5 + var7] = (byte)-103;
                    break;
                  case 353:
                    param2[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param2[param5 + var7] = (byte)-101;
                    break;
                  case 339:
                    param2[var7 + param5] = (byte)-100;
                    break;
                  case 382:
                    param2[param5 + var7] = (byte)-98;
                    break;
                  case 376:
                    param2[param5 + var7] = (byte)-97;
                    break;
                  default:
                    param2[param5 + var7] = (byte)63;
                    break;
                }
              } else {
                param2[param5 + var7] = (byte)var8;
              }
            }
          }
          if (!param0) {
            stackIn_70_0 = var6_int;
            return stackIn_70_0;
          }
          stackIn_68_0 = -59;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("nd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 31336) {
          field_c = (int[]) null;
        }
        int var3 = param2 - 1 & param1 >> 31;
        return (param1 + (param1 >>> 31)) % param2 + var3;
    }

    final static rc a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        rc var9 = null;
        RuntimeException var9_ref = null;
        rc stackIn_2_0 = null;
        rc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 1159192543) {
            stackIn_2_0 = (rc) null;
            return stackIn_2_0;
          }
          var9 = new rc(param2, param8, param7, param0, param1, param6, param3);
          hk.field_F.a(0, var9);
          rm.a((byte) -108, param5, var9);
          stackIn_4_0 = var9;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = var9_ref;
          stackIn_7_1 = new StringBuilder().append("nd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(int param0, int param1, wg param2) {
        am var5 = null;
        int var4 = 0;
        try {
          var5 = dp.field_e;
          var5.j(param1 ^ 10, param0);
          var5.field_j = var5.field_j + 1;
          var4 = var5.field_j;
          var5.i(param1, 35);
          var5.i(param2.field_i, -96);
          var5.a(17087, param2.field_r);
          var5.h(param1 ^ -126, param2.field_q);
          var5.h(param1 ^ -110, param2.field_k);
          var5.h(param1 ^ -113, param2.field_m);
          var5.h(param1 ^ 87, param2.field_h);
          var5.e(-126, var4);
          var5.d(75, -var4 + var5.field_j);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 >= -124) {
          nd.a(-84, -33, 91);
        }
        field_d = null;
    }

    static {
        field_e = "Connection lost. <%0>";
        field_d = "Waiting for fonts";
        field_c = new int[128];
        field_b = true;
    }
}
