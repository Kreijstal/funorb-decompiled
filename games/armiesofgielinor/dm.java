/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    private ft field_C;
    private int field_A;
    private ft field_B;
    private String field_U;
    private int[] field_j;
    private int field_h;
    private int field_Q;
    static String field_O;
    private int field_l;
    static String field_d;
    private ft field_q;
    static String field_x;
    private ft field_g;
    private int field_n;
    private int field_G;
    private int field_f;
    private ft field_m;
    private int field_u;
    private int field_z;
    private int field_r;
    private boolean field_y;
    private int field_b;
    private ft field_c;
    private ft[] field_T;
    private int field_F;
    int[] field_N;
    private int field_p;
    private String field_R;
    private int field_e;
    static int field_D;
    private int field_I;
    private int field_P;
    private ft field_S;
    private int field_L;
    private ft[] field_i;
    private int field_M;
    private ft field_s;
    private ft field_k;
    private ft field_J;
    private int field_E;
    private ft field_a;
    private String[] field_t;
    private int field_o;
    private ft field_w;
    private int field_K;
    private boolean field_v;

    private final int d(boolean param0) {
        if (!param0) {
          this.field_i = (ft[]) null;
        }
        return (nr.field_e.field_y >> 1) - nr.field_e.field_L + (nr.field_e.field_v - nr.field_e.field_H + 3);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.b(true);
        param0 = (this.field_q.field_k - var7 >> 1) + param0;
        this.field_u = param0;
        param3 = param0 + var7;
        param0 = param3 - this.e(-119);
        var7 = 0;
        int var8 = -this.field_n + param5;
        if (param4 != 7) {
          return;
        }
        var7 = 33;
        int var9 = 0;
        param0 = (this.field_f + var7) * var8 + param0;
        var9 = 33;
        param2 = param2 + (this.field_q.field_n - var9 >> 1);
        param3 = var7 + param0;
        param1 = var9 + param2;
        this.field_i[param5] = new ft(param0, param2);
        this.field_T[param5] = new ft(param3, param1);
    }

    final void d(byte param0) {
        if (param0 != -73) {
          return;
        }
        this.e(false);
        this.b(param0 + 18742);
        this.k(param0 + 106);
        this.f((byte) 66);
        this.c(0);
    }

    private final void a(int param0, boolean param1, ft param2, int param3, ft param4) {
        int var10 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != null &&
            param4 != null) {
            if (param0 < this.field_n &&
              this.field_h < param0) {
              return;
            }
            var6_int = param0 - this.field_n;
            if (lt.field_i != null &&
              var6_int >= 0 &&
              lt.field_i.length > var6_int) {
              var7 = lt.field_i[var6_int];
              if (param3 <= 36) {
                return;
              }
              var7.f(db.a(true, param2.field_k), u.a(param2.field_n, (byte) 94));
              var8 = 0;
              if (this.field_K == var6_int) {
                var8 = 1;
              }
              if (var8 == 0 &&
                !param1) {
                return;
              }
              var9 = this.field_G;
              if (var8 != 0) {
                var9 = this.field_F;
              }
              for (var10 = 0; this.field_L > var10; var10++) {
                SoftwareRaster.b(db.a(true, param2.field_k + var10), u.a(var10 + param2.field_n, (byte) 94), -(var10 << 1) + (param4.field_k - param2.field_k), -param2.field_n + (param4.field_n - (var10 << 1)), var9);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("dm.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_J != null) {
          if (this.field_w == null) {
            return;
          }
          if (param0) {
            return;
          }
          var2 = this.field_J.field_k;
          var3 = this.field_J.field_n;
          var4 = this.field_w.field_k - var2;
          var5 = this.field_w.field_n - var3;
          if (0 != var4) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, this.field_Q, this.field_p);
            return;
          }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int discarded$0 = 0;
        if (this.field_s != null) {
          if (this.field_k == null) {
            return;
          }
          var2 = this.field_s.field_k;
          var3 = this.field_s.field_n;
          var4 = this.field_k.field_k - var2;
          var5 = this.field_k.field_n - var3;
          if (var4 != 0) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, TutorialController.field_e, this.field_Q, this.field_p);
            if (param0 != 33) {
              discarded$0 = this.d(true);
            }
            return;
          }
        }
    }

    private final void d(int param0) {
        this.field_J = new ft(25, 33);
        if (param0 != 7) {
          return;
        }
        this.field_w = new ft(614, 446);
        this.field_A = 0;
        this.field_P = 16777215;
        this.field_b = 192;
        this.field_Q = 0;
        this.field_p = 128;
    }

    final int b(boolean param0, int param1) {
        ft var3;
        if (this.field_T != null &&
          param1 >= 0) {
          if (param1 >= this.field_T.length) {
            return 1;
          }
          if (!param0) {
            return 39;
          }
          var3 = this.field_T[param1];
          if (var3 != null &&
            var3.field_k >= 0) {
            return db.a(true, var3.field_k);
          }
          return 1;
        }
        return 1;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
          if ((4 & param4) != 0) {
            EffectPresentation.a(param5, param3, true, param2, (byte) -33, param0);
          }
          if ((2 & param4) != 0) {
            EffectPresentation.a(param5, param3, false, param2, (byte) -33, param0);
          }
        } else {
          if (0 != (param4 & 1)) {
            EffectPresentation.a(param5, param3, false, param2, (byte) -33, param0);
          }
          if ((8 & param4) != 0) {
            EffectPresentation.a(param5, param3, true, param2, (byte) -33, param0);
          }
        }
        if (param1) {
          dm.c((byte) -56);
        }
    }

    private final void a(boolean param0) {
        this.field_a = new ft(31, 431);
        this.f(1);
        this.g((byte) -71);
        this.c(param0);
    }

    final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6, String param7) {
        if (this.field_N != null && param0 >= 0 &&
          param0 < this.field_N.length) {
          this.field_r = param0;
        }
        if (2 <= param6 &&
          param6 <= 8) {
          this.field_e = param6;
        }
        this.field_v = param4 ? true : false;
        if (param5 >= 0 &&
          this.field_e >= param5) {
          this.field_I = param5;
        }
        if (param2 >= 0 &&
          param2 < 4) {
          this.field_E = param2;
        }
        this.field_K = param3;
        if (param1 != -28) {
          return;
        }
        try {
          this.a(param7, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dm.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, ft param2, int param3, boolean param4, ft param5) {
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var8Lifetime1;
        try {
          if (param5 != null &&
            param2 != null) {
            var7_int = db.a(true, param5.field_k);
            var8 = u.a(param5.field_n, (byte) 94);
            var9 = -var7_int + param2.field_k;
            var10 = param2.field_n - var8;
            SoftwareRaster.b(var7_int, var8, var9, var10, this.field_Q, this.field_p);
            if (this.field_y) {
              SoftwareRaster.b(var7_int, var8, var9, var10, this.field_P);
            }
            if (param1 != null &&
              param1.length() != 0) {
              var11 = u.a(param5.field_n, (byte) 94);
              var12 = u.a(param2.field_n, (byte) 94);
              var8Lifetime1 = var11 + var12 >> 1;
              var13 = mp.k(-78);
              var8Lifetime1 = var8Lifetime1 + var13;
              if (!param4) {
                stackIn_12_0 = nd.field_b;
              } else {
                stackIn_12_0 = TutorialController.field_e;
              }
              var16 = stackIn_12_0;
              var15 = var16;
              var14 = var15;
              if (param3 < ~param0) {
                fe.c(param1, db.a(true, this.field_c.field_k), var8Lifetime1, var16, true);
              } else {
                fe.a(param1, db.a(true, param0), var8Lifetime1, var16, true);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("dm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final int a(int param0, boolean param1) {
        ft var3;
        if (this.field_i != null &&
          param0 >= 0 &&
          param0 < this.field_i.length) {
          if (!param1) {
            this.a(126);
          }
          var3 = this.field_i[param0];
          if (var3 == null) {
            return 1;
          }
          if (var3.field_k >= 0) {
            return db.a(true, var3.field_k);
          }
          return 1;
        }
        return 1;
    }

    final ft h(byte param0) {
        int var3 = 0;
        ft var4;
        ft var5;
        var5 = new ft(-1, -1);
        if (null != this.field_T &&
          this.field_T.length != 0) {
          if (param0 != 94) {
            return (ft) null;
          }
          for (var3 = 0; var3 < this.field_T.length; var3++) {
            var4 = this.field_T[var3];
            if (var4 != null) {
              if (0 <= var4.field_k && (!(var5.field_k >= var4.field_k) ||
                !(var5.field_k >= 0))) {
                var5.field_k = var4.field_k;
              }
              if (var4.field_n >= 0 && (!(var5.field_n >= var4.field_n) ||
                !(var5.field_n >= 0))) {
                var5.field_n = var4.field_n;
              }
            }
          }
          if (0 <= var5.field_k &&
            var5.field_n >= 0) {
            return var5;
          }
          return new ft(1, 1);
        }
        return new ft(1, 1);
    }

    private final void g(byte param0) {
        int var15 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var4Lifetime1 = this.field_k.field_n;
        var7 = 0;
        var2Lifetime1 = this.field_s.field_k;
        this.field_m = new ft(var2Lifetime1, var4Lifetime1);
        var3Lifetime1 = this.field_k.field_k;
        this.field_z = 4;
        var7Lifetime1 = (this.field_q.field_n + this.field_l) * this.field_z + (this.field_B.field_n << 1) - this.field_l;
        var5Lifetime1 = var7Lifetime1 + var4Lifetime1;
        this.field_C = new ft(var3Lifetime1, var5Lifetime1);
        var8 = this.field_k.field_n;
        var9 = this.field_a.field_n;
        var10 = -var8 + var9;
        var11 = (-var7Lifetime1 + var10 >> 1) - 25;
        this.field_m.field_n = this.field_m.field_n + var11;
        this.field_f = 5;
        this.field_L = 2;
        this.field_C.field_n = this.field_C.field_n + var11;
        var6Lifetime1 = this.b(true);
        var2Lifetime1 = var2Lifetime1 + (-var6Lifetime1 + this.field_q.field_k >> 1);
        this.field_u = var2Lifetime1;
        var2Lifetime2 = this.field_B.field_k + this.field_m.field_k;
        var4Lifetime2 = this.field_B.field_n + this.field_m.field_n;
        if (param0 != -71) {
          return;
        }
        var3Lifetime2 = var2Lifetime2 + this.field_q.field_k;
        var12 = 0;
        var13 = this.field_o;
        var14 = this.field_N.length;
        for (var15 = var13; var14 > var15; var15++) {
          if (var15 == this.field_n) {
            var12 = 1;
          }
          var5Lifetime2 = var4Lifetime2 + this.field_q.field_n;
          if (var12 == 0) {
            this.field_i[var15] = new ft(var2Lifetime2, var4Lifetime2);
            this.field_T[var15] = new ft(var3Lifetime2, var5Lifetime2);
            var4Lifetime2 = this.field_l + var5Lifetime2;
          } else {
            if (this.field_n == var15) {
              this.field_g = new ft(var2Lifetime2, var4Lifetime2);
              this.field_S = new ft(var3Lifetime2, var5Lifetime2);
            }
            this.a(var2Lifetime2, var5Lifetime2, var4Lifetime2, var3Lifetime2, 7, var15);
            if (var15 == this.field_h) {
              var4Lifetime2 = 12 + (var5Lifetime2 + this.field_l);
              var12 = 0;
            }
          }
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_m != null) {
          if (this.field_C == null) {
            return;
          }
          if (param0 != 66) {
            this.field_L = -47;
          }
          var2 = this.field_m.field_k;
          var3 = this.field_m.field_n;
          var4 = -var2 + this.field_C.field_k;
          var5 = this.field_C.field_n - var3;
          if (var4 != 0) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, TutorialController.field_e, this.field_Q, this.field_p);
            return;
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_60_0 = 0;
        int var3;
        ft var4;
        ft var5;
        int var7;
        int var8;
        int var9;
        String var10;
        String var11;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.field_N) {
          if (this.field_N.length == 0) {
            return;
          }
          if (null != this.field_i) {
            if (this.field_i.length != 0 &&
              this.field_i.length == this.field_N.length) {
              if (this.field_T != null) {
                if (0 != this.field_T.length &&
                  this.field_T.length == this.field_N.length) {
                  if (null == this.field_t) {
                    return;
                  }
                  if (0 != this.field_t.length &&
                    this.field_t.length == this.field_N.length) {
                    for (var2 = param0; this.field_N.length > var2; var2++) {
                      var3 = this.field_N[var2];
                      var4 = this.field_i[var2];
                      var5 = this.field_T[var2];
                      var10 = this.field_t[var2];
                      if (this.field_r >= 0) {
                        stackIn_27_0 = (this.field_r == var2) ? 1 : 0;
                      } else {
                        stackIn_27_0 = 0;
                      }
                      regionExit1: {
                        var7 = stackIn_27_0;
                        if (var4 != null &&
                          var5 != null) {
                          var11 = this.a(-1, var10, var3);
                          if (var3 != 7) {
                            if (var3 != 27) {
                              if (var2 >= this.field_n &&
                                var2 <= this.field_h) {
                                if (var2 == this.field_n) {
                                  if (this.field_g == null) {
                                    break regionExit1;
                                  }
                                  if (null == this.field_S) {
                                    break regionExit1;
                                  }
                                  if (this.field_r >= 0) {
                                    if (this.field_n <= this.field_r) {
                                      stackIn_60_0 = (this.field_h >= this.field_r) ? 1 : 0;
                                    } else {
                                      stackIn_60_0 = 0;
                                    }
                                  } else {
                                    stackIn_60_0 = 0;
                                  }
                                  var8 = stackIn_60_0;
                                  this.a(this.field_u, this.field_U, this.field_S, ~param0, var8 != 0, this.field_g);
                                }
                                this.a(var2, var7 != 0, var4, 67, var5);
                                break regionExit1;
                              }
                              this.a(-1, var11, var5, -1, var7 != 0, var4);
                            } else {
                              this.a(var7 != 0, var4, var5, 0, var11);
                            }
                          } else {
                            this.a(var4, var11, var7 != 0, var5, 26709);
                          }
                        }
                      }
                    }
                    return;
                  }
                  return;
                }
                return;
              }
              return;
            }
            return;
          }
        }
    }

    final ft b(byte param0) {
        int var3 = 0;
        ft var4;
        ft var5;
        var5 = new ft(-1, -1);
        if (null != this.field_i &&
          this.field_i.length != 0) {
          if (param0 >= -42) {
            return (ft) null;
          }
          for (var3 = 0; var3 < this.field_i.length; var3++) {
            var4 = this.field_i[var3];
            if (var4 != null) {
              if (var4.field_k >= 0 && (!(var4.field_k >= var5.field_k) ||
                !(var5.field_k >= 0))) {
                var5.field_k = var4.field_k;
              }
              if (var4.field_n >= 0 && (!(var5.field_n <= var4.field_n) ||
                !(var5.field_n >= 0))) {
                var5.field_n = var4.field_n;
              }
            }
          }
          if (var5.field_k >= 0 &&
            var5.field_n >= 0) {
            return var5;
          }
          return new ft(1, 1);
        }
        return new ft(1, 1);
    }

    private final String a(int param0, String param1, int param2) {
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_16_1 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            if (param0 != -1) {
              stackIn_8_0 = (String) null;
              return stackIn_8_0;
            }
            if (param2 != 28) {
              if (46 == param2) {
                param1 = param1 + this.field_I;
              } else {
                if (param2 != 33) {
                  if (param2 == 29 &&
                    0 <= this.field_E &&
                    h.field_e.length >= this.field_E) {
                    param1 = param1 + h.field_e[t.field_e];
                  }
                } else {
                  stackIn_15_0 = new StringBuilder().append(param1);
                  if (this.field_v) {
                    stackIn_16_1 = dn.field_Mb;
                  } else {
                    stackIn_16_1 = qd.field_J;
                  }
                  param1 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_16_1).toString();
                }
              }
            } else {
              param1 = param1 + this.field_e;
            }
            stackIn_24_0 = (String) (param1);
            return stackIn_24_0;
          }
          stackIn_5_0 = (String) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("dm.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = 257;
        this.field_c = new ft(319, 239);
        int var7 = 0;
        var2 = this.field_c.field_k - (var6 >> 1);
        var4 = 58;
        this.field_s = new ft(var2, var4);
        this.field_B = new ft(7, 7);
        this.field_q = new ft(-(this.field_B.field_k << 1) + var6, 43);
        var3 = var6 + var2;
        this.field_o = 2;
        this.field_l = 4;
        var7 = -this.field_l + (this.field_q.field_n + this.field_l) * this.field_o + (this.field_B.field_n << 1);
        var5 = var4 + var7;
        this.field_k = new ft(var3, var5);
        this.field_i = new ft[this.field_N.length];
        this.field_T = new ft[this.field_N.length];
        if (param0 != 1) {
          return;
        }
        var2Lifetime1 = this.field_B.field_k + this.field_s.field_k;
        var3Lifetime1 = this.field_q.field_k + var2Lifetime1;
        var4Lifetime1 = this.field_s.field_n + this.field_B.field_n;
        for (var8 = 0; this.field_o > var8; var8++) {
          var5Lifetime1 = this.field_q.field_n + var4Lifetime1;
          this.field_i[var8] = new ft(var2Lifetime1, var4Lifetime1);
          this.field_T[var8] = new ft(var3Lifetime1, var5Lifetime1);
          var4Lifetime1 = this.field_l + var5Lifetime1;
        }
    }

    private final int b(boolean param0) {
        int var2 = 0;
        if (!param0) {
          return 50;
        }
        var2 = 64;
        var2 = var2 + this.e(-24);
        return var2;
    }

    private final void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 122 % ((param1 - 92) / 33);
          var4 = 7;
          var5 = this.b(-1, var4);
          if (null == this.field_t) {
            return;
          }
          if (0 <= var5 &&
            this.field_t.length > var5) {
            if (param0 != null &&
              param0.length() != 0) {
              this.field_t[var5] = param0;
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("dm.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        ft var3;
        if (null != this.field_i &&
          param0 >= 0 &&
          this.field_i.length > param0) {
          var3 = this.field_i[param0];
          if (param1 != 1084326849) {
            return 91;
          }
          if (var3 != null &&
            var3.field_n >= 0) {
            return u.a(var3.field_n, (byte) 94);
          }
          return 1;
        }
        return 1;
    }

    private final void a(ft param0, String param1, boolean param2, ft param3, int param4) {
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var7Lifetime1;
        try {
          if (param0 != null &&
            param3 != null &&
            param1 != null &&
            param1.length() != 0) {
            var6_int = param0.field_k;
            var7 = param0.field_n;
            var8 = param3.field_k - var6_int;
            var9 = -var7 + param3.field_n;
            if (param4 != 26709) {
              this.field_v = true;
            }
            SoftwareRaster.f(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, this.field_M);
            fe.b(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, io.field_m, nd.field_b, this.field_Q, this.field_p);
            var10 = u.a(param0.field_n, (byte) 94);
            var11 = u.a(param3.field_n, (byte) 94);
            var7Lifetime1 = var10 + var11 >> 1;
            var12 = mp.k(-57);
            var7Lifetime1 = var12 + var7Lifetime1;
            if (param2) {
              stackIn_11_0 = TutorialController.field_e;
            } else {
              stackIn_11_0 = nd.field_b;
            }
            var15 = stackIn_11_0;
            var14 = var15;
            var13 = var14;
            fe.c(param1, db.a(true, this.field_c.field_k), var7Lifetime1, var15, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("dm.R(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = AiPlanningStrategy.field_d;
          var2 = ko.field_b;
          stackIn_4_0 = (DeployEvent.field_A != 1) ? 0 : 1;
          var3 = stackIn_4_0;
          stackIn_7_0 = (ro.field_ub != 1) ? 0 : 1;
          var4 = stackIn_7_0;
          ll.field_Rb.a(el.field_d, param0 - 56, var2, var3 != 0, var1_int, var4 != 0);
          while (true) {
            if (!Unit.i((byte) 90)) {
              return;
            }
            if (rs.field_q == 13) {
              CipherPacketBuffer.a(true, 0, 1, jt.field_a);
              if (null != ll.field_Rb.field_k) {
                ll.field_Rb.field_k.framebuffer = null;
                ll.field_Rb.field_k.field_A = null;
              }
              le.field_b = null;
              if (ll.field_Rb.field_k != null) {
                ll.field_Rb.field_k = null;
              }
              ll.field_Rb = null;
            }
            if (rs.field_q == 12) {
              stackIn_20_0 = !(ln.field_e);
              ln.field_e = stackIn_20_0;
            }
            if (rs.field_q != 11) {
              continue;
            }
            if (hi.field_j < 2) {
              continue;
            }
            break;
          }
          stackIn_27_0 = !(jv.field_a);
          jv.field_a = stackIn_27_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "dm.A(" + param0 + ')');
        }
    }

    private final void a(boolean param0, ft param1, ft param2, int param3, String param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var7Lifetime1;
        try {
          if (param1 != null &&
            param2 != null &&
            param4 != null &&
            param4.length() != 0) {
            var6_int = param1.field_k;
            var7 = param1.field_n;
            if (param3 != 0) {
              this.b(true, 61);
            }
            var8 = param2.field_k - var6_int;
            var9 = param2.field_n - var7;
            var10 = nd.field_b;
            if (param0) {
              var10 = TutorialController.field_e;
            }
            fe.a(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, il.field_s, var10, this.field_Q, this.field_b, true);
            fe.b(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, io.field_m, TutorialController.field_e, this.field_Q, this.field_A);
            var11 = param1.field_n;
            var12 = param2.field_n;
            var7Lifetime1 = var11 + var12 >> 1;
            var13 = mp.k(-74);
            var7Lifetime1 = var7Lifetime1 + var13;
            fe.c(param4, db.a(true, this.field_c.field_k), u.a(var7Lifetime1, (byte) 94), this.field_Q, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("dm.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        ft var4;
        int var5;
        ft var6;
        if (param0) {
          return 1;
        }
        if (0 > param1) {
          return 1;
        }
        if (this.field_i != null &&
          param1 < this.field_i.length) {
          if (this.field_T != null &&
            this.field_T.length > param1) {
            var6 = this.field_i[param1];
            var4 = this.field_T[param1];
            if (var6 != null &&
              var6.field_n >= 0) {
              if (var4 == null) {
                return 1;
              }
              if (var4.field_n < 0) {
                return 1;
              }
              var5 = var4.field_n - var6.field_n;
              if (var5 <= 0) {
                return 1;
              }
              return var5;
            }
            return 1;
          }
          return 1;
        }
        return 1;
    }

    private final int b(int param0, int param1) {
        if (null == this.field_j) {
          return -1;
        }
        if (param0 >= ~param1 &&
          param1 < this.field_j.length) {
          return this.field_j[param1];
        }
        return -1;
    }

    final static int a(int param0, int param1, int[] param2, int param3, boolean param4, int[] param5, int param6, boolean param7, int param8, boolean param9, int param10, String param11) {
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var12_int = -1;
          if (param7) {
            var12_int = tt.a(param0 - param10, -param8 + param6, param2, param9);
          }
          var13 = 0;
          if (param9) {
            stackIn_6_0 = -48;
            return stackIn_6_0;
          }
          while (6 > var13) {
            var14 = nd.field_d[var13];
            if (param2[var14] >= bc.field_j[var14].length) {
              param2[var14] = 0;
            }
            if (param2[var14] <= -1) {
              if (var14 == param3) {
                lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, dp.field_Vb[var14][1] + param10, 256);
              } else {
                if (var14 != var12_int) {
                  if (param1 > -1) {
                    lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 128);
                  }
                } else {
                  lt.field_h[var14].f(param8 + dp.field_Vb[var14][0], dp.field_Vb[var14][1] + param10, 128);
                }
              }
            } else {
              if (var14 != param3) {
                if (var12_int == var14) {
                  eo.a(dp.field_Vb[var14][0] + param8, 7829367, (byte) -80, bc.field_j[var14][param2[var14]], param10 + dp.field_Vb[var14][1]);
                }
              } else {
                eo.a(dp.field_Vb[var14][0] + param8, 16777215, (byte) -88, bc.field_j[var14][param2[var14]], dp.field_Vb[var14][1] + param10);
              }
              if (!param4) {
                gq.b(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], SpellAreaEffect.field_q[param5[var14]]);
              } else {
                gq.a(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 1);
              }
              if (var14 == 3 &&
                !param4) {
                var15 = BitmapFont.a(nr.field_e, param11, -10 + uh.field_e[var14][0] << 1);
                fe.c(var15, (uh.field_e[var14][0] >> 1) + dp.field_Vb[var14][0] + param8, 20 + (uh.field_e[var14][1] >> 1) + (dp.field_Vb[var14][1] + param10), 0, true);
              }
            }
            var13++;
          }
          stackIn_31_0 = var12_int;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_34_0 = var12;
          stackIn_34_1 = new StringBuilder().append("dm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final int h(int param0) {
        int var2;
        int var3;
        if (this.field_q == null) {
          return 1;
        }
        var2 = this.field_q.field_n;
        if (var2 >= 0 &&
          0 <= this.field_l) {
          var3 = var2 + this.field_l;
          if (var3 < 0) {
            return 1;
          }
          if (param0 != -10754) {
            this.a(true, -108);
          }
          return var3;
        }
        return 1;
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        int var3Lifetime2;
        if (this.field_N == null) {
          return;
        }
        if (this.field_N.length == 0) {
          return;
        }
        if (param0 != -105) {
          return;
        }
        var2 = 0;
        for (var3 = 0; var3 < this.field_N.length; var3++) {
          if (var2 < this.field_N[var3]) {
            var2 = this.field_N[var3];
          }
        }
        if (var2 <= 0) {
          return;
        }
        this.field_j = new int[1 + var2];
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_j.length; var3Lifetime1++) {
          this.field_j[var3Lifetime1] = -1;
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < this.field_N.length; var3Lifetime2++) {
          var4 = this.field_N[var3Lifetime2];
          if (var4 >= 0 &&
            var4 < this.field_j.length) {
            this.field_j[var4] = var3Lifetime2;
          }
        }
    }

    private final void c(boolean param0) {
        if (null == this.field_j) {
          return;
        }
        if (!param0) {
          this.field_w = (ft) null;
        }
        int var2 = this.b(-1, 7);
        if (var2 < 0) {
          return;
        }
        if (this.field_i != null) {
          if (this.field_T == null) {
            return;
          }
          if (this.field_i.length > var2) {
            if (this.field_T.length <= var2) {
              return;
            }
            this.field_i[var2] = this.field_a;
            this.field_T[var2] = new ft(608, 462);
            return;
          }
        }
    }

    private final void j(int param0) {
        this.field_r = 0;
        if (param0 != -15585) {
          this.field_s = (ft) null;
        }
        this.field_e = 2;
        this.field_E = 0;
        this.field_I = 0;
        this.field_K = 0;
        this.field_v = false;
    }

    public static void g(int param0) {
        field_O = null;
        field_x = null;
        if (param0 != 256) {
          return;
        }
        field_d = null;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3;
        int var5;
        String var4;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_N == null) {
          return;
        }
        if (null == il.field_t) {
          return;
        }
        this.field_t = new String[this.field_N.length];
        for (var2 = 0; var2 < this.field_N.length; var2++) {
          var3 = this.field_N[var2];
          if (var3 >= 0 &&
            il.field_t.length > var3) {
            var4 = il.field_t[var3];
            if (var4 != null) {
              this.field_t[var2] = var4;
            }
          }
        }
        if (0 == il.field_t.length) {
          return;
        }
        if (param0 <= 54) {
          return;
        }
        this.field_U = il.field_t[-1 + il.field_t.length];
    }

    final void i(int param0) {
        this.d(param0 + 6);
        if (param0 != 1) {
          return;
        }
        this.a(param0 + 11);
        this.a(true);
        this.j(-15585);
        this.field_y = false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (wb.field_b != null) {
          if (!(5 < wb.field_b.length)) {
            return;
          }
          this.field_R = wb.field_b[5];
          if (null == this.field_R) {
            return;
          }
          var2 = this.field_J.field_n;
          var3 = this.d(true);
          if (param0 != 18669) {
            this.a(70, true);
          }
          var4 = var3 + var2;
          fe.b(this.field_R, db.a(true, this.field_c.field_k), u.a(var4, (byte) 94));
          fe.c(this.field_R, db.a(true, this.field_c.field_k), u.a(var4, (byte) 94), nd.field_b, false);
          return;
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        int incrementValue$5 = 0;
        this.field_N = new int[11];
        int var2 = 0;
        int incrementValue$0 = var2;
        var2++;
        this.field_N[incrementValue$0] = 25;
        int incrementValue$1 = var2;
        var2++;
        this.field_N[incrementValue$1] = 26;
        int incrementValue$2 = var2;
        var2++;
        this.field_N[incrementValue$2] = 28;
        int incrementValue$3 = var2;
        var2++;
        this.field_N[incrementValue$3] = 46;
        int incrementValue$4 = var2;
        var2++;
        this.field_N[incrementValue$4] = 29;
        this.field_n = var2;
        for (var3 = 0; 4 > var3; var3++) {
          incrementValue$5 = var2;
          var2++;
          this.field_N[incrementValue$5] = 55 + var3;
        }
        this.field_h = var2 - 1;
        if (param0 != 12) {
          String var4 = (String) null;
          this.a(105, (byte) -17, -105, 21, true, -116, -10, (String) null);
        }
        int incrementValue$6 = var2;
        var2++;
        this.field_N[incrementValue$6] = 27;
        int incrementValue$7 = var2;
        var2++;
        this.field_N[incrementValue$7] = 7;
        this.a((byte) -105);
        this.field_F = 15855490;
        this.field_G = 11711413;
    }

    private final int e(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var2 = 1 + (-this.field_n + this.field_h);
        int var4 = -81 % ((26 - param0) / 47);
        int var3 = 0;
        for (var5 = 0; var2 > var5; var5++) {
          var6 = 33;
          var6 = this.field_f + var6;
          var3 = var6 + var3;
        }
        var3 = var3 - this.field_f;
        return var3;
    }

    public dm() {
        this.field_A = 0;
    }

    static {
        field_x = "Toggle Equipment";
        field_O = "Accept draw";
        field_d = "Real-life threats";
    }
}
