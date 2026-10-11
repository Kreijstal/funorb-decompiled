/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static nb field_a;
    static kc field_b;
    private int[][] field_d;
    static String field_c;
    static String field_e;

    wj(int[] param0) {
        int[] array$0 = null;
        int dupTemp$1 = 0;
        int[] arrayValue$2 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_d = new int[512][];
          var2 = new int[512];
          var3_int = 1;
          do {
            if (var3_int >= param0.length) {
              var3_int = 1;
              break;
            }
            var4 = param0[var3_int];
            var5 = ((14680064 & var4) >> 15) + ((var4 >> 5 & 7) + ((var4 & 57344) >> 10));
            var2[var5] = var2[var5] + 1;
            var3_int++;
          } while (var8 == 0);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param0.length <= var3_int))) {
            var4 = param0[var3_int];
            stackIn_16_0 = ((14680064 & var4) >> 15) + (56 & var4 >> 10) + (7 & var4 >> 5);
            if (var8 == 0) {
              var5 = stackIn_16_0;
              if (null == this.field_d[var5]) {
                array$0 = new int[var2[var5]];
                this.field_d[var5] = array$0;
              }
              dupTemp$1 = var2[var5] - 1;
              arrayValue$2 = this.field_d[var5];
              var2[var5] = dupTemp$1;
              arrayValue$2[dupTemp$1] = (var3_int << 24) + dg.a(var4, 16777215);
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = 512;
          }
          var3 = new int[stackIn_16_0];
          var4 = 0;
          var5 = 0;
          var6 = var2;
          var7 = 0;
          while (512 > var7) {
            if (var8 != 0) {
              return;
            }
            if (null != this.field_d[var7]) {
              var6[var7] = 0;
              var3[var5++] = var7;
            }
            var7++;
          }
          while (var5 > var4) {
            incrementValue$4 = var4;
            var4++;
            var7Lifetime1 = var3[511 & incrementValue$4];
            if (var8 != 0) {
              return;
            }
            if ((var7Lifetime1 & 511) >= 64 &&
              this.a(var7Lifetime1 + 131008, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$5 = var5;
              var5++;
              var3[dg.a(incrementValue$5, 511)] = var7Lifetime1 + 131008;
            }
            if ((var7Lifetime1 & 511) < 448 &&
              this.a(131136 + var7Lifetime1, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$6 = var5;
              var5++;
              var3[dg.a(511, incrementValue$6)] = var7Lifetime1 + 131136;
            }
            if ((var7Lifetime1 & 63) >= 8 &&
              this.a(262136 + var7Lifetime1, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$7 = var5;
              var5++;
              var3[dg.a(incrementValue$7, 511)] = 262136 + var7Lifetime1;
            }
            if ((63 & var7Lifetime1) < 56 &&
              this.a(var7Lifetime1 + 262152, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$8 = var5;
              var5++;
              var3[dg.a(511, incrementValue$8)] = 262152 + var7Lifetime1;
            }
            if ((var7Lifetime1 & 7) > 0 &&
              this.a(65535 + var7Lifetime1, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$9 = var5;
              var5++;
              var3[dg.a(511, incrementValue$9)] = var7Lifetime1 + 65535;
            }
            if ((var7Lifetime1 & 7) < 7 &&
              this.a(var7Lifetime1 + 65537, var6, var7Lifetime1, (byte) 114)) {
              incrementValue$10 = var5;
              var5++;
              var3[dg.a(511, incrementValue$10)] = var7Lifetime1 + 65537;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_72_0 = var2_ref;
          stackIn_72_1 = new StringBuilder().append("wj.<init>(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static void a(qb[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, qb[] param8, int param9, int param10, int param11, dj param12, dj param13, int param14) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          gh.a(p.field_c, param13, param9, param12, param1, param5, to.field_m, 480, param7, 0, 0, param3, (qb[]) null, param14, param11, (byte) -105, param4, param0, sl.field_T, param8, param10);
          if (param2 < 108) {
            wj.a(-97);
          }
          nb.a(param6, 5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_8_0 = var15;
          stackIn_8_1 = new StringBuilder().append("wj.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param13 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param14).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_e = null;
          field_a = null;
          if (param0 != 0) {
            field_b = (kc) null;
          }
          field_c = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "wj.C(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var3_int = (param0 >> 10 & 56) + ((param0 >> 5 & 7) + (param0 >> 15 & 448));
          var4 = this.field_d[var3_int];
          var5 = var4[0];
          var6 = (param1 & var5 >> 15) + ((var5 >> 6 & 1020) + (255 & var5));
          var7 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 >= var4.length))) {
            var8 = var4[var7];
            var9 = (var8 & 255) - (-(var8 >> 6 & 1020) - (510 & var8 >> 15));
            stackIn_15_0 = ~var6;
            stackIn_15_1 = ~var9;
            if (var10 == 0) {
              if (stackIn_15_0 < stackIn_15_1) {
                var6 = var9;
                var5 = var8;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = var5;
            stackIn_15_1 = 473841784;
          }
          stackIn_16_0 = stackIn_15_0 >>> stackIn_15_1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "wj.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(String param0, int[] param1, int param2, int param3, long param4) {
        RuntimeException var6 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 2) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != param1 && (2 != param2 ||
            kg.a(param4, true, param0))) {
            stackIn_13_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = false;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("wj.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 114) {
            field_c = (String) null;
          }
          if (this.field_d[511 & param0] != null &&
            param1[511 & param0] <= param0) {
            return false;
          }
          this.field_d[dg.a(param0, 511)] = this.field_d[dg.a(511, param2)];
          param1[dg.a(param0, 511)] = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = "Elements Installed";
        field_a = new nb();
    }
}
