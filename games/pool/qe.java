/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ma {
    byte field_H;
    int field_P;
    int field_M;
    int field_N;
    static String field_r;
    byte field_D;
    static String field_F;
    static String field_K;
    static int field_y;
    int field_n;
    ge field_T;
    static String field_p;
    static String field_B;
    int field_u;
    short field_C;
    int field_I;
    ko field_m;
    byte field_w;
    int[] field_U;
    static String field_G;
    static String field_O;
    int field_v;
    boolean field_t;
    int field_L;
    static int field_o;
    static oc[] field_S;
    int field_Q;
    int field_z;
    int field_q;
    static int field_J;
    short field_A;
    boolean field_E;
    short field_V;
    byte field_l;
    ko field_R;
    long field_x;
    int field_s;

    final boolean a(byte param0, int param1) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cr var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            var3 = new aa(((qe) this).field_m);
            var4 = 105 / ((param0 - -53) / 59);
            var5 = (cr) (Object) var3.b((byte) -92);
            L1: while (true) {
              if (null == var5) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (var5.field_n == param1) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var5 = (cr) (Object) var3.b(-108);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "qe.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static tc b(boolean param0) {
        RuntimeException var1 = null;
        tc stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            stackOut_3_0 = w.a(false, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "qe.S(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0, al param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                tc discarded$1 = qe.b(false);
                break L1;
              }
            }
            L2: {
              var3_ref = "Shot " + ((qe) this).field_v + " " + am.a(8, ((qe) this).field_q) + " player " + param1.field_h[((qe) this).field_L];
              if (0 <= ((qe) this).field_M) {
                var3_ref = var3_ref + " break seed " + ((qe) this).field_M;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = ((qe) this).field_u;
              if (var4 != 2) {
                if (var4 != 3) {
                  if (var4 == 1) {
                    var3_ref = var3_ref + " BiH kitchen";
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var3_ref = var3_ref + " BiH D";
                  break L3;
                }
              } else {
                var3_ref = var3_ref + " BiH anywhere";
                break L3;
              }
            }
            L4: {
              var3_ref = var3_ref + " before_group_on=" + ((qe) this).field_z;
              if (null != ((qe) this).field_T) {
                break L4;
              } else {
                var3_ref = var3_ref + " before state null!";
                break L4;
              }
            }
            stackOut_21_0 = (String) var3_ref;
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("qe.E(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_22_0;
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -66) {
              L1: {
                L2: {
                  if (0 == (ab.field_g & ((qe) this).field_s)) {
                    break L2;
                  } else {
                    if ((24 & ((qe) this).field_l) != 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.O(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(ge param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              param0.a((int) ((qe) this).field_l, false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("qe.U(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_K = null;
        field_B = null;
        field_r = null;
        field_F = null;
        field_G = null;
        if (param0 < 100) {
            return;
        }
        try {
            field_p = null;
            field_O = null;
            field_S = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qe.AA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((qe) this).field_R) {
                ((qe) this).field_R = new ko();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((qe) this).field_R.b((byte) 124, (ma) (Object) new dn(param0, param2));
              if (param1 == -14) {
                break L2;
              } else {
                field_S = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("qe.W(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        try {
            p.a(param3, param2 ^ 40844);
            hp.a(param1, param3, param0, 30);
            if (param2 != -40960) {
                tc discarded$0 = qe.b(false);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qe.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(byte param0, ge param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((qe) this).a(param1.g(-105), true);
              if (!((qe) this).d(117)) {
                ((qe) this).field_q = 3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 13) {
                break L2;
              } else {
                boolean discarded$2 = this.a(30, -70);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (~param5 <= ~qh.field_b) {
                break L1;
              } else {
                param0 = param0 - (-param5 + qh.field_b);
                param5 = qh.field_b;
                break L1;
              }
            }
            L2: {
              if (param3 >= qh.field_c) {
                break L2;
              } else {
                param1 = param1 - (-param3 + qh.field_c);
                param3 = qh.field_c;
                break L2;
              }
            }
            L3: {
              if (~qh.field_j <= ~(param0 + param5)) {
                break L3;
              } else {
                param0 = qh.field_j - param5;
                break L3;
              }
            }
            L4: {
              if (~qh.field_g <= ~(param3 + param1)) {
                break L4;
              } else {
                param1 = qh.field_g + -param3;
                break L4;
              }
            }
            L5: {
              if (param0 <= 0) {
                break L5;
              } else {
                if (param1 > 0) {
                  var6_int = param5 - -(qh.field_l * param3);
                  var7 = -param0 + qh.field_l;
                  param3 = -param1;
                  if (param4 >= 94) {
                    L6: while (true) {
                      if (0 <= param3) {
                        break L0;
                      } else {
                        param5 = -param0;
                        L7: while (true) {
                          if (0 <= param5) {
                            var6_int = var6_int + var7;
                            param3++;
                            continue L6;
                          } else {
                            L8: {
                              var8 = qh.field_d[var6_int];
                              if (~param2 <= ~((65280 & var8) >> -2093264728)) {
                                break L8;
                              } else {
                                if (~((var8 & 65280) >> 1123533864) > ~((var8 & 16711680) >> 8653456)) {
                                  break L8;
                                } else {
                                  L9: {
                                    var9 = ((16711680 & var8) >> -946288753) - 60;
                                    if (var9 <= 255) {
                                      break L9;
                                    } else {
                                      var9 = 255;
                                      break L9;
                                    }
                                  }
                                  var10 = 65280 & var8;
                                  var10 = 65280 & (var10 >> 564463041) - (var10 >> 2095801381);
                                  var11 = (255 & var8) >> -249552189;
                                  qh.field_d[var6_int] = md.a(var11, md.a(var9 << -553475728, var10));
                                  break L8;
                                }
                              }
                            }
                            var6_int++;
                            param5++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var6, "qe.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0;
              var3 = im.field_fc;
              if (var3 >= 5) {
                if (var3 >= 105) {
                  if (120 > var3) {
                    var3 = -var3 + 120;
                    var2_int = 8192 - var3 * (var3 * 8192) / 3300;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var2_int = (-40960 + 16384 * var3) / 220;
                  break L1;
                }
              } else {
                var2_int = var3 * var3 * 8192 / 1100;
                break L1;
              }
            }
            L2: {
              var4 = 1;
              var5 = 0;
              if (param1 == 1) {
                var5 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != 3) {
                break L3;
              } else {
                var4 = -1;
                break L3;
              }
            }
            L4: {
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 == 5) {
                var4 = -1;
                var5 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              L8: {
                if (param1 == 7) {
                  break L8;
                } else {
                  if (param1 == 8) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              var4 = -1;
              var5 = -1;
              break L7;
            }
            L9: {
              if (param1 == 11) {
                var4 = -1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1 == 14) {
                var5 = 1;
                var4 = -1;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param1 != 15) {
                break L13;
              } else {
                var4 = 1;
                var5 = 1;
                break L13;
              }
            }
            li.field_b = cf.a(var2_int * var5, false, var2_int * var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final byte c(byte param0, ge param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -28) {
                break L1;
              } else {
                ((qe) this).field_T = null;
                break L1;
              }
            }
            var3_int = param1.g(-78) & 255;
            if ((((qe) this).field_v & 255) != var3_int) {
              L2: {
                param1.field_v = param1.field_v + 6;
                if (~var3_int > ~(((qe) this).field_v - 1)) {
                  System.out.println("Read the wrong move packet. Wanted " + ((qe) this).field_v + ", but got " + var3_int);
                  break L2;
                } else {
                  break L2;
                }
              }
              stackOut_30_0 = 1;
              stackIn_31_0 = stackOut_30_0;
              break L0;
            } else {
              var4 = param1.d((byte) -80);
              var5 = param1.d((byte) -108);
              var6 = param1.d((byte) -103);
              var7 = param1.e((byte) 105);
              var8 = param1.e((byte) 105);
              if (((qe) this).field_q == 0) {
                ((qe) this).field_D = (byte)var7;
                ((qe) this).field_H = (byte)var8;
                ((qe) this).field_C = (short)var4;
                ((qe) this).field_V = (short)var6;
                ((qe) this).field_A = (short)var5;
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                return (byte) stackIn_25_0;
              } else {
                L3: {
                  L4: {
                    if (((qe) this).field_C != var4) {
                      break L4;
                    } else {
                      if (~var5 != ~((qe) this).field_A) {
                        break L4;
                      } else {
                        if (var6 != ((qe) this).field_V) {
                          break L4;
                        } else {
                          if (((qe) this).field_D != var7) {
                            break L4;
                          } else {
                            if (~var8 != ~((qe) this).field_H) {
                              break L4;
                            } else {
                              stackOut_20_0 = 0;
                              stackIn_23_0 = stackOut_20_0;
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_22_0 = 2;
                  stackIn_23_0 = stackOut_22_0;
                  break L3;
                }
                return (byte) stackIn_23_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("qe.J(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return (byte) stackIn_31_0;
    }

    final void b(ge param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (((qe) this).field_q == 2) {
                break L1;
              } else {
                if (3 != ((qe) this).field_q) {
                  throw new IllegalStateException("Can't write an end resolution until the shot is finished");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param0.b(((qe) this).field_s, 66);
              if (param1 < -65) {
                break L2;
              } else {
                String discarded$2 = qe.a(false, 'ﾨ');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qe.N(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final String a(boolean param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        try {
          L0: {
            L1: {
              var2 = "end choice: ";
              if ((((qe) this).field_l & 1) != 0) {
                var2 = var2 + "; group 0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((((qe) this).field_l & 2) == 0) {
                break L2;
              } else {
                var2 = var2 + "; group 1";
                break L2;
              }
            }
            L3: {
              if ((((qe) this).field_l & 16) == 0) {
                break L3;
              } else {
                var2 = var2 + "; pass";
                break L3;
              }
            }
            L4: {
              if (param0) {
                break L4;
              } else {
                qe.a(82, -62, 92, 61, (byte) 96, -63);
                break L4;
              }
            }
            L5: {
              if ((8 & ((qe) this).field_l) == 0) {
                break L5;
              } else {
                var2 = var2 + "; play";
                break L5;
              }
            }
            L6: {
              if ((64 & ((qe) this).field_l) == 0) {
                break L6;
              } else {
                var2 = var2 + "; opponent pass";
                break L6;
              }
            }
            L7: {
              if (0 != (((qe) this).field_l & 32)) {
                var2 = var2 + "; opponent play";
                break L7;
              } else {
                break L7;
              }
            }
            stackOut_19_0 = (String) var2;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2_ref, "qe.V(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final void a(al param0, ge param1, int param2) {
        RuntimeException runtimeException = null;
        al var4 = null;
        ge var4_ref = null;
        pq var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = param0;
              var5 = var4.field_l[0];
              ((qe) this).field_Q = var5.field_k;
              ((qe) this).field_P = var5.field_g;
              if (param2 == -7478) {
                break L1;
              } else {
                ((qe) this).field_t = false;
                break L1;
              }
            }
            var4_ref = param1;
            var4_ref.a(true, ((qe) this).field_P);
            var4_ref.a(true, ((qe) this).field_Q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("qe.K(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    final String c(int param0) {
        RuntimeException var2 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        String stackIn_7_1 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_3_0 = null;
        StringBuilder stackOut_6_0 = null;
        String stackOut_6_1 = null;
        StringBuilder stackOut_4_0 = null;
        String stackOut_4_1 = null;
        String stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 26859) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = new StringBuilder().append("firstcontactid: ").append(((qe) this).field_n).append(", pottings: ").append(((qe) this).field_m.a(45));
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((qe) this).field_t) {
                stackOut_6_0 = (StringBuilder) (Object) stackIn_6_0;
                stackOut_6_1 = ", fouled";
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = (StringBuilder) (Object) stackIn_4_0;
                stackOut_4_1 = "";
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            stackOut_7_0 = stackIn_7_1 + ", resolution: " + ab.a(((qe) this).field_s, (byte) 10);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.C(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final boolean c(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (0 == (oa.field_b & ((qe) this).field_s)) {
                    break L2;
                  } else {
                    if ((3 & ((qe) this).field_l) != 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.L(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final String e(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_10_0 = null;
        String stackIn_10_1 = null;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_3_0 = null;
        StringBuilder stackOut_4_0 = null;
        StringBuilder stackOut_9_0 = null;
        String stackOut_9_1 = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_7_0 = null;
        String stackOut_7_1 = null;
        String stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  stackOut_3_0 = new StringBuilder().append("ang=").append(((qe) this).field_C).append(",").append(((qe) this).field_A).append("; pow=").append(((qe) this).field_V).append("; strk=").append(((qe) this).field_D).append(",").append(((qe) this).field_H);
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (-1 == ((qe) this).field_P) {
                    break L2;
                  } else {
                    stackOut_4_0 = (StringBuilder) (Object) stackIn_4_0;
                    stackIn_9_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((qe) this).field_Q != -1) {
                      stackOut_9_0 = (StringBuilder) (Object) stackIn_9_0;
                      stackOut_9_1 = " cueball@" + ((qe) this).field_P + "," + ((qe) this).field_Q;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L1;
                    } else {
                      stackOut_5_0 = (StringBuilder) (Object) stackIn_5_0;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = (StringBuilder) (Object) stackIn_7_0;
                stackOut_7_1 = "";
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                break L1;
              }
              stackOut_10_0 = (String) (Object) (stackIn_10_1);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.A(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if ((oa.field_b & ((qe) this).field_s) == 0) {
                break L1;
              } else {
                if ((3 & param0) != 0) {
                  var3_int = ((qe) this).field_l & 3;
                  if (var3_int == 0) {
                    var3_int = param0;
                    ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                    break L1;
                  } else {
                    if (~var3_int != ~param0) {
                      throw new IllegalStateException("Already made another group choice!");
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((ab.field_g & ((qe) this).field_s) == 0) {
                break L2;
              } else {
                if ((param0 & 24) == 0) {
                  break L2;
                } else {
                  var3_int = ((qe) this).field_l & 24;
                  if (var3_int == 0) {
                    var3_int = param0;
                    ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                    break L2;
                  } else {
                    if (param0 != var3_int) {
                      throw new IllegalStateException("Already made another play/pass choice!");
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if ((a.field_d & ((qe) this).field_s) == 0) {
                break L3;
              } else {
                if ((96 & param0) == 0) {
                  break L3;
                } else {
                  L4: {
                    var3_int = ((qe) this).field_l & 96;
                    if (var3_int != 0) {
                      break L4;
                    } else {
                      var3_int = param0;
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (~var3_int != ~param0) {
                    throw new IllegalStateException("Already made another opponent play/pass choice!");
                  } else {
                    break L3;
                  }
                }
              }
            }
            L5: {
              if (!this.a(-28872, param0)) {
                break L5;
              } else {
                ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                if (var4 == 0) {
                  L6: {
                    if (param1) {
                      break L6;
                    } else {
                      ((qe) this).b((byte) 32, (ge) null);
                      break L6;
                    }
                  }
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            throw new IllegalStateException("Can't make a choice now!");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "qe.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (~((qe) this).field_s != ~uk.field_a) {
              if (param0 >= 105) {
                L1: {
                  L2: {
                    if (((qe) this).c(true)) {
                      break L2;
                    } else {
                      if (((qe) this).a(-103)) {
                        break L2;
                      } else {
                        if (!((qe) this).c((byte) 85)) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_16_0 = stackOut_13_0;
                  break L1;
                }
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.R(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = param1.f(98);
            if (param0 >= 76) {
              L1: {
                ((qe) this).c(2, var3_int);
                if ((pd.field_i & 2097152L) != 0L) {
                  System.out.println("->S2C_END_SHOT: " + ab.a(((qe) this).field_s, (byte) 10));
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qe.F(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static String a(boolean param0, char param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = String.valueOf(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void c(int param0, int param1) {
        try {
            RuntimeException var3 = null;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 2) {
                  L1: {
                    if (~uk.field_a == ~((qe) this).field_s) {
                      ((qe) this).field_s = param1;
                      break L1;
                    } else {
                      if (((qe) this).field_s == param1) {
                        break L1;
                      } else {
                        tc.a(new Throwable(), "New end resolution 0b" + Integer.toString(((qe) this).field_s, 2) + ": " + wd.b(param1, param0 ^ 87) + " does not match current one 0b" + Integer.toString(param1, 2) + ": " + wd.b(((qe) this).field_s, 77), -8555);
                        break L1;
                      }
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              throw wm.a((Throwable) (Object) var3, "qe.M(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        try {
          L0: {
            L1: {
              if ((((qe) this).field_s & oa.field_b) == 0) {
                break L1;
              } else {
                if ((param1 & 3) == 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if ((3 & ((qe) this).field_l) == 0) {
                        break L3;
                      } else {
                        if (~(3 & ((qe) this).field_l) != ~param1) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    break L2;
                  }
                  return stackIn_13_0 != 0;
                }
              }
            }
            L4: {
              if ((ab.field_g & ((qe) this).field_s) == 0) {
                break L4;
              } else {
                if (0 == (24 & param1)) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if ((24 & ((qe) this).field_l) == 0) {
                        break L6;
                      } else {
                        if ((24 & ((qe) this).field_l) != param1) {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_24_0 = 1;
                    stackIn_27_0 = stackOut_24_0;
                    break L5;
                  }
                  return stackIn_27_0 != 0;
                }
              }
            }
            L7: {
              if (param0 == -28872) {
                break L7;
              } else {
                ((qe) this).field_A = (short) 5;
                break L7;
              }
            }
            L8: {
              if ((((qe) this).field_s & a.field_d) == 0) {
                break L8;
              } else {
                if ((param1 & 96) == 0) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if ((((qe) this).field_l & 96) == 0) {
                        break L10;
                      } else {
                        if (param1 != (96 & ((qe) this).field_l)) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    stackOut_41_0 = 1;
                    stackIn_44_0 = stackOut_41_0;
                    break L9;
                  }
                  return stackIn_44_0 != 0;
                }
              }
            }
            L11: {
              if (param1 != 0) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L11;
              } else {
                stackOut_46_0 = 1;
                stackIn_49_0 = stackOut_46_0;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "qe.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_49_0 != 0;
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 73) {
                break L1;
              } else {
                ((qe) this).field_H = (byte) 46;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((((qe) this).field_s & a.field_d) == 0) {
                  break L3;
                } else {
                  if ((((qe) this).field_l & 96) != 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "qe.I(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    qe() {
        ((qe) this).field_N = -1;
        ((qe) this).field_P = -1;
        ((qe) this).field_w = (byte) 0;
        ((qe) this).field_t = false;
        ((qe) this).field_M = -1;
        ((qe) this).field_u = 0;
        ((qe) this).field_Q = -1;
        ((qe) this).field_q = 0;
        ((qe) this).field_E = false;
        ((qe) this).field_I = -1;
        ((qe) this).field_n = -1;
        ((qe) this).field_V = (short) -1;
        ((qe) this).field_m = new ko();
        ((qe) this).field_x = 0L;
        ((qe) this).field_l = (byte) 0;
        ((qe) this).field_R = null;
        ((qe) this).field_s = uk.field_a;
    }

    qe(int param0, int param1) {
        ((qe) this).field_N = -1;
        ((qe) this).field_P = -1;
        ((qe) this).field_w = (byte) 0;
        ((qe) this).field_t = false;
        ((qe) this).field_M = -1;
        ((qe) this).field_u = 0;
        ((qe) this).field_Q = -1;
        ((qe) this).field_q = 0;
        ((qe) this).field_E = false;
        ((qe) this).field_I = -1;
        ((qe) this).field_n = -1;
        ((qe) this).field_V = (short) -1;
        ((qe) this).field_m = new ko();
        ((qe) this).field_x = 0L;
        ((qe) this).field_l = (byte) 0;
        ((qe) this).field_R = null;
        ((qe) this).field_s = uk.field_a;
        try {
            ((qe) this).field_L = param1;
            ((qe) this).field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qe.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "mm:ss.ff";
        field_B = "Honour";
        field_G = "Lost";
        field_K = "Unable to delete friend - system busy";
        field_F = "<%0> is out of lives!";
        field_p = "Menu";
        field_O = "With Guides";
    }
}
