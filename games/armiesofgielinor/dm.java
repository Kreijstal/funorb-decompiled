/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    private ft field_C;
    private int field_A;
    private ft field_B;
    private String field_U;
    private int[] field_j;
    private int field_h;
    private int field_Q;
    static String field_O;
    private int field_l;
    static String field_d;
    private ft field_q;
    static String field_x;
    private ft field_g;
    private int field_n;
    private int field_G;
    private int field_f;
    private ft field_m;
    private int field_u;
    private int field_z;
    private int field_r;
    private boolean field_y;
    private int field_b;
    private ft field_c;
    private ft[] field_T;
    private int field_F;
    int[] field_N;
    private int field_p;
    private String field_R;
    private int field_e;
    static int field_D;
    private int field_I;
    private int field_P;
    private ft field_S;
    private int field_L;
    private ft[] field_i;
    private int field_M;
    private ft field_s;
    private ft field_k;
    private ft field_J;
    private int field_E;
    private ft field_a;
    private String[] field_t;
    private int field_o;
    private ft field_w;
    private int field_K;
    private boolean field_v;

    private final int d(boolean param0) {
        if (!param0) {
            this.field_i = (ft[]) null;
        }
        return (nr.field_e.field_y >> 673949441) + -nr.field_e.field_L + (nr.field_e.field_v + -nr.field_e.field_H - -3);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.b(true);
        param0 = (this.field_q.field_k + -var7 >> 57131457) + param0;
        this.field_u = param0;
        param3 = param0 + var7;
        param0 = param3 + -this.e(-119);
        var7 = 0;
        int var8 = -this.field_n + param5;
        if (param4 != 7) {
            return;
        }
        var7 = 33;
        int var9 = 0;
        param0 = (this.field_f + var7) * var8 + param0;
        var9 = 33;
        param2 = param2 - -(this.field_q.field_n + -var9 >> 1653895297);
        param3 = var7 + param0;
        param1 = var9 + param2;
        this.field_i[param5] = new ft(param0, param2);
        this.field_T[param5] = new ft(param3, param1);
    }

    final void d(byte param0) {
        if (param0 != -73) {
            return;
        }
        this.e(false);
        this.b(param0 + 18742);
        this.k(param0 + 106);
        this.f((byte) 66);
        this.c(0);
    }

    private final void a(int param0, boolean param1, ft param2, int param3, ft param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param4 == null) {
                  break L1;
                } else {
                  L2: {
                    if (param0 >= this.field_n) {
                      break L2;
                    } else {
                      if (this.field_h < param0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var6_int = param0 + -this.field_n;
                    if (lt.field_i == null) {
                      break L3;
                    } else {
                      if (-1 < (var6_int ^ -1)) {
                        break L3;
                      } else {
                        if (lt.field_i.length <= var6_int) {
                          break L3;
                        } else {
                          var7 = lt.field_i[var6_int];
                          if (param3 > 36) {
                            L4: {
                              var7.f(db.a(true, param2.field_k), u.a(param2.field_n, (byte) 94));
                              var8 = 0;
                              if (this.field_K == var6_int) {
                                var8 = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (var8 != 0) {
                                break L5;
                              } else {
                                if (param1) {
                                  break L5;
                                } else {
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                            L6: {
                              var9 = this.field_G;
                              if (var8 == 0) {
                                break L6;
                              } else {
                                var9 = this.field_F;
                                break L6;
                              }
                            }
                            var10 = 0;
                            L7: while (true) {
                              if (this.field_L <= var10) {
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                qn.b(db.a(true, param2.field_k - -var10), u.a(var10 + param2.field_n, (byte) 94), -(var10 << -793249663) + (param4.field_k + -param2.field_k), -param2.field_n + (param4.field_n + -(var10 << 1084326849)), var9);
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("dm.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_J != null) {
            if (!(this.field_w != null)) {
                return;
            }
            if (param0) {
                return;
            }
            var2 = this.field_J.field_k;
            var3 = this.field_J.field_n;
            var4 = this.field_w.field_k + -var2;
            var5 = this.field_w.field_n + -var3;
            if (0 != var4) {
                if (var5 == 0) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, this.field_Q, this.field_p);
                return;
            }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int discarded$0 = 0;
        if (this.field_s != null) {
            if (!(this.field_k != null)) {
                return;
            }
            var2 = this.field_s.field_k;
            var3 = this.field_s.field_n;
            var4 = this.field_k.field_k + -var2;
            var5 = this.field_k.field_n - var3;
            if (var4 != 0) {
                if (!(var5 != 0)) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, this.field_Q, this.field_p);
                if (param0 != 33) {
                    discarded$0 = this.d(true);
                }
                return;
            }
        }
    }

    private final void d(int param0) {
        this.field_J = new ft(25, 33);
        if (param0 != 7) {
            return;
        }
        this.field_w = new ft(614, 446);
        this.field_A = 0;
        this.field_P = 16777215;
        this.field_b = 192;
        this.field_Q = 0;
        this.field_p = 128;
    }

    final int b(boolean param0, int param1) {
        ft var3;
        L0: {
          if (this.field_T == null) {
            break L0;
          } else {
            if (-1 < (param1 ^ -1)) {
              break L0;
            } else {
              if (param1 < this.field_T.length) {
                if (param0) {
                  L1: {
                    var3 = this.field_T[param1];
                    if (var3 == null) {
                      break L1;
                    } else {
                      if (-1 < (var3.field_k ^ -1)) {
                        break L1;
                      } else {
                        return db.a(true, var3.field_k);
                      }
                    }
                  }
                  return 1;
                } else {
                  return 39;
                }
              } else {
                return 1;
              }
            }
          }
        }
        return 1;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        L0: {
          if (param5) {
            L1: {
              if (-1 != (4 & param4 ^ -1)) {
                tb.a(param5, param3, true, param2, (byte) -33, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (-1 != (2 & param4 ^ -1)) {
              tb.a(param5, param3, false, param2, (byte) -33, param0);
              break L0;
            } else {
              break L0;
            }
          } else {
            L2: {
              if (0 != (param4 & 1)) {
                tb.a(param5, param3, false, param2, (byte) -33, param0);
                break L2;
              } else {
                break L2;
              }
            }
            if ((8 & param4) == 0) {
              break L0;
            } else {
              tb.a(param5, param3, true, param2, (byte) -33, param0);
              break L0;
            }
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            dm.c((byte) -56);
            break L3;
          }
        }
    }

    private final void a(boolean param0) {
        this.field_a = new ft(31, 431);
        this.f(1);
        this.g((byte) -71);
        this.c(param0);
    }

    final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6, String param7) {
        if (this.field_N != null && param0 >= 0) {
            if (!(param0 >= this.field_N.length)) {
                this.field_r = param0;
            }
        }
        if (2 <= param6) {
            if (!(param6 > 8)) {
                this.field_e = param6;
            }
        }
        this.field_v = param4 ? true : false;
        if (param5 >= 0 && this.field_e >= param5) {
            this.field_I = param5;
        }
        if ((param2 ^ -1) <= -1 && -5 < (param2 ^ -1)) {
            this.field_E = param2;
        }
        this.field_K = param3;
        if (param1 != -28) {
            return;
        }
        try {
            this.a(param7, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dm.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, ft param2, int param3, boolean param4, ft param5) {
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param2 != null) {
                  L2: {
                    var7_int = db.a(true, param5.field_k);
                    var8 = u.a(param5.field_n, (byte) 94);
                    var9 = -var7_int + param2.field_k;
                    var10 = param2.field_n - var8;
                    qn.b(var7_int, var8, var9, var10, this.field_Q, this.field_p);
                    if (!this.field_y) {
                      break L2;
                    } else {
                      qn.b(var7_int, var8, var9, var10, this.field_P);
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 == null) {
                      break L3;
                    } else {
                      if (-1 != (param1.length() ^ -1)) {
                        L4: {
                          var11 = u.a(param5.field_n, (byte) 94);
                          var12 = u.a(param2.field_n, (byte) 94);
                          var8 = var11 - -var12 >> -1550159263;
                          var13 = mp.k(-78);
                          var8 = var8 + var13;
                          if (!param4) {
                            stackIn_12_0 = nd.field_b;
                            break L4;
                          } else {
                            stackIn_12_0 = ci.field_e;
                            break L4;
                          }
                        }
                        L5: {
                          var16 = stackIn_12_0;
                          var15 = var16;
                          var14 = var15;
                          if (param3 < (param0 ^ -1)) {
                            fe.c(param1, db.a(true, this.field_c.field_k), var8, var16, true);
                            break L5;
                          } else {
                            fe.a(param1, db.a(true, param0), var8, var16, true);
                            break L5;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("dm.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int a(int param0, boolean param1) {
        ft var3;
        L0: {
          if (this.field_i == null) {
            break L0;
          } else {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param0 >= this.field_i.length) {
                break L0;
              } else {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    this.a(126);
                    break L1;
                  }
                }
                var3 = this.field_i[param0];
                if (var3 == null) {
                  return 1;
                } else {
                  if ((var3.field_k ^ -1) <= -1) {
                    return db.a(true, var3.field_k);
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        }
        return 1;
    }

    final ft h(byte param0) {
        int var3;
        ft var4;
        ft var5;
        L0: {
          var5 = new ft(-1, -1);
          if (null == this.field_T) {
            break L0;
          } else {
            if (this.field_T.length != 0) {
              if (param0 == 94) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= this.field_T.length) {
                    L2: {
                      if (0 > var5.field_k) {
                        break L2;
                      } else {
                        if ((var5.field_n ^ -1) <= -1) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return new ft(1, 1);
                  } else {
                    var4 = this.field_T[var3];
                    if (var4 != null) {
                      L3: {
                        if (0 > var4.field_k) {
                          break L3;
                        } else {
                          L4: {
                            if (var5.field_k < var4.field_k) {
                              break L4;
                            } else {
                              if (var5.field_k >= 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5.field_k = var4.field_k;
                          break L3;
                        }
                      }
                      if (var4.field_n >= 0) {
                        L5: {
                          if (var5.field_n < var4.field_n) {
                            break L5;
                          } else {
                            if ((var5.field_n ^ -1) > -1) {
                              break L5;
                            } else {
                              var3++;
                              continue L1;
                            }
                          }
                        }
                        var5.field_n = var4.field_n;
                        var3++;
                        continue L1;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return (ft) null;
              }
            } else {
              break L0;
            }
          }
        }
        return new ft(1, 1);
    }

    private final void g(byte param0) {
        int var2;
        int var3;
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
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var4 = this.field_k.field_n;
        var7 = 0;
        var2 = this.field_s.field_k;
        this.field_m = new ft(var2, var4);
        var3 = this.field_k.field_k;
        this.field_z = 4;
        var7 = (this.field_q.field_n - -this.field_l) * this.field_z + (this.field_B.field_n << -44083487) - this.field_l;
        var5 = var7 + var4;
        this.field_C = new ft(var3, var5);
        var8 = this.field_k.field_n;
        var9 = this.field_a.field_n;
        var10 = -var8 + var9;
        var11 = (-var7 + var10 >> -1070992831) + -25;
        this.field_m.field_n = this.field_m.field_n + var11;
        this.field_f = 5;
        this.field_L = 2;
        this.field_C.field_n = this.field_C.field_n + var11;
        var6 = this.b(true);
        var2 = var2 + (-var6 + this.field_q.field_k >> -1547688735);
        this.field_u = var2;
        var2 = this.field_B.field_k + this.field_m.field_k;
        var4 = this.field_B.field_n + this.field_m.field_n;
        if (param0 == -71) {
          var3 = var2 - -this.field_q.field_k;
          var12 = 0;
          var13 = this.field_o;
          var14 = this.field_N.length;
          var15 = var13;
          L0: while (true) {
            if (var14 <= var15) {
              return;
            } else {
              L1: {
                if (var15 == this.field_n) {
                  var12 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = var4 + this.field_q.field_n;
              if (var12 == 0) {
                this.field_i[var15] = new ft(var2, var4);
                this.field_T[var15] = new ft(var3, var5);
                var4 = this.field_l + var5;
                var15++;
                continue L0;
              } else {
                L2: {
                  if (this.field_n == var15) {
                    this.field_g = new ft(var2, var4);
                    this.field_S = new ft(var3, var5);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.a(var2, var5, var4, var3, 7, var15);
                if (var15 == this.field_h) {
                  var4 = 12 + (var5 + this.field_l);
                  var12 = 0;
                  var15++;
                  continue L0;
                } else {
                  var15++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_m != null) {
            if (!(this.field_C != null)) {
                return;
            }
            if (param0 != 66) {
                this.field_L = -47;
            }
            var2 = this.field_m.field_k;
            var3 = this.field_m.field_n;
            var4 = -var2 + this.field_C.field_k;
            var5 = this.field_C.field_n - var3;
            if (-1 != (var4 ^ -1)) {
                if (-1 == (var5 ^ -1)) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, this.field_Q, this.field_p);
                return;
            }
        }
    }

    private final void c(int param0) {
        int stackIn_27_0 = 0;
        int stackIn_53_0 = 0;
        int var2;
        int var3;
        ft var4;
        ft var5;
        int var7;
        int var8;
        int var9;
        String var10;
        String var11;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == this.field_N) {
            break L0;
          } else {
            if (-1 == (this.field_N.length ^ -1)) {
              return;
            } else {
              if (null == this.field_i) {
                break L0;
              } else {
                L1: {
                  if (this.field_i.length == 0) {
                    break L1;
                  } else {
                    if (this.field_i.length != this.field_N.length) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_T == null) {
                          break L2;
                        } else {
                          L3: {
                            if (0 == this.field_T.length) {
                              break L3;
                            } else {
                              if (this.field_T.length != this.field_N.length) {
                                break L3;
                              } else {
                                if (null == this.field_t) {
                                  break L2;
                                } else {
                                  L4: {
                                    if (0 == this.field_t.length) {
                                      break L4;
                                    } else {
                                      if (this.field_t.length != this.field_N.length) {
                                        break L4;
                                      } else {
                                        var2 = param0;
                                        L5: while (true) {
                                          if (this.field_N.length <= var2) {
                                            return;
                                          } else {
                                            L6: {
                                              var3 = this.field_N[var2];
                                              var4 = this.field_i[var2];
                                              var5 = this.field_T[var2];
                                              var10 = this.field_t[var2];
                                              if ((this.field_r ^ -1) <= -1) {
                                                if (this.field_r == var2) {
                                                  stackIn_27_0 = 1;
                                                  break L6;
                                                } else {
                                                  stackIn_27_0 = 0;
                                                  break L6;
                                                }
                                              } else {
                                                stackIn_27_0 = 0;
                                                break L6;
                                              }
                                            }
                                            var7 = stackIn_27_0;
                                            if (var4 != null) {
                                              if (var5 != null) {
                                                var11 = this.a(-1, var10, var3);
                                                if (-8 != (var3 ^ -1)) {
                                                  if ((var3 ^ -1) != -28) {
                                                    L7: {
                                                      if (var2 < this.field_n) {
                                                        break L7;
                                                      } else {
                                                        if (var2 <= this.field_h) {
                                                          L8: {
                                                            if (var2 == this.field_n) {
                                                              if (this.field_g != null) {
                                                                if (null != this.field_S) {
                                                                  L9: {
                                                                    if ((this.field_r ^ -1) <= -1) {
                                                                      if (this.field_n <= this.field_r) {
                                                                        if (this.field_h >= this.field_r) {
                                                                          stackIn_53_0 = 1;
                                                                          break L9;
                                                                        } else {
                                                                          stackIn_53_0 = 0;
                                                                          break L9;
                                                                        }
                                                                      } else {
                                                                        stackIn_53_0 = 0;
                                                                        break L9;
                                                                      }
                                                                    } else {
                                                                      stackIn_53_0 = 0;
                                                                      break L9;
                                                                    }
                                                                  }
                                                                  var8 = stackIn_53_0;
                                                                  this.a(this.field_u, this.field_U, this.field_S, param0 ^ -1, var8 != 0, this.field_g);
                                                                  break L8;
                                                                } else {
                                                                  var2++;
                                                                  continue L5;
                                                                }
                                                              } else {
                                                                var2++;
                                                                continue L5;
                                                              }
                                                            } else {
                                                              break L8;
                                                            }
                                                          }
                                                          this.a(var2, var7 != 0, var4, 67, var5);
                                                          var2++;
                                                          continue L5;
                                                        } else {
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    this.a(-1, var11, var5, -1, var7 != 0, var4);
                                                    var2++;
                                                    continue L5;
                                                  } else {
                                                    this.a(var7 != 0, var4, var5, 0, var11);
                                                    var2++;
                                                    continue L5;
                                                  }
                                                } else {
                                                  this.a(var4, var11, var7 != 0, var5, 26709);
                                                  var2++;
                                                  continue L5;
                                                }
                                              } else {
                                                var2++;
                                                continue L5;
                                              }
                                            } else {
                                              var2++;
                                              continue L5;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final ft b(byte param0) {
        int var3;
        ft var4;
        ft var5;
        L0: {
          var5 = new ft(-1, -1);
          if (null == this.field_i) {
            break L0;
          } else {
            if (this.field_i.length != 0) {
              if (param0 < -42) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= this.field_i.length) {
                    L2: {
                      if (var5.field_k < 0) {
                        break L2;
                      } else {
                        if ((var5.field_n ^ -1) <= -1) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return new ft(1, 1);
                  } else {
                    var4 = this.field_i[var3];
                    if (var4 != null) {
                      L3: {
                        if (-1 < (var4.field_k ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            if (var4.field_k < var5.field_k) {
                              break L4;
                            } else {
                              if (-1 >= (var5.field_k ^ -1)) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5.field_k = var4.field_k;
                          break L3;
                        }
                      }
                      if (-1 >= (var4.field_n ^ -1)) {
                        L5: {
                          if (var5.field_n > var4.field_n) {
                            break L5;
                          } else {
                            if (-1 < (var5.field_n ^ -1)) {
                              break L5;
                            } else {
                              var3++;
                              continue L1;
                            }
                          }
                        }
                        var5.field_n = var4.field_n;
                        var3++;
                        continue L1;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return (ft) null;
              }
            } else {
              break L0;
            }
          }
        }
        return new ft(1, 1);
    }

    private final String a(int param0, String param1, int param2) {
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_16_1 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  if (param0 == -1) {
                    L2: {
                      if (-29 != (param2 ^ -1)) {
                        if (46 == param2) {
                          param1 = param1 + this.field_I;
                          break L2;
                        } else {
                          if (param2 != 33) {
                            if (param2 != 29) {
                              break L2;
                            } else {
                              if (0 > this.field_E) {
                                break L2;
                              } else {
                                if (h.field_e.length >= this.field_E) {
                                  param1 = param1 + h.field_e[t.field_e];
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          } else {
                            L3: {
                              stackIn_15_0 = new StringBuilder().append(param1);

                              if (this.field_v) {
                                stackIn_16_0 = (StringBuilder) ((Object) stackIn_15_0);
                                stackIn_16_1 = dn.field_Mb;
                                break L3;
                              } else {
                                stackIn_16_0 = (StringBuilder) ((Object) stackIn_15_0);
                                stackIn_16_1 = qd.field_J;
                                break L3;
                              }
                            }
                            param1 = stackIn_16_1;
                            break L2;
                          }
                        }
                      } else {
                        param1 = param1 + this.field_e;
                        break L2;
                      }
                    }
                    stackIn_24_0 = (String) (param1);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_8_0 = (String) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = (String) (param1);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("dm.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    private final void f(int param0) {
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = 257;
        this.field_c = new ft(319, 239);
        int var7 = 0;
        var2 = this.field_c.field_k + -(var6 >> -168594623);
        var4 = 58;
        this.field_s = new ft(var2, var4);
        this.field_B = new ft(7, 7);
        this.field_q = new ft(-(this.field_B.field_k << 1720113665) + var6, 43);
        var3 = var6 + var2;
        this.field_o = 2;
        this.field_l = 4;
        var7 = -this.field_l + (this.field_q.field_n - -this.field_l) * this.field_o + (this.field_B.field_n << 514386817);
        var5 = var4 + var7;
        this.field_k = new ft(var3, var5);
        this.field_i = new ft[this.field_N.length];
        this.field_T = new ft[this.field_N.length];
        if (param0 != 1) {
            return;
        }
        var2 = this.field_B.field_k + this.field_s.field_k;
        var3 = this.field_q.field_k + var2;
        var4 = this.field_s.field_n + this.field_B.field_n;
        for (var8 = 0; this.field_o > var8; var8++) {
            var5 = this.field_q.field_n + var4;
            this.field_i[var8] = new ft(var2, var4);
            this.field_T[var8] = new ft(var3, var5);
            var4 = this.field_l + var5;
        }
    }

    private final int b(boolean param0) {
        int var2 = 0;
        if (!param0) {
            return 50;
        }
        var2 = 64;
        var2 = var2 + this.e(-24);
        return var2;
    }

    private final void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 122 % ((param1 - 92) / 33);
            var4 = 7;
            var5 = this.b(-1, var4);
            if (null != this.field_t) {
              L1: {
                if (0 > var5) {
                  break L1;
                } else {
                  if (this.field_t.length <= var5) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == null) {
                        break L2;
                      } else {
                        if (-1 == (param0.length() ^ -1)) {
                          break L2;
                        } else {
                          this.field_t[var5] = param0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("dm.EA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        ft var3;
        L0: {
          if (null == this.field_i) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (this.field_i.length <= param0) {
                break L0;
              } else {
                var3 = this.field_i[param0];
                if (param1 == 1084326849) {
                  L1: {
                    if (var3 == null) {
                      break L1;
                    } else {
                      if (var3.field_n < 0) {
                        break L1;
                      } else {
                        return u.a(var3.field_n, (byte) 94);
                      }
                    }
                  }
                  return 1;
                } else {
                  return 91;
                }
              }
            }
          }
        }
        return 1;
    }

    private final void a(ft param0, String param1, boolean param2, ft param3, int param4) {
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (-1 == (param1.length() ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        var6_int = param0.field_k;
                        var7 = param0.field_n;
                        var8 = param3.field_k + -var6_int;
                        var9 = -var7 + param3.field_n;
                        if (param4 == 26709) {
                          break L2;
                        } else {
                          this.field_v = true;
                          break L2;
                        }
                      }
                      L3: {
                        qn.f(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, this.field_M);
                        fe.b(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, io.field_m, nd.field_b, this.field_Q, this.field_p);
                        var10 = u.a(param0.field_n, (byte) 94);
                        var11 = u.a(param3.field_n, (byte) 94);
                        var7 = var10 + var11 >> -2013257535;
                        var12 = mp.k(-57);
                        var7 = var12 + var7;
                        if (param2) {
                          stackIn_11_0 = ci.field_e;
                          break L3;
                        } else {
                          stackIn_11_0 = nd.field_b;
                          break L3;
                        }
                      }
                      var15 = stackIn_11_0;
                      var14 = var15;
                      var13 = var14;
                      fe.c(param1, db.a(true, this.field_c.field_k), var7, var15, true);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("dm.R(");

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
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = sm.field_d;
              var2 = ko.field_b;
              if ((tr.field_A ^ -1) != -2) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_4_0;
              if ((ro.field_ub ^ -1) != -2) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            ll.field_Rb.a(el.field_d, param0 + -56, var2, var3 != 0, var1_int, var4 != 0);
            L3: while (true) {
              if (!jd.i((byte) 90)) {
                if (param0 == 61) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L4: {
                  if (-14 == (rs.field_q ^ -1)) {
                    L5: {
                      bv.a(true, 0, 1, jt.field_a);
                      if (null == ll.field_Rb.field_k) {
                        break L5;
                      } else {
                        ll.field_Rb.field_k.field_H = null;
                        ll.field_Rb.field_k.field_A = null;
                        break L5;
                      }
                    }
                    L6: {
                      le.field_b = null;
                      if (ll.field_Rb.field_k == null) {
                        break L6;
                      } else {
                        ll.field_Rb.field_k = null;
                        break L6;
                      }
                    }
                    ll.field_Rb = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (-13 != (rs.field_q ^ -1)) {
                    break L7;
                  } else {
                    L8: {
                      if (ln.field_e) {
                        stackIn_20_0 = 0;
                        break L8;
                      } else {
                        stackIn_20_0 = 1;
                        break L8;
                      }
                    }
                    ln.field_e = stackIn_20_0 != 0;
                    break L7;
                  }
                }
                if ((rs.field_q ^ -1) != -12) {
                  continue L3;
                } else {
                  if (-3 >= (hi.field_j ^ -1)) {
                    L9: {
                      if (jv.field_a) {
                        stackIn_27_0 = 0;
                        break L9;
                      } else {
                        stackIn_27_0 = 1;
                        break L9;
                      }
                    }
                    jv.field_a = stackIn_27_0 != 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "dm.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, ft param1, ft param2, int param3, String param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param4 == null) {
                    break L1;
                  } else {
                    if (param4.length() != 0) {
                      L2: {
                        var6_int = param1.field_k;
                        var7 = param1.field_n;
                        if (param3 == 0) {
                          break L2;
                        } else {
                          this.b(true, 61);
                          break L2;
                        }
                      }
                      L3: {
                        var8 = param2.field_k + -var6_int;
                        var9 = param2.field_n + -var7;
                        var10 = nd.field_b;
                        if (!param0) {
                          break L3;
                        } else {
                          var10 = ci.field_e;
                          break L3;
                        }
                      }
                      fe.a(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, il.field_s, var10, this.field_Q, this.field_b, true);
                      fe.b(db.a(true, var6_int), u.a(var7, (byte) 94), var8, var9, io.field_m, ci.field_e, this.field_Q, this.field_A);
                      var11 = param1.field_n;
                      var12 = param2.field_n;
                      var7 = var11 + var12 >> 735272929;
                      var13 = mp.k(-74);
                      var7 = var7 - -var13;
                      fe.c(param4, db.a(true, this.field_c.field_k), u.a(var7, (byte) 94), this.field_Q, true);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("dm.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        ft var4;
        int var5;
        ft var6;
        if (!param0) {
          if (0 > param1) {
            return 1;
          } else {
            L0: {
              if (this.field_i == null) {
                break L0;
              } else {
                if (param1 >= this.field_i.length) {
                  break L0;
                } else {
                  L1: {
                    if (this.field_T == null) {
                      break L1;
                    } else {
                      if (this.field_T.length <= param1) {
                        break L1;
                      } else {
                        L2: {
                          var6 = this.field_i[param1];
                          var4 = this.field_T[param1];
                          if (var6 == null) {
                            break L2;
                          } else {
                            if ((var6.field_n ^ -1) > -1) {
                              break L2;
                            } else {
                              if (var4 == null) {
                                return 1;
                              } else {
                                if (-1 >= (var4.field_n ^ -1)) {
                                  var5 = var4.field_n + -var6.field_n;
                                  if (-1 <= (var5 ^ -1)) {
                                    return 1;
                                  } else {
                                    return var5;
                                  }
                                } else {
                                  return 1;
                                }
                              }
                            }
                          }
                        }
                        return 1;
                      }
                    }
                  }
                  return 1;
                }
              }
            }
            return 1;
          }
        } else {
          return 1;
        }
    }

    private final int b(int param0, int param1) {
        if (null == this.field_j) {
          return -1;
        } else {
          L0: {
            if (param0 < (param1 ^ -1)) {
              break L0;
            } else {
              if (param1 >= this.field_j.length) {
                break L0;
              } else {
                return this.field_j[param1];
              }
            }
          }
          return -1;
        }
    }

    final static int a(int param0, int param1, int[] param2, int param3, boolean param4, int[] param5, int param6, boolean param7, int param8, boolean param9, int param10, String param11) {
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var12_int = -1;
              if (param7) {
                var12_int = tt.a(param0 + -param10, -param8 + param6, param2, param9);
                break L1;
              } else {
                break L1;
              }
            }
            var13 = 0;
            if (!param9) {
              L2: while (true) {
                if (6 <= var13) {
                  stackIn_31_0 = var12_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var14 = nd.field_d[var13];
                    if (param2[var14] >= bc.field_j[var14].length) {
                      param2[var14] = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param2[var14] <= -1) {
                      if (var14 == param3) {
                        lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, dp.field_Vb[var14][1] + param10, 256);
                        break L4;
                      } else {
                        if (var14 != var12_int) {
                          if ((param1 ^ -1) < 0) {
                            lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 128);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          lt.field_h[var14].f(param8 + dp.field_Vb[var14][0], dp.field_Vb[var14][1] + param10, 128);
                          break L4;
                        }
                      }
                    } else {
                      L5: {
                        if (var14 != param3) {
                          if (var12_int != var14) {
                            break L5;
                          } else {
                            eo.a(dp.field_Vb[var14][0] + param8, 7829367, (byte) -80, bc.field_j[var14][param2[var14]], param10 + dp.field_Vb[var14][1]);
                            break L5;
                          }
                        } else {
                          eo.a(dp.field_Vb[var14][0] + param8, 16777215, (byte) -88, bc.field_j[var14][param2[var14]], dp.field_Vb[var14][1] + param10);
                          break L5;
                        }
                      }
                      L6: {
                        if (!param4) {
                          gq.b(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], bd.field_q[param5[var14]]);
                          break L6;
                        } else {
                          gq.a(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 1);
                          break L6;
                        }
                      }
                      if ((var14 ^ -1) != -4) {
                        break L4;
                      } else {
                        if (param4) {
                          break L4;
                        } else {
                          var15 = ka.a(nr.field_e, param11, -10 + uh.field_e[var14][0] << 803992929);
                          fe.c(var15, (uh.field_e[var14][0] >> 195574945) + dp.field_Vb[var14][0] + param8, 20 + (uh.field_e[var14][1] >> -1666604639) + (dp.field_Vb[var14][1] + param10), 0, true);
                          break L4;
                        }
                      }
                    }
                  }
                  var13++;
                  continue L2;
                }
              }
            } else {
              stackIn_6_0 = -48;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var12 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var12);

            stackIn_34_1 = new StringBuilder().append("dm.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L7;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_31_0;
        }
    }

    final int h(int param0) {
        int var2;
        int var3;
        if (this.field_q == null) {
          return 1;
        } else {
          L0: {
            var2 = this.field_q.field_n;
            if ((var2 ^ -1) > -1) {
              break L0;
            } else {
              if (0 > this.field_l) {
                break L0;
              } else {
                var3 = var2 - -this.field_l;
                if ((var3 ^ -1) <= -1) {
                  L1: {
                    if (param0 == -10754) {
                      break L1;
                    } else {
                      this.a(true, -108);
                      break L1;
                    }
                  }
                  return var3;
                } else {
                  return 1;
                }
              }
            }
          }
          return 1;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        if (this.field_N == null) {
          return;
        } else {
          if (this.field_N.length == 0) {
            return;
          } else {
            if (param0 == -105) {
              var2 = 0;
              var3 = 0;
              L0: while (true) {
                if (var3 >= this.field_N.length) {
                  if (var2 > 0) {
                    this.field_j = new int[1 + var2];
                    var3 = 0;
                    L1: while (true) {
                      if (var3 >= this.field_j.length) {
                        var3 = 0;
                        L2: while (true) {
                          if (var3 >= this.field_N.length) {
                            return;
                          } else {
                            var4 = this.field_N[var3];
                            if ((var4 ^ -1) <= -1) {
                              if (var4 < this.field_j.length) {
                                this.field_j[var4] = var3;
                                var3++;
                                continue L2;
                              } else {
                                var3++;
                                continue L2;
                              }
                            } else {
                              var3++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        this.field_j[var3] = -1;
                        var3++;
                        continue L1;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (var2 < this.field_N[var3]) {
                    var2 = this.field_N[var3];
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    private final void c(boolean param0) {
        if (null == this.field_j) {
            return;
        }
        if (!param0) {
            this.field_w = (ft) null;
        }
        int var2 = this.b(-1, 7);
        if (!(var2 >= 0)) {
            return;
        }
        if (this.field_i != null) {
            if (this.field_T == null) {
                return;
            }
            if (this.field_i.length > var2) {
                if (!(this.field_T.length > var2)) {
                    return;
                }
                this.field_i[var2] = this.field_a;
                this.field_T[var2] = new ft(608, 462);
                return;
            }
        }
    }

    private final void j(int param0) {
        this.field_r = 0;
        if (param0 != -15585) {
            this.field_s = (ft) null;
        }
        this.field_e = 2;
        this.field_E = 0;
        this.field_I = 0;
        this.field_K = 0;
        this.field_v = false;
    }

    public static void g(int param0) {
        field_O = null;
        field_x = null;
        if (param0 != 256) {
            return;
        }
        field_d = null;
    }

    final void e(byte param0) {
        int var2;
        int var3;
        int var5;
        String var4;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_N != null) {
          if (null != il.field_t) {
            this.field_t = new String[this.field_N.length];
            var2 = 0;
            L0: while (true) {
              if (var2 >= this.field_N.length) {
                if (0 != il.field_t.length) {
                  if (param0 > 54) {
                    this.field_U = il.field_t[-1 + il.field_t.length];
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = this.field_N[var2];
                if (var3 >= 0) {
                  if (il.field_t.length > var3) {
                    var4 = il.field_t[var3];
                    if (var4 != null) {
                      this.field_t[var2] = var4;
                      var2++;
                      continue L0;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void i(int param0) {
        this.d(param0 + 6);
        if (param0 != 1) {
            return;
        }
        this.a(param0 + 11);
        this.a(true);
        this.j(-15585);
        this.field_y = false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (wb.field_b != null) {
            if (!(5 < wb.field_b.length)) {
                return;
            }
            this.field_R = wb.field_b[5];
            if (null == this.field_R) {
                return;
            }
            var2 = this.field_J.field_n;
            var3 = this.d(true);
            if (param0 != 18669) {
                this.a(70, true);
            }
            var4 = var3 + var2;
            fe.b(this.field_R, db.a(true, this.field_c.field_k), u.a(var4, (byte) 94));
            fe.c(this.field_R, db.a(true, this.field_c.field_k), u.a(var4, (byte) 94), nd.field_b, false);
            return;
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        int incrementValue$5 = 0;
        this.field_N = new int[11];
        int var2 = 0;
        int incrementValue$0 = var2;
        var2++;
        this.field_N[incrementValue$0] = 25;
        int incrementValue$1 = var2;
        var2++;
        this.field_N[incrementValue$1] = 26;
        int incrementValue$2 = var2;
        var2++;
        this.field_N[incrementValue$2] = 28;
        int incrementValue$3 = var2;
        var2++;
        this.field_N[incrementValue$3] = 46;
        int incrementValue$4 = var2;
        var2++;
        this.field_N[incrementValue$4] = 29;
        this.field_n = var2;
        for (var3 = 0; 4 > var3; var3++) {
            incrementValue$5 = var2;
            var2++;
            this.field_N[incrementValue$5] = 55 + var3;
        }
        this.field_h = var2 - 1;
        if (param0 != 12) {
            String var4 = (String) null;
            this.a(105, (byte) -17, -105, 21, true, -116, -10, (String) null);
        }
        int incrementValue$6 = var2;
        var2++;
        this.field_N[incrementValue$6] = 27;
        int incrementValue$7 = var2;
        var2++;
        this.field_N[incrementValue$7] = 7;
        this.a((byte) -105);
        this.field_F = 15855490;
        this.field_G = 11711413;
    }

    private final int e(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var2 = 1 + (-this.field_n + this.field_h);
        int var4 = -81 % ((26 - param0) / 47);
        int var3 = 0;
        for (var5 = 0; var2 > var5; var5++) {
            var6 = 33;
            var6 = this.field_f + var6;
            var3 = var6 + var3;
        }
        var3 = var3 - this.field_f;
        return var3;
    }

    public dm() {
        this.field_A = 0;
    }

    static {
        field_x = "Toggle Equipment";
        field_O = "Accept draw";
        field_d = "Real-life threats";
    }
}
