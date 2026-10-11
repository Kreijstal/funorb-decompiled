/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static aj field_b;
    static String[] field_a;
    static boolean field_c;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nl var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -74) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof nl)) {
              throw new IllegalArgumentException();
            }
            var4 = (nl) (param0);
            stackIn_15_0 = var4.a((byte) -121);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param0);
          if (param2) {
            stackIn_11_0 = ld.a(120, var3);
            return stackIn_11_0;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("nl.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 > -107) {
          field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 <= param1) {
            return;
          }
          if (param3 > -73) {
            field_b = (aj) null;
          }
          if (1 + param1 >= param6) {
            return;
          }
          if (5 + param1 < param6 &&
            param5 != param4) {
            var7_int = (param5 >> 1) + (param4 >> 1) + (1 & (param5 & param4));
            var8 = param1;
            var9 = param4;
            var10 = param5;
            for (var11 = param1; param6 > var11; var11++) {
              var12 = ff.field_a[var11];
              if (param2) {
                stackIn_25_0 = we.field_g[var12];
              } else {
                stackIn_25_0 = oj.field_j[var12];
              }
              var13 = stackIn_25_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                ff.field_a[var11] = ff.field_a[var8];
                incrementValue$0 = var8;
                var8++;
                ff.field_a[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
            }
            nl.a(param0, param1, param2, -86, param4, var9, var8);
            nl.a(param0, var8, param2, -122, var10, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param6 - 1; param1 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param1; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = ff.field_a[var8Lifetime1];
              var10Lifetime1 = ff.field_a[1 + var8Lifetime1];
              if (cb.a((byte) 63, param2, var10Lifetime1, var9Lifetime1)) {
                ff.field_a[var8Lifetime1] = var10Lifetime1;
                ff.field_a[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var7), "nl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          bk.field_c = c.field_o;
          if (param1 != -6258) {
            field_c = true;
          }
          if (param0 == 255) {
            stackIn_11_0 = !(cg.field_l >= 13);
            li.field_T = mc.b(stackIn_11_0, param1 ^ -6168);
          } else {
            if (param0 >= 100 &&
              param0 <= 105) {
              li.field_T = oe.a(124, param3);
              return;
            }
            li.field_T = wi.a(param0, (byte) -65, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nl.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    final static int a(int param0, int param1, byte param2, byte[] param3, CharSequence param4, int param5) {
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
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 >= -79) {
            field_b = (aj) null;
          }
          var6_int = -param1 + param0;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param4.charAt(param1 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param3[param5 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param3[param5 + var7] = (byte)-126;
                    break;
                  case 402:
                    param3[var7 + param5] = (byte)-125;
                    break;
                  case 8222:
                    param3[param5 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param3[var7 + param5] = (byte)-123;
                    break;
                  case 8224:
                    param3[param5 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param3[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param3[var7 + param5] = (byte)-120;
                    break;
                  case 8240:
                    param3[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param3[var7 + param5] = (byte)-118;
                    break;
                  case 8249:
                    param3[param5 + var7] = (byte)-117;
                    break;
                  case 338:
                    param3[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param3[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param3[var7 + param5] = (byte)-111;
                    break;
                  case 8217:
                    param3[var7 + param5] = (byte)-110;
                    break;
                  case 8220:
                    param3[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param3[param5 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param3[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param3[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param3[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param3[var7 + param5] = (byte)-104;
                    break;
                  case 8482:
                    param3[param5 + var7] = (byte)-103;
                    break;
                  case 353:
                    param3[param5 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param3[param5 + var7] = (byte)-101;
                    break;
                  case 339:
                    param3[param5 + var7] = (byte)-100;
                    break;
                  case 382:
                    param3[var7 + param5] = (byte)-98;
                    break;
                  case 376:
                    param3[param5 + var7] = (byte)-97;
                    break;
                  default:
                    param3[param5 + var7] = (byte)63;
                    break;
                }
              } else {
                param3[param5 + var7] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("nl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = new aj(10, 2, 2, 0);
    }
}
