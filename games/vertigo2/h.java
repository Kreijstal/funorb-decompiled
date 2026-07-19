/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends ji {
    private int field_C;
    static dm field_D;
    static String field_A;
    private int field_E;
    static int field_y;
    private int field_B;
    private int[] field_z;

    final int[][] b(int param0, int param1) {
        int incrementValue$1 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        var14 = this.field_v.a(param1, -2);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param0 == -3780) {
          L0: {
            if (!this.field_v.field_c) {
              break L0;
            } else {
              L1: {
                stackOut_3_0 = this.field_B;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (aa.field_Vb != this.field_C) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = this.field_C * param1 / aa.field_Vb;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = param1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              var4 = stackIn_6_0 * stackIn_6_1;
              var5 = var14[0];
              var6 = var14[1];
              var7 = var14[2];
              if (this.field_B != we.field_M) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    var9 = var8 * this.field_B / we.field_M;
                    var10 = this.field_z[var9 + var4];
                    var7[var8] = b.a(var10, 255) << 170044612;
                    var6[var8] = b.a(var10, 65280) >> -1349095228;
                    var5[var8] = b.a(4080, var10 >> -1300720084);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    incrementValue$1 = var4;
                    var4++;
                    var9 = this.field_z[incrementValue$1];
                    var7[var8] = b.a(4080, var9 << -581700572);
                    var6[var8] = b.a(var9, 65280) >> 1727446532;
                    var5[var8] = b.a(var9 >> 1670616140, 4080);
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final void f(int param0) {
        super.f(param0 ^ 0);
        if (param0 != 2) {
            return;
        }
        this.field_z = null;
    }

    public h() {
        super(0, false);
        this.field_E = -1;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        super.b(param0, param1, param2);
        if ((this.field_E ^ -1) <= -1) {
            if (!(null == mk.field_P)) {
                var4 = mk.field_P.e(this.field_E, param2 ^ -256).field_c ? 64 : 128;
                this.field_z = mk.field_P.a(param2 + -9973, 1.0f, this.field_E, false, var4, var4);
                this.field_B = var4;
                this.field_C = var4;
            }
        }
    }

    final int e(int param0) {
        if (param0 != 6557) {
            this.field_B = 51;
        }
        return this.field_E;
    }

    public static void g(int param0) {
        field_D = null;
        field_A = null;
        if (param0 != 1) {
            field_A = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              bi.b(param0, param2, 1 + param3, 10000536);
              bi.b(param0, param2 + param4, param3 - -1, 12105912);
              var5_int = param1;
              var6 = param4;
              if (bi.field_f > var5_int + param2) {
                var5_int = -param2 + bi.field_f;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (bi.field_c >= param2 + var6) {
                break L2;
              } else {
                var6 = -param2 + bi.field_c;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = var7 * 48 / param4 + 152;
                var9 = var8 << 1765133840 | var8 << -1079343544 | var8;
                bi.field_l[bi.field_e * (var7 + param2) - -param0] = var9;
                bi.field_l[param3 + (var7 + param2) * bi.field_e - -param0] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "h.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (-1 == (param1 ^ -1)) {
                this.field_E = param2.a((byte) -11);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                field_y = 47;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("h.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_A = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
