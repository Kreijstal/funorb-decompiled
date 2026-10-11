/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    private int[][] field_B;
    private int field_z;
    private int field_g;
    private int[][] field_k;
    private int field_l;
    private int field_c;
    private boolean field_t;
    private int[][] field_D;
    int field_u;
    on field_A;
    private int[][] field_v;
    boolean[][] field_b;
    private int[][] field_E;
    static int field_s;
    private int field_y;
    int field_p;
    private kk[] field_i;
    private kk[] field_C;
    private int[][] field_h;
    private int[][] field_w;
    private int field_j;
    private int field_n;
    private boolean field_q;
    private int[] field_e;
    static int field_d;
    private int field_f;
    static int field_x;
    private int field_r;
    static vn field_a;
    private int[] field_m;
    static vn[] field_o;

    final int[][] a(int param0) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        int[][] var6 = new int[this.field_A.field_r][this.field_A.field_k];
        int[][] var2 = var6;
        int var3 = 0;
        if (param0 != 8728) {
          return (int[][]) null;
        }
        while (this.field_A.field_r > var3) {
          for (var4 = 0; var4 < this.field_A.field_k; var4++) {
            var6[var3][var4] = !this.b(param0 - 8728, var4, var3) ? -1 : 0;
          }
          var3++;
        }
        return var2;
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        boolean stackIn_18_0 = false;
        var5 = param2 / 24;
        var6 = param1 / 24;
        if (var5 >= 0 &&
          var6 >= 0 &&
          this.field_A.field_r > var6 &&
          this.field_A.field_k > var5) {
          var7 = param2 % 24;
          if (param0) {
            this.c(126, 21, -100);
          }
          var8 = 1;
          if (param3) {
            if (var7 > 8) {
              var8 = (byte)(var8 | 4);
            }
            if (var7 < 16) {
              var8 = (byte)(var8 | 2);
            }
          }
          var9 = (byte)(7 & this.field_A.field_p[var6][var5]);
          stackIn_18_0 = ((var8 & var9) == var8);
          return stackIn_18_0;
        }
        return false;
    }

    public static void b(byte param0) {
        if (param0 > -83) {
          ej.a((byte) 29);
        }
        field_o = null;
        field_a = null;
    }

    private final void b(int param0) {
        this.field_u = 24 * this.field_A.field_k;
        if (param0 != -1) {
          wk var3 = (wk) null;
          this.a(49, (wk) null);
        }
        this.field_p = this.field_A.field_r * 24;
    }

    final void a(wk param0, int param1, boolean param2, boolean param3) {
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vn var12_ref_vn = null;
        vn var13 = null;
        int var13_int = 0;
        int var14 = 0;
        var14 = ZombieDawn.field_J;
        try {
          var5_int = bd.field_d - param0.field_u;
          var6 = nh.field_G - param0.field_c;
          if (-24 > var5_int) {
            var5_int = var5_int % 24;
          }
          if (var6 < -24) {
            var6 = var6 % 24;
          }
          if (!(this.field_v.length >= nh.field_I) ||
            !(bd.field_a <= this.field_v[0].length)) {
            this.field_v = new int[nh.field_I][bd.field_a];
          }
          var7 = var5_int;
          if (!param2) {
            return;
          }
          for (var8 = 0; var8 < nh.field_I; var8++) {
            for (var9 = 0; var9 < bd.field_a; var9++) {
              boolean decompiledFrameRemainder0 = true;
              if (this.field_b[0].length > (var9 + this.field_f) &&
                this.field_b.length > var8 + this.field_j) {
                var10 = this.field_v[var8][var9];
                if (param1 == 1) {
                  if (this.field_b[this.field_j + var8][var9 + this.field_f]) {
                    var5_int += 24;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var11 = -1 + (var10 >> 7 & 511);
                    var12 = -2 + tm.field_h.length;
                    if (ng.field_e &&
                      !bo.field_p[86]) {
                      var12 += 3;
                    }
                    if (var11 >= 0 &&
                      var12 > var11) {
                      var13 = tm.field_h[var11];
                      if ((1073741824 & var10) > 0) {
                        var13.c(var5_int, var6);
                      } else {
                        if ((536870912 & var10) <= 0) {
                          var13.b(var5_int, var6);
                        } else {
                          var13.f(var5_int, var6);
                        }
                      }
                    }
                  }
                } else {
                  if (param1 != 2) {
                    if (3 == param1) {
                      if ((-2147483648 & var10) != 0) {
                        if (param3) {
                          if ((var10 & 67108864) != 0) {
                            bi.a(var5_int, var6, 24, 24, 65280, 128);
                          } else {
                            bi.a(var5_int, var6, 24, 24, 16711935, 128);
                          }
                        } else {
                          if ((var10 & 67108864) == 0) {
                            bi.a(var5_int, var6, 24, 24, 0, 128);
                          } else {
                            var11 = -1;
                            var12 = var10 >> 7 & 511;
                            var13_int = (var10 & 33488896) >> 16;
                            if (var13_int >= 9 &&
                              var13_int <= 32) {
                              var11 = -9 + var13_int;
                            }
                            if (var12 >= 9 &&
                              var12 <= 32) {
                              var11 = var12 - 9;
                            }
                            if (var13_int == 29) {
                              var11 = 9;
                            }
                            if (var11 >= 0 &&
                              la.field_c.length > var11) {
                              la.field_c[var11].e(var5_int, var6, 128);
                            } else {
                              bi.a(var5_int, var6, 24, 24, 0, 128);
                              la.field_c[21].e(var5_int, 24 + var6, 128);
                            }
                          }
                        }
                      }
                      if (kc.field_Q) {
                        bi.c(var5_int, var6, 25, 25, 7864183);
                      }
                    }
                  } else {
                    if (this.field_b[this.field_j + var8][var9 + this.field_f]) {
                      var5_int += 24;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var11 = ((var10 & 33488896) >> 16) - 1;
                      if (var11 >= 0 &&
                        var11 < tm.field_h.length) {
                        var12_ref_vn = tm.field_h[var11];
                        var13 = var12_ref_vn;
                        var13 = var12_ref_vn;
                        if ((var10 & 268435456) <= 0) {
                          if ((134217728 & var10) <= 0) {
                            var12_ref_vn.b(var5_int, var6);
                          } else {
                            var12_ref_vn.f(var5_int, var6);
                          }
                        } else {
                          var12_ref_vn.c(var5_int, var6);
                        }
                      }
                      if (dg.field_a) {
                        if (0 != (33554432 & var10)) {
                          bi.a(var5_int, var6, 24, 24, 16744448, 128);
                        }
                        if (var11 >= 0 &&
                          var11 < tm.field_h.length) {
                          var12 = this.field_f + var9;
                          var13_int = var8 + this.field_j;
                          if (this.b(0, var12, 1 + var13_int) ||
                            this.b(0, var12, var13_int + 2)) {
                            bi.c(var5_int, var6, 24, 24, 16711808);
                          }
                        }
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
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_92_0 = var5;
          stackIn_92_1 = new StringBuilder().append("ej.Q(");
          if (param0 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        rc var6_ref_rc = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        am var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = ZombieDawn.field_J;
        try {
          var27 = fj.field_g;
          if (param0 >= -71) {
            return;
          }
          var2 = var27.d((byte) -128);
          if (var2 == 0) {
            var3 = var27.f(2);
            var4 = (jc) (on.field_g.b((byte) 26));
            while (var4 != null) {
              if (var4.field_s != var3) {
                var4 = (jc) (on.field_g.a(false));
                continue;
              }
              break;
            }
            if (var4 == null) {
              p.a(1);
              return;
            }
            var5 = var27.d((byte) -122);
            if (var5 != 0) {
              var6 = var4.field_u;
              cm.field_b[0].field_d = null;
              cm.field_b[0].field_a = false;
              cm.field_b[0].field_c = ce.field_r;
              var7 = var4.field_o;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                cm.field_b[var8_int].field_c = var27.a(true);
                cm.field_b[var8_int].field_a = false;
                if (1 != var27.d((byte) -128)) {
                  cm.field_b[var8_int].field_d = null;
                } else {
                  cm.field_b[var8_int].field_d = var27.a(true);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_i = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6];
              var4.field_k = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.d((byte) -120);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.d((byte) -127);
                  var21 = cm.field_b[var20].field_c;
                  var22 = var27.c(true);
                  var24 = var27.field_j;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = cm.field_b[var20].field_d;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.c(126);
                    }
                  }
                  if (var21 != null &&
                    l.a(89, var21)) {
                    var8[1][var13] = ce.field_r;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_j = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.c(-43);
                    }
                  }
                  if (var6 > var14 &&
                    !cm.field_b[var20].field_a) {
                    cm.field_b[var20].field_a = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = cm.field_b[var20].field_d;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_j = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.c(-89);
                    }
                  }
                }
              }
            }
            var4.field_j = true;
            var4.b(-27598);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var27.f(2);
            var4_long = var27.c(true);
            var6_ref_rc = (rc) (hk.field_F.b((byte) 26));
            while (var6_ref_rc != null) {
              if (var3Lifetime1 != var6_ref_rc.field_i) {
                var6_ref_rc = (rc) (hk.field_F.a(false));
                continue;
              }
              break;
            }
            if (var6_ref_rc == null) {
              p.a(1);
              return;
            }
            var6_ref_rc.field_s = var4_long;
            var6_ref_rc.b(-27598);
            return;
          }
          ae.a((Throwable) null, 10331, "HS1: " + cb.f(3));
          p.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ej.B(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        int[] dupTemp$0 = null;
        int dupTemp$1 = 0;
        int[] arrayValue$2 = null;
        int[] dupTemp$3 = null;
        int dupTemp$4 = 0;
        int[] arrayValue$5 = null;
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        var9 = ZombieDawn.field_J;
        this.field_l = this.field_l + 1;
        if (this.field_l == -4) {
          this.field_C = new kk[]{};
          for (var2 = 0; var2 < this.field_A.field_r; var2++) {
            for (var3 = 0; var3 < this.field_A.field_k; var3++) {
              if (this.b(0, var3, var2) &&
                this.b(0, 1 + var3, var2) &&
                this.b(0, var3, 1 + var2) &&
                !this.b(0, 1 + var3, 1 + var2)) {
                this.field_C = this.a(this.field_C, (byte) -97, new kk(24 * var3 + 1, 12 + var2 * 24));
              }
              if (this.b(param0 + 88, var3, var2) &&
                this.b(0, var3 + 1, var2) &&
                !this.b(0, var3, 1 + var2) &&
                this.b(param0 ^ -88, 1 + var3, 1 + var2)) {
                this.field_C = this.a(this.field_C, (byte) -87, new kk((var3 + 2) * 24 - 1, 12 + 24 * var2));
              }
              if (this.b(param0 ^ -88, var3, var2) &&
                this.b(param0 ^ -88, 1 + var3, var2) &&
                this.b(0, var3, var2 - 1) &&
                !this.b(0, var3 + 1, -1 + var2)) {
                this.field_C = this.a(this.field_C, (byte) -111, new kk(var3 * 24 + 1, (var2 + 1) * 24 - 12));
              }
              if (this.b(0, var3, var2) &&
                this.b(0, 1 + var3, var2) &&
                !this.b(0, var3, var2 - 1) &&
                this.b(0, 1 + var3, var2 - 1)) {
                this.field_C = this.a(this.field_C, (byte) -105, new kk(24 * var3 + 48 - 1, 12 + 24 * var2));
              }
            }
          }
        } else {
          if (this.field_l == -3) {
            this.field_E = new int[this.field_C.length][this.field_C.length];
            for (var2 = 1; this.field_C.length / 2 > var2; var2++) {
              for (var3 = 0; var2 > var3; var3++) {
                dupTemp$0 = this.field_E[var2];
                dupTemp$1 = this.a((byte) -128, this.field_C[var2], this.field_C[var3]);
                arrayValue$2 = this.field_E[var3];
                dupTemp$0[var3] = dupTemp$1;
                arrayValue$2[var2] = dupTemp$1;
              }
            }
          } else {
            if (this.field_l == -2) {
              for (var2 = this.field_C.length / 2; this.field_C.length > var2; var2++) {
                for (var3 = 0; var2 > var3; var3++) {
                  dupTemp$3 = this.field_E[var2];
                  dupTemp$4 = this.a((byte) -128, this.field_C[var2], this.field_C[var3]);
                  arrayValue$5 = this.field_E[var3];
                  dupTemp$3[var3] = dupTemp$4;
                  arrayValue$5[var2] = dupTemp$4;
                }
              }
            } else {
              if (this.field_l == -1) {
                var2 = this.field_C.length;
                this.field_B = new int[var2][var2];
                this.field_D = new int[var2][var2];
                for (var3 = 0; var2 > var3; var3++) {
                  for (var4 = 0; this.field_C.length > var4; var4++) {
                    var5 = this.field_E[var3][var4];
                    this.field_D[var3][var4] = var5;
                    this.field_B[var3][var4] = var4;
                  }
                }
              } else {
                var2 = this.field_C.length;
                var3 = this.field_l * 3;
                var4 = var3;
                while (var4 < var3 + 3) {
                  if (var2 <= var4) {
                    this.field_t = false;
                    this.field_h = this.field_D;
                    this.field_i = this.field_C;
                    this.field_w = this.field_E;
                    this.field_k = this.field_B;
                    this.field_e = new int[this.field_C.length];
                    this.field_m = new int[this.field_C.length];
                    return;
                  }
                  for (var5 = 0; var5 < var2; var5++) {
                    for (var6 = 0; var2 > var6; var6++) {
                      var7 = this.field_D[var5][var6];
                      var8 = this.field_D[var5][var4] + this.field_D[var4][var6];
                      if ((var7 == -1 ||
                        var7 > var8) && (0 <= this.field_D[var5][var4] &&
                        this.field_D[var4][var6] >= 0)) {
                        this.field_D[var5][var6] = var8;
                        this.field_B[var5][var6] = this.field_B[var5][var4];
                      }
                    }
                  }
                  var4++;
                }
              }
            }
          }
        }
        if (param0 != -88) {
          ej.a((byte) -52);
        }
    }

    final int a(int param0, int param1, int param2, byte param3, boolean param4, int param5) {
        int var17 = ZombieDawn.field_J;
        if (!this.a(false, param0, param5, param4)) {
          return -1;
        }
        float var7 = 12.0f;
        int var8 = -param1 + param5;
        int var9 = param0 - param2;
        int var10 = so.b(var9 * var9 + var8 * var8);
        if (var10 == 0) {
          return 0;
        }
        float var11 = var7 / (float)var10;
        float var12 = var11 * (float)var8;
        float var13 = var11 * (float)var9;
        if (param3 > -90) {
          this.a(80, -57, 113, (byte) -23, true, 59);
        }
        float var14 = (float)param1;
        float var15 = (float)param2;
        int var16 = var10;
        while (var7 < (float)var16) {
          var15 = var15 + var13;
          var14 = var14 + var12;
          if (!this.a(false, (int)var15, (int)var14, param4)) {
            return -1;
          }
          var16 = (int)((float)var16 - var7);
        }
        return var10;
    }

    final int c(int param0, int param1, int param2) {
        if (0 > param2) {
          return 0;
        }
        int var4 = -61 % ((param1 - 23) / 44);
        if (0 > param0) {
          return 0;
        }
        if (param0 >= this.field_A.field_r) {
          return 0;
        }
        if (param2 >= this.field_A.field_k) {
          return 0;
        }
        return this.field_A.field_h[param0][param2];
    }

    final void a(boolean param0, int param1) {
        int var4 = ZombieDawn.field_J;
        int var3 = 46 % ((param1 + 45) / 52);
        if (this.field_t) {
          this.field_q = true;
        } else {
          this.field_t = true;
          this.field_l = -5;
        }
        if (!param0) {
          while (this.field_t) {
            this.c((byte) -88);
          }
        }
    }

    private final kk[] a(kk[] param0, byte param1, kk param2) {
        int var5 = 0;
        kk[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        kk[] var7 = null;
        kk[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var7 = new kk[1 + param0.length];
          var4 = var7;
          if (param1 > -86) {
            this.field_m = (int[]) null;
          }
          for (var5 = 0; param0.length > var5; var5++) {
            var7[var5] = param0[var5];
          }
          var4[param0.length] = param2;
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ej.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (this.field_t) {
          this.c((byte) -88);
          if (!this.field_t) {
            dj.field_e.a(true);
            if (this.field_q) {
              this.field_q = false;
              this.a(true, 108);
            }
          }
        }
        if (param0) {
          this.a(true, -110, 79, -29, -111);
        }
    }

    private final void a(int param0, wk param1) {
        int discarded$0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
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
        le var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        kk var18 = null;
        Object var19 = null;
        oo var20 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        var19 = null;
        var17 = ZombieDawn.field_J;
        try {
          this.field_r = 1;
          this.field_n = 1;
          this.field_g = 0;
          this.field_z = 0;
          var3_int = bd.field_d - param1.field_u;
          var4 = -param1.field_c + nh.field_G;
          var5 = 0;
          var6 = 0;
          if (var4 < -24) {
            var6 = -(var4 / 24);
            var4 = var4 % 24;
          }
          if (var3_int < -24) {
            var5 = -(var3_int / 24);
            var3_int = var3_int % 24;
          }
          var7 = 0;
          if (!(this.field_v.length >= nh.field_I) ||
            !(bd.field_a <= this.field_v[0].length)) {
            this.field_v = new int[nh.field_I][bd.field_a];
          }
          var8 = var5 + bd.field_a;
          if (this.field_A.field_k < var8) {
            var8 = this.field_A.field_k;
          }
          var9 = nh.field_I + var6;
          if (this.field_A.field_r < var9) {
            var9 = this.field_A.field_r;
          }
          var10 = var5;
          if (param0 != -19795) {
            var18 = (kk) null;
            discarded$0 = this.a((byte) 93, (kk) null, (kk) null);
          }
          var11 = 0;
          this.field_f = var5;
          var12 = 0;
          this.field_j = var6;
          if (24 + bd.field_e == m.field_A.field_r &&
            m.field_A.field_q == nh.field_P + 24) {
            if (0 > this.field_y) {
              gp.a(m.field_A.field_z, 0, m.field_A.field_z.length, 0);
            }
          } else {
            m.field_A = null;
            m.field_A = new vn(24 + bd.field_e, nh.field_P + 24);
            this.field_y = -1;
          }
          if (this.field_y >= 0) {
            var13 = var5 - this.field_y;
            var14 = var6 - this.field_c;
            if (var13 != 0 ||
              var14 != 0) {
              this.field_r = var5;
              this.field_n = var6;
              var7 = 1;
              this.field_g = var6 + m.field_A.field_t / 24;
              this.field_z = var5 + m.field_A.field_w / 24;
            }
          } else {
            var7 = 1;
            this.field_n = var6;
            this.field_z = m.field_A.field_w / 24 + var5;
            this.field_r = var5;
            this.field_g = m.field_A.field_t / 24 + var6;
          }
          this.field_y = var5;
          this.field_c = var6;
          if (var7 != 0) {
            ki.a((byte) -121, m.field_A);
            var13Lifetime1 = 0;
            var14Lifetime1 = 0;
            while (var9 > var6) {
              while (var5 < var8) {
                var15_int = this.c(var6, -39, var5);
                if (ub.a(127, this.field_A.field_f[var6][var5]) != null ||
                  this.field_r <= var5 &&
                  this.field_z >= var5 ||
                  this.field_n <= var6 &&
                  this.field_g >= var6) {
                  var16 = (127 & var15_int) >> 0;
                  if (var16 >= 0 &&
                    var16 < field_o.length) {
                    field_o[var16].e(var13Lifetime1, var14Lifetime1);
                  } else {
                    bi.b(var13Lifetime1, var14Lifetime1, 24, 24, 7631988);
                  }
                }
                this.field_v[var12][var11] = var15_int;
                var13Lifetime1 += 24;
                var11++;
                var5++;
              }
              var13Lifetime1 = 0;
              var11 = 0;
              var14Lifetime1 += 24;
              var12++;
              var5 = var10;
              var6++;
            }
            param1.field_u = param1.field_u + var3_int;
            param1.field_c = param1.field_c + var4;
            if (6 == this.field_A.field_a && (this.field_n <= this.field_g ||
              this.field_z >= this.field_r)) {
              var15 = dj.field_e.field_R.b((byte) 26);
              while (var15 != null) {
                if (var15 instanceof oo) {
                  var20 = (oo) (var15);
                  var20.a(param1, (byte) 65);
                }
                var15 = dj.field_e.field_R.a(false);
              }
            }
            param1.field_c = param1.field_c - var4;
            param1.field_u = param1.field_u - var3_int;
            pa.a(-21189);
            m.field_A.e(var3_int, var4);
            return;
          }
          m.field_A.e(var3_int, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_58_0 = var3;
          stackIn_58_1 = new StringBuilder().append("ej.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    final qh a(boolean param0, int param1, int param2, int param3, int param4) {
        int var14 = 0;
        boolean stackIn_17_1 = false;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_31_2 = 0;
        int var6;
        int var7;
        kk var8;
        kk var9;
        qh var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var6Lifetime1;
        int var7Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        var16 = ZombieDawn.field_J;
        var6 = param3 / 24;
        var7 = param2 / 24;
        if (!this.b(0, var6, var7)) {
          if (this.b(0, var6, -1 + var7)) {
            param2 -= 24;
          } else {
            if (!this.b(0, var6, 1 + var7)) {
              if (!this.b(0, var6, 2 + var7)) {
                if (this.b(0, 1 + var6, var7)) {
                  param3 += 24;
                } else {
                  if (this.b(0, -1 + var6, var7)) {
                    param3 -= 24;
                  }
                }
              } else {
                param2 += 48;
              }
            } else {
              param2 += 24;
            }
          }
        }
        var6Lifetime1 = param3 / 24;
        var7Lifetime1 = param2 / 24;
        if (!this.b(0, var6Lifetime1, var7Lifetime1)) {
          return null;
        }
        stackIn_17_1 = !(param0);
        if (!this.a(stackIn_17_1, param2, param3, param0)) {
          if (this.b(0, var6Lifetime1 - 1, var7Lifetime1)) {
            if (!this.b(0, 1 + var6Lifetime1, var7Lifetime1)) {
              param3 = var6Lifetime1 * 24;
            }
          } else {
            param3 = var6Lifetime1 * 24 + 24 - 1;
          }
        }
        var8 = new kk(param1, param4);
        var9 = new kk(param3, param2);
        var10 = new qh();
        var10.a(0, var9);
        var11 = this.a((byte) -128, var9, var8);
        var10.field_g = var11;
        if (0 <= var11) {
          return var10;
        }
        for (var12 = 0; this.field_e.length > var12; var12++) {
          var13 = this.a((byte) -128, var8, this.field_i[var12]);
          this.field_e[var12] = var13;
          stackIn_30_0 = this.field_m;
          stackIn_30_1 = var12;
          if (var13 < 0) {
            stackIn_31_2 = -2;
          } else {
            stackIn_31_2 = -1;
          }
          stackIn_30_0[stackIn_30_1] = stackIn_31_2;
        }
        for (var12Lifetime1 = 0; this.field_e.length > var12Lifetime1; var12Lifetime1++) {
          if (this.field_e[var12Lifetime1] >= 0) {
            for (var13Lifetime1 = 0; var13Lifetime1 < this.field_e.length; var13Lifetime1++) {
              if (var13Lifetime1 != var12Lifetime1 &&
                -1 != this.field_h[var12Lifetime1][var13Lifetime1] && (this.field_e[var13Lifetime1] == -1 ||
                this.field_e[var13Lifetime1] > this.field_h[var12Lifetime1][var13Lifetime1] + this.field_e[var12Lifetime1])) {
                this.field_e[var13Lifetime1] = this.field_e[var12Lifetime1] + this.field_h[var12Lifetime1][var13Lifetime1];
                this.field_m[var13Lifetime1] = this.field_k[var13Lifetime1][var12Lifetime1];
              }
            }
          }
        }
        var12Lifetime2 = -1;
        var13Lifetime2 = -1;
        for (var14 = 0; var14 < this.field_e.length; var14++) {
          var15 = this.a((byte) -128, var9, this.field_i[var14]);
          if (var15 >= 0 &&
            this.field_e[var14] != -1 && (var13Lifetime2 == -1 ||
            var13Lifetime2 > var15 + this.field_e[var14])) {
            var13Lifetime2 = var15 + this.field_e[var14];
            var12Lifetime2 = var14;
          }
        }
        if (var13Lifetime2 == -1) {
          return null;
        }
        var10.field_g = var13Lifetime2;
        while (var12Lifetime2 != -1) {
          if (this.field_m[var12Lifetime2] == var12Lifetime2) {
            return null;
          }
          var10.a(this.field_i[var12Lifetime2].c(49), -112);
          var12Lifetime2 = this.field_m[var12Lifetime2];
        }
        return var10;
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 <= 0) {
          return false;
        }
        if (param2 <= param0) {
          return false;
        }
        if (param2 >= this.field_A.field_r - 1) {
          return false;
        }
        if (param1 >= this.field_A.field_k - 1) {
          return false;
        }
        return (1 & this.field_A.field_p[param2][param1]) != 0 ? true : false;
    }

    private final int a(byte param0, kk param1, kk param2) {
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
          if (param0 == -128) {
            stackIn_4_0 = this.a(param1.field_h, param2.field_h, param1.field_l, param2.field_l, 117);
            return stackIn_4_0;
          }
          stackIn_2_0 = -108;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ej.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var4 = param0 / 24;
        var5 = param1 / 24;
        var6 = 4;
        if (!this.b(0, var4, var5)) {
          return false;
        }
        var7 = param0 % 24;
        var8 = param1 % 24;
        if (var4 != 0) {
          stackIn_5_0 = this.b(0, -1 + var4, var5) ? 1 : 0;
        } else {
          stackIn_5_0 = 0;
        }
        var9 = stackIn_5_0;
        if (this.field_A.field_k - 1 == var4) {
          stackIn_8_0 = 0;
        } else {
          stackIn_8_0 = this.b(0, var4 + 1, var5) ? 1 : 0;
        }
        var10 = stackIn_8_0;
        if (param2 <= 8) {
          this.a(-111, -117, 12, 52, 71);
        }
        if (var5 != -1 + this.field_A.field_r) {
          stackIn_13_0 = this.b(0, var4, 1 + var5) ? 1 : 0;
        } else {
          stackIn_13_0 = 0;
        }
        var11 = stackIn_13_0;
        if (var10 != 0) {
          stackIn_17_0 = var10;
          if (var6 <= var8 &&
            !this.b(0, 1 + var4, var5 + 1)) {
            stackIn_19_1 = 0;
          } else {
            stackIn_19_1 = 1;
          }
          var10 = stackIn_17_0 & stackIn_19_1;
        }
        if (var9 != 0) {
          stackIn_24_0 = var9;
          if (var6 <= var8 &&
            !this.b(0, -1 + var4, var5 + 1)) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          var9 = stackIn_24_0 & stackIn_26_1;
        }
        if (var9 == 0 &&
          var7 < 6) {
          return false;
        }
        if (var10 == 0 &&
          var7 > 8) {
          return false;
        }
        if (var11 != 0) {
          return true;
        }
        if (var6 < var8) {
          return false;
        }
        return true;
    }

    final void a(wk param0, boolean param1) {
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
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
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var5Lifetime1Lifetime3;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        var15 = ZombieDawn.field_J;
        try {
          if (!ng.field_e &&
            !this.field_A.field_e) {
            this.a(-19795, param0);
          } else {
            var3_int = -param0.field_u + bd.field_d;
            var4 = -param0.field_c + nh.field_G;
            var5 = 0;
            var6 = 0;
            if (var3_int < -24) {
              var5 = -(var3_int / 24);
              var3_int = var3_int % 24;
            }
            if (var4 < -24) {
              var6 = -(var4 / 24);
              var4 = var4 % 24;
            }
            var7 = var5 + bd.field_a;
            var8 = var6 + nh.field_I;
            var9 = var3_int;
            var10 = var5;
            var11 = 0;
            var12 = 0;
            for (var13 = 0; var13 < nh.field_I; var13++) {
              for (var14 = 0; var14 < bd.field_a; var14++) {
                this.field_v[var13][var14] = 0;
              }
            }
            this.field_j = var6;
            this.field_f = var5;
            while (var8 > var6) {
              if (var6 >= this.field_A.field_r) {
                break;
              }
              while (var7 > var5) {
                if (this.field_A.field_k > var5) {
                  var13Lifetime1 = this.c(var6, 123, var5);
                  var14Lifetime1 = var13Lifetime1 >> 0 & 127;
                  if (var14Lifetime1 >= 0 &&
                    var14Lifetime1 < field_o.length) {
                    field_o[var14Lifetime1].e(var3_int, var4);
                  } else {
                    bi.b(var3_int, var4, 24, 24, 7631988);
                  }
                  this.field_v[var12][var11] = var13Lifetime1;
                  var3_int += 24;
                  var11++;
                  var5++;
                  continue;
                }
                break;
              }
              var11 = 0;
              var3_int = var9;
              var5 = var10;
              var12++;
              var4 += 24;
              var6++;
            }
          }
          if (param1) {
            return;
          }
          if (ga.field_w) {
            var3_intLifetime1 = param0.a(ha.field_b, false);
            var4Lifetime1 = param0.b(ei.field_K, true);
            for (var5Lifetime1 = 0; this.field_i.length > var5Lifetime1; var5Lifetime1++) {
              var6Lifetime1 = param0.a(this.field_i[var5Lifetime1].field_l, (byte) -104);
              var7Lifetime1 = param0.a(this.field_i[var5Lifetime1].field_h, 0);
              for (var8Lifetime1 = 0; this.field_i.length > var8Lifetime1; var8Lifetime1++) {
                var9Lifetime1 = param0.a(this.field_i[var8Lifetime1].field_l, (byte) -82);
                var10Lifetime1 = param0.a(this.field_i[var8Lifetime1].field_h, 0);
                if (this.field_w[var5Lifetime1][var8Lifetime1] > 0) {
                  bi.d(var6Lifetime1, var7Lifetime1, var9Lifetime1, var10Lifetime1, 65280, 48);
                }
              }
              if (this.a(var4Lifetime1, this.field_i[var5Lifetime1].field_h, var3_intLifetime1, this.field_i[var5Lifetime1].field_l, 112) != -1) {
                var8Lifetime1 = param0.a(var3_intLifetime1, (byte) -64);
                var9Lifetime1 = param0.a(var4Lifetime1, 0);
                bi.e(var6Lifetime1, var7Lifetime1, var8Lifetime1, var9Lifetime1, 16711680);
              }
            }
            for (var5Lifetime1Lifetime1 = 0; var5Lifetime1Lifetime1 < this.field_i.length; var5Lifetime1Lifetime1++) {
              var6Lifetime1Lifetime1 = bd.field_d - param0.field_u + this.field_i[var5Lifetime1Lifetime1].field_l;
              var7Lifetime1Lifetime1 = -param0.field_c + this.field_i[var5Lifetime1Lifetime1].field_h + nh.field_G;
              bi.d(var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, 2, 16711680, 256);
              pc.field_k.a(Integer.toString(var5Lifetime1Lifetime1), var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, 16777215, 0, 64);
            }
            if (!this.field_t) {
              return;
            }
            if (this.field_l <= 0) {
              return;
            }
            for (var5Lifetime1Lifetime2 = 0; var5Lifetime1Lifetime2 < this.field_C.length; var5Lifetime1Lifetime2++) {
              var6Lifetime1Lifetime2 = param0.a(this.field_C[var5Lifetime1Lifetime2].field_l, (byte) -99);
              var7Lifetime1Lifetime2 = param0.a(this.field_C[var5Lifetime1Lifetime2].field_h, 0);
              for (var8Lifetime1Lifetime1 = 0; var8Lifetime1Lifetime1 < this.field_C.length; var8Lifetime1Lifetime1++) {
                var9Lifetime1Lifetime1 = param0.a(this.field_C[var8Lifetime1Lifetime1].field_l, (byte) -75);
                var10Lifetime1Lifetime1 = param0.a(this.field_C[var8Lifetime1Lifetime1].field_h, 0);
                if (this.field_E[var5Lifetime1Lifetime2][var8Lifetime1Lifetime1] > 0) {
                  bi.d(var6Lifetime1Lifetime2, var7Lifetime1Lifetime2, var9Lifetime1Lifetime1, var10Lifetime1Lifetime1, 16711680, 48);
                }
              }
            }
            for (var5Lifetime1Lifetime3 = 0; var5Lifetime1Lifetime3 < this.field_C.length; var5Lifetime1Lifetime3++) {
              var6Lifetime1Lifetime3 = bd.field_d + (-param0.field_u + this.field_C[var5Lifetime1Lifetime3].field_l);
              var7Lifetime1Lifetime3 = this.field_C[var5Lifetime1Lifetime3].field_h + (-param0.field_c + nh.field_G);
              bi.d(var6Lifetime1Lifetime3, var7Lifetime1Lifetime3, 2, 34952, 256);
              pc.field_k.a(Integer.toString(var5Lifetime1Lifetime3), var6Lifetime1Lifetime3, var7Lifetime1Lifetime3, 2285021, 0, 64);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_64_0 = var3;
          stackIn_64_1 = new StringBuilder().append("ej.M(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 <= 102) {
          field_d = -128;
        }
        return this.a(param0, param3, param1, (byte) -126, true, param2);
    }

    ej(on param0) {
        this.field_v = new int[nh.field_I][bd.field_a];
        this.field_c = -1;
        this.field_y = -1;
        try {
          this.field_A = param0;
          this.a(false, 11);
          this.b(-1);
          this.field_c = -1;
          this.field_b = new boolean[this.field_A.field_r][this.field_A.field_k];
          this.field_y = -1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
