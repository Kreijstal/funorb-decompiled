/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ip extends sp {
    private rj field_n;
    vo field_s;
    static String field_o;
    static int[] field_r;
    static de field_l;
    fi field_m;
    static boolean[] field_q;
    static vn[] field_p;

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        u var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var1_int = 120;
            if (param0 <= -1) {
              var2 = 180;
              var3 = 240;
              var4 = ij.field_L;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var6 = var4[var5];
                    if (var6.field_b == 0) {
                      var6.field_l = 0;
                      var6.field_h = 24;
                      var6.field_a = var6.field_l + (var1_int << 74272292);
                      break L2;
                    } else {
                      if ((var6.field_b ^ -1) != -2) {
                        if (-3 == (var6.field_b ^ -1)) {
                          var6.field_l = -pb.a(so.field_a, 19, 1) << -1940293308;
                          var6.field_a = (var3 << -1405261916) + var6.field_l;
                          var6.field_h = 48;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var6.field_l = -pb.a(so.field_a, 12, 1) << 1227225284;
                        var6.field_a = (var2 << -1054615292) + var6.field_l;
                        var6.field_h = 36;
                        break L2;
                      }
                    }
                  }
                  var6.field_k = false;
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ip.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int[] param0, lf param1, int param2, byte param3, int param4, int param5) {
        rj stackIn_13_0 = null;
        lf stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        rj stackIn_14_0;
        lf stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fn var11 = null;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_n.field_l[param1.field_z] & 4 ^ -1)) {
                break L1;
              } else {
                if (-1 >= (param1.field_k ^ -1)) {
                  break L1;
                } else {
                  var7_int = this.field_n.field_r[param1.field_z] / qf.field_p;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 + -param1.field_D) / var7_int;
                    if (var8 <= param4) {
                      L3: {
                        param1.field_E.a(param0, param2, var8);
                        param4 = param4 - var8;
                        param1.field_D = param1.field_D + (var7_int * var8 - 1048576);
                        param2 = param2 + var8;
                        var9 = qf.field_p / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param1.field_E;
                        if (0 != this.field_n.field_O[param1.field_z]) {
                          L5: {
                            param1.field_E = fn.a(param1.field_s, var11.m(), 0, var11.g());
                            stackIn_13_0 = this.field_n;

                            stackIn_13_1 = (lf) (param1);

                            stackIn_13_2 = 124;

                            if (param1.field_u.field_j[param1.field_i] >= 0) {
                              stackIn_14_0 = (rj) ((Object) stackIn_13_0);
                              stackIn_14_1 = (lf) ((Object) stackIn_13_1);
                              stackIn_14_2 = stackIn_13_2;
                              stackIn_14_3 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = (rj) ((Object) stackIn_13_0);
                              stackIn_14_1 = (lf) ((Object) stackIn_13_1);
                              stackIn_14_2 = stackIn_13_2;
                              stackIn_14_3 = 1;
                              break L5;
                            }
                          }
                          ((rj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0);
                          param1.field_E.b(var9, var11.k());
                          break L4;
                        } else {
                          param1.field_E = fn.a(param1.field_s, var11.m(), var11.k(), var11.g());
                          break L4;
                        }
                      }
                      L6: {
                        if (param1.field_u.field_j[param1.field_i] < 0) {
                          param1.field_E.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param0, param2, param5 + -param2);
                      if (!var11.f()) {
                        continue L2;
                      } else {
                        this.field_m.b(var11);
                        continue L2;
                      }
                    } else {
                      param1.field_D = param1.field_D + var7_int * param4;
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param3 == 0) {
                break L7;
              } else {
                this.a();
                break L7;
              }
            }
            param1.field_E.a(param0, param2, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("ip.G(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final sp d() {
        lf var1;
        int var2;
        var2 = ZombieDawn.field_J;
        L0: while (true) {
          var1 = (lf) ((Object) this.field_s.a(false));
          if (var1 != null) {
            if (null != var1.field_E) {
              return (sp) ((Object) var1.field_E);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static ek a(int param0, int param1, int param2, boolean param3) {
        ek var4 = (ek) ((Object) td.field_c.f(32));
        if (!param3) {
            return (ek) null;
        }
        if (var4 == null) {
            var4 = new ek();
        }
        var4.a(param1, param0, param2, 2011722288);
        return var4;
    }

    private final void a(lf param0, int param1, int param2) {
        rj stackIn_9_0 = null;
        lf stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        rj stackIn_10_0;
        lf stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            if (param2 == -26206) {
              L1: {
                if ((4 & this.field_n.field_l[param0.field_z]) == 0) {
                  break L1;
                } else {
                  if (param0.field_k >= 0) {
                    break L1;
                  } else {
                    var4_int = this.field_n.field_r[param0.field_z] / qf.field_p;
                    var5 = (var4_int + 1048575 - param0.field_D) / var4_int;
                    param0.field_D = 1048575 & param1 * var4_int + param0.field_D;
                    if (var5 <= param1) {
                      L2: {
                        if (this.field_n.field_O[param0.field_z] == 0) {
                          param0.field_E = fn.a(param0.field_s, param0.field_E.m(), param0.field_E.k(), param0.field_E.g());
                          break L2;
                        } else {
                          L3: {
                            param0.field_E = fn.a(param0.field_s, param0.field_E.m(), 0, param0.field_E.g());
                            stackIn_9_0 = this.field_n;

                            stackIn_9_1 = (lf) (param0);

                            stackIn_9_2 = param2 ^ 26145;

                            if (-1 >= (param0.field_u.field_j[param0.field_i] ^ -1)) {
                              stackIn_10_0 = (rj) ((Object) stackIn_9_0);
                              stackIn_10_1 = (lf) ((Object) stackIn_9_1);
                              stackIn_10_2 = stackIn_9_2;
                              stackIn_10_3 = 0;
                              break L3;
                            } else {
                              stackIn_10_0 = (rj) ((Object) stackIn_9_0);
                              stackIn_10_1 = (lf) ((Object) stackIn_9_1);
                              stackIn_10_2 = stackIn_9_2;
                              stackIn_10_3 = 1;
                              break L3;
                            }
                          }
                          ((rj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                          break L2;
                        }
                      }
                      L4: {
                        if (param0.field_u.field_j[param0.field_i] < 0) {
                          param0.field_E.e(-1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param1 = param0.field_D / var4_int;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              param0.field_E.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ip.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final sp c() {
        lf var1 = (lf) ((Object) this.field_s.b((byte) 26));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_E)) {
            return (sp) ((Object) var1.field_E);
        }
        return this.d();
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (param0 == 1048576) {
                L1: {
                  if (1 > var3_int) {
                    break L1;
                  } else {
                    if (-13 > (var3_int ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        var4 = fm.a(param2, -127);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if ((var4.length() ^ -1) > -2) {
                            break L2;
                          } else {
                            L3: {
                              if (vi.a(31153, var4.charAt(0))) {
                                break L3;
                              } else {
                                if (!vi.a(31153, var4.charAt(-1 + var4.length()))) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param2.length() <= var6) {
                                      if (-1 > (var5 ^ -1)) {
                                        stackIn_36_0 = dn.field_G;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param2.charAt(var6);
                                        if (vi.a(31153, (char) var7)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (!param1) {
                                            stackIn_31_0 = hl.field_f;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackIn_21_0 = dn.field_G;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      stackIn_16_0 = pg.field_r;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_11_0 = pg.field_r;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = pg.field_r;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("ip.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        lf var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            this.field_m.a(param0, param1, param2);
            var6 = (lf) ((Object) this.field_s.b((byte) 26));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_n.b(30296, var6);
                L2: {
                  if (!stackIn_4_0) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var6.field_r >= var5) {
                        this.a(param0, var6, var4_int, (byte) 0, var5, var4_int + var5);
                        var6.field_r = var6.field_r - var5;
                        break L2;
                      } else {
                        this.a(param0, var6, var4_int, (byte) 0, var6.field_r, var5 + var4_int);
                        var5 = var5 - var6.field_r;
                        var4_int = var4_int + var6.field_r;
                        if (this.field_n.a(-32464, var4_int, var6, param0, var5)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (lf) ((Object) this.field_s.a(false));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ip.J(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 != -1) {
            field_l = (de) null;
        }
        if ((7 & param0) != 0) {
            var2 = -(7 & param0) + 8;
        }
        int var3 = param0 - -var2;
        return var3;
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 != 10) {
            return;
        }
        field_r = null;
        field_q = null;
        field_p = null;
        field_o = null;
    }

    final void a(int param0) {
        int var2;
        lf var3;
        int var4;
        var4 = ZombieDawn.field_J;
        this.field_m.a(param0);
        var3 = (lf) ((Object) this.field_s.b((byte) 26));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!this.field_n.b(30296, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_r >= var2) {
                    this.a(var3, var2, -26206);
                    var3.field_r = var3.field_r - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_r, -26206);
                    var2 = var2 - var3.field_r;
                    if (!this.field_n.a(-32464, 0, var3, (int[]) null, var2)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (lf) ((Object) this.field_s.a(false));
            continue L0;
          }
        }
    }

    final int a() {
        return 0;
    }

    ip(rj param0) {
        this.field_s = new vo();
        this.field_m = new fi();
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new int[8192];
        field_o = "(Click to close)";
    }
}
