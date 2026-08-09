/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends ul {
    private int field_U;
    private int field_Q;
    static bd field_W;
    static int field_S;
    static boolean field_Z;
    private int field_Y;
    static int field_R;
    private int field_T;
    private int field_V;
    private int field_X;

    void m(int param0) {
        if (param0 >= 0) {
            return;
        }
        if (-1 <= (this.field_U ^ -1)) {
            return;
        }
        this.a(this.field_Q, 15767, this.field_Y);
        this.field_U = 0;
        this.o(20);
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 65393) {
            return false;
        }
        if (-1 <= (this.field_U ^ -1)) {
        } else {
            var2 = this.field_Q;
            var3 = this.field_Y;
            fieldTemp$0 = this.field_T + 1;
            this.field_T = this.field_T + 1;
            if (this.field_U > fieldTemp$0) {
                var4 = (-this.field_T + 2 * this.field_U) * this.field_T;
                var5 = this.field_U * this.field_U;
                var3 = this.field_X + var4 * (-this.field_X + this.field_Y) / var5;
                var2 = this.field_V - -(var4 * (-this.field_V + this.field_Q) / var5);
            } else {
                this.field_U = 0;
                this.o(param0 + -65373);
            }
            this.a(var2, 15767, var3);
        }
        return super.l(65393);
    }

    void b(int param0, int param1, int param2) {
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
        int var15;
        int var16;
        var16 = HostileSpawn.field_I ? 1 : 0;
        si.c(6 + param2, param0 + 35, -12 + this.field_s, -40 + this.field_x, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (param1 == -238948511) {
          var7 = 0;
          var8 = param0;
          L0: while (true) {
            if (var7 >= var4) {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              var8 = 35 + param0;
              L1: while (true) {
                if (var7 >= var4) {
                  sf.field_ab.e(-90 + (this.field_s + param2), 10 + param0);
                  tg.a(110, bh.field_a, -10 + this.field_s, 35 + param0, param2 + 5);
                  tg.a(108, g.field_G, this.field_s, param0 - -this.field_x - 22, param2);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + this.field_x;
                  var7 = 0;
                  var8 = param0 + 57;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = (var6 - var5) * var7 / var4 + var5;
                      var9 = var9 | (var9 << 85717768 | var9 << 1580487984);
                      si.a(param2, var8, 6, var9);
                      si.a(-6 + this.field_s + param2, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << -1887167504 | var9 << -2129196120);
                  si.a(param2, var8, 6, var9);
                  si.a(this.field_s + (param2 - 6), var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= si.field_j) {
                if (var8 < si.field_a) {
                  L3: {
                    L4: {
                      L5: {
                        var9 = var5 - -(var7 * (-var5 + var6) / var4);
                        var10 = 0;
                        var11 = this.field_s;
                        if (var7 > 20) {
                          break L5;
                        } else {
                          L6: while (true) {
                            if (-21 > (var10 ^ -1)) {
                              break L5;
                            } else {
                              var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 + -var7);
                              if (var12 <= 462) {
                                if (420 <= var12) {
                                  var13 = (462 - var12) * var9 / 42;
                                  var13 = var13 | (var13 << -71613464 | var13 << -158903376);
                                  si.field_i[var10 + si.field_e * var8 - -param2] = var13;
                                  var10++;
                                  continue L6;
                                } else {
                                  if (-21 <= (var7 ^ -1)) {
                                    var12 = var11;
                                    var11 -= 21;
                                    var13 = 0;
                                    L7: while (true) {
                                      if ((var13 ^ -1) < -21) {
                                        break L4;
                                      } else {
                                        var14 = var13 * var13 + (20 + -var7) * (20 - var7);
                                        if (462 >= var14) {
                                          if ((var14 ^ -1) <= -421) {
                                            var15 = (-var14 + 462) * var9 / 42;
                                            var15 = var15 | (var15 << 177358920 | var15 << -2037525232);
                                            si.field_i[var8 * si.field_e + (param2 + var11)] = var15;
                                            var13++;
                                            var11++;
                                            continue L7;
                                          } else {
                                            var12 = var11 - -1;
                                            var13++;
                                            var11++;
                                            continue L7;
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              } else {
                                var10++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                      if (-21 <= (var7 ^ -1)) {
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        L8: while (true) {
                          if ((var13 ^ -1) < -21) {
                            break L4;
                          } else {
                            var14 = var13 * var13 + (20 + -var7) * (20 - var7);
                            if (462 >= var14) {
                              if ((var14 ^ -1) <= -421) {
                                var15 = (-var14 + 462) * var9 / 42;
                                var15 = var15 | (var15 << 177358920 | var15 << -2037525232);
                                si.field_i[var8 * si.field_e + (param2 + var11)] = var15;
                                var13++;
                                var11++;
                                continue L8;
                              } else {
                                var12 = var11 - -1;
                                var13++;
                                var11++;
                                continue L8;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var11 = var12;
                    break L3;
                  }
                  var9 = var9 | (var9 << -423765296 | var9 << -793447768);
                  si.a(var10 + param2, var8, -var10 + var11, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(-1 > (param0 ^ -1))) {
            this.a(param1, 15767, param3);
            return;
        }
        this.field_Q = param1;
        this.field_V = this.field_s;
        this.field_Y = param3;
        this.field_T = 0;
        this.field_X = this.field_x;
        int var5 = -90 / ((param2 - 0) / 63);
        this.field_U = param0;
    }

    public static void n(int param0) {
        if (param0 != 420) {
            return;
        }
        field_W = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        if (param2) {
            wb.a(true, false, true, false);
        }
        int var4 = 0;
        if (param3) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param1) {
            var4++;
        }
        return ti.field_a[var4];
    }

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                wb.n(119);
                break L1;
              }
            }
            if (!param1) {
              stackIn_6_0 = lj.field_u.a(param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = na.field_c.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wb.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    boolean j(int param0) {
        if (param0 != -15953) {
            return false;
        }
        this.m(param0 + 15877);
        return super.j(-15953);
    }

    wb(gg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_U = 0;
        this.field_T = 0;
    }

    void o(int param0) {
        if (param0 != 20) {
            this.o(0);
        }
    }

    static {
        field_Z = false;
        field_R = 0;
    }
}
