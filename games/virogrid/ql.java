/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql implements ol {
    private int field_c;
    static String field_e;
    private int field_l;
    static String field_o;
    static int field_t;
    static boolean field_d;
    static String field_i;
    static String field_j;
    private int field_b;
    static String field_f;
    private int field_a;
    static String field_k;
    static String field_p;
    static String field_s;
    private int field_h;
    private int field_n;
    private int field_r;
    static ha field_q;
    static eh field_m;
    private e field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 <= 74) {
            field_o = (String) null;
        }
        cm.field_h.a(param1, param5, param2, (byte) -105, param4);
        if (null != dk.field_v) {
            dk.field_v.a(param6, param3, param3 - bf.field_o, param5, param5, 0);
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = (CharSequence) ((Object) param0);
              var3_int = gg.a(var11, param2, param1 + 139);
              var4 = new String[var3_int + 1];
              var5 = 0;
              if (param1 == -123) {
                break L1;
              } else {
                var10 = (String) null;
                ql.a(110, (String) null, (String) null);
                break L1;
              }
            }
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param0.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param0.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ql.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -89) {
              if (!jd.a(-685, param2)) {
                if (!al.a(param2, 125)) {
                  if (!we.a((byte) 12, param2)) {
                    if (-1 != (param1.length() ^ -1)) {
                      if (!mj.a(param2, param1, (byte) 113)) {
                        if (me.a(param2, param1, true)) {
                          stackIn_21_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (w.a(param2, param1, false)) {
                            stackIn_25_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("ql.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L1;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_17_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static java.awt.Frame a(int param0, int param1, pd param2, int param3, int param4, boolean param5) {
        Object stackIn_3_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ch[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        ch[] var11 = null;
        un var12 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.b(121)) {
              L1: {
                if (param4 == 0) {
                  var11 = eh.a(105, param2);
                  var6 = var11;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var11.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (var11[var8].field_c == param3) {
                          L3: {
                            if (param1 == var11[var8].field_k) {
                              L4: {
                                if (param0 == 0) {
                                  break L4;
                                } else {
                                  if (var11[var8].field_d == param0) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var11[var8].field_g > param4) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param4 = var11[var8].field_g;
                              var7_int = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                if (!param5) {
                  break L6;
                } else {
                  var10 = (String) null;
                  ql.a((String) null, (byte) 7, '￞');
                  break L6;
                }
              }
              var12 = param2.a(param0, param4, param3, 1289287280, param1);
              L7: while (true) {
                if (var12.field_a != 0) {
                  var7 = (java.awt.Frame) (var12.field_f);
                  if (var7 != null) {
                    if (2 != var12.field_a) {
                      stackIn_39_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      ah.a((byte) 71, param2, var7);
                      stackIn_37_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_34_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  mm.a(-25, 10L);
                  continue L7;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6_ref);

            stackIn_42_1 = new StringBuilder().append("ql.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L8;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_26_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_34_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_37_0);
              } else {
                return stackIn_39_0;
              }
            }
          }
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qn var14 = null;
        fi stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof qn)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (fi) (param1);
                break L1;
              }
            }
            L2: {
              var14 = (qn) ((Object) stackIn_3_0);
              df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, this.field_h);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var14.field_M + (param0 + param1.field_l);
              var8 = var14.field_N + (param3 - -param1.field_u);
              df.c(var7, var8, var14.field_F, this.field_c);
              if (-1 == var14.field_O) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var14.field_O * 3.141592653589793) / (double)var14.field_Q;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
                var12 = (int)(Math.cos(var9) * (double)var14.field_F);
                df.c(var11 + var7, var12 + var8, 1, this.field_r);
                break L3;
              }
            }
            L4: {
              if (param4 == -23294) {
                break L4;
              } else {
                ql.a((byte) -39, -110, 72, -97, -121, -28, 103);
                break L4;
              }
            }
            L5: {
              df.c(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_G * 2.0 / (double)var14.field_Q;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
              var12 = (int)(Math.cos(var9) * (double)var14.field_F);
              df.a(var7, var8, var11 + var7, var8 - -var12, 1);
              if (null == this.field_g) {
                break L5;
              } else {
                var13 = var14.field_F + var14.field_M + this.field_b;
                this.field_g.a(param1.field_n, var13 + (param1.field_l + param0), param1.field_u + param3 + this.field_n, -var13 + (-this.field_b + param1.field_g), param1.field_m - (this.field_b << -468976159), this.field_l, this.field_a, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ql.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_m = null;
        field_k = null;
        field_e = null;
        field_p = null;
        if (param0 > -76) {
            field_p = (String) null;
        }
        field_q = null;
        field_s = null;
        field_j = null;
        field_o = null;
        field_f = null;
    }

    ql(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_a = param4;
            this.field_b = param1;
            this.field_c = param5;
            this.field_r = param6;
            this.field_n = param2;
            this.field_l = param3;
            this.field_h = param7;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_e = "Advertising websites";
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = "Go Back";
        field_d = true;
        field_f = "Show private chat from my friends and opponents";
        field_k = "You cannot add yourself!";
        field_s = "Lost";
        field_j = "Options Menu";
        field_t = 200;
        field_p = "Show lobby chat from my friends";
    }
}
