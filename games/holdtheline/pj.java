/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rd {
    static int field_m;
    static boolean field_n;
    static int field_o;

    final static boolean b(byte param0) {
        if (param0 <= 78) {
          pj.b((byte) -61);
        }
        return mn.field_a;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int var6Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          if (param2 >= -49) {
            field_n = true;
          }
          var8 = new int[param0.length + param3.length];
          var11 = var8;
          var10 = var11;
          var5 = var10;
          for (var6 = 0; param0.length > var6; var6++) {
            var8[var6] = param0[var6];
          }
          var9 = 0;
          var6Lifetime1 = var9;
          while (param3.length / 2 > var9) {
            var5[param0.length + var9 * 2] = param3[-(2 * var9) + param3.length - 2];
            var5[1 + param0.length + 2 * var9] = param3[-1 + (param3.length - 2 * var9)];
            var9++;
          }
          lj.a(0, 128, 5, var11, (byte) -32, 5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("pj.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        dm.field_a = 0;
        if (param0 > -21) {
          wc[] var2 = (wc[]) null;
          pj.a((wc[]) null, (byte) -53, 0.8636131286621094f, -0.5086926817893982f);
        }
        em.field_l = -1;
        ac.field_e = -1;
        sk.field_h = false;
        n.field_s = null;
    }

    final static int a(CharSequence param0, int param1, int param2, byte[] param3, int param4, byte param5) {
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
        var9 = HoldTheLine.field_D;
        try {
          if (param5 != 29) {
            stackIn_3_0 = 5;
            return stackIn_3_0;
          }
          var6_int = param2 - param4;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param0.charAt(var7 + param4);
              if ((var8 <= 0 ||
                128 <= var8) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param3[var7 + param1] = (byte)-128;
                    break;
                  case 8218:
                    param3[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param3[var7 + param1] = (byte)-125;
                    break;
                  case 8222:
                    param3[param1 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param3[param1 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param3[param1 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param3[param1 + var7] = (byte)-121;
                    break;
                  case 710:
                    param3[var7 + param1] = (byte)-120;
                    break;
                  case 8240:
                    param3[var7 + param1] = (byte)-119;
                    break;
                  case 352:
                    param3[param1 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param3[param1 + var7] = (byte)-117;
                    break;
                  case 338:
                    param3[var7 + param1] = (byte)-116;
                    break;
                  case 381:
                    param3[var7 + param1] = (byte)-114;
                    break;
                  case 8216:
                    param3[param1 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param3[param1 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param3[param1 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param3[var7 + param1] = (byte)-108;
                    break;
                  case 8226:
                    param3[var7 + param1] = (byte)-107;
                    break;
                  case 8211:
                    param3[param1 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param3[param1 + var7] = (byte)-105;
                    break;
                  case 732:
                    param3[var7 + param1] = (byte)-104;
                    break;
                  case 8482:
                    param3[param1 + var7] = (byte)-103;
                    break;
                  case 353:
                    param3[var7 + param1] = (byte)-102;
                    break;
                  case 8250:
                    param3[param1 + var7] = (byte)-101;
                    break;
                  case 339:
                    param3[param1 + var7] = (byte)-100;
                    break;
                  case 382:
                    param3[var7 + param1] = (byte)-98;
                    break;
                  case 376:
                    param3[param1 + var7] = (byte)-97;
                    break;
                  default:
                    param3[param1 + var7] = (byte)63;
                    break;
                }
              } else {
                param3[var7 + param1] = (byte)var8;
              }
            }
          }
          stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("pj.C(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    pj(int param0, float param1) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_c = 0;
        this.field_i = 1;
    }

    final static float a(wc[] param0, byte param1, float param2, float param3) {
        float stackIn_28_0 = 0.0f;
        float stackIn_30_0 = 0.0f;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          var4_float = 0.0f;
          var5 = (int)param2;
          var6 = (int)param3;
          if (param1 != -105) {
            pj.a((byte) -116);
          }
          if (var6 != var5) {
            if (var6 > var5) {
              if (param2 != (float)var5) {
                var4_float = param0[var5].f(param1 + 155) * ((float)(var5 + 1) - param2);
              }
              for (var7 = 1 + var5; var7 < var6; var7++) {
                var4_float = var4_float + param0[var7].f(param1 + 155);
              }
              if (param3 != (float)var6) {
                var4_float = var4_float + (param3 - (float)var6) * param0[var6].f(param1 + 155);
              }
            } else {
              if ((float)var5 != param2) {
                var4_float = param0[var5].f(param1 ^ -91) * ((float)(1 + var5) - param2);
              }
              for (var7 = 1 + var5; var7 < param0.length; var7++) {
                var4_float = var4_float + param0[var7].f(50);
              }
              for (var7 = 0; var7 < var6; var7++) {
                var4_float = var4_float + param0[var7].f(50);
              }
              if ((float)var6 != param3) {
                var4_float = var4_float + ((float)(-var6) + param3) * param0[var6].f(50);
              }
            }
          } else {
            var4_float = -param2 + param3;
            if (!(var4_float < 0.0f)) {
              stackIn_28_0 = var4_float;
            } else {
              stackIn_28_0 = -var4_float;
            }
            var4_float = stackIn_28_0;
          }
          stackIn_30_0 = var4_float;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_33_0 = var4;
          stackIn_33_1 = new StringBuilder().append("pj.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
