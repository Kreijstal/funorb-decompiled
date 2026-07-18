/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hi {
    private String field_j;
    private int field_i;
    static mk field_e;
    private int field_f;
    static String field_m;
    static String field_n;
    private int field_h;
    private int field_p;
    private jb field_g;
    static jb field_k;
    private int field_l;
    private boolean field_o;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = TetraLink.field_J;
        try {
          L0: {
            if (param5 < param3) {
              if (param2 > param5 + 1) {
                L1: {
                  if (5 + param5 >= param2) {
                    break L1;
                  } else {
                    if (param6 == param1) {
                      break L1;
                    } else {
                      var7_int = (param1 >> 1) - -(param6 >> 1) - -(1 & (param6 & param1));
                      var8 = param5;
                      var9 = param6;
                      var10 = param1;
                      var11 = param5;
                      L2: while (true) {
                        if (var11 >= param2) {
                          we.a(0, var9, var8, param3, param4, param5, param6);
                          we.a(param0 ^ param0, param1, param2, param3, param4, var8, var10);
                          break L0;
                        } else {
                          L3: {
                            var12 = qd.field_W[var11];
                            if (!param4) {
                              stackOut_22_0 = fe.field_b[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = lb.field_P[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_23_0;
                          if (var13 <= var7_int) {
                            L4: {
                              if (var13 <= var10) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              qd.field_W[var11] = qd.field_W[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              qd.field_W[incrementValue$1] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param2;
                L6: while (true) {
                  if (param5 >= var7_int) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = qd.field_W[var8];
                          var10 = qd.field_W[var8 + 1];
                          if (om.a(param4, var10, 113, var9)) {
                            qd.field_W[var8] = var10;
                            qd.field_W[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var7, "we.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static bf a(int param0, ee param1) {
        bf var2 = null;
        RuntimeException var2_ref = null;
        bf stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new bf(param1, (mc) (Object) param1);
            ha.field_b.a((mc) (Object) var2, false);
            u.field_g.a((eb) (Object) param1);
            stackOut_0_0 = (bf) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("we.H(").append(-11040).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(String param0, int param1, int param2, boolean param3, jb param4) {
        bk var8 = null;
        bk var9 = null;
        if (!(param0 != null)) {
            ((we) this).field_c = null;
            return;
        }
        if (param4 == ((we) this).field_g) {
            if (((we) this).field_o) {
                if (((we) this).field_l == 2) {
                    if (((we) this).field_j != null) {
                        if (((we) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((we) this).field_j = param0;
            ((we) this).field_g = param4;
            ((we) this).field_l = 2;
            ((we) this).field_o = true;
            var8 = this.a(param0, param1, -19395, param4);
            var9 = var8;
            var9.field_j[0] = -param4.b(param0) + param2;
            var9.field_j[param0.length()] = param2;
            la.a(param0, var9, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "we.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, jb param2, int param3, int param4) {
        bk var8 = null;
        int var7 = 0;
        if (param0 == null) {
            ((we) this).field_c = null;
            return;
        }
        if (((we) this).field_g == param2) {
            if (((we) this).field_o) {
                if (((we) this).field_l == 1) {
                    if (null != ((we) this).field_j) {
                        if (((we) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            if (param1 != 124) {
                ((we) this).field_o = true;
            }
            ((we) this).field_o = true;
            ((we) this).field_g = param2;
            ((we) this).field_l = 1;
            var8 = this.a(param0, param4, -19395, param2);
            var7 = param2.b(param0);
            var8.field_j[0] = param3 - (var7 >> 1);
            var8.field_j[param0.length()] = param3 - -(var7 >> 1);
            la.a(param0, var8, param2, false, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "we.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        gh.a((byte) 116, param0);
        int discarded$0 = 0;
        int discarded$1 = 15;
        int discarded$2 = 13;
        hj.a(param0);
    }

    final void a(int param0, jb param1, int param2, int param3, String param4) {
        bk var7 = null;
        bk var8 = null;
        if (param4 == null) {
            ((we) this).field_c = null;
            return;
        }
        if (param1 == ((we) this).field_g) {
            if (((we) this).field_o) {
                if (0 == ((we) this).field_l) {
                    if (null != ((we) this).field_j) {
                        if (!(!((we) this).field_j.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((we) this).field_g = param1;
            ((we) this).field_j = param4;
            ((we) this).field_o = true;
            ((we) this).field_l = 0;
            var7 = this.a(param4, param3, -19395, param1);
            var8 = var7;
            var7.field_j[param2] = param0;
            var8.field_j[param4.length()] = param1.b(param4) + param0;
            la.a(param4, var8, param1, false, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "we.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, jb param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        bk stackIn_37_0 = null;
        bk stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        bk stackIn_38_0 = null;
        bk stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        bk stackIn_39_0 = null;
        bk stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        String stackIn_42_0 = null;
        bk stackIn_42_1 = null;
        jb stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        String stackIn_43_0 = null;
        bk stackIn_43_1 = null;
        jb stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        String stackIn_44_0 = null;
        bk stackIn_44_1 = null;
        jb stackIn_44_2 = null;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_36_0 = null;
        bk stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        bk stackOut_38_0 = null;
        bk stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        bk stackOut_37_0 = null;
        bk stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        String stackOut_41_0 = null;
        bk stackOut_41_1 = null;
        jb stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        String stackOut_43_0 = null;
        bk stackOut_43_1 = null;
        jb stackOut_43_2 = null;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        String stackOut_42_0 = null;
        bk stackOut_42_1 = null;
        jb stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param4.field_H;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == null) {
              ((we) this).field_c = null;
              return;
            } else {
              L2: {
                if (param4 != ((we) this).field_g) {
                  break L2;
                } else {
                  if (((we) this).field_o) {
                    break L2;
                  } else {
                    if (((we) this).field_l != param5) {
                      break L2;
                    } else {
                      if (~((we) this).field_f != ~param6) {
                        break L2;
                      } else {
                        if (~param7 != ~((we) this).field_p) {
                          break L2;
                        } else {
                          if (~((we) this).field_h != ~param1) {
                            break L2;
                          } else {
                            if (param3 != ((we) this).field_i) {
                              break L2;
                            } else {
                              if (null == ((we) this).field_j) {
                                break L2;
                              } else {
                                if (!((we) this).field_j.equals((Object) (Object) param2)) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((we) this).field_p = param7;
              ((we) this).field_i = param3;
              ((we) this).field_f = param6;
              ((we) this).field_h = param1;
              ((we) this).field_l = param5;
              ((we) this).field_j = param2;
              if (param0 == -24340) {
                L3: {
                  ((we) this).field_g = param4;
                  ((we) this).field_o = false;
                  var16 = new String[1 + param4.c(param2, param3)];
                  var17 = var16;
                  var10 = Math.max(1, param4.a(param2, new int[1], var17));
                  if (((we) this).field_f != 3) {
                    break L3;
                  } else {
                    if (var10 != 1) {
                      break L3;
                    } else {
                      ((we) this).field_f = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  ((we) this).field_c = new bk[var10];
                  if (((we) this).field_f == 0) {
                    var11 = param4.field_N;
                    break L4;
                  } else {
                    if (1 != ((we) this).field_f) {
                      if (2 == ((we) this).field_f) {
                        var11 = -(var10 * ((we) this).field_p) + (-param4.field_K + ((we) this).field_h);
                        break L4;
                      } else {
                        L5: {
                          var12 = (-(((we) this).field_p * var10) + ((we) this).field_h) / (1 + var10);
                          if (var12 < 0) {
                            var12 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((we) this).field_p = ((we) this).field_p + var12;
                        var11 = var12 + param4.field_N;
                        break L4;
                      }
                    } else {
                      var11 = (((we) this).field_h + -(var10 * ((we) this).field_p) >> 1) + param4.field_N;
                      break L4;
                    }
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var10 <= var12) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = var11 + -param4.field_N;
                      stackOut_36_3 = var11 + param4.field_K;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      if (var13 != null) {
                        stackOut_38_0 = null;
                        stackOut_38_1 = null;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = stackIn_38_3;
                        stackOut_38_4 = var13.length();
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        stackIn_39_3 = stackOut_38_3;
                        stackIn_39_4 = stackOut_38_4;
                        break L7;
                      } else {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = 0;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackIn_39_4 = stackOut_37_4;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new bk(stackIn_39_2, stackIn_39_3, stackIn_39_4);
                      var14.field_j[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_j[var13.length()] = param4.b(var13);
                          stackOut_41_0 = (String) var13;
                          stackOut_41_1 = (bk) var14;
                          stackOut_41_2 = (jb) param4;
                          stackOut_41_3 = 0;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_43_2 = stackOut_41_2;
                          stackIn_43_3 = stackOut_41_3;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          stackIn_42_2 = stackOut_41_2;
                          stackIn_42_3 = stackOut_41_3;
                          if (param5 == 3) {
                            stackOut_43_0 = (String) (Object) stackIn_43_0;
                            stackOut_43_1 = (bk) (Object) stackIn_43_1;
                            stackOut_43_2 = (jb) (Object) stackIn_43_2;
                            stackOut_43_3 = stackIn_43_3;
                            stackOut_43_4 = ((we) this).a(param4.b(var13), (byte) -126, param3, var13);
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            stackIn_44_3 = stackOut_43_3;
                            stackIn_44_4 = stackOut_43_4;
                            break L9;
                          } else {
                            stackOut_42_0 = (String) (Object) stackIn_42_0;
                            stackOut_42_1 = (bk) (Object) stackIn_42_1;
                            stackOut_42_2 = (jb) (Object) stackIn_42_2;
                            stackOut_42_3 = stackIn_42_3;
                            stackOut_42_4 = 0;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            stackIn_44_2 = stackOut_42_2;
                            stackIn_44_3 = stackOut_42_3;
                            stackIn_44_4 = stackOut_42_4;
                            break L9;
                          }
                        }
                        la.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3 != 0, stackIn_44_4);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((we) this).field_c[var12] = var14;
                    var11 = var11 + param7;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var9;
            stackOut_47_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L10;
            }
          }
          L11: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void c() {
        field_e = null;
        field_k = null;
        field_m = null;
        field_n = null;
    }

    private final bk a(String param0, int param1, int param2, jb param3) {
        bk var5 = null;
        RuntimeException var5_ref = null;
        bk var6 = null;
        bk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var6 = new bk(-param3.field_N + param1, param1 + param3.field_K, param0.length());
            var5 = var6;
            ((we) this).field_c = new bk[]{var6};
            stackOut_0_0 = (bk) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("we.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(-19395).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var13 = TetraLink.field_J;
        try {
          L0: {
            var7_int = li.field_l[0].field_t + (param5 - 3);
            var8 = param0 + li.field_l[0].field_F + -3;
            var9 = -li.field_l[2].field_t + -li.field_l[0].field_t + param2 - -6;
            var10 = -li.field_l[6].field_F + (-li.field_l[0].field_F + 6 + param3);
            var11 = 0;
            L1: while (true) {
              if (var11 >= 48) {
                L2: {
                  if (param6) {
                    stackOut_9_0 = 244;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = 4;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                var11 = stackIn_10_0;
                ra.c(48 + var7_int, var8, var9 + -96, var10, var11);
                qj.a(param2, (byte) -36, li.field_l, param5, param3, param0);
                break L0;
              } else {
                L3: {
                  if (param6) {
                    stackOut_5_0 = var11 * 5 + 4;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  } else {
                    stackOut_4_0 = -(var11 * 5) + 239;
                    stackIn_6_0 = stackOut_4_0;
                    break L3;
                  }
                }
                var12 = stackIn_6_0;
                ra.c(var11 + var7_int, var8, var10, var12);
                ra.c(-var11 + (-1 + var7_int) - -var9, var8, var10, var12);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var7, "we.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 111 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public we() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Not available in 2D mode";
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
