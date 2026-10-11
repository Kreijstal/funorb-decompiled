/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int[][] field_p;
    static String field_f;
    fc field_i;
    static ja[] field_h;
    int field_r;
    private int[][] field_a;
    int field_c;
    static String field_e;
    boolean[][] field_k;
    private int field_o;
    private qk[] field_q;
    private int[][] field_l;
    static int field_n;
    static cj field_m;
    static String field_d;
    private int field_b;
    static int field_j;
    static String field_g;

    private final qk[] a(boolean param0, qk param1, qk[] param2) {
        int var5 = 0;
        qk[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        qk[] var7 = null;
        qk[] stackIn_3_0 = null;
        qk[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0) {
            stackIn_3_0 = (qk[]) null;
            return stackIn_3_0;
          }
          var7 = new qk[param2.length + 1];
          var4 = var7;
          for (var5 = 0; var5 < param2.length; var5++) {
            var7[var5] = param2[var5];
          }
          var4[param2.length] = param1;
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("fh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var4 = param2 / 24;
        var5 = param1 / 24;
        var6 = -2 / ((-9 - param0) / 59);
        var7 = 4;
        if (!this.a(var4, (byte) 16, var5)) {
          return false;
        }
        var8 = param2 % 24;
        var9 = param1 % 24;
        if (var4 != 0) {
          stackIn_6_0 = this.a(var4 - 1, (byte) 125, var5) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var10 = stackIn_6_0;
        if (this.field_i.field_d - 1 == var4) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = this.a(var4 + 1, (byte) 1, var5) ? 1 : 0;
        }
        var11 = stackIn_9_0;
        if (var5 != this.field_i.field_e - 1) {
          stackIn_12_0 = this.a(var4, (byte) 119, 1 + var5) ? 1 : 0;
        } else {
          stackIn_12_0 = 0;
        }
        var12 = stackIn_12_0;
        if (var11 != 0) {
          stackIn_16_0 = var11;
          if (var9 >= var7 &&
            !this.a(1 + var4, (byte) 126, 1 + var5)) {
            stackIn_18_1 = 0;
          } else {
            stackIn_18_1 = 1;
          }
          var11 = stackIn_16_0 & stackIn_18_1;
        }
        if (var10 != 0) {
          stackIn_23_0 = var10;
          if (var9 >= var7 &&
            !this.a(var4 - 1, (byte) -125, 1 + var5)) {
            stackIn_25_1 = 0;
          } else {
            stackIn_25_1 = 1;
          }
          var10 = stackIn_23_0 & stackIn_25_1;
        }
        if (var10 == 0 &&
          6 > var8) {
          return false;
        }
        if (var11 == 0 &&
          var8 > 8) {
          return false;
        }
        if (var12 == 0 &&
          var9 > var7) {
          return false;
        }
        return true;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        nm var10;
        boolean stackIn_18_0 = false;
        var5 = param0 / 24;
        var6 = param3 / 24;
        if (var5 >= 0 &&
          var6 >= 0 &&
          this.field_i.field_e > var6) {
          if (var5 >= this.field_i.field_d) {
            return false;
          }
          if (!param1) {
            var10 = (nm) null;
            this.a(110, false, (nm) null, -115);
          }
          var7 = param0 % 24;
          var8 = 1;
          if (param2) {
            if (8 < var7) {
              var8 = (byte)(var8 | 4);
            }
            if (16 > var7) {
              var8 = (byte)(var8 | 2);
            }
          }
          var9 = (byte)(this.field_i.field_k[var6][var5] & 7);
          stackIn_18_0 = (var8 == (var8 & var9));
          return stackIn_18_0;
        }
        return false;
    }

    final int a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        float var8;
        int var9;
        int var10;
        int var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.a(param1, true, param5, param0)) {
          return -1;
        }
        var8 = 12.0f;
        var9 = -param3 + param1;
        var10 = -param4 + param0;
        var11 = g.b(var10 * var10 + var9 * var9);
        if (var11 == 0) {
          return 0;
        }
        var12 = var8 / (float)var11;
        var13 = var12 * (float)var9;
        if (param2 != -17201) {
          this.a(54, true, false, 113);
        }
        var14 = (float)var10 * var12;
        var15 = (float)param3;
        var16 = (float)param4;
        var17 = 1;
        var18 = 1;
        var19 = var11;
        while ((float)var19 > var8) {
          var16 = var16 + var14;
          var15 = var15 + var13;
          if (var18 != 0) {
            stackIn_15_0 = (this.a((int)var15, true, param5, (int)var16)) ? 1 : 0;
          } else {
            stackIn_15_0 = 0;
          }
          var18 = stackIn_15_0;
          if (!param6) {
            if (var18 == 0) {
              return -1;
            }
          } else {
            if (var17 != 0) {
              stackIn_22_0 = (this.a((int)var15, true, param5, -48 + (int)var16)) ? 1 : 0;
            } else {
              stackIn_22_0 = 0;
            }
            var17 = stackIn_22_0;
            if (var17 == 0 &&
              var18 == 0) {
              return -1;
            }
          }
          var19 = (int)((float)var19 - var8);
        }
        return var11;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 48) {
          fh.a(true);
        }
        this.field_q = new qk[]{};
        for (var2 = 0; var2 < this.field_i.field_e; var2++) {
          for (var3 = 0; this.field_i.field_d > var3; var3++) {
            if (this.a(var3, (byte) 5, var2) &&
              this.a(1 + var3, (byte) 19, var2)) {
              var4 = this.a(var3, (byte) -30, var2 + 1) ? 1 : 0;
              var5 = this.a(var3 + 1, (byte) 127, var2 + 1) ? 1 : 0;
              var6 = this.a(var3, (byte) 114, var2 - 1) ? 1 : 0;
              var7 = this.a(1 + var3, (byte) 36, -1 + var2) ? 1 : 0;
              if (var4 != 0) {
                if (var5 == 0) {
                  this.field_q = this.a(false, new qk(24 * var3 + 1, var2 * 24 + 12), this.field_q);
                }
                if (var4 == 0 &&
                  var5 != 0) {
                  this.field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), this.field_q);
                }
              } else {
                if (var5 != 0) {
                  this.field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), this.field_q);
                }
              }
              if (var6 != 0 &&
                var7 == 0) {
                this.field_q = this.a(false, new qk(1 + 24 * var3, 24 * (var2 + 1) - 12), this.field_q);
              }
              if (var6 == 0 &&
                var7 != 0) {
                this.field_q = this.a(false, new qk(47 + var3 * 24, (var2 + 1) * 24 - 12), this.field_q);
              }
            }
          }
        }
        this.field_a = new int[this.field_q.length][this.field_q.length];
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_q.length; var2Lifetime1++) {
          var9 = 0;
          var3Lifetime1 = var9;
          while (var9 < this.field_q.length) {
            this.field_a[var2Lifetime1][var9] = this.a(this.field_q[var2Lifetime1], this.field_q[var9], (byte) -71);
            var9++;
          }
        }
    }

    final static void c(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ga var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ra var12 = null;
        ab var13 = null;
        ga var14 = null;
        ra var15 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var14 = s.field_e;
          var2 = var14.g(31365);
          if (param0 != 1) {
            return;
          }
          if (0 == var2) {
            var11 = da.a(8);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((k) ((Object) var5)).g(31365);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((k) ((Object) var5)).i(-1478490344);
            }
            var12 = (ra) (so.field_j.c(param0 ^ 60));
            if (var12 == null) {
              ak.a((byte) -111);
              return;
            }
            var12.field_h = var3;
            var12.field_k = true;
            var12.a(true);
            return;
          }
          if (1 == var2) {
            var13 = (ab) (ig.field_a.c(param0 ^ 73));
            if (var13 == null) {
              ak.a((byte) -117);
              return;
            }
            var13.a(true);
          } else {
            if (var2 != 2) {
              bd.a("A1: " + ci.a(0), (Throwable) null, false);
              ak.a((byte) -118);
            } else {
              var15 = (ra) (so.field_j.c(param0 ^ 76));
              if (var15 == null) {
                ak.a((byte) -128);
                return;
              }
              var15.field_h = da.a(8);
              var15.field_k = true;
              var15.a(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "fh.P(" + param0 + ')');
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = (int)(320.0f * param1.field_d - (float)param1.field_k);
          var4 = (int)(param1.field_d * 240.0f - (float)param1.field_g);
          var5 = 0;
          var7 = 44 / ((param0 - 63) / 34);
          if (var3_int < -24) {
            var5 = -(var3_int / 24);
            var3_int = var3_int % 24;
          }
          var6 = 0;
          if (var4 < -24) {
            var6 = -(var4 / 24);
            var4 = var4 % 24;
          }
          var8 = var5 + 55;
          var9 = 41 + var6;
          var10 = var3_int;
          var11 = var5;
          var12 = 0;
          for (var14 = 0; var14 < 41; var14++) {
            for (var15 = 0; 55 > var15; var15++) {
              this.field_l[var14][var15] = 0;
            }
          }
          var13 = 0;
          this.field_o = var5;
          this.field_b = var6;
          while (var6 < var9) {
            while (var5 < var8) {
              if (var5 < this.field_i.field_d &&
                this.field_i.field_e > var6) {
                var14Lifetime1 = this.a(var5, var6, (byte) 126);
                var15Lifetime1 = (var14Lifetime1 & 127) >> 0;
                if (var15Lifetime1 >= 0 &&
                  rn.field_a.length > var15Lifetime1) {
                  rn.field_a[var15Lifetime1].c(var3_int, var4);
                } else {
                  oo.e(var3_int, var4, 24, 24, 7631988);
                }
                if (qq.field_h) {
                  qp.field_w.c(Integer.toString(this.field_i.field_k[var6][var5]), 12 + var3_int, 12 + var4, 16777215, 1);
                }
                var3_int += 24;
                this.field_l[var13][var12] = var14Lifetime1;
                var12++;
              } else {
                oo.e(var3_int, var4, 24, 24, 1);
                var12++;
                var3_int += 24;
              }
              var5++;
            }
            var13++;
            var4 += 24;
            var3_int = var10;
            var12 = 0;
            var5 = var11;
            var6++;
          }
          if (qq.field_h) {
            var14Lifetime2 = param1.a(bd.field_g, 2);
            var15Lifetime2 = param1.a(true, bo.field_d);
            for (var16 = 0; var16 < this.field_q.length; var16++) {
              var17 = param1.c(this.field_q[var16].field_g, -20126);
              var18 = param1.d(this.field_q[var16].field_h, 119);
              for (var19 = 0; var19 < this.field_q.length; var19++) {
                var20 = param1.c(this.field_q[var19].field_g, -20126);
                var21 = param1.d(this.field_q[var19].field_h, 107);
                if (this.field_a[var16][var19] > 0) {
                  oo.g(var17, var18, var20, var21, 65280, 48);
                }
              }
              if (-1 != this.a(var15Lifetime2, 113, var14Lifetime2, this.field_q[var16].field_h, this.field_q[var16].field_g)) {
                var19Lifetime1 = param1.c(var14Lifetime2, -20126);
                var20Lifetime1 = param1.d(var15Lifetime2, 122);
                oo.g(var17, var18, var19Lifetime1, var20Lifetime1, 16711680);
              }
            }
            var23 = 0;
            var16Lifetime1 = var23;
            while (var23 < this.field_q.length) {
              var17Lifetime1 = 320 + this.field_q[var23].field_g - param1.field_k;
              var18Lifetime1 = -param1.field_g + (this.field_q[var23].field_h + 240);
              oo.d(var17Lifetime1, var18Lifetime1, 2, 16711680, 256);
              qp.field_w.b(Integer.toString(var23), var17Lifetime1, var18Lifetime1, 16777215, 0, 64);
              var23++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("fh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    private final int a(qk param0, qk param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -71) {
            stackIn_4_0 = this.a(param0.field_h, -47, param0.field_g, param1.field_h, param1.field_g);
            return stackIn_4_0;
          }
          stackIn_2_0 = 94;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fh.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        boolean discarded$0 = false;
        this.field_r = 24 * this.field_i.field_d;
        if (!param0) {
          discarded$0 = this.a(-29, (byte) -50, -96);
        }
        this.field_c = this.field_i.field_e * 24;
    }

    final int a(int param0, int param1, byte param2) {
        if (param0 < 0) {
          return 0;
        }
        if (param1 < 0) {
          return 0;
        }
        if (param1 >= this.field_i.field_e) {
          return 0;
        }
        if (this.field_i.field_d <= param0) {
          return 0;
        }
        int var4 = 26 / ((param2 + 45) / 48);
        return this.field_i.field_f[param1][param0];
    }

    fh(fc param0) {
        int[][] var8 = null;
        int[][] var7 = null;
        int[][] var6 = null;
        int var3 = 0;
        int var4 = 0;
        this.field_l = new int[41][55];
        try {
          this.field_i = param0;
          this.a(48);
          this.b(true);
          var8 = this.field_i.field_k;
          var7 = var8;
          var6 = var7;
          int[][] var2 = var6;
          this.field_p = new int[var8.length][var8[0].length];
          for (var3 = 0; var8.length > var3; var3++) {
            for (var4 = 0; var4 < var8[0].length; var4++) {
              this.field_p[var3][var4] = tq.b(1, var8[var3][var4]) == 0 ? 33554432 : 0;
            }
          }
          this.field_k = new boolean[this.field_i.field_e][this.field_i.field_d];
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final th b(int param0, int param1, int param2, int param3, int param4) {
        int var17 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_30_2 = 0;
        int var6;
        int var7;
        qk var8;
        qk var9;
        th var10;
        int var11;
        int[] var12;
        int[] var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        nm var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int var6Lifetime1;
        int var7Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = param3 / 24;
        var7 = param1 / 24;
        if (!this.a(var6, (byte) 118, var7)) {
          if (!this.a(var6, (byte) -25, var7 - 1)) {
            if (!this.a(var6, (byte) 32, 1 + var7)) {
              if (this.a(var6, (byte) 125, var7 + 2)) {
                param1 += 48;
              } else {
                if (this.a(var6 + 1, (byte) 21, var7)) {
                  param3 += 24;
                } else {
                  if (this.a(var6 - 1, (byte) 116, var7)) {
                    param3 -= 24;
                  }
                }
              }
            } else {
              param1 += 24;
            }
          } else {
            param1 -= 24;
          }
        }
        var7Lifetime1 = param1 / 24;
        var6Lifetime1 = param3 / 24;
        if (!this.a(var6Lifetime1, (byte) 22, var7Lifetime1)) {
          return null;
        }
        if (!this.a(param3, true, true, param1)) {
          if (!this.a(var6Lifetime1 - 1, (byte) 122, var7Lifetime1)) {
            param3 = 24 + 24 * var6Lifetime1 - 1;
          } else {
            if (!this.a(1 + var6Lifetime1, (byte) 119, var7Lifetime1)) {
              param3 = 24 * var6Lifetime1;
            }
          }
        }
        var8 = new qk(param0, param2);
        if (param4 != 8760) {
          var20 = (nm) null;
          this.a(-105, true, (nm) null, 61);
        }
        var9 = new qk(param3, param1);
        var10 = new th();
        var10.a(var9, false);
        var11 = this.a(var9, var8, (byte) -71);
        if (var11 >= 0) {
          return var10;
        }
        var23 = new int[this.field_q.length];
        var21 = var23;
        var12 = var21;
        var24 = new int[this.field_q.length];
        var22 = var24;
        var13 = var22;
        for (var14 = 0; var23.length > var14; var14++) {
          var15 = this.a(var8, this.field_q[var14], (byte) -71);
          var23[var14] = var15;
          stackIn_29_0 = var13;
          stackIn_29_1 = var14;
          if (var15 >= 0) {
            stackIn_30_2 = -1;
          } else {
            stackIn_30_2 = -2;
          }
          stackIn_29_0[stackIn_29_1] = stackIn_30_2;
        }
        var14Lifetime1 = 1;
        while (var14Lifetime1 != 0) {
          var14Lifetime1 = 0;
          for (var15Lifetime1 = 0; var23.length > var15Lifetime1; var15Lifetime1++) {
            if (var23[var15Lifetime1] >= 0) {
              for (var16 = 0; var23.length > var16; var16++) {
                if (-1 != this.field_a[var15Lifetime1][var16] && (-1 == var23[var16] ||
                  var23[var15Lifetime1] + this.field_a[var15Lifetime1][var16] < var23[var16])) {
                  var24 = var22;
                  var14Lifetime1 = 1;
                  var12[var16] = this.field_a[var15Lifetime1][var16] + var23[var15Lifetime1];
                  var24[var16] = var15Lifetime1;
                }
              }
            }
          }
        }
        var15Lifetime2 = -1;
        var16Lifetime1 = -1;
        for (var17 = 0; var23.length > var17; var17++) {
          var18 = this.a(var9, this.field_q[var17], (byte) -71);
          if (var18 >= 0 &&
            var23[var17] != -1 && (var16Lifetime1 == -1 ||
            var16Lifetime1 > var18 + var23[var17])) {
            var15Lifetime2 = var17;
            var16Lifetime1 = var23[var17] + var18;
          }
        }
        if (-1 == var16Lifetime1) {
          return null;
        }
        while (var15Lifetime2 != -1) {
          if (var15Lifetime2 == var24[var15Lifetime2]) {
            return null;
          }
          var10.a(-25612, this.field_q[var15Lifetime2].a(30544));
          var15Lifetime2 = var24[var15Lifetime2];
        }
        return var10;
    }

    final static void b(int param0) {
        ee.field_b = false;
        if (null != mj.field_Ib) {
          mj.field_Ib.c((byte) 123);
        }
        if (0 != va.field_a) {
          pf.a(89);
        }
        ti.field_Y = 0;
        if (param0 != 31706) {
          fh.b(-67);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param0 < 0) {
          return false;
        }
        if (0 > param2) {
          return false;
        }
        if (!(param2 < this.field_i.field_e)) {
          return false;
        }
        int var4 = -18 / ((74 - param1) / 37);
        if (!(param0 < this.field_i.field_d)) {
          return false;
        }
        return 0 != (1 & this.field_i.field_k[param2][param0]) ? true : false;
    }

    final int[][] d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 21) {
          this.field_o = -62;
        }
        int[][] var6 = new int[this.field_i.field_e][this.field_i.field_d];
        int[][] var2 = var6;
        for (var3 = 0; var3 < this.field_i.field_e; var3++) {
          for (var4 = 0; var4 < this.field_i.field_d; var4++) {
            var6[var3][var4] = !this.a(var4, (byte) -71, var3) ? -1 : 0;
          }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 85 % ((33 - param1) / 62);
        return this.a(param0, param2, -17201, param4, param3, true, false);
    }

    final void a(int param0, boolean param1, nm param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ja var15 = null;
        ja var16 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = (int)((float)(-param2.field_k) + 320.0f * param2.field_d);
          if (var5_int < -24) {
            var5_int = var5_int % 24;
          }
          var6 = (int)((float)(-param2.field_g) + param2.field_d * 240.0f);
          if (var6 < -24) {
            var6 = var6 % 24;
          }
          var7 = var5_int;
          for (var8 = 0; var8 < 41; var8++) {
            for (var9 = 0; var9 < 55; var9++) {
              boolean decompiledFrameRemainder0 = true;
              if ((var9 + this.field_o) < this.field_k[0].length &&
                this.field_k.length > var8 + this.field_b) {
                var10 = this.field_l[var8][var9];
                if (param0 != 1) {
                  if (param0 == 2) {
                    if (this.field_k[var8 + this.field_b][this.field_o + var9]) {
                      var5_int += 24;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var11 = -1 + ((var10 & 33488896) >> 16);
                      if (var11 >= 0 &&
                        var11 < od.field_Ab.length) {
                        var16 = od.field_Ab[var11];
                        if ((268435456 & var10) > 0) {
                          var16.b(var5_int, var6);
                        } else {
                          if ((var10 & 134217728) > 0) {
                            var16.a(var5_int, var6);
                          } else {
                            var16.g(var5_int, var6);
                          }
                        }
                      }
                    }
                  } else {
                    if (param0 == 3) {
                      if ((-2147483648 & var10) != 0) {
                        if (param1) {
                          if ((67108864 & var10) == 0) {
                            oo.f(var5_int, var6, 24, 24, 16711935, 128);
                          } else {
                            oo.f(var5_int, var6, 24, 24, 65280, 128);
                          }
                        } else {
                          if ((var10 & 67108864) != 0) {
                            var11 = -1;
                            var12 = 511 & var10 >> 7;
                            var13 = var10 >> 16 & 511;
                            if (var13 >= 9 &&
                              var13 <= 32) {
                              var11 = -9 + var13;
                            }
                            if (var12 >= 9 &&
                              var12 <= 32) {
                              var11 = var12 - 9;
                            }
                            if (var13 == 29) {
                              var11 = 9;
                            }
                            if (0 <= var11 &&
                              var11 < ne.field_Ab.length) {
                              ne.field_Ab[var11].c(var5_int, var6, 128);
                            } else {
                              oo.f(var5_int, var6, 24, 24, 0, 128);
                              ne.field_Ab[21].c(var5_int, var6 + 24, 128);
                            }
                          } else {
                            oo.f(var5_int, var6, 24, 24, 0, 128);
                          }
                        }
                      }
                      if (wh.field_c) {
                        oo.a(var5_int, var6, 25, 25, 7864183);
                      }
                    }
                  }
                } else {
                  if (this.field_k[var8 + this.field_b][var9 + this.field_o]) {
                    var5_int += 24;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var11 = ((var10 & 65408) >> 7) - 1;
                    if (var11 >= 0 &&
                      var11 < od.field_Ab.length) {
                      if (param1) {
                        oo.e(var5_int, var6, 24, 24, 16711935);
                      }
                      var15 = od.field_Ab[var11];
                      var16 = var15;
                      var16 = var15;
                      if (!this.field_k[var8 + this.field_b][this.field_o + var9]) {
                        if (0 < (1073741824 & var10) &&
                          0 < (536870912 & var10)) {
                          var15.d(var5_int, var6);
                        } else {
                          if (0 >= (var10 & 1073741824)) {
                            if ((var10 & 536870912) > 0) {
                              var15.a(var5_int, var6);
                            } else {
                              var15.g(var5_int, var6);
                            }
                          } else {
                            var15.b(var5_int, var6);
                          }
                        }
                      } else {
                        var15.c(var5_int, var6, 128);
                      }
                      if (po.field_p &&
                        (var10 & 33554432) != 0) {
                        oo.f(var5_int, var6, 24, 24, 8425216, 96);
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var5_int += 24;
                }
              }
            }
            var5_int = var7;
            var6 += 24;
          }
          if (param3 != -1) {
            this.a(-106, false, true, 19);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_83_0 = var5;
          stackIn_83_1 = new StringBuilder().append("fh.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_m = null;
        if (!param0) {
          field_n = -16;
        }
    }

    static {
        field_f = "<%0> has left the lobby.";
        field_j = 0;
        field_e = "Use this on a zombie or area to disrupt an ongoing effect. Thwart your enemies' evil plans!";
        field_g = "";
        field_d = "<%0>/<%1>";
    }
}
