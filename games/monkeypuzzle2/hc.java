/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    le[] field_e;
    private int field_i;
    private int field_c;
    private int field_b;
    private boolean field_d;
    static int[][] field_h;
    private int field_f;
    le field_a;
    private int field_g;

    public static void a(byte param0) {
        if (param0 != -105) {
            field_h = (int[][]) null;
            field_h = (int[][]) null;
            return;
        }
        field_h = (int[][]) null;
    }

    final void a(int param0, ak param1, int param2, int param3, we param4, hc param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_d) {
                break L1;
              } else {
                param5.a(param1, param4, (byte) -2, param2, param0);
                param5.a(0);
                break L1;
              }
            }
            L2: {
              if (this.field_g != -2147483648) {
                param5.field_g = this.field_g;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_b < -1) {
                break L3;
              } else {
                param5.field_b = this.field_b;
                break L3;
              }
            }
            L4: {
              if (-2147483648 == this.field_i) {
                break L4;
              } else {
                param5.field_i = this.field_i;
                break L4;
              }
            }
            L5: {
              if ((this.field_f ^ -1) > 0) {
                break L5;
              } else {
                param5.field_f = this.field_f;
                break L5;
              }
            }
            L6: {
              if (null == this.field_a) {
                break L6;
              } else {
                param5.field_a = this.field_a;
                break L6;
              }
            }
            L7: {
              if (-2147483648 != this.field_c) {
                param5.field_c = this.field_c;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_e == null) {
                break L8;
              } else {
                param5.field_e = this.field_e;
                break L8;
              }
            }
            if (param3 > 75) {
              break L0;
            } else {
              this.b(-78, 124);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("hc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
    }

    final static void a(byte param0, gk param1) {
        int var2_int = 0;
        if (param0 != 82) {
            return;
        }
        try {
            qd.field_a = param1.j(param0 + 17195) << 97417317;
            var2_int = param1.a((byte) 114);
            qd.field_a = qd.field_a + (var2_int >> 734231587);
            de.field_m = (7 & var2_int) << 47589970;
            de.field_m = de.field_m + (param1.j(17277) << -178392830);
            var2_int = param1.a((byte) 114);
            lk.field_a = (var2_int & 63) << 17988687;
            de.field_m = de.field_m + (var2_int >> -383800538);
            lk.field_a = lk.field_a + (param1.a((byte) 114) << 130758823);
            var2_int = param1.a((byte) 114);
            mk.field_i = 65536 & var2_int << 215650672;
            lk.field_a = lk.field_a + (var2_int >> -1104658463);
            mk.field_i = mk.field_i + param1.j(17277);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final hc a(int param0, int param1) {
        if (param1 != 215650672) {
            this.a((byte) 54, true);
            this.field_g = param0;
            return (hc) (this);
        }
        this.field_g = param0;
        return (hc) (this);
    }

    final static void a(long param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            if (param1 == -50) {
              try {
                L0: {
                  Thread.sleep(param0);
                  break L0;
                }
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var3 = (InterruptedException) (Object) decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hc a(int param0, byte param1) {
        if (param1 != -3) {
            hc.a((byte) 54);
            this.field_f = param0;
            return (hc) (this);
        }
        this.field_f = param0;
        return (hc) (this);
    }

    final hc a(int param0, le[] param1) {
        RuntimeException var3 = null;
        hc var4 = null;
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
              this.field_e = param1;
              if (param0 == -20433) {
                break L1;
              } else {
                var4 = (hc) null;
                this.a(-59, (hc) null);
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

            stackIn_6_1 = new StringBuilder().append("hc.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (hc) (this);
    }

    final void a(ak param0, we param1, byte param2, int param3, int param4) {
        ta stackIn_21_0;
        String stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        ta stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              lb.a(param4 - -param1.field_r, param1.field_l, (byte) -120, this.field_e, param1.field_e + param3, param1.field_p);
              if (this.field_a != null) {
                L2: {
                  var6_int = param1.field_r + (param4 + this.field_i);
                  var7 = param3 - -param1.field_e - -this.field_g;
                  if (1 != param0.field_l) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param1.field_l - this.field_a.field_m) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (param0.field_l == 2) {
                    var6_int = var6_int + (param1.field_l - this.field_a.field_m);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((param0.field_o ^ -1) == -2) {
                    var7 = var7 + (param1.field_p - this.field_a.field_n) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_o != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param1.field_p + -this.field_a.field_n);
                    break L5;
                  }
                }
                this.field_a.c(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param2 == -2) {
                break L6;
              } else {
                this.field_g = 99;
                break L6;
              }
            }
            L7: {
              var6 = param0.c(param1, param2 ^ 775);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param0.field_p) {
                  break L7;
                } else {
                  if (this.field_f >= 0) {
                    L8: {
                      stackIn_21_0 = param0.field_p;

                      stackIn_21_1 = (String) (var6);

                      stackIn_21_2 = param4;

                      stackIn_21_3 = -param1.field_r;

                      stackIn_21_4 = param0.field_h;

                      if (this.field_i == -2147483648) {
                        stackIn_22_0 = (ta) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = 0;
                        break L8;
                      } else {
                        stackIn_22_0 = (ta) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = this.field_i;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_24_2 = stackIn_22_2 - (stackIn_22_3 - (stackIn_22_4 - -stackIn_22_5));

                      stackIn_24_3 = param1.field_e;

                      stackIn_24_4 = param3;

                      stackIn_24_5 = -param0.field_n;

                      if ((this.field_g ^ -1) != 2147483647) {
                        stackIn_22_0 = (ta) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = this.field_g;
                        break L9;
                      } else {
                        stackIn_22_0 = (ta) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_27_3 = stackIn_25_3 + (stackIn_25_4 - (stackIn_25_5 + -stackIn_25_6));

                      stackIn_27_4 = -param0.field_g + (-param0.field_h + param1.field_l);

                      stackIn_27_5 = -param0.field_b + -param0.field_n + param1.field_p;

                      stackIn_27_6 = this.field_f;

                      stackIn_27_7 = this.field_b;

                      if (this.field_c != -2147483648) {
                        stackIn_22_0 = (ta) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = this.field_c;
                        break L10;
                      } else {
                        stackIn_22_0 = (ta) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = 256;
                        break L10;
                      }
                    }
                    ((ta) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_l, param0.field_o, param0.field_a);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("hc.K(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final hc b(int param0, int param1) {
        if (param0 < 117) {
            return (hc) null;
        }
        this.field_i = param1;
        return (hc) (this);
    }

    final hc a(boolean param0, int param1) {
        if (!param0) {
            return (hc) null;
        }
        this.field_b = param1;
        return (hc) (this);
    }

    final void a(int param0, hc param1) {
        try {
            param1.field_d = this.field_d;
            param1.field_g = this.field_g;
            param1.field_f = this.field_f;
            param1.field_c = this.field_c;
            int var3_int = 120 % ((-3 - param0) / 51);
            param1.field_a = this.field_a;
            param1.field_e = this.field_e;
            param1.field_i = this.field_i;
            param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final hc a(byte param0, boolean param1) {
        if (param0 != -48) {
            return (hc) null;
        }
        this.field_d = param1 ? true : false;
        return (hc) (this);
    }

    final void a(int param0) {
        this.field_i = param0;
        this.field_g = 0;
        this.field_e = null;
        this.field_f = 0;
        this.field_a = null;
        this.field_b = -1;
        this.field_c = 256;
    }

    hc() {
        this.field_i = -2147483648;
        this.field_b = -2;
        this.field_e = null;
        this.field_d = false;
        this.field_a = null;
        this.field_f = -2;
        this.field_g = -2147483648;
        this.field_c = -2147483648;
    }

    static {
        field_h = new int[][]{new int[]{101, 121}, new int[]{485, 72}, new int[]{522, 374}, new int[]{219, 364}};
    }
}
