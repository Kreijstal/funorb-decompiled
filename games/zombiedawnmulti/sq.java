/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sq extends gn {
    static int field_R;
    private String[] field_M;
    private th field_T;
    static boolean field_N;
    static int field_S;
    private wi field_V;
    static int field_Q;
    static int field_O;
    static int[] field_U;
    static String field_P;

    final static void a(int param0, int param1, int param2, int param3, ja param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ja var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 >= oo.field_f) {
                break L1;
              } else {
                param1 = param1 - (oo.field_f - param6);
                param6 = oo.field_f;
                break L1;
              }
            }
            L2: {
              if (param7 < oo.field_e) {
                param3 = param3 - (oo.field_e - param7);
                param7 = oo.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (oo.field_g < param6 - -param1) {
                param1 = oo.field_g - param6;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (oo.field_d < param7 + param3) {
                param3 = -param7 + oo.field_d;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 <= 0) {
                break L5;
              } else {
                if (param3 > 0) {
                  var21 = param4.c();
                  var32 = oo.field_i;
                  var10 = oo.field_b;
                  var11 = oo.field_l;
                  var30 = new int[4];
                  oo.a(var30);
                  param4.a();
                  oo.e(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param6 + param7 * param4.field_x;
                  var14 = param4.field_x + -param1;
                  var31 = var21.field_B;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param7;
                  L6: while (true) {
                    if (param3 + param7 <= var16) {
                      var21.g(-param4.field_r, -param4.field_y);
                      oo.a(var32, var10, var11);
                      oo.b(var30);
                      break L0;
                    } else {
                      var17 = param6;
                      L7: while (true) {
                        if (var17 >= param6 - -param1) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (var18 == 0) {
                              break L8;
                            } else {
                              L9: {
                                if (0 >= var17) {
                                  break L9;
                                } else {
                                  if (-1 == var15[-1 + var13]) {
                                    oo.d(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (-1 >= var16) {
                                  break L10;
                                } else {
                                  if (0 == var15[var13 - param4.field_x]) {
                                    oo.d(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (param4.field_x + -1 <= var17) {
                                  break L11;
                                } else {
                                  if (var15[var13 - -1] == 0) {
                                    oo.d(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (-1 + param4.field_w <= var16) {
                                break L8;
                              } else {
                                if (var15[var13 - -param4.field_x] != 0) {
                                  break L8;
                                } else {
                                  oo.d(var17, var16, param2, 1);
                                  break L8;
                                }
                              }
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
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
          L12: {
            var8 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var8;
            stackOut_41_1 = new StringBuilder().append("sq.RA(").append(5).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param4 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((sq) this).field_y + param2;
        int var6 = -((sq) this).field_i + param3;
        wi var7 = this.a((byte) 23, var5, var6);
        if (var7 != null) {
            if (null != ((sq) this).field_A) {
                ((co) (Object) ((sq) this).field_A).a(param1, (sq) this, -38, var7.field_l);
            }
        }
    }

    private final wi a(byte param0, int param1, int param2) {
        wi var4 = null;
        wi var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (wi) (Object) ((sq) this).field_T.c(105);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (wi) (Object) ((sq) this).field_T.b(6);
                continue L0;
              } else {
                L2: {
                  if (var5.field_k > param1) {
                    break L2;
                  } else {
                    if (param2 < var5.field_f) {
                      break L2;
                    } else {
                      if (param1 >= var5.field_j + var5.field_k) {
                        break L2;
                      } else {
                        if (param2 > var5.field_n + var5.field_f) {
                          break L2;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_i;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (param0 == -5407) {
                break L1;
              } else {
                var7 = null;
                ((sq) this).a(93, (cf) null, 109, -90);
                break L1;
              }
            }
            L2: {
              ((sq) this).field_V = null;
              if (((sq) this).field_l) {
                var5_int = bd.field_g - (param2 + ((sq) this).field_y);
                var6 = bo.field_d + (-param3 - ((sq) this).field_i);
                ((sq) this).field_V = this.a((byte) 23, var5_int, var6);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sq.T(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != -4) {
            field_S = 74;
        }
        ((sq) this).b(param3, param1, param2 ^ -28976, param0, ((rk) (Object) ((sq) this).field_h).a((byte) 39, (cf) this));
    }

    final void a(byte param0) {
        int var2 = 0;
        rk var3 = null;
        mp var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        td var12 = null;
        int var13 = 0;
        int var14 = 0;
        wi var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          ((sq) this).field_T = new th();
          var2 = 0;
          if (param0 == 94) {
            break L0;
          } else {
            ((sq) this).a((byte) -110);
            break L0;
          }
        }
        var3 = (rk) (Object) ((sq) this).field_h;
        var4 = var3.a((cf) this, -102);
        L1: while (true) {
          var5 = ((sq) this).field_j.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((sq) this).field_j.indexOf(">", var5);
            var6 = ((sq) this).field_j.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((sq) this).field_j.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) -126, var5);
            var9 = var4.a((byte) -126, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_e[var11];
                  if (var8 == var11) {
                    stackOut_9_0 = var4.a(52224, var5);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var12.field_e[0];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 == var11) {
                    stackOut_14_0 = var4.a(52224, var2);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var12.field_e[-1 + var12.field_e.length];
                      stackIn_15_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new wi(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(0), var12.field_h - var12.field_d));
                  if (var10 != null) {
                    ((wi) var10).field_i = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((sq) this).field_T.a((br) (Object) var15, false);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void f() {
        field_P = null;
        field_U = null;
    }

    String d(byte param0) {
        if (null == ((sq) this).field_V) {
            return null;
        }
        if (((sq) this).field_M == null) {
            return null;
        }
        if (((sq) this).field_M.length <= ((sq) this).field_V.field_l) {
            return null;
        }
        int var2 = 95 / ((53 - param0) / 57);
        return ((sq) this).field_M[((sq) this).field_V.field_l];
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                ((sq) this).a((byte) 97);
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
            stackOut_4_1 = new StringBuilder().append("sq.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    sq(String param0, nl param1) {
        super(param0, (bj) null);
        ((sq) this).field_V = null;
        try {
            ((sq) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        rk var5 = (rk) (Object) ((sq) this).field_h;
        wi var6 = ((sq) this).field_V;
        if (var6 != null) {
            var7 = var5.a(false, param3, (cf) this);
            var8 = var5.a((cf) this, 0, param1);
            do {
                hl.a(-2 + var6.field_f + var8, var7 - (-var6.field_k + 2), (byte) 126, var6.field_j + 2, 2 + var6.field_n);
                var6 = var6.field_i;
            } while (var6 != null);
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((sq) this).field_M) {
                  break L2;
                } else {
                  if (param0 < ((sq) this).field_M.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param0];
                var8 = var7;
                var4 = var8;
                if (((sq) this).field_M != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((sq) this).field_M.length) {
                      break L3;
                    } else {
                      var7[var5] = ((sq) this).field_M[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((sq) this).field_M = var8;
              break L1;
            }
            if (param1 <= -101) {
              ((sq) this).field_M[param0] = param2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("sq.OA(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((sq) this).a((byte) 94);
    }

    final static void g() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        pd stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        pd stackOut_43_0 = null;
        pd stackOut_42_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = ce.field_k;
              var2 = 0;
              if (ho.field_q == 2) {
                var3_long = bl.a((byte) 49) + -so.field_s;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (hq.field_m.length <= var3) {
                var3 = 0;
                break L0;
              } else {
                L3: {
                  var4 = wd.field_Q[var3];
                  if (var4 >= 0) {
                    if (~var4 != ~aq.field_B.field_d) {
                      var5 = hp.field_k;
                      break L3;
                    } else {
                      var5 = fq.field_n;
                      break L3;
                    }
                  } else {
                    var5 = qh.field_e;
                    break L3;
                  }
                }
                L4: {
                  var6 = hq.field_m[var3];
                  if (ho.field_q != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (aa.field_n.length < q.field_a.length) {
                          stackOut_17_0 = q.field_a.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = aa.field_n.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (var3 >= 6 - -var7) {
                            break L6;
                          } else {
                            L7: {
                              if (0 > -6 + var3 - (-aa.field_n.length + var7)) {
                                stackOut_22_0 = "";
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = aa.field_n[var3 - (6 + (-aa.field_n.length + var7))];
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_23_0;
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (ud.field_N.length <= ik.field_a.length) {
                          stackOut_26_0 = ik.field_a.length;
                          stackIn_27_0 = stackOut_26_0;
                          break L8;
                        } else {
                          stackOut_25_0 = ud.field_N.length;
                          stackIn_27_0 = stackOut_25_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_27_0;
                      if (7 + var7 > var3) {
                        break L4;
                      } else {
                        if (var7 + 7 - -var8 > var3) {
                          L9: {
                            if (ik.field_a.length > -var7 + -7 + var3) {
                              stackOut_32_0 = ik.field_a[-7 + var3 + -var7];
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_37_0 = 0;
                  stackOut_37_1 = (String) var6;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  if (var4 < 0) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    break L11;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = hn.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = am.field_c + -(var7 >> 1);
                  if (var4 < 0) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + al.field_bb;
                      if (~var4 != ~aq.field_B.field_d) {
                        stackOut_43_0 = mc.field_a;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = en.field_d;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a(var1_int, -no.field_Gb + var8, var7 - -(no.field_Gb << 1), me.field_h + (wk.field_G << 1), 12018);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + wk.field_G;
                    break L12;
                  }
                }
                L15: {
                  if (var4 >= 0) {
                    m.field_C.c(var6, var8, var1_int + nc.field_h, var5, -1);
                    var1_int = var1_int + (al.field_bb + (wk.field_G - -me.field_h));
                    break L15;
                  } else {
                    uq.field_f.c(var6, var8, var1_int + bf.field_g, var5, -1);
                    var1_int = var1_int + se.field_C;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "sq.WA(" + 114 + 41);
        }
    }

    final static void a(int param0, ja[] param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              fa.field_Qb[param0] = param1;
              if (0 == param0) {
                param1[6].a();
                oo.e(0, 0, 24, 24, 0);
                qc.a(2, (byte) -126, param1, 79, 3);
                qc.a(2, (byte) -126, param1, 78, 4);
                qc.a(2, (byte) -126, param1, 77, 1);
                qc.a(2, (byte) -126, param1, 76, 2);
                qc.a(2, (byte) -126, param1, 75, 5);
                qc.a(2, (byte) -126, param1, 74, 6);
                qc.a(2, (byte) -126, param1, 73, 7);
                qc.a(2, (byte) -126, param1, 72, 8);
                qc.a(0, (byte) -126, param1, 71, 3);
                qc.a(0, (byte) -126, param1, 70, 4);
                qc.a(0, (byte) -126, param1, 69, 1);
                qc.a(0, (byte) -126, param1, 68, 2);
                qc.a(0, (byte) -126, param1, 67, 5);
                qc.a(0, (byte) -126, param1, 66, 6);
                qc.a(0, (byte) -126, param1, 65, 7);
                qc.a(0, (byte) -126, param1, 64, 8);
                qc.a(7, (byte) -126, param1, 61, 2);
                qc.a(7, (byte) -126, param1, 60, 1);
                qc.a(7, (byte) -126, param1, 59, 5);
                qc.a(7, (byte) -126, param1, 58, 6);
                qc.a(7, (byte) -126, param1, 57, 7);
                qc.a(7, (byte) -126, param1, 56, 8);
                qc.a(24, (byte) -126, param1, 55, 2);
                qc.a(24, (byte) -126, param1, 54, 1);
                qc.a(24, (byte) -126, param1, 53, 5);
                qc.a(2, (byte) -126, param1, 63, 0);
                qc.a(0, (byte) -126, param1, 62, 0);
                break L1;
              } else {
                if (param0 == 4) {
                  qc.a(0, (byte) -126, param1, 79, 3);
                  qc.a(0, (byte) -126, param1, 78, 4);
                  qc.a(0, (byte) -126, param1, 77, 1);
                  qc.a(0, (byte) -126, param1, 76, 2);
                  qc.a(0, (byte) -126, param1, 75, 5);
                  qc.a(0, (byte) -126, param1, 74, 6);
                  qc.a(0, (byte) -126, param1, 73, 7);
                  qc.a(0, (byte) -126, param1, 72, 8);
                  qc.a(0, (byte) -126, param1, 71, 0);
                  break L1;
                } else {
                  if (1 == param0) {
                    qc.a(2, (byte) -126, param1, 63, 2);
                    qc.a(2, (byte) -126, param1, 62, 1);
                    qc.a(2, (byte) -126, param1, 61, 5);
                    qc.a(2, (byte) -126, param1, 60, 6);
                    qc.a(2, (byte) -126, param1, 59, 8);
                    qc.a(2, (byte) -126, param1, 58, 7);
                    qc.a(2, (byte) -126, param1, 57, 4);
                    qc.a(3, (byte) -126, param1, 56, 2);
                    qc.a(3, (byte) -126, param1, 55, 1);
                    qc.a(3, (byte) -126, param1, 54, 5);
                    qc.a(3, (byte) -126, param1, 53, 6);
                    qc.a(3, (byte) -126, param1, 52, 8);
                    qc.a(3, (byte) -126, param1, 51, 7);
                    qc.a(3, (byte) -126, param1, 50, 0);
                    qc.a(2, (byte) -126, param1, 49, 3);
                    qc.a(0, (byte) -126, param1, 48, 1);
                    qc.a(0, (byte) -126, param1, 47, 2);
                    qc.a(9, (byte) -126, param1, 46, 3);
                    break L1;
                  } else {
                    if (param0 != 2) {
                      if (param0 == 3) {
                        qc.a(4, (byte) -126, param1, 63, 3);
                        qc.a(4, (byte) -126, param1, 62, 4);
                        qc.a(4, (byte) -126, param1, 61, 1);
                        qc.a(4, (byte) -126, param1, 60, 2);
                        qc.a(4, (byte) -126, param1, 59, 5);
                        qc.a(4, (byte) -126, param1, 58, 6);
                        qc.a(4, (byte) -126, param1, 57, 7);
                        qc.a(4, (byte) -126, param1, 56, 8);
                        qc.a(4, (byte) -126, param1, 55, 0);
                        qc.a(5, (byte) -126, param1, 52, 0);
                        qc.a(12, (byte) -126, param1, 51, 2);
                        qc.a(12, (byte) -126, param1, 50, 1);
                        qc.a(26, (byte) -126, param1, 49, 2);
                        qc.a(26, (byte) -126, param1, 48, 1);
                        qc.a(26, (byte) -126, param1, 47, 8);
                        qc.a(26, (byte) -126, param1, 46, 5);
                        qc.a(26, (byte) -126, param1, 45, 6);
                        qc.a(26, (byte) -126, param1, 44, 7);
                        qc.a(6, (byte) -126, param1, 43, 2);
                        qc.a(6, (byte) -126, param1, 42, 1);
                        qc.a(12, (byte) -126, param1, 41, 5);
                        qc.a(12, (byte) -126, param1, 40, 8);
                        qc.a(12, (byte) -126, param1, 39, 4);
                        qc.a(12, (byte) -126, param1, 38, 3);
                        qc.a(29, (byte) -126, param1, 37, 2);
                        qc.a(29, (byte) -126, param1, 36, 0);
                        qc.a(26, (byte) -126, param1, 23, 4);
                        qc.a(12, (byte) -126, param1, 22, 6);
                        qc.a(12, (byte) -126, param1, 21, 7);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      qc.a(0, (byte) -126, param1, 63, 3);
                      qc.a(0, (byte) -126, param1, 62, 4);
                      qc.a(0, (byte) -126, param1, 61, 1);
                      qc.a(0, (byte) -126, param1, 60, 2);
                      qc.a(0, (byte) -126, param1, 59, 5);
                      qc.a(0, (byte) -126, param1, 58, 6);
                      qc.a(0, (byte) -126, param1, 57, 7);
                      qc.a(0, (byte) -126, param1, 56, 8);
                      qc.a(3, (byte) -126, param1, 55, 3);
                      qc.a(3, (byte) -126, param1, 54, 4);
                      qc.a(3, (byte) -126, param1, 53, 1);
                      qc.a(3, (byte) -126, param1, 52, 2);
                      qc.a(3, (byte) -126, param1, 51, 5);
                      qc.a(3, (byte) -126, param1, 50, 6);
                      qc.a(3, (byte) -126, param1, 49, 7);
                      qc.a(3, (byte) -126, param1, 48, 8);
                      qc.a(0, (byte) -126, param1, 47, 0);
                      qc.a(3, (byte) -126, param1, 46, 0);
                      qc.a(15, (byte) -126, param1, 45, 2);
                      qc.a(15, (byte) -126, param1, 44, 1);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("sq.PA(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = true;
        field_S = 0;
        field_P = "Quick Chat lobby";
        field_U = new int[256];
    }
}
