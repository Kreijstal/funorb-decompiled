/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_i;
    static int field_b;
    static String field_f;
    static sl field_g;
    static int[][][] field_e;
    static r field_h;
    static String field_a;
    static int[] field_d;
    static int[][] field_c;

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
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
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param5 <= param3) {
            return;
          }
          if (1 + param3 >= param6) {
            return;
          }
          if (param6 > param3 + 5 &&
            param4 != param2) {
            var7_int = (param2 >> 1) + ((param4 >> 1) + (1 & (param2 & param4)));
            var8 = param3;
            var9 = param2;
            var10 = param4;
            for (var11 = param3; var11 < param6; var11++) {
              var12 = hi.field_G[var11];
              if (param0) {
                stackIn_24_0 = bg.field_Q[var12];
              } else {
                stackIn_24_0 = bj.field_b[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                hi.field_G[var11] = hi.field_G[var8];
                incrementValue$0 = var8;
                var8++;
                hi.field_G[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            wc.a(param0, param1, param2, param3, var9, param5, var8);
            wc.a(param0, param1, var10, var8, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param6 - 1; var7_intLifetime1 > param3; var7_intLifetime1--) {
            for (var8Lifetime1 = param3; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = hi.field_G[var8Lifetime1];
              var10Lifetime1 = hi.field_G[1 + var8Lifetime1];
              if (nh.a(param0, 0, var9Lifetime1, var10Lifetime1)) {
                hi.field_G[var8Lifetime1] = var10Lifetime1;
                hi.field_G[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var7), "wc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = (int[][]) null;
        field_d = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_h = null;
        field_e = (int[][][]) null;
        if (param0 >= -32) {
          return;
        }
        field_f = null;
    }

    final static int a(byte param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
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
        byte[] var10 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var6_int = param4 - param1;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param2.charAt(var7 + param1);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param3[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param3[param5 + var7] = (byte)-126;
                    break;
                  case 402:
                    param3[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param3[param5 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param3[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param3[var7 + param5] = (byte)-122;
                    break;
                  case 8225:
                    param3[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param3[var7 + param5] = (byte)-120;
                    break;
                  case 8240:
                    param3[param5 + var7] = (byte)-119;
                    break;
                  case 352:
                    param3[param5 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param3[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param3[var7 + param5] = (byte)-116;
                    break;
                  case 381:
                    param3[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param3[param5 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param3[param5 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param3[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param3[var7 + param5] = (byte)-108;
                    break;
                  case 8226:
                    param3[param5 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param3[param5 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param3[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param3[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param3[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param3[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param3[param5 + var7] = (byte)-101;
                    break;
                  case 339:
                    param3[param5 + var7] = (byte)-100;
                    break;
                  case 382:
                    param3[param5 + var7] = (byte)-98;
                    break;
                  default:
                    param3[param5 + var7] = (byte)63;
                    break;
                  case 376:
                    param3[var7 + param5] = (byte)-97;
                    break;
                }
              } else {
                param3[var7 + param5] = (byte)var8;
              }
            }
          }
          if (param0 >= -1) {
            var10 = (byte[]) null;
            wc.a((byte) -48, 61, (CharSequence) null, (byte[]) null, -43, 68);
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("wc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_a = "Unpacking music";
        field_i = "Player";
        field_c = new int[][]{new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}};
        field_g = new sl();
    }
}
