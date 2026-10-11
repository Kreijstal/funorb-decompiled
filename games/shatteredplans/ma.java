/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends ka {
    static String field_q;
    static String[][] field_s;
    static bi field_r;
    static int field_p;

    final int c(ln param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        ln var6 = null;
        int var7 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -5) {
            field_s = (String[][]) null;
          }
          var4 = param0.field_D;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (this.field_n == var6.field_y) {
              var3_int++;
            }
          }
          stackIn_9_0 = super.c(param0, -5) + var3_int * 4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ma.NA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void j(int param0) {
        if (param0 != 25140) {
          return;
        }
        if (oq.field_j == 84) {
          fl.a(0, "enter");
          return;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 2) {
            stackIn_4_0 = fc.a(10, param0, (byte) -108, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -125;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ma.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            var4 = (ln) null;
            this.a((byte) -71, (ln) null);
          }
          var3_int = this.a(-5, param0) + (param0.field_x >> 1);
          stackIn_5_0 = (var3_int == 0) ? 1 : var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ma.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    ma(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 7);
    }

    public static void i(int param0) {
        field_r = null;
        field_q = null;
        field_s = (String[][]) null;
        if (param0 <= 3) {
          field_r = (bi) null;
        }
    }

    final int a(byte param0, ln param1) {
        int var8 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        ln[] var7 = null;
        ln var9 = null;
        int var10 = 0;
        ln var11 = null;
        ln[] var12 = null;
        ln var13 = null;
        ln var14 = null;
        fs[] var15 = null;
        fs var16 = null;
        int var5Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var12 = param1.field_D;
          var4 = var12;
          for (var5 = 0; var5 < var12.length; var5++) {
            var13 = var12[var5];
            var14 = var13;
            if (null != var14.field_y &&
              var14.field_y != this.field_n &&
              !this.field_n.field_h[var13.field_y.field_x]) {
              var3_int = var3_int + var14.field_x;
            }
          }
          var15 = this.field_g.field_v;
          var5Lifetime1 = 0;
          if (param0 >= -14) {
            var11 = (ln) null;
            this.d((ln) null, 93);
          }
          while (var5Lifetime1 < var15.length) {
            var16 = var15[var5Lifetime1];
            if (this.field_n != var16 &&
              !this.field_n.field_h[var16.field_x]) {
              var7 = param1.field_D;
              for (var8 = 0; var8 < var7.length; var8++) {
                var9 = var7[var8];
                if (var9.field_y == var16) {
                  var3_int = var3_int + var9.field_R.field_r;
                }
              }
            }
            var5Lifetime1++;
          }
          stackIn_28_0 = var3_int;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ma.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int[] b(int param0) {
        int var2 = -23 / ((-48 - param0) / 61);
        return new int[]{17, 15};
    }

    final int a(int param0, byte param1) {
        if (param1 > -25) {
          CharSequence var4 = (CharSequence) null;
          ma.a((CharSequence) null, -24);
        }
        if (param0 < 5) {
          return param0;
        }
        if (param0 < 25) {
          return (param0 + 5) / 2;
        }
        return -10 + param0;
    }

    final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 126 / ((param0 + 44) / 62);
          stackIn_2_0 = this.a((byte) -92, param1) * 3;
          if (param1.field_u) {
            stackIn_3_1 = 2;
          } else {
            stackIn_3_1 = 1;
          }
          stackIn_4_0 = stackIn_2_0 >> stackIn_3_1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ma.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_s = new String[][]{new String[]{"We will not bow before such as you."}, new String[]{"We cannot ally with any who call <%largestplayer> a friend."}, new String[]{"You do not have sufficient might to deserve that honour."}, new String[]{"An alliance with <%you> does not fit into our expansion plans."}, new String[]{"While we could of course defeat you easily, the forces on our borders can be better used elsewhere."}, new String[]{"Agreed. Let <%largestplayer> tremble before our combined might."}, new String[]{"We shall stand together in the battles ahead."}, new String[]{"The forces deployed on our borders could be put to better use. Let us sign a non-agression pact immediately."}, new String[]{"Join with us, and together we can end the tyranny of <%largestplayer>."}, new String[]{"Unite with us; our two nations together as one would be a power unmatched."}, new String[]{"A wise decision. Such profitless conflict serves neither of us."}, new String[]{"Excellent. We will begin mobilizing our forces against <%largestplayer> immediately."}, new String[]{"Excellent. Let us coordinate our battle plans."}, new String[]{"Time has yet to erase the mistakes of <%you>."}, new String[]{"The <%me> claims this portion of the galaxy. Defend yourself."}, new String[]{"The <%me> shall guard its borders carefully."}, new String[]{"We are the <%me>, and we are prepared for combat."}, new String[]{"The <%me> looks forward to an era of enlightened peace and prosperity."}, new String[]{"Do not attempt to interfere with the plans of <%me>."}, new String[]{"These resources will be of use in the struggle ahead.", "The citizens of <%system> are adjusting well to their new leadership."}, new String[]{"The defences at <%system> are strong indeed."}, new String[]{"<%system> will remain mine for all time!"}, new String[]{"Attacking <%system> was a tactical error."}, new String[]{"<%system> would be a prize indeed."}, new String[]{"You have no chance to survive, make your time.", "Your fall is now inevitable.", "Rest assured - your cultural artefacts will be preserved after your civilization collapses."}, new String[]{"No! This will not be tolerated!"}, new String[]{"Cease this useless violence!"}};
    }
}
