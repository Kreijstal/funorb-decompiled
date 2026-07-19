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

    private final boolean q(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (this.s(4)) {
          return false;
        } else {
          if (param0 >= -20) {
            this.C(86);
            if (!this.b((byte) -88)) {
              return true;
            } else {
              return false;
            }
          } else {
            L0: {
              if (this.b((byte) -88)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_l[1].field_x;
        var3 = this.field_k + var2;
        if (param0 >= -47) {
          this.field_x = true;
          return var3;
        } else {
          return var3;
        }
    }

    public static void w(int param0) {
        field_s = null;
        if (param0 != 0) {
            field_v = -114;
        }
    }

    private final boolean h(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var2 = this.field_a;
        var3 = this.field_a - -this.field_d;
        if (qn.field_j > var2) {
          var3 = var3 + (qn.field_j + -var2);
          if (qn.field_e >= var3) {
            return true;
          } else {
            return false;
          }
        } else {
          if (param0 == -2) {
            var3 = this.field_d + this.field_a;
            if (qn.field_e < var3) {
              var2 = var2 - (-qn.field_e + var3);
              if (qn.field_j <= var2) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            discarded$2 = this.i(-95);
            var3 = this.field_d + this.field_a;
            if (qn.field_e < var3) {
              L0: {
                var2 = var2 - (-qn.field_e + var3);
                if (qn.field_j > var2) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0 != 0;
            } else {
              return true;
            }
          }
        }
    }

    private final int o(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        if (param0 < 109) {
          discarded$1 = this.i(-54);
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= this.field_r) {
                  break L2;
                } else {
                  var4 = this.field_A[var3];
                  var5 = this.field_e.a(var4);
                  stackOut_11_0 = var2;
                  stackIn_16_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_12_0 >= var5) {
                        break L3;
                      } else {
                        var2 = var5;
                        break L3;
                      }
                    }
                    var3++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_15_0 = var2;
              stackIn_16_0 = stackOut_15_0;
              break L1;
            }
            return stackIn_16_0;
          }
        } else {
          var3 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var3 >= this.field_r) {
                  break L6;
                } else {
                  var4 = this.field_A[var3];
                  var5 = this.field_e.a(var4);
                  stackOut_3_0 = var2;
                  stackIn_8_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    L7: {
                      if (stackIn_4_0 >= var5) {
                        break L7;
                      } else {
                        var2 = var5;
                        break L7;
                      }
                    }
                    var3++;
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              stackOut_7_0 = var2;
              stackIn_8_0 = stackOut_7_0;
              break L5;
            }
            return stackIn_8_0;
          }
        }
    }

    final boolean d(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.a(5, (byte) 18, -39);
            return this.field_x;
        }
        return this.field_x;
    }

    final String a(byte param0, int param1) {
        int var3 = 77 % ((-25 - param0) / 56);
        return this.field_A[param1];
    }

    final void e(int param0) {
        if (this.field_x) {
          this.B(7);
          this.a(param0 + -6812);
          if (param0 != 6815) {
            return;
          } else {
            this.e((byte) -8);
            return;
          }
        } else {
          return;
        }
    }

    private final void t(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = this.o(114);
        var3 = this.field_e.a(' ') << 1773277345;
        var4 = this.field_l[3].field_A + this.field_l[5].field_A;
        if (param0 != 0) {
          return;
        } else {
          var5 = this.field_n.c(param0 ^ 26787);
          this.field_d = var2 + (var3 - -var5) + var4;
          return;
        }
    }

    final void a(int param0, byte param1) {
        this.field_o = param0;
        int var3 = -28 % ((-31 - param1) / 34);
    }

    private final void j(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = this.d((byte) -88);
        var3 = this.i(1);
        if (param0 < 9) {
          discarded$1 = this.s(-105);
          var4 = var3 / var2;
          this.field_n.a(0, (byte) 47, var4, this.field_r, 1);
          this.field_m = this.field_n.a(false);
          this.field_z = this.field_m - -this.field_n.a((byte) 102);
          return;
        } else {
          var4 = var3 / var2;
          this.field_n.a(0, (byte) 47, var4, this.field_r, 1);
          this.field_m = this.field_n.a(false);
          this.field_z = this.field_m - -this.field_n.a((byte) 102);
          return;
        }
    }

    private final wk[] c(boolean param0) {
        int var2 = 0;
        wk[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        wk[] stackIn_6_0 = null;
        wk[] stackIn_8_0 = null;
        wk[] stackIn_13_0 = null;
        wk[] stackIn_14_0 = null;
        wk[] stackOut_12_0 = null;
        wk[] stackOut_5_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_i.length;
        var3 = new wk[var2];
        if (!param0) {
          var4 = 0;
          L0: while (true) {
            if (var2 > var4) {
              var3[var4] = this.field_i[var4].g();
              stackOut_12_0 = (wk[]) (var3);
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var5 == 0) {
                ((wk) (Object) stackIn_14_0[var4]).f();
                var4++;
                continue L0;
              } else {
                return stackIn_13_0;
              }
            } else {
              return var3;
            }
          }
        } else {
          this.field_l = (wk[]) null;
          var4 = 0;
          L1: while (true) {
            if (var2 > var4) {
              var3[var4] = this.field_i[var4].g();
              stackOut_5_0 = (wk[]) (var3);
              stackIn_8_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 != 0) {
                return stackIn_8_0;
              } else {
                ((wk) (Object) stackIn_6_0[var4]).f();
                var4++;
                continue L1;
              }
            } else {
              return var3;
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1, byte param2, int param3) {
        this.field_n.a(param0, param3, -2, param1);
        this.field_y.a(param0, param3, -2, param1);
        this.a((byte) 116);
        if (param2 == 16) {
          this.field_c = false;
          if (this.field_x) {
            if (this.field_t) {
              if (!param0) {
                return;
              } else {
                L0: {
                  if (this.field_u < 0) {
                    break L0;
                  } else {
                    this.field_o = this.field_u;
                    this.field_c = true;
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.field_A = param1;
            var3_int = 54 % ((15 - param0) / 63);
            this.field_o = 0;
            this.field_r = this.field_A.length;
            this.y(0);
            this.p(-101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ng.N(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
    }

    private final boolean s(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_h;
        var3 = this.field_h + this.field_g;
        if (qn.field_a <= var2) {
          if (var3 <= qn.field_f) {
            if (param0 != 4) {
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 31127) {
          L0: {
            var4 = 0;
            if (!this.field_y.a(param1, -2, param2)) {
              if (this.field_n.a(param1, -2, param2)) {
                var4 = 1;
                return var4 != 0;
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
            this.field_x = false;
            return;
        }
        this.field_x = false;
    }

    private final void a(byte param0) {
        if (!this.field_n.b(false)) {
          L0: {
            if (this.field_y.b(false)) {
              this.field_p = this.field_y.a(false);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 <= 46) {
            return;
          } else {
            return;
          }
        } else {
          L1: {
            this.field_m = this.field_n.a(false);
            this.field_z = this.field_m + this.field_n.a((byte) 76);
            if (this.field_y.b(false)) {
              this.field_p = this.field_y.a(false);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 <= 46) {
            return;
          } else {
            return;
          }
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_f = this.field_d;
        this.field_q = this.field_a;
        if (!this.a(true)) {
          if (param0 == 0) {
            if (this.h(-2)) {
              L0: {
                var2 = this.field_a;
                var3 = this.field_a - -this.field_d;
                if (var2 >= qn.field_j) {
                  break L0;
                } else {
                  var3 = var3 + (qn.field_j + -var2);
                  if (qn.field_e < var3) {
                    break L0;
                  } else {
                    var2 = qn.field_j;
                    this.field_f = var3 + -var2;
                    this.field_q = var2;
                    return;
                  }
                }
              }
              var3 = this.field_a - -this.field_d;
              if (var3 > qn.field_e) {
                var2 = var2 - (var3 + -qn.field_e);
                if (qn.field_j <= var2) {
                  this.field_q = var2;
                  var3 = qn.field_e;
                  this.field_f = -var2 + var3;
                  return;
                } else {
                  this.field_q = qn.field_j;
                  this.field_f = qn.field_e;
                  return;
                }
              } else {
                this.field_q = qn.field_j;
                this.field_f = qn.field_e;
                return;
              }
            } else {
              this.field_q = qn.field_j;
              this.field_f = qn.field_e;
              return;
            }
          } else {
            this.e((byte) 127);
            if (this.h(-2)) {
              var2 = this.field_a;
              var3 = this.field_a - -this.field_d;
              if (var2 < qn.field_j) {
                var3 = var3 + (qn.field_j + -var2);
                if (qn.field_e < var3) {
                  var3 = this.field_a - -this.field_d;
                  if (var3 > qn.field_e) {
                    var2 = var2 - (var3 + -qn.field_e);
                    if (qn.field_j <= var2) {
                      this.field_q = var2;
                      var3 = qn.field_e;
                      this.field_f = -var2 + var3;
                      return;
                    } else {
                      this.field_q = qn.field_j;
                      this.field_f = qn.field_e;
                      return;
                    }
                  } else {
                    this.field_q = qn.field_j;
                    this.field_f = qn.field_e;
                    return;
                  }
                } else {
                  var2 = qn.field_j;
                  this.field_f = var3 + -var2;
                  this.field_q = var2;
                  return;
                }
              } else {
                var3 = this.field_a - -this.field_d;
                if (var3 > qn.field_e) {
                  var2 = var2 - (var3 + -qn.field_e);
                  if (qn.field_j > var2) {
                    this.field_q = qn.field_j;
                    this.field_f = qn.field_e;
                    return;
                  } else {
                    this.field_q = var2;
                    var3 = qn.field_e;
                    this.field_f = -var2 + var3;
                    return;
                  }
                } else {
                  this.field_q = qn.field_j;
                  this.field_f = qn.field_e;
                  return;
                }
              }
            } else {
              this.field_q = qn.field_j;
              this.field_f = qn.field_e;
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        this.field_u = -1;
        if (this.field_t) {
          if (this.field_x) {
            this.field_u = this.a(param2, (byte) -128, param1);
            if (param0 != 58) {
              this.v(104);
              this.field_n.b(param2, param1, 0);
              this.field_y.b(param2, param1, 0);
              return;
            } else {
              this.field_n.b(param2, param1, 0);
              this.field_y.b(param2, param1, 0);
              return;
            }
          } else {
            if (param0 != 58) {
              this.v(104);
              this.field_n.b(param2, param1, 0);
              this.field_y.b(param2, param1, 0);
              return;
            } else {
              this.field_n.b(param2, param1, 0);
              this.field_y.b(param2, param1, 0);
              return;
            }
          }
        } else {
          if (param0 != 58) {
            this.v(104);
            this.field_n.b(param2, param1, 0);
            this.field_y.b(param2, param1, 0);
            return;
          } else {
            this.field_n.b(param2, param1, 0);
            this.field_y.b(param2, param1, 0);
            return;
          }
        }
    }

    final boolean r(int param0) {
        int var2 = -57 / ((54 - param0) / 50);
        return this.field_c;
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = this.n(-88);
        var3 = this.k(-105) - -this.i(1);
        if (param0 <= 21) {
          return;
        } else {
          var4 = this.E(1);
          this.field_y.b(var3, -128, var2, var4);
          return;
        }
    }

    private final int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 >= -82) {
          this.field_u = 47;
          var2 = this.field_e.field_L + this.field_e.field_H;
          var3 = 4;
          var4 = var3 + var2;
          return var4;
        } else {
          var2 = this.field_e.field_L + this.field_e.field_H;
          var3 = 4;
          var4 = var3 + var2;
          return var4;
        }
    }

    private final void p(int param0) {
        if (param0 > -16) {
          this.field_g = -30;
          this.C(-25621);
          this.j(96);
          this.z(1773277345);
          return;
        } else {
          this.C(-25621);
          this.j(96);
          this.z(1773277345);
          return;
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            this.c(-121);
            this.field_t = false;
            return;
        }
        this.field_t = false;
    }

    private final int i(int param0) {
        int var2 = this.k(-123);
        int var3 = this.field_y.c(param0 + 26786);
        int var4 = this.field_l[7].field_x;
        int var5 = -var3 + (-var4 + (this.field_k + this.field_w));
        int var6 = -var2 + var5 + param0;
        return var6;
    }

    private final void B(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = this.field_q;
        var3 = this.field_k;
        var4 = this.field_f;
        if (param0 != 7) {
          return;
        } else {
          L0: {
            var5 = this.field_w;
            if (!this.field_n.c(false)) {
              var4 = var4 - this.field_n.c(26787);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (!this.field_y.c(false)) {
              var5 = var5 - this.field_y.c(26787);
              break L1;
            } else {
              break L1;
            }
          }
          qn.f(var2, var3, var4, var5, 7829367);
          i.a(this.field_l, var5, var2, (byte) -47, var3, var4);
          return;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = this.n(-91) + this.E(1);
        var3 = this.k(-100);
        if (param0 <= 22) {
          this.field_c = false;
          var4 = this.i(1);
          this.field_n.b(var3, -125, var2, var4);
          return;
        } else {
          var4 = this.i(1);
          this.field_n.b(var3, -125, var2, var4);
          return;
        }
    }

    private final void z(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 3;
        var3 = this.E(1);
        var4 = var3 / var2;
        this.field_y.a(0, (byte) 47, this.field_f, var3, var4);
        this.field_p = this.field_y.a(false);
        if (param0 != 1773277345) {
          this.field_y = (nb) null;
          return;
        } else {
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 >= -55) {
          this.g(82);
          var2 = this.field_l[3].field_A;
          var3 = this.field_q + var2;
          return var3;
        } else {
          var2 = this.field_l[3].field_A;
          var3 = this.field_q + var2;
          return var3;
        }
    }

    final boolean D(int param0) {
        if (param0 <= 80) {
            this.field_i = (wk[]) null;
            return this.field_t;
        }
        return this.field_t;
    }

    final static rn a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        rn stackIn_3_0 = null;
        rn stackIn_6_0 = null;
        rn stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        rn stackIn_24_0 = null;
        rn stackIn_31_0 = null;
        rn stackIn_41_0 = null;
        rn stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_11_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        rn stackOut_23_0 = null;
        rn stackOut_40_0 = null;
        rn stackOut_45_0 = null;
        rn stackOut_30_0 = null;
        rn stackOut_5_0 = null;
        rn stackOut_2_0 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 != var2_int) {
              if (64 >= var2_int) {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(var2_int - 1) != 34) {
                    stackOut_11_0 = ov.field_h;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          L3: {
                            var5 = param0.charAt(var4);
                            if (var5 != 92) {
                              break L3;
                            } else {
                              L4: {
                                if (var3 != 0) {
                                  stackOut_19_0 = 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  break L4;
                                } else {
                                  stackOut_18_0 = 1;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L4;
                                }
                              }
                              var3 = stackIn_20_0;
                              if (var6 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (var5 != 34) {
                              break L5;
                            } else {
                              if (var3 != 0) {
                                break L5;
                              } else {
                                stackOut_23_0 = ov.field_h;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var3 = 0;
                          break L2;
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  if (param1 == 15026) {
                    var3 = 0;
                    var4 = 0;
                    L6: while (true) {
                      if (var2_int > var4) {
                        L7: {
                          L8: {
                            var5 = param0.charAt(var4);
                            if (var5 != 46) {
                              break L8;
                            } else {
                              L9: {
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  if (var2_int - 1 == var4) {
                                    break L9;
                                  } else {
                                    if (var3 != 0) {
                                      break L9;
                                    } else {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_40_0 = ov.field_h;
                              stackIn_41_0 = stackOut_40_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                          if (-1 == ud.field_Z.indexOf(var5)) {
                            stackOut_45_0 = ov.field_h;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            var3 = 0;
                            break L7;
                          }
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_30_0 = (rn) null;
                    stackIn_31_0 = stackOut_30_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = el.field_e;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = hv.field_N;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var2);
            stackOut_51_1 = new StringBuilder().append("ng.I(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L10;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_41_0;
                  } else {
                    return stackIn_46_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        this.field_h = param2;
        this.field_a = param0;
        if (param1 <= 74) {
          discarded$2 = this.A(74);
          this.C(-25621);
          return;
        } else {
          this.C(-25621);
          return;
        }
    }

    final int u(int param0) {
        int var2 = -10 % ((37 - param0) / 33);
        return this.field_r;
    }

    final static void a(dn param0, je param1, int[] param2, String param3, int param4, int param5, int param6, String param7, long param8) {
        try {
            int var10_int = -119 % ((param5 - -47) / 32);
            pq.field_b = param0;
            tn.field_Z = new tg(param1, param8, param7, param3, param4, param6, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ng.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    private final boolean A(int param0) {
        boolean discarded$2 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (this.a(true)) {
          return false;
        } else {
          if (param0 != 0) {
            discarded$2 = this.h(52);
            if (!this.h(-2)) {
              return true;
            } else {
              return false;
            }
          } else {
            L0: {
              if (this.h(-2)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        wk var1 = null;
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = new wk(540, 140);
              vn.a(var1, 3);
              if (param0) {
                break L1;
              } else {
                ng.w(33);
                break L1;
              }
            }
            tm.a();
            qn.b();
            ib.field_j = 0;
            rb.e(9);
            var2 = var1.g();
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (15 <= var3) {
                    break L4;
                  } else {
                    var2.a(-2, -2, 16777215);
                    qn.c(4, 4, 0, 0, 540, 140);
                    var3++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                kq.field_P.b();
                var1.h(0, 0);
                rf.b(-18862);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "ng.V(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        L0: {
          if (this.field_n.c(false)) {
            this.field_n.f(0);
            break L0;
          } else {
            break L0;
          }
        }
        if (!this.field_y.c(false)) {
          if (param0 != -8) {
            return;
          } else {
            return;
          }
        } else {
          this.field_y.f(0);
          if (param0 != -8) {
            return;
          } else {
            return;
          }
        }
    }

    private final int E(int param0) {
        int var2 = this.n(-128);
        int var3 = this.field_n.c(26787);
        int var4 = this.field_l[5].field_A;
        int var5 = -var3 + -var4 + (this.field_q - -this.field_f);
        int var6 = -var2 + (var5 + param0);
        return var6;
    }

    final void g(int param0) {
        this.field_t = true;
        int var2 = -49 % ((param0 - 31) / 52);
    }

    private final void C(int param0) {
        this.c((byte) -4);
        this.m(0);
        this.f(param0 ^ -25718);
        if (param0 != -25621) {
          return;
        } else {
          this.f((byte) 120);
          return;
        }
    }

    final int b(int param0) {
        int var2 = -62 % ((param0 - -13) / 45);
        return this.field_o;
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (param3 != 0) {
          field_s = (String) null;
          this.C(param3 + -25621);
          this.v(-1);
          this.a((byte) 58, param4, param0);
          this.a(param2, param1, (byte) 16, param5);
          return;
        } else {
          this.C(param3 + -25621);
          this.v(-1);
          this.a((byte) 58, param4, param0);
          this.a(param2, param1, (byte) 16, param5);
          return;
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_k = this.field_h;
        this.field_w = this.field_g;
        if (!this.s(param0 ^ -8)) {
          if (this.b((byte) -105)) {
            var2 = this.field_h;
            var3 = this.field_g + this.field_h;
            if (qn.field_a > var2) {
              var3 = var3 + (-var2 + qn.field_a);
              if (qn.field_f < var3) {
                var3 = this.field_h - -this.field_g;
                if (qn.field_f < var3) {
                  var2 = var2 - (-qn.field_f + var3);
                  if (qn.field_a > var2) {
                    if (param0 != -4) {
                      return;
                    } else {
                      this.field_w = qn.field_f;
                      this.field_k = qn.field_a;
                      return;
                    }
                  } else {
                    var3 = qn.field_f;
                    this.field_k = var2;
                    this.field_w = var3 - var2;
                    return;
                  }
                } else {
                  if (param0 != -4) {
                    return;
                  } else {
                    this.field_w = qn.field_f;
                    this.field_k = qn.field_a;
                    return;
                  }
                }
              } else {
                var2 = qn.field_a;
                this.field_k = var2;
                this.field_w = var3 + -var2;
                return;
              }
            } else {
              var3 = this.field_h - -this.field_g;
              if (qn.field_f < var3) {
                var2 = var2 - (-qn.field_f + var3);
                if (qn.field_a > var2) {
                  if (param0 != -4) {
                    return;
                  } else {
                    this.field_w = qn.field_f;
                    this.field_k = qn.field_a;
                    return;
                  }
                } else {
                  var3 = qn.field_f;
                  this.field_k = var2;
                  this.field_w = var3 - var2;
                  return;
                }
              } else {
                if (param0 != -4) {
                  return;
                } else {
                  this.field_w = qn.field_f;
                  this.field_k = qn.field_a;
                  return;
                }
              }
            }
          } else {
            if (param0 != -4) {
              return;
            } else {
              this.field_w = qn.field_f;
              this.field_k = qn.field_a;
              return;
            }
          }
        } else {
          return;
        }
    }

    private final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_a;
        if (param0) {
          var3 = this.field_a - -this.field_d;
          if (qn.field_j <= var2) {
            if (qn.field_e < var3) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
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
        if (param0 != 3) {
          return;
        } else {
          var3 = var2 + this.i(param0 ^ 2);
          var4 = this.n(-116);
          var5 = var4 - -this.E(1);
          var6 = this.field_p;
          qn.b(this.field_j);
          qn.b(var4, var2, var5, var3);
          var4 = -var6 + var4;
          var2 = var2 - -this.field_e.field_H;
          var7 = this.d((byte) -85);
          var8 = this.field_m;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_z <= var8) {
                  break L2;
                } else {
                  var9 = this.field_A[var8];
                  var10 = this.field_b[0];
                  if (var11 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (var8 == this.field_u) {
                        var10 = this.field_b[1];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_e.b(var9, var4, var2, var10, -1);
                    var2 = var2 + var7;
                    var8++;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              qn.a(this.field_j);
              break L1;
            }
            return;
          }
        }
    }

    final static void x(int param0) {
        int var1 = 0;
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
          eu.field_g = null;
          hf.field_c = true;
          sb.field_i = null;
          var1 = 89 % ((param0 - -51) / 39);
          return;
        } else {
          eu.field_g = null;
          hf.field_c = true;
          sb.field_i = null;
          var1 = 89 % ((param0 - -51) / 39);
          return;
        }
    }

    final static void a(wk param0, int param1, wk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ds.field_a = new wk[op.field_c[param1].length];
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
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ng.MA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void c(int param0) {
        this.field_x = true;
        if (param0 <= 25) {
            return;
        }
    }

    private final void y(int param0) {
        this.d(124);
        this.t(param0);
    }

    private final void v(int param0) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_x) {
          if (!this.field_t) {
            return;
          } else {
            if (this.A(0)) {
              this.field_y.d(-97);
              if (param0 == -1) {
                if (!this.q(-87)) {
                  this.field_n.b((byte) -65);
                  if (var3 != 0) {
                    this.field_n.d(-124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_n.d(-124);
                  return;
                }
              } else {
                discarded$3 = this.s(100);
                if (!this.q(-87)) {
                  this.field_n.b((byte) -65);
                  if (var3 != 0) {
                    this.field_n.d(-124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_n.d(-124);
                  return;
                }
              }
            } else {
              this.field_y.b((byte) -65);
              if (var3 == 0) {
                if (param0 == -1) {
                  if (!this.q(-87)) {
                    this.field_n.b((byte) -65);
                    if (var3 == 0) {
                      return;
                    } else {
                      this.field_n.d(-124);
                      return;
                    }
                  } else {
                    this.field_n.d(-124);
                    return;
                  }
                } else {
                  discarded$4 = this.s(100);
                  if (!this.q(-87)) {
                    this.field_n.b((byte) -65);
                    if (var3 == 0) {
                      return;
                    } else {
                      this.field_n.d(-124);
                      return;
                    }
                  } else {
                    this.field_n.d(-124);
                    return;
                  }
                }
              } else {
                this.field_y.d(-97);
                if (param0 != -1) {
                  discarded$5 = this.s(100);
                  if (!this.q(-87)) {
                    this.field_n.b((byte) -65);
                    if (var3 != 0) {
                      this.field_n.d(-124);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_n.d(-124);
                    return;
                  }
                } else {
                  if (!this.q(-87)) {
                    this.field_n.b((byte) -65);
                    if (var3 == 0) {
                      return;
                    } else {
                      this.field_n.d(-124);
                      return;
                    }
                  } else {
                    this.field_n.d(-124);
                    return;
                  }
                }
              }
            }
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            this.field_e = param2;
            this.field_b = param3;
            this.field_i = param1;
            this.field_l = param0;
            this.field_n = new nb(this.field_i, this.field_b, 1);
            var9 = this.c(false);
            this.field_y = new nb(var9, this.field_b, 0);
            this.a((byte) 87, param4);
            this.a(param5, 94, param6);
            this.g(98);
            this.l(0);
            this.field_j = new int[4];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var8);
            stackOut_3_1 = new StringBuilder().append("ng.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = this.field_h;
        var4 = 40 / ((param0 - 15) / 45);
        var3 = this.field_h + this.field_g;
        if (var2 < qn.field_a) {
          var3 = var3 + (-var2 + qn.field_a);
          if (var3 > qn.field_f) {
            return false;
          } else {
            return true;
          }
        } else {
          var3 = this.field_g + this.field_h;
          if (qn.field_f < var3) {
            var2 = var2 - (var3 + -qn.field_f);
            if (qn.field_a <= var2) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackOut_3_0 = false;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = this.n(-60);
        var5 = this.k(-101);
        var6 = this.d((byte) -111);
        var8 = -30 / ((param1 - -89) / 32);
        var7 = this.E(1);
        var9 = this.field_m;
        L0: while (true) {
          if (this.field_z > var9) {
            stackOut_3_0 = mo.a(param0, var4, var5, param2, var7, (byte) -101, var6);
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var10 == 0) {
              if (!stackIn_5_0) {
                var5 = var5 + var6;
                var9++;
                continue L0;
              } else {
                return var9;
              }
            } else {
              return stackIn_4_0 ? 1 : 0;
            }
          } else {
            return -1;
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = this.d((byte) -111);
        var3 = this.field_r * var2;
        if (param0 < 118) {
          this.field_y = (nb) null;
          var4 = this.field_l[1].field_x - -this.field_l[7].field_x;
          var5 = this.field_y.c(26787);
          this.field_g = var3 + var4 + var5;
          return;
        } else {
          var4 = this.field_l[1].field_x - -this.field_l[7].field_x;
          var5 = this.field_y.c(26787);
          this.field_g = var3 + var4 + var5;
          return;
        }
    }

    static {
        field_s = "Spells to harm groups of units.";
    }
}
