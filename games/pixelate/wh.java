/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends de {
    static rh field_p;
    static String field_s;
    static dj field_o;
    static char[] field_r;
    static tf field_q;

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, tc param7, int param8, int param9, int param10) {
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var12_int = param6 + (param1 + param10);
              if (var12_int != 0) {
                param6 = (200 * param6 + var12_int) / (var12_int * 2);
                param1 = (var12_int + 200 * param1) / (2 * var12_int);
                param10 = (var12_int + param10 * 200) / (var12_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != param8) {
                param7.c(param8 + 1 + ". ", 70, param4, param9, param0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var13 = param5;
              param7.a(var13, 70, param4, param9, param0);
              var13 = Integer.toString(param3);
              param7.b(var13, aj.field_o[0], param4, param9, param0);
              if (param2 == 540) {
                break L3;
              } else {
                field_p = null;
                break L3;
              }
            }
            L4: {
              if (var12_int < 50) {
                stackOut_14_0 = Integer.toString(var12_int);
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_12_0 = "50+";
                stackIn_15_0 = stackOut_12_0;
                break L4;
              }
            }
            var13 = stackIn_15_0;
            param7.b(var13, aj.field_o[1], param4, param9, param0);
            var13 = param10 + "%";
            param7.b(var13, aj.field_o[2], param4, param9, param0);
            var13 = param1 + "%";
            param7.b(var13, aj.field_o[3], param4, param9, param0);
            var13 = param6 + "%";
            param7.b(var13, aj.field_o[4], param4, param9, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var12;
            stackOut_17_1 = new StringBuilder().append("wh.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param6).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param7 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = 51 % ((param0 - -13) / 37);
            if (!jg.a((byte) 64)) {
              if (param1 < 2) {
                stackOut_6_0 = ((wh) this).field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((wh) this).field_i + ((wh) this).field_d;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = ((wh) this).field_d + param1 * ((wh) this).field_i;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wh.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              ((wh) this).field_m = 30;
              if (param1 == 90) {
                break L1;
              } else {
                int discarded$2 = ((wh) this).a(-116, false);
                break L1;
              }
            }
            L2: {
              ((wh) this).field_a = 640 + -((wh) this).field_m;
              if (jg.a((byte) 123)) {
                break L2;
              } else {
                if (2 > param0) {
                  if (param0 == 0) {
                    stackOut_12_0 = ((wh) this).field_m;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = ((wh) this).field_a - this.d(1, 28);
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = -(this.d(param0, 29) >> -1754623199) + 320;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wh.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    private final int d(int param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var3 = we.field_o[((wh) this).field_k[param0]];
            var4 = 96 / ((param1 - -50) / 50);
            stackOut_0_0 = 20 + rk.field_e.c(var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "wh.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        pc var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sm var5_ref_sm = null;
        int var5 = 0;
        df var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_35_0 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2 = 88 % ((31 - param0) / 43);
                var1_ref = vi.field_o;
                var3 = var1_ref.f(255);
                var4 = var1_ref.f(255);
                if (var3 != 0) {
                  break L2;
                } else {
                  var5_ref_sm = (sm) (Object) in.field_J.c(1504642273);
                  if (null == var5_ref_sm) {
                    na.a(true);
                    return;
                  } else {
                    L3: {
                      var6_int = -var1_ref.field_m + jj.field_b;
                      var7 = var5_ref_sm.field_o;
                      if (~var6_int < ~(var7.length << -631127614)) {
                        var6_int = var7.length << 395893986;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var8 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (~var8 <= ~var6_int) {
                            break L6;
                          } else {
                            var7[var8 >> -1521578494] = var7[var8 >> -1521578494] + (var1_ref.f(255) << (cm.a(var8, 3) << -234211896));
                            var8++;
                            if (var9 != 0) {
                              break L5;
                            } else {
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5_ref_sm.c(2779);
                        break L5;
                      }
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L7: {
                if (var3 != 1) {
                  break L7;
                } else {
                  var5 = var1_ref.l(-20729);
                  var6 = (df) (Object) he.field_b.c(1504642273);
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (null == var6) {
                          break L10;
                        } else {
                          stackOut_24_0 = var4;
                          stackIn_36_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var9 != 0) {
                            break L9;
                          } else {
                            L11: {
                              if (stackIn_25_0 != var6.field_p) {
                                break L11;
                              } else {
                                if (~var6.field_k == ~var5) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var6 = (df) (Object) he.field_b.f(1504642273);
                            if (var9 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (null == var6) {
                        stackOut_35_0 = 1;
                        stackIn_36_0 = stackOut_35_0;
                        break L9;
                      } else {
                        var6.c(2779);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                    }
                    na.a(stackIn_36_0 != 0);
                    return;
                  }
                }
              }
              jo.a(1, "LR1: " + jm.b(-35), (Throwable) null);
              na.a(true);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "wh.I(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        ob var2_ref = null;
        int var3 = 0;
        String var4 = null;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              gj.field_W[8].b(0, 45);
              ((wh) this).b((byte) -71);
              if (param0 == 11) {
                break L1;
              } else {
                ((wh) this).a((byte) -95, false, 89);
                break L1;
              }
            }
            L2: {
              ((wh) this).d((byte) 74);
              var2_ref = rk.field_e;
              var3 = var2_ref.field_w + var2_ref.field_z;
              if (ca.field_f != null) {
                break L2;
              } else {
                if (!jg.a((byte) 112)) {
                  ca.field_f = cn.a(0, 7, 10, -119);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (jg.a((byte) 83)) {
                  break L4;
                } else {
                  L5: {
                    if (ca.field_f.field_u) {
                      break L5;
                    } else {
                      var4 = wd.field_b;
                      if (var15 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (ca.field_f.field_o == null) {
                      break L6;
                    } else {
                      var5 = qj.field_e;
                      var6 = 1 + var5.field_w + var5.field_z;
                      var7 = 150 + var6;
                      var8 = 16777215;
                      var9 = 0;
                      var5.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                      var5.b(db.field_N, aj.field_o[1], var7, var8, var9);
                      var5.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                      var5.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                      var5.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                      var4 = cf.field_z;
                      var7 = var7 + (var6 + 4);
                      var10 = ca.field_f.field_o[d.field_c];
                      var11 = ca.field_f.field_r[d.field_c];
                      var12 = 0;
                      var13 = 0;
                      L7: while (true) {
                        L8: {
                          L9: {
                            L10: {
                              if (10 <= var13) {
                                break L10;
                              } else {
                                if (var15 != 0) {
                                  break L9;
                                } else {
                                  L11: {
                                    if (null == var10[var13]) {
                                      break L11;
                                    } else {
                                      L12: {
                                        var14 = var10[var13];
                                        var8 = 16777215;
                                        if (sm.a(var14, param0 + -12)) {
                                          var12 = 1;
                                          var8 = 16711680;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var4 = "";
                                      this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var14, var11[4 * var13 + 2], var5, var13, var8, var11[4 * var13 + 1]);
                                      break L11;
                                    }
                                  }
                                  var7 = var7 + var6;
                                  var13++;
                                  if (var15 == 0) {
                                    continue L7;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (var12 == 0) {
                              var7 += 4;
                              var8 = 16711680;
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                          this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var5, -1, var8, ca.field_f.field_v);
                          break L8;
                        }
                        if (var15 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = pf.field_l;
                  if (var15 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = mj.field_h;
              break L3;
            }
            int discarded$1 = var2_ref.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wh.H(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
            field_s = null;
            field_q = null;
            field_r = null;
            field_o = null;
            field_p = null;
            int var1_int = 116 / ((param0 - -12) / 59);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wh.B(" + param0 + ')');
        }
    }

    final static void e(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (fq.field_o != null) {
                break L1;
              } else {
                if (rj.field_C[param1] == rg.field_e) {
                  break L1;
                } else {
                  fq.field_o = rj.field_C[param1];
                  fq.field_o.field_d = dm.field_Cb;
                  ci.field_o = param1;
                  hn.field_d = 0;
                  u.a(false, 2 - -param1);
                  break L1;
                }
              }
            }
            var2_int = 20 / ((10 - param0) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wh.M(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((wh) this).c((byte) -54);
                break L1;
              }
            }
            L2: {
              if (jg.a((byte) 115)) {
                break L2;
              } else {
                if (param0 >= 2) {
                  break L2;
                } else {
                  if (param0 == 0) {
                    stackOut_12_0 = ((wh) this).field_m - -this.d(0, -103);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    stackOut_10_0 = ((wh) this).field_a;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
            stackOut_14_0 = (this.d(param0, 53) >> 2046724481) + 320;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wh.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -13) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            la.a(((wh) this).field_l, nc.field_a, false, -25528);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wh.L(" + param0 + ')');
        }
    }

    wh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(java.math.BigInteger param0, we param1, java.math.BigInteger param2, we param3, int param4) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              pg.a(param0, true, 0, param3.field_m, param2, param1, param3.field_k);
              if (param4 == 12556) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wh.E(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        tf var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -116) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = oc.field_N;
                if (jg.a((byte) 117)) {
                  break L3;
                } else {
                  if (param2 != 1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = oc.field_S;
              break L2;
            }
            super.a((byte) 35, var4, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4_ref, "wh.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
        field_r = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_s = "Private";
        field_o = new dj();
    }
}
