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
        int[] var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -6) {
                break L1;
              } else {
                var7 = (int[]) null;
                se.a(39, (int[]) null, -35, (byte) 95, 6, 9, 86);
                break L1;
              }
            }
            L2: {
              super.a(param0, -8, param2, param3);
              this.field_R = null;
              if (!this.field_w) {
                break L2;
              } else {
                var5_int = hn.field_k + -param0 + -this.field_u;
                var6 = -this.field_r + (rf.field_b - param3);
                this.field_R = this.a((byte) 126, var6, var5_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("se.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.f((byte) 49);
    }

    final static void a(int param0, rk[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, rk param9) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          L0: {
            if (-1 < (param7 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10_int = param7 / param5;
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
                    param1[var16].a(param2, param3, param6, param0);
                    param2 = param2 + (param4 + param1[var16].field_j);
                    param1[var17].a(param2, param3, param6, param0);
                    param2 = param2 + (param4 + param1[var17].field_j);
                    if (-1 == (param8 & 64 ^ -1)) {
                      param9.a(param2, param3, param6, param0);
                      break L3;
                    } else {
                      if ((param7 & 1) != 0) {
                        break L3;
                      } else {
                        param9.a(param2, param3, param6, param0);
                        break L3;
                      }
                    }
                  }
                  param2 = param2 + (param9.field_j + param4);
                  break L2;
                }
              }
              L4: {
                if ((2 & param8) != 0) {
                  L5: {
                    L6: {
                      param1[var14].a(param2, param3, param6, param0);
                      param2 = param2 + (param4 + param1[var14].field_j);
                      param1[var15].a(param2, param3, param6, param0);
                      param2 = param2 + (param1[var15].field_j - -param4);
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
                    param9.a(param2, param3, param6, param0);
                    break L5;
                  }
                  param2 = param2 + (param9.field_j - -param4);
                  break L4;
                } else {
                  break L4;
                }
              }
              L7: {
                if (0 == (1 & param8)) {
                  break L7;
                } else {
                  param1[var12].a(param2, param3, param6, param0);
                  param2 = param2 + (param4 + param1[var12].field_j);
                  param1[var13].a(param2, param3, param6, param0);
                  param2 = param2 + (param1[var13].field_j + param4);
                  break L7;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var10);

            stackIn_24_1 = new StringBuilder().append("se.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_Y = (byte[][][]) null;
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
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        mg var3;
        ub var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        fj var12;
        int var13;
        int var14;
        re var15;
        int var16;
        var16 = Chess.field_G;
        this.field_O = new jc();
        var2 = 0;
        if (param0 >= 27) {
          var3 = (mg) ((Object) this.field_n);
          var4 = var3.a((mf) (this), -23159);
          L0: while (true) {
            var5 = this.field_v.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            } else {
              var7 = this.field_v.indexOf(">", var5);
              var6 = this.field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_v.indexOf("</hotspot>", var5);
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
                    if ((var8 ^ -1) == (var11 ^ -1)) {
                      stackIn_9_0 = var4.a(-5940, var5);
                      break L2;
                    } else {
                      stackIn_9_0 = var12.field_i[0];
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var9 == var11) {
                      stackIn_14_0 = var4.a(-5940, var2);
                      break L3;
                    } else {
                      if (var12 != null) {
                        stackIn_14_0 = var12.field_i[var12.field_i.length - 1];
                        break L3;
                      } else {
                        stackIn_14_0 = 0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new re(var7, var13, var12.field_d, var14 - var13, Math.max(var3.a((byte) 118), var12.field_e + -var12.field_d));
                    if (var10 != null) {
                      ((re) (var10)).field_q = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_O.a((o) (var15), (byte) -124);
                  var10 = var15;
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
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_Q) {
                  break L2;
                } else {
                  if (param1 < this.field_Q.length) {
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
                if (null == this.field_Q) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_Q.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_Q[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_Q = var8;
              break L1;
            }
            L5: {
              this.field_Q[param1] = param2;
              if (param0 == -23750) {
                break L5;
              } else {
                field_U = (String) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("se.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, -97, param3);
        if (param1 != 0) {
            return;
        }
        mg var9 = (mg) ((Object) this.field_n);
        re var6 = this.field_R;
        if (var6 == null) {
        } else {
            var7 = var9.a((mf) (this), param3, -1581179903);
            var8 = var9.a(0, param0, (mf) (this));
            do {
                rc.a(var6.field_k + 2, false, -2 + (var7 - -var6.field_o), 2 + var6.field_l, var6.field_s + var8 + -2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
        if (param2 > -80) {
            this.a(-120, true, 63, 80);
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
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
                field_M = (java.math.BigInteger) null;
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
            stackIn_12_0 = (RuntimeException) (var7);

            stackIn_12_1 = new StringBuilder().append("se.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    String g(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        if (null == this.field_R) {
            return null;
        }
        if (this.field_Q == null) {
            return null;
        }
        if (this.field_R.field_t >= this.field_Q.length) {
            return null;
        }
        return this.field_Q[this.field_R.field_t];
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            return;
        }
        super.a(param0, param1, param2, param3);
        int var5 = param3 - this.field_u;
        int var6 = param0 + -this.field_r;
        re var7 = this.a((byte) 102, var6, var5);
        if (var7 != null && null != this.field_p) {
            ((nn) ((Object) this.field_p)).a(var7.field_t, (byte) -108, (se) (this), param2);
        }
    }

    se(String param0, jm param1) {
        super(param0, (rg) null);
        this.field_R = null;
        try {
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            se.e((byte) 29);
        }
        this.a(param1, 34, ((mg) ((Object) this.field_n)).a(true, (mf) (this)), param3, param0);
    }

    boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        mf var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (mf) null;
                this.a(-27, 56, (mf) null, 111);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("se.D(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final re a(byte param0, int param1, int param2) {
        re var4;
        re var5;
        int var6;
        L0: {
          var6 = Chess.field_G;
          if (param0 >= 83) {
            break L0;
          } else {
            this.f((byte) -35);
            break L0;
          }
        }
        var4 = (re) ((Object) this.field_O.g(-18110));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (re) ((Object) this.field_O.a((byte) -92));
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
        field_Z = "Knight";
        field_U = "Inviting <%0>";
        field_N = new dd[7];
        field_ab = new int[]{2, 1, 2, 5, 5, 1, 2, 2, 3, 5, 1};
        field_W = "Report abuse";
        field_M = new java.math.BigInteger("65537");
    }
}
