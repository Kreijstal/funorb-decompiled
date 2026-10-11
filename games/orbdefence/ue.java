/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends s {
    private int field_K;
    int field_L;
    static ba field_G;
    int field_I;
    private tj field_N;
    static int[] field_H;
    static String field_J;

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        pj var15 = null;
        var14 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 >= -115) {
            var15 = (pj) null;
            this.a((byte) -22, (pj) null, -98, 37, 41, 57, 122);
          }
          if (!super.a((byte) -125, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_I - param3 + param5;
          var9 = -(2 * this.field_I) + this.field_m;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_K * var8_int / var9;
          if (1 != param2) {
            if (2 != param2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_N.b(1); var12++) {
              var13 = this.field_N.a(true, var12) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_N.a(var11, -3344);
            }
          } else {
            this.field_N.b(1, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("ue.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_J = null;
        if (param0 != -13) {
          return;
        }
        field_G = null;
        field_H = null;
    }

    final int j(int param0) {
        if (param0 != 1) {
          return 9;
        }
        return this.field_K;
    }

    final static int b(byte param0) {
        if (param0 < 104) {
          field_G = (ba) null;
          return 1;
        }
        return 1;
    }

    final static int a(int param0, CharSequence param1, byte param2, int param3, byte[] param4, int param5) {
        int var7 = 0;
        int stackIn_3_0 = 0;
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
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          var6_int = -param3 + param0;
          if (param2 != -86) {
            stackIn_3_0 = 75;
            return stackIn_3_0;
          }
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param1.charAt(var7 + param3);
              if ((0 >= var8 ||
                128 <= var8) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param5 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[param5 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param4[var7 + param5] = (byte)-124;
                    break;
                  case 8230:
                    param4[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[var7 + param5] = (byte)-122;
                    break;
                  case 8225:
                    param4[param5 + var7] = (byte)-121;
                    break;
                  case 710:
                    param4[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param4[param5 + var7] = (byte)-119;
                    break;
                  case 352:
                    param4[var7 + param5] = (byte)-118;
                    break;
                  case 8249:
                    param4[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param4[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param4[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param4[var7 + param5] = (byte)-111;
                    break;
                  case 8217:
                    param4[param5 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param4[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param4[var7 + param5] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param4[param5 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param5] = (byte)-104;
                    break;
                  case 8482:
                    param4[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param4[param5 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param4[var7 + param5] = (byte)-101;
                    break;
                  case 339:
                    param4[var7 + param5] = (byte)-100;
                    break;
                  case 382:
                    param4[param5 + var7] = (byte)-98;
                    break;
                  case 376:
                    param4[var7 + param5] = (byte)-97;
                    break;
                  default:
                    param4[param5 + var7] = (byte)63;
                    break;
                }
              } else {
                param4[param5 + var7] = (byte)var8;
              }
            }
          }
          stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("ue.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 > -71) {
          this.field_N = (tj) null;
        }
        return this.field_N.b(1);
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 >= ~param1 &&
          this.field_N.b(1) > param1) {
          return this.field_N.a(true, param1);
        }
        return -1;
    }

    static {
        field_G = new ba(13, 0, 1, 0);
        field_H = new int[8192];
        field_J = "You can only place barriers next to a path";
    }
}
