/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    final static void a(float[] param0, int param1, int param2, float param3, int param4, int param5, byte param6, float param7, int param8, float[] param9, int param10, int param11) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var12_float = 0.0f;
        RuntimeException var12 = null;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          param5 = param5 - param1;
          param11 = param11 - param8;
          param4 = param4 - param10;
          var12_float = (float)param4 * param0[0] + param0[1] * (float)param5 + param0[2] * (float)param11;
          var13 = (float)param11 * param0[5] + (param0[3] * (float)param4 + (float)param5 * param0[4]);
          var14 = (float)param4 * param0[6] + (float)param5 * param0[7] + (float)param11 * param0[8];
          var15 = 0.5f + (float)Math.atan2((double)var12_float, (double)var14) / 6.2831854820251465f;
          if (param6 != -52) {
            return;
          }
          if (1.0f != param7) {
            var15 = var15 * param7;
          }
          var16 = param3 + (var13 + 0.5f);
          if (param2 == 1) {
            var17 = var15;
            var15 = -var16;
            var16 = var17;
          } else {
            if (param2 != 2) {
              if (param2 != 3) {
                param9[0] = var15;
                param9[1] = var16;
                return;
              }
              var17 = var15;
              var15 = var16;
              var16 = -var17;
            } else {
              var15 = -var15;
              var16 = -var16;
            }
          }
          param9[0] = var15;
          param9[1] = var16;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_17_0 = var12;
          stackIn_17_1 = new StringBuilder().append("ac.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3, byte[] param4, int param5) {
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
        var9 = VoidHunters.field_G;
        try {
          var6_int = -param0 + param2;
          if (!param1) {
            stackIn_3_0 = -10;
            return stackIn_3_0;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param3.charAt(param0 + var7);
              if ((0 >= var8 ||
                128 <= var8) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param5 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[var7 + param5] = (byte)-126;
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
                    param4[var7 + param5] = (byte)-120;
                    break;
                  case 8240:
                    param4[param5 + var7] = (byte)-119;
                    break;
                  case 352:
                    param4[param5 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param4[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param4[var7 + param5] = (byte)-116;
                    break;
                  case 381:
                    param4[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param4[param5 + var7] = (byte)-111;
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
                    param4[param5 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param4[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param4[var7 + param5] = (byte)-105;
                    break;
                  case 732:
                    param4[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param4[param5 + var7] = (byte)-103;
                    break;
                  case 353:
                    param4[var7 + param5] = (byte)-102;
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
                  default:
                    param4[param5 + var7] = (byte)63;
                    break;
                  case 376:
                    param4[var7 + param5] = (byte)-97;
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
          stackIn_73_1 = new StringBuilder().append("ac.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        String stackIn_3_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param0 != 1) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var10 = new StringBuilder();
          for (var5 = param2; var5 < param2 + param1; var5 += 3) {
            var6 = param3[var5] & 255;
            discarded$0 = var10.append(eqb.field_a[var6 >>> 2]);
            if (var5 < param1 - 1) {
              var7 = param3[var5 + 1] & 255;
              discarded$1 = var10.append(eqb.field_a[var7 >>> 4 | 48 & var6 << 4]);
              if (param1 - 2 <= var5) {
                discarded$2 = var10.append(eqb.field_a[60 & var7 << 2]);
              } else {
                var8 = param3[2 + var5] & 255;
                discarded$3 = var10.append(eqb.field_a[var8 >>> 6 | var7 << 2 & 60]).append(eqb.field_a[63 & var8]);
              }
            } else {
              discarded$4 = var10.append(eqb.field_a[(3 & var6) << 4]);
            }
          }
          stackIn_13_0 = var10.toString();
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ac.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
