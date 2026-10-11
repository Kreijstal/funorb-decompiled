/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static wb field_a;
    int field_c;
    int field_e;
    int field_j;
    int field_f;
    byte[] field_g;
    byte[] field_h;
    int field_b;
    int field_i;
    int field_d;

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fr var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 8230) {
            var4 = (fr) null;
            mq.a((fr) null, (byte) 109);
          }
          for (var2_int = 0; param1 > var2_int; var2_int++) {
            if (!wm.field_f[var2_int]) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "mq.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 89) {
          field_a = (wb) null;
        }
    }

    final static void a(fr param0, byte param1) {
        int var2_int = 0;
        ip var8 = null;
        qb var10 = null;
        b var12 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = 71 / ((param1 - 40) / 59);
          if (null == ic.field_b) {
            var8 = new ip();
            var20 = var8.a((byte) 10, 128, 128, 16);
            ic.field_b = aj.a((byte) -123, var20, false);
          }
          if (qu.field_j == null) {
            var10 = new qb();
            var21 = var10.a(16, (byte) -8, 128, 128);
            qu.field_j = aj.a((byte) -117, var21, false);
          }
          var12 = param0.field_Sb;
          if (var12.b((byte) -101)) {
            if (null != dj.field_m) {
              return;
            }
            var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
            dj.field_m = aj.a((byte) -126, var22, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mq.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, byte param2, CharSequence param3, int param4, int param5) {
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = -param0 + param4;
          var7 = 0;
          if (param2 >= -106) {
            field_a = (wb) null;
          }
          while (var6_int > var7) {
            {
              var8 = param3.charAt(var7 + param0);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param1[var7 + param5] = (byte)-126;
                    break;
                  case 402:
                    param1[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[param5 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param1[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param5] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param1[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param1[var7 + param5] = (byte)-118;
                    break;
                  case 8249:
                    param1[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param1[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param1[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param1[param5 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param5] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param1[param5 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param5] = (byte)-105;
                    break;
                  case 732:
                    param1[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[param5 + var7] = (byte)-103;
                    break;
                  case 353:
                    param1[param5 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param1[var7 + param5] = (byte)-101;
                    break;
                  case 339:
                    param1[param5 + var7] = (byte)-100;
                    break;
                  case 382:
                    param1[param5 + var7] = (byte)-98;
                    break;
                  default:
                    param1[param5 + var7] = (byte)63;
                    break;
                  case 376:
                    param1[param5 + var7] = (byte)-97;
                    break;
                }
              } else {
                param1[param5 + var7] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_68_0 = var6_int;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("mq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
