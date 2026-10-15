/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends no {
    int field_y;
    static boolean field_v;
    static String field_x;
    static volatile int field_w;

    ge(ge param0, int param1) {
        this(param0.field_j, param0.field_m, param0.field_i, param1);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(gp.field_c);
          param1.removeFocusListener(gp.field_c);
          if (param0 != -2846) {
            ge.c(91);
          }
          pl.field_d = -1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ge.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ge(int param0, int param1, int param2, int param3) {
        super(param0, param1, 0, 1024, 2048, param2);
        this.field_y = param3;
    }

    public static void c(int param0) {
        field_x = null;
        if (param0 != 6) {
          ge.c(-60);
        }
    }

    ge(int param0, int param1, int param2) {
        this(param0, param1, param2, 0);
    }

    final static pb a(int param0, int param1, int param2) {
        if (param2 != -20777) {
          java.awt.Component var4 = (java.awt.Component) null;
          ge.a(58, (java.awt.Component) null);
        }
        return so.a(param2 ^ -20777, param1, param0, ip.field_s);
    }

    final boolean b(boolean param0) {
        if (param0) {
          StringBuilder var3 = (StringBuilder) null;
          this.a(61, (StringBuilder) null);
        }
        return ck.field_m[this.field_i];
    }

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 79) {
            stackIn_4_0 = 139 * this.field_y + 131 << 5 ^ super.a(121, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -19;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(j param0, byte param1) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        vn var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        vn var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        vn var12 = null;
        vn var13 = null;
        int var7Lifetime1;
        var3 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0.field_Z == 3) {
            return;
          }
          if (this.field_i != 3) {
            if (4 == this.field_i) {
              var3_ref = (vn) (param0.field_K.d(-75));
              while (var3_ref != null) {
                var3_ref.a((byte) 40, 150);
                var3_ref = (vn) (param0.field_K.a((byte) 116));
              }
              var3_ref = (vn) (param0.field_gb.d(-9));
              while (var3_ref != null) {
                var3_ref.a((byte) 40, 150);
                var3_ref = (vn) (param0.field_gb.a((byte) 116));
              }
            } else {
              if (5 != this.field_i) {
                if (6 != this.field_i) {
                  if (this.field_i == 7) {
                    param0.field_yb.e((byte) 127);
                  } else {
                    if (this.field_i == 8) {
                      param0.field_yb.b(true);
                    } else {
                      if (this.field_i == 9) {
                        if (!param0.field_gb.a(false)) {
                          var12 = (vn) (param0.field_gb.d(-63));
                          var3_ref = var12;
                          var4 = (31457280 - (var12.field_m << 8)) / var12.field_o;
                          var5 = (vn) (param0.field_gb.d(-8));
                          while (var5 != null) {
                            var5.field_C = 0;
                            var5.field_v = 0;
                            var6 = (31457280 - (var5.field_m << 8)) / var5.field_o;
                            if (var4 <= var6) {
                              if (var6 > var4) {
                                var3_ref.b((byte) 111);
                                var4 = var6;
                                var3_ref = var5;
                              }
                            } else {
                              var5.b((byte) 111);
                            }
                            var5 = (vn) (param0.field_gb.a((byte) 116));
                          }
                        }
                        if (!param0.field_K.a(false)) {
                          if (!param0.field_gb.a(false)) {
                            param0.field_K.c((byte) -62);
                          } else {
                            var3_ref = (vn) (param0.field_K.d(param1 - 108));
                            var3_ref.field_C = 0;
                            var3_ref.field_v = 0;
                            param0.field_K.c((byte) -63);
                            param0.field_K.a(var3_ref, (byte) 3);
                          }
                        }
                        while (param0.field_yb.field_F > 8) {
                          param0.field_yb.e((byte) 126);
                        }
                        param0.field_yb.field_H = 0;
                        param0.field_yb.field_z = 0;
                      } else {
                        if (10 == this.field_i) {
                          if (param0.field_gb.e(118) == 1) {
                            var11 = (vn) (param0.field_gb.d(param1 - 161));
                            var4 = kj.a(var11.field_o * var11.field_o + var11.field_k * var11.field_k, param1 ^ 97) >> 8;
                            var5_int = var11.field_k;
                            var6 = var11.field_o;
                            for (var7 = 0; 7 > var7; var7++) {
                              param0.field_gb.a(new vn(var11.field_j, var11.field_m, 0, 0), (byte) 3);
                            }
                            var7Lifetime1 = 0;
                            var8 = (vn) (param0.field_gb.d(-39));
                            while (var8 != null) {
                              var8.field_k = (15 * BrickABrac.c(param1 + 1949, 1024 * var7Lifetime1) >> 8) + var5_int;
                              var8.field_o = var6 + (15 * sa.a(var7Lifetime1 * 1024, -4097) >> 8);
                              var9 = kj.a(var8.field_o * var8.field_o + var8.field_k * var8.field_k, 2) >> 8;
                              var8.field_k = var4 * var8.field_k / var9;
                              var8.field_o = var4 * var8.field_o / var9;
                              var7Lifetime1++;
                              var8 = (vn) (param0.field_gb.a((byte) 116));
                            }
                          }
                        } else {
                          if (this.field_i == 11) {
                            var3_ref = (vn) (param0.field_gb.d(-54));
                            while (var3_ref != null) {
                              var3_ref.c(512, 128);
                              var3_ref = (vn) (param0.field_gb.a((byte) 116));
                            }
                          } else {
                            if (this.field_i == 12) {
                              param0.field_yb.field_H = param0.field_yb.field_H + 300;
                            } else {
                              if (this.field_i == 13) {
                                var13 = (vn) (param0.field_gb.d(param1 - 224));
                                while (var13 != null) {
                                  var13.c(512, -128);
                                  var13 = (vn) (param0.field_gb.a((byte) 116));
                                }
                              } else {
                                if (this.field_i != 14) {
                                  if (this.field_i == 15) {
                                    var3_ref = (vn) (param0.field_K.d(-30));
                                    while (var3_ref != null) {
                                      var3_ref.b(param1 - 150, 150);
                                      var3_ref = (vn) (param0.field_K.a((byte) 116));
                                    }
                                    var3_ref = (vn) (param0.field_gb.d(-88));
                                    while (var3_ref != null) {
                                      var3_ref.b(-128, 150);
                                      var3_ref = (vn) (param0.field_gb.a((byte) 116));
                                    }
                                  } else {
                                    if (16 == this.field_i) {
                                      param0.field_n = param0.field_n + 16;
                                    } else {
                                      if (17 != this.field_i) {
                                        if (18 == this.field_i) {
                                          var3_ref = (vn) (param0.field_gb.d(-73));
                                          while (var3_ref != null) {
                                            var3_ref.field_C = var3_ref.field_C + 40;
                                            var3_ref = (vn) (param0.field_gb.a((byte) 116));
                                          }
                                        }
                                      } else {
                                        param0.field_yb.d(82);
                                      }
                                    }
                                  }
                                } else {
                                  param0.field_yb.field_z = param0.field_yb.field_z + 150;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (param0.field_C.a(false)) {
                    param0.field_k = 0;
                    param0.field_R = param0.e(param1 + 22);
                    param0.f(1000);
                  }
                }
              } else {
                param0.field_rb = param0.field_rb + 1;
              }
            }
          } else {
            param0.field_yb.field_w = param0.field_yb.field_w + 250;
          }
          if (param1 != 99) {
            ge.c(-104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_80_0 = var3_ref2;
          stackIn_80_1 = new StringBuilder().append("ge.C(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(')').toString());
        }
    }

    ge() {
        this(0, 0, 0, 0);
    }

    static {
        field_x = "If you do nothing the game will revert to normal view in <%0> second.";
        field_w = 0;
        field_v = false;
    }
}
