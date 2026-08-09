/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[][] field_g;
    private int field_b;
    static ea[] field_a;
    private int field_h;
    static int field_f;
    private boolean field_l;
    private int field_k;
    private int field_c;
    ea field_e;
    static ml[] field_i;
    private int field_j;
    ea[] field_d;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        wb var5 = null;
        lc var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5 = (wb) ((Object) hj.field_k.b(102));
            L1: while (true) {
              if (var5 == null) {
                var3 = -120 % ((14 - param0) / 44);
                var6 = (lc) ((Object) sj.field_g.b(77));
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    lc.a((byte) 126, param1, var6);
                    var6 = (lc) ((Object) sj.field_g.b((byte) 56));
                    continue L2;
                  }
                }
              } else {
                ab.a(-20680, param1, var5);
                var5 = (wb) ((Object) hj.field_k.b((byte) 56));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "nb.B(" + param0 + ',' + param1 + ')');
        }
    }

    final nb b(int param0, boolean param1) {
        this.field_j = param0;
        if (!param1) {
            return (nb) null;
        }
        return (nb) (this);
    }

    final void a(int param0, fe param1, on param2, int param3, int param4) {
        we stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        we stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              g.a(param1.field_t + param3, param1.field_q, param0 - -param1.field_u, param1.field_v, (byte) 55, this.field_d);
              if (null != this.field_e) {
                L2: {
                  var6_int = param1.field_u + (param0 + this.field_c);
                  var7_int = this.field_k + (param1.field_t + param3);
                  if (param2.field_j != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param1.field_v + -this.field_e.field_x) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (param2.field_d == 1) {
                    var7_int = var7_int + (-this.field_e.field_A + param1.field_q) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 == param2.field_j) {
                    var6_int = var6_int + (-this.field_e.field_x + param1.field_v);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param2.field_d) {
                    var7_int = var7_int + (-this.field_e.field_A + param1.field_q);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_e.f(var6_int, var7_int);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6_int = -22 / ((param4 - -35) / 61);
              var7 = param2.a(param1, (byte) -115);
              if (var7 == null) {
                break L6;
              } else {
                if (param2.field_k == null) {
                  break L6;
                } else {
                  if (-1 < (this.field_h ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_19_0 = param2.field_k;

                      stackIn_19_1 = (String) (var7);

                      stackIn_19_2 = param1.field_u + param0 - -param2.field_n;

                      if (-2147483648 != this.field_c) {
                        stackIn_20_0 = (we) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = this.field_c;
                        break L7;
                      } else {
                        stackIn_20_0 = (we) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = 0;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_22_2 = stackIn_20_2 + stackIn_20_3;

                      stackIn_22_3 = param1.field_t + param3;

                      stackIn_22_4 = param2.field_c;

                      if (-2147483648 == this.field_k) {
                        stackIn_20_0 = (we) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = stackIn_22_4;
                        stackIn_23_5 = 0;
                        break L8;
                      } else {
                        stackIn_20_0 = (we) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = stackIn_22_4;
                        stackIn_23_5 = this.field_k;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_25_3 = stackIn_23_3 + (stackIn_23_4 + stackIn_23_5);

                      stackIn_25_4 = -param2.field_i + (param1.field_v + -param2.field_n);

                      stackIn_25_5 = param1.field_q + -param2.field_c - param2.field_l;

                      stackIn_25_6 = this.field_h;

                      stackIn_25_7 = this.field_j;

                      if (2147483647 == (this.field_b ^ -1)) {
                        stackIn_20_0 = (we) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = 256;
                        break L9;
                      } else {
                        stackIn_20_0 = (we) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = this.field_b;
                        break L9;
                      }
                    }
                    ((we) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param2.field_j, param2.field_d, param2.field_e);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var6);

            stackIn_30_1 = new StringBuilder().append("nb.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final nb a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != -13903) {
          L0: {
            this.a(-40, (byte) 105);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((nb) (this)).field_l = stackIn_8_1 != 0;
          return (nb) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((nb) (this)).field_l = stackIn_4_1 != 0;
          return (nb) (this);
        }
    }

    final nb a(ea[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              if (param1 == 7392) {
                break L1;
              } else {
                this.b(64, false);
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("nb.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (nb) (this);
    }

    final void a(nb param0, byte param1) {
        try {
            param0.field_c = this.field_c;
            param0.field_h = this.field_h;
            param0.field_k = this.field_k;
            param0.field_l = this.field_l;
            int var3_int = -79 % ((-91 - param1) / 32);
            param0.field_b = this.field_b;
            param0.field_d = this.field_d;
            param0.field_e = this.field_e;
            param0.field_j = this.field_j;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "nb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nb a(int param0, byte param1) {
        if (param1 >= -32) {
            return (nb) null;
        }
        this.field_k = param0;
        return (nb) (this);
    }

    final nb b(int param0, byte param1) {
        if (param1 != -93) {
            return (nb) null;
        }
        this.field_c = param0;
        return (nb) (this);
    }

    final void b(int param0) {
        this.field_j = param0;
        this.field_b = 256;
        this.field_k = 0;
        this.field_c = 0;
        this.field_e = null;
        this.field_h = 0;
        this.field_d = null;
    }

    final void a(int param0, fe param1, on param2, nb param3, int param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_l) {
                break L1;
              } else {
                param3.a(param5, param1, param2, param4, param0 + -14206);
                param3.b(param0 ^ -14098);
                break L1;
              }
            }
            L2: {
              if (param0 == 14097) {
                break L2;
              } else {
                this.field_d = (ea[]) null;
                break L2;
              }
            }
            L3: {
              if (this.field_k == -2147483648) {
                break L3;
              } else {
                param3.field_k = this.field_k;
                break L3;
              }
            }
            L4: {
              if (-1 <= this.field_h) {
                param3.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_d) {
                param3.field_d = this.field_d;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == this.field_e) {
                break L6;
              } else {
                param3.field_e = this.field_e;
                break L6;
              }
            }
            L7: {
              if (2147483647 != (this.field_b ^ -1)) {
                param3.field_b = this.field_b;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_j ^ -1) <= 0) {
                param3.field_j = this.field_j;
                break L8;
              } else {
                break L8;
              }
            }
            if (2147483647 != (this.field_c ^ -1)) {
              param3.field_c = this.field_c;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("nb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_g = (int[][]) null;
        field_i = null;
        if (param0 != 19) {
            nb.a((byte) -93, 97);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final nb a(int param0, int param1) {
        this.field_h = param1;
        if (param0 <= 63) {
            nb.a((byte) 61, -107);
            return (nb) (this);
        }
        return (nb) (this);
    }

    nb() {
        this.field_l = false;
        this.field_b = -2147483648;
        this.field_e = null;
        this.field_h = -2;
        this.field_k = -2147483648;
        this.field_c = -2147483648;
        this.field_j = -2;
        this.field_d = null;
    }

    static {
        field_g = new int[][]{new int[]{6, 7, 0, 2, 3, 9, 11, 1, 5, 8, 14, 4, 10, 12, 13}, new int[]{6, 7, 16, 0, 2, 3, 11, 5, 1, 19, 18, 17, 4, 9, 8, 14, 20, 15, 12, 13}};
        field_f = 0;
    }
}
