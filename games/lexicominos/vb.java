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
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == -95) {
                break L1;
              } else {
                field_m = (ng) null;
                break L1;
              }
            }
            L2: while (true) {
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
                var15 = (16711422 & var17[var11]) >> 2087352065;
                var10[var11] = vg.a(var13 >> -1801119671, 65280) + vg.a(var12 >> -1304186335, 16711680) + (vg.a(var14, 33440375) >> 422246321) + var15;
                param9 = param9 + param3;
                param4 = param4 + param0;
                param1 = param1 + param7;
                param8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("vb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 < 66) {
            return;
        }
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
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (jd.a((byte) -16, param1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = hb.field_a;
                var2 = var7;
                var3 = 97 % ((28 - param0) / 61);
                var4 = 0;
                L1: while (true) {
                  if (var4 >= var7.length) {
                    var2 = n.field_l;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L2;
                        } else {
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var5 = var7[var4];
                    if ((param1 ^ -1) != (var5 ^ -1)) {
                      var4++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vb.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    vb(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param1;
        this.field_h = param4;
        this.field_n = param0;
        this.field_j = param2;
        this.field_q = param3;
        this.field_o = param5;
    }

    static {
        field_m = new ng();
        field_l = new aj(4, 1, 1, 1);
        field_k = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
