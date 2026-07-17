/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends hg {
    boolean field_h;
    ed field_i;
    static String field_q;
    int field_l;
    int field_k;
    int field_j;
    private int field_s;
    private int field_m;
    boolean field_p;
    boolean field_r;
    int field_g;
    private ed field_t;
    int field_o;
    int field_n;

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var4 = 100;
        var5 = ma.field_a.field_cb % var4;
        if (null == ((sa) this).field_i) {
          return;
        } else {
          L0: {
            var6 = ((sa) this).field_i.field_A;
            var7 = ((sa) this).field_i.field_z;
            var8 = var6 - -((var4 - var5) * 2 * var6 / var4);
            var9 = (-var5 + var4) * var7 * 2 / var4 + var7;
            if (!param0) {
              break L0;
            } else {
              this.a(false, -79, -121);
              break L0;
            }
          }
          L1: {
            var10 = var5 * 128 / var4;
            var11 = 16711680;
            var12 = ((sa) this).field_g + (-param2 - (var9 - var7) / 2);
            var13 = var9 + var12;
            var14 = 480;
            if (var13 < 0) {
              break L1;
            } else {
              if (var12 < var14) {
                L2: {
                  L3: {
                    var15 = -param1 + ((sa) this).field_k - (var8 - var6) / 2;
                    var16 = var8 + var15;
                    var17 = ma.field_a.field_n;
                    em.b(var15, var12, var8, var9, var11, var10);
                    if (var15 <= 0) {
                      break L3;
                    } else {
                      if (var17 > var16) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (0 >= var15) {
                      var15 = var15 + var17;
                      break L4;
                    } else {
                      var15 = var15 - var17;
                      break L4;
                    }
                  }
                  em.b(var15, var12, var8, var9, var11, var10);
                  break L2;
                }
                return;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final static void d(byte param0) {
        if (param0 != 27) {
            sa.d((byte) -32);
        }
        je.field_a = new cn();
    }

    private final fn b(boolean param0) {
        rk[] var4 = w.c(false);
        var4 = var4;
        if (var4 == null) {
            return null;
        }
        return var4[((sa) this).field_n].a((byte) 120, ((sa) this).field_l);
    }

    final static void a(int param0, int param1, boolean param2, ed[] param3, int param4, int param5, ed[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
              if (!param2) {
                break L1;
              } else {
                field_q = null;
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
            stackOut_3_1 = new StringBuilder().append("sa.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param9 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param10 + 44 + param11 + 41);
        }
    }

    private final ed d(int param0) {
        rk[] var4 = w.c(false);
        var4 = var4;
        if (var4 == null) {
            return null;
        }
        return var4[((sa) this).field_n].a(-125, ((sa) this).field_l);
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        ((sa) this).field_p = param5 ? true : false;
        ((sa) this).field_l = param6;
        ((sa) this).field_r = param4 ? true : false;
        this.e(-7012);
    }

    final void a(boolean param0, oe param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (((sa) this).field_i != null) {
              var3_int = 0;
              var4 = 0;
              L1: while (true) {
                if (((sa) this).field_i.field_x <= var4) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      ((sa) this).field_j = -96;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5 = var4 + (((sa) this).field_g + ((sa) this).field_i.field_v);
                  var6 = var5 >> 5;
                  var5 = var5 & 31;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= ((sa) this).field_i.field_s) {
                      var4++;
                      continue L1;
                    } else {
                      var8 = var7 + (((sa) this).field_i.field_q + ((sa) this).field_k);
                      var9 = var8 >> 5;
                      var8 = var8 & 31;
                      L4: while (true) {
                        if (var9 >= 0) {
                          L5: {
                            var9 = var9 % param1.field_Mb;
                            if (((sa) this).field_i.field_B[var3_int] != 0) {
                              var10 = param1.field_V[var9 + param1.field_Mb * var6];
                              if (si.field_v != var10) {
                                L6: {
                                  if (var10 == null) {
                                    var10 = new int[32];
                                    param1.field_V[var9 + var6 * param1.field_Mb] = new int[32];
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var10[var5] = lb.a(var10[var5], 1 << var8);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          var3_int++;
                          var7++;
                          continue L3;
                        } else {
                          var9 = var9 + param1.field_Mb;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("sa.E(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = EscapeVector.field_A;
        if (((sa) this).field_i == null) {
          return;
        } else {
          L0: {
            var4 = null;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            if (!((sa) this).field_h) {
              break L0;
            } else {
              var9 = this.a((byte) 54);
              if (var9 <= 0) {
                break L0;
              } else {
                L1: {
                  var5 = ((sa) this).field_s;
                  var4 = (Object) (Object) ((sa) this).field_t;
                  var6 = ((sa) this).field_m;
                  if (var5 >= 0) {
                    break L1;
                  } else {
                    var7 = -var5;
                    break L1;
                  }
                }
                if (var6 < 0) {
                  var8 = -var6;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var10 = ((sa) this).field_g + -param0;
            if (var10 >= 480 + var8) {
              break L2;
            } else {
              if (var10 <= -((sa) this).field_i.field_z) {
                break L2;
              } else {
                var11 = -param2 + (((sa) this).field_k + ma.field_a.field_n + ma.field_a.field_n) - var7;
                var12 = ((sa) this).field_i.field_A + var7 - -var7;
                var11 = var11 + var12;
                var11 = var11 % ma.field_a.field_n;
                var11 = var11 - var12;
                L3: while (true) {
                  if (var11 >= 640) {
                    L4: {
                      if (param1 > 106) {
                        break L4;
                      } else {
                        this.a(false, -48, -24);
                        break L4;
                      }
                    }
                    L5: {
                      if (!((sa) this).field_r) {
                        break L5;
                      } else {
                        this.a(false, param2, param0);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    L6: {
                      if (var4 == null) {
                        ((sa) this).field_i.e(var11, var10);
                        break L6;
                      } else {
                        ((sa) this).field_i.e(var11 + var7, var10);
                        ((ed) var4).c(var5 + var11 - -var7, var10 - -var6, this.a((byte) 122));
                        break L6;
                      }
                    }
                    var11 = var11 + ma.field_a.field_n;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final int a(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        if (param0 < 36) {
            field_q = null;
        }
        if (((sa) this).field_n != 2) {
            var2_double = (double)(ma.field_a.field_Zb / 8);
            if (!(!kg.a((byte) -98, ((sa) this).field_n))) {
                var2_double = (double)(ma.field_a.field_cb % 100) / 100.0;
            }
            var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
            return (int)(var4 * var4 * 28.0);
        }
        int var2 = -42 + ((sa) this).field_o;
        if (!(var2 > 0)) {
            return 0;
        }
        return 16 * var2;
    }

    private final void e(int param0) {
        ((sa) this).field_i = k.a(((sa) this).field_l, (byte) -39, ((sa) this).field_n);
        ((sa) this).field_t = this.d(0);
        fn var2 = this.b(true);
        if (param0 != -7012) {
            return;
        }
        if (var2 == null) {
            return;
        }
        ((sa) this).field_s = var2.field_c;
        ((sa) this).field_m = var2.field_b;
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        ((sa) this).field_r = param4 ? true : false;
        ((sa) this).field_p = param5 ? true : false;
    }

    final static void a(int param0, byte param1) {
        tj var2 = null;
        String var2_ref = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (!(!hi.a(param0, -2))) {
            var2 = new tj(ic.field_n, ae.field_c, qh.field_j, true);
            re.a(1820, var2);
        }
        if (param1 >= -69) {
            return;
        }
        if (!(param0 != 2)) {
            var2_ref = "vengeance_intro";
            var3 = "scene";
            var4 = tm.field_cb;
            var5 = me.field_o;
            var6 = new tj(var2_ref, var3, var4, var5, true);
            re.a(1820, var6);
        }
    }

    final boolean e(byte param0) {
        if (mf.a(((sa) this).field_n, -64)) {
            return false;
        }
        if (1 == ((sa) this).field_n) {
            return false;
        }
        if (!(5 != ((sa) this).field_n)) {
            return false;
        }
        if (!(((sa) this).field_n != 6)) {
            return false;
        }
        if (param0 != -5) {
            return false;
        }
        if (((sa) this).field_n != 7) {
            return true;
        }
        return false;
    }

    final void a(oe param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            if (((sa) this).field_i == null) {
              return;
            } else {
              L1: {
                var3_int = 0;
                if (param1 >= 58) {
                  break L1;
                } else {
                  this.e(-105);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (((sa) this).field_i.field_x <= var4) {
                  break L0;
                } else {
                  var5 = var4 + ((sa) this).field_i.field_v + ((sa) this).field_g;
                  var6 = var5 >> 5;
                  var5 = var5 & 31;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= ((sa) this).field_i.field_s) {
                      var4++;
                      continue L2;
                    } else {
                      var8 = var7 + (((sa) this).field_k - -((sa) this).field_i.field_q);
                      var9 = var8 >> 5;
                      var8 = var8 & 31;
                      L4: while (true) {
                        if (0 <= var9) {
                          L5: {
                            var9 = var9 % param0.field_Mb;
                            if (null != ma.field_a.field_eb) {
                              ma.field_a.field_eb.a(var9, var6, true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (0 != ((sa) this).field_i.field_B[var3_int]) {
                              var14 = param0.field_V[param0.field_Mb * var6 + var9];
                              var10 = var14;
                              if (var10 != null) {
                                if (si.field_v == var10) {
                                  var13 = new int[32];
                                  var15 = var13;
                                  var10 = var15;
                                  param0.field_V[param0.field_Mb * var6 - -var9] = new int[32];
                                  var11 = 0;
                                  L7: while (true) {
                                    if (var11 >= 32) {
                                      var10[var5] = ae.a(var15[var5], ~(1 << var8));
                                      break L6;
                                    } else {
                                      var13[var11] = -1;
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var5] = ae.a(var14[var5], ~(1 << var8));
                                  var3_int++;
                                  var7++;
                                  continue L3;
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var3_int++;
                          var7++;
                          continue L3;
                        } else {
                          var9 = var9 + param0.field_Mb;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("sa.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_q = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          L1: {
            ((sa) this).field_o = 0;
            ((sa) this).field_g = param3;
            ((sa) this).field_k = param2;
            ((sa) this).field_j = param0;
            ((sa) this).field_n = param1;
            stackOut_0_0 = this;
            stackIn_2_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param1 == 2) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!kg.a((byte) -125, ((sa) this).field_n)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_2_0 = this;
          stackOut_2_1 = 1;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          break L0;
        }
        ((sa) this).field_h = stackIn_4_1 != 0;
        ((sa) this).field_p = false;
        ((sa) this).field_r = false;
        ((sa) this).field_l = 0;
        this.e(-7012);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
