/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends kd {
    int field_h;
    int field_o;
    int field_q;
    static ja field_r;
    int field_n;
    static ng field_m;
    int field_p;
    static aj field_l;
    int field_j;
    static int field_i;
    static String field_k;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param2--;
              if (0 > param2) {
                break L0;
              } else {
                var17 = param6;
                var10 = var17;
                var11 = param8;
                var12 = param4;
                var13 = param1;
                var14 = param9;
                var15 = (16711422 & var17[var11]) >> 1;
                var10[var11] = vg.a(var13 >> 9, 65280) + vg.a(var12 >> 1, 16711680) + (vg.a(var14, 33440375) >> 17) + var15;
                param9 = param9 + param3;
                param4 = param4 + param0;
                param1 = param1 + param7;
                param8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10_ref;
            stackOut_5_1 = new StringBuilder().append("vb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(-95).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_m = null;
        field_r = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (jd.a((byte) -16, param1)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var7 = hb.field_a;
                var2 = var7;
                var3 = 1;
                var4 = 0;
                L1: while (true) {
                  if (var4 >= var7.length) {
                    var2 = n.field_l;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L2;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                  } else {
                    var5 = var7[var4];
                    if (param1 != var5) {
                      var4++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "vb.C(" + -106 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    vb(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((vb) this).field_p = param1;
        ((vb) this).field_h = param4;
        ((vb) this).field_n = param0;
        ((vb) this).field_j = param2;
        ((vb) this).field_q = param3;
        ((vb) this).field_o = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ng();
        field_l = new aj(4, 1, 1, 1);
        field_k = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
