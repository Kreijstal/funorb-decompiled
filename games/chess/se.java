/*
 * Decompiled by CFR-JS 0.4.0.
 */
class se extends fb {
    static int field_V;
    static String field_U;
    private String[] field_Q;
    static java.math.BigInteger field_M;
    static dd[] field_N;
    static String field_W;
    static boolean field_X;
    static String field_Z;
    static int[] field_ab;
    private re field_R;
    static nb field_S;
    static byte[][][] field_Y;
    private jc field_O;

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -6) {
                break L1;
              } else {
                var7 = null;
                se.a(39, (int[]) null, -35, (byte) 95, 6, 9, 86);
                break L1;
              }
            }
            L2: {
              super.a(param0, -8, param2, param3);
              ((se) this).field_R = null;
              if (!((se) this).field_w) {
                break L2;
              } else {
                var5_int = hn.field_k + -param0 + -((se) this).field_u;
                var6 = -((se) this).field_r + (rf.field_b - param3);
                ((se) this).field_R = this.a((byte) 126, var6, var5_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("se.G(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        ((se) this).f((byte) 49);
    }

    final static void a(int param0, rk[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, rk param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (param7 < 0) {
              return;
            } else {
              L1: {
                var10_int = param7 / 60;
                var11 = var10_int / 60;
                param7 = param7 % 60;
                if (0 == (4 & param8)) {
                  break L1;
                } else {
                  var10_int = var10_int % 60;
                  break L1;
                }
              }
              L2: {
                var12 = param7 / 10;
                var13 = param7 % 10;
                var14 = var10_int / 10;
                var15 = var10_int % 10;
                var16 = var11 / 10;
                var17 = var11 % 10;
                if ((4 & param8) == 0) {
                  break L2;
                } else {
                  L3: {
                    param1[var16].a(param2, param3, 0, param0);
                    param2 = param2 + (3 + param1[var16].field_j);
                    param1[var17].a(param2, param3, 0, param0);
                    param2 = param2 + (3 + param1[var17].field_j);
                    if ((param8 & 64) == 0) {
                      param9.a(param2, param3, 0, param0);
                      break L3;
                    } else {
                      if ((param7 & 1) != 0) {
                        break L3;
                      } else {
                        param9.a(param2, param3, 0, param0);
                        break L3;
                      }
                    }
                  }
                  param2 = param2 + (param9.field_j + 3);
                  break L2;
                }
              }
              L4: {
                if ((2 & param8) != 0) {
                  L5: {
                    L6: {
                      param1[var14].a(param2, param3, 0, param0);
                      param2 = param2 + (3 + param1[var14].field_j);
                      param1[var15].a(param2, param3, 0, param0);
                      param2 = param2 + (param1[var15].field_j - -3);
                      if ((32 & param8) == 0) {
                        break L6;
                      } else {
                        if ((1 & param7) == 0) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    param9.a(param2, param3, 0, param0);
                    break L5;
                  }
                  param2 = param2 + (param9.field_j - -3);
                  break L4;
                } else {
                  break L4;
                }
              }
              L7: {
                if (0 == (1 & param8)) {
                  break L7;
                } else {
                  param1[var12].a(param2, param3, 0, param0);
                  param2 = param2 + (3 + param1[var12].field_j);
                  param1[var13].a(param2, param3, 0, param0);
                  param2 = param2 + (param1[var13].field_j + 3);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var10;
            stackOut_22_1 = new StringBuilder().append("se.H(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(3).append(',').append(60).append(',').append(0).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param9 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    public static void e(byte param0) {
        field_Y = null;
        field_Z = null;
        field_W = null;
        field_M = null;
        if (param0 != 67) {
            field_X = true;
        }
        field_ab = null;
        field_S = null;
        field_U = null;
        field_N = null;
    }

    final void f(byte param0) {
        int var2 = 0;
        mg var3 = null;
        ub var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        fj var12 = null;
        int var13 = 0;
        int var14 = 0;
        re var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var16 = Chess.field_G;
        ((se) this).field_O = new jc();
        var2 = 0;
        if (param0 >= 27) {
          var3 = (mg) (Object) ((se) this).field_n;
          var4 = var3.a((mf) this, -23159);
          L0: while (true) {
            var5 = ((se) this).field_v.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            } else {
              var7 = ((se) this).field_v.indexOf(">", var5);
              var6 = ((se) this).field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((se) this).field_v.indexOf("</hotspot>", var5);
              var8 = var4.a((byte) -104, var5);
              var9 = var4.a((byte) -29, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_a[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var4.a(-5940, var5);
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var12.field_i[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var9 == var11) {
                      stackOut_13_0 = var4.a(-5940, var2);
                      stackIn_14_0 = stackOut_13_0;
                      break L3;
                    } else {
                      if (var12 != null) {
                        stackOut_12_0 = var12.field_i[var12.field_i.length - 1];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new re(var7, var13, var12.field_d, var14 - var13, Math.max(var3.a((byte) 118), var12.field_e + -var12.field_d));
                    if (var10 != null) {
                      ((re) var10).field_q = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((se) this).field_O.a((o) (Object) var15, (byte) -124);
                  var10 = (Object) (Object) var15;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((se) this).field_Q) {
                  break L2;
                } else {
                  if (param1 < ((se) this).field_Q.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (null == ((se) this).field_Q) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((se) this).field_Q.length) {
                      break L3;
                    } else {
                      var7[var5] = ((se) this).field_Q[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((se) this).field_Q = var8;
              break L1;
            }
            L5: {
              ((se) this).field_Q[param1] = param2;
              if (param0 == -23750) {
                break L5;
              } else {
                field_U = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("se.L(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, -97, param3);
        if (param1 != 0) {
            return;
        }
        mg var5 = (mg) (Object) ((se) this).field_n;
        re var6 = ((se) this).field_R;
        if (var6 == null) {
        } else {
            var7 = var5.a((mf) this, param3, -1581179903);
            var8 = var5.a(0, param0, (mf) this);
            do {
                rc.a(var6.field_k + 2, false, -2 + (var7 - -var6.field_o), 2 + var6.field_l, var6.field_s + var8 + -2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var18 = Chess.field_G;
        try {
          L0: {
            L1: {
              var9 = 3.141592653589793 + Math.atan2((double)(-param0 + param6), (double)(-param5 + param4));
              var11 = hg.a((byte) 26, (double)(-param5 + param4), (double)(param6 - param0)) / (double)param2;
              var13 = var11 * qn.a(-17513, var9);
              if (param3 > 26) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            var15 = var11 * mn.a(var9, 2278);
            var17 = 0;
            L2: while (true) {
              if (var17 >= param1.length) {
                var17 = 0;
                L3: while (true) {
                  if (var17 >= param1.length) {
                    break L0;
                  } else {
                    param1[var17] = param1[var17] + param6;
                    param1[var17 + 1] = param1[var17 + 1] + param4;
                    var17 += 2;
                    continue L3;
                  }
                }
              } else {
                var8 = param1[var17 + 1];
                var7_int = param1[var17];
                param1[var17] = (int)(var15 * (double)var8 + var13 * (double)var7_int);
                param1[1 + var17] = (int)(var13 * (double)var8 + var15 * (double)(-var7_int));
                var17 += 2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7;
            stackOut_10_1 = new StringBuilder().append("se.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    String g(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (null == ((se) this).field_R) {
            return null;
        }
        if (((se) this).field_Q == null) {
            return null;
        }
        if (((se) this).field_R.field_t >= ((se) this).field_Q.length) {
            return null;
        }
        return ((se) this).field_Q[((se) this).field_R.field_t];
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            return;
        }
        super.a(param0, param1, param2, param3);
        int var5 = param3 - ((se) this).field_u;
        int var6 = param0 + -((se) this).field_r;
        re var7 = this.a((byte) 102, var6, var5);
        if (var7 != null) {
            if (null != ((se) this).field_p) {
                ((nn) (Object) ((se) this).field_p).a(var7.field_t, (byte) -108, (se) this, param2);
            }
        }
    }

    se(String param0, jm param1) {
        super(param0, (rg) null);
        ((se) this).field_R = null;
        try {
            ((se) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "se.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            se.e((byte) 29);
        }
        ((se) this).a(param1, 34, ((mg) (Object) ((se) this).field_n).a(true, (mf) this), param3, param0);
    }

    boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var4 = null;
                ((se) this).a(-27, 56, (mf) null, 111);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("se.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final re a(byte param0, int param1, int param2) {
        re var4 = null;
        re var5 = null;
        int var6 = 0;
        L0: {
          var6 = Chess.field_G;
          if (param0 >= 83) {
            break L0;
          } else {
            ((se) this).f((byte) -35);
            break L0;
          }
        }
        var4 = (re) (Object) ((se) this).field_O.g(-18110);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (re) (Object) ((se) this).field_O.a((byte) -92);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_o) {
                    break L3;
                  } else {
                    if (param1 < var5.field_s) {
                      break L3;
                    } else {
                      if (var5.field_l + var5.field_o <= param2) {
                        break L3;
                      } else {
                        if (var5.field_k + var5.field_s < param1) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_q;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Knight";
        field_U = "Inviting <%0>";
        field_N = new dd[7];
        field_ab = new int[]{2, 1, 2, 5, 5, 1, 2, 2, 3, 5, 1};
        field_W = "Report abuse";
        field_M = new java.math.BigInteger("65537");
    }
}
