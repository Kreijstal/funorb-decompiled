/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends bca {
    static boolean field_u;
    static String field_t;
    int field_r;
    static kv field_q;
    int field_s;

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -106, param1);
          if (param0 > -12) {
            java.awt.Component var4 = (java.awt.Component) null;
            lp.a(-82, 11, (java.awt.Component) null, 70);
          }
          param1.d(this.field_r, 0);
          param1.d(this.field_s, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lp.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int[][] e(byte param0) {
        int[][] var5 = new int[17][17];
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        if (param0 != -108) {
          return (int[][]) null;
        }
        var5[5][8] = 1;
        var5[6][7] = 1;
        var5[7][6] = 1;
        var5[6][9] = 1;
        var5[7][7] = 1;
        var5[6][8] = 1;
        var5[7][9] = 1;
        var5[8][5] = 1;
        var5[8][7] = 1;
        var5[8][6] = 1;
        var5[7][8] = 1;
        var5[7][10] = 1;
        var5[8][11] = 1;
        var5[8][8] = 1;
        var5[9][6] = 1;
        var5[9][7] = 1;
        var5[8][9] = 1;
        var5[8][10] = 1;
        var5[9][10] = 1;
        var5[10][7] = 1;
        var5[9][8] = 1;
        var5[9][9] = 1;
        var5[10][9] = 1;
        var5[10][8] = 1;
        var5[11][8] = 1;
        return var2;
    }

    final static qm a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          qm var5 = null;
          uka var5_ref = null;
          java.awt.Component var6 = null;
          qm stackIn_3_0 = null;
          uka stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("tu");
              if (param3 != 29548) {
                var6 = (java.awt.Component) null;
                lp.a(-117, 32, (java.awt.Component) null, -59);
              }
              var5 = (qm) (var4.newInstance());
              var5.a(param1, param2, param0, 256);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new uka();
              ((qm) ((Object) var5_ref)).a(param1, param2, param0, param3 ^ 29292);
              stackIn_5_0 = var5_ref;
              return (qm) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("lp.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 < 15) {
          return;
        }
        field_t = null;
        field_q = null;
    }

    lp(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 92);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_r = param0.b(16711935);
          this.field_s = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        sma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_t = (String) null;
          }
          stackIn_3_0 = new sma(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(op param0, int param1) {
        try {
          this.field_l.a(74, param0);
          param0.a(878, this.field_s, this.field_r, this.e((byte) -108), 30);
          int var3_int = -19 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static kv a(byte param0, kv param1) {
        int var13 = 0;
        int var14 = 0;
        kv stackIn_36_0 = null;
        kv stackIn_44_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var15 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        var15 = BachelorFridge.field_y;
        try {
          var2_int = param1.field_p;
          var3 = param1.field_q;
          var4 = param1.field_v;
          var5 = var2_int - 1;
          L1: while (true) {
            if (var5 >= 0) {
              var6 = var5 * var3;
              for (var7 = 0; var3 > var7; var7++) {
                if ((-16777216 & var4[var7 + var6]) != 0) {
                  break L1;
                }
              }
              var5--;
              continue;
            }
            break;
          }
          var6Lifetime1 = 0;
          L4: while (true) {
            if (var5 > var6Lifetime1) {
              var7Lifetime1 = var3 * var6Lifetime1;
              for (var8 = 0; var8 < var3; var8++) {
                if (0 != (var4[var8 + var7Lifetime1] & -16777216)) {
                  break L4;
                }
              }
              var6Lifetime1++;
              continue;
            }
            break;
          }
          var7Lifetime2 = -1 + var3;
          L7: while (true) {
            if (var7Lifetime2 >= 0) {
              for (var8Lifetime1 = var6Lifetime1; var5 >= var8Lifetime1; var8Lifetime1++) {
                if ((-16777216 & var4[var7Lifetime2 + var3 * var8Lifetime1]) != 0) {
                  break L7;
                }
              }
              var7Lifetime2--;
              continue;
            }
            break;
          }
          var8Lifetime2 = 0;
          L10: while (true) {
            if (var7Lifetime2 > var8Lifetime2) {
              for (var9 = var6Lifetime1; var5 >= var9; var9++) {
                if ((var4[var9 * var3 + var8Lifetime2] & -16777216) != 0) {
                  break L10;
                }
              }
              var8Lifetime2++;
              continue;
            }
            break;
          }
          if (0 == var8Lifetime2 &&
            var3 - 1 == var7Lifetime2 &&
            var6Lifetime1 == 0 &&
            var2_int - 1 == var5) {
            stackIn_36_0 = (kv) (param1);
            return stackIn_36_0;
          }
          var9Lifetime1 = -var8Lifetime2 + (var7Lifetime2 + 1);
          var10 = 1 + (var5 - var6Lifetime1);
          var11 = new int[var10 * var9Lifetime1];
          var12 = 117 % ((param0 + 6) / 50);
          for (var13 = 0; var13 < var10; var13++) {
            for (var14 = 0; var14 < var9Lifetime1; var14++) {
              var11[var14 + var13 * var9Lifetime1] = var4[var14 + (var8Lifetime2 + (var13 + var6Lifetime1) * var3)];
            }
          }
          param1.field_q = var9Lifetime1;
          param1.field_p = var10;
          param1.field_v = var11;
          param1.field_u = param1.field_u + var6Lifetime1;
          param1.field_t = param1.field_t + var8Lifetime2;
          stackIn_44_0 = (kv) (param1);
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_47_0 = var2;
          stackIn_47_1 = new StringBuilder().append("lp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    lp(int param0, nq param1) {
        super(param0, param1);
    }

    static {
        field_u = false;
        field_t = "Fullscreen";
    }
}
