/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends tc {
    private int field_n;
    static at field_u;
    private boolean field_p;
    private int field_t;
    private int field_q;
    private int field_k;
    static long field_s;
    jd field_r;
    private int field_o;
    private int field_m;
    static String field_l;

    final static me b(int param0, int param1) {
        me[] var2;
        int var3;
        int var4;
        me[] var5;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = uj.c((byte) 105);
        var2 = var5;
        var3 = param0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_b == param1) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(jd param0, int param1, int param2, int param3, int param4, ha param5) {
        String var7 = null;
        int var8 = 0;
        int var13 = 0;
        tu stackIn_3_0;
        String stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int[][] stackIn_3_4;
        tu stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int[][] stackIn_4_4 = null;
        int stackIn_4_5 = 0;
        tu stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int[][] stackIn_8_4;
        tu stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int[][] stackIn_9_4 = null;
        int stackIn_9_5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              uf.field_j.b();
              qn.b();
              fe.b(0, 0, 134, 61, io.field_m, nd.field_b, 0, 0);
              qt.field_e.b(2, 2);
              qn.b(5, 5, 124, 18, 0, 192);
              qn.b(5, 25, 30, 30, 0, 192);
              var7 = this.field_r.field_K;
              qn.f(5, param2, 95, 23);
              stackIn_3_0 = en.field_E;

              stackIn_3_1 = (String) (var7);

              stackIn_3_2 = 10 + -(this.field_q >> 1427297665);

              stackIn_3_3 = 17;

              stackIn_3_4 = op.field_c;

              if (param5.field_wb) {
                stackIn_4_0 = (tu) ((Object) stackIn_3_0);
                stackIn_4_1 = (String) ((Object) stackIn_3_1);
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = (int[][]) ((Object) stackIn_3_4);
                stackIn_4_5 = 1;
                break L1;
              } else {
                stackIn_4_0 = (tu) ((Object) stackIn_3_0);
                stackIn_4_1 = (String) ((Object) stackIn_3_1);
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = (int[][]) ((Object) stackIn_3_4);
                stackIn_4_5 = 0;
                break L1;
              }
            }
            L2: {
              ((tu) (Object) stackIn_4_0).b(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4[stackIn_4_5][this.field_r.field_O], -1);
              qn.a();
              var8 = this.field_r.g((byte) 122);
              if (-1 >= (var8 ^ -1)) {
                break L2;
              } else {
                var8 = 0;
                break L2;
              }
            }
            L3: {
              stackIn_8_0 = en.field_E;

              stackIn_8_1 = var8 + "/" + this.field_r.field_t;

              stackIn_8_2 = 126;

              stackIn_8_3 = 18;

              stackIn_8_4 = op.field_c;

              if (!param5.field_wb) {
                stackIn_9_0 = (tu) ((Object) stackIn_8_0);
                stackIn_9_1 = (String) ((Object) stackIn_8_1);
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = (int[][]) ((Object) stackIn_8_4);
                stackIn_9_5 = 0;
                break L3;
              } else {
                stackIn_9_0 = (tu) ((Object) stackIn_8_0);
                stackIn_9_1 = (String) ((Object) stackIn_8_1);
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = (int[][]) ((Object) stackIn_8_4);
                stackIn_9_5 = 1;
                break L3;
              }
            }
            L4: {
              ((tu) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4[stackIn_9_5][this.field_r.field_O], -1);
              if (param1 == this.field_r.field_O) {
                qn.b(99, 25, 30, 30, 0, 128);
                qn.b(53, 25, 30, 30, 0, 128);
                var9 = this.field_r.l(-27014);
                cp.field_e[eb.a((byte) -97, (var9 ^ -1) & 3)].a(56, 25);
                break L4;
              } else {
                if (param0 == null) {
                  qn.b(99, 25, 30, 30, 0, 128);
                  break L4;
                } else {
                  qn.b(37, 25, 92, 30, 0, 128);
                  ro.field_rb[param0.g(0)].a(43, 32);
                  sg.field_b[this.a(param0.g(0), this.field_r.g(param2 + -5), -46)].a(75, 32);
                  break L4;
                }
              }
            }
            L5: {
              ro.field_rb[this.field_r.g(0)].a(106, 32);
              en.field_E.c(-param5.a(param5.field_v * this.field_r.field_w + this.field_r.field_J, param2 + -9, this.field_r) + 100 + "%", 20, 45, 16777215, -1);
              vb.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
              so.field_b.a(param2 + 5600);
              var9 = this.field_k - param3 - 75;
              var10 = this.field_t - (param4 - -80);
              uf.field_j.e(var9, var10, -this.field_m + 32 << 481598755);
              var11 = bw.field_m[this.field_r.field_N][12];
              if (var11 == -1) {
                break L5;
              } else {
                bd.a(32 + -this.field_m << -2130959837, true, var9 - -96, e.field_b, 40, 60 + var10);
                if (var11 >= lb.field_e.length) {
                  break L5;
                } else {
                  lb.field_e[var11].a(var9 - -101, var10 + 58, -this.field_m + 32 << 856234691);
                  break L5;
                }
              }
            }
            L6: {
              var12 = this.field_r.f(param2 + 11);
              if ((var12 ^ -1) != 0) {
                bd.a(-this.field_m + 32 << -1954006365, true, var9, e.field_b, 40, var10 - -60);
                ii.field_a[var12].c(var9 + 8, 60 + var10, 24, 24, -this.field_m + 32 << -1500864733);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7_ref);

            stackIn_23_1 = new StringBuilder().append("fi.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = fk.field_d[param1][param0];
        var5 = fk.field_d[param0][param1];
        if (var5 < var4) {
          if ((-var5 + var4 ^ -1) < -46) {
            return 0;
          } else {
            return 1;
          }
        } else {
          if (param2 == -46) {
            if (var4 < var5) {
              if (45 < -var4 + var5) {
                return 4;
              } else {
                return 3;
              }
            } else {
              return 2;
            }
          } else {
            return 26;
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_u = null;
        if (param0 > -24) {
            field_s = 68L;
        }
    }

    final void a(byte param0, boolean param1) {
        int var4;
        ha var5;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1) {
            if (-1 > (this.field_m ^ -1)) {
              this.field_m = this.field_m - 4;
              break L0;
            } else {
              if (-1 <= (this.field_o ^ -1)) {
                break L0;
              } else {
                if (this.field_p) {
                  L1: {
                    if (this.field_q < this.field_o) {
                      this.field_q = this.field_q + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (this.field_q >= this.field_o) {
                    this.field_n = this.field_n - 1;
                    if ((this.field_n ^ -1) >= -1) {
                      this.field_n = 50;
                      this.field_p = false;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  L2: {
                    if (this.field_q <= 0) {
                      break L2;
                    } else {
                      this.field_q = this.field_q - 1;
                      break L2;
                    }
                  }
                  if (this.field_q > 0) {
                    break L0;
                  } else {
                    this.field_n = this.field_n - 1;
                    if (this.field_n <= 0) {
                      this.field_n = 50;
                      this.field_p = true;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          } else {
            L3: {
              if (-33 < (this.field_m ^ -1)) {
                this.field_m = this.field_m + 4;
                break L3;
              } else {
                break L3;
              }
            }
            if ((this.field_m ^ -1) > -33) {
              break L0;
            } else {
              this.d(108);
              break L0;
            }
          }
        }
        L4: {
          if (param0 <= -100) {
            break L4;
          } else {
            var5 = (ha) null;
            this.a((jd) null, -88, 39, -11, 35, (ha) null);
            break L4;
          }
        }
    }

    fi(jd param0, int param1, int param2) {
        try {
            this.field_k = param1;
            this.field_m = 32;
            this.field_p = false;
            this.field_q = 0;
            this.field_r = param0;
            this.field_t = param2;
            this.field_o = -110 + rs.field_n.a(this.field_r.field_K);
            if (this.field_o < 0) {
                this.field_o = 0;
            }
            this.field_n = 100;
            this.field_o = this.field_o << 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, boolean param5, int param6, ha param7, Random param8) {
        ne[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        ne[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_26_0;
        ne[] stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_0 = 0;
        ne[] stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        Object stackIn_31_0;
        ne[] stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        Object stackIn_32_0 = null;
        ne[] stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_35_0;
        ne[] stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        int stackIn_36_0 = 0;
        ne[] stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Random var14 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = -param0 + param4;
              var10 = -param3 + param6;
              if (param1 == 101) {
                break L1;
              } else {
                var14 = (Random) null;
                fi.a(-20, (byte) 51, -30, 104, -20, false, -76, (ha) null, (Random) null);
                break L1;
              }
            }
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var10 != var11) {
                      break L5;
                    } else {
                      if (var9_int == var12) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param7.field_Eb[var12 + param0 + (var11 - -param3) * param7.field_v] == null) {
                      break L6;
                    } else {
                      if (param7.field_Eb[var12 + (param0 - -((var11 - -param3) * param7.field_v))].field_h == param2) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (param7.field_Eb[param0 + var12 - -((var11 + param3) * param7.field_v)] == null) {
                      param7.field_Eb[param7.field_v * (var11 - -param3) + (param0 + var12)] = new ne(param2, param7);
                      break L7;
                    } else {
                      L8: {
                        if (-5 == (param7.field_Eb[param7.field_v * (var11 - -param3) + (var12 - -param0)].field_h ^ -1)) {
                          break L8;
                        } else {
                          if (6 != param7.field_Eb[(var11 + param3) * param7.field_v + (var12 + param0)].field_h) {
                            break L7;
                          } else {
                            if (!param5) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if ((param2 ^ -1) == -2) {
                        param7.field_Eb[(param3 + var11) * param7.field_v + var12 + param0] = new ne(10, param7);
                        break L7;
                      } else {
                        param7.field_Eb[(param3 + var11) * param7.field_v + param0 + var12] = new ne(param2, param7);
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (var9_int == var12) {
                      break L9;
                    } else {
                      L10: {
                        stackIn_22_0 = param7.field_Eb;

                        stackIn_22_1 = param7.field_v * (var11 - -param3) + (param0 + var12);

                        if (var9_int > 0) {
                          stackIn_23_0 = (ne[]) ((Object) stackIn_22_0);
                          stackIn_23_1 = stackIn_22_1;
                          stackIn_23_2 = 1;
                          break L10;
                        } else {
                          stackIn_23_0 = (ne[]) ((Object) stackIn_22_0);
                          stackIn_23_1 = stackIn_22_1;
                          stackIn_23_2 = -1;
                          break L10;
                        }
                      }
                      if (stackIn_23_0[stackIn_23_1 + stackIn_23_2] == null) {
                        break L9;
                      } else {
                        L11: {
                          stackIn_26_0 = param2;

                          stackIn_26_1 = param7.field_Eb;

                          stackIn_26_2 = param0;

                          stackIn_26_3 = var12;

                          if (-1 <= (var9_int ^ -1)) {
                            stackIn_27_0 = stackIn_26_0;
                            stackIn_27_1 = (ne[]) ((Object) stackIn_26_1);
                            stackIn_27_2 = stackIn_26_2;
                            stackIn_27_3 = stackIn_26_3;
                            stackIn_27_4 = -1;
                            break L11;
                          } else {
                            stackIn_27_0 = stackIn_26_0;
                            stackIn_27_1 = (ne[]) ((Object) stackIn_26_1);
                            stackIn_27_2 = stackIn_26_2;
                            stackIn_27_3 = stackIn_26_3;
                            stackIn_27_4 = 1;
                            break L11;
                          }
                        }
                        if (stackIn_27_0 == stackIn_27_1[stackIn_27_2 + (stackIn_27_3 + (stackIn_27_4 + param7.field_v * (var11 + param3)))].field_h) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L12: {
                    if (var10 == var11) {
                      break L12;
                    } else {
                      L13: {
                        stackIn_31_0 = null;

                        stackIn_31_1 = param7.field_Eb;

                        stackIn_31_2 = param7.field_v;

                        stackIn_31_3 = param3;

                        stackIn_31_4 = var11;

                        if (-1 > (var10 ^ -1)) {
                          stackIn_32_0 = stackIn_31_0;
                          stackIn_32_1 = (ne[]) ((Object) stackIn_31_1);
                          stackIn_32_2 = stackIn_31_2;
                          stackIn_32_3 = stackIn_31_3;
                          stackIn_32_4 = stackIn_31_4;
                          stackIn_32_5 = 1;
                          break L13;
                        } else {
                          stackIn_32_0 = stackIn_31_0;
                          stackIn_32_1 = (ne[]) ((Object) stackIn_31_1);
                          stackIn_32_2 = stackIn_31_2;
                          stackIn_32_3 = stackIn_31_3;
                          stackIn_32_4 = stackIn_31_4;
                          stackIn_32_5 = -1;
                          break L13;
                        }
                      }
                      if (stackIn_32_0 == stackIn_32_1[stackIn_32_2 * (stackIn_32_3 + (stackIn_32_4 + stackIn_32_5)) + param0 + var12]) {
                        break L12;
                      } else {
                        L14: {
                          stackIn_35_0 = param2 ^ -1;

                          stackIn_35_1 = param7.field_Eb;

                          stackIn_35_2 = var12 + param0;

                          stackIn_35_3 = param7.field_v;

                          if (var10 > 0) {
                            stackIn_36_0 = stackIn_35_0;
                            stackIn_36_1 = (ne[]) ((Object) stackIn_35_1);
                            stackIn_36_2 = stackIn_35_2;
                            stackIn_36_3 = stackIn_35_3;
                            stackIn_36_4 = 1;
                            break L14;
                          } else {
                            stackIn_36_0 = stackIn_35_0;
                            stackIn_36_1 = (ne[]) ((Object) stackIn_35_1);
                            stackIn_36_2 = stackIn_35_2;
                            stackIn_36_3 = stackIn_35_3;
                            stackIn_36_4 = -1;
                            break L14;
                          }
                        }
                        if (stackIn_36_0 != (stackIn_36_1[stackIn_36_2 - -(stackIn_36_3 * (stackIn_36_4 + param3 + var11))].field_h ^ -1)) {
                          break L12;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L15: {
                    if ((-var12 + var9_int ^ -1) >= -1) {
                      stackIn_41_0 = -(var9_int + -var12);
                      break L15;
                    } else {
                      stackIn_41_0 = -var12 + var9_int;
                      break L15;
                    }
                  }
                  L16: {


                    stackIn_43_1 = 0;

                    if (-var11 + var10 <= 0) {

                      stackIn_44_1 = stackIn_43_1;
                      stackIn_44_2 = -(var10 - var11);
                      break L16;
                    } else {

                      stackIn_44_1 = stackIn_43_1;
                      stackIn_44_2 = var10 - var11;
                      break L16;
                    }
                  }
                  L17: {






                    if (-var12 + var9_int > 0) {



                      stackIn_47_3 = var9_int + -var12;
                      break L17;
                    } else {



                      stackIn_47_3 = -(var9_int - var12);
                      break L17;
                    }
                  }
                  L18: {
                    if (stackIn_41_0 <= ns.a(stackIn_44_1 != 0, stackIn_44_2 + stackIn_47_3, param8)) {
                      break L18;
                    } else {
                      if (var12 == var9_int) {
                        break L18;
                      } else {
                        L19: {
                          stackIn_51_0 = var12;

                          if (0 >= var9_int) {
                            stackIn_52_0 = stackIn_51_0;
                            stackIn_52_1 = -1;
                            break L19;
                          } else {
                            stackIn_52_0 = stackIn_51_0;
                            stackIn_52_1 = 1;
                            break L19;
                          }
                        }
                        var12 = stackIn_52_0 + stackIn_52_1;
                        continue L2;
                      }
                    }
                  }
                  if (var11 != var10) {
                    L20: {
                      stackIn_57_0 = var11;

                      if ((var10 ^ -1) >= -1) {
                        stackIn_58_0 = stackIn_57_0;
                        stackIn_58_1 = -1;
                        break L20;
                      } else {
                        stackIn_58_0 = stackIn_57_0;
                        stackIn_58_1 = 1;
                        break L20;
                      }
                    }
                    var11 = stackIn_58_0 + stackIn_58_1;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var9 = decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var9);

            stackIn_62_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L21;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_65_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');

            if (param8 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L22;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L22;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_63_0), stackIn_66_2 + ')');
        }
    }

    static {
        field_u = new at();
        field_l = "Rock";
    }
}
