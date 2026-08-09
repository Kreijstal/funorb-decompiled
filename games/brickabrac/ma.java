/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends h {
    private String field_M;
    private boolean field_J;
    private dh field_H;
    private int field_L;
    private int field_K;
    static ac field_I;
    static String field_G;
    private int field_N;
    static bi field_O;
    static mf field_P;

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = this.field_o + param1;
        int var6 = param0 + this.field_w;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = this.field_J ? this.field_t - (this.field_N - -(this.field_L * 2)) : 0;
        this.field_H.a(this.field_M, this.field_L + var5 - -var7, this.field_L + var6, this.field_N + -this.field_L, -(2 * this.field_L) + this.field_s, this.field_K, -1, !this.field_J ? 2 : 0, 1, this.field_H.field_F);
    }

    public static void c(boolean param0) {
        field_O = null;
        field_I = null;
        field_G = null;
        field_P = null;
        if (param0) {
            field_O = (bi) null;
        }
    }

    ma(int param0, int param1, int param2, int param3, oc param4, boolean param5, int param6, int param7, dh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ub) null, (uh) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_E = param4;
              this.field_L = param7;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ma) (this)).field_J = stackIn_4_1 != 0;
              this.field_H = param8;
              this.field_K = param9;
              this.field_M = param10;
              this.field_N = param6;
              var12_int = this.field_N + -this.field_L;
              var13 = this.field_H.b(param10, var12_int, this.field_H.field_F) + this.field_L * 2;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, param0, param1, (byte) -119, param2);
                break L2;
              }
            }
            L3: {
              if (this.field_J) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 2 * this.field_L + this.field_N;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_E.a(param3 + -(2 * this.field_L), var14, this.field_L + (var13 - param3 >> -655501471), (byte) -119, -(this.field_L * 3) + param2 + -this.field_N);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ma.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 51 / ((-51 - param0) / 53);
        h.a(13894, param1);
    }

    final String d(int param0) {
        int var2;
        String var3;
        oc stackIn_3_0 = null;
        oc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        if (param0 < 6) {
          return (String) null;
        } else {
          L0: {
            var2 = this.field_E.field_q ? 1 : 0;
            this.field_E.field_q = this.field_q;
            var3 = this.field_E.d(39);
            stackIn_3_0 = this.field_E;

            if (var2 == 0) {
              stackIn_4_0 = (oc) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = (oc) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L0;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          return var3;
        }
    }

    final static void b(byte param0, int param1) {
        pi var2;
        if (param0 > -49) {
          ma.b((byte) -23, -84);
          var2 = k.field_h;
          var2.e(-13413, param1);
          var2.a(27, 1);
          var2.a(127, 2);
          return;
        } else {
          var2 = k.field_h;
          var2.e(-13413, param1);
          var2.a(27, 1);
          var2.a(127, 2);
          return;
        }
    }

    static {
        field_G = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
