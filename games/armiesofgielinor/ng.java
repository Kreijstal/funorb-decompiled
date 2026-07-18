/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private boolean field_x;
    private int field_q;
    private int field_r;
    private boolean field_c;
    private int field_k;
    private int field_d;
    private int[] field_b;
    private int field_f;
    private int field_z;
    static String field_s;
    private int field_h;
    private tu field_e;
    private int field_a;
    private String[] field_A;
    private int field_w;
    private int field_g;
    private int field_p;
    static int field_v;
    private int field_u;
    private boolean field_t;
    private int field_m;
    private wk[] field_l;
    private nb field_y;
    private nb field_n;
    private int[] field_j;
    private int field_o;
    private wk[] field_i;

    private final boolean q() {
        int discarded$2 = 4;
        if (this.s()) {
          return false;
        } else {
          if (this.b((byte) -88)) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final int k(int param0) {
        int var2 = ((ng) this).field_l[1].field_x;
        int var3 = ((ng) this).field_k + var2;
        if (param0 >= -47) {
            ((ng) this).field_x = true;
        }
        return var3;
    }

    public static void w() {
        field_s = null;
    }

    private final boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = ((ng) this).field_a;
        var3 = ((ng) this).field_a - -((ng) this).field_d;
        if (qn.field_j > var2) {
          var3 = var3 + (qn.field_j + -var2);
          if (qn.field_e < var3) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            if (param0 == -2) {
              break L0;
            } else {
              int discarded$1 = this.i(-95);
              break L0;
            }
          }
          L1: {
            var3 = ((ng) this).field_d + ((ng) this).field_a;
            if (qn.field_e < var3) {
              var2 = var2 - (-qn.field_e + var3);
              if (qn.field_j > var2) {
                return false;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          return true;
        }
    }

    private final int o() {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((ng) this).field_r) {
            return var2;
          } else {
            var4 = ((ng) this).field_A[var3];
            var5 = ((ng) this).field_e.a(var4);
            if (var2 < var5) {
              var2 = var5;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean d(boolean param0) {
        if (param0) {
            int discarded$0 = ((ng) this).a(5, (byte) 18, -39);
        }
        return ((ng) this).field_x;
    }

    final String a(byte param0, int param1) {
        int var3 = 77 % ((-25 - param0) / 56);
        return ((ng) this).field_A[param1];
    }

    final void e(int param0) {
        if (!((ng) this).field_x) {
            return;
        }
        int discarded$0 = 7;
        this.B();
        this.a(param0 + -6812);
        if (param0 != 6815) {
            return;
        }
        this.e((byte) -8);
    }

    private final void t() {
        int discarded$0 = 114;
        int var2 = this.o();
        int var3 = ((ng) this).field_e.a(' ') << 1;
        int var4 = ((ng) this).field_l[3].field_A + ((ng) this).field_l[5].field_A;
        int var5 = ((ng) this).field_n.c(26787);
        ((ng) this).field_d = var2 + (var3 - -var5) + var4;
    }

    final void a(int param0, byte param1) {
        ((ng) this).field_o = param0;
        int var3 = -28 % ((-31 - param1) / 34);
    }

    private final void j() {
        int var2 = this.d((byte) -88);
        int var3 = this.i(1);
        int var4 = var3 / var2;
        ((ng) this).field_n.a(0, (byte) 47, var4, ((ng) this).field_r, 1);
        ((ng) this).field_m = ((ng) this).field_n.a(false);
        ((ng) this).field_z = ((ng) this).field_m - -((ng) this).field_n.a((byte) 102);
    }

    private final wk[] c(boolean param0) {
        int var2 = 0;
        wk[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = ((ng) this).field_i.length;
        var3 = new wk[var2];
        var4 = 0;
        L0: while (true) {
          if (var2 <= var4) {
            return var3;
          } else {
            var3[var4] = ((ng) this).field_i[var4].g();
            var3[var4].f();
            var4++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0, boolean param1, byte param2, int param3) {
        ((ng) this).field_n.a(param0, param3, -2, param1);
        ((ng) this).field_y.a(param0, param3, -2, param1);
        int discarded$0 = 116;
        this.a();
        ((ng) this).field_c = false;
        if (!((ng) this).field_x) {
            return;
        }
        if (!((ng) this).field_t) {
            return;
        }
        if (!param0) {
            return;
        }
        if (((ng) this).field_u >= 0) {
            ((ng) this).field_o = ((ng) this).field_u;
            ((ng) this).field_c = true;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((ng) this).field_A = param1;
            var3_int = 54 % ((15 - param0) / 63);
            ((ng) this).field_o = 0;
            ((ng) this).field_r = ((ng) this).field_A.length;
            int discarded$4 = 0;
            this.y();
            int discarded$5 = -101;
            this.p();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ng.N(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final boolean s() {
        int var2 = ((ng) this).field_h;
        int var3 = ((ng) this).field_h + ((ng) this).field_g;
        if (qn.field_a > var2) {
            return false;
        }
        if (var3 > qn.field_f) {
            return false;
        }
        return true;
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 31127) {
          L0: {
            var4 = 0;
            if (!((ng) this).field_y.a(param1, -2, param2)) {
              if (((ng) this).field_n.a(param1, -2, param2)) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          }
          var4 = stackIn_8_0;
          return var4 != 0;
        } else {
          return true;
        }
    }

    final void l(int param0) {
        if (param0 != 0) {
            this.e((byte) 36);
        }
        ((ng) this).field_x = false;
    }

    private final void a() {
        L0: {
          if (!((ng) this).field_n.b(false)) {
            break L0;
          } else {
            ((ng) this).field_m = ((ng) this).field_n.a(false);
            ((ng) this).field_z = ((ng) this).field_m + ((ng) this).field_n.a((byte) 76);
            break L0;
          }
        }
        L1: {
          if (((ng) this).field_y.b(false)) {
            ((ng) this).field_p = ((ng) this).field_y.a(false);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void m() {
        int var2 = 0;
        int var3 = 0;
        ((ng) this).field_f = ((ng) this).field_d;
        ((ng) this).field_q = ((ng) this).field_a;
        if (!this.a(true)) {
          L0: {
            if (this.h(-2)) {
              L1: {
                var2 = ((ng) this).field_a;
                var3 = ((ng) this).field_a - -((ng) this).field_d;
                if (var2 >= qn.field_j) {
                  break L1;
                } else {
                  var3 = var3 + (qn.field_j + -var2);
                  if (qn.field_e < var3) {
                    break L1;
                  } else {
                    var2 = qn.field_j;
                    ((ng) this).field_f = var3 + -var2;
                    ((ng) this).field_q = var2;
                    return;
                  }
                }
              }
              var3 = ((ng) this).field_a - -((ng) this).field_d;
              if (var3 <= qn.field_e) {
                break L0;
              } else {
                var2 = var2 - (var3 + -qn.field_e);
                if (qn.field_j > var2) {
                  break L0;
                } else {
                  ((ng) this).field_q = var2;
                  var3 = qn.field_e;
                  ((ng) this).field_f = -var2 + var3;
                  return;
                }
              }
            } else {
              break L0;
            }
          }
          ((ng) this).field_q = qn.field_j;
          ((ng) this).field_f = qn.field_e;
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        ((ng) this).field_u = -1;
        if (((ng) this).field_t) {
            if (((ng) this).field_x) {
                ((ng) this).field_u = ((ng) this).a(param2, (byte) -128, param1);
            }
        }
        ((ng) this).field_n.b(param2, param1, 0);
        ((ng) this).field_y.b(param2, param1, 0);
    }

    final boolean r(int param0) {
        int var2 = -57 / ((54 - param0) / 50);
        return ((ng) this).field_c;
    }

    private final void f() {
        int var2 = this.n(-88);
        int var3 = this.k(-105) - -this.i(1);
        int discarded$0 = 1;
        int var4 = this.E();
        ((ng) this).field_y.b(var3, -128, var2, var4);
    }

    private final int d(byte param0) {
        if (param0 >= -82) {
            ((ng) this).field_u = 47;
        }
        int var2 = ((ng) this).field_e.field_L + ((ng) this).field_e.field_H;
        int var3 = 4;
        int var4 = var3 + var2;
        return var4;
    }

    private final void p() {
        this.C(-25621);
        int discarded$0 = 96;
        this.j();
        int discarded$1 = 1773277345;
        this.z();
    }

    final void e(boolean param0) {
        if (!param0) {
            ((ng) this).c(-121);
        }
        ((ng) this).field_t = false;
    }

    private final int i(int param0) {
        int var2 = this.k(-123);
        int var3 = ((ng) this).field_y.c(param0 + 26786);
        int var4 = ((ng) this).field_l[7].field_x;
        int var5 = -var3 + (-var4 + (((ng) this).field_k + ((ng) this).field_w));
        int var6 = -var2 + var5 + param0;
        return var6;
    }

    private final void B() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = ((ng) this).field_q;
        var3 = ((ng) this).field_k;
        var4 = ((ng) this).field_f;
        L0: {
          var5 = ((ng) this).field_w;
          if (!((ng) this).field_n.c(false)) {
            var4 = var4 - ((ng) this).field_n.c(26787);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((ng) this).field_y.c(false)) {
            var5 = var5 - ((ng) this).field_y.c(26787);
            break L1;
          } else {
            break L1;
          }
        }
        qn.f(var2, var3, var4, var5, 7829367);
        i.a(((ng) this).field_l, var5, var2, (byte) -47, var3, var4);
    }

    private final void f(int param0) {
        int discarded$0 = 1;
        int var2 = this.n(-91) + this.E();
        int var3 = this.k(-100);
        if (param0 <= 22) {
            ((ng) this).field_c = false;
        }
        int var4 = this.i(1);
        ((ng) this).field_n.b(var3, -125, var2, var4);
    }

    private final void z() {
        int var2 = 3;
        int discarded$0 = 1;
        int var3 = this.E();
        int var4 = var3 / var2;
        ((ng) this).field_y.a(0, (byte) 47, ((ng) this).field_f, var3, var4);
        ((ng) this).field_p = ((ng) this).field_y.a(false);
    }

    private final int n(int param0) {
        if (param0 >= -55) {
            ((ng) this).g(82);
        }
        int var2 = ((ng) this).field_l[3].field_A;
        int var3 = ((ng) this).field_q + var2;
        return var3;
    }

    final boolean D(int param0) {
        if (param0 <= 80) {
            ((ng) this).field_i = null;
        }
        return ((ng) this).field_t;
    }

    final static rn a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        rn stackIn_3_0 = null;
        rn stackIn_6_0 = null;
        rn stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        rn stackIn_27_0 = null;
        rn stackIn_45_0 = null;
        rn stackIn_51_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_13_0 = null;
        rn stackOut_26_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        rn stackOut_50_0 = null;
        rn stackOut_44_0 = null;
        rn stackOut_5_0 = null;
        rn stackOut_2_0 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 != var2_int) {
            if (64 >= var2_int) {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(var2_int - 1) != 34) {
                  stackOut_13_0 = ov.field_h;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (-1 + var2_int > var4) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                          L2: {
                            if (var5 != 34) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                stackOut_26_0 = ov.field_h;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        } else {
                          L3: {
                            if (var3 == 0) {
                              stackOut_21_0 = 1;
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            } else {
                              stackOut_20_0 = 0;
                              stackIn_23_0 = stackOut_20_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_23_0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (var2_int > var4) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (-1 == ud.field_Z.indexOf(var5)) {
                          stackOut_50_0 = ov.field_h;
                          stackIn_51_0 = stackOut_50_0;
                          return stackIn_51_0;
                        } else {
                          var3 = 0;
                          break L5;
                        }
                      } else {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (var2_int - 1 == var4) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                var3 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_44_0 = ov.field_h;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_5_0 = el.field_e;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = hv.field_N;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var2;
            stackOut_56_1 = new StringBuilder().append("ng.I(");
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L7;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + 15026 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ng) this).field_h = param2;
        ((ng) this).field_a = param0;
        if (param1 <= 74) {
            boolean discarded$0 = this.A(74);
        }
        this.C(-25621);
    }

    final int u(int param0) {
        int var2 = -10 % ((37 - param0) / 33);
        return ((ng) this).field_r;
    }

    final static void a(dn param0, je param1, int[] param2, String param3, int param4, int param5, int param6, String param7, long param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var10_int = -119 % ((param5 - -47) / 32);
            pq.field_b = param0;
            tn.field_Z = new tg(param1, param8, param7, param3, param4, param6, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ng.FA(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param8 + ')');
        }
    }

    private final boolean A(int param0) {
        if (this.a(true)) {
          return false;
        } else {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              boolean discarded$1 = this.h(52);
              break L0;
            }
          }
          if (this.h(-2)) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void b() {
        wk var1 = null;
        RuntimeException var1_ref = null;
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = new wk(540, 140);
            int discarded$6 = 3;
            vn.a(var1);
            tm.a();
            qn.b();
            ib.field_j = 0;
            int discarded$7 = 9;
            rb.e();
            var2 = var1.g();
            var3 = 0;
            L1: while (true) {
              if (15 <= var3) {
                kq.field_P.b();
                var1.h(0, 0);
                rf.b(-18862);
                break L0;
              } else {
                var2.a(-2, -2, 16777215);
                qn.c(4, 4, 0, 0, 540, 140);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "ng.V(" + true + ')');
        }
    }

    private final void e(byte param0) {
        L0: {
          if (((ng) this).field_n.c(false)) {
            ((ng) this).field_n.f(0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((ng) this).field_y.c(false)) {
            break L1;
          } else {
            ((ng) this).field_y.f(0);
            break L1;
          }
        }
        if (param0 == -8) {
          return;
        } else {
          return;
        }
    }

    private final int E() {
        int var2 = this.n(-128);
        int var3 = ((ng) this).field_n.c(26787);
        int var4 = ((ng) this).field_l[5].field_A;
        int var5 = -var3 + -var4 + (((ng) this).field_q - -((ng) this).field_f);
        int var6 = -var2 + (var5 + 1);
        return var6;
    }

    final void g(int param0) {
        ((ng) this).field_t = true;
        int var2 = -49 % ((param0 - 31) / 52);
    }

    private final void C(int param0) {
        int discarded$0 = -4;
        this.c();
        int discarded$1 = 0;
        this.m();
        this.f(param0 ^ -25718);
        if (param0 != -25621) {
            return;
        }
        int discarded$2 = 120;
        this.f();
    }

    final int b(int param0) {
        int var2 = -62 % ((param0 - -13) / 45);
        return ((ng) this).field_o;
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            field_s = null;
        }
        this.C(param3 + -25621);
        int discarded$0 = -1;
        this.v();
        this.a((byte) 58, param4, param0);
        this.a(param2, param1, (byte) 16, param5);
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        ((ng) this).field_k = ((ng) this).field_h;
        ((ng) this).field_w = ((ng) this).field_g;
        int discarded$2 = 4;
        if (!this.s()) {
          L0: {
            if (this.b((byte) -105)) {
              L1: {
                var2 = ((ng) this).field_h;
                var3 = ((ng) this).field_g + ((ng) this).field_h;
                if (qn.field_a > var2) {
                  var3 = var3 + (-var2 + qn.field_a);
                  if (qn.field_f >= var3) {
                    var2 = qn.field_a;
                    ((ng) this).field_k = var2;
                    ((ng) this).field_w = var3 + -var2;
                    return;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var3 = ((ng) this).field_h - -((ng) this).field_g;
              if (qn.field_f < var3) {
                var2 = var2 - (-qn.field_f + var3);
                if (qn.field_a <= var2) {
                  var3 = qn.field_f;
                  ((ng) this).field_k = var2;
                  ((ng) this).field_w = var3 - var2;
                  return;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          ((ng) this).field_w = qn.field_f;
          ((ng) this).field_k = qn.field_a;
          return;
        } else {
          return;
        }
    }

    private final boolean a(boolean param0) {
        int var2 = ((ng) this).field_a;
        int var3 = ((ng) this).field_a - -((ng) this).field_d;
        if (qn.field_j > var2) {
            return false;
        }
        if (qn.field_e < var3) {
            return false;
        }
        return true;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.k(param0 + -100);
        if (param0 == 3) {
          var3 = var2 + this.i(param0 ^ 2);
          var4 = this.n(-116);
          int discarded$2 = 1;
          var5 = var4 - -this.E();
          var6 = ((ng) this).field_p;
          qn.b(((ng) this).field_j);
          qn.b(var4, var2, var5, var3);
          var4 = -var6 + var4;
          var2 = var2 - -((ng) this).field_e.field_H;
          var7 = this.d((byte) -85);
          var8 = ((ng) this).field_m;
          L0: while (true) {
            if (((ng) this).field_z <= var8) {
              qn.a(((ng) this).field_j);
              return;
            } else {
              L1: {
                var9 = ((ng) this).field_A[var8];
                var10 = ((ng) this).field_b[0];
                if (var8 == ((ng) this).field_u) {
                  var10 = ((ng) this).field_b[1];
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ng) this).field_e.b(var9, var4, var2, var10, -1);
              var2 = var2 + var7;
              var8++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void x() {
        qf.field_e = null;
        mb.field_F = null;
        ed.field_e = null;
        if (jl.field_b != null) {
            qj.field_z = jl.field_b;
            rb.field_b = ew.field_d;
            qj.field_z.field_W = -1;
            qj.field_z.field_T = -1;
            jl.field_b = null;
            ew.field_d = null;
        }
        eu.field_g = null;
        hf.field_c = true;
        sb.field_i = null;
        int var1 = 2;
    }

    final static void a(wk param0, int param1, wk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ds.field_a = new wk[op.field_c[0].length];
            le.field_c = new wk[op.field_c[0].length];
            vo.field_d = param0;
            im.field_y = param2;
            var3_int = 0;
            L1: while (true) {
              if (op.field_c[0].length <= var3_int) {
                break L0;
              } else {
                ds.field_a[var3_int] = new wk(vo.field_d.field_y, vo.field_d.field_v);
                le.field_c[var3_int] = new wk(im.field_y.field_y, im.field_y.field_v);
                ds.field_a[var3_int].b();
                vo.field_d.d(0, 0, op.field_c[0][var3_int]);
                le.field_c[var3_int].b();
                im.field_y.b(0, 0, op.field_c[0][var3_int]);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ng.MA(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void c(int param0) {
        ((ng) this).field_x = true;
        if (param0 <= 25) {
            return;
        }
    }

    private final void y() {
        int discarded$0 = 124;
        this.d();
        int discarded$1 = 0;
        this.t();
    }

    private final void v() {
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ng) this).field_x) {
          if (!((ng) this).field_t) {
            return;
          } else {
            L0: {
              if (this.A(0)) {
                ((ng) this).field_y.d(-97);
                break L0;
              } else {
                ((ng) this).field_y.b((byte) -65);
                break L0;
              }
            }
            L1: {
              int discarded$1 = -87;
              if (this.q()) {
                ((ng) this).field_n.d(-124);
                break L1;
              } else {
                ((ng) this).field_n.b((byte) -65);
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    ng(wk[] param0, wk[] param1, tu param2, int[] param3, String[] param4, int param5, int param6) {
        RuntimeException var8 = null;
        wk[] var9 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            ((ng) this).field_e = param2;
            ((ng) this).field_b = param3;
            ((ng) this).field_i = param1;
            ((ng) this).field_l = param0;
            ((ng) this).field_n = new nb(((ng) this).field_i, ((ng) this).field_b, 1);
            var9 = this.c(false);
            ((ng) this).field_y = new nb(var9, ((ng) this).field_b, 0);
            ((ng) this).a((byte) 87, param4);
            ((ng) this).a(param5, 94, param6);
            ((ng) this).g(98);
            ((ng) this).l(0);
            ((ng) this).field_j = new int[4];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var8;
            stackOut_3_1 = new StringBuilder().append("ng.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = ((ng) this).field_h;
        var4 = 40 / ((param0 - 15) / 45);
        var3 = ((ng) this).field_h + ((ng) this).field_g;
        if (var2 < qn.field_a) {
          var3 = var3 + (-var2 + qn.field_a);
          if (var3 <= qn.field_f) {
            return true;
          } else {
            return false;
          }
        } else {
          var3 = ((ng) this).field_g + ((ng) this).field_h;
          if (qn.field_f >= var3) {
            return true;
          } else {
            var2 = var2 - (var3 + -qn.field_f);
            if (qn.field_a > var2) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var9 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = this.n(-60);
        int var5 = this.k(-101);
        int var6 = this.d((byte) -111);
        int var8 = -30 / ((param1 - -89) / 32);
        int discarded$0 = 1;
        int var7 = this.E();
        for (var9 = ((ng) this).field_m; ((ng) this).field_z > var9; var9++) {
            if (mo.a(param0, var4, var5, param2, var7, (byte) -101, var6)) {
                return var9;
            }
            var5 = var5 + var6;
        }
        return -1;
    }

    private final void d() {
        int var2 = this.d((byte) -111);
        int var3 = ((ng) this).field_r * var2;
        int var4 = ((ng) this).field_l[1].field_x - -((ng) this).field_l[7].field_x;
        int var5 = ((ng) this).field_y.c(26787);
        ((ng) this).field_g = var3 + var4 + var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Spells to harm groups of units.";
    }
}
