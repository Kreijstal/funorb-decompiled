/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends nm {
    static wg field_q;
    static Calendar field_u;
    static int field_v;
    jc field_x;
    static String[] field_t;
    static String field_n;
    private vl field_w;
    lb field_p;
    static String field_o;
    static int field_r;
    static int[] field_s;

    private final void a(int param0, int param1, qd param2) {
        vl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qd stackIn_7_2 = null;
        vl stackIn_8_0;
        int stackIn_8_1;
        qd stackIn_8_2;
        int stackIn_8_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if ((this.field_w.field_Q[param2.field_n] & 4) == 0) {
                break L1;
              } else {
                if (-1 >= (param2.field_J ^ -1)) {
                  break L1;
                } else {
                  var4_int = this.field_w.field_E[param2.field_n] / md.field_l;
                  var5 = (var4_int + (1048575 - param2.field_x)) / var4_int;
                  param2.field_x = param1 * var4_int + param2.field_x & 1048575;
                  if (param1 >= var5) {
                    L2: {
                      if (0 == this.field_w.field_r[param2.field_n]) {
                        param2.field_j = na.a(param2.field_H, param2.field_j.k(), param2.field_j.j(), param2.field_j.l());
                        break L2;
                      } else {
                        L3: {
                          param2.field_j = na.a(param2.field_H, param2.field_j.k(), 0, param2.field_j.l());
                          stackIn_7_0 = this.field_w;

                          stackIn_7_1 = -76;

                          stackIn_7_2 = (qd) (param2);

                          if ((param2.field_q.field_p[param2.field_C] ^ -1) <= -1) {
                            stackIn_8_0 = (vl) ((Object) stackIn_7_0);
                            stackIn_8_1 = stackIn_7_1;
                            stackIn_8_2 = (qd) ((Object) stackIn_7_2);
                            stackIn_8_3 = 0;
                            break L3;
                          } else {
                            stackIn_8_0 = (vl) ((Object) stackIn_7_0);
                            stackIn_8_1 = stackIn_7_1;
                            stackIn_8_2 = (qd) ((Object) stackIn_7_2);
                            stackIn_8_3 = 1;
                            break L3;
                          }
                        }
                        ((vl) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param2.field_q.field_p[param2.field_C]) {
                        param2.field_j.f(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param2.field_x / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param2.field_j.a(param1);
            if (param0 > 23) {
              break L0;
            } else {
              field_v = -9;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("mi.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    private final void a(qd param0, int param1, int param2, int param3, int param4, int[] param5) {
        vl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        qd stackIn_13_2 = null;
        vl stackIn_14_0;
        int stackIn_14_1;
        qd stackIn_14_2;
        int stackIn_14_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        na var11 = null;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              if ((this.field_w.field_Q[param0.field_n] & 4) == 0) {
                break L1;
              } else {
                if (-1 < (param0.field_J ^ -1)) {
                  var7_int = this.field_w.field_E[param0.field_n] / md.field_l;
                  L2: while (true) {
                    var8 = (-param0.field_x + (var7_int + 1048575)) / var7_int;
                    if (var8 > param3) {
                      param0.field_x = param0.field_x + var7_int * param3;
                      break L1;
                    } else {
                      L3: {
                        param0.field_j.a(param5, param2, var8);
                        param2 = param2 + var8;
                        param3 = param3 - var8;
                        param0.field_x = param0.field_x + (-1048576 + var8 * var7_int);
                        var9 = md.field_l / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_j;
                        if (this.field_w.field_r[param0.field_n] == 0) {
                          param0.field_j = na.a(param0.field_H, var11.k(), var11.j(), var11.l());
                          break L4;
                        } else {
                          L5: {
                            param0.field_j = na.a(param0.field_H, var11.k(), 0, var11.l());
                            stackIn_13_0 = this.field_w;

                            stackIn_13_1 = -71;

                            stackIn_13_2 = (qd) (param0);

                            if (0 <= param0.field_q.field_p[param0.field_C]) {
                              stackIn_14_0 = (vl) ((Object) stackIn_13_0);
                              stackIn_14_1 = stackIn_13_1;
                              stackIn_14_2 = (qd) ((Object) stackIn_13_2);
                              stackIn_14_3 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = (vl) ((Object) stackIn_13_0);
                              stackIn_14_1 = stackIn_13_1;
                              stackIn_14_2 = (qd) ((Object) stackIn_13_2);
                              stackIn_14_3 = 1;
                              break L5;
                            }
                          }
                          ((vl) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0);
                          param0.field_j.b(var9, var11.j());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_q.field_p[param0.field_C]) {
                          param0.field_j.f(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.d(var9);
                      var11.a(param5, param2, -param2 + param1);
                      if (!var11.g()) {
                        continue L2;
                      } else {
                        this.field_p.a(var11);
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if (param4 == -2771) {
                break L7;
              } else {
                this.field_p = (lb) null;
                break L7;
              }
            }
            param0.field_j.a(param5, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("mi.D(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qd var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          L0: {
            this.field_p.a(param0, param1, param2);
            var6 = (qd) ((Object) this.field_x.g(-18110));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_w.a((byte) -25, var6);
                L2: {
                  if (stackIn_4_0) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_B) {
                        this.a(var6, var4_int + var5, var4_int, var5, -2771, param0);
                        var6.field_B = var6.field_B - var5;
                        break L2;
                      } else {
                        this.a(var6, var4_int + var5, var4_int, var6.field_B, -2771, param0);
                        var4_int = var4_int + var6.field_B;
                        var5 = var5 - var6.field_B;
                        if (this.field_w.a(35, var5, param0, var4_int, var6)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (qd) ((Object) this.field_x.a((byte) -112));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("mi.A(");

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
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static r a(int param0, long param1) {
        if (param0 != 134217727) {
            field_o = (String) null;
            return (r) ((Object) cm.field_v.a(param1, 3000));
        }
        return (r) ((Object) cm.field_v.a(param1, 3000));
    }

    final static void a(byte param0, boolean param1) {
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        int stackIn_5_7;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        boolean stackIn_6_4 = false;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_9_9;
        int stackIn_9_10;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        boolean stackIn_11_4 = false;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_11_11 = 0;
        int stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        boolean stackIn_21_4;
        int stackIn_21_5;
        int stackIn_21_6;
        int stackIn_21_7;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        boolean stackIn_22_4 = false;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        int stackIn_22_8 = 0;
        int stackIn_25_9;
        int stackIn_25_10;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        boolean stackIn_27_4 = false;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        int stackIn_27_9 = 0;
        int stackIn_27_10 = 0;
        int stackIn_27_11 = 0;
        int stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        boolean stackIn_36_4;
        int stackIn_36_5;
        int stackIn_36_6;
        int stackIn_36_7;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        boolean stackIn_37_4 = false;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        int stackIn_37_8 = 0;
        int stackIn_40_9;
        int stackIn_40_10;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        boolean stackIn_42_4 = false;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        int stackIn_42_8 = 0;
        int stackIn_42_9 = 0;
        int stackIn_42_10 = 0;
        int stackIn_42_11 = 0;
        int var2;
        L0: {
          nc.i(20579);
          if (param0 == -78) {
            break L0;
          } else {
            mi.a((byte) 66, true);
            break L0;
          }
        }
        if (pd.field_Rb != null) {
          if (g.a(param0 + 77, pd.field_Rb.field_Xb)) {
            L1: {
              var2 = 1;
              stackIn_36_0 = param0 + -46;

              stackIn_36_1 = 15;

              stackIn_36_2 = 14;

              stackIn_36_3 = 11;

              stackIn_36_4 = param1;

              stackIn_36_5 = fl.field_p;

              stackIn_36_6 = 13;

              stackIn_36_7 = 0;

              if (50 >= fl.field_n) {
                stackIn_37_0 = stackIn_36_0;
                stackIn_37_1 = stackIn_36_1;
                stackIn_37_2 = stackIn_36_2;
                stackIn_37_3 = stackIn_36_3;
                stackIn_37_4 = stackIn_36_4;
                stackIn_37_5 = stackIn_36_5;
                stackIn_37_6 = stackIn_36_6;
                stackIn_37_7 = stackIn_36_7;
                stackIn_37_8 = 0;
                break L1;
              } else {
                stackIn_37_0 = stackIn_36_0;
                stackIn_37_1 = stackIn_36_1;
                stackIn_37_2 = stackIn_36_2;
                stackIn_37_3 = stackIn_36_3;
                stackIn_37_4 = stackIn_36_4;
                stackIn_37_5 = stackIn_36_5;
                stackIn_37_6 = stackIn_36_6;
                stackIn_37_7 = stackIn_36_7;
                stackIn_37_8 = 1;
                break L1;
              }
            }
            L2: {
              L3: {

                stackIn_40_9 = var2;

                stackIn_40_10 = 1;

                if (hj.field_i) {
                  break L3;
                } else {






















                  if (!hl.field_h) {
                    stackIn_42_0 = stackIn_37_0;
                    stackIn_42_1 = stackIn_37_1;
                    stackIn_42_2 = stackIn_37_2;
                    stackIn_42_3 = stackIn_37_3;
                    stackIn_42_4 = stackIn_37_4;
                    stackIn_42_5 = stackIn_37_5;
                    stackIn_42_6 = stackIn_37_6;
                    stackIn_42_7 = stackIn_37_7;
                    stackIn_42_8 = stackIn_37_8;
                    stackIn_42_9 = stackIn_40_9;
                    stackIn_42_10 = stackIn_40_10;
                    stackIn_42_11 = 0;
                    break L2;
                  } else {











                    break L3;
                  }
                }
              }
              stackIn_42_0 = stackIn_37_0;
              stackIn_42_1 = stackIn_37_1;
              stackIn_42_2 = stackIn_37_2;
              stackIn_42_3 = stackIn_37_3;
              stackIn_42_4 = stackIn_37_4;
              stackIn_42_5 = stackIn_37_5;
              stackIn_42_6 = stackIn_37_6;
              stackIn_42_7 = stackIn_37_7;
              stackIn_42_8 = stackIn_37_8;
              stackIn_42_9 = stackIn_40_9;
              stackIn_42_10 = stackIn_40_10;
              stackIn_42_11 = 1;
              break L2;
            }
            L4: {
              bh.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5, stackIn_42_6, stackIn_42_7, stackIn_42_8 != 0, stackIn_42_9 != 0, stackIn_42_10 != 0, stackIn_42_11 != 0);
              if (ob.field_w) {
                qn.field_U.f(57, param0 ^ 28);
                ob.field_w = false;
                break L4;
              } else {
                break L4;
              }
            }
            if (tg.field_p) {
              qn.field_U.f(10, -68);
              tg.field_p = false;
              return;
            } else {
              return;
            }
          } else {
            L5: {
              var2 = 0;
              stackIn_21_0 = param0 + -46;

              stackIn_21_1 = 15;

              stackIn_21_2 = 14;

              stackIn_21_3 = 11;

              stackIn_21_4 = param1;

              stackIn_21_5 = fl.field_p;

              stackIn_21_6 = 13;

              stackIn_21_7 = 0;

              if (50 >= fl.field_n) {
                stackIn_22_0 = stackIn_21_0;
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = stackIn_21_3;
                stackIn_22_4 = stackIn_21_4;
                stackIn_22_5 = stackIn_21_5;
                stackIn_22_6 = stackIn_21_6;
                stackIn_22_7 = stackIn_21_7;
                stackIn_22_8 = 0;
                break L5;
              } else {
                stackIn_22_0 = stackIn_21_0;
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = stackIn_21_3;
                stackIn_22_4 = stackIn_21_4;
                stackIn_22_5 = stackIn_21_5;
                stackIn_22_6 = stackIn_21_6;
                stackIn_22_7 = stackIn_21_7;
                stackIn_22_8 = 1;
                break L5;
              }
            }
            L6: {
              L7: {

                stackIn_25_9 = var2;

                stackIn_25_10 = 1;

                if (hj.field_i) {
                  break L7;
                } else {






















                  if (!hl.field_h) {
                    stackIn_27_0 = stackIn_22_0;
                    stackIn_27_1 = stackIn_22_1;
                    stackIn_27_2 = stackIn_22_2;
                    stackIn_27_3 = stackIn_22_3;
                    stackIn_27_4 = stackIn_22_4;
                    stackIn_27_5 = stackIn_22_5;
                    stackIn_27_6 = stackIn_22_6;
                    stackIn_27_7 = stackIn_22_7;
                    stackIn_27_8 = stackIn_22_8;
                    stackIn_27_9 = stackIn_25_9;
                    stackIn_27_10 = stackIn_25_10;
                    stackIn_27_11 = 0;
                    break L6;
                  } else {











                    break L7;
                  }
                }
              }
              stackIn_27_0 = stackIn_22_0;
              stackIn_27_1 = stackIn_22_1;
              stackIn_27_2 = stackIn_22_2;
              stackIn_27_3 = stackIn_22_3;
              stackIn_27_4 = stackIn_22_4;
              stackIn_27_5 = stackIn_22_5;
              stackIn_27_6 = stackIn_22_6;
              stackIn_27_7 = stackIn_22_7;
              stackIn_27_8 = stackIn_22_8;
              stackIn_27_9 = stackIn_25_9;
              stackIn_27_10 = stackIn_25_10;
              stackIn_27_11 = 1;
              break L6;
            }
            L8: {
              bh.a(stackIn_27_0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8 != 0, stackIn_27_9 != 0, stackIn_27_10 != 0, stackIn_27_11 != 0);
              if (ob.field_w) {
                qn.field_U.f(57, param0 ^ 28);
                ob.field_w = false;
                break L8;
              } else {
                break L8;
              }
            }
            if (tg.field_p) {
              qn.field_U.f(10, -68);
              tg.field_p = false;
              return;
            } else {
              return;
            }
          }
        } else {
          L9: {
            var2 = 0;
            stackIn_5_0 = param0 + -46;

            stackIn_5_1 = 15;

            stackIn_5_2 = 14;

            stackIn_5_3 = 11;

            stackIn_5_4 = param1;

            stackIn_5_5 = fl.field_p;

            stackIn_5_6 = 13;

            stackIn_5_7 = 0;

            if (50 >= fl.field_n) {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = stackIn_5_1;
              stackIn_6_2 = stackIn_5_2;
              stackIn_6_3 = stackIn_5_3;
              stackIn_6_4 = stackIn_5_4;
              stackIn_6_5 = stackIn_5_5;
              stackIn_6_6 = stackIn_5_6;
              stackIn_6_7 = stackIn_5_7;
              stackIn_6_8 = 0;
              break L9;
            } else {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = stackIn_5_1;
              stackIn_6_2 = stackIn_5_2;
              stackIn_6_3 = stackIn_5_3;
              stackIn_6_4 = stackIn_5_4;
              stackIn_6_5 = stackIn_5_5;
              stackIn_6_6 = stackIn_5_6;
              stackIn_6_7 = stackIn_5_7;
              stackIn_6_8 = 1;
              break L9;
            }
          }
          L10: {
            L11: {

              stackIn_9_9 = var2;

              stackIn_9_10 = 1;

              if (hj.field_i) {
                break L11;
              } else {






















                if (!hl.field_h) {
                  stackIn_11_0 = stackIn_6_0;
                  stackIn_11_1 = stackIn_6_1;
                  stackIn_11_2 = stackIn_6_2;
                  stackIn_11_3 = stackIn_6_3;
                  stackIn_11_4 = stackIn_6_4;
                  stackIn_11_5 = stackIn_6_5;
                  stackIn_11_6 = stackIn_6_6;
                  stackIn_11_7 = stackIn_6_7;
                  stackIn_11_8 = stackIn_6_8;
                  stackIn_11_9 = stackIn_9_9;
                  stackIn_11_10 = stackIn_9_10;
                  stackIn_11_11 = 0;
                  break L10;
                } else {











                  break L11;
                }
              }
            }
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_1 = stackIn_6_1;
            stackIn_11_2 = stackIn_6_2;
            stackIn_11_3 = stackIn_6_3;
            stackIn_11_4 = stackIn_6_4;
            stackIn_11_5 = stackIn_6_5;
            stackIn_11_6 = stackIn_6_6;
            stackIn_11_7 = stackIn_6_7;
            stackIn_11_8 = stackIn_6_8;
            stackIn_11_9 = stackIn_9_9;
            stackIn_11_10 = stackIn_9_10;
            stackIn_11_11 = 1;
            break L10;
          }
          L12: {
            bh.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6, stackIn_11_7, stackIn_11_8 != 0, stackIn_11_9 != 0, stackIn_11_10 != 0, stackIn_11_11 != 0);
            if (ob.field_w) {
              qn.field_U.f(57, param0 ^ 28);
              ob.field_w = false;
              break L12;
            } else {
              break L12;
            }
          }
          if (tg.field_p) {
            qn.field_U.f(10, -68);
            tg.field_p = false;
            return;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    public static void c(byte param0) {
        field_t = null;
        field_o = null;
        field_s = null;
        field_q = null;
        field_n = null;
        field_u = null;
        if (param0 >= 42) {
          return;
        } else {
          mi.a((byte) -41, true);
          return;
        }
    }

    final nm a() {
        qd var1;
        var1 = (qd) ((Object) this.field_x.g(-18110));
        if (var1 != null) {
          if (var1.field_j != null) {
            return (nm) ((Object) var1.field_j);
          } else {
            return this.b();
          }
        } else {
          return null;
        }
    }

    final nm b() {
        qd var1_ref = null;
        int var2 = Chess.field_G;
        do {
            var1_ref = (qd) ((Object) this.field_x.a((byte) -125));
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_j == null);
        return (nm) ((Object) var1_ref.field_j);
    }

    final void a(int param0) {
        int var2;
        qd var3;
        int var4;
        var4 = Chess.field_G;
        this.field_p.a(param0);
        var3 = (qd) ((Object) this.field_x.g(-18110));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (this.field_w.a((byte) -25, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_B) {
                    this.a(32, var2, var3);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(54, var3.field_B, var3);
                    var2 = var2 - var3.field_B;
                    if (!this.field_w.a(35, var2, (int[]) null, 0, var3)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (qd) ((Object) this.field_x.a((byte) -127));
            continue L0;
          } else {
            return;
          }
        }
    }

    mi(vl param0) {
        this.field_x = new jc();
        this.field_p = new lb();
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "New Game";
        field_v = 0;
        field_u = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = 0;
        field_o = "Your email address is used to identify this account";
        field_s = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
