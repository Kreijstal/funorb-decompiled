/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ac field_e;
    private boolean field_o;
    private boolean[] field_b;
    static String field_f;
    private int field_n;
    private boolean[] field_m;
    private boolean field_a;
    private int field_j;
    private int[] field_i;
    private boolean[] field_g;
    private int[] field_h;
    static int[] field_l;
    private int[] field_p;
    private int field_k;
    private int[] field_c;
    private boolean[] field_d;

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        if (param0 != 7) {
          return;
        }
        int var5 = param3 + this.field_k * param2;
        int var6 = -4 + this.field_k;
        var5 = var5 + var6 * param1;
        for (var7 = 0; 4 > var7; var7++) {
          incrementValue$0 = var5;
          var5++;
          this.field_m[incrementValue$0] = true;
        }
    }

    final void g(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * param2;
        param0 = param0 * 4;
        int var4 = param1 + param0 * this.field_k;
        int var5 = this.field_k - 4;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            this.field_b[var4] = false;
            this.field_g[var4] = false;
            this.field_m[var4] = false;
            this.field_c[var4] = 0;
            var4++;
          }
          var4 = var4 + var5;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 > -56) {
          this.a(75, 49, 83, true);
        }
        int var4 = param2 + param1 * this.field_k;
        return this.field_c[var4];
    }

    final boolean c(int param0, int param1, int param2) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        int var4 = param1 * this.field_k + param2;
        int var5 = -4 + this.field_k;
        int var6 = 0;
        int var7 = -74 / ((param0 - 27) / 51);
        while (var6 < 4) {
          for (var8 = 0; var8 < 4; var8++) {
            incrementValue$0 = var4;
            var4++;
            if (this.field_d[incrementValue$0]) {
              return true;
            }
          }
          var4 = var4 + var5;
          var6++;
        }
        return false;
    }

    final void a(boolean param0, je[][] param1) {
        int var15 = 0;
        int var18 = 0;
        je dupTemp$0 = null;
        je dupTemp$1 = null;
        je dupTemp$2 = null;
        je dupTemp$3 = null;
        int stackIn_7_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        String stackIn_175_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var17Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        int var12Lifetime3;
        var19 = MinerDisturbance.field_ab;
        try {
          if (je.field_H < 2) {
            je.field_H = 2;
          }
          var20 = new int[]{2147483647, 2147483647, 2147483647};
          var21 = var20;
          var3 = var21;
          var23 = new int[var20.length];
          var22 = var23;
          var4 = var22;
          stackIn_7_0 = (je.field_u < je.field_N[cm.field_o]) ? 0 : 1;
          var5 = stackIn_7_0;
          for (var6 = -2 + je.field_t * 4; var6 >= -4 + je.field_H * 4; var6--) {
            var7 = var6 >> 2;
            for (var8 = 3; var8 <= 124; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = var8 + this.field_k * var6;
              if (0 >= this.field_c[var9]) {
                if (var5 != 0 &&
                  4 * hf.field_t + 128 < var6) {
                  this.field_c[var9] = 10;
                  if (32 + je.field_H < je.field_t) {
                    je.field_t = je.field_t - 1;
                  }
                }
              } else {
                var10 = this.field_c[var9];
                if (var10 > 0) {
                  var11 = -(var8 >> 2) + ca.field_k;
                  var12 = -(var6 >> 2) + hf.field_t;
                  var13 = var11 * var11 + var12 * var12;
                  if (sc.field_b &&
                    !ni.a(6, 11764) &&
                    var13 < 40) {
                    ag.a(true, 6, 8 * var6, var8 * 8);
                  }
                  var14 = 0;
                  while (var21.length > var14) {
                    if (var13 == var21[var14]) {
                      var4[var14] = (var8 + var23[var14]) / 2;
                      break;
                    }
                    if (var13 >= var21[var14]) {
                      var14++;
                      continue;
                    }
                    var21[var14] = var13;
                    var23[var14] = var8;
                    break;
                  }
                }
                if (this.field_b[var9]) {
                  this.field_b[var9] = false;
                  var10--;
                  this.field_c[var9] = var10;
                }
                this.field_i[var9] = 8;
                var11Lifetime2 = 1 + this.field_h[var9];
                this.field_h[var9] = var11Lifetime2;
                if (var11Lifetime2 > 15) {
                  this.field_h[var9] = 0;
                  if (var10 > 1 &&
                    !je.i(var8, var6 - 1)) {
                    var12Lifetime2 = this.field_c[var9];
                    if (var12Lifetime2 < 10) {
                      this.field_c[-this.field_k + var9] = 1 + var12Lifetime2;
                      var10--;
                      this.field_c[var9] = var10;
                    }
                  }
                  if (var10 < 10) {
                    var10 += 2;
                    this.field_c[var9] = var10;
                  }
                  if (var10 > 1 &&
                    this.field_c[var9 + this.field_k] <= 0 &&
                    !je.i(var8, 1 + var6)) {
                    this.field_c[var9] = 0;
                    this.field_c[var9 + this.field_k] = var10;
                    var10 = 0;
                  } else {
                    if (var10 > 2) {
                      stackIn_45_0 = (!(0.5 < Math.random())) ? 0 : 1;
                      var12Lifetime2 = stackIn_45_0;
                      if (var12Lifetime2 != 0 &&
                        this.field_c[var9 + 1] < var10 &&
                        !je.i(1 + var8, var6)) {
                        var10--;
                        this.field_c[var9] = var10;
                        this.field_c[1 + var9] = this.field_c[1 + var9] + 1;
                      }
                      if (var10 > this.field_c[-1 + var9] &&
                        !je.i(-1 + var8, var6)) {
                        var10--;
                        this.field_c[var9] = var10;
                        this.field_c[var9 - 1] = this.field_c[var9 - 1] + 1;
                      }
                      if (var12Lifetime2 == 0 &&
                        var10 > this.field_c[var9 + 1] &&
                        !je.i(1 + var8, var6)) {
                        var10--;
                        this.field_c[var9] = var10;
                        this.field_c[var9 + 1] = this.field_c[var9 + 1] + 1;
                      }
                    }
                  }
                }
                var12Lifetime3 = var8 >> 2;
                param1[var12Lifetime3][var7].field_i = 255;
                var13Lifetime1 = 2 + var12Lifetime3 * 4 + (2 + var7 * 4) * this.field_k;
                if (this.field_m[var13Lifetime1]) {
                  for (var14Lifetime1 = var12Lifetime3 * 4 - 8; 4 * (1 + var12Lifetime3) + 8 > var14Lifetime1; var14Lifetime1++) {
                    for (var15 = 4 * var7 - 8; 8 + (4 + 4 * var7) > var15; var15++) {
                      var16 = var15 * this.field_k + var14Lifetime1;
                      if (this.field_m[var16] ||
                        this.field_g[var16]) {
                        if (this.field_g[var16]) {
                          if (this.field_g[var16 - this.field_k]) {
                            this.field_d[var16 - this.field_k] = true;
                          }
                          if (this.field_g[var16 - 1]) {
                            this.field_d[var16 - 1] = true;
                          }
                          if (this.field_g[1 + var16]) {
                            this.field_d[var16 + 1] = true;
                          }
                        }
                        lj.field_r = lj.field_r + 25;
                        if ((var8 & 3) == 1 &&
                          (3 & var6) == 1) {
                          var17 = jf.b((byte) 100);
                          uf.field_p[var17] = new gf(var14Lifetime1 / 4, var15 / 4, 16);
                          uf.field_p[var17].field_g = 0;
                          uf.field_p[var17].field_b = 250;
                        }
                        if (!oe.field_b) {
                          this.field_m[var9] = false;
                        }
                        for (var17Lifetime1 = var14Lifetime1 / 4 - 1; var14Lifetime1 / 4 + 1 >= var17Lifetime1; var17Lifetime1++) {
                          for (var18 = -1 + var15 / 4; var18 <= var15 / 4 + 1; var18++) {
                            if (var18 > 0 &&
                              var17Lifetime1 > 0 &&
                              31 > var17Lifetime1 &&
                              je.field_t - 1 > var18 &&
                              param1[var17Lifetime1][var18].field_a) {
                              param1[var17Lifetime1][var18].field_S = true;
                              param1[var17Lifetime1][var18].field_r = 900;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param1[var12Lifetime3][var7].field_E) {
                  param1[var12Lifetime3][var7].field_E = false;
                  param1[var12Lifetime3][var7].field_a = false;
                  this.h(var12Lifetime3, 4, var7);
                }
                if (param1[var12Lifetime3][var7].field_a) {
                  if (1 >= var10) {
                    if (!(var10 > 0)) {
                      var13Lifetime2 = 4 * var12Lifetime3 + 2 + this.field_k * (2 + 4 * var7);
                      if ((this.field_b[var13Lifetime2])) {
                        param1[var12Lifetime3][var7].field_a = true;
                        param1[var12Lifetime3][var7].field_q = 0;
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    stackIn_114_0 = (!param1[var12Lifetime3][var7].field_b) ? 0 : 1;
                    var14Lifetime2 = stackIn_114_0;
                    if (var10 > 4 &&
                      param1[var12Lifetime3][var7].field_v) {
                      dupTemp$0 = param1[var12Lifetime3][var7];
                      dupTemp$0.field_q = dupTemp$0.field_q + 4;
                      var10 -= 4;
                    }
                    if (var10 > 1 &&
                      var14Lifetime2 == 0) {
                      var10 -= 2;
                      dupTemp$1 = param1[var12Lifetime3][var7];
                      dupTemp$1.field_q = dupTemp$1.field_q + 2;
                    }
                    if (var10 > 4 &&
                      var14Lifetime2 == 0) {
                      var10 -= 2;
                      dupTemp$2 = param1[var12Lifetime3][var7];
                      dupTemp$2.field_q = dupTemp$2.field_q + 2;
                    }
                    if (var10 > 9) {
                      var10 -= 2;
                      dupTemp$3 = param1[var12Lifetime3][var7];
                      dupTemp$3.field_q = dupTemp$3.field_q + 2;
                    }
                    if (var10 <= 0) {
                      var10 = 1;
                    }
                    if (param1[var12Lifetime3][var7].field_q > 768) {
                      if (var14Lifetime2 == 0) {
                        param1[var12Lifetime3][var7].field_q = 0;
                        param1[var12Lifetime3][var7].field_a = false;
                        param1[var12Lifetime3][var7].field_v = false;
                        param1[var12Lifetime3][var7].field_E = false;
                        param1[var12Lifetime3][var7].field_U = -1;
                        param1[var12Lifetime3][var7].field_b = false;
                        this.a(false, var12Lifetime3, 9, var7);
                        lj.field_r = lj.field_r + 25;
                      } else {
                        param1[var12Lifetime3][var7].field_q = 768;
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var10 <= 0)) {
                  var13Lifetime3 = 4 * var12Lifetime3 + 2 + this.field_k * (2 + 4 * var7);
                  if (this.field_b[var13Lifetime3]) {
                    param1[var12Lifetime3][var7].field_a = true;
                    param1[var12Lifetime3][var7].field_q = 0;
                  }
                }
              }
            }
          }
          var6Lifetime1 = 0;
          var7Lifetime1 = 0;
          var8Lifetime1 = 0;
          if (!param0) {
            field_l = (int[]) null;
          }
          for (var9Lifetime1 = 0; var9Lifetime1 < var21.length; var9Lifetime1++) {
            if (var21[var9Lifetime1] != 2147483647) {
              var6Lifetime1++;
              var8Lifetime1 = var8Lifetime1 + var23[var9Lifetime1];
              var7Lifetime1 = var7Lifetime1 + var21[var9Lifetime1];
            }
          }
          if (var6Lifetime1 > 0 &&
            0 == (this.field_n & 15)) {
            var7Lifetime1 = var7Lifetime1 / var6Lifetime1;
            var8Lifetime1 = var8Lifetime1 / var6Lifetime1;
            if (var7Lifetime1 < 1) {
              var7Lifetime1 = 1;
            }
            var9Lifetime2 = 80 * oc.field_f / (int)Math.sqrt((double)var7Lifetime1);
            if (oc.field_f < var9Lifetime2) {
              var9Lifetime2 = oc.field_f;
            }
            var10Lifetime1 = 10;
            var11Lifetime1 = (var8Lifetime1 >> 2) - ca.field_k;
            if (-var10Lifetime1 > var11Lifetime1) {
              var11Lifetime1 = -var10Lifetime1;
            }
            if (var11Lifetime1 > var10Lifetime1) {
              var11Lifetime1 = var10Lifetime1;
            }
            var12Lifetime1 = 128 + var11Lifetime1 * 128 / var10Lifetime1;
            if (var12Lifetime1 < 0) {
              var12Lifetime1 = 0;
            } else {
              if (var12Lifetime1 > 255) {
                var12Lifetime1 = 255;
              }
            }
            od.a(var12Lifetime1, 47, var9Lifetime2, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_174_0 = var3_ref;
          stackIn_174_1 = new StringBuilder().append("rb.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_175_2 = "null";
          } else {
            stackIn_175_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_174_0), ((StringBuilder) (Object) stackIn_174_1).append(stackIn_175_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        var11 = MinerDisturbance.field_ab;
        var4 = 0;
        if (!param1) {
          return true;
        }
        param2 = param2 * 4;
        var5 = 0;
        param0 = param0 * 4;
        var6 = (param2 + 1) * this.field_k + param0;
        var7 = this.field_k - 4;
        for (var8 = 0; var8 < 4; var8++) {
          for (var9 = 0; var9 < 4; var9++) {
            if (this.field_b[var6]) {
              var4++;
              this.field_b[var6] = false;
              var5 = 1;
            }
            var6++;
          }
          var6 = var6 + var7;
        }
        var8Lifetime1 = param0 + ((1 + param2) * this.field_k - 4);
        for (var9Lifetime1 = 3; var9Lifetime1 > 0; var9Lifetime1--) {
          for (var10 = 0; var10 < 4; var10++) {
            if (this.field_b[var8Lifetime1] &&
              var4 > 0) {
              var4--;
              this.field_b[var8Lifetime1] = true;
              var5 = 1;
            }
            var8Lifetime1++;
          }
          var8Lifetime1 = var8Lifetime1 - (4 + var7);
        }
        var6Lifetime1 = param0 + this.field_k * (1 + param2);
        for (var9Lifetime2 = 0; var9Lifetime2 < 4; var9Lifetime2++) {
          for (var10Lifetime1 = 0; var10Lifetime1 < 4; var10Lifetime1++) {
            if (!this.field_b[var6Lifetime1] &&
              var4 > 0) {
              var5 = 1;
              this.field_b[var6Lifetime1] = true;
              var4--;
            }
            var6Lifetime1++;
          }
          var6Lifetime1 = var6Lifetime1 + var7;
        }
        return var5 != 0;
    }

    final int j(int param0, int param1, int param2) {
        int var4 = this.field_k * param1 + param2;
        if (param0 > -112) {
          this.j(50, 67, 7);
        }
        return this.field_p[var4];
    }

    public static void a(int param0) {
        if (param0 != -2004317953) {
          return;
        }
        field_l = null;
        field_f = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int var10 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        int var6 = param2 + this.field_k * param3;
        int var7 = -4 + this.field_k;
        if (!param4) {
          this.field_h = (int[]) null;
        }
        for (var8 = 0; var8 < 4; var8++) {
          for (var9 = 0; var9 < 4; var9++) {
            incrementValue$0 = var6;
            var6++;
            this.field_b[incrementValue$0] = (double)param1 * Math.random() < (double)param0 ? true : false;
          }
          var6 = var6 + var7;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 + this.field_k * param0;
        this.field_b[var5] = param1;
        int var6 = -112 % ((param3 + 40) / 34);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int var11 = MinerDisturbance.field_ab;
        param4 = param4 * 4;
        param2 = param2 * 4;
        int var6 = param4 + this.field_k * param2;
        int var7 = this.field_k - 4;
        int var8 = 0;
        int var9 = 64 % ((param3 + 13) / 60);
        while (4 > var8) {
          for (var10 = 0; var10 < 4; var10++) {
            incrementValue$0 = var6;
            var6++;
            this.field_g[incrementValue$0] = (double)param1 > Math.random() * (double)param0 ? true : false;
          }
          var6 = var6 + var7;
          var8++;
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param0 + this.field_k * param2;
        if (param1 > -82) {
          return true;
        }
        int var5 = this.field_k - 4;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            incrementValue$0 = var4;
            var4++;
            if (this.field_b[incrementValue$0]) {
              return true;
            }
          }
          var4 = var4 + var5;
        }
        return false;
    }

    final void h(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * param1;
        param2 = param2 * 4;
        int var4 = param2 * this.field_k + param0;
        int var5 = -4 + this.field_k;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; 4 > var7; var7++) {
            incrementValue$0 = var4;
            var4++;
            this.field_b[incrementValue$0] = true;
          }
          var4 = var4 + var5;
        }
    }

    final void e(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        if (param2 != 83) {
          return;
        }
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + this.field_k * param0;
        int var5 = this.field_k - 4;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            if (this.field_g[var4]) {
              this.field_g[var4] = false;
              return;
            }
            var4++;
          }
          var4 = var4 + var5;
        }
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 + this.field_k * param3;
        if (param0 <= 91) {
          return;
        }
        this.field_m[var5] = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int var10 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var6 = param2 * this.field_k + param3;
        int var7 = param1 + this.field_k;
        for (var8 = 0; var8 < 4; var8++) {
          for (var9 = 0; var9 < 4; var9++) {
            incrementValue$0 = var6;
            var6++;
            this.field_m[incrementValue$0] = (double)param4 > Math.random() * (double)param0 ? true : false;
          }
          var6 = var6 + var7;
        }
    }

    final boolean d(int param0, int param1, byte param2) {
        int var4 = param1 + param0 * this.field_k;
        if (param2 > -76) {
          return false;
        }
        return this.field_i[var4] > 0 ? true : false;
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (fg.a(-1975005818, param1)) {
          return true;
        }
        if (45 != param1 &&
          param1 != 160 &&
          param1 != 32) {
          if (param1 == 95) {
            return true;
          }
          if (param0 > 117) {
          }
          return false;
        }
        return true;
    }

    final boolean b(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param0 + this.field_k * param1;
        int var5 = this.field_k - 4;
        if (param2 <= 12) {
          return true;
        }
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            incrementValue$0 = var4;
            var4++;
            if (this.field_d[incrementValue$0]) {
              return true;
            }
          }
          var4 = var4 + var5;
        }
        return false;
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var5 = param3 * this.field_k + param2;
        if (param1 <= 0) {
          this.field_h = (int[]) null;
        }
        int var6 = this.field_k - 4;
        for (var7 = 0; var7 < 4; var7++) {
          for (var8 = 0; var8 < 4; var8++) {
            incrementValue$0 = var5;
            var5++;
            this.field_d[incrementValue$0] = true;
          }
          var5 = var5 + var6;
        }
    }

    final boolean e(int param0, int param1, int param2) {
        if (param2 != 2) {
          this.field_a = false;
        }
        int var4 = param0 + this.field_k * param1;
        return this.field_b[var4];
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param1 = param1 * 4;
        int var5 = param1 + param3 * this.field_k;
        int var6 = this.field_k - 4;
        int var7 = 0;
        if (param0) {
          return;
        }
        while (var7 < 4) {
          for (var8 = 0; var8 < 4; var8++) {
            incrementValue$0 = var5;
            var5++;
            this.field_c[incrementValue$0] = param2;
          }
          var5 = var5 + var6;
          var7++;
        }
    }

    final boolean f(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param2 + param0 * this.field_k;
        if (param1 != 2) {
          this.field_a = false;
        }
        int var5 = this.field_k - 4;
        for (var6 = 0; 4 > var6; var6++) {
          for (var7 = 0; 4 > var7; var7++) {
            incrementValue$0 = var4;
            var4++;
            if (this.field_g[incrementValue$0]) {
              return true;
            }
          }
          var4 = var4 + var5;
        }
        return false;
    }

    final boolean i(int param0, int param1, int param2) {
        int var4;
        int var5;
        if (param1 >= 0 &&
          this.field_k - 1 >= param1 &&
          -1 + this.field_j >= param2 &&
          param2 >= 0) {
          var4 = -123 / ((param0 - 9) / 36);
          var5 = param1 + param2 * this.field_k;
          return this.field_m[var5];
        }
        return false;
    }

    final void a(int param0, int param1, int param2, je[][] param3) {
        je dupTemp$0 = null;
        je dupTemp$1 = null;
        boolean stackIn_7_1 = false;
        int stackIn_65_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var13 = MinerDisturbance.field_ab;
        try {
          if (this.field_a) {
            var5_int = -1;
          } else {
            var5_int = 1;
          }
          stackIn_7_1 = !(this.field_a);
          this.field_a = stackIn_7_1;
          var6 = hf.field_t * 4 + 64;
          for (var7 = param0 * 4 + 4; param2 * 4 <= var7; var7--) {
            if (var7 < var6) {
              for (var8 = 0; 124 >= var8; var8++) {
                var9 = var8 + this.field_k * var7;
                if (this.field_b[var9]) {
                  if (je.i(var8, var7)) {
                    if (!this.field_b[var9 - this.field_k]) {
                      this.field_b[var9 - this.field_k] = true;
                      this.field_b[var9] = false;
                    }
                  } else {
                    if (!this.field_b[var9 + this.field_k] &&
                      !je.i(var8, var7 + 1)) {
                      this.field_b[var9] = false;
                      this.field_b[this.field_k + var9] = true;
                    } else {
                      var10 = this.field_b[var5_int + var9] ? 1 : 0;
                      var11 = this.field_b[var9 - var5_int] ? 1 : 0;
                      if (var10 == 0 &&
                        !je.i(var5_int + var8, var7)) {
                        this.field_b[var9] = false;
                        this.field_b[var9 + var5_int] = true;
                      } else {
                        if (var11 == 0 &&
                          !je.i(var8 - var5_int, var7)) {
                          this.field_b[var9] = false;
                          this.field_b[var9 - var5_int] = true;
                        }
                      }
                    }
                  }
                  this.field_i[var9] = 8;
                } else {
                  if (this.field_i[var9] > 0) {
                    this.field_i[var9] = this.field_i[var9] - 1;
                  }
                  if (this.field_p[var9] > 0) {
                    this.field_p[var9] = this.field_p[var9] - 1;
                  }
                }
                if (this.field_m[var9]) {
                  if (var7 <= 30) {
                    this.field_m[var9] = false;
                  } else {
                    this.field_p[var9] = 64;
                    if (!this.field_m[-this.field_k + var9] &&
                      !this.field_b[-this.field_k + var9] &&
                      !je.i(var8, var7 - 1)) {
                      this.field_m[var9] = false;
                      this.field_m[var9 - this.field_k] = true;
                    } else {
                      if (!this.field_m[var9 + var5_int] &&
                        !this.field_b[var9 + var5_int] &&
                        !je.i(var5_int + var8, var7)) {
                        this.field_m[var9] = false;
                        this.field_m[var9 + var5_int] = true;
                      } else {
                        if (!this.field_m[var9 - var5_int] &&
                          !this.field_b[var9 - var5_int] &&
                          !je.i(-var5_int + var8, var7)) {
                          this.field_m[var9] = false;
                          this.field_m[-var5_int + var9] = true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          var7Lifetime1 = -92 % ((param1 - 54) / 39);
          for (var8Lifetime1 = param0 * 4 + 4; var8Lifetime1 >= param2 * 4; var8Lifetime1--) {
            if (var8Lifetime1 < var6) {
              for (var9Lifetime1 = 123; var9Lifetime1 >= 0; var9Lifetime1--) {
                var10Lifetime1 = var8Lifetime1 * this.field_k + var9Lifetime1;
                if (this.field_b[var10Lifetime1]) {
                  this.field_i[var10Lifetime1] = 8;
                  var11Lifetime1 = var9Lifetime1 >> 2;
                  var12 = var8Lifetime1 >> 2;
                  stackIn_65_0 = 0;
                  if (param3[var11Lifetime1][var12].field_a) {
                    stackIn_66_1 = 0;
                  } else {
                    stackIn_66_1 = 1;
                  }
                  if (stackIn_65_0 == stackIn_66_1) {
                    if (0 < param3[var11Lifetime1][var12].field_q) {
                      dupTemp$0 = param3[var11Lifetime1][var12];
                      dupTemp$0.field_q = dupTemp$0.field_q - 1;
                    }
                    if (param3[var11Lifetime1][var12].field_q > 192) {
                      dupTemp$1 = param3[var11Lifetime1][var12];
                      dupTemp$1.field_q = dupTemp$1.field_q - 128;
                      if (15.0 > Math.random() * 100.0) {
                        this.field_b[var10Lifetime1] = false;
                      }
                    }
                  }
                  if (this.field_b[var10Lifetime1]) {
                    if (!this.field_b[var10Lifetime1 + this.field_k] &&
                      !je.i(var9Lifetime1, var8Lifetime1 + 1)) {
                      this.field_b[var10Lifetime1] = false;
                      this.field_b[this.field_k + var10Lifetime1] = true;
                    } else {
                      if (!this.field_b[var10Lifetime1 + var5_int] &&
                        !je.i(var9Lifetime1 + var5_int, var8Lifetime1)) {
                        this.field_b[var10Lifetime1] = false;
                        this.field_b[var5_int + var10Lifetime1] = true;
                      } else {
                        if (!this.field_b[var10Lifetime1 - var5_int] &&
                          !je.i(var9Lifetime1 - var5_int, var8Lifetime1)) {
                          this.field_b[var10Lifetime1] = false;
                          this.field_b[var10Lifetime1 - var5_int] = true;
                        }
                      }
                    }
                  }
                }
                if (this.field_m[var10Lifetime1]) {
                  this.field_p[var10Lifetime1] = 64;
                  if (!this.field_m[-this.field_k + var10Lifetime1] &&
                    !je.i(var9Lifetime1, var8Lifetime1 - 1) &&
                    !oe.field_b) {
                    this.field_m[var10Lifetime1] = false;
                    this.field_m[var10Lifetime1 - this.field_k] = true;
                  } else {
                    if (!this.field_m[var10Lifetime1 + var5_int] &&
                      !je.i(var9Lifetime1 + var5_int, var8Lifetime1)) {
                      this.field_m[var10Lifetime1] = false;
                      this.field_m[var10Lifetime1 + var5_int] = true;
                    } else {
                      if (!this.i(123, var9Lifetime1 - var5_int, var8Lifetime1) &&
                        !je.i(-var5_int + var9Lifetime1, var8Lifetime1)) {
                        this.field_m[var10Lifetime1] = false;
                        this.field_m[-var5_int + var10Lifetime1] = true;
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_100_0 = var5;
          stackIn_100_1 = new StringBuilder().append("rb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + param0 * this.field_k;
        int var5 = this.field_k - 4;
        if (param2 != -5) {
          return;
        }
        for (var6 = 0; 4 > var6; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            incrementValue$0 = var4;
            var4++;
            this.field_g[incrementValue$0] = true;
          }
          var4 = var4 + var5;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param1 = param1 * 4;
        int var4 = param1 + this.field_k * param2;
        int var5 = -4 + this.field_k;
        for (var6 = 0; 4 > var6; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            incrementValue$0 = var4;
            var4++;
            this.field_b[incrementValue$0] = false;
          }
          var4 = var4 + var5;
        }
        if (param0 <= 115) {
          this.field_k = 87;
        }
    }

    final void c(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param1 = param1 * 4;
        if (param2 != -48) {
          this.field_p = (int[]) null;
        }
        int var4 = this.field_k * param0 + param1;
        int var5 = this.field_k - 4;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            incrementValue$0 = var4;
            var4++;
            this.field_m[incrementValue$0] = true;
          }
          var4 = var4 + var5;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param2 = param2 * 4;
        int var4 = this.field_k * param2 + param0;
        int var5 = this.field_k + param1;
        for (var6 = 0; var6 < 4; var6++) {
          for (var7 = 0; var7 < 4; var7++) {
            this.field_m[var4] = false;
            this.field_p[var4] = 0;
          }
          var4 = var4 + var5;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != 61) {
          return true;
        }
        int var4 = this.field_k * param1 + param0;
        return this.field_g[var4];
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param3 + this.field_k * param1;
        this.field_p[var5] = param2;
        if (param0 >= -91) {
          field_l = (int[]) null;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param1 < 71) {
          this.f(109, -23, 126);
        }
        int var5 = this.field_k * param2 + param0;
        this.field_g[var5] = param3;
    }

    final void a(int param0, boolean param1, je[][] param2, int param3) {
        int fieldTemp$0 = 0;
        int var7_int = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_88_0 = 0;
        boolean stackIn_132_1 = false;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        String stackIn_158_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
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
        int[] var20 = null;
        int[] var21 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var12Lifetime1Lifetime1;
        var19 = MinerDisturbance.field_ab;
        try {
          fieldTemp$0 = this.field_n + 1;
          this.field_n = this.field_n + 1;
          if ((3 & fieldTemp$0) != 0) {
            return;
          }
          if (!param1) {
            return;
          }
          if (this.field_o) {
            var5_int = -1;
          } else {
            var5_int = 1;
          }
          var6 = 64 + hf.field_t * 4;
          for (var7_int = 4 + 4 * param0; param3 * 4 <= var7_int; var7_int--) {
            if (var6 > var7_int) {
              stackIn_14_0 = (!this.field_o) ? 0 : 124;
              var8_int = stackIn_14_0;
              stackIn_17_0 = (!this.field_o) ? 125 : -1;
              var9 = stackIn_17_0;
              for (var10 = var8_int; var10 != var9; var10 = var10 + var5_int) {
                var11 = var10 + this.field_k * var7_int;
                if (this.field_g[var11]) {
                  if (this.field_m[var11] &&
                    !this.field_d[var11]) {
                    this.field_m[var11] = false;
                  }
                  if (!this.field_g[-this.field_k + var11] &&
                    je.e(var10, 1 + var7_int)) {
                    this.field_g[var11] = false;
                    this.field_g[var11 - this.field_k] = true;
                  } else {
                    if (!this.field_g[var11 - this.field_k] &&
                      this.field_b[var11]) {
                      this.field_g[var11] = false;
                      this.field_g[-this.field_k + var11] = true;
                    } else {
                      if (!this.field_g[this.field_k + var11] &&
                        !this.field_b[this.field_k + var11] &&
                        !je.e(var10, var7_int + 1)) {
                        this.field_g[var11] = false;
                        this.field_g[var11 + this.field_k] = true;
                      } else {
                        if (this.field_g[this.field_k + var11] ||
                          this.field_g[-this.field_k + var11] ||
                          je.e(var10, var7_int + 1)) {
                          if (!this.field_g[var5_int + var11] &&
                            !je.e(var5_int + var10, var7_int)) {
                            this.field_g[var11] = false;
                            this.field_g[var11 + var5_int] = true;
                          } else {
                            if (!this.field_g[var11 - var5_int] &&
                              !je.e(var10 - var5_int, var7_int)) {
                              this.field_g[var11] = false;
                              this.field_g[-var5_int + var11] = true;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          var7 = new int[]{2147483647, 2147483647, 2147483647};
          var21 = new int[var7.length];
          var20 = var21;
          var8 = var20;
          for (var9Lifetime1 = 4 * param0 + 4; var9Lifetime1 >= param3 * 4; var9Lifetime1--) {
            if (var6 > var9Lifetime1) {
              stackIn_55_0 = (!this.field_o) ? 0 : 124;
              var10Lifetime1 = stackIn_55_0;
              stackIn_58_0 = (this.field_o) ? -1 : 125;
              var11Lifetime1 = stackIn_58_0;
              var12 = var10Lifetime1;
              while (var12 != var11Lifetime1) {
                boolean decompiledFrameRemainder0 = true;
                var13 = var12 + this.field_k * var9Lifetime1;
                if (!this.field_g[var13]) {
                  this.field_d[var13] = false;
                } else {
                  if (this.field_g[var13 + this.field_k] ||
                    this.field_g[-this.field_k + var13] ||
                    je.e(var12, var9Lifetime1 + 1)) {
                    if (!this.field_g[var13 + var5_int] &&
                      !je.e(var5_int + var12, var9Lifetime1)) {
                      this.field_g[var13] = false;
                      this.field_g[var13 + var5_int] = true;
                    } else {
                      if (!this.field_g[var13 - var5_int] &&
                        !je.e(-var5_int + var12, var9Lifetime1)) {
                        this.field_g[var13] = false;
                        this.field_g[var13 - var5_int] = true;
                      }
                    }
                  }
                  if (this.field_d[var13]) {
                    if (!this.field_b[var13]) {
                      var14 = ca.field_k - (var12 >> 2);
                      var15 = -(var9Lifetime1 >> 2) + hf.field_t;
                      var16 = var14 * var14 + var15 * var15;
                      for (var17 = 0; var17 < var7.length; var17++) {
                        if (var7[var17] != var16) {
                          if (var7[var17] <= var16) {
                            continue;
                          }
                          var7[var17] = var16;
                          var21[var17] = var12;
                        } else {
                          var8[var17] = (var21[var17] + var12) / 2;
                        }
                        break;
                      }
                      if (!oe.field_b &&
                        this.field_m[var13]) {
                        this.a(var12 >> 2, -4, var9Lifetime1 >> 2);
                        uf.field_p[jf.b((byte) 56)] = new gf(var12 >> 2, var9Lifetime1 >> 2, 16);
                      }
                      stackIn_88_0 = ((15 & (this.field_n >> 2) + var13) != 0) ? 0 : 1;
                      var17Lifetime1 = stackIn_88_0;
                      if (var17Lifetime1 != 0) {
                        var18 = 0;
                        if (this.field_g[var13]) {
                          var18 = 1;
                          this.field_g[var13] = false;
                        } else {
                          if (!this.field_g[var13 + var5_int]) {
                            if (this.field_g[-var5_int + var13]) {
                              this.field_g[-var5_int + var13] = false;
                              var18 = 1;
                            }
                          } else {
                            this.field_g[var5_int + var13] = false;
                            var18 = 1;
                          }
                        }
                        if (var18 != 0) {
                          pi.field_a = pi.field_a + 1;
                          if (2800 <= pi.field_a) {
                            fn.a(26, 229, 3);
                          }
                        }
                      }
                      if (!this.field_d[-1 + var13] &&
                        this.field_g[-1 + var13]) {
                        this.field_d[-1 + var13] = true;
                      }
                      if (!this.field_d[var13 + 1] &&
                        this.field_g[var13 + 1]) {
                        this.field_d[1 + var13] = true;
                      }
                      if (!this.field_d[-this.field_k + (var13 - 1)] &&
                        this.field_g[var13 - this.field_k - 1]) {
                        this.field_d[-1 - this.field_k + var13] = true;
                      }
                      if (!this.field_d[-this.field_k + (var13 + 1)] &&
                        this.field_g[-this.field_k + (var13 + 1)]) {
                        this.field_d[1 - this.field_k + var13] = true;
                      }
                      decompiledFrameRemainder0 = !(this.field_g[var13]);
                      if (decompiledFrameRemainder0) {
                        this.field_d[var13] = false;
                        if (!this.field_g[var13 + this.field_k]) {
                          this.field_d[this.field_k + var13] = true;
                        }
                        if (!this.field_g[var13 + 1] &&
                          this.field_g[this.field_k + 1 + var13]) {
                          this.field_d[this.field_k + 1 + var13] = true;
                        }
                        decompiledFrameRemainder0 = !(this.field_g[var13 - 1]);
                        if (decompiledFrameRemainder0) {
                          if (this.field_g[-1 + var13 + this.field_k]) {
                            this.field_d[var13 + (-1 + this.field_k)] = true;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            var12 = var12 + var5_int;
                            continue;
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      this.field_d[var13] = false;
                    }
                  }
                }
                var12 = var12 + var5_int;
              }
            }
          }
          if ((this.field_n & 15) == 0) {
            stackIn_132_1 = !(this.field_o);
            this.field_o = stackIn_132_1;
            var9Lifetime2 = 0;
            var10Lifetime2 = 0;
            var11Lifetime2 = 0;
            for (var12Lifetime1 = 0; var7.length > var12Lifetime1; var12Lifetime1++) {
              if (2147483647 != var7[var12Lifetime1]) {
                var9Lifetime2++;
                var11Lifetime2 = var11Lifetime2 + var21[var12Lifetime1];
                var10Lifetime2 = var10Lifetime2 + var7[var12Lifetime1];
              }
            }
            if (0 < var9Lifetime2) {
              var11Lifetime2 = var11Lifetime2 / var9Lifetime2;
              var10Lifetime2 = var10Lifetime2 / var9Lifetime2;
              if (var10Lifetime2 < 1) {
                var10Lifetime2 = 1;
              }
              var12Lifetime1Lifetime1 = 80 * oc.field_f / (int)Math.sqrt((double)var10Lifetime2);
              if (var12Lifetime1Lifetime1 > oc.field_f) {
                var12Lifetime1Lifetime1 = oc.field_f;
              }
              var13Lifetime1 = 10;
              var14Lifetime1 = (var11Lifetime2 >> 2) - ca.field_k;
              if (var14Lifetime1 < -var13Lifetime1) {
                var14Lifetime1 = -var13Lifetime1;
              }
              if (var14Lifetime1 > var13Lifetime1) {
                var14Lifetime1 = var13Lifetime1;
              }
              var15Lifetime1 = 128 + 128 * var14Lifetime1 / var13Lifetime1;
              if (var15Lifetime1 >= 0) {
                if (var15Lifetime1 > 255) {
                  var15Lifetime1 = 255;
                }
              } else {
                var15Lifetime1 = 0;
              }
              od.a(var15Lifetime1, 46, var12Lifetime1Lifetime1, 4);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_157_0 = var5;
          stackIn_157_1 = new StringBuilder().append("rb.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_158_2 = "null";
          } else {
            stackIn_158_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_157_0), ((StringBuilder) (Object) stackIn_157_1).append(stackIn_158_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, je[][] param5) {
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        var18 = MinerDisturbance.field_ab;
        try {
          if (!vi.field_h &&
            !wm.field_e) {
            for (var10 = param2 * 4; var10 <= 4 + 4 * param0; var10++) {
              for (var11 = param3 * 4; var11 >= 4 + param1 * 4; var11--) {
                var7_int = 8 * var10 - li.field_c;
                var8 = 8 * var11 - db.field_d;
                if (var7_int > -64 &&
                  var8 > -64 &&
                  704 > var7_int &&
                  var8 < 544 &&
                  param5[var10 >> 2][var11 >> 2].field_V) {
                  var12 = var10 + this.field_k * var11;
                  if (this.field_g[var12]) {
                    var13 = var8;
                    var14 = 8;
                    if (param5[var10 >> 2][var11 + 1 >> 2].field_a) {
                      var14 = 12;
                    }
                    var15 = 8;
                    eh.e(var7_int, var13, var15, var14, 0);
                    if (!this.field_g[var12 - 1]) {
                      if ((this.field_b[var12] ||
                        !param5[var10 >> 2][var11 + 1 >> 2].field_a) &&
                        !this.field_g[this.field_k + var12]) {
                        eh.c(var7_int, var13 + 4, 3, 0);
                      } else {
                        if (this.field_g[var12 - 1 + this.field_k]) {
                          eh.a(-8 + var7_int, var13 - 8, var7_int, var13 + 8);
                          eh.c(var7_int, var13 + 8, 6, 0);
                          eh.a();
                        }
                      }
                    }
                    if (!this.field_g[1 + var12]) {
                      if ((this.field_b[var12] ||
                        !param5[var10 >> 2][1 + var11 >> 2].field_a) &&
                        !this.field_g[var12 + this.field_k]) {
                        eh.c(var7_int + 8, 4 + var13, 3, 0);
                      } else {
                        if (this.field_g[this.field_k + (var12 + 1)]) {
                          eh.a(8 + var7_int, var13 - 8, 16 + var7_int, var13 + 8);
                          eh.c(8 + var7_int, var13 + 8, 6, 0);
                          eh.a();
                        }
                      }
                    }
                    var16 = var12 - this.field_k;
                    if (!this.field_g[var16] &&
                      !this.field_g[var16 + 1] &&
                      !this.field_g[var16 - 1]) {
                      eh.g(var7_int, var13, 8, 16777113, 200);
                      eh.g(var7_int, 1 + var13, 9, 16777113, 128);
                      eh.g(var7_int, var13 + 2, 10, 16777113, 64);
                    }
                  }
                }
              }
            }
            if (param4 != 17761) {
              rb.a(-117);
            }
            var10Lifetime1 = jb.field_o[cm.field_o];
            var11Lifetime1 = sk.field_b[cm.field_o];
            for (var12Lifetime1 = param2 * 4; var12Lifetime1 <= 4 + 4 * param0; var12Lifetime1++) {
              for (var13Lifetime1 = param3 * 4; var13Lifetime1 >= 4 * param1 + 4; var13Lifetime1--) {
                var7_intLifetime1 = -li.field_c + var12Lifetime1 * 8;
                var8Lifetime1 = -db.field_d + var13Lifetime1 * 8;
                if (-64 < var7_intLifetime1 &&
                  var8Lifetime1 > -64 &&
                  var7_intLifetime1 < 704 &&
                  var8Lifetime1 < 544 &&
                  param5[var12Lifetime1 >> 2][var13Lifetime1 >> 2].field_V) {
                  var14Lifetime1 = var12Lifetime1 + var13Lifetime1 * this.field_k;
                  if (this.field_c[var14Lifetime1] <= 0) {
                    var15Lifetime1 = var11Lifetime1;
                    if (param5[var12Lifetime1 >> 2][var13Lifetime1 >> 2].field_A ||
                      param5[var12Lifetime1 - 1 >> 2][var13Lifetime1 >> 2].field_A ||
                      param5[var12Lifetime1 + 1 >> 2][var13Lifetime1 >> 2].field_A ||
                      param5[var12Lifetime1 >> 2][var13Lifetime1 - 1 >> 2].field_A ||
                      param5[var12Lifetime1 >> 2][1 + var13Lifetime1 >> 2].field_A) {
                      var15Lifetime1 = -2004317953;
                    }
                    if (!this.field_b[var14Lifetime1]) {
                      if (this.field_b[var14Lifetime1 + this.field_k]) {
                        var16Lifetime1 = this.field_i[var14Lifetime1];
                        var17 = (this.field_i[-1 + var14Lifetime1] + (var16Lifetime1 + this.field_i[1 + var14Lifetime1])) / 3;
                        eh.b(var7_intLifetime1, -var17 + var8Lifetime1 + 8, 8, var17, var15Lifetime1, var10Lifetime1);
                      } else {
                        if (this.field_p[var14Lifetime1] > 16) {
                          var16Lifetime1 = this.field_p[var14Lifetime1 + this.field_k] + this.field_p[-this.field_k + var14Lifetime1] + (this.field_p[var14Lifetime1 - 1] + this.field_p[var14Lifetime1]) >> 2;
                          eh.b(var7_intLifetime1, var8Lifetime1, 8, 8, 65280, var16Lifetime1);
                        }
                      }
                    } else {
                      eh.b(var7_intLifetime1, var8Lifetime1, 8, 8, var15Lifetime1, var10Lifetime1);
                    }
                  } else {
                    var9 = this.field_c[var14Lifetime1];
                    var15Lifetime1 = 8930372;
                    if (1 == var9) {
                      var15Lifetime1 = 8930372;
                    }
                    if (var9 == 2) {
                      var15Lifetime1 = 11158596;
                    }
                    if (3 == var9) {
                      var15Lifetime1 = 16729156;
                    }
                    if (var9 == 4) {
                      var15Lifetime1 = 16746564;
                    }
                    if (var9 == 5) {
                      var15Lifetime1 = 16755268;
                    }
                    if (6 == var9) {
                      var15Lifetime1 = 16777028;
                    }
                    if (var9 == 7) {
                      var15Lifetime1 = 16777096;
                    }
                    if (var9 == 8) {
                      var15Lifetime1 = 16777130;
                    }
                    if (9 <= var9) {
                      var15Lifetime1 = 16777215;
                    }
                    eh.b(var7_intLifetime1 - 4, var8Lifetime1 + 4, 16, 16, var15Lifetime1, var10Lifetime1);
                  }
                }
              }
            }
            for (var12Lifetime2 = 4 * param2; 4 * param0 + 4 >= var12Lifetime2; var12Lifetime2++) {
              for (var13Lifetime2 = param3 * 4; var13Lifetime2 >= 4 * param1 + 4; var13Lifetime2--) {
                var7_intLifetime2 = -li.field_c + 8 * var12Lifetime2;
                var8Lifetime2 = -db.field_d + var13Lifetime2 * 8;
                if (-64 < var7_intLifetime2 &&
                  -64 < var8Lifetime2 &&
                  var7_intLifetime2 < 704 &&
                  544 > var8Lifetime2) {
                  var14Lifetime2 = var13Lifetime2 * this.field_k + var12Lifetime2;
                  if (this.field_g[var14Lifetime2]) {
                    var15Lifetime2 = 0;
                    if (this.field_d[var14Lifetime2] &&
                      !this.field_g[var14Lifetime2 - this.field_k]) {
                      var16Lifetime2 = 8;
                      eh.f(ll.a((byte) -73, 8) + var7_intLifetime2, -var15Lifetime2 + (var8Lifetime2 - ll.a((byte) -73, 4)), 4, 16711680, 110);
                      if (8 < var16Lifetime2 + (8 - var15Lifetime2)) {
                        var16Lifetime2 = -var15Lifetime2 + 8;
                      }
                      eh.a(var7_intLifetime2 + ll.a((byte) -73, 8) << 4, -ll.a((byte) -73, 4) + var8Lifetime2 - (var15Lifetime2 - 1) << 4, 64, 4, re.field_c);
                      eh.a(var7_intLifetime2 + ll.a((byte) -73, 8) << 4, -var15Lifetime2 + var8Lifetime2 + (-ll.a((byte) -73, 4) + 1) << 4, 64, 4, re.field_c);
                      eh.a(var7_intLifetime2 + ll.a((byte) -73, 8) << 4, 1 + (-ll.a((byte) -73, 6) + (var8Lifetime2 - var15Lifetime2)) << 4, 80, 5, re.field_c);
                      eh.a(var7_intLifetime2 + ll.a((byte) -73, 8) << 4, 1 + var8Lifetime2 - var15Lifetime2 - ll.a((byte) -73, 6) << 4, 80, 5, re.field_c);
                    }
                  }
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_127_0 = var7;
          stackIn_127_1 = new StringBuilder().append("rb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(')').toString());
        }
    }

    rb(int param0, int param1) {
        int var3 = 0;
        this.field_j = param1 * 4;
        this.field_k = param0 * 4;
        this.field_i = new int[this.field_j * this.field_k];
        this.field_g = new boolean[this.field_k * this.field_j];
        this.field_h = new int[this.field_k * this.field_j];
        this.field_b = new boolean[this.field_j * this.field_k];
        this.field_m = new boolean[this.field_j * this.field_k];
        this.field_p = new int[this.field_j * this.field_k];
        this.field_c = new int[this.field_j * this.field_k];
        this.field_d = new boolean[this.field_j * this.field_k];
        for (var3 = 0; var3 < this.field_j * this.field_k; var3++) {
          this.field_h[var3] = ll.a((byte) -73, 15);
        }
        this.field_n = 0;
    }

    static {
        field_f = "This password is part of your Player Name, and would be easy to guess";
        field_l = new int[25];
    }
}
