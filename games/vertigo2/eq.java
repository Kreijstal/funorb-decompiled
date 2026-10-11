/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends ji {
    private int field_y;
    private int field_A;
    static cr field_z;
    static String field_E;
    static fe field_F;
    static String field_B;
    static String field_C;

    public static void g(int param0) {
        field_F = null;
        field_E = null;
        if (param0 != 11902) {
          eq.g(-49);
        }
        field_z = null;
        field_C = null;
        field_B = null;
    }

    public eq() {
        super(1, false);
        this.field_y = 0;
        this.field_A = 4096;
    }

    final int[] c(int param0, int param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          return (int[]) null;
        }
        var3 = this.field_x.a(param0, (byte) 82);
        if (this.field_x.field_i) {
          var4 = this.a(0, -1, param0);
          for (var5 = 0; var5 < we.field_M; var5++) {
            var6 = var4[var5];
            if (this.field_y <= var6) {
              if (this.field_A >= var6) {
                var3[var5] = var6;
              } else {
                var3[var5] = this.field_A;
              }
            } else {
              var3[var5] = this.field_y;
            }
          }
        }
        return var3;
    }

    final static bs a(long param0, byte param1) {
        if (param1 < 80) {
          return (bs) null;
        }
        return (bs) (ck.field_I.a(3661, param0));
    }

    final int[][] b(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        int[] var30;
        int[] var31;
        int[] var32;
        int[][] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        var15 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          this.field_y = 22;
        }
        var26 = this.field_v.a(param1, param0 + 3778);
        var18 = var26;
        var16 = var18;
        var3 = var16;
        if (this.field_v.field_c) {
          var37 = this.c(0, 3, param1);
          var38 = var37[0];
          var39 = var37[1];
          var40 = var37[2];
          var30 = var26[0];
          var22 = var30;
          var8 = var22;
          var31 = var26[1];
          var23 = var31;
          var9 = var23;
          var32 = var26[2];
          var24 = var32;
          var10 = var24;
          for (var11 = 0; we.field_M > var11; var11++) {
            var12 = var38[var11];
            var13 = var39[var11];
            var14 = var40[var11];
            if (this.field_y > var12) {
              var8[var11] = this.field_y;
            } else {
              if (this.field_A >= var12) {
                var30[var11] = var12;
              } else {
                var8[var11] = this.field_A;
              }
            }
            if (this.field_y > var13) {
              var9[var11] = this.field_y;
            } else {
              if (var13 <= this.field_A) {
                var31[var11] = var13;
              } else {
                var9[var11] = this.field_A;
              }
            }
            if (this.field_y <= var14) {
              if (this.field_A < var14) {
                var10[var11] = this.field_A;
              } else {
                var32[var11] = var14;
              }
            } else {
              var10[var11] = this.field_y;
            }
          }
        }
        return var3;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = bd.field_d[(int)(var7 - param1 * 37L)];
          if (95 == var9) {
            var10 = var6.length() - 1;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(param0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int == 0) {
            this.field_y = param2.a((byte) -11);
          } else {
            if (1 != var4_int) {
              if (var4_int == 2) {
                stackIn_11_1 = (1 == param2.h(-11));
                this.field_o = stackIn_11_1;
              }
            } else {
              this.field_A = param2.a((byte) -11);
            }
          }
          if (param0 != 110) {
            this.field_y = -81;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("eq.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        String[] var6 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          um.field_F = oe.field_qb;
          if (param2 != 255) {
            if (100 <= param2 &&
              param2 <= 105) {
              var4 = args;
              vj.a((byte) -76, var4);
              rf.field_p = oq.a(param3 - 11, args);
            } else {
              rf.field_p = fn.a(param2, true, param1);
            }
          } else {
            stackIn_4_0 = -2956;
            stackIn_5_1 = !(ea.field_e >= 13);
            rf.field_p = gi.a(stackIn_4_0, stackIn_5_1);
            var6 = (String[]) null;
            vj.a((byte) -107, (String[]) null);
          }
          if (param3 != 0) {
            field_B = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("eq.E(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_B = "Remove name";
        field_C = "Options";
        field_E = "Waiting for levels";
    }
}
