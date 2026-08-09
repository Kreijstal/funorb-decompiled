/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends ch {
    private int field_P;
    static String field_S;
    boolean field_R;
    static int field_V;
    static int field_Q;
    static so field_U;
    private lq field_T;
    static String field_O;
    static String field_N;

    public static void h(int param0) {
        field_N = null;
        if (param0 != -1) {
            int[] var2 = (int[]) null;
            oe.a(false, (int[]) null);
        }
        field_O = null;
        field_U = null;
        field_S = null;
    }

    private final int a(int param0) {
        if (param0 >= -65) {
            return -39;
        }
        return !this.field_R ? 0 : this == this.field_T.j(117) ? 256 : 0;
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(boolean param0, int param1) {
        ff.a(0, param0);
        if (!(null == kk.field_B)) {
            pp.a(kk.field_B, 1259627265);
        }
        if (param1 != 1) {
            int[] var3 = (int[]) null;
            oe.a(true, (int[]) null);
        }
    }

    boolean g(byte param0) {
        int var2;
        int var3;
        int stackIn_11_0 = 0;
        L0: {
          if (param0 == -20) {
            break L0;
          } else {
            field_N = (String) null;
            break L0;
          }
        }
        L1: {
          var2 = this.a(-69);
          var3 = -this.field_P + var2;
          if (var3 <= 0) {
            break L1;
          } else {
            this.field_P = this.field_P + (8 + var3 - 1) / 8;
            break L1;
          }
        }
        L2: {
          if (0 <= var3) {
            break L2;
          } else {
            this.field_P = this.field_P + (1 + (var3 + -16)) / 16;
            break L2;
          }
        }
        L3: {
          L4: {
            if (this.field_P != 0) {
              break L4;
            } else {
              if (0 != var2) {
                break L4;
              } else {
                if (this.field_R) {
                  break L4;
                } else {
                  stackIn_11_0 = 1;
                  break L3;
                }
              }
            }
          }
          stackIn_11_0 = 0;
          break L3;
        }
        return stackIn_11_0 != 0;
    }

    boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              this.field_P = this.a(-82);
              if (0 != this.field_P) {
                break L1;
              } else {
                if (this.field_R) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static int a(bf[] param0, int param1, pq[] param2, int[][] param3, int param4) {
        int stackIn_17_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sa var7 = null;
        int var7_int = 0;
        pq var8 = null;
        int var8_int = 0;
        pq var9 = null;
        int var10 = 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param4;
            L1: while (true) {
              if (var6 >= param2.length) {
                if (var5_int == 0) {
                  stackIn_37_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var10 = 0;
                  var6 = var10;
                  L2: while (true) {
                    if (var5_int <= var10) {
                      stackIn_61_0 = param1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var7 = kj.field_g[var10];
                        param1 = var7.field_u;
                        var8 = param2[var7.field_n];
                        if (-1 != var7.field_i) {
                          L4: {
                            if (var7.field_n != 0) {
                              break L4;
                            } else {
                              if (-1 == hb.field_s) {
                                hb.field_s = var7.field_i;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if ((33554432L & pd.field_i) == 0L) {
                              break L5;
                            } else {
                              System.out.println("Bounce ball " + var7.field_n + " and ball " + var7.field_i + " at time " + Integer.toString(var7.field_u, 16));
                              break L5;
                            }
                          }
                          var9 = param2[var7.field_i];
                          ok.a(var7.field_u, var8, var9, (byte) 105);
                          if (var8.field_q != null) {
                            var8.field_q.a(param2, (int) var7.field_i, param4 + -5);
                            break L3;
                          } else {
                            if (var9.field_q == null) {
                              break L3;
                            } else {
                              var9.field_q.a(param2, (int) var7.field_n, -5);
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (-1 != var7.field_x) {
                          var8.field_c = var8.field_c + 1;
                          sm.a(var7.field_u, param0[var7.field_x], 117, var8);
                          if (null == var8.field_q) {
                            break L6;
                          } else {
                            var8.field_q.a((int) var7.field_x, -26401, var8);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var7.field_a == -1) {
                          break L7;
                        } else {
                          var8.field_c = var8.field_c + 1;
                          dk.a(param3[var7.field_a][0], (byte) -20, var7.field_u, var8, param3[var7.field_a][1]);
                          if (var8.field_q == null) {
                            break L7;
                          } else {
                            var8.field_q.a(var8, (int) var7.field_a, (byte) 5);
                            break L7;
                          }
                        }
                      }
                      var10++;
                      continue L2;
                    }
                  }
                }
              } else {
                L8: {
                  if (param2[var6].field_s) {
                    var7_int = var6 + 1;
                    L9: while (true) {
                      if (var7_int >= param2.length) {
                        if (0 == param2[var6].field_v) {
                          break L8;
                        } else {
                          var7_int = 0;
                          L10: while (true) {
                            if (var7_int >= param0.length) {
                              var7_int = 0;
                              L11: while (true) {
                                if (var7_int >= param3.length) {
                                  break L8;
                                } else {
                                  var8_int = j.a(param2[var6].field_k, param3[var7_int][0], param2[var6].field_I, param2[var6].field_t, param2[var6].field_w, 8, param2[var6].field_g, (byte) -121, param3[var7_int][1]);
                                  if (var8_int > param1) {
                                    var5_int = bq.a((byte) -123, var5_int, var7_int, -1, -1, var6, var8_int);
                                    var7_int++;
                                    continue L11;
                                  } else {
                                    var7_int++;
                                    continue L11;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                var8_int = c.a(param2[var6].field_w, param0[var7_int].field_f, param2[var6].field_k, param0[var7_int].field_j, param2[var6].field_t, param2[var6].field_g, 8, param0[var7_int].field_l, (byte) 98, param0[var7_int].field_a, param2[var6].field_I);
                                if (param1 < var8_int) {
                                  var5_int = bq.a((byte) -128, var5_int, -1, -1, var7_int, var6, var8_int);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var7_int++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        L13: {
                          if (param2[var7_int].field_s) {
                            L14: {
                              if (param2[var6].field_v != 0) {
                                break L14;
                              } else {
                                if (0 != param2[var7_int].field_v) {
                                  break L14;
                                } else {
                                  var7_int++;
                                  continue L9;
                                }
                              }
                            }
                            var8_int = no.a(param2[var7_int].field_t, param2[var6].field_w, param2[var7_int].field_I, param2[var7_int].field_w, param2[var6].field_I, param2[var7_int].field_k, param2[var6].field_t, param2[var7_int].field_g, 8, param2[var6].field_g, param2[var6].field_k, -1);
                            if (param1 < var8_int) {
                              L15: {
                                if (param2[var6].field_w < param2[var7_int].field_w) {
                                  stackIn_17_0 = param2[var7_int].field_w;
                                  break L15;
                                } else {
                                  stackIn_17_0 = param2[var6].field_w;
                                  break L15;
                                }
                              }
                              if (stackIn_17_0 <= var8_int) {
                                var5_int = bq.a((byte) -124, var5_int, -1, var7_int, -1, var6, var8_int);
                                break L13;
                              } else {
                                var7_int++;
                                continue L9;
                              }
                            } else {
                              var7_int++;
                              continue L9;
                            }
                          } else {
                            break L13;
                          }
                        }
                        var7_int++;
                        continue L9;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var5);

            stackIn_64_1 = new StringBuilder().append("oe.BC(");

            if (param0 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L16;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L17;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param3 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L18;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_65_0), stackIn_71_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_37_0;
        } else {
          return stackIn_61_0;
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param1 != 31936) {
            discarded$0 = this.a(87);
        }
        this.a(param2, -param2 + nk.field_j >> -2016834047, param0, false, md.field_b + -param0 >> 152102657);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        if (-1 == (this.field_P ^ -1)) {
          return;
        } else {
          if (256 > this.field_P) {
            L0: {
              L1: {
                if (ad.field_y == null) {
                  break L1;
                } else {
                  if (ad.field_y.field_z < this.field_l) {
                    break L1;
                  } else {
                    if (this.field_y > ad.field_y.field_A) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              ad.field_y = new dd(this.field_l, this.field_y);
              break L0;
            }
            kj.a(117, ad.field_y);
            qh.d();
            this.a(0, 0, 260);
            super.a(param0, (byte) 48, -this.field_C + -param2, -this.field_D + -param3);
            oc.a(117);
            ad.field_y.a(this.field_C + param2, param3 - -this.field_D, this.field_P);
            var5 = 121 / ((param1 - -42) / 53);
            return;
          } else {
            if (-1 != (param0 ^ -1)) {
              return;
            } else {
              this.a(param2 + this.field_C, param3 + this.field_D, 260);
              super.a(param0, (byte) 70, param2, param3);
              return;
            }
          }
        }
    }

    oe(lq param0, int param1, int param2) {
        super(-param1 + nk.field_j >> -764801279, -param2 + md.field_b >> 454206785, param1, param2, (fp) null);
        try {
            this.field_T = param0;
            this.field_P = 0;
            this.field_R = false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (int[]) null;
                oe.a(true, (int[]) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= 8) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1[var2_int] == 0) {
                  var2_int++;
                  continue L2;
                } else {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("oe.CC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final ei f(byte param0) {
        int var2 = 69 / ((param0 - 51) / 61);
        ei var3 = super.f((byte) 123);
        if (!(var3 == null)) {
            return var3;
        }
        return (ei) (this);
    }

    static {
        field_V = 0;
        field_O = "You are not currently logged in to the game.";
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_S = "Blues";
        field_Q = 250;
    }
}
