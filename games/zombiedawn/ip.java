/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        u var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  break L0;
                } else {
                  L2: {
                    var6 = var4[var5];
                    if (var6.field_b == 0) {
                      var6.field_l = 0;
                      var6.field_h = 24;
                      var6.field_a = var6.field_l + (var1_int << 4);
                      break L2;
                    } else {
                      if (var6.field_b != 1) {
                        if (var6.field_b == 2) {
                          var6.field_l = -pb.a(so.field_a, 19, 1) << 4;
                          var6.field_a = (var3 << 4) + var6.field_l;
                          var6.field_h = 48;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var6.field_l = -pb.a(so.field_a, 12, 1) << 4;
                        var6.field_a = (var2 << 4) + var6.field_l;
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "ip.I(" + param0 + ')');
        }
    }

    private final void a(int[] param0, lf param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fn var11 = null;
        int var12 = 0;
        rj stackIn_12_0 = null;
        lf stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        rj stackIn_13_0 = null;
        lf stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        rj stackIn_14_0 = null;
        lf stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_11_0 = null;
        lf stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        rj stackOut_13_0 = null;
        lf stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        rj stackOut_12_0 = null;
        lf stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (-1 == (((ip) this).field_n.field_l[param1.field_z] & 4)) {
                break L1;
              } else {
                if (-1 <= param1.field_k) {
                  break L1;
                } else {
                  var7_int = ((ip) this).field_n.field_r[param1.field_z] / qf.field_p;
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
                        if (0 != ((ip) this).field_n.field_O[param1.field_z]) {
                          L5: {
                            param1.field_E = fn.a(param1.field_s, var11.m(), 0, var11.g());
                            stackOut_11_0 = ((ip) this).field_n;
                            stackOut_11_1 = (lf) param1;
                            stackOut_11_2 = 124;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            if (param1.field_u.field_j[param1.field_i] >= 0) {
                              stackOut_13_0 = (rj) (Object) stackIn_13_0;
                              stackOut_13_1 = (lf) (Object) stackIn_13_1;
                              stackOut_13_2 = stackIn_13_2;
                              stackOut_13_3 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              stackIn_14_2 = stackOut_13_2;
                              stackIn_14_3 = stackOut_13_3;
                              break L5;
                            } else {
                              stackOut_12_0 = (rj) (Object) stackIn_12_0;
                              stackOut_12_1 = (lf) (Object) stackIn_12_1;
                              stackOut_12_2 = stackIn_12_2;
                              stackOut_12_3 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              stackIn_14_3 = stackOut_12_3;
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
                        ((ip) this).field_m.b((sp) (Object) var11);
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
            param1.field_E.a(param0, param2, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("ip.G(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + 0 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final sp d() {
        lf var1 = null;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        L0: while (true) {
          var1 = (lf) (Object) ((ip) this).field_s.a(false);
          if (var1 != null) {
            if (null != var1.field_E) {
              return (sp) (Object) var1.field_E;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static ek a(int param0, int param1, int param2, boolean param3) {
        ek var4 = (ek) (Object) td.field_c.f(32);
        if (var4 == null) {
            var4 = new ek();
        }
        var4.a(param1, param0, 100, 2011722288);
        return var4;
    }

    private final void a(lf param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rj stackIn_8_0 = null;
        lf stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        rj stackIn_9_0 = null;
        lf stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        rj stackIn_10_0 = null;
        lf stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_7_0 = null;
        lf stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        rj stackOut_9_0 = null;
        lf stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        rj stackOut_8_0 = null;
        lf stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if ((4 & ((ip) this).field_n.field_l[param0.field_z]) == 0) {
                break L1;
              } else {
                if (param0.field_k >= 0) {
                  break L1;
                } else {
                  var4_int = ((ip) this).field_n.field_r[param0.field_z] / qf.field_p;
                  var5 = (var4_int + 1048575 - param0.field_D) / var4_int;
                  param0.field_D = 1048575 & param1 * var4_int + param0.field_D;
                  if (var5 <= param1) {
                    L2: {
                      if (((ip) this).field_n.field_O[param0.field_z] == 0) {
                        param0.field_E = fn.a(param0.field_s, param0.field_E.m(), param0.field_E.k(), param0.field_E.g());
                        break L2;
                      } else {
                        L3: {
                          param0.field_E = fn.a(param0.field_s, param0.field_E.m(), 0, param0.field_E.g());
                          stackOut_7_0 = ((ip) this).field_n;
                          stackOut_7_1 = (lf) param0;
                          stackOut_7_2 = -125;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          if (param0.field_u.field_j[param0.field_i] >= 0) {
                            stackOut_9_0 = (rj) (Object) stackIn_9_0;
                            stackOut_9_1 = (lf) (Object) stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            stackIn_10_3 = stackOut_9_3;
                            break L3;
                          } else {
                            stackOut_8_0 = (rj) (Object) stackIn_8_0;
                            stackOut_8_1 = (lf) (Object) stackIn_8_1;
                            stackOut_8_2 = stackIn_8_2;
                            stackOut_8_3 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            stackIn_10_3 = stackOut_8_3;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ip.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + -26206 + ')');
        }
    }

    final sp c() {
        lf var1 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_E)) {
            return (sp) (Object) var1.field_E;
        }
        return ((ip) this).d();
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        String stackOut_27_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              L1: {
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = fm.a(param2, -127);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
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
                                    if (var5 > 0) {
                                      stackOut_32_0 = dn.field_G;
                                      stackIn_33_0 = stackOut_32_0;
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
                                    if (2 > var5) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_27_0 = hl.field_f;
                                      stackIn_28_0 = stackOut_27_0;
                                      return stackIn_28_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_19_0 = dn.field_G;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      }
                    }
                    stackOut_14_0 = pg.field_r;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
              stackOut_9_0 = pg.field_r;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              stackOut_2_0 = pg.field_r;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("ip.K(").append(1048576).append(',').append(false).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        lf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            ((ip) this).field_m.a(param0, param1, param2);
            var6 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((ip) this).field_n.b(30296, var6)) {
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
                        if (((ip) this).field_n.a(-32464, var4_int, var6, param0, var5)) {
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
                var6 = (lf) (Object) ((ip) this).field_s.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ip.J(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param0) != 0) {
            var2 = -(7 & param0) + 8;
        }
        int var3 = param0 - -var2;
        return var3;
    }

    public static void c(byte param0) {
        field_l = null;
        field_r = null;
        field_q = null;
        field_p = null;
        field_o = null;
    }

    final void a(int param0) {
        int var2 = 0;
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        ((ip) this).field_m.a(param0);
        var3 = (lf) (Object) ((ip) this).field_s.b((byte) 26);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ip) this).field_n.b(30296, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_r >= var2) {
                    int discarded$26 = -26206;
                    this.a(var3, var2);
                    var3.field_r = var3.field_r - var2;
                    break L1;
                  } else {
                    int discarded$27 = -26206;
                    this.a(var3, var3.field_r);
                    var2 = var2 - var3.field_r;
                    if (!((ip) this).field_n.a(-32464, 0, var3, (int[]) null, var2)) {
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
            var3 = (lf) (Object) ((ip) this).field_s.a(false);
            continue L0;
          }
        }
    }

    final int a() {
        return 0;
    }

    ip(rj param0) {
        ((ip) this).field_s = new vo();
        ((ip) this).field_m = new fi();
        try {
            ((ip) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_o = "(Click to close)";
    }
}
